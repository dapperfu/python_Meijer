package com.scandit.datacapture.barcode.batch.ui.overlay;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchBasicOverlayStyle;", "", "FRAME", "DOT", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeBatchBasicOverlayStyle {
    public static final BarcodeBatchBasicOverlayStyle DOT;
    public static final BarcodeBatchBasicOverlayStyle FRAME;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ BarcodeBatchBasicOverlayStyle[] f120501a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f120502b;

    public static EnumEntries<BarcodeBatchBasicOverlayStyle> getEntries() {
        return f120502b;
    }

    public static BarcodeBatchBasicOverlayStyle valueOf(String str) {
        return (BarcodeBatchBasicOverlayStyle) Enum.valueOf(BarcodeBatchBasicOverlayStyle.class, str);
    }

    public static BarcodeBatchBasicOverlayStyle[] values() {
        return (BarcodeBatchBasicOverlayStyle[]) f120501a.clone();
    }

    static {
        BarcodeBatchBasicOverlayStyle barcodeBatchBasicOverlayStyle = new BarcodeBatchBasicOverlayStyle("FRAME", 0);
        FRAME = barcodeBatchBasicOverlayStyle;
        BarcodeBatchBasicOverlayStyle barcodeBatchBasicOverlayStyle2 = new BarcodeBatchBasicOverlayStyle("DOT", 1);
        DOT = barcodeBatchBasicOverlayStyle2;
        BarcodeBatchBasicOverlayStyle[] barcodeBatchBasicOverlayStyleArr = {barcodeBatchBasicOverlayStyle, barcodeBatchBasicOverlayStyle2};
        f120501a = barcodeBatchBasicOverlayStyleArr;
        f120502b = EnumEntriesKt.a(barcodeBatchBasicOverlayStyleArr);
    }

    private BarcodeBatchBasicOverlayStyle(String str, int i10) {
    }
}
