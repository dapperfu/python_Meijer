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

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f122700a;

    /* renamed from: b, reason: collision with root package name */
    public final j f122701b;

    /* renamed from: c, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.j f122702c;

    /* renamed from: d, reason: collision with root package name */
    public BarcodePickViewHighlightStyle f122703d;

    /* renamed from: e, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.c f122704e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f122705f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f122706g;

    /* renamed from: h, reason: collision with root package name */
    public h f122707h;

    /* renamed from: i, reason: collision with root package name */
    public Function1 f122708i;

    /* renamed from: j, reason: collision with root package name */
    public Function2 f122709j;

    public static final boolean a(e eVar, View view) {
        eVar.getClass();
        return view.getY() >= 0.0f && eVar.f122706g;
    }

    public e(FrameLayout container, j styleBehaviour, BarcodePickElementsCache cache, BarcodePickViewHighlightStyle highlightStyle, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.c drawDataFactory) {
        Intrinsics.j(container, "container");
        Intrinsics.j(styleBehaviour, "styleBehaviour");
        Intrinsics.j(cache, "cache");
        Intrinsics.j(highlightStyle, "highlightStyle");
        Intrinsics.j(drawDataFactory, "drawDataFactory");
        this.f122700a = container;
        this.f122701b = styleBehaviour;
        this.f122702c = cache;
        this.f122703d = highlightStyle;
        this.f122704e = drawDataFactory;
        this.f122705f = false;
    }

    public final void a(TrackedObject track, BarcodePickState pickState) {
        Intrinsics.j(track, "track");
        Intrinsics.j(pickState, "pickState");
        h hVar = this.f122707h;
        BarcodePickState barcodePickState = hVar != null ? hVar.f122731l : null;
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.a aVarA = this.f122704e.a(track, pickState, barcodePickState);
        i iVarA = this.f122702c.a(track.getData(), pickState, barcodePickState);
        if (iVarA == null) {
            h hVar2 = this.f122707h;
            if (hVar2 != null) {
                a(hVar2, aVarA);
                return;
            }
            return;
        }
        BarcodePickStatusIconStyle barcodePickStatusIconStyleA = iVarA.a();
        if (barcodePickStatusIconStyleA == null && this.f122707h != null) {
            a();
            return;
        }
        if (barcodePickStatusIconStyleA != null && this.f122707h == null) {
            a(track, barcodePickStatusIconStyleA, aVarA);
            return;
        }
        h hVar3 = this.f122707h;
        if (hVar3 != null) {
            a(hVar3, aVarA);
        }
    }

    public final void a(TrackedObject trackedObject, BarcodePickStatusIconStyle style, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.a initialDrawData) {
        FrameLayout container = this.f122700a;
        a layoutRefresher = new a(this);
        Intrinsics.j(container, "container");
        Intrinsics.j(initialDrawData, "initialDrawData");
        Intrinsics.j(layoutRefresher, "layoutRefresher");
        h hVar = new h(container, initialDrawData, layoutRefresher);
        Intrinsics.j(style, "style");
        if (style instanceof BarcodePickStatusIconStyle.BarcodePickStatusIconStyleWithIcon) {
            BarcodePickStatusIconStyle.BarcodePickStatusIconStyleWithIcon barcodePickStatusIconStyleWithIcon = (BarcodePickStatusIconStyle.BarcodePickStatusIconStyleWithIcon) style;
            hVar.a(barcodePickStatusIconStyleWithIcon.getText());
            hVar.f122726g.setImageBitmap(barcodePickStatusIconStyleWithIcon.getIcon());
        } else if (style instanceof BarcodePickStatusIconStyle.BarcodePickStatusIconStyleWithColors) {
            BarcodePickStatusIconStyle.BarcodePickStatusIconStyleWithColors barcodePickStatusIconStyleWithColors = (BarcodePickStatusIconStyle.BarcodePickStatusIconStyleWithColors) style;
            hVar.a(barcodePickStatusIconStyleWithColors.getText());
            int iconBackgroundColor = barcodePickStatusIconStyleWithColors.getIconBackgroundColor();
            int iconColor = barcodePickStatusIconStyleWithColors.getIconColor();
            ImageView imageView = hVar.f122725f;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(iconBackgroundColor, mode);
            hVar.f122726g.setColorFilter(iconColor, mode);
        } else if (style instanceof BarcodePickStatusIconStyle.BarcodePickStatusIconStyleWithScanditIcon) {
            BarcodePickStatusIconStyle.BarcodePickStatusIconStyleWithScanditIcon barcodePickStatusIconStyleWithScanditIcon = (BarcodePickStatusIconStyle.BarcodePickStatusIconStyleWithScanditIcon) style;
            hVar.a(barcodePickStatusIconStyleWithScanditIcon.getText());
            ScanditIcon icon = barcodePickStatusIconStyleWithScanditIcon.getIcon();
            ImageView imageView2 = hVar.f122726g;
            Context context = imageView2.getContext();
            Intrinsics.i(context, "getContext(...)");
            imageView2.setImageDrawable(ScanditIconUtilsKt.getDrawable(icon, context));
        }
        this.f122700a.addView(hVar.f122721b, new ViewGroup.LayoutParams(-2, -2));
        a(hVar, initialDrawData);
        this.f122707h = hVar;
        Function2 function2 = this.f122709j;
        if (function2 != null) {
            Intrinsics.j(function2, "<set-?>");
            hVar.f122732m = function2;
        }
        hVar.f122733n = new b(this, trackedObject);
    }

    public final void a(com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.c cVar, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.a drawData) {
        h hVar = (h) cVar;
        hVar.getClass();
        Intrinsics.j(drawData, "drawData");
        BarcodePickState barcodePickState = hVar.f122730k.f122684c;
        if (barcodePickState != drawData.f122684c) {
            hVar.f122731l = barcodePickState;
        }
        hVar.f122730k = drawData;
        View view = hVar.f122721b;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        view.setVisibility(!(viewGroup != null && viewGroup.getWidth() > 0) ? 8 : 0);
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.a aVarB = this.f122701b.b(cVar, drawData);
        hVar.a(aVarB.f122666b, aVarB.f122665a);
        boolean z10 = aVarB.f122667c;
        int i10 = aVarB.f122668d;
        hVar.f122724e.setVisibility(z10 ? 0 : 8);
        if (z10) {
            ImageView imageView = hVar.f122724e;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            Intrinsics.h(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = PixelExtensionsKt.pxFromDp$default(-1, (Context) null, 1, (Object) null);
            marginLayoutParams.leftMargin = i10;
            imageView.setLayoutParams(marginLayoutParams);
        }
        int iA = this.f122701b.a(cVar, drawData);
        int i11 = (int) (iA * 0.14285715f);
        int i12 = iA - (i11 * 2);
        View view2 = hVar.f122723d;
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        Intrinsics.h(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.height = i12;
        marginLayoutParams2.width = i12;
        view2.setLayoutParams(marginLayoutParams2);
        View view3 = hVar.f122722c;
        ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
        layoutParams3.height = iA;
        view3.setLayoutParams(layoutParams3);
        hVar.f122722c.setPadding(i11, 0, i11, 0);
        hVar.f122727h.setTextSize(0, i12);
        hVar.f122728i = iA;
    }

    public final void a() {
        h hVar = this.f122707h;
        if (hVar != null) {
            this.f122700a.removeView(hVar.f122721b);
            hVar.a();
            Unit unit = Unit.f142422a;
        }
        this.f122707h = null;
    }
}
