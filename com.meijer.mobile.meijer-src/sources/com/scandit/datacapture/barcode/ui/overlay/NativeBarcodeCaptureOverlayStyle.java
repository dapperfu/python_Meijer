package com.scandit.datacapture.barcode.ui.overlay;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@DjinniGenerated
/* loaded from: classes12.dex */
public final class NativeBarcodeCaptureOverlayStyle {
    public static final NativeBarcodeCaptureOverlayStyle FRAME;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ NativeBarcodeCaptureOverlayStyle[] f124963a;

    static {
        NativeBarcodeCaptureOverlayStyle nativeBarcodeCaptureOverlayStyle = new NativeBarcodeCaptureOverlayStyle();
        FRAME = nativeBarcodeCaptureOverlayStyle;
        f124963a = new NativeBarcodeCaptureOverlayStyle[]{nativeBarcodeCaptureOverlayStyle};
    }

    private NativeBarcodeCaptureOverlayStyle() {
    }

    public static NativeBarcodeCaptureOverlayStyle valueOf(String str) {
        return (NativeBarcodeCaptureOverlayStyle) Enum.valueOf(NativeBarcodeCaptureOverlayStyle.class, str);
    }

    public static NativeBarcodeCaptureOverlayStyle[] values() {
        return (NativeBarcodeCaptureOverlayStyle[]) f124963a.clone();
    }
}
