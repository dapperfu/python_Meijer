package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.q0;
import g1.C14185q;
import g1.C14187t;
import g1.EnumC14186s;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u0006J*\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/i;", "Landroidx/compose/ui/node/q0;", "Landroidx/compose/ui/Modifier$c;", "Lh0/l;", "interactionSource", "<init>", "(Lh0/l;)V", "", "M2", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "N2", "O2", "()V", "P2", "Lg1/q;", "pointerEvent", "Lg1/s;", "pass", "LH1/r;", "bounds", "s1", "(Lg1/q;Lg1/s;J)V", "v1", "u2", "o", "Lh0/l;", "Lh0/g;", "p", "Lh0/g;", "hoverInteraction", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class i extends Modifier.c implements q0 {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private h0.l interactionSource;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private h0.g hoverInteraction;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {106}, m = "emitEnter")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f48365a;

        /* renamed from: b, reason: collision with root package name */
        Object f48366b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f48367c;

        /* renamed from: e, reason: collision with root package name */
        int f48369e;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f48367c = obj;
            this.f48369e |= Integer.MIN_VALUE;
            return i.this.M2(this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {114}, m = "emitExit")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f48370a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f48371b;

        /* renamed from: d, reason: collision with root package name */
        int f48373d;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f48371b = obj;
            this.f48373d |= Integer.MIN_VALUE;
            return i.this.N2(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$1", f = "Hoverable.kt", l = {89}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48374a;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return i.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48374a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                i iVar = i.this;
                this.f48374a = 1;
                if (iVar.M2(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$2", f = "Hoverable.kt", l = {90}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48376a;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return i.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48376a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                i iVar = i.this;
                this.f48376a = 1;
                if (iVar.N2(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M2(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.i.a
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.i$a r0 = (androidx.compose.foundation.i.a) r0
            int r1 = r0.f48369e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48369e = r1
            goto L18
        L13:
            androidx.compose.foundation.i$a r0 = new androidx.compose.foundation.i$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f48367c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f48369e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f48366b
            h0.g r1 = (h0.g) r1
            java.lang.Object r0 = r0.f48365a
            androidx.compose.foundation.i r0 = (androidx.compose.foundation.i) r0
            kotlin.ResultKt.b(r5)
            goto L56
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            kotlin.ResultKt.b(r5)
            h0.g r5 = r4.hoverInteraction
            if (r5 != 0) goto L58
            h0.g r5 = new h0.g
            r5.<init>()
            h0.l r2 = r4.interactionSource
            r0.f48365a = r4
            r0.f48366b = r5
            r0.f48369e = r3
            java.lang.Object r0 = r2.c(r5, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r0 = r4
            r1 = r5
        L56:
            r0.hoverInteraction = r1
        L58:
            kotlin.Unit r5 = kotlin.Unit.f142422a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.i.M2(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N2(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.i.b
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.i$b r0 = (androidx.compose.foundation.i.b) r0
            int r1 = r0.f48373d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48373d = r1
            goto L18
        L13:
            androidx.compose.foundation.i$b r0 = new androidx.compose.foundation.i$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f48371b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f48373d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f48370a
            androidx.compose.foundation.i r0 = (androidx.compose.foundation.i) r0
            kotlin.ResultKt.b(r5)
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.ResultKt.b(r5)
            h0.g r5 = r4.hoverInteraction
            if (r5 == 0) goto L52
            h0.h r2 = new h0.h
            r2.<init>(r5)
            h0.l r5 = r4.interactionSource
            r0.f48370a = r4
            r0.f48373d = r3
            java.lang.Object r5 = r5.c(r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r0 = r4
        L4f:
            r5 = 0
            r0.hoverInteraction = r5
        L52:
            kotlin.Unit r5 = kotlin.Unit.f142422a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.i.N2(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void O2() {
        h0.g gVar = this.hoverInteraction;
        if (gVar != null) {
            this.interactionSource.a(new h0.h(gVar));
            this.hoverInteraction = null;
        }
    }

    public final void P2(h0.l interactionSource) {
        if (Intrinsics.e(this.interactionSource, interactionSource)) {
            return;
        }
        O2();
        this.interactionSource = interactionSource;
    }

    @Override // androidx.compose.ui.node.q0
    public void s1(C14185q pointerEvent, EnumC14186s pass, long bounds) {
        if (pass == EnumC14186s.f132679b) {
            int type = pointerEvent.getType();
            C14187t.Companion companion = C14187t.INSTANCE;
            if (C14187t.i(type, companion.a())) {
                C16648k.d(j2(), null, null, new c(null), 3, null);
            } else if (C14187t.i(type, companion.b())) {
                C16648k.d(j2(), null, null, new d(null), 3, null);
            }
        }
    }

    public i(h0.l lVar) {
        this.interactionSource = lVar;
    }

    @Override // androidx.compose.ui.Modifier.c
    public void u2() {
        O2();
    }

    @Override // androidx.compose.ui.node.q0
    public void v1() {
        O2();
    }
}
