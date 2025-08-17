package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bR\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bR\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bR\u00020\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R+\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R+\u0010)\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010!¨\u0006*"}, d2 = {"Lc0/N;", "", "", "label", "<init>", "(Ljava/lang/String;)V", "", "playTimeNanos", "", "i", "(J)V", "Lc0/N$a;", "animation", "f", "(Lc0/N$a;)V", "j", "k", "(Landroidx/compose/runtime/Composer;I)V", "a", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "LD0/c;", "b", "LD0/c;", "_animations", "", "<set-?>", "c", "Landroidx/compose/runtime/l0;", "g", "()Z", "l", "(Z)V", "refreshChildNeeded", "d", "J", "startTimeNanos", "e", "h", "m", "isRunning", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: c0.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6301N {

    /* renamed from: f, reason: collision with root package name */
    public static final int f60910f = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String label;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final D0.c<a<?, ?>> _animations = new D0.c<>(new a[16], 0);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 refreshChildNeeded = t1.e(Boolean.FALSE, null, 2, null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long startTimeNanos = Long.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 isRunning = t1.e(Boolean.TRUE, null, 2, null);

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BC\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0018\u0010\u0017R\"\u0010\u0005\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R+\u0010/\u001a\u00028\u00002\u0006\u0010*\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001eR0\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u00100\u001a\u0004\b1\u00102RB\u0010:\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001032\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001038\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010=R\u0016\u0010G\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lc0/N$a;", "T", "Lc0/q;", "V", "Landroidx/compose/runtime/z1;", "initialValue", "targetValue", "Lc0/o0;", "typeConverter", "Lc0/i;", "animationSpec", "", "label", "<init>", "(Lc0/N;Ljava/lang/Object;Ljava/lang/Object;Lc0/o0;Lc0/i;Ljava/lang/String;)V", "", "w", "(Ljava/lang/Object;Ljava/lang/Object;Lc0/i;)V", "", "playTimeNanos", "m", "(J)V", "v", "()V", "p", "a", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "setInitialValue$animation_core_release", "(Ljava/lang/Object;)V", "b", "k", "setTargetValue$animation_core_release", "c", "Lc0/o0;", "getTypeConverter", "()Lc0/o0;", "d", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "<set-?>", "e", "Landroidx/compose/runtime/l0;", "getValue", "u", "value", "Lc0/i;", "getAnimationSpec", "()Lc0/i;", "Lc0/j0;", "g", "Lc0/j0;", "getAnimation", "()Lc0/j0;", "setAnimation$animation_core_release", "(Lc0/j0;)V", "animation", "", "h", "Z", "l", "()Z", "setFinished$animation_core_release", "(Z)V", "isFinished", "i", "startOnTheNextFrame", "j", "J", "playTimeNanosOffset", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: c0.N$a */
    public final class a<T, V extends AbstractC6334q> implements z1<T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private T initialValue;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private T targetValue;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final o0<T, V> typeConverter;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String label;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0 value;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private InterfaceC6326i<T> animationSpec;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private j0<T, V> animation;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean isFinished;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean startOnTheNextFrame;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private long playTimeNanosOffset;

        public final void p() {
            this.startOnTheNextFrame = true;
        }

        public a(T t10, T t11, o0<T, V> o0Var, InterfaceC6326i<T> interfaceC6326i, String str) {
            this.initialValue = t10;
            this.targetValue = t11;
            this.typeConverter = o0Var;
            this.label = str;
            this.value = t1.e(t10, null, 2, null);
            this.animationSpec = interfaceC6326i;
            this.animation = new j0<>(this.animationSpec, o0Var, this.initialValue, this.targetValue, null, 16, null);
        }

        public final T f() {
            return this.initialValue;
        }

        @Override // androidx.compose.runtime.z1
        public T getValue() {
            return this.value.getValue();
        }

        public final T k() {
            return this.targetValue;
        }

        /* renamed from: l, reason: from getter */
        public final boolean getIsFinished() {
            return this.isFinished;
        }

        public final void m(long playTimeNanos) {
            C6301N.this.l(false);
            if (this.startOnTheNextFrame) {
                this.startOnTheNextFrame = false;
                this.playTimeNanosOffset = playTimeNanos;
            }
            long j10 = playTimeNanos - this.playTimeNanosOffset;
            u(this.animation.f(j10));
            this.isFinished = this.animation.c(j10);
        }

        public void u(T t10) {
            this.value.setValue(t10);
        }

        public final void v() {
            u(this.animation.g());
            this.startOnTheNextFrame = true;
        }

        public final void w(T initialValue, T targetValue, InterfaceC6326i<T> animationSpec) {
            this.initialValue = initialValue;
            this.targetValue = targetValue;
            this.animationSpec = animationSpec;
            this.animation = new j0<>(animationSpec, this.typeConverter, initialValue, targetValue, null, 16, null);
            C6301N.this.l(true);
            this.isFinished = false;
            this.startOnTheNextFrame = true;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", f = "InfiniteTransition.kt", l = {172, 193}, m = "invokeSuspend")
    /* renamed from: c0.N$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f60927a;

        /* renamed from: b, reason: collision with root package name */
        int f60928b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f60929c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<z1<Long>> f60930d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C6301N f60931e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: c0.N$b$a */
        static final class a extends Lambda implements Function1<Long, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<z1<Long>> f60932f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C6301N f60933g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f60934h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f60935i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC5730l0<z1<Long>> interfaceC5730l0, C6301N c6301n, Ref.FloatRef floatRef, InterfaceC16622O interfaceC16622O) {
                super(1);
                this.f60932f = interfaceC5730l0;
                this.f60933g = c6301n;
                this.f60934h = floatRef;
                this.f60935i = interfaceC16622O;
            }

            public final void a(long j10) {
                z1<Long> value = this.f60932f.getValue();
                long jLongValue = value != null ? value.getValue().longValue() : j10;
                if (this.f60933g.startTimeNanos == Long.MIN_VALUE || this.f60934h.f142832a != i0.n(this.f60935i.getCoroutineContext())) {
                    this.f60933g.startTimeNanos = j10;
                    D0.c cVar = this.f60933g._animations;
                    Object[] objArr = cVar.content;
                    int size = cVar.getSize();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((a) objArr[i10]).p();
                    }
                    this.f60934h.f142832a = i0.n(this.f60935i.getCoroutineContext());
                }
                if (this.f60934h.f142832a != 0.0f) {
                    this.f60933g.i((long) ((jLongValue - this.f60933g.startTimeNanos) / this.f60934h.f142832a));
                    return;
                }
                D0.c cVar2 = this.f60933g._animations;
                Object[] objArr2 = cVar2.content;
                int size2 = cVar2.getSize();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((a) objArr2[i11]).v();
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
                a(l10.longValue());
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: c0.N$b$b, reason: collision with other inner class name */
        static final class C1198b extends Lambda implements Function0<Float> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f60936f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1198b(InterfaceC16622O interfaceC16622O) {
                super(0);
                this.f60936f = interfaceC16622O;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(i0.n(this.f60936f.getCoroutineContext()));
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", f = "InfiniteTransition.kt", l = {}, m = "invokeSuspend")
        /* renamed from: c0.N$b$c */
        static final class c extends SuspendLambda implements Function2<Float, Continuation<? super Boolean>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f60937a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ float f60938b;

            c(Continuation<? super c> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                c cVar = new c(continuation);
                cVar.f60938b = ((Number) obj).floatValue();
                return cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Float f10, Continuation<? super Boolean> continuation) {
                return d(f10.floatValue(), continuation);
            }

            public final Object d(float f10, Continuation<? super Boolean> continuation) {
                return ((c) create(Float.valueOf(f10), continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z10;
                IntrinsicsKt.f();
                if (this.f60937a == 0) {
                    ResultKt.b(obj);
                    if (this.f60938b > 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return Boxing.a(z10);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC5730l0<z1<Long>> interfaceC5730l0, C6301N c6301n, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f60930d = interfaceC5730l0;
            this.f60931e = c6301n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f60930d, this.f60931e, continuation);
            bVar.f60929c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Path cross not found for [B:11:0x0040, B:16:0x005d], limit reached: 18 */
        /* JADX WARN: Path cross not found for [B:16:0x005d, B:11:0x0040], limit reached: 18 */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[PHI: r1 r8
          0x0056: PHI (r1v2 kotlin.jvm.internal.Ref$FloatRef) = (r1v3 kotlin.jvm.internal.Ref$FloatRef), (r1v5 kotlin.jvm.internal.Ref$FloatRef) binds: [B:12:0x0053, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]
          0x0056: PHI (r8v3 qv.O) = (r8v4 qv.O), (r8v5 qv.O) binds: [B:12:0x0053, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005b -> B:11:0x0040). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0076 -> B:11:0x0040). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r7.f60928b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L30
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r7.f60927a
                kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref.FloatRef) r1
                java.lang.Object r4 = r7.f60929c
                qv.O r4 = (qv.InterfaceC16622O) r4
                kotlin.ResultKt.b(r8)
                r8 = r4
                goto L40
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                java.lang.Object r1 = r7.f60927a
                kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref.FloatRef) r1
                java.lang.Object r4 = r7.f60929c
                qv.O r4 = (qv.InterfaceC16622O) r4
                kotlin.ResultKt.b(r8)
                r8 = r4
                goto L56
            L30:
                kotlin.ResultKt.b(r8)
                java.lang.Object r8 = r7.f60929c
                qv.O r8 = (qv.InterfaceC16622O) r8
                kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
                r1.<init>()
                r4 = 1065353216(0x3f800000, float:1.0)
                r1.f142832a = r4
            L40:
                c0.N$b$a r4 = new c0.N$b$a
                androidx.compose.runtime.l0<androidx.compose.runtime.z1<java.lang.Long>> r5 = r7.f60930d
                c0.N r6 = r7.f60931e
                r4.<init>(r5, r6, r1, r8)
                r7.f60929c = r8
                r7.f60927a = r1
                r7.f60928b = r3
                java.lang.Object r4 = kotlin.C6299L.a(r4, r7)
                if (r4 != r0) goto L56
                goto L78
            L56:
                float r4 = r1.f142832a
                r5 = 0
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 != 0) goto L40
                c0.N$b$b r4 = new c0.N$b$b
                r4.<init>(r8)
                tv.f r4 = androidx.compose.runtime.o1.q(r4)
                c0.N$b$c r5 = new c0.N$b$c
                r6 = 0
                r5.<init>(r6)
                r7.f60929c = r8
                r7.f60927a = r1
                r7.f60928b = r2
                java.lang.Object r4 = tv.C17154h.B(r4, r5, r7)
                if (r4 != r0) goto L40
            L78:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C6301N.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c0.N$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f60940g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10) {
            super(2);
            this.f60940g = i10;
        }

        public final void a(Composer composer, int i10) {
            C6301N.this.k(composer, J0.a(this.f60940g | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean g() {
        return ((Boolean) this.refreshChildNeeded.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean h() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(long playTimeNanos) {
        D0.c<a<?, ?>> cVar = this._animations;
        a<?, ?>[] aVarArr = cVar.content;
        int size = cVar.getSize();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            a<?, ?> aVar = aVarArr[i10];
            if (!aVar.getIsFinished()) {
                aVar.m(playTimeNanos);
            }
            if (!aVar.getIsFinished()) {
                z10 = false;
            }
        }
        m(!z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(boolean z10) {
        this.refreshChildNeeded.setValue(Boolean.valueOf(z10));
    }

    private final void m(boolean z10) {
        this.isRunning.setValue(Boolean.valueOf(z10));
    }

    public final void f(a<?, ?> animation) {
        this._animations.c(animation);
        l(true);
    }

    public final void j(a<?, ?> animation) {
        this._animations.s(animation);
    }

    public C6301N(String str) {
        this.label = str;
    }

    public final void k(Composer composer, int i10) {
        int i11;
        boolean z10;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-318043801);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(this)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (composerStartRestartGroup.p(z10, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(-318043801, i11, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:164)");
            }
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e(null, null, 2, null);
                composerStartRestartGroup.t(objB);
            }
            InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            if (!h() && !g()) {
                composerStartRestartGroup.startReplaceGroup(1721270456);
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(1719883733);
                boolean zD = composerStartRestartGroup.D(this);
                Object objB2 = composerStartRestartGroup.B();
                if (zD || objB2 == companion.a()) {
                    objB2 = new b(interfaceC5730l0, this, null);
                    composerStartRestartGroup.t(objB2);
                }
                J.g(this, (Function2) objB2, composerStartRestartGroup, i11 & 14);
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new c(i10));
        }
    }
}
