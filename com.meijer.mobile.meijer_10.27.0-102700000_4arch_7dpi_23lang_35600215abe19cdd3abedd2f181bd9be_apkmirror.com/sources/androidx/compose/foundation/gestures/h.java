package androidx.compose.foundation.gestures;

import f1.InterfaceC13828a;
import kotlin.C13793K;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u0012\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/gestures/h;", "Lf1/a;", "Lf0/K;", "scrollingLogic", "", "enabled", "<init>", "(Lf0/K;Z)V", "LU0/f;", "consumed", "available", "Lf1/e;", "source", "L0", "(JJI)J", "LH1/y;", "b0", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lf0/K;", "getScrollingLogic", "()Lf0/K;", "b", "Z", "getEnabled", "()Z", "(Z)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class h implements InterfaceC13828a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C13793K scrollingLogic;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", f = "Scrollable.kt", l = {898, 901}, m = "onPostFling-RZ2iAVY")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        long f48319a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f48320b;

        /* renamed from: d, reason: collision with root package name */
        int f48322d;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f48320b = obj;
            this.f48322d |= Integer.MIN_VALUE;
            return h.this.b0(0L, 0L, this);
        }
    }

    @Override // f1.InterfaceC13828a
    public long L0(long consumed, long available, int source) {
        return this.enabled ? this.scrollingLogic.v(available) : U0.f.INSTANCE.c();
    }

    public final void a(boolean z10) {
        this.enabled = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r5 == r8) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        if (r5 == r8) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // f1.InterfaceC13828a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b0(long r4, long r6, kotlin.coroutines.Continuation<? super H1.y> r8) {
        /*
            r3 = this;
            boolean r4 = r8 instanceof androidx.compose.foundation.gestures.h.a
            if (r4 == 0) goto L13
            r4 = r8
            androidx.compose.foundation.gestures.h$a r4 = (androidx.compose.foundation.gestures.h.a) r4
            int r5 = r4.f48322d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L13
            int r5 = r5 - r0
            r4.f48322d = r5
            goto L18
        L13:
            androidx.compose.foundation.gestures.h$a r4 = new androidx.compose.foundation.gestures.h$a
            r4.<init>(r8)
        L18:
            java.lang.Object r5 = r4.f48320b
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r0 = r4.f48322d
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L36
            if (r0 != r1) goto L2e
            long r6 = r4.f48319a
            kotlin.ResultKt.b(r5)
            goto L77
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            long r6 = r4.f48319a
            kotlin.ResultKt.b(r5)
            goto L63
        L3c:
            kotlin.ResultKt.b(r5)
            boolean r5 = r3.enabled
            if (r5 == 0) goto L82
            boolean r5 = d0.C13447n.NewNestedFlingPropagationEnabled
            if (r5 == 0) goto L6a
            f0.K r5 = r3.scrollingLogic
            boolean r5 = r5.getIsFlinging()
            if (r5 == 0) goto L56
            H1.y$a r4 = H1.y.INSTANCE
            long r4 = r4.a()
            goto L7d
        L56:
            f0.K r5 = r3.scrollingLogic
            r4.f48319a = r6
            r4.f48322d = r2
            java.lang.Object r5 = r5.p(r6, r4)
            if (r5 != r8) goto L63
            goto L76
        L63:
            H1.y r5 = (H1.y) r5
            long r4 = r5.getPackedValue()
            goto L7d
        L6a:
            f0.K r5 = r3.scrollingLogic
            r4.f48319a = r6
            r4.f48322d = r1
            java.lang.Object r5 = r5.p(r6, r4)
            if (r5 != r8) goto L77
        L76:
            return r8
        L77:
            H1.y r5 = (H1.y) r5
            long r4 = r5.getPackedValue()
        L7d:
            long r4 = H1.y.k(r6, r4)
            goto L88
        L82:
            H1.y$a r4 = H1.y.INSTANCE
            long r4 = r4.a()
        L88:
            H1.y r4 = H1.y.b(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.h.b0(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public h(C13793K c13793k, boolean z10) {
        this.scrollingLogic = c13793k;
        this.enabled = z10;
    }
}
