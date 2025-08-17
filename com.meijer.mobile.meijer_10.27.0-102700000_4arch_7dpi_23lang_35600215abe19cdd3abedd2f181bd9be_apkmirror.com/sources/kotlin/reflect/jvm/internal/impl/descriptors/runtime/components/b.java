package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* loaded from: classes13.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f144053a = new b();

    public final String a(Constructor<?> constructor) {
        Intrinsics.j(constructor, "constructor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Iterator itA = ArrayIteratorKt.a(constructor.getParameterTypes());
        while (itA.hasNext()) {
            Class cls = (Class) itA.next();
            Intrinsics.g(cls);
            sb2.append(ReflectClassUtilKt.f(cls));
        }
        sb2.append(")V");
        String string = sb2.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    public final String b(Field field) {
        Intrinsics.j(field, "field");
        Class<?> type = field.getType();
        Intrinsics.i(type, "getType(...)");
        return ReflectClassUtilKt.f(type);
    }

    public final String c(Method method) {
        Intrinsics.j(method, "method");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Iterator itA = ArrayIteratorKt.a(method.getParameterTypes());
        while (itA.hasNext()) {
            Class cls = (Class) itA.next();
            Intrinsics.g(cls);
            sb2.append(ReflectClassUtilKt.f(cls));
        }
        sb2.append(")");
        Class<?> returnType = method.getReturnType();
        Intrinsics.i(returnType, "getReturnType(...)");
        sb2.append(ReflectClassUtilKt.f(returnType));
        String string = sb2.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    private b() {
    }
}
