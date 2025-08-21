package com.google.maps;

import com.google.gson.Gson;
import com.google.maps.GeolocationApi;
import com.google.maps.model.CellTower;
import com.google.maps.model.GeolocationPayload;
import com.google.maps.model.GeolocationResult;
import com.google.maps.model.WifiAccessPoint;

/* loaded from: classes8.dex */
public class GeolocationApiRequest extends PendingResultBase<GeolocationResult, GeolocationApiRequest, GeolocationApi.Response> {
    private GeolocationPayload.GeolocationPayloadBuilder builder;
    private GeolocationPayload payload;

    GeolocationApiRequest(GeoApiContext geoApiContext) {
        super(geoApiContext, GeolocationApi.GEOLOCATION_API_CONFIG, GeolocationApi.Response.class);
        this.payload = null;
        this.builder = null;
        this.builder = new GeolocationPayload.GeolocationPayloadBuilder();
    }

    public GeolocationApiRequest AddCellTower(CellTower cellTower) {
        this.builder.AddCellTower(cellTower);
        return this;
    }

    public GeolocationApiRequest AddWifiAccessPoint(WifiAccessPoint wifiAccessPoint) {
        this.builder.AddWifiAccessPoint(wifiAccessPoint);
        return this;
    }

    public GeolocationApiRequest Carrier(String str) {
        this.builder.Carrier(str);
        return this;
    }

    public GeolocationApiRequest CellTowers(CellTower[] cellTowerArr) {
        this.builder.CellTowers(cellTowerArr);
        return this;
    }

    public GeolocationApiRequest ConsiderIp(boolean z10) {
        this.builder.ConsiderIp(z10);
        return this;
    }

    public GeolocationApiRequest CreatePayload() {
        if (this.payload == null) {
            this.payload = this.builder.createGeolocationPayload();
        }
        return param("_payload", new Gson().x(this.payload));
    }

    public GeolocationApiRequest HomeMobileCountryCode(int i10) {
        this.builder.HomeMobileCountryCode(i10);
        return this;
    }

    public GeolocationApiRequest HomeMobileNetworkCode(int i10) {
        this.builder.HomeMobileNetworkCode(i10);
        return this;
    }

    public GeolocationApiRequest Payload(GeolocationPayload geolocationPayload) {
        this.payload = geolocationPayload;
        return this;
    }

    public GeolocationApiRequest RadioType(String str) {
        this.builder.RadioType(str);
        return this;
    }

    public GeolocationApiRequest WifiAccessPoints(WifiAccessPoint[] wifiAccessPointArr) {
        this.builder.WifiAccessPoints(wifiAccessPointArr);
        return this;
    }

    @Override // com.google.maps.PendingResultBase
    protected void validateRequest() {
        WifiAccessPoint[] wifiAccessPointArr;
        Boolean bool = this.payload.considerIp;
        if (bool != null && !bool.booleanValue() && (wifiAccessPointArr = this.payload.wifiAccessPoints) != null && wifiAccessPointArr.length < 2) {
            throw new IllegalArgumentException("Request must contain two or more 'Wifi Access Points'");
        }
    }

    @Override // com.google.maps.PendingResultBase
    public /* bridge */ /* synthetic */ PendingResultBase channel(String str) {
        return super.channel(str);
    }

    @Override // com.google.maps.PendingResultBase
    public /* bridge */ /* synthetic */ PendingResultBase custom(String str, String str2) {
        return super.custom(str, str2);
    }

    @Override // com.google.maps.PendingResultBase
    public /* bridge */ /* synthetic */ PendingResultBase experienceIds(String[] strArr) {
        return super.experienceIds(strArr);
    }

    @Override // com.google.maps.PendingResultBase
    public /* bridge */ /* synthetic */ PendingResultBase header(String str, String str2) {
        return super.header(str, str2);
    }
}
