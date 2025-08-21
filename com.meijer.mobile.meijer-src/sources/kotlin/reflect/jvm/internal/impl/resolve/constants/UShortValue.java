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

/* loaded from: classes14.dex */
public final class UShortValue extends UnsignedValueConstant<Short> {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public KotlinType a(ModuleDescriptor module) {
        SimpleType simpleTypeO;
        Intrinsics.j(module, "module");
        ClassDescriptor classDescriptorB = FindClassInModuleKt.b(module, StandardNames.FqNames.f144236E0);
        return (classDescriptorB == null || (simpleTypeO = classDescriptorB.o()) == null) ? ErrorUtils.d(ErrorTypeKind.f147888w0, "UShort") : simpleTypeO;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        return b().intValue() + ".toUShort()";
    }

    public UShortValue(short s10) {
        super(Short.valueOf(s10));
    }
}
