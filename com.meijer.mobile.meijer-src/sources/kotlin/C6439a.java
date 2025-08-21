package kotlin;

import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6460q;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B9\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ_\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u000f\u001a\u00028\u00002%\u0010\u0013\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0002\b\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJg\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\u001c\u001a\u00028\u00002\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\b\b\u0002\u0010\u000f\u001a\u00028\u00002'\b\u0002\u0010\u0013\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0002\b\u0012H\u0086@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%¢\u0006\u0004\b&\u0010'R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010\b\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R&\u00107\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R+\u0010?\u001a\u0002082\u0006\u00109\u001a\u0002088F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R+\u0010\u001c\u001a\u00028\u00002\u0006\u00109\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010:\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010FR \u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000H8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010O\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001a\u0010M\u0012\u0004\bN\u0010\u001bR\u001a\u0010Q\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\f\n\u0004\b5\u0010M\u0012\u0004\bP\u0010\u001bR\u0016\u0010R\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010MR\u0016\u0010S\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010MR\u0011\u0010\u0017\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bT\u0010BR\u0011\u0010W\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0011\u0010Y\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bX\u0010B¨\u0006Z"}, d2 = {"Lc0/a;", "T", "Lc0/q;", "V", "", "initialValue", "Lc0/o0;", "typeConverter", "visibilityThreshold", "", "label", "<init>", "(Ljava/lang/Object;Lc0/o0;Ljava/lang/Object;Ljava/lang/String;)V", "Lc0/d;", "animation", "initialVelocity", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lc0/g;", "q", "(Lc0/d;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "h", "(Ljava/lang/Object;)Ljava/lang/Object;", "i", "()V", "targetValue", "Lc0/i;", "animationSpec", "e", "(Ljava/lang/Object;Lc0/i;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "u", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/runtime/z1;", "g", "()Landroidx/compose/runtime/z1;", "a", "Lc0/o0;", "l", "()Lc0/o0;", "b", "Ljava/lang/Object;", "c", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Lc0/k;", "d", "Lc0/k;", "j", "()Lc0/k;", "internalState", "", "<set-?>", "Landroidx/compose/runtime/l0;", "p", "()Z", "r", "(Z)V", "isRunning", "f", "k", "()Ljava/lang/Object;", "s", "(Ljava/lang/Object;)V", "Lc0/W;", "Lc0/W;", "mutatorMutex", "Lc0/d0;", "Lc0/d0;", "getDefaultSpringSpec$animation_core_release", "()Lc0/d0;", "defaultSpringSpec", "Lc0/q;", "getNegativeInfinityBounds$annotations", "negativeInfinityBounds", "getPositiveInfinityBounds$annotations", "positiveInfinityBounds", "lowerBoundVector", "upperBoundVector", "m", "o", "()Lc0/q;", "velocityVector", "n", "velocity", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6439a<T, V extends AbstractC6460q> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o0<T, V> typeConverter;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final T visibilityThreshold;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String label;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AnimationState<T, V> internalState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 isRunning;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 targetValue;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C6435W mutatorMutex;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C6446d0<T> defaultSpringSpec;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final V negativeInfinityBounds;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final V positiveInfinityBounds;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private V lowerBoundVector;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private V upperBoundVector;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lc0/q;", "V", "Lc0/g;", "<anonymous>", "()Lc0/g;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {HttpResponseStatus.REDIRECTION_USE_PROXY}, m = "invokeSuspend")
    /* renamed from: c0.a$a, reason: collision with other inner class name */
    static final class C1211a extends SuspendLambda implements Function1<Continuation<? super AnimationResult<T, V>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f60804a;

        /* renamed from: b, reason: collision with root package name */
        Object f60805b;

        /* renamed from: c, reason: collision with root package name */
        int f60806c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C6439a<T, V> f60807d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ T f60808e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6445d<T, V> f60809f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f60810g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<C6439a<T, V>, Unit> f60811h;

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lc0/q;", "V", "Lc0/h;", "", "a", "(Lc0/h;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: c0.a$a$a, reason: collision with other inner class name */
        static final class C1212a extends Lambda implements Function1<C6451h<T, V>, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C6439a<T, V> f60812f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ AnimationState<T, V> f60813g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function1<C6439a<T, V>, Unit> f60814h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Ref.BooleanRef f60815i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1212a(C6439a<T, V> c6439a, AnimationState<T, V> animationState, Function1<? super C6439a<T, V>, Unit> function1, Ref.BooleanRef booleanRef) {
                super(1);
                this.f60812f = c6439a;
                this.f60813g = animationState;
                this.f60814h = function1;
                this.f60815i = booleanRef;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void a(C6451h<T, V> c6451h) {
                i0.o(c6451h, this.f60812f.j());
                Object objH = this.f60812f.h(c6451h.e());
                if (Intrinsics.e(objH, c6451h.e())) {
                    Function1<C6439a<T, V>, Unit> function1 = this.f60814h;
                    if (function1 != null) {
                        function1.invoke(this.f60812f);
                        return;
                    }
                    return;
                }
                this.f60812f.j().D(objH);
                this.f60813g.D(objH);
                Function1<C6439a<T, V>, Unit> function12 = this.f60814h;
                if (function12 != null) {
                    function12.invoke(this.f60812f);
                }
                c6451h.a();
                this.f60815i.f143735a = true;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                a((C6451h) obj);
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1211a(C6439a<T, V> c6439a, T t10, InterfaceC6445d<T, V> interfaceC6445d, long j10, Function1<? super C6439a<T, V>, Unit> function1, Continuation<? super C1211a> continuation) {
            super(1, continuation);
            this.f60807d = c6439a;
            this.f60808e = t10;
            this.f60809f = interfaceC6445d;
            this.f60810g = j10;
            this.f60811h = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C1211a(this.f60807d, this.f60808e, this.f60809f, this.f60810g, this.f60811h, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AnimationState animationState;
            Ref.BooleanRef booleanRef;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f60806c;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    this.f60807d.j().H(this.f60807d.l().a().invoke(this.f60808e));
                    this.f60807d.s(this.f60809f.g());
                    this.f60807d.r(true);
                    AnimationState animationStateH = C6455l.h(this.f60807d.j(), null, null, 0L, Long.MIN_VALUE, false, 23, null);
                    Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    InterfaceC6445d<T, V> interfaceC6445d = this.f60809f;
                    long j10 = this.f60810g;
                    C1212a c1212a = new C1212a(this.f60807d, animationStateH, this.f60811h, booleanRef2);
                    this.f60804a = animationStateH;
                    this.f60805b = booleanRef2;
                    this.f60806c = 1;
                    if (i0.c(animationStateH, interfaceC6445d, j10, c1212a, this) == objF) {
                        return objF;
                    }
                    animationState = animationStateH;
                    booleanRef = booleanRef2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef = (Ref.BooleanRef) this.f60805b;
                    animationState = (AnimationState) this.f60804a;
                    ResultKt.b(obj);
                }
                EnumC6447e enumC6447e = booleanRef.f143735a ? EnumC6447e.f60858a : EnumC6447e.f60859b;
                this.f60807d.i();
                return new AnimationResult(animationState, enumC6447e);
            } catch (CancellationException e10) {
                this.f60807d.i();
                throw e10;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super AnimationResult<T, V>> continuation) {
            return ((C1211a) create(continuation)).invokeSuspend(Unit.f143329a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lc0/q;", "V", "", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
    /* renamed from: c0.a$b */
    static final class b extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f60816a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6439a<T, V> f60817b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f60818c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C6439a<T, V> c6439a, T t10, Continuation<? super b> continuation) {
            super(1, continuation);
            this.f60817b = c6439a;
            this.f60818c = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new b(this.f60817b, this.f60818c, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((b) create(continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f60816a == 0) {
                ResultKt.b(obj);
                this.f60817b.i();
                Object objH = this.f60817b.h(this.f60818c);
                this.f60817b.j().D(objH);
                this.f60817b.s(objH);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lc0/q;", "V", "", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.animation.core.Animatable$stop$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
    /* renamed from: c0.a$c */
    static final class c extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f60819a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6439a<T, V> f60820b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C6439a<T, V> c6439a, Continuation<? super c> continuation) {
            super(1, continuation);
            this.f60820b = c6439a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new c(this.f60820b, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((c) create(continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f60819a == 0) {
                ResultKt.b(obj);
                this.f60820b.i();
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C6439a(T t10, o0<T, V> o0Var, T t11, String str) {
        this.typeConverter = o0Var;
        this.visibilityThreshold = t11;
        this.label = str;
        this.internalState = new AnimationState<>(o0Var, t10, null, 0L, 0L, false, 60, null);
        this.isRunning = t1.e(Boolean.FALSE, null, 2, null);
        this.targetValue = t1.e(t10, null, 2, null);
        this.mutatorMutex = new C6435W();
        this.defaultSpringSpec = new C6446d0<>(0.0f, 0.0f, t11, 3, null);
        AbstractC6460q abstractC6460qO = o();
        V v10 = abstractC6460qO instanceof C6456m ? C6441b.f60826e : abstractC6460qO instanceof C6457n ? C6441b.f60827f : abstractC6460qO instanceof C6458o ? C6441b.f60828g : C6441b.f60829h;
        Intrinsics.h(v10, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.negativeInfinityBounds = v10;
        AbstractC6460q abstractC6460qO2 = o();
        V v11 = abstractC6460qO2 instanceof C6456m ? C6441b.f60822a : abstractC6460qO2 instanceof C6457n ? C6441b.f60823b : abstractC6460qO2 instanceof C6458o ? C6441b.f60824c : C6441b.f60825d;
        Intrinsics.h(v11, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.positiveInfinityBounds = v11;
        this.lowerBoundVector = v10;
        this.upperBoundVector = v11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object f(C6439a c6439a, Object obj, InterfaceC6452i interfaceC6452i, Object obj2, Function1 function1, Continuation continuation, int i10, Object obj3) {
        if ((i10 & 2) != 0) {
            interfaceC6452i = c6439a.defaultSpringSpec;
        }
        InterfaceC6452i interfaceC6452i2 = interfaceC6452i;
        T tN = obj2;
        if ((i10 & 4) != 0) {
            tN = c6439a.n();
        }
        T t10 = tN;
        if ((i10 & 8) != 0) {
            function1 = null;
        }
        return c6439a.e(obj, interfaceC6452i2, t10, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T h(T value) {
        if (Intrinsics.e(this.lowerBoundVector, this.negativeInfinityBounds) && Intrinsics.e(this.upperBoundVector, this.positiveInfinityBounds)) {
            return value;
        }
        V vInvoke = this.typeConverter.a().invoke(value);
        int size = vInvoke.getSize();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            if (vInvoke.a(i10) < this.lowerBoundVector.a(i10) || vInvoke.a(i10) > this.upperBoundVector.a(i10)) {
                vInvoke.e(i10, RangesKt.n(vInvoke.a(i10), this.lowerBoundVector.a(i10), this.upperBoundVector.a(i10)));
                z10 = true;
            }
        }
        return z10 ? this.typeConverter.b().invoke(vInvoke) : value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        AnimationState<T, V> animationState = this.internalState;
        animationState.p().d();
        animationState.w(Long.MIN_VALUE);
        r(false);
    }

    private final Object q(InterfaceC6445d<T, V> interfaceC6445d, T t10, Function1<? super C6439a<T, V>, Unit> function1, Continuation<? super AnimationResult<T, V>> continuation) {
        return C6435W.e(this.mutatorMutex, null, new C1211a(this, t10, interfaceC6445d, this.internalState.getLastFrameTimeNanos(), function1, null), continuation, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(boolean z10) {
        this.isRunning.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(T t10) {
        this.targetValue.setValue(t10);
    }

    public final z1<T> g() {
        return this.internalState;
    }

    public final AnimationState<T, V> j() {
        return this.internalState;
    }

    public final T k() {
        return this.targetValue.getValue();
    }

    public final o0<T, V> l() {
        return this.typeConverter;
    }

    public final T m() {
        return this.internalState.getValue();
    }

    public final T n() {
        return (T) this.typeConverter.b().invoke(o());
    }

    public final V o() {
        return (V) this.internalState.p();
    }

    public final boolean p() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    public final Object t(T t10, Continuation<? super Unit> continuation) {
        Object objE = C6435W.e(this.mutatorMutex, null, new b(this, t10, null), continuation, 1, null);
        return objE == IntrinsicsKt.f() ? objE : Unit.f143329a;
    }

    public final Object u(Continuation<? super Unit> continuation) {
        Object objE = C6435W.e(this.mutatorMutex, null, new c(this, null), continuation, 1, null);
        return objE == IntrinsicsKt.f() ? objE : Unit.f143329a;
    }

    public final Object e(T t10, InterfaceC6452i<T> interfaceC6452i, T t11, Function1<? super C6439a<T, V>, Unit> function1, Continuation<? super AnimationResult<T, V>> continuation) {
        return q(C6449f.a(interfaceC6452i, this.typeConverter, m(), t10, t11), t11, function1, continuation);
    }

    public /* synthetic */ C6439a(Object obj, o0 o0Var, Object obj2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, o0Var, (i10 & 4) != 0 ? null : obj2, (i10 & 8) != 0 ? "Animatable" : str);
    }
}
