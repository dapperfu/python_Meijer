package com.scandit.datacapture.barcode.internal.module.ui.exitbutton;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class f implements ExitButtonWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d f124274a;

    /* renamed from: b, reason: collision with root package name */
    public Function0 f124275b;

    /* renamed from: c, reason: collision with root package name */
    public RelativeLayout f124276c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f124277d;

    @Override // com.scandit.datacapture.barcode.internal.module.ui.exitbutton.ExitButtonWrapper
    public final void a(ViewGroup viewGroup, d data) {
        RelativeLayout parent = (RelativeLayout) viewGroup;
        Intrinsics.j(parent, "parent");
        Intrinsics.j(data, "data");
        this.f124276c = parent;
        parent.addView((c) this.f124277d.getValue());
        c cVar = (c) this.f124277d.getValue();
        ((c) this.f124277d.getValue()).setVisibility(!data.f124271a ? 4 : 0);
        cVar.f124270b.setVisibility(8);
        cVar.f124269a.getBackground().setLevel(1);
        a();
    }

    public f(b factory, i positioner) {
        Intrinsics.j(factory, "factory");
        Intrinsics.j(positioner, "positioner");
        this.f124274a = positioner;
        this.f124277d = LazyKt.b(new e(factory, this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.exitbutton.ExitButtonWrapper
    public final void a(com.scandit.datacapture.barcode.pick.ui.c cVar) {
        this.f124275b = cVar;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.exitbutton.ExitButtonWrapper
    public final void a() {
        com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d dVar = this.f124274a;
        c cVar = (c) this.f124277d.getValue();
        RelativeLayout relativeLayout = this.f124276c;
        if (relativeLayout == null) {
            Intrinsics.x("parent");
            relativeLayout = null;
        }
        dVar.a(cVar, relativeLayout);
    }
}
