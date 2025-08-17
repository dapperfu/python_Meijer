package com.scandit.datacapture.barcode.internal.module.count.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class g implements BarcodeCountViewLayerManager {

    /* renamed from: a, reason: collision with root package name */
    public final Context f121583a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f121584b;

    /* renamed from: c, reason: collision with root package name */
    public final RelativeLayout f121585c;

    /* renamed from: d, reason: collision with root package name */
    public final RelativeLayout f121586d;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f121587e;

    /* renamed from: f, reason: collision with root package name */
    public final FrameLayout f121588f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f121589g;

    /* renamed from: h, reason: collision with root package name */
    public final FrameLayout f121590h;

    /* renamed from: i, reason: collision with root package name */
    public final FrameLayout f121591i;

    /* renamed from: j, reason: collision with root package name */
    public final FrameLayout f121592j;

    /* renamed from: k, reason: collision with root package name */
    public final FrameLayout f121593k;

    /* renamed from: l, reason: collision with root package name */
    public final FrameLayout f121594l;

    /* renamed from: m, reason: collision with root package name */
    public final HintHolderV2 f121595m;

    /* renamed from: n, reason: collision with root package name */
    public final View f121596n;

    /* renamed from: o, reason: collision with root package name */
    public final List f121597o;

    /* renamed from: p, reason: collision with root package name */
    public final FrameLayout.LayoutParams f121598p;

    /* renamed from: q, reason: collision with root package name */
    public final RelativeLayout.LayoutParams f121599q;

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager
    public final FrameLayout a() {
        return this.f121591i;
    }

    public g(Context context) {
        Intrinsics.j(context, "context");
        this.f121583a = context;
        this.f121584b = new FrameLayout(context);
        this.f121585c = new RelativeLayout(context);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f121586d = relativeLayout;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f121587e = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f121588f = frameLayout2;
        this.f121589g = new FrameLayout(context);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f121590h = frameLayout3;
        this.f121591i = new FrameLayout(context);
        this.f121592j = new FrameLayout(context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f121593k = frameLayout4;
        this.f121594l = new FrameLayout(context);
        HintHolderV2 hintHolderV2Implementation = HintHolderV2.INSTANCE.implementation(context);
        this.f121595m = hintHolderV2Implementation;
        View viewAsView = hintHolderV2Implementation.asView();
        this.f121596n = viewAsView;
        this.f121597o = CollectionsKt.p(frameLayout, relativeLayout, frameLayout2, frameLayout3, frameLayout4, viewAsView);
        this.f121598p = new FrameLayout.LayoutParams(-1, -1);
        this.f121599q = new RelativeLayout.LayoutParams(-1, -1);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager
    public final void a(FrameLayout overlay) {
        Intrinsics.j(overlay, "overlay");
        overlay.addView(this.f121591i, this.f121598p);
        overlay.addView(this.f121592j, this.f121598p);
        overlay.addView(this.f121584b, this.f121598p);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager
    public final FrameLayout b() {
        return this.f121593k;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager
    public final FrameLayout c() {
        return this.f121589g;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager
    public final FrameLayout d() {
        return this.f121584b;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager
    public final Context e() {
        return this.f121583a;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager
    public final RelativeLayout f() {
        return this.f121585c;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager
    public final FrameLayout g() {
        return this.f121592j;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager
    public final FrameLayout h() {
        return this.f121594l;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager
    public final HintHolderV2 i() {
        return this.f121595m;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager
    public final void a(RelativeLayout container) {
        Intrinsics.j(container, "container");
        container.addView(this.f121596n, this.f121599q);
        container.addView(this.f121587e, this.f121599q);
        container.addView(this.f121585c, this.f121599q);
        container.addView(this.f121589g, this.f121599q);
        container.addView(this.f121586d, this.f121599q);
        container.addView(this.f121588f, this.f121599q);
        container.addView(this.f121590h, this.f121599q);
        container.addView(this.f121594l, this.f121599q);
        container.addView(this.f121593k, this.f121599q);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager
    public final void a(RelativeLayout.LayoutParams floatLayerLayoutParams) {
        Intrinsics.j(floatLayerLayoutParams, "floatLayerLayoutParams");
        Iterator it = this.f121597o.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setLayoutParams(floatLayerLayoutParams);
        }
    }
}
