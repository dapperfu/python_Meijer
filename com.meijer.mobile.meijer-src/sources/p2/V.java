package p2;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    private static Map<VelocityTracker, W> f156022a = Collections.synchronizedMap(new WeakHashMap());

    private static class a {
        static float a(VelocityTracker velocityTracker, int i10) {
            return velocityTracker.getAxisVelocity(i10);
        }
    }

    public static float d(VelocityTracker velocityTracker, int i10) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(velocityTracker, i10);
        }
        if (i10 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i10 == 1) {
            return velocityTracker.getYVelocity();
        }
        W wE = e(velocityTracker);
        if (wE != null) {
            return wE.d(i10);
        }
        return 0.0f;
    }

    private static W e(VelocityTracker velocityTracker) {
        return f156022a.get(velocityTracker);
    }

    public static void a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f156022a.containsKey(velocityTracker)) {
                f156022a.put(velocityTracker, new W());
            }
            f156022a.get(velocityTracker).a(motionEvent);
        }
    }

    public static void b(VelocityTracker velocityTracker, int i10) {
        c(velocityTracker, i10, Float.MAX_VALUE);
    }

    public static void c(VelocityTracker velocityTracker, int i10, float f10) {
        velocityTracker.computeCurrentVelocity(i10, f10);
        W wE = e(velocityTracker);
        if (wE != null) {
            wE.c(i10, f10);
        }
    }
}
