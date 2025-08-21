package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: classes14.dex */
public final class LongValue extends IntegerValueConstant<Long> {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SimpleType a(ModuleDescriptor module) {
        Intrinsics.j(module, "module");
        SimpleType simpleTypeG = module.l().G();
        Intrinsics.i(simpleTypeG, "getLongType(...)");
        return simpleTypeG;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        return b().longValue() + ".toLong()";
    }

    public LongValue(long j10) {
        super(Long.valueOf(j10));
    }
}
