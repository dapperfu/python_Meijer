package com.scandit.datacapture.barcode.ui.overlay;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002¨\u0006\u0003"}, d2 = {"Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayStyle;", "", "FRAME", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeCaptureOverlayStyle {
    public static final BarcodeCaptureOverlayStyle FRAME;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ BarcodeCaptureOverlayStyle[] f124961a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f124962b;

    public static EnumEntries<BarcodeCaptureOverlayStyle> getEntries() {
        return f124962b;
    }

    public static BarcodeCaptureOverlayStyle valueOf(String str) {
        return (BarcodeCaptureOverlayStyle) Enum.valueOf(BarcodeCaptureOverlayStyle.class, str);
    }

    public static BarcodeCaptureOverlayStyle[] values() {
        return (BarcodeCaptureOverlayStyle[]) f124961a.clone();
    }

    static {
        BarcodeCaptureOverlayStyle barcodeCaptureOverlayStyle = new BarcodeCaptureOverlayStyle();
        FRAME = barcodeCaptureOverlayStyle;
        BarcodeCaptureOverlayStyle[] barcodeCaptureOverlayStyleArr = {barcodeCaptureOverlayStyle};
        f124961a = barcodeCaptureOverlayStyleArr;
        f124962b = EnumEntriesKt.a(barcodeCaptureOverlayStyleArr);
    }

    private BarcodeCaptureOverlayStyle() {
    }
}
