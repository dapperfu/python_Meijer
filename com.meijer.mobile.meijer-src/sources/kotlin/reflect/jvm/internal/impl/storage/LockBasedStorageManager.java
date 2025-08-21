package kotlin.reflect.jvm.internal.impl.storage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import kotlin.text.StringsKt;

/* loaded from: classes14.dex */
public class LockBasedStorageManager implements StorageManager {

    /* renamed from: d, reason: collision with root package name */
    private static final String f147539d = StringsKt.y1(LockBasedStorageManager.class.getCanonicalName(), ".", "");

    /* renamed from: e, reason: collision with root package name */
    public static final StorageManager f147540e = new a("NO_LOCKS", ExceptionHandlingStrategy.f147544a, EmptySimpleLock.f147538b);

    /* renamed from: a, reason: collision with root package name */
    protected final SimpleLock f147541a;

    /* renamed from: b, reason: collision with root package name */
    private final ExceptionHandlingStrategy f147542b;

    /* renamed from: c, reason: collision with root package name */
    private final String f147543c;

    public interface ExceptionHandlingStrategy {

        /* renamed from: a, reason: collision with root package name */
        public static final ExceptionHandlingStrategy f147544a = new a();

        static class a implements ExceptionHandlingStrategy {
            private static /* synthetic */ void b(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy
            public RuntimeException a(Throwable th2) {
                if (th2 == null) {
                    b(0);
                }
                throw ExceptionUtilsKt.b(th2);
            }

            a() {
            }
        }

        RuntimeException a(Throwable th2);
    }

    static class a extends LockBasedStorageManager {
        a(String str, ExceptionHandlingStrategy exceptionHandlingStrategy, SimpleLock simpleLock) {
            super(str, exceptionHandlingStrategy, simpleLock, null);
        }

        private static /* synthetic */ void j(int i10) {
            String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 1 ? 3 : 2];
            if (i10 != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i10 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i10 != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 1) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager
        protected <K, V> n<V> p(String str, K k10) {
            if (str == null) {
                j(0);
            }
            n<V> nVarA = n.a();
            if (nVarA == null) {
                j(1);
            }
            return nVarA;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class b<T> extends i<T> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f147545d;

        private static /* synthetic */ void a(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(LockBasedStorageManager lockBasedStorageManager, Function0 function0, Object obj) {
            super(lockBasedStorageManager, function0);
            this.f147545d = obj;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.g
        protected n<T> c(boolean z10) {
            n<T> nVarD = n.d(this.f147545d);
            if (nVarD == null) {
                a(0);
            }
            return nVarD;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class c<T> extends j<T> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f147547e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f147548f;

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i10 != 2 ? 2 : 3];
            if (i10 != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i10 != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i10 == 2) {
                objArr[2] = "doPostCompute";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalArgumentException(str2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(LockBasedStorageManager lockBasedStorageManager, Function0 function0, Function1 function1, Function1 function12) {
            super(lockBasedStorageManager, function0);
            this.f147547e = function1;
            this.f147548f = function12;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.g
        protected n<T> c(boolean z10) {
            Function1 function1 = this.f147547e;
            if (function1 == null) {
                n<T> nVarC = super.c(z10);
                if (nVarC == null) {
                    a(0);
                }
                return nVarC;
            }
            n<T> nVarD = n.d(function1.invoke(Boolean.valueOf(z10)));
            if (nVarD == null) {
                a(1);
            }
            return nVarD;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.h
        protected void d(T t10) {
            if (t10 == null) {
                a(2);
            }
            this.f147548f.invoke(t10);
        }
    }

    private static class d<K, V> extends e<K, V> implements CacheWithNotNullValues<K, V> {
        /* synthetic */ d(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, a aVar) {
            this(lockBasedStorageManager, concurrentMap);
        }

        private static /* synthetic */ void b(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "computation";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i10 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private d(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap<f<K, V>, Object> concurrentMap) {
            super(lockBasedStorageManager, concurrentMap, null);
            if (lockBasedStorageManager == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.e, kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues
        public V a(K k10, Function0<? extends V> function0) {
            if (function0 == null) {
                b(2);
            }
            V v10 = (V) super.a(k10, function0);
            if (v10 == null) {
                b(3);
            }
            return v10;
        }
    }

    private static class e<K, V> extends k<f<K, V>, V> implements CacheWithNullableValues<K, V> {
        /* synthetic */ e(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, a aVar) {
            this(lockBasedStorageManager, concurrentMap);
        }

        private static /* synthetic */ void b(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i10 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        class a implements Function1<f<K, V>, V> {
            a() {
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public V invoke(f<K, V> fVar) {
                return (V) ((f) fVar).f147551b.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private e(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap<f<K, V>, Object> concurrentMap) {
            super(lockBasedStorageManager, concurrentMap, new a());
            if (lockBasedStorageManager == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
        }

        public V a(K k10, Function0<? extends V> function0) {
            if (function0 == null) {
                b(2);
            }
            return invoke(new f(k10, function0));
        }
    }

    private static class f<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private final K f147550a;

        /* renamed from: b, reason: collision with root package name */
        private final Function0<? extends V> f147551b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f147550a.equals(((f) obj).f147550a);
        }

        public int hashCode() {
            return this.f147550a.hashCode();
        }

        public f(K k10, Function0<? extends V> function0) {
            this.f147550a = k10;
            this.f147551b = function0;
        }
    }

    private static class g<T> implements NullableLazyValue<T> {

        /* renamed from: a, reason: collision with root package name */
        private final LockBasedStorageManager f147552a;

        /* renamed from: b, reason: collision with root package name */
        private final Function0<? extends T> f147553b;

        /* renamed from: c, reason: collision with root package name */
        private volatile Object f147554c;

        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 2 || i10 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 2 || i10 == 3) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 == 2 || i10 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i10 != 2 && i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        protected void b(T t10) {
        }

        public g(LockBasedStorageManager lockBasedStorageManager, Function0<? extends T> function0) {
            if (lockBasedStorageManager == null) {
                a(0);
            }
            if (function0 == null) {
                a(1);
            }
            this.f147554c = m.NOT_COMPUTED;
            this.f147552a = lockBasedStorageManager;
            this.f147553b = function0;
        }

        protected n<T> c(boolean z10) {
            n<T> nVarP = this.f147552a.p("in a lazy value", null);
            if (nVarP == null) {
                a(2);
            }
            return nVarP;
        }

        public boolean i() {
            return (this.f147554c == m.NOT_COMPUTED || this.f147554c == m.COMPUTING) ? false : true;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003e A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public T invoke() {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f147554c
                boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.m
                if (r1 != 0) goto Lb
                java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.f(r0)
                return r0
            Lb:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r0 = r4.f147552a
                kotlin.reflect.jvm.internal.impl.storage.SimpleLock r0 = r0.f147541a
                r0.lock()
                java.lang.Object r0 = r4.f147554c     // Catch: java.lang.Throwable -> L24
                boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.m     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto L26
                java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.f(r0)     // Catch: java.lang.Throwable -> L24
            L1c:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r1 = r4.f147552a
                kotlin.reflect.jvm.internal.impl.storage.SimpleLock r1 = r1.f147541a
                r1.unlock()
                return r0
            L24:
                r0 = move-exception
                goto L85
            L26:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$m r1 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.m.COMPUTING     // Catch: java.lang.Throwable -> L24
                if (r0 != r1) goto L3e
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$m r2 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.m.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L24
                r4.f147554c = r2     // Catch: java.lang.Throwable -> L24
                r2 = 1
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$n r2 = r4.c(r2)     // Catch: java.lang.Throwable -> L24
                boolean r3 = r2.c()     // Catch: java.lang.Throwable -> L24
                if (r3 != 0) goto L3e
                java.lang.Object r0 = r2.b()     // Catch: java.lang.Throwable -> L24
                goto L1c
            L3e:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$m r2 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.m.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L24
                if (r0 != r2) goto L52
                r0 = 0
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$n r0 = r4.c(r0)     // Catch: java.lang.Throwable -> L24
                boolean r2 = r0.c()     // Catch: java.lang.Throwable -> L24
                if (r2 != 0) goto L52
                java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L24
                goto L1c
            L52:
                r4.f147554c = r1     // Catch: java.lang.Throwable -> L24
                kotlin.jvm.functions.Function0<? extends T> r0 = r4.f147553b     // Catch: java.lang.Throwable -> L60
                java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L60
                r4.b(r0)     // Catch: java.lang.Throwable -> L60
                r4.f147554c = r0     // Catch: java.lang.Throwable -> L60
                goto L1c
            L60:
                r0 = move-exception
                boolean r1 = kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt.a(r0)     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto L7e
                java.lang.Object r1 = r4.f147554c     // Catch: java.lang.Throwable -> L24
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$m r2 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.m.COMPUTING     // Catch: java.lang.Throwable -> L24
                if (r1 != r2) goto L73
                java.lang.Object r1 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.c(r0)     // Catch: java.lang.Throwable -> L24
                r4.f147554c = r1     // Catch: java.lang.Throwable -> L24
            L73:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r1 = r4.f147552a     // Catch: java.lang.Throwable -> L24
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$ExceptionHandlingStrategy r1 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.k(r1)     // Catch: java.lang.Throwable -> L24
                java.lang.RuntimeException r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L24
                throw r0     // Catch: java.lang.Throwable -> L24
            L7e:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$m r1 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.m.NOT_COMPUTED     // Catch: java.lang.Throwable -> L24
                r4.f147554c = r1     // Catch: java.lang.Throwable -> L24
                java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L24
                throw r0     // Catch: java.lang.Throwable -> L24
            L85:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r1 = r4.f147552a
                kotlin.reflect.jvm.internal.impl.storage.SimpleLock r1 = r1.f147541a
                r1.unlock()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.g.invoke():java.lang.Object");
        }
    }

    private static abstract class h<T> extends g<T> {

        /* renamed from: d, reason: collision with root package name */
        private volatile kotlin.reflect.jvm.internal.impl.storage.a<T> f147555d;

        private static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        protected abstract void d(T t10);

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(LockBasedStorageManager lockBasedStorageManager, Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                a(0);
            }
            if (function0 == null) {
                a(1);
            }
            this.f147555d = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.g
        protected final void b(T t10) {
            this.f147555d = new kotlin.reflect.jvm.internal.impl.storage.a<>(t10);
            try {
                d(t10);
            } finally {
                this.f147555d = null;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.g, kotlin.jvm.functions.Function0
        public T invoke() {
            kotlin.reflect.jvm.internal.impl.storage.a<T> aVar = this.f147555d;
            return (aVar == null || !aVar.b()) ? (T) super.invoke() : aVar.a();
        }
    }

    private static class i<T> extends g<T> implements NotNullLazyValue<T> {
        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(LockBasedStorageManager lockBasedStorageManager, Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                a(0);
            }
            if (function0 == null) {
                a(1);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.g, kotlin.jvm.functions.Function0
        public T invoke() {
            T t10 = (T) super.invoke();
            if (t10 == null) {
                a(2);
            }
            return t10;
        }
    }

    private static abstract class j<T> extends h<T> implements NotNullLazyValue<T> {
        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(LockBasedStorageManager lockBasedStorageManager, Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                a(0);
            }
            if (function0 == null) {
                a(1);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.h, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.g, kotlin.jvm.functions.Function0
        public T invoke() {
            T t10 = (T) super.invoke();
            if (t10 == null) {
                a(2);
            }
            return t10;
        }
    }

    private static class k<K, V> implements MemoizedFunctionToNullable<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private final LockBasedStorageManager f147556a;

        /* renamed from: b, reason: collision with root package name */
        private final ConcurrentMap<K, Object> f147557b;

        /* renamed from: c, reason: collision with root package name */
        private final Function1<? super K, ? extends V> f147558c;

        private static /* synthetic */ void b(int i10) {
            String str = (i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 3 || i10 == 4) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 == 3 || i10 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i10 != 3 && i10 != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 3 && i10 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public k(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap<K, Object> concurrentMap, Function1<? super K, ? extends V> function1) {
            if (lockBasedStorageManager == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            if (function1 == null) {
                b(2);
            }
            this.f147556a = lockBasedStorageManager;
            this.f147557b = concurrentMap;
            this.f147558c = function1;
        }

        private AssertionError c(K k10, Object obj) {
            return (AssertionError) LockBasedStorageManager.q(new AssertionError("Inconsistent key detected. " + m.COMPUTING + " is expected, was: " + obj + ", most probably race condition detected on input " + k10 + " under " + this.f147556a));
        }

        private AssertionError d(K k10, Object obj) {
            AssertionError assertionError = (AssertionError) LockBasedStorageManager.q(new AssertionError("Race condition detected on input " + k10 + ". Old value is " + obj + " under " + this.f147556a));
            if (assertionError == null) {
                b(4);
            }
            return assertionError;
        }

        private AssertionError f(K k10, Throwable th2) {
            return (AssertionError) LockBasedStorageManager.q(new AssertionError("Unable to remove " + k10 + " under " + this.f147556a, th2));
        }

        protected n<V> e(K k10, boolean z10) {
            n<V> nVarP = this.f147556a.p("", k10);
            if (nVarP == null) {
                b(3);
            }
            return nVarP;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[Catch: all -> 0x003b, PHI: r0
          0x003e: PHI (r0v8 java.lang.Object) = (r0v7 java.lang.Object), (r0v21 java.lang.Object) binds: [B:10:0x0020, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:47:0x009f, B:49:0x00ad, B:50:0x00b1, B:51:0x00b2, B:52:0x00bc, B:54:0x00c2, B:55:0x00cc, B:57:0x00ce, B:58:0x00d2, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:53:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:63:0x0018, inners: #0, #2, #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
        @Override // kotlin.jvm.functions.Function1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public V invoke(K r6) {
            /*
                r5 = this;
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r5.f147557b
                java.lang.Object r0 = r0.get(r6)
                if (r0 == 0) goto L11
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$m r1 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.m.COMPUTING
                if (r0 == r1) goto L11
                java.lang.Object r6 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.d(r0)
                return r6
            L11:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r0 = r5.f147556a
                kotlin.reflect.jvm.internal.impl.storage.SimpleLock r0 = r0.f147541a
                r0.lock()
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r5.f147557b     // Catch: java.lang.Throwable -> L3b
                java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L3b
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$m r1 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.m.COMPUTING     // Catch: java.lang.Throwable -> L3b
                if (r0 != r1) goto L3e
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$m r0 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.m.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L3b
                r2 = 1
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$n r2 = r5.e(r6, r2)     // Catch: java.lang.Throwable -> L3b
                boolean r3 = r2.c()     // Catch: java.lang.Throwable -> L3b
                if (r3 != 0) goto L3e
                java.lang.Object r6 = r2.b()     // Catch: java.lang.Throwable -> L3b
            L33:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r0 = r5.f147556a
                kotlin.reflect.jvm.internal.impl.storage.SimpleLock r0 = r0.f147541a
                r0.unlock()
                return r6
            L3b:
                r6 = move-exception
                goto Ld3
            L3e:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$m r2 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.m.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L3b
                if (r0 != r2) goto L52
                r2 = 0
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$n r2 = r5.e(r6, r2)     // Catch: java.lang.Throwable -> L3b
                boolean r3 = r2.c()     // Catch: java.lang.Throwable -> L3b
                if (r3 != 0) goto L52
                java.lang.Object r6 = r2.b()     // Catch: java.lang.Throwable -> L3b
                goto L33
            L52:
                if (r0 == 0) goto L59
                java.lang.Object r6 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.d(r0)     // Catch: java.lang.Throwable -> L3b
                goto L33
            L59:
                r0 = 0
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r2 = r5.f147557b     // Catch: java.lang.Throwable -> L7e
                r2.put(r6, r1)     // Catch: java.lang.Throwable -> L7e
                kotlin.jvm.functions.Function1<? super K, ? extends V> r2 = r5.f147558c     // Catch: java.lang.Throwable -> L7e
                java.lang.Object r2 = r2.invoke(r6)     // Catch: java.lang.Throwable -> L7e
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r3 = r5.f147557b     // Catch: java.lang.Throwable -> L7e
                java.lang.Object r4 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.b(r2)     // Catch: java.lang.Throwable -> L7e
                java.lang.Object r3 = r3.put(r6, r4)     // Catch: java.lang.Throwable -> L7e
                if (r3 != r1) goto L79
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r6 = r5.f147556a
                kotlin.reflect.jvm.internal.impl.storage.SimpleLock r6 = r6.f147541a
                r6.unlock()
                return r2
            L79:
                java.lang.AssertionError r0 = r5.d(r6, r3)     // Catch: java.lang.Throwable -> L7e
                throw r0     // Catch: java.lang.Throwable -> L7e
            L7e:
                r1 = move-exception
                boolean r2 = kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt.a(r1)     // Catch: java.lang.Throwable -> L3b
                if (r2 == 0) goto L9d
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r5.f147557b     // Catch: java.lang.Throwable -> L97
                java.lang.Object r0 = r0.remove(r6)     // Catch: java.lang.Throwable -> L97
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$m r2 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.m.COMPUTING     // Catch: java.lang.Throwable -> L3b
                if (r0 == r2) goto L94
                java.lang.AssertionError r6 = r5.c(r6, r0)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            L94:
                java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1     // Catch: java.lang.Throwable -> L3b
                throw r1     // Catch: java.lang.Throwable -> L3b
            L97:
                r0 = move-exception
                java.lang.AssertionError r6 = r5.f(r6, r0)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            L9d:
                if (r1 == r0) goto Lbd
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r5.f147557b     // Catch: java.lang.Throwable -> L3b
                java.lang.Object r2 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.c(r1)     // Catch: java.lang.Throwable -> L3b
                java.lang.Object r0 = r0.put(r6, r2)     // Catch: java.lang.Throwable -> L3b
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$m r2 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.m.COMPUTING     // Catch: java.lang.Throwable -> L3b
                if (r0 == r2) goto Lb2
                java.lang.AssertionError r6 = r5.d(r6, r0)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            Lb2:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r6 = r5.f147556a     // Catch: java.lang.Throwable -> L3b
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$ExceptionHandlingStrategy r6 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.k(r6)     // Catch: java.lang.Throwable -> L3b
                java.lang.RuntimeException r6 = r6.a(r1)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            Lbd:
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r5.f147557b     // Catch: java.lang.Throwable -> Lcd
                r0.remove(r6)     // Catch: java.lang.Throwable -> Lcd
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r6 = r5.f147556a     // Catch: java.lang.Throwable -> L3b
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$ExceptionHandlingStrategy r6 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.k(r6)     // Catch: java.lang.Throwable -> L3b
                java.lang.RuntimeException r6 = r6.a(r1)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            Lcd:
                r0 = move-exception
                java.lang.AssertionError r6 = r5.f(r6, r0)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            Ld3:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r0 = r5.f147556a
                kotlin.reflect.jvm.internal.impl.storage.SimpleLock r0 = r0.f147541a
                r0.unlock()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.k.invoke(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable
        public boolean j(K k10) {
            Object obj = this.f147557b.get(k10);
            return (obj == null || obj == m.COMPUTING) ? false : true;
        }
    }

    private static class l<K, V> extends k<K, V> implements MemoizedFunctionToNotNull<K, V> {
        private static /* synthetic */ void b(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap<K, Object> concurrentMap, Function1<? super K, ? extends V> function1) {
            super(lockBasedStorageManager, concurrentMap, function1);
            if (lockBasedStorageManager == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            if (function1 == null) {
                b(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.k, kotlin.jvm.functions.Function1
        public V invoke(K k10) {
            V v10 = (V) super.invoke(k10);
            if (v10 == null) {
                b(3);
            }
            return v10;
        }
    }

    private enum m {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    private static class n<T> {

        /* renamed from: a, reason: collision with root package name */
        private final T f147563a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f147564b;

        public static <T> n<T> a() {
            return new n<>(null, true);
        }

        public static <T> n<T> d(T t10) {
            return new n<>(t10, false);
        }

        public T b() {
            return this.f147563a;
        }

        public boolean c() {
            return this.f147564b;
        }

        private n(T t10, boolean z10) {
            this.f147563a = t10;
            this.f147564b = z10;
        }

        public String toString() {
            if (c()) {
                return "FALL_THROUGH";
            }
            return String.valueOf(this.f147563a);
        }
    }

    /* synthetic */ LockBasedStorageManager(String str, ExceptionHandlingStrategy exceptionHandlingStrategy, SimpleLock simpleLock, a aVar) {
        this(str, exceptionHandlingStrategy, simpleLock);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void j(int r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.j(int):void");
    }

    private LockBasedStorageManager(String str, ExceptionHandlingStrategy exceptionHandlingStrategy, SimpleLock simpleLock) {
        if (str == null) {
            j(4);
        }
        if (exceptionHandlingStrategy == null) {
            j(5);
        }
        if (simpleLock == null) {
            j(6);
        }
        this.f147541a = simpleLock;
        this.f147542b = exceptionHandlingStrategy;
        this.f147543c = str;
    }

    private static <K> ConcurrentMap<K, Object> m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends Throwable> T q(T t10) {
        if (t10 == null) {
            j(36);
        }
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!stackTrace[i10].getClassName().startsWith(f147539d)) {
                break;
            }
            i10++;
        }
        List listSubList = Arrays.asList(stackTrace).subList(i10, length);
        t10.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
        return t10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <K, V> CacheWithNotNullValues<K, V> a() {
        return new d(this, m(), null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> NotNullLazyValue<T> b(Function0<? extends T> function0, T t10) {
        if (function0 == null) {
            j(26);
        }
        if (t10 == null) {
            j(27);
        }
        return new b(this, function0, t10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> NotNullLazyValue<T> c(Function0<? extends T> function0) {
        if (function0 == null) {
            j(23);
        }
        return new i(this, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> T d(Function0<? extends T> function0) {
        if (function0 == null) {
            j(34);
        }
        this.f147541a.lock();
        try {
            return function0.invoke();
        } finally {
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> NullableLazyValue<T> e(Function0<? extends T> function0) {
        if (function0 == null) {
            j(30);
        }
        return new g(this, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> NotNullLazyValue<T> f(Function0<? extends T> function0, Function1<? super Boolean, ? extends T> function1, Function1<? super T, Unit> function12) {
        if (function0 == null) {
            j(28);
        }
        if (function12 == null) {
            j(29);
        }
        return new c(this, function0, function1, function12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <K, V> MemoizedFunctionToNullable<K, V> g(Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            j(19);
        }
        MemoizedFunctionToNullable<K, V> memoizedFunctionToNullableO = o(function1, m());
        if (memoizedFunctionToNullableO == null) {
            j(20);
        }
        return memoizedFunctionToNullableO;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <K, V> CacheWithNullableValues<K, V> h() {
        return new e(this, m(), null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <K, V> MemoizedFunctionToNotNull<K, V> i(Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            j(9);
        }
        MemoizedFunctionToNotNull<K, V> memoizedFunctionToNotNullN = n(function1, m());
        if (memoizedFunctionToNotNullN == null) {
            j(10);
        }
        return memoizedFunctionToNotNullN;
    }

    public <K, V> MemoizedFunctionToNotNull<K, V> n(Function1<? super K, ? extends V> function1, ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            j(14);
        }
        if (concurrentMap == null) {
            j(15);
        }
        return new l(this, concurrentMap, function1);
    }

    public <K, V> MemoizedFunctionToNullable<K, V> o(Function1<? super K, ? extends V> function1, ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            j(21);
        }
        if (concurrentMap == null) {
            j(22);
        }
        return new k(this, concurrentMap, function1);
    }

    protected <K, V> n<V> p(String str, K k10) {
        String str2;
        if (str == null) {
            j(35);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Recursion detected ");
        sb2.append(str);
        if (k10 == null) {
            str2 = "";
        } else {
            str2 = "on input: " + k10;
        }
        sb2.append(str2);
        sb2.append(" under ");
        sb2.append(this);
        throw ((AssertionError) q(new AssertionError(sb2.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f147543c + ")";
    }

    public LockBasedStorageManager(String str) {
        this(str, (Runnable) null, (Function1<InterruptedException, Unit>) null);
    }

    public LockBasedStorageManager(String str, Runnable runnable, Function1<InterruptedException, Unit> function1) {
        this(str, ExceptionHandlingStrategy.f147544a, SimpleLock.f147565a.a(runnable, function1));
    }
}
