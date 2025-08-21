package com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow;

import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.r;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13248h;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.z1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes12.dex */
public final class r implements n {

    /* renamed from: e, reason: collision with root package name */
    public static final long f122693e;

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCountViewUiLayoutHelper f122694a;

    /* renamed from: b, reason: collision with root package name */
    public m f122695b;

    /* renamed from: c, reason: collision with root package name */
    public final z1 f122696c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f122697d;

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void a() {
        int iB = this.f122694a.b();
        m mVar = this.f122695b;
        if (mVar != null) {
            mVar.a(this.f122694a.e(), iB);
        }
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        f122693e = DurationKt.s(4, DurationUnit.f148417e);
    }

    public r(FrameLayout container, C13248h layoutHelper) {
        Intrinsics.j(container, "container");
        Intrinsics.j(layoutHelper, "layoutHelper");
        this.f122694a = layoutHelper;
        this.f122696c = new z1(container);
        this.f122697d = new Runnable() { // from class: Mt.b
            @Override // java.lang.Runnable
            public final void run() {
                r.a(this.f20430a);
            }
        };
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void b() {
        this.f122696c.b(this.f122695b, new q(this));
    }

    public static final void a(r this$0) {
        Intrinsics.j(this$0, "this$0");
        this$0.f122696c.a(this$0.f122695b, o.f122690a);
    }
}
