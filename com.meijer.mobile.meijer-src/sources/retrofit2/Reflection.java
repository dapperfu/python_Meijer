package retrofit2;

import android.annotation.TargetApi;
import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes14.dex */
class Reflection {

    @TargetApi(24)
    @IgnoreJRERequirement
    static final class Android24 extends Reflection {
        @Override // retrofit2.Reflection
        Object invokeDefaultMethod(Method method, Class<?> cls, Object obj, Object[] objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return DefaultMethodSupport.invoke(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }

        Android24() {
        }

        @Override // retrofit2.Reflection
        boolean isDefaultMethod(Method method) {
            return method.isDefault();
        }
    }

    boolean isDefaultMethod(Method method) {
        return false;
    }

    @IgnoreJRERequirement
    static class Java8 extends Reflection {
        Java8() {
        }

        @Override // retrofit2.Reflection
        String describeMethodParameter(Method method, int i10) {
            Parameter parameter = method.getParameters()[i10];
            if (parameter.isNamePresent()) {
                return "parameter '" + parameter.getName() + '\'';
            }
            return super.describeMethodParameter(method, i10);
        }

        @Override // retrofit2.Reflection
        Object invokeDefaultMethod(Method method, Class<?> cls, Object obj, Object[] objArr) throws Throwable {
            return DefaultMethodSupport.invoke(method, cls, obj, objArr);
        }

        @Override // retrofit2.Reflection
        boolean isDefaultMethod(Method method) {
            return method.isDefault();
        }
    }

    String describeMethodParameter(Method method, int i10) {
        return "parameter #" + (i10 + 1);
    }

    Object invokeDefaultMethod(Method method, Class<?> cls, Object obj, Object[] objArr) throws Throwable {
        throw new AssertionError();
    }

    Reflection() {
    }
}
