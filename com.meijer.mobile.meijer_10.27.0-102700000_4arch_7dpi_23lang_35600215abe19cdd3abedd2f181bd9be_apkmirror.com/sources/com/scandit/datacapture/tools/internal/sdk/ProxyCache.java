package com.scandit.datacapture.tools.internal.sdk;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001JE\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u0001\"\b\b\u0001\u0010\u0004*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00062\u0006\u0010\u0007\u001a\u0002H\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00030\tH&¢\u0006\u0002\u0010\nJO\u0010\u000b\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0003*\u00020\u0001\"\b\b\u0001\u0010\u0004*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u0002H\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00040\tH&¢\u0006\u0002\u0010\u000fJK\u0010\u0010\u001a\u00020\u0011\"\b\b\u0000\u0010\u0003*\u00020\u0001\"\b\b\u0001\u0010\u0004*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u0002H\u00032\u0006\u0010\u0007\u001a\u0002H\u0004H&¢\u0006\u0002\u0010\u0012JA\u0010\u0013\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0003*\u00020\u0001\"\b\b\u0001\u0010\u0004*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u0002H\u0003H&¢\u0006\u0002\u0010\u0014J7\u0010\u0015\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u0001\"\b\b\u0001\u0010\u0004*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00062\u0006\u0010\u0007\u001a\u0002H\u0004H&¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "", "getByValueOrPut", "K", "V", "keyClass", "Lkotlin/reflect/KClass;", "value", "defaultKey", "Lkotlin/Function0;", "(Lkotlin/reflect/KClass;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getOrPut", "scope", "key", "defaultValue", "(Lkotlin/reflect/KClass;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "put", "", "(Lkotlin/reflect/KClass;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "require", "(Lkotlin/reflect/KClass;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "requireByValue", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Ljava/lang/Object;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ProxyCache {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void put$default(ProxyCache proxyCache, KClass kClass, Object obj, Object obj2, Object obj3, int i10, Object obj4) {
            if (obj4 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: put");
            }
            if ((i10 & 2) != 0) {
                obj = null;
            }
            proxyCache.put(kClass, obj, obj2, obj3);
        }
    }

    <K, V> K getByValueOrPut(KClass<K> keyClass, V value, Function0<? extends K> defaultKey);

    <K, V> V getOrPut(KClass<K> keyClass, Object scope, K key, Function0<? extends V> defaultValue);

    <K, V> void put(KClass<K> keyClass, Object scope, K key, V value);

    <K, V> V require(KClass<K> keyClass, Object scope, K key);

    <K, V> K requireByValue(KClass<K> keyClass, V value);
}
