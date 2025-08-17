package kotlin.reflect.jvm.internal;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KAnnotatedElement;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.full.KClassifiers;

@Metadata(d1 = {"\u0000T\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\u0010\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a=\u0010\u0012\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011\"*\u0010\u0017\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0014*\u0004\u0018\u00010\u00000\u00000\u00040\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016\"\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0016\"<\u0010#\u001a*\u0012&\u0012$\u0012\u001a\u0012\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\r0 j\u0002`!\u0012\u0004\u0012\u00020\u000f0\u001f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0016*0\b\u0002\u0010$\"\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\r0 2\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\r0 ¨\u0006%"}, d2 = {"", "T", "Ljava/lang/Class;", "jClass", "Lkotlin/reflect/jvm/internal/KClassImpl;", "m", "(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/KClassImpl;", "Lkotlin/reflect/KDeclarationContainer;", "n", "(Ljava/lang/Class;)Lkotlin/reflect/KDeclarationContainer;", "", "Lkotlin/reflect/KTypeProjection;", "arguments", "", "isMarkedNullable", "Lkotlin/reflect/KType;", "k", "(Ljava/lang/Class;Ljava/util/List;Z)Lkotlin/reflect/KType;", "l", "Lkotlin/reflect/jvm/internal/CacheByClass;", "kotlin.jvm.PlatformType", "a", "Lkotlin/reflect/jvm/internal/CacheByClass;", "K_CLASS_CACHE", "Lkotlin/reflect/jvm/internal/KPackageImpl;", "b", "K_PACKAGE_CACHE", "c", "CACHE_FOR_BASE_CLASSIFIERS", "d", "CACHE_FOR_NULLABLE_BASE_CLASSIFIERS", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/Pair;", "Lkotlin/reflect/jvm/internal/Key;", "e", "CACHE_FOR_GENERIC_CLASSIFIERS", "Key", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CachesKt {

    /* renamed from: a, reason: collision with root package name */
    private static final CacheByClass<KClassImpl<? extends Object>> f142983a = CacheByClassKt.a(C15224a.f143149a);

    /* renamed from: b, reason: collision with root package name */
    private static final CacheByClass<KPackageImpl> f142984b = CacheByClassKt.a(C15226b.f143151a);

    /* renamed from: c, reason: collision with root package name */
    private static final CacheByClass<KType> f142985c = CacheByClassKt.a(C15228c.f143153a);

    /* renamed from: d, reason: collision with root package name */
    private static final CacheByClass<KType> f142986d = CacheByClassKt.a(C15230d.f143215a);

    /* renamed from: e, reason: collision with root package name */
    private static final CacheByClass<ConcurrentHashMap<Pair<List<KTypeProjection>, Boolean>, KType>> f142987e = CacheByClassKt.a(C15231e.f143217a);

    /* JADX INFO: Access modifiers changed from: private */
    public static final KType a(Class it) {
        Intrinsics.j(it, "it");
        return KClassifiers.b(m(it), CollectionsKt.m(), false, CollectionsKt.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConcurrentHashMap b(Class it) {
        Intrinsics.j(it, "it");
        return new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KType c(Class it) {
        Intrinsics.j(it, "it");
        return KClassifiers.b(m(it), CollectionsKt.m(), true, CollectionsKt.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KClassImpl d(Class it) {
        Intrinsics.j(it, "it");
        return new KClassImpl(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KPackageImpl e(Class it) {
        Intrinsics.j(it, "it");
        return new KPackageImpl(it);
    }

    public static final <T> KType k(Class<T> jClass, List<KTypeProjection> arguments, boolean z10) {
        Intrinsics.j(jClass, "jClass");
        Intrinsics.j(arguments, "arguments");
        return arguments.isEmpty() ? z10 ? f142986d.a(jClass) : f142985c.a(jClass) : l(jClass, arguments, z10);
    }

    private static final <T> KType l(Class<T> cls, List<KTypeProjection> list, boolean z10) {
        ConcurrentHashMap<Pair<List<KTypeProjection>, Boolean>, KType> concurrentHashMapA = f142987e.a(cls);
        Pair<List<KTypeProjection>, Boolean> pairA = TuplesKt.a(list, Boolean.valueOf(z10));
        KType kType = concurrentHashMapA.get(pairA);
        if (kType == null) {
            KType kTypeB = KClassifiers.b(m(cls), list, z10, CollectionsKt.m());
            KType kTypePutIfAbsent = concurrentHashMapA.putIfAbsent(pairA, kTypeB);
            kType = kTypePutIfAbsent == null ? kTypeB : kTypePutIfAbsent;
        }
        Intrinsics.i(kType, "getOrPut(...)");
        return kType;
    }

    public static final <T> KClassImpl<T> m(Class<T> jClass) {
        Intrinsics.j(jClass, "jClass");
        KAnnotatedElement kAnnotatedElementA = f142983a.a(jClass);
        Intrinsics.h(kAnnotatedElementA, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (KClassImpl) kAnnotatedElementA;
    }

    public static final <T> KDeclarationContainer n(Class<T> jClass) {
        Intrinsics.j(jClass, "jClass");
        return f142984b.a(jClass);
    }
}
