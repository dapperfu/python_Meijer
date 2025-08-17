package com.scandit.datacapture.barcode.internal.module.count.ui.cluster;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class i extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f121537a;

    public i(j jVar) {
        this.f121537a = jVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e10) {
        Intrinsics.j(e10, "e");
        Lazy lazy = j.f121538h;
        return AbstractC13090f.a(e10, this.f121537a.f121542a, C13089e.f121533a);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e10) {
        Intrinsics.j(e10, "e");
        j jVar = this.f121537a;
        if (!jVar.f121547f) {
            return false;
        }
        Lazy lazy = j.f121538h;
        return AbstractC13090f.a(e10, jVar.f121542a, new h(jVar));
    }
}
