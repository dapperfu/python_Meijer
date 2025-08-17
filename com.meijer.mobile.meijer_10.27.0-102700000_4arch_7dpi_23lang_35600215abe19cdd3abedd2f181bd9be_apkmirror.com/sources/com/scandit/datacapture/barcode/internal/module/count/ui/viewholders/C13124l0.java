package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13124l0;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.l0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13124l0 implements InterfaceC13112f0 {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCountViewUiLayoutHelper f122029a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f122030b;

    /* renamed from: c, reason: collision with root package name */
    public Function0 f122031c;

    /* renamed from: d, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.count.ui.buttons.b f122032d;

    /* renamed from: e, reason: collision with root package name */
    public String f122033e;

    /* renamed from: f, reason: collision with root package name */
    public final z1 f122034f;

    public static final void a(C13124l0 this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        this$0.f122031c.invoke();
    }

    public C13124l0(C13115h layoutHelper, RelativeLayout container) {
        Intrinsics.j(layoutHelper, "layoutHelper");
        Intrinsics.j(container, "container");
        this.f122029a = layoutHelper;
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        barcodeCountViewDefaults.getExitButtonContentDescription();
        this.f122031c = C13118i0.f122020a;
        this.f122033e = barcodeCountViewDefaults.getRedoScanButtonText();
        this.f122034f = new z1(container);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c
    public final void b() {
        this.f122034f.b(this.f122032d, new C13116h0(this));
    }

    public final RelativeLayout.LayoutParams c() {
        Context context = ((RelativeLayout) this.f122034f.f122115a).getContext();
        Intrinsics.i(context, "getContext(...)");
        if (com.scandit.datacapture.barcode.internal.module.extensions.b.a(context)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC13103b.f121963a, AbstractC13103b.f121965c);
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            layoutParams.bottomMargin = this.f122029a.g();
            layoutParams.setMarginEnd(this.f122029a.a());
            return layoutParams;
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(AbstractC13103b.f121963a, AbstractC13103b.f121965c);
        layoutParams2.addRule(9);
        layoutParams2.addRule(12);
        layoutParams2.setMarginStart(this.f122029a.g());
        layoutParams2.bottomMargin = this.f122029a.f();
        return layoutParams2;
    }

    public final com.scandit.datacapture.barcode.internal.module.count.ui.buttons.b a(Context context) {
        com.scandit.datacapture.barcode.internal.module.count.ui.buttons.b bVar = new com.scandit.datacapture.barcode.internal.module.count.ui.buttons.b(context);
        bVar.setLayoutParams(c());
        bVar.setVisibility(4);
        bVar.setOnClickListener(new View.OnClickListener() { // from class: Pt.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C13124l0.a(this.f29330a, view);
            }
        });
        String str = this.f122033e;
        if (str == null) {
            bVar.f121507a.setText(BarcodeCountViewDefaults.INSTANCE.getRedoScanButtonText());
        } else {
            bVar.f121507a.setText(str);
        }
        bVar.setContentDescription(BarcodeCountViewDefaults.INSTANCE.getExitButtonContentDescription());
        this.f122032d = bVar;
        return bVar;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c
    public final void a() {
        com.scandit.datacapture.barcode.internal.module.count.ui.buttons.b bVar = this.f122032d;
        if (bVar != null) {
            bVar.setVisibility(this.f122030b ? 0 : 4);
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.buttons.b bVar2 = this.f122032d;
        if (bVar2 == null) {
            return;
        }
        bVar2.setLayoutParams(c());
    }
}
