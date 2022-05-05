package Homework9.milkTea.core;

public class MilkTeaSingleton {
     private static MilkTeaImp milkTeaImp;
     public MilkTeaSingleton(MilkTeaImp milkTeaImp) {

         this.milkTeaImp = milkTeaImp;
     }
     public static MilkTeaImp getMilkTeaImp() {
         return milkTeaImp;
     }
}
