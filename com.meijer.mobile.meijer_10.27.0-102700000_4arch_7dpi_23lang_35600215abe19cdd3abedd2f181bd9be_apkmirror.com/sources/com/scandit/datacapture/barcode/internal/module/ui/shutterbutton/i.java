package com.scandit.datacapture.barcode.internal.module.ui.shutterbutton;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.pick.ui.C13266b;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class i implements ShutterButtonWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final a f123418a;

    /* renamed from: b, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d f123419b;

    /* renamed from: c, reason: collision with root package name */
    public Function0 f123420c;

    /* renamed from: d, reason: collision with root package name */
    public RelativeLayout f123421d;

    /* renamed from: e, reason: collision with root package name */
    public final Lazy f123422e;

    @Override // com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper
    public final void a(ViewGroup viewGroup, g data) {
        RelativeLayout parent = (RelativeLayout) viewGroup;
        Intrinsics.j(parent, "parent");
        Intrinsics.j(data, "data");
        this.f123421d = parent;
        parent.addView((f) this.f123422e.getValue());
        Intrinsics.j(data, "data");
        ((f) this.f123422e.getValue()).setVisibility(!data.f123416a ? 4 : 0);
        a();
    }

    public i(b shutterButtonFactory, com.scandit.datacapture.barcode.internal.module.pick.ui.shutterbutton.d positioner) {
        Intrinsics.j(shutterButtonFactory, "shutterButtonFactory");
        Intrinsics.j(positioner, "positioner");
        this.f123418a = shutterButtonFactory;
        this.f123419b = positioner;
        this.f123422e = LazyKt.b(new h(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper
    public final void b() {
        ((f) this.f123422e.getValue()).getForeground().setLevel(1);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper
    public final void c() {
        ((f) this.f123422e.getValue()).getForeground().setLevel(0);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper
    public final void d() {
        ((f) this.f123422e.getValue()).f123415a.stop();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper
    public final void a(C13266b c13266b) {
        this.f123420c = c13266b;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper
    public final void a() {
        com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d dVar = this.f123419b;
        f fVar = (f) this.f123422e.getValue();
        RelativeLayout relativeLayout = this.f123421d;
        if (relativeLayout == null) {
            Intrinsics.y("parent");
            relativeLayout = null;
        }
        dVar.a(fVar, relativeLayout);
    }
}
