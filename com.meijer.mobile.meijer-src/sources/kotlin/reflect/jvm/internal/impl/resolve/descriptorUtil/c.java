package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* loaded from: classes14.dex */
class c implements DFS.Neighbors {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f147123a;

    public c(boolean z10) {
        this.f147123a = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable a(Object obj) {
        return DescriptorUtilsKt.j(this.f147123a, (CallableMemberDescriptor) obj);
    }
}
