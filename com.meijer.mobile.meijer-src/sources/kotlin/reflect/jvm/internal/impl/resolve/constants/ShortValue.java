package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: classes14.dex */
public final class ShortValue extends IntegerValueConstant<Short> {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SimpleType a(ModuleDescriptor module) {
        Intrinsics.j(module, "module");
        SimpleType simpleTypeU = module.l().U();
        Intrinsics.i(simpleTypeU, "getShortType(...)");
        return simpleTypeU;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        return b().intValue() + ".toShort()";
    }

    public ShortValue(short s10) {
        super(Short.valueOf(s10));
    }
}
