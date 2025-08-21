package com.scandit.datacapture.tools.internal.sdk;

import com.scandit.datacapture.tools.internal.module.mapmaker.C13532f;
import com.scandit.datacapture.tools.internal.module.mapmaker.C13533g;
import com.scandit.datacapture.tools.internal.module.mapmaker.C13544s;
import com.scandit.datacapture.tools.internal.module.mapmaker.D;
import com.scandit.datacapture.tools.internal.module.mapmaker.G;
import com.scandit.datacapture.tools.internal.module.mapmaker.N;
import com.scandit.datacapture.tools.internal.module.mapmaker.P;
import com.scandit.datacapture.tools.internal.module.mapmaker.S;
import com.scandit.datacapture.tools.internal.module.mapmaker.t;
import com.scandit.datacapture.tools.internal.module.mapmaker.u;
import com.scandit.datacapture.tools.internal.module.mapmaker.v;
import com.scandit.datacapture.tools.internal.module.mapmaker.y;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\r\u001a\u00028\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00028\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJC\u0010\u000f\u001a\u00028\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010JK\u0010\u0013\u001a\u00020\u0012\"\b\b\u0000\u0010\u0005*\u00020\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0016JG\u0010\u0018\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0011\u001a\u00028\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/scandit/datacapture/tools/internal/sdk/GuavaMapMakerProxyCache;", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "<init>", "()V", "", "K", "V", "Lkotlin/reflect/KClass;", "keyClass", "scope", "key", "Lkotlin/Function0;", "defaultValue", "getOrPut", "(Lkotlin/reflect/KClass;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "require", "(Lkotlin/reflect/KClass;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "value", "", "put", "(Lkotlin/reflect/KClass;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "requireByValue", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Ljava/lang/Object;", "defaultKey", "getByValueOrPut", "(Lkotlin/reflect/KClass;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class GuavaMapMakerProxyCache implements ProxyCache {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f127218a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f127219b = new LinkedHashMap();

    private final synchronized ConcurrentMap a(KClass kClass, Object obj) {
        ConcurrentMap concurrentMap;
        try {
            if (obj == null) {
                LinkedHashMap linkedHashMap = this.f127218a;
                Object objA = linkedHashMap.get(kClass);
                if (objA == null) {
                    objA = a();
                    linkedHashMap.put(kClass, objA);
                }
                concurrentMap = (ConcurrentMap) objA;
            } else {
                WeakHashMap weakHashMap = (WeakHashMap) this.f127219b.get(kClass);
                if (weakHashMap == null) {
                    weakHashMap = new WeakHashMap();
                    this.f127219b.put(kClass, weakHashMap);
                }
                Object objA2 = weakHashMap.get(obj);
                if (objA2 == null) {
                    objA2 = a();
                    weakHashMap.put(obj, objA2);
                }
                Intrinsics.g(objA2);
                concurrentMap = (ConcurrentMap) objA2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return concurrentMap;
    }

    @Override // com.scandit.datacapture.tools.internal.sdk.ProxyCache
    public <K, V> K getByValueOrPut(KClass<K> keyClass, V value, Function0<? extends K> defaultKey) {
        Object next;
        Intrinsics.j(keyClass, "keyClass");
        Intrinsics.j(value, "value");
        Intrinsics.j(defaultKey, "defaultKey");
        ConcurrentMap concurrentMapA = a(keyClass, null);
        Iterator<T> it = concurrentMapA.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Map.Entry) next).getValue() == value) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        K kInvoke = entry != null ? (K) entry.getKey() : null;
        if (kInvoke == null) {
            kInvoke = defaultKey.invoke();
            concurrentMapA.put(kInvoke, value);
        }
        Intrinsics.h(kInvoke, "null cannot be cast to non-null type K of com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache.getByValueOrPut");
        return kInvoke;
    }

    @Override // com.scandit.datacapture.tools.internal.sdk.ProxyCache
    public <K, V> V getOrPut(KClass<K> keyClass, Object scope, K key, Function0<? extends V> defaultValue) {
        Object objPutIfAbsent;
        Intrinsics.j(keyClass, "keyClass");
        Intrinsics.j(key, "key");
        Intrinsics.j(defaultValue, "defaultValue");
        ConcurrentMap concurrentMapA = a(keyClass, scope);
        V vInvoke = (V) concurrentMapA.get(key);
        if (vInvoke == null && (objPutIfAbsent = concurrentMapA.putIfAbsent(key, (vInvoke = defaultValue.invoke()))) != null) {
            vInvoke = (V) objPutIfAbsent;
        }
        Intrinsics.h(vInvoke, "null cannot be cast to non-null type V of com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache.getOrPut");
        return vInvoke;
    }

    @Override // com.scandit.datacapture.tools.internal.sdk.ProxyCache
    public <K, V> void put(KClass<K> keyClass, Object scope, K key, V value) {
        Intrinsics.j(keyClass, "keyClass");
        Intrinsics.j(key, "key");
        Intrinsics.j(value, "value");
        a(keyClass, scope).put(key, value);
    }

    @Override // com.scandit.datacapture.tools.internal.sdk.ProxyCache
    public <K, V> V require(KClass<K> keyClass, Object scope, K key) {
        Intrinsics.j(keyClass, "keyClass");
        Intrinsics.j(key, "key");
        V v10 = (V) a(keyClass, scope).get(key);
        if (v10 != null) {
            return v10;
        }
        throw new IllegalArgumentException("Cache for class " + keyClass + " contains no key " + key);
    }

    @Override // com.scandit.datacapture.tools.internal.sdk.ProxyCache
    public <K, V> K requireByValue(KClass<K> keyClass, V value) {
        Object next;
        Intrinsics.j(keyClass, "keyClass");
        Intrinsics.j(value, "value");
        K k10 = null;
        Iterator<T> it = a(keyClass, null).entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.e(((Map.Entry) next).getValue(), value)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            k10 = (K) entry.getKey();
        }
        if (k10 != null) {
            return k10;
        }
        throw new IllegalArgumentException("Cache for class " + keyClass + " contains no key for value " + value);
    }

    private static N a() {
        N n10;
        C13532f c13532f = new C13532f();
        t tVar = u.f127212b;
        u uVar = c13532f.f127187a;
        S.a(uVar == null, "Key strength was already set to %s", (t) uVar);
        c13532f.f127187a = tVar;
        u uVar2 = c13532f.f127188b;
        S.a(uVar2 == null, "Value strength was already set to %s", (t) uVar2);
        c13532f.f127188b = tVar;
        C13533g c13533g = N.f127171j;
        u uVar3 = c13532f.f127187a;
        C13544s c13544s = u.f127211a;
        if (((u) P.a(uVar3, c13544s)) == c13544s && ((u) P.a(c13532f.f127188b, c13544s)) == c13544s) {
            n10 = new N(c13532f, v.f127214a);
        } else if (((u) P.a(c13532f.f127187a, c13544s)) == c13544s && ((u) P.a(c13532f.f127188b, c13544s)) == tVar) {
            n10 = new N(c13532f, y.f127216a);
        } else if (((u) P.a(c13532f.f127187a, c13544s)) == tVar && ((u) P.a(c13532f.f127188b, c13544s)) == c13544s) {
            n10 = new N(c13532f, D.f127160a);
        } else if (((u) P.a(c13532f.f127187a, c13544s)) == tVar && ((u) P.a(c13532f.f127188b, c13544s)) == tVar) {
            n10 = new N(c13532f, G.f127163a);
        } else {
            throw new AssertionError();
        }
        Intrinsics.i(n10, "makeMap(...)");
        return n10;
    }
}
