package p2;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

@Deprecated
/* renamed from: p2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16231q {

    /* renamed from: a, reason: collision with root package name */
    private final GestureDetector f155397a;

    public C16231q(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public C16231q(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f155397a = new GestureDetector(context, onGestureListener, handler);
    }

    public boolean a(MotionEvent motionEvent) {
        return this.f155397a.onTouchEvent(motionEvent);
    }
}
