package p2;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class J implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final View f156013a;

    /* renamed from: b, reason: collision with root package name */
    private ViewTreeObserver f156014b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f156015c;

    public static J a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        J j10 = new J(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(j10);
        view.addOnAttachStateChangeListener(j10);
        return j10;
    }

    public void b() {
        if (this.f156014b.isAlive()) {
            this.f156014b.removeOnPreDrawListener(this);
        } else {
            this.f156013a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f156013a.removeOnAttachStateChangeListener(this);
    }

    private J(View view, Runnable runnable) {
        this.f156013a = view;
        this.f156014b = view.getViewTreeObserver();
        this.f156015c = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f156015c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f156014b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
