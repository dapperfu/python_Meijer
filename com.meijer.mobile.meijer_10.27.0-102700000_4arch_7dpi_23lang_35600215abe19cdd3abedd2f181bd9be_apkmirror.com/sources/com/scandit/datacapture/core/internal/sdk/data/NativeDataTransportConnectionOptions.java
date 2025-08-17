package com.scandit.datacapture.core.internal.sdk.data;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public final class NativeDataTransportConnectionOptions {
    final String clientCentralModeUuid;
    final String clientToServerCharacteristicUuid;
    final String peripheralServerModeUuid;
    final String serverToClientCharacteristicUuid;
    final String stateCharacteristicUuid;

    public String getClientCentralModeUuid() {
        return this.clientCentralModeUuid;
    }

    public String getClientToServerCharacteristicUuid() {
        return this.clientToServerCharacteristicUuid;
    }

    public String getPeripheralServerModeUuid() {
        return this.peripheralServerModeUuid;
    }

    public String getServerToClientCharacteristicUuid() {
        return this.serverToClientCharacteristicUuid;
    }

    public String getStateCharacteristicUuid() {
        return this.stateCharacteristicUuid;
    }

    public String toString() {
        return "NativeDataTransportConnectionOptions{peripheralServerModeUuid=" + this.peripheralServerModeUuid + ",clientCentralModeUuid=" + this.clientCentralModeUuid + ",stateCharacteristicUuid=" + this.stateCharacteristicUuid + ",clientToServerCharacteristicUuid=" + this.clientToServerCharacteristicUuid + ",serverToClientCharacteristicUuid=" + this.serverToClientCharacteristicUuid + "}";
    }

    public NativeDataTransportConnectionOptions(String str, String str2, String str3, String str4, String str5) {
        this.peripheralServerModeUuid = str;
        this.clientCentralModeUuid = str2;
        this.stateCharacteristicUuid = str3;
        this.clientToServerCharacteristicUuid = str4;
        this.serverToClientCharacteristicUuid = str5;
    }
}
