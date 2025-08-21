package kotlin.reflect.jvm;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\b\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u001b\u0010\f\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"/\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\r8F¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u001c\u001a\u00020\u0019*\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lkotlin/reflect/KProperty;", "Ljava/lang/reflect/Field;", "b", "(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Field;", "javaField", "Ljava/lang/reflect/Method;", "c", "(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Method;", "javaGetter", "Lkotlin/reflect/KMutableProperty;", "e", "(Lkotlin/reflect/KMutableProperty;)Ljava/lang/reflect/Method;", "javaSetter", "Lkotlin/reflect/KFunction;", "d", "(Lkotlin/reflect/KFunction;)Ljava/lang/reflect/Method;", "javaMethod", "T", "Ljava/lang/reflect/Constructor;", "a", "(Lkotlin/reflect/KFunction;)Ljava/lang/reflect/Constructor;", "getJavaConstructor$annotations", "(Lkotlin/reflect/KFunction;)V", "javaConstructor", "Lkotlin/reflect/KType;", "Ljava/lang/reflect/Type;", "f", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "javaType", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ReflectJvmMapping {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                iArr[KotlinClassHeader.Kind.f145776f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KotlinClassHeader.Kind.f145778h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KotlinClassHeader.Kind.f145779i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final <T> Constructor<T> a(KFunction<? extends T> kFunction) {
        Caller<?> callerP;
        Intrinsics.j(kFunction, "<this>");
        KCallableImpl<?> kCallableImplB = UtilKt.b(kFunction);
        Member memberB = (kCallableImplB == null || (callerP = kCallableImplB.P()) == null) ? null : callerP.b();
        if (memberB instanceof Constructor) {
            return (Constructor) memberB;
        }
        return null;
    }

    public static final Field b(KProperty<?> kProperty) {
        Intrinsics.j(kProperty, "<this>");
        KPropertyImpl<?> kPropertyImplD = UtilKt.d(kProperty);
        if (kPropertyImplD != null) {
            return kPropertyImplD.g0();
        }
        return null;
    }

    public static final Method c(KProperty<?> kProperty) {
        Intrinsics.j(kProperty, "<this>");
        return d(kProperty.getGetter());
    }

    public static final Method d(KFunction<?> kFunction) {
        Caller<?> callerP;
        Intrinsics.j(kFunction, "<this>");
        KCallableImpl<?> kCallableImplB = UtilKt.b(kFunction);
        Member memberB = (kCallableImplB == null || (callerP = kCallableImplB.P()) == null) ? null : callerP.b();
        if (memberB instanceof Method) {
            return (Method) memberB;
        }
        return null;
    }

    public static final Method e(KMutableProperty<?> kMutableProperty) {
        Intrinsics.j(kMutableProperty, "<this>");
        return d(kMutableProperty.getSetter());
    }

    public static final Type f(KType kType) {
        Intrinsics.j(kType, "<this>");
        Type typeG = ((KTypeImpl) kType).g();
        return typeG == null ? TypesJVMKt.f(kType) : typeG;
    }
}
