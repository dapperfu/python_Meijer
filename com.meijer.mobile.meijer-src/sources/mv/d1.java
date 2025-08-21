package mv;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.TimeoutCancellationException;
import sv.C17169b;

@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aT\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n\u001aT\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\f\u001a\u00020\u000b2'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\r\u0010\n\u001aI\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@¢\u0006\u0004\b\u000e\u0010\n\u001a^\u0010\u0012\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0000*\u00028\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00102'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"T", "", "timeMillis", "Lkotlin/Function2;", "Lmv/O;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "c", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/time/Duration;", "timeout", "d", "e", "U", "Lmv/c1;", "coroutine", "b", "(Lmv/c1;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "time", "Lmv/Y;", "delay", "Lmv/C0;", "Lkotlinx/coroutines/TimeoutCancellationException;", "a", "(JLmv/Y;Lmv/C0;)Lkotlinx/coroutines/TimeoutCancellationException;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d1 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {102}, m = "withTimeoutOrNull")
    static final class a<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        long f151711a;

        /* renamed from: b, reason: collision with root package name */
        Object f151712b;

        /* renamed from: c, reason: collision with root package name */
        Object f151713c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f151714d;

        /* renamed from: e, reason: collision with root package name */
        int f151715e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f151714d = obj;
            this.f151715e |= Integer.MIN_VALUE;
            return d1.e(0L, null, this);
        }

        a(Continuation<? super a> continuation) {
            super(continuation);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlinx.coroutines.TimeoutCancellationException a(long r2, mv.Y r4, mv.C0 r5) {
        /*
            boolean r0 = r4 instanceof mv.InterfaceC15790a0
            if (r0 == 0) goto L7
            mv.a0 r4 = (mv.InterfaceC15790a0) r4
            goto L8
        L7:
            r4 = 0
        L8:
            if (r4 == 0) goto L18
            kotlin.time.Duration$Companion r0 = kotlin.time.Duration.INSTANCE
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.f148416d
            long r0 = kotlin.time.DurationKt.t(r2, r0)
            java.lang.String r4 = r4.h0(r0)
            if (r4 != 0) goto L2e
        L18:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Timed out waiting for "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = " ms"
            r4.append(r2)
            java.lang.String r4 = r4.toString()
        L2e:
            kotlinx.coroutines.TimeoutCancellationException r2 = new kotlinx.coroutines.TimeoutCancellationException
            r2.<init>(r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mv.d1.a(long, mv.Y, mv.C0):kotlinx.coroutines.TimeoutCancellationException");
    }

    private static final <U, T extends U> Object b(c1<U, ? super T> c1Var, Function2<? super InterfaceC15783O, ? super Continuation<? super T>, ? extends Object> function2) {
        E0.h(c1Var, Z.d(c1Var.uCont.getContext()).w(c1Var.time, c1Var, c1Var.getContext()));
        return C17169b.e(c1Var, c1Var, function2);
    }

    public static final <T> Object c(long j10, Function2<? super InterfaceC15783O, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        if (j10 <= 0) {
            throw new TimeoutCancellationException("Timed out immediately");
        }
        Object objB = b(new c1(j10, continuation), function2);
        if (objB == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objB;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, mv.c1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object e(long r7, kotlin.jvm.functions.Function2<? super mv.InterfaceC15783O, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r9, kotlin.coroutines.Continuation<? super T> r10) {
        /*
            boolean r0 = r10 instanceof mv.d1.a
            if (r0 == 0) goto L13
            r0 = r10
            mv.d1$a r0 = (mv.d1.a) r0
            int r1 = r0.f151715e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f151715e = r1
            goto L18
        L13:
            mv.d1$a r0 = new mv.d1$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f151714d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f151715e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.f151713c
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
            java.lang.Object r8 = r0.f151712b
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            kotlin.ResultKt.b(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L32
            return r10
        L32:
            r8 = move-exception
            goto L6f
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            kotlin.ResultKt.b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L46
            return r3
        L46:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            r0.f151712b = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.f151713c = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.f151711a = r7     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.f151715e = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            mv.c1 r2 = new mv.c1     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r10.f143742a = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            java.lang.Object r7 = b(r2, r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            if (r7 != r8) goto L6b
            kotlin.coroutines.jvm.internal.DebugProbesKt.c(r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            goto L6b
        L68:
            r8 = move-exception
            r7 = r10
            goto L6f
        L6b:
            if (r7 != r1) goto L6e
            return r1
        L6e:
            return r7
        L6f:
            mv.C0 r9 = r8.coroutine
            T r7 = r7.f143742a
            if (r9 != r7) goto L76
            return r3
        L76:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mv.d1.e(long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> Object d(long j10, Function2<? super InterfaceC15783O, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return c(Z.e(j10), function2, continuation);
    }
}
