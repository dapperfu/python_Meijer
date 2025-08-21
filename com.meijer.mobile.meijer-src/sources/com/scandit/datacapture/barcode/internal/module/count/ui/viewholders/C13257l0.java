package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13257l0;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.l0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13257l0 implements InterfaceC13245f0 {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCountViewUiLayoutHelper f122981a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f122982b;

    /* renamed from: c, reason: collision with root package name */
    public Function0 f122983c;

    /* renamed from: d, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.count.ui.buttons.b f122984d;

    /* renamed from: e, reason: collision with root package name */
    public String f122985e;

    /* renamed from: f, reason: collision with root package name */
    public final z1 f122986f;

    public static final void a(C13257l0 this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        this$0.f122983c.invoke();
    }

    public C13257l0(C13248h layoutHelper, RelativeLayout container) {
        Intrinsics.j(layoutHelper, "layoutHelper");
        Intrinsics.j(container, "container");
        this.f122981a = layoutHelper;
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        barcodeCountViewDefaults.getExitButtonContentDescription();
        this.f122983c = C13251i0.f122972a;
        this.f122985e = barcodeCountViewDefaults.getRedoScanButtonText();
        this.f122986f = new z1(container);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void b() {
        this.f122986f.b(this.f122984d, new C13249h0(this));
    }

    public final RelativeLayout.LayoutParams c() {
        Context context = ((RelativeLayout) this.f122986f.f123067a).getContext();
        Intrinsics.i(context, "getContext(...)");
        if (com.scandit.datacapture.barcode.internal.module.extensions.b.a(context)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC13236b.f122915a, AbstractC13236b.f122917c);
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            layoutParams.bottomMargin = this.f122981a.g();
            layoutParams.setMarginEnd(this.f122981a.a());
            return layoutParams;
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(AbstractC13236b.f122915a, AbstractC13236b.f122917c);
        layoutParams2.addRule(9);
        layoutParams2.addRule(12);
        layoutParams2.setMarginStart(this.f122981a.g());
        layoutParams2.bottomMargin = this.f122981a.f();
        return layoutParams2;
    }

    public final com.scandit.datacapture.barcode.internal.module.count.ui.buttons.b a(Context context) {
        com.scandit.datacapture.barcode.internal.module.count.ui.buttons.b bVar = new com.scandit.datacapture.barcode.internal.module.count.ui.buttons.b(context);
        bVar.setLayoutParams(c());
        bVar.setVisibility(4);
        bVar.setOnClickListener(new View.OnClickListener() { // from class: Pt.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C13257l0.a(this.f27212a, view);
            }
        });
        String str = this.f122985e;
        if (str == null) {
            bVar.f122459a.setText(BarcodeCountViewDefaults.INSTANCE.getRedoScanButtonText());
        } else {
            bVar.f122459a.setText(str);
        }
        bVar.setContentDescription(BarcodeCountViewDefaults.INSTANCE.getExitButtonContentDescription());
        this.f122984d = bVar;
        return bVar;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void a() {
        com.scandit.datacapture.barcode.internal.module.count.ui.buttons.b bVar = this.f122984d;
        if (bVar != null) {
            bVar.setVisibility(this.f122982b ? 0 : 4);
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.buttons.b bVar2 = this.f122984d;
        if (bVar2 == null) {
            return;
        }
        bVar2.setLayoutParams(c());
    }
}
