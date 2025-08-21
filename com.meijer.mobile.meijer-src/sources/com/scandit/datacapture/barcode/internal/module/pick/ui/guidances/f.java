package com.scandit.datacapture.barcode.internal.module.pick.ui.guidances;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class f extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f123485a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f123486b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, boolean z10) {
        super(1);
        this.f123485a = gVar;
        this.f123486b = z10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g it = (g) obj;
        Intrinsics.j(it, "it");
        View view = (View) this.f123485a.f123488b.getValue();
        com.scandit.datacapture.barcode.internal.module.pick.ui.e eVar = view instanceof com.scandit.datacapture.barcode.internal.module.pick.ui.e ? (com.scandit.datacapture.barcode.internal.module.pick.ui.e) view : null;
        if (eVar != null) {
            eVar.f123471c.setText(this.f123486b ? eVar.f123469a : eVar.f123470b);
        }
        g gVar = this.f123485a;
        if (!gVar.f123489c) {
            gVar.addView((View) gVar.f123488b.getValue(), new FrameLayout.LayoutParams(-1, -1));
            ((View) this.f123485a.f123488b.getValue()).bringToFront();
            this.f123485a.f123489c = true;
        }
        return Unit.f143329a;
    }
}
