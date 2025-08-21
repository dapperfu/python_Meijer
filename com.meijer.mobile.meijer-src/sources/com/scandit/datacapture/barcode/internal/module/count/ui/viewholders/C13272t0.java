package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13272t0;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.t0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13272t0 implements InterfaceC13259m0 {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCountViewUiLayoutHelper f123025a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f123026b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f123027c;

    /* renamed from: d, reason: collision with root package name */
    public Function0 f123028d;

    /* renamed from: e, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.count.ui.buttons.c f123029e;

    /* renamed from: f, reason: collision with root package name */
    public String f123030f;

    /* renamed from: g, reason: collision with root package name */
    public final z1 f123031g;

    public static final void a(C13272t0 this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        this$0.f123028d.invoke();
    }

    public C13272t0(C13248h layoutHelper, RelativeLayout container) {
        Intrinsics.j(layoutHelper, "layoutHelper");
        Intrinsics.j(container, "container");
        this.f123025a = layoutHelper;
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        barcodeCountViewDefaults.getExitButtonContentDescription();
        this.f123028d = C13267q0.f123016a;
        this.f123030f = barcodeCountViewDefaults.getRestartButtonText();
        this.f123031g = new z1(container);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void b() {
        this.f123031g.b(this.f123029e, new C13263o0(this));
    }

    public final RelativeLayout.LayoutParams c() {
        Context context = ((RelativeLayout) this.f123031g.f123067a).getContext();
        Intrinsics.i(context, "getContext(...)");
        if (com.scandit.datacapture.barcode.internal.module.extensions.b.a(context)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC13236b.f122915a, AbstractC13236b.f122916b);
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            layoutParams.bottomMargin = this.f123025a.g();
            layoutParams.setMarginEnd(this.f123025a.a());
            return layoutParams;
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(AbstractC13236b.f122915a, AbstractC13236b.f122916b);
        layoutParams2.addRule(9);
        layoutParams2.addRule(12);
        layoutParams2.setMarginStart(this.f123025a.g());
        layoutParams2.bottomMargin = this.f123025a.a();
        return layoutParams2;
    }

    public final com.scandit.datacapture.barcode.internal.module.count.ui.buttons.c a(Context context) {
        com.scandit.datacapture.barcode.internal.module.count.ui.buttons.c cVar = new com.scandit.datacapture.barcode.internal.module.count.ui.buttons.c(context);
        cVar.setLayoutParams(c());
        cVar.setVisibility(4);
        cVar.setOnClickListener(new View.OnClickListener() { // from class: Pt.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C13272t0.a(this.f27214a, view);
            }
        });
        String str = this.f123030f;
        if (str == null) {
            cVar.f122461b.setText(BarcodeCountViewDefaults.INSTANCE.getRestartButtonText());
        } else {
            cVar.f122461b.setText(str);
        }
        cVar.setContentDescription(BarcodeCountViewDefaults.INSTANCE.getExitButtonContentDescription());
        this.f123029e = cVar;
        return cVar;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void a() {
        com.scandit.datacapture.barcode.internal.module.count.ui.buttons.c cVar = this.f123029e;
        if (cVar != null) {
            cVar.setVisibility(this.f123026b ? 0 : 4);
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.buttons.c cVar2 = this.f123029e;
        if (cVar2 != null) {
            cVar2.setEnabled(this.f123027c);
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.buttons.c cVar3 = this.f123029e;
        if (cVar3 == null) {
            return;
        }
        cVar3.setLayoutParams(c());
    }
}
