package wv;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DispatchException;
import vv.C17653i;

@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\u001aQ\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u000b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u00032\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u000f\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"R", "T", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "receiver", "completion", "", "c", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "fatalCompletion", "b", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/Continuation;)V", "", "e", "a", "(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: wv.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C17865a {
    private static final void a(Continuation<?> continuation, Throwable th2) throws Throwable {
        if (th2 instanceof DispatchException) {
            th2 = ((DispatchException) th2).getCause();
        }
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.b(ResultKt.a(th2)));
        throw th2;
    }

    public static final void b(Continuation<? super Unit> continuation, Continuation<?> continuation2) throws Throwable {
        try {
            Continuation continuationC = IntrinsicsKt.c(continuation);
            Result.Companion companion = Result.INSTANCE;
            C17653i.b(continuationC, Result.b(Unit.f142422a));
        } catch (Throwable th2) {
            a(continuation2, th2);
        }
    }

    public static final <R, T> void c(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r10, Continuation<? super T> continuation) {
        try {
            Continuation continuationC = IntrinsicsKt.c(IntrinsicsKt.a(function2, r10, continuation));
            Result.Companion companion = Result.INSTANCE;
            C17653i.b(continuationC, Result.b(Unit.f142422a));
        } catch (Throwable th2) {
            a(continuation, th2);
        }
    }
}
