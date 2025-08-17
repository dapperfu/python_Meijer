package f1;

import P0.h;
import U0.f;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.B0;
import androidx.compose.ui.node.C0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\"\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u000eJ!\u0010 \u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b \u0010\bR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R$\u00100\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00106\u001a\u0002018\u0016X\u0096D¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0016\u00108\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u0010$R\u0014\u0010<\u001a\u0002098BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0016\u0010>\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006?"}, d2 = {"Lf1/c;", "Landroidx/compose/ui/node/B0;", "Lf1/a;", "Landroidx/compose/ui/Modifier$c;", "connection", "Lf1/b;", "dispatcher", "<init>", "(Lf1/a;Lf1/b;)V", "newDispatcher", "", "P2", "(Lf1/b;)V", "Q2", "()V", "O2", "LU0/f;", "available", "Lf1/e;", "source", "E1", "(JI)J", "consumed", "L0", "(JJI)J", "LH1/y;", "M1", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b0", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t2", "u2", "R2", "o", "Lf1/a;", "getConnection", "()Lf1/a;", "setConnection", "(Lf1/a;)V", "p", "Lf1/b;", "resolvedDispatcher", "q", "Lf1/c;", "getLastKnownParentNode$ui_release", "()Lf1/c;", "setLastKnownParentNode$ui_release", "(Lf1/c;)V", "lastKnownParentNode", "", "r", "Ljava/lang/Object;", "Y", "()Ljava/lang/Object;", "traverseKey", "M2", "parentConnection", "Lqv/O;", "L2", "()Lqv/O;", "nestedCoroutineScope", "N2", "parentNestedScrollNode", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13830c extends Modifier.c implements B0, InterfaceC13828a {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private InterfaceC13828a connection;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private C13829b resolvedDispatcher;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private C13830c lastKnownParentNode;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Object traverseKey;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {103, 113}, m = "onPostFling-RZ2iAVY")
    /* renamed from: f1.c$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f130604a;

        /* renamed from: b, reason: collision with root package name */
        long f130605b;

        /* renamed from: c, reason: collision with root package name */
        long f130606c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f130607d;

        /* renamed from: f, reason: collision with root package name */
        int f130609f;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f130607d = obj;
            this.f130609f |= Integer.MIN_VALUE;
            return C13830c.this.b0(0L, 0L, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {96, 97}, m = "onPreFling-QWom1Mo")
    /* renamed from: f1.c$b */
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f130610a;

        /* renamed from: b, reason: collision with root package name */
        long f130611b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f130612c;

        /* renamed from: e, reason: collision with root package name */
        int f130614e;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f130612c = obj;
            this.f130614e |= Integer.MIN_VALUE;
            return C13830c.this.M1(0L, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqv/O;", "c", "()Lqv/O;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f1.c$c, reason: collision with other inner class name */
    static final class C2076c extends Lambda implements Function0<InterfaceC16622O> {
        C2076c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InterfaceC16622O invoke() {
            return C13830c.this.L2();
        }
    }

    private final void O2() {
        if (this.resolvedDispatcher.getNestedScrollNode() == this) {
            this.resolvedDispatcher.k(null);
        }
    }

    private final void Q2() {
        this.resolvedDispatcher.k(this);
        if (h.NewNestedScrollFlingDispatchingEnabled) {
            this.resolvedDispatcher.j(null);
            this.lastKnownParentNode = null;
        }
        this.resolvedDispatcher.i(new C2076c());
        this.resolvedDispatcher.l(j2());
    }

    @Override // f1.InterfaceC13828a
    public long L0(long consumed, long available, int source) {
        long jL0 = this.connection.L0(consumed, available, source);
        InterfaceC13828a interfaceC13828aM2 = M2();
        return f.q(jL0, interfaceC13828aM2 != null ? interfaceC13828aM2.L0(f.q(consumed, jL0), f.p(available, jL0), source) : f.INSTANCE.c());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r11 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // f1.InterfaceC13828a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object M1(long r9, kotlin.coroutines.Continuation<? super H1.y> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof f1.C13830c.b
            if (r0 == 0) goto L13
            r0 = r11
            f1.c$b r0 = (f1.C13830c.b) r0
            int r1 = r0.f130614e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f130614e = r1
            goto L18
        L13:
            f1.c$b r0 = new f1.c$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f130612c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f130614e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r9 = r0.f130611b
            kotlin.ResultKt.b(r11)
            goto L7d
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            long r9 = r0.f130611b
            java.lang.Object r2 = r0.f130610a
            f1.c r2 = (f1.C13830c) r2
            kotlin.ResultKt.b(r11)
            goto L57
        L40:
            kotlin.ResultKt.b(r11)
            f1.a r11 = r8.M2()
            if (r11 == 0) goto L61
            r0.f130610a = r8
            r0.f130611b = r9
            r0.f130614e = r4
            java.lang.Object r11 = r11.M1(r9, r0)
            if (r11 != r1) goto L56
            goto L7c
        L56:
            r2 = r8
        L57:
            H1.y r11 = (H1.y) r11
            long r4 = r11.getPackedValue()
        L5d:
            r6 = r4
            r4 = r9
            r9 = r6
            goto L69
        L61:
            H1.y$a r11 = H1.y.INSTANCE
            long r4 = r11.a()
            r2 = r8
            goto L5d
        L69:
            f1.a r11 = r2.connection
            long r4 = H1.y.k(r4, r9)
            r2 = 0
            r0.f130610a = r2
            r0.f130611b = r9
            r0.f130614e = r3
            java.lang.Object r11 = r11.M1(r4, r0)
            if (r11 != r1) goto L7d
        L7c:
            return r1
        L7d:
            H1.y r11 = (H1.y) r11
            long r0 = r11.getPackedValue()
            long r9 = H1.y.l(r9, r0)
            H1.y r9 = H1.y.b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.C13830c.M1(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void R2(InterfaceC13828a connection, C13829b dispatcher) {
        this.connection = connection;
        P2(dispatcher);
    }

    @Override // androidx.compose.ui.node.B0
    /* renamed from: Y, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // f1.InterfaceC13828a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b0(long r11, long r13, kotlin.coroutines.Continuation<? super H1.y> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof f1.C13830c.a
            if (r0 == 0) goto L14
            r0 = r15
            f1.c$a r0 = (f1.C13830c.a) r0
            int r1 = r0.f130609f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f130609f = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            f1.c$a r0 = new f1.c$a
            r0.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.f130607d
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r6.f130609f
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L45
            if (r1 == r2) goto L39
            if (r1 != r7) goto L31
            long r11 = r6.f130605b
            kotlin.ResultKt.b(r15)
            goto L95
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            long r13 = r6.f130606c
            long r11 = r6.f130605b
            java.lang.Object r1 = r6.f130604a
            f1.c r1 = (f1.C13830c) r1
            kotlin.ResultKt.b(r15)
            goto L5e
        L45:
            kotlin.ResultKt.b(r15)
            f1.a r1 = r10.connection
            r6.f130604a = r10
            r6.f130605b = r11
            r6.f130606c = r13
            r6.f130609f = r2
            r2 = r11
            r4 = r13
            java.lang.Object r15 = r1.b0(r2, r4, r6)
            if (r15 != r0) goto L5b
            goto L93
        L5b:
            r1 = r10
            r11 = r2
            r13 = r4
        L5e:
            H1.y r15 = (H1.y) r15
            long r8 = r15.getPackedValue()
            boolean r15 = P0.h.NewNestedScrollFlingDispatchingEnabled
            if (r15 == 0) goto L77
            boolean r15 = r1.getIsAttached()
            if (r15 == 0) goto L74
            f1.a r15 = r1.M2()
        L72:
            r1 = r15
            goto L7c
        L74:
            f1.c r15 = r1.lastKnownParentNode
            goto L72
        L77:
            f1.a r15 = r1.M2()
            goto L72
        L7c:
            if (r1 == 0) goto L9d
            long r2 = H1.y.l(r11, r8)
            long r4 = H1.y.k(r13, r8)
            r11 = 0
            r6.f130604a = r11
            r6.f130605b = r8
            r6.f130609f = r7
            java.lang.Object r15 = r1.b0(r2, r4, r6)
            if (r15 != r0) goto L94
        L93:
            return r0
        L94:
            r11 = r8
        L95:
            H1.y r15 = (H1.y) r15
            long r13 = r15.getPackedValue()
            r8 = r11
            goto La3
        L9d:
            H1.y$a r11 = H1.y.INSTANCE
            long r13 = r11.a()
        La3:
            long r11 = H1.y.l(r8, r13)
            H1.y r11 = H1.y.b(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.C13830c.b0(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.Modifier.c
    public void u2() {
        if (h.NewNestedScrollFlingDispatchingEnabled) {
            C13830c c13830c = (C13830c) C13831d.b(this);
            this.lastKnownParentNode = c13830c;
            this.resolvedDispatcher.j(c13830c);
        }
        O2();
    }

    public C13830c(InterfaceC13828a interfaceC13828a, C13829b c13829b) {
        this.connection = interfaceC13828a;
        this.resolvedDispatcher = c13829b == null ? new C13829b() : c13829b;
        this.traverseKey = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC16622O L2() {
        InterfaceC16622O interfaceC16622OL2;
        C13830c c13830cN2 = N2();
        if (c13830cN2 != null && (interfaceC16622OL2 = c13830cN2.L2()) != null) {
            return interfaceC16622OL2;
        }
        InterfaceC16622O scope = this.resolvedDispatcher.getScope();
        if (scope != null) {
            return scope;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    private final InterfaceC13828a M2() {
        if (getIsAttached()) {
            return N2();
        }
        return null;
    }

    private final void P2(C13829b newDispatcher) {
        O2();
        if (newDispatcher == null) {
            this.resolvedDispatcher = new C13829b();
        } else if (!Intrinsics.e(newDispatcher, this.resolvedDispatcher)) {
            this.resolvedDispatcher = newDispatcher;
        }
        if (getIsAttached()) {
            Q2();
        }
    }

    @Override // f1.InterfaceC13828a
    public long E1(long available, int source) {
        long jC;
        InterfaceC13828a interfaceC13828aM2 = M2();
        if (interfaceC13828aM2 != null) {
            jC = interfaceC13828aM2.E1(available, source);
        } else {
            jC = f.INSTANCE.c();
        }
        return f.q(jC, this.connection.E1(f.p(available, jC), source));
    }

    public final C13830c N2() {
        if (getIsAttached()) {
            return (C13830c) C0.b(this);
        }
        return null;
    }

    @Override // androidx.compose.ui.Modifier.c
    public void t2() {
        Q2();
    }
}
