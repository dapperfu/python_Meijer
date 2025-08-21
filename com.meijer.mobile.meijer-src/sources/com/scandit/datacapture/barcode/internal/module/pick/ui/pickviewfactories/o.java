package com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories;

import android.content.Context;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.BarcodePickDataCaptureViewWrapper;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickElementsCache;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class o extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.k f123746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BarcodePickViewHighlightStyle.DotWithIcons f123747b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BarcodePickElementsCache f123748c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f123749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BarcodePickDataCaptureViewWrapper f123750e;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FrameLayout container = (FrameLayout) obj;
        Intrinsics.j(container, "container");
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.j jVarA = ((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.l) this.f123746a).a(this.f123747b);
        BarcodePickElementsCache barcodePickElementsCache = this.f123748c;
        Intrinsics.h(barcodePickElementsCache, "null cannot be cast to non-null type com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickStyleElementProvider<com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickStyleElement?>");
        BarcodePickViewHighlightStyle.DotWithIcons dotWithIcons = this.f123747b;
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.b bVar = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.b.f123637a;
        Context context = this.f123749d;
        Intrinsics.i(context, "$context");
        n quadrilateralMapper = new n((com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.j) this.f123750e);
        BarcodePickElementsCache elementsProvider = this.f123748c;
        BarcodePickViewHighlightStyle.DotWithIcons highlightStyle = this.f123747b;
        Intrinsics.j(bVar, "<this>");
        Intrinsics.j(context, "context");
        Intrinsics.j(quadrilateralMapper, "quadrilateralMapper");
        Intrinsics.j(elementsProvider, "elementsProvider");
        Intrinsics.j(highlightStyle, "highlightStyle");
        return new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e(container, jVarA, barcodePickElementsCache, dotWithIcons, new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.h(context, quadrilateralMapper, (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.c) elementsProvider, highlightStyle));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.l lVar, BarcodePickViewHighlightStyle.DotWithIcons dotWithIcons, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.c cVar, Context context, com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.j jVar) {
        super(1);
        this.f123746a = lVar;
        this.f123747b = dotWithIcons;
        this.f123748c = cVar;
        this.f123749d = context;
        this.f123750e = jVar;
    }
}
