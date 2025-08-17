package androidx.camera.core.impl;

import C.C2958a;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.impl.k;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface q extends v {

    /* renamed from: n, reason: collision with root package name */
    public static final k.a<Integer> f47451n = k.a.a("camerax.core.imageOutput.targetAspectRatio", C2958a.class);

    /* renamed from: o, reason: collision with root package name */
    public static final k.a<Integer> f47452o;

    /* renamed from: p, reason: collision with root package name */
    public static final k.a<Integer> f47453p;

    /* renamed from: q, reason: collision with root package name */
    public static final k.a<Integer> f47454q;

    /* renamed from: r, reason: collision with root package name */
    public static final k.a<Size> f47455r;

    /* renamed from: s, reason: collision with root package name */
    public static final k.a<Size> f47456s;

    /* renamed from: t, reason: collision with root package name */
    public static final k.a<Size> f47457t;

    /* renamed from: u, reason: collision with root package name */
    public static final k.a<List<Pair<Integer, Size[]>>> f47458u;

    /* renamed from: v, reason: collision with root package name */
    public static final k.a<R.c> f47459v;

    /* renamed from: w, reason: collision with root package name */
    public static final k.a<List<Size>> f47460w;

    static {
        Class cls = Integer.TYPE;
        f47452o = k.a.a("camerax.core.imageOutput.targetRotation", cls);
        f47453p = k.a.a("camerax.core.imageOutput.appTargetRotation", cls);
        f47454q = k.a.a("camerax.core.imageOutput.mirrorMode", cls);
        f47455r = k.a.a("camerax.core.imageOutput.targetResolution", Size.class);
        f47456s = k.a.a("camerax.core.imageOutput.defaultResolution", Size.class);
        f47457t = k.a.a("camerax.core.imageOutput.maxResolution", Size.class);
        f47458u = k.a.a("camerax.core.imageOutput.supportedResolutions", List.class);
        f47459v = k.a.a("camerax.core.imageOutput.resolutionSelector", R.c.class);
        f47460w = k.a.a("camerax.core.imageOutput.customOrderedResolutions", List.class);
    }

    default int C() {
        return ((Integer) a(f47451n)).intValue();
    }

    default R.c D(R.c cVar) {
        return (R.c) h(f47459v, cVar);
    }

    default int F(int i10) {
        return ((Integer) h(f47452o, Integer.valueOf(i10))).intValue();
    }

    default List<Size> I(List<Size> list) {
        List list2 = (List) h(f47460w, list);
        if (list2 != null) {
            return new ArrayList(list2);
        }
        return null;
    }

    default Size J(Size size) {
        return (Size) h(f47456s, size);
    }

    default Size N(Size size) {
        return (Size) h(f47455r, size);
    }

    default int X(int i10) {
        return ((Integer) h(f47454q, Integer.valueOf(i10))).intValue();
    }

    default Size j(Size size) {
        return (Size) h(f47457t, size);
    }

    default List<Pair<Integer, Size[]>> l(List<Pair<Integer, Size[]>> list) {
        return (List) h(f47458u, list);
    }

    default R.c m() {
        return (R.c) a(f47459v);
    }

    default int t(int i10) {
        return ((Integer) h(f47453p, Integer.valueOf(i10))).intValue();
    }

    default boolean z() {
        return c(f47451n);
    }

    static void w(q qVar) {
        boolean z10;
        boolean z11 = qVar.z();
        if (qVar.N(null) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 && z10) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (qVar.D(null) != null) {
            if (z11 || z10) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }
}
