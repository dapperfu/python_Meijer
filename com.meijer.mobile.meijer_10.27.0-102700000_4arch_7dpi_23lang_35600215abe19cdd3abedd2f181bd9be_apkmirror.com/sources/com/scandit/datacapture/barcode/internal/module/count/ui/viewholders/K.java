package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class K implements G {

    /* renamed from: e, reason: collision with root package name */
    public static final int f121903e = PixelExtensionsKt.pxFromDp$default(16, (Context) null, 1, (Object) null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f121904f = PixelExtensionsKt.pxFromDp$default(80, (Context) null, 1, (Object) null);

    /* renamed from: a, reason: collision with root package name */
    public boolean f121905a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f121906b;

    /* renamed from: c, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.ui.d f121907c;

    /* renamed from: d, reason: collision with root package name */
    public final z1 f121908d;

    public K(FrameLayout container) {
        Intrinsics.j(container, "container");
        this.f121905a = BarcodeCountViewDefaults.INSTANCE.getShouldShowListProgressBar();
        this.f121908d = new z1(container);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c
    public final void a() {
        com.scandit.datacapture.barcode.internal.module.ui.d dVar;
        com.scandit.datacapture.barcode.internal.module.ui.d dVar2 = this.f121907c;
        if (dVar2 != null) {
            dVar2.setVisibility((this.f121906b && this.f121905a) ? 0 : 4);
        }
        if (this.f121906b && this.f121905a && (dVar = this.f121907c) != null) {
            dVar.setLayoutParams(c());
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c
    public final void b() {
        this.f121908d.b(this.f121907c, new I(this));
    }

    public final FrameLayout.LayoutParams c() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, PixelExtensionsKt.pxFromDp$default(48, (Context) null, 1, (Object) null), 48);
        Context context = ((FrameLayout) this.f121908d.f122115a).getContext();
        Intrinsics.i(context, "getContext(...)");
        int i10 = com.scandit.datacapture.barcode.internal.module.extensions.b.a(context) ? f121904f : f121903e;
        layoutParams.setMarginStart(i10);
        layoutParams.setMarginEnd(i10);
        return layoutParams;
    }
}
