package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: classes13.dex */
public final class IntValue extends IntegerValueConstant<Integer> {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SimpleType a(ModuleDescriptor module) {
        Intrinsics.j(module, "module");
        SimpleType simpleTypeE = module.l().E();
        Intrinsics.i(simpleTypeE, "getIntType(...)");
        return simpleTypeE;
    }

    public IntValue(int i10) {
        super(Integer.valueOf(i10));
    }
}
