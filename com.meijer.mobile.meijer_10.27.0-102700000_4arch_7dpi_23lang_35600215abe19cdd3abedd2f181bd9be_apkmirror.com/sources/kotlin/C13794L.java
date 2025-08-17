package kotlin;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.C13447n;
import g1.C14185q;
import g1.C14188u;
import g1.EnumC14186s;
import g1.InterfaceC14171c;
import g1.J;
import g1.O;
import g1.PointerInputChange;
import g1.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C0;
import qv.C16623P;
import qv.C16648k;
import qv.EnumC16624Q;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u008d\u0001\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012/\b\u0002\u0010\u000b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u0010\u001a\u00020\u0003*\u00020\u000fH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0012*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015\u001a]\u0010\u0016\u001a\u00020\u0003*\u00020\u00002/\b\u0002\u0010\u000b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0080@¢\u0006\u0004\b\u0016\u0010\u0017\u001a(\u0010\u001c\u001a\u00020\u0012*\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b\u001c\u0010\u001d\u001a(\u0010\u001e\u001a\u00020\u0012*\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0080@¢\u0006\u0004\b\u001e\u0010\u001d\u001a%\u0010!\u001a\u00020\u0018*\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010 \u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\"\u001a \u0010#\u001a\u0004\u0018\u00010\u0012*\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b#\u0010$\u001a\u001e\u0010&\u001a\u00020%*\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0080@¢\u0006\u0004\b&\u0010$\u001aN\u0010.\u001a\u00020(*\u00020'2\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020*2'\u0010-\u001a#\b\u0001\u0012\u0004\u0012\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0,¢\u0006\u0002\b\nH\u0002¢\u0006\u0004\b.\u0010/\";\u00102\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101\"\u001a\u00107\u001a\u00020*8BX\u0082\u0004¢\u0006\f\u0012\u0004\b5\u00106\u001a\u0004\b3\u00104¨\u00068"}, d2 = {"Lg1/J;", "Lkotlin/Function1;", "LU0/f;", "", "onDoubleTap", "onLongPress", "Lkotlin/Function3;", "Lf0/A;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "onPress", "onTap", "l", "(Lg1/J;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lg1/c;", "j", "(Lg1/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lg1/B;", "firstUp", "i", "(Lg1/c;Lg1/B;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "k", "(Lg1/J;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "requireUnconsumed", "Lg1/s;", "pass", "e", "(Lg1/c;ZLg1/s;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "Lg1/q;", "onlyPrimaryMouseButton", "o", "(Lg1/q;ZZ)Z", "u", "(Lg1/c;Lg1/s;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lf0/u;", "s", "Lqv/O;", "Lqv/C0;", "resetJob", "Lqv/Q;", "start", "Lkotlin/Function2;", "block", "q", "(Lqv/O;Lqv/C0;Lqv/Q;Lkotlin/jvm/functions/Function2;)Lqv/C0;", "a", "Lkotlin/jvm/functions/Function3;", "NoPressGesture", "n", "()Lqv/Q;", "getCoroutineStartForCurrentDispatchBehavior$annotations", "()V", "coroutineStartForCurrentDispatchBehavior", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: f0.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13794L {

    /* renamed from: a, reason: collision with root package name */
    private static final Function3<InterfaceC13783A, U0.f, Continuation<? super Unit>, Object> f130177a = new a(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf0/A;", "LU0/f;", "it", "", "<anonymous>", "(Lf0/A;LU0/f;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
    /* renamed from: f0.L$a */
    static final class a extends SuspendLambda implements Function3<InterfaceC13783A, U0.f, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f130178a;

        a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        public final Object d(InterfaceC13783A interfaceC13783A, long j10, Continuation<? super Unit> continuation) {
            return new a(continuation).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC13783A interfaceC13783A, U0.f fVar, Continuation<? super Unit> continuation) {
            return d(interfaceC13783A, fVar.getPackedValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f130178a == 0) {
                ResultKt.b(obj);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {291}, m = "awaitFirstDown")
    /* renamed from: f0.L$b */
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f130179a;

        /* renamed from: b, reason: collision with root package name */
        Object f130180b;

        /* renamed from: c, reason: collision with root package name */
        boolean f130181c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f130182d;

        /* renamed from: e, reason: collision with root package name */
        int f130183e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f130182d = obj;
            this.f130183e |= Integer.MIN_VALUE;
            return C13794L.e(null, false, null, this);
        }

        b(Continuation<? super b> continuation) {
            super(continuation);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {HttpResponseStatus.REDIRECTION_NOT_MODIFIED}, m = "awaitPrimaryFirstDown")
    /* renamed from: f0.L$c */
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f130184a;

        /* renamed from: b, reason: collision with root package name */
        Object f130185b;

        /* renamed from: c, reason: collision with root package name */
        boolean f130186c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f130187d;

        /* renamed from: e, reason: collision with root package name */
        int f130188e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f130187d = obj;
            this.f130188e |= Integer.MIN_VALUE;
            return C13794L.g(null, false, null, this);
        }

        c(Continuation<? super c> continuation) {
            super(continuation);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/c;", "Lg1/B;", "<anonymous>", "(Lg1/c;)Lg1/B;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {227}, m = "invokeSuspend")
    /* renamed from: f0.L$d */
    static final class d extends RestrictedSuspendLambda implements Function2<InterfaceC14171c, Continuation<? super PointerInputChange>, Object> {

        /* renamed from: b, reason: collision with root package name */
        long f130189b;

        /* renamed from: c, reason: collision with root package name */
        int f130190c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f130191d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ PointerInputChange f130192e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(PointerInputChange pointerInputChange, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f130192e = pointerInputChange;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f130192e, continuation);
            dVar.f130191d = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC14171c interfaceC14171c, Continuation<? super PointerInputChange> continuation) {
            return ((d) create(interfaceC14171c, continuation)).invokeSuspend(Unit.f142422a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0046 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0044 -> B:12:0x0047). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r11.f130190c
                r2 = 1
                if (r1 == 0) goto L1e
                if (r1 != r2) goto L16
                long r3 = r11.f130189b
                java.lang.Object r1 = r11.f130191d
                g1.c r1 = (g1.InterfaceC14171c) r1
                kotlin.ResultKt.b(r12)
                r5 = r1
                goto L47
            L16:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1e:
                kotlin.ResultKt.b(r12)
                java.lang.Object r12 = r11.f130191d
                g1.c r12 = (g1.InterfaceC14171c) r12
                g1.B r1 = r11.f130192e
                long r3 = r1.getUptimeMillis()
                androidx.compose.ui.platform.Q1 r1 = r12.getViewConfiguration()
                long r5 = r1.b()
                long r3 = r3 + r5
                r5 = r12
            L35:
                r11.f130191d = r5
                r11.f130189b = r3
                r11.f130190c = r2
                r6 = 0
                r7 = 0
                r9 = 3
                r10 = 0
                r8 = r11
                java.lang.Object r12 = kotlin.C13794L.f(r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L47
                return r0
            L47:
                g1.B r12 = (g1.PointerInputChange) r12
                long r6 = r12.getUptimeMillis()
                int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r1 < 0) goto L35
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C13794L.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {209}, m = "consumeUntilUp")
    /* renamed from: f0.L$e */
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f130193a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f130194b;

        /* renamed from: c, reason: collision with root package name */
        int f130195c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f130194b = obj;
            this.f130195c |= Integer.MIN_VALUE;
            return C13794L.j(null, this);
        }

        e(Continuation<? super e> continuation) {
            super(continuation);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {247}, m = "invokeSuspend")
    /* renamed from: f0.L$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f130196a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f130197b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ J f130198c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC13783A, U0.f, Continuation<? super Unit>, Object> f130199d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<U0.f, Unit> f130200e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C13784B f130201f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/c;", "", "<anonymous>", "(Lg1/c;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {251, 257}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: f0.L$f$a */
        static final class a extends RestrictedSuspendLambda implements Function2<InterfaceC14171c, Continuation<? super Unit>, Object> {

            /* renamed from: b, reason: collision with root package name */
            Object f130202b;

            /* renamed from: c, reason: collision with root package name */
            int f130203c;

            /* renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f130204d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f130205e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function3<InterfaceC13783A, U0.f, Continuation<? super Unit>, Object> f130206f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function1<U0.f, Unit> f130207g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ C13784B f130208h;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {254}, m = "invokeSuspend")
            /* renamed from: f0.L$f$a$a, reason: collision with other inner class name */
            static final class C2064a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f130209a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function3<InterfaceC13783A, U0.f, Continuation<? super Unit>, Object> f130210b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C13784B f130211c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ PointerInputChange f130212d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2064a(Function3<? super InterfaceC13783A, ? super U0.f, ? super Continuation<? super Unit>, ? extends Object> function3, C13784B c13784b, PointerInputChange pointerInputChange, Continuation<? super C2064a> continuation) {
                    super(2, continuation);
                    this.f130210b = function3;
                    this.f130211c = c13784b;
                    this.f130212d = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C2064a(this.f130210b, this.f130211c, this.f130212d, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C2064a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f130209a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        Function3<InterfaceC13783A, U0.f, Continuation<? super Unit>, Object> function3 = this.f130210b;
                        C13784B c13784b = this.f130211c;
                        U0.f fVarD = U0.f.d(this.f130212d.getPosition());
                        this.f130209a = 1;
                        if (function3.invoke(c13784b, fVarD, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: f0.L$f$a$b */
            static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f130213a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C13784B f130214b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C13784B c13784b, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f130214b = c13784b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f130214b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f130213a == 0) {
                        ResultKt.b(obj);
                        this.f130214b.a();
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: f0.L$f$a$c */
            static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f130215a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C13784B f130216b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(C13784B c13784b, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f130216b = c13784b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new c(this.f130216b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f130215a == 0) {
                        ResultKt.b(obj);
                        this.f130216b.f();
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1", f = "TapGestureDetector.kt", l = {249}, m = "invokeSuspend")
            /* renamed from: f0.L$f$a$d */
            static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f130217a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C13784B f130218b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(C13784B c13784b, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f130218b = c13784b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new d(this.f130218b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f130217a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C13784B c13784b = this.f130218b;
                        this.f130217a = 1;
                        if (c13784b.q(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(InterfaceC16622O interfaceC16622O, Function3<? super InterfaceC13783A, ? super U0.f, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super U0.f, Unit> function1, C13784B c13784b, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f130205e = interfaceC16622O;
                this.f130206f = function3;
                this.f130207g = function1;
                this.f130208h = c13784b;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f130205e, this.f130206f, this.f130207g, this.f130208h, continuation);
                aVar.f130204d = obj;
                return aVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
            
                if (r0 == r6) goto L19;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r17) {
                /*
                    r16 = this;
                    r3 = r16
                    java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r0 = r3.f130203c
                    r7 = 2
                    r8 = 1
                    r9 = 0
                    if (r0 == 0) goto L35
                    if (r0 == r8) goto L25
                    if (r0 != r7) goto L1d
                    java.lang.Object r0 = r3.f130204d
                    qv.C0 r0 = (qv.C0) r0
                    kotlin.ResultKt.b(r17)
                    r11 = r0
                    r0 = r17
                    goto L8d
                L1d:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L25:
                    java.lang.Object r0 = r3.f130202b
                    qv.C0 r0 = (qv.C0) r0
                    java.lang.Object r1 = r3.f130204d
                    g1.c r1 = (g1.InterfaceC14171c) r1
                    kotlin.ResultKt.b(r17)
                    r11 = r0
                    r0 = r1
                    r1 = r17
                    goto L62
                L35:
                    kotlin.ResultKt.b(r17)
                    java.lang.Object r0 = r3.f130204d
                    g1.c r0 = (g1.InterfaceC14171c) r0
                    qv.O r10 = r3.f130205e
                    qv.Q r12 = kotlin.C13794L.c()
                    f0.L$f$a$d r13 = new f0.L$f$a$d
                    f0.B r1 = r3.f130208h
                    r13.<init>(r1, r9)
                    r14 = 1
                    r15 = 0
                    r11 = 0
                    qv.C0 r10 = qv.C16644i.d(r10, r11, r12, r13, r14, r15)
                    r3.f130204d = r0
                    r3.f130202b = r10
                    r3.f130203c = r8
                    r1 = 0
                    r2 = 0
                    r4 = 3
                    r5 = 0
                    java.lang.Object r1 = kotlin.C13794L.f(r0, r1, r2, r3, r4, r5)
                    if (r1 != r6) goto L61
                    goto L8c
                L61:
                    r11 = r10
                L62:
                    g1.B r1 = (g1.PointerInputChange) r1
                    r1.a()
                    kotlin.jvm.functions.Function3<f0.A, U0.f, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r2 = r3.f130206f
                    kotlin.jvm.functions.Function3 r4 = kotlin.C13794L.d()
                    if (r2 == r4) goto L80
                    qv.O r10 = r3.f130205e
                    f0.L$f$a$a r13 = new f0.L$f$a$a
                    kotlin.jvm.functions.Function3<f0.A, U0.f, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r2 = r3.f130206f
                    f0.B r4 = r3.f130208h
                    r13.<init>(r2, r4, r1, r9)
                    r14 = 2
                    r15 = 0
                    r12 = 0
                    kotlin.C13794L.r(r10, r11, r12, r13, r14, r15)
                L80:
                    r3.f130204d = r11
                    r3.f130202b = r9
                    r3.f130203c = r7
                    java.lang.Object r0 = kotlin.C13794L.v(r0, r9, r3, r8, r9)
                    if (r0 != r6) goto L8d
                L8c:
                    return r6
                L8d:
                    g1.B r0 = (g1.PointerInputChange) r0
                    if (r0 != 0) goto La1
                    qv.O r10 = r3.f130205e
                    f0.L$f$a$b r13 = new f0.L$f$a$b
                    f0.B r0 = r3.f130208h
                    r13.<init>(r0, r9)
                    r14 = 2
                    r15 = 0
                    r12 = 0
                    kotlin.C13794L.r(r10, r11, r12, r13, r14, r15)
                    goto Lc2
                La1:
                    r0.a()
                    qv.O r10 = r3.f130205e
                    f0.L$f$a$c r13 = new f0.L$f$a$c
                    f0.B r1 = r3.f130208h
                    r13.<init>(r1, r9)
                    r14 = 2
                    r15 = 0
                    r12 = 0
                    kotlin.C13794L.r(r10, r11, r12, r13, r14, r15)
                    kotlin.jvm.functions.Function1<U0.f, kotlin.Unit> r1 = r3.f130207g
                    if (r1 == 0) goto Lc2
                    long r4 = r0.getPosition()
                    U0.f r0 = U0.f.d(r4)
                    r1.invoke(r0)
                Lc2:
                    kotlin.Unit r0 = kotlin.Unit.f142422a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.C13794L.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC14171c interfaceC14171c, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC14171c, continuation)).invokeSuspend(Unit.f142422a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(J j10, Function3<? super InterfaceC13783A, ? super U0.f, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super U0.f, Unit> function1, C13784B c13784b, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f130198c = j10;
            this.f130199d = function3;
            this.f130200e = function1;
            this.f130201f = c13784b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = new f(this.f130198c, this.f130199d, this.f130200e, this.f130201f, continuation);
            fVar.f130197b = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f130196a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f130197b;
                J j10 = this.f130198c;
                a aVar = new a(interfaceC16622O, this.f130199d, this.f130200e, this.f130201f, null);
                this.f130196a = 1;
                if (C13821t.d(j10, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {104}, m = "invokeSuspend")
    /* renamed from: f0.L$g */
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f130219a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f130220b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ J f130221c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC13783A, U0.f, Continuation<? super Unit>, Object> f130222d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<U0.f, Unit> f130223e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<U0.f, Unit> f130224f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<U0.f, Unit> f130225g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/c;", "", "<anonymous>", "(Lg1/c;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {105, 116, 119, 122, 149, 167, 169, 180}, m = "invokeSuspend")
        /* renamed from: f0.L$g$a */
        static final class a extends RestrictedSuspendLambda implements Function2<InterfaceC14171c, Continuation<? super Unit>, Object> {

            /* renamed from: b, reason: collision with root package name */
            Object f130226b;

            /* renamed from: c, reason: collision with root package name */
            Object f130227c;

            /* renamed from: d, reason: collision with root package name */
            Object f130228d;

            /* renamed from: e, reason: collision with root package name */
            int f130229e;

            /* renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f130230f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f130231g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function3<InterfaceC13783A, U0.f, Continuation<? super Unit>, Object> f130232h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function1<U0.f, Unit> f130233i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Function1<U0.f, Unit> f130234j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ Function1<U0.f, Unit> f130235k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ C13784B f130236l;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", l = {110}, m = "invokeSuspend")
            /* renamed from: f0.L$g$a$a, reason: collision with other inner class name */
            static final class C2065a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f130237a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function3<InterfaceC13783A, U0.f, Continuation<? super Unit>, Object> f130238b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C13784B f130239c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ PointerInputChange f130240d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2065a(Function3<? super InterfaceC13783A, ? super U0.f, ? super Continuation<? super Unit>, ? extends Object> function3, C13784B c13784b, PointerInputChange pointerInputChange, Continuation<? super C2065a> continuation) {
                    super(2, continuation);
                    this.f130238b = function3;
                    this.f130239c = c13784b;
                    this.f130240d = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C2065a(this.f130238b, this.f130239c, this.f130240d, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C2065a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f130237a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        Function3<InterfaceC13783A, U0.f, Continuation<? super Unit>, Object> function3 = this.f130238b;
                        C13784B c13784b = this.f130239c;
                        U0.f fVarD = U0.f.d(this.f130240d.getPosition());
                        this.f130237a = 1;
                        if (function3.invoke(c13784b, fVarD, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: f0.L$g$a$b */
            static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f130241a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C13784B f130242b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C13784B c13784b, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f130242b = c13784b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f130242b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f130241a == 0) {
                        ResultKt.b(obj);
                        this.f130242b.f();
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: f0.L$g$a$c */
            static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f130243a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C13784B f130244b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(C13784B c13784b, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f130244b = c13784b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new c(this.f130244b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f130243a == 0) {
                        ResultKt.b(obj);
                        this.f130244b.a();
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: f0.L$g$a$d */
            static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f130245a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C13784B f130246b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(C13784B c13784b, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f130246b = c13784b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new d(this.f130246b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f130245a == 0) {
                        ResultKt.b(obj);
                        this.f130246b.f();
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", l = {157, 158}, m = "invokeSuspend")
            /* renamed from: f0.L$g$a$e */
            static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f130247a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C0 f130248b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C13784B f130249c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(C0 c02, C13784B c13784b, Continuation<? super e> continuation) {
                    super(2, continuation);
                    this.f130248b = c02;
                    this.f130249c = c13784b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new e(this.f130248b, this.f130249c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
                
                    if (r5.q(r4) == r0) goto L15;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                    /*
                        r4 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                        int r1 = r4.f130247a
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L1e
                        if (r1 == r3) goto L1a
                        if (r1 != r2) goto L12
                        kotlin.ResultKt.b(r5)
                        goto L37
                    L12:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    L1a:
                        kotlin.ResultKt.b(r5)
                        goto L2c
                    L1e:
                        kotlin.ResultKt.b(r5)
                        qv.C0 r5 = r4.f130248b
                        r4.f130247a = r3
                        java.lang.Object r5 = r5.n0(r4)
                        if (r5 != r0) goto L2c
                        goto L36
                    L2c:
                        f0.B r5 = r4.f130249c
                        r4.f130247a = r2
                        java.lang.Object r5 = r5.q(r4)
                        if (r5 != r0) goto L37
                    L36:
                        return r0
                    L37:
                        kotlin.Unit r5 = kotlin.Unit.f142422a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.C13794L.g.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", l = {161}, m = "invokeSuspend")
            /* renamed from: f0.L$g$a$f */
            static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f130250a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function3<InterfaceC13783A, U0.f, Continuation<? super Unit>, Object> f130251b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C13784B f130252c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ PointerInputChange f130253d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                f(Function3<? super InterfaceC13783A, ? super U0.f, ? super Continuation<? super Unit>, ? extends Object> function3, C13784B c13784b, PointerInputChange pointerInputChange, Continuation<? super f> continuation) {
                    super(2, continuation);
                    this.f130251b = function3;
                    this.f130252c = c13784b;
                    this.f130253d = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new f(this.f130251b, this.f130252c, this.f130253d, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f130250a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        Function3<InterfaceC13783A, U0.f, Continuation<? super Unit>, Object> function3 = this.f130251b;
                        C13784B c13784b = this.f130252c;
                        U0.f fVarD = U0.f.d(this.f130253d.getPosition());
                        this.f130250a = 1;
                        if (function3.invoke(c13784b, fVarD, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: f0.L$g$a$g, reason: collision with other inner class name */
            static final class C2066g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f130254a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C13784B f130255b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2066g(C13784B c13784b, Continuation<? super C2066g> continuation) {
                    super(2, continuation);
                    this.f130255b = c13784b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C2066g(this.f130255b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C2066g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f130254a == 0) {
                        ResultKt.b(obj);
                        this.f130255b.f();
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: f0.L$g$a$h */
            static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f130256a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C13784B f130257b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                h(C13784B c13784b, Continuation<? super h> continuation) {
                    super(2, continuation);
                    this.f130257b = c13784b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new h(this.f130257b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f130256a == 0) {
                        ResultKt.b(obj);
                        this.f130257b.a();
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$resetJob$1", f = "TapGestureDetector.kt", l = {108}, m = "invokeSuspend")
            /* renamed from: f0.L$g$a$i */
            static final class i extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f130258a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C13784B f130259b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                i(C13784B c13784b, Continuation<? super i> continuation) {
                    super(2, continuation);
                    this.f130259b = c13784b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new i(this.f130259b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((i) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f130258a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C13784B c13784b = this.f130259b;
                        this.f130258a = 1;
                        if (c13784b.q(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: f0.L$g$a$j */
            static final class j extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f130260a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C13784B f130261b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                j(C13784B c13784b, Continuation<? super j> continuation) {
                    super(2, continuation);
                    this.f130261b = c13784b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new j(this.f130261b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((j) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f130260a == 0) {
                        ResultKt.b(obj);
                        this.f130261b.f();
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(InterfaceC16622O interfaceC16622O, Function3<? super InterfaceC13783A, ? super U0.f, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super U0.f, Unit> function1, Function1<? super U0.f, Unit> function12, Function1<? super U0.f, Unit> function13, C13784B c13784b, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f130231g = interfaceC16622O;
                this.f130232h = function3;
                this.f130233i = function1;
                this.f130234j = function12;
                this.f130235k = function13;
                this.f130236l = c13784b;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f130231g, this.f130232h, this.f130233i, this.f130234j, this.f130235k, this.f130236l, continuation);
                aVar.f130230f = obj;
                return aVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x00ee, code lost:
            
                if (r1 == r6) goto L80;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x012b, code lost:
            
                if (kotlin.C13794L.j(r2, r22) == r6) goto L80;
             */
            /* JADX WARN: Removed duplicated region for block: B:21:0x00c7  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00e3  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00f6  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0111  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x0141  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x0154  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0165  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x017a  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x01a4  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x01b5  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0229  */
            /* JADX WARN: Removed duplicated region for block: B:84:0x025c  */
            /* JADX WARN: Removed duplicated region for block: B:91:0x0273  */
            /* JADX WARN: Removed duplicated region for block: B:92:0x0293  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r23) {
                /*
                    Method dump skipped, instructions count: 728
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.C13794L.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC14171c interfaceC14171c, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC14171c, continuation)).invokeSuspend(Unit.f142422a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(J j10, Function3<? super InterfaceC13783A, ? super U0.f, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super U0.f, Unit> function1, Function1<? super U0.f, Unit> function12, Function1<? super U0.f, Unit> function13, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f130221c = j10;
            this.f130222d = function3;
            this.f130223e = function1;
            this.f130224f = function12;
            this.f130225g = function13;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = new g(this.f130221c, this.f130222d, this.f130223e, this.f130224f, this.f130225g, continuation);
            gVar.f130220b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f130219a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f130220b;
                C13784B c13784b = new C13784B(this.f130221c);
                J j10 = this.f130221c;
                a aVar = new a(interfaceC16622O, this.f130222d, this.f130223e, this.f130224f, this.f130225g, c13784b, null);
                this.f130219a = 1;
                if (C13821t.d(j10, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1", f = "TapGestureDetector.kt", l = {HttpResponseStatus.ERROR_BAD_GATEWAY, HttpResponseStatus.ERROR_GATEWAY_TIMEOUT}, m = "invokeSuspend")
    /* renamed from: f0.L$h */
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f130262a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f130263b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C0 f130264c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC16622O, Continuation<? super Unit>, Object> f130265d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(C0 c02, Function2<? super InterfaceC16622O, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f130264c = c02;
            this.f130265d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            h hVar = new h(this.f130264c, this.f130265d, continuation);
            hVar.f130263b = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        
            if (r5.invoke(r1, r4) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r4.f130262a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r5)
                goto L49
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.f130263b
                qv.O r1 = (qv.InterfaceC16622O) r1
                kotlin.ResultKt.b(r5)
                goto L3b
            L22:
                kotlin.ResultKt.b(r5)
                java.lang.Object r5 = r4.f130263b
                r1 = r5
                qv.O r1 = (qv.InterfaceC16622O) r1
                boolean r5 = d0.C13447n.isDetectTapGesturesImmediateCoroutineDispatchEnabled
                if (r5 == 0) goto L3b
                qv.C0 r5 = r4.f130264c
                r4.f130263b = r1
                r4.f130262a = r3
                java.lang.Object r5 = r5.n0(r4)
                if (r5 != r0) goto L3b
                goto L48
            L3b:
                kotlin.jvm.functions.Function2<qv.O, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r5 = r4.f130265d
                r3 = 0
                r4.f130263b = r3
                r4.f130262a = r2
                java.lang.Object r5 = r5.invoke(r1, r4)
                if (r5 != r0) goto L49
            L48:
                return r0
            L49:
                kotlin.Unit r5 = kotlin.Unit.f142422a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C13794L.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {384}, m = "waitForLongPress")
    /* renamed from: f0.L$i */
    static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f130266a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f130267b;

        /* renamed from: c, reason: collision with root package name */
        int f130268c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f130267b = obj;
            this.f130268c |= Integer.MIN_VALUE;
            return C13794L.s(null, null, this);
        }

        i(Continuation<? super i> continuation) {
            super(continuation);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/c;", "", "<anonymous>", "(Lg1/c;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2", f = "TapGestureDetector.kt", l = {386, HttpResponseStatus.ERROR_CONFLICT}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: f0.L$j */
    static final class j extends RestrictedSuspendLambda implements Function2<InterfaceC14171c, Continuation<? super Unit>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f130269b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f130270c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ EnumC14186s f130271d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<AbstractC13822u> f130272e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(EnumC14186s enumC14186s, Ref.ObjectRef<AbstractC13822u> objectRef, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f130271d = enumC14186s;
            this.f130272e = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            j jVar = new j(this.f130271d, this.f130272e, continuation);
            jVar.f130270c = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC14171c interfaceC14171c, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC14171c, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
        
            if (kotlin.C13795M.b(r14) == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
        
            r13.f130272e.f142835a = kotlin.AbstractC13822u.c.f130511a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
        
            r14 = r14.c();
            r5 = r14.size();
            r6 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
        
            if (r6 >= r5) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
        
            r7 = r14.get(r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
        
            if (r7.p() != false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
        
            if (g1.r.g(r7, r1.c(), r1.A0()) == false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
        
            r6 = r6 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
        
            r13.f130272e.f142835a = kotlin.AbstractC13822u.a.f130509a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
        
            r14 = g1.EnumC14186s.f132680c;
            r13.f130270c = r1;
            r13.f130269b = 2;
            r14 = r1.K0(r14, r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
        
            if (r14 != r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
        
            r13.f130272e.f142835a = kotlin.AbstractC13822u.a.f130509a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
        
            return kotlin.Unit.f142422a;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00d7 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v2, types: [T, f0.u$a] */
        /* JADX WARN: Type inference failed for: r0v3, types: [T, f0.u$c] */
        /* JADX WARN: Type inference failed for: r0v4, types: [T, f0.u$a] */
        /* JADX WARN: Type inference failed for: r1v2, types: [T, f0.u$b] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a7 -> B:34:0x00aa). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 237
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C13794L.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {352, 366}, m = "waitForUpOrCancellation")
    /* renamed from: f0.L$k */
    static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f130273a;

        /* renamed from: b, reason: collision with root package name */
        Object f130274b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f130275c;

        /* renamed from: d, reason: collision with root package name */
        int f130276d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f130275c = obj;
            this.f130276d |= Integer.MIN_VALUE;
            return C13794L.u(null, null, this);
        }

        k(Continuation<? super k> continuation) {
            super(continuation);
        }
    }

    private static final boolean o(C14185q c14185q, boolean z10, boolean z11) {
        if (z11) {
            List<PointerInputChange> listC = c14185q.c();
            int size = listC.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (!O.g(listC.get(i10).getType(), O.INSTANCE.b())) {
                        break;
                    }
                    i10++;
                } else if (!C14188u.b(c14185q.getButtons())) {
                    return false;
                }
            }
        }
        List<PointerInputChange> listC2 = c14185q.c();
        int size2 = listC2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            PointerInputChange pointerInputChange = listC2.get(i11);
            if (!(z10 ? r.a(pointerInputChange) : r.b(pointerInputChange))) {
                return false;
            }
        }
        return true;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:18:0x0051). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(g1.InterfaceC14171c r7, boolean r8, g1.EnumC14186s r9, kotlin.coroutines.Continuation<? super g1.PointerInputChange> r10) {
        /*
            boolean r0 = r10 instanceof kotlin.C13794L.b
            if (r0 == 0) goto L13
            r0 = r10
            f0.L$b r0 = (kotlin.C13794L.b) r0
            int r1 = r0.f130183e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f130183e = r1
            goto L18
        L13:
            f0.L$b r0 = new f0.L$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f130182d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f130183e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r7 = r0.f130181c
            java.lang.Object r8 = r0.f130180b
            g1.s r8 = (g1.EnumC14186s) r8
            java.lang.Object r9 = r0.f130179a
            g1.c r9 = (g1.InterfaceC14171c) r9
            kotlin.ResultKt.b(r10)
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
            goto L51
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            kotlin.ResultKt.b(r10)
        L42:
            r0.f130179a = r7
            r0.f130180b = r9
            r0.f130181c = r8
            r0.f130183e = r3
            java.lang.Object r10 = r7.K0(r9, r0)
            if (r10 != r1) goto L51
            return r1
        L51:
            g1.q r10 = (g1.C14185q) r10
            r2 = 2
            r4 = 0
            r5 = 0
            boolean r2 = p(r10, r8, r5, r2, r4)
            if (r2 == 0) goto L42
            java.util.List r7 = r10.c()
            java.lang.Object r7 = r7.get(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C13794L.e(g1.c, boolean, g1.s, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object f(InterfaceC14171c interfaceC14171c, boolean z10, EnumC14186s enumC14186s, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            enumC14186s = EnumC14186s.f132679b;
        }
        return e(interfaceC14171c, z10, enumC14186s, continuation);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:18:0x0051). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(g1.InterfaceC14171c r5, boolean r6, g1.EnumC14186s r7, kotlin.coroutines.Continuation<? super g1.PointerInputChange> r8) {
        /*
            boolean r0 = r8 instanceof kotlin.C13794L.c
            if (r0 == 0) goto L13
            r0 = r8
            f0.L$c r0 = (kotlin.C13794L.c) r0
            int r1 = r0.f130188e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f130188e = r1
            goto L18
        L13:
            f0.L$c r0 = new f0.L$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f130187d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f130188e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r5 = r0.f130186c
            java.lang.Object r6 = r0.f130185b
            g1.s r6 = (g1.EnumC14186s) r6
            java.lang.Object r7 = r0.f130184a
            g1.c r7 = (g1.InterfaceC14171c) r7
            kotlin.ResultKt.b(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L51
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            kotlin.ResultKt.b(r8)
        L42:
            r0.f130184a = r5
            r0.f130185b = r7
            r0.f130186c = r6
            r0.f130188e = r3
            java.lang.Object r8 = r5.K0(r7, r0)
            if (r8 != r1) goto L51
            return r1
        L51:
            g1.q r8 = (g1.C14185q) r8
            boolean r2 = o(r8, r6, r3)
            if (r2 == 0) goto L42
            java.util.List r5 = r8.c()
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C13794L.g(g1.c, boolean, g1.s, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object h(InterfaceC14171c interfaceC14171c, boolean z10, EnumC14186s enumC14186s, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            enumC14186s = EnumC14186s.f132679b;
        }
        return g(interfaceC14171c, z10, enumC14186s, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055 A[LOOP:0: B:19:0x0053->B:20:0x0055, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(g1.InterfaceC14171c r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof kotlin.C13794L.e
            if (r0 == 0) goto L13
            r0 = r9
            f0.L$e r0 = (kotlin.C13794L.e) r0
            int r1 = r0.f130195c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f130195c = r1
            goto L18
        L13:
            f0.L$e r0 = new f0.L$e
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f130194b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f130195c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f130193a
            g1.c r8 = (g1.InterfaceC14171c) r8
            kotlin.ResultKt.b(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.ResultKt.b(r9)
        L38:
            r0.f130193a = r8
            r0.f130195c = r3
            r9 = 0
            java.lang.Object r9 = g1.InterfaceC14171c.G1(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            g1.q r9 = (g1.C14185q) r9
            java.util.List r2 = r9.c()
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
            r6 = r5
        L53:
            if (r6 >= r4) goto L61
            java.lang.Object r7 = r2.get(r6)
            g1.B r7 = (g1.PointerInputChange) r7
            r7.a()
            int r6 = r6 + 1
            goto L53
        L61:
            java.util.List r9 = r9.c()
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
        L6c:
            if (r5 >= r2) goto L7e
            java.lang.Object r4 = r9.get(r5)
            g1.B r4 = (g1.PointerInputChange) r4
            boolean r4 = r4.getPressed()
            if (r4 == 0) goto L7b
            goto L38
        L7b:
            int r5 = r5 + 1
            goto L6c
        L7e:
            kotlin.Unit r8 = kotlin.Unit.f142422a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C13794L.j(g1.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object k(J j10, Function3<? super InterfaceC13783A, ? super U0.f, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super U0.f, Unit> function1, Continuation<? super Unit> continuation) {
        Object objG = C16623P.g(new f(j10, function3, function1, new C13784B(j10), null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f142422a;
    }

    public static final Object l(J j10, Function1<? super U0.f, Unit> function1, Function1<? super U0.f, Unit> function12, Function3<? super InterfaceC13783A, ? super U0.f, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super U0.f, Unit> function13, Continuation<? super Unit> continuation) {
        Object objG = C16623P.g(new g(j10, function3, function12, function1, function13, null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f142422a;
    }

    public static /* synthetic */ Object m(J j10, Function1 function1, Function1 function12, Function3 function3, Function1 function13, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = null;
        }
        if ((i10 & 2) != 0) {
            function12 = null;
        }
        if ((i10 & 4) != 0) {
            function3 = f130177a;
        }
        if ((i10 & 8) != 0) {
            function13 = null;
        }
        return l(j10, function1, function12, function3, function13, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnumC16624Q n() {
        return C13447n.isDetectTapGesturesImmediateCoroutineDispatchEnabled ? EnumC16624Q.f157614d : EnumC16624Q.f157611a;
    }

    static /* synthetic */ boolean p(C14185q c14185q, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = C13795M.a();
        }
        return o(c14185q, z10, z11);
    }

    private static final C0 q(InterfaceC16622O interfaceC16622O, C0 c02, EnumC16624Q enumC16624Q, Function2<? super InterfaceC16622O, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return C16648k.d(interfaceC16622O, null, enumC16624Q, new h(c02, function2, null), 1, null);
    }

    static /* synthetic */ C0 r(InterfaceC16622O interfaceC16622O, C0 c02, EnumC16624Q enumC16624Q, Function2 function2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            enumC16624Q = n();
        }
        return q(interfaceC16622O, c02, enumC16624Q, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, f0.u$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(g1.InterfaceC14171c r7, g1.EnumC14186s r8, kotlin.coroutines.Continuation<? super kotlin.AbstractC13822u> r9) {
        /*
            boolean r0 = r9 instanceof kotlin.C13794L.i
            if (r0 == 0) goto L13
            r0 = r9
            f0.L$i r0 = (kotlin.C13794L.i) r0
            int r1 = r0.f130268c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f130268c = r1
            goto L18
        L13:
            f0.L$i r0 = new f0.L$i
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f130267b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f130268c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f130266a
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
            kotlin.ResultKt.b(r9)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            goto L5b
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.ResultKt.b(r9)
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            f0.u$a r2 = kotlin.AbstractC13822u.a.f130509a
            r9.f142835a = r2
            androidx.compose.ui.platform.Q1 r2 = r7.getViewConfiguration()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            long r4 = r2.c()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            f0.L$j r2 = new f0.L$j     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            r6 = 0
            r2.<init>(r8, r9, r6)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            r0.f130266a = r9     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            r0.f130268c = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            java.lang.Object r7 = r7.H0(r4, r2, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            if (r7 != r1) goto L5a
            return r1
        L5a:
            r7 = r9
        L5b:
            T r7 = r7.f142835a
            return r7
        L5e:
            f0.u$c r7 = kotlin.AbstractC13822u.c.f130511a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C13794L.s(g1.c, g1.s, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object t(InterfaceC14171c interfaceC14171c, EnumC14186s enumC14186s, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC14186s = EnumC14186s.f132679b;
        }
        return s(interfaceC14171c, enumC14186s, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b9, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
    
        if (r0 == r2) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c6 -> B:13:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(g1.InterfaceC14171c r17, g1.EnumC14186s r18, kotlin.coroutines.Continuation<? super g1.PointerInputChange> r19) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C13794L.u(g1.c, g1.s, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object v(InterfaceC14171c interfaceC14171c, EnumC14186s enumC14186s, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC14186s = EnumC14186s.f132679b;
        }
        return u(interfaceC14171c, enumC14186s, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(InterfaceC14171c interfaceC14171c, PointerInputChange pointerInputChange, Continuation<? super PointerInputChange> continuation) {
        return interfaceC14171c.i0(interfaceC14171c.getViewConfiguration().a(), new d(pointerInputChange, null), continuation);
    }
}
