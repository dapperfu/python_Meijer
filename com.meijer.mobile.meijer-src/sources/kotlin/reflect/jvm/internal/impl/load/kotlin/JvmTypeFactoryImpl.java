package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
final class JvmTypeFactoryImpl implements JvmTypeFactory<JvmType> {

    /* renamed from: a, reason: collision with root package name */
    public static final JvmTypeFactoryImpl f145724a = new JvmTypeFactoryImpl();

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            try {
                iArr[PrimitiveType.f144164g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrimitiveType.f144165h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrimitiveType.f144166i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrimitiveType.f144167j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrimitiveType.f144168k.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrimitiveType.f144169l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PrimitiveType.f144170m.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PrimitiveType.f144171n.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public JvmType b(JvmType possiblyPrimitiveType) {
        Intrinsics.j(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (!(possiblyPrimitiveType instanceof JvmType.Primitive)) {
            return possiblyPrimitiveType;
        }
        JvmType.Primitive primitive = (JvmType.Primitive) possiblyPrimitiveType;
        if (primitive.i() == null) {
            return possiblyPrimitiveType;
        }
        String strF = JvmClassName.c(primitive.i().p()).f();
        Intrinsics.i(strF, "getInternalName(...)");
        return e(strF);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public JvmType a(String representation) {
        JvmPrimitiveType jvmPrimitiveType;
        Intrinsics.j(representation, "representation");
        representation.length();
        char cCharAt = representation.charAt(0);
        JvmPrimitiveType[] jvmPrimitiveTypeArrValues = JvmPrimitiveType.values();
        int length = jvmPrimitiveTypeArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                jvmPrimitiveType = null;
                break;
            }
            jvmPrimitiveType = jvmPrimitiveTypeArrValues[i10];
            if (jvmPrimitiveType.l().charAt(0) == cCharAt) {
                break;
            }
            i10++;
        }
        if (jvmPrimitiveType != null) {
            return new JvmType.Primitive(jvmPrimitiveType);
        }
        if (cCharAt == 'V') {
            return new JvmType.Primitive(null);
        }
        if (cCharAt == '[') {
            String strSubstring = representation.substring(1);
            Intrinsics.i(strSubstring, "substring(...)");
            return new JvmType.Array(a(strSubstring));
        }
        if (cCharAt == 'L') {
            StringsKt.g0(representation, ';', false, 2, null);
        }
        String strSubstring2 = representation.substring(1, representation.length() - 1);
        Intrinsics.i(strSubstring2, "substring(...)");
        return new JvmType.Object(strSubstring2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public JvmType.Object e(String internalName) {
        Intrinsics.j(internalName, "internalName");
        return new JvmType.Object(internalName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public JvmType c(PrimitiveType primitiveType) {
        Intrinsics.j(primitiveType, "primitiveType");
        switch (WhenMappings.$EnumSwitchMapping$0[primitiveType.ordinal()]) {
            case 1:
                return JvmType.f145712a.a();
            case 2:
                return JvmType.f145712a.c();
            case 3:
                return JvmType.f145712a.b();
            case 4:
                return JvmType.f145712a.h();
            case 5:
                return JvmType.f145712a.f();
            case 6:
                return JvmType.f145712a.e();
            case 7:
                return JvmType.f145712a.g();
            case 8:
                return JvmType.f145712a.d();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public JvmType f() {
        return e("java/lang/Class");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public String d(JvmType type) {
        String strL;
        Intrinsics.j(type, "type");
        if (type instanceof JvmType.Array) {
            return '[' + d(((JvmType.Array) type).i());
        }
        if (type instanceof JvmType.Primitive) {
            JvmPrimitiveType jvmPrimitiveTypeI = ((JvmType.Primitive) type).i();
            return (jvmPrimitiveTypeI == null || (strL = jvmPrimitiveTypeI.l()) == null) ? "V" : strL;
        }
        if (!(type instanceof JvmType.Object)) {
            throw new NoWhenBranchMatchedException();
        }
        return 'L' + ((JvmType.Object) type).i() + ';';
    }

    private JvmTypeFactoryImpl() {
    }
}
