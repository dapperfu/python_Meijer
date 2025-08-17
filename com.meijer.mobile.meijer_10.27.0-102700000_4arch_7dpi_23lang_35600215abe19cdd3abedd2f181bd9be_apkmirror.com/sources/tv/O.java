package tv;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Ltv/O;", "Ltv/L;", "", "stopTimeout", "replayExpiration", "<init>", "(JJ)V", "Ltv/P;", "", "subscriptionCount", "Ltv/f;", "Ltv/J;", "a", "(Ltv/P;)Ltv/f;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "J", "c", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
final class O implements L {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long stopTimeout;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long replayExpiration;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "Ltv/J;", "", "count", "", "<anonymous>", "(Ltv/g;I)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {174, 176, 178, 179, 181}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function3<InterfaceC17153g<? super J>, Integer, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f162151a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f162152b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ int f162153c;

        a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        public final Object d(InterfaceC17153g<? super J> interfaceC17153g, int i10, Continuation<? super Unit> continuation) {
            a aVar = O.this.new a(continuation);
            aVar.f162152b = interfaceC17153g;
            aVar.f162153c = i10;
            return aVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC17153g<? super J> interfaceC17153g, Integer num, Continuation<? super Unit> continuation) {
            return d(interfaceC17153g, num.intValue(), continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        
            if (r1.emit(r10, r9) == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
        
            if (r1.emit(r10, r9) != r0) goto L35;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[PHI: r1
          0x008e: PHI (r1v5 tv.g) = (r1v3 tv.g), (r1v4 tv.g), (r1v11 tv.g) binds: [B:25:0x006e, B:30:0x008b, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r9.f162151a
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3c
                if (r1 == r6) goto L38
                if (r1 == r5) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L38
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                java.lang.Object r1 = r9.f162152b
                tv.g r1 = (tv.InterfaceC17153g) r1
                kotlin.ResultKt.b(r10)
                goto L8e
            L28:
                java.lang.Object r1 = r9.f162152b
                tv.g r1 = (tv.InterfaceC17153g) r1
                kotlin.ResultKt.b(r10)
                goto L7d
            L30:
                java.lang.Object r1 = r9.f162152b
                tv.g r1 = (tv.InterfaceC17153g) r1
                kotlin.ResultKt.b(r10)
                goto L64
            L38:
                kotlin.ResultKt.b(r10)
                goto L9c
            L3c:
                kotlin.ResultKt.b(r10)
                java.lang.Object r10 = r9.f162152b
                r1 = r10
                tv.g r1 = (tv.InterfaceC17153g) r1
                int r10 = r9.f162153c
                if (r10 <= 0) goto L53
                tv.J r10 = tv.J.f162128a
                r9.f162151a = r6
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
                goto L9b
            L53:
                tv.O r10 = tv.O.this
                long r6 = tv.O.c(r10)
                r9.f162152b = r1
                r9.f162151a = r5
                java.lang.Object r10 = qv.Z.b(r6, r9)
                if (r10 != r0) goto L64
                goto L9b
            L64:
                tv.O r10 = tv.O.this
                long r5 = tv.O.b(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L8e
                tv.J r10 = tv.J.f162129b
                r9.f162152b = r1
                r9.f162151a = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L7d
                goto L9b
            L7d:
                tv.O r10 = tv.O.this
                long r4 = tv.O.b(r10)
                r9.f162152b = r1
                r9.f162151a = r3
                java.lang.Object r10 = qv.Z.b(r4, r9)
                if (r10 != r0) goto L8e
                goto L9b
            L8e:
                tv.J r10 = tv.J.f162130c
                r3 = 0
                r9.f162152b = r3
                r9.f162151a = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
            L9b:
                return r0
            L9c:
                kotlin.Unit r10 = kotlin.Unit.f142422a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: tv.O.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltv/J;", "it", "", "<anonymous>", "(Ltv/J;)Z"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<J, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f162155a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f162156b;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(continuation);
            bVar.f162156b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j10, Continuation<? super Boolean> continuation) {
            return ((b) create(j10, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            IntrinsicsKt.f();
            if (this.f162155a == 0) {
                ResultKt.b(obj);
                if (((J) this.f162156b) != J.f162128a) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boxing.a(z10);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public String toString() {
        List listD = CollectionsKt.d(2);
        if (this.stopTimeout > 0) {
            listD.add("stopTimeout=" + this.stopTimeout + "ms");
        }
        if (this.replayExpiration < Long.MAX_VALUE) {
            listD.add("replayExpiration=" + this.replayExpiration + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + CollectionsKt.B0(CollectionsKt.a(listD), null, null, null, 0, null, null, 63, null) + ')';
    }

    @Override // tv.L
    public InterfaceC17152f<J> a(P<Integer> subscriptionCount) {
        return C17154h.r(C17154h.v(C17154h.e0(subscriptionCount, new a(null)), new b(null)));
    }

    public boolean equals(Object other) {
        if (!(other instanceof O)) {
            return false;
        }
        O o10 = (O) other;
        return this.stopTimeout == o10.stopTimeout && this.replayExpiration == o10.replayExpiration;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return (Long.hashCode(this.stopTimeout) * 31) + Long.hashCode(this.replayExpiration);
    }

    public O(long j10, long j11) {
        this.stopTimeout = j10;
        this.replayExpiration = j11;
        if (j10 >= 0) {
            if (j11 >= 0) {
                return;
            }
            throw new IllegalArgumentException(("replayExpiration(" + j11 + " ms) cannot be negative").toString());
        }
        throw new IllegalArgumentException(("stopTimeout(" + j10 + " ms) cannot be negative").toString());
    }
}
