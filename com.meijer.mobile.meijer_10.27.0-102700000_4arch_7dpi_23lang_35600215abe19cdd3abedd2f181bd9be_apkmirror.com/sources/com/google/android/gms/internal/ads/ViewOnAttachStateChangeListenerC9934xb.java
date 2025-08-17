package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.xb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnAttachStateChangeListenerC9934xb implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: p, reason: collision with root package name */
    private static final long f79803p = ((Long) Mc.A.c().a(C8659lf.f76545v1)).longValue();

    /* renamed from: a, reason: collision with root package name */
    private final Context f79804a;

    /* renamed from: b, reason: collision with root package name */
    private Application f79805b;

    /* renamed from: c, reason: collision with root package name */
    private final WindowManager f79806c;

    /* renamed from: d, reason: collision with root package name */
    private final PowerManager f79807d;

    /* renamed from: e, reason: collision with root package name */
    private final KeyguardManager f79808e;

    /* renamed from: f, reason: collision with root package name */
    BroadcastReceiver f79809f;

    /* renamed from: g, reason: collision with root package name */
    private WeakReference f79810g;

    /* renamed from: h, reason: collision with root package name */
    final WeakReference f79811h;

    /* renamed from: i, reason: collision with root package name */
    private C6852Jb f79812i;

    /* renamed from: j, reason: collision with root package name */
    private final Pc.Z f79813j = new Pc.Z(f79803p);

    /* renamed from: k, reason: collision with root package name */
    private boolean f79814k = false;

    /* renamed from: l, reason: collision with root package name */
    private int f79815l = -1;

    /* renamed from: m, reason: collision with root package name */
    private final HashSet f79816m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    private final DisplayMetrics f79817n;

    /* renamed from: o, reason: collision with root package name */
    private final Rect f79818o;

    private final int h(int i10) {
        return (int) (i10 / this.f79817n.density);
    }

    private final void m(View view) {
        try {
            WeakReference weakReference = this.f79810g;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f79810g = null;
            }
        } catch (Exception e10) {
            Qc.p.e("Error while unregistering listeners from the last ViewTreeObserver.", e10);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e11) {
            Qc.p.e("Error while unregistering listeners from the ViewTreeObserver.", e11);
        }
        if (this.f79809f != null) {
            try {
                Lc.v.z().d(this.f79804a, this.f79809f);
            } catch (IllegalStateException e12) {
                Qc.p.e("Failed trying to unregister the receiver", e12);
            } catch (Exception e13) {
                Lc.v.s().x(e13, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f79809f = null;
        }
        Application application = this.f79805b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f79812i);
            } catch (Exception e14) {
                Qc.p.e("Error registering activity lifecycle callbacks.", e14);
            }
        }
    }

    final /* synthetic */ void d() {
        j(3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        i(activity, 0);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        i(activity, 4);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        i(activity, 0);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        i(activity, 0);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        j(3);
        k();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        j(2);
        k();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        j(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f79815l = -1;
        l(view);
        j(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f79815l = -1;
        j(3);
        k();
        m(view);
    }

    private final void i(Activity activity, int i10) {
        Window window;
        if (this.f79811h == null || (window = activity.getWindow()) == null) {
            return;
        }
        WeakReference weakReference = this.f79811h;
        View viewPeekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f79815l = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x012f, code lost:
    
        if (r9 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0131, code lost:
    
        r3 = 1;
        r13 = true;
        r14 = true;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0154, code lost:
    
        if (r9 == 0) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r35) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC9934xb.j(int):void");
    }

    private final void k() {
        Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.tb
            @Override // java.lang.Runnable
            public final void run() {
                this.f78597a.d();
            }
        });
    }

    final Rect a(Rect rect) {
        return new Rect(h(rect.left), h(rect.top), h(rect.right), h(rect.bottom));
    }

    public final void c(InterfaceC9827wb interfaceC9827wb) {
        this.f79816m.add(interfaceC9827wb);
        j(3);
    }

    public final void e(InterfaceC9827wb interfaceC9827wb) {
        this.f79816m.remove(interfaceC9827wb);
    }

    public final void f() {
        this.f79813j.a(f79803p);
    }

    public final void g(long j10) {
        this.f79813j.a(j10);
    }

    public ViewOnAttachStateChangeListenerC9934xb(Context context, View view) {
        View view2;
        Context applicationContext = context.getApplicationContext();
        this.f79804a = applicationContext;
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        this.f79806c = windowManager;
        this.f79807d = (PowerManager) applicationContext.getSystemService("power");
        this.f79808e = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f79805b = application;
            this.f79812i = new C6852Jb(application, this);
        }
        this.f79817n = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f79818o = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.f79811h;
        if (weakReference != null) {
            view2 = (View) weakReference.get();
        } else {
            view2 = null;
        }
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m(view2);
        }
        this.f79811h = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                l(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final void l(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f79810g = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f79809f == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f79809f = new C9613ub(this);
            Lc.v.z().c(this.f79804a, this.f79809f, intentFilter);
        }
        Application application = this.f79805b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f79812i);
            } catch (Exception e10) {
                Qc.p.e("Error registering activity lifecycle callbacks.", e10);
            }
        }
    }
}
