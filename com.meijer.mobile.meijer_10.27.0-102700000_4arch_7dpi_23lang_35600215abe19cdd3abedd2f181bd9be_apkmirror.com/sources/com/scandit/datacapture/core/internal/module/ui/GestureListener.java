package com.scandit.datacapture.core.internal.module.ui;

import com.scandit.datacapture.core.common.geometry.Point;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class GestureListener {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ n f125139a;

    public final boolean a(Point point) {
        Intrinsics.j(point, "point");
        n nVar = this.f125139a;
        nVar.getClass();
        Intrinsics.j(point, "point");
        return nVar.f125303a.onDoubleTap(point);
    }

    public final boolean b(Point point) {
        Intrinsics.j(point, "point");
        n nVar = this.f125139a;
        nVar.getClass();
        Intrinsics.j(point, "point");
        return nVar.f125303a.onTap(point);
    }

    public GestureListener(NativeGestureListener impl) {
        Intrinsics.j(impl, "impl");
        this.f125139a = new n(impl);
    }

    public final boolean c() {
        return this.f125139a.f125303a.onSwipeRight();
    }

    public final boolean d() {
        return this.f125139a.f125303a.onSwipeUp();
    }

    public final boolean a() {
        return this.f125139a.f125303a.onSwipeDown();
    }

    public final boolean b() {
        return this.f125139a.f125303a.onSwipeLeft();
    }
}
