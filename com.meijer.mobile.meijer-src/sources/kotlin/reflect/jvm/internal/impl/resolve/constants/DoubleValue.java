package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: classes14.dex */
public final class DoubleValue extends ConstantValue<Double> {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SimpleType a(ModuleDescriptor module) {
        Intrinsics.j(module, "module");
        SimpleType simpleTypeA = module.l().A();
        Intrinsics.i(simpleTypeA, "getDoubleType(...)");
        return simpleTypeA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        return b().doubleValue() + ".toDouble()";
    }

    public DoubleValue(double d10) {
        super(Double.valueOf(d10));
    }
}
