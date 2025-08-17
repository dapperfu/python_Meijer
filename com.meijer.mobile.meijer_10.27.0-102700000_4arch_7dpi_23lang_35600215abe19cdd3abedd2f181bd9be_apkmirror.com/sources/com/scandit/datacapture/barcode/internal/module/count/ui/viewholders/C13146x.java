package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13146x;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.x, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13146x implements r {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCountViewUiLayoutHelper f122097a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f122098b;

    /* renamed from: c, reason: collision with root package name */
    public Function0 f122099c;

    /* renamed from: d, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.ui.exitbutton.c f122100d;

    /* renamed from: e, reason: collision with root package name */
    public String f122101e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f122102f;

    /* renamed from: g, reason: collision with root package name */
    public final z1 f122103g;

    public final void a(String value) {
        Intrinsics.j(value, "value");
        com.scandit.datacapture.barcode.internal.module.ui.exitbutton.c cVar = this.f122100d;
        if (cVar == null) {
            return;
        }
        cVar.setContentDescription(value);
    }

    public C13146x(C13115h layoutHelper, RelativeLayout container) {
        Intrinsics.j(layoutHelper, "layoutHelper");
        Intrinsics.j(container, "container");
        this.f122097a = layoutHelper;
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        this.f122098b = barcodeCountViewDefaults.getShouldShowExitButton();
        barcodeCountViewDefaults.getExitButtonContentDescription();
        this.f122099c = C13140u.f122081a;
        this.f122101e = barcodeCountViewDefaults.getExitButtonText();
        this.f122102f = true;
        this.f122103g = new z1(container);
    }

    public static final void a(C13146x this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        this$0.f122099c.invoke();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c
    public final void b() {
        this.f122103g.b(this.f122100d, new C13138t(this));
    }

    public final RelativeLayout.LayoutParams c() {
        Context context = ((RelativeLayout) this.f122103g.f122115a).getContext();
        Intrinsics.i(context, "getContext(...)");
        if (com.scandit.datacapture.barcode.internal.module.extensions.b.a(context)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC13103b.f121963a, AbstractC13103b.f121964b);
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            layoutParams.topMargin = this.f122097a.g();
            layoutParams.setMarginEnd(this.f122097a.a());
            return layoutParams;
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(AbstractC13103b.f121963a, AbstractC13103b.f121964b);
        layoutParams2.addRule(11);
        layoutParams2.addRule(12);
        layoutParams2.setMarginEnd(this.f122097a.g());
        layoutParams2.bottomMargin = this.f122097a.a();
        return layoutParams2;
    }

    public final com.scandit.datacapture.barcode.internal.module.ui.exitbutton.c a(Context context) {
        com.scandit.datacapture.barcode.internal.module.ui.exitbutton.c cVar = new com.scandit.datacapture.barcode.internal.module.ui.exitbutton.c(context);
        cVar.setLayoutParams(c());
        cVar.setVisibility(4);
        cVar.setOnClickListener(new View.OnClickListener() { // from class: Pt.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C13146x.a(this.f29333a, view);
            }
        });
        String str = this.f122101e;
        if (str == null) {
            cVar.f123318b.setText(BarcodeCountViewDefaults.INSTANCE.getExitButtonText());
        } else {
            cVar.f123318b.setText(str);
        }
        cVar.setContentDescription(BarcodeCountViewDefaults.INSTANCE.getExitButtonContentDescription());
        if (this.f122102f) {
            cVar.f123317a.getBackground().setLevel(1);
        } else {
            cVar.f123317a.getBackground().setLevel(0);
        }
        this.f122100d = cVar;
        return cVar;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c
    public final void a() {
        com.scandit.datacapture.barcode.internal.module.ui.exitbutton.c cVar = this.f122100d;
        if (cVar != null) {
            cVar.setVisibility(this.f122098b ? 0 : 4);
        }
        com.scandit.datacapture.barcode.internal.module.ui.exitbutton.c cVar2 = this.f122100d;
        if (cVar2 != null) {
            cVar2.setLayoutParams(c());
        }
        com.scandit.datacapture.barcode.internal.module.ui.exitbutton.c cVar3 = this.f122100d;
        if (cVar3 == null) {
            return;
        }
        if (this.f122102f) {
            cVar3.f123317a.getBackground().setLevel(1);
        } else {
            cVar3.f123317a.getBackground().setLevel(0);
        }
    }
}
