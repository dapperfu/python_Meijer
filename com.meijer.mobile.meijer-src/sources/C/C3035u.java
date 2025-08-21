package C;

import F.InterfaceC3287w;
import F.InterfaceC3288x;
import android.os.Handler;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.k;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: C.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3035u implements J.k<C3034t> {

    /* renamed from: J, reason: collision with root package name */
    static final k.a<InterfaceC3288x.a> f3977J = k.a.a("camerax.core.appConfig.cameraFactoryProvider", InterfaceC3288x.a.class);

    /* renamed from: K, reason: collision with root package name */
    static final k.a<InterfaceC3287w.a> f3978K = k.a.a("camerax.core.appConfig.deviceSurfaceManagerProvider", InterfaceC3287w.a.class);

    /* renamed from: L, reason: collision with root package name */
    static final k.a<E.c> f3979L = k.a.a("camerax.core.appConfig.useCaseConfigFactoryProvider", E.c.class);

    /* renamed from: M, reason: collision with root package name */
    static final k.a<Executor> f3980M = k.a.a("camerax.core.appConfig.cameraExecutor", Executor.class);

    /* renamed from: N, reason: collision with root package name */
    static final k.a<Handler> f3981N = k.a.a("camerax.core.appConfig.schedulerHandler", Handler.class);

    /* renamed from: O, reason: collision with root package name */
    static final k.a<Integer> f3982O = k.a.a("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE);

    /* renamed from: P, reason: collision with root package name */
    static final k.a<C3030o> f3983P = k.a.a("camerax.core.appConfig.availableCamerasLimiter", C3030o.class);

    /* renamed from: Q, reason: collision with root package name */
    static final k.a<Long> f3984Q = k.a.a("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE);

    /* renamed from: R, reason: collision with root package name */
    static final k.a<a0> f3985R = k.a.a("camerax.core.appConfig.cameraProviderInitRetryPolicy", a0.class);

    /* renamed from: S, reason: collision with root package name */
    static final k.a<F.h0> f3986S = k.a.a("camerax.core.appConfig.quirksSettings", F.h0.class);

    /* renamed from: I, reason: collision with root package name */
    private final androidx.camera.core.impl.t f3987I;

    /* renamed from: C.u$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.camera.core.impl.s f3988a;

        public a() {
            this(androidx.camera.core.impl.s.b0());
        }

        private a(androidx.camera.core.impl.s sVar) {
            this.f3988a = sVar;
            Class cls = (Class) sVar.h(J.k.f15321c, null);
            if (cls == null || cls.equals(C3034t.class)) {
                e(C3034t.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        private androidx.camera.core.impl.r b() {
            return this.f3988a;
        }

        public C3035u a() {
            return new C3035u(androidx.camera.core.impl.t.a0(this.f3988a));
        }

        public a c(InterfaceC3288x.a aVar) {
            b().r(C3035u.f3977J, aVar);
            return this;
        }

        public a d(InterfaceC3287w.a aVar) {
            b().r(C3035u.f3978K, aVar);
            return this;
        }

        public a e(Class<C3034t> cls) {
            b().r(J.k.f15321c, cls);
            if (b().h(J.k.f15320b, null) == null) {
                f(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public a f(String str) {
            b().r(J.k.f15320b, str);
            return this;
        }

        public a g(E.c cVar) {
            b().r(C3035u.f3979L, cVar);
            return this;
        }
    }

    /* renamed from: C.u$b */
    public interface b {
        C3035u getCameraXConfig();
    }

    public C3030o Y(C3030o c3030o) {
        return (C3030o) this.f3987I.h(f3983P, c3030o);
    }

    public Executor Z(Executor executor) {
        return (Executor) this.f3987I.h(f3980M, executor);
    }

    public InterfaceC3288x.a a0(InterfaceC3288x.a aVar) {
        return (InterfaceC3288x.a) this.f3987I.h(f3977J, aVar);
    }

    @Override // androidx.camera.core.impl.v
    public androidx.camera.core.impl.k b() {
        return this.f3987I;
    }

    public long b0() {
        return ((Long) this.f3987I.h(f3984Q, -1L)).longValue();
    }

    public a0 c0() {
        a0 a0Var = (a0) this.f3987I.h(f3985R, a0.f3799b);
        Objects.requireNonNull(a0Var);
        return a0Var;
    }

    public InterfaceC3287w.a d0(InterfaceC3287w.a aVar) {
        return (InterfaceC3287w.a) this.f3987I.h(f3978K, aVar);
    }

    public F.h0 e0() {
        return (F.h0) this.f3987I.h(f3986S, null);
    }

    public Handler f0(Handler handler) {
        return (Handler) this.f3987I.h(f3981N, handler);
    }

    public E.c g0(E.c cVar) {
        return (E.c) this.f3987I.h(f3979L, cVar);
    }

    C3035u(androidx.camera.core.impl.t tVar) {
        this.f3987I = tVar;
    }
}
