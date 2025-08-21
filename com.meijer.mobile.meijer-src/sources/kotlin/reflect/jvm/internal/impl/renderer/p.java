package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes14.dex */
class p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final DescriptorRendererImpl f147018a;

    public p(DescriptorRendererImpl descriptorRendererImpl) {
        this.f147018a = descriptorRendererImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return DescriptorRendererImpl.p2(this.f147018a, (KotlinType) obj);
    }
}
