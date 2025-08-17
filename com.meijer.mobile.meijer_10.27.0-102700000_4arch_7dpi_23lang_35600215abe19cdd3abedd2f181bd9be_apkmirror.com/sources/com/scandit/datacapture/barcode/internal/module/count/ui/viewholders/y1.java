package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class y1 implements s1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f122110a;

    /* renamed from: b, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.ui.l f122111b;

    /* renamed from: c, reason: collision with root package name */
    public final z1 f122112c;

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c
    public final void a() {
    }

    public y1(FrameLayout container) {
        Intrinsics.j(container, "container");
        this.f122110a = BarcodeCountViewDefaults.INSTANCE.getShouldShowUserGuidanceView();
        this.f122112c = new z1(container);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c
    public final void b() {
        this.f122112c.b(this.f122111b, new u1(this));
    }
}
