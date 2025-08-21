package androidx.camera.core.impl;

import C.C3016a;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.impl.k;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface q extends v {

    /* renamed from: n, reason: collision with root package name */
    public static final k.a<Integer> f47675n = k.a.a("camerax.core.imageOutput.targetAspectRatio", C3016a.class);

    /* renamed from: o, reason: collision with root package name */
    public static final k.a<Integer> f47676o;

    /* renamed from: p, reason: collision with root package name */
    public static final k.a<Integer> f47677p;

    /* renamed from: q, reason: collision with root package name */
    public static final k.a<Integer> f47678q;

    /* renamed from: r, reason: collision with root package name */
    public static final k.a<Size> f47679r;

    /* renamed from: s, reason: collision with root package name */
    public static final k.a<Size> f47680s;

    /* renamed from: t, reason: collision with root package name */
    public static final k.a<Size> f47681t;

    /* renamed from: u, reason: collision with root package name */
    public static final k.a<List<Pair<Integer, Size[]>>> f47682u;

    /* renamed from: v, reason: collision with root package name */
    public static final k.a<R.c> f47683v;

    /* renamed from: w, reason: collision with root package name */
    public static final k.a<List<Size>> f47684w;

    static {
        Class cls = Integer.TYPE;
        f47676o = k.a.a("camerax.core.imageOutput.targetRotation", cls);
        f47677p = k.a.a("camerax.core.imageOutput.appTargetRotation", cls);
        f47678q = k.a.a("camerax.core.imageOutput.mirrorMode", cls);
        f47679r = k.a.a("camerax.core.imageOutput.targetResolution", Size.class);
        f47680s = k.a.a("camerax.core.imageOutput.defaultResolution", Size.class);
        f47681t = k.a.a("camerax.core.imageOutput.maxResolution", Size.class);
        f47682u = k.a.a("camerax.core.imageOutput.supportedResolutions", List.class);
        f47683v = k.a.a("camerax.core.imageOutput.resolutionSelector", R.c.class);
        f47684w = k.a.a("camerax.core.imageOutput.customOrderedResolutions", List.class);
    }

    default int C() {
        return ((Integer) a(f47675n)).intValue();
    }

    default R.c D(R.c cVar) {
        return (R.c) h(f47683v, cVar);
    }

    default int F(int i10) {
        return ((Integer) h(f47676o, Integer.valueOf(i10))).intValue();
    }

    default List<Size> I(List<Size> list) {
        List list2 = (List) h(f47684w, list);
        if (list2 != null) {
            return new ArrayList(list2);
        }
        return null;
    }

    default Size J(Size size) {
        return (Size) h(f47680s, size);
    }

    default Size N(Size size) {
        return (Size) h(f47679r, size);
    }

    default int X(int i10) {
        return ((Integer) h(f47678q, Integer.valueOf(i10))).intValue();
    }

    default Size j(Size size) {
        return (Size) h(f47681t, size);
    }

    default List<Pair<Integer, Size[]>> l(List<Pair<Integer, Size[]>> list) {
        return (List) h(f47682u, list);
    }

    default R.c m() {
        return (R.c) a(f47683v);
    }

    default int t(int i10) {
        return ((Integer) h(f47677p, Integer.valueOf(i10))).intValue();
    }

    default boolean z() {
        return c(f47675n);
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
