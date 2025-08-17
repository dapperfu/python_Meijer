package ag;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public class h implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"ThreadPoolCreation"})
    private final Handler f45448a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<View> f45449b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f45450c;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f45451d;

    public static void a(View view, Runnable runnable, Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener(new h(view, runnable, runnable2));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        View andSet = this.f45449b.getAndSet(null);
        if (andSet == null) {
            return true;
        }
        andSet.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f45448a.post(this.f45450c);
        this.f45448a.postAtFrontOfQueue(this.f45451d);
        return true;
    }

    private h(View view, Runnable runnable, Runnable runnable2) {
        this.f45449b = new AtomicReference<>(view);
        this.f45450c = runnable;
        this.f45451d = runnable2;
    }
}
