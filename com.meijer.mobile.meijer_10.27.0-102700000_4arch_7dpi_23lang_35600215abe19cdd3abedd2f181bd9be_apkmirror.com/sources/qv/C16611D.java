package qv;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u0007\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"T", "Lkotlin/Result;", "", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lqv/n;", "caller", "c", "(Ljava/lang/Object;Lqv/n;)Ljava/lang/Object;", "state", "Lkotlin/coroutines/Continuation;", "uCont", "a", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: qv.D, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C16611D {
    public static final <T> Object a(Object obj, Continuation<? super T> continuation) {
        if (!(obj instanceof C16610C)) {
            return Result.b(obj);
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.b(ResultKt.a(((C16610C) obj).cause));
    }

    public static final <T> Object b(Object obj) {
        Throwable thE = Result.e(obj);
        if (thE == null) {
            return obj;
        }
        return new C16610C(thE, false, 2, null);
    }

    public static final <T> Object c(Object obj, InterfaceC16654n<?> interfaceC16654n) {
        Throwable thE = Result.e(obj);
        if (thE == null) {
            return obj;
        }
        return new C16610C(thE, false, 2, null);
    }
}
