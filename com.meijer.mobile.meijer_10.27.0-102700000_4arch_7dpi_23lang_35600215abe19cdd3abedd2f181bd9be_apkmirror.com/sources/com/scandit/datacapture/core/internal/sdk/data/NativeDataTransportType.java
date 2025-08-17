package com.scandit.datacapture.core.internal.sdk.data;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@DjinniGenerated
/* loaded from: classes11.dex */
public final class NativeDataTransportType {
    public static final NativeDataTransportType BLUETOOTH;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ NativeDataTransportType[] f125448a;

    static {
        NativeDataTransportType nativeDataTransportType = new NativeDataTransportType();
        BLUETOOTH = nativeDataTransportType;
        f125448a = new NativeDataTransportType[]{nativeDataTransportType};
    }

    private NativeDataTransportType() {
    }

    public static NativeDataTransportType valueOf(String str) {
        return (NativeDataTransportType) Enum.valueOf(NativeDataTransportType.class, str);
    }

    public static NativeDataTransportType[] values() {
        return (NativeDataTransportType[]) f125448a.clone();
    }
}
