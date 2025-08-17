package androidx.camera.core.impl;

import C.C2979w;
import androidx.camera.core.impl.k;

/* loaded from: classes.dex */
public interface p extends v {

    /* renamed from: l, reason: collision with root package name */
    public static final k.a<Integer> f47449l = k.a.a("camerax.core.imageInput.inputFormat", Integer.TYPE);

    /* renamed from: m, reason: collision with root package name */
    public static final k.a<C2979w> f47450m = k.a.a("camerax.core.imageInput.inputDynamicRange", C2979w.class);

    default C2979w H() {
        return (C2979w) o2.i.g((C2979w) h(f47450m, C2979w.f3532c));
    }

    default int n() {
        return ((Integer) a(f47449l)).intValue();
    }
}
