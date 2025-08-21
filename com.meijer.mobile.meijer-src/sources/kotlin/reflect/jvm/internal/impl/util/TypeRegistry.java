package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes14.dex */
public abstract class TypeRegistry<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, Integer> f148050a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f148051b = new AtomicInteger(0);

    public abstract int c(ConcurrentHashMap<String, Integer> concurrentHashMap, String str, Function1<? super String, Integer> function1);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(TypeRegistry typeRegistry, String it) {
        Intrinsics.j(it, "it");
        return typeRegistry.f148051b.getAndIncrement();
    }

    public final Map<String, Integer> b() {
        return this.f148050a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends V, KK extends K> NullableArrayMapAccessor<K, V, T> d(KClass<KK> kClass) {
        Intrinsics.j(kClass, "kClass");
        return new NullableArrayMapAccessor<>(f(kClass));
    }

    public final int e(String keyQualifiedName) {
        Intrinsics.j(keyQualifiedName, "keyQualifiedName");
        return c(this.f148050a, keyQualifiedName, new i(this));
    }

    public final <T extends K> int f(KClass<T> kClass) {
        Intrinsics.j(kClass, "kClass");
        String strT = kClass.t();
        Intrinsics.g(strT);
        return e(strT);
    }

    protected final Collection<Integer> h() {
        Collection<Integer> collectionValues = this.f148050a.values();
        Intrinsics.i(collectionValues, "<get-values>(...)");
        return collectionValues;
    }
}
