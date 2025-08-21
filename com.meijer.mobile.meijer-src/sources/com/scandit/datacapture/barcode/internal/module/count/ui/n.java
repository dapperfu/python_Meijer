package com.scandit.datacapture.barcode.internal.module.count.ui;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class n implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f122708a;

    public n(o oVar) {
        this.f122708a = oVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Intrinsics.j(view, "view");
        o oVar = this.f122708a;
        if (oVar.f122710a == m.f122654b) {
            view.setOnTouchListener(oVar.f122711b);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Intrinsics.j(view, "view");
        if (this.f122708a.f122710a == m.f122654b) {
            view.setOnTouchListener(null);
        }
    }
}
