package F;

import F.c0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import o2.InterfaceC15993a;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f9961b = h0.b();

    /* renamed from: c, reason: collision with root package name */
    private static final i0 f9962c = new i0();

    /* renamed from: a, reason: collision with root package name */
    private final a0<h0> f9963a = a0.h(f9961b);

    private static class a<T> implements c0.a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC15993a<T> f9964a;

        @Override // F.c0.a
        public void a(T t10) {
            this.f9964a.accept(t10);
        }

        @Override // F.c0.a
        public void onError(Throwable th2) {
            C.P.d("ObserverToConsumerAdapter", "Unexpected error in Observable", th2);
        }

        a(InterfaceC15993a<T> interfaceC15993a) {
            this.f9964a = interfaceC15993a;
        }
    }

    public static i0 b() {
        return f9962c;
    }

    public h0 a() {
        try {
            return this.f9963a.c().get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e10);
        }
    }

    public void c(Executor executor, InterfaceC15993a<h0> interfaceC15993a) {
        this.f9963a.a(executor, new a(interfaceC15993a));
    }

    public void d(h0 h0Var) {
        this.f9963a.g(h0Var);
    }
}
