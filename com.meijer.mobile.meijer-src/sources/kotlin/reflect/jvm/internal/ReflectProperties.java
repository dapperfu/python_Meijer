package kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
public class ReflectProperties {

    public static class LazySoftVal<T> extends Val<T> implements Function0<T> {

        /* renamed from: b, reason: collision with root package name */
        private final Function0<T> f144039b;

        /* renamed from: c, reason: collision with root package name */
        private volatile SoftReference<Object> f144040c;

        private static /* synthetic */ void d(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        public LazySoftVal(T t10, Function0<T> function0) {
            if (function0 == null) {
                d(0);
            }
            this.f144040c = null;
            this.f144039b = function0;
            if (t10 != null) {
                this.f144040c = new SoftReference<>(a(t10));
            }
        }

        @Override // kotlin.reflect.jvm.internal.ReflectProperties.Val, kotlin.jvm.functions.Function0
        public T invoke() {
            Object obj;
            SoftReference<Object> softReference = this.f144040c;
            if (softReference != null && (obj = softReference.get()) != null) {
                return c(obj);
            }
            T tInvoke = this.f144039b.invoke();
            this.f144040c = new SoftReference<>(a(tInvoke));
            return tInvoke;
        }
    }

    public static abstract class Val<T> {

        /* renamed from: a, reason: collision with root package name */
        private static final Object f144041a = new a();

        public abstract T invoke();

        static class a {
            a() {
            }
        }

        protected Object a(T t10) {
            return t10 == null ? f144041a : t10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected T c(Object obj) {
            if (obj == f144041a) {
                return null;
            }
            return obj;
        }

        public final T b(Object obj, Object obj2) {
            return invoke();
        }
    }

    private static /* synthetic */ void a(int i10) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }

    public static <T> LazySoftVal<T> b(T t10, Function0<T> function0) {
        if (function0 == null) {
            a(0);
        }
        return new LazySoftVal<>(t10, function0);
    }

    public static <T> LazySoftVal<T> c(Function0<T> function0) {
        if (function0 == null) {
            a(1);
        }
        return b(null, function0);
    }
}
