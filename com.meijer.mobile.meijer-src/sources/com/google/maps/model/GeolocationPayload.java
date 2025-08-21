package com.google.maps.model;

import com.google.maps.internal.StringJoin;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public class GeolocationPayload implements Serializable {
    private static final long serialVersionUID = 1;
    public String carrier;
    public CellTower[] cellTowers;
    public Boolean considerIp;
    public Integer homeMobileCountryCode;
    public Integer homeMobileNetworkCode;
    public String radioType;
    public WifiAccessPoint[] wifiAccessPoints;

    public static class GeolocationPayloadBuilder {
        private Integer _homeMobileCountryCode = null;
        private Integer _homeMobileNetworkCode = null;
        private String _radioType = null;
        private String _carrier = null;
        private Boolean _considerIp = null;
        private CellTower[] _cellTowers = null;
        private List<CellTower> _addedCellTowers = new ArrayList();
        private WifiAccessPoint[] _wifiAccessPoints = null;
        private List<WifiAccessPoint> _addedWifiAccessPoints = new ArrayList();

        public GeolocationPayloadBuilder AddCellTower(CellTower cellTower) {
            this._addedCellTowers.add(cellTower);
            return this;
        }

        public GeolocationPayloadBuilder AddWifiAccessPoint(WifiAccessPoint wifiAccessPoint) {
            this._addedWifiAccessPoints.add(wifiAccessPoint);
            return this;
        }

        public GeolocationPayloadBuilder Carrier(String str) {
            this._carrier = str;
            return this;
        }

        public GeolocationPayloadBuilder CellTowers(CellTower[] cellTowerArr) {
            this._cellTowers = cellTowerArr;
            return this;
        }

        public GeolocationPayloadBuilder RadioType(String str) {
            this._radioType = str;
            return this;
        }

        public GeolocationPayloadBuilder WifiAccessPoints(WifiAccessPoint[] wifiAccessPointArr) {
            this._wifiAccessPoints = wifiAccessPointArr;
            return this;
        }

        public GeolocationPayload createGeolocationPayload() {
            if (!this._addedWifiAccessPoints.isEmpty()) {
                this._wifiAccessPoints = (WifiAccessPoint[]) this._addedWifiAccessPoints.toArray(new WifiAccessPoint[0]);
            }
            if (!this._addedCellTowers.isEmpty()) {
                this._cellTowers = (CellTower[]) this._addedCellTowers.toArray(new CellTower[0]);
            }
            return new GeolocationPayload(this._homeMobileCountryCode, this._homeMobileNetworkCode, this._radioType, this._carrier, this._considerIp, this._cellTowers, this._wifiAccessPoints);
        }

        public GeolocationPayloadBuilder ConsiderIp(boolean z10) {
            this._considerIp = Boolean.valueOf(z10);
            return this;
        }

        public GeolocationPayloadBuilder HomeMobileCountryCode(int i10) {
            this._homeMobileCountryCode = Integer.valueOf(i10);
            return this;
        }

        public GeolocationPayloadBuilder HomeMobileNetworkCode(int i10) {
            this._homeMobileNetworkCode = Integer.valueOf(i10);
            return this;
        }
    }

    public GeolocationPayload() {
        this.homeMobileCountryCode = null;
        this.homeMobileNetworkCode = null;
        this.radioType = null;
        this.carrier = null;
        this.considerIp = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[GeolocationPayload");
        ArrayList arrayList = new ArrayList();
        if (this.homeMobileCountryCode != null) {
            arrayList.add("homeMobileCountryCode=" + this.homeMobileCountryCode);
        }
        if (this.homeMobileNetworkCode != null) {
            arrayList.add("homeMobileNetworkCode=" + this.homeMobileNetworkCode);
        }
        if (this.radioType != null) {
            arrayList.add("radioType=" + this.radioType);
        }
        if (this.carrier != null) {
            arrayList.add("carrier=" + this.carrier);
        }
        arrayList.add("considerIp=" + this.considerIp);
        CellTower[] cellTowerArr = this.cellTowers;
        if (cellTowerArr != null && cellTowerArr.length > 0) {
            arrayList.add("cellTowers=" + Arrays.toString(this.cellTowers));
        }
        WifiAccessPoint[] wifiAccessPointArr = this.wifiAccessPoints;
        if (wifiAccessPointArr != null && wifiAccessPointArr.length > 0) {
            arrayList.add("wifiAccessPoints=" + Arrays.toString(this.wifiAccessPoints));
        }
        sb2.append(StringJoin.join(", ", arrayList));
        sb2.append("]");
        return sb2.toString();
    }

    private GeolocationPayload(Integer num, Integer num2, String str, String str2, Boolean bool, CellTower[] cellTowerArr, WifiAccessPoint[] wifiAccessPointArr) {
        this.homeMobileCountryCode = num;
        this.homeMobileNetworkCode = num2;
        this.radioType = str;
        this.carrier = str2;
        this.considerIp = bool;
        this.cellTowers = cellTowerArr;
        this.wifiAccessPoints = wifiAccessPointArr;
    }
}
