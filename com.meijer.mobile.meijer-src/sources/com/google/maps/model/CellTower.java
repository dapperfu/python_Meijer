package com.google.maps.model;

import java.io.Serializable;

/* loaded from: classes8.dex */
public class CellTower implements Serializable {
    private static final long serialVersionUID = 1;
    public Integer age;
    public Integer cellId;
    public Integer locationAreaCode;
    public Integer mobileCountryCode;
    public Integer mobileNetworkCode;
    public Integer signalStrength;
    public Integer timingAdvance;

    public static class CellTowerBuilder {
        private Integer _cellId = null;
        private Integer _locationAreaCode = null;
        private Integer _mobileCountryCode = null;
        private Integer _mobileNetworkCode = null;
        private Integer _age = null;
        private Integer _signalStrength = null;
        private Integer _timingAdvance = null;

        public CellTower createCellTower() {
            return new CellTower(this._cellId, this._locationAreaCode, this._mobileCountryCode, this._mobileNetworkCode, this._age, this._signalStrength, this._timingAdvance);
        }

        public CellTowerBuilder Age(int i10) {
            this._age = Integer.valueOf(i10);
            return this;
        }

        public CellTowerBuilder CellId(int i10) {
            this._cellId = Integer.valueOf(i10);
            return this;
        }

        public CellTowerBuilder LocationAreaCode(int i10) {
            this._locationAreaCode = Integer.valueOf(i10);
            return this;
        }

        public CellTowerBuilder MobileCountryCode(int i10) {
            this._mobileCountryCode = Integer.valueOf(i10);
            return this;
        }

        public CellTowerBuilder MobileNetworkCode(int i10) {
            this._mobileNetworkCode = Integer.valueOf(i10);
            return this;
        }

        public CellTowerBuilder SignalStrength(int i10) {
            this._signalStrength = Integer.valueOf(i10);
            return this;
        }

        public CellTowerBuilder TimingAdvance(int i10) {
            this._timingAdvance = Integer.valueOf(i10);
            return this;
        }
    }

    public CellTower() {
        this.cellId = null;
        this.locationAreaCode = null;
        this.mobileCountryCode = null;
        this.mobileNetworkCode = null;
        this.age = null;
        this.signalStrength = null;
        this.timingAdvance = null;
    }

    public String toString() {
        return String.format("[CellTower: cellId=%s, locationAreaCode=%s, mobileCountryCode=%s, mobileNetworkCode=%s, age=%s, signalStrength=%s, timingAdvance=%s]", this.cellId, this.locationAreaCode, this.mobileCountryCode, this.mobileNetworkCode, this.age, this.signalStrength, this.timingAdvance);
    }

    private CellTower(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        this.cellId = num;
        this.locationAreaCode = num2;
        this.mobileCountryCode = num3;
        this.mobileNetworkCode = num4;
        this.age = num5;
        this.signalStrength = num6;
        this.timingAdvance = num7;
    }
}
