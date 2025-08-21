package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class K implements G {

    /* renamed from: e, reason: collision with root package name */
    public static final int f122855e = PixelExtensionsKt.pxFromDp$default(16, (Context) null, 1, (Object) null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f122856f = PixelExtensionsKt.pxFromDp$default(80, (Context) null, 1, (Object) null);

    /* renamed from: a, reason: collision with root package name */
    public boolean f122857a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f122858b;

    /* renamed from: c, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.ui.d f122859c;

    /* renamed from: d, reason: collision with root package name */
    public final z1 f122860d;

    public K(FrameLayout container) {
        Intrinsics.j(container, "container");
        this.f122857a = BarcodeCountViewDefaults.INSTANCE.getShouldShowListProgressBar();
        this.f122860d = new z1(container);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void a() {
        com.scandit.datacapture.barcode.internal.module.ui.d dVar;
        com.scandit.datacapture.barcode.internal.module.ui.d dVar2 = this.f122859c;
        if (dVar2 != null) {
            dVar2.setVisibility((this.f122858b && this.f122857a) ? 0 : 4);
        }
        if (this.f122858b && this.f122857a && (dVar = this.f122859c) != null) {
            dVar.setLayoutParams(c());
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void b() {
        this.f122860d.b(this.f122859c, new I(this));
    }

    public final FrameLayout.LayoutParams c() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, PixelExtensionsKt.pxFromDp$default(48, (Context) null, 1, (Object) null), 48);
        Context context = ((FrameLayout) this.f122860d.f123067a).getContext();
        Intrinsics.i(context, "getContext(...)");
        int i10 = com.scandit.datacapture.barcode.internal.module.extensions.b.a(context) ? f122856f : f122855e;
        layoutParams.setMarginStart(i10);
        layoutParams.setMarginEnd(i10);
        return layoutParams;
    }
}
