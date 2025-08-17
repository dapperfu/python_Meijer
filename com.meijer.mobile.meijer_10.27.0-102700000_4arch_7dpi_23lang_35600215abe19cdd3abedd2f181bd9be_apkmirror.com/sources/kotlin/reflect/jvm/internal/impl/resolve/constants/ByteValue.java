package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: classes13.dex */
public final class ByteValue extends IntegerValueConstant<Byte> {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SimpleType a(ModuleDescriptor module) {
        Intrinsics.j(module, "module");
        SimpleType simpleTypeU = module.l().u();
        Intrinsics.i(simpleTypeU, "getByteType(...)");
        return simpleTypeU;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        return b().intValue() + ".toByte()";
    }

    public ByteValue(byte b10) {
        super(Byte.valueOf(b10));
    }
}
