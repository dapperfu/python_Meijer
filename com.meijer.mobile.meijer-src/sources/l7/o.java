package l7;

import Z.C5603a;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.load.resource.bitmap.x;

/* loaded from: classes4.dex */
public class o implements Handler.Callback {

    /* renamed from: f, reason: collision with root package name */
    private static final b f149523f = new a();

    /* renamed from: a, reason: collision with root package name */
    private volatile com.bumptech.glide.k f149524a;

    /* renamed from: b, reason: collision with root package name */
    private final b f149525b;

    /* renamed from: c, reason: collision with root package name */
    private final C5603a<View, Fragment> f149526c = new C5603a<>();

    /* renamed from: d, reason: collision with root package name */
    private final i f149527d;

    /* renamed from: e, reason: collision with root package name */
    private final m f149528e;

    class a implements b {
        @Override // l7.o.b
        public com.bumptech.glide.k a(com.bumptech.glide.b bVar, j jVar, p pVar, Context context) {
            return new com.bumptech.glide.k(bVar, jVar, pVar, context);
        }

        a() {
        }
    }

    public interface b {
        com.bumptech.glide.k a(com.bumptech.glide.b bVar, j jVar, p pVar, Context context);
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public boolean handleMessage(Message message) {
        return false;
    }

    private static i b() {
        return (x.f64941f && x.f64940e) ? new h() : new f();
    }

    private static Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private com.bumptech.glide.k g(Context context) {
        if (this.f149524a == null) {
            synchronized (this) {
                try {
                    if (this.f149524a == null) {
                        this.f149524a = this.f149525b.a(com.bumptech.glide.b.c(context.getApplicationContext()), new C15470a(), new g(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f149524a;
    }

    public com.bumptech.glide.k d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (r7.l.r() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return f((FragmentActivity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return d(contextWrapper.getBaseContext());
                }
            }
        }
        return g(context);
    }

    public o(b bVar) {
        bVar = bVar == null ? f149523f : bVar;
        this.f149525b = bVar;
        this.f149528e = new m(bVar);
        this.f149527d = b();
    }

    @TargetApi(17)
    private static void a(Activity activity) {
        if (!activity.isDestroyed()) {
        } else {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static boolean h(Context context) {
        Activity activityC = c(context);
        if (activityC != null && activityC.isFinishing()) {
            return false;
        }
        return true;
    }

    public com.bumptech.glide.k e(Fragment fragment) {
        r7.k.e(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (r7.l.q()) {
            return d(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f149527d.a(fragment.getActivity());
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        return this.f149528e.b(context, com.bumptech.glide.b.c(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }

    public com.bumptech.glide.k f(FragmentActivity fragmentActivity) {
        if (r7.l.q()) {
            return d(fragmentActivity.getApplicationContext());
        }
        a(fragmentActivity);
        this.f149527d.a(fragmentActivity);
        boolean zH = h(fragmentActivity);
        return this.f149528e.b(fragmentActivity, com.bumptech.glide.b.c(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), zH);
    }
}
