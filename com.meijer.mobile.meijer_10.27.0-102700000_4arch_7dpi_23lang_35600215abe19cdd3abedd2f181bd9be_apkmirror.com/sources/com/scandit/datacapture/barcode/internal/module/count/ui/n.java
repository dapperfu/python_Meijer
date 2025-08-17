package com.scandit.datacapture.barcode.internal.module.count.ui;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class n implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f121756a;

    public n(o oVar) {
        this.f121756a = oVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Intrinsics.j(view, "view");
        o oVar = this.f121756a;
        if (oVar.f121758a == m.f121702b) {
            view.setOnTouchListener(oVar.f121759b);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Intrinsics.j(view, "view");
        if (this.f121756a.f121758a == m.f121702b) {
            view.setOnTouchListener(null);
        }
    }
}
