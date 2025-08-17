package com.scandit.datacapture.barcode.ar.ui.highlight;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/highlight/BarcodeArCircleHighlightPreset;", "", "DOT", "ICON", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeArCircleHighlightPreset {
    public static final BarcodeArCircleHighlightPreset DOT;
    public static final BarcodeArCircleHighlightPreset ICON;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ BarcodeArCircleHighlightPreset[] f120388a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f120389b;

    public static EnumEntries<BarcodeArCircleHighlightPreset> getEntries() {
        return f120389b;
    }

    public static BarcodeArCircleHighlightPreset valueOf(String str) {
        return (BarcodeArCircleHighlightPreset) Enum.valueOf(BarcodeArCircleHighlightPreset.class, str);
    }

    public static BarcodeArCircleHighlightPreset[] values() {
        return (BarcodeArCircleHighlightPreset[]) f120388a.clone();
    }

    static {
        BarcodeArCircleHighlightPreset barcodeArCircleHighlightPreset = new BarcodeArCircleHighlightPreset("DOT", 0);
        DOT = barcodeArCircleHighlightPreset;
        BarcodeArCircleHighlightPreset barcodeArCircleHighlightPreset2 = new BarcodeArCircleHighlightPreset("ICON", 1);
        ICON = barcodeArCircleHighlightPreset2;
        BarcodeArCircleHighlightPreset[] barcodeArCircleHighlightPresetArr = {barcodeArCircleHighlightPreset, barcodeArCircleHighlightPreset2};
        f120388a = barcodeArCircleHighlightPresetArr;
        f120389b = EnumEntriesKt.a(barcodeArCircleHighlightPresetArr);
    }

    private BarcodeArCircleHighlightPreset(String str, int i10) {
    }
}
