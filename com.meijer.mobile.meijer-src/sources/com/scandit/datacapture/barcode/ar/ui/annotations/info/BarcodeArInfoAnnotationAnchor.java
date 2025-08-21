package com.scandit.datacapture.barcode.ar.ui.annotations.info;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationAnchor;", "", "TOP", "BOTTOM", "LEFT", "RIGHT", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeArInfoAnnotationAnchor {
    public static final BarcodeArInfoAnnotationAnchor BOTTOM;
    public static final BarcodeArInfoAnnotationAnchor LEFT;
    public static final BarcodeArInfoAnnotationAnchor RIGHT;
    public static final BarcodeArInfoAnnotationAnchor TOP;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ BarcodeArInfoAnnotationAnchor[] f121241a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f121242b;

    public static EnumEntries<BarcodeArInfoAnnotationAnchor> getEntries() {
        return f121242b;
    }

    public static BarcodeArInfoAnnotationAnchor valueOf(String str) {
        return (BarcodeArInfoAnnotationAnchor) Enum.valueOf(BarcodeArInfoAnnotationAnchor.class, str);
    }

    public static BarcodeArInfoAnnotationAnchor[] values() {
        return (BarcodeArInfoAnnotationAnchor[]) f121241a.clone();
    }

    static {
        BarcodeArInfoAnnotationAnchor barcodeArInfoAnnotationAnchor = new BarcodeArInfoAnnotationAnchor("TOP", 0);
        TOP = barcodeArInfoAnnotationAnchor;
        BarcodeArInfoAnnotationAnchor barcodeArInfoAnnotationAnchor2 = new BarcodeArInfoAnnotationAnchor("BOTTOM", 1);
        BOTTOM = barcodeArInfoAnnotationAnchor2;
        BarcodeArInfoAnnotationAnchor barcodeArInfoAnnotationAnchor3 = new BarcodeArInfoAnnotationAnchor("LEFT", 2);
        LEFT = barcodeArInfoAnnotationAnchor3;
        BarcodeArInfoAnnotationAnchor barcodeArInfoAnnotationAnchor4 = new BarcodeArInfoAnnotationAnchor("RIGHT", 3);
        RIGHT = barcodeArInfoAnnotationAnchor4;
        BarcodeArInfoAnnotationAnchor[] barcodeArInfoAnnotationAnchorArr = {barcodeArInfoAnnotationAnchor, barcodeArInfoAnnotationAnchor2, barcodeArInfoAnnotationAnchor3, barcodeArInfoAnnotationAnchor4};
        f121241a = barcodeArInfoAnnotationAnchorArr;
        f121242b = EnumEntriesKt.a(barcodeArInfoAnnotationAnchorArr);
    }

    private BarcodeArInfoAnnotationAnchor(String str, int i10) {
    }
}
