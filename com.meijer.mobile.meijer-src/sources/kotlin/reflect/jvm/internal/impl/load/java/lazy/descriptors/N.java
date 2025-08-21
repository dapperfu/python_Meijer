package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* loaded from: classes14.dex */
class N implements DFS.Neighbors {

    /* renamed from: a, reason: collision with root package name */
    public static final N f145450a = new N();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable a(Object obj) {
        return LazyJavaStaticClassScope.q0((ClassDescriptor) obj);
    }
}
