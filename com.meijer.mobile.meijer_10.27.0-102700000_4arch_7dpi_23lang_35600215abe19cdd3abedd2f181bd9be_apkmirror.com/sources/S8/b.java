package S8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\f\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0010\u0010\u0011\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0010\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J4\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0010\u0010\u0011\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0010\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001b¨\u0006\u001c"}, d2 = {"LS8/b;", "T", "Ljava/lang/reflect/InvocationHandler;", "apiObject", "Ll9/b;", "handlerHolder", "", "timeout", "<init>", "(Ljava/lang/Object;Ll9/b;J)V", "", "d", "()Z", "Ljava/lang/reflect/Method;", "method", "", "", "args", "c", "(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "proxy", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "b", "Ll9/b;", "J", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b<T> implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T apiObject;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l9.b handlerHolder;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long timeout;

    public b(T t10, l9.b handlerHolder, long j10) {
        Intrinsics.j(handlerHolder, "handlerHolder");
        this.apiObject = t10;
        this.handlerHolder = handlerHolder;
        this.timeout = j10;
    }

    private final Object c(Method method, Object[] args) {
        return args != null ? method.invoke(this.apiObject, Arrays.copyOf(args, args.length)) : method.invoke(this.apiObject, null);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object proxy, final Method method, final Object[] args) throws InterruptedException {
        Intrinsics.j(proxy, "proxy");
        Intrinsics.j(method, "method");
        c.b();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final boolean zE = Intrinsics.e(method.getReturnType(), Void.TYPE);
        if (method.getReturnType().isPrimitive()) {
            Class<?> returnType = method.getReturnType();
            objectRef.f142835a = Intrinsics.e(returnType, Boolean.TYPE) ? (T) Boolean.FALSE : Intrinsics.e(returnType, Character.TYPE) ? (T) Character.valueOf((char) 0) : (T) 0;
        }
        if (d()) {
            objectRef.f142835a = (T) c(method, args);
        } else {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            this.handlerHolder.f(new Runnable() { // from class: S8.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.b(objectRef, this, method, args, zE, countDownLatch);
                }
            });
            if (!zE) {
                countDownLatch.await(this.timeout, TimeUnit.SECONDS);
            }
        }
        c.a();
        return objectRef.f142835a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ref.ObjectRef objectRef, b bVar, Method method, Object[] objArr, boolean z10, CountDownLatch countDownLatch) {
        objectRef.f142835a = (T) bVar.c(method, objArr);
        if (!z10) {
            countDownLatch.countDown();
        }
    }

    private final boolean d() {
        return Intrinsics.e(Thread.currentThread(), this.handlerHolder.getCoreHandler().getHandler().getLooper().getThread());
    }
}
