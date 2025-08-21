package com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.statusicon;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.ar.ui.BarcodeArViewDefaults;
import com.scandit.datacapture.barcode.ar.ui.annotations.statusicon.BarcodeArStatusIconAnnotationAnchor;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.common.geometry.Size2UtilsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class s extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.tip.a f122127a;

    /* renamed from: b, reason: collision with root package name */
    public final a f122128b;

    /* renamed from: c, reason: collision with root package name */
    public Quadrilateral f122129c;

    /* renamed from: d, reason: collision with root package name */
    public BarcodeArStatusIconAnnotationAnchor f122130d;

    /* renamed from: e, reason: collision with root package name */
    public Size2 f122131e;

    /* renamed from: f, reason: collision with root package name */
    public final n f122132f;

    public final boolean a(Quadrilateral quadrilateral, BarcodeArStatusIconAnnotationAnchor anchor) {
        Intrinsics.j(quadrilateral, "quadrilateral");
        Intrinsics.j(anchor, "anchor");
        if (getWidth() <= 0 || getHeight() <= 0) {
            return false;
        }
        ViewParent parent = getParent();
        FrameLayout frameLayout = parent instanceof FrameLayout ? (FrameLayout) parent : null;
        if (frameLayout == null) {
            return false;
        }
        this.f122130d = anchor;
        this.f122129c = quadrilateral;
        this.f122131e = Size2UtilsKt.Size2(getWidth(), getHeight());
        this.f122132f.a(this, frameLayout);
        com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.tip.c.a(this.f122127a, com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.b.a(anchor));
        com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.tip.c.b(this.f122127a, com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.b.a(anchor));
        com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.tip.a aVar = this.f122127a;
        Anchor anchor2 = com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.b.a(anchor);
        int i10 = R.id.sc_ar_status_icon_text_container;
        Intrinsics.j(aVar, "<this>");
        Intrinsics.j(anchor2, "anchor");
        ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
        Intrinsics.h(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        ViewExtensionsKt.removeAllRules(layoutParams2);
        int i11 = com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.tip.b.f122133a[anchor2.ordinal()];
        if (i11 == 1) {
            layoutParams2.addRule(10);
        } else if (i11 == 2) {
            layoutParams2.addRule(12);
        } else if (i11 == 3) {
            layoutParams2.addRule(15);
            layoutParams2.addRule(20);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("Unsupported anchor: " + anchor2);
            }
            layoutParams2.addRule(15);
            layoutParams2.addRule(1, i10);
        }
        aVar.setLayoutParams(layoutParams2);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, Barcode barcode) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(barcode, "barcode");
        com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.tip.a aVar = new com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.tip.a(context);
        this.f122127a = aVar;
        a aVar2 = new a(context, barcode);
        this.f122128b = aVar2;
        this.f122130d = BarcodeArViewDefaults.getDefaultStatusIconAnnotationAnchor();
        com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.c cVar = com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.c.f124379a;
        p referenceQuadGetter = new p(this);
        q anchorGetter = new q(this);
        r sizeGetter = new r(this);
        Intrinsics.j(cVar, "<this>");
        Intrinsics.j(referenceQuadGetter, "referenceQuadGetter");
        Intrinsics.j(anchorGetter, "anchorGetter");
        Intrinsics.j(sizeGetter, "sizeGetter");
        this.f122132f = new n(referenceQuadGetter, anchorGetter, sizeGetter);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        Unit unit = Unit.f143329a;
        addView(aVar2, layoutParams);
        addView(aVar, new RelativeLayout.LayoutParams(-2, -2));
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Quadrilateral quadrilateral = this.f122129c;
        if (quadrilateral != null) {
            a(quadrilateral, this.f122130d);
        }
    }

    public final void a(BarcodeArStatusIconAnnotationAnchor anchor, boolean z10) {
        Intrinsics.j(anchor, "anchor");
        a aVar = this.f122128b;
        aVar.getClass();
        Intrinsics.j(anchor, "anchor");
        if (anchor == BarcodeArStatusIconAnnotationAnchor.RIGHT) {
            aVar.removeAllViews();
            aVar.addView(aVar.f122096a);
            aVar.addView(aVar.f122097b);
            aVar.f122096a.setGravity(8388629);
        } else {
            aVar.removeAllViews();
            aVar.addView(aVar.f122097b);
            aVar.addView(aVar.f122096a);
            aVar.f122096a.setGravity(8388627);
        }
        ViewGroup.LayoutParams layoutParams = this.f122128b.getLayoutParams();
        Intrinsics.h(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.removeRule(1);
        layoutParams2.removeRule(20);
        if (z10) {
            float fIntValue = (((Number) l.f122116h.getValue()).intValue() - ((Number) l.f122115g.getValue()).intValue()) / 2.0f;
            int i10 = o.f122123a[anchor.ordinal()];
            if (i10 == 3) {
                layoutParams2.addRule(1, R.id.sc_ar_status_icon_tip);
                layoutParams2.leftMargin = (int) fIntValue;
            } else if (i10 == 4) {
                layoutParams2.addRule(20);
                layoutParams2.rightMargin = (int) fIntValue;
            }
            this.f122128b.setLayoutParams(layoutParams2);
        }
    }
}
