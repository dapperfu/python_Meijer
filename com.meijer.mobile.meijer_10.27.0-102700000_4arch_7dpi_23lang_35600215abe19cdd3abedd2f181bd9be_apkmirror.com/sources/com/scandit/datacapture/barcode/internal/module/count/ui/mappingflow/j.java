package com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow;

import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13115h;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.z1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class j implements f {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCountViewUiLayoutHelper f121729a;

    /* renamed from: b, reason: collision with root package name */
    public e f121730b;

    /* renamed from: c, reason: collision with root package name */
    public final z1 f121731c;

    public j(FrameLayout container, C13115h layoutHelper) {
        Intrinsics.j(container, "container");
        Intrinsics.j(layoutHelper, "layoutHelper");
        this.f121729a = layoutHelper;
        this.f121731c = new z1(container);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c
    public final void a() {
        int iB = this.f121729a.b();
        e eVar = this.f121730b;
        if (eVar != null) {
            eVar.a(this.f121729a.e(), iB);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c
    public final void b() {
        this.f121731c.b(this.f121730b, new i(this));
    }
}
