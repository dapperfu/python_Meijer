package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13266q;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13266q implements InterfaceC13254k {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCountViewUiLayoutHelper f123009a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f123010b;

    /* renamed from: c, reason: collision with root package name */
    public String f123011c;

    /* renamed from: d, reason: collision with root package name */
    public Function0 f123012d;

    /* renamed from: e, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.count.ui.h f123013e;

    /* renamed from: f, reason: collision with root package name */
    public String f123014f;

    /* renamed from: g, reason: collision with root package name */
    public final z1 f123015g;

    public final void a(String value) {
        Intrinsics.j(value, "value");
        this.f123011c = value;
        com.scandit.datacapture.barcode.internal.module.count.ui.h hVar = this.f123013e;
        if (hVar == null) {
            return;
        }
        hVar.setContentDescription(value);
    }

    public C13266q(C13248h layoutHelper, RelativeLayout container) {
        Intrinsics.j(layoutHelper, "layoutHelper");
        Intrinsics.j(container, "container");
        this.f123009a = layoutHelper;
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        this.f123010b = barcodeCountViewDefaults.getShouldShowClearHighlightsButton();
        this.f123011c = barcodeCountViewDefaults.getListButtonContentDescription();
        this.f123012d = C13260n.f122990a;
        this.f123014f = barcodeCountViewDefaults.getClearHighlightsButtonText();
        this.f123015g = new z1(container);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void b() {
        this.f123015g.b(this.f123013e, new C13258m(this));
    }

    public final RelativeLayout.LayoutParams c() {
        Context context = ((RelativeLayout) this.f123015g.f123067a).getContext();
        Intrinsics.i(context, "getContext(...)");
        if (com.scandit.datacapture.barcode.internal.module.extensions.b.a(context)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(15);
            layoutParams.addRule(21);
            layoutParams.setMarginEnd(this.f123009a.j());
            return layoutParams;
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        layoutParams2.bottomMargin = this.f123009a.j();
        return layoutParams2;
    }

    public static final void a(C13266q this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        this$0.f123012d.invoke();
    }

    public final com.scandit.datacapture.barcode.internal.module.count.ui.h a(Context context) {
        com.scandit.datacapture.barcode.internal.module.count.ui.h hVar = new com.scandit.datacapture.barcode.internal.module.count.ui.h(context);
        hVar.setLayoutParams(c());
        com.scandit.datacapture.barcode.internal.module.count.ui.h hVar2 = this.f123013e;
        if (hVar2 != null) {
            Context context2 = ((RelativeLayout) this.f123015g.f123067a).getContext();
            Intrinsics.i(context2, "getContext(...)");
            hVar2.setRotation(com.scandit.datacapture.barcode.internal.module.extensions.b.a(context2) ? 270.0f : 0.0f);
        }
        hVar.setVisibility(4);
        hVar.setOnClickListener(new View.OnClickListener() { // from class: Pt.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C13266q.a(this.f27213a, view);
            }
        });
        hVar.f122552a.setText(this.f123014f);
        hVar.setContentDescription(this.f123011c);
        this.f123013e = hVar;
        return hVar;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void a() {
        com.scandit.datacapture.barcode.internal.module.count.ui.h hVar;
        com.scandit.datacapture.barcode.internal.module.count.ui.h hVar2 = this.f123013e;
        if (hVar2 != null) {
            hVar2.setVisibility(this.f123010b ? 0 : 4);
        }
        if (this.f123010b && (hVar = this.f123013e) != null) {
            Context context = ((RelativeLayout) this.f123015g.f123067a).getContext();
            Intrinsics.i(context, "getContext(...)");
            hVar.setRotation(com.scandit.datacapture.barcode.internal.module.extensions.b.a(context) ? 270.0f : 0.0f);
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.h hVar3 = this.f123013e;
        if (hVar3 != null) {
            hVar3.setLayoutParams(c());
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.h hVar4 = this.f123013e;
        if (hVar4 != null) {
            RelativeLayout.LayoutParams layoutParamsC = c();
            Context context2 = ((RelativeLayout) this.f123015g.f123067a).getContext();
            Intrinsics.i(context2, "getContext(...)");
            if (com.scandit.datacapture.barcode.internal.module.extensions.b.a(context2)) {
                layoutParamsC.setMarginEnd(layoutParamsC.getMarginEnd() - ((hVar4.getWidth() - hVar4.getHeight()) / 2));
            }
            hVar4.setLayoutParams(layoutParamsC);
        }
    }
}
