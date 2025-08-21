package cg;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public class e implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"ThreadPoolCreation"})
    private final Handler f62456a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<View> f62457b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f62458c;

    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnDrawListener(e.this);
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public static void d(View view, Runnable runnable) {
        e eVar = new e(view, runnable);
        if (Build.VERSION.SDK_INT >= 26 || b(view)) {
            view.getViewTreeObserver().addOnDrawListener(eVar);
        } else {
            view.addOnAttachStateChangeListener(eVar.new a());
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View andSet = this.f62457b.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: cg.d
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                e.a(this.f62454a, andSet);
            }
        });
        this.f62456a.postAtFrontOfQueue(this.f62458c);
    }

    private e(View view, Runnable runnable) {
        this.f62457b = new AtomicReference<>(view);
        this.f62458c = runnable;
    }

    public static /* synthetic */ void a(e eVar, View view) {
        eVar.getClass();
        view.getViewTreeObserver().removeOnDrawListener(eVar);
    }

    private static boolean b(View view) {
        if (view.getViewTreeObserver().isAlive() && c(view)) {
            return true;
        }
        return false;
    }

    private static boolean c(View view) {
        return view.isAttachedToWindow();
    }
}
