package le;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: le.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class ViewOnTouchListenerC15484a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    private final Dialog f149580a;

    /* renamed from: b, reason: collision with root package name */
    private final int f149581b;

    /* renamed from: c, reason: collision with root package name */
    private final int f149582c;

    /* renamed from: d, reason: collision with root package name */
    private final int f149583d;

    public ViewOnTouchListenerC15484a(Dialog dialog, Rect rect) {
        this.f149580a = dialog;
        this.f149581b = rect.left;
        this.f149582c = rect.top;
        this.f149583d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f149581b + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, this.f149582c + viewFindViewById.getTop(), width, viewFindViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i10 = this.f149583d;
            motionEventObtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f149580a.onTouchEvent(motionEventObtain);
    }
}
