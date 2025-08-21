package kotlin;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.C13580n;
import g1.C14314q;
import g1.C14317u;
import g1.EnumC14315s;
import g1.InterfaceC14300c;
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
import mv.C0;
import mv.C15784P;
import mv.C15809k;
import mv.EnumC15785Q;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u008d\u0001\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012/\b\u0002\u0010\u000b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u0010\u001a\u00020\u0003*\u00020\u000fH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0012*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015\u001a]\u0010\u0016\u001a\u00020\u0003*\u00020\u00002/\b\u0002\u0010\u000b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0080@¢\u0006\u0004\b\u0016\u0010\u0017\u001a(\u0010\u001c\u001a\u00020\u0012*\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b\u001c\u0010\u001d\u001a(\u0010\u001e\u001a\u00020\u0012*\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0080@¢\u0006\u0004\b\u001e\u0010\u001d\u001a%\u0010!\u001a\u00020\u0018*\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010 \u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\"\u001a \u0010#\u001a\u0004\u0018\u00010\u0012*\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b#\u0010$\u001a\u001e\u0010&\u001a\u00020%*\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0080@¢\u0006\u0004\b&\u0010$\u001aN\u0010.\u001a\u00020(*\u00020'2\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020*2'\u0010-\u001a#\b\u0001\u0012\u0004\u0012\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0,¢\u0006\u0002\b\nH\u0002¢\u0006\u0004\b.\u0010/\";\u00102\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101\"\u001a\u00107\u001a\u00020*8BX\u0082\u0004¢\u0006\f\u0012\u0004\b5\u00106\u001a\u0004\b3\u00104¨\u00068"}, d2 = {"Lg1/J;", "Lkotlin/Function1;", "LU0/f;", "", "onDoubleTap", "onLongPress", "Lkotlin/Function3;", "Lf0/A;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "onPress", "onTap", "l", "(Lg1/J;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lg1/c;", "j", "(Lg1/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lg1/B;", "firstUp", "i", "(Lg1/c;Lg1/B;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "k", "(Lg1/J;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "requireUnconsumed", "Lg1/s;", "pass", "e", "(Lg1/c;ZLg1/s;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "Lg1/q;", "onlyPrimaryMouseButton", "o", "(Lg1/q;ZZ)Z", "u", "(Lg1/c;Lg1/s;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lf0/u;", "s", "Lmv/O;", "Lmv/C0;", "resetJob", "Lmv/Q;", "start", "Lkotlin/Function2;", "block", "q", "(Lmv/O;Lmv/C0;Lmv/Q;Lkotlin/jvm/functions/Function2;)Lmv/C0;", "a", "Lkotlin/jvm/functions/Function3;", "NoPressGesture", "n", "()Lmv/Q;", "getCoroutineStartForCurrentDispatchBehavior$annotations", "()V", "coroutineStartForCurrentDispatchBehavior", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: f0.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13904L {

    /* renamed from: a, reason: collision with root package name */
    private static final Function3<InterfaceC13893A, U0.f, Continuation<? super Unit>, Object> f131011a = new a(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf0/A;", "LU0/f;", "it", "", "<anonymous>", "(Lf0/A;LU0/f;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
    /* renamed from: f0.L$a */
    static final class a extends SuspendLambda implements Function3<InterfaceC13893A, U0.f, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f131012a;

        a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        public final Object d(InterfaceC13893A interfaceC13893A, long j10, Continuation<? super Unit> continuation) {
            return new a(continuation).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC13893A interfaceC13893A, U0.f fVar, Continuation<? super Unit> continuation) {
            return d(interfaceC13893A, fVar.getPackedValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f131012a == 0) {
                ResultKt.b(obj);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {291}, m = "awaitFirstDown")
    /* renamed from: f0.L$b */
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f131013a;

        /* renamed from: b, reason: collision with root package name */
        Object f131014b;

        /* renamed from: c, reason: collision with root package name */
        boolean f131015c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f131016d;

        /* renamed from: e, reason: collision with root package name */
        int f131017e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f131016d = obj;
            this.f131017e |= Integer.MIN_VALUE;
            return C13904L.e(null, false, null, this);
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
        Object f131018a;

        /* renamed from: b, reason: collision with root package name */
        Object f131019b;

        /* renamed from: c, reason: collision with root package name */
        boolean f131020c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f131021d;

        /* renamed from: e, reason: collision with root package name */
        int f131022e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f131021d = obj;
            this.f131022e |= Integer.MIN_VALUE;
            return C13904L.g(null, false, null, this);
        }

        c(Continuation<? super c> continuation) {
            super(continuation);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/c;", "Lg1/B;", "<anonymous>", "(Lg1/c;)Lg1/B;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {227}, m = "invokeSuspend")
    /* renamed from: f0.L$d */
    static final class d extends RestrictedSuspendLambda implements Function2<InterfaceC14300c, Continuation<? super PointerInputChange>, Object> {

        /* renamed from: b, reason: collision with root package name */
        long f131023b;

        /* renamed from: c, reason: collision with root package name */
        int f131024c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f131025d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ PointerInputChange f131026e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(PointerInputChange pointerInputChange, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f131026e = pointerInputChange;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f131026e, continuation);
            dVar.f131025d = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC14300c interfaceC14300c, Continuation<? super PointerInputChange> continuation) {
            return ((d) create(interfaceC14300c, continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r11.f131024c
                r2 = 1
                if (r1 == 0) goto L1e
                if (r1 != r2) goto L16
                long r3 = r11.f131023b
                java.lang.Object r1 = r11.f131025d
                g1.c r1 = (g1.InterfaceC14300c) r1
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
                java.lang.Object r12 = r11.f131025d
                g1.c r12 = (g1.InterfaceC14300c) r12
                g1.B r1 = r11.f131026e
                long r3 = r1.getUptimeMillis()
                androidx.compose.ui.platform.Q1 r1 = r12.getViewConfiguration()
                long r5 = r1.b()
                long r3 = r3 + r5
                r5 = r12
            L35:
                r11.f131025d = r5
                r11.f131023b = r3
                r11.f131024c = r2
                r6 = 0
                r7 = 0
                r9 = 3
                r10 = 0
                r8 = r11
                java.lang.Object r12 = kotlin.C13904L.f(r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L47
                return r0
            L47:
                g1.B r12 = (g1.PointerInputChange) r12
                long r6 = r12.getUptimeMillis()
                int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r1 < 0) goto L35
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C13904L.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {209}, m = "consumeUntilUp")
    /* renamed from: f0.L$e */
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f131027a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f131028b;

        /* renamed from: c, reason: collision with root package name */
        int f131029c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f131028b = obj;
            this.f131029c |= Integer.MIN_VALUE;
            return C13904L.j(null, this);
        }

        e(Continuation<? super e> continuation) {
            super(continuation);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {247}, m = "invokeSuspend")
    /* renamed from: f0.L$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f131030a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f131031b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ J f131032c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC13893A, U0.f, Continuation<? super Unit>, Object> f131033d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<U0.f, Unit> f131034e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C13894B f131035f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/c;", "", "<anonymous>", "(Lg1/c;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {251, 257}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: f0.L$f$a */
        static final class a extends RestrictedSuspendLambda implements Function2<InterfaceC14300c, Continuation<? super Unit>, Object> {

            /* renamed from: b, reason: collision with root package name */
            Object f131036b;

            /* renamed from: c, reason: collision with root package name */
            int f131037c;

            /* renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f131038d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f131039e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function3<InterfaceC13893A, U0.f, Continuation<? super Unit>, Object> f131040f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function1<U0.f, Unit> f131041g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ C13894B f131042h;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {254}, m = "invokeSuspend")
            /* renamed from: f0.L$f$a$a, reason: collision with other inner class name */
            static final class C2074a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f131043a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function3<InterfaceC13893A, U0.f, Continuation<? super Unit>, Object> f131044b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C13894B f131045c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ PointerInputChange f131046d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2074a(Function3<? super InterfaceC13893A, ? super U0.f, ? super Continuation<? super Unit>, ? extends Object> function3, C13894B c13894b, PointerInputChange pointerInputChange, Continuation<? super C2074a> continuation) {
                    super(2, continuation);
                    this.f131044b = function3;
                    this.f131045c = c13894b;
                    this.f131046d = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C2074a(this.f131044b, this.f131045c, this.f131046d, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C2074a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f131043a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        Function3<InterfaceC13893A, U0.f, Continuation<? super Unit>, Object> function3 = this.f131044b;
                        C13894B c13894b = this.f131045c;
                        U0.f fVarD = U0.f.d(this.f131046d.getPosition());
                        this.f131043a = 1;
                        if (function3.invoke(c13894b, fVarD, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: f0.L$f$a$b */
            static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f131047a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C13894B f131048b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C13894B c13894b, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f131048b = c13894b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f131048b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f131047a == 0) {
                        ResultKt.b(obj);
                        this.f131048b.a();
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: f0.L$f$a$c */
            static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f131049a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C13894B f131050b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(C13894B c13894b, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f131050b = c13894b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new c(this.f131050b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f131049a == 0) {
                        ResultKt.b(obj);
                        this.f131050b.f();
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1", f = "TapGestureDetector.kt", l = {249}, m = "invokeSuspend")
            /* renamed from: f0.L$f$a$d */
            static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f131051a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C13894B f131052b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(C13894B c13894b, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f131052b = c13894b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new d(this.f131052b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f131051a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C13894B c13894b = this.f131052b;
                        this.f131051a = 1;
                        if (c13894b.q(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(InterfaceC15783O interfaceC15783O, Function3<? super InterfaceC13893A, ? super U0.f, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super U0.f, Unit> function1, C13894B c13894b, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f131039e = interfaceC15783O;
                this.f131040f = function3;
                this.f131041g = function1;
                this.f131042h = c13894b;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f131039e, this.f131040f, this.f131041g, this.f131042h, continuation);
                aVar.f131038d = obj;
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
                    int r0 = r3.f131037c
                    r7 = 2
                    r8 = 1
                    r9 = 0
                    if (r0 == 0) goto L35
                    if (r0 == r8) goto L25
                    if (r0 != r7) goto L1d
                    java.lang.Object r0 = r3.f131038d
                    mv.C0 r0 = (mv.C0) r0
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
                    java.lang.Object r0 = r3.f131036b
                    mv.C0 r0 = (mv.C0) r0
                    java.lang.Object r1 = r3.f131038d
                    g1.c r1 = (g1.InterfaceC14300c) r1
                    kotlin.ResultKt.b(r17)
                    r11 = r0
                    r0 = r1
                    r1 = r17
                    goto L62
                L35:
                    kotlin.ResultKt.b(r17)
                    java.lang.Object r0 = r3.f131038d
                    g1.c r0 = (g1.InterfaceC14300c) r0
                    mv.O r10 = r3.f131039e
                    mv.Q r12 = kotlin.C13904L.c()
                    f0.L$f$a$d r13 = new f0.L$f$a$d
                    f0.B r1 = r3.f131042h
                    r13.<init>(r1, r9)
                    r14 = 1
                    r15 = 0
                    r11 = 0
                    mv.C0 r10 = mv.C15805i.d(r10, r11, r12, r13, r14, r15)
                    r3.f131038d = r0
                    r3.f131036b = r10
                    r3.f131037c = r8
                    r1 = 0
                    r2 = 0
                    r4 = 3
                    r5 = 0
                    java.lang.Object r1 = kotlin.C13904L.f(r0, r1, r2, r3, r4, r5)
                    if (r1 != r6) goto L61
                    goto L8c
                L61:
                    r11 = r10
                L62:
                    g1.B r1 = (g1.PointerInputChange) r1
                    r1.a()
                    kotlin.jvm.functions.Function3<f0.A, U0.f, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r2 = r3.f131040f
                    kotlin.jvm.functions.Function3 r4 = kotlin.C13904L.d()
                    if (r2 == r4) goto L80
                    mv.O r10 = r3.f131039e
                    f0.L$f$a$a r13 = new f0.L$f$a$a
                    kotlin.jvm.functions.Function3<f0.A, U0.f, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r2 = r3.f131040f
                    f0.B r4 = r3.f131042h
                    r13.<init>(r2, r4, r1, r9)
                    r14 = 2
                    r15 = 0
                    r12 = 0
                    kotlin.C13904L.r(r10, r11, r12, r13, r14, r15)
                L80:
                    r3.f131038d = r11
                    r3.f131036b = r9
                    r3.f131037c = r7
                    java.lang.Object r0 = kotlin.C13904L.v(r0, r9, r3, r8, r9)
                    if (r0 != r6) goto L8d
                L8c:
                    return r6
                L8d:
                    g1.B r0 = (g1.PointerInputChange) r0
                    if (r0 != 0) goto La1
                    mv.O r10 = r3.f131039e
                    f0.L$f$a$b r13 = new f0.L$f$a$b
                    f0.B r0 = r3.f131042h
                    r13.<init>(r0, r9)
                    r14 = 2
                    r15 = 0
                    r12 = 0
                    kotlin.C13904L.r(r10, r11, r12, r13, r14, r15)
                    goto Lc2
                La1:
                    r0.a()
                    mv.O r10 = r3.f131039e
                    f0.L$f$a$c r13 = new f0.L$f$a$c
                    f0.B r1 = r3.f131042h
                    r13.<init>(r1, r9)
                    r14 = 2
                    r15 = 0
                    r12 = 0
                    kotlin.C13904L.r(r10, r11, r12, r13, r14, r15)
                    kotlin.jvm.functions.Function1<U0.f, kotlin.Unit> r1 = r3.f131041g
                    if (r1 == 0) goto Lc2
                    long r4 = r0.getPosition()
                    U0.f r0 = U0.f.d(r4)
                    r1.invoke(r0)
                Lc2:
                    kotlin.Unit r0 = kotlin.Unit.f143329a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.C13904L.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC14300c interfaceC14300c, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC14300c, continuation)).invokeSuspend(Unit.f143329a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(J j10, Function3<? super InterfaceC13893A, ? super U0.f, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super U0.f, Unit> function1, C13894B c13894b, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f131032c = j10;
            this.f131033d = function3;
            this.f131034e = function1;
            this.f131035f = c13894b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = new f(this.f131032c, this.f131033d, this.f131034e, this.f131035f, continuation);
            fVar.f131031b = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f131030a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f131031b;
                J j10 = this.f131032c;
                a aVar = new a(interfaceC15783O, this.f131033d, this.f131034e, this.f131035f, null);
                this.f131030a = 1;
                if (C13931t.d(j10, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {104}, m = "invokeSuspend")
    /* renamed from: f0.L$g */
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f131053a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f131054b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ J f131055c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC13893A, U0.f, Continuation<? super Unit>, Object> f131056d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<U0.f, Unit> f131057e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<U0.f, Unit> f131058f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<U0.f, Unit> f131059g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/c;", "", "<anonymous>", "(Lg1/c;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {105, 116, 119, 122, 149, 167, 169, 180}, m = "invokeSuspend")
        /* renamed from: f0.L$g$a */
        static final class a extends RestrictedSuspendLambda implements Function2<InterfaceC14300c, Continuation<? super Unit>, Object> {

            /* renamed from: b, reason: collision with root package name */
            Object f131060b;

            /* renamed from: c, reason: collision with root package name */
            Object f131061c;

            /* renamed from: d, reason: collision with root package name */
            Object f131062d;

            /* renamed from: e, reason: collision with root package name */
            int f131063e;

            /* renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f131064f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f131065g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function3<InterfaceC13893A, U0.f, Continuation<? super Unit>, Object> f131066h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function1<U0.f, Unit> f131067i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Function1<U0.f, Unit> f131068j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ Function1<U0.f, Unit> f131069k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ C13894B f131070l;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", l = {110}, m = "invokeSuspend")
            /* renamed from: f0.L$g$a$a, reason: collision with other inner class name */
            static final class C2075a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f131071a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function3<InterfaceC13893A, U0.f, Continuation<? super Unit>, Object> f131072b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C13894B f131073c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ PointerInputChange f131074d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2075a(Function3<? super InterfaceC13893A, ? super U0.f, ? super Continuation<? super Unit>, ? extends Object> function3, C13894B c13894b, PointerInputChange pointerInputChange, Continuation<? super C2075a> continuation) {
                    super(2, continuation);
                    this.f131072b = function3;
                    this.f131073c = c13894b;
                    this.f131074d = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C2075a(this.f131072b, this.f131073c, this.f131074d, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C2075a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f131071a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        Function3<InterfaceC13893A, U0.f, Continuation<? super Unit>, Object> function3 = this.f131072b;
                        C13894B c13894b = this.f131073c;
                        U0.f fVarD = U0.f.d(this.f131074d.getPosition());
                        this.f131071a = 1;
                        if (function3.invoke(c13894b, fVarD, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: f0.L$g$a$b */
            static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f131075a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C13894B f131076b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C13894B c13894b, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f131076b = c13894b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f131076b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f131075a == 0) {
                        ResultKt.b(obj);
                        this.f131076b.f();
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: f0.L$g$a$c */
            static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f131077a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C13894B f131078b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(C13894B c13894b, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f131078b = c13894b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new c(this.f131078b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f131077a == 0) {
                        ResultKt.b(obj);
                        this.f131078b.a();
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: f0.L$g$a$d */
            static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f131079a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C13894B f131080b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(C13894B c13894b, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f131080b = c13894b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new d(this.f131080b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f131079a == 0) {
                        ResultKt.b(obj);
                        this.f131080b.f();
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", l = {157, 158}, m = "invokeSuspend")
            /* renamed from: f0.L$g$a$e */
            static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f131081a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C0 f131082b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C13894B f131083c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(C0 c02, C13894B c13894b, Continuation<? super e> continuation) {
                    super(2, continuation);
                    this.f131082b = c02;
                    this.f131083c = c13894b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new e(this.f131082b, this.f131083c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                        int r1 = r4.f131081a
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
                        mv.C0 r5 = r4.f131082b
                        r4.f131081a = r3
                        java.lang.Object r5 = r5.o0(r4)
                        if (r5 != r0) goto L2c
                        goto L36
                    L2c:
                        f0.B r5 = r4.f131083c
                        r4.f131081a = r2
                        java.lang.Object r5 = r5.q(r4)
                        if (r5 != r0) goto L37
                    L36:
                        return r0
                    L37:
                        kotlin.Unit r5 = kotlin.Unit.f143329a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.C13904L.g.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", l = {161}, m = "invokeSuspend")
            /* renamed from: f0.L$g$a$f */
            static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f131084a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function3<InterfaceC13893A, U0.f, Continuation<? super Unit>, Object> f131085b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C13894B f131086c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ PointerInputChange f131087d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                f(Function3<? super InterfaceC13893A, ? super U0.f, ? super Continuation<? super Unit>, ? extends Object> function3, C13894B c13894b, PointerInputChange pointerInputChange, Continuation<? super f> continuation) {
                    super(2, continuation);
                    this.f131085b = function3;
                    this.f131086c = c13894b;
                    this.f131087d = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new f(this.f131085b, this.f131086c, this.f131087d, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f131084a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        Function3<InterfaceC13893A, U0.f, Continuation<? super Unit>, Object> function3 = this.f131085b;
                        C13894B c13894b = this.f131086c;
                        U0.f fVarD = U0.f.d(this.f131087d.getPosition());
                        this.f131084a = 1;
                        if (function3.invoke(c13894b, fVarD, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: f0.L$g$a$g, reason: collision with other inner class name */
            static final class C2076g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f131088a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C13894B f131089b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2076g(C13894B c13894b, Continuation<? super C2076g> continuation) {
                    super(2, continuation);
                    this.f131089b = c13894b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C2076g(this.f131089b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C2076g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f131088a == 0) {
                        ResultKt.b(obj);
                        this.f131089b.f();
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: f0.L$g$a$h */
            static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f131090a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C13894B f131091b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                h(C13894B c13894b, Continuation<? super h> continuation) {
                    super(2, continuation);
                    this.f131091b = c13894b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new h(this.f131091b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f131090a == 0) {
                        ResultKt.b(obj);
                        this.f131091b.a();
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$resetJob$1", f = "TapGestureDetector.kt", l = {108}, m = "invokeSuspend")
            /* renamed from: f0.L$g$a$i */
            static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f131092a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C13894B f131093b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                i(C13894B c13894b, Continuation<? super i> continuation) {
                    super(2, continuation);
                    this.f131093b = c13894b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new i(this.f131093b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f131092a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C13894B c13894b = this.f131093b;
                        this.f131092a = 1;
                        if (c13894b.q(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: f0.L$g$a$j */
            static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f131094a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C13894B f131095b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                j(C13894B c13894b, Continuation<? super j> continuation) {
                    super(2, continuation);
                    this.f131095b = c13894b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new j(this.f131095b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f131094a == 0) {
                        ResultKt.b(obj);
                        this.f131095b.f();
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(InterfaceC15783O interfaceC15783O, Function3<? super InterfaceC13893A, ? super U0.f, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super U0.f, Unit> function1, Function1<? super U0.f, Unit> function12, Function1<? super U0.f, Unit> function13, C13894B c13894b, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f131065g = interfaceC15783O;
                this.f131066h = function3;
                this.f131067i = function1;
                this.f131068j = function12;
                this.f131069k = function13;
                this.f131070l = c13894b;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f131065g, this.f131066h, this.f131067i, this.f131068j, this.f131069k, this.f131070l, continuation);
                aVar.f131064f = obj;
                return aVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x00ee, code lost:
            
                if (r1 == r6) goto L80;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x012b, code lost:
            
                if (kotlin.C13904L.j(r2, r22) == r6) goto L80;
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.C13904L.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC14300c interfaceC14300c, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC14300c, continuation)).invokeSuspend(Unit.f143329a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(J j10, Function3<? super InterfaceC13893A, ? super U0.f, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super U0.f, Unit> function1, Function1<? super U0.f, Unit> function12, Function1<? super U0.f, Unit> function13, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f131055c = j10;
            this.f131056d = function3;
            this.f131057e = function1;
            this.f131058f = function12;
            this.f131059g = function13;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = new g(this.f131055c, this.f131056d, this.f131057e, this.f131058f, this.f131059g, continuation);
            gVar.f131054b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f131053a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f131054b;
                C13894B c13894b = new C13894B(this.f131055c);
                J j10 = this.f131055c;
                a aVar = new a(interfaceC15783O, this.f131056d, this.f131057e, this.f131058f, this.f131059g, c13894b, null);
                this.f131053a = 1;
                if (C13931t.d(j10, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1", f = "TapGestureDetector.kt", l = {HttpResponseStatus.ERROR_BAD_GATEWAY, HttpResponseStatus.ERROR_GATEWAY_TIMEOUT}, m = "invokeSuspend")
    /* renamed from: f0.L$h */
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f131096a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f131097b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C0 f131098c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC15783O, Continuation<? super Unit>, Object> f131099d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(C0 c02, Function2<? super InterfaceC15783O, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f131098c = c02;
            this.f131099d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            h hVar = new h(this.f131098c, this.f131099d, continuation);
            hVar.f131097b = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r4.f131096a
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
                java.lang.Object r1 = r4.f131097b
                mv.O r1 = (mv.InterfaceC15783O) r1
                kotlin.ResultKt.b(r5)
                goto L3b
            L22:
                kotlin.ResultKt.b(r5)
                java.lang.Object r5 = r4.f131097b
                r1 = r5
                mv.O r1 = (mv.InterfaceC15783O) r1
                boolean r5 = d0.C13580n.isDetectTapGesturesImmediateCoroutineDispatchEnabled
                if (r5 == 0) goto L3b
                mv.C0 r5 = r4.f131098c
                r4.f131097b = r1
                r4.f131096a = r3
                java.lang.Object r5 = r5.o0(r4)
                if (r5 != r0) goto L3b
                goto L48
            L3b:
                kotlin.jvm.functions.Function2<mv.O, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r5 = r4.f131099d
                r3 = 0
                r4.f131097b = r3
                r4.f131096a = r2
                java.lang.Object r5 = r5.invoke(r1, r4)
                if (r5 != r0) goto L49
            L48:
                return r0
            L49:
                kotlin.Unit r5 = kotlin.Unit.f143329a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C13904L.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {384}, m = "waitForLongPress")
    /* renamed from: f0.L$i */
    static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f131100a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f131101b;

        /* renamed from: c, reason: collision with root package name */
        int f131102c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f131101b = obj;
            this.f131102c |= Integer.MIN_VALUE;
            return C13904L.s(null, null, this);
        }

        i(Continuation<? super i> continuation) {
            super(continuation);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/c;", "", "<anonymous>", "(Lg1/c;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2", f = "TapGestureDetector.kt", l = {386, HttpResponseStatus.ERROR_CONFLICT}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: f0.L$j */
    static final class j extends RestrictedSuspendLambda implements Function2<InterfaceC14300c, Continuation<? super Unit>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f131103b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f131104c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ EnumC14315s f131105d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<AbstractC13932u> f131106e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(EnumC14315s enumC14315s, Ref.ObjectRef<AbstractC13932u> objectRef, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f131105d = enumC14315s;
            this.f131106e = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            j jVar = new j(this.f131105d, this.f131106e, continuation);
            jVar.f131104c = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC14300c interfaceC14300c, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC14300c, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
        
            if (kotlin.C13905M.b(r14) == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
        
            r13.f131106e.f143742a = kotlin.AbstractC13932u.c.f131345a;
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
        
            r13.f131106e.f143742a = kotlin.AbstractC13932u.a.f131343a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
        
            r14 = g1.EnumC14315s.f133970c;
            r13.f131104c = r1;
            r13.f131103b = 2;
            r14 = r1.K0(r14, r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
        
            if (r14 != r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
        
            r13.f131106e.f143742a = kotlin.AbstractC13932u.a.f131343a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
        
            return kotlin.Unit.f143329a;
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C13904L.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {352, 366}, m = "waitForUpOrCancellation")
    /* renamed from: f0.L$k */
    static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f131107a;

        /* renamed from: b, reason: collision with root package name */
        Object f131108b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f131109c;

        /* renamed from: d, reason: collision with root package name */
        int f131110d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f131109c = obj;
            this.f131110d |= Integer.MIN_VALUE;
            return C13904L.u(null, null, this);
        }

        k(Continuation<? super k> continuation) {
            super(continuation);
        }
    }

    private static final boolean o(C14314q c14314q, boolean z10, boolean z11) {
        if (z11) {
            List<PointerInputChange> listC = c14314q.c();
            int size = listC.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (!O.g(listC.get(i10).getType(), O.INSTANCE.b())) {
                        break;
                    }
                    i10++;
                } else if (!C14317u.b(c14314q.getButtons())) {
                    return false;
                }
            }
        }
        List<PointerInputChange> listC2 = c14314q.c();
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
    public static final java.lang.Object e(g1.InterfaceC14300c r7, boolean r8, g1.EnumC14315s r9, kotlin.coroutines.Continuation<? super g1.PointerInputChange> r10) {
        /*
            boolean r0 = r10 instanceof kotlin.C13904L.b
            if (r0 == 0) goto L13
            r0 = r10
            f0.L$b r0 = (kotlin.C13904L.b) r0
            int r1 = r0.f131017e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f131017e = r1
            goto L18
        L13:
            f0.L$b r0 = new f0.L$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f131016d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f131017e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r7 = r0.f131015c
            java.lang.Object r8 = r0.f131014b
            g1.s r8 = (g1.EnumC14315s) r8
            java.lang.Object r9 = r0.f131013a
            g1.c r9 = (g1.InterfaceC14300c) r9
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
            r0.f131013a = r7
            r0.f131014b = r9
            r0.f131015c = r8
            r0.f131017e = r3
            java.lang.Object r10 = r7.K0(r9, r0)
            if (r10 != r1) goto L51
            return r1
        L51:
            g1.q r10 = (g1.C14314q) r10
            r2 = 2
            r4 = 0
            r5 = 0
            boolean r2 = p(r10, r8, r5, r2, r4)
            if (r2 == 0) goto L42
            java.util.List r7 = r10.c()
            java.lang.Object r7 = r7.get(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C13904L.e(g1.c, boolean, g1.s, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object f(InterfaceC14300c interfaceC14300c, boolean z10, EnumC14315s enumC14315s, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            enumC14315s = EnumC14315s.f133969b;
        }
        return e(interfaceC14300c, z10, enumC14315s, continuation);
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
    public static final java.lang.Object g(g1.InterfaceC14300c r5, boolean r6, g1.EnumC14315s r7, kotlin.coroutines.Continuation<? super g1.PointerInputChange> r8) {
        /*
            boolean r0 = r8 instanceof kotlin.C13904L.c
            if (r0 == 0) goto L13
            r0 = r8
            f0.L$c r0 = (kotlin.C13904L.c) r0
            int r1 = r0.f131022e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f131022e = r1
            goto L18
        L13:
            f0.L$c r0 = new f0.L$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f131021d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f131022e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r5 = r0.f131020c
            java.lang.Object r6 = r0.f131019b
            g1.s r6 = (g1.EnumC14315s) r6
            java.lang.Object r7 = r0.f131018a
            g1.c r7 = (g1.InterfaceC14300c) r7
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
            r0.f131018a = r5
            r0.f131019b = r7
            r0.f131020c = r6
            r0.f131022e = r3
            java.lang.Object r8 = r5.K0(r7, r0)
            if (r8 != r1) goto L51
            return r1
        L51:
            g1.q r8 = (g1.C14314q) r8
            boolean r2 = o(r8, r6, r3)
            if (r2 == 0) goto L42
            java.util.List r5 = r8.c()
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C13904L.g(g1.c, boolean, g1.s, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object h(InterfaceC14300c interfaceC14300c, boolean z10, EnumC14315s enumC14315s, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            enumC14315s = EnumC14315s.f133969b;
        }
        return g(interfaceC14300c, z10, enumC14315s, continuation);
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
    public static final java.lang.Object j(g1.InterfaceC14300c r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof kotlin.C13904L.e
            if (r0 == 0) goto L13
            r0 = r9
            f0.L$e r0 = (kotlin.C13904L.e) r0
            int r1 = r0.f131029c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f131029c = r1
            goto L18
        L13:
            f0.L$e r0 = new f0.L$e
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f131028b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f131029c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f131027a
            g1.c r8 = (g1.InterfaceC14300c) r8
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
            r0.f131027a = r8
            r0.f131029c = r3
            r9 = 0
            java.lang.Object r9 = g1.InterfaceC14300c.G1(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            g1.q r9 = (g1.C14314q) r9
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
            kotlin.Unit r8 = kotlin.Unit.f143329a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C13904L.j(g1.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object k(J j10, Function3<? super InterfaceC13893A, ? super U0.f, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super U0.f, Unit> function1, Continuation<? super Unit> continuation) {
        Object objG = C15784P.g(new f(j10, function3, function1, new C13894B(j10), null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
    }

    public static final Object l(J j10, Function1<? super U0.f, Unit> function1, Function1<? super U0.f, Unit> function12, Function3<? super InterfaceC13893A, ? super U0.f, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super U0.f, Unit> function13, Continuation<? super Unit> continuation) {
        Object objG = C15784P.g(new g(j10, function3, function12, function1, function13, null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
    }

    public static /* synthetic */ Object m(J j10, Function1 function1, Function1 function12, Function3 function3, Function1 function13, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = null;
        }
        if ((i10 & 2) != 0) {
            function12 = null;
        }
        if ((i10 & 4) != 0) {
            function3 = f131011a;
        }
        if ((i10 & 8) != 0) {
            function13 = null;
        }
        return l(j10, function1, function12, function3, function13, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnumC15785Q n() {
        return C13580n.isDetectTapGesturesImmediateCoroutineDispatchEnabled ? EnumC15785Q.f151688d : EnumC15785Q.f151685a;
    }

    static /* synthetic */ boolean p(C14314q c14314q, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = C13905M.a();
        }
        return o(c14314q, z10, z11);
    }

    private static final C0 q(InterfaceC15783O interfaceC15783O, C0 c02, EnumC15785Q enumC15785Q, Function2<? super InterfaceC15783O, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return C15809k.d(interfaceC15783O, null, enumC15785Q, new h(c02, function2, null), 1, null);
    }

    static /* synthetic */ C0 r(InterfaceC15783O interfaceC15783O, C0 c02, EnumC15785Q enumC15785Q, Function2 function2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            enumC15785Q = n();
        }
        return q(interfaceC15783O, c02, enumC15785Q, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, f0.u$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(g1.InterfaceC14300c r7, g1.EnumC14315s r8, kotlin.coroutines.Continuation<? super kotlin.AbstractC13932u> r9) {
        /*
            boolean r0 = r9 instanceof kotlin.C13904L.i
            if (r0 == 0) goto L13
            r0 = r9
            f0.L$i r0 = (kotlin.C13904L.i) r0
            int r1 = r0.f131102c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f131102c = r1
            goto L18
        L13:
            f0.L$i r0 = new f0.L$i
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f131101b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f131102c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f131100a
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
            f0.u$a r2 = kotlin.AbstractC13932u.a.f131343a
            r9.f143742a = r2
            androidx.compose.ui.platform.Q1 r2 = r7.getViewConfiguration()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            long r4 = r2.c()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            f0.L$j r2 = new f0.L$j     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            r6 = 0
            r2.<init>(r8, r9, r6)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            r0.f131100a = r9     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            r0.f131102c = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            java.lang.Object r7 = r7.H0(r4, r2, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            if (r7 != r1) goto L5a
            return r1
        L5a:
            r7 = r9
        L5b:
            T r7 = r7.f143742a
            return r7
        L5e:
            f0.u$c r7 = kotlin.AbstractC13932u.c.f131345a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C13904L.s(g1.c, g1.s, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object t(InterfaceC14300c interfaceC14300c, EnumC14315s enumC14315s, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC14315s = EnumC14315s.f133969b;
        }
        return s(interfaceC14300c, enumC14315s, continuation);
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
    public static final java.lang.Object u(g1.InterfaceC14300c r17, g1.EnumC14315s r18, kotlin.coroutines.Continuation<? super g1.PointerInputChange> r19) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C13904L.u(g1.c, g1.s, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object v(InterfaceC14300c interfaceC14300c, EnumC14315s enumC14315s, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC14315s = EnumC14315s.f133969b;
        }
        return u(interfaceC14300c, enumC14315s, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(InterfaceC14300c interfaceC14300c, PointerInputChange pointerInputChange, Continuation<? super PointerInputChange> continuation) {
        return interfaceC14300c.i0(interfaceC14300c.getViewConfiguration().a(), new d(pointerInputChange, null), continuation);
    }
}
