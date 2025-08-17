package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class Z0 implements S0 {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCountViewUiLayoutHelper f121951a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f121952b;

    /* renamed from: c, reason: collision with root package name */
    public Function0 f121953c;

    /* renamed from: d, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.count.ui.q f121954d;

    /* renamed from: e, reason: collision with root package name */
    public final z1 f121955e;

    public final void a(String value) {
        Intrinsics.j(value, "value");
        com.scandit.datacapture.barcode.internal.module.count.ui.q qVar = this.f121954d;
        if (qVar == null) {
            return;
        }
        qVar.setContentDescription(value);
    }

    public Z0(C13115h layoutHelper, RelativeLayout container) {
        Intrinsics.j(layoutHelper, "layoutHelper");
        Intrinsics.j(container, "container");
        this.f121951a = layoutHelper;
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        this.f121952b = barcodeCountViewDefaults.getShouldShowExitButton();
        barcodeCountViewDefaults.getStatusModeButtonContentDescription();
        this.f121953c = W0.f121939a;
        this.f121955e = new z1(container);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c
    public final void a() {
        com.scandit.datacapture.barcode.internal.module.count.ui.q qVar;
        com.scandit.datacapture.barcode.internal.module.count.ui.q qVar2 = this.f121954d;
        if (qVar2 != null) {
            qVar2.setVisibility(this.f121952b ? 0 : 4);
        }
        if (this.f121952b && (qVar = this.f121954d) != null) {
            qVar.setLayoutParams(c());
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.q qVar3 = this.f121954d;
        if (qVar3 == null) {
            return;
        }
        qVar3.setLayoutParams(c());
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c
    public final void b() {
        this.f121955e.b(this.f121954d, new U0(this));
    }

    public final RelativeLayout.LayoutParams c() {
        Context context = ((RelativeLayout) this.f121955e.f122115a).getContext();
        Intrinsics.i(context, "getContext(...)");
        if (com.scandit.datacapture.barcode.internal.module.extensions.b.a(context)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(10);
            layoutParams.topMargin = this.f121951a.h();
            layoutParams.addRule(21);
            layoutParams.setMarginEnd(this.f121951a.j());
            return layoutParams;
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(21);
        layoutParams2.setMarginEnd(AbstractC13103b.f121967e);
        layoutParams2.addRule(12);
        layoutParams2.bottomMargin = this.f121951a.j();
        return layoutParams2;
    }
}
