package kotlin;

import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "exception", "", "a", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "Lkotlin/Result;", "", "b", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ResultKt {
    @SinceKotlin
    @PublishedApi
    public static final Object a(Throwable exception) {
        Intrinsics.j(exception, "exception");
        return new Result.Failure(exception);
    }

    @SinceKotlin
    @PublishedApi
    public static final void b(Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
    }
}
