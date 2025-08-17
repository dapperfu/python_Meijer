package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13133q;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13133q implements InterfaceC13121k {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCountViewUiLayoutHelper f122057a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f122058b;

    /* renamed from: c, reason: collision with root package name */
    public String f122059c;

    /* renamed from: d, reason: collision with root package name */
    public Function0 f122060d;

    /* renamed from: e, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.count.ui.h f122061e;

    /* renamed from: f, reason: collision with root package name */
    public String f122062f;

    /* renamed from: g, reason: collision with root package name */
    public final z1 f122063g;

    public final void a(String value) {
        Intrinsics.j(value, "value");
        this.f122059c = value;
        com.scandit.datacapture.barcode.internal.module.count.ui.h hVar = this.f122061e;
        if (hVar == null) {
            return;
        }
        hVar.setContentDescription(value);
    }

    public C13133q(C13115h layoutHelper, RelativeLayout container) {
        Intrinsics.j(layoutHelper, "layoutHelper");
        Intrinsics.j(container, "container");
        this.f122057a = layoutHelper;
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        this.f122058b = barcodeCountViewDefaults.getShouldShowClearHighlightsButton();
        this.f122059c = barcodeCountViewDefaults.getListButtonContentDescription();
        this.f122060d = C13127n.f122038a;
        this.f122062f = barcodeCountViewDefaults.getClearHighlightsButtonText();
        this.f122063g = new z1(container);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c
    public final void b() {
        this.f122063g.b(this.f122061e, new C13125m(this));
    }

    public final RelativeLayout.LayoutParams c() {
        Context context = ((RelativeLayout) this.f122063g.f122115a).getContext();
        Intrinsics.i(context, "getContext(...)");
        if (com.scandit.datacapture.barcode.internal.module.extensions.b.a(context)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(15);
            layoutParams.addRule(21);
            layoutParams.setMarginEnd(this.f122057a.j());
            return layoutParams;
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        layoutParams2.bottomMargin = this.f122057a.j();
        return layoutParams2;
    }

    public static final void a(C13133q this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        this$0.f122060d.invoke();
    }

    public final com.scandit.datacapture.barcode.internal.module.count.ui.h a(Context context) {
        com.scandit.datacapture.barcode.internal.module.count.ui.h hVar = new com.scandit.datacapture.barcode.internal.module.count.ui.h(context);
        hVar.setLayoutParams(c());
        com.scandit.datacapture.barcode.internal.module.count.ui.h hVar2 = this.f122061e;
        if (hVar2 != null) {
            Context context2 = ((RelativeLayout) this.f122063g.f122115a).getContext();
            Intrinsics.i(context2, "getContext(...)");
            hVar2.setRotation(com.scandit.datacapture.barcode.internal.module.extensions.b.a(context2) ? 270.0f : 0.0f);
        }
        hVar.setVisibility(4);
        hVar.setOnClickListener(new View.OnClickListener() { // from class: Pt.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C13133q.a(this.f29331a, view);
            }
        });
        hVar.f121600a.setText(this.f122062f);
        hVar.setContentDescription(this.f122059c);
        this.f122061e = hVar;
        return hVar;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c
    public final void a() {
        com.scandit.datacapture.barcode.internal.module.count.ui.h hVar;
        com.scandit.datacapture.barcode.internal.module.count.ui.h hVar2 = this.f122061e;
        if (hVar2 != null) {
            hVar2.setVisibility(this.f122058b ? 0 : 4);
        }
        if (this.f122058b && (hVar = this.f122061e) != null) {
            Context context = ((RelativeLayout) this.f122063g.f122115a).getContext();
            Intrinsics.i(context, "getContext(...)");
            hVar.setRotation(com.scandit.datacapture.barcode.internal.module.extensions.b.a(context) ? 270.0f : 0.0f);
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.h hVar3 = this.f122061e;
        if (hVar3 != null) {
            hVar3.setLayoutParams(c());
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.h hVar4 = this.f122061e;
        if (hVar4 != null) {
            RelativeLayout.LayoutParams layoutParamsC = c();
            Context context2 = ((RelativeLayout) this.f122063g.f122115a).getContext();
            Intrinsics.i(context2, "getContext(...)");
            if (com.scandit.datacapture.barcode.internal.module.extensions.b.a(context2)) {
                layoutParamsC.setMarginEnd(layoutParamsC.getMarginEnd() - ((hVar4.getWidth() - hVar4.getHeight()) / 2));
            }
            hVar4.setLayoutParams(layoutParamsC);
        }
    }
}
