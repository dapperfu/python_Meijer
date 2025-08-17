package Cu;

import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.t1;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.C6288A;
import kotlin.C6325h;
import kotlin.C6330m;
import kotlin.InterfaceC13787E;
import kotlin.InterfaceC13820s;
import kotlin.InterfaceC6326i;
import kotlin.InterfaceC6342y;
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

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001B\u007f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012<\u0010\u000f\u001a8\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\n0\t\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\u0004\b\u0012\u0010\u0013Bo\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012>\b\u0002\u0010\u000f\u001a8\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0012\u0010\u0014J'\u0010\u0018\u001a\u00020\u0005*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\u001e\u001a\u00020\u0005*\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010 \u001a\u00020\u0005*\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b \u0010!JR\u0010'\u001a\u00020\u001c*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\n2!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00050\u0010H\u0002¢\u0006\u0004\b'\u0010(J)\u0010*\u001a\u00020\u001c*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010)\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u001aH\u0002¢\u0006\u0004\b*\u0010+J'\u0010,\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0005H\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u0005*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00102R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106RJ\u0010\u000f\u001a8\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R/\u0010B\u001a\u0004\u0018\u00010\n2\b\u0010;\u001a\u0004\u0018\u00010\n8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006C"}, d2 = {"LCu/e;", "Lf0/s;", "LCu/h;", "layoutInfo", "Lc0/y;", "", "decayAnimationSpec", "Lc0/i;", "springAnimationSpec", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "startIndex", "targetIndex", "snapIndex", "Lkotlin/Function1;", "maximumFlingDistance", "<init>", "(LCu/h;Lc0/y;Lc0/i;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V", "(LCu/h;Lc0/y;Lc0/i;Lkotlin/jvm/functions/Function3;)V", "Lf0/E;", "index", "initialVelocity", "l", "(Lf0/E;IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LCu/i;", "initialItem", "", "flingThenSpring", "n", "(Lf0/E;LCu/i;IFZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "q", "(Lf0/E;LCu/i;IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lc0/h;", "Lc0/m;", "currentItem", "pixels", "scrollBy", "p", "(Lc0/h;LCu/i;ILkotlin/jvm/functions/Function1;)Z", "velocity", "j", "(Lc0/y;FLCu/i;)Z", "i", "(FLCu/i;I)I", "k", "(F)F", "a", "(Lf0/E;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LCu/h;", "b", "Lc0/y;", "c", "Lc0/i;", "d", "Lkotlin/jvm/functions/Function3;", "e", "Lkotlin/jvm/functions/Function1;", "<set-?>", "f", "Landroidx/compose/runtime/l0;", "m", "()Ljava/lang/Integer;", "r", "(Ljava/lang/Integer;)V", "animationTarget", "lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements InterfaceC13820s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h layoutInfo;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6342y<Float> decayAnimationSpec;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6326i<Float> springAnimationSpec;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function3<h, Integer, Integer, Integer> snapIndex;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function1<h, Float> maximumFlingDistance;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 animationTarget;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", l = {HttpResponseStatus.ERROR_NOT_ACCEPTABLE, HttpResponseStatus.ERROR_REQUESTED_RANGE_NOT_SATISFIABLE}, m = "flingToIndex")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f4934a;

        /* renamed from: b, reason: collision with root package name */
        Object f4935b;

        /* renamed from: c, reason: collision with root package name */
        int f4936c;

        /* renamed from: d, reason: collision with root package name */
        float f4937d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f4938e;

        /* renamed from: g, reason: collision with root package name */
        int f4940g;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4938e = obj;
            this.f4940g |= Integer.MIN_VALUE;
            return e.this.l(null, 0, 0.0f, this);
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", l = {477}, m = "performDecayFling")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f4941a;

        /* renamed from: b, reason: collision with root package name */
        Object f4942b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f4943c;

        /* renamed from: e, reason: collision with root package name */
        int f4945e;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4943c = obj;
            this.f4945e |= Integer.MIN_VALUE;
            return e.this.n(null, null, 0, 0.0f, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/h;", "", "Lc0/m;", "", "a", "(Lc0/h;)V"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function1<C6325h<Float, C6330m>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f4946f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC13787E f4947g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f4948h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ e f4949i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f4950j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f4951k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Float, Float> {
            a(Object obj) {
                super(1, obj, InterfaceC13787E.class, "scrollBy", "scrollBy(F)F", 0);
            }

            public final Float a(float f10) {
                return Float.valueOf(((InterfaceC13787E) this.receiver).e(f10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                return a(f10.floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Ref.FloatRef floatRef, InterfaceC13787E interfaceC13787E, Ref.FloatRef floatRef2, e eVar, boolean z10, int i10) {
            super(1);
            this.f4946f = floatRef;
            this.f4947g = interfaceC13787E;
            this.f4948h = floatRef2;
            this.f4949i = eVar;
            this.f4950j = z10;
            this.f4951k = i10;
        }

        public final void a(C6325h<Float, C6330m> animateDecay) {
            Intrinsics.j(animateDecay, "$this$animateDecay");
            float fFloatValue = animateDecay.e().floatValue() - this.f4946f.f142832a;
            float fE = this.f4947g.e(fFloatValue);
            this.f4946f.f142832a = animateDecay.e().floatValue();
            this.f4948h.f142832a = animateDecay.f().floatValue();
            if (Math.abs(fFloatValue - fE) > 0.5f) {
                animateDecay.a();
            }
            SnapperLayoutItemInfo snapperLayoutItemInfoE = this.f4949i.layoutInfo.e();
            if (snapperLayoutItemInfoE == null) {
                animateDecay.a();
                return;
            }
            if (animateDecay.h() && this.f4950j) {
                if (animateDecay.f().floatValue() > 0.0f && snapperLayoutItemInfoE.a() == this.f4951k - 1) {
                    animateDecay.a();
                } else if (animateDecay.f().floatValue() < 0.0f && snapperLayoutItemInfoE.a() == this.f4951k) {
                    animateDecay.a();
                }
            }
            if (animateDecay.h() && this.f4949i.p(animateDecay, snapperLayoutItemInfoE, this.f4951k, new a(this.f4947g))) {
                animateDecay.a();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C6325h<Float, C6330m> c6325h) {
            a(c6325h);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", l = {551}, m = "performSpringFling")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f4952a;

        /* renamed from: b, reason: collision with root package name */
        Object f4953b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f4954c;

        /* renamed from: e, reason: collision with root package name */
        int f4956e;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4954c = obj;
            this.f4956e |= Integer.MIN_VALUE;
            return e.this.q(null, null, 0, 0.0f, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/h;", "", "Lc0/m;", "", "a", "(Lc0/h;)V"}, k = 3, mv = {1, 6, 0})
    /* renamed from: Cu.e$e, reason: collision with other inner class name */
    static final class C0088e extends Lambda implements Function1<C6325h<Float, C6330m>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f4957f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC13787E f4958g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f4959h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ e f4960i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f4961j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: Cu.e$e$a */
        /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Float, Float> {
            a(Object obj) {
                super(1, obj, InterfaceC13787E.class, "scrollBy", "scrollBy(F)F", 0);
            }

            public final Float a(float f10) {
                return Float.valueOf(((InterfaceC13787E) this.receiver).e(f10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                return a(f10.floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0088e(Ref.FloatRef floatRef, InterfaceC13787E interfaceC13787E, Ref.FloatRef floatRef2, e eVar, int i10) {
            super(1);
            this.f4957f = floatRef;
            this.f4958g = interfaceC13787E;
            this.f4959h = floatRef2;
            this.f4960i = eVar;
            this.f4961j = i10;
        }

        public final void a(C6325h<Float, C6330m> animateTo) {
            Intrinsics.j(animateTo, "$this$animateTo");
            float fFloatValue = animateTo.e().floatValue() - this.f4957f.f142832a;
            float fE = this.f4958g.e(fFloatValue);
            this.f4957f.f142832a = animateTo.e().floatValue();
            this.f4959h.f142832a = animateTo.f().floatValue();
            SnapperLayoutItemInfo snapperLayoutItemInfoE = this.f4960i.layoutInfo.e();
            if (snapperLayoutItemInfoE == null) {
                animateTo.a();
            } else if (this.f4960i.p(animateTo, snapperLayoutItemInfoE, this.f4961j, new a(this.f4958g))) {
                animateTo.a();
            } else if (Math.abs(fFloatValue - fE) > 0.5f) {
                animateTo.a();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C6325h<Float, C6330m> c6325h) {
            a(c6325h);
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private e(h hVar, InterfaceC6342y<Float> interfaceC6342y, InterfaceC6326i<Float> interfaceC6326i, Function3<? super h, ? super Integer, ? super Integer, Integer> function3, Function1<? super h, Float> function1) {
        this.layoutInfo = hVar;
        this.decayAnimationSpec = interfaceC6342y;
        this.springAnimationSpec = interfaceC6326i;
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
    public final java.lang.Object l(kotlin.InterfaceC13787E r12, int r13, float r14, kotlin.coroutines.Continuation<? super java.lang.Float> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cu.e.l(f0.E, int, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(kotlin.InterfaceC13787E r19, Cu.SnapperLayoutItemInfo r20, int r21, float r22, boolean r23, kotlin.coroutines.Continuation<? super java.lang.Float> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cu.e.n(f0.E, Cu.i, int, float, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static /* synthetic */ Object o(e eVar, InterfaceC13787E interfaceC13787E, SnapperLayoutItemInfo snapperLayoutItemInfo, int i10, float f10, boolean z10, Continuation continuation, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        return eVar.n(interfaceC13787E, snapperLayoutItemInfo, i10, f10, z10, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p(C6325h<Float, C6330m> c6325h, SnapperLayoutItemInfo snapperLayoutItemInfo, int i10, Function1<? super Float, Float> function1) {
        j jVar = j.f4969a;
        int i11 = i(c6325h.f().floatValue(), snapperLayoutItemInfo, i10);
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
    public final java.lang.Object q(kotlin.InterfaceC13787E r22, Cu.SnapperLayoutItemInfo r23, int r24, float r25, kotlin.coroutines.Continuation<? super java.lang.Float> r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cu.e.q(f0.E, Cu.i, int, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void r(Integer num) {
        this.animationTarget.setValue(num);
    }

    @Override // kotlin.InterfaceC13820s
    public Object a(InterfaceC13787E interfaceC13787E, float f10, Continuation<? super Float> continuation) {
        if (!this.layoutInfo.b() || !this.layoutInfo.a()) {
            return Boxing.c(f10);
        }
        j jVar = j.f4969a;
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
        return l(interfaceC13787E, iIntValue, f10, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Integer m() {
        return (Integer) this.animationTarget.getValue();
    }

    private final boolean j(InterfaceC6342y<Float> interfaceC6342y, float f10, SnapperLayoutItemInfo snapperLayoutItemInfo) {
        if (Math.abs(f10) < 0.5f) {
            return false;
        }
        float fA = C6288A.a(interfaceC6342y, 0.0f, f10);
        j jVar = j.f4969a;
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
    public e(h layoutInfo, InterfaceC6342y<Float> decayAnimationSpec, InterfaceC6326i<Float> springAnimationSpec, Function3<? super h, ? super Integer, ? super Integer, Integer> snapIndex) {
        this(layoutInfo, decayAnimationSpec, springAnimationSpec, snapIndex, f.f4962a.a());
        Intrinsics.j(layoutInfo, "layoutInfo");
        Intrinsics.j(decayAnimationSpec, "decayAnimationSpec");
        Intrinsics.j(springAnimationSpec, "springAnimationSpec");
        Intrinsics.j(snapIndex, "snapIndex");
    }
}
