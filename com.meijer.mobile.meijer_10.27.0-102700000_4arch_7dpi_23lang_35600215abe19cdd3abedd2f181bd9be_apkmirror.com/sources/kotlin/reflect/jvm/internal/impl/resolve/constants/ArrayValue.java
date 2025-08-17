package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes13.dex */
public class ArrayValue extends ConstantValue<List<? extends ConstantValue<?>>> {

    /* renamed from: b, reason: collision with root package name */
    private final Function1<ModuleDescriptor, KotlinType> f146171b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ArrayValue(List<? extends ConstantValue<?>> value, Function1<? super ModuleDescriptor, ? extends KotlinType> computeType) {
        super(value);
        Intrinsics.j(value, "value");
        Intrinsics.j(computeType, "computeType");
        this.f146171b = computeType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public KotlinType a(ModuleDescriptor module) {
        Intrinsics.j(module, "module");
        KotlinType kotlinTypeInvoke = this.f146171b.invoke(module);
        if (!KotlinBuiltIns.d0(kotlinTypeInvoke) && !KotlinBuiltIns.r0(kotlinTypeInvoke)) {
            KotlinBuiltIns.E0(kotlinTypeInvoke);
        }
        return kotlinTypeInvoke;
    }
}
