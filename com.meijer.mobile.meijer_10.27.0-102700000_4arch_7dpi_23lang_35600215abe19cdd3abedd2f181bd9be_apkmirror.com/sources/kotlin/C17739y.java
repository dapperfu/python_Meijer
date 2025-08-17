package kotlin;

import androidx.compose.foundation.text.P;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.Q1;
import g1.C14185q;
import g1.InterfaceC14171c;
import g1.J;
import g1.O;
import g1.PointerInputChange;
import g1.U;
import g1.r;
import java.util.List;
import kotlin.C13814m;
import kotlin.C13821t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a$\u0010\u0011\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012\u001a,\u0010\u0015\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0014\u0010\u0017\u001a\u00020\u000f*\u00020\rH\u0082@¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\"\u0018\u0010\"\u001a\u00020\u0002*\u00020\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "", "", "updateTouchMode", "k", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Lw0/i;", "mouseSelectionObserver", "Landroidx/compose/foundation/text/P;", "textDragObserver", "i", "(Landroidx/compose/ui/Modifier;Lw0/i;Landroidx/compose/foundation/text/P;)Landroidx/compose/ui/Modifier;", "Lg1/c;", "observer", "Lg1/q;", "down", "j", "(Lg1/c;Landroidx/compose/foundation/text/P;Lg1/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lw0/d;", "clicksCounter", "h", "(Lg1/c;Lw0/i;Lw0/d;Lg1/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "(Lg1/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/platform/Q1;", "viewConfiguration", "Lg1/B;", "change1", "change2", "f", "(Landroidx/compose/ui/platform/Q1;Lg1/B;Lg1/B;)Z", "g", "(Lg1/q;)Z", "isPrecisePointer", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: w0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17739y {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {430}, m = "awaitDown")
    /* renamed from: w0.y$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f165603a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f165604b;

        /* renamed from: c, reason: collision with root package name */
        int f165605c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f165604b = obj;
            this.f165605c |= Integer.MIN_VALUE;
            return C17739y.e(null, this);
        }

        a(Continuation<? super a> continuation) {
            super(continuation);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {159, 183}, m = "mouseSelection")
    /* renamed from: w0.y$b */
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f165606a;

        /* renamed from: b, reason: collision with root package name */
        Object f165607b;

        /* renamed from: c, reason: collision with root package name */
        Object f165608c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f165609d;

        /* renamed from: e, reason: collision with root package name */
        int f165610e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f165609d = obj;
            this.f165610e |= Integer.MIN_VALUE;
            return C17739y.h(null, null, null, null, this);
        }

        b(Continuation<? super b> continuation) {
            super(continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg1/B;", "it", "", "a", "(Lg1/B;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.y$c */
    static final class c extends Lambda implements Function1<PointerInputChange, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC17723i f165611f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC17723i interfaceC17723i) {
            super(1);
            this.f165611f = interfaceC17723i;
        }

        public final void a(PointerInputChange pointerInputChange) {
            if (this.f165611f.d(pointerInputChange.getPosition())) {
                pointerInputChange.a();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
            a(pointerInputChange);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg1/B;", "it", "", "a", "(Lg1/B;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.y$d */
    static final class d extends Lambda implements Function1<PointerInputChange, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC17723i f165612f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC17736v f165613g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f165614h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC17723i interfaceC17723i, InterfaceC17736v interfaceC17736v, Ref.BooleanRef booleanRef) {
            super(1);
            this.f165612f = interfaceC17723i;
            this.f165613g = interfaceC17736v;
            this.f165614h = booleanRef;
        }

        public final void a(PointerInputChange pointerInputChange) {
            if (this.f165612f.a(pointerInputChange.getPosition(), this.f165613g)) {
                pointerInputChange.a();
                this.f165614h.f142828a = true;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
            a(pointerInputChange);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/J;", "", "invoke", "(Lg1/J;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.y$e */
    static final class e implements PointerInputEventHandler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17723i f165615a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ P f165616b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/c;", "", "<anonymous>", "(Lg1/c;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1", f = "SelectionGestures.kt", l = {107, 113, 115}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: w0.y$e$a */
        static final class a extends RestrictedSuspendLambda implements Function2<InterfaceC14171c, Continuation<? super Unit>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f165617b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f165618c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC17723i f165619d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C17718d f165620e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ P f165621f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC17723i interfaceC17723i, C17718d c17718d, P p10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f165619d = interfaceC17723i;
                this.f165620e = c17718d;
                this.f165621f = p10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f165619d, this.f165620e, this.f165621f, continuation);
                aVar.f165618c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC14171c interfaceC14171c, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC14171c, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
            
                if (kotlin.C17739y.h(r1, r2, r4, r10, r9) == r0) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
            
                if (kotlin.C17739y.j(r1, r3, r10, r9) == r0) goto L32;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r9.f165617b
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L27
                    if (r1 == r4) goto L1f
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    goto L1a
                L12:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L1a:
                    kotlin.ResultKt.b(r10)
                    goto L8d
                L1f:
                    java.lang.Object r1 = r9.f165618c
                    g1.c r1 = (g1.InterfaceC14171c) r1
                    kotlin.ResultKt.b(r10)
                    goto L3a
                L27:
                    kotlin.ResultKt.b(r10)
                    java.lang.Object r10 = r9.f165618c
                    r1 = r10
                    g1.c r1 = (g1.InterfaceC14171c) r1
                    r9.f165618c = r1
                    r9.f165617b = r4
                    java.lang.Object r10 = kotlin.C17739y.a(r1, r9)
                    if (r10 != r0) goto L3a
                    goto L8c
                L3a:
                    g1.q r10 = (g1.C14185q) r10
                    boolean r4 = kotlin.C17739y.g(r10)
                    r5 = 0
                    if (r4 == 0) goto L7a
                    int r4 = r10.getButtons()
                    boolean r4 = g1.C14188u.b(r4)
                    if (r4 == 0) goto L7a
                    java.util.List r4 = r10.c()
                    r6 = r4
                    java.util.Collection r6 = (java.util.Collection) r6
                    int r6 = r6.size()
                    r7 = 0
                L59:
                    if (r7 >= r6) goto L6b
                    java.lang.Object r8 = r4.get(r7)
                    g1.B r8 = (g1.PointerInputChange) r8
                    boolean r8 = r8.p()
                    if (r8 == 0) goto L68
                    goto L7a
                L68:
                    int r7 = r7 + 1
                    goto L59
                L6b:
                    w0.i r2 = r9.f165619d
                    w0.d r4 = r9.f165620e
                    r9.f165618c = r5
                    r9.f165617b = r3
                    java.lang.Object r10 = kotlin.C17739y.c(r1, r2, r4, r10, r9)
                    if (r10 != r0) goto L8d
                    goto L8c
                L7a:
                    boolean r3 = kotlin.C17739y.g(r10)
                    if (r3 != 0) goto L8d
                    androidx.compose.foundation.text.P r3 = r9.f165621f
                    r9.f165618c = r5
                    r9.f165617b = r2
                    java.lang.Object r10 = kotlin.C17739y.d(r1, r3, r10, r9)
                    if (r10 != r0) goto L8d
                L8c:
                    return r0
                L8d:
                    kotlin.Unit r10 = kotlin.Unit.f142422a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.C17739y.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        e(InterfaceC17723i interfaceC17723i, P p10) {
            this.f165615a = interfaceC17723i;
            this.f165616b = p10;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(J j10, Continuation<? super Unit> continuation) {
            Object objD = C13821t.d(j10, new a(this.f165615a, new C17718d(j10.getViewConfiguration()), this.f165616b, null), continuation);
            return objD == IntrinsicsKt.f() ? objD : Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {126, 130}, m = "touchSelection")
    /* renamed from: w0.y$f */
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f165622a;

        /* renamed from: b, reason: collision with root package name */
        Object f165623b;

        /* renamed from: c, reason: collision with root package name */
        Object f165624c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f165625d;

        /* renamed from: e, reason: collision with root package name */
        int f165626e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f165625d = obj;
            this.f165626e |= Integer.MIN_VALUE;
            return C17739y.j(null, null, null, this);
        }

        f(Continuation<? super f> continuation) {
            super(continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg1/B;", "it", "", "a", "(Lg1/B;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.y$g */
    static final class g extends Lambda implements Function1<PointerInputChange, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ P f165627f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(P p10) {
            super(1);
            this.f165627f = p10;
        }

        public final void a(PointerInputChange pointerInputChange) {
            this.f165627f.d(r.h(pointerInputChange));
            pointerInputChange.a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
            a(pointerInputChange);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/J;", "", "invoke", "(Lg1/J;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.y$h */
    static final class h implements PointerInputEventHandler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f165628a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/c;", "", "<anonymous>", "(Lg1/c;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", f = "SelectionGestures.kt", l = {94}, m = "invokeSuspend")
        /* renamed from: w0.y$h$a */
        static final class a extends RestrictedSuspendLambda implements Function2<InterfaceC14171c, Continuation<? super Unit>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f165629b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f165630c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<Boolean, Unit> f165631d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super Boolean, Unit> function1, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f165631d = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f165631d, continuation);
                aVar.f165630c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC14171c interfaceC14171c, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC14171c, continuation)).invokeSuspend(Unit.f142422a);
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:12:0x0030). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r4.f165629b
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r4.f165630c
                    g1.c r1 = (g1.InterfaceC14171c) r1
                    kotlin.ResultKt.b(r5)
                    goto L30
                L13:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1b:
                    kotlin.ResultKt.b(r5)
                    java.lang.Object r5 = r4.f165630c
                    g1.c r5 = (g1.InterfaceC14171c) r5
                    r1 = r5
                L23:
                    g1.s r5 = g1.EnumC14186s.f132678a
                    r4.f165630c = r1
                    r4.f165629b = r2
                    java.lang.Object r5 = r1.K0(r5, r4)
                    if (r5 != r0) goto L30
                    return r0
                L30:
                    g1.q r5 = (g1.C14185q) r5
                    kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r3 = r4.f165631d
                    boolean r5 = kotlin.C17739y.g(r5)
                    r5 = r5 ^ r2
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.a(r5)
                    r3.invoke(r5)
                    goto L23
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.C17739y.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        h(Function1<? super Boolean, Unit> function1) {
            this.f165628a = function1;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(J j10, Continuation<? super Unit> continuation) {
            Object objG0 = j10.g0(new a(this.f165628a, null), continuation);
            return objG0 == IntrinsicsKt.f() ? objG0 : Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(g1.InterfaceC14171c r7, kotlin.coroutines.Continuation<? super g1.C14185q> r8) {
        /*
            boolean r0 = r8 instanceof kotlin.C17739y.a
            if (r0 == 0) goto L13
            r0 = r8
            w0.y$a r0 = (kotlin.C17739y.a) r0
            int r1 = r0.f165605c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f165605c = r1
            goto L18
        L13:
            w0.y$a r0 = new w0.y$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f165604b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f165605c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f165603a
            g1.c r7 = (g1.InterfaceC14171c) r7
            kotlin.ResultKt.b(r8)
            goto L45
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.ResultKt.b(r8)
        L38:
            g1.s r8 = g1.EnumC14186s.f132679b
            r0.f165603a = r7
            r0.f165605c = r3
            java.lang.Object r8 = r7.K0(r8, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            g1.q r8 = (g1.C14185q) r8
            java.util.List r2 = r8.c()
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
        L53:
            if (r5 >= r4) goto L65
            java.lang.Object r6 = r2.get(r5)
            g1.B r6 = (g1.PointerInputChange) r6
            boolean r6 = g1.r.b(r6)
            if (r6 != 0) goto L62
            goto L38
        L62:
            int r5 = r5 + 1
            goto L53
        L65:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17739y.e(g1.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if (r12 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(g1.InterfaceC14171c r8, kotlin.InterfaceC17723i r9, kotlin.C17718d r10, g1.C14185q r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17739y.h(g1.c, w0.i, w0.d, g1.q, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Modifier i(Modifier modifier, InterfaceC17723i interfaceC17723i, P p10) {
        return U.d(modifier, interfaceC17723i, p10, new e(interfaceC17723i, p10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        if (r11 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(g1.InterfaceC14171c r8, androidx.compose.foundation.text.P r9, g1.C14185q r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            boolean r0 = r11 instanceof kotlin.C17739y.f
            if (r0 == 0) goto L13
            r0 = r11
            w0.y$f r0 = (kotlin.C17739y.f) r0
            int r1 = r0.f165626e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f165626e = r1
            goto L18
        L13:
            w0.y$f r0 = new w0.y$f
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f165625d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f165626e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L53
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r8 = r0.f165623b
            r9 = r8
            androidx.compose.foundation.text.P r9 = (androidx.compose.foundation.text.P) r9
            java.lang.Object r8 = r0.f165622a
            g1.c r8 = (g1.InterfaceC14171c) r8
            kotlin.ResultKt.b(r11)     // Catch: java.util.concurrent.CancellationException -> L35
            goto La1
        L35:
            r8 = move-exception
            goto Ld7
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            java.lang.Object r8 = r0.f165624c
            g1.B r8 = (g1.PointerInputChange) r8
            java.lang.Object r9 = r0.f165623b
            androidx.compose.foundation.text.P r9 = (androidx.compose.foundation.text.P) r9
            java.lang.Object r10 = r0.f165622a
            g1.c r10 = (g1.InterfaceC14171c) r10
            kotlin.ResultKt.b(r11)     // Catch: java.util.concurrent.CancellationException -> L35
            r7 = r10
            r10 = r8
            r8 = r7
            goto L73
        L53:
            kotlin.ResultKt.b(r11)
            java.util.List r10 = r10.c()     // Catch: java.util.concurrent.CancellationException -> L35
            java.lang.Object r10 = kotlin.collections.CollectionsKt.s0(r10)     // Catch: java.util.concurrent.CancellationException -> L35
            g1.B r10 = (g1.PointerInputChange) r10     // Catch: java.util.concurrent.CancellationException -> L35
            long r5 = r10.getId()     // Catch: java.util.concurrent.CancellationException -> L35
            r0.f165622a = r8     // Catch: java.util.concurrent.CancellationException -> L35
            r0.f165623b = r9     // Catch: java.util.concurrent.CancellationException -> L35
            r0.f165624c = r10     // Catch: java.util.concurrent.CancellationException -> L35
            r0.f165626e = r4     // Catch: java.util.concurrent.CancellationException -> L35
            java.lang.Object r11 = kotlin.C13814m.d(r8, r5, r0)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r11 != r1) goto L73
            goto La0
        L73:
            g1.B r11 = (g1.PointerInputChange) r11     // Catch: java.util.concurrent.CancellationException -> L35
            if (r11 == 0) goto Ld4
            androidx.compose.ui.platform.Q1 r2 = r8.getViewConfiguration()     // Catch: java.util.concurrent.CancellationException -> L35
            boolean r10 = f(r2, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r10 == 0) goto Ld4
            long r4 = r11.getPosition()     // Catch: java.util.concurrent.CancellationException -> L35
            r9.b(r4)     // Catch: java.util.concurrent.CancellationException -> L35
            long r10 = r11.getId()     // Catch: java.util.concurrent.CancellationException -> L35
            w0.y$g r2 = new w0.y$g     // Catch: java.util.concurrent.CancellationException -> L35
            r2.<init>(r9)     // Catch: java.util.concurrent.CancellationException -> L35
            r0.f165622a = r8     // Catch: java.util.concurrent.CancellationException -> L35
            r0.f165623b = r9     // Catch: java.util.concurrent.CancellationException -> L35
            r4 = 0
            r0.f165624c = r4     // Catch: java.util.concurrent.CancellationException -> L35
            r0.f165626e = r3     // Catch: java.util.concurrent.CancellationException -> L35
            java.lang.Object r11 = kotlin.C13814m.i(r8, r10, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r11 != r1) goto La1
        La0:
            return r1
        La1:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.util.concurrent.CancellationException -> L35
            boolean r10 = r11.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L35
            if (r10 == 0) goto Ld1
            g1.q r8 = r8.a1()     // Catch: java.util.concurrent.CancellationException -> L35
            java.util.List r8 = r8.c()     // Catch: java.util.concurrent.CancellationException -> L35
            r10 = r8
            java.util.Collection r10 = (java.util.Collection) r10     // Catch: java.util.concurrent.CancellationException -> L35
            int r10 = r10.size()     // Catch: java.util.concurrent.CancellationException -> L35
            r11 = 0
        Lb9:
            if (r11 >= r10) goto Lcd
            java.lang.Object r0 = r8.get(r11)     // Catch: java.util.concurrent.CancellationException -> L35
            g1.B r0 = (g1.PointerInputChange) r0     // Catch: java.util.concurrent.CancellationException -> L35
            boolean r1 = g1.r.c(r0)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r1 == 0) goto Lca
            r0.a()     // Catch: java.util.concurrent.CancellationException -> L35
        Lca:
            int r11 = r11 + 1
            goto Lb9
        Lcd:
            r9.onStop()     // Catch: java.util.concurrent.CancellationException -> L35
            goto Ld4
        Ld1:
            r9.onCancel()     // Catch: java.util.concurrent.CancellationException -> L35
        Ld4:
            kotlin.Unit r8 = kotlin.Unit.f142422a
            return r8
        Ld7:
            r9.onCancel()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17739y.j(g1.c, androidx.compose.foundation.text.P, g1.q, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(Q1 q12, PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2) {
        if (U0.f.k(U0.f.p(pointerInputChange.getPosition(), pointerInputChange2.getPosition())) < C13814m.k(q12, pointerInputChange.getType())) {
            return true;
        }
        return false;
    }

    public static final boolean g(C14185q c14185q) {
        List<PointerInputChange> listC = c14185q.c();
        int size = listC.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!O.g(listC.get(i10).getType(), O.INSTANCE.b())) {
                return false;
            }
        }
        return true;
    }

    public static final Modifier k(Modifier modifier, Function1<? super Boolean, Unit> function1) {
        return U.c(modifier, 8675309, new h(function1));
    }
}
