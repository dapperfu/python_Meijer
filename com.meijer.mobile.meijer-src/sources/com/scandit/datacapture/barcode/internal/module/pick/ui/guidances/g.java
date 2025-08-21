package com.scandit.datacapture.barcode.internal.module.pick.ui.guidances;

import android.content.Context;
import android.widget.FrameLayout;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class g extends FrameLayout implements BarcodePickGuidanceHandler {

    /* renamed from: a, reason: collision with root package name */
    public a f123487a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f123488b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f123489c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f123490d;

    /* renamed from: e, reason: collision with root package name */
    public final Lazy f123491e;

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
        this.f123487a = a.f123473a;
        this.f123488b = LazyKt.b(new d(loadingViewFactory));
        this.f123491e = LazyKt.b(new b(guidanceViewFactory));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.BarcodePickGuidanceHandler
    public final void a() {
        ViewExtensionsKt.runOnMainThread(this, new c(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.BarcodePickGuidanceHandler
    public final void b(boolean z10, String text) {
        Intrinsics.j(text, "text");
        a aVar = a.f123474b;
        if (z10) {
            this.f123487a = aVar;
        } else if (this.f123487a != aVar) {
            return;
        } else {
            this.f123487a = a.f123473a;
        }
        ViewExtensionsKt.runOnMainThread(this, new e(z10, this, text, false));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.BarcodePickGuidanceHandler
    public final void c(boolean z10, String text) {
        Intrinsics.j(text, "text");
        a aVar = a.f123476d;
        if (z10) {
            this.f123487a = aVar;
        } else if (this.f123487a != aVar) {
            return;
        } else {
            this.f123487a = a.f123473a;
        }
        ViewExtensionsKt.runOnMainThread(this, new e(z10, this, text, false));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.BarcodePickGuidanceHandler
    public final void a(boolean z10, String text) {
        Intrinsics.j(text, "text");
        a aVar = a.f123475c;
        if (z10) {
            this.f123487a = aVar;
        } else if (this.f123487a != aVar) {
            return;
        } else {
            this.f123487a = a.f123473a;
        }
        ViewExtensionsKt.runOnMainThread(this, new e(z10, this, text, true));
    }
}
