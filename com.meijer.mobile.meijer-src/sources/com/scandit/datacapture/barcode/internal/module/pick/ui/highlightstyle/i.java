package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle;

import android.graphics.Bitmap;
import com.scandit.datacapture.core.ui.icon.ScanditIcon;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class i {
    public static final BarcodePickIcon a(int i10, BarcodePickIcon barcodePickIcon) {
        Intrinsics.j(g.f123724a, "<this>");
        Intrinsics.j(barcodePickIcon, "default");
        return i10 == 0 ? barcodePickIcon : new o(i10);
    }

    public static final BarcodePickIcon a(Bitmap bitmap, BarcodePickIcon barcodePickIcon) {
        Intrinsics.j(g.f123724a, "<this>");
        Intrinsics.j(barcodePickIcon, "default");
        return bitmap == null ? barcodePickIcon : new j(bitmap);
    }

    public static final BarcodePickIcon a(ScanditIcon scanditIcon, BarcodePickIcon barcodePickIcon) {
        Intrinsics.j(g.f123724a, "<this>");
        Intrinsics.j(barcodePickIcon, "default");
        return scanditIcon == null ? barcodePickIcon : new n(scanditIcon);
    }
}
