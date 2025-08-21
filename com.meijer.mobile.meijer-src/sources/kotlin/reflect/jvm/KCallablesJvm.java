package kotlin.reflect.jvm;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.calls.Caller;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\",\u0010\u0007\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/reflect/KCallable;", "", "value", "a", "(Lkotlin/reflect/KCallable;)Z", "setAccessible", "(Lkotlin/reflect/KCallable;Z)V", "isAccessible", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
@JvmName
/* loaded from: classes14.dex */
public final class KCallablesJvm {
    public static final boolean a(KCallable<?> kCallable) {
        Caller<?> callerR;
        Intrinsics.j(kCallable, "<this>");
        if (kCallable instanceof KMutableProperty) {
            KProperty kProperty = (KProperty) kCallable;
            Field fieldB = ReflectJvmMapping.b(kProperty);
            if (fieldB != null ? fieldB.isAccessible() : true) {
                Method methodC = ReflectJvmMapping.c(kProperty);
                if (methodC != null ? methodC.isAccessible() : true) {
                    Method methodE = ReflectJvmMapping.e((KMutableProperty) kCallable);
                    if (methodE != null ? methodE.isAccessible() : true) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (kCallable instanceof KProperty) {
            KProperty kProperty2 = (KProperty) kCallable;
            Field fieldB2 = ReflectJvmMapping.b(kProperty2);
            if (fieldB2 != null ? fieldB2.isAccessible() : true) {
                Method methodC2 = ReflectJvmMapping.c(kProperty2);
                if (methodC2 != null ? methodC2.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (kCallable instanceof KProperty.Getter) {
            Field fieldB3 = ReflectJvmMapping.b(((KProperty.Getter) kCallable).a());
            if (fieldB3 != null ? fieldB3.isAccessible() : true) {
                Method methodD = ReflectJvmMapping.d((KFunction) kCallable);
                if (methodD != null ? methodD.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (kCallable instanceof KMutableProperty.Setter) {
            Field fieldB4 = ReflectJvmMapping.b(((KMutableProperty.Setter) kCallable).a());
            if (fieldB4 != null ? fieldB4.isAccessible() : true) {
                Method methodD2 = ReflectJvmMapping.d((KFunction) kCallable);
                if (methodD2 != null ? methodD2.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (!(kCallable instanceof KFunction)) {
            throw new UnsupportedOperationException("Unknown callable: " + kCallable + " (" + kCallable.getClass() + ')');
        }
        KFunction kFunction = (KFunction) kCallable;
        Method methodD3 = ReflectJvmMapping.d(kFunction);
        if (methodD3 != null ? methodD3.isAccessible() : true) {
            KCallableImpl<?> kCallableImplB = UtilKt.b(kCallable);
            Object objB = (kCallableImplB == null || (callerR = kCallableImplB.R()) == null) ? null : callerR.b();
            AccessibleObject accessibleObject = objB instanceof AccessibleObject ? (AccessibleObject) objB : null;
            if (accessibleObject != null ? accessibleObject.isAccessible() : true) {
                Constructor constructorA = ReflectJvmMapping.a(kFunction);
                if (constructorA != null ? constructorA.isAccessible() : true) {
                    return true;
                }
            }
        }
        return false;
    }
}
