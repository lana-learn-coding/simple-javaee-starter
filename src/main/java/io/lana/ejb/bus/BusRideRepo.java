package io.lana.ejb.bus;

import io.lana.ejb.lib.repo.CrudRepository;
import io.lana.ejb.lib.repo.JpaRepository;

public class BusRideRepo extends JpaRepository<BusRide> implements CrudRepository<BusRide> {
}
