package com.scandit.datacapture.barcode.ar.ui.annotations;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotationTrigger;", "", "HIGHLIGHT_TAP", "HIGHLIGHT_TAP_AND_BARCODE_SCAN", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeArAnnotationTrigger {
    public static final BarcodeArAnnotationTrigger HIGHLIGHT_TAP;
    public static final BarcodeArAnnotationTrigger HIGHLIGHT_TAP_AND_BARCODE_SCAN;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ BarcodeArAnnotationTrigger[] f121148a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f121149b;

    public static EnumEntries<BarcodeArAnnotationTrigger> getEntries() {
        return f121149b;
    }

    public static BarcodeArAnnotationTrigger valueOf(String str) {
        return (BarcodeArAnnotationTrigger) Enum.valueOf(BarcodeArAnnotationTrigger.class, str);
    }

    public static BarcodeArAnnotationTrigger[] values() {
        return (BarcodeArAnnotationTrigger[]) f121148a.clone();
    }

    static {
        BarcodeArAnnotationTrigger barcodeArAnnotationTrigger = new BarcodeArAnnotationTrigger("HIGHLIGHT_TAP", 0);
        HIGHLIGHT_TAP = barcodeArAnnotationTrigger;
        BarcodeArAnnotationTrigger barcodeArAnnotationTrigger2 = new BarcodeArAnnotationTrigger("HIGHLIGHT_TAP_AND_BARCODE_SCAN", 1);
        HIGHLIGHT_TAP_AND_BARCODE_SCAN = barcodeArAnnotationTrigger2;
        BarcodeArAnnotationTrigger[] barcodeArAnnotationTriggerArr = {barcodeArAnnotationTrigger, barcodeArAnnotationTrigger2};
        f121148a = barcodeArAnnotationTriggerArr;
        f121149b = EnumEntriesKt.a(barcodeArAnnotationTriggerArr);
    }

    private BarcodeArAnnotationTrigger(String str, int i10) {
    }
}
