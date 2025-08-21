package U8;

import K9.e;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0010\u0010\u000b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LU8/d;", "T", "Ljava/lang/reflect/InvocationHandler;", "apiObject", "<init>", "(Ljava/lang/Object;)V", "", "proxy", "Ljava/lang/reflect/Method;", "method", "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d<T> implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T apiObject;

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object proxy, Method method, Object[] args) {
        Object objValueOf;
        Intrinsics.j(proxy, "proxy");
        Intrinsics.j(method, "method");
        if (method.getReturnType().isPrimitive()) {
            Class<?> returnType = method.getReturnType();
            objValueOf = Intrinsics.e(returnType, Boolean.TYPE) ? Boolean.FALSE : Intrinsics.e(returnType, Character.TYPE) ? Character.valueOf((char) 0) : 0;
        } else {
            objValueOf = null;
        }
        try {
            return args != null ? method.invoke(this.apiObject, Arrays.copyOf(args, args.length)) : method.invoke(this.apiObject, null);
        } catch (Exception e10) {
            if (!(e10 instanceof InvocationTargetException) || ((InvocationTargetException) e10).getCause() == null) {
                e.INSTANCE.c(new L9.b(e10, null, 2, null));
            } else {
                e.INSTANCE.c(new L9.b(I9.d.a(e10), null, 2, null));
            }
            return objValueOf;
        }
    }

    public d(T t10) {
        this.apiObject = t10;
    }
}
