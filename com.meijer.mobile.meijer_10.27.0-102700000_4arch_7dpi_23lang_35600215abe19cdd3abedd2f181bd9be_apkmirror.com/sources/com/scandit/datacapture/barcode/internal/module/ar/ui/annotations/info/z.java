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

/* loaded from: classes11.dex */
public final class z extends FrameLayout {

    /* renamed from: q, reason: collision with root package name */
    public static final Lazy f121115q = LazyKt.b(t.f121110a);

    /* renamed from: r, reason: collision with root package name */
    public static final Lazy f121116r = LazyKt.b(s.f121109a);

    /* renamed from: s, reason: collision with root package name */
    public static final Lazy f121117s = LazyKt.b(r.f121108a);

    /* renamed from: t, reason: collision with root package name */
    public static final Lazy f121118t = LazyKt.b(q.f121107a);

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f121119a;

    /* renamed from: b, reason: collision with root package name */
    public final a f121120b;

    /* renamed from: c, reason: collision with root package name */
    public final k f121121c;

    /* renamed from: d, reason: collision with root package name */
    public final k f121122d;

    /* renamed from: e, reason: collision with root package name */
    public final RelativeLayout f121123e;

    /* renamed from: f, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.tip.a f121124f;

    /* renamed from: g, reason: collision with root package name */
    public c f121125g;

    /* renamed from: h, reason: collision with root package name */
    public final FrameLayout f121126h;

    /* renamed from: i, reason: collision with root package name */
    public p f121127i;

    /* renamed from: j, reason: collision with root package name */
    public final FrameLayout f121128j;

    /* renamed from: k, reason: collision with root package name */
    public p f121129k;

    /* renamed from: l, reason: collision with root package name */
    public final FrameLayout f121130l;

    /* renamed from: m, reason: collision with root package name */
    public Quadrilateral f121131m;

    /* renamed from: n, reason: collision with root package name */
    public BarcodeArInfoAnnotationAnchor f121132n;

    /* renamed from: o, reason: collision with root package name */
    public Size2 f121133o;

    /* renamed from: p, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.b f121134p;

    public final void a(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (z13) {
            final BarcodeArInfoAnnotationDataHolder barcodeArInfoAnnotationDataHolder = (BarcodeArInfoAnnotationDataHolder) this.f121119a.invoke();
            setContentDescription(getResources().getString(R.string.sc_barcode_ar_annotation_info_content_description, barcodeArInfoAnnotationDataHolder.getBarcodeData()));
            if (barcodeArInfoAnnotationDataHolder.isEntireAnnotationTappable()) {
                setImportantForAccessibility(1);
                ViewExtensionsKt.addRippleForeground(this.f121123e);
                this.f121123e.setOnClickListener(new View.OnClickListener() { // from class: Gt.d
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        z.a(barcodeArInfoAnnotationDataHolder, view);
                    }
                });
            }
            getLayoutParams().width = (((Number) f121118t.getValue()).intValue() * 2) + barcodeArInfoAnnotationDataHolder.getWidth().toPixels$scandit_barcode_capture();
            this.f121123e.setOutlineProvider(new y(barcodeArInfoAnnotationDataHolder));
            com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.tip.a aVar = this.f121124f;
            int tipColor = barcodeArInfoAnnotationDataHolder.getTipColor();
            boolean hasTip = barcodeArInfoAnnotationDataHolder.getHasTip();
            aVar.getClass();
            aVar.setVisibility(!hasTip ? 8 : 0);
            aVar.setColorFilter(tipColor, PorterDuff.Mode.SRC_IN);
            this.f121123e.setClickable(barcodeArInfoAnnotationDataHolder.isEntireAnnotationTappable());
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
        this.f121119a = commonDataFactory;
        this.f121120b = bodyElementFactory;
        this.f121121c = headerElementFactory;
        this.f121122d = footerElementFactory;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.sc_ar_info_annotation_view_container);
        relativeLayout.setClipChildren(true);
        relativeLayout.setClipToOutline(true);
        this.f121123e = relativeLayout;
        com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.tip.a aVar = new com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.tip.a(context);
        this.f121124f = aVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.sc_ar_info_annotation_body_container);
        this.f121126h = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.sc_ar_info_annotation_header_container);
        this.f121128j = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.sc_ar_info_annotation_footer_container);
        this.f121130l = frameLayout3;
        this.f121132n = BarcodeArViewDefaults.getDefaultInfoAnnotationAnchor();
        v referenceQuadGetter = new v(this);
        w anchorGetter = new w(this);
        x sizeGetter = new x(this);
        Intrinsics.j(com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.c.f123427a, "<this>");
        Intrinsics.j(referenceQuadGetter, "referenceQuadGetter");
        Intrinsics.j(anchorGetter, "anchorGetter");
        Intrinsics.j(sizeGetter, "sizeGetter");
        this.f121134p = new com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.b(referenceQuadGetter, anchorGetter, sizeGetter);
        setImportantForAccessibility(2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        Lazy lazy = f121118t;
        int iIntValue = ((Number) lazy.getValue()).intValue();
        Lazy lazy2 = f121117s;
        layoutParams.setMargins(iIntValue, ((Number) lazy2.getValue()).intValue(), ((Number) lazy.getValue()).intValue(), ((Number) lazy2.getValue()).intValue());
        Unit unit = Unit.f142422a;
        addView(relativeLayout, layoutParams);
        relativeLayout.addView(frameLayout2, new RelativeLayout.LayoutParams(-1, -2));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, frameLayout2.getId());
        relativeLayout.addView(frameLayout, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(3, frameLayout.getId());
        relativeLayout.addView(frameLayout3, layoutParams3);
        addView(aVar, new FrameLayout.LayoutParams(((Number) f121115q.getValue()).intValue(), ((Number) f121116r.getValue()).intValue()));
        a();
        c();
        b();
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    public final void b() {
        p headerFooterView = this.f121129k;
        if (headerFooterView == null) {
            l lVar = (l) this.f121122d;
            lVar.getClass();
            p pVar = new p(lVar.f121100a);
            pVar.setId(R.id.sc_ar_info_annotation_footer);
            this.f121129k = pVar;
            this.f121130l.addView(pVar);
            headerFooterView = pVar;
        }
        l lVar2 = (l) this.f121122d;
        lVar2.getClass();
        Intrinsics.j(headerFooterView, "headerFooterView");
        headerFooterView.a((BarcodeArHeaderFooterElementDataHolder) lVar2.f121101b.invoke());
    }

    public final void c() {
        p headerFooterView = this.f121127i;
        if (headerFooterView == null) {
            l lVar = (l) this.f121121c;
            lVar.getClass();
            p pVar = new p(lVar.f121100a);
            pVar.setId(R.id.sc_ar_info_annotation_header);
            this.f121127i = pVar;
            this.f121128j.addView(pVar);
            headerFooterView = pVar;
        }
        l lVar2 = (l) this.f121121c;
        lVar2.getClass();
        Intrinsics.j(headerFooterView, "headerFooterView");
        headerFooterView.a((BarcodeArHeaderFooterElementDataHolder) lVar2.f121101b.invoke());
    }

    public static final void a(BarcodeArInfoAnnotationDataHolder data, View view) {
        Intrinsics.j(data, "$data");
        data.getAnnotationTapped().invoke();
    }

    public final void a() {
        c view = this.f121125g;
        if (view == null) {
            b bVar = (b) this.f121120b;
            bVar.getClass();
            c cVar = new c(bVar.f121084a);
            this.f121125g = cVar;
            this.f121126h.addView(cVar);
            view = cVar;
        }
        b bVar2 = (b) this.f121120b;
        bVar2.getClass();
        Intrinsics.j(view, "view");
        view.a((BarcodeArBodyElementDataHolder) bVar2.f121085b.invoke());
    }
}
