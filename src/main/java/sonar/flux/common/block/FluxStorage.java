package sonar.flux.common.block;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import sonar.core.helpers.FontHelper;
import sonar.flux.common.tileentity.TileEntityStorage;

public class FluxStorage extends FluxConnection {

	public FluxStorage() {
		super();
	}

	public static class Herculean extends FluxStorage {

		@Override
		public TileEntity createNewTileEntity(World world, int i) {
			return new TileEntityStorage.Advanced();
		}
	}

	public static class Gargantuan extends FluxStorage {

		@Override
		public TileEntity createNewTileEntity(World world, int i) {
			return new TileEntityStorage.Massive();
		}
	}

	@Override
	public TileEntity createNewTileEntity(World world, int i) {
		return new TileEntityStorage.Basic();
	}

	@Override
	public void standardInfo(ItemStack stack, EntityPlayer player, List list) {
		list.add("Stores Energy");
	}

	@Override
	public void addSpecialToolTip(ItemStack stack, EntityPlayer player, List list) {
		if (stack.hasTagCompound()) {
			int energy = stack.getTagCompound().getInteger("energy");
			if (energy != 0) {
				list.add(FontHelper.translate("energy.stored") + ": " + FontHelper.formatStorage(energy));
			}
		}
	}
}
