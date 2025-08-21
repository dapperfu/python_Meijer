package Rc;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.C7536Zq;

/* renamed from: Rc.n0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5204n0 {

    /* renamed from: a, reason: collision with root package name */
    private final View f32383a;

    /* renamed from: b, reason: collision with root package name */
    private Activity f32384b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f32385c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f32386d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f32387e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f32388f;

    public final void a() {
        this.f32387e = false;
        h();
    }

    public final void b() {
        this.f32387e = true;
        if (this.f32386d) {
            g();
        }
    }

    public final void c() {
        this.f32386d = true;
        if (this.f32387e) {
            g();
        }
    }

    public final void d() {
        this.f32386d = false;
        h();
    }

    private final void g() {
        if (this.f32385c) {
            return;
        }
        Activity activity = this.f32384b;
        if (activity != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f32388f;
            ViewTreeObserver viewTreeObserverF = f(activity);
            if (viewTreeObserverF != null) {
                viewTreeObserverF.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        View view = this.f32383a;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.f32388f;
        Nc.v.B();
        C7536Zq.a(view, onGlobalLayoutListener2);
        this.f32385c = true;
    }

    private final void h() {
        Activity activity = this.f32384b;
        if (activity != null && this.f32385c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f32388f;
            ViewTreeObserver viewTreeObserverF = f(activity);
            if (viewTreeObserverF != null) {
                viewTreeObserverF.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f32385c = false;
        }
    }

    public final void e(Activity activity) {
        this.f32384b = activity;
    }

    public C5204n0(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f32384b = activity;
        this.f32383a = view;
        this.f32388f = onGlobalLayoutListener;
    }

    private static ViewTreeObserver f(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            return decorView.getViewTreeObserver();
        }
        return null;
    }
}
