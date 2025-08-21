package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import android.graphics.Color;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayStyle;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC13197d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f122386a = Color.parseColor("#28D380");

    /* renamed from: b, reason: collision with root package name */
    public static final int f122387b = Color.parseColor("#FA4446");

    public static EnumC13194a a(NativeBarcodeCountBasicOverlayStyle nativeBarcodeCountBasicOverlayStyle, W w10) {
        int iOrdinal = w10.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            return EnumC13194a.f122380c;
        }
        int i10 = AbstractC13195b.f122382a[nativeBarcodeCountBasicOverlayStyle.ordinal()];
        if (i10 == 1) {
            return EnumC13194a.f122378a;
        }
        if (i10 == 2) {
            return EnumC13194a.f122379b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static Integer a(W w10, NativeBarcodeCountBasicOverlayColorScheme nativeBarcodeCountBasicOverlayColorScheme) {
        int i10;
        int i11;
        int i12;
        int iOrdinal = w10.ordinal();
        if (iOrdinal == 0) {
            int i13 = AbstractC13195b.f122383b[nativeBarcodeCountBasicOverlayColorScheme.ordinal()];
            if (i13 == 1) {
                i10 = R.drawable.sc_ic_barcode_scanned;
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i10 = R.drawable.sc_ic_barcode_scanned_alt;
            }
            return Integer.valueOf(i10);
        }
        if (iOrdinal == 1) {
            return Integer.valueOf(R.drawable.sc_ic_barcode_accepted);
        }
        if (iOrdinal == 2) {
            return Integer.valueOf(R.drawable.sc_ic_barcode_rejected);
        }
        if (iOrdinal == 3) {
            int i14 = AbstractC13195b.f122383b[nativeBarcodeCountBasicOverlayColorScheme.ordinal()];
            if (i14 == 1) {
                i11 = R.drawable.sc_ic_barcode_not_in_list;
            } else {
                if (i14 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i11 = R.drawable.sc_ic_barcode_not_in_list_alt;
            }
            return Integer.valueOf(i11);
        }
        if (iOrdinal != 4) {
            if (iOrdinal == 5) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i15 = AbstractC13195b.f122383b[nativeBarcodeCountBasicOverlayColorScheme.ordinal()];
        if (i15 == 1) {
            i12 = R.drawable.sc_ic_barcode_unscanned;
        } else {
            if (i15 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.drawable.sc_ic_barcode_unscanned_alt;
        }
        return Integer.valueOf(i12);
    }

    public static boolean a(TrackedBarcode barcode, NativeBarcodeCountBasicOverlayStyle style, W status, Function2 dotBrushProvider) {
        Intrinsics.j(barcode, "barcode");
        Intrinsics.j(style, "style");
        Intrinsics.j(status, "status");
        Intrinsics.j(dotBrushProvider, "dotBrushProvider");
        EnumC13194a enumC13194aA = a(style, status);
        Brush brush = (Brush) dotBrushProvider.invoke(barcode, status);
        return enumC13194aA == EnumC13194a.f122379b || !(brush == null || Color.alpha(brush.getFillColor()) == 0);
    }
}
