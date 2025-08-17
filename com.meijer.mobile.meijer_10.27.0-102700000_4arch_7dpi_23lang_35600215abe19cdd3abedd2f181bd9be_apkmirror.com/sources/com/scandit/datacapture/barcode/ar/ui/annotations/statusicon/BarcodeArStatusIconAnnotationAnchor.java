package com.scandit.datacapture.barcode.ar.ui.annotations.statusicon;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/annotations/statusicon/BarcodeArStatusIconAnnotationAnchor;", "", "TOP", "BOTTOM", "LEFT", "RIGHT", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeArStatusIconAnnotationAnchor {
    public static final BarcodeArStatusIconAnnotationAnchor BOTTOM;
    public static final BarcodeArStatusIconAnnotationAnchor LEFT;
    public static final BarcodeArStatusIconAnnotationAnchor RIGHT;
    public static final BarcodeArStatusIconAnnotationAnchor TOP;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ BarcodeArStatusIconAnnotationAnchor[] f120371a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f120372b;

    public static EnumEntries<BarcodeArStatusIconAnnotationAnchor> getEntries() {
        return f120372b;
    }

    public static BarcodeArStatusIconAnnotationAnchor valueOf(String str) {
        return (BarcodeArStatusIconAnnotationAnchor) Enum.valueOf(BarcodeArStatusIconAnnotationAnchor.class, str);
    }

    public static BarcodeArStatusIconAnnotationAnchor[] values() {
        return (BarcodeArStatusIconAnnotationAnchor[]) f120371a.clone();
    }

    static {
        BarcodeArStatusIconAnnotationAnchor barcodeArStatusIconAnnotationAnchor = new BarcodeArStatusIconAnnotationAnchor("TOP", 0);
        TOP = barcodeArStatusIconAnnotationAnchor;
        BarcodeArStatusIconAnnotationAnchor barcodeArStatusIconAnnotationAnchor2 = new BarcodeArStatusIconAnnotationAnchor("BOTTOM", 1);
        BOTTOM = barcodeArStatusIconAnnotationAnchor2;
        BarcodeArStatusIconAnnotationAnchor barcodeArStatusIconAnnotationAnchor3 = new BarcodeArStatusIconAnnotationAnchor("LEFT", 2);
        LEFT = barcodeArStatusIconAnnotationAnchor3;
        BarcodeArStatusIconAnnotationAnchor barcodeArStatusIconAnnotationAnchor4 = new BarcodeArStatusIconAnnotationAnchor("RIGHT", 3);
        RIGHT = barcodeArStatusIconAnnotationAnchor4;
        BarcodeArStatusIconAnnotationAnchor[] barcodeArStatusIconAnnotationAnchorArr = {barcodeArStatusIconAnnotationAnchor, barcodeArStatusIconAnnotationAnchor2, barcodeArStatusIconAnnotationAnchor3, barcodeArStatusIconAnnotationAnchor4};
        f120371a = barcodeArStatusIconAnnotationAnchorArr;
        f120372b = EnumEntriesKt.a(barcodeArStatusIconAnnotationAnchorArr);
    }

    private BarcodeArStatusIconAnnotationAnchor(String str, int i10) {
    }
}
