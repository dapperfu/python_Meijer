package kotlin;

import H1.r;
import H1.s;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.C;
import androidx.compose.ui.node.C5813i;
import androidx.compose.ui.node.C5815k;
import androidx.compose.ui.node.InterfaceC5812h;
import d0.EnumC13431E;
import f1.C13832e;
import i0.C14589e;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p0.InterfaceC16185c;
import qv.C0;
import qv.C16648k;
import qv.C16658p;
import qv.E0;
import qv.EnumC16624Q;
import qv.F0;
import qv.InterfaceC16622O;
import qv.InterfaceC16654n;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001YB)\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\"\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010!\u001a\u00020\t*\u00020\u00112\b\b\u0002\u0010 \u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\"\u0010$\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020'*\u00020\u001c2\u0006\u0010&\u001a\u00020\u001cH\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020'*\u00020*2\u0006\u0010&\u001a\u00020*H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010)J\u0017\u0010-\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u0011H\u0016¢\u0006\u0004\b-\u0010.J \u00100\u001a\u00020\u00142\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110/H\u0096@¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00142\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b4\u00105J\u001a\u00106\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b6\u00107J'\u00108\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b8\u00109R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010E\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010L\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010?R\u0016\u0010P\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010?R*\u0010V\u001a\u00020\u001c2\u0006\u0010Q\u001a\u00020\u001c8\u0000@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010?\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"Lf0/i;", "Landroidx/compose/ui/Modifier$c;", "Lp0/c;", "Landroidx/compose/ui/node/C;", "Landroidx/compose/ui/node/h;", "Lf0/z;", "orientation", "Lf0/K;", "scrollingLogic", "", "reverseDirection", "Lf0/g;", "bringIntoViewSpec", "<init>", "(Lf0/z;Lf0/K;ZLf0/g;)V", "g3", "()Lf0/g;", "Landroidx/compose/ui/geometry/Rect;", "Z2", "()Landroidx/compose/ui/geometry/Rect;", "", "d3", "()V", "", "U2", "(Lf0/g;)F", "Y2", "childBounds", "LH1/r;", "containerSize", "X2", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/Rect;", "size", "b3", "(Landroidx/compose/ui/geometry/Rect;J)Z", "LU0/f;", "f3", "(Landroidx/compose/ui/geometry/Rect;J)J", "other", "", "V2", "(JJ)I", "LU0/k;", "W2", "localRect", "w1", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "Lkotlin/Function0;", "J1", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "newBounds", "e3", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "f", "(J)V", "h3", "(Lf0/z;ZLf0/g;)V", "o", "Lf0/z;", "p", "Lf0/K;", "q", "Z", "r", "Lf0/g;", "s", "o2", "()Z", "shouldAutoInvalidate", "Lf0/f;", "t", "Lf0/f;", "bringIntoViewRequests", "u", "Landroidx/compose/ui/layout/LayoutCoordinates;", "focusedChild", "v", "trackingFocusedChild", "w", "childWasMaxVisibleBeforeViewportShrunk", "<set-?>", "x", "J", "a3", "()J", "viewportSize", "y", "isAnimationRunning", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: f0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13810i extends Modifier.c implements InterfaceC16185c, C, InterfaceC5812h {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private EnumC13827z orientation;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final C13793K scrollingLogic;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean reverseDirection;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private InterfaceC13808g bringIntoViewSpec;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private LayoutCoordinates focusedChild;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean trackingFocusedChild;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean childWasMaxVisibleBeforeViewportShrunk;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean isAnimationRunning;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final C13807f bringIntoViewRequests = new C13807f();

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private long viewportSize = r.INSTANCE.a();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\r\u0010\u0012¨\u0006\u0013"}, d2 = {"Lf0/i$a;", "", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "currentBounds", "Lqv/n;", "", "continuation", "<init>", "(Lkotlin/jvm/functions/Function0;Lqv/n;)V", "", "toString", "()Ljava/lang/String;", "a", "Lkotlin/jvm/functions/Function0;", "b", "()Lkotlin/jvm/functions/Function0;", "Lqv/n;", "()Lqv/n;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: f0.i$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function0<Rect> currentBounds;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC16654n<Unit> continuation;

        public final InterfaceC16654n<Unit> a() {
            return this.continuation;
        }

        public final Function0<Rect> b() {
            return this.currentBounds;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r4 = this;
                qv.n<kotlin.Unit> r0 = r4.continuation
                kotlin.coroutines.CoroutineContext r0 = r0.getContext()
                qv.N$a r1 = qv.CoroutineName.INSTANCE
                kotlin.coroutines.CoroutineContext$Element r0 = r0.g(r1)
                qv.N r0 = (qv.CoroutineName) r0
                if (r0 == 0) goto L15
                java.lang.String r0 = r0.getName()
                goto L16
            L15:
                r0 = 0
            L16:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Request@"
                r1.append(r2)
                int r2 = r4.hashCode()
                r3 = 16
                int r3 = kotlin.text.CharsKt.a(r3)
                java.lang.String r2 = java.lang.Integer.toString(r2, r3)
                java.lang.String r3 = "toString(...)"
                kotlin.jvm.internal.Intrinsics.i(r2, r3)
                r1.append(r2)
                if (r0 == 0) goto L50
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 91
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = "]("
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                if (r0 != 0) goto L52
            L50:
                java.lang.String r0 = "("
            L52:
                r1.append(r0)
                java.lang.String r0 = "currentBounds()="
                r1.append(r0)
                kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> r0 = r4.currentBounds
                java.lang.Object r0 = r0.invoke()
                r1.append(r0)
                java.lang.String r0 = ", continuation="
                r1.append(r0)
                qv.n<kotlin.Unit> r0 = r4.continuation
                r1.append(r0)
                r0 = 41
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C13810i.a.toString():java.lang.String");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function0<Rect> function0, InterfaceC16654n<? super Unit> interfaceC16654n) {
            this.currentBounds = function0;
            this.continuation = interfaceC16654n;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", l = {215}, m = "invokeSuspend")
    /* renamed from: f0.i$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f130379a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f130380b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C13800S f130382d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC13808g f130383e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf0/y;", "", "<anonymous>", "(Lf0/y;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", l = {221}, m = "invokeSuspend")
        /* renamed from: f0.i$c$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC13826y, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f130384a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f130385b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C13800S f130386c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C13810i f130387d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC13808g f130388e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C0 f130389f;

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "delta", "", "b", "(F)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: f0.i$c$a$a, reason: collision with other inner class name */
            static final class C2070a extends Lambda implements Function1<Float, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ C13810i f130390f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ C13800S f130391g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ C0 f130392h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ InterfaceC13826y f130393i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2070a(C13810i c13810i, C13800S c13800s, C0 c02, InterfaceC13826y interfaceC13826y) {
                    super(1);
                    this.f130390f = c13810i;
                    this.f130391g = c13800s;
                    this.f130392h = c02;
                    this.f130393i = interfaceC13826y;
                }

                public final void b(float f10) {
                    float f11 = this.f130390f.reverseDirection ? 1.0f : -1.0f;
                    C13793K c13793k = this.f130390f.scrollingLogic;
                    float F10 = f11 * c13793k.F(c13793k.y(this.f130393i.b(c13793k.y(c13793k.G(f11 * f10)), C13832e.INSTANCE.d())));
                    if (Math.abs(F10) < Math.abs(f10)) {
                        F0.f(this.f130392h, "Scroll animation cancelled because scroll was not consumed (" + F10 + " < " + f10 + ')', null, 2, null);
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f10) {
                    b(f10.floatValue());
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: f0.i$c$a$b */
            static final class b extends Lambda implements Function0<Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ C13810i f130394f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ C13800S f130395g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ InterfaceC13808g f130396h;

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f142422a;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C13810i c13810i, C13800S c13800s, InterfaceC13808g interfaceC13808g) {
                    super(0);
                    this.f130394f = c13810i;
                    this.f130395g = c13800s;
                    this.f130396h = interfaceC13808g;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    C13807f c13807f = this.f130394f.bringIntoViewRequests;
                    C13810i c13810i = this.f130394f;
                    while (true) {
                        if (c13807f.requests.getSize() != 0) {
                            Rect rectInvoke = ((a) c13807f.requests.q()).b().invoke();
                            if (!(rectInvoke == null ? true : C13810i.c3(c13810i, rectInvoke, 0L, 1, null))) {
                                break;
                            } else {
                                ((a) c13807f.requests.u(c13807f.requests.getSize() - 1)).a().resumeWith(Result.b(Unit.f142422a));
                            }
                        } else {
                            break;
                        }
                    }
                    if (this.f130394f.trackingFocusedChild) {
                        Rect rectZ2 = this.f130394f.Z2();
                        if (rectZ2 != null && C13810i.c3(this.f130394f, rectZ2, 0L, 1, null)) {
                            this.f130394f.trackingFocusedChild = false;
                        }
                    }
                    this.f130395g.j(this.f130394f.U2(this.f130396h));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C13800S c13800s, C13810i c13810i, InterfaceC13808g interfaceC13808g, C0 c02, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f130386c = c13800s;
                this.f130387d = c13810i;
                this.f130388e = interfaceC13808g;
                this.f130389f = c02;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f130386c, this.f130387d, this.f130388e, this.f130389f, continuation);
                aVar.f130385b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC13826y interfaceC13826y, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC13826y, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f130384a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC13826y interfaceC13826y = (InterfaceC13826y) this.f130385b;
                    this.f130386c.j(this.f130387d.U2(this.f130388e));
                    C13800S c13800s = this.f130386c;
                    C2070a c2070a = new C2070a(this.f130387d, c13800s, this.f130389f, interfaceC13826y);
                    b bVar = new b(this.f130387d, this.f130386c, this.f130388e);
                    this.f130384a = 1;
                    if (c13800s.h(c2070a, bVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C13800S c13800s, InterfaceC13808g interfaceC13808g, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f130382d = c13800s;
            this.f130383e = interfaceC13808g;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = C13810i.this.new c(this.f130382d, this.f130383e, continuation);
            cVar.f130380b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f130379a;
            try {
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C0 c0K = E0.k(((InterfaceC16622O) this.f130380b).getCoroutineContext());
                        C13810i.this.isAnimationRunning = true;
                        C13793K c13793k = C13810i.this.scrollingLogic;
                        EnumC13431E enumC13431E = EnumC13431E.f126845a;
                        a aVar = new a(this.f130382d, C13810i.this, this.f130383e, c0K, null);
                        this.f130379a = 1;
                        if (c13793k.z(enumC13431E, aVar, this) == objF) {
                            return objF;
                        }
                    }
                    C13810i.this.bringIntoViewRequests.d();
                    C13810i.this.isAnimationRunning = false;
                    C13810i.this.bringIntoViewRequests.b(null);
                    C13810i.this.trackingFocusedChild = false;
                    return Unit.f142422a;
                } catch (CancellationException e10) {
                    throw e10;
                }
            } catch (Throwable th2) {
                C13810i.this.isAnimationRunning = false;
                C13810i.this.bringIntoViewRequests.b(null);
                C13810i.this.trackingFocusedChild = false;
                throw th2;
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f0.i$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC13827z.values().length];
            try {
                iArr[EnumC13827z.f130585a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC13827z.f130586b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float U2(InterfaceC13808g bringIntoViewSpec) {
        if (r.e(this.viewportSize, r.INSTANCE.a())) {
            return 0.0f;
        }
        Rect rectY2 = Y2();
        if (rectY2 == null) {
            rectY2 = this.trackingFocusedChild ? Z2() : null;
            if (rectY2 == null) {
                return 0.0f;
            }
        }
        long jD = s.d(this.viewportSize);
        int i10 = b.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i10 == 1) {
            return bringIntoViewSpec.a(rectY2.getTop(), rectY2.i() - rectY2.getTop(), Float.intBitsToFloat((int) (jD & 4294967295L)));
        }
        if (i10 == 2) {
            return bringIntoViewSpec.a(rectY2.getLeft(), rectY2.l() - rectY2.getLeft(), Float.intBitsToFloat((int) (jD >> 32)));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int V2(long j10, long j11) {
        int i10 = b.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i10 == 1) {
            return Intrinsics.k((int) (j10 & 4294967295L), (int) (j11 & 4294967295L));
        }
        if (i10 == 2) {
            return Intrinsics.k((int) (j10 >> 32), (int) (j11 >> 32));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int W2(long j10, long j11) {
        int i10 = b.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i10 == 1) {
            return Float.compare(Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
        }
        if (i10 == 2) {
            return Float.compare(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 >> 32)));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Rect Y2() {
        D0.c cVar = this.bringIntoViewRequests.requests;
        int size = cVar.getSize() - 1;
        Object[] objArr = cVar.content;
        Rect rect = null;
        if (size < objArr.length) {
            while (size >= 0) {
                Rect rectInvoke = ((a) objArr[size]).b().invoke();
                if (rectInvoke != null) {
                    if (W2(rectInvoke.m(), s.d(this.viewportSize)) > 0) {
                        return rect == null ? rectInvoke : rect;
                    }
                    rect = rectInvoke;
                }
                size--;
            }
        }
        return rect;
    }

    static /* synthetic */ boolean c3(C13810i c13810i, Rect rect, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = c13810i.viewportSize;
        }
        return c13810i.b3(rect, j10);
    }

    private final InterfaceC13808g g3() {
        InterfaceC13808g interfaceC13808g = this.bringIntoViewSpec;
        return interfaceC13808g == null ? (InterfaceC13808g) C5813i.a(this, C13809h.a()) : interfaceC13808g;
    }

    /* renamed from: a3, reason: from getter */
    public final long getViewportSize() {
        return this.viewportSize;
    }

    public final void e3(LayoutCoordinates newBounds) {
        Rect rectZ2;
        this.focusedChild = newBounds;
        if (this.childWasMaxVisibleBeforeViewportShrunk && (rectZ2 = Z2()) != null && !b3(rectZ2, this.viewportSize)) {
            this.trackingFocusedChild = true;
            d3();
        }
        this.childWasMaxVisibleBeforeViewportShrunk = false;
    }

    @Override // androidx.compose.ui.node.C
    public void f(long size) {
        Rect rectZ2;
        long j10 = this.viewportSize;
        this.viewportSize = size;
        if (V2(size, j10) >= 0 || this.isAnimationRunning || this.trackingFocusedChild || (rectZ2 = Z2()) == null || !b3(rectZ2, j10)) {
            return;
        }
        this.childWasMaxVisibleBeforeViewportShrunk = true;
    }

    public final void h3(EnumC13827z orientation, boolean reverseDirection, InterfaceC13808g bringIntoViewSpec) {
        this.orientation = orientation;
        this.reverseDirection = reverseDirection;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }

    @Override // androidx.compose.ui.Modifier.c
    /* renamed from: o2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // p0.InterfaceC16185c
    public Rect w1(Rect localRect) {
        if (r.e(this.viewportSize, r.INSTANCE.a())) {
            C14589e.c("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return X2(localRect, this.viewportSize);
    }

    public C13810i(EnumC13827z enumC13827z, C13793K c13793k, boolean z10, InterfaceC13808g interfaceC13808g) {
        this.orientation = enumC13827z;
        this.scrollingLogic = c13793k;
        this.reverseDirection = z10;
        this.bringIntoViewSpec = interfaceC13808g;
    }

    private final Rect X2(Rect childBounds, long containerSize) {
        return childBounds.t(U0.f.e(f3(childBounds, containerSize) ^ (-9223372034707292160L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect Z2() {
        if (!getIsAttached()) {
            return null;
        }
        LayoutCoordinates layoutCoordinatesM = C5815k.m(this);
        LayoutCoordinates layoutCoordinates = this.focusedChild;
        if (layoutCoordinates != null) {
            if (!layoutCoordinates.isAttached()) {
                layoutCoordinates = null;
            }
            if (layoutCoordinates != null) {
                return layoutCoordinatesM.b0(layoutCoordinates, false);
            }
        }
        return null;
    }

    private final boolean b3(Rect rect, long j10) {
        long jF3 = f3(rect, j10);
        if (Math.abs(Float.intBitsToFloat((int) (jF3 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jF3 & 4294967295L))) <= 0.5f) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d3() {
        InterfaceC13808g interfaceC13808gG3 = g3();
        if (this.isAnimationRunning) {
            C14589e.c("launchAnimation called when previous animation was running");
        }
        C16648k.d(j2(), null, EnumC16624Q.f157614d, new c(new C13800S(InterfaceC13808g.INSTANCE.c()), interfaceC13808gG3, null), 1, null);
    }

    private final long f3(Rect childBounds, long containerSize) {
        long jD = s.d(containerSize);
        int i10 = b.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return U0.f.e((Float.floatToRawIntBits(g3().a(childBounds.getLeft(), childBounds.l() - childBounds.getLeft(), Float.intBitsToFloat((int) (jD >> 32)))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
            }
            throw new NoWhenBranchMatchedException();
        }
        float fA = g3().a(childBounds.getTop(), childBounds.i() - childBounds.getTop(), Float.intBitsToFloat((int) (jD & 4294967295L)));
        return U0.f.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fA) & 4294967295L));
    }

    @Override // p0.InterfaceC16185c
    public Object J1(Function0<Rect> function0, Continuation<? super Unit> continuation) {
        Rect rectInvoke = function0.invoke();
        if (rectInvoke != null && !c3(this, rectInvoke, 0L, 1, null)) {
            C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
            c16658p.C();
            if (this.bringIntoViewRequests.c(new a(function0, c16658p)) && !this.isAnimationRunning) {
                d3();
            }
            Object objV = c16658p.v();
            if (objV == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            if (objV == IntrinsicsKt.f()) {
                return objV;
            }
            return Unit.f142422a;
        }
        return Unit.f142422a;
    }
}
