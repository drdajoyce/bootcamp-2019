package com.manchesterdigital;

import java.util.Arrays;
import java.util.List;

public class CurrysShowRoom {

    public static void main(String[] args) {

        Mobile mobile = new Mobile("IPhone",6756795795L);
        Television tv = new Television("Samsung", 678678L);


        List<PowerControls> powerControls = Arrays.asList(mobile, tv);

        for(PowerControls controls : powerControls){
            controls.switchOn();
            controls.switchOff();
        }

        List<VolumeControls> volumeControls= Arrays.asList(mobile, tv);

        for(VolumeControls controls : volumeControls){
            controls.volumeUp();
            controls.volumeDown();
        }

        List<StandbyControls> standbyControls = Arrays.asList(mobile, tv);

        for(StandbyControls controls : standbyControls){
            controls.standbyMode();
        }

        tv.changeChannel();

    }

}

