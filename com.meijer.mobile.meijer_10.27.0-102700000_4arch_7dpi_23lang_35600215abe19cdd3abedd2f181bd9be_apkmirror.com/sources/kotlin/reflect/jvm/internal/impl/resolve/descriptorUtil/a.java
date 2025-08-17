package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* loaded from: classes13.dex */
class a implements DFS.Neighbors {

    /* renamed from: a, reason: collision with root package name */
    public static final a f146214a = new a();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable a(Object obj) {
        return DescriptorUtilsKt.g((ValueParameterDescriptor) obj);
    }
}
