package com.scandit.datacapture.barcode.internal.module.count.ui.cluster;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class o extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f122505a;

    public o(p pVar) {
        this.f122505a = pVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e10) {
        Intrinsics.j(e10, "e");
        int i10 = p.f122506h;
        return l.a(e10, this.f122505a.f122507a, k.f122501a);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e10) {
        Intrinsics.j(e10, "e");
        p pVar = this.f122505a;
        if (!pVar.f122512f) {
            return false;
        }
        int i10 = p.f122506h;
        return l.a(e10, pVar.f122507a, new n(pVar));
    }
}
