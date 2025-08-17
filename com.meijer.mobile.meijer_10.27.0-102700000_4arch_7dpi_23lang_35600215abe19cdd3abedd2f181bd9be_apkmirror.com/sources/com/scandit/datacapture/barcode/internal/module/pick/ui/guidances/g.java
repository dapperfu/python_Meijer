package com.scandit.datacapture.barcode.internal.module.pick.ui.guidances;

import android.content.Context;
import android.widget.FrameLayout;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class g extends FrameLayout implements BarcodePickGuidanceHandler {

    /* renamed from: a, reason: collision with root package name */
    public a f122535a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f122536b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f122537c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f122538d;

    /* renamed from: e, reason: collision with root package name */
    public final Lazy f122539e;

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.BarcodePickGuidanceHandler
    public final void a(boolean z10) {
        ViewExtensionsKt.runOnMainThread(this, new f(this, z10));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.BarcodePickGuidanceHandler
    public final g getView() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, com.scandit.datacapture.barcode.internal.module.pick.ui.f loadingViewFactory, k guidanceViewFactory) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(loadingViewFactory, "loadingViewFactory");
        Intrinsics.j(guidanceViewFactory, "guidanceViewFactory");
        this.f122535a = a.f122521a;
        this.f122536b = LazyKt.b(new d(loadingViewFactory));
        this.f122539e = LazyKt.b(new b(guidanceViewFactory));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.BarcodePickGuidanceHandler
    public final void a() {
        ViewExtensionsKt.runOnMainThread(this, new c(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.BarcodePickGuidanceHandler
    public final void b(boolean z10, String text) {
        Intrinsics.j(text, "text");
        a aVar = a.f122522b;
        if (z10) {
            this.f122535a = aVar;
        } else if (this.f122535a != aVar) {
            return;
        } else {
            this.f122535a = a.f122521a;
        }
        ViewExtensionsKt.runOnMainThread(this, new e(z10, this, text, false));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.BarcodePickGuidanceHandler
    public final void c(boolean z10, String text) {
        Intrinsics.j(text, "text");
        a aVar = a.f122524d;
        if (z10) {
            this.f122535a = aVar;
        } else if (this.f122535a != aVar) {
            return;
        } else {
            this.f122535a = a.f122521a;
        }
        ViewExtensionsKt.runOnMainThread(this, new e(z10, this, text, false));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.BarcodePickGuidanceHandler
    public final void a(boolean z10, String text) {
        Intrinsics.j(text, "text");
        a aVar = a.f122523c;
        if (z10) {
            this.f122535a = aVar;
        } else if (this.f122535a != aVar) {
            return;
        } else {
            this.f122535a = a.f122521a;
        }
        ViewExtensionsKt.runOnMainThread(this, new e(z10, this, text, true));
    }
}
