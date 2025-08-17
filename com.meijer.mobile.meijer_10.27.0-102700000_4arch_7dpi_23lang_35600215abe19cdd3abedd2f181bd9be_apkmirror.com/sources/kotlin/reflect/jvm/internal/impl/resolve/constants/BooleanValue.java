package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: classes13.dex */
public final class BooleanValue extends ConstantValue<Boolean> {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SimpleType a(ModuleDescriptor module) {
        Intrinsics.j(module, "module");
        SimpleType simpleTypeO = module.l().o();
        Intrinsics.i(simpleTypeO, "getBooleanType(...)");
        return simpleTypeO;
    }

    public BooleanValue(boolean z10) {
        super(Boolean.valueOf(z10));
    }
}
