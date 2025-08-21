package androidx.compose.foundation;

import Z.C5627z;
import Z.O;
import android.view.KeyEvent;
import androidx.compose.ui.focus.M;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.AbstractC5959m;
import androidx.compose.ui.node.B0;
import androidx.compose.ui.node.InterfaceC5956j;
import androidx.compose.ui.node.q0;
import androidx.compose.ui.node.u0;
import androidx.compose.ui.semantics.Role;
import d0.C13578l;
import d0.C13585t;
import d0.InterfaceC13561B;
import e1.C13752d;
import e1.InterfaceC13753e;
import g1.C14314q;
import g1.C14316t;
import g1.EnumC14315s;
import g1.J;
import g1.U;
import g1.W;
import h0.n;
import kotlin.InterfaceC13893A;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15784P;
import mv.C15809k;
import mv.InterfaceC15783O;
import mv.Z;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\n\b \u0018\u0000 }2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001~BE\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u0016J\u000f\u0010\u001d\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u001bJ\u0014\u0010 \u001a\u00020\u0011*\u00020\u001fH¦@¢\u0006\u0004\b \u0010!J\u0013\u0010#\u001a\u00020\u0011*\u00020\"H\u0016¢\u0006\u0004\b#\u0010$JP\u0010%\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0004ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0011¢\u0006\u0004\b'\u0010\u001bJ\r\u0010(\u001a\u00020\u0011¢\u0006\u0004\b(\u0010\u001bJ\u000f\u0010)\u001a\u00020\u0011H\u0004¢\u0006\u0004\b)\u0010\u001bJ(\u00100\u001a\u00020\u00112\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.ø\u0001\u0000¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0011¢\u0006\u0004\b2\u0010\u001bJ\u0018\u00105\u001a\u00020\n2\u0006\u00104\u001a\u000203ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u001a\u00107\u001a\u00020\n2\u0006\u00104\u001a\u000203H$ø\u0001\u0000¢\u0006\u0004\b7\u00106J\u001a\u00108\u001a\u00020\n2\u0006\u00104\u001a\u000203H$ø\u0001\u0000¢\u0006\u0004\b8\u00106J\u000f\u00109\u001a\u00020\u0011H\u0014¢\u0006\u0004\b9\u0010\u001bJ\u0018\u0010:\u001a\u00020\n2\u0006\u00104\u001a\u000203ø\u0001\u0000¢\u0006\u0004\b:\u00106J\u0011\u0010;\u001a\u00020\u0011*\u00020\"¢\u0006\u0004\b;\u0010$J\u0011\u0010<\u001a\u0004\u0018\u00010\u0011H\u0004¢\u0006\u0004\b<\u0010=J\u001f\u0010A\u001a\u00020\u0011*\u00020>2\u0006\u0010@\u001a\u00020?H\u0084@ø\u0001\u0000¢\u0006\u0004\bA\u0010BR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bI\u0010JR$\u0010\u000b\u001a\u00020\n2\u0006\u0010K\u001a\u00020\n8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010\u0016R0\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010U\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\bS\u0010M\u001a\u0004\bT\u0010\u0016R\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010a\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010e\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010i\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020b0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u001c\u0010p\u001a\u00020?8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010r\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010DR\u0016\u0010t\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010MR\u001a\u0010z\u001a\u00020u8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u0011\u0010|\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b{\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u007f"}, d2 = {"Landroidx/compose/foundation/a;", "Landroidx/compose/ui/node/m;", "Landroidx/compose/ui/node/q0;", "Le1/e;", "Landroidx/compose/ui/node/u0;", "Landroidx/compose/ui/node/B0;", "Lh0/l;", "interactionSource", "Ld0/B;", "indicationNodeFactory", "", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function0;", "", "onClick", "<init>", "(Lh0/l;Ld0/B;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "m3", "()Z", "isFocused", "k3", "(Z)V", "g3", "()V", "Z2", "b3", "c3", "Lg1/J;", "Y2", "(Lg1/J;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lr1/u;", "X2", "(Lr1/u;)V", "n3", "(Lh0/l;Ld0/B;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)V", "t2", "u2", "a3", "Lg1/q;", "pointerEvent", "Lg1/s;", "pass", "LH1/r;", "bounds", "s1", "(Lg1/q;Lg1/s;J)V", "v1", "Le1/b;", "event", "r1", "(Landroid/view/KeyEvent;)Z", "i3", "j3", "h3", "V0", "T1", "l3", "()Lkotlin/Unit;", "Lf0/A;", "LU0/f;", "offset", "f3", "(Lf0/A;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "q", "Lh0/l;", "r", "Ld0/B;", "s", "Ljava/lang/String;", "t", "Landroidx/compose/ui/semantics/Role;", "<set-?>", "u", "Z", "d3", "v", "Lkotlin/jvm/functions/Function0;", "e3", "()Lkotlin/jvm/functions/Function0;", "w", "o2", "shouldAutoInvalidate", "Ld0/t;", "x", "Ld0/t;", "focusableNode", "Lg1/W;", "y", "Lg1/W;", "pointerInputNode", "Landroidx/compose/ui/node/j;", "z", "Landroidx/compose/ui/node/j;", "indicationNode", "Lh0/n$b;", "A", "Lh0/n$b;", "pressInteraction", "Lh0/g;", "B", "Lh0/g;", "hoverInteraction", "LZ/O;", "C", "LZ/O;", "currentKeyPressInteractions", "D", "J", "centerOffset", "E", "userProvidedInteractionSource", "F", "lazilyCreateIndication", "", "G", "Ljava/lang/Object;", "Y", "()Ljava/lang/Object;", "traverseKey", "Z1", "shouldMergeDescendantSemantics", "H", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class a extends AbstractC5959m implements q0, InterfaceC13753e, u0, B0 {

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: I, reason: collision with root package name */
    public static final int f48222I = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private n.b pressInteraction;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private h0.g hoverInteraction;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final O<n.b> currentKeyPressInteractions;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private long centerOffset;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private h0.l userProvidedInteractionSource;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private boolean lazilyCreateIndication;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final Object traverseKey;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private h0.l interactionSource;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private InterfaceC13561B indicationNodeFactory;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private String onClickLabel;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Role role;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> onClick;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final C13585t focusableNode;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private W pointerInputNode;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5956j indicationNode;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/a$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function0<Boolean> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            a.this.e3().invoke();
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$emitHoverEnter$1$1", f = "Clickable.kt", l = {1298}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48241a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0.l f48242b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0.g f48243c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f48242b, this.f48243c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h0.l lVar, h0.g gVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f48242b = lVar;
            this.f48243c = gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48241a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                h0.l lVar = this.f48242b;
                h0.g gVar = this.f48243c;
                this.f48241a = 1;
                if (lVar.c(gVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$emitHoverExit$1$1$1", f = "Clickable.kt", l = {1308}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48244a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0.l f48245b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0.h f48246c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.f48245b, this.f48246c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(h0.l lVar, h0.h hVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f48245b = lVar;
            this.f48246c = hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48244a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                h0.l lVar = this.f48245b;
                h0.h hVar = this.f48246c;
                this.f48244a = 1;
                if (lVar.c(hVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class e extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        e(Object obj) {
            super(1, obj, a.class, "onFocusChange", "onFocusChange(Z)V", 0);
        }

        public final void a(boolean z10) {
            ((a) this.receiver).k3(z10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            a(bool.booleanValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", f = "Clickable.kt", l = {1263, 1265, 1272, 1273, 1283}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        boolean f48247a;

        /* renamed from: b, reason: collision with root package name */
        int f48248b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f48249c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC13893A f48250d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f48251e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ h0.l f48252f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ a f48253g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1", f = "Clickable.kt", l = {1257, 1260}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.a$f$a, reason: collision with other inner class name */
        static final class C0990a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f48254a;

            /* renamed from: b, reason: collision with root package name */
            int f48255b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f48256c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f48257d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ h0.l f48258e;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0990a(this.f48256c, this.f48257d, this.f48258e, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0990a(a aVar, long j10, h0.l lVar, Continuation<? super C0990a> continuation) {
                super(2, continuation);
                this.f48256c = aVar;
                this.f48257d = j10;
                this.f48258e = lVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C0990a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                n.b bVar;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f48255b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            bVar = (n.b) this.f48254a;
                            ResultKt.b(obj);
                            this.f48256c.pressInteraction = bVar;
                            return Unit.f143329a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                } else {
                    ResultKt.b(obj);
                    if (this.f48256c.Z2()) {
                        long jA = C13578l.a();
                        this.f48255b = 1;
                        if (Z.b(jA, this) != objF) {
                        }
                        return objF;
                    }
                }
                n.b bVar2 = new n.b(this.f48257d, null);
                h0.l lVar = this.f48258e;
                this.f48254a = bVar2;
                this.f48255b = 2;
                if (lVar.c(bVar2, this) != objF) {
                    bVar = bVar2;
                    this.f48256c.pressInteraction = bVar;
                    return Unit.f143329a;
                }
                return objF;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = new f(this.f48250d, this.f48251e, this.f48252f, this.f48253g, continuation);
            fVar.f48249c = obj;
            return fVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC13893A interfaceC13893A, long j10, h0.l lVar, a aVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f48250d = interfaceC13893A;
            this.f48251e = j10;
            this.f48252f = lVar;
            this.f48253g = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
        
            if (r3.c(r2, r16) != r1) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
        
            if (r4.c(r5, r16) == r1) goto L41;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 216
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.a.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$onFocusChange$1$1", f = "Clickable.kt", l = {1119}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48259a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n.b f48261c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new g(this.f48261c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(n.b bVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f48261c = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48259a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                h0.l lVar = a.this.interactionSource;
                if (lVar != null) {
                    n.a aVar = new n.a(this.f48261c);
                    this.f48259a = 1;
                    if (lVar.c(aVar, this) == objF) {
                        return objF;
                    }
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1", f = "Clickable.kt", l = {1191}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48262a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n.b f48264c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new h(this.f48264c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(n.b bVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f48264c = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48262a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                h0.l lVar = a.this.interactionSource;
                if (lVar != null) {
                    n.b bVar = this.f48264c;
                    this.f48262a = 1;
                    if (lVar.c(bVar, this) == objF) {
                        return objF;
                    }
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2", f = "Clickable.kt", l = {1202}, m = "invokeSuspend")
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48265a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n.b f48267c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new i(this.f48267c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(n.b bVar, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f48267c = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48265a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                h0.l lVar = a.this.interactionSource;
                if (lVar != null) {
                    n.c cVar = new n.c(this.f48267c);
                    this.f48265a = 1;
                    if (lVar.c(cVar, this) == objF) {
                        return objF;
                    }
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$1", f = "Clickable.kt", l = {}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48268a;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f48268a == 0) {
                ResultKt.b(obj);
                a.this.b3();
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$2", f = "Clickable.kt", l = {}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48270a;

        k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new k(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f48270a == 0) {
                ResultKt.b(obj);
                a.this.c3();
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/J;", "", "invoke", "(Lg1/J;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class l implements PointerInputEventHandler {
        l() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(J j10, Continuation<? super Unit> continuation) {
            Object objY2 = a.this.Y2(j10, continuation);
            return objY2 == IntrinsicsKt.f() ? objY2 : Unit.f143329a;
        }
    }

    public /* synthetic */ a(h0.l lVar, InterfaceC13561B interfaceC13561B, boolean z10, String str, Role role, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, interfaceC13561B, z10, str, role, function0);
    }

    @Override // e1.InterfaceC13753e
    public final boolean V0(KeyEvent event) {
        return false;
    }

    public void X2(u uVar) {
    }

    public abstract Object Y2(J j10, Continuation<? super Unit> continuation);

    @Override // androidx.compose.ui.node.u0
    /* renamed from: Z1 */
    public final boolean getMergeDescendants() {
        return true;
    }

    protected void h3() {
    }

    protected abstract boolean i3(KeyEvent event);

    protected abstract boolean j3(KeyEvent event);

    private a(h0.l lVar, InterfaceC13561B interfaceC13561B, boolean z10, String str, Role role, Function0<Unit> function0) {
        this.interactionSource = lVar;
        this.indicationNodeFactory = interfaceC13561B;
        this.onClickLabel = str;
        this.role = role;
        this.enabled = z10;
        this.onClick = function0;
        this.focusableNode = new C13585t(this.interactionSource, M.INSTANCE.c(), new e(this), null);
        this.currentKeyPressInteractions = C5627z.c();
        this.centerOffset = U0.f.INSTANCE.c();
        this.userProvidedInteractionSource = this.interactionSource;
        this.lazilyCreateIndication = m3();
        this.traverseKey = INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b3() {
        if (this.hoverInteraction == null) {
            h0.g gVar = new h0.g();
            h0.l lVar = this.interactionSource;
            if (lVar != null) {
                C15809k.d(j2(), null, null, new c(lVar, gVar, null), 3, null);
            }
            this.hoverInteraction = gVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c3() {
        h0.g gVar = this.hoverInteraction;
        if (gVar != null) {
            h0.h hVar = new h0.h(gVar);
            h0.l lVar = this.interactionSource;
            if (lVar != null) {
                C15809k.d(j2(), null, null, new d(lVar, hVar, null), 3, null);
            }
            this.hoverInteraction = null;
        }
    }

    private final void g3() {
        InterfaceC13561B interfaceC13561B;
        if (this.indicationNode == null && (interfaceC13561B = this.indicationNodeFactory) != null) {
            if (this.interactionSource == null) {
                this.interactionSource = h0.k.a();
            }
            this.focusableNode.Z2(this.interactionSource);
            h0.l lVar = this.interactionSource;
            Intrinsics.g(lVar);
            InterfaceC5956j interfaceC5956jA = interfaceC13561B.a(lVar);
            K2(interfaceC5956jA);
            this.indicationNode = interfaceC5956jA;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k3(boolean r19) {
        /*
            r18 = this;
            r0 = r18
            if (r19 == 0) goto L8
            r0.g3()
            return
        L8:
            h0.l r1 = r0.interactionSource
            if (r1 == 0) goto L62
            Z.O<h0.n$b> r1 = r0.currentKeyPressInteractions
            java.lang.Object[] r2 = r1.values
            long[] r1 = r1.metadata
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L62
            r4 = 0
            r5 = r4
        L19:
            r6 = r1[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L5d
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L33:
            if (r10 >= r8) goto L5b
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L57
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            h0.n$b r11 = (h0.n.b) r11
            mv.O r12 = r0.j2()
            androidx.compose.foundation.a$g r15 = new androidx.compose.foundation.a$g
            r13 = 0
            r15.<init>(r11, r13)
            r16 = 3
            r17 = 0
            r14 = 0
            mv.C15805i.d(r12, r13, r14, r15, r16, r17)
        L57:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L33
        L5b:
            if (r8 != r9) goto L62
        L5d:
            if (r5 == r3) goto L62
            int r5 = r5 + 1
            goto L19
        L62:
            Z.O<h0.n$b> r1 = r0.currentKeyPressInteractions
            r1.g()
            r0.h3()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.a.k3(boolean):void");
    }

    private final boolean m3() {
        return this.userProvidedInteractionSource == null && this.indicationNodeFactory != null;
    }

    @Override // androidx.compose.ui.node.u0
    public final void T1(u uVar) {
        Role role = this.role;
        if (role != null) {
            Intrinsics.g(role);
            s.s0(uVar, role.getValue());
        }
        s.D(uVar, this.onClickLabel, new b());
        if (this.enabled) {
            this.focusableNode.T1(uVar);
        } else {
            s.l(uVar);
        }
        X2(uVar);
    }

    @Override // androidx.compose.ui.node.B0
    /* renamed from: Y, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void a3() {
        /*
            r15 = this;
            h0.l r0 = r15.interactionSource
            if (r0 == 0) goto L68
            h0.n$b r1 = r15.pressInteraction
            if (r1 == 0) goto L10
            h0.n$a r2 = new h0.n$a
            r2.<init>(r1)
            r0.a(r2)
        L10:
            h0.g r1 = r15.hoverInteraction
            if (r1 == 0) goto L1c
            h0.h r2 = new h0.h
            r2.<init>(r1)
            r0.a(r2)
        L1c:
            Z.O<h0.n$b> r1 = r15.currentKeyPressInteractions
            java.lang.Object[] r2 = r1.values
            long[] r1 = r1.metadata
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L68
            r4 = 0
            r5 = r4
        L29:
            r6 = r1[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L63
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L43:
            if (r10 >= r8) goto L61
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L5d
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            h0.n$b r11 = (h0.n.b) r11
            h0.n$a r12 = new h0.n$a
            r12.<init>(r11)
            r0.a(r12)
        L5d:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L43
        L61:
            if (r8 != r9) goto L68
        L63:
            if (r5 == r3) goto L68
            int r5 = r5 + 1
            goto L29
        L68:
            r0 = 0
            r15.pressInteraction = r0
            r15.hoverInteraction = r0
            Z.O<h0.n$b> r0 = r15.currentKeyPressInteractions
            r0.g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.a.a3():void");
    }

    /* renamed from: d3, reason: from getter */
    protected final boolean getEnabled() {
        return this.enabled;
    }

    protected final Function0<Unit> e3() {
        return this.onClick;
    }

    protected final Object f3(InterfaceC13893A interfaceC13893A, long j10, Continuation<? super Unit> continuation) {
        Object objG;
        h0.l lVar = this.interactionSource;
        return (lVar == null || (objG = C15784P.g(new f(interfaceC13893A, j10, lVar, this, null), continuation)) != IntrinsicsKt.f()) ? Unit.f143329a : objG;
    }

    protected final Unit l3() {
        W w10 = this.pointerInputNode;
        if (w10 == null) {
            return null;
        }
        w10.S0();
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void n3(h0.l r3, d0.InterfaceC13561B r4, boolean r5, java.lang.String r6, androidx.compose.ui.semantics.Role r7, kotlin.jvm.functions.Function0<kotlin.Unit> r8) {
        /*
            r2 = this;
            h0.l r0 = r2.userProvidedInteractionSource
            boolean r0 = kotlin.jvm.internal.Intrinsics.e(r0, r3)
            r1 = 1
            if (r0 != 0) goto L12
            r2.a3()
            r2.userProvidedInteractionSource = r3
            r2.interactionSource = r3
            r3 = r1
            goto L13
        L12:
            r3 = 0
        L13:
            d0.B r0 = r2.indicationNodeFactory
            boolean r0 = kotlin.jvm.internal.Intrinsics.e(r0, r4)
            if (r0 != 0) goto L1e
            r2.indicationNodeFactory = r4
            r3 = r1
        L1e:
            boolean r4 = r2.enabled
            if (r4 == r5) goto L37
            if (r5 == 0) goto L2a
            d0.t r4 = r2.focusableNode
            r2.K2(r4)
            goto L32
        L2a:
            d0.t r4 = r2.focusableNode
            r2.N2(r4)
            r2.a3()
        L32:
            androidx.compose.ui.node.v0.b(r2)
            r2.enabled = r5
        L37:
            java.lang.String r4 = r2.onClickLabel
            boolean r4 = kotlin.jvm.internal.Intrinsics.e(r4, r6)
            if (r4 != 0) goto L44
            r2.onClickLabel = r6
            androidx.compose.ui.node.v0.b(r2)
        L44:
            androidx.compose.ui.semantics.Role r4 = r2.role
            boolean r4 = kotlin.jvm.internal.Intrinsics.e(r4, r7)
            if (r4 != 0) goto L51
            r2.role = r7
            androidx.compose.ui.node.v0.b(r2)
        L51:
            r2.onClick = r8
            boolean r4 = r2.lazilyCreateIndication
            boolean r5 = r2.m3()
            if (r4 == r5) goto L68
            boolean r4 = r2.m3()
            r2.lazilyCreateIndication = r4
            if (r4 != 0) goto L68
            androidx.compose.ui.node.j r4 = r2.indicationNode
            if (r4 != 0) goto L68
            goto L69
        L68:
            r1 = r3
        L69:
            if (r1 == 0) goto L7e
            androidx.compose.ui.node.j r3 = r2.indicationNode
            if (r3 != 0) goto L73
            boolean r4 = r2.lazilyCreateIndication
            if (r4 != 0) goto L7e
        L73:
            if (r3 == 0) goto L78
            r2.N2(r3)
        L78:
            r3 = 0
            r2.indicationNode = r3
            r2.g3()
        L7e:
            d0.t r3 = r2.focusableNode
            h0.l r4 = r2.interactionSource
            r3.Z2(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.a.n3(h0.l, d0.B, boolean, java.lang.String, androidx.compose.ui.semantics.Role, kotlin.jvm.functions.Function0):void");
    }

    @Override // androidx.compose.ui.Modifier.c
    /* renamed from: o2, reason: from getter */
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.Modifier.c
    public final void t2() {
        if (!this.lazilyCreateIndication) {
            g3();
        }
        if (this.enabled) {
            K2(this.focusableNode);
        }
    }

    @Override // androidx.compose.ui.node.q0
    public final void v1() {
        h0.g gVar;
        h0.l lVar = this.interactionSource;
        if (lVar != null && (gVar = this.hoverInteraction) != null) {
            lVar.a(new h0.h(gVar));
        }
        this.hoverInteraction = null;
        W w10 = this.pointerInputNode;
        if (w10 != null) {
            w10.v1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Z2() {
        if (!ClickableKt.g(this) && !C13578l.b(this)) {
            return false;
        }
        return true;
    }

    @Override // e1.InterfaceC13753e
    public final boolean r1(KeyEvent event) {
        boolean z10;
        g3();
        long jA = C13752d.a(event);
        if (this.enabled && ClickableKt.j(event)) {
            if (!this.currentKeyPressInteractions.a(jA)) {
                n.b bVar = new n.b(this.centerOffset, null);
                this.currentKeyPressInteractions.r(jA, bVar);
                if (this.interactionSource != null) {
                    C15809k.d(j2(), null, null, new h(bVar, null), 3, null);
                }
                z10 = true;
            } else {
                z10 = false;
            }
            if (i3(event) || z10) {
                return true;
            }
            return false;
        }
        if (this.enabled && ClickableKt.h(event)) {
            n.b bVarO = this.currentKeyPressInteractions.o(jA);
            if (bVarO != null) {
                if (this.interactionSource != null) {
                    C15809k.d(j2(), null, null, new i(bVarO, null), 3, null);
                }
                j3(event);
            }
            if (bVarO != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.node.q0
    public final void s1(C14314q pointerEvent, EnumC14315s pass, long bounds) {
        long jB = H1.s.b(bounds);
        float fK = H1.n.k(jB);
        float fL = H1.n.l(jB);
        this.centerOffset = U0.f.e((Float.floatToRawIntBits(fK) << 32) | (Float.floatToRawIntBits(fL) & 4294967295L));
        g3();
        if (this.enabled && pass == EnumC14315s.f133969b) {
            int type = pointerEvent.getType();
            C14316t.Companion companion = C14316t.INSTANCE;
            if (C14316t.i(type, companion.a())) {
                C15809k.d(j2(), null, null, new j(null), 3, null);
            } else if (C14316t.i(type, companion.b())) {
                C15809k.d(j2(), null, null, new k(null), 3, null);
            }
        }
        if (this.pointerInputNode == null) {
            this.pointerInputNode = (W) K2(U.a(new l()));
        }
        W w10 = this.pointerInputNode;
        if (w10 != null) {
            w10.s1(pointerEvent, pass, bounds);
        }
    }

    @Override // androidx.compose.ui.Modifier.c
    public final void u2() {
        a3();
        if (this.userProvidedInteractionSource == null) {
            this.interactionSource = null;
        }
        InterfaceC5956j interfaceC5956j = this.indicationNode;
        if (interfaceC5956j != null) {
            N2(interfaceC5956j);
        }
        this.indicationNode = null;
    }
}
