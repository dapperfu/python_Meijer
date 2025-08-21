package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: classes14.dex */
public final class CharValue extends IntegerValueConstant<Character> {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public SimpleType a(ModuleDescriptor module) {
        Intrinsics.j(module, "module");
        SimpleType simpleTypeV = module.l().v();
        Intrinsics.i(simpleTypeV, "getCharType(...)");
        return simpleTypeV;
    }

    public CharValue(char c10) {
        super(Character.valueOf(c10));
    }

    private final String c(char c10) {
        switch (c10) {
            case '\b':
                return "\\b";
            case '\t':
                return "\\t";
            case '\n':
                return "\\n";
            case 11:
            default:
                if (e(c10)) {
                    return String.valueOf(c10);
                }
                return "?";
            case '\f':
                return "\\f";
            case '\r':
                return "\\r";
        }
    }

    private final boolean e(char c10) {
        byte type = (byte) Character.getType(c10);
        if (type != 0 && type != 13 && type != 14 && type != 15 && type != 16 && type != 18 && type != 19) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        String str = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(b().charValue()), c(b().charValue())}, 2));
        Intrinsics.i(str, "format(...)");
        return str;
    }
}
