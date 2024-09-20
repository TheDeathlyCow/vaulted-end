package com.thedeathlycow.vaulted.end.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.structure.EndCityGenerator;
import net.minecraft.structure.StructurePiece;
import net.minecraft.structure.StructureTemplateManager;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.List;

@Mixin(targets = "net.minecraft.structure.EndCityGenerator$3")
abstract class EndCityGeneratorMixin {

    @WrapOperation(
            method = "create",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/structure/EndCityGenerator;createPiece(Lnet/minecraft/structure/StructureTemplateManager;Lnet/minecraft/structure/EndCityGenerator$Piece;Lnet/minecraft/util/math/BlockPos;Ljava/lang/String;Lnet/minecraft/util/BlockRotation;Z)Lnet/minecraft/structure/EndCityGenerator$Piece;",
                    ordinal = 4
            )
    )
    private EndCityGenerator.Piece generateOminousShips(
            StructureTemplateManager structureTemplateManager,
            EndCityGenerator.Piece lastPiece,
            BlockPos relativePosition,
            String template,
            BlockRotation rotation,
            boolean ignoreAir,
            Operation<EndCityGenerator.Piece> original,
            StructureTemplateManager manager,
            int depth,
            EndCityGenerator.Piece root,
            BlockPos pos,
            List<StructurePiece> pieces,
            Random random
    ) {
        if (random.nextInt(3) == 0) {
            template = "vaulted_end/ominous_ship";
        } else {
            template = "vaulted_end/ship";
        }

        return original.call(structureTemplateManager, lastPiece, relativePosition, template, rotation, ignoreAir);
    }


}
