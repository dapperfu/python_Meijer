package Iu;

import android.os.Handler;
import android.os.Looper;
import io.reactivex.t;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final t f15277a = Hu.a.d(new CallableC0246a());

    /* renamed from: Iu.a$a, reason: collision with other inner class name */
    static class CallableC0246a implements Callable<t> {
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t call() throws Exception {
            return b.f15278a;
        }

        CallableC0246a() {
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final t f15278a = new Iu.b(new Handler(Looper.getMainLooper()), false);
    }

    public static t a() {
        return Hu.a.e(f15277a);
    }
}
