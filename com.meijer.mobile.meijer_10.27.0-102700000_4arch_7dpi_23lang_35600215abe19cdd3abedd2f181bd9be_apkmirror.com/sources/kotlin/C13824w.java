package kotlin;

import H1.y;
import androidx.compose.runtime.C5712d0;
import com.google.android.gms.common.api.a;
import d0.EnumC13431E;
import f1.C13832e;
import g1.C14185q;
import g1.C14187t;
import g1.EnumC14186s;
import g1.PointerInputChange;
import java.util.List;
import kotlin.AnimationState;
import kotlin.C6292E;
import kotlin.C6325h;
import kotlin.C6327j;
import kotlin.C6330m;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.i0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import qv.C0;
import qv.C16623P;
import qv.C16648k;
import qv.E0;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001OBR\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00121\u0010\r\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\f*\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u0018\u001a\u00020\f*\u00020\u00022'\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0002\b\u0016H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u0004\u0018\u00010!*\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b\"\u0010#J\u001a\u0010$\u001a\u00020!*\b\u0012\u0004\u0012\u00020!0 H\u0082@¢\u0006\u0004\b$\u0010%J+\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)\"\u0004\b\u0000\u0010&2\u000e\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000'H\u0002¢\u0006\u0004\b*\u0010+J\u001e\u0010.\u001a\u00020\u001d*\u00020\u00022\u0006\u0010-\u001a\u00020,H\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\f2\u0006\u0010-\u001a\u00020!H\u0002¢\u0006\u0004\b0\u00101J,\u00105\u001a\u00020\f*\u00020\u00022\u0006\u0010-\u001a\u00020!2\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u000202H\u0082@¢\u0006\u0004\b5\u00106J[\u0010@\u001a\u00020\f*\u00020\u00152\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000208072\u0006\u0010:\u001a\u0002022\u0006\u0010<\u001a\u00020;2!\u0010?\u001a\u001d\u0012\u0013\u0012\u001102¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(>\u0012\u0004\u0012\u00020\u001d0=H\u0082@¢\u0006\u0004\b@\u0010AJ\u001b\u0010C\u001a\u000202*\u00020\u00152\u0006\u0010B\u001a\u000202H\u0002¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bE\u0010FJ(\u0010I\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010H\u001a\u00020G2\u0006\u0010\u001c\u001a\u00020\u001bø\u0001\u0000¢\u0006\u0004\bI\u0010JJ\u0015\u0010M\u001a\u00020\f2\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bM\u0010NR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR?\u0010\r\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010\\\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010`\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006e"}, d2 = {"Lf0/w;", "", "Lf0/K;", "scrollingLogic", "Lf0/C;", "mouseWheelScrollConfig", "Lkotlin/Function2;", "LH1/y;", "Lkotlin/ParameterName;", "name", "velocity", "Lkotlin/coroutines/Continuation;", "", "onScrollStopped", "LH1/d;", "density", "<init>", "(Lf0/K;Lf0/C;Lkotlin/jvm/functions/Function2;LH1/d;)V", "Lg1/q;", "p", "(Lg1/q;)V", "Lf0/y;", "Lkotlin/ExtensionFunctionType;", "block", "A", "(Lf0/K;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pointerEvent", "LH1/r;", "bounds", "", "t", "(Lg1/q;J)Z", "Lsv/g;", "Lf0/w$a;", "w", "(Lsv/g;)Lf0/w$a;", "n", "(Lsv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "E", "Lkotlin/Function0;", "builderAction", "Lkotlin/sequences/Sequence;", "y", "(Lkotlin/jvm/functions/Function0;)Lkotlin/sequences/Sequence;", "LU0/f;", "scrollDelta", "o", "(Lf0/K;J)Z", "x", "(Lf0/w$a;)V", "", "threshold", "speed", "r", "(Lf0/K;Lf0/w$a;FFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lc0/k;", "Lc0/m;", "animationState", "targetValue", "", "durationMillis", "Lkotlin/Function1;", "lastValue", "shouldCancelAnimation", "m", "(Lf0/y;Lc0/k;FILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "q", "(Lf0/y;F)F", "z", "(LH1/d;)V", "Lg1/s;", "pass", "u", "(Lg1/q;Lg1/s;J)V", "Lqv/O;", "coroutineScope", "v", "(Lqv/O;)V", "a", "Lf0/K;", "b", "Lf0/C;", "c", "Lkotlin/jvm/functions/Function2;", "d", "LH1/d;", "e", "Lsv/g;", "channel", "f", "Z", "isScrolling", "Lqv/C0;", "g", "Lqv/C0;", "receivingMouseWheelEventsJob", "Lf0/x;", "h", "Lf0/x;", "velocityTracker", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: f0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13824w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C13793K scrollingLogic;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13785C mouseWheelScrollConfig;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function2<y, Continuation<? super Unit>, Object> onScrollStopped;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private H1.d density;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isScrolling;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private C0 receivingMouseWheelEventsJob;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final sv.g<MouseWheelScrollDelta> channel = sv.j.b(a.e.API_PRIORITY_OTHER, null, null, 6, null);

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C13825x velocityTracker = new C13825x();

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Lf0/w$a;", "", "LU0/f;", "value", "", "timeMillis", "", "shouldApplyImmediately", "<init>", "(JJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "f", "(Lf0/w$a;)Lf0/w$a;", "a", "(JJZ)Lf0/w$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "J", "e", "()J", "b", "d", "c", "Z", "()Z", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f0.w$a, reason: from toString */
    private static final /* data */ class MouseWheelScrollDelta {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final long value;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long timeMillis;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldApplyImmediately;

        public /* synthetic */ MouseWheelScrollDelta(long j10, long j11, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, j11, z10);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MouseWheelScrollDelta)) {
                return false;
            }
            MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollDelta) other;
            return U0.f.j(this.value, mouseWheelScrollDelta.value) && this.timeMillis == mouseWheelScrollDelta.timeMillis && this.shouldApplyImmediately == mouseWheelScrollDelta.shouldApplyImmediately;
        }

        private MouseWheelScrollDelta(long j10, long j11, boolean z10) {
            this.value = j10;
            this.timeMillis = j11;
            this.shouldApplyImmediately = z10;
        }

        public static /* synthetic */ MouseWheelScrollDelta b(MouseWheelScrollDelta mouseWheelScrollDelta, long j10, long j11, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = mouseWheelScrollDelta.value;
            }
            long j12 = j10;
            if ((i10 & 2) != 0) {
                j11 = mouseWheelScrollDelta.timeMillis;
            }
            long j13 = j11;
            if ((i10 & 4) != 0) {
                z10 = mouseWheelScrollDelta.shouldApplyImmediately;
            }
            return mouseWheelScrollDelta.a(j12, j13, z10);
        }

        public final MouseWheelScrollDelta a(long value, long timeMillis, boolean shouldApplyImmediately) {
            return new MouseWheelScrollDelta(value, timeMillis, shouldApplyImmediately, null);
        }

        /* renamed from: c, reason: from getter */
        public final boolean getShouldApplyImmediately() {
            return this.shouldApplyImmediately;
        }

        /* renamed from: d, reason: from getter */
        public final long getTimeMillis() {
            return this.timeMillis;
        }

        /* renamed from: e, reason: from getter */
        public final long getValue() {
            return this.value;
        }

        public final MouseWheelScrollDelta f(MouseWheelScrollDelta other) {
            return new MouseWheelScrollDelta(U0.f.q(this.value, other.value), Math.max(this.timeMillis, other.timeMillis), this.shouldApplyImmediately, null);
        }

        public int hashCode() {
            return (((U0.f.o(this.value) * 31) + Long.hashCode(this.timeMillis)) * 31) + Boolean.hashCode(this.shouldApplyImmediately);
        }

        public String toString() {
            return "MouseWheelScrollDelta(value=" + ((Object) U0.f.s(this.value)) + ", timeMillis=" + this.timeMillis + ", shouldApplyImmediately=" + this.shouldApplyImmediately + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/h;", "", "Lc0/m;", "", "a", "(Lc0/h;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f0.w$b */
    static final class b extends Lambda implements Function1<C6325h<Float, C6330m>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f130525f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C13824w f130526g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC13826y f130527h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<Float, Boolean> f130528i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Ref.FloatRef floatRef, C13824w c13824w, InterfaceC13826y interfaceC13826y, Function1<? super Float, Boolean> function1) {
            super(1);
            this.f130525f = floatRef;
            this.f130526g = c13824w;
            this.f130527h = interfaceC13826y;
            this.f130528i = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C6325h<Float, C6330m> c6325h) {
            a(c6325h);
            return Unit.f142422a;
        }

        public final void a(C6325h<Float, C6330m> c6325h) {
            float fFloatValue = c6325h.e().floatValue() - this.f130525f.f142832a;
            if (!C13823v.d(fFloatValue)) {
                if (!C13823v.d(fFloatValue - this.f130526g.q(this.f130527h, fFloatValue))) {
                    c6325h.a();
                    return;
                } else {
                    this.f130525f.f142832a += fFloatValue;
                }
            }
            if (this.f130528i.invoke(Float.valueOf(this.f130525f.f142832a)).booleanValue()) {
                c6325h.a();
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lf0/w$a;", "<anonymous>", "(Lqv/O;)Lf0/w$a;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2", f = "MouseWheelScrollable.kt", l = {170}, m = "invokeSuspend")
    /* renamed from: f0.w$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super MouseWheelScrollDelta>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f130529a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f130530b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ sv.g<MouseWheelScrollDelta> f130531c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2$job$1", f = "MouseWheelScrollable.kt", l = {166}, m = "invokeSuspend")
        /* renamed from: f0.w$c$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f130532a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f130533b;

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: f0.w$c$a$a, reason: collision with other inner class name */
            static final class C2074a extends Lambda implements Function1<Long, Unit> {

                /* renamed from: f, reason: collision with root package name */
                public static final C2074a f130534f = new C2074a();

                C2074a() {
                    super(1);
                }

                public final void a(long j10) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
                    a(l10.longValue());
                    return Unit.f142422a;
                }
            }

            a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(continuation);
                aVar.f130533b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                InterfaceC16622O interfaceC16622O;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f130532a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        interfaceC16622O = (InterfaceC16622O) this.f130533b;
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    interfaceC16622O = (InterfaceC16622O) this.f130533b;
                }
                while (E0.n(interfaceC16622O.getCoroutineContext())) {
                    C2074a c2074a = C2074a.f130534f;
                    this.f130533b = interfaceC16622O;
                    this.f130532a = 1;
                    if (C5712d0.c(c2074a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(sv.g<MouseWheelScrollDelta> gVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f130531c = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.f130531c, continuation);
            cVar.f130530b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super MouseWheelScrollDelta> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [qv.C0] */
        /* JADX WARN: Type inference failed for: r1v3, types: [qv.C0] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            ?? r12 = this.f130529a;
            try {
                if (r12 != 0) {
                    if (r12 == 1) {
                        C0 c02 = (C0) this.f130530b;
                        ResultKt.b(obj);
                        r12 = c02;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C0 c0D = C16648k.d((InterfaceC16622O) this.f130530b, null, null, new a(null), 3, null);
                    sv.g<MouseWheelScrollDelta> gVar = this.f130531c;
                    this.f130530b = c0D;
                    this.f130529a = 1;
                    obj = gVar.e(this);
                    r12 = c0D;
                    if (obj == objF) {
                        return objF;
                    }
                }
                MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollDelta) obj;
                C0.a.a(r12, null, 1, null);
                return mouseWheelScrollDelta;
            } catch (Throwable th2) {
                C0.a.a(r12, null, 1, null);
                throw th2;
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", l = {244, 295}, m = "dispatchMouseWheelScroll")
    /* renamed from: f0.w$d */
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f130535a;

        /* renamed from: b, reason: collision with root package name */
        Object f130536b;

        /* renamed from: c, reason: collision with root package name */
        Object f130537c;

        /* renamed from: d, reason: collision with root package name */
        float f130538d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f130539e;

        /* renamed from: g, reason: collision with root package name */
        int f130541g;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f130539e = obj;
            this.f130541g |= Integer.MIN_VALUE;
            return C13824w.this.r(null, null, 0.0f, 0.0f, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf0/y;", "", "<anonymous>", "(Lf0/y;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3", f = "MouseWheelScrollable.kt", l = {253, 266, 283}, m = "invokeSuspend")
    /* renamed from: f0.w$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC13826y, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f130542a;

        /* renamed from: b, reason: collision with root package name */
        Object f130543b;

        /* renamed from: c, reason: collision with root package name */
        int f130544c;

        /* renamed from: d, reason: collision with root package name */
        int f130545d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f130546e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f130547f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<AnimationState<Float, C6330m>> f130548g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<MouseWheelScrollDelta> f130549h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f130550i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C13824w f130551j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f130552k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ C13793K f130553l;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "lastValue", "", "b", "(F)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: f0.w$e$a */
        static final class a extends Lambda implements Function1<Float, Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C13824w f130554f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<MouseWheelScrollDelta> f130555g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f130556h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ C13793K f130557i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Ref.BooleanRef f130558j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C13824w c13824w, Ref.ObjectRef<MouseWheelScrollDelta> objectRef, Ref.FloatRef floatRef, C13793K c13793k, Ref.BooleanRef booleanRef) {
                super(1);
                this.f130554f = c13824w;
                this.f130555g = objectRef;
                this.f130556h = floatRef;
                this.f130557i = c13793k;
                this.f130558j = booleanRef;
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [T, f0.w$a] */
            public final Boolean b(float f10) {
                C13824w c13824w = this.f130554f;
                MouseWheelScrollDelta mouseWheelScrollDeltaW = c13824w.w(c13824w.channel);
                if (mouseWheelScrollDeltaW != null) {
                    this.f130554f.x(mouseWheelScrollDeltaW);
                    Ref.ObjectRef<MouseWheelScrollDelta> objectRef = this.f130555g;
                    objectRef.f142835a = objectRef.f142835a.f(mouseWheelScrollDeltaW);
                    Ref.FloatRef floatRef = this.f130556h;
                    C13793K c13793k = this.f130557i;
                    floatRef.f142832a = c13793k.F(c13793k.y(this.f130555g.f142835a.getValue()));
                    this.f130558j.f142828a = !C13823v.d(this.f130556h.f142832a - f10);
                }
                return Boolean.valueOf(mouseWheelScrollDeltaW != null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Float f10) {
                return b(f10.floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Ref.FloatRef floatRef, Ref.ObjectRef<AnimationState<Float, C6330m>> objectRef, Ref.ObjectRef<MouseWheelScrollDelta> objectRef2, float f10, C13824w c13824w, float f11, C13793K c13793k, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f130547f = floatRef;
            this.f130548g = objectRef;
            this.f130549h = objectRef2;
            this.f130550i = f10;
            this.f130551j = c13824w;
            this.f130552k = f11;
            this.f130553l = c13793k;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(this.f130547f, this.f130548g, this.f130549h, this.f130550i, this.f130551j, this.f130552k, this.f130553l, continuation);
            eVar.f130546e = obj;
            return eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x018e  */
        /* JADX WARN: Type inference failed for: r2v12, types: [T, c0.k] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x014f -> B:30:0x0151). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x015d -> B:13:0x0067). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 401
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C13824w.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13826y interfaceC13826y, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC13826y, continuation)).invokeSuspend(Unit.f142422a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", l = {227}, m = "dispatchMouseWheelScroll$waitNextScrollDelta")
    /* renamed from: f0.w$f */
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f130559a;

        /* renamed from: b, reason: collision with root package name */
        Object f130560b;

        /* renamed from: c, reason: collision with root package name */
        Object f130561c;

        /* renamed from: d, reason: collision with root package name */
        Object f130562d;

        /* renamed from: e, reason: collision with root package name */
        Object f130563e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f130564f;

        /* renamed from: g, reason: collision with root package name */
        int f130565g;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f130564f = obj;
            this.f130565g |= Integer.MIN_VALUE;
            return C13824w.s(null, null, null, null, null, 0L, this);
        }

        f(Continuation<? super f> continuation) {
            super(continuation);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lf0/w$a;", "<anonymous>", "(Lqv/O;)Lf0/w$a;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2", f = "MouseWheelScrollable.kt", l = {227}, m = "invokeSuspend")
    /* renamed from: f0.w$g */
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super MouseWheelScrollDelta>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f130566a;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C13824w.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super MouseWheelScrollDelta> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f130566a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            C13824w c13824w = C13824w.this;
            sv.g gVar = c13824w.channel;
            this.f130566a = 1;
            Object objN = c13824w.n(gVar, this);
            if (objN == objF) {
                return objF;
            }
            return objN;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1", f = "MouseWheelScrollable.kt", l = {107, 110}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: f0.w$h */
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f130568a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f130569b;

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            h hVar = C13824w.this.new h(continuation);
            hVar.f130569b = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r12.f130568a
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L26
                if (r1 != r3) goto L1e
                java.lang.Object r1 = r12.f130569b
                qv.O r1 = (qv.InterfaceC16622O) r1
                kotlin.ResultKt.b(r13)     // Catch: java.lang.Throwable -> L19
                r10 = r12
            L17:
                r13 = r1
                goto L35
            L19:
                r0 = move-exception
                r13 = r0
                r10 = r12
                goto L94
            L1e:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L26:
                java.lang.Object r1 = r12.f130569b
                qv.O r1 = (qv.InterfaceC16622O) r1
                kotlin.ResultKt.b(r13)     // Catch: java.lang.Throwable -> L19
                goto L54
            L2e:
                kotlin.ResultKt.b(r13)
                java.lang.Object r13 = r12.f130569b
                qv.O r13 = (qv.InterfaceC16622O) r13
            L35:
                kotlin.coroutines.CoroutineContext r1 = r13.getCoroutineContext()     // Catch: java.lang.Throwable -> L88
                boolean r1 = qv.E0.n(r1)     // Catch: java.lang.Throwable -> L88
                if (r1 == 0) goto L8b
                f0.w r1 = kotlin.C13824w.this     // Catch: java.lang.Throwable -> L88
                sv.g r1 = kotlin.C13824w.f(r1)     // Catch: java.lang.Throwable -> L88
                r12.f130569b = r13     // Catch: java.lang.Throwable -> L88
                r12.f130568a = r4     // Catch: java.lang.Throwable -> L88
                java.lang.Object r1 = r1.e(r12)     // Catch: java.lang.Throwable -> L88
                if (r1 != r0) goto L51
                r10 = r12
                goto L84
            L51:
                r11 = r1
                r1 = r13
                r13 = r11
            L54:
                r7 = r13
                f0.w$a r7 = (kotlin.C13824w.MouseWheelScrollDelta) r7     // Catch: java.lang.Throwable -> L88
                f0.w r13 = kotlin.C13824w.this     // Catch: java.lang.Throwable -> L88
                H1.d r13 = kotlin.C13824w.g(r13)     // Catch: java.lang.Throwable -> L88
                float r5 = kotlin.C13823v.b()     // Catch: java.lang.Throwable -> L88
                float r8 = r13.I1(r5)     // Catch: java.lang.Throwable -> L88
                f0.w r13 = kotlin.C13824w.this     // Catch: java.lang.Throwable -> L88
                H1.d r13 = kotlin.C13824w.g(r13)     // Catch: java.lang.Throwable -> L88
                float r5 = kotlin.C13823v.a()     // Catch: java.lang.Throwable -> L88
                float r9 = r13.I1(r5)     // Catch: java.lang.Throwable -> L88
                f0.w r5 = kotlin.C13824w.this     // Catch: java.lang.Throwable -> L88
                f0.K r6 = kotlin.C13824w.h(r5)     // Catch: java.lang.Throwable -> L88
                r12.f130569b = r1     // Catch: java.lang.Throwable -> L88
                r12.f130568a = r3     // Catch: java.lang.Throwable -> L88
                r10 = r12
                java.lang.Object r13 = kotlin.C13824w.d(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L85
                if (r13 != r0) goto L17
            L84:
                return r0
            L85:
                r0 = move-exception
            L86:
                r13 = r0
                goto L94
            L88:
                r0 = move-exception
                r10 = r12
                goto L86
            L8b:
                r10 = r12
                f0.w r13 = kotlin.C13824w.this
                kotlin.C13824w.i(r13, r2)
                kotlin.Unit r13 = kotlin.Unit.f142422a
                return r13
            L94:
                f0.w r0 = kotlin.C13824w.this
                kotlin.C13824w.i(r0, r2)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C13824w.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lf0/w$a;", "c", "()Lf0/w$a;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f0.w$i */
    static final class i extends Lambda implements Function0<MouseWheelScrollDelta> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ sv.g<MouseWheelScrollDelta> f130571f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(sv.g<MouseWheelScrollDelta> gVar) {
            super(0);
            this.f130571f = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final MouseWheelScrollDelta invoke() {
            return (MouseWheelScrollDelta) sv.k.f(this.f130571f.n());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1", f = "MouseWheelScrollable.kt", l = {179}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: f0.w$j */
    static final class j<E> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super E>, Continuation<? super Unit>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f130572b;

        /* renamed from: c, reason: collision with root package name */
        int f130573c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f130574d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<E> f130575e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(Function0<? extends E> function0, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f130575e = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            j jVar = new j(this.f130575e, continuation);
            jVar.f130574d = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SequenceScope<? super E> sequenceScope, Continuation<? super Unit> continuation) {
            return ((j) create(sequenceScope, continuation)).invokeSuspend(Unit.f142422a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0037 -> B:15:0x003b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003a -> B:15:0x003b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r4.f130573c
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r1 = r4.f130572b
                java.lang.Object r3 = r4.f130574d
                kotlin.sequences.SequenceScope r3 = (kotlin.sequences.SequenceScope) r3
                kotlin.ResultKt.b(r5)
                goto L3b
            L15:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1d:
                kotlin.ResultKt.b(r5)
                java.lang.Object r5 = r4.f130574d
                kotlin.sequences.SequenceScope r5 = (kotlin.sequences.SequenceScope) r5
                r3 = r5
            L25:
                kotlin.jvm.functions.Function0<E> r5 = r4.f130575e
                java.lang.Object r1 = r5.invoke()
                if (r1 == 0) goto L3a
                r4.f130574d = r3
                r4.f130572b = r1
                r4.f130573c = r2
                java.lang.Object r5 = r3.c(r1, r4)
                if (r5 != r0) goto L3b
                return r0
            L3a:
                r1 = 0
            L3b:
                if (r1 != 0) goto L25
                kotlin.Unit r5 = kotlin.Unit.f142422a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C13824w.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", l = {122}, m = "userScroll")
    /* renamed from: f0.w$k */
    static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f130576a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f130577b;

        /* renamed from: d, reason: collision with root package name */
        int f130579d;

        k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f130577b = obj;
            this.f130579d |= Integer.MIN_VALUE;
            return C13824w.this.A(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2", f = "MouseWheelScrollable.kt", l = {122}, m = "invokeSuspend")
    /* renamed from: f0.w$l */
    static final class l extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f130580a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C13793K f130581b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC13826y, Continuation<? super Unit>, Object> f130582c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(C13793K c13793k, Function2<? super InterfaceC13826y, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f130581b = c13793k;
            this.f130582c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new l(this.f130581b, this.f130582c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f130580a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C13793K c13793k = this.f130581b;
                EnumC13431E enumC13431E = EnumC13431E.f126846b;
                Function2<InterfaceC13826y, Continuation<? super Unit>, Object> function2 = this.f130582c;
                this.f130580a = 1;
                if (c13793k.z(enumC13431E, function2, this) == objF) {
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
    public final java.lang.Object A(kotlin.C13793K r5, kotlin.jvm.functions.Function2<? super kotlin.InterfaceC13826y, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof kotlin.C13824w.k
            if (r0 == 0) goto L13
            r0 = r7
            f0.w$k r0 = (kotlin.C13824w.k) r0
            int r1 = r0.f130579d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f130579d = r1
            goto L18
        L13:
            f0.w$k r0 = new f0.w$k
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f130577b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f130579d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f130576a
            f0.w r5 = (kotlin.C13824w) r5
            kotlin.ResultKt.b(r7)
            goto L4c
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.b(r7)
            r4.isScrolling = r3
            f0.w$l r7 = new f0.w$l
            r2 = 0
            r7.<init>(r5, r6, r2)
            r0.f130576a = r4
            r0.f130579d = r3
            java.lang.Object r5 = qv.X0.c(r7, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            r5 = r4
        L4c:
            r6 = 0
            r5.isScrolling = r6
            kotlin.Unit r5 = kotlin.Unit.f142422a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C13824w.A(f0.K, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(InterfaceC13826y interfaceC13826y, AnimationState<Float, C6330m> animationState, float f10, int i10, Function1<? super Float, Boolean> function1, Continuation<? super Unit> continuation) {
        Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.f142832a = animationState.getValue().floatValue();
        Object objI = i0.i(animationState, Boxing.c(f10), C6327j.l(i10, 0, C6292E.d(), 2, null), true, new b(floatRef, this, interfaceC13826y, function1), continuation);
        return objI == IntrinsicsKt.f() ? objI : Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object n(sv.g<MouseWheelScrollDelta> gVar, Continuation<? super MouseWheelScrollDelta> continuation) {
        return C16623P.g(new c(gVar, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float q(InterfaceC13826y interfaceC13826y, float f10) {
        C13793K c13793k = this.scrollingLogic;
        return c13793k.F(c13793k.y(interfaceC13826y.b(c13793k.G(c13793k.x(f10)), C13832e.INSTANCE.d())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0110, code lost:
    
        if (r0.invoke(r1, r9) == r10) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, f0.w$a] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, c0.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(kotlin.C13793K r23, kotlin.C13824w.MouseWheelScrollDelta r24, float r25, float r26, kotlin.coroutines.Continuation<? super kotlin.Unit> r27) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C13824w.r(f0.K, f0.w$a, float, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, f0.w$a] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, c0.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(kotlin.C13824w r21, kotlin.jvm.internal.Ref.ObjectRef<kotlin.C13824w.MouseWheelScrollDelta> r22, kotlin.jvm.internal.Ref.FloatRef r23, kotlin.C13793K r24, kotlin.jvm.internal.Ref.ObjectRef<kotlin.AnimationState<java.lang.Float, kotlin.C6330m>> r25, long r26, kotlin.coroutines.Continuation<? super java.lang.Boolean> r28) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C13824w.s(f0.w, kotlin.jvm.internal.Ref$ObjectRef, kotlin.jvm.internal.Ref$FloatRef, f0.K, kotlin.jvm.internal.Ref$ObjectRef, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final boolean t(C14185q pointerEvent, long bounds) {
        long jB = this.mouseWheelScrollConfig.b(this.density, pointerEvent, bounds);
        if (o(this.scrollingLogic, jB)) {
            return sv.k.i(this.channel.k(new MouseWheelScrollDelta(jB, ((PointerInputChange) CollectionsKt.s0(pointerEvent.c())).getUptimeMillis(), !this.mouseWheelScrollConfig.a() || this.mouseWheelScrollConfig.c(pointerEvent), null)));
        }
        return this.isScrolling;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MouseWheelScrollDelta w(sv.g<MouseWheelScrollDelta> gVar) {
        MouseWheelScrollDelta mouseWheelScrollDeltaF = null;
        for (MouseWheelScrollDelta mouseWheelScrollDelta : y(new i(gVar))) {
            mouseWheelScrollDeltaF = mouseWheelScrollDeltaF == null ? mouseWheelScrollDelta : mouseWheelScrollDeltaF.f(mouseWheelScrollDelta);
        }
        return mouseWheelScrollDeltaF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(MouseWheelScrollDelta scrollDelta) {
        this.velocityTracker.a(scrollDelta.getTimeMillis(), scrollDelta.getValue());
    }

    private final <E> Sequence<E> y(Function0<? extends E> builderAction) {
        return SequencesKt.b(new j(builderAction, null));
    }

    public final void u(C14185q pointerEvent, EnumC14186s pass, long bounds) {
        if (pass == EnumC14186s.f132679b && C14187t.i(pointerEvent.getType(), C14187t.INSTANCE.f())) {
            List<PointerInputChange> listC = pointerEvent.c();
            int size = listC.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (listC.get(i10).p()) {
                    return;
                }
            }
            if (t(pointerEvent, bounds)) {
                p(pointerEvent);
            }
        }
    }

    public final void v(InterfaceC16622O coroutineScope) {
        if (this.receivingMouseWheelEventsJob == null) {
            this.receivingMouseWheelEventsJob = C16648k.d(coroutineScope, null, null, new h(null), 3, null);
        }
    }

    public final void z(H1.d density) {
        this.density = density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13824w(C13793K c13793k, InterfaceC13785C interfaceC13785C, Function2<? super y, ? super Continuation<? super Unit>, ? extends Object> function2, H1.d dVar) {
        this.scrollingLogic = c13793k;
        this.mouseWheelScrollConfig = interfaceC13785C;
        this.onScrollStopped = function2;
        this.density = dVar;
    }

    private final boolean o(C13793K c13793k, long j10) {
        float F10 = c13793k.F(c13793k.y(j10));
        if (F10 == 0.0f) {
            return false;
        }
        if (F10 > 0.0f) {
            return c13793k.getScrollableState().e();
        }
        return c13793k.getScrollableState().d();
    }

    private final void p(C14185q c14185q) {
        List<PointerInputChange> listC = c14185q.c();
        int size = listC.size();
        for (int i10 = 0; i10 < size; i10++) {
            listC.get(i10).a();
        }
    }
}
