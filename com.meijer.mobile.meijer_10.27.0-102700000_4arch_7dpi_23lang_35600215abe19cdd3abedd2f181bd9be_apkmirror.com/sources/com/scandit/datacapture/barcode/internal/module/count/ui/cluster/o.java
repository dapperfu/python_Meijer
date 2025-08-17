package com.scandit.datacapture.barcode.internal.module.count.ui.cluster;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class o extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f121553a;

    public o(p pVar) {
        this.f121553a = pVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e10) {
        Intrinsics.j(e10, "e");
        int i10 = p.f121554h;
        return l.a(e10, this.f121553a.f121555a, k.f121549a);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e10) {
        Intrinsics.j(e10, "e");
        p pVar = this.f121553a;
        if (!pVar.f121560f) {
            return false;
        }
        int i10 = p.f121554h;
        return l.a(e10, pVar.f121555a, new n(pVar));
    }
}
