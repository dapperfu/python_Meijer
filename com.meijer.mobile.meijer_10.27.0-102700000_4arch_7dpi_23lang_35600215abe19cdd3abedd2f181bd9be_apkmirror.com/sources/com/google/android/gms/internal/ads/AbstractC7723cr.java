package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.cr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC7723cr {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f73266a;

    protected abstract void a(ViewTreeObserver viewTreeObserver);

    protected abstract void b(ViewTreeObserver viewTreeObserver);

    protected final ViewTreeObserver c() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.f73266a.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    public AbstractC7723cr(View view) {
        this.f73266a = new WeakReference(view);
    }

    public final void d() {
        ViewTreeObserver viewTreeObserverC = c();
        if (viewTreeObserverC != null) {
            a(viewTreeObserverC);
        }
    }

    public final void e() {
        ViewTreeObserver viewTreeObserverC = c();
        if (viewTreeObserverC != null) {
            b(viewTreeObserverC);
        }
    }
}
