package com.google.maps.model;

import java.io.Serializable;

/* loaded from: classes8.dex */
public class WifiAccessPoint implements Serializable {
    private static final long serialVersionUID = 1;
    public Integer age;
    public Integer channel;
    public String macAddress;
    public Integer signalStrength;
    public Integer signalToNoiseRatio;

    public static class WifiAccessPointBuilder {
        private String _macAddress = null;
        private Integer _signalStrength = null;
        private Integer _age = null;
        private Integer _channel = null;
        private Integer _signalToNoiseRatio = null;

        public WifiAccessPointBuilder MacAddress(String str) {
            this._macAddress = str;
            return this;
        }

        public WifiAccessPoint createWifiAccessPoint() {
            return new WifiAccessPoint(this._macAddress, this._signalStrength, this._age, this._channel, this._signalToNoiseRatio);
        }

        public WifiAccessPointBuilder Age(int i10) {
            this._age = Integer.valueOf(i10);
            return this;
        }

        public WifiAccessPointBuilder Channel(int i10) {
            this._channel = Integer.valueOf(i10);
            return this;
        }

        public WifiAccessPointBuilder SignalStrength(int i10) {
            this._signalStrength = Integer.valueOf(i10);
            return this;
        }

        public WifiAccessPointBuilder SignalToNoiseRatio(int i10) {
            this._signalToNoiseRatio = Integer.valueOf(i10);
            return this;
        }
    }

    public WifiAccessPoint() {
        this.signalStrength = null;
        this.age = null;
        this.channel = null;
        this.signalToNoiseRatio = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[WifiAccessPoint:");
        if (this.macAddress != null) {
            sb2.append(" macAddress=");
            sb2.append(this.macAddress);
        }
        if (this.signalStrength != null) {
            sb2.append(" signalStrength=");
            sb2.append(this.signalStrength);
        }
        if (this.age != null) {
            sb2.append(" age=");
            sb2.append(this.age);
        }
        if (this.channel != null) {
            sb2.append(" channel=");
            sb2.append(this.channel);
        }
        if (this.signalToNoiseRatio != null) {
            sb2.append(" signalToNoiseRatio=");
            sb2.append(this.signalToNoiseRatio);
        }
        sb2.append("]");
        return sb2.toString();
    }

    private WifiAccessPoint(String str, Integer num, Integer num2, Integer num3, Integer num4) {
        this.macAddress = str;
        this.signalStrength = num;
        this.age = num2;
        this.channel = num3;
        this.signalToNoiseRatio = num4;
    }
}
