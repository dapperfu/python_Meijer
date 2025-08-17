package com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow;

import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.r;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13115h;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.z1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes11.dex */
public final class r implements n {

    /* renamed from: e, reason: collision with root package name */
    public static final long f121741e;

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCountViewUiLayoutHelper f121742a;

    /* renamed from: b, reason: collision with root package name */
    public m f121743b;

    /* renamed from: c, reason: collision with root package name */
    public final z1 f121744c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f121745d;

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c
    public final void a() {
        int iB = this.f121742a.b();
        m mVar = this.f121743b;
        if (mVar != null) {
            mVar.a(this.f121742a.e(), iB);
        }
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        f121741e = DurationKt.s(4, DurationUnit.f147509e);
    }

    public r(FrameLayout container, C13115h layoutHelper) {
        Intrinsics.j(container, "container");
        Intrinsics.j(layoutHelper, "layoutHelper");
        this.f121742a = layoutHelper;
        this.f121744c = new z1(container);
        this.f121745d = new Runnable() { // from class: Mt.b
            @Override // java.lang.Runnable
            public final void run() {
                r.a(this.f21231a);
            }
        };
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c
    public final void b() {
        this.f121744c.b(this.f121743b, new q(this));
    }

    public static final void a(r this$0) {
        Intrinsics.j(this$0, "this$0");
        this$0.f121744c.a(this$0.f121743b, o.f121738a);
    }
}
