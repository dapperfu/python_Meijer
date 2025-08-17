package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13110e0;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.e0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13110e0 implements Y {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCountViewUiLayoutHelper f121983a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f121984b;

    /* renamed from: c, reason: collision with root package name */
    public Function0 f121985c;

    /* renamed from: d, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.count.ui.buttons.a f121986d;

    /* renamed from: e, reason: collision with root package name */
    public String f121987e;

    /* renamed from: f, reason: collision with root package name */
    public final z1 f121988f;

    public static final void a(C13110e0 this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        this$0.f121985c.invoke();
    }

    public C13110e0(C13115h layoutHelper, RelativeLayout container) {
        Intrinsics.j(layoutHelper, "layoutHelper");
        Intrinsics.j(container, "container");
        this.f121983a = layoutHelper;
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        barcodeCountViewDefaults.getExitButtonContentDescription();
        this.f121985c = C13104b0.f121975a;
        this.f121987e = barcodeCountViewDefaults.getNextButtonText();
        this.f121988f = new z1(container);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c
    public final void b() {
        this.f121988f.b(this.f121986d, new C13102a0(this));
    }

    public final RelativeLayout.LayoutParams c() {
        Context context = ((RelativeLayout) this.f121988f.f122115a).getContext();
        Intrinsics.i(context, "getContext(...)");
        if (com.scandit.datacapture.barcode.internal.module.extensions.b.a(context)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC13103b.f121963a, AbstractC13103b.f121964b);
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            layoutParams.topMargin = this.f121983a.g();
            layoutParams.setMarginEnd(this.f121983a.a());
            return layoutParams;
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(AbstractC13103b.f121963a, AbstractC13103b.f121964b);
        layoutParams2.addRule(11);
        layoutParams2.addRule(12);
        layoutParams2.setMarginEnd(this.f121983a.g());
        layoutParams2.bottomMargin = this.f121983a.a();
        return layoutParams2;
    }

    public final com.scandit.datacapture.barcode.internal.module.count.ui.buttons.a a(Context context) {
        com.scandit.datacapture.barcode.internal.module.count.ui.buttons.a aVar = new com.scandit.datacapture.barcode.internal.module.count.ui.buttons.a(context);
        aVar.setLayoutParams(c());
        aVar.setVisibility(4);
        aVar.setOnClickListener(new View.OnClickListener() { // from class: Pt.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C13110e0.a(this.f29329a, view);
            }
        });
        String str = this.f121987e;
        if (str == null) {
            aVar.f121506a.setText(BarcodeCountViewDefaults.INSTANCE.getNextButtonText());
        } else {
            aVar.f121506a.setText(str);
        }
        aVar.setContentDescription(BarcodeCountViewDefaults.INSTANCE.getExitButtonContentDescription());
        this.f121986d = aVar;
        return aVar;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c
    public final void a() {
        com.scandit.datacapture.barcode.internal.module.count.ui.buttons.a aVar = this.f121986d;
        if (aVar != null) {
            aVar.setVisibility(this.f121984b ? 0 : 4);
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.buttons.a aVar2 = this.f121986d;
        if (aVar2 == null) {
            return;
        }
        aVar2.setLayoutParams(c());
    }
}
