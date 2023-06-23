package net.mcreator.hedgehog.procedures;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

public class HedgehogPriStolknovieniiIghrokaSSushchnostiuProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Mob _entity)
			_entity.getNavigation().moveTo(x, y, z, 1);
	}
}
