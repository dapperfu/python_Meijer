package kotlin;

import androidx.compose.runtime.A0;
import androidx.compose.runtime.InterfaceC5866i0;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import java.util.Map;
import kotlin.C13928q;
import kotlin.C6439a;
import kotlin.C6441b;
import kotlin.C6456m;
import kotlin.Deprecated;
import kotlin.InterfaceC13925n;
import kotlin.InterfaceC13929r;
import kotlin.InterfaceC6452i;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import pv.C16563h;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 P*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001#BD\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012#\b\u0002\u0010\f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\u00102\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J8\u0010\u001b\u001a\u00020\u00102\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0016H\u0080@¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00028\u00002\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0087@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\"\u0010\u0012R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R5\u0010\f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R+\u00102\u001a\u00028\u00002\u0006\u0010+\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R+\u00108\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010-\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010>\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010;R\u0014\u0010@\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010;R\u001c\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010-RC\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00162\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00168@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010-\u001a\u0004\bC\u0010D\"\u0004\bE\u0010\u0019R&\u0010J\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00160G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\"\u0010O\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0011\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010R\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010\u0011\u001a\u0004\bP\u0010L\"\u0004\bQ\u0010NRO\u0010X\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050S2\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050S8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010-\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR+\u0010[\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010;\u001a\u0004\bY\u0010L\"\u0004\bZ\u0010NR/\u0010a\u001a\u0004\u0018\u00010\\2\b\u0010+\u001a\u0004\u0018\u00010\\8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010-\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001a\u0010f\u001a\u00020b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\bc\u0010eR\u0017\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00050g8F¢\u0006\u0006\u001a\u0004\bh\u0010i¨\u0006k"}, d2 = {"Lx0/w1;", "T", "", "initialValue", "Lc0/i;", "", "animationSpec", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "", "confirmStateChange", "<init>", "(Ljava/lang/Object;Lc0/i;Lkotlin/jvm/functions/Function1;)V", "target", "", "F", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "spec", "h", "(FLc0/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "newAnchors", "k", "(Ljava/util/Map;)V", "oldAnchors", "y", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "targetValue", "anim", "i", "(Ljava/lang/Object;Lc0/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "velocity", "x", "a", "Lc0/i;", "m", "()Lc0/i;", "b", "Lkotlin/jvm/functions/Function1;", "n", "()Lkotlin/jvm/functions/Function1;", "<set-?>", "c", "Landroidx/compose/runtime/l0;", "o", "()Ljava/lang/Object;", "B", "(Ljava/lang/Object;)V", "currentValue", "d", "w", "()Z", "A", "(Z)V", "isAnimationRunning", "Landroidx/compose/runtime/i0;", "e", "Landroidx/compose/runtime/i0;", "offsetState", "f", "overflowState", "g", "absoluteOffset", "Landroidx/compose/runtime/l0;", "animationTarget", "l", "()Ljava/util/Map;", "z", "anchors", "Lpv/f;", "j", "Lpv/f;", "latestNonEmptyAnchorsFlow", "r", "()F", "setMinBound$material_release", "(F)V", "minBound", "q", "setMaxBound$material_release", "maxBound", "Lkotlin/Function2;", "u", "()Lkotlin/jvm/functions/Function2;", "D", "(Lkotlin/jvm/functions/Function2;)V", "thresholds", "v", "E", "velocityThreshold", "Lx0/V0;", "t", "()Lx0/V0;", "C", "(Lx0/V0;)V", "resistance", "Lf0/r;", "p", "Lf0/r;", "()Lf0/r;", "draggableState", "Landroidx/compose/runtime/z1;", "s", "()Landroidx/compose/runtime/z1;", "offset", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
@SourceDebugExtension
/* loaded from: classes.dex */
public class w1<T> {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6452i<Float> animationSpec;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1<T, Boolean> confirmStateChange;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 currentValue;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 isAnimationRunning = t1.e(Boolean.FALSE, null, 2, null);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5866i0 offsetState = A0.a(0.0f);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5866i0 overflowState = A0.a(0.0f);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5866i0 absoluteOffset = A0.a(0.0f);

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Float> animationTarget = t1.e(null, null, 2, null);

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 anchors = t1.e(MapsKt.k(), null, 2, null);

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16561f<Map<Float, T>> latestNonEmptyAnchorsFlow = C16563h.Z(new i(o1.q(new e(this))), 1);

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private float minBound = Float.NEGATIVE_INFINITY;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float maxBound = Float.POSITIVE_INFINITY;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 thresholds = t1.e(j.f169942f, null, 2, null);

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5866i0 velocityThreshold = A0.a(0.0f);

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 resistance = t1.e(null, null, 2, null);

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13929r draggableState = C13928q.a(new d(this));

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\u0004*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lx0/w1$a;", "", "<init>", "()V", "T", "Lc0/i;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmStateChange", "LL0/k;", "Lx0/w1;", "a", "(Lc0/i;Lkotlin/jvm/functions/Function1;)LL0/k;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.w1$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "it", "Lx0/w1;", "a", "(Ljava/lang/Object;)Lx0/w1;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.w1$a$b */
        static final class b extends Lambda implements Function1<T, w1<T>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC6452i<Float> f169906f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function1<T, Boolean> f169907g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(InterfaceC6452i<Float> interfaceC6452i, Function1<? super T, Boolean> function1) {
                super(1);
                this.f169906f = interfaceC6452i;
                this.f169907g = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final w1<T> invoke(T t10) {
                return new w1<>(t10, this.f169906f, this.f169907g);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00018\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "LL0/m;", "Lx0/w1;", "it", "a", "(LL0/m;Lx0/w1;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.w1$a$a, reason: collision with other inner class name */
        static final class C2723a extends Lambda implements Function2<L0.m, w1<T>, T> {

            /* renamed from: f, reason: collision with root package name */
            public static final C2723a f169905f = new C2723a();

            C2723a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final T invoke(L0.m mVar, w1<T> w1Var) {
                return w1Var.o();
            }
        }

        private Companion() {
        }

        public final <T> L0.k<w1<T>, T> a(InterfaceC6452i<Float> animationSpec, Function1<? super T, Boolean> confirmStateChange) {
            return L0.l.a(C2723a.f169905f, new b(animationSpec, confirmStateChange));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lf0/n;", "", "<anonymous>", "(Lf0/n;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.SwipeableState$animateInternalToOffset$2", f = "Swipeable.kt", l = {217}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC13925n, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f169908a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f169909b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w1<T> f169910c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f169911d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6452i<Float> f169912e;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lc0/a;", "", "Lc0/m;", "", "a", "(Lc0/a;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends Lambda implements Function1<C6439a<Float, C6456m>, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC13925n f169913f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f169914g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC13925n interfaceC13925n, Ref.FloatRef floatRef) {
                super(1);
                this.f169913f = interfaceC13925n;
                this.f169914g = floatRef;
            }

            public final void a(C6439a<Float, C6456m> c6439a) {
                this.f169913f.a(c6439a.m().floatValue() - this.f169914g.f143739a);
                this.f169914g.f143739a = c6439a.m().floatValue();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C6439a<Float, C6456m> c6439a) {
                a(c6439a);
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(w1<T> w1Var, float f10, InterfaceC6452i<Float> interfaceC6452i, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f169910c = w1Var;
            this.f169911d = f10;
            this.f169912e = interfaceC6452i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f169910c, this.f169911d, this.f169912e, continuation);
            bVar.f169909b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13925n interfaceC13925n, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC13925n, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f169908a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC13925n interfaceC13925n = (InterfaceC13925n) this.f169909b;
                    Ref.FloatRef floatRef = new Ref.FloatRef();
                    floatRef.f143739a = ((w1) this.f169910c).absoluteOffset.b();
                    ((w1) this.f169910c).animationTarget.setValue(Boxing.c(this.f169911d));
                    this.f169910c.A(true);
                    C6439a c6439aB = C6441b.b(floatRef.f143739a, 0.0f, 2, null);
                    Float fC = Boxing.c(this.f169911d);
                    InterfaceC6452i<Float> interfaceC6452i = this.f169912e;
                    a aVar = new a(interfaceC13925n, floatRef);
                    this.f169908a = 1;
                    if (C6439a.f(c6439aB, fC, interfaceC6452i, null, aVar, this, 4, null) == objF) {
                        return objF;
                    }
                }
                ((w1) this.f169910c).animationTarget.setValue(null);
                this.f169910c.A(false);
                return Unit.f143329a;
            } catch (Throwable th2) {
                ((w1) this.f169910c).animationTarget.setValue(null);
                this.f169910c.A(false);
                throw th2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "", "anchors", "", "a", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class c<T> implements InterfaceC16562g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ T f169915a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w1<T> f169916b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6452i<Float> f169917c;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material.SwipeableState$animateTo$2", f = "Swipeable.kt", l = {327}, m = "emit")
        static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f169918a;

            /* renamed from: b, reason: collision with root package name */
            Object f169919b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f169920c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ c<T> f169921d;

            /* renamed from: e, reason: collision with root package name */
            int f169922e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(c<? super T> cVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f169921d = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f169920c = obj;
                this.f169922e |= Integer.MIN_VALUE;
                return this.f169921d.emit(null, this);
            }
        }

        c(T t10, w1<T> w1Var, InterfaceC6452i<Float> interfaceC6452i) {
            this.f169915a = t10;
            this.f169916b = w1Var;
            this.f169917c = interfaceC6452i;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // pv.InterfaceC16562g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.util.Map<java.lang.Float, ? extends T> r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 288
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: x0.w1.c.emit(java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "", "b", "(F)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends Lambda implements Function1<Float, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ w1<T> f169923f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(w1<T> w1Var) {
            super(1);
            this.f169923f = w1Var;
        }

        public final void b(float f10) {
            float fB = ((w1) this.f169923f).absoluteOffset.b() + f10;
            float fN = RangesKt.n(fB, this.f169923f.getMinBound(), this.f169923f.getMaxBound());
            float f11 = fB - fN;
            ResistanceConfig resistanceConfigT = this.f169923f.t();
            ((w1) this.f169923f).offsetState.A(fN + (resistanceConfigT != null ? resistanceConfigT.a(f11) : 0.0f));
            ((w1) this.f169923f).overflowState.A(f11);
            ((w1) this.f169923f).absoluteOffset.A(fB);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Float f10) {
            b(f10.floatValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "", "", "c", "()Ljava/util/Map;"}, k = 3, mv = {1, 9, 0})
    static final class e extends Lambda implements Function0<Map<Float, ? extends T>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ w1<T> f169924f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(w1<T> w1Var) {
            super(0);
            this.f169924f = w1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Map<Float, T> invoke() {
            return this.f169924f.l();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "", "anchors", "", "a", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    static final class f<T> implements InterfaceC16562g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w1<T> f169925a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f169926b;

        f(w1<T> w1Var, float f10) {
            this.f169925a = w1Var;
            this.f169926b = f10;
        }

        @Override // pv.InterfaceC16562g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(Map<Float, ? extends T> map, Continuation<? super Unit> continuation) {
            Float fE = v1.e(map, this.f169925a.o());
            Intrinsics.g(fE);
            float fFloatValue = fE.floatValue();
            T t10 = map.get(Boxing.c(v1.c(this.f169925a.s().getValue().floatValue(), fFloatValue, map.keySet(), this.f169925a.u(), this.f169926b, this.f169925a.v())));
            if (t10 != null && this.f169925a.n().invoke(t10).booleanValue()) {
                Object objJ = w1.j(this.f169925a, t10, null, continuation, 2, null);
                return objJ == IntrinsicsKt.f() ? objJ : Unit.f143329a;
            }
            w1<T> w1Var = this.f169925a;
            Object objH = w1Var.h(fFloatValue, w1Var.m(), continuation);
            return objH == IntrinsicsKt.f() ? objH : Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.SwipeableState", f = "Swipeable.kt", l = {154, 179, 182}, m = "processNewAnchors$material_release")
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f169927a;

        /* renamed from: b, reason: collision with root package name */
        Object f169928b;

        /* renamed from: c, reason: collision with root package name */
        float f169929c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f169930d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ w1<T> f169931e;

        /* renamed from: f, reason: collision with root package name */
        int f169932f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(w1<T> w1Var, Continuation<? super g> continuation) {
            super(continuation);
            this.f169931e = w1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f169930d = obj;
            this.f169932f |= Integer.MIN_VALUE;
            return this.f169931e.y(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lf0/n;", "", "<anonymous>", "(Lf0/n;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.SwipeableState$snapInternalToOffset$2", f = "Swipeable.kt", l = {}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC13925n, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f169933a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f169934b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f169935c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w1<T> f169936d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(float f10, w1<T> w1Var, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f169935c = f10;
            this.f169936d = w1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            h hVar = new h(this.f169935c, this.f169936d, continuation);
            hVar.f169934b = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13925n interfaceC13925n, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC13925n, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f169933a == 0) {
                ResultKt.b(obj);
                ((InterfaceC13925n) this.f169934b).a(this.f169935c - ((w1) this.f169936d).absoluteOffset.b());
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class i implements InterfaceC16561f<Map<Float, ? extends T>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f169937a;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        public static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f169938a;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material.SwipeableState$special$$inlined$filter$1$2", f = "Swipeable.kt", l = {223}, m = "emit")
            /* renamed from: x0.w1$i$a$a, reason: collision with other inner class name */
            public static final class C2724a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f169939a;

                /* renamed from: b, reason: collision with root package name */
                int f169940b;

                public C2724a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f169939a = obj;
                    this.f169940b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC16562g interfaceC16562g) {
                this.f169938a = interfaceC16562g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof x0.w1.i.a.C2724a
                    if (r0 == 0) goto L13
                    r0 = r6
                    x0.w1$i$a$a r0 = (x0.w1.i.a.C2724a) r0
                    int r1 = r0.f169940b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f169940b = r1
                    goto L18
                L13:
                    x0.w1$i$a$a r0 = new x0.w1$i$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f169939a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f169940b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.ResultKt.b(r6)
                    goto L48
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.ResultKt.b(r6)
                    pv.g r6 = r4.f169938a
                    r2 = r5
                    java.util.Map r2 = (java.util.Map) r2
                    boolean r2 = r2.isEmpty()
                    if (r2 != 0) goto L48
                    r0.f169940b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L48
                    return r1
                L48:
                    kotlin.Unit r5 = kotlin.Unit.f143329a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: x0.w1.i.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public i(InterfaceC16561f interfaceC16561f) {
            this.f169937a = interfaceC16561f;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f169937a.collect(new a(interfaceC16562g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "<anonymous parameter 0>", "<anonymous parameter 1>", "a", "(FF)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    static final class j extends Lambda implements Function2<Float, Float, Float> {

        /* renamed from: f, reason: collision with root package name */
        public static final j f169942f = new j();

        j() {
            super(2);
        }

        public final Float a(float f10, float f11) {
            return Float.valueOf(0.0f);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Float invoke(Float f10, Float f11) {
            return a(f10.floatValue(), f11.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(boolean z10) {
        this.isAnimationRunning.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(T t10) {
        this.currentValue.setValue(t10);
    }

    private final Object F(float f10, Continuation<? super Unit> continuation) {
        Object objB = InterfaceC13929r.b(this.draggableState, null, new h(f10, this, null), continuation, 1, null);
        return objB == IntrinsicsKt.f() ? objB : Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(float f10, InterfaceC6452i<Float> interfaceC6452i, Continuation<? super Unit> continuation) {
        Object objB = InterfaceC13929r.b(this.draggableState, null, new b(this, f10, interfaceC6452i, null), continuation, 1, null);
        return objB == IntrinsicsKt.f() ? objB : Unit.f143329a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object j(w1 w1Var, Object obj, InterfaceC6452i interfaceC6452i, Continuation continuation, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
        }
        if ((i10 & 2) != 0) {
            interfaceC6452i = w1Var.animationSpec;
        }
        return w1Var.i(obj, interfaceC6452i, continuation);
    }

    public final void C(ResistanceConfig resistanceConfig) {
        this.resistance.setValue(resistanceConfig);
    }

    public final void D(Function2<? super Float, ? super Float, Float> function2) {
        this.thresholds.setValue(function2);
    }

    public final void E(float f10) {
        this.velocityThreshold.A(f10);
    }

    public final Object i(T t10, InterfaceC6452i<Float> interfaceC6452i, Continuation<? super Unit> continuation) {
        Object objCollect = this.latestNonEmptyAnchorsFlow.collect(new c(t10, this, interfaceC6452i), continuation);
        return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
    }

    public final Map<Float, T> l() {
        return (Map) this.anchors.getValue();
    }

    public final InterfaceC6452i<Float> m() {
        return this.animationSpec;
    }

    public final Function1<T, Boolean> n() {
        return this.confirmStateChange;
    }

    public final T o() {
        return this.currentValue.getValue();
    }

    /* renamed from: p, reason: from getter */
    public final InterfaceC13929r getDraggableState() {
        return this.draggableState;
    }

    /* renamed from: q, reason: from getter */
    public final float getMaxBound() {
        return this.maxBound;
    }

    /* renamed from: r, reason: from getter */
    public final float getMinBound() {
        return this.minBound;
    }

    public final z1<Float> s() {
        return this.offsetState;
    }

    public final ResistanceConfig t() {
        return (ResistanceConfig) this.resistance.getValue();
    }

    public final Function2<Float, Float, Float> u() {
        return (Function2) this.thresholds.getValue();
    }

    public final float v() {
        return this.velocityThreshold.b();
    }

    public final boolean w() {
        return ((Boolean) this.isAnimationRunning.getValue()).booleanValue();
    }

    public final Object x(float f10, Continuation<? super Unit> continuation) {
        Object objCollect = this.latestNonEmptyAnchorsFlow.collect(new f(this, f10), continuation);
        return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final java.lang.Object y(java.util.Map<java.lang.Float, ? extends T> r10, java.util.Map<java.lang.Float, ? extends T> r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.w1.y(java.util.Map, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void z(Map<Float, ? extends T> map) {
        this.anchors.setValue(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w1(T t10, InterfaceC6452i<Float> interfaceC6452i, Function1<? super T, Boolean> function1) {
        this.animationSpec = interfaceC6452i;
        this.confirmStateChange = function1;
        this.currentValue = t1.e(t10, null, 2, null);
    }

    public final void k(Map<Float, ? extends T> newAnchors) {
        if (l().isEmpty()) {
            Float fE = v1.e(newAnchors, o());
            if (fE != null) {
                this.offsetState.A(fE.floatValue());
                this.absoluteOffset.A(fE.floatValue());
                return;
            }
            throw new IllegalArgumentException("The initial value must have an associated anchor.");
        }
    }
}
