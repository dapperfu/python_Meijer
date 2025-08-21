package kotlin.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.FallbackThreadLocalRandom;
import kotlin.random.Random;
import kotlin.time.Clock;
import kotlin.time.ExperimentalTime;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlin/internal/PlatformImplementations;", "", "<init>", "()V", "", "cause", "exception", "", "a", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "Lkotlin/random/Random;", "b", "()Lkotlin/random/Random;", "Lkotlin/time/Clock;", "c", "()Lkotlin/time/Clock;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public class PlatformImplementations {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Lkotlin/internal/PlatformImplementations$a;", "", "<init>", "()V", "Ljava/lang/reflect/Method;", "b", "Ljava/lang/reflect/Method;", "addSuppressed", "c", "getSuppressed", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f143586a = new a();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public static final Method addSuppressed;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public static final Method getSuppressed;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            Intrinsics.g(methods);
            int length = methods.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                method = null;
                if (i11 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i11];
                if (Intrinsics.e(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Intrinsics.i(parameterTypes, "getParameterTypes(...)");
                    if (Intrinsics.e(ArraysKt.S0(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i11++;
            }
            addSuppressed = method2;
            int length2 = methods.length;
            while (true) {
                if (i10 >= length2) {
                    break;
                }
                Method method3 = methods[i10];
                if (Intrinsics.e(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i10++;
            }
            getSuppressed = method;
        }

        private a() {
        }
    }

    public void a(Throwable cause, Throwable exception) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(cause, "cause");
        Intrinsics.j(exception, "exception");
        Method method = a.addSuppressed;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public Random b() {
        return new FallbackThreadLocalRandom();
    }

    @ExperimentalTime
    public Clock c() {
        throw new UnsupportedOperationException("getSystemClock should not be called on the base PlatformImplementations.");
    }
}
