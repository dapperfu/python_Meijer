package kotlin;

import androidx.compose.runtime.A0;
import androidx.compose.runtime.InterfaceC5724i0;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import d0.C13432F;
import d0.EnumC13431E;
import i0.C14589e;
import kotlin.Deprecated;
import kotlin.InterfaceC6326i;
import kotlin.InterfaceC6342y;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\b\n*\u0001s\b\u0007\u0018\u0000 m*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001(B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0087@¢\u0006\u0004\b\u0011\u0010\u0012J^\u0010\u001d\u001a\u00020\u001a2\b\b\u0002\u0010\u0014\u001a\u00020\u00132B\u0010\u001c\u001a>\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0015¢\u0006\u0002\b\u001bH\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ{\u0010!\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00028\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132W\u0010\u001c\u001aS\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b( \u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f¢\u0006\u0002\b\u001bH\u0086@¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\rH\u0000¢\u0006\u0004\b$\u0010%R=\u0010.\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\n0&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R=\u00103\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\r0&8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b0\u0010)\u001a\u0004\b1\u0010+\"\u0004\b2\u0010-R(\u0010;\u001a\b\u0012\u0004\u0012\u00020\r048\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R<\u0010F\u001a\b\u0012\u0004\u0012\u00020\r0<2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\r0<8\u0006@@X\u0087.¢\u0006\u0018\n\u0004\b>\u0010?\u0012\u0004\bD\u0010E\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR<\u0010O\u001a\b\u0012\u0004\u0012\u00020\r0G2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\r0G8\u0006@@X\u0087.¢\u0006\u0018\n\u0004\bH\u0010I\u0012\u0004\bN\u0010E\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR+\u0010Y\u001a\u00028\u00002\u0006\u0010=\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010\u0005R+\u0010\\\u001a\u00028\u00002\u0006\u0010=\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010U\u001a\u0004\bZ\u0010W\"\u0004\b[\u0010\u0005R\u001b\u0010\t\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010]\u001a\u0004\b^\u0010WR+\u0010d\u001a\u00020\r2\u0006\u0010=\u001a\u00020\r8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010\u000f\"\u0004\bb\u0010cR!\u0010h\u001a\u00020\r8GX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\be\u0010]\u0012\u0004\bg\u0010E\u001a\u0004\bf\u0010\u000fR+\u0010l\u001a\u00020\r2\u0006\u0010=\u001a\u00020\r8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bi\u0010`\u001a\u0004\bj\u0010\u000f\"\u0004\bk\u0010cR/\u0010o\u001a\u0004\u0018\u00018\u00002\b\u0010=\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010U\u001a\u0004\bm\u0010W\"\u0004\bn\u0010\u0005R7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bV\u0010U\u001a\u0004\bi\u0010p\"\u0004\bq\u0010rR\u001a\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010tR\u001a\u0010y\u001a\u00020\n8@X\u0080\u0004¢\u0006\f\u0012\u0004\bx\u0010E\u001a\u0004\bv\u0010wR\u0011\u0010{\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bz\u0010w¨\u0006|"}, d2 = {"Lf0/c;", "T", "", "initialValue", "<init>", "(Ljava/lang/Object;)V", "Lf0/o;", "anchors", "(Ljava/lang/Object;Lf0/o;)V", "targetValue", "", "I", "(Ljava/lang/Object;)Z", "", "A", "()F", "velocity", "H", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ld0/E;", "dragPriority", "Lkotlin/Function3;", "Lf0/a;", "Lkotlin/ParameterName;", "name", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "h", "(Ld0/E;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function4;", "anchor", "i", "(Ljava/lang/Object;Ld0/E;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "z", "(F)F", "Lkotlin/Function1;", "newValue", "a", "Lkotlin/jvm/functions/Function1;", "m", "()Lkotlin/jvm/functions/Function1;", "setConfirmValueChange$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "confirmValueChange", "totalDistance", "b", "s", "setPositionalThreshold$foundation_release", "positionalThreshold", "Lkotlin/Function0;", "c", "Lkotlin/jvm/functions/Function0;", "x", "()Lkotlin/jvm/functions/Function0;", "setVelocityThreshold$foundation_release", "(Lkotlin/jvm/functions/Function0;)V", "velocityThreshold", "Lc0/i;", "<set-?>", "d", "Lc0/i;", "u", "()Lc0/i;", "setSnapAnimationSpec$foundation_release", "(Lc0/i;)V", "getSnapAnimationSpec$annotations", "()V", "snapAnimationSpec", "Lc0/y;", "e", "Lc0/y;", "o", "()Lc0/y;", "setDecayAnimationSpec$foundation_release", "(Lc0/y;)V", "getDecayAnimationSpec$annotations", "decayAnimationSpec", "Ld0/F;", "f", "Ld0/F;", "dragMutex", "g", "Landroidx/compose/runtime/l0;", "n", "()Ljava/lang/Object;", "C", "currentValue", "t", "G", "settledValue", "Landroidx/compose/runtime/z1;", "v", "j", "Landroidx/compose/runtime/i0;", "r", "F", "(F)V", "offset", "k", "getProgress", "getProgress$annotations", "progress", "l", "q", "E", "lastVelocity", "p", "D", "dragTarget", "()Lf0/o;", "B", "(Lf0/o;)V", "f0/c$e", "Lf0/c$e;", "anchoredDragScope", "w", "()Z", "getUsePreModifierChangeBehavior$foundation_release$annotations", "usePreModifierChangeBehavior", "y", "isAnimationRunning", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: f0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13804c<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Function1<? super T, Boolean> confirmValueChange;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Function1<? super Float, Float> positionalThreshold;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public Function0<Float> velocityThreshold;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public InterfaceC6326i<Float> snapAnimationSpec;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public InterfaceC6342y<Float> decayAnimationSpec;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C13432F dragMutex;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 currentValue;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 settledValue;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final z1 targetValue;

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
    private final e anchoredDragScope;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {1125}, m = "invokeSuspend")
    /* renamed from: f0.c$b */
    static final class b extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f130324a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C13804c<T> f130325b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC13802a, InterfaceC13816o<T>, Continuation<? super Unit>, Object> f130326c;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lf0/o;", "c", "()Lf0/o;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: f0.c$b$a */
        static final class a extends Lambda implements Function0<InterfaceC13816o<T>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C13804c<T> f130327f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C13804c<T> c13804c) {
                super(0);
                this.f130327f = c13804c;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final InterfaceC13816o<T> invoke() {
                return this.f130327f.l();
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lf0/o;", "latestAnchors", "", "<anonymous>", "(Lf0/o;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {1126}, m = "invokeSuspend")
        /* renamed from: f0.c$b$b, reason: collision with other inner class name */
        static final class C2067b extends SuspendLambda implements Function2<InterfaceC13816o<T>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f130328a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f130329b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function3<InterfaceC13802a, InterfaceC13816o<T>, Continuation<? super Unit>, Object> f130330c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C13804c<T> f130331d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2067b(Function3<? super InterfaceC13802a, ? super InterfaceC13816o<T>, ? super Continuation<? super Unit>, ? extends Object> function3, C13804c<T> c13804c, Continuation<? super C2067b> continuation) {
                super(2, continuation);
                this.f130330c = function3;
                this.f130331d = c13804c;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C2067b c2067b = new C2067b(this.f130330c, this.f130331d, continuation);
                c2067b.f130329b = obj;
                return c2067b;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC13816o<T> interfaceC13816o, Continuation<? super Unit> continuation) {
                return ((C2067b) create(interfaceC13816o, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f130328a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC13816o<T> interfaceC13816o = (InterfaceC13816o) this.f130329b;
                    Function3<InterfaceC13802a, InterfaceC13816o<T>, Continuation<? super Unit>, Object> function3 = this.f130330c;
                    e eVar = ((C13804c) this.f130331d).anchoredDragScope;
                    this.f130328a = 1;
                    if (function3.invoke(eVar, interfaceC13816o, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(C13804c<T> c13804c, Function3<? super InterfaceC13802a, ? super InterfaceC13816o<T>, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super b> continuation) {
            super(1, continuation);
            this.f130325b = c13804c;
            this.f130326c = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new b(this.f130325b, this.f130326c, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((b) create(continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f130324a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                a aVar = new a(this.f130325b);
                C2067b c2067b = new C2067b(this.f130326c, this.f130325b, null);
                this.f130324a = 1;
                if (androidx.compose.foundation.gestures.a.w(aVar, c2067b, this) == objF) {
                    return objF;
                }
            }
            T tB = this.f130325b.l().b(this.f130325b.r());
            if (tB != null) {
                if (Math.abs(this.f130325b.r() - this.f130325b.l().c(tB)) < 0.5f && this.f130325b.m().invoke(tB).booleanValue()) {
                    this.f130325b.G(tB);
                    this.f130325b.C(tB);
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {1170}, m = "anchoredDrag")
    /* renamed from: f0.c$c, reason: collision with other inner class name */
    static final class C2068c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f130332a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f130333b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C13804c<T> f130334c;

        /* renamed from: d, reason: collision with root package name */
        int f130335d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2068c(C13804c<T> c13804c, Continuation<? super C2068c> continuation) {
            super(continuation);
            this.f130334c = c13804c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f130333b = obj;
            this.f130335d |= Integer.MIN_VALUE;
            return this.f130334c.i(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {1172}, m = "invokeSuspend")
    /* renamed from: f0.c$d */
    static final class d extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f130336a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C13804c<T> f130337b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f130338c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function4<InterfaceC13802a, InterfaceC13816o<T>, T, Continuation<? super Unit>, Object> f130339d;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlin/Pair;", "Lf0/o;", "c", "()Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: f0.c$d$a */
        static final class a extends Lambda implements Function0<Pair<? extends InterfaceC13816o<T>, ? extends T>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C13804c<T> f130340f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C13804c<T> c13804c) {
                super(0);
                this.f130340f = c13804c;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Pair<InterfaceC13816o<T>, T> invoke() {
                return TuplesKt.a(this.f130340f.l(), this.f130340f.v());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlin/Pair;", "Lf0/o;", "<name for destructuring parameter 0>", "", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {1174}, m = "invokeSuspend")
        /* renamed from: f0.c$d$b */
        static final class b extends SuspendLambda implements Function2<Pair<? extends InterfaceC13816o<T>, ? extends T>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f130341a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f130342b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function4<InterfaceC13802a, InterfaceC13816o<T>, T, Continuation<? super Unit>, Object> f130343c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C13804c<T> f130344d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(Function4<? super InterfaceC13802a, ? super InterfaceC13816o<T>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function4, C13804c<T> c13804c, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f130343c = function4;
                this.f130344d = c13804c;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(this.f130343c, this.f130344d, continuation);
                bVar.f130342b = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Pair<? extends InterfaceC13816o<T>, ? extends T> pair, Continuation<? super Unit> continuation) {
                return ((b) create(pair, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f130341a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    Pair pair = (Pair) this.f130342b;
                    InterfaceC13816o interfaceC13816o = (InterfaceC13816o) pair.a();
                    Object objB = pair.b();
                    Function4<InterfaceC13802a, InterfaceC13816o<T>, T, Continuation<? super Unit>, Object> function4 = this.f130343c;
                    e eVar = ((C13804c) this.f130344d).anchoredDragScope;
                    this.f130341a = 1;
                    if (function4.invoke(eVar, interfaceC13816o, objB, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(C13804c<T> c13804c, T t10, Function4<? super InterfaceC13802a, ? super InterfaceC13816o<T>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function4, Continuation<? super d> continuation) {
            super(1, continuation);
            this.f130337b = c13804c;
            this.f130338c = t10;
            this.f130339d = function4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new d(this.f130337b, this.f130338c, this.f130339d, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((d) create(continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f130336a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                this.f130337b.D(this.f130338c);
                a aVar = new a(this.f130337b);
                b bVar = new b(this.f130339d, this.f130337b, null);
                this.f130336a = 1;
                if (androidx.compose.foundation.gestures.a.w(aVar, bVar, this) == objF) {
                    return objF;
                }
            }
            if (this.f130337b.m().invoke(this.f130338c).booleanValue()) {
                ((C13804c) this.f130337b).anchoredDragScope.a(this.f130337b.l().c(this.f130338c), this.f130337b.q());
                this.f130337b.G(this.f130338c);
                this.f130337b.C(this.f130338c);
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000bR$\u0010\u0012\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0016\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"f0/c$e", "Lf0/a;", "", "newOffset", "lastKnownVelocity", "", "a", "(FF)V", "", "isMovingForward", "d", "(Z)V", "c", "Ljava/lang/Object;", "getLeftBound", "()Ljava/lang/Object;", "setLeftBound", "(Ljava/lang/Object;)V", "leftBound", "b", "getRightBound", "setRightBound", "rightBound", "F", "getDistance", "()F", "setDistance", "(F)V", "distance", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f0.c$e */
    public static final class e implements InterfaceC13802a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private T leftBound;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private T rightBound;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private float distance = Float.NaN;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C13804c<T> f130348d;

        e(C13804c<T> c13804c) {
            this.f130348d = c13804c;
        }

        @Override // kotlin.InterfaceC13802a
        public void a(float newOffset, float lastKnownVelocity) {
            float fR = this.f130348d.r();
            this.f130348d.F(newOffset);
            this.f130348d.E(lastKnownVelocity);
            if (Float.isNaN(fR)) {
                return;
            }
            d(newOffset >= fR);
        }

        public final void c(boolean isMovingForward) {
            if (this.f130348d.r() == this.f130348d.l().c(this.f130348d.n())) {
                T tA = this.f130348d.l().a(this.f130348d.r() + (isMovingForward ? 1.0f : -1.0f), isMovingForward);
                if (tA == null) {
                    tA = this.f130348d.n();
                }
                if (isMovingForward) {
                    this.leftBound = this.f130348d.n();
                    this.rightBound = tA;
                } else {
                    this.leftBound = tA;
                    this.rightBound = this.f130348d.n();
                }
            } else {
                T tA2 = this.f130348d.l().a(this.f130348d.r(), false);
                if (tA2 == null) {
                    tA2 = this.f130348d.n();
                }
                T tA3 = this.f130348d.l().a(this.f130348d.r(), true);
                if (tA3 == null) {
                    tA3 = this.f130348d.n();
                }
                this.leftBound = tA2;
                this.rightBound = tA3;
            }
            InterfaceC13816o<T> interfaceC13816oL = this.f130348d.l();
            T t10 = this.leftBound;
            Intrinsics.g(t10);
            float fC = interfaceC13816oL.c(t10);
            InterfaceC13816o<T> interfaceC13816oL2 = this.f130348d.l();
            T t11 = this.rightBound;
            Intrinsics.g(t11);
            this.distance = Math.abs(fC - interfaceC13816oL2.c(t11));
        }

        public final void d(boolean isMovingForward) {
            T tN;
            c(isMovingForward);
            if (Math.abs(this.f130348d.r() - this.f130348d.l().c(this.f130348d.n())) >= this.distance / 2.0f) {
                if (isMovingForward) {
                    tN = this.rightBound;
                } else {
                    tN = this.leftBound;
                }
                if (tN == null) {
                    tN = this.f130348d.n();
                }
                if (((Boolean) this.f130348d.m().invoke(tN)).booleanValue()) {
                    this.f130348d.C(tN);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f0.c$f */
    static final class f extends Lambda implements Function1<T, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final f f130349f = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(T t10) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f0.c$g */
    static final class g extends Lambda implements Function0<Float> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C13804c<T> f130350f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C13804c<T> c13804c) {
            super(0);
            this.f130350f = c13804c;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            float fC = this.f130350f.l().c(this.f130350f.t());
            float fC2 = this.f130350f.l().c(this.f130350f.v()) - fC;
            float fAbs = Math.abs(fC2);
            float f10 = 1.0f;
            if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                float fA = (this.f130350f.A() - fC) / fC2;
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
    /* renamed from: f0.c$h */
    static final class h extends Lambda implements Function0<T> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C13804c<T> f130351f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C13804c<T> c13804c) {
            super(0);
            this.f130351f = c13804c;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            T t10 = (T) this.f130351f.p();
            if (t10 != null) {
                return t10;
            }
            C13804c<T> c13804c = this.f130351f;
            if (Float.isNaN(c13804c.r())) {
                return c13804c.n();
            }
            T tB = c13804c.l().b(c13804c.r());
            return tB == null ? c13804c.n() : tB;
        }
    }

    public C13804c(T t10) {
        this.confirmValueChange = f.f130349f;
        this.dragMutex = new C13432F();
        this.currentValue = t1.e(t10, null, 2, null);
        this.settledValue = t1.e(t10, null, 2, null);
        this.targetValue = o1.e(new h(this));
        this.offset = A0.a(Float.NaN);
        this.progress = o1.d(o1.r(), new g(this));
        this.lastVelocity = A0.a(0.0f);
        this.dragTarget = t1.e(null, null, 2, null);
        this.anchors = t1.e(androidx.compose.foundation.gestures.a.v(), null, 2, null);
        this.anchoredDragScope = new e(this);
    }

    private final void B(InterfaceC13816o<T> interfaceC13816o) {
        this.anchors.setValue(interfaceC13816o);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(T t10) {
        this.settledValue.setValue(t10);
    }

    private final boolean I(T targetValue) {
        C13432F c13432f = this.dragMutex;
        boolean zG = c13432f.g();
        if (!zG) {
            return zG;
        }
        try {
            e eVar = this.anchoredDragScope;
            float fC = l().c(targetValue);
            if (!Float.isNaN(fC)) {
                InterfaceC13802a.b(eVar, fC, 0.0f, 2, null);
                D(null);
            }
            C(targetValue);
            G(targetValue);
            c13432f.i();
            return zG;
        } catch (Throwable th2) {
            c13432f.i();
            throw th2;
        }
    }

    public static /* synthetic */ Object j(C13804c c13804c, EnumC13431E enumC13431E, Function3 function3, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC13431E = EnumC13431E.f126845a;
        }
        return c13804c.h(enumC13431E, function3, continuation);
    }

    public static /* synthetic */ Object k(C13804c c13804c, Object obj, EnumC13431E enumC13431E, Function4 function4, Continuation continuation, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            enumC13431E = EnumC13431E.f126845a;
        }
        return c13804c.i(obj, enumC13431E, function4, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T p() {
        return this.dragTarget.getValue();
    }

    public final Object h(EnumC13431E enumC13431E, Function3<? super InterfaceC13802a, ? super InterfaceC13816o<T>, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) {
        Object objD = this.dragMutex.d(enumC13431E, new b(this, function3, null), continuation);
        return objD == IntrinsicsKt.f() ? objD : Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(T r6, d0.EnumC13431E r7, kotlin.jvm.functions.Function4<? super kotlin.InterfaceC13802a, ? super kotlin.InterfaceC13816o<T>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof kotlin.C13804c.C2068c
            if (r0 == 0) goto L13
            r0 = r9
            f0.c$c r0 = (kotlin.C13804c.C2068c) r0
            int r1 = r0.f130335d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f130335d = r1
            goto L18
        L13:
            f0.c$c r0 = new f0.c$c
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f130333b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f130335d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f130332a
            f0.c r6 = (kotlin.C13804c) r6
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L2e
            goto L58
        L2e:
            r7 = move-exception
            goto L5e
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            kotlin.ResultKt.b(r9)
            f0.o r9 = r5.l()
            boolean r9 = r9.d(r6)
            if (r9 == 0) goto L62
            d0.F r9 = r5.dragMutex     // Catch: java.lang.Throwable -> L5c
            f0.c$d r2 = new f0.c$d     // Catch: java.lang.Throwable -> L5c
            r2.<init>(r5, r6, r8, r4)     // Catch: java.lang.Throwable -> L5c
            r0.f130332a = r5     // Catch: java.lang.Throwable -> L5c
            r0.f130335d = r3     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r6 = r9.d(r7, r2, r0)     // Catch: java.lang.Throwable -> L5c
            if (r6 != r1) goto L57
            return r1
        L57:
            r6 = r5
        L58:
            r6.D(r4)
            goto L76
        L5c:
            r7 = move-exception
            r6 = r5
        L5e:
            r6.D(r4)
            throw r7
        L62:
            kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r7 = r5.confirmValueChange
            java.lang.Object r7 = r7.invoke(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L76
            r5.G(r6)
            r5.C(r6)
        L76:
            kotlin.Unit r6 = kotlin.Unit.f142422a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C13804c.i(java.lang.Object, d0.E, kotlin.jvm.functions.Function4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final InterfaceC13816o<T> l() {
        return (InterfaceC13816o) this.anchors.getValue();
    }

    public final Function1<T, Boolean> m() {
        return this.confirmValueChange;
    }

    public final T n() {
        return this.currentValue.getValue();
    }

    public final InterfaceC6342y<Float> o() {
        InterfaceC6342y<Float> interfaceC6342y = this.decayAnimationSpec;
        if (interfaceC6342y != null) {
            return interfaceC6342y;
        }
        Intrinsics.y("decayAnimationSpec");
        return null;
    }

    public final float q() {
        return this.lastVelocity.b();
    }

    public final float r() {
        return this.offset.b();
    }

    public final Function1<Float, Float> s() {
        Function1 function1 = this.positionalThreshold;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.y("positionalThreshold");
        return null;
    }

    public final T t() {
        return this.settledValue.getValue();
    }

    public final InterfaceC6326i<Float> u() {
        InterfaceC6326i<Float> interfaceC6326i = this.snapAnimationSpec;
        if (interfaceC6326i != null) {
            return interfaceC6326i;
        }
        Intrinsics.y("snapAnimationSpec");
        return null;
    }

    public final T v() {
        return (T) this.targetValue.getValue();
    }

    public final boolean w() {
        return (this.positionalThreshold == null || this.velocityThreshold == null || this.snapAnimationSpec == null || this.decayAnimationSpec == null) ? false : true;
    }

    public final Function0<Float> x() {
        Function0<Float> function0 = this.velocityThreshold;
        if (function0 != null) {
            return function0;
        }
        Intrinsics.y("velocityThreshold");
        return null;
    }

    public final float A() {
        if (Float.isNaN(r())) {
            C14589e.c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return r();
    }

    @Deprecated
    public final Object H(float f10, Continuation<? super Float> continuation) {
        if (!w()) {
            C14589e.a("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
        }
        T tN = n();
        Object objU = androidx.compose.foundation.gestures.a.u(l(), A(), f10, s(), x());
        if (this.confirmValueChange.invoke(objU).booleanValue()) {
            return androidx.compose.foundation.gestures.a.s(this, objU, f10, null, null, continuation, 12, null);
        }
        return androidx.compose.foundation.gestures.a.s(this, tN, f10, null, null, continuation, 12, null);
    }

    public final boolean y() {
        if (p() != null) {
            return true;
        }
        return false;
    }

    public final float z(float delta) {
        float fR;
        if (Float.isNaN(r())) {
            fR = 0.0f;
        } else {
            fR = r();
        }
        return RangesKt.n(fR + delta, l().e(), l().f());
    }

    public C13804c(T t10, InterfaceC13816o<T> interfaceC13816o) {
        this(t10);
        B(interfaceC13816o);
        I(t10);
    }
}
