package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;

/* loaded from: classes13.dex */
class a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final PrimitiveType f146197a;

    public a(PrimitiveType primitiveType) {
        this.f146197a = primitiveType;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return ConstantValueFactory.d(this.f146197a, (ModuleDescriptor) obj);
    }
}
