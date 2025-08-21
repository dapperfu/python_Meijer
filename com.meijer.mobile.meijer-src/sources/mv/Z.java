package mv;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\n\u0010\u0007\u001a\u0013\u0010\u000b\u001a\u00020\u0003*\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "timeMillis", "", "b", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/time/Duration;", "duration", "c", "e", "(J)J", "Lkotlin/coroutines/CoroutineContext;", "Lmv/Y;", "d", "(Lkotlin/coroutines/CoroutineContext;)Lmv/Y;", "delay", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class Z {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", l = {160}, m = "awaitCancellation")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f151699a;

        /* renamed from: b, reason: collision with root package name */
        int f151700b;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f151699a = obj;
            this.f151700b |= Integer.MIN_VALUE;
            return Z.a(this);
        }

        a(Continuation<? super a> continuation) {
            super(continuation);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(kotlin.coroutines.Continuation<?> r4) {
        /*
            boolean r0 = r4 instanceof mv.Z.a
            if (r0 == 0) goto L13
            r0 = r4
            mv.Z$a r0 = (mv.Z.a) r0
            int r1 = r0.f151700b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f151700b = r1
            goto L18
        L13:
            mv.Z$a r0 = new mv.Z$a
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f151699a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f151700b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2d:
            kotlin.ResultKt.b(r4)
            goto L52
        L31:
            kotlin.ResultKt.b(r4)
            r0.f151700b = r3
            mv.p r4 = new mv.p
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r0)
            r4.<init>(r2, r3)
            r4.C()
            java.lang.Object r4 = r4.u()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            if (r4 != r2) goto L4f
            kotlin.coroutines.jvm.internal.DebugProbesKt.c(r0)
        L4f:
            if (r4 != r1) goto L52
            return r1
        L52:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mv.Z.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object b(long j10, Continuation<? super Unit> continuation) {
        if (j10 <= 0) {
            return Unit.f143329a;
        }
        C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
        c15819p.C();
        if (j10 < Long.MAX_VALUE) {
            d(c15819p.getContext()).H0(j10, c15819p);
        }
        Object objU = c15819p.u();
        if (objU == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objU == IntrinsicsKt.f() ? objU : Unit.f143329a;
    }

    public static final Y d(CoroutineContext coroutineContext) {
        CoroutineContext.Element elementG = coroutineContext.g(ContinuationInterceptor.INSTANCE);
        Y y10 = elementG instanceof Y ? (Y) elementG : null;
        return y10 == null ? V.a() : y10;
    }

    public static final Object c(long j10, Continuation<? super Unit> continuation) {
        Object objB = b(e(j10), continuation);
        if (objB == IntrinsicsKt.f()) {
            return objB;
        }
        return Unit.f143329a;
    }

    public static final long e(long j10) {
        boolean zU = Duration.U(j10);
        if (zU) {
            return Duration.F(Duration.W(j10, DurationKt.t(999999L, DurationUnit.f148414b)));
        }
        if (!zU) {
            return 0L;
        }
        throw new NoWhenBranchMatchedException();
    }
}
