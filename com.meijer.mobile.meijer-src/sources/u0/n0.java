package u0;

import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.C5955i;
import androidx.compose.ui.node.InterfaceC5954h;
import androidx.compose.ui.node.InterfaceC5967v;
import androidx.compose.ui.platform.C5988d1;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.platform.D1;
import androidx.compose.ui.platform.InterfaceC5985c1;
import androidx.compose.ui.platform.InterfaceC5991e1;
import androidx.compose.ui.platform.Q1;
import kotlin.C17778Q;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C0;
import mv.C15809k;
import mv.EnumC15785Q;
import mv.InterfaceC15783O;
import u0.q0;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J:\u0010 \u001a\u0004\u0018\u00010\u001f2'\u0010\u001e\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0018¢\u0006\u0002\b\u001dH\u0016¢\u0006\u0004\b \u0010!R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010\t\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R/\u00106\u001a\u0004\u0018\u00010\u00142\b\u00100\u001a\u0004\u0018\u00010\u00148V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u0010\u0017R\u0016\u0010:\u001a\u0004\u0018\u0001078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lu0/n0;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/platform/c1;", "Landroidx/compose/ui/node/h;", "Landroidx/compose/ui/node/v;", "Lu0/q0$a;", "Lu0/q0;", "serviceAdapter", "Landroidx/compose/foundation/text/B;", "legacyTextFieldState", "Lw0/Q;", "textFieldSelectionManager", "<init>", "(Lu0/q0;Landroidx/compose/foundation/text/B;Lw0/Q;)V", "", "M2", "(Lu0/q0;)V", "t2", "()V", "u2", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "O", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/e1;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lmv/C0;", "h1", "(Lkotlin/jvm/functions/Function2;)Lmv/C0;", "o", "Lu0/q0;", "p", "Landroidx/compose/foundation/text/B;", "X1", "()Landroidx/compose/foundation/text/B;", "L2", "(Landroidx/compose/foundation/text/B;)V", "q", "Lw0/Q;", "u1", "()Lw0/Q;", "N2", "(Lw0/Q;)V", "<set-?>", "r", "Landroidx/compose/runtime/l0;", "B", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "K2", "layoutCoordinates", "Landroidx/compose/ui/platform/D1;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/D1;", "softwareKeyboardController", "Landroidx/compose/ui/platform/Q1;", "getViewConfiguration", "()Landroidx/compose/ui/platform/Q1;", "viewConfiguration", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class n0 extends Modifier.c implements InterfaceC5985c1, InterfaceC5954h, InterfaceC5967v, q0.a {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private q0 serviceAdapter;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.foundation.text.B legacyTextFieldState;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private C17778Q textFieldSelectionManager;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 layoutCoordinates = t1.e(null, null, 2, null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1", f = "LegacyAdaptingPlatformTextInputModifierNode.kt", l = {137}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f163566a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC5991e1, Continuation<?>, Object> f163568c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super InterfaceC5991e1, ? super Continuation<?>, ? extends Object> function2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f163568c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return n0.this.new a(this.f163568c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f163566a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                n0 n0Var = n0.this;
                Function2<InterfaceC5991e1, Continuation<?>, Object> function2 = this.f163568c;
                this.f163566a = 1;
                if (C5988d1.b(n0Var, function2, this) == objF) {
                    return objF;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    private void K2(LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates.setValue(layoutCoordinates);
    }

    @Override // u0.q0.a
    public LayoutCoordinates B() {
        return (LayoutCoordinates) this.layoutCoordinates.getValue();
    }

    public void L2(androidx.compose.foundation.text.B b10) {
        this.legacyTextFieldState = b10;
    }

    public void N2(C17778Q c17778q) {
        this.textFieldSelectionManager = c17778q;
    }

    @Override // u0.q0.a
    /* renamed from: X1, reason: from getter */
    public androidx.compose.foundation.text.B getLegacyTextFieldState() {
        return this.legacyTextFieldState;
    }

    @Override // androidx.compose.ui.Modifier.c
    public void t2() {
        this.serviceAdapter.j(this);
    }

    @Override // u0.q0.a
    /* renamed from: u1, reason: from getter */
    public C17778Q getTextFieldSelectionManager() {
        return this.textFieldSelectionManager;
    }

    @Override // androidx.compose.ui.Modifier.c
    public void u2() {
        this.serviceAdapter.l(this);
    }

    public n0(q0 q0Var, androidx.compose.foundation.text.B b10, C17778Q c17778q) {
        this.serviceAdapter = q0Var;
        this.legacyTextFieldState = b10;
        this.textFieldSelectionManager = c17778q;
    }

    public final void M2(q0 serviceAdapter) {
        if (getIsAttached()) {
            this.serviceAdapter.b();
            this.serviceAdapter.l(this);
        }
        this.serviceAdapter = serviceAdapter;
        if (getIsAttached()) {
            this.serviceAdapter.j(this);
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC5967v
    public void O(LayoutCoordinates coordinates) {
        K2(coordinates);
    }

    @Override // u0.q0.a
    public D1 getSoftwareKeyboardController() {
        return (D1) C5955i.a(this, C6034t0.q());
    }

    @Override // u0.q0.a
    public Q1 getViewConfiguration() {
        return (Q1) C5955i.a(this, C6034t0.t());
    }

    @Override // u0.q0.a
    public C0 h1(Function2<? super InterfaceC5991e1, ? super Continuation<?>, ? extends Object> block) {
        if (getIsAttached()) {
            return C15809k.d(j2(), null, EnumC15785Q.f151688d, new a(block, null), 1, null);
        }
        return null;
    }
}
