package in.sourav.vis.dao;

import java.util.List;

import in.sourav.vis.model.VehicleModel;

/**
 * Represnts the DAO for vehicle related use cases
 * */
public interface VehicleDAO {
	
	boolean save(VehicleModel vehicle);
	
	List<VehicleModel> list();
	
	boolean delete(int id);
	
	VehicleModel get(int id);
	
	VehicleModel getVehicleBasedOnUserId(int userId);
}
