package androidx.compose.foundation.gestures;

import H1.z;
import androidx.compose.foundation.gestures.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.AbstractC5959m;
import androidx.compose.ui.node.q0;
import com.google.android.gms.common.api.a;
import g1.C14314q;
import g1.EnumC14315s;
import g1.J;
import g1.PointerInputChange;
import g1.U;
import g1.W;
import h0.C14434a;
import h0.C14435b;
import h0.l;
import h1.C14440d;
import h1.C14441e;
import kotlin.C13928q;
import kotlin.EnumC13937z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15784P;
import mv.C15809k;
import mv.InterfaceC15783O;
import ov.j;
import ov.k;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJO\u0010%\u001a\u00020\u000e2=\u0010$\u001a9\b\u0001\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\"\u0012\u0006\u0012\u0004\u0018\u00010#0\u001dH¦@¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'H&ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+H&ø\u0001\u0000¢\u0006\u0004\b-\u0010*J\u000f\u0010.\u001a\u00020\u0005H&¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u000eH\u0016¢\u0006\u0004\b0\u0010\u0010J*\u00107\u001a\u00020\u000e2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0016ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u000eH\u0016¢\u0006\u0004\b9\u0010\u0010J\r\u0010:\u001a\u00020\u000e¢\u0006\u0004\b:\u0010\u0010JO\u0010<\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010;\u001a\u00020\u0005¢\u0006\u0004\b<\u0010=R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R<\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR$\u0010\u0007\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u00058\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010/R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010@\u001a\u0004\u0018\u00010\b8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR \u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010BR\u001e\u0010R\u001a\n\u0012\u0004\u0012\u00020O\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010FR\u0018\u0010[\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010Z\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\\"}, d2 = {"Landroidx/compose/foundation/gestures/e;", "Landroidx/compose/ui/node/m;", "Landroidx/compose/ui/node/q0;", "Lkotlin/Function1;", "Lg1/B;", "", "canDrag", "enabled", "Lh0/l;", "interactionSource", "Lf0/z;", "orientationLock", "<init>", "(Lkotlin/jvm/functions/Function1;ZLh0/l;Lf0/z;)V", "", "j3", "()V", "Lg1/W;", "c3", "()Lg1/W;", "Landroidx/compose/foundation/gestures/d$c;", "event", "g3", "(Landroidx/compose/foundation/gestures/d$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/d$d;", "h3", "(Landroidx/compose/foundation/gestures/d$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f3", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/d$b;", "Lkotlin/ParameterName;", "name", "dragDelta", "Lkotlin/coroutines/Continuation;", "", "forEachDelta", "Z2", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LU0/f;", "startedPosition", "d3", "(J)V", "LH1/y;", "velocity", "e3", "i3", "()Z", "u2", "Lg1/q;", "pointerEvent", "Lg1/s;", "pass", "LH1/r;", "bounds", "s1", "(Lg1/q;Lg1/s;J)V", "v1", "Y2", "shouldResetPointerInputHandling", "k3", "(Lkotlin/jvm/functions/Function1;ZLh0/l;Lf0/z;Z)V", "q", "Lf0/z;", "<set-?>", "r", "Lkotlin/jvm/functions/Function1;", "a3", "()Lkotlin/jvm/functions/Function1;", "s", "Z", "b3", "t", "Lh0/l;", "getInteractionSource", "()Lh0/l;", "u", "_canDrag", "Lov/g;", "Landroidx/compose/foundation/gestures/d;", "v", "Lov/g;", "channel", "Lh0/b;", "w", "Lh0/b;", "dragInteraction", "x", "isListeningForEvents", "y", "Lg1/W;", "pointerInputNode", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class e extends AbstractC5959m implements q0 {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private EnumC13937z orientationLock;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Function1<? super PointerInputChange, Boolean> canDrag;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private l interactionSource;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Function1<PointerInputChange, Boolean> _canDrag = new a();

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private ov.g<androidx.compose.foundation.gestures.d> channel;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private C14435b dragInteraction;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean isListeningForEvents;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private W pointerInputNode;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg1/B;", "it", "", "a", "(Lg1/B;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<PointerInputChange, Boolean> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return e.this.a3().invoke(pointerInputChange);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/J;", "", "invoke", "(Lg1/J;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class b implements PointerInputEventHandler {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1", f = "Draggable.kt", l = {512}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f48461a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f48462b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f48463c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ J f48464d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function3<PointerInputChange, PointerInputChange, U0.f, Unit> f48465e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1<PointerInputChange, Unit> f48466f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f48467g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0<Boolean> f48468h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function2<PointerInputChange, U0.f, Unit> f48469i;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f48463c, this.f48464d, this.f48465e, this.f48466f, this.f48467g, this.f48468h, this.f48469i, continuation);
                aVar.f48462b = obj;
                return aVar;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(e eVar, J j10, Function3<? super PointerInputChange, ? super PointerInputChange, ? super U0.f, Unit> function3, Function1<? super PointerInputChange, Unit> function1, Function0<Unit> function0, Function0<Boolean> function02, Function2<? super PointerInputChange, ? super U0.f, Unit> function2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f48463c = eVar;
                this.f48464d = j10;
                this.f48465e = function3;
                this.f48466f = function1;
                this.f48467g = function0;
                this.f48468h = function02;
                this.f48469i = function2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r11.f48461a
                    r2 = 1
                    if (r1 == 0) goto L21
                    if (r1 != r2) goto L19
                    java.lang.Object r0 = r11.f48462b
                    r1 = r0
                    mv.O r1 = (mv.InterfaceC15783O) r1
                    kotlin.ResultKt.b(r12)     // Catch: java.util.concurrent.CancellationException -> L15
                    r10 = r11
                    goto L64
                L15:
                    r0 = move-exception
                    r12 = r0
                    r10 = r11
                    goto L4d
                L19:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L21:
                    kotlin.ResultKt.b(r12)
                    java.lang.Object r12 = r11.f48462b
                    r1 = r12
                    mv.O r1 = (mv.InterfaceC15783O) r1
                    androidx.compose.foundation.gestures.e r12 = r11.f48463c     // Catch: java.util.concurrent.CancellationException -> L4a
                    f0.z r8 = androidx.compose.foundation.gestures.e.R2(r12)     // Catch: java.util.concurrent.CancellationException -> L4a
                    g1.J r3 = r11.f48464d     // Catch: java.util.concurrent.CancellationException -> L4a
                    kotlin.jvm.functions.Function3<g1.B, g1.B, U0.f, kotlin.Unit> r4 = r11.f48465e     // Catch: java.util.concurrent.CancellationException -> L4a
                    kotlin.jvm.functions.Function1<g1.B, kotlin.Unit> r5 = r11.f48466f     // Catch: java.util.concurrent.CancellationException -> L4a
                    kotlin.jvm.functions.Function0<kotlin.Unit> r6 = r11.f48467g     // Catch: java.util.concurrent.CancellationException -> L4a
                    kotlin.jvm.functions.Function0<java.lang.Boolean> r7 = r11.f48468h     // Catch: java.util.concurrent.CancellationException -> L4a
                    kotlin.jvm.functions.Function2<g1.B, U0.f, kotlin.Unit> r9 = r11.f48469i     // Catch: java.util.concurrent.CancellationException -> L4a
                    r11.f48462b = r1     // Catch: java.util.concurrent.CancellationException -> L4a
                    r11.f48461a = r2     // Catch: java.util.concurrent.CancellationException -> L4a
                    r10 = r11
                    java.lang.Object r12 = kotlin.C13924m.f(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L47
                    if (r12 != r0) goto L64
                    return r0
                L47:
                    r0 = move-exception
                L48:
                    r12 = r0
                    goto L4d
                L4a:
                    r0 = move-exception
                    r10 = r11
                    goto L48
                L4d:
                    androidx.compose.foundation.gestures.e r0 = r10.f48463c
                    ov.g r0 = androidx.compose.foundation.gestures.e.Q2(r0)
                    if (r0 == 0) goto L5e
                    androidx.compose.foundation.gestures.d$a r2 = androidx.compose.foundation.gestures.d.a.f48446a
                    java.lang.Object r0 = r0.k(r2)
                    ov.k.b(r0)
                L5e:
                    boolean r0 = mv.C15784P.i(r1)
                    if (r0 == 0) goto L67
                L64:
                    kotlin.Unit r12 = kotlin.Unit.f143329a
                    return r12
                L67:
                    throw r12
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.e.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lg1/B;", "change", "LU0/f;", "delta", "", "a", "(Lg1/B;J)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.gestures.e$b$b, reason: collision with other inner class name */
        static final class C1003b extends Lambda implements Function2<PointerInputChange, U0.f, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C14440d f48470f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ e f48471g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1003b(C14440d c14440d, e eVar) {
                super(2);
                this.f48470f = c14440d;
                this.f48471g = eVar;
            }

            public final void a(PointerInputChange pointerInputChange, long j10) {
                C14441e.c(this.f48470f, pointerInputChange);
                ov.g gVar = this.f48471g.channel;
                if (gVar != null) {
                    k.b(gVar.k(new d.b(j10, null)));
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, U0.f fVar) {
                a(pointerInputChange, fVar.getPackedValue());
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        static final class c extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ e f48472f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(e eVar) {
                super(0);
                this.f48472f = eVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ov.g gVar = this.f48472f.channel;
                if (gVar != null) {
                    k.b(gVar.k(d.a.f48446a));
                }
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg1/B;", "upEvent", "", "a", "(Lg1/B;)V"}, k = 3, mv = {1, 9, 0})
        static final class d extends Lambda implements Function1<PointerInputChange, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C14440d f48473f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ J f48474g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ e f48475h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(C14440d c14440d, J j10, e eVar) {
                super(1);
                this.f48473f = c14440d;
                this.f48474g = j10;
                this.f48475h = eVar;
            }

            public final void a(PointerInputChange pointerInputChange) {
                C14441e.c(this.f48473f, pointerInputChange);
                float f10 = this.f48474g.getViewConfiguration().f();
                long jB = this.f48473f.b(z.a(f10, f10));
                this.f48473f.e();
                ov.g gVar = this.f48475h.channel;
                if (gVar != null) {
                    k.b(gVar.k(new d.C1002d(C13928q.l(jB), null)));
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
                a(pointerInputChange);
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lg1/B;", "down", "slopTriggerChange", "LU0/f;", "postSlopOffset", "", "a", "(Lg1/B;Lg1/B;J)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.gestures.e$b$e, reason: collision with other inner class name */
        static final class C1004e extends Lambda implements Function3<PointerInputChange, PointerInputChange, U0.f, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ e f48476f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C14440d f48477g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1004e(e eVar, C14440d c14440d) {
                super(3);
                this.f48476f = eVar;
                this.f48477g = c14440d;
            }

            public final void a(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, long j10) {
                if (this.f48476f.a3().invoke(pointerInputChange).booleanValue()) {
                    if (!this.f48476f.isListeningForEvents) {
                        if (this.f48476f.channel == null) {
                            this.f48476f.channel = j.b(a.e.API_PRIORITY_OTHER, null, null, 6, null);
                        }
                        this.f48476f.j3();
                    }
                    C14441e.c(this.f48477g, pointerInputChange);
                    long jP = U0.f.p(pointerInputChange2.getPosition(), j10);
                    ov.g gVar = this.f48476f.channel;
                    if (gVar != null) {
                        k.b(gVar.k(new d.c(jP, null)));
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, U0.f fVar) {
                a(pointerInputChange, pointerInputChange2, fVar.getPackedValue());
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        static final class f extends Lambda implements Function0<Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ e f48478f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(e eVar) {
                super(0);
                this.f48478f = eVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(!this.f48478f.getStartDragImmediately());
            }
        }

        b() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(J j10, Continuation<? super Unit> continuation) {
            C14440d c14440d = new C14440d();
            Object objG = C15784P.g(new a(e.this, j10, new C1004e(e.this, c14440d), new d(c14440d, j10, e.this), new c(e.this), new f(e.this), new C1003b(c14440d, e.this), null), continuation);
            return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {552}, m = "processDragCancel")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f48479a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f48480b;

        /* renamed from: d, reason: collision with root package name */
        int f48482d;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f48480b = obj;
            this.f48482d |= Integer.MIN_VALUE;
            return e.this.f3(this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {534, 537}, m = "processDragStart")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f48483a;

        /* renamed from: b, reason: collision with root package name */
        Object f48484b;

        /* renamed from: c, reason: collision with root package name */
        Object f48485c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f48486d;

        /* renamed from: f, reason: collision with root package name */
        int f48488f;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f48486d = obj;
            this.f48488f |= Integer.MIN_VALUE;
            return e.this.g3(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {544}, m = "processDragStop")
    /* renamed from: androidx.compose.foundation.gestures.e$e, reason: collision with other inner class name */
    static final class C1005e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f48489a;

        /* renamed from: b, reason: collision with root package name */
        Object f48490b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f48491c;

        /* renamed from: e, reason: collision with root package name */
        int f48493e;

        C1005e(Continuation<? super C1005e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f48491c = obj;
            this.f48493e |= Integer.MIN_VALUE;
            return e.this.h3(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", f = "Draggable.kt", l = {421, 423, 425, 432, 434, 437}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f48494a;

        /* renamed from: b, reason: collision with root package name */
        Object f48495b;

        /* renamed from: c, reason: collision with root package name */
        int f48496c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f48497d;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = e.this.new f(continuation);
            fVar.f48497d = obj;
            return fVar;
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0000H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/d$b;", "Lkotlin/ParameterName;", "name", "dragDelta", "", "processDelta", "<anonymous>", "(Lkotlin/jvm/functions/Function1;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", f = "Draggable.kt", l = {428}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<Function1<? super d.b, ? extends Unit>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f48499a;

            /* renamed from: b, reason: collision with root package name */
            int f48500b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f48501c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<androidx.compose.foundation.gestures.d> f48502d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ e f48503e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Ref.ObjectRef<androidx.compose.foundation.gestures.d> objectRef, e eVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f48502d = objectRef;
                this.f48503e = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f48502d, this.f48503e, continuation);
                aVar.f48501c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Function1<? super d.b, Unit> function1, Continuation<? super Unit> continuation) {
                return ((a) create(function1, continuation)).invokeSuspend(Unit.f143329a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0049 -> B:25:0x005b). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0055 -> B:24:0x0058). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r5.f48500b
                    r2 = 1
                    if (r1 == 0) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r1 = r5.f48499a
                    kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                    java.lang.Object r3 = r5.f48501c
                    kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
                    kotlin.ResultKt.b(r6)
                    goto L58
                L17:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1f:
                    kotlin.ResultKt.b(r6)
                    java.lang.Object r6 = r5.f48501c
                    kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
                    r3 = r6
                L27:
                    kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.d> r6 = r5.f48502d
                    T r6 = r6.f143742a
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.d.C1002d
                    if (r1 != 0) goto L5e
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.d.a
                    if (r1 != 0) goto L5e
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.d.b
                    r4 = 0
                    if (r1 == 0) goto L3b
                    androidx.compose.foundation.gestures.d$b r6 = (androidx.compose.foundation.gestures.d.b) r6
                    goto L3c
                L3b:
                    r6 = r4
                L3c:
                    if (r6 == 0) goto L41
                    r3.invoke(r6)
                L41:
                    kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.d> r1 = r5.f48502d
                    androidx.compose.foundation.gestures.e r6 = r5.f48503e
                    ov.g r6 = androidx.compose.foundation.gestures.e.Q2(r6)
                    if (r6 == 0) goto L5b
                    r5.f48501c = r3
                    r5.f48499a = r1
                    r5.f48500b = r2
                    java.lang.Object r6 = r6.e(r5)
                    if (r6 != r0) goto L58
                    return r0
                L58:
                    r4 = r6
                    androidx.compose.foundation.gestures.d r4 = (androidx.compose.foundation.gestures.d) r4
                L5b:
                    r1.f143742a = r4
                    goto L27
                L5e:
                    kotlin.Unit r6 = kotlin.Unit.f143329a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.e.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x00fb, code lost:
        
            if (r7.f3(r6) != r0) goto L11;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:44:0x00da, B:40:0x00c1], limit reached: 56 */
        /* JADX WARN: Path cross not found for [B:46:0x00de, B:19:0x005e], limit reached: 56 */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[PHI: r1 r3
          0x0034: PHI (r1v14 kotlin.jvm.internal.Ref$ObjectRef) = (r1v6 kotlin.jvm.internal.Ref$ObjectRef), (r1v19 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:13:0x0031, B:36:0x00b8] A[DONT_GENERATE, DONT_INLINE]
          0x0034: PHI (r3v8 mv.O) = (r3v5 mv.O), (r3v11 mv.O) binds: [B:13:0x0031, B:36:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[PHI: r4
          0x005e: PHI (r4v7 mv.O) = (r4v0 mv.O), (r4v3 mv.O), (r4v3 mv.O), (r4v3 mv.O), (r4v5 mv.O), (r4v8 mv.O) binds: [B:18:0x0056, B:45:0x00dc, B:47:0x00eb, B:41:0x00d5, B:30:0x008e, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00c1 A[Catch: CancellationException -> 0x00d8, TryCatch #2 {CancellationException -> 0x00d8, blocks: (B:38:0x00bb, B:40:0x00c1, B:44:0x00da, B:46:0x00de), top: B:59:0x00bb }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00da A[Catch: CancellationException -> 0x00d8, TryCatch #2 {CancellationException -> 0x00d8, blocks: (B:38:0x00bb, B:40:0x00c1, B:44:0x00da, B:46:0x00de), top: B:59:0x00bb }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00fe  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008e -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d5 -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00dc -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00eb -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00fb -> B:11:0x0027). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instructions count: 276
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.e.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j3() {
        this.isListeningForEvents = true;
        C15809k.d(j2(), null, null, new f(null), 3, null);
    }

    public abstract Object Z2(Function2<? super Function1<? super d.b, Unit>, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation);

    public abstract void d3(long startedPosition);

    public abstract void e3(long velocity);

    /* renamed from: i3 */
    public abstract boolean getStartDragImmediately();

    @Override // androidx.compose.ui.Modifier.c
    public void u2() {
        this.isListeningForEvents = false;
        Y2();
    }

    private final W c3() {
        return U.a(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f3(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.e.c
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.e$c r0 = (androidx.compose.foundation.gestures.e.c) r0
            int r1 = r0.f48482d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48482d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.e$c r0 = new androidx.compose.foundation.gestures.e$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f48480b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f48482d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f48479a
            androidx.compose.foundation.gestures.e r0 = (androidx.compose.foundation.gestures.e) r0
            kotlin.ResultKt.b(r6)
            goto L51
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.ResultKt.b(r6)
            h0.b r6 = r5.dragInteraction
            if (r6 == 0) goto L55
            h0.l r2 = r5.interactionSource
            if (r2 == 0) goto L50
            h0.a r4 = new h0.a
            r4.<init>(r6)
            r0.f48479a = r5
            r0.f48482d = r3
            java.lang.Object r6 = r2.c(r4, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            r0 = r5
        L51:
            r6 = 0
            r0.dragInteraction = r6
            goto L56
        L55:
            r0 = r5
        L56:
            H1.y$a r6 = H1.y.INSTANCE
            long r1 = r6.a()
            r0.e3(r1)
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.e.f3(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r2.c(r5, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g3(androidx.compose.foundation.gestures.d.c r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.e.d
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.e$d r0 = (androidx.compose.foundation.gestures.e.d) r0
            int r1 = r0.f48488f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48488f = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.e$d r0 = new androidx.compose.foundation.gestures.e$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f48486d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f48488f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.f48485c
            h0.b r7 = (h0.C14435b) r7
            java.lang.Object r1 = r0.f48484b
            androidx.compose.foundation.gestures.d$c r1 = (androidx.compose.foundation.gestures.d.c) r1
            java.lang.Object r0 = r0.f48483a
            androidx.compose.foundation.gestures.e r0 = (androidx.compose.foundation.gestures.e) r0
            kotlin.ResultKt.b(r8)
            goto L85
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.Object r7 = r0.f48484b
            androidx.compose.foundation.gestures.d$c r7 = (androidx.compose.foundation.gestures.d.c) r7
            java.lang.Object r2 = r0.f48483a
            androidx.compose.foundation.gestures.e r2 = (androidx.compose.foundation.gestures.e) r2
            kotlin.ResultKt.b(r8)
            goto L6a
        L4c:
            kotlin.ResultKt.b(r8)
            h0.b r8 = r6.dragInteraction
            if (r8 == 0) goto L69
            h0.l r2 = r6.interactionSource
            if (r2 == 0) goto L69
            h0.a r5 = new h0.a
            r5.<init>(r8)
            r0.f48483a = r6
            r0.f48484b = r7
            r0.f48488f = r4
            java.lang.Object r8 = r2.c(r5, r0)
            if (r8 != r1) goto L69
            goto L81
        L69:
            r2 = r6
        L6a:
            h0.b r8 = new h0.b
            r8.<init>()
            h0.l r4 = r2.interactionSource
            if (r4 == 0) goto L88
            r0.f48483a = r2
            r0.f48484b = r7
            r0.f48485c = r8
            r0.f48488f = r3
            java.lang.Object r0 = r4.c(r8, r0)
            if (r0 != r1) goto L82
        L81:
            return r1
        L82:
            r1 = r7
            r7 = r8
            r0 = r2
        L85:
            r8 = r7
            r2 = r0
            r7 = r1
        L88:
            r2.dragInteraction = r8
            long r7 = r7.getStartPoint()
            r2.d3(r7)
            kotlin.Unit r7 = kotlin.Unit.f143329a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.e.g3(androidx.compose.foundation.gestures.d$c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h3(androidx.compose.foundation.gestures.d.C1002d r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.e.C1005e
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.e$e r0 = (androidx.compose.foundation.gestures.e.C1005e) r0
            int r1 = r0.f48493e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48493e = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.e$e r0 = new androidx.compose.foundation.gestures.e$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f48491c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f48493e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f48490b
            androidx.compose.foundation.gestures.d$d r6 = (androidx.compose.foundation.gestures.d.C1002d) r6
            java.lang.Object r0 = r0.f48489a
            androidx.compose.foundation.gestures.e r0 = (androidx.compose.foundation.gestures.e) r0
            kotlin.ResultKt.b(r7)
            goto L57
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.ResultKt.b(r7)
            h0.b r7 = r5.dragInteraction
            if (r7 == 0) goto L5b
            h0.l r2 = r5.interactionSource
            if (r2 == 0) goto L56
            h0.c r4 = new h0.c
            r4.<init>(r7)
            r0.f48489a = r5
            r0.f48490b = r6
            r0.f48493e = r3
            java.lang.Object r7 = r2.c(r4, r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            r0 = r5
        L57:
            r7 = 0
            r0.dragInteraction = r7
            goto L5c
        L5b:
            r0 = r5
        L5c:
            long r6 = r6.getVelocity()
            r0.e3(r6)
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.e.h3(androidx.compose.foundation.gestures.d$d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ void l3(e eVar, Function1 function1, boolean z10, l lVar, EnumC13937z enumC13937z, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
        if ((i10 & 1) != 0) {
            function1 = eVar.canDrag;
        }
        if ((i10 & 2) != 0) {
            z10 = eVar.enabled;
        }
        if ((i10 & 4) != 0) {
            lVar = eVar.interactionSource;
        }
        if ((i10 & 8) != 0) {
            enumC13937z = eVar.orientationLock;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        boolean z12 = z11;
        l lVar2 = lVar;
        Function1 function12 = function1;
        eVar.k3(function12, z10, lVar2, enumC13937z, z12);
    }

    public final void Y2() {
        C14435b c14435b = this.dragInteraction;
        if (c14435b != null) {
            l lVar = this.interactionSource;
            if (lVar != null) {
                lVar.a(new C14434a(c14435b));
            }
            this.dragInteraction = null;
        }
    }

    protected final Function1<PointerInputChange, Boolean> a3() {
        return this.canDrag;
    }

    /* renamed from: b3, reason: from getter */
    protected final boolean getEnabled() {
        return this.enabled;
    }

    public final void k3(Function1<? super PointerInputChange, Boolean> canDrag, boolean enabled, l interactionSource, EnumC13937z orientationLock, boolean shouldResetPointerInputHandling) {
        W w10;
        this.canDrag = canDrag;
        boolean z10 = true;
        if (this.enabled != enabled) {
            this.enabled = enabled;
            if (!enabled) {
                Y2();
                W w11 = this.pointerInputNode;
                if (w11 != null) {
                    N2(w11);
                }
                this.pointerInputNode = null;
            }
            shouldResetPointerInputHandling = true;
        }
        if (!Intrinsics.e(this.interactionSource, interactionSource)) {
            Y2();
            this.interactionSource = interactionSource;
        }
        if (this.orientationLock != orientationLock) {
            this.orientationLock = orientationLock;
        } else {
            z10 = shouldResetPointerInputHandling;
        }
        if (!z10 || (w10 = this.pointerInputNode) == null) {
            return;
        }
        w10.S0();
    }

    @Override // androidx.compose.ui.node.q0
    public void s1(C14314q pointerEvent, EnumC14315s pass, long bounds) {
        if (this.enabled && this.pointerInputNode == null) {
            this.pointerInputNode = (W) K2(c3());
        }
        W w10 = this.pointerInputNode;
        if (w10 != null) {
            w10.s1(pointerEvent, pass, bounds);
        }
    }

    @Override // androidx.compose.ui.node.q0
    public void v1() {
        W w10 = this.pointerInputNode;
        if (w10 != null) {
            w10.v1();
        }
    }

    public e(Function1<? super PointerInputChange, Boolean> function1, boolean z10, l lVar, EnumC13937z enumC13937z) {
        this.orientationLock = enumC13937z;
        this.canDrag = function1;
        this.enabled = z10;
        this.interactionSource = lVar;
    }
}
