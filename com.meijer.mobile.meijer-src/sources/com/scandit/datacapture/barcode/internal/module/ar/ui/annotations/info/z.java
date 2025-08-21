package com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.info;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.ar.ui.BarcodeArViewDefaults;
import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArBodyElementDataHolder;
import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArHeaderFooterElementDataHolder;
import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArInfoAnnotationDataHolder;
import com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationAnchor;
import com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.info.z;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.extensions.ViewExtensionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class z extends FrameLayout {

    /* renamed from: q, reason: collision with root package name */
    public static final Lazy f122067q = LazyKt.b(t.f122062a);

    /* renamed from: r, reason: collision with root package name */
    public static final Lazy f122068r = LazyKt.b(s.f122061a);

    /* renamed from: s, reason: collision with root package name */
    public static final Lazy f122069s = LazyKt.b(r.f122060a);

    /* renamed from: t, reason: collision with root package name */
    public static final Lazy f122070t = LazyKt.b(q.f122059a);

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f122071a;

    /* renamed from: b, reason: collision with root package name */
    public final a f122072b;

    /* renamed from: c, reason: collision with root package name */
    public final k f122073c;

    /* renamed from: d, reason: collision with root package name */
    public final k f122074d;

    /* renamed from: e, reason: collision with root package name */
    public final RelativeLayout f122075e;

    /* renamed from: f, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.tip.a f122076f;

    /* renamed from: g, reason: collision with root package name */
    public c f122077g;

    /* renamed from: h, reason: collision with root package name */
    public final FrameLayout f122078h;

    /* renamed from: i, reason: collision with root package name */
    public p f122079i;

    /* renamed from: j, reason: collision with root package name */
    public final FrameLayout f122080j;

    /* renamed from: k, reason: collision with root package name */
    public p f122081k;

    /* renamed from: l, reason: collision with root package name */
    public final FrameLayout f122082l;

    /* renamed from: m, reason: collision with root package name */
    public Quadrilateral f122083m;

    /* renamed from: n, reason: collision with root package name */
    public BarcodeArInfoAnnotationAnchor f122084n;

    /* renamed from: o, reason: collision with root package name */
    public Size2 f122085o;

    /* renamed from: p, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.b f122086p;

    public final void a(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (z13) {
            final BarcodeArInfoAnnotationDataHolder barcodeArInfoAnnotationDataHolder = (BarcodeArInfoAnnotationDataHolder) this.f122071a.invoke();
            setContentDescription(getResources().getString(R.string.sc_barcode_ar_annotation_info_content_description, barcodeArInfoAnnotationDataHolder.getBarcodeData()));
            if (barcodeArInfoAnnotationDataHolder.isEntireAnnotationTappable()) {
                setImportantForAccessibility(1);
                ViewExtensionsKt.addRippleForeground(this.f122075e);
                this.f122075e.setOnClickListener(new View.OnClickListener() { // from class: Gt.d
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        z.a(barcodeArInfoAnnotationDataHolder, view);
                    }
                });
            }
            getLayoutParams().width = (((Number) f122070t.getValue()).intValue() * 2) + barcodeArInfoAnnotationDataHolder.getWidth().toPixels$scandit_barcode_capture();
            this.f122075e.setOutlineProvider(new y(barcodeArInfoAnnotationDataHolder));
            com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.tip.a aVar = this.f122076f;
            int tipColor = barcodeArInfoAnnotationDataHolder.getTipColor();
            boolean hasTip = barcodeArInfoAnnotationDataHolder.getHasTip();
            aVar.getClass();
            aVar.setVisibility(!hasTip ? 8 : 0);
            aVar.setColorFilter(tipColor, PorterDuff.Mode.SRC_IN);
            this.f122075e.setClickable(barcodeArInfoAnnotationDataHolder.isEntireAnnotationTappable());
        }
        if (z10) {
            a();
        }
        if (z11) {
            c();
        }
        if (z12) {
            b();
        }
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context, com.scandit.datacapture.barcode.ar.ui.annotations.b commonDataFactory, b bodyElementFactory, l headerElementFactory, l footerElementFactory) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(commonDataFactory, "commonDataFactory");
        Intrinsics.j(bodyElementFactory, "bodyElementFactory");
        Intrinsics.j(headerElementFactory, "headerElementFactory");
        Intrinsics.j(footerElementFactory, "footerElementFactory");
        this.f122071a = commonDataFactory;
        this.f122072b = bodyElementFactory;
        this.f122073c = headerElementFactory;
        this.f122074d = footerElementFactory;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.sc_ar_info_annotation_view_container);
        relativeLayout.setClipChildren(true);
        relativeLayout.setClipToOutline(true);
        this.f122075e = relativeLayout;
        com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.tip.a aVar = new com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.tip.a(context);
        this.f122076f = aVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.sc_ar_info_annotation_body_container);
        this.f122078h = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.sc_ar_info_annotation_header_container);
        this.f122080j = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.sc_ar_info_annotation_footer_container);
        this.f122082l = frameLayout3;
        this.f122084n = BarcodeArViewDefaults.getDefaultInfoAnnotationAnchor();
        v referenceQuadGetter = new v(this);
        w anchorGetter = new w(this);
        x sizeGetter = new x(this);
        Intrinsics.j(com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.c.f124379a, "<this>");
        Intrinsics.j(referenceQuadGetter, "referenceQuadGetter");
        Intrinsics.j(anchorGetter, "anchorGetter");
        Intrinsics.j(sizeGetter, "sizeGetter");
        this.f122086p = new com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.b(referenceQuadGetter, anchorGetter, sizeGetter);
        setImportantForAccessibility(2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        Lazy lazy = f122070t;
        int iIntValue = ((Number) lazy.getValue()).intValue();
        Lazy lazy2 = f122069s;
        layoutParams.setMargins(iIntValue, ((Number) lazy2.getValue()).intValue(), ((Number) lazy.getValue()).intValue(), ((Number) lazy2.getValue()).intValue());
        Unit unit = Unit.f143329a;
        addView(relativeLayout, layoutParams);
        relativeLayout.addView(frameLayout2, new RelativeLayout.LayoutParams(-1, -2));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, frameLayout2.getId());
        relativeLayout.addView(frameLayout, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(3, frameLayout.getId());
        relativeLayout.addView(frameLayout3, layoutParams3);
        addView(aVar, new FrameLayout.LayoutParams(((Number) f122067q.getValue()).intValue(), ((Number) f122068r.getValue()).intValue()));
        a();
        c();
        b();
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    public final void b() {
        p headerFooterView = this.f122081k;
        if (headerFooterView == null) {
            l lVar = (l) this.f122074d;
            lVar.getClass();
            p pVar = new p(lVar.f122052a);
            pVar.setId(R.id.sc_ar_info_annotation_footer);
            this.f122081k = pVar;
            this.f122082l.addView(pVar);
            headerFooterView = pVar;
        }
        l lVar2 = (l) this.f122074d;
        lVar2.getClass();
        Intrinsics.j(headerFooterView, "headerFooterView");
        headerFooterView.a((BarcodeArHeaderFooterElementDataHolder) lVar2.f122053b.invoke());
    }

    public final void c() {
        p headerFooterView = this.f122079i;
        if (headerFooterView == null) {
            l lVar = (l) this.f122073c;
            lVar.getClass();
            p pVar = new p(lVar.f122052a);
            pVar.setId(R.id.sc_ar_info_annotation_header);
            this.f122079i = pVar;
            this.f122080j.addView(pVar);
            headerFooterView = pVar;
        }
        l lVar2 = (l) this.f122073c;
        lVar2.getClass();
        Intrinsics.j(headerFooterView, "headerFooterView");
        headerFooterView.a((BarcodeArHeaderFooterElementDataHolder) lVar2.f122053b.invoke());
    }

    public static final void a(BarcodeArInfoAnnotationDataHolder data, View view) {
        Intrinsics.j(data, "$data");
        data.getAnnotationTapped().invoke();
    }

    public final void a() {
        c view = this.f122077g;
        if (view == null) {
            b bVar = (b) this.f122072b;
            bVar.getClass();
            c cVar = new c(bVar.f122036a);
            this.f122077g = cVar;
            this.f122078h.addView(cVar);
            view = cVar;
        }
        b bVar2 = (b) this.f122072b;
        bVar2.getClass();
        Intrinsics.j(view, "view");
        view.a((BarcodeArBodyElementDataHolder) bVar2.f122037b.invoke());
    }
}
