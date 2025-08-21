package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* loaded from: classes14.dex */
class l implements DFS.Neighbors {

    /* renamed from: a, reason: collision with root package name */
    public static final l f144484a = new l();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable a(Object obj) {
        return JvmBuiltInsCustomizer.F((CallableMemberDescriptor) obj);
    }
}
