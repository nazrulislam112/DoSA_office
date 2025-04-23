package com.example.finalsubmission.Admin_Model_Class;

public class ManagingSportsEquipmentModel {
    private int iQuantity;
    private String Club,Equipment;

    public ManagingSportsEquipmentModel(int iQuantity, String club, String equipment) {
        this.iQuantity = iQuantity;
        Club = club;
        Equipment = equipment;
    }

    public int getiQuantity() {
        return iQuantity;
    }

    public void setiQuantity(int iQuantity) {
        this.iQuantity = iQuantity;
    }

    public String getClub() {
        return Club;
    }

    public void setClub(String club) {
        Club = club;
    }

    public String getEquipment() {
        return Equipment;
    }

    public void setEquipment(String equipment) {
        Equipment = equipment;
    }

    @Override
    public String toString() {
        return "ManagingSportsEquipmentModel{" +
                "iQuantity=" + iQuantity +
                ", Club='" + Club + '\'' +
                ", Equipment='" + Equipment + '\'' +
                '}';
    }
}
