package com.scandit.datacapture.barcode.count.ui.view;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountScreenRatioForUi;", "", "SMALL", "MEDIUM", "LARGE", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeCountScreenRatioForUi {
    public static final BarcodeCountScreenRatioForUi LARGE;
    public static final BarcodeCountScreenRatioForUi MEDIUM;
    public static final BarcodeCountScreenRatioForUi SMALL;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ BarcodeCountScreenRatioForUi[] f120816a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f120817b;

    public static EnumEntries<BarcodeCountScreenRatioForUi> getEntries() {
        return f120817b;
    }

    public static BarcodeCountScreenRatioForUi valueOf(String str) {
        return (BarcodeCountScreenRatioForUi) Enum.valueOf(BarcodeCountScreenRatioForUi.class, str);
    }

    public static BarcodeCountScreenRatioForUi[] values() {
        return (BarcodeCountScreenRatioForUi[]) f120816a.clone();
    }

    static {
        BarcodeCountScreenRatioForUi barcodeCountScreenRatioForUi = new BarcodeCountScreenRatioForUi("SMALL", 0);
        SMALL = barcodeCountScreenRatioForUi;
        BarcodeCountScreenRatioForUi barcodeCountScreenRatioForUi2 = new BarcodeCountScreenRatioForUi("MEDIUM", 1);
        MEDIUM = barcodeCountScreenRatioForUi2;
        BarcodeCountScreenRatioForUi barcodeCountScreenRatioForUi3 = new BarcodeCountScreenRatioForUi("LARGE", 2);
        LARGE = barcodeCountScreenRatioForUi3;
        BarcodeCountScreenRatioForUi[] barcodeCountScreenRatioForUiArr = {barcodeCountScreenRatioForUi, barcodeCountScreenRatioForUi2, barcodeCountScreenRatioForUi3};
        f120816a = barcodeCountScreenRatioForUiArr;
        f120817b = EnumEntriesKt.a(barcodeCountScreenRatioForUiArr);
    }

    private BarcodeCountScreenRatioForUi(String str, int i10) {
    }
}
