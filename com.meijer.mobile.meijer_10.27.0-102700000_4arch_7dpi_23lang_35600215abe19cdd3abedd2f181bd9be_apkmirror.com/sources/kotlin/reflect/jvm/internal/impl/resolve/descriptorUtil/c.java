package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* loaded from: classes13.dex */
class c implements DFS.Neighbors {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f146216a;

    public c(boolean z10) {
        this.f146216a = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable a(Object obj) {
        return DescriptorUtilsKt.j(this.f146216a, (CallableMemberDescriptor) obj);
    }
}
