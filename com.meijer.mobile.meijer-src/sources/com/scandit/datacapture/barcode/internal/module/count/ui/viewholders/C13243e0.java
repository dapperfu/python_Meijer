package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13243e0;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.e0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13243e0 implements Y {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCountViewUiLayoutHelper f122935a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f122936b;

    /* renamed from: c, reason: collision with root package name */
    public Function0 f122937c;

    /* renamed from: d, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.count.ui.buttons.a f122938d;

    /* renamed from: e, reason: collision with root package name */
    public String f122939e;

    /* renamed from: f, reason: collision with root package name */
    public final z1 f122940f;

    public static final void a(C13243e0 this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        this$0.f122937c.invoke();
    }

    public C13243e0(C13248h layoutHelper, RelativeLayout container) {
        Intrinsics.j(layoutHelper, "layoutHelper");
        Intrinsics.j(container, "container");
        this.f122935a = layoutHelper;
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        barcodeCountViewDefaults.getExitButtonContentDescription();
        this.f122937c = C13237b0.f122927a;
        this.f122939e = barcodeCountViewDefaults.getNextButtonText();
        this.f122940f = new z1(container);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void b() {
        this.f122940f.b(this.f122938d, new C13235a0(this));
    }

    public final RelativeLayout.LayoutParams c() {
        Context context = ((RelativeLayout) this.f122940f.f123067a).getContext();
        Intrinsics.i(context, "getContext(...)");
        if (com.scandit.datacapture.barcode.internal.module.extensions.b.a(context)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC13236b.f122915a, AbstractC13236b.f122916b);
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            layoutParams.topMargin = this.f122935a.g();
            layoutParams.setMarginEnd(this.f122935a.a());
            return layoutParams;
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(AbstractC13236b.f122915a, AbstractC13236b.f122916b);
        layoutParams2.addRule(11);
        layoutParams2.addRule(12);
        layoutParams2.setMarginEnd(this.f122935a.g());
        layoutParams2.bottomMargin = this.f122935a.a();
        return layoutParams2;
    }

    public final com.scandit.datacapture.barcode.internal.module.count.ui.buttons.a a(Context context) {
        com.scandit.datacapture.barcode.internal.module.count.ui.buttons.a aVar = new com.scandit.datacapture.barcode.internal.module.count.ui.buttons.a(context);
        aVar.setLayoutParams(c());
        aVar.setVisibility(4);
        aVar.setOnClickListener(new View.OnClickListener() { // from class: Pt.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C13243e0.a(this.f27211a, view);
            }
        });
        String str = this.f122939e;
        if (str == null) {
            aVar.f122458a.setText(BarcodeCountViewDefaults.INSTANCE.getNextButtonText());
        } else {
            aVar.f122458a.setText(str);
        }
        aVar.setContentDescription(BarcodeCountViewDefaults.INSTANCE.getExitButtonContentDescription());
        this.f122938d = aVar;
        return aVar;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void a() {
        com.scandit.datacapture.barcode.internal.module.count.ui.buttons.a aVar = this.f122938d;
        if (aVar != null) {
            aVar.setVisibility(this.f122936b ? 0 : 4);
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.buttons.a aVar2 = this.f122938d;
        if (aVar2 == null) {
            return;
        }
        aVar2.setLayoutParams(c());
    }
}
