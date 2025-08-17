package com.medallia.digital.mobilesdk;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.medallia.digital.mobilesdk.j1;

/* loaded from: classes7.dex */
class y implements View.OnTouchListener {

    /* renamed from: n, reason: collision with root package name */
    private static final int f93517n = 100;

    /* renamed from: o, reason: collision with root package name */
    private static final int f93518o = 10;

    /* renamed from: p, reason: collision with root package name */
    private static final float f93519p = 2.0f;

    /* renamed from: a, reason: collision with root package name */
    private final j1.c f93520a;

    /* renamed from: c, reason: collision with root package name */
    private int f93522c;

    /* renamed from: d, reason: collision with root package name */
    private c f93523d;

    /* renamed from: e, reason: collision with root package name */
    private float f93524e;

    /* renamed from: f, reason: collision with root package name */
    private float f93525f;

    /* renamed from: g, reason: collision with root package name */
    private float f93526g;

    /* renamed from: h, reason: collision with root package name */
    private float f93527h;

    /* renamed from: i, reason: collision with root package name */
    private long f93528i;

    /* renamed from: j, reason: collision with root package name */
    private long f93529j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f93530k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f93531l;

    /* renamed from: m, reason: collision with root package name */
    private Rect f93532m = new Rect(0, 0, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    private final GestureDetector f93521b = new GestureDetector(i4.c().d(), new b());

    private class b extends GestureDetector.SimpleOnGestureListener {
        private b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    private enum c {
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    y(j1 j1Var, boolean z10, m4 m4Var) {
        this.f93520a = j1Var.f92270b;
        this.f93531l = z10;
        i();
    }

    private void a() {
        this.f93526g = 0.0f;
        this.f93524e = 0.0f;
        this.f93525f = 0.0f;
        this.f93527h = 0.0f;
        this.f93529j = 0L;
        this.f93528i = 0L;
        this.f93530k = false;
        this.f93523d = null;
    }

    private boolean b() {
        if (this.f93529j - this.f93528i <= 10) {
            return false;
        }
        this.f93528i = 0L;
        this.f93529j = 0L;
        return true;
    }

    private void i() {
        int iHeight;
        if (Build.VERSION.SDK_INT >= 30) {
            WindowManager windowManager = (WindowManager) i4.c().d().getSystemService("window");
            if (windowManager != null) {
                iHeight = windowManager.getCurrentWindowMetrics().getBounds().height();
                this.f93522c = iHeight;
            }
        } else {
            WindowManager windowManager2 = (WindowManager) i4.c().a().getSystemService("window");
            if (windowManager2 != null) {
                Display defaultDisplay = windowManager2.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                defaultDisplay.getRealSize(point);
                iHeight = point.y;
                this.f93522c = iHeight;
            }
        }
        a4.b("screenHeight is: " + this.f93522c);
    }

    protected void c() {
    }

    protected void d() {
    }

    protected void e() {
    }

    protected void f() {
    }

    protected void g() {
    }

    protected void h() {
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f93521b.onTouchEvent(motionEvent)) {
            int rawY = (int) motionEvent.getRawY();
            int rawX = (int) motionEvent.getRawX();
            if (motionEvent.getAction() == 0) {
                this.f93528i = motionEvent.getEventTime();
                this.f93524e = motionEvent.getRawY();
                this.f93526g = motionEvent.getRawX();
            }
            if (motionEvent.getAction() == 1) {
                a(view);
            }
            if (motionEvent.getAction() == 2) {
                a(view, motionEvent, rawY, rawX);
            }
        } else if (this.f93531l) {
            c();
        }
        return true;
    }

    protected void a(Rect rect) {
        this.f93532m = rect;
    }

    private void a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        c cVar = this.f93523d;
        if (cVar == c.TOP) {
            if (Math.abs(layoutParams.topMargin) < view.getHeight() / 2.0f) {
                layoutParams.topMargin = this.f93532m.top;
                view.setLayoutParams(layoutParams);
            } else {
                h();
            }
        } else if (cVar != c.BOTTOM) {
            if (cVar == c.LEFT) {
                if (Math.abs(layoutParams.rightMargin) >= view.getWidth() / 2.0f) {
                    f();
                }
                Rect rect = this.f93532m;
                layoutParams.rightMargin = rect.right;
                layoutParams.leftMargin = rect.left;
            } else if (cVar == c.RIGHT) {
                if (Math.abs(layoutParams.leftMargin) >= view.getWidth() / 2.0f) {
                    g();
                }
                Rect rect2 = this.f93532m;
                layoutParams.rightMargin = rect2.right;
                layoutParams.leftMargin = rect2.left;
            }
            view.setLayoutParams(layoutParams);
        } else if (Math.abs(layoutParams.bottomMargin) < view.getHeight() / 2.0f) {
            layoutParams.bottomMargin = this.f93532m.bottom;
            view.setLayoutParams(layoutParams);
        } else {
            e();
        }
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(android.view.View r5, android.view.MotionEvent r6, int r7, int r8) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.y.a(android.view.View, android.view.MotionEvent, int, int):void");
    }
}
