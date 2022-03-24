package com.detroitlabs.dudewheresmycar.model;

import java.time.LocalDateTime;

public class CarStatus {
    private boolean stolen;
    private boolean secure;
    private LocalDateTime timestamp;

    public boolean isStolen() {
        return stolen;
    }

    public void setStolen(boolean stolen) {
        this.stolen = stolen;
    }

    public boolean isSecure() {
        return secure;
    }

    public void setSecure(boolean secure) {
        this.secure = secure;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public CarStatus(boolean stolen, boolean secure, LocalDateTime timestamp) {
        this.stolen = stolen;
        this.secure = secure;
        this.timestamp = timestamp;
    }
}//end CarStatus class
