package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.iconprovider;

import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickHighlightStyleIconsHolder;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.m;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    public final c f123726b;

    /* renamed from: c, reason: collision with root package name */
    public final c f123727c;

    public d(BarcodePickHighlightStyleIconsHolder overrides, c defaultsProvider) {
        Intrinsics.j(overrides, "overrides");
        Intrinsics.j(defaultsProvider, "defaultsProvider");
        this.f123726b = overrides;
        this.f123727c = defaultsProvider;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.iconprovider.c
    public final BarcodePickIcon a(BarcodePickState state) {
        Intrinsics.j(state, "state");
        BarcodePickIcon barcodePickIconA = this.f123726b.a(state);
        return Intrinsics.e(barcodePickIconA, m.f123733a) ? this.f123727c.a(state) : barcodePickIconA;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.iconprovider.c
    public final BarcodePickIcon b(BarcodePickState state) {
        Intrinsics.j(state, "state");
        BarcodePickIcon barcodePickIconB = this.f123726b.b(state);
        return Intrinsics.e(barcodePickIconB, m.f123733a) ? this.f123727c.b(state) : barcodePickIconB;
    }
}
