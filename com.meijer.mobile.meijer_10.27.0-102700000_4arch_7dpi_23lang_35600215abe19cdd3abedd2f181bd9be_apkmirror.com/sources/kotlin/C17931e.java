package kotlin;

import androidx.compose.runtime.A0;
import androidx.compose.runtime.InterfaceC5724i0;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import d0.EnumC13431E;
import kotlin.InterfaceC13815n;
import kotlin.InterfaceC13819r;
import kotlin.InterfaceC6326i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\b\u0001\u0018\u0000 C*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001=Bs\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0011\u0010\u0012B\u0083\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0011\u0010\u0015J'\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0005¢\u0006\u0004\b \u0010!J%\u0010%\u001a\u00020$2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\b\b\u0002\u0010#\u001a\u00028\u0000¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b'\u0010(J^\u00100\u001a\u00020$2\b\b\u0002\u0010*\u001a\u00020)2B\u0010/\u001a>\b\u0001\u0012\u0004\u0012\u00020,\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0-\u0012\u0006\u0012\u0004\u0018\u00010\u00020+¢\u0006\u0002\b.H\u0086@¢\u0006\u0004\b0\u00101J{\u00103\u001a\u00020$2\u0006\u0010\u001d\u001a\u00028\u00002\b\b\u0002\u0010*\u001a\u00020)2W\u0010/\u001aS\b\u0001\u0012\u0004\u0012\u00020,\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0-\u0012\u0006\u0012\u0004\u0018\u00010\u000202¢\u0006\u0002\b.H\u0086@¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005H\u0000¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005¢\u0006\u0004\b8\u00107R5\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR5\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010:\u001a\u0004\bF\u0010<R\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010P\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR+\u0010\u0017\u001a\u00028\u00002\u0006\u0010Q\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001b\u0010\u001d\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010UR\u001b\u0010\\\u001a\u00028\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b0\u0010Y\u001a\u0004\b[\u0010UR+\u0010\u0016\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010]\u001a\u0004\b^\u0010!\"\u0004\b_\u0010`R\u001b\u0010c\u001a\u00020\u00058GX\u0086\u0084\u0002¢\u0006\f\n\u0004\ba\u0010Y\u001a\u0004\bb\u0010!R+\u0010f\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010]\u001a\u0004\bd\u0010!\"\u0004\be\u0010`R/\u0010i\u001a\u0004\u0018\u00018\u00002\b\u0010Q\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010S\u001a\u0004\bg\u0010U\"\u0004\bh\u0010WR7\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010S\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010nR\u0011\u0010r\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bp\u0010q¨\u0006s"}, d2 = {"Lx0/e;", "T", "", "initialValue", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "totalDistance", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "Lc0/i;", "animationSpec", "newValue", "", "confirmValueChange", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lc0/i;Lkotlin/jvm/functions/Function1;)V", "Lx0/a0;", "anchors", "(Ljava/lang/Object;Lx0/a0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lc0/i;Lkotlin/jvm/functions/Function1;)V", "offset", "currentValue", "velocity", "l", "(FLjava/lang/Object;F)Ljava/lang/Object;", "m", "(FLjava/lang/Object;)Ljava/lang/Object;", "targetValue", "H", "(Ljava/lang/Object;)Z", "A", "()F", "newAnchors", "newTarget", "", "I", "(Lx0/a0;Ljava/lang/Object;)V", "G", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ld0/E;", "dragPriority", "Lkotlin/Function3;", "Lx0/d;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "block", "i", "(Ld0/E;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function4;", "j", "(Ljava/lang/Object;Ld0/E;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "z", "(F)F", "n", "a", "Lkotlin/jvm/functions/Function1;", "getPositionalThreshold$material_release", "()Lkotlin/jvm/functions/Function1;", "b", "Lkotlin/jvm/functions/Function0;", "getVelocityThreshold$material_release", "()Lkotlin/jvm/functions/Function0;", "c", "Lc0/i;", "p", "()Lc0/i;", "d", "r", "Lx0/C0;", "e", "Lx0/C0;", "dragMutex", "Lf0/r;", "f", "Lf0/r;", "u", "()Lf0/r;", "draggableState", "<set-?>", "g", "Landroidx/compose/runtime/l0;", "s", "()Ljava/lang/Object;", "C", "(Ljava/lang/Object;)V", "h", "Landroidx/compose/runtime/z1;", "x", "q", "closestValue", "Landroidx/compose/runtime/i0;", "w", "F", "(F)V", "k", "getProgress", "progress", "v", "E", "lastVelocity", "t", "D", "dragTarget", "o", "()Lx0/a0;", "B", "(Lx0/a0;)V", "Lx0/d;", "anchoredDragScope", "y", "()Z", "isAnimationRunning", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17931e<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<Float, Float> positionalThreshold;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function0<Float> velocityThreshold;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6326i<Float> animationSpec;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function1<T, Boolean> confirmValueChange;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C17873C0 dragMutex;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13819r draggableState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 currentValue;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final z1 targetValue;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final z1 closestValue;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5724i0 offset;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final z1 progress;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5724i0 lastVelocity;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 dragTarget;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 anchors;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17928d anchoredDragScope;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.e$a */
    static final class a extends Lambda implements Function1<T, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f167818f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(T t10) {
            return Boolean.TRUE;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {525}, m = "anchoredDrag")
    /* renamed from: x0.e$c */
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f167819a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f167820b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C17931e<T> f167821c;

        /* renamed from: d, reason: collision with root package name */
        int f167822d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C17931e<T> c17931e, Continuation<? super c> continuation) {
            super(continuation);
            this.f167821c = c17931e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f167820b = obj;
            this.f167822d |= Integer.MIN_VALUE;
            return this.f167821c.i(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {526}, m = "invokeSuspend")
    /* renamed from: x0.e$d */
    static final class d extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f167823a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17931e<T> f167824b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC17928d, InterfaceC17920a0<T>, Continuation<? super Unit>, Object> f167825c;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lx0/a0;", "c", "()Lx0/a0;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.e$d$a */
        static final class a extends Lambda implements Function0<InterfaceC17920a0<T>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17931e<T> f167826f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C17931e<T> c17931e) {
                super(0);
                this.f167826f = c17931e;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final InterfaceC17920a0<T> invoke() {
                return this.f167826f.o();
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lx0/a0;", "latestAnchors", "", "<anonymous>", "(Lx0/a0;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {527}, m = "invokeSuspend")
        /* renamed from: x0.e$d$b */
        static final class b extends SuspendLambda implements Function2<InterfaceC17920a0<T>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f167827a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f167828b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function3<InterfaceC17928d, InterfaceC17920a0<T>, Continuation<? super Unit>, Object> f167829c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C17931e<T> f167830d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(Function3<? super InterfaceC17928d, ? super InterfaceC17920a0<T>, ? super Continuation<? super Unit>, ? extends Object> function3, C17931e<T> c17931e, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f167829c = function3;
                this.f167830d = c17931e;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(this.f167829c, this.f167830d, continuation);
                bVar.f167828b = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17920a0<T> interfaceC17920a0, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC17920a0, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f167827a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17920a0<T> interfaceC17920a0 = (InterfaceC17920a0) this.f167828b;
                    Function3<InterfaceC17928d, InterfaceC17920a0<T>, Continuation<? super Unit>, Object> function3 = this.f167829c;
                    InterfaceC17928d interfaceC17928d = ((C17931e) this.f167830d).anchoredDragScope;
                    this.f167827a = 1;
                    if (function3.invoke(interfaceC17928d, interfaceC17920a0, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(C17931e<T> c17931e, Function3<? super InterfaceC17928d, ? super InterfaceC17920a0<T>, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super d> continuation) {
            super(1, continuation);
            this.f167824b = c17931e;
            this.f167825c = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new d(this.f167824b, this.f167825c, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((d) create(continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f167823a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                a aVar = new a(this.f167824b);
                b bVar = new b(this.f167825c, this.f167824b, null);
                this.f167823a = 1;
                if (androidx.compose.material.a.j(aVar, bVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {572}, m = "anchoredDrag")
    /* renamed from: x0.e$e, reason: collision with other inner class name */
    static final class C2669e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f167831a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f167832b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C17931e<T> f167833c;

        /* renamed from: d, reason: collision with root package name */
        int f167834d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2669e(C17931e<T> c17931e, Continuation<? super C2669e> continuation) {
            super(continuation);
            this.f167833c = c17931e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f167832b = obj;
            this.f167834d |= Integer.MIN_VALUE;
            return this.f167833c.j(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {574}, m = "invokeSuspend")
    /* renamed from: x0.e$f */
    static final class f extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f167835a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17931e<T> f167836b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f167837c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function4<InterfaceC17928d, InterfaceC17920a0<T>, T, Continuation<? super Unit>, Object> f167838d;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlin/Pair;", "Lx0/a0;", "c", "()Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.e$f$a */
        static final class a extends Lambda implements Function0<Pair<? extends InterfaceC17920a0<T>, ? extends T>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17931e<T> f167839f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C17931e<T> c17931e) {
                super(0);
                this.f167839f = c17931e;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Pair<InterfaceC17920a0<T>, T> invoke() {
                return TuplesKt.a(this.f167839f.o(), this.f167839f.x());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlin/Pair;", "Lx0/a0;", "<name for destructuring parameter 0>", "", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {576}, m = "invokeSuspend")
        /* renamed from: x0.e$f$b */
        static final class b extends SuspendLambda implements Function2<Pair<? extends InterfaceC17920a0<T>, ? extends T>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f167840a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f167841b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function4<InterfaceC17928d, InterfaceC17920a0<T>, T, Continuation<? super Unit>, Object> f167842c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C17931e<T> f167843d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(Function4<? super InterfaceC17928d, ? super InterfaceC17920a0<T>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function4, C17931e<T> c17931e, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f167842c = function4;
                this.f167843d = c17931e;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(this.f167842c, this.f167843d, continuation);
                bVar.f167841b = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Pair<? extends InterfaceC17920a0<T>, ? extends T> pair, Continuation<? super Unit> continuation) {
                return ((b) create(pair, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f167840a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    Pair pair = (Pair) this.f167841b;
                    InterfaceC17920a0 interfaceC17920a0 = (InterfaceC17920a0) pair.a();
                    Object objB = pair.b();
                    Function4<InterfaceC17928d, InterfaceC17920a0<T>, T, Continuation<? super Unit>, Object> function4 = this.f167842c;
                    InterfaceC17928d interfaceC17928d = ((C17931e) this.f167843d).anchoredDragScope;
                    this.f167840a = 1;
                    if (function4.invoke(interfaceC17928d, interfaceC17920a0, objB, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(C17931e<T> c17931e, T t10, Function4<? super InterfaceC17928d, ? super InterfaceC17920a0<T>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function4, Continuation<? super f> continuation) {
            super(1, continuation);
            this.f167836b = c17931e;
            this.f167837c = t10;
            this.f167838d = function4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new f(this.f167836b, this.f167837c, this.f167838d, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((f) create(continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f167835a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                this.f167836b.D(this.f167837c);
                a aVar = new a(this.f167836b);
                b bVar = new b(this.f167838d, this.f167836b, null);
                this.f167835a = 1;
                if (androidx.compose.material.a.j(aVar, bVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"x0/e$g", "Lx0/d;", "", "newOffset", "lastKnownVelocity", "", "a", "(FF)V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.e$g */
    public static final class g implements InterfaceC17928d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C17931e<T> f167844a;

        g(C17931e<T> c17931e) {
            this.f167844a = c17931e;
        }

        @Override // kotlin.InterfaceC17928d
        public void a(float newOffset, float lastKnownVelocity) {
            this.f167844a.F(newOffset);
            this.f167844a.E(lastKnownVelocity);
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.e$h */
    static final class h extends Lambda implements Function0<T> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17931e<T> f167845f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C17931e<T> c17931e) {
            super(0);
            this.f167845f = c17931e;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            T t10 = (T) this.f167845f.t();
            if (t10 != null) {
                return t10;
            }
            C17931e<T> c17931e = this.f167845f;
            float fW = c17931e.w();
            return !Float.isNaN(fW) ? (T) c17931e.m(fW, c17931e.s()) : c17931e.s();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u0002\u0000\r\b\n\u0018\u00002\u00020\u0001JA\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0010"}, d2 = {"x0/e$i", "Lf0/r;", "Ld0/E;", "dragPriority", "Lkotlin/Function2;", "Lf0/n;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Ld0/E;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "x0/e$i$b", "Lx0/e$i$b;", "dragScope", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.e$i */
    public static final class i implements InterfaceC13819r {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b dragScope;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17931e<T> f167847b;

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lx0/d;", "Lx0/a0;", "it", "", "<anonymous>", "(Lx0/d;Lx0/a0;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", l = {282}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: x0.e$i$a */
        static final class a extends SuspendLambda implements Function3<InterfaceC17928d, InterfaceC17920a0<T>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f167848a;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function2<InterfaceC13815n, Continuation<? super Unit>, Object> f167850c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function2<? super InterfaceC13815n, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super a> continuation) {
                super(3, continuation);
                this.f167850c = function2;
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17928d interfaceC17928d, InterfaceC17920a0<T> interfaceC17920a0, Continuation<? super Unit> continuation) {
                return i.this.new a(this.f167850c, continuation).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f167848a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    b bVar = i.this.dragScope;
                    Function2<InterfaceC13815n, Continuation<? super Unit>, Object> function2 = this.f167850c;
                    this.f167848a = 1;
                    if (function2.invoke(bVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"x0/e$i$b", "Lf0/n;", "", "pixels", "", "a", "(F)V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: x0.e$i$b */
        public static final class b implements InterfaceC13815n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C17931e<T> f167851a;

            b(C17931e<T> c17931e) {
                this.f167851a = c17931e;
            }

            @Override // kotlin.InterfaceC13815n
            public void a(float pixels) {
                InterfaceC17928d.b(((C17931e) this.f167851a).anchoredDragScope, this.f167851a.z(pixels), 0.0f, 2, null);
            }
        }

        i(C17931e<T> c17931e) {
            this.f167847b = c17931e;
            this.dragScope = new b(c17931e);
        }

        @Override // kotlin.InterfaceC13819r
        public Object a(EnumC13431E enumC13431E, Function2<? super InterfaceC13815n, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) throws Throwable {
            Object objI = this.f167847b.i(enumC13431E, new a(function2, null), continuation);
            return objI == IntrinsicsKt.f() ? objI : Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.e$j */
    static final class j extends Lambda implements Function0<Float> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17931e<T> f167852f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(C17931e<T> c17931e) {
            super(0);
            this.f167852f = c17931e;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            float fC = this.f167852f.o().c(this.f167852f.s());
            float fC2 = this.f167852f.o().c(this.f167852f.q()) - fC;
            float fAbs = Math.abs(fC2);
            float f10 = 1.0f;
            if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                float fA = (this.f167852f.A() - fC) / fC2;
                if (fA < 1.0E-6f) {
                    f10 = 0.0f;
                } else if (fA <= 0.999999f) {
                    f10 = fA;
                }
            }
            return Float.valueOf(f10);
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.e$k */
    static final class k extends Lambda implements Function0<T> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17931e<T> f167853f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(C17931e<T> c17931e) {
            super(0);
            this.f167853f = c17931e;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            T t10 = (T) this.f167853f.t();
            if (t10 != null) {
                return t10;
            }
            C17931e<T> c17931e = this.f167853f;
            float fW = c17931e.w();
            return !Float.isNaN(fW) ? (T) c17931e.l(fW, c17931e.s(), 0.0f) : c17931e.s();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.e$l */
    static final class l extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17931e<T> f167854f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ T f167855g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(C17931e<T> c17931e, T t10) {
            super(0);
            this.f167854f = c17931e;
            this.f167855g = t10;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            InterfaceC17928d interfaceC17928d = ((C17931e) this.f167854f).anchoredDragScope;
            C17931e<T> c17931e = this.f167854f;
            T t10 = this.f167855g;
            float fC = c17931e.o().c(t10);
            if (!Float.isNaN(fC)) {
                InterfaceC17928d.b(interfaceC17928d, fC, 0.0f, 2, null);
                c17931e.D(null);
            }
            c17931e.C(t10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C17931e(T t10, Function1<? super Float, Float> function1, Function0<Float> function0, InterfaceC6326i<Float> interfaceC6326i, Function1<? super T, Boolean> function12) {
        this.positionalThreshold = function1;
        this.velocityThreshold = function0;
        this.animationSpec = interfaceC6326i;
        this.confirmValueChange = function12;
        this.dragMutex = new C17873C0();
        this.draggableState = new i(this);
        this.currentValue = t1.e(t10, null, 2, null);
        this.targetValue = o1.e(new k(this));
        this.closestValue = o1.e(new h(this));
        this.offset = A0.a(Float.NaN);
        this.progress = o1.d(o1.r(), new j(this));
        this.lastVelocity = A0.a(0.0f);
        this.dragTarget = t1.e(null, null, 2, null);
        this.anchors = t1.e(androidx.compose.material.a.i(), null, 2, null);
        this.anchoredDragScope = new g(this);
    }

    private final void B(InterfaceC17920a0<T> interfaceC17920a0) {
        this.anchors.setValue(interfaceC17920a0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(T t10) {
        this.currentValue.setValue(t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(T t10) {
        this.dragTarget.setValue(t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(float f10) {
        this.lastVelocity.B(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(float f10) {
        this.offset.B(f10);
    }

    private final boolean H(T targetValue) {
        return this.dragMutex.e(new l(this, targetValue));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void J(C17931e c17931e, InterfaceC17920a0 interfaceC17920a0, Object obj, int i10, Object obj2) {
        if ((i10 & 2) != 0 && (Float.isNaN(c17931e.w()) || (obj = interfaceC17920a0.b(c17931e.w())) == null)) {
            obj = c17931e.x();
        }
        c17931e.I(interfaceC17920a0, obj);
    }

    public static /* synthetic */ Object k(C17931e c17931e, Object obj, EnumC13431E enumC13431E, Function4 function4, Continuation continuation, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            enumC13431E = EnumC13431E.f126845a;
        }
        return c17931e.j(obj, enumC13431E, function4, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T t() {
        return this.dragTarget.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(d0.EnumC13431E r7, kotlin.jvm.functions.Function3<? super kotlin.InterfaceC17928d, ? super kotlin.InterfaceC17920a0<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof kotlin.C17931e.c
            if (r0 == 0) goto L13
            r0 = r9
            x0.e$c r0 = (kotlin.C17931e.c) r0
            int r1 = r0.f167822d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f167822d = r1
            goto L18
        L13:
            x0.e$c r0 = new x0.e$c
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f167820b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f167822d
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r7 = r0.f167819a
            x0.e r7 = (kotlin.C17931e) r7
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L2f
            goto L50
        L2f:
            r8 = move-exception
            goto L89
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            kotlin.ResultKt.b(r9)
            x0.C0 r9 = r6.dragMutex     // Catch: java.lang.Throwable -> L87
            x0.e$d r2 = new x0.e$d     // Catch: java.lang.Throwable -> L87
            r5 = 0
            r2.<init>(r6, r8, r5)     // Catch: java.lang.Throwable -> L87
            r0.f167819a = r6     // Catch: java.lang.Throwable -> L87
            r0.f167822d = r4     // Catch: java.lang.Throwable -> L87
            java.lang.Object r7 = r9.d(r7, r2, r0)     // Catch: java.lang.Throwable -> L87
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r7 = r6
        L50:
            x0.a0 r8 = r7.o()
            float r9 = r7.w()
            java.lang.Object r8 = r8.b(r9)
            if (r8 == 0) goto L84
            float r9 = r7.w()
            x0.a0 r0 = r7.o()
            float r0 = r0.c(r8)
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L84
            kotlin.jvm.functions.Function1<T, java.lang.Boolean> r9 = r7.confirmValueChange
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L84
            r7.C(r8)
        L84:
            kotlin.Unit r7 = kotlin.Unit.f142422a
            return r7
        L87:
            r8 = move-exception
            r7 = r6
        L89:
            x0.a0 r9 = r7.o()
            float r0 = r7.w()
            java.lang.Object r9 = r9.b(r0)
            if (r9 == 0) goto Lbd
            float r0 = r7.w()
            x0.a0 r1 = r7.o()
            float r1 = r1.c(r9)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto Lbd
            kotlin.jvm.functions.Function1<T, java.lang.Boolean> r0 = r7.confirmValueChange
            java.lang.Object r0 = r0.invoke(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lbd
            r7.C(r9)
        Lbd:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17931e.i(d0.E, kotlin.jvm.functions.Function3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(T r7, d0.EnumC13431E r8, kotlin.jvm.functions.Function4<? super kotlin.InterfaceC17928d, ? super kotlin.InterfaceC17920a0<T>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof kotlin.C17931e.C2669e
            if (r0 == 0) goto L13
            r0 = r10
            x0.e$e r0 = (kotlin.C17931e.C2669e) r0
            int r1 = r0.f167834d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f167834d = r1
            goto L18
        L13:
            x0.e$e r0 = new x0.e$e
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f167832b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f167834d
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r7 = r0.f167831a
            x0.e r7 = (kotlin.C17931e) r7
            kotlin.ResultKt.b(r10)     // Catch: java.lang.Throwable -> L30
            goto L5a
        L30:
            r8 = move-exception
            goto L94
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            kotlin.ResultKt.b(r10)
            x0.a0 r10 = r6.o()
            boolean r10 = r10.d(r7)
            if (r10 == 0) goto Lcc
            x0.C0 r10 = r6.dragMutex     // Catch: java.lang.Throwable -> L92
            x0.e$f r2 = new x0.e$f     // Catch: java.lang.Throwable -> L92
            r2.<init>(r6, r7, r9, r5)     // Catch: java.lang.Throwable -> L92
            r0.f167831a = r6     // Catch: java.lang.Throwable -> L92
            r0.f167834d = r4     // Catch: java.lang.Throwable -> L92
            java.lang.Object r7 = r10.d(r8, r2, r0)     // Catch: java.lang.Throwable -> L92
            if (r7 != r1) goto L59
            return r1
        L59:
            r7 = r6
        L5a:
            r7.D(r5)
            x0.a0 r8 = r7.o()
            float r9 = r7.w()
            java.lang.Object r8 = r8.b(r9)
            if (r8 == 0) goto Lcf
            float r9 = r7.w()
            x0.a0 r10 = r7.o()
            float r10 = r10.c(r8)
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto Lcf
            kotlin.jvm.functions.Function1<T, java.lang.Boolean> r9 = r7.confirmValueChange
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lcf
            r7.C(r8)
            goto Lcf
        L92:
            r8 = move-exception
            r7 = r6
        L94:
            r7.D(r5)
            x0.a0 r9 = r7.o()
            float r10 = r7.w()
            java.lang.Object r9 = r9.b(r10)
            if (r9 == 0) goto Lcb
            float r10 = r7.w()
            x0.a0 r0 = r7.o()
            float r0 = r0.c(r9)
            float r10 = r10 - r0
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 > 0) goto Lcb
            kotlin.jvm.functions.Function1<T, java.lang.Boolean> r10 = r7.confirmValueChange
            java.lang.Object r10 = r10.invoke(r9)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lcb
            r7.C(r9)
        Lcb:
            throw r8
        Lcc:
            r6.C(r7)
        Lcf:
            kotlin.Unit r7 = kotlin.Unit.f142422a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17931e.j(java.lang.Object, d0.E, kotlin.jvm.functions.Function4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final InterfaceC17920a0<T> o() {
        return (InterfaceC17920a0) this.anchors.getValue();
    }

    public final InterfaceC6326i<Float> p() {
        return this.animationSpec;
    }

    public final T q() {
        return (T) this.closestValue.getValue();
    }

    public final Function1<T, Boolean> r() {
        return this.confirmValueChange;
    }

    public final T s() {
        return this.currentValue.getValue();
    }

    /* renamed from: u, reason: from getter */
    public final InterfaceC13819r getDraggableState() {
        return this.draggableState;
    }

    public final float v() {
        return this.lastVelocity.b();
    }

    public final float w() {
        return this.offset.b();
    }

    public final T x() {
        return (T) this.targetValue.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T l(float offset, T currentValue, float velocity) {
        InterfaceC17920a0<T> interfaceC17920a0O = o();
        float fC = interfaceC17920a0O.c(currentValue);
        float fFloatValue = this.velocityThreshold.invoke().floatValue();
        if (fC != offset && !Float.isNaN(fC)) {
            if (fC < offset) {
                if (velocity >= fFloatValue) {
                    T tA = interfaceC17920a0O.a(offset, true);
                    Intrinsics.g(tA);
                    return tA;
                }
                T tA2 = interfaceC17920a0O.a(offset, true);
                Intrinsics.g(tA2);
                if (offset >= Math.abs(fC + Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(interfaceC17920a0O.c(tA2) - fC))).floatValue()))) {
                    return tA2;
                }
            } else {
                if (velocity <= (-fFloatValue)) {
                    T tA3 = interfaceC17920a0O.a(offset, false);
                    Intrinsics.g(tA3);
                    return tA3;
                }
                T tA4 = interfaceC17920a0O.a(offset, false);
                Intrinsics.g(tA4);
                float fAbs = Math.abs(fC - Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(fC - interfaceC17920a0O.c(tA4)))).floatValue()));
                if (offset >= 0.0f ? offset <= fAbs : Math.abs(offset) >= fAbs) {
                    return tA4;
                }
            }
        }
        return currentValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T m(float offset, T currentValue) {
        InterfaceC17920a0<T> interfaceC17920a0O = o();
        float fC = interfaceC17920a0O.c(currentValue);
        if (fC != offset && !Float.isNaN(fC)) {
            if (fC < offset) {
                T tA = interfaceC17920a0O.a(offset, true);
                if (tA != null) {
                    return tA;
                }
            } else {
                T tA2 = interfaceC17920a0O.a(offset, false);
                if (tA2 != null) {
                    return tA2;
                }
            }
        }
        return currentValue;
    }

    public final float A() {
        if (!Float.isNaN(w())) {
            return w();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
    }

    public final Object G(float f10, Continuation<? super Unit> continuation) {
        T tS = s();
        T tL = l(A(), tS, f10);
        if (this.confirmValueChange.invoke(tL).booleanValue()) {
            Object objF = androidx.compose.material.a.f(this, tL, f10, continuation);
            if (objF == IntrinsicsKt.f()) {
                return objF;
            }
            return Unit.f142422a;
        }
        Object objF2 = androidx.compose.material.a.f(this, tS, f10, continuation);
        if (objF2 == IntrinsicsKt.f()) {
            return objF2;
        }
        return Unit.f142422a;
    }

    public final void I(InterfaceC17920a0<T> newAnchors, T newTarget) {
        if (!Intrinsics.e(o(), newAnchors)) {
            B(newAnchors);
            if (!H(newTarget)) {
                D(newTarget);
            }
        }
    }

    public final float n(float delta) {
        float fW;
        float fZ = z(delta);
        if (Float.isNaN(w())) {
            fW = 0.0f;
        } else {
            fW = w();
        }
        F(fZ);
        return fZ - fW;
    }

    public final boolean y() {
        if (t() != null) {
            return true;
        }
        return false;
    }

    public final float z(float delta) {
        float fW;
        if (Float.isNaN(w())) {
            fW = 0.0f;
        } else {
            fW = w();
        }
        return RangesKt.n(fW + delta, o().e(), o().f());
    }

    public /* synthetic */ C17931e(Object obj, InterfaceC17920a0 interfaceC17920a0, Function1 function1, Function0 function0, InterfaceC6326i interfaceC6326i, Function1 function12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, interfaceC17920a0, function1, function0, interfaceC6326i, (i10 & 32) != 0 ? a.f167818f : function12);
    }

    public C17931e(T t10, InterfaceC17920a0<T> interfaceC17920a0, Function1<? super Float, Float> function1, Function0<Float> function0, InterfaceC6326i<Float> interfaceC6326i, Function1<? super T, Boolean> function12) {
        this(t10, function1, function0, interfaceC6326i, function12);
        B(interfaceC17920a0);
        H(t10);
    }
}
