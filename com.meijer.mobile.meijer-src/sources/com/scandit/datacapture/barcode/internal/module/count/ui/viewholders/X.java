package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class X implements O {

    /* renamed from: a, reason: collision with root package name */
    public boolean f122892a;

    /* renamed from: b, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.count.ui.l f122893b;

    /* renamed from: c, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.count.ui.l f122894c;

    /* renamed from: d, reason: collision with root package name */
    public final z1 f122895d;

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void a() {
    }

    public X(FrameLayout container) {
        Intrinsics.j(container, "container");
        this.f122892a = BarcodeCountViewDefaults.INSTANCE.getShouldShowUserGuidanceView();
        this.f122895d = new z1(container);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void b() {
        this.f122895d.b(this.f122893b, new T(this));
        this.f122895d.b(this.f122894c, new Q(this));
    }
}
