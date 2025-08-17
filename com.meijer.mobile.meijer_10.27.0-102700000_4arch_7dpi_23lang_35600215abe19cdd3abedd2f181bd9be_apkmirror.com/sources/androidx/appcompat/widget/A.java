package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ShowableListMenu;

/* loaded from: classes.dex */
public abstract class A implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final float f46348a;

    /* renamed from: b, reason: collision with root package name */
    private final int f46349b;

    /* renamed from: c, reason: collision with root package name */
    private final int f46350c;

    /* renamed from: d, reason: collision with root package name */
    final View f46351d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f46352e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f46353f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f46354g;

    /* renamed from: h, reason: collision with root package name */
    private int f46355h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f46356i = new int[2];

    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = A.this.f46351d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            A.this.g();
        }
    }

    private static boolean j(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    public abstract ShowableListMenu d();

    protected abstract boolean e();

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f46354g = false;
        this.f46355h = -1;
        Runnable runnable = this.f46352e;
        if (runnable != null) {
            this.f46351d.removeCallbacks(runnable);
        }
    }

    private void c() {
        Runnable runnable = this.f46353f;
        if (runnable != null) {
            this.f46351d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f46352e;
        if (runnable2 != null) {
            this.f46351d.removeCallbacks(runnable2);
        }
    }

    private boolean h(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException {
        DropDownListView dropDownListView;
        View view = this.f46351d;
        ShowableListMenu showableListMenuD = d();
        if (showableListMenuD != null && showableListMenuD.b() && (dropDownListView = (DropDownListView) showableListMenuD.getListView()) != null && dropDownListView.isShown()) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            k(view, motionEventObtainNoHistory);
            l(dropDownListView, motionEventObtainNoHistory);
            boolean zE = dropDownListView.e(motionEventObtainNoHistory, this.f46355h);
            motionEventObtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z10 = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (zE && z10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean i(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f46351d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f46355h
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f46348a
            boolean r6 = j(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.c()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.c()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f46355h = r6
            java.lang.Runnable r6 = r5.f46352e
            if (r6 != 0) goto L52
            androidx.appcompat.widget.A$a r6 = new androidx.appcompat.widget.A$a
            r6.<init>()
            r5.f46352e = r6
        L52:
            java.lang.Runnable r6 = r5.f46352e
            int r1 = r5.f46349b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f46353f
            if (r6 != 0) goto L65
            androidx.appcompat.widget.A$b r6 = new androidx.appcompat.widget.A$b
            r6.<init>()
            r5.f46353f = r6
        L65:
            java.lang.Runnable r6 = r5.f46353f
            int r1 = r5.f46350c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.A.i(android.view.MotionEvent):boolean");
    }

    private boolean k(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f46356i);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    private boolean l(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f46356i);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f46354g;
        if (z11) {
            z10 = h(motionEvent) || !f();
        } else {
            z10 = i(motionEvent) && e();
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f46351d.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f46354g = z10;
        return z10 || z11;
    }

    public A(View view) {
        this.f46351d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f46348a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f46349b = tapTimeout;
        this.f46350c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    protected boolean f() {
        ShowableListMenu showableListMenuD = d();
        if (showableListMenuD != null && showableListMenuD.b()) {
            showableListMenuD.dismiss();
            return true;
        }
        return true;
    }

    void g() {
        c();
        View view = this.f46351d;
        if (view.isEnabled() && !view.isLongClickable() && e()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f46354g = true;
        }
    }
}
