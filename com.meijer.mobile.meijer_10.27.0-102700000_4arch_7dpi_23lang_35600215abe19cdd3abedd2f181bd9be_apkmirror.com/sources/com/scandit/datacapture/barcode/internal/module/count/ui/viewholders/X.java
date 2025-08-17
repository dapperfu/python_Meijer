package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class X implements O {

    /* renamed from: a, reason: collision with root package name */
    public boolean f121940a;

    /* renamed from: b, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.count.ui.l f121941b;

    /* renamed from: c, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.count.ui.l f121942c;

    /* renamed from: d, reason: collision with root package name */
    public final z1 f121943d;

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c
    public final void a() {
    }

    public X(FrameLayout container) {
        Intrinsics.j(container, "container");
        this.f121940a = BarcodeCountViewDefaults.INSTANCE.getShouldShowUserGuidanceView();
        this.f121943d = new z1(container);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c
    public final void b() {
        this.f121943d.b(this.f121941b, new T(this));
        this.f121943d.b(this.f121942c, new Q(this));
    }
}
