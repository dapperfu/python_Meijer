package com.scandit.datacapture.barcode.internal.module.find.ui;

import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.DataCaptureViewSizeListener;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class Z implements DataCaptureViewSizeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f123125a;

    public Z(u0 u0Var) {
        this.f123125a = u0Var;
    }

    public static final void a(u0 this$0) {
        Intrinsics.j(this$0, "this$0");
        this$0.f123243k.b();
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewSizeListener
    public final void onSizeChanged(DataCaptureView view, int i10, int i11, int i12) {
        Intrinsics.j(view, "view");
        final u0 u0Var = this.f123125a;
        u0Var.f123233a.post(new Runnable() { // from class: com.scandit.datacapture.barcode.internal.module.find.ui.z0
            @Override // java.lang.Runnable
            public final void run() {
                Z.a(u0Var);
            }
        });
    }
}
