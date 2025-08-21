package yu;

import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.C6414A;
import kotlin.C6451h;
import kotlin.C6456m;
import kotlin.InterfaceC13897E;
import kotlin.InterfaceC13930s;
import kotlin.InterfaceC6452i;
import kotlin.InterfaceC6468y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001B\u007f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012<\u0010\u000f\u001a8\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\n0\t\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\u0004\b\u0012\u0010\u0013Bo\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012>\b\u0002\u0010\u000f\u001a8\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0012\u0010\u0014J'\u0010\u0018\u001a\u00020\u0005*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\u001e\u001a\u00020\u0005*\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010 \u001a\u00020\u0005*\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b \u0010!JR\u0010'\u001a\u00020\u001c*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\n2!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00050\u0010H\u0002¢\u0006\u0004\b'\u0010(J)\u0010*\u001a\u00020\u001c*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010)\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u001aH\u0002¢\u0006\u0004\b*\u0010+J'\u0010,\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0005H\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u0005*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00102R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106RJ\u0010\u000f\u001a8\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R/\u0010B\u001a\u0004\u0018\u00010\n2\b\u0010;\u001a\u0004\u0018\u00010\n8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006C"}, d2 = {"Lyu/e;", "Lf0/s;", "Lyu/h;", "layoutInfo", "Lc0/y;", "", "decayAnimationSpec", "Lc0/i;", "springAnimationSpec", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "startIndex", "targetIndex", "snapIndex", "Lkotlin/Function1;", "maximumFlingDistance", "<init>", "(Lyu/h;Lc0/y;Lc0/i;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V", "(Lyu/h;Lc0/y;Lc0/i;Lkotlin/jvm/functions/Function3;)V", "Lf0/E;", "index", "initialVelocity", "l", "(Lf0/E;IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyu/i;", "initialItem", "", "flingThenSpring", "n", "(Lf0/E;Lyu/i;IFZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "q", "(Lf0/E;Lyu/i;IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lc0/h;", "Lc0/m;", "currentItem", "pixels", "scrollBy", "p", "(Lc0/h;Lyu/i;ILkotlin/jvm/functions/Function1;)Z", "velocity", "j", "(Lc0/y;FLyu/i;)Z", "i", "(FLyu/i;I)I", "k", "(F)F", "a", "(Lf0/E;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyu/h;", "b", "Lc0/y;", "c", "Lc0/i;", "d", "Lkotlin/jvm/functions/Function3;", "e", "Lkotlin/jvm/functions/Function1;", "<set-?>", "f", "Landroidx/compose/runtime/l0;", "m", "()Ljava/lang/Integer;", "r", "(Ljava/lang/Integer;)V", "animationTarget", "lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements InterfaceC13930s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h layoutInfo;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6468y<Float> decayAnimationSpec;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6452i<Float> springAnimationSpec;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function3<h, Integer, Integer, Integer> snapIndex;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function1<h, Float> maximumFlingDistance;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 animationTarget;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", l = {HttpResponseStatus.ERROR_NOT_ACCEPTABLE, HttpResponseStatus.ERROR_REQUESTED_RANGE_NOT_SATISFIABLE}, m = "flingToIndex")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f172111a;

        /* renamed from: b, reason: collision with root package name */
        Object f172112b;

        /* renamed from: c, reason: collision with root package name */
        int f172113c;

        /* renamed from: d, reason: collision with root package name */
        float f172114d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f172115e;

        /* renamed from: g, reason: collision with root package name */
        int f172117g;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f172115e = obj;
            this.f172117g |= Integer.MIN_VALUE;
            return e.this.l(null, 0, 0.0f, this);
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", l = {477}, m = "performDecayFling")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f172118a;

        /* renamed from: b, reason: collision with root package name */
        Object f172119b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f172120c;

        /* renamed from: e, reason: collision with root package name */
        int f172122e;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f172120c = obj;
            this.f172122e |= Integer.MIN_VALUE;
            return e.this.n(null, null, 0, 0.0f, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/h;", "", "Lc0/m;", "", "a", "(Lc0/h;)V"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function1<C6451h<Float, C6456m>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f172123f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC13897E f172124g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f172125h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ e f172126i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f172127j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f172128k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Float, Float> {
            a(Object obj) {
                super(1, obj, InterfaceC13897E.class, "scrollBy", "scrollBy(F)F", 0);
            }

            public final Float a(float f10) {
                return Float.valueOf(((InterfaceC13897E) this.receiver).e(f10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                return a(f10.floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Ref.FloatRef floatRef, InterfaceC13897E interfaceC13897E, Ref.FloatRef floatRef2, e eVar, boolean z10, int i10) {
            super(1);
            this.f172123f = floatRef;
            this.f172124g = interfaceC13897E;
            this.f172125h = floatRef2;
            this.f172126i = eVar;
            this.f172127j = z10;
            this.f172128k = i10;
        }

        public final void a(C6451h<Float, C6456m> animateDecay) {
            Intrinsics.j(animateDecay, "$this$animateDecay");
            float fFloatValue = animateDecay.e().floatValue() - this.f172123f.f143739a;
            float fE = this.f172124g.e(fFloatValue);
            this.f172123f.f143739a = animateDecay.e().floatValue();
            this.f172125h.f143739a = animateDecay.f().floatValue();
            if (Math.abs(fFloatValue - fE) > 0.5f) {
                animateDecay.a();
            }
            SnapperLayoutItemInfo snapperLayoutItemInfoE = this.f172126i.layoutInfo.e();
            if (snapperLayoutItemInfoE == null) {
                animateDecay.a();
                return;
            }
            if (animateDecay.h() && this.f172127j) {
                if (animateDecay.f().floatValue() > 0.0f && snapperLayoutItemInfoE.a() == this.f172128k - 1) {
                    animateDecay.a();
                } else if (animateDecay.f().floatValue() < 0.0f && snapperLayoutItemInfoE.a() == this.f172128k) {
                    animateDecay.a();
                }
            }
            if (animateDecay.h() && this.f172126i.p(animateDecay, snapperLayoutItemInfoE, this.f172128k, new a(this.f172124g))) {
                animateDecay.a();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C6451h<Float, C6456m> c6451h) {
            a(c6451h);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", l = {551}, m = "performSpringFling")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f172129a;

        /* renamed from: b, reason: collision with root package name */
        Object f172130b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f172131c;

        /* renamed from: e, reason: collision with root package name */
        int f172133e;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f172131c = obj;
            this.f172133e |= Integer.MIN_VALUE;
            return e.this.q(null, null, 0, 0.0f, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/h;", "", "Lc0/m;", "", "a", "(Lc0/h;)V"}, k = 3, mv = {1, 6, 0})
    /* renamed from: yu.e$e, reason: collision with other inner class name */
    static final class C2776e extends Lambda implements Function1<C6451h<Float, C6456m>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f172134f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC13897E f172135g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f172136h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ e f172137i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f172138j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: yu.e$e$a */
        /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Float, Float> {
            a(Object obj) {
                super(1, obj, InterfaceC13897E.class, "scrollBy", "scrollBy(F)F", 0);
            }

            public final Float a(float f10) {
                return Float.valueOf(((InterfaceC13897E) this.receiver).e(f10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                return a(f10.floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2776e(Ref.FloatRef floatRef, InterfaceC13897E interfaceC13897E, Ref.FloatRef floatRef2, e eVar, int i10) {
            super(1);
            this.f172134f = floatRef;
            this.f172135g = interfaceC13897E;
            this.f172136h = floatRef2;
            this.f172137i = eVar;
            this.f172138j = i10;
        }

        public final void a(C6451h<Float, C6456m> animateTo) {
            Intrinsics.j(animateTo, "$this$animateTo");
            float fFloatValue = animateTo.e().floatValue() - this.f172134f.f143739a;
            float fE = this.f172135g.e(fFloatValue);
            this.f172134f.f143739a = animateTo.e().floatValue();
            this.f172136h.f143739a = animateTo.f().floatValue();
            SnapperLayoutItemInfo snapperLayoutItemInfoE = this.f172137i.layoutInfo.e();
            if (snapperLayoutItemInfoE == null) {
                animateTo.a();
            } else if (this.f172137i.p(animateTo, snapperLayoutItemInfoE, this.f172138j, new a(this.f172135g))) {
                animateTo.a();
            } else if (Math.abs(fFloatValue - fE) > 0.5f) {
                animateTo.a();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C6451h<Float, C6456m> c6451h) {
            a(c6451h);
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private e(h hVar, InterfaceC6468y<Float> interfaceC6468y, InterfaceC6452i<Float> interfaceC6452i, Function3<? super h, ? super Integer, ? super Integer, Integer> function3, Function1<? super h, Float> function1) {
        this.layoutInfo = hVar;
        this.decayAnimationSpec = interfaceC6468y;
        this.springAnimationSpec = interfaceC6452i;
        this.snapIndex = function3;
        this.maximumFlingDistance = function1;
        this.animationTarget = t1.e(null, null, 2, null);
    }

    private final int i(float initialVelocity, SnapperLayoutItemInfo currentItem, int targetIndex) {
        if (initialVelocity > 0.0f && currentItem.a() >= targetIndex) {
            return this.layoutInfo.d(currentItem.a());
        }
        if (initialVelocity >= 0.0f || currentItem.a() > targetIndex - 1) {
            return 0;
        }
        return this.layoutInfo.d(currentItem.a() + 1);
    }

    private final float k(float velocity) {
        if ((velocity >= 0.0f || this.layoutInfo.b()) && (velocity <= 0.0f || this.layoutInfo.a())) {
            return 0.0f;
        }
        return velocity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(kotlin.InterfaceC13897E r12, int r13, float r14, kotlin.coroutines.Continuation<? super java.lang.Float> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yu.e.l(f0.E, int, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(kotlin.InterfaceC13897E r19, yu.SnapperLayoutItemInfo r20, int r21, float r22, boolean r23, kotlin.coroutines.Continuation<? super java.lang.Float> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yu.e.n(f0.E, yu.i, int, float, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static /* synthetic */ Object o(e eVar, InterfaceC13897E interfaceC13897E, SnapperLayoutItemInfo snapperLayoutItemInfo, int i10, float f10, boolean z10, Continuation continuation, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        return eVar.n(interfaceC13897E, snapperLayoutItemInfo, i10, f10, z10, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p(C6451h<Float, C6456m> c6451h, SnapperLayoutItemInfo snapperLayoutItemInfo, int i10, Function1<? super Float, Float> function1) {
        j jVar = j.f172146a;
        int i11 = i(c6451h.f().floatValue(), snapperLayoutItemInfo, i10);
        if (i11 == 0) {
            return false;
        }
        function1.invoke(Float.valueOf(i11));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(kotlin.InterfaceC13897E r22, yu.SnapperLayoutItemInfo r23, int r24, float r25, kotlin.coroutines.Continuation<? super java.lang.Float> r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yu.e.q(f0.E, yu.i, int, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void r(Integer num) {
        this.animationTarget.setValue(num);
    }

    @Override // kotlin.InterfaceC13930s
    public Object a(InterfaceC13897E interfaceC13897E, float f10, Continuation<? super Float> continuation) {
        if (!this.layoutInfo.b() || !this.layoutInfo.a()) {
            return Boxing.c(f10);
        }
        j jVar = j.f172146a;
        float fFloatValue = this.maximumFlingDistance.invoke(this.layoutInfo).floatValue();
        if (fFloatValue <= 0.0f) {
            throw new IllegalArgumentException("Distance returned by maximumFlingDistance should be greater than 0");
        }
        SnapperLayoutItemInfo snapperLayoutItemInfoE = this.layoutInfo.e();
        if (snapperLayoutItemInfoE == null) {
            return Boxing.c(f10);
        }
        int iIntValue = this.snapIndex.invoke(this.layoutInfo, Boxing.d(f10 < 0.0f ? snapperLayoutItemInfoE.a() + 1 : snapperLayoutItemInfoE.a()), Boxing.d(this.layoutInfo.c(f10, this.decayAnimationSpec, fFloatValue))).intValue();
        if (iIntValue < 0 || iIntValue >= this.layoutInfo.h()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return l(interfaceC13897E, iIntValue, f10, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Integer m() {
        return (Integer) this.animationTarget.getValue();
    }

    private final boolean j(InterfaceC6468y<Float> interfaceC6468y, float f10, SnapperLayoutItemInfo snapperLayoutItemInfo) {
        if (Math.abs(f10) < 0.5f) {
            return false;
        }
        float fA = C6414A.a(interfaceC6468y, 0.0f, f10);
        j jVar = j.f172146a;
        if (f10 < 0.0f) {
            if (fA > this.layoutInfo.d(snapperLayoutItemInfo.a())) {
                return false;
            }
            return true;
        }
        if (fA < this.layoutInfo.d(snapperLayoutItemInfo.a() + 1)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(h layoutInfo, InterfaceC6468y<Float> decayAnimationSpec, InterfaceC6452i<Float> springAnimationSpec, Function3<? super h, ? super Integer, ? super Integer, Integer> snapIndex) {
        this(layoutInfo, decayAnimationSpec, springAnimationSpec, snapIndex, f.f172139a.a());
        Intrinsics.j(layoutInfo, "layoutInfo");
        Intrinsics.j(decayAnimationSpec, "decayAnimationSpec");
        Intrinsics.j(springAnimationSpec, "springAnimationSpec");
        Intrinsics.j(snapIndex, "snapIndex");
    }
}
