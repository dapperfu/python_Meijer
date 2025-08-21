package kotlin;

import androidx.compose.runtime.C5854d0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000h\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ar\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u000426\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0086@¢\u0006\u0004\b\r\u0010\u000e\u001a\u0098\u0001\u0010\u0014\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000426\u0010\f\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015\u001ay\u0010\u001c\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010\u0002\u001a\u00028\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00172%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\u0012\u0004\u0012\u00020\u000b0\u0019¢\u0006\u0002\b\u001bH\u0086@¢\u0006\u0004\b\u001c\u0010\u001d\u001ao\u0010\u001f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\b\b\u0002\u0010\u0018\u001a\u00020\u00172%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\u0012\u0004\u0012\u00020\u000b0\u0019¢\u0006\u0002\b\u001bH\u0086@¢\u0006\u0004\b\u001f\u0010 \u001au\u0010%\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!2\b\b\u0002\u0010$\u001a\u00020#2%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\u0012\u0004\u0012\u00020\u000b0\u0019¢\u0006\u0002\b\u001bH\u0080@¢\u0006\u0004\b%\u0010&\u001aY\u0010*\u001a\u00028\u0000\"\u0004\b\u0000\u0010'\"\u0004\b\u0001\u0010\u000f\"\b\b\u0002\u0010\u0011*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020!2!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110#¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b((\u0012\u0004\u0012\u00028\u00000\u0019H\u0082@¢\u0006\u0004\b*\u0010+\u001aC\u0010-\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016H\u0000¢\u0006\u0004\b-\u0010.\u001a\u008c\u0001\u00101\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a2\u0006\u0010(\u001a\u00020#2\u0006\u0010/\u001a\u00020\u00002\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162#\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\u0012\u0004\u0012\u00020\u000b0\u0019¢\u0006\u0002\b\u001bH\u0002¢\u0006\u0004\b1\u00102\u001a\u008c\u0001\u00104\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a2\u0006\u0010(\u001a\u00020#2\u0006\u00103\u001a\u00020#2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162#\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\u0012\u0004\u0012\u00020\u000b0\u0019¢\u0006\u0002\b\u001bH\u0002¢\u0006\u0004\b4\u00105\"\u0018\u0010/\u001a\u00020\u0000*\u0002068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"", "initialValue", "targetValue", "initialVelocity", "Lc0/i;", "animationSpec", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "velocity", "", "block", "b", "(FFFLc0/i;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Lc0/q;", "V", "Lc0/o0;", "typeConverter", "d", "(Lc0/o0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lc0/i;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lc0/k;", "", "sequentialAnimation", "Lkotlin/Function1;", "Lc0/h;", "Lkotlin/ExtensionFunctionType;", "i", "(Lc0/k;Ljava/lang/Object;Lc0/i;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lc0/y;", "g", "(Lc0/k;Lc0/y;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lc0/d;", "animation", "", "startTimeNanos", "c", "(Lc0/k;Lc0/d;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "R", "frameTimeNanos", "onFrame", "k", "(Lc0/d;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "state", "o", "(Lc0/h;Lc0/k;)V", "durationScale", "anim", "m", "(Lc0/h;JFLc0/d;Lc0/k;Lkotlin/jvm/functions/Function1;)V", "playTimeNanos", "l", "(Lc0/h;JJLc0/d;Lc0/k;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/coroutines/CoroutineContext;", "n", "(Lkotlin/coroutines/CoroutineContext;)F", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: Add missing generic type declarations: [T, V] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lc0/q;", "V", "Lc0/h;", "", "a", "(Lc0/h;)V"}, k = 3, mv = {1, 9, 0})
    static final class a<T, V> extends Lambda implements Function1<C6451h<T, V>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<T, T, Unit> f60880f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ o0<T, V> f60881g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super T, ? super T, Unit> function2, o0<T, V> o0Var) {
            super(1);
            this.f60880f = function2;
            this.f60881g = o0Var;
        }

        public final void a(C6451h<T, V> c6451h) {
            this.f60880f.invoke(c6451h.e(), this.f60881g.b().invoke(c6451h.g()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            a((C6451h) obj);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", l = {231, 280}, m = "animate")
    static final class b<T, V extends AbstractC6460q> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f60882a;

        /* renamed from: b, reason: collision with root package name */
        Object f60883b;

        /* renamed from: c, reason: collision with root package name */
        Object f60884c;

        /* renamed from: d, reason: collision with root package name */
        Object f60885d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f60886e;

        /* renamed from: f, reason: collision with root package name */
        int f60887f;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f60886e = obj;
            this.f60887f |= Integer.MIN_VALUE;
            return i0.c(null, null, 0L, null, this);
        }

        b(Continuation<? super b> continuation) {
            super(continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lc0/q;", "V", "Lc0/h;", "", "a", "(Lc0/h;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final c f60888f = new c();

        c() {
            super(1);
        }

        public final void a(C6451h c6451h) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C6451h) obj);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Lc0/q;", "V", "", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends Lambda implements Function1<Long, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<C6451h<T, V>> f60889f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ T f60890g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6445d<T, V> f60891h;

        /* renamed from: i, reason: collision with root package name */
        /* JADX INFO: Incorrect field signature: TV; */
        final /* synthetic */ AbstractC6460q f60892i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ AnimationState<T, V> f60893j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f60894k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1<C6451h<T, V>, Unit> f60895l;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lc0/q;", "V", "", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        static final class a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AnimationState<T, V> f60896f;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f60896f.z(false);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AnimationState<T, V> animationState) {
                super(0);
                this.f60896f = animationState;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/internal/Ref$ObjectRef<Lc0/h<TT;TV;>;>;TT;Lc0/d<TT;TV;>;TV;Lc0/k<TT;TV;>;FLkotlin/jvm/functions/Function1<-Lc0/h<TT;TV;>;Lkotlin/Unit;>;)V */
        /* JADX WARN: Multi-variable type inference failed */
        d(Ref.ObjectRef objectRef, Object obj, InterfaceC6445d interfaceC6445d, AbstractC6460q abstractC6460q, AnimationState animationState, float f10, Function1 function1) {
            super(1);
            this.f60889f = objectRef;
            this.f60890g = obj;
            this.f60891h = interfaceC6445d;
            this.f60892i = abstractC6460q;
            this.f60893j = animationState;
            this.f60894k = f10;
            this.f60895l = function1;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, c0.h] */
        public final void a(long j10) {
            Ref.ObjectRef<C6451h<T, V>> objectRef = this.f60889f;
            ?? c6451h = new C6451h(this.f60890g, this.f60891h.e(), this.f60892i, j10, this.f60891h.g(), j10, true, new a(this.f60893j));
            i0.m(c6451h, j10, this.f60894k, this.f60891h, this.f60893j, this.f60895l);
            objectRef.f143742a = c6451h;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
            a(l10.longValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lc0/q;", "V", "", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class e extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AnimationState<T, V> f60897f;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f60897f.z(false);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(AnimationState<T, V> animationState) {
            super(0);
            this.f60897f = animationState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Lc0/q;", "V", "", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends Lambda implements Function1<Long, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<C6451h<T, V>> f60898f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f60899g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6445d<T, V> f60900h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ AnimationState<T, V> f60901i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<C6451h<T, V>, Unit> f60902j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Ref.ObjectRef<C6451h<T, V>> objectRef, float f10, InterfaceC6445d<T, V> interfaceC6445d, AnimationState<T, V> animationState, Function1<? super C6451h<T, V>, Unit> function1) {
            super(1);
            this.f60898f = objectRef;
            this.f60899g = f10;
            this.f60900h = interfaceC6445d;
            this.f60901i = animationState;
            this.f60902j = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(long j10) {
            T t10 = this.f60898f.f143742a;
            Intrinsics.g(t10);
            i0.m((C6451h) t10, j10, this.f60899g, this.f60900h, this.f60901i, this.f60902j);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
            a(l10.longValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lc0/q;", "V", "Lc0/h;", "", "a", "(Lc0/h;)V"}, k = 3, mv = {1, 9, 0})
    public static final class g extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final g f60903f = new g();

        g() {
            super(1);
        }

        public final void a(C6451h c6451h) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C6451h) obj);
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lc0/q;", "V", "Lc0/h;", "", "a", "(Lc0/h;)V"}, k = 3, mv = {1, 9, 0})
    public static final class h extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final h f60904f = new h();

        h() {
            super(1);
        }

        public final void a(C6451h c6451h) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C6451h) obj);
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lc0/q;", "V", "", "it", "a", "(J)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    static final class i<R> extends Lambda implements Function1<Long, R> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Long, R> f60905f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(Function1<? super Long, ? extends R> function1) {
            super(1);
            this.f60905f = function1;
        }

        public final R a(long j10) {
            return this.f60905f.invoke(Long.valueOf(j10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Long l10) {
            return a(l10.longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends AbstractC6460q> void m(C6451h<T, V> c6451h, long j10, float f10, InterfaceC6445d<T, V> interfaceC6445d, AnimationState<T, V> animationState, Function1<? super C6451h<T, V>, Unit> function1) {
        l(c6451h, j10, f10 == 0.0f ? interfaceC6445d.getDurationNanos() : (long) ((j10 - c6451h.getStartTimeNanos()) / f10), interfaceC6445d, animationState, function1);
    }

    public static final Object b(float f10, float f11, float f12, InterfaceC6452i<Float> interfaceC6452i, Function2<? super Float, ? super Float, Unit> function2, Continuation<? super Unit> continuation) {
        Object objD = d(q0.i(FloatCompanionObject.f143729a), Boxing.c(f10), Boxing.c(f11), Boxing.c(f12), interfaceC6452i, function2, continuation);
        return objD == IntrinsicsKt.f() ? objD : Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, c0.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, V extends kotlin.AbstractC6460q> java.lang.Object c(kotlin.AnimationState<T, V> r23, kotlin.InterfaceC6445d<T, V> r24, long r25, kotlin.jvm.functions.Function1<? super kotlin.C6451h<T, V>, kotlin.Unit> r27, kotlin.coroutines.Continuation<? super kotlin.Unit> r28) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.i0.c(c0.k, c0.d, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T, V extends AbstractC6460q> Object d(o0<T, V> o0Var, T t10, T t11, T t12, InterfaceC6452i<T> interfaceC6452i, Function2<? super T, ? super T, Unit> function2, Continuation<? super Unit> continuation) {
        V vG;
        if (t12 == null || (vG = o0Var.a().invoke(t12)) == null) {
            vG = C6461r.g(o0Var.a().invoke(t10));
        }
        AbstractC6460q abstractC6460q = vG;
        Object objF = f(new AnimationState(o0Var, t10, abstractC6460q, 0L, 0L, false, 56, null), new j0(interfaceC6452i, o0Var, t10, t11, abstractC6460q), 0L, new a(function2, o0Var), continuation, 2, null);
        return objF == IntrinsicsKt.f() ? objF : Unit.f143329a;
    }

    public static /* synthetic */ Object e(float f10, float f11, float f12, InterfaceC6452i interfaceC6452i, Function2 function2, Continuation continuation, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            interfaceC6452i = C6453j.j(0.0f, 0.0f, null, 7, null);
        }
        return b(f10, f11, f12, interfaceC6452i, function2, continuation);
    }

    public static /* synthetic */ Object f(AnimationState animationState, InterfaceC6445d interfaceC6445d, long j10, Function1 function1, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MIN_VALUE;
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            function1 = c.f60888f;
        }
        return c(animationState, interfaceC6445d, j11, function1, continuation);
    }

    public static /* synthetic */ Object h(AnimationState animationState, InterfaceC6468y interfaceC6468y, boolean z10, Function1 function1, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            function1 = g.f60903f;
        }
        return g(animationState, interfaceC6468y, z10, function1, continuation);
    }

    public static /* synthetic */ Object j(AnimationState animationState, Object obj, InterfaceC6452i interfaceC6452i, boolean z10, Function1 function1, Continuation continuation, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            interfaceC6452i = C6453j.j(0.0f, 0.0f, null, 7, null);
        }
        InterfaceC6452i interfaceC6452i2 = interfaceC6452i;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            function1 = h.f60904f;
        }
        return i(animationState, obj, interfaceC6452i2, z11, function1, continuation);
    }

    public static final float n(CoroutineContext coroutineContext) {
        P0.j jVar = (P0.j) coroutineContext.g(P0.j.INSTANCE);
        float fJ = jVar != null ? jVar.J() : 1.0f;
        if (!(fJ >= 0.0f)) {
            C6436X.b("negative scale factor");
        }
        return fJ;
    }

    public static final <T, V extends AbstractC6460q> Object g(AnimationState<T, V> animationState, InterfaceC6468y<T> interfaceC6468y, boolean z10, Function1<? super C6451h<T, V>, Unit> function1, Continuation<? super Unit> continuation) {
        long lastFrameTimeNanos;
        C6467x c6467x = new C6467x(interfaceC6468y, animationState.l(), animationState.getValue(), animationState.p());
        if (z10) {
            lastFrameTimeNanos = animationState.getLastFrameTimeNanos();
        } else {
            lastFrameTimeNanos = Long.MIN_VALUE;
        }
        Object objC = c(animationState, c6467x, lastFrameTimeNanos, function1, continuation);
        if (objC == IntrinsicsKt.f()) {
            return objC;
        }
        return Unit.f143329a;
    }

    public static final <T, V extends AbstractC6460q> Object i(AnimationState<T, V> animationState, T t10, InterfaceC6452i<T> interfaceC6452i, boolean z10, Function1<? super C6451h<T, V>, Unit> function1, Continuation<? super Unit> continuation) {
        long lastFrameTimeNanos;
        j0 j0Var = new j0(interfaceC6452i, animationState.l(), animationState.getValue(), t10, animationState.p());
        if (z10) {
            lastFrameTimeNanos = animationState.getLastFrameTimeNanos();
        } else {
            lastFrameTimeNanos = Long.MIN_VALUE;
        }
        Object objC = c(animationState, j0Var, lastFrameTimeNanos, function1, continuation);
        if (objC == IntrinsicsKt.f()) {
            return objC;
        }
        return Unit.f143329a;
    }

    private static final <R, T, V extends AbstractC6460q> Object k(InterfaceC6445d<T, V> interfaceC6445d, Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
        if (interfaceC6445d.getIsInfinite()) {
            return C6425L.a(function1, continuation);
        }
        return C5854d0.c(new i(function1), continuation);
    }

    private static final <T, V extends AbstractC6460q> void l(C6451h<T, V> c6451h, long j10, long j11, InterfaceC6445d<T, V> interfaceC6445d, AnimationState<T, V> animationState, Function1<? super C6451h<T, V>, Unit> function1) {
        c6451h.j(j10);
        c6451h.l(interfaceC6445d.f(j11));
        c6451h.m(interfaceC6445d.b(j11));
        if (interfaceC6445d.c(j11)) {
            c6451h.i(c6451h.getLastFrameTimeNanos());
            c6451h.k(false);
        }
        o(c6451h, animationState);
        function1.invoke(c6451h);
    }

    public static final <T, V extends AbstractC6460q> void o(C6451h<T, V> c6451h, AnimationState<T, V> animationState) {
        animationState.D(c6451h.e());
        C6461r.f(animationState.p(), c6451h.g());
        animationState.u(c6451h.getFinishedTimeNanos());
        animationState.w(c6451h.getLastFrameTimeNanos());
        animationState.z(c6451h.h());
    }
}
