package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.scandit.datacapture.barcode.batch.data.TrackedObject;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.j;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.h;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickElementsCache;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.i;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconStyle;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import com.scandit.datacapture.core.internal.sdk.ui.icon.ScanditIconUtilsKt;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import com.scandit.datacapture.core.ui.icon.ScanditIcon;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f123652a;

    /* renamed from: b, reason: collision with root package name */
    public final j f123653b;

    /* renamed from: c, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.j f123654c;

    /* renamed from: d, reason: collision with root package name */
    public BarcodePickViewHighlightStyle f123655d;

    /* renamed from: e, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.c f123656e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f123657f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f123658g;

    /* renamed from: h, reason: collision with root package name */
    public h f123659h;

    /* renamed from: i, reason: collision with root package name */
    public Function1 f123660i;

    /* renamed from: j, reason: collision with root package name */
    public Function2 f123661j;

    public static final boolean a(e eVar, View view) {
        eVar.getClass();
        return view.getY() >= 0.0f && eVar.f123658g;
    }

    public e(FrameLayout container, j styleBehaviour, BarcodePickElementsCache cache, BarcodePickViewHighlightStyle highlightStyle, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.c drawDataFactory) {
        Intrinsics.j(container, "container");
        Intrinsics.j(styleBehaviour, "styleBehaviour");
        Intrinsics.j(cache, "cache");
        Intrinsics.j(highlightStyle, "highlightStyle");
        Intrinsics.j(drawDataFactory, "drawDataFactory");
        this.f123652a = container;
        this.f123653b = styleBehaviour;
        this.f123654c = cache;
        this.f123655d = highlightStyle;
        this.f123656e = drawDataFactory;
        this.f123657f = false;
    }

    public final void a(TrackedObject track, BarcodePickState pickState) {
        Intrinsics.j(track, "track");
        Intrinsics.j(pickState, "pickState");
        h hVar = this.f123659h;
        BarcodePickState barcodePickState = hVar != null ? hVar.f123683l : null;
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.a aVarA = this.f123656e.a(track, pickState, barcodePickState);
        i iVarA = this.f123654c.a(track.getData(), pickState, barcodePickState);
        if (iVarA == null) {
            h hVar2 = this.f123659h;
            if (hVar2 != null) {
                a(hVar2, aVarA);
                return;
            }
            return;
        }
        BarcodePickStatusIconStyle barcodePickStatusIconStyleA = iVarA.a();
        if (barcodePickStatusIconStyleA == null && this.f123659h != null) {
            a();
            return;
        }
        if (barcodePickStatusIconStyleA != null && this.f123659h == null) {
            a(track, barcodePickStatusIconStyleA, aVarA);
            return;
        }
        h hVar3 = this.f123659h;
        if (hVar3 != null) {
            a(hVar3, aVarA);
        }
    }

    public final void a(TrackedObject trackedObject, BarcodePickStatusIconStyle style, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.a initialDrawData) {
        FrameLayout container = this.f123652a;
        a layoutRefresher = new a(this);
        Intrinsics.j(container, "container");
        Intrinsics.j(initialDrawData, "initialDrawData");
        Intrinsics.j(layoutRefresher, "layoutRefresher");
        h hVar = new h(container, initialDrawData, layoutRefresher);
        Intrinsics.j(style, "style");
        if (style instanceof BarcodePickStatusIconStyle.BarcodePickStatusIconStyleWithIcon) {
            BarcodePickStatusIconStyle.BarcodePickStatusIconStyleWithIcon barcodePickStatusIconStyleWithIcon = (BarcodePickStatusIconStyle.BarcodePickStatusIconStyleWithIcon) style;
            hVar.a(barcodePickStatusIconStyleWithIcon.getText());
            hVar.f123678g.setImageBitmap(barcodePickStatusIconStyleWithIcon.getIcon());
        } else if (style instanceof BarcodePickStatusIconStyle.BarcodePickStatusIconStyleWithColors) {
            BarcodePickStatusIconStyle.BarcodePickStatusIconStyleWithColors barcodePickStatusIconStyleWithColors = (BarcodePickStatusIconStyle.BarcodePickStatusIconStyleWithColors) style;
            hVar.a(barcodePickStatusIconStyleWithColors.getText());
            int iconBackgroundColor = barcodePickStatusIconStyleWithColors.getIconBackgroundColor();
            int iconColor = barcodePickStatusIconStyleWithColors.getIconColor();
            ImageView imageView = hVar.f123677f;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(iconBackgroundColor, mode);
            hVar.f123678g.setColorFilter(iconColor, mode);
        } else if (style instanceof BarcodePickStatusIconStyle.BarcodePickStatusIconStyleWithScanditIcon) {
            BarcodePickStatusIconStyle.BarcodePickStatusIconStyleWithScanditIcon barcodePickStatusIconStyleWithScanditIcon = (BarcodePickStatusIconStyle.BarcodePickStatusIconStyleWithScanditIcon) style;
            hVar.a(barcodePickStatusIconStyleWithScanditIcon.getText());
            ScanditIcon icon = barcodePickStatusIconStyleWithScanditIcon.getIcon();
            ImageView imageView2 = hVar.f123678g;
            Context context = imageView2.getContext();
            Intrinsics.i(context, "getContext(...)");
            imageView2.setImageDrawable(ScanditIconUtilsKt.getDrawable(icon, context));
        }
        this.f123652a.addView(hVar.f123673b, new ViewGroup.LayoutParams(-2, -2));
        a(hVar, initialDrawData);
        this.f123659h = hVar;
        Function2 function2 = this.f123661j;
        if (function2 != null) {
            Intrinsics.j(function2, "<set-?>");
            hVar.f123684m = function2;
        }
        hVar.f123685n = new b(this, trackedObject);
    }

    public final void a(com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.c cVar, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.a drawData) {
        h hVar = (h) cVar;
        hVar.getClass();
        Intrinsics.j(drawData, "drawData");
        BarcodePickState barcodePickState = hVar.f123682k.f123636c;
        if (barcodePickState != drawData.f123636c) {
            hVar.f123683l = barcodePickState;
        }
        hVar.f123682k = drawData;
        View view = hVar.f123673b;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        view.setVisibility(!(viewGroup != null && viewGroup.getWidth() > 0) ? 8 : 0);
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.a aVarB = this.f123653b.b(cVar, drawData);
        hVar.a(aVarB.f123618b, aVarB.f123617a);
        boolean z10 = aVarB.f123619c;
        int i10 = aVarB.f123620d;
        hVar.f123676e.setVisibility(z10 ? 0 : 8);
        if (z10) {
            ImageView imageView = hVar.f123676e;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            Intrinsics.h(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = PixelExtensionsKt.pxFromDp$default(-1, (Context) null, 1, (Object) null);
            marginLayoutParams.leftMargin = i10;
            imageView.setLayoutParams(marginLayoutParams);
        }
        int iA = this.f123653b.a(cVar, drawData);
        int i11 = (int) (iA * 0.14285715f);
        int i12 = iA - (i11 * 2);
        View view2 = hVar.f123675d;
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        Intrinsics.h(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.height = i12;
        marginLayoutParams2.width = i12;
        view2.setLayoutParams(marginLayoutParams2);
        View view3 = hVar.f123674c;
        ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
        layoutParams3.height = iA;
        view3.setLayoutParams(layoutParams3);
        hVar.f123674c.setPadding(i11, 0, i11, 0);
        hVar.f123679h.setTextSize(0, i12);
        hVar.f123680i = iA;
    }

    public final void a() {
        h hVar = this.f123659h;
        if (hVar != null) {
            this.f123652a.removeView(hVar.f123673b);
            hVar.a();
            Unit unit = Unit.f143329a;
        }
        this.f123659h = null;
    }
}
