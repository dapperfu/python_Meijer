package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes14.dex */
public interface StorageManager {
    <K, V> CacheWithNotNullValues<K, V> a();

    <T> NotNullLazyValue<T> b(Function0<? extends T> function0, T t10);

    <T> NotNullLazyValue<T> c(Function0<? extends T> function0);

    <T> T d(Function0<? extends T> function0);

    <T> NullableLazyValue<T> e(Function0<? extends T> function0);

    <T> NotNullLazyValue<T> f(Function0<? extends T> function0, Function1<? super Boolean, ? extends T> function1, Function1<? super T, Unit> function12);

    <K, V> MemoizedFunctionToNullable<K, V> g(Function1<? super K, ? extends V> function1);

    <K, V> CacheWithNullableValues<K, V> h();

    <K, V> MemoizedFunctionToNotNull<K, V> i(Function1<? super K, ? extends V> function1);
}
