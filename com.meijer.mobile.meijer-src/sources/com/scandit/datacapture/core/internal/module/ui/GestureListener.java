package com.scandit.datacapture.core.internal.module.ui;

import com.scandit.datacapture.core.common.geometry.Point;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class GestureListener {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ n f126091a;

    public final boolean a(Point point) {
        Intrinsics.j(point, "point");
        n nVar = this.f126091a;
        nVar.getClass();
        Intrinsics.j(point, "point");
        return nVar.f126255a.onDoubleTap(point);
    }

    public final boolean b(Point point) {
        Intrinsics.j(point, "point");
        n nVar = this.f126091a;
        nVar.getClass();
        Intrinsics.j(point, "point");
        return nVar.f126255a.onTap(point);
    }

    public GestureListener(NativeGestureListener impl) {
        Intrinsics.j(impl, "impl");
        this.f126091a = new n(impl);
    }

    public final boolean c() {
        return this.f126091a.f126255a.onSwipeRight();
    }

    public final boolean d() {
        return this.f126091a.f126255a.onSwipeUp();
    }

    public final boolean a() {
        return this.f126091a.f126255a.onSwipeDown();
    }

    public final boolean b() {
        return this.f126091a.f126255a.onSwipeLeft();
    }
}
