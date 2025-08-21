package f1;

import U0.f;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001b\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R*\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010)\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0011\u0010+\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b*\u0010&R\u0016\u0010/\u001a\u0004\u0018\u00010,8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Lf1/b;", "", "<init>", "()V", "LU0/f;", "available", "Lf1/e;", "source", "d", "(JI)J", "consumed", "b", "(JJI)J", "LH1/y;", "c", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lf1/c;", "Lf1/c;", "f", "()Lf1/c;", "k", "(Lf1/c;)V", "nestedScrollNode", "getLastKnownParentNode$ui_release", "j", "lastKnownParentNode", "Lkotlin/Function0;", "Lmv/O;", "Lkotlin/jvm/functions/Function0;", "getCalculateNestedScrollScope$ui_release", "()Lkotlin/jvm/functions/Function0;", "i", "(Lkotlin/jvm/functions/Function0;)V", "calculateNestedScrollScope", "Lmv/O;", "h", "()Lmv/O;", "l", "(Lmv/O;)V", "scope", "e", "coroutineScope", "Lf1/a;", "g", "()Lf1/a;", "parent", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13939b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private C13940c nestedScrollNode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private C13940c lastKnownParentNode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Function0<? extends InterfaceC15783O> calculateNestedScrollScope = new a();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private InterfaceC15783O scope;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lmv/O;", "c", "()Lmv/O;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f1.b$a */
    static final class a extends Lambda implements Function0<InterfaceC15783O> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InterfaceC15783O invoke() {
            return C13939b.this.getScope();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {223, 225}, m = "dispatchPostFling-RZ2iAVY")
    /* renamed from: f1.b$b, reason: collision with other inner class name */
    static final class C2085b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f131428a;

        /* renamed from: c, reason: collision with root package name */
        int f131430c;

        C2085b(Continuation<? super C2085b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f131428a = obj;
            this.f131430c |= Integer.MIN_VALUE;
            return C13939b.this.a(0L, 0L, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {HttpResponseStatus.SUCCESS_OK}, m = "dispatchPreFling-QWom1Mo")
    /* renamed from: f1.b$c */
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f131431a;

        /* renamed from: c, reason: collision with root package name */
        int f131433c;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f131431a = obj;
            this.f131433c |= Integer.MIN_VALUE;
            return C13939b.this.c(0L, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r12 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        if (r12 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, long r10, kotlin.coroutines.Continuation<? super H1.y> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof f1.C13939b.C2085b
            if (r0 == 0) goto L14
            r0 = r12
            f1.b$b r0 = (f1.C13939b.C2085b) r0
            int r1 = r0.f131430c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f131430c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            f1.b$b r0 = new f1.b$b
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f131428a
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r6.f131430c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            kotlin.ResultKt.b(r12)
            goto L75
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            kotlin.ResultKt.b(r12)
            goto L56
        L3a:
            kotlin.ResultKt.b(r12)
            f1.a r12 = r7.g()
            if (r12 != 0) goto L64
            boolean r12 = P0.h.NewNestedScrollFlingDispatchingEnabled
            if (r12 == 0) goto L64
            f1.c r1 = r7.lastKnownParentNode
            if (r1 == 0) goto L5d
            r6.f131430c = r3
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.b0(r2, r4, r6)
            if (r12 != r0) goto L56
            goto L74
        L56:
            H1.y r12 = (H1.y) r12
            long r8 = r12.getPackedValue()
            goto L82
        L5d:
            H1.y$a r8 = H1.y.INSTANCE
            long r8 = r8.a()
            goto L82
        L64:
            r4 = r10
            f1.a r1 = r7.g()
            if (r1 == 0) goto L7c
            r6.f131430c = r2
            r2 = r8
            java.lang.Object r12 = r1.b0(r2, r4, r6)
            if (r12 != r0) goto L75
        L74:
            return r0
        L75:
            H1.y r12 = (H1.y) r12
            long r8 = r12.getPackedValue()
            goto L82
        L7c:
            H1.y$a r8 = H1.y.INSTANCE
            long r8 = r8.a()
        L82:
            H1.y r8 = H1.y.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.C13939b.a(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r5, kotlin.coroutines.Continuation<? super H1.y> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof f1.C13939b.c
            if (r0 == 0) goto L13
            r0 = r7
            f1.b$c r0 = (f1.C13939b.c) r0
            int r1 = r0.f131433c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f131433c = r1
            goto L18
        L13:
            f1.b$c r0 = new f1.b$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f131431a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f131433c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r7)
            f1.a r7 = r4.g()
            if (r7 == 0) goto L4a
            r0.f131433c = r3
            java.lang.Object r7 = r7.M1(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            H1.y r7 = (H1.y) r7
            long r5 = r7.getPackedValue()
            goto L50
        L4a:
            H1.y$a r5 = H1.y.INSTANCE
            long r5 = r5.a()
        L50:
            H1.y r5 = H1.y.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.C13939b.c(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final InterfaceC15783O e() {
        InterfaceC15783O interfaceC15783OInvoke = this.calculateNestedScrollScope.invoke();
        if (interfaceC15783OInvoke != null) {
            return interfaceC15783OInvoke;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* renamed from: f, reason: from getter */
    public final C13940c getNestedScrollNode() {
        return this.nestedScrollNode;
    }

    public final InterfaceC13938a g() {
        C13940c c13940c = this.nestedScrollNode;
        if (c13940c != null) {
            return c13940c.N2();
        }
        return null;
    }

    /* renamed from: h, reason: from getter */
    public final InterfaceC15783O getScope() {
        return this.scope;
    }

    public final void i(Function0<? extends InterfaceC15783O> function0) {
        this.calculateNestedScrollScope = function0;
    }

    public final void j(C13940c c13940c) {
        this.lastKnownParentNode = c13940c;
    }

    public final void k(C13940c c13940c) {
        this.nestedScrollNode = c13940c;
    }

    public final void l(InterfaceC15783O interfaceC15783O) {
        this.scope = interfaceC15783O;
    }

    public final long b(long consumed, long available, int source) {
        InterfaceC13938a interfaceC13938aG = g();
        if (interfaceC13938aG != null) {
            return interfaceC13938aG.L0(consumed, available, source);
        }
        return f.INSTANCE.c();
    }

    public final long d(long available, int source) {
        InterfaceC13938a interfaceC13938aG = g();
        if (interfaceC13938aG != null) {
            return interfaceC13938aG.E1(available, source);
        }
        return f.INSTANCE.c();
    }
}
