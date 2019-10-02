package com.manchesterdigital;

public class PhonePrototype {

    private Long phoneNumber;
    private String connectionStatus;
    private  Integer screenBrightness;
    private final Long serialNumber;
    private Boolean isOn;
    private Boolean callStatus;
    private Integer textsUnread;

    public PhonePrototype(long l) {
        this.serialNumber = l;
    }

    public Integer getTextsUnread() {
        return textsUnread;
    }

    public void setTextsUnread(Integer textsUnread) {
        this.textsUnread = textsUnread;
    }

    public Boolean getIsOn() {
        return isOn;
    }

    public Boolean getCallStatus() {
        return callStatus;
    }

    public void setCallStatus(Boolean callStatus) {
        this.callStatus = callStatus;
    }

    public PhonePrototype(Long serialNumber, Long serialNumber1) {
        this.serialNumber = serialNumber1;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    public void setScreenBrightness(Integer screenBrightness) {
        this.screenBrightness = screenBrightness;
    }

    public void setisOn(Boolean isOn) {
        this.isOn = isOn;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public String getConnectionStatus() {
        return connectionStatus;
    }

    public Integer getScreenBrightness() {
        return screenBrightness;
    }

    public Long getSerialNumber() {
        return serialNumber;
    }

    public static String powerStatus(Boolean isOn){
        if (isOn){
            return "On";
        }
        return "Off";
    }

    public void isCalling(Boolean callStatus){
        if (callStatus){
            System.out.println("Incoming call");
        }
    }

    public Integer readMessages(Integer textsUnread){
        return textsUnread - 1;
    }

    public static void main(String[] args) {
        PhonePrototype phonePrototype = new PhonePrototype(2234567L);
    }


}
