package com.thedeathlycow.vaulted.end.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.structure.structures.EndCityPieces;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(targets = "net.minecraft.world.level.levelgen.structure.structures.EndCityPieces$3")
abstract class EndCityTowerBridgePieceMixin {
    @WrapOperation(
            method = "generate",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces;addPiece(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece;Lnet/minecraft/core/BlockPos;Ljava/lang/String;Lnet/minecraft/world/level/block/Rotation;Z)Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece;",
                    ordinal = 4
            )
    )
    private EndCityPieces.EndCityPiece generateOminousShips(
            StructureTemplateManager structureTemplateManager,
            EndCityPieces.EndCityPiece parent,
            BlockPos offset,
            String templateName,
            Rotation rotation,
            boolean overwrite,
            Operation<EndCityPieces.EndCityPiece> original,
            @Local(argsOnly = true) RandomSource random
    ) {
        String moddedTemplate = "vaulted_end/ship";

        if (random.nextInt(3) == 0) {
            moddedTemplate = "vaulted_end/ominous_ship";
        }

        return original.call(structureTemplateManager, parent, offset, moddedTemplate, rotation, overwrite);
    }
}
