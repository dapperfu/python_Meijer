package p2;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

@Deprecated
/* renamed from: p2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16376q {

    /* renamed from: a, reason: collision with root package name */
    private final GestureDetector f156071a;

    public C16376q(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public C16376q(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f156071a = new GestureDetector(context, onGestureListener, handler);
    }

    public boolean a(MotionEvent motionEvent) {
        return this.f156071a.onTouchEvent(motionEvent);
    }
}
