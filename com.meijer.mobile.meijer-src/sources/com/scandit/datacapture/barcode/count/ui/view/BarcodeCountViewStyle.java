package com.scandit.datacapture.barcode.count.ui.view;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewStyle;", "", "DOT", "ICON", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeCountViewStyle {
    public static final BarcodeCountViewStyle DOT;
    public static final BarcodeCountViewStyle ICON;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ BarcodeCountViewStyle[] f121799a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f121800b;

    public static EnumEntries<BarcodeCountViewStyle> getEntries() {
        return f121800b;
    }

    public static BarcodeCountViewStyle valueOf(String str) {
        return (BarcodeCountViewStyle) Enum.valueOf(BarcodeCountViewStyle.class, str);
    }

    public static BarcodeCountViewStyle[] values() {
        return (BarcodeCountViewStyle[]) f121799a.clone();
    }

    static {
        BarcodeCountViewStyle barcodeCountViewStyle = new BarcodeCountViewStyle("DOT", 0);
        DOT = barcodeCountViewStyle;
        BarcodeCountViewStyle barcodeCountViewStyle2 = new BarcodeCountViewStyle("ICON", 1);
        ICON = barcodeCountViewStyle2;
        BarcodeCountViewStyle[] barcodeCountViewStyleArr = {barcodeCountViewStyle, barcodeCountViewStyle2};
        f121799a = barcodeCountViewStyleArr;
        f121800b = EnumEntriesKt.a(barcodeCountViewStyleArr);
    }

    private BarcodeCountViewStyle(String str, int i10) {
    }
}
