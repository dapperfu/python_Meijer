package androidx.compose.foundation.gestures;

import androidx.compose.runtime.o1;
import androidx.compose.ui.Modifier;
import d0.J;
import g0.C14291i;
import g0.InterfaceC14292j;
import g1.PointerInputChange;
import h0.l;
import kotlin.C13913b;
import kotlin.C13914c;
import kotlin.C13927p;
import kotlin.C6414A;
import kotlin.C6451h;
import kotlin.C6456m;
import kotlin.EnumC13937z;
import kotlin.InterfaceC13906N;
import kotlin.InterfaceC13912a;
import kotlin.InterfaceC13926o;
import kotlin.InterfaceC13930s;
import kotlin.InterfaceC6421H;
import kotlin.InterfaceC6452i;
import kotlin.InterfaceC6468y;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.i0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import mv.C0;
import mv.C15784P;
import mv.InterfaceC15783O;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u0000º\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001ac\u0010\u000f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a[\u0010\u0011\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012\u001a<\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\"\b\b\u0000\u0010\u0000*\u00020\u00132\u001d\u0010\u0018\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0004\b\u001a\u0010\u001b\u001aT\u0010$\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010!\u001a\u00028\u00002\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\"H\u0082@¢\u0006\u0004\b$\u0010%\u001a8\u0010(\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010&\u001a\u00028\u00002\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001c0\"H\u0086@¢\u0006\u0004\b(\u0010)\u001aP\u0010,\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010&\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\"2\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001c0*H\u0086@¢\u0006\u0004\b,\u0010-\u001a`\u00105\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2!\u00102\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u001c0\u00142\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u001c03H\u0002¢\u0006\u0004\b5\u00106\u001a\u001b\u00108\u001a\u00020\u001c*\u00020\u001c2\u0006\u00107\u001a\u00020\u001cH\u0002¢\u0006\u0004\b8\u00109\u001aH\u0010?\u001a\u00020\u0016\"\u0004\b\u0000\u0010:2\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u0000032\"\u0010>\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160=\u0012\u0006\u0012\u0004\u0018\u00010\u00130<H\u0082@¢\u0006\u0004\b?\u0010@\u001a\u001b\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000A\"\u0004\b\u0000\u0010\u0000H\u0002¢\u0006\u0004\bB\u0010C\u001a\\\u0010G\u001a\u00020F\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010E\u001a\u00020D2!\u00102\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u001c0\u00142\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\"H\u0000¢\u0006\u0004\bG\u0010H\u001aT\u0010J\u001a\u00020I\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022!\u00102\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u001c0\u00142\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u001c03H\u0002¢\u0006\u0004\bJ\u0010K\" \u0010N\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\u00040\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010M\" \u0010P\u001a\u000e\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020\u001c0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010M\"\u001a\u0010V\u001a\u00020Q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u001c0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006Z"}, d2 = {"T", "Landroidx/compose/ui/Modifier;", "Lf0/c;", "state", "", "reverseDirection", "Lf0/z;", "orientation", "enabled", "Lh0/l;", "interactionSource", "Ld0/J;", "overscrollEffect", "Lf0/s;", "flingBehavior", "k", "(Landroidx/compose/ui/Modifier;Lf0/c;ZLf0/z;ZLh0/l;Ld0/J;Lf0/s;)Landroidx/compose/ui/Modifier;", "j", "(Landroidx/compose/ui/Modifier;Lf0/c;Lf0/z;ZLh0/l;Ld0/J;Lf0/s;)Landroidx/compose/ui/Modifier;", "", "Lkotlin/Function1;", "Lf0/p;", "", "Lkotlin/ExtensionFunctionType;", "builder", "Lf0/o;", "b", "(Lkotlin/jvm/functions/Function1;)Lf0/o;", "", "velocity", "Lf0/a;", "anchoredDragScope", "anchors", "latestTarget", "Lc0/i;", "snapAnimationSpec", "o", "(Lf0/c;FLf0/a;Lf0/o;Ljava/lang/Object;Lc0/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "targetValue", "animationSpec", "p", "(Lf0/c;Ljava/lang/Object;Lc0/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lc0/y;", "decayAnimationSpec", "r", "(Lf0/c;Ljava/lang/Object;FLc0/i;Lc0/y;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currentOffset", "Lkotlin/ParameterName;", "name", "totalDistance", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "u", "(Lf0/o;FFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "target", "t", "(FF)F", "I", "inputs", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "w", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/c;", "v", "()Landroidx/compose/foundation/gestures/c;", "LH1/d;", "density", "Lf0/N;", "n", "(Lf0/c;LH1/d;Lkotlin/jvm/functions/Function1;Lc0/i;)Lf0/N;", "Lg0/j;", "a", "(Lf0/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lg0/j;", "Lg1/B;", "Lkotlin/jvm/functions/Function1;", "AlwaysDrag", "", "GetOrNan", "LH1/h;", "c", "F", "getAnchoredDraggableMinFlingVelocity", "()F", "AnchoredDraggableMinFlingVelocity", "d", "Lc0/y;", "NoOpDecayAnimationSpec", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Function1<PointerInputChange, Boolean> f48355a = C0995a.f48359f;

    /* renamed from: b, reason: collision with root package name */
    private static final Function1<Integer, Float> f48356b = c.f48363f;

    /* renamed from: c, reason: collision with root package name */
    private static final float f48357c = H1.h.p(125);

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC6468y<Float> f48358d = C6414A.d(new d());

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg1/B;", "it", "", "a", "(Lg1/B;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.gestures.a$a, reason: collision with other inner class name */
    static final class C0995a extends Lambda implements Function1<PointerInputChange, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final C0995a f48359f = new C0995a();

        C0995a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/foundation/gestures/a$b", "Lg0/j;", "", "velocity", "decayOffset", "b", "(FF)F", "a", "(F)F", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC14292j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C13914c<T> f48360a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Float, Float> f48361b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Float> f48362c;

        @Override // g0.InterfaceC14292j
        public float b(float velocity, float decayOffset) {
            return 0.0f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(C13914c<T> c13914c, Function1<? super Float, Float> function1, Function0<Float> function0) {
            this.f48360a = c13914c;
            this.f48361b = function1;
            this.f48362c = function0;
        }

        @Override // g0.InterfaceC14292j
        public float a(float velocity) {
            float fA = this.f48360a.A();
            return this.f48360a.l().c(a.u(this.f48360a.l(), fA, velocity, this.f48361b, this.f48362c)) - fA;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function1<Integer, Float> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f48363f = new c();

        c() {
            super(1);
        }

        public final Float a(int i10) {
            return Float.valueOf(Float.NaN);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"androidx/compose/foundation/gestures/a$d", "Lc0/H;", "", "playTimeNanos", "", "initialValue", "initialVelocity", "e", "(JFF)F", "c", "(FF)J", "b", "d", "(FF)F", "a", "F", "()F", "absVelocityThreshold", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements InterfaceC6421H {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float absVelocityThreshold;

        @Override // kotlin.InterfaceC6421H
        public float b(long playTimeNanos, float initialValue, float initialVelocity) {
            return 0.0f;
        }

        @Override // kotlin.InterfaceC6421H
        public long c(float initialValue, float initialVelocity) {
            return 0L;
        }

        @Override // kotlin.InterfaceC6421H
        public float d(float initialValue, float initialVelocity) {
            return 0.0f;
        }

        @Override // kotlin.InterfaceC6421H
        public float e(long playTimeNanos, float initialValue, float initialVelocity) {
            return 0.0f;
        }

        @Override // kotlin.InterfaceC6421H
        /* renamed from: a, reason: from getter */
        public float getAbsVelocityThreshold() {
            return this.absVelocityThreshold;
        }

        d() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class e extends Lambda implements Function0<Float> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ H1.d f48365f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(H1.d dVar) {
            super(0);
            this.f48365f = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(this.f48365f.I1(H1.h.p(125)));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "value", "velocity", "", "a", "(FF)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends Lambda implements Function2<Float, Float, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC13912a f48366f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f48367g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC13912a interfaceC13912a, Ref.FloatRef floatRef) {
            super(2);
            this.f48366f = interfaceC13912a;
            this.f48367g = floatRef;
        }

        public final void a(float f10, float f11) {
            this.f48366f.a(f10, f11);
            this.f48367g.f143739a = f10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Float f10, Float f11) {
            a(f10.floatValue(), f11.floatValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "Lf0/a;", "Lf0/o;", "anchors", "latestTarget", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4", f = "AnchoredDraggable.kt", l = {1344}, m = "invokeSuspend")
    static final class g<T> extends SuspendLambda implements Function4<InterfaceC13912a, InterfaceC13926o<T>, T, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48368a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f48369b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f48370c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f48371d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C13914c<T> f48372e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6452i<Float> f48373f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C13914c<T> c13914c, InterfaceC6452i<Float> interfaceC6452i, Continuation<? super g> continuation) {
            super(4, continuation);
            this.f48372e = c13914c;
            this.f48373f = interfaceC6452i;
        }

        @Override // kotlin.jvm.functions.Function4
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13912a interfaceC13912a, InterfaceC13926o<T> interfaceC13926o, T t10, Continuation<? super Unit> continuation) {
            g gVar = new g(this.f48372e, this.f48373f, continuation);
            gVar.f48369b = interfaceC13912a;
            gVar.f48370c = interfaceC13926o;
            gVar.f48371d = t10;
            return gVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48368a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC13912a interfaceC13912a = (InterfaceC13912a) this.f48369b;
                InterfaceC13926o interfaceC13926o = (InterfaceC13926o) this.f48370c;
                Object obj2 = this.f48371d;
                C13914c<T> c13914c = this.f48372e;
                float fQ = c13914c.q();
                InterfaceC6452i<Float> interfaceC6452i = this.f48373f;
                this.f48369b = null;
                this.f48370c = null;
                this.f48368a = 1;
                if (a.o(c13914c, fQ, interfaceC13912a, interfaceC13926o, obj2, interfaceC6452i, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {1380}, m = "animateToWithDecay")
    static final class h<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        float f48374a;

        /* renamed from: b, reason: collision with root package name */
        Object f48375b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f48376c;

        /* renamed from: d, reason: collision with root package name */
        int f48377d;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f48376c = obj;
            this.f48377d |= Integer.MIN_VALUE;
            return a.r(null, null, 0.0f, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "Lf0/a;", "Lf0/o;", "anchors", "latestTarget", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", f = "AnchoredDraggable.kt", l = {1391, 1409, 1433}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class i<T> extends SuspendLambda implements Function4<InterfaceC13912a, InterfaceC13926o<T>, T, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48378a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f48379b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f48380c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f48381d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C13914c<T> f48382e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f48383f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6452i<Float> f48384g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f48385h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC6468y<Float> f48386i;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lc0/h;", "", "Lc0/m;", "", "a", "(Lc0/h;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.gestures.a$i$a, reason: collision with other inner class name */
        static final class C0996a extends Lambda implements Function1<C6451h<Float, C6456m>, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ float f48387f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f48388g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ InterfaceC13912a f48389h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f48390i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0996a(float f10, Ref.FloatRef floatRef, InterfaceC13912a interfaceC13912a, Ref.FloatRef floatRef2) {
                super(1);
                this.f48387f = f10;
                this.f48388g = floatRef;
                this.f48389h = interfaceC13912a;
                this.f48390i = floatRef2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C6451h<Float, C6456m> c6451h) {
                a(c6451h);
                return Unit.f143329a;
            }

            public final void a(C6451h<Float, C6456m> c6451h) {
                float fFloatValue;
                float fFloatValue2 = c6451h.e().floatValue();
                float f10 = this.f48387f;
                if (fFloatValue2 >= f10 || this.f48388g.f143739a <= f10) {
                    float fFloatValue3 = c6451h.e().floatValue();
                    float f11 = this.f48387f;
                    if (fFloatValue3 <= f11 || this.f48388g.f143739a >= f11) {
                        this.f48389h.a(c6451h.e().floatValue(), c6451h.f().floatValue());
                        this.f48390i.f143739a = c6451h.f().floatValue();
                        this.f48388g.f143739a = c6451h.e().floatValue();
                        return;
                    }
                }
                float fT = a.t(c6451h.e().floatValue(), this.f48387f);
                this.f48389h.a(fT, c6451h.f().floatValue());
                Ref.FloatRef floatRef = this.f48390i;
                if (Float.isNaN(c6451h.f().floatValue())) {
                    fFloatValue = 0.0f;
                } else {
                    fFloatValue = c6451h.f().floatValue();
                }
                floatRef.f143739a = fFloatValue;
                this.f48388g.f143739a = fT;
                c6451h.a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C13914c<T> c13914c, float f10, InterfaceC6452i<Float> interfaceC6452i, Ref.FloatRef floatRef, InterfaceC6468y<Float> interfaceC6468y, Continuation<? super i> continuation) {
            super(4, continuation);
            this.f48382e = c13914c;
            this.f48383f = f10;
            this.f48384g = interfaceC6452i;
            this.f48385h = floatRef;
            this.f48386i = interfaceC6468y;
        }

        @Override // kotlin.jvm.functions.Function4
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13912a interfaceC13912a, InterfaceC13926o<T> interfaceC13926o, T t10, Continuation<? super Unit> continuation) {
            i iVar = new i(this.f48382e, this.f48383f, this.f48384g, this.f48385h, this.f48386i, continuation);
            iVar.f48379b = interfaceC13912a;
            iVar.f48380c = interfaceC13926o;
            iVar.f48381d = t10;
            return iVar.invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00bd, code lost:
        
            if (kotlin.i0.h(r1, r1, false, r3, r24, 2, null) != r7) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
        
            if (androidx.compose.foundation.gestures.a.o(r0, r16, r2, r4, r5, r5, r24) != r7) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ed, code lost:
        
            if (androidx.compose.foundation.gestures.a.o(r0, r12, r0, r4, r5, r5, r24) == r7) goto L44;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 247
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.a.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {1543}, m = "restartable")
    static final class j<I> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f48391a;

        /* renamed from: b, reason: collision with root package name */
        int f48392b;

        j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f48391a = obj;
            this.f48392b |= Integer.MIN_VALUE;
            return a.w(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", l = {1545}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48393a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f48394b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<I> f48395c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> f48396d;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "I", "latestInputs", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.gestures.a$k$a, reason: collision with other inner class name */
        static final class C0997a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<C0> f48397a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f48398b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> f48399c;

            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", l = {1552}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.a$k$a$a, reason: collision with other inner class name */
            static final class C0998a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f48400a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> f48401b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ I f48402c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC15783O f48403d;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C0998a(this.f48401b, this.f48402c, this.f48403d, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0998a(Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2, I i10, InterfaceC15783O interfaceC15783O, Continuation<? super C0998a> continuation) {
                    super(2, continuation);
                    this.f48401b = function2;
                    this.f48402c = i10;
                    this.f48403d = interfaceC15783O;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C0998a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f48400a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        Function2<I, Continuation<? super Unit>, Object> function2 = this.f48401b;
                        I i11 = this.f48402c;
                        this.f48400a = 1;
                        if (function2.invoke(i11, this) == objF) {
                            return objF;
                        }
                    }
                    C15784P.d(this.f48403d, new AnchoredDragFinishedSignal());
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", l = {1548}, m = "emit")
            /* renamed from: androidx.compose.foundation.gestures.a$k$a$b */
            static final class b extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                Object f48404a;

                /* renamed from: b, reason: collision with root package name */
                Object f48405b;

                /* renamed from: c, reason: collision with root package name */
                Object f48406c;

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f48407d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ C0997a<T> f48408e;

                /* renamed from: f, reason: collision with root package name */
                int f48409f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(C0997a<? super T> c0997a, Continuation<? super b> continuation) {
                    super(continuation);
                    this.f48408e = c0997a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f48407d = obj;
                    this.f48409f |= Integer.MIN_VALUE;
                    return this.f48408e.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0997a(Ref.ObjectRef<C0> objectRef, InterfaceC15783O interfaceC15783O, Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2) {
                this.f48397a = objectRef;
                this.f48398b = interfaceC15783O;
                this.f48399c = function2;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(I r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof androidx.compose.foundation.gestures.a.k.C0997a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    androidx.compose.foundation.gestures.a$k$a$b r0 = (androidx.compose.foundation.gestures.a.k.C0997a.b) r0
                    int r1 = r0.f48409f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f48409f = r1
                    goto L18
                L13:
                    androidx.compose.foundation.gestures.a$k$a$b r0 = new androidx.compose.foundation.gestures.a$k$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f48407d
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f48409f
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f48406c
                    mv.C0 r8 = (mv.C0) r8
                    java.lang.Object r8 = r0.f48405b
                    java.lang.Object r0 = r0.f48404a
                    androidx.compose.foundation.gestures.a$k$a r0 = (androidx.compose.foundation.gestures.a.k.C0997a) r0
                    kotlin.ResultKt.b(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    kotlin.ResultKt.b(r9)
                    kotlin.jvm.internal.Ref$ObjectRef<mv.C0> r9 = r7.f48397a
                    T r9 = r9.f143742a
                    mv.C0 r9 = (mv.C0) r9
                    if (r9 == 0) goto L5d
                    androidx.compose.foundation.gestures.AnchoredDragFinishedSignal r2 = new androidx.compose.foundation.gestures.AnchoredDragFinishedSignal
                    r2.<init>()
                    r9.d(r2)
                    r0.f48404a = r7
                    r0.f48405b = r8
                    r0.f48406c = r9
                    r0.f48409f = r3
                    java.lang.Object r9 = r9.o0(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    kotlin.jvm.internal.Ref$ObjectRef<mv.C0> r9 = r0.f48397a
                    mv.O r1 = r0.f48398b
                    mv.Q r3 = mv.EnumC15785Q.f151688d
                    androidx.compose.foundation.gestures.a$k$a$a r4 = new androidx.compose.foundation.gestures.a$k$a$a
                    kotlin.jvm.functions.Function2<I, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = r0.f48399c
                    r2 = 0
                    r4.<init>(r0, r8, r1, r2)
                    r5 = 1
                    r6 = 0
                    mv.C0 r8 = mv.C15805i.d(r1, r2, r3, r4, r5, r6)
                    r9.f143742a = r8
                    kotlin.Unit r8 = kotlin.Unit.f143329a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.a.k.C0997a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(Function0<? extends I> function0, Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f48395c = function0;
            this.f48396d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            k kVar = new k(this.f48395c, this.f48396d, continuation);
            kVar.f48394b = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48393a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f48394b;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                InterfaceC16561f interfaceC16561fQ = o1.q(this.f48395c);
                C0997a c0997a = new C0997a(objectRef, interfaceC15783O, this.f48396d);
                this.f48393a = 1;
                if (interfaceC16561fQ.collect(c0997a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float t(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return f11 > 0.0f ? RangesKt.j(f10, f11) : RangesKt.e(f10, f11);
    }

    private static final <T> InterfaceC14292j a(C13914c<T> c13914c, Function1<? super Float, Float> function1, Function0<Float> function0) {
        return new b(c13914c, function1, function0);
    }

    public static final <T> InterfaceC13926o<T> b(Function1<? super C13927p<T>, Unit> function1) {
        C13927p c13927p = new C13927p();
        function1.invoke(c13927p);
        return new androidx.compose.foundation.gestures.c(c13927p.b(), c13927p.c());
    }

    public static final <T> Modifier j(Modifier modifier, C13914c<T> c13914c, EnumC13937z enumC13937z, boolean z10, l lVar, J j10, InterfaceC13930s interfaceC13930s) {
        return modifier.then(new AnchoredDraggableElement(c13914c, enumC13937z, z10, null, lVar, null, j10, interfaceC13930s, 32, null));
    }

    public static final <T> Modifier k(Modifier modifier, C13914c<T> c13914c, boolean z10, EnumC13937z enumC13937z, boolean z11, l lVar, J j10, InterfaceC13930s interfaceC13930s) {
        return modifier.then(new AnchoredDraggableElement(c13914c, enumC13937z, z11, Boolean.valueOf(z10), lVar, null, j10, interfaceC13930s, 32, null));
    }

    public static /* synthetic */ Modifier l(Modifier modifier, C13914c c13914c, EnumC13937z enumC13937z, boolean z10, l lVar, J j10, InterfaceC13930s interfaceC13930s, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return j(modifier, c13914c, enumC13937z, z10, (i10 & 8) != 0 ? null : lVar, (i10 & 16) != 0 ? null : j10, (i10 & 32) != 0 ? null : interfaceC13930s);
    }

    public static /* synthetic */ Modifier m(Modifier modifier, C13914c c13914c, boolean z10, EnumC13937z enumC13937z, boolean z11, l lVar, J j10, InterfaceC13930s interfaceC13930s, int i10, Object obj) {
        InterfaceC13930s interfaceC13930s2;
        Modifier modifier2;
        C13914c c13914c2;
        boolean z12;
        EnumC13937z enumC13937z2;
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z13 = z11;
        l lVar2 = (i10 & 16) != 0 ? null : lVar;
        J j11 = (i10 & 32) != 0 ? null : j10;
        if ((i10 & 64) != 0) {
            interfaceC13930s2 = null;
            c13914c2 = c13914c;
            z12 = z10;
            enumC13937z2 = enumC13937z;
            modifier2 = modifier;
        } else {
            interfaceC13930s2 = interfaceC13930s;
            modifier2 = modifier;
            c13914c2 = c13914c;
            z12 = z10;
            enumC13937z2 = enumC13937z;
        }
        return k(modifier2, c13914c2, z12, enumC13937z2, z13, lVar2, j11, interfaceC13930s2);
    }

    public static final <T> InterfaceC13906N n(C13914c<T> c13914c, H1.d dVar, Function1<? super Float, Float> function1, InterfaceC6452i<Float> interfaceC6452i) {
        return C14291i.l(a(c13914c, function1, new e(dVar)), f48358d, interfaceC6452i);
    }

    public static final <T> Object p(C13914c<T> c13914c, T t10, InterfaceC6452i<Float> interfaceC6452i, Continuation<? super Unit> continuation) {
        Object objK = C13914c.k(c13914c, t10, null, new g(c13914c, interfaceC6452i, null), continuation, 2, null);
        return objK == IntrinsicsKt.f() ? objK : Unit.f143329a;
    }

    public static /* synthetic */ Object q(C13914c c13914c, Object obj, InterfaceC6452i interfaceC6452i, Continuation continuation, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            interfaceC6452i = c13914c.w() ? c13914c.u() : C13913b.f131136a.d();
        }
        return p(c13914c, obj, interfaceC6452i, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object r(kotlin.C13914c<T> r10, T r11, float r12, kotlin.InterfaceC6452i<java.lang.Float> r13, kotlin.InterfaceC6468y<java.lang.Float> r14, kotlin.coroutines.Continuation<? super java.lang.Float> r15) {
        /*
            boolean r1 = r15 instanceof androidx.compose.foundation.gestures.a.h
            if (r1 == 0) goto L14
            r1 = r15
            androidx.compose.foundation.gestures.a$h r1 = (androidx.compose.foundation.gestures.a.h) r1
            int r3 = r1.f48377d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L14
            int r3 = r3 - r4
            r1.f48377d = r3
        L12:
            r7 = r1
            goto L1a
        L14:
            androidx.compose.foundation.gestures.a$h r1 = new androidx.compose.foundation.gestures.a$h
            r1.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r0 = r7.f48376c
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r7.f48377d
            r8 = 1
            if (r1 == 0) goto L39
            if (r1 != r8) goto L31
            float r1 = r7.f48374a
            java.lang.Object r2 = r7.f48375b
            kotlin.jvm.internal.Ref$FloatRef r2 = (kotlin.jvm.internal.Ref.FloatRef) r2
            kotlin.ResultKt.b(r0)
            goto L64
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            kotlin.ResultKt.b(r0)
            kotlin.jvm.internal.Ref$FloatRef r4 = new kotlin.jvm.internal.Ref$FloatRef
            r4.<init>()
            r4.f143739a = r12
            androidx.compose.foundation.gestures.a$i r0 = new androidx.compose.foundation.gestures.a$i
            r6 = 0
            r1 = r10
            r2 = r12
            r3 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r5 = r0
            r0 = r4
            r7.f48375b = r0
            r7.f48374a = r12
            r7.f48377d = r8
            r4 = 0
            r6 = r7
            r7 = 2
            r8 = 0
            r2 = r10
            r3 = r11
            java.lang.Object r2 = kotlin.C13914c.k(r2, r3, r4, r5, r6, r7, r8)
            if (r2 != r9) goto L62
            return r9
        L62:
            r1 = r12
            r2 = r0
        L64:
            float r0 = r2.f143739a
            float r1 = r1 - r0
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.Boxing.c(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.a.r(f0.c, java.lang.Object, float, c0.i, c0.y, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object s(C13914c c13914c, Object obj, float f10, InterfaceC6452i interfaceC6452i, InterfaceC6468y interfaceC6468y, Continuation continuation, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            interfaceC6452i = c13914c.w() ? c13914c.u() : C13913b.f131136a.d();
        }
        InterfaceC6452i interfaceC6452i2 = interfaceC6452i;
        if ((i10 & 8) != 0) {
            interfaceC6468y = c13914c.w() ? c13914c.o() : C13913b.f131136a.b();
        }
        return r(c13914c, obj, f10, interfaceC6452i2, interfaceC6468y, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> androidx.compose.foundation.gestures.c<T> v() {
        return new androidx.compose.foundation.gestures.c<>(CollectionsKt.m(), new float[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <I> java.lang.Object w(kotlin.jvm.functions.Function0<? extends I> r4, kotlin.jvm.functions.Function2<? super I, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.a.j
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.a$j r0 = (androidx.compose.foundation.gestures.a.j) r0
            int r1 = r0.f48392b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48392b = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.a$j r0 = new androidx.compose.foundation.gestures.a$j
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f48391a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f48392b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r6)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.b(r6)
            androidx.compose.foundation.gestures.a$k r6 = new androidx.compose.foundation.gestures.a$k     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            r0.f48392b = r3     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            java.lang.Object r4 = mv.C15784P.g(r6, r0)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            if (r4 != r1) goto L43
            return r1
        L43:
            kotlin.Unit r4 = kotlin.Unit.f143329a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.a.w(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object o(C13914c<T> c13914c, float f10, InterfaceC13912a interfaceC13912a, InterfaceC13926o<T> interfaceC13926o, T t10, InterfaceC6452i<Float> interfaceC6452i, Continuation<? super Unit> continuation) {
        float fR;
        Object objB;
        float fC = interfaceC13926o.c(t10);
        Ref.FloatRef floatRef = new Ref.FloatRef();
        if (Float.isNaN(c13914c.r())) {
            fR = 0.0f;
        } else {
            fR = c13914c.r();
        }
        floatRef.f143739a = fR;
        if (!Float.isNaN(fC)) {
            float f11 = floatRef.f143739a;
            if (f11 != fC && (objB = i0.b(f11, fC, f10, interfaceC6452i, new f(interfaceC13912a, floatRef), continuation)) == IntrinsicsKt.f()) {
                return objB;
            }
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T u(kotlin.InterfaceC13926o<T> r5, float r6, float r7, kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Float> r8, kotlin.jvm.functions.Function0<java.lang.Float> r9) {
        /*
            boolean r0 = java.lang.Float.isNaN(r6)
            if (r0 != 0) goto L92
            float r0 = java.lang.Math.abs(r7)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r0 <= 0) goto L13
            r0 = r3
            goto L14
        L13:
            r0 = r2
        L14:
            if (r0 == 0) goto L1c
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 <= 0) goto L1c
            r1 = r3
            goto L1d
        L1c:
            r1 = r2
        L1d:
            if (r0 != 0) goto L27
            java.lang.Object r5 = r5.b(r6)
            kotlin.jvm.internal.Intrinsics.g(r5)
            return r5
        L27:
            float r7 = java.lang.Math.abs(r7)
            java.lang.Object r9 = r9.invoke()
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            float r9 = java.lang.Math.abs(r9)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto L45
            java.lang.Object r5 = r5.a(r6, r1)
            kotlin.jvm.internal.Intrinsics.g(r5)
            return r5
        L45:
            java.lang.Object r7 = r5.a(r6, r2)
            kotlin.jvm.internal.Intrinsics.g(r7)
            float r9 = r5.c(r7)
            java.lang.Object r0 = r5.a(r6, r3)
            kotlin.jvm.internal.Intrinsics.g(r0)
            float r5 = r5.c(r0)
            float r4 = r9 - r5
            float r4 = java.lang.Math.abs(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.Object r8 = r8.invoke(r4)
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            float r8 = java.lang.Math.abs(r8)
            if (r1 == 0) goto L76
            goto L77
        L76:
            r9 = r5
        L77:
            float r9 = r9 - r6
            float r5 = java.lang.Math.abs(r9)
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 < 0) goto L81
            r2 = r3
        L81:
            if (r2 != r3) goto L86
            if (r1 == 0) goto L8a
            goto L8b
        L86:
            if (r2 != 0) goto L8c
            if (r1 == 0) goto L8b
        L8a:
            return r7
        L8b:
            return r0
        L8c:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L92:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "The offset provided to computeTarget must not be NaN."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.a.u(f0.o, float, float, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0):java.lang.Object");
    }
}
