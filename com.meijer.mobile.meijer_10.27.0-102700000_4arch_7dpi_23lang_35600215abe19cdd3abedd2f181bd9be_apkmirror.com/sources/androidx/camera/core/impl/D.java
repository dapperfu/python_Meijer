package androidx.camera.core.impl;

import C.InterfaceC2980x;
import C.p0;
import android.util.Range;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.k;
import androidx.camera.core.impl.w;

/* loaded from: classes.dex */
public interface D<T extends p0> extends J.k<T>, p {

    /* renamed from: B, reason: collision with root package name */
    public static final k.a<Integer> f47320B;

    /* renamed from: C, reason: collision with root package name */
    public static final k.a<Range<Integer>> f47321C;

    /* renamed from: D, reason: collision with root package name */
    public static final k.a<Boolean> f47322D;

    /* renamed from: E, reason: collision with root package name */
    public static final k.a<Boolean> f47323E;

    /* renamed from: F, reason: collision with root package name */
    public static final k.a<E.b> f47324F;

    /* renamed from: G, reason: collision with root package name */
    public static final k.a<Integer> f47325G;

    /* renamed from: H, reason: collision with root package name */
    public static final k.a<Integer> f47326H;

    /* renamed from: x, reason: collision with root package name */
    public static final k.a<w> f47327x = k.a.a("camerax.core.useCase.defaultSessionConfig", w.class);

    /* renamed from: y, reason: collision with root package name */
    public static final k.a<i> f47328y = k.a.a("camerax.core.useCase.defaultCaptureConfig", i.class);

    /* renamed from: z, reason: collision with root package name */
    public static final k.a<w.e> f47329z = k.a.a("camerax.core.useCase.sessionConfigUnpacker", w.e.class);

    /* renamed from: A, reason: collision with root package name */
    public static final k.a<i.b> f47319A = k.a.a("camerax.core.useCase.captureConfigUnpacker", i.b.class);

    public interface a<T extends p0, C extends D<T>, B> extends InterfaceC2980x<T> {
        C b();
    }

    static {
        Class cls = Integer.TYPE;
        f47320B = k.a.a("camerax.core.useCase.surfaceOccupancyPriority", cls);
        f47321C = k.a.a("camerax.core.useCase.targetFrameRate", Range.class);
        Class cls2 = Boolean.TYPE;
        f47322D = k.a.a("camerax.core.useCase.zslDisabled", cls2);
        f47323E = k.a.a("camerax.core.useCase.highResolutionDisabled", cls2);
        f47324F = k.a.a("camerax.core.useCase.captureType", E.b.class);
        f47325G = k.a.a("camerax.core.useCase.previewStabilizationMode", cls);
        f47326H = k.a.a("camerax.core.useCase.videoStabilizationMode", cls);
    }

    default int B(int i10) {
        return ((Integer) h(f47320B, Integer.valueOf(i10))).intValue();
    }

    default int E() {
        return ((Integer) h(f47325G, 0)).intValue();
    }

    default w K() {
        return (w) a(f47327x);
    }

    default boolean L(boolean z10) {
        return ((Boolean) h(f47322D, Boolean.valueOf(z10))).booleanValue();
    }

    default E.b O() {
        return (E.b) a(f47324F);
    }

    default boolean U(boolean z10) {
        return ((Boolean) h(f47323E, Boolean.valueOf(z10))).booleanValue();
    }

    default w.e W(w.e eVar) {
        return (w.e) h(f47329z, eVar);
    }

    default w o(w wVar) {
        return (w) h(f47327x, wVar);
    }

    default i.b q(i.b bVar) {
        return (i.b) h(f47319A, bVar);
    }

    default i s(i iVar) {
        return (i) h(f47328y, iVar);
    }

    default int x() {
        return ((Integer) h(f47326H, 0)).intValue();
    }

    default Range<Integer> y(Range<Integer> range) {
        return (Range) h(f47321C, range);
    }
}
