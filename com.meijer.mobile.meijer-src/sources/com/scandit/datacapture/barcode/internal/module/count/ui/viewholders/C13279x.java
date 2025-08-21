package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13279x;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.x, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13279x implements r {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCountViewUiLayoutHelper f123049a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f123050b;

    /* renamed from: c, reason: collision with root package name */
    public Function0 f123051c;

    /* renamed from: d, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.ui.exitbutton.c f123052d;

    /* renamed from: e, reason: collision with root package name */
    public String f123053e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f123054f;

    /* renamed from: g, reason: collision with root package name */
    public final z1 f123055g;

    public final void a(String value) {
        Intrinsics.j(value, "value");
        com.scandit.datacapture.barcode.internal.module.ui.exitbutton.c cVar = this.f123052d;
        if (cVar == null) {
            return;
        }
        cVar.setContentDescription(value);
    }

    public C13279x(C13248h layoutHelper, RelativeLayout container) {
        Intrinsics.j(layoutHelper, "layoutHelper");
        Intrinsics.j(container, "container");
        this.f123049a = layoutHelper;
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        this.f123050b = barcodeCountViewDefaults.getShouldShowExitButton();
        barcodeCountViewDefaults.getExitButtonContentDescription();
        this.f123051c = C13273u.f123033a;
        this.f123053e = barcodeCountViewDefaults.getExitButtonText();
        this.f123054f = true;
        this.f123055g = new z1(container);
    }

    public static final void a(C13279x this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        this$0.f123051c.invoke();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void b() {
        this.f123055g.b(this.f123052d, new C13271t(this));
    }

    public final RelativeLayout.LayoutParams c() {
        Context context = ((RelativeLayout) this.f123055g.f123067a).getContext();
        Intrinsics.i(context, "getContext(...)");
        if (com.scandit.datacapture.barcode.internal.module.extensions.b.a(context)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC13236b.f122915a, AbstractC13236b.f122916b);
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            layoutParams.topMargin = this.f123049a.g();
            layoutParams.setMarginEnd(this.f123049a.a());
            return layoutParams;
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(AbstractC13236b.f122915a, AbstractC13236b.f122916b);
        layoutParams2.addRule(11);
        layoutParams2.addRule(12);
        layoutParams2.setMarginEnd(this.f123049a.g());
        layoutParams2.bottomMargin = this.f123049a.a();
        return layoutParams2;
    }

    public final com.scandit.datacapture.barcode.internal.module.ui.exitbutton.c a(Context context) {
        com.scandit.datacapture.barcode.internal.module.ui.exitbutton.c cVar = new com.scandit.datacapture.barcode.internal.module.ui.exitbutton.c(context);
        cVar.setLayoutParams(c());
        cVar.setVisibility(4);
        cVar.setOnClickListener(new View.OnClickListener() { // from class: Pt.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C13279x.a(this.f27215a, view);
            }
        });
        String str = this.f123053e;
        if (str == null) {
            cVar.f124270b.setText(BarcodeCountViewDefaults.INSTANCE.getExitButtonText());
        } else {
            cVar.f124270b.setText(str);
        }
        cVar.setContentDescription(BarcodeCountViewDefaults.INSTANCE.getExitButtonContentDescription());
        if (this.f123054f) {
            cVar.f124269a.getBackground().setLevel(1);
        } else {
            cVar.f124269a.getBackground().setLevel(0);
        }
        this.f123052d = cVar;
        return cVar;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void a() {
        com.scandit.datacapture.barcode.internal.module.ui.exitbutton.c cVar = this.f123052d;
        if (cVar != null) {
            cVar.setVisibility(this.f123050b ? 0 : 4);
        }
        com.scandit.datacapture.barcode.internal.module.ui.exitbutton.c cVar2 = this.f123052d;
        if (cVar2 != null) {
            cVar2.setLayoutParams(c());
        }
        com.scandit.datacapture.barcode.internal.module.ui.exitbutton.c cVar3 = this.f123052d;
        if (cVar3 == null) {
            return;
        }
        if (this.f123054f) {
            cVar3.f124269a.getBackground().setLevel(1);
        } else {
            cVar3.f124269a.getBackground().setLevel(0);
        }
    }
}
