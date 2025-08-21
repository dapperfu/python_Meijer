package retrofit2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes14.dex */
public final class Invocation {
    private final List<?> arguments;
    private final Object instance;
    private final Method method;
    private final Class<?> service;

    public static <T> Invocation of(Class<T> cls, T t10, Method method, List<?> list) {
        Objects.requireNonNull(cls, "service == null");
        Objects.requireNonNull(t10, "instance == null");
        Objects.requireNonNull(method, "method == null");
        Objects.requireNonNull(list, "arguments == null");
        return new Invocation(cls, t10, method, new ArrayList(list));
    }

    public List<?> arguments() {
        return this.arguments;
    }

    public Object instance() {
        return this.instance;
    }

    public Method method() {
        return this.method;
    }

    public Class<?> service() {
        return this.service;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.service.getName(), this.method.getName(), this.arguments);
    }

    Invocation(Class<?> cls, Object obj, Method method, List<?> list) {
        this.service = cls;
        this.instance = obj;
        this.method = method;
        this.arguments = Collections.unmodifiableList(list);
    }

    @Deprecated
    public static Invocation of(Method method, List<?> list) {
        Objects.requireNonNull(method, "method == null");
        Objects.requireNonNull(list, "arguments == null");
        return new Invocation(method.getDeclaringClass(), null, method, new ArrayList(list));
    }
}
