package com.realz.moretotems.data.client;

import com.realz.moretotems.MoreTotems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, MoreTotems.MOD_ID, exFileHelper);
    }

    @Nonnull
    @Override
    public String getName() {
        return "More Totem - Block States/Models";
    }

    @Override
    protected void registerStatesAndModels() {

    }

    public void normalBlock(Block block) {
        ResourceLocation name = ForgeRegistries.BLOCKS.getKey(block);

        if (name == null) {
            MoreTotems.LOGGER.error("Could not find block key for " + block.getName());
            return;
        }

        BlockModelBuilder builder =
                this.models().withExistingParent(name.getPath(), "block/cube_all");
        builder.texture("all", modLoc("block/" + name.getPath()));
        this.simpleBlockItem(block, builder);
        this.simpleBlock(block, builder);
    }
}
