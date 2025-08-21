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

/* loaded from: classes12.dex */
public final class g implements BarcodeCountViewLayerManager {

    /* renamed from: a, reason: collision with root package name */
    public final Context f122535a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f122536b;

    /* renamed from: c, reason: collision with root package name */
    public final RelativeLayout f122537c;

    /* renamed from: d, reason: collision with root package name */
    public final RelativeLayout f122538d;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f122539e;

    /* renamed from: f, reason: collision with root package name */
    public final FrameLayout f122540f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f122541g;

    /* renamed from: h, reason: collision with root package name */
    public final FrameLayout f122542h;

    /* renamed from: i, reason: collision with root package name */
    public final FrameLayout f122543i;

    /* renamed from: j, reason: collision with root package name */
    public final FrameLayout f122544j;

    /* renamed from: k, reason: collision with root package name */
    public final FrameLayout f122545k;

    /* renamed from: l, reason: collision with root package name */
    public final FrameLayout f122546l;

    /* renamed from: m, reason: collision with root package name */
    public final HintHolderV2 f122547m;

    /* renamed from: n, reason: collision with root package name */
    public final View f122548n;

    /* renamed from: o, reason: collision with root package name */
    public final List f122549o;

    /* renamed from: p, reason: collision with root package name */
    public final FrameLayout.LayoutParams f122550p;

    /* renamed from: q, reason: collision with root package name */
    public final RelativeLayout.LayoutParams f122551q;

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager
    public final FrameLayout a() {
        return this.f122543i;
    }

    public g(Context context) {
        Intrinsics.j(context, "context");
        this.f122535a = context;
        this.f122536b = new FrameLayout(context);
        this.f122537c = new RelativeLayout(context);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f122538d = relativeLayout;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f122539e = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f122540f = frameLayout2;
        this.f122541g = new FrameLayout(context);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f122542h = frameLayout3;
        this.f122543i = new FrameLayout(context);
        this.f122544j = new FrameLayout(context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f122545k = frameLayout4;
        this.f122546l = new FrameLayout(context);
        HintHolderV2 hintHolderV2Implementation = HintHolderV2.INSTANCE.implementation(context);
        this.f122547m = hintHolderV2Implementation;
        View viewAsView = hintHolderV2Implementation.asView();
        this.f122548n = viewAsView;
        this.f122549o = CollectionsKt.p(frameLayout, relativeLayout, frameLayout2, frameLayout3, frameLayout4, viewAsView);
        this.f122550p = new FrameLayout.LayoutParams(-1, -1);
        this.f122551q = new RelativeLayout.LayoutParams(-1, -1);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager
    public final void a(FrameLayout overlay) {
        Intrinsics.j(overlay, "overlay");
        overlay.addView(this.f122543i, this.f122550p);
        overlay.addView(this.f122544j, this.f122550p);
        overlay.addView(this.f122536b, this.f122550p);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager
    public final FrameLayout b() {
        return this.f122545k;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager
    public final FrameLayout c() {
        return this.f122541g;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager
    public final FrameLayout d() {
        return this.f122536b;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager
    public final Context e() {
        return this.f122535a;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager
    public final RelativeLayout f() {
        return this.f122537c;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager
    public final FrameLayout g() {
        return this.f122544j;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager
    public final FrameLayout h() {
        return this.f122546l;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager
    public final HintHolderV2 i() {
        return this.f122547m;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager
    public final void a(RelativeLayout container) {
        Intrinsics.j(container, "container");
        container.addView(this.f122548n, this.f122551q);
        container.addView(this.f122539e, this.f122551q);
        container.addView(this.f122537c, this.f122551q);
        container.addView(this.f122541g, this.f122551q);
        container.addView(this.f122538d, this.f122551q);
        container.addView(this.f122540f, this.f122551q);
        container.addView(this.f122542h, this.f122551q);
        container.addView(this.f122546l, this.f122551q);
        container.addView(this.f122545k, this.f122551q);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager
    public final void a(RelativeLayout.LayoutParams floatLayerLayoutParams) {
        Intrinsics.j(floatLayerLayoutParams, "floatLayerLayoutParams");
        Iterator it = this.f122549o.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setLayoutParams(floatLayerLayoutParams);
        }
    }
}
