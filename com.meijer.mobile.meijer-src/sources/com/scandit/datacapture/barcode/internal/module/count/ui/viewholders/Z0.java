package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class Z0 implements S0 {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCountViewUiLayoutHelper f122903a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f122904b;

    /* renamed from: c, reason: collision with root package name */
    public Function0 f122905c;

    /* renamed from: d, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.count.ui.q f122906d;

    /* renamed from: e, reason: collision with root package name */
    public final z1 f122907e;

    public final void a(String value) {
        Intrinsics.j(value, "value");
        com.scandit.datacapture.barcode.internal.module.count.ui.q qVar = this.f122906d;
        if (qVar == null) {
            return;
        }
        qVar.setContentDescription(value);
    }

    public Z0(C13248h layoutHelper, RelativeLayout container) {
        Intrinsics.j(layoutHelper, "layoutHelper");
        Intrinsics.j(container, "container");
        this.f122903a = layoutHelper;
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        this.f122904b = barcodeCountViewDefaults.getShouldShowExitButton();
        barcodeCountViewDefaults.getStatusModeButtonContentDescription();
        this.f122905c = W0.f122891a;
        this.f122907e = new z1(container);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void a() {
        com.scandit.datacapture.barcode.internal.module.count.ui.q qVar;
        com.scandit.datacapture.barcode.internal.module.count.ui.q qVar2 = this.f122906d;
        if (qVar2 != null) {
            qVar2.setVisibility(this.f122904b ? 0 : 4);
        }
        if (this.f122904b && (qVar = this.f122906d) != null) {
            qVar.setLayoutParams(c());
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.q qVar3 = this.f122906d;
        if (qVar3 == null) {
            return;
        }
        qVar3.setLayoutParams(c());
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void b() {
        this.f122907e.b(this.f122906d, new U0(this));
    }

    public final RelativeLayout.LayoutParams c() {
        Context context = ((RelativeLayout) this.f122907e.f123067a).getContext();
        Intrinsics.i(context, "getContext(...)");
        if (com.scandit.datacapture.barcode.internal.module.extensions.b.a(context)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(10);
            layoutParams.topMargin = this.f122903a.h();
            layoutParams.addRule(21);
            layoutParams.setMarginEnd(this.f122903a.j());
            return layoutParams;
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(21);
        layoutParams2.setMarginEnd(AbstractC13236b.f122919e);
        layoutParams2.addRule(12);
        layoutParams2.bottomMargin = this.f122903a.j();
        return layoutParams2;
    }
}
