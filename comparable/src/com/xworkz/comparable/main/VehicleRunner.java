package com.xworkz.comparable.main;

import com.xworkz.comparable.dto.VehicleDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class VehicleRunner {
    public static void main(String[] args) {
        List<VehicleDTO> vehicle=new ArrayList<>();



        vehicle.add(new VehicleDTO(3,"Suzuki",7682787278L));
        vehicle.add(new VehicleDTO(67,"Toyoto",78987923L));
        vehicle.add(new VehicleDTO(16,"Hyundai",76897324L));
        vehicle.add(new VehicleDTO(5,"kw",5638909789L));
        vehicle.add(new VehicleDTO(9,"BMW",785676869L));


        System.out.println(vehicle);
        System.out.println(vehicle.size());
//       vehicle.clear();
//        System.out.println(vehicle);
//        vehicle.remove(3);
//        System.out.println(vehicle);

//        System.out.println(vehicle.remove(4));
//        System.out.println(vehicle);


//       Iterator<VehicleDTO> iterator = vehicle.iterator();
//       while (iterator.hasNext()) {
//           //  System.out.println(iterator.next());
//           VehicleDTO vehicleDTO = iterator.next();
//           if (vehicleDTO.getId().equals(5)) {
//               iterator.remove();
//               System.out.println(vehicle);
//           }
//       }




        Collections.sort(vehicle);
        System.out.println(vehicle);
    }
}
