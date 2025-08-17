package com.scandit.datacapture.barcode.internal.module.ui.exitbutton;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class f implements ExitButtonWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d f123322a;

    /* renamed from: b, reason: collision with root package name */
    public Function0 f123323b;

    /* renamed from: c, reason: collision with root package name */
    public RelativeLayout f123324c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f123325d;

    @Override // com.scandit.datacapture.barcode.internal.module.ui.exitbutton.ExitButtonWrapper
    public final void a(ViewGroup viewGroup, d data) {
        RelativeLayout parent = (RelativeLayout) viewGroup;
        Intrinsics.j(parent, "parent");
        Intrinsics.j(data, "data");
        this.f123324c = parent;
        parent.addView((c) this.f123325d.getValue());
        c cVar = (c) this.f123325d.getValue();
        ((c) this.f123325d.getValue()).setVisibility(!data.f123319a ? 4 : 0);
        cVar.f123318b.setVisibility(8);
        cVar.f123317a.getBackground().setLevel(1);
        a();
    }

    public f(b factory, i positioner) {
        Intrinsics.j(factory, "factory");
        Intrinsics.j(positioner, "positioner");
        this.f123322a = positioner;
        this.f123325d = LazyKt.b(new e(factory, this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.exitbutton.ExitButtonWrapper
    public final void a(com.scandit.datacapture.barcode.pick.ui.c cVar) {
        this.f123323b = cVar;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.exitbutton.ExitButtonWrapper
    public final void a() {
        com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d dVar = this.f123322a;
        c cVar = (c) this.f123325d.getValue();
        RelativeLayout relativeLayout = this.f123324c;
        if (relativeLayout == null) {
            Intrinsics.y("parent");
            relativeLayout = null;
        }
        dVar.a(cVar, relativeLayout);
    }
}
