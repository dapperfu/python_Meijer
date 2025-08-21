package androidx.camera.core.impl;

import C.H;
import C.M;
import F.G;
import androidx.camera.core.impl.k;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o implements D<H>, q, J.f {

    /* renamed from: J, reason: collision with root package name */
    public static final k.a<Integer> f47659J;

    /* renamed from: K, reason: collision with root package name */
    public static final k.a<Integer> f47660K;

    /* renamed from: L, reason: collision with root package name */
    public static final k.a<G> f47661L;

    /* renamed from: M, reason: collision with root package name */
    public static final k.a<Integer> f47662M;

    /* renamed from: N, reason: collision with root package name */
    public static final k.a<Integer> f47663N;

    /* renamed from: O, reason: collision with root package name */
    public static final k.a<Integer> f47664O;

    /* renamed from: P, reason: collision with root package name */
    public static final k.a<M> f47665P;

    /* renamed from: Q, reason: collision with root package name */
    public static final k.a<Boolean> f47666Q;

    /* renamed from: R, reason: collision with root package name */
    public static final k.a<Integer> f47667R;

    /* renamed from: S, reason: collision with root package name */
    public static final k.a<Integer> f47668S;

    /* renamed from: T, reason: collision with root package name */
    public static final k.a<H.i> f47669T;

    /* renamed from: U, reason: collision with root package name */
    public static final k.a<R.c> f47670U;

    /* renamed from: V, reason: collision with root package name */
    public static final k.a<Boolean> f47671V;

    /* renamed from: I, reason: collision with root package name */
    private final t f47672I;

    static {
        Class cls = Integer.TYPE;
        f47659J = k.a.a("camerax.core.imageCapture.captureMode", cls);
        f47660K = k.a.a("camerax.core.imageCapture.flashMode", cls);
        f47661L = k.a.a("camerax.core.imageCapture.captureBundle", G.class);
        f47662M = k.a.a("camerax.core.imageCapture.bufferFormat", Integer.class);
        f47663N = k.a.a("camerax.core.imageCapture.outputFormat", Integer.class);
        f47664O = k.a.a("camerax.core.imageCapture.maxCaptureStages", Integer.class);
        f47665P = k.a.a("camerax.core.imageCapture.imageReaderProxyProvider", M.class);
        f47666Q = k.a.a("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE);
        f47667R = k.a.a("camerax.core.imageCapture.flashType", cls);
        f47668S = k.a.a("camerax.core.imageCapture.jpegCompressionQuality", cls);
        f47669T = k.a.a("camerax.core.imageCapture.screenFlash", H.i.class);
        f47670U = k.a.a("camerax.core.useCase.postviewResolutionSelector", R.c.class);
        f47671V = k.a.a("camerax.core.useCase.isPostviewEnabled", Boolean.class);
    }

    public G Y(G g10) {
        return (G) h(f47661L, g10);
    }

    public int Z() {
        return ((Integer) a(f47659J)).intValue();
    }

    public int a0(int i10) {
        return ((Integer) h(f47660K, Integer.valueOf(i10))).intValue();
    }

    @Override // androidx.camera.core.impl.v
    public k b() {
        return this.f47672I;
    }

    public int b0(int i10) {
        return ((Integer) h(f47667R, Integer.valueOf(i10))).intValue();
    }

    public M c0() {
        return (M) h(f47665P, null);
    }

    public Executor d0(Executor executor) {
        return (Executor) h(J.f.f15304a, executor);
    }

    public H.i e0() {
        return (H.i) h(f47669T, null);
    }

    public boolean f0() {
        return c(f47659J);
    }

    @Override // androidx.camera.core.impl.p
    public int n() {
        return ((Integer) a(p.f47673l)).intValue();
    }

    public o(t tVar) {
        this.f47672I = tVar;
    }
}
