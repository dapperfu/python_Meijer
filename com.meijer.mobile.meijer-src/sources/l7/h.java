package l7;

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
    final Set<Activity> f149509a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f149510b;

    class a implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f149511a;

        /* renamed from: l7.h$a$a, reason: collision with other inner class name */
        class RunnableC2296a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnDrawListener f149513a;

            RunnableC2296a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f149513a = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                x.b().h();
                h.this.f149510b = true;
                h.b(a.this.f149511a, this.f149513a);
                h.this.f149509a.clear();
            }
        }

        a(View view) {
            this.f149511a = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            r7.l.u(new RunnableC2296a(this));
        }
    }

    @Override // l7.i
    public void a(Activity activity) {
        if (!this.f149510b && this.f149509a.add(activity)) {
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
