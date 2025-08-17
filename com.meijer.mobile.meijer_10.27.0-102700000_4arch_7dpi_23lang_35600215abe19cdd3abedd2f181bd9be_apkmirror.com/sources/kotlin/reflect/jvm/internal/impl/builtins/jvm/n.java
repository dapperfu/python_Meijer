package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* loaded from: classes13.dex */
class n implements DFS.Neighbors {

    /* renamed from: a, reason: collision with root package name */
    private final JvmBuiltInsCustomizer f143579a;

    public n(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        this.f143579a = jvmBuiltInsCustomizer;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable a(Object obj) {
        return JvmBuiltInsCustomizer.B(this.f143579a, (ClassDescriptor) obj);
    }
}
