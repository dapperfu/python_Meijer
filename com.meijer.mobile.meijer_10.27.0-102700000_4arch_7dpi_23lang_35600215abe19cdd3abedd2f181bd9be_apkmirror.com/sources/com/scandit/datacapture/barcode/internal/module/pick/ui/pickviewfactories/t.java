package com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories;

import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.BarcodePickDataCaptureViewWrapper;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickElementsCache;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import com.scandit.datacapture.core.common.geometry.Size2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class t extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.k f122800a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BarcodePickViewHighlightStyle.RectangularWithIcons f122801b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BarcodePickElementsCache f122802c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BarcodePickViewSettings f122803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BarcodePickDataCaptureViewWrapper f122804e;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FrameLayout container = (FrameLayout) obj;
        Intrinsics.j(container, "container");
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.j jVarA = ((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.l) this.f122800a).a(this.f122801b);
        BarcodePickElementsCache barcodePickElementsCache = this.f122802c;
        Intrinsics.h(barcodePickElementsCache, "null cannot be cast to non-null type com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickStyleElementProvider<com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickStyleElement?>");
        BarcodePickViewHighlightStyle.RectangularWithIcons rectangularWithIcons = this.f122801b;
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.b bVar = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.b.f122685a;
        Size2 minSize = new Size2(this.f122803d.getMinimumHighlightWidthPx$scandit_barcode_capture(), this.f122803d.getMinimumHighlightHeightPx$scandit_barcode_capture());
        s quadrilateralMapper = new s((com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.j) this.f122804e);
        Intrinsics.j(bVar, "<this>");
        Intrinsics.j(quadrilateralMapper, "quadrilateralMapper");
        Intrinsics.j(minSize, "minSize");
        return new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e(container, jVarA, barcodePickElementsCache, rectangularWithIcons, new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.i(quadrilateralMapper, minSize));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.l lVar, BarcodePickViewHighlightStyle.RectangularWithIcons rectangularWithIcons, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.c cVar, BarcodePickViewSettings barcodePickViewSettings, com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.j jVar) {
        super(1);
        this.f122800a = lVar;
        this.f122801b = rectangularWithIcons;
        this.f122802c = cVar;
        this.f122803d = barcodePickViewSettings;
        this.f122804e = jVar;
    }
}
