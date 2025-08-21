package cg;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public class h implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"ThreadPoolCreation"})
    private final Handler f62463a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<View> f62464b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f62465c;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f62466d;

    public static void a(View view, Runnable runnable, Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener(new h(view, runnable, runnable2));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        View andSet = this.f62464b.getAndSet(null);
        if (andSet == null) {
            return true;
        }
        andSet.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f62463a.post(this.f62465c);
        this.f62463a.postAtFrontOfQueue(this.f62466d);
        return true;
    }

    private h(View view, Runnable runnable, Runnable runnable2) {
        this.f62464b = new AtomicReference<>(view);
        this.f62465c = runnable;
        this.f62466d = runnable2;
    }
}
