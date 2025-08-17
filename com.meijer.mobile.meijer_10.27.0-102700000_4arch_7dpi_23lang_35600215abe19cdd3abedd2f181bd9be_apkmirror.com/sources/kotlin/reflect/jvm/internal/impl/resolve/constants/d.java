package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes13.dex */
class d implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final KotlinType f146200a;

    public d(KotlinType kotlinType) {
        this.f146200a = kotlinType;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return TypedArrayValue.c(this.f146200a, (ModuleDescriptor) obj);
    }
}
