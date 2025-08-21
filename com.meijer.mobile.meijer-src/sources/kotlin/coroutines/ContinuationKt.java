package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\\\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0002\b\u00052\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¢\u0006\u0004\b\t\u0010\n\u001aV\u0010\u000b\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0002\b\u00052\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"R", "T", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "receiver", "completion", "", "a", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "b", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ContinuationKt {
    @SinceKotlin
    public static final <R, T> Continuation<Unit> a(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r10, Continuation<? super T> completion) {
        Intrinsics.j(function2, "<this>");
        Intrinsics.j(completion, "completion");
        return new SafeContinuation(IntrinsicsKt.c(IntrinsicsKt.a(function2, r10, completion)), IntrinsicsKt.f());
    }

    @SinceKotlin
    public static final <R, T> void b(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r10, Continuation<? super T> completion) {
        Intrinsics.j(function2, "<this>");
        Intrinsics.j(completion, "completion");
        Continuation continuationC = IntrinsicsKt.c(IntrinsicsKt.a(function2, r10, completion));
        Result.Companion companion = Result.INSTANCE;
        continuationC.resumeWith(Result.b(Unit.f143329a));
    }
}
