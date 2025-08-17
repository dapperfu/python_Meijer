package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider;

import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickBrush;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconStyle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodePickIcon f122765a;

    /* renamed from: b, reason: collision with root package name */
    public final BarcodePickBrush f122766b;

    /* renamed from: c, reason: collision with root package name */
    public final BarcodePickStatusIconStyle f122767c;

    public g(BarcodePickIcon icon, BarcodePickBrush brush, BarcodePickStatusIconStyle barcodePickStatusIconStyle) {
        Intrinsics.j(icon, "icon");
        Intrinsics.j(brush, "brush");
        this.f122765a = icon;
        this.f122766b = brush;
        this.f122767c = barcodePickStatusIconStyle;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.i
    public final BarcodePickStatusIconStyle a() {
        return this.f122767c;
    }
}
