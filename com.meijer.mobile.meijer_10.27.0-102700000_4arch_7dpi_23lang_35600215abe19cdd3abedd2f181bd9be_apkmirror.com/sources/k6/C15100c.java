package k6;

import androidx.compose.runtime.C5712d0;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import d0.C13432F;
import g6.C14209i;
import kotlin.C6299L;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import qv.C0;
import qv.C16644i;
import qv.E0;
import qv.InterfaceC16622O;
import qv.N0;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\r*\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J2\u0010\u0018\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019Jl\u0010$\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b$\u0010%R+\u0010)\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R+\u0010\u0016\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00048V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00048V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010(\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R+\u0010\u001a\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010(\u001a\u0004\b6\u0010*\"\u0004\b7\u0010,R/\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010&\u001a\u0004\u0018\u00010\u001c8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010(\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R+\u0010\u001b\u001a\u00020\r2\u0006\u0010&\u001a\u00020\r8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010(\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\u0015R+\u0010#\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010(\u001a\u0004\bB\u0010*\"\u0004\bC\u0010,R\u001b\u0010F\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010D\u001a\u0004\bE\u0010?R/\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u000e8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010(\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR+\u0010O\u001a\u00020\r2\u0006\u0010&\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010(\u001a\u0004\bM\u0010?\"\u0004\bN\u0010\u0015R+\u0010\u0012\u001a\u00020\r2\u0006\u0010&\u001a\u00020\r8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bP\u0010(\u001a\u0004\bQ\u0010?\"\u0004\bR\u0010\u0015R+\u0010X\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bS\u0010(\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001b\u0010[\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010D\u001a\u0004\bZ\u0010?R\u001b\u0010]\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010D\u001a\u0004\b]\u0010*R\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010d\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010c¨\u0006e"}, d2 = {"Lk6/c;", "Lk6/b;", "<init>", "()V", "", "iterations", "", "M", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "frameNanos", "S", "(IJ)Z", "", "Lg6/i;", "composition", "T", "(FLg6/i;)F", "progress", "", "f0", "(F)V", "iteration", "resetLastFrameNanos", "r", "(Lg6/i;FIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reverseOnRepeat", "speed", "Lk6/j;", "clipSpec", "initialProgress", "continueFromPreviousAnimate", "Lk6/i;", "cancellationBehavior", "ignoreSystemAnimationsDisabled", "useCompositionFrameRate", "h", "(Lg6/i;IIZFLk6/j;FZLk6/i;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<set-?>", "a", "Landroidx/compose/runtime/l0;", "isPlaying", "()Z", "Z", "(Z)V", "b", "E", "()I", "W", "(I)V", "c", "y", "X", "d", "x", "c0", "e", "G", "()Lk6/j;", "U", "(Lk6/j;)V", "f", "A", "()F", "d0", "g", "R", "e0", "Landroidx/compose/runtime/z1;", "O", "frameSpeed", "i", "F", "()Lg6/i;", "V", "(Lg6/i;)V", "j", "Q", "b0", "progressRaw", "k", "C", "a0", "l", "P", "()J", "Y", "(J)V", "lastFrameNanos", "m", "N", "endProgress", "n", "isAtEnd", "Ld0/F;", "o", "Ld0/F;", "mutex", "getValue", "()Ljava/lang/Float;", "value", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: k6.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C15100c implements InterfaceC15099b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 isPlaying;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 iteration;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 iterations;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 reverseOnRepeat;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 clipSpec;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 speed;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 useCompositionFrameRate;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final z1 frameSpeed;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 composition;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 progressRaw;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 progress;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 lastFrameNanos;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final z1 endProgress;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final z1 isAtEnd;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final C13432F mutex;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2", f = "LottieAnimatable.kt", l = {269}, m = "invokeSuspend")
    /* renamed from: k6.c$a */
    static final class a extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f141451a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f141453c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f141454d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f141455e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f141456f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AbstractC15107j f141457g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C14209i f141458h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f141459i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f141460j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f141461k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ EnumC15106i f141462l;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1", f = "LottieAnimatable.kt", l = {277}, m = "invokeSuspend")
        /* renamed from: k6.c$a$a, reason: collision with other inner class name */
        static final class C2238a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f141463a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ EnumC15106i f141464b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C0 f141465c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f141466d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f141467e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C15100c f141468f;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: k6.c$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C2239a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnumC15106i.values().length];
                    try {
                        iArr[EnumC15106i.f141547b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2238a(EnumC15106i enumC15106i, C0 c02, int i10, int i11, C15100c c15100c, Continuation<? super C2238a> continuation) {
                super(2, continuation);
                this.f141464b = enumC15106i;
                this.f141465c = c02;
                this.f141466d = i10;
                this.f141467e = i11;
                this.f141468f = c15100c;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2238a(this.f141464b, this.f141465c, this.f141466d, this.f141467e, this.f141468f, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C2238a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[ADDED_TO_REGION, REMOVE] */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003e -> B:19:0x0041). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                /*
                    r3 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r3.f141463a
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    kotlin.ResultKt.b(r4)
                    goto L41
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    kotlin.ResultKt.b(r4)
                L1a:
                    k6.i r4 = r3.f141464b
                    int[] r1 = k6.C15100c.a.C2238a.C2239a.$EnumSwitchMapping$0
                    int r4 = r4.ordinal()
                    r4 = r1[r4]
                    if (r4 != r2) goto L34
                    qv.C0 r4 = r3.f141465c
                    boolean r4 = r4.a()
                    if (r4 == 0) goto L31
                    int r4 = r3.f141466d
                    goto L36
                L31:
                    int r4 = r3.f141467e
                    goto L36
                L34:
                    int r4 = r3.f141466d
                L36:
                    k6.c r1 = r3.f141468f
                    r3.f141463a = r2
                    java.lang.Object r4 = k6.C15100c.f(r1, r4, r3)
                    if (r4 != r0) goto L41
                    return r0
                L41:
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r4 = r4.booleanValue()
                    if (r4 != 0) goto L1a
                    kotlin.Unit r4 = kotlin.Unit.f142422a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: k6.C15100c.a.C2238a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: k6.c$a$b */
        public /* synthetic */ class b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC15106i.values().length];
                try {
                    iArr[EnumC15106i.f141547b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC15106i.f141546a.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, int i11, boolean z10, float f10, AbstractC15107j abstractC15107j, C14209i c14209i, float f11, boolean z11, boolean z12, EnumC15106i enumC15106i, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f141453c = i10;
            this.f141454d = i11;
            this.f141455e = z10;
            this.f141456f = f10;
            this.f141457g = abstractC15107j;
            this.f141458h = c14209i;
            this.f141459i = f11;
            this.f141460j = z11;
            this.f141461k = z12;
            this.f141462l = enumC15106i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return C15100c.this.new a(this.f141453c, this.f141454d, this.f141455e, this.f141456f, this.f141457g, this.f141458h, this.f141459i, this.f141460j, this.f141461k, this.f141462l, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((a) create(continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineContext coroutineContext;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f141451a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C15100c.this.W(this.f141453c);
                    C15100c.this.X(this.f141454d);
                    C15100c.this.c0(this.f141455e);
                    C15100c.this.d0(this.f141456f);
                    C15100c.this.U(this.f141457g);
                    C15100c.this.V(this.f141458h);
                    C15100c.this.f0(this.f141459i);
                    C15100c.this.e0(this.f141460j);
                    if (!this.f141461k) {
                        C15100c.this.Y(Long.MIN_VALUE);
                    }
                    if (this.f141458h == null) {
                        C15100c.this.Z(false);
                        return Unit.f142422a;
                    }
                    if (!Float.isInfinite(this.f141456f)) {
                        C15100c.this.Z(true);
                        int i11 = b.$EnumSwitchMapping$0[this.f141462l.ordinal()];
                        if (i11 != 1) {
                            if (i11 == 2) {
                                coroutineContext = EmptyCoroutineContext.f142646a;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            coroutineContext = N0.f157609b;
                        }
                        C2238a c2238a = new C2238a(this.f141462l, E0.k(getContext()), this.f141454d, this.f141453c, C15100c.this, null);
                        this.f141451a = 1;
                        if (C16644i.g(coroutineContext, c2238a, this) == objF) {
                            return objF;
                        }
                    } else {
                        C15100c c15100c = C15100c.this;
                        c15100c.f0(c15100c.N());
                        C15100c.this.Z(false);
                        C15100c.this.W(this.f141454d);
                        return Unit.f142422a;
                    }
                }
                E0.i(getContext());
                C15100c.this.Z(false);
                return Unit.f142422a;
            } catch (Throwable th2) {
                C15100c.this.Z(false);
                throw th2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "frameNanos", "", "a", "(J)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: k6.c$b */
    static final class b extends Lambda implements Function1<Long, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f141470g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10) {
            super(1);
            this.f141470g = i10;
        }

        public final Boolean a(long j10) {
            return Boolean.valueOf(C15100c.this.S(this.f141470g, j10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Long l10) {
            return a(l10.longValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "frameNanos", "", "a", "(J)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: k6.c$c, reason: collision with other inner class name */
    static final class C2240c extends Lambda implements Function1<Long, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f141472g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2240c(int i10) {
            super(1);
            this.f141472g = i10;
        }

        public final Boolean a(long j10) {
            return Boolean.valueOf(C15100c.this.S(this.f141472g, j10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Long l10) {
            return a(l10.longValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: k6.c$d */
    static final class d extends Lambda implements Function0<Float> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            C14209i c14209iF = C15100c.this.F();
            float fA = 0.0f;
            if (c14209iF != null) {
                if (C15100c.this.A() < 0.0f) {
                    AbstractC15107j abstractC15107jG = C15100c.this.G();
                    if (abstractC15107jG != null) {
                        fA = abstractC15107jG.b(c14209iF);
                    }
                } else {
                    AbstractC15107j abstractC15107jG2 = C15100c.this.G();
                    fA = abstractC15107jG2 != null ? abstractC15107jG2.a(c14209iF) : 1.0f;
                }
            }
            return Float.valueOf(fA);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: k6.c$e */
    static final class e extends Lambda implements Function0<Float> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf((C15100c.this.x() && C15100c.this.E() % 2 == 0) ? -C15100c.this.A() : C15100c.this.A());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: k6.c$f */
    static final class f extends Lambda implements Function0<Boolean> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C15100c.this.E() == C15100c.this.y() && C15100c.this.C() == C15100c.this.N());
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2", f = "LottieAnimatable.kt", l = {}, m = "invokeSuspend")
    /* renamed from: k6.c$g */
    static final class g extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f141476a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C14209i f141478c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f141479d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f141480e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f141481f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C14209i c14209i, float f10, int i10, boolean z10, Continuation<? super g> continuation) {
            super(1, continuation);
            this.f141478c = c14209i;
            this.f141479d = f10;
            this.f141480e = i10;
            this.f141481f = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return C15100c.this.new g(this.f141478c, this.f141479d, this.f141480e, this.f141481f, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((g) create(continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f141476a == 0) {
                ResultKt.b(obj);
                C15100c.this.V(this.f141478c);
                C15100c.this.f0(this.f141479d);
                C15100c.this.W(this.f141480e);
                C15100c.this.Z(false);
                if (this.f141481f) {
                    C15100c.this.Y(Long.MIN_VALUE);
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float N() {
        return ((Number) this.endProgress.getValue()).floatValue();
    }

    private final float O() {
        return ((Number) this.frameSpeed.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float Q() {
        return ((Number) this.progressRaw.getValue()).floatValue();
    }

    private final float T(float f10, C14209i c14209i) {
        if (c14209i == null) {
            return f10;
        }
        return f10 - (f10 % (1 / c14209i.i()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(AbstractC15107j abstractC15107j) {
        this.clipSpec.setValue(abstractC15107j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(C14209i c14209i) {
        this.composition.setValue(c14209i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(int i10) {
        this.iteration.setValue(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(int i10) {
        this.iterations.setValue(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(long j10) {
        this.lastFrameNanos.setValue(Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(boolean z10) {
        this.isPlaying.setValue(Boolean.valueOf(z10));
    }

    private void a0(float f10) {
        this.progress.setValue(Float.valueOf(f10));
    }

    private final void b0(float f10) {
        this.progressRaw.setValue(Float.valueOf(f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(boolean z10) {
        this.reverseOnRepeat.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(float f10) {
        this.speed.setValue(Float.valueOf(f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(boolean z10) {
        this.useCompositionFrameRate.setValue(Boolean.valueOf(z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k6.InterfaceC15105h
    public float A() {
        return ((Number) this.speed.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k6.InterfaceC15105h
    public float C() {
        return ((Number) this.progress.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k6.InterfaceC15105h
    public int E() {
        return ((Number) this.iteration.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k6.InterfaceC15105h
    public C14209i F() {
        return (C14209i) this.composition.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k6.InterfaceC15105h
    public AbstractC15107j G() {
        return (AbstractC15107j) this.clipSpec.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public long P() {
        return ((Number) this.lastFrameNanos.getValue()).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean R() {
        return ((Boolean) this.useCompositionFrameRate.getValue()).booleanValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.z1
    public Float getValue() {
        return Float.valueOf(C());
    }

    @Override // k6.InterfaceC15099b
    public Object h(C14209i c14209i, int i10, int i11, boolean z10, float f10, AbstractC15107j abstractC15107j, float f11, boolean z11, EnumC15106i enumC15106i, boolean z12, boolean z13, Continuation<? super Unit> continuation) {
        Object objE = C13432F.e(this.mutex, null, new a(i10, i11, z10, f10, abstractC15107j, c14209i, f11, z13, z11, enumC15106i, null), continuation, 1, null);
        return objE == IntrinsicsKt.f() ? objE : Unit.f142422a;
    }

    @Override // k6.InterfaceC15099b
    public Object r(C14209i c14209i, float f10, int i10, boolean z10, Continuation<? super Unit> continuation) {
        Object objE = C13432F.e(this.mutex, null, new g(c14209i, f10, i10, z10, null), continuation, 1, null);
        return objE == IntrinsicsKt.f() ? objE : Unit.f142422a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k6.InterfaceC15105h
    public boolean x() {
        return ((Boolean) this.reverseOnRepeat.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k6.InterfaceC15105h
    public int y() {
        return ((Number) this.iterations.getValue()).intValue();
    }

    public C15100c() {
        Boolean bool = Boolean.FALSE;
        this.isPlaying = t1.e(bool, null, 2, null);
        this.iteration = t1.e(1, null, 2, null);
        this.iterations = t1.e(1, null, 2, null);
        this.reverseOnRepeat = t1.e(bool, null, 2, null);
        this.clipSpec = t1.e(null, null, 2, null);
        this.speed = t1.e(Float.valueOf(1.0f), null, 2, null);
        this.useCompositionFrameRate = t1.e(bool, null, 2, null);
        this.frameSpeed = o1.e(new e());
        this.composition = t1.e(null, null, 2, null);
        Float fValueOf = Float.valueOf(0.0f);
        this.progressRaw = t1.e(fValueOf, null, 2, null);
        this.progress = t1.e(fValueOf, null, 2, null);
        this.lastFrameNanos = t1.e(Long.MIN_VALUE, null, 2, null);
        this.endProgress = o1.e(new d());
        this.isAtEnd = o1.e(new f());
        this.mutex = new C13432F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object M(int i10, Continuation<? super Boolean> continuation) {
        if (i10 == Integer.MAX_VALUE) {
            return C6299L.a(new b(i10), continuation);
        }
        return C5712d0.c(new C2240c(i10), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean S(int iterations, long frameNanos) {
        long jP;
        float fB;
        float fA;
        float fQ;
        float f10;
        C14209i c14209iF = F();
        if (c14209iF == null) {
            return true;
        }
        if (P() == Long.MIN_VALUE) {
            jP = 0;
        } else {
            jP = frameNanos - P();
        }
        Y(frameNanos);
        AbstractC15107j abstractC15107jG = G();
        if (abstractC15107jG != null) {
            fB = abstractC15107jG.b(c14209iF);
        } else {
            fB = 0.0f;
        }
        AbstractC15107j abstractC15107jG2 = G();
        if (abstractC15107jG2 != null) {
            fA = abstractC15107jG2.a(c14209iF);
        } else {
            fA = 1.0f;
        }
        float fD = ((jP / 1000000) / c14209iF.d()) * O();
        if (O() < 0.0f) {
            fQ = fB - (Q() + fD);
        } else {
            fQ = (Q() + fD) - fA;
        }
        if (fB == fA) {
            f0(fB);
            return false;
        }
        if (fQ < 0.0f) {
            f0(RangesKt.n(Q(), fB, fA) + fD);
        } else {
            float f11 = fA - fB;
            int i10 = (int) (fQ / f11);
            int i11 = i10 + 1;
            if (E() + i11 > iterations) {
                f0(N());
                W(iterations);
                return false;
            }
            W(E() + i11);
            float f12 = fQ - (i10 * f11);
            if (O() < 0.0f) {
                f10 = fA - f12;
            } else {
                f10 = fB + f12;
            }
            f0(f10);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(float progress) {
        b0(progress);
        if (R()) {
            progress = T(progress, F());
        }
        a0(progress);
    }
}
