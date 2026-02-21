package com.xworkz.comparable.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDTO implements Comparable<VehicleDTO> {

//public class VehicleDTO{
    private Integer id;
    private String vehicleName;
    private Long number;


    @Override
    public int compareTo(VehicleDTO vehicleDTO) {
////        return this.id.compareTo(vehicleDTO.id);
//       // return vehicleDTO.id.compareTo(this.id);
////        return this.number.compareTo(vehicleDTO.number);
//
        return this.vehicleName.compareTo(vehicleDTO.vehicleName);
       // return vehicleDTO.vehicleName.compareTo(this.vehicleName);
    }
}
