package androidx.compose.foundation;

import Z.C5627z;
import Z.O;
import android.view.KeyEvent;
import androidx.compose.ui.node.C5955i;
import androidx.compose.ui.node.InterfaceC5954h;
import androidx.compose.ui.node.v0;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.platform.Q1;
import androidx.compose.ui.semantics.Role;
import c1.C6471b;
import c1.InterfaceC6470a;
import d0.InterfaceC13561B;
import e1.C13752d;
import g1.J;
import kotlin.C13904L;
import kotlin.InterfaceC13893A;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C0;
import mv.C15809k;
import mv.InterfaceC15783O;
import mv.Z;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001:Bw\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0019\u001a\u00020\u0004*\u00020\u0018H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJx\u0010\u001b\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u0004*\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0014ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001a\u0010$\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0014ø\u0001\u0000¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\u0004H\u0014¢\u0006\u0004\b%\u0010\u0017J\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00106\u001a\b\u0012\u0004\u0012\u000203028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000207028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00105\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006;"}, d2 = {"Landroidx/compose/foundation/e;", "Landroidx/compose/ui/node/h;", "Landroidx/compose/foundation/a;", "Lkotlin/Function0;", "", "onClick", "", "onLongClickLabel", "onLongClick", "onDoubleClick", "", "hapticFeedbackEnabled", "Lh0/l;", "interactionSource", "Ld0/B;", "indicationNodeFactory", "enabled", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLh0/l;Ld0/B;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "s3", "()V", "Lg1/J;", "Y2", "(Lg1/J;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "u3", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lh0/l;Ld0/B;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;)V", "Lr1/u;", "X2", "(Lr1/u;)V", "Le1/b;", "event", "i3", "(Landroid/view/KeyEvent;)Z", "j3", "h3", "v2", "J", "Ljava/lang/String;", "K", "Lkotlin/jvm/functions/Function0;", "L", "M", "Z", "r3", "()Z", "t3", "(Z)V", "LZ/O;", "Lmv/C0;", "N", "LZ/O;", "longKeyPressJobs", "Landroidx/compose/foundation/e$a;", "O", "doubleKeyClickStates", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class e extends androidx.compose.foundation.a implements InterfaceC5954h {

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private String onLongClickLabel;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> onLongClick;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> onDoubleClick;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private boolean hapticFeedbackEnabled;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final O<C0> longKeyPressJobs;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final O<a> doubleKeyClickStates;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/e$a;", "", "Lmv/C0;", "job", "<init>", "(Lmv/C0;)V", "a", "Lmv/C0;", "b", "()Lmv/C0;", "", "Z", "()Z", "c", "(Z)V", "doubleTapMinTimeMillisElapsed", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final C0 job;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean doubleTapMinTimeMillisElapsed;

        /* renamed from: a, reason: from getter */
        public final boolean getDoubleTapMinTimeMillisElapsed() {
            return this.doubleTapMinTimeMillisElapsed;
        }

        /* renamed from: b, reason: from getter */
        public final C0 getJob() {
            return this.job;
        }

        public final void c(boolean z10) {
            this.doubleTapMinTimeMillisElapsed = z10;
        }

        public a(C0 c02) {
            this.job = c02;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function0<Boolean> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            Function0 function0 = e.this.onLongClick;
            if (function0 != null) {
                function0.invoke();
            }
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/f;", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function1<U0.f, Unit> {
        c() {
            super(1);
        }

        public final void a(long j10) {
            Function0 function0 = e.this.onDoubleClick;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(U0.f fVar) {
            a(fVar.getPackedValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/f;", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends Lambda implements Function1<U0.f, Unit> {
        d() {
            super(1);
        }

        public final void a(long j10) {
            Function0 function0 = e.this.onLongClick;
            if (function0 != null) {
                function0.invoke();
            }
            if (e.this.getHapticFeedbackEnabled()) {
                ((InterfaceC6470a) C5955i.a(e.this, C6034t0.k())).a(C6471b.INSTANCE.e());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(U0.f fVar) {
            a(fVar.getPackedValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf0/A;", "LU0/f;", "offset", "", "<anonymous>", "(Lf0/A;LU0/f;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.CombinedClickableNode$clickPointerInput$4", f = "Clickable.kt", l = {770}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.e$e, reason: collision with other inner class name */
    static final class C0992e extends SuspendLambda implements Function3<InterfaceC13893A, U0.f, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48305a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f48306b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ long f48307c;

        C0992e(Continuation<? super C0992e> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC13893A interfaceC13893A, U0.f fVar, Continuation<? super Unit> continuation) {
            return d(interfaceC13893A, fVar.getPackedValue(), continuation);
        }

        public final Object d(InterfaceC13893A interfaceC13893A, long j10, Continuation<? super Unit> continuation) {
            C0992e c0992e = e.this.new C0992e(continuation);
            c0992e.f48306b = interfaceC13893A;
            c0992e.f48307c = j10;
            return c0992e.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48305a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC13893A interfaceC13893A = (InterfaceC13893A) this.f48306b;
                long j10 = this.f48307c;
                if (e.this.getEnabled()) {
                    e eVar = e.this;
                    this.f48305a = 1;
                    if (eVar.f3(interfaceC13893A, j10, this) == objF) {
                        return objF;
                    }
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/f;", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends Lambda implements Function1<U0.f, Unit> {
        f() {
            super(1);
        }

        public final void a(long j10) {
            if (e.this.getEnabled()) {
                e.this.e3().invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(U0.f fVar) {
            a(fVar.getPackedValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.CombinedClickableNode$onClickKeyDownEvent$1", f = "Clickable.kt", l = {852}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48310a;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48310a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                long jC = ((Q1) C5955i.a(e.this, C6034t0.t())).c();
                this.f48310a = 1;
                if (Z.b(jC, this) == objF) {
                    return objF;
                }
            }
            Function0 function0 = e.this.onLongClick;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2", f = "Clickable.kt", l = {908, 912}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        long f48312a;

        /* renamed from: b, reason: collision with root package name */
        long f48313b;

        /* renamed from: c, reason: collision with root package name */
        int f48314c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f48316e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(long j10, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f48316e = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new h(this.f48316e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
        
            if (mv.Z.b(r4 - r6, r10) == r0) goto L19;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r10.f48314c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r11)
                goto L64
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                long r4 = r10.f48313b
                long r6 = r10.f48312a
                kotlin.ResultKt.b(r11)
                goto L46
            L22:
                kotlin.ResultKt.b(r11)
                androidx.compose.foundation.e r11 = androidx.compose.foundation.e.this
                androidx.compose.runtime.F0 r1 = androidx.compose.ui.platform.C6034t0.t()
                java.lang.Object r11 = androidx.compose.ui.node.C5955i.a(r11, r1)
                androidx.compose.ui.platform.Q1 r11 = (androidx.compose.ui.platform.Q1) r11
                long r6 = r11.b()
                long r4 = r11.a()
                r10.f48312a = r6
                r10.f48313b = r4
                r10.f48314c = r3
                java.lang.Object r11 = mv.Z.b(r6, r10)
                if (r11 != r0) goto L46
                goto L63
            L46:
                androidx.compose.foundation.e r11 = androidx.compose.foundation.e.this
                Z.O r11 = androidx.compose.foundation.e.o3(r11)
                long r8 = r10.f48316e
                java.lang.Object r11 = r11.b(r8)
                androidx.compose.foundation.e$a r11 = (androidx.compose.foundation.e.a) r11
                if (r11 != 0) goto L57
                goto L5a
            L57:
                r11.c(r3)
            L5a:
                long r4 = r4 - r6
                r10.f48314c = r2
                java.lang.Object r11 = mv.Z.b(r4, r10)
                if (r11 != r0) goto L64
            L63:
                return r0
            L64:
                androidx.compose.foundation.e r11 = androidx.compose.foundation.e.this
                kotlin.jvm.functions.Function0 r11 = r11.e3()
                r11.invoke()
                kotlin.Unit r11 = kotlin.Unit.f143329a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.e.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public /* synthetic */ e(Function0 function0, String str, Function0 function02, Function0 function03, boolean z10, h0.l lVar, InterfaceC13561B interfaceC13561B, boolean z11, String str2, Role role, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, str, function02, function03, z10, lVar, interfaceC13561B, z11, str2, role);
    }

    private e(Function0<Unit> function0, String str, Function0<Unit> function02, Function0<Unit> function03, boolean z10, h0.l lVar, InterfaceC13561B interfaceC13561B, boolean z11, String str2, Role role) {
        super(lVar, interfaceC13561B, z11, str2, role, function0, null);
        this.onLongClickLabel = str;
        this.onLongClick = function02;
        this.onDoubleClick = function03;
        this.hapticFeedbackEnabled = z10;
        this.longKeyPressJobs = C5627z.c();
        this.doubleKeyClickStates = C5627z.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void s3() {
        /*
            r24 = this;
            r0 = r24
            Z.O<mv.C0> r1 = r0.longKeyPressJobs
            java.lang.Object[] r2 = r1.values
            long[] r3 = r1.metadata
            int r4 = r3.length
            int r4 = r4 + (-2)
            r9 = 7
            r10 = 0
            r13 = 1
            r14 = 8
            r15 = 0
            if (r4 < 0) goto L4d
            r5 = r15
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
        L18:
            r7 = r3[r5]
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = ~r7
            long r11 = r11 << r9
            long r11 = r11 & r7
            long r11 = r11 & r20
            int r6 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r6 == 0) goto L48
            int r6 = r5 - r4
            int r6 = ~r6
            int r6 = r6 >>> 31
            int r6 = 8 - r6
            r11 = r15
        L30:
            if (r11 >= r6) goto L46
            long r22 = r7 & r18
            int r12 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r12 >= 0) goto L42
            int r12 = r5 << 3
            int r12 = r12 + r11
            r12 = r2[r12]
            mv.C0 r12 = (mv.C0) r12
            mv.C0.a.a(r12, r10, r13, r10)
        L42:
            long r7 = r7 >> r14
            int r11 = r11 + 1
            goto L30
        L46:
            if (r6 != r14) goto L56
        L48:
            if (r5 == r4) goto L56
            int r5 = r5 + 1
            goto L18
        L4d:
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
        L56:
            r1.g()
            Z.O<androidx.compose.foundation.e$a> r1 = r0.doubleKeyClickStates
            java.lang.Object[] r2 = r1.values
            long[] r3 = r1.metadata
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L99
            r5 = r15
        L65:
            r6 = r3[r5]
            long r11 = ~r6
            long r11 = r11 << r9
            long r11 = r11 & r6
            long r11 = r11 & r20
            int r8 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r8 == 0) goto L94
            int r8 = r5 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r11 = r15
        L78:
            if (r11 >= r8) goto L92
            long r22 = r6 & r18
            int r12 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r12 >= 0) goto L8e
            int r12 = r5 << 3
            int r12 = r12 + r11
            r12 = r2[r12]
            androidx.compose.foundation.e$a r12 = (androidx.compose.foundation.e.a) r12
            mv.C0 r12 = r12.getJob()
            mv.C0.a.a(r12, r10, r13, r10)
        L8e:
            long r6 = r6 >> r14
            int r11 = r11 + 1
            goto L78
        L92:
            if (r8 != r14) goto L99
        L94:
            if (r5 == r4) goto L99
            int r5 = r5 + 1
            goto L65
        L99:
            r1.g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.e.s3():void");
    }

    @Override // androidx.compose.foundation.a
    public void X2(u uVar) {
        if (this.onLongClick != null) {
            s.H(uVar, this.onLongClickLabel, new b());
        }
    }

    /* renamed from: r3, reason: from getter */
    public final boolean getHapticFeedbackEnabled() {
        return this.hapticFeedbackEnabled;
    }

    public final void t3(boolean z10) {
        this.hapticFeedbackEnabled = z10;
    }

    public final void u3(Function0<Unit> onClick, String onLongClickLabel, Function0<Unit> onLongClick, Function0<Unit> onDoubleClick, h0.l interactionSource, InterfaceC13561B indicationNodeFactory, boolean enabled, String onClickLabel, Role role) {
        boolean z10;
        if (!Intrinsics.e(this.onLongClickLabel, onLongClickLabel)) {
            this.onLongClickLabel = onLongClickLabel;
            v0.b(this);
        }
        if ((this.onLongClick == null) != (onLongClick == null)) {
            a3();
            v0.b(this);
            z10 = true;
        } else {
            z10 = false;
        }
        this.onLongClick = onLongClick;
        if ((this.onDoubleClick == null) != (onDoubleClick == null)) {
            z10 = true;
        }
        this.onDoubleClick = onDoubleClick;
        boolean z11 = getEnabled() == enabled ? z10 : true;
        n3(interactionSource, indicationNodeFactory, enabled, onClickLabel, role, onClick);
        if (z11) {
            l3();
        }
    }

    @Override // androidx.compose.foundation.a
    public Object Y2(J j10, Continuation<? super Unit> continuation) {
        c cVar;
        d dVar;
        if (getEnabled() && this.onDoubleClick != null) {
            cVar = new c();
        } else {
            cVar = null;
        }
        if (getEnabled() && this.onLongClick != null) {
            dVar = new d();
        } else {
            dVar = null;
        }
        Object objL = C13904L.l(j10, cVar, dVar, new C0992e(null), new f(), continuation);
        if (objL == IntrinsicsKt.f()) {
            return objL;
        }
        return Unit.f143329a;
    }

    @Override // androidx.compose.foundation.a
    protected void h3() {
        s3();
    }

    @Override // androidx.compose.foundation.a
    protected boolean i3(KeyEvent event) {
        boolean z10;
        long jA = C13752d.a(event);
        if (this.onLongClick != null && this.longKeyPressJobs.b(jA) == null) {
            this.longKeyPressJobs.r(jA, C15809k.d(j2(), null, null, new g(null), 3, null));
            z10 = true;
        } else {
            z10 = false;
        }
        a aVarB = this.doubleKeyClickStates.b(jA);
        if (aVarB != null) {
            if (aVarB.getJob().a()) {
                C0.a.a(aVarB.getJob(), null, 1, null);
                if (!aVarB.getDoubleTapMinTimeMillisElapsed()) {
                    e3().invoke();
                    this.doubleKeyClickStates.o(jA);
                    return z10;
                }
            } else {
                this.doubleKeyClickStates.o(jA);
            }
        }
        return z10;
    }

    @Override // androidx.compose.foundation.a
    protected boolean j3(KeyEvent event) {
        Function0<Unit> function0;
        long jA = C13752d.a(event);
        boolean z10 = false;
        if (this.longKeyPressJobs.b(jA) != null) {
            C0 c0B = this.longKeyPressJobs.b(jA);
            if (c0B != null) {
                if (c0B.a()) {
                    C0.a.a(c0B, null, 1, null);
                } else {
                    z10 = true;
                }
            }
            this.longKeyPressJobs.o(jA);
        }
        if (this.onDoubleClick != null) {
            if (this.doubleKeyClickStates.b(jA) == null) {
                if (!z10) {
                    this.doubleKeyClickStates.r(jA, new a(C15809k.d(j2(), null, null, new h(jA, null), 3, null)));
                }
            } else {
                if (!z10 && (function0 = this.onDoubleClick) != null) {
                    function0.invoke();
                }
                this.doubleKeyClickStates.o(jA);
            }
        } else if (!z10) {
            e3().invoke();
        }
        return true;
    }

    @Override // androidx.compose.ui.Modifier.c
    public void v2() {
        super.v2();
        s3();
    }
}
