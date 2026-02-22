package com.xworkz.customclass.runner;

import com.xworkz.customclass.dto.WhatsappDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WhatsappRunner {
    public static void main(String[] args) {
        List<WhatsappDTO> list=new ArrayList<>();

        list.add(new WhatsappDTO(2,"Nandushree",6745391264L,true,23.243D));
        list.add(new WhatsappDTO(1,"Prabhas",8935210472L,false,5678D));
        list.add(new WhatsappDTO(77,"JK",8935210472L,false,234.234D));
        list.add(new WhatsappDTO(4,"RamCharan",9683423831L,false,5678D));
        list.add(new WhatsappDTO(12,"Shiva",3932837392L,true,234D));
        list.add(new WhatsappDTO(31,"Daya",6738291637L,false,25678D));
        list.add(new WhatsappDTO(56,"Mahesh",5936293547L,true,0D));
        list.add(new WhatsappDTO(18,"PSPK",9453926392L,true,234567D));
        list.add(new WhatsappDTO(0,"NBK",3932837392L,false,8976.2345D));

        //System.out.println(list);
        for (WhatsappDTO w:list)
            System.out.println(w);


        Collections.sort(list);
        System.out.println(list);
        System.out.println("======================");
        for (WhatsappDTO whatsappDTO:list)
            System.out.println(whatsappDTO);
    }
}
