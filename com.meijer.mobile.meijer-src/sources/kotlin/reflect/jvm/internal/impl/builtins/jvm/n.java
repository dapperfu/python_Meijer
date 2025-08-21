package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* loaded from: classes14.dex */
class n implements DFS.Neighbors {

    /* renamed from: a, reason: collision with root package name */
    private final JvmBuiltInsCustomizer f144486a;

    public n(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        this.f144486a = jvmBuiltInsCustomizer;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable a(Object obj) {
        return JvmBuiltInsCustomizer.B(this.f144486a, (ClassDescriptor) obj);
    }
}
