package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class y1 implements s1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f123062a;

    /* renamed from: b, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.ui.l f123063b;

    /* renamed from: c, reason: collision with root package name */
    public final z1 f123064c;

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void a() {
    }

    public y1(FrameLayout container) {
        Intrinsics.j(container, "container");
        this.f123062a = BarcodeCountViewDefaults.INSTANCE.getShouldShowUserGuidanceView();
        this.f123064c = new z1(container);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void b() {
        this.f123064c.b(this.f123063b, new u1(this));
    }
}
