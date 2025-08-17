package com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories;

import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.BarcodePickDataCaptureViewWrapper;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickElementsCache;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import com.scandit.datacapture.core.common.geometry.Size2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class j extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.k f122788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BarcodePickViewHighlightStyle.CustomView f122789b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BarcodePickElementsCache f122790c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BarcodePickViewSettings f122791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BarcodePickDataCaptureViewWrapper f122792e;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.c dVar;
        FrameLayout container = (FrameLayout) obj;
        Intrinsics.j(container, "container");
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.j jVarA = ((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.l) this.f122788a).a(this.f122789b);
        BarcodePickElementsCache barcodePickElementsCache = this.f122790c;
        Intrinsics.h(barcodePickElementsCache, "null cannot be cast to non-null type com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickStyleElementProvider<com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickStyleElement?>");
        BarcodePickViewHighlightStyle.CustomView customView = this.f122789b;
        boolean fitViewsToBarcode = customView.getFitViewsToBarcode();
        if (fitViewsToBarcode) {
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.b bVar = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.b.f122685a;
            Size2 minSize = new Size2(this.f122791d.getMinimumHighlightWidthPx$scandit_barcode_capture(), this.f122791d.getMinimumHighlightHeightPx$scandit_barcode_capture());
            h quadrilateralMapper = new h((com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.j) this.f122792e);
            Intrinsics.j(bVar, "<this>");
            Intrinsics.j(minSize, "minSize");
            Intrinsics.j(quadrilateralMapper, "quadrilateralMapper");
            dVar = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.e(minSize, quadrilateralMapper);
        } else {
            if (fitViewsToBarcode) {
                throw new NoWhenBranchMatchedException();
            }
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.b bVar2 = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.b.f122685a;
            i quadrilateralMapper2 = new i((com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.j) this.f122792e);
            BarcodePickElementsCache cache = this.f122790c;
            Intrinsics.j(bVar2, "<this>");
            Intrinsics.j(quadrilateralMapper2, "quadrilateralMapper");
            Intrinsics.j(cache, "cache");
            dVar = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.d((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.f) cache, quadrilateralMapper2);
        }
        return new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e(container, jVarA, barcodePickElementsCache, customView, dVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.l lVar, BarcodePickViewHighlightStyle.CustomView customView, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.f fVar, BarcodePickViewSettings barcodePickViewSettings, com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.j jVar) {
        super(1);
        this.f122788a = lVar;
        this.f122789b = customView;
        this.f122790c = fVar;
        this.f122791d = barcodePickViewSettings;
        this.f122792e = jVar;
    }
}
