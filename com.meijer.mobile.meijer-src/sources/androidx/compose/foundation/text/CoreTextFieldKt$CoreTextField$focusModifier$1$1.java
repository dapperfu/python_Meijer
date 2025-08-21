package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.ImeOptions;
import com.fullstory.instrumentation.frameworks.compose.FSComposeFocusChangedListener;
import com.fullstory.instrumentation.frameworks.compose.FSComposeImeOptions;
import kotlin.C17778Q;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import mv.C15809k;
import mv.InterfaceC15783O;
import p0.InterfaceC16328a;
import u1.TextLayoutResult;
import z1.InterfaceC18417E;
import z1.TextFieldValue;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/E;", "it", "", "a", "(Landroidx/compose/ui/focus/E;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class CoreTextFieldKt$CoreTextField$focusModifier$1$1 extends Lambda implements Function1<androidx.compose.ui.focus.E, Unit>, FSComposeFocusChangedListener {
    final /* synthetic */ ImeOptions $imeOptions;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ B f49244f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f49245g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f49246h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ z1.O f49247i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ TextFieldValue f49248j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ InterfaceC18417E f49249k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ C17778Q f49250l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ InterfaceC15783O f49251m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ InterfaceC16328a f49252n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1", f = "CoreTextField.kt", l = {330}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f49253a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC16328a f49254b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f49255c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ B f49256d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ h0 f49257e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC18417E f49258f;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f49254b, this.f49255c, this.f49256d, this.f49257e, this.f49258f, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC16328a interfaceC16328a, TextFieldValue textFieldValue, B b10, h0 h0Var, InterfaceC18417E interfaceC18417E, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f49254b = interfaceC16328a;
            this.f49255c = textFieldValue;
            this.f49256d = b10;
            this.f49257e = h0Var;
            this.f49258f = interfaceC18417E;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f49253a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16328a interfaceC16328a = this.f49254b;
                TextFieldValue textFieldValue = this.f49255c;
                N textDelegate = this.f49256d.getTextDelegate();
                TextLayoutResult value = this.f49257e.getValue();
                InterfaceC18417E interfaceC18417E = this.f49258f;
                this.f49253a = 1;
                if (CoreTextFieldKt.l(interfaceC16328a, textFieldValue, textDelegate, value, interfaceC18417E, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeFocusChangedListener
    public final FSComposeImeOptions _fsGetImeOptions() {
        ImeOptions imeOptions = this.$imeOptions;
        if (imeOptions instanceof FSComposeImeOptions) {
            return imeOptions;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$focusModifier$1$1(B b10, boolean z10, boolean z11, z1.O o10, TextFieldValue textFieldValue, ImeOptions imeOptions, InterfaceC18417E interfaceC18417E, C17778Q c17778q, InterfaceC15783O interfaceC15783O, InterfaceC16328a interfaceC16328a) {
        super(1);
        this.f49244f = b10;
        this.f49245g = z10;
        this.f49246h = z11;
        this.f49247i = o10;
        this.f49248j = textFieldValue;
        this.$imeOptions = imeOptions;
        this.f49249k = interfaceC18417E;
        this.f49250l = c17778q;
        this.f49251m = interfaceC15783O;
        this.f49252n = interfaceC16328a;
    }

    public final void a(androidx.compose.ui.focus.E e10) {
        h0 h0VarL;
        if (this.f49244f.f() == e10.a()) {
            return;
        }
        this.f49244f.F(e10.a());
        if (this.f49244f.f() && this.f49245g && !this.f49246h) {
            CoreTextFieldKt.p(this.f49247i, this.f49244f, this.f49248j, this.$imeOptions, this.f49249k);
        } else {
            CoreTextFieldKt.m(this.f49244f);
        }
        if (e10.a() && (h0VarL = this.f49244f.l()) != null) {
            C15809k.d(this.f49251m, null, null, new a(this.f49252n, this.f49248j, this.f49244f, h0VarL, this.f49249k, null), 3, null);
        }
        if (e10.a()) {
            return;
        }
        C17778Q.w(this.f49250l, null, 1, null);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.focus.E e10) {
        a(e10);
        return Unit.f143329a;
    }
}
