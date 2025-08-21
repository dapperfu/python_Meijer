package com.google.android.gms.internal.pal;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.pal.f4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnAttachStateChangeListenerC10802f4 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: m, reason: collision with root package name */
    private static final Handler f83950m = new Handler(Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    private final Context f83951a;

    /* renamed from: b, reason: collision with root package name */
    private Application f83952b;

    /* renamed from: c, reason: collision with root package name */
    private final PowerManager f83953c;

    /* renamed from: d, reason: collision with root package name */
    private final KeyguardManager f83954d;

    /* renamed from: e, reason: collision with root package name */
    private BroadcastReceiver f83955e;

    /* renamed from: f, reason: collision with root package name */
    private final R3 f83956f;

    /* renamed from: g, reason: collision with root package name */
    private WeakReference f83957g;

    /* renamed from: h, reason: collision with root package name */
    private WeakReference f83958h;

    /* renamed from: i, reason: collision with root package name */
    private P3 f83959i;

    /* renamed from: j, reason: collision with root package name */
    private byte f83960j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f83961k = -1;

    /* renamed from: l, reason: collision with root package name */
    private long f83962l = -3;

    private final void i(View view) {
        try {
            WeakReference weakReference = this.f83957g;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f83957g = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        BroadcastReceiver broadcastReceiver = this.f83955e;
        if (broadcastReceiver != null) {
            try {
                this.f83951a.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.f83955e = null;
        }
        Application application = this.f83952b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f83959i);
            } catch (Exception unused4) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        e(activity, 0);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        e(activity, 4);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        e(activity, 0);
        f();
        g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        e(activity, 0);
        f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f83961k = -1;
        h(view);
        f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f83961k = -1;
        f();
        g();
        i(view);
    }

    private final void e(Activity activity, int i10) {
        Window window;
        if (this.f83958h == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View viewB = b();
        if (viewB == null || viewPeekDecorView == null || viewB.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f83961k = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r7 = this;
            java.lang.ref.WeakReference r0 = r7.f83958h
            if (r0 != 0) goto L6
            goto L9b
        L6:
            android.view.View r0 = r7.b()
            r1 = -1
            r2 = -3
            if (r0 != 0) goto L14
            r7.f83962l = r2
            r7.f83960j = r1
            return
        L14:
            int r4 = r0.getVisibility()
            if (r4 == 0) goto L1c
            r4 = 1
            goto L1d
        L1c:
            r4 = 0
        L1d:
            boolean r5 = r0.isShown()
            if (r5 != 0) goto L25
            r4 = r4 | 2
        L25:
            android.os.PowerManager r5 = r7.f83953c
            if (r5 == 0) goto L31
            boolean r5 = r5.isScreenOn()
            if (r5 != 0) goto L31
            r4 = r4 | 4
        L31:
            com.google.android.gms.internal.pal.R3 r5 = r7.f83956f
            boolean r5 = r5.a()
            if (r5 != 0) goto L61
            android.app.KeyguardManager r5 = r7.f83954d
            if (r5 == 0) goto L5f
            boolean r5 = r5.inKeyguardRestrictedInputMode()
            if (r5 == 0) goto L5f
            android.app.Activity r5 = com.google.android.gms.internal.pal.C10717a4.b(r0)
            if (r5 != 0) goto L4a
            goto L5f
        L4a:
            android.view.Window r5 = r5.getWindow()
            if (r5 != 0) goto L52
            r5 = 0
            goto L56
        L52:
            android.view.WindowManager$LayoutParams r5 = r5.getAttributes()
        L56:
            if (r5 == 0) goto L5f
            int r5 = r5.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r5 = r5 & r6
            if (r5 != 0) goto L61
        L5f:
            r4 = r4 | 8
        L61:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getGlobalVisibleRect(r5)
            if (r5 != 0) goto L6e
            r4 = r4 | 16
        L6e:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getLocalVisibleRect(r5)
            if (r5 != 0) goto L7b
            r4 = r4 | 32
        L7b:
            int r0 = r0.getWindowVisibility()
            int r5 = r7.f83961k
            if (r5 == r1) goto L84
            r0 = r5
        L84:
            if (r0 == 0) goto L88
            r4 = r4 | 64
        L88:
            byte r0 = r7.f83960j
            if (r0 == r4) goto L9b
            byte r0 = (byte) r4
            r7.f83960j = r0
            if (r4 != 0) goto L96
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto L99
        L96:
            long r0 = (long) r4
            long r0 = r2 - r0
        L99:
            r7.f83962l = r0
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.ViewOnAttachStateChangeListenerC10802f4.f():void");
    }

    private final void g() {
        f83950m.post(new RunnableC10751c4(this));
    }

    public final long a() {
        if (this.f83962l <= -2 && b() == null) {
            this.f83962l = -3L;
        }
        return this.f83962l;
    }

    final View b() {
        WeakReference weakReference = this.f83958h;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public ViewOnAttachStateChangeListenerC10802f4(Context context, R3 r32) {
        Context applicationContext = context.getApplicationContext();
        this.f83951a = applicationContext;
        this.f83956f = r32;
        this.f83953c = (PowerManager) applicationContext.getSystemService("power");
        this.f83954d = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f83952b = application;
            this.f83959i = new P3(application, this);
        }
        d(null);
    }

    private final void h(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f83957g = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f83955e == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            C10785e4 c10785e4 = new C10785e4(this);
            this.f83955e = c10785e4;
            this.f83951a.registerReceiver(c10785e4, intentFilter);
        }
        Application application = this.f83952b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f83959i);
            } catch (Exception unused) {
            }
        }
    }

    final void d(View view) {
        long j10;
        View viewB = b();
        if (viewB != null) {
            viewB.removeOnAttachStateChangeListener(this);
            i(viewB);
        }
        this.f83958h = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                h(view);
            }
            view.addOnAttachStateChangeListener(this);
            j10 = -2;
        } else {
            j10 = -3;
        }
        this.f83962l = j10;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        f();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        f();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        f();
    }
}
