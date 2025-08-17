package kotlin;

import androidx.compose.runtime.C5712d0;
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
    static final class a<T, V> extends Lambda implements Function1<C6325h<T, V>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<T, T, Unit> f61081f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ o0<T, V> f61082g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super T, ? super T, Unit> function2, o0<T, V> o0Var) {
            super(1);
            this.f61081f = function2;
            this.f61082g = o0Var;
        }

        public final void a(C6325h<T, V> c6325h) {
            this.f61081f.invoke(c6325h.e(), this.f61082g.b().invoke(c6325h.g()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            a((C6325h) obj);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", l = {231, 280}, m = "animate")
    static final class b<T, V extends AbstractC6334q> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f61083a;

        /* renamed from: b, reason: collision with root package name */
        Object f61084b;

        /* renamed from: c, reason: collision with root package name */
        Object f61085c;

        /* renamed from: d, reason: collision with root package name */
        Object f61086d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f61087e;

        /* renamed from: f, reason: collision with root package name */
        int f61088f;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f61087e = obj;
            this.f61088f |= Integer.MIN_VALUE;
            return i0.c(null, null, 0L, null, this);
        }

        b(Continuation<? super b> continuation) {
            super(continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lc0/q;", "V", "Lc0/h;", "", "a", "(Lc0/h;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final c f61089f = new c();

        c() {
            super(1);
        }

        public final void a(C6325h c6325h) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C6325h) obj);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Lc0/q;", "V", "", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends Lambda implements Function1<Long, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<C6325h<T, V>> f61090f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ T f61091g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6319d<T, V> f61092h;

        /* renamed from: i, reason: collision with root package name */
        /* JADX INFO: Incorrect field signature: TV; */
        final /* synthetic */ AbstractC6334q f61093i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ AnimationState<T, V> f61094j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f61095k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1<C6325h<T, V>, Unit> f61096l;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lc0/q;", "V", "", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        static final class a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AnimationState<T, V> f61097f;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f61097f.z(false);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AnimationState<T, V> animationState) {
                super(0);
                this.f61097f = animationState;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/internal/Ref$ObjectRef<Lc0/h<TT;TV;>;>;TT;Lc0/d<TT;TV;>;TV;Lc0/k<TT;TV;>;FLkotlin/jvm/functions/Function1<-Lc0/h<TT;TV;>;Lkotlin/Unit;>;)V */
        /* JADX WARN: Multi-variable type inference failed */
        d(Ref.ObjectRef objectRef, Object obj, InterfaceC6319d interfaceC6319d, AbstractC6334q abstractC6334q, AnimationState animationState, float f10, Function1 function1) {
            super(1);
            this.f61090f = objectRef;
            this.f61091g = obj;
            this.f61092h = interfaceC6319d;
            this.f61093i = abstractC6334q;
            this.f61094j = animationState;
            this.f61095k = f10;
            this.f61096l = function1;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, c0.h] */
        public final void a(long j10) {
            Ref.ObjectRef<C6325h<T, V>> objectRef = this.f61090f;
            ?? c6325h = new C6325h(this.f61091g, this.f61092h.e(), this.f61093i, j10, this.f61092h.g(), j10, true, new a(this.f61094j));
            i0.m(c6325h, j10, this.f61095k, this.f61092h, this.f61094j, this.f61096l);
            objectRef.f142835a = c6325h;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
            a(l10.longValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lc0/q;", "V", "", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class e extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AnimationState<T, V> f61098f;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f61098f.z(false);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(AnimationState<T, V> animationState) {
            super(0);
            this.f61098f = animationState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Lc0/q;", "V", "", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends Lambda implements Function1<Long, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<C6325h<T, V>> f61099f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f61100g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6319d<T, V> f61101h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ AnimationState<T, V> f61102i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<C6325h<T, V>, Unit> f61103j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Ref.ObjectRef<C6325h<T, V>> objectRef, float f10, InterfaceC6319d<T, V> interfaceC6319d, AnimationState<T, V> animationState, Function1<? super C6325h<T, V>, Unit> function1) {
            super(1);
            this.f61099f = objectRef;
            this.f61100g = f10;
            this.f61101h = interfaceC6319d;
            this.f61102i = animationState;
            this.f61103j = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(long j10) {
            T t10 = this.f61099f.f142835a;
            Intrinsics.g(t10);
            i0.m((C6325h) t10, j10, this.f61100g, this.f61101h, this.f61102i, this.f61103j);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
            a(l10.longValue());
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lc0/q;", "V", "Lc0/h;", "", "a", "(Lc0/h;)V"}, k = 3, mv = {1, 9, 0})
    public static final class g extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final g f61104f = new g();

        g() {
            super(1);
        }

        public final void a(C6325h c6325h) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C6325h) obj);
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lc0/q;", "V", "Lc0/h;", "", "a", "(Lc0/h;)V"}, k = 3, mv = {1, 9, 0})
    public static final class h extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final h f61105f = new h();

        h() {
            super(1);
        }

        public final void a(C6325h c6325h) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C6325h) obj);
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lc0/q;", "V", "", "it", "a", "(J)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    static final class i<R> extends Lambda implements Function1<Long, R> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Long, R> f61106f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(Function1<? super Long, ? extends R> function1) {
            super(1);
            this.f61106f = function1;
        }

        public final R a(long j10) {
            return this.f61106f.invoke(Long.valueOf(j10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Long l10) {
            return a(l10.longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends AbstractC6334q> void m(C6325h<T, V> c6325h, long j10, float f10, InterfaceC6319d<T, V> interfaceC6319d, AnimationState<T, V> animationState, Function1<? super C6325h<T, V>, Unit> function1) {
        l(c6325h, j10, f10 == 0.0f ? interfaceC6319d.getDurationNanos() : (long) ((j10 - c6325h.getStartTimeNanos()) / f10), interfaceC6319d, animationState, function1);
    }

    public static final Object b(float f10, float f11, float f12, InterfaceC6326i<Float> interfaceC6326i, Function2<? super Float, ? super Float, Unit> function2, Continuation<? super Unit> continuation) {
        Object objD = d(q0.i(FloatCompanionObject.f142822a), Boxing.c(f10), Boxing.c(f11), Boxing.c(f12), interfaceC6326i, function2, continuation);
        return objD == IntrinsicsKt.f() ? objD : Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, c0.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, V extends kotlin.AbstractC6334q> java.lang.Object c(kotlin.AnimationState<T, V> r23, kotlin.InterfaceC6319d<T, V> r24, long r25, kotlin.jvm.functions.Function1<? super kotlin.C6325h<T, V>, kotlin.Unit> r27, kotlin.coroutines.Continuation<? super kotlin.Unit> r28) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.i0.c(c0.k, c0.d, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T, V extends AbstractC6334q> Object d(o0<T, V> o0Var, T t10, T t11, T t12, InterfaceC6326i<T> interfaceC6326i, Function2<? super T, ? super T, Unit> function2, Continuation<? super Unit> continuation) {
        V vG;
        if (t12 == null || (vG = o0Var.a().invoke(t12)) == null) {
            vG = C6335r.g(o0Var.a().invoke(t10));
        }
        AbstractC6334q abstractC6334q = vG;
        Object objF = f(new AnimationState(o0Var, t10, abstractC6334q, 0L, 0L, false, 56, null), new j0(interfaceC6326i, o0Var, t10, t11, abstractC6334q), 0L, new a(function2, o0Var), continuation, 2, null);
        return objF == IntrinsicsKt.f() ? objF : Unit.f142422a;
    }

    public static /* synthetic */ Object e(float f10, float f11, float f12, InterfaceC6326i interfaceC6326i, Function2 function2, Continuation continuation, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            interfaceC6326i = C6327j.j(0.0f, 0.0f, null, 7, null);
        }
        return b(f10, f11, f12, interfaceC6326i, function2, continuation);
    }

    public static /* synthetic */ Object f(AnimationState animationState, InterfaceC6319d interfaceC6319d, long j10, Function1 function1, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MIN_VALUE;
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            function1 = c.f61089f;
        }
        return c(animationState, interfaceC6319d, j11, function1, continuation);
    }

    public static /* synthetic */ Object h(AnimationState animationState, InterfaceC6342y interfaceC6342y, boolean z10, Function1 function1, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            function1 = g.f61104f;
        }
        return g(animationState, interfaceC6342y, z10, function1, continuation);
    }

    public static /* synthetic */ Object j(AnimationState animationState, Object obj, InterfaceC6326i interfaceC6326i, boolean z10, Function1 function1, Continuation continuation, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            interfaceC6326i = C6327j.j(0.0f, 0.0f, null, 7, null);
        }
        InterfaceC6326i interfaceC6326i2 = interfaceC6326i;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            function1 = h.f61105f;
        }
        return i(animationState, obj, interfaceC6326i2, z11, function1, continuation);
    }

    public static final float n(CoroutineContext coroutineContext) {
        P0.j jVar = (P0.j) coroutineContext.g(P0.j.INSTANCE);
        float fD = jVar != null ? jVar.D() : 1.0f;
        if (!(fD >= 0.0f)) {
            C6310X.b("negative scale factor");
        }
        return fD;
    }

    public static final <T, V extends AbstractC6334q> Object g(AnimationState<T, V> animationState, InterfaceC6342y<T> interfaceC6342y, boolean z10, Function1<? super C6325h<T, V>, Unit> function1, Continuation<? super Unit> continuation) {
        long lastFrameTimeNanos;
        C6341x c6341x = new C6341x(interfaceC6342y, animationState.l(), animationState.getValue(), animationState.p());
        if (z10) {
            lastFrameTimeNanos = animationState.getLastFrameTimeNanos();
        } else {
            lastFrameTimeNanos = Long.MIN_VALUE;
        }
        Object objC = c(animationState, c6341x, lastFrameTimeNanos, function1, continuation);
        if (objC == IntrinsicsKt.f()) {
            return objC;
        }
        return Unit.f142422a;
    }

    public static final <T, V extends AbstractC6334q> Object i(AnimationState<T, V> animationState, T t10, InterfaceC6326i<T> interfaceC6326i, boolean z10, Function1<? super C6325h<T, V>, Unit> function1, Continuation<? super Unit> continuation) {
        long lastFrameTimeNanos;
        j0 j0Var = new j0(interfaceC6326i, animationState.l(), animationState.getValue(), t10, animationState.p());
        if (z10) {
            lastFrameTimeNanos = animationState.getLastFrameTimeNanos();
        } else {
            lastFrameTimeNanos = Long.MIN_VALUE;
        }
        Object objC = c(animationState, j0Var, lastFrameTimeNanos, function1, continuation);
        if (objC == IntrinsicsKt.f()) {
            return objC;
        }
        return Unit.f142422a;
    }

    private static final <R, T, V extends AbstractC6334q> Object k(InterfaceC6319d<T, V> interfaceC6319d, Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
        if (interfaceC6319d.getIsInfinite()) {
            return C6299L.a(function1, continuation);
        }
        return C5712d0.c(new i(function1), continuation);
    }

    private static final <T, V extends AbstractC6334q> void l(C6325h<T, V> c6325h, long j10, long j11, InterfaceC6319d<T, V> interfaceC6319d, AnimationState<T, V> animationState, Function1<? super C6325h<T, V>, Unit> function1) {
        c6325h.j(j10);
        c6325h.l(interfaceC6319d.f(j11));
        c6325h.m(interfaceC6319d.b(j11));
        if (interfaceC6319d.c(j11)) {
            c6325h.i(c6325h.getLastFrameTimeNanos());
            c6325h.k(false);
        }
        o(c6325h, animationState);
        function1.invoke(c6325h);
    }

    public static final <T, V extends AbstractC6334q> void o(C6325h<T, V> c6325h, AnimationState<T, V> animationState) {
        animationState.D(c6325h.e());
        C6335r.f(animationState.p(), c6325h.g());
        animationState.v(c6325h.getFinishedTimeNanos());
        animationState.w(c6325h.getLastFrameTimeNanos());
        animationState.z(c6325h.h());
    }
}
