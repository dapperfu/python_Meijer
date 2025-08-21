package androidx.camera.core.impl;

import F.Q;
import F.r0;
import androidx.camera.core.impl.k;

/* loaded from: classes.dex */
public interface f extends v {

    /* renamed from: e, reason: collision with root package name */
    public static final k.a<E> f47609e = k.a.a("camerax.core.camera.useCaseConfigFactory", E.class);

    /* renamed from: f, reason: collision with root package name */
    public static final k.a<Q> f47610f = k.a.a("camerax.core.camera.compatibilityId", Q.class);

    /* renamed from: g, reason: collision with root package name */
    public static final k.a<Integer> f47611g = k.a.a("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class);

    /* renamed from: h, reason: collision with root package name */
    public static final k.a<r0> f47612h = k.a.a("camerax.core.camera.SessionProcessor", r0.class);

    /* renamed from: i, reason: collision with root package name */
    public static final k.a<Boolean> f47613i = k.a.a("camerax.core.camera.isZslDisabled", Boolean.class);

    /* renamed from: j, reason: collision with root package name */
    public static final k.a<Boolean> f47614j = k.a.a("camerax.core.camera.isPostviewSupported", Boolean.class);

    /* renamed from: k, reason: collision with root package name */
    public static final k.a<Boolean> f47615k = k.a.a("camerax.core.camera.isCaptureProcessProgressSupported", Boolean.class);

    Q S();

    default boolean M() {
        return ((Boolean) h(f47614j, Boolean.FALSE)).booleanValue();
    }

    default r0 R(r0 r0Var) {
        return (r0) h(f47612h, r0Var);
    }

    default boolean T() {
        return ((Boolean) h(f47615k, Boolean.FALSE)).booleanValue();
    }

    default E k() {
        return (E) h(f47609e, E.f47569a);
    }

    default int v() {
        return ((Integer) h(f47611g, 0)).intValue();
    }
}
