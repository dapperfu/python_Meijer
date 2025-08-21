package retrofit2;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes14.dex */
final class DefaultMethodSupport {
    private static Constructor<MethodHandles.Lookup> lookupConstructor;

    @IgnoreJRERequirement
    static Object invoke(Method method, Class<?> cls, Object obj, Object[] objArr) throws Throwable {
        Constructor<MethodHandles.Lookup> declaredConstructor = lookupConstructor;
        if (declaredConstructor == null) {
            declaredConstructor = c.a().getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            lookupConstructor = declaredConstructor;
        }
        return d.a(declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    private DefaultMethodSupport() {
    }
}
