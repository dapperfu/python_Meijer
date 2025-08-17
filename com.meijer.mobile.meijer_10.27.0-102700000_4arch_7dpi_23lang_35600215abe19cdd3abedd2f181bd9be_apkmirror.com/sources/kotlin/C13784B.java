package kotlin;

import Av.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u0006*\u00020\nH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u0006*\u00020\u000fH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u0006*\u00020\u0007H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f*\u00020\u0006H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u000f*\u00020\nH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u000eJ\u0017\u0010\u001a\u001a\u00020\u0014*\u00020\u0015H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\n*\u00020\u0006H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\n*\u00020\u000fH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\n*\u00020\u0007H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020 ¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020 H\u0086@¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020 H\u0096@¢\u0006\u0004\b&\u0010%J\u0010\u0010(\u001a\u00020'H\u0096@¢\u0006\u0004\b(\u0010%R\u0016\u0010+\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u000f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00105\u001a\u00020\u000f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b4\u00103\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Lf0/B;", "Lf0/A;", "LH1/d;", "density", "<init>", "(LH1/d;)V", "LH1/h;", "", "E0", "(F)I", "LH1/v;", "N1", "(J)I", "t", "(J)F", "", "L", "(F)F", "K", "(I)F", "LU0/k;", "LH1/k;", "p", "(J)J", "I1", "N0", "T", "o", "(F)J", "x", "w", "(I)J", "", "a", "()V", "f", "q", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p1", "", "I0", "b", "Z", "isReleased", "c", "isCanceled", "LAv/a;", "d", "LAv/a;", "mutex", "getDensity", "()F", "F1", "fontScale", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13784B implements InterfaceC13783A, H1.d {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ H1.d f130100a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isReleased;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isCanceled;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Av.a mutex = Av.g.a(false);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {537}, m = "awaitRelease")
    /* renamed from: f0.B$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f130104a;

        /* renamed from: c, reason: collision with root package name */
        int f130106c;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f130104a = obj;
            this.f130106c |= Integer.MIN_VALUE;
            return C13784B.this.p1(this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {531}, m = "reset")
    /* renamed from: f0.B$b */
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f130107a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f130108b;

        /* renamed from: d, reason: collision with root package name */
        int f130110d;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f130108b = obj;
            this.f130110d |= Integer.MIN_VALUE;
            return C13784B.this.q(this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {544}, m = "tryAwaitRelease")
    /* renamed from: f0.B$c */
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f130111a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f130112b;

        /* renamed from: d, reason: collision with root package name */
        int f130114d;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f130112b = obj;
            this.f130114d |= Integer.MIN_VALUE;
            return C13784B.this.I0(this);
        }
    }

    public final void a() {
        this.isCanceled = true;
        if (this.mutex.c()) {
            a.C0027a.c(this.mutex, null, 1, null);
        }
    }

    public final void f() {
        this.isReleased = true;
        if (this.mutex.c()) {
            a.C0027a.c(this.mutex, null, 1, null);
        }
    }

    @Override // H1.d
    public int E0(float f10) {
        return this.f130100a.E0(f10);
    }

    @Override // H1.l
    /* renamed from: F1 */
    public float getFontScale() {
        return this.f130100a.getFontScale();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlin.InterfaceC13783A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object I0(kotlin.coroutines.Continuation<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlin.C13784B.c
            if (r0 == 0) goto L13
            r0 = r6
            f0.B$c r0 = (kotlin.C13784B.c) r0
            int r1 = r0.f130114d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f130114d = r1
            goto L18
        L13:
            f0.B$c r0 = new f0.B$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f130112b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f130114d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.f130111a
            f0.B r0 = (kotlin.C13784B) r0
            kotlin.ResultKt.b(r6)
            goto L4f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            kotlin.ResultKt.b(r6)
            boolean r6 = r5.isReleased
            if (r6 != 0) goto L55
            boolean r6 = r5.isCanceled
            if (r6 != 0) goto L55
            Av.a r6 = r5.mutex
            r0.f130111a = r5
            r0.f130114d = r4
            java.lang.Object r6 = Av.a.C0027a.a(r6, r3, r0, r4, r3)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r0 = r5
        L4f:
            Av.a r6 = r0.mutex
            Av.a.C0027a.c(r6, r3, r4, r3)
            goto L56
        L55:
            r0 = r5
        L56:
            boolean r6 = r0.isReleased
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C13784B.I0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // H1.d
    public float I1(float f10) {
        return this.f130100a.I1(f10);
    }

    @Override // H1.d
    public float K(int i10) {
        return this.f130100a.K(i10);
    }

    @Override // H1.d
    public float L(float f10) {
        return this.f130100a.L(f10);
    }

    @Override // H1.d
    public float N0(long j10) {
        return this.f130100a.N0(j10);
    }

    @Override // H1.d
    public int N1(long j10) {
        return this.f130100a.N1(j10);
    }

    @Override // H1.d
    public long T(long j10) {
        return this.f130100a.T(j10);
    }

    @Override // H1.d
    public float getDensity() {
        return this.f130100a.getDensity();
    }

    @Override // H1.l
    public long o(float f10) {
        return this.f130100a.o(f10);
    }

    @Override // H1.d
    public long p(long j10) {
        return this.f130100a.p(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlin.InterfaceC13783A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p1(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlin.C13784B.a
            if (r0 == 0) goto L13
            r0 = r5
            f0.B$a r0 = (kotlin.C13784B.a) r0
            int r1 = r0.f130106c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f130106c = r1
            goto L18
        L13:
            f0.B$a r0 = new f0.B$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f130104a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f130106c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.b(r5)
            r0.f130106c = r3
            java.lang.Object r5 = r4.I0(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L48
            kotlin.Unit r5 = kotlin.Unit.f142422a
            return r5
        L48:
            androidx.compose.foundation.gestures.GestureCancellationException r5 = new androidx.compose.foundation.gestures.GestureCancellationException
            java.lang.String r0 = "The press gesture was canceled."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C13784B.p1(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlin.C13784B.b
            if (r0 == 0) goto L13
            r0 = r5
            f0.B$b r0 = (kotlin.C13784B.b) r0
            int r1 = r0.f130110d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f130110d = r1
            goto L18
        L13:
            f0.B$b r0 = new f0.B$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f130108b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f130110d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f130107a
            f0.B r0 = (kotlin.C13784B) r0
            kotlin.ResultKt.b(r5)
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.ResultKt.b(r5)
            Av.a r5 = r4.mutex
            r0.f130107a = r4
            r0.f130110d = r3
            r2 = 0
            java.lang.Object r5 = Av.a.C0027a.a(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L46
            return r1
        L46:
            r0 = r4
        L47:
            r5 = 0
            r0.isReleased = r5
            r0.isCanceled = r5
            kotlin.Unit r5 = kotlin.Unit.f142422a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C13784B.q(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // H1.l
    public float t(long j10) {
        return this.f130100a.t(j10);
    }

    @Override // H1.d
    public long w(int i10) {
        return this.f130100a.w(i10);
    }

    @Override // H1.d
    public long x(float f10) {
        return this.f130100a.x(f10);
    }

    public C13784B(H1.d dVar) {
        this.f130100a = dVar;
    }
}
