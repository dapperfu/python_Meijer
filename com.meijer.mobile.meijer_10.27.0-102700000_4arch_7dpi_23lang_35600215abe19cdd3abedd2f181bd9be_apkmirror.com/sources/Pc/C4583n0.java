package Pc;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.C7411Zq;

/* renamed from: Pc.n0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4583n0 {

    /* renamed from: a, reason: collision with root package name */
    private final View f25169a;

    /* renamed from: b, reason: collision with root package name */
    private Activity f25170b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f25171c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f25172d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f25173e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f25174f;

    public final void a() {
        this.f25173e = false;
        h();
    }

    public final void b() {
        this.f25173e = true;
        if (this.f25172d) {
            g();
        }
    }

    public final void c() {
        this.f25172d = true;
        if (this.f25173e) {
            g();
        }
    }

    public final void d() {
        this.f25172d = false;
        h();
    }

    private final void g() {
        if (this.f25171c) {
            return;
        }
        Activity activity = this.f25170b;
        if (activity != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f25174f;
            ViewTreeObserver viewTreeObserverF = f(activity);
            if (viewTreeObserverF != null) {
                viewTreeObserverF.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        View view = this.f25169a;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.f25174f;
        Lc.v.B();
        C7411Zq.a(view, onGlobalLayoutListener2);
        this.f25171c = true;
    }

    private final void h() {
        Activity activity = this.f25170b;
        if (activity != null && this.f25171c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f25174f;
            ViewTreeObserver viewTreeObserverF = f(activity);
            if (viewTreeObserverF != null) {
                viewTreeObserverF.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f25171c = false;
        }
    }

    public final void e(Activity activity) {
        this.f25170b = activity;
    }

    public C4583n0(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f25170b = activity;
        this.f25169a = view;
        this.f25174f = onGlobalLayoutListener;
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
