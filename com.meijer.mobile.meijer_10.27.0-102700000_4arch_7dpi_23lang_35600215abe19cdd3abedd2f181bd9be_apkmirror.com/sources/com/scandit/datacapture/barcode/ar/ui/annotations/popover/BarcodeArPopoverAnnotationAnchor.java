package com.scandit.datacapture.barcode.ar.ui.annotations.popover;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/annotations/popover/BarcodeArPopoverAnnotationAnchor;", "", "TOP", "BOTTOM", "LEFT", "RIGHT", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeArPopoverAnnotationAnchor {
    public static final BarcodeArPopoverAnnotationAnchor BOTTOM;
    public static final BarcodeArPopoverAnnotationAnchor LEFT;
    public static final BarcodeArPopoverAnnotationAnchor RIGHT;
    public static final BarcodeArPopoverAnnotationAnchor TOP;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ BarcodeArPopoverAnnotationAnchor[] f120351a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f120352b;

    public static EnumEntries<BarcodeArPopoverAnnotationAnchor> getEntries() {
        return f120352b;
    }

    public static BarcodeArPopoverAnnotationAnchor valueOf(String str) {
        return (BarcodeArPopoverAnnotationAnchor) Enum.valueOf(BarcodeArPopoverAnnotationAnchor.class, str);
    }

    public static BarcodeArPopoverAnnotationAnchor[] values() {
        return (BarcodeArPopoverAnnotationAnchor[]) f120351a.clone();
    }

    static {
        BarcodeArPopoverAnnotationAnchor barcodeArPopoverAnnotationAnchor = new BarcodeArPopoverAnnotationAnchor("TOP", 0);
        TOP = barcodeArPopoverAnnotationAnchor;
        BarcodeArPopoverAnnotationAnchor barcodeArPopoverAnnotationAnchor2 = new BarcodeArPopoverAnnotationAnchor("BOTTOM", 1);
        BOTTOM = barcodeArPopoverAnnotationAnchor2;
        BarcodeArPopoverAnnotationAnchor barcodeArPopoverAnnotationAnchor3 = new BarcodeArPopoverAnnotationAnchor("LEFT", 2);
        LEFT = barcodeArPopoverAnnotationAnchor3;
        BarcodeArPopoverAnnotationAnchor barcodeArPopoverAnnotationAnchor4 = new BarcodeArPopoverAnnotationAnchor("RIGHT", 3);
        RIGHT = barcodeArPopoverAnnotationAnchor4;
        BarcodeArPopoverAnnotationAnchor[] barcodeArPopoverAnnotationAnchorArr = {barcodeArPopoverAnnotationAnchor, barcodeArPopoverAnnotationAnchor2, barcodeArPopoverAnnotationAnchor3, barcodeArPopoverAnnotationAnchor4};
        f120351a = barcodeArPopoverAnnotationAnchorArr;
        f120352b = EnumEntriesKt.a(barcodeArPopoverAnnotationAnchorArr);
    }

    private BarcodeArPopoverAnnotationAnchor(String str, int i10) {
    }
}
