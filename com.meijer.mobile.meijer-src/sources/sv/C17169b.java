package sv;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import mv.C15771C;
import mv.I0;
import rv.C16946A;
import rv.C16957L;

@Metadata(d1 = {"\u0000D\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001aQ\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001aX\u0010\r\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00028\u00012'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0002\b\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aX\u0010\u000f\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00028\u00012'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0002\b\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001a`\u0010\u0012\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00028\u00012'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0002\b\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0016\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u001a\u001a\u00020\u0019*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"R", "T", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "receiver", "completion", "", "c", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "Lrv/A;", "Lkotlin/ExtensionFunctionType;", "block", "d", "(Lrv/A;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "e", "", "alwaysRethrow", "f", "(Lrv/A;ZLjava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "", "cause", "b", "(Lrv/A;Ljava/lang/Throwable;)Z", "Lkotlinx/coroutines/DispatchException;", "", "a", "(Lrv/A;Lkotlinx/coroutines/DispatchException;)Ljava/lang/Void;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: sv.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C17169b {
    public static final <T, R> Object d(C16946A<? super T> c16946a, R r10, Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        return f(c16946a, true, r10, function2);
    }

    public static final <T, R> Object e(C16946A<? super T> c16946a, R r10, Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        return f(c16946a, false, r10, function2);
    }

    private static final <T, R> Object f(C16946A<? super T> c16946a, boolean z10, R r10, Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) throws Throwable {
        Object c15771c;
        try {
            c15771c = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt.d(function2, r10, c16946a) : ((Function2) TypeIntrinsics.f(function2, 2)).invoke(r10, c16946a);
        } catch (DispatchException e10) {
            a(c16946a, e10);
            throw new KotlinNothingValueException();
        } catch (Throwable th2) {
            c15771c = new C15771C(th2, false, 2, null);
        }
        if (c15771c == IntrinsicsKt.f()) {
            return IntrinsicsKt.f();
        }
        Object objJ0 = c16946a.J0(c15771c);
        if (objJ0 == I0.f151670b) {
            return IntrinsicsKt.f();
        }
        c16946a.j1();
        if (!(objJ0 instanceof C15771C)) {
            return I0.h(objJ0);
        }
        if (z10 || b(c16946a, ((C15771C) objJ0).cause)) {
            throw ((C15771C) objJ0).cause;
        }
        if (c15771c instanceof C15771C) {
            throw ((C15771C) c15771c).cause;
        }
        return c15771c;
    }

    private static final Void a(C16946A<?> c16946a, DispatchException dispatchException) throws Throwable {
        c16946a.I0(new C15771C(dispatchException.getCause(), false, 2, null));
        throw dispatchException.getCause();
    }

    private static final boolean b(C16946A<?> c16946a, Throwable th2) {
        return ((th2 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th2).coroutine == c16946a) ? false : true;
    }

    public static final <R, T> void c(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r10, Continuation<? super T> continuation) {
        Object objInvoke;
        Continuation continuationA = DebugProbesKt.a(continuation);
        try {
            CoroutineContext f143270a = continuationA.getF143270a();
            Object objI = C16957L.i(f143270a, null);
            try {
                DebugProbesKt.b(continuationA);
                if (!(function2 instanceof BaseContinuationImpl)) {
                    objInvoke = IntrinsicsKt.d(function2, r10, continuationA);
                } else {
                    objInvoke = ((Function2) TypeIntrinsics.f(function2, 2)).invoke(r10, continuationA);
                }
                C16957L.f(f143270a, objI);
                if (objInvoke != IntrinsicsKt.f()) {
                    continuationA.resumeWith(Result.b(objInvoke));
                }
            } catch (Throwable th2) {
                C16957L.f(f143270a, objI);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).getCause();
            }
            Result.Companion companion = Result.INSTANCE;
            continuationA.resumeWith(Result.b(ResultKt.a(th)));
        }
    }
}
