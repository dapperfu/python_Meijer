package kotlin;

import H1.y;
import H1.z;
import androidx.compose.foundation.gestures.FlingCancellationException;
import d0.C13580n;
import d0.EnumC13564E;
import d0.J;
import f1.C13939b;
import f1.C13942e;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0083\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001a\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u0012*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0019\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010 \u001a\u00020\u001c*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010\u0017J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0013H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u001c*\u00020\u0013ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0014\u0010)\u001a\u00020\u001c*\u00020\u001cø\u0001\u0000¢\u0006\u0004\b)\u0010\u0017J\u0014\u0010*\u001a\u00020\u0013*\u00020\u001cø\u0001\u0000¢\u0006\u0004\b*\u0010\u0015J\u0017\u0010+\u001a\u00020\u0012*\u00020\u0013ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010(J\u0011\u0010,\u001a\u00020\u0013*\u00020\u0013¢\u0006\u0004\b,\u0010-J\u0014\u0010.\u001a\u00020\u001c*\u00020\u001cø\u0001\u0000¢\u0006\u0004\b.\u0010\u0017J\u0018\u0010/\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b/\u0010\u0017J#\u00103\u001a\u0002022\u0006\u00100\u001a\u00020\u00122\u0006\u00101\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u001b\u00106\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\n¢\u0006\u0004\b8\u00109JC\u0010A\u001a\u0002022\b\b\u0002\u0010;\u001a\u00020:2'\u0010@\u001a#\b\u0001\u0012\u0004\u0012\u00020=\u0012\n\u0012\b\u0012\u0004\u0012\u0002020>\u0012\u0006\u0012\u0004\u0018\u00010\u00010<¢\u0006\u0002\b?H\u0086@¢\u0006\u0004\bA\u0010BJ?\u0010C\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\n¢\u0006\u0004\bE\u00109R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR$\u0010[\u001a\u00020\n2\u0006\u0010X\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bY\u0010S\u001a\u0004\bZ\u00109R\u001c\u0010]\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\\\u0010CR\u0016\u0010`\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR \u0010h\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010j\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u00109\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006k"}, d2 = {"Lf0/K;", "", "Lf0/H;", "scrollableState", "Ld0/J;", "overscrollEffect", "Lf0/s;", "flingBehavior", "Lf0/z;", "orientation", "", "reverseDirection", "Lf1/b;", "nestedScrollDispatcher", "Lkotlin/Function0;", "isScrollableNodeAttached", "<init>", "(Lf0/H;Ld0/J;Lf0/s;Lf0/z;ZLf1/b;Lkotlin/jvm/functions/Function0;)V", "LH1/y;", "", "E", "(J)F", "D", "(J)J", "newValue", "J", "(JF)J", "Lf0/E;", "LU0/f;", "delta", "Lf1/e;", "source", "w", "(Lf0/E;JI)J", "scroll", "o", "pixels", "A", "(F)Z", "G", "(F)J", "C", "F", "H", "x", "(F)F", "y", "v", "initialVelocity", "isMouseWheel", "", "u", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "available", "p", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "B", "()Z", "Ld0/E;", "scrollPriority", "Lkotlin/Function2;", "Lf0/y;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "block", "z", "(Ld0/E;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "I", "(Lf0/H;Lf0/z;Ld0/J;ZLf0/s;Lf1/b;)Z", "t", "a", "Lf0/H;", "q", "()Lf0/H;", "setScrollableState", "(Lf0/H;)V", "b", "Ld0/J;", "c", "Lf0/s;", "d", "Lf0/z;", "e", "Z", "f", "Lf1/b;", "g", "Lkotlin/jvm/functions/Function0;", "<set-?>", "h", "s", "isFlinging", "i", "latestScrollSource", "j", "Lf0/E;", "outerStateScope", "f0/K$c", "k", "Lf0/K$c;", "nestedScrollScope", "Lkotlin/Function1;", "l", "Lkotlin/jvm/functions/Function1;", "performScrollForOverscroll", "r", "shouldDispatchOverscroll", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: f0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13903K {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private InterfaceC13900H scrollableState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private J overscrollEffect;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private InterfaceC13930s flingBehavior;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private EnumC13937z orientation;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean reverseDirection;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private C13939b nestedScrollDispatcher;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Function0<Boolean> isScrollableNodeAttached;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isFlinging;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int latestScrollSource = C13942e.INSTANCE.d();

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private InterfaceC13897E outerStateScope = androidx.compose.foundation.gestures.g.f48525b;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final c nestedScrollScope = new c();

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Function1<U0.f, U0.f> performScrollForOverscroll = new e();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {782}, m = "doFlingAnimation-QWom1Mo")
    /* renamed from: f0.K$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f130986a;

        /* renamed from: b, reason: collision with root package name */
        Object f130987b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f130988c;

        /* renamed from: e, reason: collision with root package name */
        int f130990e;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f130988c = obj;
            this.f130990e |= Integer.MIN_VALUE;
            return C13903K.this.p(0L, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf0/y;", "", "<anonymous>", "(Lf0/y;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {814}, m = "invokeSuspend")
    /* renamed from: f0.K$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC13936y, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f130991a;

        /* renamed from: b, reason: collision with root package name */
        Object f130992b;

        /* renamed from: c, reason: collision with root package name */
        long f130993c;

        /* renamed from: d, reason: collision with root package name */
        int f130994d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f130995e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Ref.LongRef f130997g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f130998h;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"f0/K$b$a", "Lf0/E;", "", "pixels", "e", "(F)F", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: f0.K$b$a */
        public static final class a implements InterfaceC13897E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C13903K f130999a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC13936y f131000b;

            a(C13903K c13903k, InterfaceC13936y interfaceC13936y) {
                this.f130999a = c13903k;
                this.f131000b = interfaceC13936y;
            }

            @Override // kotlin.InterfaceC13897E
            public float e(float pixels) {
                if (C13580n.NewNestedFlingPropagationEnabled && Math.abs(pixels) != 0.0f && this.f130999a.A(pixels)) {
                    throw new FlingCancellationException();
                }
                C13903K c13903k = this.f130999a;
                return c13903k.x(c13903k.F(this.f131000b.a(c13903k.y(c13903k.G(pixels)), C13942e.INSTANCE.c())));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Ref.LongRef longRef, long j10, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f130997g = longRef;
            this.f130998h = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = C13903K.this.new b(this.f130997g, this.f130998h, continuation);
            bVar.f130995e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13936y interfaceC13936y, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC13936y, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C13903K c13903k;
            Ref.LongRef longRef;
            C13903K c13903k2;
            long j10;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f130994d;
            if (i10 != 0) {
                if (i10 == 1) {
                    j10 = this.f130993c;
                    longRef = (Ref.LongRef) this.f130992b;
                    c13903k = (C13903K) this.f130991a;
                    c13903k2 = (C13903K) this.f130995e;
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                a aVar = new a(C13903K.this, (InterfaceC13936y) this.f130995e);
                c13903k = C13903K.this;
                Ref.LongRef longRef2 = this.f130997g;
                long j11 = this.f130998h;
                InterfaceC13930s interfaceC13930s = c13903k.flingBehavior;
                long j12 = longRef2.f143741a;
                float fX = c13903k.x(c13903k.E(j11));
                this.f130995e = c13903k;
                this.f130991a = c13903k;
                this.f130992b = longRef2;
                this.f130993c = j12;
                this.f130994d = 1;
                Object objA = interfaceC13930s.a(aVar, fX, this);
                if (objA == objF) {
                    return objF;
                }
                longRef = longRef2;
                obj = objA;
                c13903k2 = c13903k;
                j10 = j12;
            }
            longRef.f143741a = c13903k.J(j10, c13903k2.x(((Number) obj).floatValue()));
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"f0/K$c", "Lf0/y;", "LU0/f;", "offset", "Lf1/e;", "source", "b", "(JI)J", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: f0.K$c */
    public static final class c implements InterfaceC13936y {
        c() {
        }

        @Override // kotlin.InterfaceC13936y
        public long a(long offset, int source) {
            C13903K.this.latestScrollSource = source;
            J j10 = C13903K.this.overscrollEffect;
            if (j10 != null && C13903K.this.r()) {
                return j10.b(offset, C13903K.this.latestScrollSource, C13903K.this.performScrollForOverscroll);
            }
            return C13903K.this.w(C13903K.this.outerStateScope, offset, source);
        }

        @Override // kotlin.InterfaceC13936y
        public long b(long offset, int source) {
            return C13903K.this.w(C13903K.this.outerStateScope, offset, source);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH1/y;", "velocity", "<anonymous>", "(LH1/y;)LH1/y;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", f = "Scrollable.kt", l = {748, 751, 754}, m = "invokeSuspend")
    /* renamed from: f0.K$d */
    static final class d extends SuspendLambda implements Function2<y, Continuation<? super y>, Object> {

        /* renamed from: a, reason: collision with root package name */
        long f131002a;

        /* renamed from: b, reason: collision with root package name */
        int f131003b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ long f131004c;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = C13903K.this.new d(continuation);
            dVar.f131004c = ((y) obj).getPackedValue();
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(y yVar, Continuation<? super y> continuation) {
            return d(yVar.getPackedValue(), continuation);
        }

        public final Object d(long j10, Continuation<? super y> continuation) {
            return ((d) create(y.b(j10), continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
        
            if (r0 != r6) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r13.f131003b
                r1 = 3
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L35
                if (r0 == r3) goto L2e
                if (r0 == r2) goto L25
                if (r0 != r1) goto L1d
                long r0 = r13.f131002a
                long r2 = r13.f131004c
                kotlin.ResultKt.b(r14)
                r7 = r2
                r3 = r0
                r0 = r14
                goto L88
            L1d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L25:
                long r2 = r13.f131002a
                long r7 = r13.f131004c
                kotlin.ResultKt.b(r14)
                r0 = r14
                goto L68
            L2e:
                long r3 = r13.f131004c
                kotlin.ResultKt.b(r14)
                r0 = r14
                goto L4c
            L35:
                kotlin.ResultKt.b(r14)
                long r7 = r13.f131004c
                f0.K r0 = kotlin.C13903K.this
                f1.b r0 = kotlin.C13903K.c(r0)
                r13.f131004c = r7
                r13.f131003b = r3
                java.lang.Object r0 = r0.c(r7, r13)
                if (r0 != r6) goto L4b
                goto L87
            L4b:
                r3 = r7
            L4c:
                H1.y r0 = (H1.y) r0
                long r7 = r0.getPackedValue()
                long r7 = H1.y.k(r3, r7)
                f0.K r0 = kotlin.C13903K.this
                r13.f131004c = r3
                r13.f131002a = r7
                r13.f131003b = r2
                java.lang.Object r0 = r0.p(r7, r13)
                if (r0 != r6) goto L65
                goto L87
            L65:
                r11 = r7
                r7 = r3
                r2 = r11
            L68:
                H1.y r0 = (H1.y) r0
                long r9 = r0.getPackedValue()
                f0.K r0 = kotlin.C13903K.this
                f1.b r0 = kotlin.C13903K.c(r0)
                long r2 = H1.y.k(r2, r9)
                r13.f131004c = r7
                r13.f131002a = r9
                r13.f131003b = r1
                r5 = r13
                r1 = r2
                r3 = r9
                java.lang.Object r0 = r0.a(r1, r3, r5)
                if (r0 != r6) goto L88
            L87:
                return r6
            L88:
                H1.y r0 = (H1.y) r0
                long r0 = r0.getPackedValue()
                long r0 = H1.y.k(r3, r0)
                long r0 = H1.y.k(r7, r0)
                H1.y r0 = H1.y.b(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C13903K.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/f;", "delta", "a", "(J)J"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: f0.K$e */
    static final class e extends Lambda implements Function1<U0.f, U0.f> {
        e() {
            super(1);
        }

        public final long a(long j10) {
            InterfaceC13897E interfaceC13897E = C13903K.this.outerStateScope;
            C13903K c13903k = C13903K.this;
            return c13903k.w(interfaceC13897E, j10, c13903k.latestScrollSource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ U0.f invoke(U0.f fVar) {
            return U0.f.d(a(fVar.getPackedValue()));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf0/E;", "", "<anonymous>", "(Lf0/E;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$scroll$2", f = "Scrollable.kt", l = {834}, m = "invokeSuspend")
    /* renamed from: f0.K$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC13897E, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f131007a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f131008b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC13936y, Continuation<? super Unit>, Object> f131010d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Function2<? super InterfaceC13936y, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f131010d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = C13903K.this.new f(this.f131010d, continuation);
            fVar.f131008b = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13897E interfaceC13897E, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC13897E, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f131007a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C13903K.this.outerStateScope = (InterfaceC13897E) this.f131008b;
                Function2<InterfaceC13936y, Continuation<? super Unit>, Object> function2 = this.f131010d;
                c cVar = C13903K.this.nestedScrollScope;
                this.f131007a = 1;
                if (function2.invoke(cVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A(float pixels) {
        if (pixels <= 0.0f || this.scrollableState.e()) {
            return (pixels < 0.0f && !this.scrollableState.d()) || !this.isScrollableNodeAttached.invoke().booleanValue();
        }
        return true;
    }

    public final long G(float f10) {
        if (f10 == 0.0f) {
            return U0.f.INSTANCE.c();
        }
        if (this.orientation == EnumC13937z.f131420b) {
            return U0.f.e((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        }
        return U0.f.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
    }

    public final long H(float f10) {
        return f10 == 0.0f ? y.INSTANCE.a() : this.orientation == EnumC13937z.f131420b ? z.a(f10, 0.0f) : z.a(0.0f, f10);
    }

    private final long D(long j10) {
        return this.orientation == EnumC13937z.f131420b ? y.e(j10, 0.0f, 0.0f, 1, null) : y.e(j10, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float E(long j10) {
        return this.orientation == EnumC13937z.f131420b ? y.h(j10) : y.i(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long J(long j10, float f10) {
        return this.orientation == EnumC13937z.f131420b ? y.e(j10, f10, 0.0f, 2, null) : y.e(j10, 0.0f, f10, 1, null);
    }

    private final long o(long scroll) {
        return G(x(this.scrollableState.f(x(F(scroll)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean r() {
        return this.scrollableState.e() || this.scrollableState.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long w(InterfaceC13897E interfaceC13897E, long j10, int i10) {
        long jD = this.nestedScrollDispatcher.d(j10, i10);
        long jP = U0.f.p(j10, jD);
        long jY = y(G(interfaceC13897E.e(F(y(C(jP))))));
        return U0.f.q(U0.f.q(jD, jY), this.nestedScrollDispatcher.b(jY, U0.f.p(jP, jY), i10));
    }

    public final boolean B() {
        if (this.scrollableState.b()) {
            return true;
        }
        J j10 = this.overscrollEffect;
        return j10 != null ? j10.a() : false;
    }

    public final long C(long j10) {
        return this.orientation == EnumC13937z.f131420b ? U0.f.g(j10, 0.0f, 0.0f, 1, null) : U0.f.g(j10, 0.0f, 0.0f, 2, null);
    }

    public final float F(long j10) {
        return Float.intBitsToFloat((int) (this.orientation == EnumC13937z.f131420b ? j10 >> 32 : j10 & 4294967295L));
    }

    public final boolean I(InterfaceC13900H scrollableState, EnumC13937z orientation, J overscrollEffect, boolean reverseDirection, InterfaceC13930s flingBehavior, C13939b nestedScrollDispatcher) {
        boolean z10;
        boolean z11 = true;
        if (Intrinsics.e(this.scrollableState, scrollableState)) {
            z10 = false;
        } else {
            this.scrollableState = scrollableState;
            z10 = true;
        }
        this.overscrollEffect = overscrollEffect;
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z10 = true;
        }
        if (this.reverseDirection != reverseDirection) {
            this.reverseDirection = reverseDirection;
        } else {
            z11 = z10;
        }
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        return z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(long r11, kotlin.coroutines.Continuation<? super H1.y> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof kotlin.C13903K.a
            if (r0 == 0) goto L13
            r0 = r13
            f0.K$a r0 = (kotlin.C13903K.a) r0
            int r1 = r0.f130990e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f130990e = r1
            goto L18
        L13:
            f0.K$a r0 = new f0.K$a
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f130988c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f130990e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r11 = r0.f130987b
            kotlin.jvm.internal.Ref$LongRef r11 = (kotlin.jvm.internal.Ref.LongRef) r11
            java.lang.Object r12 = r0.f130986a
            f0.K r12 = (kotlin.C13903K) r12
            kotlin.ResultKt.b(r13)
            r5 = r10
            goto L5f
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            kotlin.ResultKt.b(r13)
            kotlin.jvm.internal.Ref$LongRef r6 = new kotlin.jvm.internal.Ref$LongRef
            r6.<init>()
            r6.f143741a = r11
            r10.isFlinging = r3
            d0.E r13 = d0.EnumC13564E.f127647a
            f0.K$b r4 = new f0.K$b
            r9 = 0
            r5 = r10
            r7 = r11
            r4.<init>(r6, r7, r9)
            r0.f130986a = r5
            r0.f130987b = r6
            r0.f130990e = r3
            java.lang.Object r11 = r10.z(r13, r4, r0)
            if (r11 != r1) goto L5d
            return r1
        L5d:
            r12 = r5
            r11 = r6
        L5f:
            r13 = 0
            r12.isFlinging = r13
            long r11 = r11.f143741a
            H1.y r11 = H1.y.b(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C13903K.p(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: q, reason: from getter */
    public final InterfaceC13900H getScrollableState() {
        return this.scrollableState;
    }

    /* renamed from: s, reason: from getter */
    public final boolean getIsFlinging() {
        return this.isFlinging;
    }

    public final boolean t() {
        return this.orientation == EnumC13937z.f131419a;
    }

    public final Object u(long j10, boolean z10, Continuation<? super Unit> continuation) {
        if (z10 && !androidx.compose.foundation.gestures.g.g(this.flingBehavior)) {
            return Unit.f143329a;
        }
        long jD = D(j10);
        d dVar = new d(null);
        J j11 = this.overscrollEffect;
        if (j11 == null || !r()) {
            Object objInvoke = dVar.invoke(y.b(jD), continuation);
            return objInvoke == IntrinsicsKt.f() ? objInvoke : Unit.f143329a;
        }
        Object objC = j11.c(jD, dVar, continuation);
        return objC == IntrinsicsKt.f() ? objC : Unit.f143329a;
    }

    public final long v(long scroll) {
        return this.scrollableState.b() ? U0.f.INSTANCE.c() : o(scroll);
    }

    public final float x(float f10) {
        return this.reverseDirection ? f10 * (-1) : f10;
    }

    public final long y(long j10) {
        return this.reverseDirection ? U0.f.r(j10, -1.0f) : j10;
    }

    public final Object z(EnumC13564E enumC13564E, Function2<? super InterfaceC13936y, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objA = this.scrollableState.a(enumC13564E, new f(function2, null), continuation);
        return objA == IntrinsicsKt.f() ? objA : Unit.f143329a;
    }

    public C13903K(InterfaceC13900H interfaceC13900H, J j10, InterfaceC13930s interfaceC13930s, EnumC13937z enumC13937z, boolean z10, C13939b c13939b, Function0<Boolean> function0) {
        this.scrollableState = interfaceC13900H;
        this.overscrollEffect = j10;
        this.flingBehavior = interfaceC13930s;
        this.orientation = enumC13937z;
        this.reverseDirection = z10;
        this.nestedScrollDispatcher = c13939b;
        this.isScrollableNodeAttached = function0;
    }
}
