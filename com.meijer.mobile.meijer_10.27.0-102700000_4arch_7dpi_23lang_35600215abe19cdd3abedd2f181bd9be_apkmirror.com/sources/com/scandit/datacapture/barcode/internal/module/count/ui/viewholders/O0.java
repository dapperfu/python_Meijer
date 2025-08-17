package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.O0;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class O0 implements K0 {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCountViewUiLayoutHelper f121914a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f121915b;

    /* renamed from: c, reason: collision with root package name */
    public String f121916c;

    /* renamed from: d, reason: collision with root package name */
    public Function0 f121917d;

    /* renamed from: e, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.count.ui.p f121918e;

    /* renamed from: f, reason: collision with root package name */
    public final z1 f121919f;

    public final void a(String value) {
        Intrinsics.j(value, "value");
        this.f121916c = value;
        com.scandit.datacapture.barcode.internal.module.count.ui.p pVar = this.f121918e;
        if (pVar == null) {
            return;
        }
        pVar.setContentDescription(value);
    }

    public O0(C13115h layoutHelper, RelativeLayout container) {
        Intrinsics.j(layoutHelper, "layoutHelper");
        Intrinsics.j(container, "container");
        this.f121914a = layoutHelper;
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        this.f121915b = barcodeCountViewDefaults.getShouldShowExitButton();
        this.f121916c = barcodeCountViewDefaults.getSingleScanButtonContentDescription();
        this.f121917d = N0.f121913a;
        this.f121919f = new z1(container);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c
    public final void b() {
        this.f121919f.b(this.f121918e, new M0(this));
    }

    public final RelativeLayout.LayoutParams c() {
        Context context = ((RelativeLayout) this.f121919f.f122115a).getContext();
        Intrinsics.i(context, "getContext(...)");
        if (com.scandit.datacapture.barcode.internal.module.extensions.b.a(context)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(12);
            layoutParams.bottomMargin = this.f121914a.h();
            layoutParams.addRule(21);
            layoutParams.setMarginEnd(this.f121914a.j());
            return layoutParams;
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(20);
        layoutParams2.setMarginStart(AbstractC13103b.f121967e);
        layoutParams2.addRule(12);
        layoutParams2.bottomMargin = this.f121914a.j();
        return layoutParams2;
    }

    public static final void a(O0 this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        this$0.f121917d.invoke();
    }

    public final com.scandit.datacapture.barcode.internal.module.count.ui.p a(Context context) {
        com.scandit.datacapture.barcode.internal.module.count.ui.p pVar = new com.scandit.datacapture.barcode.internal.module.count.ui.p(context);
        pVar.setLayoutParams(c());
        pVar.setVisibility(4);
        pVar.setOnClickListener(new View.OnClickListener() { // from class: Pt.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                O0.a(this.f29328a, view);
            }
        });
        pVar.setContentDescription(this.f121916c);
        pVar.setId(AbstractC13103b.f121973k);
        this.f121918e = pVar;
        return pVar;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c
    public final void a() {
        com.scandit.datacapture.barcode.internal.module.count.ui.p pVar;
        com.scandit.datacapture.barcode.internal.module.count.ui.p pVar2 = this.f121918e;
        if (pVar2 != null) {
            pVar2.setVisibility(this.f121915b ? 0 : 4);
        }
        if (this.f121915b && (pVar = this.f121918e) != null) {
            pVar.setLayoutParams(c());
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.p pVar3 = this.f121918e;
        if (pVar3 == null) {
            return;
        }
        pVar3.setLayoutParams(c());
    }
}
