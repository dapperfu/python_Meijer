package kotlin.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u001aX\u0010\b\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0002\b\u00052\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0001¢\u0006\u0004\b\b\u0010\t\u001al\u0010\r\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n\"\u0004\b\u0002\u0010\u0001*)\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000b¢\u0006\u0002\b\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\\\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0002\b\u00052\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a)\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"R", "T", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "receiver", "completion", "d", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "P", "Lkotlin/Function3;", "param", "e", "(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "c", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "b", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
@SourceDebugExtension
/* loaded from: classes8.dex */
public class IntrinsicsKt__IntrinsicsJvmKt {
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin
    public static <R, T> Continuation<Unit> a(final Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, final R r10, Continuation<? super T> completion) {
        Intrinsics.j(function2, "<this>");
        Intrinsics.j(completion, "completion");
        final Continuation<?> continuationA = DebugProbesKt.a(completion);
        if (function2 instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) function2).create(r10, continuationA);
        }
        final CoroutineContext context = continuationA.getF143270a();
        return context == EmptyCoroutineContext.f143553a ? new RestrictedContinuationImpl(continuationA, function2, r10) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private int label;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2 f143567b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f143568c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(continuationA);
                this.f143567b = function2;
                this.f143568c = r10;
                Intrinsics.h(continuationA, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            protected Object invokeSuspend(Object result) {
                int i10 = this.label;
                if (i10 == 0) {
                    this.label = 1;
                    ResultKt.b(result);
                    Intrinsics.h(this.f143567b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                    return ((Function2) TypeIntrinsics.f(this.f143567b, 2)).invoke(this.f143568c, this);
                }
                if (i10 != 1) {
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.label = 2;
                ResultKt.b(result);
                return result;
            }
        } : new ContinuationImpl(continuationA, context, function2, r10) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private int label;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2 f143570b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f143571c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(continuationA, context);
                this.f143570b = function2;
                this.f143571c = r10;
                Intrinsics.h(continuationA, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            protected Object invokeSuspend(Object result) {
                int i10 = this.label;
                if (i10 == 0) {
                    this.label = 1;
                    ResultKt.b(result);
                    Intrinsics.h(this.f143570b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                    return ((Function2) TypeIntrinsics.f(this.f143570b, 2)).invoke(this.f143571c, this);
                }
                if (i10 != 1) {
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.label = 2;
                ResultKt.b(result);
                return result;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin
    public static <T> Continuation<T> c(Continuation<? super T> continuation) {
        Continuation<T> continuation2;
        Intrinsics.j(continuation, "<this>");
        ContinuationImpl continuationImpl = continuation instanceof ContinuationImpl ? (ContinuationImpl) continuation : null;
        return (continuationImpl == null || (continuation2 = (Continuation<T>) continuationImpl.intercepted()) == null) ? continuation : continuation2;
    }

    @PublishedApi
    public static <R, T> Object d(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r10, Continuation<? super T> completion) {
        Intrinsics.j(function2, "<this>");
        Intrinsics.j(completion, "completion");
        return ((Function2) TypeIntrinsics.f(function2, 2)).invoke(r10, b(DebugProbesKt.a(completion)));
    }

    @PublishedApi
    public static <R, P, T> Object e(Function3<? super R, ? super P, ? super Continuation<? super T>, ? extends Object> function3, R r10, P p10, Continuation<? super T> completion) {
        Intrinsics.j(function3, "<this>");
        Intrinsics.j(completion, "completion");
        return ((Function3) TypeIntrinsics.f(function3, 3)).invoke(r10, p10, b(DebugProbesKt.a(completion)));
    }

    private static final <T> Continuation<T> b(final Continuation<? super T> continuation) {
        final CoroutineContext context = continuation.getF143270a();
        if (context == EmptyCoroutineContext.f143553a) {
            return new RestrictedContinuationImpl(continuation) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(continuation);
                    Intrinsics.h(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                protected Object invokeSuspend(Object result) {
                    ResultKt.b(result);
                    return result;
                }
            };
        }
        return new ContinuationImpl(continuation, context) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(continuation, context);
                Intrinsics.h(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            protected Object invokeSuspend(Object result) {
                ResultKt.b(result);
                return result;
            }
        };
    }
}
