package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.F;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class F implements A {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCountViewUiLayoutHelper f121868a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f121869b;

    /* renamed from: c, reason: collision with root package name */
    public Function0 f121870c;

    /* renamed from: d, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.count.ui.j f121871d;

    /* renamed from: e, reason: collision with root package name */
    public final z1 f121872e;

    public final void a(String value) {
        Intrinsics.j(value, "value");
        com.scandit.datacapture.barcode.internal.module.count.ui.j jVar = this.f121871d;
        if (jVar == null) {
            return;
        }
        jVar.setContentDescription(value);
    }

    public F(C13115h layoutHelper, RelativeLayout container) {
        Intrinsics.j(layoutHelper, "layoutHelper");
        Intrinsics.j(container, "container");
        this.f121868a = layoutHelper;
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        this.f121869b = barcodeCountViewDefaults.getShouldShowListButton();
        barcodeCountViewDefaults.getListButtonContentDescription();
        this.f121870c = D.f121860a;
        this.f121872e = new z1(container);
    }

    public static final void a(F this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        this$0.f121870c.invoke();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c
    public final void b() {
        this.f121872e.b(this.f121871d, new C(this));
    }

    public final RelativeLayout.LayoutParams c() {
        Context context = ((RelativeLayout) this.f121872e.f122115a).getContext();
        Intrinsics.i(context, "getContext(...)");
        if (com.scandit.datacapture.barcode.internal.module.extensions.b.a(context)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC13103b.f121963a, -2);
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            layoutParams.bottomMargin = this.f121868a.g();
            layoutParams.setMarginEnd(this.f121868a.a());
            return layoutParams;
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(AbstractC13103b.f121963a, AbstractC13103b.f121964b);
        layoutParams2.addRule(9);
        layoutParams2.addRule(12);
        layoutParams2.setMarginStart(this.f121868a.g());
        layoutParams2.bottomMargin = this.f121868a.a();
        return layoutParams2;
    }

    public final com.scandit.datacapture.barcode.internal.module.count.ui.j a(Context context) {
        com.scandit.datacapture.barcode.internal.module.count.ui.j jVar = new com.scandit.datacapture.barcode.internal.module.count.ui.j(context);
        jVar.setLayoutParams(c());
        jVar.setVisibility(4);
        jVar.setOnClickListener(new View.OnClickListener() { // from class: Pt.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F.a(this.f29324a, view);
            }
        });
        this.f121871d = jVar;
        return jVar;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c
    public final void a() {
        com.scandit.datacapture.barcode.internal.module.count.ui.j jVar = this.f121871d;
        if (jVar != null) {
            jVar.setVisibility(this.f121869b ? 0 : 4);
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.j jVar2 = this.f121871d;
        if (jVar2 == null) {
            return;
        }
        jVar2.setLayoutParams(c());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0015, B:12:0x001f, B:19:0x003a, B:13:0x0023, B:15:0x0027, B:18:0x0037), top: B:24:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r3, kotlin.jvm.functions.Function0 r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.scandit.datacapture.barcode.internal.module.count.ui.j r0 = r2.f121871d     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L23
            android.widget.TextView r0 = r0.f121688b     // Catch: java.lang.Throwable -> L1a
            java.lang.CharSequence r0 = r0.getText()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1a
            java.lang.Integer r0 = kotlin.text.StringsKt.v(r0)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L1c
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L1a
            goto L1d
        L1a:
            r3 = move-exception
            goto L3e
        L1c:
            r0 = 0
        L1d:
            if (r3 != r0) goto L23
            r4.invoke()     // Catch: java.lang.Throwable -> L1a
            goto L3a
        L23:
            com.scandit.datacapture.barcode.internal.module.count.ui.j r0 = r2.f121871d     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L34
            com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.z1 r0 = r2.f121872e     // Catch: java.lang.Throwable -> L1a
            com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.E r1 = new com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.E     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L1a
            r0.a(r1)     // Catch: java.lang.Throwable -> L1a
            kotlin.Unit r3 = kotlin.Unit.f142422a     // Catch: java.lang.Throwable -> L1a
            goto L35
        L34:
            r3 = 0
        L35:
            if (r3 != 0) goto L3a
            r4.invoke()     // Catch: java.lang.Throwable -> L1a
        L3a:
            kotlin.Unit r3 = kotlin.Unit.f142422a     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r2)
            return
        L3e:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.F.a(int, kotlin.jvm.functions.Function0):void");
    }
}
