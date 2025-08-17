package j7;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bumptech.glide.load.resource.bitmap.x;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    final Set<Activity> f139493a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f139494b;

    class a implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f139495a;

        /* renamed from: j7.h$a$a, reason: collision with other inner class name */
        class RunnableC2206a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnDrawListener f139497a;

            RunnableC2206a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f139497a = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                x.b().h();
                h.this.f139494b = true;
                h.b(a.this.f139495a, this.f139497a);
                h.this.f139493a.clear();
            }
        }

        a(View view) {
            this.f139495a = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            p7.l.u(new RunnableC2206a(this));
        }
    }

    @Override // j7.i
    public void a(Activity activity) {
        if (!this.f139494b && this.f139493a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }

    h() {
    }

    static void b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }
}
