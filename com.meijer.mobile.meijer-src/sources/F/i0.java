package F;

import F.c0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import o2.InterfaceC16068a;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f8728b = h0.b();

    /* renamed from: c, reason: collision with root package name */
    private static final i0 f8729c = new i0();

    /* renamed from: a, reason: collision with root package name */
    private final a0<h0> f8730a = a0.h(f8728b);

    private static class a<T> implements c0.a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC16068a<T> f8731a;

        @Override // F.c0.a
        public void a(T t10) {
            this.f8731a.accept(t10);
        }

        @Override // F.c0.a
        public void onError(Throwable th2) {
            C.P.d("ObserverToConsumerAdapter", "Unexpected error in Observable", th2);
        }

        a(InterfaceC16068a<T> interfaceC16068a) {
            this.f8731a = interfaceC16068a;
        }
    }

    public static i0 b() {
        return f8729c;
    }

    public h0 a() {
        try {
            return this.f8730a.c().get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e10);
        }
    }

    public void c(Executor executor, InterfaceC16068a<h0> interfaceC16068a) {
        this.f8730a.a(executor, new a(interfaceC16068a));
    }

    public void d(h0 h0Var) {
        this.f8730a.g(h0Var);
    }
}
