package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider;

import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickBrush;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconStyle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodePickIcon f123717a;

    /* renamed from: b, reason: collision with root package name */
    public final BarcodePickBrush f123718b;

    /* renamed from: c, reason: collision with root package name */
    public final BarcodePickStatusIconStyle f123719c;

    public g(BarcodePickIcon icon, BarcodePickBrush brush, BarcodePickStatusIconStyle barcodePickStatusIconStyle) {
        Intrinsics.j(icon, "icon");
        Intrinsics.j(brush, "brush");
        this.f123717a = icon;
        this.f123718b = brush;
        this.f123719c = barcodePickStatusIconStyle;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.i
    public final BarcodePickStatusIconStyle a() {
        return this.f123719c;
    }
}
