package androidx.camera.core.impl;

import C.M;
import androidx.camera.core.f;
import androidx.camera.core.impl.k;

/* loaded from: classes.dex */
public final class n implements D<androidx.camera.core.f>, q, J.l {

    /* renamed from: J, reason: collision with root package name */
    public static final k.a<Integer> f47428J = k.a.a("camerax.core.imageAnalysis.backpressureStrategy", f.b.class);

    /* renamed from: K, reason: collision with root package name */
    public static final k.a<Integer> f47429K = k.a.a("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE);

    /* renamed from: L, reason: collision with root package name */
    public static final k.a<M> f47430L = k.a.a("camerax.core.imageAnalysis.imageReaderProxyProvider", M.class);

    /* renamed from: M, reason: collision with root package name */
    public static final k.a<Integer> f47431M = k.a.a("camerax.core.imageAnalysis.outputImageFormat", f.e.class);

    /* renamed from: N, reason: collision with root package name */
    public static final k.a<Boolean> f47432N = k.a.a("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class);

    /* renamed from: O, reason: collision with root package name */
    public static final k.a<Boolean> f47433O = k.a.a("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class);

    /* renamed from: I, reason: collision with root package name */
    private final t f47434I;

    @Override // androidx.camera.core.impl.p
    public int n() {
        return 35;
    }

    public int Y(int i10) {
        return ((Integer) h(f47428J, Integer.valueOf(i10))).intValue();
    }

    public int Z(int i10) {
        return ((Integer) h(f47429K, Integer.valueOf(i10))).intValue();
    }

    public M a0() {
        return (M) h(f47430L, null);
    }

    @Override // androidx.camera.core.impl.v
    public k b() {
        return this.f47434I;
    }

    public Boolean b0(Boolean bool) {
        return (Boolean) h(f47432N, bool);
    }

    public int c0(int i10) {
        return ((Integer) h(f47431M, Integer.valueOf(i10))).intValue();
    }

    public Boolean d0(Boolean bool) {
        return (Boolean) h(f47433O, bool);
    }

    public n(t tVar) {
        this.f47434I = tVar;
    }
}
