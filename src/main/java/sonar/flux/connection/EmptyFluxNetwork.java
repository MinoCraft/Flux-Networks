package sonar.flux.connection;

import java.util.ArrayList;
import java.util.UUID;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import sonar.core.api.utils.ActionType;
import sonar.core.helpers.NBTHelper.SyncType;
import sonar.core.utils.CustomColour;
import sonar.flux.api.ClientFlux;
import sonar.flux.api.FluxPlayersList;
import sonar.flux.api.IFlux;
import sonar.flux.api.IFluxController;
import sonar.flux.api.IFluxNetwork;
import sonar.flux.api.PlayerAccess;
import sonar.flux.network.NetworkStatistics;

public class EmptyFluxNetwork implements IFluxNetwork {

	public final static IFluxNetwork INSTANCE = new EmptyFluxNetwork();
	public static final NetworkStatistics stats = new NetworkStatistics();
	public CustomColour colour = new CustomColour(41, 94, 138);

	@Override
	public void updateNetwork() {
	}

	@Override
	public AccessType getAccessType() {
		return AccessType.PRIVATE;
	}

	@Override
	public int getNetworkID() {
		return -1;
	}

	@Override
	public CustomColour getNetworkColour() {
		return colour;
	}

	@Override
	public String getNetworkName() {
		return "Please select a network";
	}

	@Override
	public UUID getOwnerUUID() {
		return null;
	}

	@Override
	public String getCachedPlayerName() {
		return "";
	}

	@Override
	public boolean hasController() {
		return false;
	}

	@Override
	public IFluxController getController() {
		return null;
	}

	@Override
	public void setNetworkName(String name) {
	}

	@Override
	public void setAccessType(AccessType type) {
	}

	@Override
	public void setCustomColour(CustomColour colour) {
	}

	@Override
	public void sendChanges() {
	}

	@Override
	public boolean setController(IFluxController controller) {
		return false;
	}

	@Override
	public void removePlayerAccess(UUID playerUUID, PlayerAccess access) {
	}

	@Override
	public void addPlayerAccess(UUID playerUUID, PlayerAccess access) {
	}

	@Override
	public long receiveEnergy(long maxReceive, ActionType simulate) {
		return 0;
	}

	@Override
	public long extractEnergy(long maxExtract, ActionType simulate) {
		return 0;
	}

	@Override
	public long getEnergyAvailable() {
		return 0;
	}

	@Override
	public long getMaxEnergyStored() {
		return 0;
	}

	@Override
	public void addFluxConnection(IFlux flux) {
	}

	@Override
	public void removeFluxConnection(IFlux flux) {
	}

	@Override
	public NetworkStatistics getStatistics() {
		return stats;
	}

	@Override
	public void setClientConnections(ArrayList<ClientFlux> flux) {

	}

	@Override
	public void readData(NBTTagCompound nbt, SyncType type) {
	}

	@Override
	public NBTTagCompound writeData(NBTTagCompound nbt, SyncType type) {
		return nbt;
	}

	@Override
	public ArrayList<ClientFlux> getClientFluxConnection() {
		return new ArrayList();
	}

	@Override
	public void buildFluxConnections() {

	}

	@Override
	public boolean isFakeNetwork() {
		return true;
	}

	@Override
	public FluxPlayersList getPlayers() {
		return new FluxPlayersList();
	}

	@Override
	public PlayerAccess getPlayerAccess(EntityPlayer player) {
		return PlayerAccess.BLOCKED;
	}

	@Override
	public IFluxNetwork updateNetworkFrom(IFluxNetwork network) {
		return this;
	}

	@Override
	public void updateSenders() {}

	@Override
	public void updateReceivers() {}

}
