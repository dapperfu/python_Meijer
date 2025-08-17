package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "V", "Lkotlin/Function1;", "Ljava/lang/Class;", "compute", "Lkotlin/reflect/jvm/internal/CacheByClass;", "a", "(Lkotlin/jvm/functions/Function1;)Lkotlin/reflect/jvm/internal/CacheByClass;", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CacheByClassKt {
    static {
        Object objB;
        try {
            Result.Companion companion = Result.INSTANCE;
            objB = Result.b(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        if (Result.h(objB)) {
            objB = Boolean.TRUE;
        }
        Object objB2 = Result.b(objB);
        Boolean bool = Boolean.FALSE;
        if (Result.g(objB2)) {
            objB2 = bool;
        }
        ((Boolean) objB2).getClass();
    }

    public static final <V> CacheByClass<V> a(Function1<? super Class<?>, ? extends V> compute) {
        Intrinsics.j(compute, "compute");
        return new C15232f(compute);
    }
}
