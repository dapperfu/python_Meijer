package com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow;

import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13248h;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.z1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class j implements f {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCountViewUiLayoutHelper f122681a;

    /* renamed from: b, reason: collision with root package name */
    public e f122682b;

    /* renamed from: c, reason: collision with root package name */
    public final z1 f122683c;

    public j(FrameLayout container, C13248h layoutHelper) {
        Intrinsics.j(container, "container");
        Intrinsics.j(layoutHelper, "layoutHelper");
        this.f122681a = layoutHelper;
        this.f122683c = new z1(container);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void a() {
        int iB = this.f122681a.b();
        e eVar = this.f122682b;
        if (eVar != null) {
            eVar.a(this.f122681a.e(), iB);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void b() {
        this.f122683c.b(this.f122682b, new i(this));
    }
}
