package com.scandit.datacapture.barcode.ar.ui.annotations.info;

import android.content.Context;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationWidthPreset;", "", "", "toPixels$scandit_barcode_capture", "()I", "toPixels", "", "toPaddingAndCornerRadius$scandit_barcode_capture", "()F", "toPaddingAndCornerRadius", "SMALL", "MEDIUM", "LARGE", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeArInfoAnnotationWidthPreset {
    public static final BarcodeArInfoAnnotationWidthPreset LARGE;
    public static final BarcodeArInfoAnnotationWidthPreset MEDIUM;
    public static final BarcodeArInfoAnnotationWidthPreset SMALL;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ BarcodeArInfoAnnotationWidthPreset[] f120341a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f120342b;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BarcodeArInfoAnnotationWidthPreset.values().length];
            try {
                iArr[BarcodeArInfoAnnotationWidthPreset.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BarcodeArInfoAnnotationWidthPreset.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BarcodeArInfoAnnotationWidthPreset.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static EnumEntries<BarcodeArInfoAnnotationWidthPreset> getEntries() {
        return f120342b;
    }

    public static BarcodeArInfoAnnotationWidthPreset valueOf(String str) {
        return (BarcodeArInfoAnnotationWidthPreset) Enum.valueOf(BarcodeArInfoAnnotationWidthPreset.class, str);
    }

    public static BarcodeArInfoAnnotationWidthPreset[] values() {
        return (BarcodeArInfoAnnotationWidthPreset[]) f120341a.clone();
    }

    static {
        BarcodeArInfoAnnotationWidthPreset barcodeArInfoAnnotationWidthPreset = new BarcodeArInfoAnnotationWidthPreset("SMALL", 0);
        SMALL = barcodeArInfoAnnotationWidthPreset;
        BarcodeArInfoAnnotationWidthPreset barcodeArInfoAnnotationWidthPreset2 = new BarcodeArInfoAnnotationWidthPreset("MEDIUM", 1);
        MEDIUM = barcodeArInfoAnnotationWidthPreset2;
        BarcodeArInfoAnnotationWidthPreset barcodeArInfoAnnotationWidthPreset3 = new BarcodeArInfoAnnotationWidthPreset("LARGE", 2);
        LARGE = barcodeArInfoAnnotationWidthPreset3;
        BarcodeArInfoAnnotationWidthPreset[] barcodeArInfoAnnotationWidthPresetArr = {barcodeArInfoAnnotationWidthPreset, barcodeArInfoAnnotationWidthPreset2, barcodeArInfoAnnotationWidthPreset3};
        f120341a = barcodeArInfoAnnotationWidthPresetArr;
        f120342b = EnumEntriesKt.a(barcodeArInfoAnnotationWidthPresetArr);
    }

    public final float toPaddingAndCornerRadius$scandit_barcode_capture() {
        float f10;
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            f10 = 8.0f;
        } else if (i10 == 2) {
            f10 = 12.0f;
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f10 = 16.0f;
        }
        return PixelExtensionsKt.pxFromDp$default(f10, (Context) null, 1, (Object) null);
    }

    public final int toPixels$scandit_barcode_capture() {
        int i10;
        int i11 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1) {
            i10 = 56;
        } else if (i11 == 2) {
            i10 = BinsView.TOTE_HEIGHT_DP;
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = HttpResponseStatus.SUCCESS_OK;
        }
        return PixelExtensionsKt.pxFromDp$default(i10, (Context) null, 1, (Object) null);
    }

    private BarcodeArInfoAnnotationWidthPreset(String str, int i10) {
    }
}
