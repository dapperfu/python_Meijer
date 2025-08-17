package androidx.compose.foundation.lazy.layout;

import H1.n;
import V0.InterfaceC5310d1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.t1;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import com.google.android.gms.common.api.a;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.C6313a;
import kotlin.C6330m;
import kotlin.C6331n;
import kotlin.InterfaceC6293F;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.q0;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 E2\u00020\u0001:\u0001\u0016B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\fJ\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\fJ\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR*\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010(\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R*\u0010,\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R$\u00102\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R+\u00108\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00101\"\u0004\b6\u00107R+\u0010<\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u00104\u001a\u0004\b:\u00101\"\u0004\b;\u00107R+\u0010@\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b=\u00104\u001a\u0004\b>\u00101\"\u0004\b?\u00107R+\u0010C\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u00104\u001a\u0004\bA\u00101\"\u0004\bB\u00107R(\u0010H\u001a\u00020\r8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0014\u0010D\u001a\u0004\bE\u0010F\"\u0004\bD\u0010GR(\u0010K\u001a\u00020\r8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0011\u0010D\u001a\u0004\bI\u0010F\"\u0004\bJ\u0010GR(\u0010P\u001a\u0004\u0018\u00010L2\b\u0010-\u001a\u0004\u0018\u00010L8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010M\u001a\u0004\bN\u0010OR \u0010T\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020R0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010SR \u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020U0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010SR1\u0010Z\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r8F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bW\u00104\u001a\u0004\bX\u0010F\"\u0004\bY\u0010GR(\u0010\\\u001a\u00020\r8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bX\u0010D\u001a\u0004\bW\u0010F\"\u0004\b[\u0010G\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006]"}, d2 = {"Landroidx/compose/foundation/lazy/layout/c;", "", "Lqv/O;", "coroutineScope", "LV0/d1;", "graphicsContext", "Lkotlin/Function0;", "", "onLayerPropertyChanged", "<init>", "(Lqv/O;LV0/d1;Lkotlin/jvm/functions/Function0;)V", "n", "()V", "LH1/n;", "delta", "", "isMovingAway", "m", "(JZ)V", "k", "l", "y", "a", "Lqv/O;", "b", "LV0/d1;", "c", "Lkotlin/jvm/functions/Function0;", "Lc0/F;", "", "d", "Lc0/F;", "getFadeInSpec", "()Lc0/F;", "C", "(Lc0/F;)V", "fadeInSpec", "e", "getPlacementSpec", "I", "placementSpec", "f", "getFadeOutSpec", "D", "fadeOutSpec", "<set-?>", "g", "Z", "x", "()Z", "isRunningMovingAwayAnimation", "h", "Landroidx/compose/runtime/l0;", "w", "G", "(Z)V", "isPlacementAnimationInProgress", "i", "t", "z", "isAppearanceAnimationInProgress", "j", "v", "B", "isDisappearanceAnimationInProgress", "u", "A", "isDisappearanceAnimationFinished", "J", "s", "()J", "(J)V", "rawOffset", "o", "E", "finalOffset", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "p", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Lc0/a;", "Lc0/n;", "Lc0/a;", "placementDeltaAnimation", "Lc0/m;", "visibilityAnimation", "q", "r", "H", "placementDelta", "F", "lookaheadOffset", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class c {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: t, reason: collision with root package name */
    public static final int f48784t = 8;

    /* renamed from: u, reason: collision with root package name */
    private static final long f48785u;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O coroutineScope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5310d1 graphicsContext;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onLayerPropertyChanged;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private InterfaceC6293F<Float> fadeInSpec;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private InterfaceC6293F<n> placementSpec;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private InterfaceC6293F<Float> fadeOutSpec;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isRunningMovingAwayAnimation;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 isPlacementAnimationInProgress;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 isAppearanceAnimationInProgress;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 isDisappearanceAnimationInProgress;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 isDisappearanceAnimationFinished;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long rawOffset;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private long finalOffset;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private GraphicsLayer layer;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final C6313a<n, C6331n> placementDeltaAnimation;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final C6313a<Float, C6330m> visibilityAnimation;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 placementDelta;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private long lookaheadOffset;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/layout/c$a;", "", "<init>", "()V", "LH1/n;", "NotInitialized", "J", "a", "()J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final long a() {
            return c.f48785u;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$1", f = "LazyLayoutItemAnimation.kt", l = {171}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48804a;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48804a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C6313a c6313a = c.this.visibilityAnimation;
                Float fC = Boxing.c(1.0f);
                this.f48804a = 1;
                if (c6313a.t(fC, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2", f = "LazyLayoutItemAnimation.kt", l = {183, 185}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.lazy.layout.c$c, reason: collision with other inner class name */
    static final class C1000c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48806a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f48807b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f48808c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6293F<Float> f48809d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ GraphicsLayer f48810e;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/a;", "", "Lc0/m;", "", "a", "(Lc0/a;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.lazy.layout.c$c$a */
        static final class a extends Lambda implements Function1<C6313a<Float, C6330m>, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ GraphicsLayer f48811f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ c f48812g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GraphicsLayer graphicsLayer, c cVar) {
                super(1);
                this.f48811f = graphicsLayer;
                this.f48812g = cVar;
            }

            public final void a(C6313a<Float, C6330m> c6313a) {
                this.f48811f.J(c6313a.m().floatValue());
                this.f48812g.onLayerPropertyChanged.invoke();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C6313a<Float, C6330m> c6313a) {
                a(c6313a);
                return Unit.f142422a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C1000c(this.f48807b, this.f48808c, this.f48809d, this.f48810e, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1000c(boolean z10, c cVar, InterfaceC6293F<Float> interfaceC6293F, GraphicsLayer graphicsLayer, Continuation<? super C1000c> continuation) {
            super(2, continuation);
            this.f48807b = z10;
            this.f48808c = cVar;
            this.f48809d = interfaceC6293F;
            this.f48810e = graphicsLayer;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C1000c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|33|(1:(1:(4:6|7|25|26)(2:10|11))(1:12))(6:14|36|15|(3:17|(1:19)|24)|31|32)|20|21|34|22|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
        
            if (kotlin.C6313a.f(r4, r5, r6, null, r8, r9, 4, null) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
        
            r0 = th;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r12.f48806a
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L24
                if (r1 == r4) goto L20
                if (r1 != r3) goto L18
                kotlin.ResultKt.b(r13)     // Catch: java.lang.Throwable -> L14
                r9 = r12
                goto L64
            L14:
                r0 = move-exception
                r13 = r0
                r9 = r12
                goto L72
            L18:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L20:
                kotlin.ResultKt.b(r13)     // Catch: java.lang.Throwable -> L14
                goto L40
            L24:
                kotlin.ResultKt.b(r13)
                boolean r13 = r12.f48807b     // Catch: java.lang.Throwable -> L6f
                if (r13 == 0) goto L40
                androidx.compose.foundation.lazy.layout.c r13 = r12.f48808c     // Catch: java.lang.Throwable -> L14
                c0.a r13 = androidx.compose.foundation.lazy.layout.c.d(r13)     // Catch: java.lang.Throwable -> L14
                r1 = 0
                java.lang.Float r1 = kotlin.coroutines.jvm.internal.Boxing.c(r1)     // Catch: java.lang.Throwable -> L14
                r12.f48806a = r4     // Catch: java.lang.Throwable -> L14
                java.lang.Object r13 = r13.t(r1, r12)     // Catch: java.lang.Throwable -> L14
                if (r13 != r0) goto L40
                r9 = r12
                goto L63
            L40:
                androidx.compose.foundation.lazy.layout.c r13 = r12.f48808c     // Catch: java.lang.Throwable -> L6f
                c0.a r4 = androidx.compose.foundation.lazy.layout.c.d(r13)     // Catch: java.lang.Throwable -> L6f
                r13 = 1065353216(0x3f800000, float:1.0)
                java.lang.Float r5 = kotlin.coroutines.jvm.internal.Boxing.c(r13)     // Catch: java.lang.Throwable -> L6f
                c0.F<java.lang.Float> r6 = r12.f48809d     // Catch: java.lang.Throwable -> L6f
                androidx.compose.foundation.lazy.layout.c$c$a r8 = new androidx.compose.foundation.lazy.layout.c$c$a     // Catch: java.lang.Throwable -> L6f
                androidx.compose.ui.graphics.layer.GraphicsLayer r13 = r12.f48810e     // Catch: java.lang.Throwable -> L6f
                androidx.compose.foundation.lazy.layout.c r1 = r12.f48808c     // Catch: java.lang.Throwable -> L6f
                r8.<init>(r13, r1)     // Catch: java.lang.Throwable -> L6f
                r12.f48806a = r3     // Catch: java.lang.Throwable -> L6f
                r7 = 0
                r10 = 4
                r11 = 0
                r9 = r12
                java.lang.Object r13 = kotlin.C6313a.f(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L6c
                if (r13 != r0) goto L64
            L63:
                return r0
            L64:
                androidx.compose.foundation.lazy.layout.c r13 = r9.f48808c
                androidx.compose.foundation.lazy.layout.c.e(r13, r2)
                kotlin.Unit r13 = kotlin.Unit.f142422a
                return r13
            L6c:
                r0 = move-exception
            L6d:
                r13 = r0
                goto L72
            L6f:
                r0 = move-exception
                r9 = r12
                goto L6d
            L72:
                androidx.compose.foundation.lazy.layout.c r0 = r9.f48808c
                androidx.compose.foundation.lazy.layout.c.e(r0, r2)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.c.C1000c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1", f = "LazyLayoutItemAnimation.kt", l = {HttpResponseStatus.SUCCESS_NO_CONTENT}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48813a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6293F<Float> f48815c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ GraphicsLayer f48816d;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/a;", "", "Lc0/m;", "", "a", "(Lc0/a;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends Lambda implements Function1<C6313a<Float, C6330m>, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ GraphicsLayer f48817f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ c f48818g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GraphicsLayer graphicsLayer, c cVar) {
                super(1);
                this.f48817f = graphicsLayer;
                this.f48818g = cVar;
            }

            public final void a(C6313a<Float, C6330m> c6313a) {
                this.f48817f.J(c6313a.m().floatValue());
                this.f48818g.onLayerPropertyChanged.invoke();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C6313a<Float, C6330m> c6313a) {
                a(c6313a);
                return Unit.f142422a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new d(this.f48815c, this.f48816d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC6293F<Float> interfaceC6293F, GraphicsLayer graphicsLayer, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f48815c = interfaceC6293F;
            this.f48816d = graphicsLayer;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            d dVar;
            Throwable th2;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48813a;
            if (i10 != 0) {
                if (i10 == 1) {
                    try {
                        ResultKt.b(obj);
                        dVar = this;
                    } catch (Throwable th3) {
                        th2 = th3;
                        dVar = this;
                        c.this.B(false);
                        throw th2;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                try {
                    C6313a c6313a = c.this.visibilityAnimation;
                    Float fC = Boxing.c(0.0f);
                    InterfaceC6293F<Float> interfaceC6293F = this.f48815c;
                    a aVar = new a(this.f48816d, c.this);
                    this.f48813a = 1;
                    dVar = this;
                    try {
                        if (C6313a.f(c6313a, fC, interfaceC6293F, null, aVar, dVar, 4, null) == objF) {
                            return objF;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        c.this.B(false);
                        throw th2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    dVar = this;
                    th2 = th;
                    c.this.B(false);
                    throw th2;
                }
            }
            c.this.A(true);
            c.this.B(false);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1", f = "LazyLayoutItemAnimation.kt", l = {141, 148}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f48819a;

        /* renamed from: b, reason: collision with root package name */
        int f48820b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6293F<n> f48822d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f48823e;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/a;", "LH1/n;", "Lc0/n;", "", "a", "(Lc0/a;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends Lambda implements Function1<C6313a<n, C6331n>, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ c f48824f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ long f48825g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, long j10) {
                super(1);
                this.f48824f = cVar;
                this.f48825g = j10;
            }

            public final void a(C6313a<n, C6331n> c6313a) {
                this.f48824f.H(n.n(c6313a.m().getPackedValue(), this.f48825g));
                this.f48824f.onLayerPropertyChanged.invoke();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C6313a<n, C6331n> c6313a) {
                a(c6313a);
                return Unit.f142422a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new e(this.f48822d, this.f48823e, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC6293F<n> interfaceC6293F, long j10, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f48822d = interfaceC6293F;
            this.f48823e = j10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:40)|(1:(1:(5:6|7|34|35|36)(2:9|10))(2:11|12))(7:14|15|(2:17|(1:19)(1:20))(1:22)|21|23|(2:25|(1:27))(4:29|30|38|31)|33)|28|29|30|38|31) */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
        
            if (kotlin.C6313a.f(r12, r4, r5, null, r7, r8, 4, null) != r0) goto L34;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r11.f48820b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                kotlin.ResultKt.b(r12)     // Catch: java.util.concurrent.CancellationException -> L14
                r8 = r11
                goto Lb0
            L14:
                r8 = r11
                goto Lbb
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                java.lang.Object r1 = r11.f48819a
                c0.F r1 = (kotlin.InterfaceC6293F) r1
                kotlin.ResultKt.b(r12)     // Catch: java.util.concurrent.CancellationException -> L14
                goto L6c
            L27:
                kotlin.ResultKt.b(r12)
                androidx.compose.foundation.lazy.layout.c r12 = androidx.compose.foundation.lazy.layout.c.this     // Catch: java.util.concurrent.CancellationException -> L14
                c0.a r12 = androidx.compose.foundation.lazy.layout.c.c(r12)     // Catch: java.util.concurrent.CancellationException -> L14
                boolean r12 = r12.p()     // Catch: java.util.concurrent.CancellationException -> L14
                if (r12 == 0) goto L45
                c0.F<H1.n> r12 = r11.f48822d     // Catch: java.util.concurrent.CancellationException -> L14
                boolean r1 = r12 instanceof kotlin.C6320d0     // Catch: java.util.concurrent.CancellationException -> L14
                if (r1 == 0) goto L3f
                c0.d0 r12 = (kotlin.C6320d0) r12     // Catch: java.util.concurrent.CancellationException -> L14
                goto L43
            L3f:
                c0.d0 r12 = kotlin.C15754n.a()     // Catch: java.util.concurrent.CancellationException -> L14
            L43:
                r1 = r12
                goto L48
            L45:
                c0.F<H1.n> r12 = r11.f48822d     // Catch: java.util.concurrent.CancellationException -> L14
                goto L43
            L48:
                androidx.compose.foundation.lazy.layout.c r12 = androidx.compose.foundation.lazy.layout.c.this     // Catch: java.util.concurrent.CancellationException -> L14
                c0.a r12 = androidx.compose.foundation.lazy.layout.c.c(r12)     // Catch: java.util.concurrent.CancellationException -> L14
                boolean r12 = r12.p()     // Catch: java.util.concurrent.CancellationException -> L14
                if (r12 != 0) goto L75
                androidx.compose.foundation.lazy.layout.c r12 = androidx.compose.foundation.lazy.layout.c.this     // Catch: java.util.concurrent.CancellationException -> L14
                c0.a r12 = androidx.compose.foundation.lazy.layout.c.c(r12)     // Catch: java.util.concurrent.CancellationException -> L14
                long r4 = r11.f48823e     // Catch: java.util.concurrent.CancellationException -> L14
                H1.n r4 = H1.n.c(r4)     // Catch: java.util.concurrent.CancellationException -> L14
                r11.f48819a = r1     // Catch: java.util.concurrent.CancellationException -> L14
                r11.f48820b = r3     // Catch: java.util.concurrent.CancellationException -> L14
                java.lang.Object r12 = r12.t(r4, r11)     // Catch: java.util.concurrent.CancellationException -> L14
                if (r12 != r0) goto L6c
                r8 = r11
                goto Laf
            L6c:
                androidx.compose.foundation.lazy.layout.c r12 = androidx.compose.foundation.lazy.layout.c.this     // Catch: java.util.concurrent.CancellationException -> L14
                kotlin.jvm.functions.Function0 r12 = androidx.compose.foundation.lazy.layout.c.b(r12)     // Catch: java.util.concurrent.CancellationException -> L14
                r12.invoke()     // Catch: java.util.concurrent.CancellationException -> L14
            L75:
                r5 = r1
                androidx.compose.foundation.lazy.layout.c r12 = androidx.compose.foundation.lazy.layout.c.this     // Catch: java.util.concurrent.CancellationException -> L14
                c0.a r12 = androidx.compose.foundation.lazy.layout.c.c(r12)     // Catch: java.util.concurrent.CancellationException -> L14
                java.lang.Object r12 = r12.m()     // Catch: java.util.concurrent.CancellationException -> L14
                H1.n r12 = (H1.n) r12     // Catch: java.util.concurrent.CancellationException -> L14
                long r3 = r12.getPackedValue()     // Catch: java.util.concurrent.CancellationException -> L14
                long r6 = r11.f48823e     // Catch: java.util.concurrent.CancellationException -> L14
                long r3 = H1.n.n(r3, r6)     // Catch: java.util.concurrent.CancellationException -> L14
                androidx.compose.foundation.lazy.layout.c r12 = androidx.compose.foundation.lazy.layout.c.this     // Catch: java.util.concurrent.CancellationException -> L14
                c0.a r12 = androidx.compose.foundation.lazy.layout.c.c(r12)     // Catch: java.util.concurrent.CancellationException -> L14
                r6 = r3
                H1.n r4 = H1.n.c(r6)     // Catch: java.util.concurrent.CancellationException -> L14
                r8 = r6
                androidx.compose.foundation.lazy.layout.c$e$a r7 = new androidx.compose.foundation.lazy.layout.c$e$a     // Catch: java.util.concurrent.CancellationException -> L14
                androidx.compose.foundation.lazy.layout.c r1 = androidx.compose.foundation.lazy.layout.c.this     // Catch: java.util.concurrent.CancellationException -> L14
                r7.<init>(r1, r8)     // Catch: java.util.concurrent.CancellationException -> L14
                r1 = 0
                r11.f48819a = r1     // Catch: java.util.concurrent.CancellationException -> L14
                r11.f48820b = r2     // Catch: java.util.concurrent.CancellationException -> L14
                r6 = 0
                r9 = 4
                r10 = 0
                r8 = r11
                r3 = r12
                java.lang.Object r12 = kotlin.C6313a.f(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> Lbb
                if (r12 != r0) goto Lb0
            Laf:
                return r0
            Lb0:
                androidx.compose.foundation.lazy.layout.c r12 = androidx.compose.foundation.lazy.layout.c.this     // Catch: java.util.concurrent.CancellationException -> Lbb
                r0 = 0
                androidx.compose.foundation.lazy.layout.c.h(r12, r0)     // Catch: java.util.concurrent.CancellationException -> Lbb
                androidx.compose.foundation.lazy.layout.c r12 = androidx.compose.foundation.lazy.layout.c.this     // Catch: java.util.concurrent.CancellationException -> Lbb
                androidx.compose.foundation.lazy.layout.c.j(r12, r0)     // Catch: java.util.concurrent.CancellationException -> Lbb
            Lbb:
                kotlin.Unit r12 = kotlin.Unit.f142422a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$cancelPlacementAnimation$1", f = "LazyLayoutItemAnimation.kt", l = {106}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48826a;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48826a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C6313a c6313a = c.this.placementDeltaAnimation;
                n nVarC = n.c(n.INSTANCE.b());
                this.f48826a = 1;
                if (c6313a.t(nVarC, this) == objF) {
                    return objF;
                }
            }
            c.this.H(n.INSTANCE.b());
            c.this.G(false);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$1", f = "LazyLayoutItemAnimation.kt", l = {218}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48828a;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48828a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C6313a c6313a = c.this.placementDeltaAnimation;
                this.f48828a = 1;
                if (c6313a.u(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$2", f = "LazyLayoutItemAnimation.kt", l = {222}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48830a;

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48830a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C6313a c6313a = c.this.visibilityAnimation;
                this.f48830a = 1;
                if (c6313a.u(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$3", f = "LazyLayoutItemAnimation.kt", l = {226}, m = "invokeSuspend")
    static final class i extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48832a;

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48832a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C6313a c6313a = c.this.visibilityAnimation;
                this.f48832a = 1;
                if (c6313a.u(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    static {
        long j10 = a.e.API_PRIORITY_OTHER;
        f48785u = n.f((j10 & 4294967295L) | (j10 << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(boolean z10) {
        this.isDisappearanceAnimationFinished.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(boolean z10) {
        this.isDisappearanceAnimationInProgress.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(boolean z10) {
        this.isPlacementAnimationInProgress.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(long j10) {
        this.placementDelta.setValue(n.c(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(boolean z10) {
        this.isAppearanceAnimationInProgress.setValue(Boolean.valueOf(z10));
    }

    public final void C(InterfaceC6293F<Float> interfaceC6293F) {
        this.fadeInSpec = interfaceC6293F;
    }

    public final void D(InterfaceC6293F<Float> interfaceC6293F) {
        this.fadeOutSpec = interfaceC6293F;
    }

    public final void E(long j10) {
        this.finalOffset = j10;
    }

    public final void F(long j10) {
        this.lookaheadOffset = j10;
    }

    public final void I(InterfaceC6293F<n> interfaceC6293F) {
        this.placementSpec = interfaceC6293F;
    }

    public final void J(long j10) {
        this.rawOffset = j10;
    }

    public final void k() {
        GraphicsLayer graphicsLayer = this.layer;
        InterfaceC6293F<Float> interfaceC6293F = this.fadeInSpec;
        if (t() || interfaceC6293F == null || graphicsLayer == null) {
            if (v()) {
                if (graphicsLayer != null) {
                    graphicsLayer.J(1.0f);
                }
                C16648k.d(this.coroutineScope, null, null, new b(null), 3, null);
                return;
            }
            return;
        }
        z(true);
        boolean zV = v();
        boolean z10 = !zV;
        if (!zV) {
            graphicsLayer.J(0.0f);
        }
        C16648k.d(this.coroutineScope, null, null, new C1000c(z10, this, interfaceC6293F, graphicsLayer, null), 3, null);
    }

    public final void l() {
        GraphicsLayer graphicsLayer = this.layer;
        InterfaceC6293F<Float> interfaceC6293F = this.fadeOutSpec;
        if (graphicsLayer == null || v() || interfaceC6293F == null) {
            return;
        }
        B(true);
        C16648k.d(this.coroutineScope, null, null, new d(interfaceC6293F, graphicsLayer, null), 3, null);
    }

    public final void m(long delta, boolean isMovingAway) {
        InterfaceC6293F<n> interfaceC6293F = this.placementSpec;
        if (interfaceC6293F == null) {
            return;
        }
        long jN = n.n(r(), delta);
        H(jN);
        G(true);
        this.isRunningMovingAwayAnimation = isMovingAway;
        C16648k.d(this.coroutineScope, null, null, new e(interfaceC6293F, jN, null), 3, null);
    }

    /* renamed from: o, reason: from getter */
    public final long getFinalOffset() {
        return this.finalOffset;
    }

    /* renamed from: p, reason: from getter */
    public final GraphicsLayer getLayer() {
        return this.layer;
    }

    /* renamed from: q, reason: from getter */
    public final long getLookaheadOffset() {
        return this.lookaheadOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long r() {
        return ((n) this.placementDelta.getValue()).getPackedValue();
    }

    /* renamed from: s, reason: from getter */
    public final long getRawOffset() {
        return this.rawOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean t() {
        return ((Boolean) this.isAppearanceAnimationInProgress.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean u() {
        return ((Boolean) this.isDisappearanceAnimationFinished.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean v() {
        return ((Boolean) this.isDisappearanceAnimationInProgress.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean w() {
        return ((Boolean) this.isPlacementAnimationInProgress.getValue()).booleanValue();
    }

    /* renamed from: x, reason: from getter */
    public final boolean getIsRunningMovingAwayAnimation() {
        return this.isRunningMovingAwayAnimation;
    }

    public c(InterfaceC16622O interfaceC16622O, InterfaceC5310d1 interfaceC5310d1, Function0<Unit> function0) {
        GraphicsLayer graphicsLayerA;
        this.coroutineScope = interfaceC16622O;
        this.graphicsContext = interfaceC5310d1;
        this.onLayerPropertyChanged = function0;
        Boolean bool = Boolean.FALSE;
        this.isPlacementAnimationInProgress = t1.e(bool, null, 2, null);
        this.isAppearanceAnimationInProgress = t1.e(bool, null, 2, null);
        this.isDisappearanceAnimationInProgress = t1.e(bool, null, 2, null);
        this.isDisappearanceAnimationFinished = t1.e(bool, null, 2, null);
        long j10 = f48785u;
        this.rawOffset = j10;
        n.Companion companion = n.INSTANCE;
        this.finalOffset = companion.b();
        if (interfaceC5310d1 != null) {
            graphicsLayerA = interfaceC5310d1.a();
        } else {
            graphicsLayerA = null;
        }
        this.layer = graphicsLayerA;
        String str = null;
        this.placementDeltaAnimation = new C6313a<>(n.c(companion.b()), q0.d(companion), null, str, 12, null);
        this.visibilityAnimation = new C6313a<>(Float.valueOf(1.0f), q0.i(FloatCompanionObject.f142822a), str, null, 12, null);
        this.placementDelta = t1.e(n.c(companion.b()), null, 2, null);
        this.lookaheadOffset = j10;
    }

    public final void n() {
        if (w()) {
            C16648k.d(this.coroutineScope, null, null, new f(null), 3, null);
        }
    }

    public final void y() {
        InterfaceC5310d1 interfaceC5310d1;
        if (w()) {
            G(false);
            C16648k.d(this.coroutineScope, null, null, new g(null), 3, null);
        }
        if (t()) {
            z(false);
            C16648k.d(this.coroutineScope, null, null, new h(null), 3, null);
        }
        if (v()) {
            B(false);
            C16648k.d(this.coroutineScope, null, null, new i(null), 3, null);
        }
        this.isRunningMovingAwayAnimation = false;
        H(n.INSTANCE.b());
        this.rawOffset = f48785u;
        GraphicsLayer graphicsLayer = this.layer;
        if (graphicsLayer != null && (interfaceC5310d1 = this.graphicsContext) != null) {
            interfaceC5310d1.b(graphicsLayer);
        }
        this.layer = null;
        this.fadeInSpec = null;
        this.fadeOutSpec = null;
        this.placementSpec = null;
    }
}
