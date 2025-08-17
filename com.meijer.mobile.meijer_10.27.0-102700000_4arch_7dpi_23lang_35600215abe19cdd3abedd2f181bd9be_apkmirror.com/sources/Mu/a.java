package Mu;

import android.os.Handler;
import android.os.Looper;
import io.reactivex.t;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final t f21232a = Lu.a.d(new CallableC0334a());

    /* renamed from: Mu.a$a, reason: collision with other inner class name */
    static class CallableC0334a implements Callable<t> {
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t call() throws Exception {
            return b.f21233a;
        }

        CallableC0334a() {
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final t f21233a = new Mu.b(new Handler(Looper.getMainLooper()), false);
    }

    public static t a() {
        return Lu.a.e(f21232a);
    }
}
