package com.xworkz.customclass.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WhatsappDTO implements Comparable<WhatsappDTO>{
 private Integer id;
 private String name;
 private Long mobileNumber;
 private Boolean isAvailable;
 private Double total;

    @Override
    public int compareTo(WhatsappDTO o) {
       // return this.mobileNumber.compareTo(o.mobileNumber);
       // return this.isAvailable.compareTo(o.isAvailable);
       // return this.total.compareTo(o.total);
       // return this.name.compareTo(o.name);
        return this.id-o.id;

    }
}
