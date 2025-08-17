package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.iconprovider;

import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickHighlightStyleIconsHolder;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.m;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    public final c f122774b;

    /* renamed from: c, reason: collision with root package name */
    public final c f122775c;

    public d(BarcodePickHighlightStyleIconsHolder overrides, c defaultsProvider) {
        Intrinsics.j(overrides, "overrides");
        Intrinsics.j(defaultsProvider, "defaultsProvider");
        this.f122774b = overrides;
        this.f122775c = defaultsProvider;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.iconprovider.c
    public final BarcodePickIcon a(BarcodePickState state) {
        Intrinsics.j(state, "state");
        BarcodePickIcon barcodePickIconA = this.f122774b.a(state);
        return Intrinsics.e(barcodePickIconA, m.f122781a) ? this.f122775c.a(state) : barcodePickIconA;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.iconprovider.c
    public final BarcodePickIcon b(BarcodePickState state) {
        Intrinsics.j(state, "state");
        BarcodePickIcon barcodePickIconB = this.f122774b.b(state);
        return Intrinsics.e(barcodePickIconB, m.f122781a) ? this.f122775c.b(state) : barcodePickIconB;
    }
}
