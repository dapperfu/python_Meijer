package com.scandit.datacapture.core.internal.module.ui;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.scandit.datacapture.core.common.geometry.Point;
import java.util.EnumSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class o implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f126257a;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent e10) {
        Intrinsics.j(e10, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e10) {
        Intrinsics.j(e10, "e");
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e10) {
        Intrinsics.j(e10, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent e22, float f10, float f11) {
        Intrinsics.j(e22, "e2");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent e10) {
        Intrinsics.j(e10, "e");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent e10) {
        Intrinsics.j(e10, "e");
        return false;
    }

    public o(p pVar) {
        this.f126257a = pVar;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent e10) {
        p pVar;
        GestureListener gestureListener;
        Intrinsics.j(e10, "e");
        if (!this.f126257a.f126261d.contains(NativeGestureType.DOUBLE_TAP) || (gestureListener = (pVar = this.f126257a).f126260c) == null) {
            return false;
        }
        return gestureListener.a(p.a(pVar, e10));
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent e22, float f10, float f11) {
        GestureListener gestureListener;
        GestureListener gestureListener2;
        Intrinsics.j(e22, "e2");
        EnumSet enumSet = this.f126257a.f126261d;
        NativeGestureType nativeGestureType = NativeGestureType.SWIPE_UP;
        if ((enumSet.contains(nativeGestureType) || this.f126257a.f126261d.contains(NativeGestureType.SWIPE_DOWN) || this.f126257a.f126261d.contains(NativeGestureType.SWIPE_LEFT) || this.f126257a.f126261d.contains(NativeGestureType.SWIPE_RIGHT)) && motionEvent != null) {
            Point pointA = p.a(this.f126257a, motionEvent);
            Point pointA2 = p.a(this.f126257a, e22);
            float x10 = pointA2.getX() - pointA.getX();
            float y10 = pointA2.getY() - pointA.getY();
            float f12 = 2;
            if (Math.abs(y10) > Math.abs(x10 * f12)) {
                if (y10 > 0.0f && this.f126257a.f126261d.contains(NativeGestureType.SWIPE_DOWN)) {
                    GestureListener gestureListener3 = this.f126257a.f126260c;
                    if (gestureListener3 != null) {
                        return gestureListener3.a();
                    }
                } else if (this.f126257a.f126261d.contains(nativeGestureType) && (gestureListener2 = this.f126257a.f126260c) != null) {
                    return gestureListener2.d();
                }
                return false;
            }
            if (Math.abs(x10) > Math.abs(y10 * f12)) {
                if (x10 > 0.0f && this.f126257a.f126261d.contains(NativeGestureType.SWIPE_RIGHT)) {
                    GestureListener gestureListener4 = this.f126257a.f126260c;
                    if (gestureListener4 != null) {
                        return gestureListener4.c();
                    }
                } else if (this.f126257a.f126261d.contains(NativeGestureType.SWIPE_LEFT) && (gestureListener = this.f126257a.f126260c) != null) {
                    return gestureListener.b();
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e10) {
        p pVar;
        GestureListener gestureListener;
        Intrinsics.j(e10, "e");
        if (!this.f126257a.f126261d.contains(NativeGestureType.TAP) || (gestureListener = (pVar = this.f126257a).f126260c) == null) {
            return false;
        }
        return gestureListener.b(p.a(pVar, e10));
    }
}
