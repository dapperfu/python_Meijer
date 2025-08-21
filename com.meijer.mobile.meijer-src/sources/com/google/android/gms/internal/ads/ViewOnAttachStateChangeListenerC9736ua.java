package com.google.android.gms.internal.ads;

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

/* renamed from: com.google.android.gms.internal.ads.ua, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnAttachStateChangeListenerC9736ua implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: m, reason: collision with root package name */
    private static final Handler f79705m = new Handler(Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    private final Context f79706a;

    /* renamed from: b, reason: collision with root package name */
    private Application f79707b;

    /* renamed from: c, reason: collision with root package name */
    private final PowerManager f79708c;

    /* renamed from: d, reason: collision with root package name */
    private final KeyguardManager f79709d;

    /* renamed from: e, reason: collision with root package name */
    private BroadcastReceiver f79710e;

    /* renamed from: f, reason: collision with root package name */
    private final C8134fa f79711f;

    /* renamed from: g, reason: collision with root package name */
    private WeakReference f79712g;

    /* renamed from: h, reason: collision with root package name */
    private WeakReference f79713h;

    /* renamed from: i, reason: collision with root package name */
    private C7814ca f79714i;

    /* renamed from: j, reason: collision with root package name */
    private byte f79715j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f79716k = -1;

    /* renamed from: l, reason: collision with root package name */
    private long f79717l = -3;

    private final void i(View view) {
        try {
            WeakReference weakReference = this.f79712g;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f79712g = null;
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
        BroadcastReceiver broadcastReceiver = this.f79710e;
        if (broadcastReceiver != null) {
            try {
                this.f79706a.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.f79710e = null;
        }
        Application application = this.f79707b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f79714i);
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
        this.f79716k = -1;
        h(view);
        f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f79716k = -1;
        f();
        g();
        i(view);
    }

    private final void e(Activity activity, int i10) {
        Window window;
        if (this.f79713h == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View viewB = b();
        if (viewB == null || viewPeekDecorView == null || viewB.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f79716k = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006a, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r9 = this;
            java.lang.ref.WeakReference r0 = r9.f79713h
            if (r0 != 0) goto L6
            goto Lbe
        L6:
            android.view.View r0 = r9.b()
            r1 = -1
            r2 = -3
            if (r0 != 0) goto L14
            r9.f79717l = r2
            r9.f79715j = r1
            return
        L14:
            int r4 = r0.getVisibility()
            r5 = 0
            if (r4 == 0) goto L1d
            r4 = 1
            goto L1e
        L1d:
            r4 = r5
        L1e:
            boolean r6 = r0.isShown()
            if (r6 != 0) goto L26
            r4 = r4 | 2
        L26:
            android.os.PowerManager r6 = r9.f79708c
            if (r6 == 0) goto L32
            boolean r6 = r6.isScreenOn()
            if (r6 != 0) goto L32
            r4 = r4 | 4
        L32:
            com.google.android.gms.internal.ads.fa r6 = r9.f79711f
            boolean r6 = r6.a()
            if (r6 != 0) goto L84
            android.app.KeyguardManager r6 = r9.f79709d
            if (r6 == 0) goto L82
            boolean r6 = r6.inKeyguardRestrictedInputMode()
            if (r6 == 0) goto L82
            int r6 = com.google.android.gms.internal.ads.C9309qa.f78635b
            android.view.View r6 = r0.getRootView()
            if (r6 != 0) goto L4d
            r6 = r0
        L4d:
            android.content.Context r6 = r6.getContext()
        L51:
            boolean r7 = r6 instanceof android.content.ContextWrapper
            r8 = 0
            if (r7 == 0) goto L6a
            r7 = 10
            if (r5 >= r7) goto L6a
            boolean r7 = r6 instanceof android.app.Activity
            if (r7 == 0) goto L61
            android.app.Activity r6 = (android.app.Activity) r6
            goto L6b
        L61:
            android.content.ContextWrapper r6 = (android.content.ContextWrapper) r6
            android.content.Context r6 = r6.getBaseContext()
            int r5 = r5 + 1
            goto L51
        L6a:
            r6 = r8
        L6b:
            if (r6 != 0) goto L6e
            goto L82
        L6e:
            android.view.Window r5 = r6.getWindow()
            if (r5 != 0) goto L75
            goto L79
        L75:
            android.view.WindowManager$LayoutParams r8 = r5.getAttributes()
        L79:
            if (r8 == 0) goto L82
            int r5 = r8.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r5 = r5 & r6
            if (r5 != 0) goto L84
        L82:
            r4 = r4 | 8
        L84:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getGlobalVisibleRect(r5)
            if (r5 != 0) goto L91
            r4 = r4 | 16
        L91:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getLocalVisibleRect(r5)
            if (r5 != 0) goto L9e
            r4 = r4 | 32
        L9e:
            int r0 = r0.getWindowVisibility()
            int r5 = r9.f79716k
            if (r5 == r1) goto La7
            r0 = r5
        La7:
            if (r0 == 0) goto Lab
            r4 = r4 | 64
        Lab:
            byte r0 = r9.f79715j
            if (r0 == r4) goto Lbe
            byte r0 = (byte) r4
            r9.f79715j = r0
            if (r4 != 0) goto Lb9
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto Lbc
        Lb9:
            long r0 = (long) r4
            long r0 = r2 - r0
        Lbc:
            r9.f79717l = r0
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC9736ua.f():void");
    }

    private final void g() {
        f79705m.post(new RunnableC9522sa(this));
    }

    public final long a() {
        if (this.f79717l <= -2 && b() == null) {
            this.f79717l = -3L;
        }
        return this.f79717l;
    }

    final View b() {
        WeakReference weakReference = this.f79713h;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public ViewOnAttachStateChangeListenerC9736ua(Context context, C8134fa c8134fa) {
        Context applicationContext = context.getApplicationContext();
        this.f79706a = applicationContext;
        this.f79711f = c8134fa;
        this.f79708c = (PowerManager) applicationContext.getSystemService("power");
        this.f79709d = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f79707b = application;
            this.f79714i = new C7814ca(application, this);
        }
        d(null);
    }

    private final void h(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f79712g = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f79710e == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            C9629ta c9629ta = new C9629ta(this);
            this.f79710e = c9629ta;
            this.f79706a.registerReceiver(c9629ta, intentFilter);
        }
        Application application = this.f79707b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f79714i);
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
        this.f79713h = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                h(view);
            }
            view.addOnAttachStateChangeListener(this);
            j10 = -2;
        } else {
            j10 = -3;
        }
        this.f79717l = j10;
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
