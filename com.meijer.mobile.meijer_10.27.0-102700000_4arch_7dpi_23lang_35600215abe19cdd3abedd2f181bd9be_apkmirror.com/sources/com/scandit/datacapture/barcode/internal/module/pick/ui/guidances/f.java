package com.scandit.datacapture.barcode.internal.module.pick.ui.guidances;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class f extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f122533a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f122534b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, boolean z10) {
        super(1);
        this.f122533a = gVar;
        this.f122534b = z10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g it = (g) obj;
        Intrinsics.j(it, "it");
        View view = (View) this.f122533a.f122536b.getValue();
        com.scandit.datacapture.barcode.internal.module.pick.ui.e eVar = view instanceof com.scandit.datacapture.barcode.internal.module.pick.ui.e ? (com.scandit.datacapture.barcode.internal.module.pick.ui.e) view : null;
        if (eVar != null) {
            eVar.f122519c.setText(this.f122534b ? eVar.f122517a : eVar.f122518b);
        }
        g gVar = this.f122533a;
        if (!gVar.f122537c) {
            gVar.addView((View) gVar.f122536b.getValue(), new FrameLayout.LayoutParams(-1, -1));
            ((View) this.f122533a.f122536b.getValue()).bringToFront();
            this.f122533a.f122537c = true;
        }
        return Unit.f142422a;
    }
}
