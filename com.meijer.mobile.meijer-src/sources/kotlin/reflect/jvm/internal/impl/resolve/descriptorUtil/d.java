package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* loaded from: classes14.dex */
class d implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f147124a;

    public d(boolean z10) {
        this.f147124a = z10;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return DescriptorUtilsKt.A(this.f147124a, (CallableMemberDescriptor) obj);
    }
}
