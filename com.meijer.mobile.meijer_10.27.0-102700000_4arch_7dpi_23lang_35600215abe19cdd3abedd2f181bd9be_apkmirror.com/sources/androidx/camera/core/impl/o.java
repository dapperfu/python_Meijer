package androidx.camera.core.impl;

import C.H;
import C.M;
import F.G;
import androidx.camera.core.impl.k;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o implements D<H>, q, J.f {

    /* renamed from: J, reason: collision with root package name */
    public static final k.a<Integer> f47435J;

    /* renamed from: K, reason: collision with root package name */
    public static final k.a<Integer> f47436K;

    /* renamed from: L, reason: collision with root package name */
    public static final k.a<G> f47437L;

    /* renamed from: M, reason: collision with root package name */
    public static final k.a<Integer> f47438M;

    /* renamed from: N, reason: collision with root package name */
    public static final k.a<Integer> f47439N;

    /* renamed from: O, reason: collision with root package name */
    public static final k.a<Integer> f47440O;

    /* renamed from: P, reason: collision with root package name */
    public static final k.a<M> f47441P;

    /* renamed from: Q, reason: collision with root package name */
    public static final k.a<Boolean> f47442Q;

    /* renamed from: R, reason: collision with root package name */
    public static final k.a<Integer> f47443R;

    /* renamed from: S, reason: collision with root package name */
    public static final k.a<Integer> f47444S;

    /* renamed from: T, reason: collision with root package name */
    public static final k.a<H.i> f47445T;

    /* renamed from: U, reason: collision with root package name */
    public static final k.a<R.c> f47446U;

    /* renamed from: V, reason: collision with root package name */
    public static final k.a<Boolean> f47447V;

    /* renamed from: I, reason: collision with root package name */
    private final t f47448I;

    static {
        Class cls = Integer.TYPE;
        f47435J = k.a.a("camerax.core.imageCapture.captureMode", cls);
        f47436K = k.a.a("camerax.core.imageCapture.flashMode", cls);
        f47437L = k.a.a("camerax.core.imageCapture.captureBundle", G.class);
        f47438M = k.a.a("camerax.core.imageCapture.bufferFormat", Integer.class);
        f47439N = k.a.a("camerax.core.imageCapture.outputFormat", Integer.class);
        f47440O = k.a.a("camerax.core.imageCapture.maxCaptureStages", Integer.class);
        f47441P = k.a.a("camerax.core.imageCapture.imageReaderProxyProvider", M.class);
        f47442Q = k.a.a("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE);
        f47443R = k.a.a("camerax.core.imageCapture.flashType", cls);
        f47444S = k.a.a("camerax.core.imageCapture.jpegCompressionQuality", cls);
        f47445T = k.a.a("camerax.core.imageCapture.screenFlash", H.i.class);
        f47446U = k.a.a("camerax.core.useCase.postviewResolutionSelector", R.c.class);
        f47447V = k.a.a("camerax.core.useCase.isPostviewEnabled", Boolean.class);
    }

    public G Y(G g10) {
        return (G) h(f47437L, g10);
    }

    public int Z() {
        return ((Integer) a(f47435J)).intValue();
    }

    public int a0(int i10) {
        return ((Integer) h(f47436K, Integer.valueOf(i10))).intValue();
    }

    @Override // androidx.camera.core.impl.v
    public k b() {
        return this.f47448I;
    }

    public int b0(int i10) {
        return ((Integer) h(f47443R, Integer.valueOf(i10))).intValue();
    }

    public M c0() {
        return (M) h(f47441P, null);
    }

    public Executor d0(Executor executor) {
        return (Executor) h(J.f.f14457a, executor);
    }

    public H.i e0() {
        return (H.i) h(f47445T, null);
    }

    public boolean f0() {
        return c(f47435J);
    }

    @Override // androidx.camera.core.impl.p
    public int n() {
        return ((Integer) a(p.f47449l)).intValue();
    }

    public o(t tVar) {
        this.f47448I = tVar;
    }
}
