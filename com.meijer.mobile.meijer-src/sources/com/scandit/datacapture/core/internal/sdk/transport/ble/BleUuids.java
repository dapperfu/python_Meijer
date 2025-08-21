package com.scandit.datacapture.core.internal.sdk.transport.ble;

import com.scandit.datacapture.core.internal.sdk.data.NativeDataTransportConnectionOptions;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\nR\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0016\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/transport/ble/BleUuids;", "", "Lcom/scandit/datacapture/core/internal/sdk/data/NativeDataTransportConnectionOptions;", "options", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/data/NativeDataTransportConnectionOptions;)V", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "getService", "()Ljava/util/UUID;", "service", "b", "getClientCharacteristicConfiguration", "clientCharacteristicConfiguration", "c", "getStateCharacteristic", "stateCharacteristic", "d", "getClientToServerCharacteristic", "clientToServerCharacteristic", "e", "getServerToClientCharacteristic", "serverToClientCharacteristic", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BleUuids {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final UUID service;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final UUID clientCharacteristicConfiguration;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final UUID stateCharacteristic;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final UUID clientToServerCharacteristic;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final UUID serverToClientCharacteristic;

    public BleUuids(NativeDataTransportConnectionOptions options) {
        Intrinsics.j(options, "options");
        UUID uuidFromString = UUID.fromString(options.getPeripheralServerModeUuid());
        Intrinsics.i(uuidFromString, "fromString(...)");
        this.service = uuidFromString;
        UUID uuidFromString2 = UUID.fromString("00002902-0000-1000-8000-00805F9B34FB");
        Intrinsics.i(uuidFromString2, "fromString(...)");
        this.clientCharacteristicConfiguration = uuidFromString2;
        UUID uuidFromString3 = UUID.fromString(options.getStateCharacteristicUuid());
        Intrinsics.i(uuidFromString3, "fromString(...)");
        this.stateCharacteristic = uuidFromString3;
        UUID uuidFromString4 = UUID.fromString(options.getClientToServerCharacteristicUuid());
        Intrinsics.i(uuidFromString4, "fromString(...)");
        this.clientToServerCharacteristic = uuidFromString4;
        UUID uuidFromString5 = UUID.fromString(options.getServerToClientCharacteristicUuid());
        Intrinsics.i(uuidFromString5, "fromString(...)");
        this.serverToClientCharacteristic = uuidFromString5;
    }

    public final UUID getClientCharacteristicConfiguration() {
        return this.clientCharacteristicConfiguration;
    }

    public final UUID getClientToServerCharacteristic() {
        return this.clientToServerCharacteristic;
    }

    public final UUID getServerToClientCharacteristic() {
        return this.serverToClientCharacteristic;
    }

    public final UUID getService() {
        return this.service;
    }

    public final UUID getStateCharacteristic() {
        return this.stateCharacteristic;
    }
}
