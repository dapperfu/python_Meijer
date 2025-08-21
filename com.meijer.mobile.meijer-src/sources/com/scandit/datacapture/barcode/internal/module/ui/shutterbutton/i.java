package com.scandit.datacapture.barcode.internal.module.ui.shutterbutton;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.pick.ui.C13399b;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class i implements ShutterButtonWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final a f124370a;

    /* renamed from: b, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d f124371b;

    /* renamed from: c, reason: collision with root package name */
    public Function0 f124372c;

    /* renamed from: d, reason: collision with root package name */
    public RelativeLayout f124373d;

    /* renamed from: e, reason: collision with root package name */
    public final Lazy f124374e;

    @Override // com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper
    public final void a(ViewGroup viewGroup, g data) {
        RelativeLayout parent = (RelativeLayout) viewGroup;
        Intrinsics.j(parent, "parent");
        Intrinsics.j(data, "data");
        this.f124373d = parent;
        parent.addView((f) this.f124374e.getValue());
        Intrinsics.j(data, "data");
        ((f) this.f124374e.getValue()).setVisibility(!data.f124368a ? 4 : 0);
        a();
    }

    public i(b shutterButtonFactory, com.scandit.datacapture.barcode.internal.module.pick.ui.shutterbutton.d positioner) {
        Intrinsics.j(shutterButtonFactory, "shutterButtonFactory");
        Intrinsics.j(positioner, "positioner");
        this.f124370a = shutterButtonFactory;
        this.f124371b = positioner;
        this.f124374e = LazyKt.b(new h(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper
    public final void b() {
        ((f) this.f124374e.getValue()).getForeground().setLevel(1);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper
    public final void c() {
        ((f) this.f124374e.getValue()).getForeground().setLevel(0);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper
    public final void d() {
        ((f) this.f124374e.getValue()).f124367a.stop();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper
    public final void a(C13399b c13399b) {
        this.f124372c = c13399b;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper
    public final void a() {
        com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d dVar = this.f124371b;
        f fVar = (f) this.f124374e.getValue();
        RelativeLayout relativeLayout = this.f124373d;
        if (relativeLayout == null) {
            Intrinsics.x("parent");
            relativeLayout = null;
        }
        dVar.a(fVar, relativeLayout);
    }
}
