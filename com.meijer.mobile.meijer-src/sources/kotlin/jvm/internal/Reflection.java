package kotlin.jvm.internal;

import java.util.Collections;
import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.ReflectionFactoryImpl;

/* loaded from: classes4.dex */
public class Reflection {

    /* renamed from: a, reason: collision with root package name */
    private static final ReflectionFactory f143744a;

    /* renamed from: b, reason: collision with root package name */
    private static final KClass[] f143745b;

    static {
        ReflectionFactory reflectionFactory = null;
        try {
            reflectionFactory = (ReflectionFactory) ReflectionFactoryImpl.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (reflectionFactory == null) {
            reflectionFactory = new ReflectionFactory();
        }
        f143744a = reflectionFactory;
        f143745b = new KClass[0];
    }

    public static KFunction a(FunctionReference functionReference) {
        return f143744a.a(functionReference);
    }

    public static KClass b(Class cls) {
        return f143744a.b(cls);
    }

    @SinceKotlin
    public static KDeclarationContainer c(Class cls) {
        return f143744a.c(cls, "");
    }

    public static KDeclarationContainer d(Class cls, String str) {
        return f143744a.c(cls, str);
    }

    public static KMutableProperty0 e(MutablePropertyReference0 mutablePropertyReference0) {
        return f143744a.d(mutablePropertyReference0);
    }

    public static KMutableProperty1 f(MutablePropertyReference1 mutablePropertyReference1) {
        return f143744a.e(mutablePropertyReference1);
    }

    public static KMutableProperty2 g(MutablePropertyReference2 mutablePropertyReference2) {
        return f143744a.f(mutablePropertyReference2);
    }

    @SinceKotlin
    public static KType h(Class cls) {
        return f143744a.l(b(cls), Collections.EMPTY_LIST, true);
    }

    public static KProperty0 i(PropertyReference0 propertyReference0) {
        return f143744a.g(propertyReference0);
    }

    public static KProperty1 j(PropertyReference1 propertyReference1) {
        return f143744a.h(propertyReference1);
    }

    public static KProperty2 k(PropertyReference2 propertyReference2) {
        return f143744a.i(propertyReference2);
    }

    @SinceKotlin
    public static String l(FunctionBase functionBase) {
        return f143744a.j(functionBase);
    }

    @SinceKotlin
    public static String m(Lambda lambda) {
        return f143744a.k(lambda);
    }

    @SinceKotlin
    public static KType n(Class cls) {
        return f143744a.l(b(cls), Collections.EMPTY_LIST, false);
    }
}
