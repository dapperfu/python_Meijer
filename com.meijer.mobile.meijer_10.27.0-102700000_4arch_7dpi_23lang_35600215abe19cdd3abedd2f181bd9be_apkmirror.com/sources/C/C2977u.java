package C;

import F.InterfaceC3625w;
import F.InterfaceC3626x;
import android.os.Handler;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.k;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: C.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2977u implements J.k<C2976t> {

    /* renamed from: J, reason: collision with root package name */
    static final k.a<InterfaceC3626x.a> f3519J = k.a.a("camerax.core.appConfig.cameraFactoryProvider", InterfaceC3626x.a.class);

    /* renamed from: K, reason: collision with root package name */
    static final k.a<InterfaceC3625w.a> f3520K = k.a.a("camerax.core.appConfig.deviceSurfaceManagerProvider", InterfaceC3625w.a.class);

    /* renamed from: L, reason: collision with root package name */
    static final k.a<E.c> f3521L = k.a.a("camerax.core.appConfig.useCaseConfigFactoryProvider", E.c.class);

    /* renamed from: M, reason: collision with root package name */
    static final k.a<Executor> f3522M = k.a.a("camerax.core.appConfig.cameraExecutor", Executor.class);

    /* renamed from: N, reason: collision with root package name */
    static final k.a<Handler> f3523N = k.a.a("camerax.core.appConfig.schedulerHandler", Handler.class);

    /* renamed from: O, reason: collision with root package name */
    static final k.a<Integer> f3524O = k.a.a("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE);

    /* renamed from: P, reason: collision with root package name */
    static final k.a<C2972o> f3525P = k.a.a("camerax.core.appConfig.availableCamerasLimiter", C2972o.class);

    /* renamed from: Q, reason: collision with root package name */
    static final k.a<Long> f3526Q = k.a.a("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE);

    /* renamed from: R, reason: collision with root package name */
    static final k.a<a0> f3527R = k.a.a("camerax.core.appConfig.cameraProviderInitRetryPolicy", a0.class);

    /* renamed from: S, reason: collision with root package name */
    static final k.a<F.h0> f3528S = k.a.a("camerax.core.appConfig.quirksSettings", F.h0.class);

    /* renamed from: I, reason: collision with root package name */
    private final androidx.camera.core.impl.t f3529I;

    /* renamed from: C.u$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.camera.core.impl.s f3530a;

        public a() {
            this(androidx.camera.core.impl.s.b0());
        }

        private a(androidx.camera.core.impl.s sVar) {
            this.f3530a = sVar;
            Class cls = (Class) sVar.h(J.k.f14474c, null);
            if (cls == null || cls.equals(C2976t.class)) {
                e(C2976t.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        private androidx.camera.core.impl.r b() {
            return this.f3530a;
        }

        public C2977u a() {
            return new C2977u(androidx.camera.core.impl.t.a0(this.f3530a));
        }

        public a c(InterfaceC3626x.a aVar) {
            b().r(C2977u.f3519J, aVar);
            return this;
        }

        public a d(InterfaceC3625w.a aVar) {
            b().r(C2977u.f3520K, aVar);
            return this;
        }

        public a e(Class<C2976t> cls) {
            b().r(J.k.f14474c, cls);
            if (b().h(J.k.f14473b, null) == null) {
                f(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public a f(String str) {
            b().r(J.k.f14473b, str);
            return this;
        }

        public a g(E.c cVar) {
            b().r(C2977u.f3521L, cVar);
            return this;
        }
    }

    /* renamed from: C.u$b */
    public interface b {
        C2977u getCameraXConfig();
    }

    public C2972o Y(C2972o c2972o) {
        return (C2972o) this.f3529I.h(f3525P, c2972o);
    }

    public Executor Z(Executor executor) {
        return (Executor) this.f3529I.h(f3522M, executor);
    }

    public InterfaceC3626x.a a0(InterfaceC3626x.a aVar) {
        return (InterfaceC3626x.a) this.f3529I.h(f3519J, aVar);
    }

    @Override // androidx.camera.core.impl.v
    public androidx.camera.core.impl.k b() {
        return this.f3529I;
    }

    public long b0() {
        return ((Long) this.f3529I.h(f3526Q, -1L)).longValue();
    }

    public a0 c0() {
        a0 a0Var = (a0) this.f3529I.h(f3527R, a0.f3341b);
        Objects.requireNonNull(a0Var);
        return a0Var;
    }

    public InterfaceC3625w.a d0(InterfaceC3625w.a aVar) {
        return (InterfaceC3625w.a) this.f3529I.h(f3520K, aVar);
    }

    public F.h0 e0() {
        return (F.h0) this.f3529I.h(f3528S, null);
    }

    public Handler f0(Handler handler) {
        return (Handler) this.f3529I.h(f3523N, handler);
    }

    public E.c g0(E.c cVar) {
        return (E.c) this.f3529I.h(f3521L, cVar);
    }

    C2977u(androidx.camera.core.impl.t tVar) {
        this.f3529I = tVar;
    }
}
