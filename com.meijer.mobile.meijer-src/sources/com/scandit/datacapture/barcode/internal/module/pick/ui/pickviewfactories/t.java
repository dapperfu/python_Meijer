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

/* loaded from: classes12.dex */
public final class t extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.k f123752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BarcodePickViewHighlightStyle.RectangularWithIcons f123753b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BarcodePickElementsCache f123754c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BarcodePickViewSettings f123755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BarcodePickDataCaptureViewWrapper f123756e;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FrameLayout container = (FrameLayout) obj;
        Intrinsics.j(container, "container");
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.j jVarA = ((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.l) this.f123752a).a(this.f123753b);
        BarcodePickElementsCache barcodePickElementsCache = this.f123754c;
        Intrinsics.h(barcodePickElementsCache, "null cannot be cast to non-null type com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickStyleElementProvider<com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickStyleElement?>");
        BarcodePickViewHighlightStyle.RectangularWithIcons rectangularWithIcons = this.f123753b;
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.b bVar = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.b.f123637a;
        Size2 minSize = new Size2(this.f123755d.getMinimumHighlightWidthPx$scandit_barcode_capture(), this.f123755d.getMinimumHighlightHeightPx$scandit_barcode_capture());
        s quadrilateralMapper = new s((com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.j) this.f123756e);
        Intrinsics.j(bVar, "<this>");
        Intrinsics.j(quadrilateralMapper, "quadrilateralMapper");
        Intrinsics.j(minSize, "minSize");
        return new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e(container, jVarA, barcodePickElementsCache, rectangularWithIcons, new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.i(quadrilateralMapper, minSize));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.l lVar, BarcodePickViewHighlightStyle.RectangularWithIcons rectangularWithIcons, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.c cVar, BarcodePickViewSettings barcodePickViewSettings, com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.j jVar) {
        super(1);
        this.f123752a = lVar;
        this.f123753b = rectangularWithIcons;
        this.f123754c = cVar;
        this.f123755d = barcodePickViewSettings;
        this.f123756e = jVar;
    }
}
