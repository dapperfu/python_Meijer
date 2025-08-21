package com.scandit.datacapture.barcode.internal.module.count.ui.cluster;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class i extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f122489a;

    public i(j jVar) {
        this.f122489a = jVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e10) {
        Intrinsics.j(e10, "e");
        Lazy lazy = j.f122490h;
        return AbstractC13223f.a(e10, this.f122489a.f122494a, C13222e.f122485a);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e10) {
        Intrinsics.j(e10, "e");
        j jVar = this.f122489a;
        if (!jVar.f122499f) {
            return false;
        }
        Lazy lazy = j.f122490h;
        return AbstractC13223f.a(e10, jVar.f122494a, new h(jVar));
    }
}
