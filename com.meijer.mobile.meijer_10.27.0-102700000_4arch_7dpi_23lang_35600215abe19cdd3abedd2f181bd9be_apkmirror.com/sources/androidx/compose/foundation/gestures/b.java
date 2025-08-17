package androidx.compose.foundation.gestures;

import H1.t;
import H1.y;
import H1.z;
import androidx.compose.foundation.gestures.d;
import androidx.compose.ui.node.C5815k;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.J;
import f1.C13832e;
import h0.l;
import kotlin.C13803b;
import kotlin.C13804c;
import kotlin.EnumC13827z;
import kotlin.InterfaceC13787E;
import kotlin.InterfaceC13802a;
import kotlin.InterfaceC13816o;
import kotlin.InterfaceC13820s;
import kotlin.InterfaceC6326i;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BW\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u001d*\u00020\u0019H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u00020 *\u00020\u0019H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u001fJ\u0016\u0010\"\u001a\u00020\u0019*\u00020 H\u0002ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\u00020\u0019*\u00020\u001dH\u0002ø\u0001\u0001¢\u0006\u0004\b$\u0010#J\u0016\u0010%\u001a\u00020 *\u00020 H\u0002ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\u0016\u0010'\u001a\u00020\u001d*\u00020\u001dH\u0002ø\u0001\u0001¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\u0013H\u0016¢\u0006\u0004\b(\u0010\u0015J\u000f\u0010)\u001a\u00020\u0013H\u0016¢\u0006\u0004\b)\u0010\u0015JO\u00103\u001a\u00020\u00132=\u00102\u001a9\b\u0001\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110,¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00130+\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001300\u0012\u0006\u0012\u0004\u0018\u0001010*H\u0096@¢\u0006\u0004\b3\u00104J\u001a\u00106\u001a\u00020\u00132\u0006\u00105\u001a\u00020\u001dH\u0016ø\u0001\u0001¢\u0006\u0004\b6\u00107J\u001a\u00108\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020 H\u0016ø\u0001\u0001¢\u0006\u0004\b8\u00107J\u000f\u00109\u001a\u00020\u0007H\u0016¢\u0006\u0004\b9\u0010:J]\u0010;\u001a\u00020\u00132\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b;\u0010\u0012R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010AR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\"\u0010K\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010F\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010\u0018R\u0018\u0010O\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010:\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006R"}, d2 = {"Landroidx/compose/foundation/gestures/b;", "T", "Landroidx/compose/foundation/gestures/e;", "Lf0/c;", "state", "Lf0/z;", "orientation", "", "enabled", "reverseDirection", "Lh0/l;", "interactionSource", "Ld0/J;", "overscrollEffect", "startDragImmediately", "Lf0/s;", "flingBehavior", "<init>", "(Lf0/c;Lf0/z;ZLjava/lang/Boolean;Lh0/l;Ld0/J;Ljava/lang/Boolean;Lf0/s;)V", "", "G3", "()V", "newFlingBehavior", "H3", "(Lf0/s;)V", "", "velocity", "v3", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LU0/f;", "D3", "(F)J", "LH1/y;", "E3", "B3", "(J)F", "C3", "y3", "(J)J", "z3", "t2", "M", "Lkotlin/Function2;", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/d$b;", "Lkotlin/ParameterName;", "name", "dragDelta", "Lkotlin/coroutines/Continuation;", "", "forEachDelta", "Z2", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startedPosition", "d3", "(J)V", "e3", "i3", "()Z", "F3", "z", "Lf0/c;", "A", "Lf0/z;", "B", "Ljava/lang/Boolean;", "C", "Ld0/J;", "D", "E", "Lf0/s;", "F", "w3", "()Lf0/s;", "A3", "resolvedFlingBehavior", "LH1/d;", "G", "LH1/d;", "density", "x3", "isReverseDirection", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class b<T> extends e {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private EnumC13827z orientation;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private Boolean reverseDirection;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private J overscrollEffect;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private Boolean startDragImmediately;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private InterfaceC13820s flingBehavior;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public InterfaceC13820s resolvedFlingBehavior;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private H1.d density;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private C13804c<T> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lf0/a;", "Lf0/o;", "it", "", "<anonymous>", "(Lf0/a;Lf0/o;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2", f = "AnchoredDraggable.kt", l = {HttpResponseStatus.ERROR_REQUEST_TIMEOUT}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function3<InterfaceC13802a, InterfaceC13816o<T>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48194a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f48195b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<Function1<? super d.b, Unit>, Continuation<? super Unit>, Object> f48196c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b<T> f48197d;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/compose/foundation/gestures/d$b;", "dragDelta", "", "a", "(Landroidx/compose/foundation/gestures/d$b;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.gestures.b$a$a, reason: collision with other inner class name */
        static final class C0986a extends Lambda implements Function1<d.b, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b<T> f48198f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC13802a f48199g;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LU0/f;", "deltaForDrag", "a", "(J)J"}, k = 3, mv = {1, 9, 0})
            /* renamed from: androidx.compose.foundation.gestures.b$a$a$a, reason: collision with other inner class name */
            static final class C0987a extends Lambda implements Function1<U0.f, U0.f> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ b<T> f48200f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ InterfaceC13802a f48201g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0987a(b<T> bVar, InterfaceC13802a interfaceC13802a) {
                    super(1);
                    this.f48200f = bVar;
                    this.f48201g = interfaceC13802a;
                }

                public final long a(long j10) {
                    float fZ = ((b) this.f48200f).state.z(this.f48200f.C3(j10));
                    b<T> bVar = this.f48200f;
                    long jD3 = bVar.D3(fZ - ((b) bVar).state.A());
                    InterfaceC13802a.b(this.f48201g, fZ, 0.0f, 2, null);
                    return jD3;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ U0.f invoke(U0.f fVar) {
                    return U0.f.d(a(fVar.getPackedValue()));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0986a(b<T> bVar, InterfaceC13802a interfaceC13802a) {
                super(1);
                this.f48198f = bVar;
                this.f48199g = interfaceC13802a;
            }

            public final void a(d.b bVar) {
                b<T> bVar2 = this.f48198f;
                float fC3 = bVar2.C3(bVar2.z3(bVar.getDelta()));
                if (((b) this.f48198f).overscrollEffect == null) {
                    InterfaceC13802a.b(this.f48199g, ((b) this.f48198f).state.z(fC3), 0.0f, 2, null);
                    return;
                }
                J j10 = ((b) this.f48198f).overscrollEffect;
                Intrinsics.g(j10);
                j10.b(this.f48198f.D3(fC3), C13832e.INSTANCE.d(), new C0987a(this.f48198f, this.f48199g));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(d.b bVar) {
                a(bVar);
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super Function1<? super d.b, Unit>, ? super Continuation<? super Unit>, ? extends Object> function2, b<T> bVar, Continuation<? super a> continuation) {
            super(3, continuation);
            this.f48196c = function2;
            this.f48197d = bVar;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13802a interfaceC13802a, InterfaceC13816o<T> interfaceC13816o, Continuation<? super Unit> continuation) {
            a aVar = new a(this.f48196c, this.f48197d, continuation);
            aVar.f48195b = interfaceC13802a;
            return aVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48194a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC13802a interfaceC13802a = (InterfaceC13802a) this.f48195b;
                Function2<Function1<? super d.b, Unit>, Continuation<? super Unit>, Object> function2 = this.f48196c;
                C0986a c0986a = new C0986a(this.f48197d, interfaceC13802a);
                this.f48194a = 1;
                if (function2.invoke(c0986a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode", f = "AnchoredDraggable.kt", l = {455, 458}, m = "fling")
    /* renamed from: androidx.compose.foundation.gestures.b$b, reason: collision with other inner class name */
    static final class C0988b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f48202a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f48203b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b<T> f48204c;

        /* renamed from: d, reason: collision with root package name */
        int f48205d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0988b(b<T> bVar, Continuation<? super C0988b> continuation) {
            super(continuation);
            this.f48204c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f48203b = obj;
            this.f48205d |= Integer.MIN_VALUE;
            return this.f48204c.v3(0.0f, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lf0/a;", "Lf0/o;", "it", "", "<anonymous>", "(Lf0/a;Lf0/o;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2", f = "AnchoredDraggable.kt", l = {469}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function3<InterfaceC13802a, InterfaceC13816o<T>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48206a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f48207b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b<T> f48208c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f48209d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f48210e;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/gestures/b$c$a", "Lf0/E;", "", "pixels", "e", "(F)F", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC13787E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b<T> f48211a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC13802a f48212b;

            a(b<T> bVar, InterfaceC13802a interfaceC13802a) {
                this.f48211a = bVar;
                this.f48212b = interfaceC13802a;
            }

            @Override // kotlin.InterfaceC13787E
            public float e(float pixels) {
                float fZ = ((b) this.f48211a).state.z(pixels);
                float fR = fZ - ((b) this.f48211a).state.r();
                InterfaceC13802a.b(this.f48212b, fZ, 0.0f, 2, null);
                return fR;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b<T> bVar, Ref.FloatRef floatRef, float f10, Continuation<? super c> continuation) {
            super(3, continuation);
            this.f48208c = bVar;
            this.f48209d = floatRef;
            this.f48210e = f10;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13802a interfaceC13802a, InterfaceC13816o<T> interfaceC13816o, Continuation<? super Unit> continuation) {
            c cVar = new c(this.f48208c, this.f48209d, this.f48210e, continuation);
            cVar.f48207b = interfaceC13802a;
            return cVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.FloatRef floatRef;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48206a;
            if (i10 != 0) {
                if (i10 == 1) {
                    floatRef = (Ref.FloatRef) this.f48207b;
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                a aVar = new a(this.f48208c, (InterfaceC13802a) this.f48207b);
                InterfaceC13820s interfaceC13820sW3 = this.f48208c.w3();
                Ref.FloatRef floatRef2 = this.f48209d;
                float f10 = this.f48210e;
                this.f48207b = floatRef2;
                this.f48206a = 1;
                obj = interfaceC13820sW3.a(aVar, f10, this);
                if (obj == objF) {
                    return objF;
                }
                floatRef = floatRef2;
            }
            floatRef.f142832a = ((Number) obj).floatValue();
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1", f = "AnchoredDraggable.kt", l = {434, 436}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48213a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b<T> f48214b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f48215c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b<T> bVar, long j10, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f48214b = bVar;
            this.f48215c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.f48214b, this.f48215c, continuation);
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LH1/y;", "availableVelocity", "<anonymous>", "(LH1/y;)LH1/y;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1", f = "AnchoredDraggable.kt", l = {438}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<y, Continuation<? super y>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f48216a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ long f48217b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b<T> f48218c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b<T> bVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f48218c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f48218c, continuation);
                aVar.f48217b = ((y) obj).getPackedValue();
                return aVar;
            }

            public final Object d(long j10, Continuation<? super y> continuation) {
                return ((a) create(y.b(j10), continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(y yVar, Continuation<? super y> continuation) {
                return d(yVar.getPackedValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                long jE3;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f48216a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        jE3 = this.f48217b;
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    long j10 = this.f48217b;
                    b<T> bVar = this.f48218c;
                    float fB3 = bVar.B3(j10);
                    this.f48217b = j10;
                    this.f48216a = 1;
                    obj = bVar.v3(fB3, this);
                    if (obj == objF) {
                        return objF;
                    }
                    jE3 = j10;
                }
                float fFloatValue = ((Number) obj).floatValue();
                float fA = ((b) this.f48218c).state.A();
                float fE = ((b) this.f48218c).state.l().e();
                if (fA >= ((b) this.f48218c).state.l().f() || fA <= fE) {
                    jE3 = this.f48218c.E3(fFloatValue);
                }
                return y.b(jE3);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        
            if (r1.v3(r8, r7) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        
            if (r1.c(r3, r8, r7) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r7.f48213a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L17:
                kotlin.ResultKt.b(r8)
                goto L5d
            L1b:
                kotlin.ResultKt.b(r8)
                androidx.compose.foundation.gestures.b<T> r8 = r7.f48214b
                long r4 = r7.f48215c
                long r4 = androidx.compose.foundation.gestures.b.p3(r8, r4)
                float r8 = androidx.compose.foundation.gestures.b.r3(r8, r4)
                androidx.compose.foundation.gestures.b<T> r1 = r7.f48214b
                d0.J r1 = androidx.compose.foundation.gestures.b.n3(r1)
                if (r1 != 0) goto L3d
                androidx.compose.foundation.gestures.b<T> r1 = r7.f48214b
                r7.f48213a = r3
                java.lang.Object r8 = androidx.compose.foundation.gestures.b.m3(r1, r8, r7)
                if (r8 != r0) goto L5d
                goto L5c
            L3d:
                androidx.compose.foundation.gestures.b<T> r1 = r7.f48214b
                d0.J r1 = androidx.compose.foundation.gestures.b.n3(r1)
                kotlin.jvm.internal.Intrinsics.g(r1)
                androidx.compose.foundation.gestures.b<T> r3 = r7.f48214b
                long r3 = androidx.compose.foundation.gestures.b.u3(r3, r8)
                androidx.compose.foundation.gestures.b$d$a r8 = new androidx.compose.foundation.gestures.b$d$a
                androidx.compose.foundation.gestures.b<T> r5 = r7.f48214b
                r6 = 0
                r8.<init>(r5, r6)
                r7.f48213a = r2
                java.lang.Object r8 = r1.c(r3, r8, r7)
                if (r8 != r0) goto L5d
            L5c:
                return r0
            L5d:
                kotlin.Unit r8 = kotlin.Unit.f142422a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // androidx.compose.foundation.gestures.e
    public void d3(long startedPosition) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float B3(long j10) {
        return this.orientation == EnumC13827z.f130585a ? y.i(j10) : y.h(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float C3(long j10) {
        return Float.intBitsToFloat((int) (this.orientation == EnumC13827z.f130585a ? j10 & 4294967295L : j10 >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long D3(float f10) {
        EnumC13827z enumC13827z = this.orientation;
        float f11 = enumC13827z == EnumC13827z.f130586b ? f10 : 0.0f;
        if (enumC13827z != EnumC13827z.f130585a) {
            f10 = 0.0f;
        }
        return U0.f.e((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long E3(float f10) {
        EnumC13827z enumC13827z = this.orientation;
        float f11 = enumC13827z == EnumC13827z.f130586b ? f10 : 0.0f;
        if (enumC13827z != EnumC13827z.f130585a) {
            f10 = 0.0f;
        }
        return z.a(f11, f10);
    }

    private final void H3(InterfaceC13820s newFlingBehavior) {
        if (newFlingBehavior == null) {
            C13803b c13803b = C13803b.f130302a;
            InterfaceC6326i<Float> interfaceC6326iD = c13803b.d();
            Function1<Float, Float> function1C = c13803b.c();
            H1.d dVarK = C5815k.k(this);
            this.density = dVarK;
            newFlingBehavior = androidx.compose.foundation.gestures.a.n(this.state, dVarK, function1C, interfaceC6326iD);
        }
        A3(newFlingBehavior);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v3(float r8, kotlin.coroutines.Continuation<? super java.lang.Float> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.b.C0988b
            if (r0 == 0) goto L14
            r0 = r9
            androidx.compose.foundation.gestures.b$b r0 = (androidx.compose.foundation.gestures.b.C0988b) r0
            int r1 = r0.f48205d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f48205d = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            androidx.compose.foundation.gestures.b$b r0 = new androidx.compose.foundation.gestures.b$b
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f48203b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r4.f48205d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r8 = r4.f48202a
            kotlin.jvm.internal.Ref$FloatRef r8 = (kotlin.jvm.internal.Ref.FloatRef) r8
            kotlin.ResultKt.b(r9)
            goto L73
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            kotlin.ResultKt.b(r9)
            return r9
        L3e:
            kotlin.ResultKt.b(r9)
            f0.c<T> r9 = r7.state
            boolean r9 = r9.w()
            if (r9 == 0) goto L55
            f0.c<T> r9 = r7.state
            r4.f48205d = r3
            java.lang.Object r8 = r9.H(r8, r4)
            if (r8 != r0) goto L54
            goto L71
        L54:
            return r8
        L55:
            kotlin.jvm.internal.Ref$FloatRef r9 = new kotlin.jvm.internal.Ref$FloatRef
            r9.<init>()
            r9.f142832a = r8
            f0.c<T> r1 = r7.state
            androidx.compose.foundation.gestures.b$c r3 = new androidx.compose.foundation.gestures.b$c
            r5 = 0
            r3.<init>(r7, r9, r8, r5)
            r4.f48202a = r9
            r4.f48205d = r2
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r8 = kotlin.C13804c.j(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L72
        L71:
            return r0
        L72:
            r8 = r9
        L73:
            float r8 = r8.f142832a
            java.lang.Float r8 = kotlin.coroutines.jvm.internal.Boxing.c(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.v3(float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final boolean x3() {
        Boolean bool = this.reverseDirection;
        if (bool == null) {
            return C5815k.n(this) == t.f12007b && this.orientation == EnumC13827z.f130586b;
        }
        Intrinsics.g(bool);
        return bool.booleanValue();
    }

    public final void A3(InterfaceC13820s interfaceC13820s) {
        this.resolvedFlingBehavior = interfaceC13820s;
    }

    public final void F3(C13804c<T> state, EnumC13827z orientation, boolean enabled, Boolean reverseDirection, l interactionSource, J overscrollEffect, Boolean startDragImmediately, InterfaceC13820s flingBehavior) {
        boolean z10;
        boolean z11;
        this.flingBehavior = flingBehavior;
        if (Intrinsics.e(this.state, state)) {
            z10 = false;
        } else {
            this.state = state;
            H3(flingBehavior);
            z10 = true;
        }
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z10 = true;
        }
        if (Intrinsics.e(this.reverseDirection, reverseDirection)) {
            z11 = z10;
        } else {
            this.reverseDirection = reverseDirection;
            z11 = true;
        }
        this.startDragImmediately = startDragImmediately;
        this.overscrollEffect = overscrollEffect;
        e.l3(this, null, enabled, interactionSource, orientation, z11, 1, null);
    }

    @Override // androidx.compose.foundation.gestures.e
    public Object Z2(Function2<? super Function1<? super d.b, Unit>, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objJ = C13804c.j(this.state, null, new a(function2, this, null), continuation, 1, null);
        return objJ == IntrinsicsKt.f() ? objJ : Unit.f142422a;
    }

    @Override // androidx.compose.foundation.gestures.e
    /* renamed from: i3 */
    public boolean getStartDragImmediately() {
        Boolean bool = this.startDragImmediately;
        return bool != null ? bool.booleanValue() : this.state.y();
    }

    @Override // androidx.compose.ui.Modifier.c
    public void t2() {
        H3(this.flingBehavior);
    }

    public final InterfaceC13820s w3() {
        InterfaceC13820s interfaceC13820s = this.resolvedFlingBehavior;
        if (interfaceC13820s != null) {
            return interfaceC13820s;
        }
        Intrinsics.y("resolvedFlingBehavior");
        return null;
    }

    public b(C13804c<T> c13804c, EnumC13827z enumC13827z, boolean z10, Boolean bool, l lVar, J j10, Boolean bool2, InterfaceC13820s interfaceC13820s) {
        super(androidx.compose.foundation.gestures.a.f48131a, z10, lVar, enumC13827z);
        this.state = c13804c;
        this.orientation = enumC13827z;
        this.reverseDirection = bool;
        this.overscrollEffect = j10;
        this.startDragImmediately = bool2;
        this.flingBehavior = interfaceC13820s;
    }

    private final void G3() {
        H1.d dVarK = C5815k.k(this);
        H1.d dVar = this.density;
        if (dVar != null && Intrinsics.e(dVar, dVarK)) {
            return;
        }
        this.density = dVarK;
        H3(this.flingBehavior);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long y3(long j10) {
        float f10;
        if (x3()) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        return y.m(j10, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long z3(long j10) {
        float f10;
        if (x3()) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        return U0.f.r(j10, f10);
    }

    @Override // androidx.compose.ui.node.InterfaceC5814j, androidx.compose.ui.node.q0
    public void M() {
        v1();
        if (getIsAttached()) {
            G3();
        }
    }

    @Override // androidx.compose.foundation.gestures.e
    public void e3(long velocity) {
        if (getIsAttached()) {
            C16648k.d(j2(), null, null, new d(this, velocity, null), 3, null);
        }
    }
}
