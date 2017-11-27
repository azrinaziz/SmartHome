package app.smarthome.smarthome;

import android.app.Application;

public class GlobalValue extends Application{

    private String doorBool = "0"; // 0 = authorised, 1 = unauthorised
    private String tempBool = "24"; // Day time = 26-30, Night time = 0-26
    private String smokeBool = "0"; // 0 = absent, 1 = present
    private String gasBool = "0"; // 0 = absent, 1 = present
    private String humBool = "35"; // raining potential = 85 - 100
    private String DoorOpenBool = "0"; // 0 = door closed, 1 = door opened
    private String alarmValue = "7:00am";
    private String autoPlayTime = "8:00pm";
    private String sleepTime = "12:00pm";
    private String livingRoomBool = "0";  // 0 = closed
    private String diningRoomBool = "0";
    private String masterRoomBool = "0";
    private String kitchenBool = "0";
    private String clothHorseBool = "0"; // 0 = Protection Mode Off

    public String getClothHorseBool() {
        return clothHorseBool;
    }

    public void setClothHorseBool(String clothHorseBool) {
        this.clothHorseBool = clothHorseBool;
    }

    public String getLivingRoomBool() {
        return livingRoomBool;
    }

    public void setLivingRoomBool(String livingRoomBool) {
        this.livingRoomBool = livingRoomBool;
    }

    public String getDiningRoomBool() {
        return diningRoomBool;
    }

    public void setDiningRoomBool(String diningRoomBool) {
        this.diningRoomBool = diningRoomBool;
    }

    public String getMasterRoomBool() {
        return masterRoomBool;
    }

    public void setMasterRoomBool(String masterRoomBool) {
        this.masterRoomBool = masterRoomBool;
    }

    public String getKitchenBool() {
        return kitchenBool;
    }

    public void setKitchenBool(String kitchenBool) {
        this.kitchenBool = kitchenBool;
    }

    public String getSleepTime() {
        return sleepTime;
    }

    public void setSleepTime(String sleepTime) {
        this.sleepTime = sleepTime;
    }

    public String getAutoPlayTime() {
        return autoPlayTime;
    }

    public void setAutoPlayTime(String autoPlayTime) {
        this.autoPlayTime = autoPlayTime;
    }

    public String getAlarmValue() {
        return alarmValue;
    }

    public void setAlarmValue(String alarmValue) {
        this.alarmValue = alarmValue;
    }


    public String getDoorOpenBool() {
        return DoorOpenBool;
    }
    public void setDoorOpenBool(String doorOpenBool) {
        DoorOpenBool = doorOpenBool;
    }

    public String getTempBool() {
        return tempBool;
    }

    public void setTempBool(String tempBool) {
        this.tempBool = tempBool;
    }

    public String getSmokeBool() {
        return smokeBool;
    }

    public void setSmokeBool(String smokeBool) {
        this.smokeBool = smokeBool;
    }

    public String getGasBool() {
        return gasBool;
    }

    public void setGasBool(String gasBool) {
        this.gasBool = gasBool;
    }

    public String getHumBool() {
        return humBool;
    }

    public void setHumBool(String humBool) {
        this.humBool = humBool;
    }

    public String getDoorBool() {
        return doorBool;
    }

    public void setDoorBool(String doorBool) {
        this.doorBool = doorBool;
    }
}
