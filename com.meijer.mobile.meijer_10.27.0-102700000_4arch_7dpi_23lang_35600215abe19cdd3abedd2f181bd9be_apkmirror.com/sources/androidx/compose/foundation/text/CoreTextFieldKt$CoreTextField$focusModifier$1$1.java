package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.ImeOptions;
import com.fullstory.instrumentation.frameworks.compose.FSComposeFocusChangedListener;
import com.fullstory.instrumentation.frameworks.compose.FSComposeImeOptions;
import kotlin.C17708Q;
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
import p0.InterfaceC16183a;
import qv.C16648k;
import qv.InterfaceC16622O;
import u1.TextLayoutResult;
import z1.InterfaceC18354E;
import z1.TextFieldValue;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/E;", "it", "", "a", "(Landroidx/compose/ui/focus/E;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class CoreTextFieldKt$CoreTextField$focusModifier$1$1 extends Lambda implements Function1<androidx.compose.ui.focus.E, Unit>, FSComposeFocusChangedListener {
    final /* synthetic */ ImeOptions $imeOptions;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ B f49020f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f49021g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f49022h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ z1.O f49023i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ TextFieldValue f49024j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ InterfaceC18354E f49025k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ C17708Q f49026l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ InterfaceC16622O f49027m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ InterfaceC16183a f49028n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1", f = "CoreTextField.kt", l = {330}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f49029a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC16183a f49030b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f49031c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ B f49032d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ h0 f49033e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC18354E f49034f;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f49030b, this.f49031c, this.f49032d, this.f49033e, this.f49034f, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC16183a interfaceC16183a, TextFieldValue textFieldValue, B b10, h0 h0Var, InterfaceC18354E interfaceC18354E, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f49030b = interfaceC16183a;
            this.f49031c = textFieldValue;
            this.f49032d = b10;
            this.f49033e = h0Var;
            this.f49034f = interfaceC18354E;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f49029a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16183a interfaceC16183a = this.f49030b;
                TextFieldValue textFieldValue = this.f49031c;
                N textDelegate = this.f49032d.getTextDelegate();
                TextLayoutResult value = this.f49033e.getValue();
                InterfaceC18354E interfaceC18354E = this.f49034f;
                this.f49029a = 1;
                if (CoreTextFieldKt.l(interfaceC16183a, textFieldValue, textDelegate, value, interfaceC18354E, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
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
    CoreTextFieldKt$CoreTextField$focusModifier$1$1(B b10, boolean z10, boolean z11, z1.O o10, TextFieldValue textFieldValue, ImeOptions imeOptions, InterfaceC18354E interfaceC18354E, C17708Q c17708q, InterfaceC16622O interfaceC16622O, InterfaceC16183a interfaceC16183a) {
        super(1);
        this.f49020f = b10;
        this.f49021g = z10;
        this.f49022h = z11;
        this.f49023i = o10;
        this.f49024j = textFieldValue;
        this.$imeOptions = imeOptions;
        this.f49025k = interfaceC18354E;
        this.f49026l = c17708q;
        this.f49027m = interfaceC16622O;
        this.f49028n = interfaceC16183a;
    }

    public final void a(androidx.compose.ui.focus.E e10) {
        h0 h0VarL;
        if (this.f49020f.f() == e10.a()) {
            return;
        }
        this.f49020f.F(e10.a());
        if (this.f49020f.f() && this.f49021g && !this.f49022h) {
            CoreTextFieldKt.p(this.f49023i, this.f49020f, this.f49024j, this.$imeOptions, this.f49025k);
        } else {
            CoreTextFieldKt.m(this.f49020f);
        }
        if (e10.a() && (h0VarL = this.f49020f.l()) != null) {
            C16648k.d(this.f49027m, null, null, new a(this.f49028n, this.f49024j, this.f49020f, h0VarL, this.f49025k, null), 3, null);
        }
        if (e10.a()) {
            return;
        }
        C17708Q.w(this.f49026l, null, 1, null);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.focus.E e10) {
        a(e10);
        return Unit.f142422a;
    }
}
