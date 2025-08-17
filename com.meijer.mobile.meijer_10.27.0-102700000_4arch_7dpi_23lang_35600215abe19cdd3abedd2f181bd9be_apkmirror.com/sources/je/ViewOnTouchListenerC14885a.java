package je;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: je.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class ViewOnTouchListenerC14885a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    private final Dialog f139566a;

    /* renamed from: b, reason: collision with root package name */
    private final int f139567b;

    /* renamed from: c, reason: collision with root package name */
    private final int f139568c;

    /* renamed from: d, reason: collision with root package name */
    private final int f139569d;

    public ViewOnTouchListenerC14885a(Dialog dialog, Rect rect) {
        this.f139566a = dialog;
        this.f139567b = rect.left;
        this.f139568c = rect.top;
        this.f139569d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f139567b + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, this.f139568c + viewFindViewById.getTop(), width, viewFindViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i10 = this.f139569d;
            motionEventObtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f139566a.onTouchEvent(motionEventObtain);
    }
}
