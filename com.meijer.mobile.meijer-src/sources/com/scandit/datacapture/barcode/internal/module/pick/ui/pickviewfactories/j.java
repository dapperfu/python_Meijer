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

/* loaded from: classes12.dex */
public final class j extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.k f123740a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BarcodePickViewHighlightStyle.CustomView f123741b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BarcodePickElementsCache f123742c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BarcodePickViewSettings f123743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BarcodePickDataCaptureViewWrapper f123744e;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.c dVar;
        FrameLayout container = (FrameLayout) obj;
        Intrinsics.j(container, "container");
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.j jVarA = ((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.l) this.f123740a).a(this.f123741b);
        BarcodePickElementsCache barcodePickElementsCache = this.f123742c;
        Intrinsics.h(barcodePickElementsCache, "null cannot be cast to non-null type com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickStyleElementProvider<com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickStyleElement?>");
        BarcodePickViewHighlightStyle.CustomView customView = this.f123741b;
        boolean fitViewsToBarcode = customView.getFitViewsToBarcode();
        if (fitViewsToBarcode) {
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.b bVar = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.b.f123637a;
            Size2 minSize = new Size2(this.f123743d.getMinimumHighlightWidthPx$scandit_barcode_capture(), this.f123743d.getMinimumHighlightHeightPx$scandit_barcode_capture());
            h quadrilateralMapper = new h((com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.j) this.f123744e);
            Intrinsics.j(bVar, "<this>");
            Intrinsics.j(minSize, "minSize");
            Intrinsics.j(quadrilateralMapper, "quadrilateralMapper");
            dVar = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.e(minSize, quadrilateralMapper);
        } else {
            if (fitViewsToBarcode) {
                throw new NoWhenBranchMatchedException();
            }
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.b bVar2 = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.b.f123637a;
            i quadrilateralMapper2 = new i((com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.j) this.f123744e);
            BarcodePickElementsCache cache = this.f123742c;
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
        this.f123740a = lVar;
        this.f123741b = customView;
        this.f123742c = fVar;
        this.f123743d = barcodePickViewSettings;
        this.f123744e = jVar;
    }
}
