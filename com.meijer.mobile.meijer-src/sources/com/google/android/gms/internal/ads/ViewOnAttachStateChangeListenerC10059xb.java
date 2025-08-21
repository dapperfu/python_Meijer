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
public final class ViewOnAttachStateChangeListenerC10059xb implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: p, reason: collision with root package name */
    private static final long f80643p = ((Long) Oc.A.c().a(C8784lf.f77385v1)).longValue();

    /* renamed from: a, reason: collision with root package name */
    private final Context f80644a;

    /* renamed from: b, reason: collision with root package name */
    private Application f80645b;

    /* renamed from: c, reason: collision with root package name */
    private final WindowManager f80646c;

    /* renamed from: d, reason: collision with root package name */
    private final PowerManager f80647d;

    /* renamed from: e, reason: collision with root package name */
    private final KeyguardManager f80648e;

    /* renamed from: f, reason: collision with root package name */
    BroadcastReceiver f80649f;

    /* renamed from: g, reason: collision with root package name */
    private WeakReference f80650g;

    /* renamed from: h, reason: collision with root package name */
    final WeakReference f80651h;

    /* renamed from: i, reason: collision with root package name */
    private C6977Jb f80652i;

    /* renamed from: j, reason: collision with root package name */
    private final Rc.Z f80653j = new Rc.Z(f80643p);

    /* renamed from: k, reason: collision with root package name */
    private boolean f80654k = false;

    /* renamed from: l, reason: collision with root package name */
    private int f80655l = -1;

    /* renamed from: m, reason: collision with root package name */
    private final HashSet f80656m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    private final DisplayMetrics f80657n;

    /* renamed from: o, reason: collision with root package name */
    private final Rect f80658o;

    private final int h(int i10) {
        return (int) (i10 / this.f80657n.density);
    }

    private final void m(View view) {
        try {
            WeakReference weakReference = this.f80650g;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f80650g = null;
            }
        } catch (Exception e10) {
            Sc.p.e("Error while unregistering listeners from the last ViewTreeObserver.", e10);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e11) {
            Sc.p.e("Error while unregistering listeners from the ViewTreeObserver.", e11);
        }
        if (this.f80649f != null) {
            try {
                Nc.v.z().d(this.f80644a, this.f80649f);
            } catch (IllegalStateException e12) {
                Sc.p.e("Failed trying to unregister the receiver", e12);
            } catch (Exception e13) {
                Nc.v.s().x(e13, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f80649f = null;
        }
        Application application = this.f80645b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f80652i);
            } catch (Exception e14) {
                Sc.p.e("Error registering activity lifecycle callbacks.", e14);
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
        this.f80655l = -1;
        l(view);
        j(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f80655l = -1;
        j(3);
        k();
        m(view);
    }

    private final void i(Activity activity, int i10) {
        Window window;
        if (this.f80651h == null || (window = activity.getWindow()) == null) {
            return;
        }
        WeakReference weakReference = this.f80651h;
        View viewPeekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f80655l = i10;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC10059xb.j(int):void");
    }

    private final void k() {
        Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.tb
            @Override // java.lang.Runnable
            public final void run() {
                this.f79437a.d();
            }
        });
    }

    final Rect a(Rect rect) {
        return new Rect(h(rect.left), h(rect.top), h(rect.right), h(rect.bottom));
    }

    public final void c(InterfaceC9952wb interfaceC9952wb) {
        this.f80656m.add(interfaceC9952wb);
        j(3);
    }

    public final void e(InterfaceC9952wb interfaceC9952wb) {
        this.f80656m.remove(interfaceC9952wb);
    }

    public final void f() {
        this.f80653j.a(f80643p);
    }

    public final void g(long j10) {
        this.f80653j.a(j10);
    }

    public ViewOnAttachStateChangeListenerC10059xb(Context context, View view) {
        View view2;
        Context applicationContext = context.getApplicationContext();
        this.f80644a = applicationContext;
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        this.f80646c = windowManager;
        this.f80647d = (PowerManager) applicationContext.getSystemService("power");
        this.f80648e = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f80645b = application;
            this.f80652i = new C6977Jb(application, this);
        }
        this.f80657n = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f80658o = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.f80651h;
        if (weakReference != null) {
            view2 = (View) weakReference.get();
        } else {
            view2 = null;
        }
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m(view2);
        }
        this.f80651h = new WeakReference(view);
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
            this.f80650g = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f80649f == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f80649f = new C9738ub(this);
            Nc.v.z().c(this.f80644a, this.f80649f, intentFilter);
        }
        Application application = this.f80645b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f80652i);
            } catch (Exception e10) {
                Sc.p.e("Error registering activity lifecycle callbacks.", e10);
            }
        }
    }
}
