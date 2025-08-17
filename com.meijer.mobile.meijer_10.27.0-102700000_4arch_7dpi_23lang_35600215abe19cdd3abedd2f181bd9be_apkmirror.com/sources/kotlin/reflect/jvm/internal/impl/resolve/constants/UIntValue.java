package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* loaded from: classes13.dex */
public final class UIntValue extends UnsignedValueConstant<Integer> {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public KotlinType a(ModuleDescriptor module) {
        SimpleType simpleTypeO;
        Intrinsics.j(module, "module");
        ClassDescriptor classDescriptorB = FindClassInModuleKt.b(module, StandardNames.FqNames.f143331F0);
        return (classDescriptorB == null || (simpleTypeO = classDescriptorB.o()) == null) ? ErrorUtils.d(ErrorTypeKind.f146981w0, "UInt") : simpleTypeO;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        return b().intValue() + ".toUInt()";
    }

    public UIntValue(int i10) {
        super(Integer.valueOf(i10));
    }
}
