package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.E;
import androidx.compose.runtime.F;
import androidx.compose.runtime.J;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.z1;
import androidx.recyclerview.widget.RecyclerView;
import c0.k0.a;
import c0.k0.d;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import qv.InterfaceC16622O;
import qv.InterfaceC16654n;

@Metadata(d1 = {"\u0000^\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001ac\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0010R\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\r*\u00020\f*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aC\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0001\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001ao\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\r*\u00020\f*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0017\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00028\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001ak\u0010!\u001a\u00020 \"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\r*\u00020\f*\b\u0012\u0004\u0012\u00028\u00000\u00042\u001c\u0010\u001f\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001eR\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0017\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00028\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0003¢\u0006\u0004\b!\u0010\"\"$\u0010&\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030$\u0012\u0004\u0012\u00020 0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010%\"\u001b\u0010,\u001a\u00020'8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"T", "targetState", "", "label", "Lc0/k0;", "i", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lc0/k0;", "Lc0/m0;", "transitionState", "h", "(Lc0/m0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lc0/k0;", "S", "Lc0/q;", "V", "Lc0/o0;", "typeConverter", "Lc0/k0$a;", "e", "(Lc0/k0;Lc0/o0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lc0/k0$a;", "initialState", "childLabel", "d", "(Lc0/k0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lc0/k0;", "initialValue", "targetValue", "Lc0/F;", "animationSpec", "Landroidx/compose/runtime/z1;", "f", "(Lc0/k0;Ljava/lang/Object;Ljava/lang/Object;Lc0/F;Lc0/o0;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/z1;", "Lc0/k0$d;", "transitionAnimation", "", "a", "(Lc0/k0;Lc0/k0$d;Ljava/lang/Object;Ljava/lang/Object;Lc0/F;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function1;", "Lc0/Z;", "Lkotlin/jvm/functions/Function1;", "SeekableTransitionStateTotalDurationChanged", "Landroidx/compose/runtime/snapshots/k;", "b", "Lkotlin/Lazy;", "g", "()Landroidx/compose/runtime/snapshots/k;", "SeekableStateObserver", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Function1<C6312Z<?>, Unit> f61173a = b.f61177f;

    /* renamed from: b, reason: collision with root package name */
    private static final Lazy f61174b = LazyKt.a(LazyThreadSafetyMode.f142381c, a.f61175f);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/k;", "c", "()Landroidx/compose/runtime/snapshots/k;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class a extends Lambda implements kotlin.jvm.functions.Function0<androidx.compose.runtime.snapshots.k> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f61175f = new a();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "it", "b", "(Lkotlin/jvm/functions/Function0;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: c0.l0$a$a, reason: from Kotlin metadata */
        static final class Function0 extends Lambda implements Function1<kotlin.jvm.functions.Function0<? extends Unit>, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final Function0 f61176f = new Function0();

            Function0() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(kotlin.jvm.functions.Function0<? extends Unit> function0) {
                b(function0);
                return Unit.f142422a;
            }

            public final void b(kotlin.jvm.functions.Function0<Unit> function0) {
                function0.invoke();
            }
        }

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.snapshots.k invoke() {
            androidx.compose.runtime.snapshots.k kVar = new androidx.compose.runtime.snapshots.k(Function0.f61176f);
            kVar.t();
            return kVar;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/Z;", "it", "", "a", "(Lc0/Z;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function1<C6312Z<?>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f61177f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C6312Z<?> c6312z) {
            a(c6312z);
            return Unit.f142422a;
        }

        public final void a(C6312Z<?> c6312z) {
            c6312z.l();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k0<S> f61178f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ k0<S>.d<T, V> f61179g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ T f61180h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ T f61181i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC6293F<T> f61182j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f61183k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k0<S> k0Var, k0<S>.d<T, V> dVar, T t10, T t11, InterfaceC6293F<T> interfaceC6293F, int i10) {
            super(2);
            this.f61178f = k0Var;
            this.f61179g = dVar;
            this.f61180h = t10;
            this.f61181i = t11;
            this.f61182j = interfaceC6293F;
            this.f61183k = i10;
        }

        public final void a(Composer composer, int i10) {
            l0.a(this.f61178f, this.f61179g, this.f61180h, this.f61181i, this.f61182j, composer, J0.a(this.f61183k | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "T", "Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class d extends Lambda implements Function1<F, E> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k0<S> f61184f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ k0<T> f61185g;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"c0/l0$d$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a implements E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k0 f61186a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k0 f61187b;

            public a(k0 k0Var, k0 k0Var2) {
                this.f61186a = k0Var;
                this.f61187b = k0Var2;
            }

            @Override // androidx.compose.runtime.E
            public void dispose() {
                this.f61186a.C(this.f61187b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(k0<S> k0Var, k0<T> k0Var2) {
            super(1);
            this.f61184f = k0Var;
            this.f61185g = k0Var2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke(F f10) {
            this.f61184f.d(this.f61185g);
            return new a(this.f61184f, this.f61185g);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u0002*\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"S", "T", "Lc0/q;", "V", "Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class e extends Lambda implements Function1<F, E> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k0<S> f61188f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ k0<S>.a<T, V> f61189g;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"c0/l0$e$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a implements E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k0 f61190a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k0.a f61191b;

            public a(k0 k0Var, k0.a aVar) {
                this.f61190a = k0Var;
                this.f61191b = aVar;
            }

            @Override // androidx.compose.runtime.E
            public void dispose() {
                this.f61190a.A(this.f61191b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(k0<S> k0Var, k0<S>.a<T, V> aVar) {
            super(1);
            this.f61188f = k0Var;
            this.f61189g = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke(F f10) {
            return new a(this.f61188f, this.f61189g);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u0002*\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"S", "T", "Lc0/q;", "V", "Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class f extends Lambda implements Function1<F, E> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k0<S> f61192f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ k0<S>.d<T, V> f61193g;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"c0/l0$f$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a implements E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k0 f61194a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k0.d f61195b;

            public a(k0 k0Var, k0.d dVar) {
                this.f61194a = k0Var;
                this.f61195b = dVar;
            }

            @Override // androidx.compose.runtime.E
            public void dispose() {
                this.f61194a.B(this.f61195b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(k0<S> k0Var, k0<S>.d<T, V> dVar) {
            super(1);
            this.f61192f = k0Var;
            this.f61193g = dVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke(F f10) {
            this.f61192f.c(this.f61193g);
            return new a(this.f61192f, this.f61193g);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1", f = "Transition.kt", l = {2147}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f61196a;

        /* renamed from: b, reason: collision with root package name */
        Object f61197b;

        /* renamed from: c, reason: collision with root package name */
        int f61198c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ m0<T> f61199d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(m0<T> m0Var, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f61199d = m0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new g(this.f61199d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Av.a compositionContinuationMutex;
            m0 m0Var;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f61198c;
            if (i10 != 0) {
                if (i10 == 1) {
                    m0Var = (m0) this.f61197b;
                    compositionContinuationMutex = (Av.a) this.f61196a;
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                ((C6312Z) this.f61199d).k();
                compositionContinuationMutex = ((C6312Z) this.f61199d).getCompositionContinuationMutex();
                m0 m0Var2 = this.f61199d;
                this.f61196a = compositionContinuationMutex;
                this.f61197b = m0Var2;
                this.f61198c = 1;
                if (compositionContinuationMutex.g(null, this) == objF) {
                    return objF;
                }
                m0Var = m0Var2;
            }
            try {
                ((C6312Z) m0Var).n(m0Var.b());
                InterfaceC16654n interfaceC16654nH = ((C6312Z) m0Var).h();
                if (interfaceC16654nH != null) {
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC16654nH.resumeWith(Result.b(m0Var.b()));
                }
                ((C6312Z) m0Var).o(null);
                Unit unit = Unit.f142422a;
                compositionContinuationMutex.h(null);
                return Unit.f142422a;
            } catch (Throwable th2) {
                compositionContinuationMutex.h(null);
                throw th2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class h extends Lambda implements Function1<F, E> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k0<T> f61200f;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"c0/l0$h$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a implements E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k0 f61201a;

            public a(k0 k0Var) {
                this.f61201a = k0Var;
            }

            @Override // androidx.compose.runtime.E
            public void dispose() {
                this.f61201a.v();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(k0<T> k0Var) {
            super(1);
            this.f61200f = k0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke(F f10) {
            return new a(this.f61200f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class i extends Lambda implements Function1<F, E> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k0<T> f61202f;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"c0/l0$i$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a implements E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k0 f61203a;

            public a(k0 k0Var) {
                this.f61203a = k0Var;
            }

            @Override // androidx.compose.runtime.E
            public void dispose() {
                this.f61203a.v();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(k0<T> k0Var) {
            super(1);
            this.f61202f = k0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke(F f10) {
            return new a(this.f61202f);
        }
    }

    public static final <S, T, V extends AbstractC6334q> k0<S>.a<T, V> e(k0<S> k0Var, o0<T, V> o0Var, String str, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (ComposerKt.M()) {
            ComposerKt.U(-1714122528, i10, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1731)");
        }
        int i12 = (i10 & 14) ^ 6;
        boolean z10 = true;
        boolean z11 = (i12 > 4 && composer.V(k0Var)) || (i10 & 6) == 4;
        Object objB = composer.B();
        if (z11 || objB == Composer.INSTANCE.a()) {
            objB = k0Var.new a(o0Var, str);
            composer.t(objB);
        }
        k0<S>.a<T, V> aVar = (k0.a) objB;
        if ((i12 <= 4 || !composer.V(k0Var)) && (i10 & 6) != 4) {
            z10 = false;
        }
        boolean zD = composer.D(aVar) | z10;
        Object objB2 = composer.B();
        if (zD || objB2 == Composer.INSTANCE.a()) {
            objB2 = new e(k0Var, aVar);
            composer.t(objB2);
        }
        J.c(aVar, (Function1) objB2, composer, 0);
        if (k0Var.t()) {
            aVar.d();
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return aVar;
    }

    @PublishedApi
    public static final <S, T, V extends AbstractC6334q> z1<T> f(k0<S> k0Var, T t10, T t11, InterfaceC6293F<T> interfaceC6293F, o0<T, V> o0Var, String str, Composer composer, int i10) {
        T t12;
        if (ComposerKt.M()) {
            ComposerKt.U(-304821198, i10, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1848)");
        }
        int i11 = i10 & 14;
        int i12 = i11 ^ 6;
        boolean z10 = true;
        boolean z11 = (i12 > 4 && composer.V(k0Var)) || (i10 & 6) == 4;
        Object objB = composer.B();
        if (z11 || objB == Composer.INSTANCE.a()) {
            t12 = t11;
            Object dVar = k0Var.new d(t10, C6329l.i(o0Var, t12), o0Var, str);
            composer.t(dVar);
            objB = dVar;
        } else {
            t12 = t11;
        }
        k0.d dVar2 = (k0.d) objB;
        int i13 = (i10 >> 3) & 8;
        int i14 = i10 << 3;
        a(k0Var, dVar2, t10, t12, interfaceC6293F, composer, (i13 << 9) | (i13 << 6) | i11 | (i14 & 896) | (i14 & 7168) | (57344 & i14));
        if ((i12 <= 4 || !composer.V(k0Var)) && (i10 & 6) != 4) {
            z10 = false;
        }
        boolean zV = composer.V(dVar2) | z10;
        Object objB2 = composer.B();
        if (zV || objB2 == Composer.INSTANCE.a()) {
            objB2 = new f(k0Var, dVar2);
            composer.t(objB2);
        }
        J.c(dVar2, (Function1) objB2, composer, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return dVar2;
    }

    public static final androidx.compose.runtime.snapshots.k g() {
        return (androidx.compose.runtime.snapshots.k) f61174b.getValue();
    }

    public static final <T> k0<T> h(m0<T> m0Var, String str, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.M()) {
            ComposerKt.U(1643203617, i10, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:803)");
        }
        int i12 = (i10 & 14) ^ 6;
        boolean z10 = true;
        boolean z11 = (i12 > 4 && composer.V(m0Var)) || (i10 & 6) == 4;
        Object objB = composer.B();
        if (z11 || objB == Composer.INSTANCE.a()) {
            objB = new k0((m0) m0Var, str);
            composer.t(objB);
        }
        k0<T> k0Var = (k0) objB;
        if (m0Var instanceof C6312Z) {
            composer.startReplaceGroup(1030829284);
            T tA = m0Var.a();
            T tB = m0Var.b();
            if ((i12 <= 4 || !composer.V(m0Var)) && (i10 & 6) != 4) {
                z10 = false;
            }
            Object objB2 = composer.B();
            if (z10 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new g(m0Var, null);
                composer.t(objB2);
            }
            J.f(tA, tB, (Function2) objB2, composer, 0);
            composer.P();
        } else {
            composer.startReplaceGroup(1031290843);
            k0Var.e(m0Var.b(), composer, 0);
            composer.P();
        }
        boolean zV = composer.V(k0Var);
        Object objB3 = composer.B();
        if (zV || objB3 == Composer.INSTANCE.a()) {
            objB3 = new h(k0Var);
            composer.t(objB3);
        }
        J.c(k0Var, (Function1) objB3, composer, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return k0Var;
    }

    public static final <T> k0<T> i(T t10, String str, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.M()) {
            ComposerKt.U(2029166765, i10, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:86)");
        }
        Object objB = composer.B();
        Composer.Companion companion = Composer.INSTANCE;
        if (objB == companion.a()) {
            objB = new k0(t10, str);
            composer.t(objB);
        }
        k0<T> k0Var = (k0) objB;
        k0Var.e(t10, composer, (i10 & 8) | 48 | (i10 & 14));
        Object objB2 = composer.B();
        if (objB2 == companion.a()) {
            objB2 = new i(k0Var);
            composer.t(objB2);
        }
        J.c(k0Var, (Function1) objB2, composer, 54);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return k0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <S, T, V extends AbstractC6334q> void a(k0<S> k0Var, k0<S>.d<T, V> dVar, T t10, T t11, InterfaceC6293F<T> interfaceC6293F, Composer composer, int i10) {
        int i11;
        boolean z10;
        boolean zD;
        int i12;
        boolean zD2;
        int i13;
        boolean zD3;
        int i14;
        int i15;
        int i16;
        Composer composerStartRestartGroup = composer.startRestartGroup(867041821);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.V(k0Var)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i11 = i16 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(dVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 |= i15;
        }
        if ((i10 & 384) == 0) {
            if ((i10 & 512) == 0) {
                zD3 = composerStartRestartGroup.V(t10);
            } else {
                zD3 = composerStartRestartGroup.D(t10);
            }
            if (zD3) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i11 |= i14;
        }
        if ((i10 & 3072) == 0) {
            if ((i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
                zD2 = composerStartRestartGroup.V(t11);
            } else {
                zD2 = composerStartRestartGroup.D(t11);
            }
            if (zD2) {
                i13 = RecyclerView.m.FLAG_MOVED;
            } else {
                i13 = 1024;
            }
            i11 |= i13;
        }
        if ((i10 & 24576) == 0) {
            if ((32768 & i10) == 0) {
                zD = composerStartRestartGroup.V(interfaceC6293F);
            } else {
                zD = composerStartRestartGroup.D(interfaceC6293F);
            }
            if (zD) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i11 |= i12;
        }
        if ((i11 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (composerStartRestartGroup.p(z10, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(867041821, i11, -1, "androidx.compose.animation.core.UpdateInitialAndTargetValues (Transition.kt:1880)");
            }
            if (k0Var.t()) {
                dVar.S(t10, t11, interfaceC6293F);
            } else {
                dVar.T(t11, interfaceC6293F);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new c(k0Var, dVar, t10, t11, interfaceC6293F, i10));
        }
    }

    @PublishedApi
    public static final <S, T> k0<T> d(k0<S> k0Var, T t10, T t11, String str, Composer composer, int i10) {
        boolean z10;
        if (ComposerKt.M()) {
            ComposerKt.U(-198307638, i10, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1773)");
        }
        int i11 = (i10 & 14) ^ 6;
        boolean z11 = true;
        if ((i11 > 4 && composer.V(k0Var)) || (i10 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object objB = composer.B();
        if (z10 || objB == Composer.INSTANCE.a()) {
            objB = new k0(new C6307U(t10), k0Var, k0Var.getLabel() + " > " + str);
            composer.t(objB);
        }
        k0<T> k0Var2 = (k0) objB;
        if ((i11 <= 4 || !composer.V(k0Var)) && (i10 & 6) != 4) {
            z11 = false;
        }
        boolean zV = composer.V(k0Var2) | z11;
        Object objB2 = composer.B();
        if (zV || objB2 == Composer.INSTANCE.a()) {
            objB2 = new d(k0Var, k0Var2);
            composer.t(objB2);
        }
        J.c(k0Var2, (Function1) objB2, composer, 0);
        if (k0Var.t()) {
            k0Var2.D(t10, t11, k0Var.getLastSeekedTimeNanos());
        } else {
            k0Var2.M(t11);
            k0Var2.G(false);
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return k0Var2;
    }
}
