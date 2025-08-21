package androidx.camera.core.impl;

import C.C3037w;
import androidx.camera.core.impl.k;

/* loaded from: classes.dex */
public interface p extends v {

    /* renamed from: l, reason: collision with root package name */
    public static final k.a<Integer> f47673l = k.a.a("camerax.core.imageInput.inputFormat", Integer.TYPE);

    /* renamed from: m, reason: collision with root package name */
    public static final k.a<C3037w> f47674m = k.a.a("camerax.core.imageInput.inputDynamicRange", C3037w.class);

    default C3037w H() {
        return (C3037w) o2.i.g((C3037w) h(f47674m, C3037w.f3990c));
    }

    default int n() {
        return ((Integer) a(f47673l)).intValue();
    }
}
