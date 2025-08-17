package com.scandit.datacapture.barcode.spark.internal.module.ui;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@DjinniGenerated
/* loaded from: classes11.dex */
public final class NativeSparkScanOverlayStyle {
    public static final NativeSparkScanOverlayStyle FRAME;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ NativeSparkScanOverlayStyle[] f123912a;

    static {
        NativeSparkScanOverlayStyle nativeSparkScanOverlayStyle = new NativeSparkScanOverlayStyle();
        FRAME = nativeSparkScanOverlayStyle;
        f123912a = new NativeSparkScanOverlayStyle[]{nativeSparkScanOverlayStyle};
    }

    private NativeSparkScanOverlayStyle() {
    }

    public static NativeSparkScanOverlayStyle valueOf(String str) {
        return (NativeSparkScanOverlayStyle) Enum.valueOf(NativeSparkScanOverlayStyle.class, str);
    }

    public static NativeSparkScanOverlayStyle[] values() {
        return (NativeSparkScanOverlayStyle[]) f123912a.clone();
    }
}
