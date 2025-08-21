package Oh;

import Ik.Validation;
import Ki.C;
import Ki.LocalThemeScope;
import Oh.N;
import P0.e;
import Wh.PaymentsCardDecorator;
import android.content.res.Resources;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.a;
import bk.AbstractC6392a;
import com.meijer.mobile.accounts.ux.payments.j;
import com.meijer.mobile.accounts.ux.payments.k;
import com.meijer.mobile.accounts.ux.payments.s;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import java.util.List;
import ki.InterfaceC15166e0;
import ki.q1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.InterfaceC15783O;
import p1.C16338g;
import qi.C16671b;
import yr.C18353h;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001aA\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a9\u0010\u000f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u000f\u0010\n\u001a\u001d\u0010\u0010\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u0014\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001aE\u0010\u0019\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a9\u0010\u001d\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a9\u0010\u001f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u001f\u0010\u0015\u001a9\u0010 \u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b \u0010\u0015\u001a1\u0010!\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b!\u0010\"¨\u0006(²\u0006\u0010\u0010#\u001a\u0004\u0018\u00010\u00168\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010$\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010%\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010'\u001a\u0004\u0018\u00010&8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010#\u001a\u0004\u0018\u00010\u00168\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010#\u001a\u0004\u0018\u00010\u00168\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010#\u001a\u0004\u0018\u00010\u00168\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lcom/meijer/mobile/accounts/ux/payments/s$a;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/meijer/mobile/accounts/ux/payments/k;", "", "onResourceAction", "a0", "(LKi/M;Lcom/meijer/mobile/accounts/ux/payments/s$a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ld0/V;", "scrollState", "W", "(LKi/M;Lcom/meijer/mobile/accounts/ux/payments/s$a;Ld0/V;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "P", "i0", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LWh/d;", "decorator", "H", "(LKi/M;LWh/d;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "month", "year", "e0", "(LKi/M;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "isChecked", "k0", "(LKi/M;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "B", "L", "T", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "lastAction", "showDeleteConfirmationModal", "isLoading", "Lbk/a;", "errorMessage", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class N {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.payments.EditPaymentContentKt$EditPaymentContent$1$1", f = "EditPaymentContent.kt", l = {}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f23819a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s.PaymentsScreenViewState f23820b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f23821c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d0.V f23822d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.payments.EditPaymentContentKt$EditPaymentContent$1$1$1", f = "EditPaymentContent.kt", l = {94}, m = "invokeSuspend")
        /* renamed from: Oh.N$a$a, reason: collision with other inner class name */
        static final class C0383a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f23823a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d0.V f23824b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0383a(d0.V v10, Continuation<? super C0383a> continuation) {
                super(2, continuation);
                this.f23824b = v10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0383a(this.f23824b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C0383a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f23823a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    d0.V v10 = this.f23824b;
                    this.f23823a = 1;
                    if (v10.p(0, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s.PaymentsScreenViewState paymentsScreenViewState, InterfaceC15783O interfaceC15783O, d0.V v10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f23820b = paymentsScreenViewState;
            this.f23821c = interfaceC15783O;
            this.f23822d = v10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f23820b, this.f23821c, this.f23822d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f23819a == 0) {
                ResultKt.b(obj);
                if (this.f23820b.getShouldScrollToTop()) {
                    C15809k.d(this.f23821c, null, null, new C0383a(this.f23822d, null), 3, null);
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC15166e0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f23825a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f23826b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.payments.k, Unit> f23827c;

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, boolean z10, Function1<? super com.meijer.mobile.accounts.ux.payments.k, Unit> function1) {
            this.f23825a = localThemeScope;
            this.f23826b = z10;
            this.f23827c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, boolean z10) {
            function1.invoke(new k.SetAsPrimaryPayment(z10));
            return Unit.f143329a;
        }

        public final void b(InterfaceC15166e0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1335697719, i10, -1, "com.meijer.mobile.accounts.ux.composables.payments.PrimaryPaymentToggle.<anonymous>.<anonymous> (EditPaymentContent.kt:328)");
            }
            LocalThemeScope localThemeScope = this.f23825a;
            q1.s.Switch trailingToggleButton = Assemble.getToggleButtons().getTrailingToggleButton();
            boolean z10 = this.f23826b;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f23827c);
            final Function1<com.meijer.mobile.accounts.ux.payments.k, Unit> function1 = this.f23827c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Oh.O
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return N.b.c(function1, ((Boolean) obj).booleanValue());
                    }
                };
                composer.t(objB);
            }
            composer.P();
            wi.s.b(localThemeScope, trailingToggleButton, z10, false, false, (Function1) objB, composer, LocalThemeScope.f17314g | (q1.s.Switch.f142438e << 3), 12);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15166e0 interfaceC15166e0, Composer composer, Integer num) {
            b(interfaceC15166e0, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(InterfaceC5914o interfaceC5914o) {
        InterfaceC5914o.l(interfaceC5914o, false, 1, null);
        return Unit.f143329a;
    }

    private static final void B(final LocalThemeScope localThemeScope, final PaymentsCardDecorator paymentsCardDecorator, Modifier modifier, final Function1<? super com.meijer.mobile.accounts.ux.payments.k, Unit> function1, Composer composer, final int i10, final int i11) {
        int i12;
        PaymentsCardDecorator paymentsCardDecorator2;
        final Function1<? super com.meijer.mobile.accounts.ux.payments.k, Unit> function12;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(991544021);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
            paymentsCardDecorator2 = paymentsCardDecorator;
        } else {
            paymentsCardDecorator2 = paymentsCardDecorator;
            if ((i10 & 48) == 0) {
                i12 |= composerStartRestartGroup.D(paymentsCardDecorator2) ? 32 : 16;
            }
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(function1) ? 2048 : 1024;
        }
        int i13 = i12;
        if ((i13 & 1043) == 1042 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            Modifier modifier3 = (i11 & 2) != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(991544021, i13, -1, "com.meijer.mobile.accounts.ux.composables.payments.BillingAddressDetails (EditPaymentContent.kt:345)");
            }
            C5800d.f fVarO = C5800d.f48779a.o(localThemeScope.getAdsSpacing().getFive().getDp());
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(fVarO, P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 383, null);
            String strC = C16338g.c(Gh.h.f12986u, composerStartRestartGroup, 0);
            int i14 = LocalThemeScope.f17314g;
            int i15 = i13 & 14;
            si.j.h(localThemeScope, label, strC, null, composerStartRestartGroup, i14 | i15 | (q1.Label.f142335j << 3), 4);
            String strE = paymentsCardDecorator2.getAddressFullName().c().e();
            String strC2 = C16338g.c(Gh.h.f12993v, composerStartRestartGroup, 0);
            a.Companion companion3 = androidx.compose.ui.text.input.a.INSTANCE;
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, 0, companion3.d(), null, null, null, 119, null);
            AbstractC6392a abstractC6392aB = paymentsCardDecorator2.getAddressFullName().b();
            List listE = CollectionsKt.e(Q0.K.f27432t);
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i16 = i13 & 7168;
            boolean z10 = i16 == 2048;
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Oh.s
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return N.C(function1, (String) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            int i17 = AbstractC6392a.f60445b;
            C18353h.b(localThemeScope, strE, strC2, null, null, keyboardOptions, abstractC6392aB, null, null, false, false, listE, (Function1) objB, composerStartRestartGroup, i14 | 196608 | i15 | (i17 << 18), 48, 972);
            String strE2 = paymentsCardDecorator.getAddressLine1().c().e();
            String strC3 = C16338g.c(Gh.h.f12764O1, composerStartRestartGroup, 0);
            KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, null, 0, companion3.d(), null, null, null, 119, null);
            AbstractC6392a abstractC6392aB2 = paymentsCardDecorator.getAddressLine1().b();
            List listE2 = CollectionsKt.e(Q0.K.f27429q);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z11 = i16 == 2048;
            Object objB2 = composerStartRestartGroup.B();
            if (z11 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: Oh.t
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return N.D(function1, (String) obj);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            C18353h.b(localThemeScope, strE2, strC3, null, null, keyboardOptions2, abstractC6392aB2, null, null, false, false, listE2, (Function1) objB2, composerStartRestartGroup, i14 | 196608 | i15 | (i17 << 18), 48, 972);
            String strC4 = C16338g.c(Gh.h.f12680C1, composerStartRestartGroup, 0);
            String strE3 = paymentsCardDecorator.getApartment().c().e();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z12 = i16 == 2048;
            Object objB3 = composerStartRestartGroup.B();
            if (z12 || objB3 == Composer.INSTANCE.a()) {
                function12 = function1;
                objB3 = new Function1() { // from class: Oh.u
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return N.E(function12, (String) obj);
                    }
                };
                composerStartRestartGroup.t(objB3);
            } else {
                function12 = function1;
            }
            composerStartRestartGroup.P();
            Kh.M.b(localThemeScope, strC4, strE3, null, (Function1) objB3, composerStartRestartGroup, i14 | i15, 4);
            final Function1<? super com.meijer.mobile.accounts.ux.payments.k, Unit> function13 = function12;
            L(localThemeScope, paymentsCardDecorator, null, function13, composerStartRestartGroup, i14 | i15 | (i13 & 112) | i16, 2);
            String strE4 = paymentsCardDecorator.getZipCode().c().e();
            String strC5 = C16338g.c(Gh.h.f12771P1, composerStartRestartGroup, 0);
            Modifier modifierG = androidx.compose.foundation.layout.J.g(companion, 0.5f);
            KeyboardOptions keyboardOptionsC = KeyboardOptions.c(KeyboardOptions.INSTANCE.a(), 0, null, KeyboardType.INSTANCE.d(), companion3.b(), null, null, null, 115, null);
            AbstractC6392a abstractC6392aB3 = paymentsCardDecorator.getZipCode().b();
            List listE3 = CollectionsKt.e(Q0.K.f27419g);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z13 = i16 == 2048;
            Object objB4 = composerStartRestartGroup.B();
            if (z13 || objB4 == Composer.INSTANCE.a()) {
                objB4 = new Function1() { // from class: Oh.v
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return N.F(function13, (String) obj);
                    }
                };
                composerStartRestartGroup.t(objB4);
            }
            composerStartRestartGroup.P();
            C18353h.b(localThemeScope, strE4, strC5, modifierG, null, keyboardOptionsC, abstractC6392aB3, null, null, false, false, listE3, (Function1) objB4, composerStartRestartGroup, i14 | 3072 | i15 | (i17 << 18), 48, 968);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Oh.w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return N.G(localThemeScope, paymentsCardDecorator, modifier2, function1, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(Function1 function1, String updatedFullName) {
        Intrinsics.j(updatedFullName, "updatedFullName");
        function1.invoke(new k.OnFormFieldChange(new j.FullName(new Validation(updatedFullName, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(Function1 function1, String updatedStreetAddress) {
        Intrinsics.j(updatedStreetAddress, "updatedStreetAddress");
        function1.invoke(new k.OnFormFieldChange(new j.StreetAddress(new Validation(updatedStreetAddress, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(Function1 function1, String updatedApartment) {
        Intrinsics.j(updatedApartment, "updatedApartment");
        function1.invoke(new k.OnFormFieldChange(new j.Apartment(new Validation(updatedApartment, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(Function1 function1, String updatedZip) {
        Intrinsics.j(updatedZip, "updatedZip");
        function1.invoke(new k.OnFormFieldChange(new j.ZipCode(new Validation(updatedZip, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(LocalThemeScope localThemeScope, PaymentsCardDecorator paymentsCardDecorator, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        B(localThemeScope, paymentsCardDecorator, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void H(final Ki.LocalThemeScope r35, final Wh.PaymentsCardDecorator r36, androidx.compose.ui.Modifier r37, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.payments.k, kotlin.Unit> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Oh.N.H(Ki.M, Wh.d, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(String str) {
        Intrinsics.j(str, "<unused var>");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(String str) {
        Intrinsics.j(str, "<unused var>");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(LocalThemeScope localThemeScope, PaymentsCardDecorator paymentsCardDecorator, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        H(localThemeScope, paymentsCardDecorator, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x026f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void L(final Ki.LocalThemeScope r32, final Wh.PaymentsCardDecorator r33, androidx.compose.ui.Modifier r34, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.payments.k, kotlin.Unit> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Oh.N.L(Ki.M, Wh.d, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(Function1 function1, String updatedCity) {
        Intrinsics.j(updatedCity, "updatedCity");
        function1.invoke(new k.OnFormFieldChange(new j.City(new Validation(updatedCity, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(Function1 function1, String updatedState, int i10) {
        Intrinsics.j(updatedState, "updatedState");
        function1.invoke(new k.OnFormFieldChange(new j.State(new Validation(updatedState, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(LocalThemeScope localThemeScope, PaymentsCardDecorator paymentsCardDecorator, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        L(localThemeScope, paymentsCardDecorator, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void P(final Ki.LocalThemeScope r22, final com.meijer.mobile.accounts.ux.payments.s.PaymentsScreenViewState r23, androidx.compose.ui.Modifier r24, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.payments.k, kotlin.Unit> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Oh.N.P(Ki.M, com.meijer.mobile.accounts.ux.payments.s$a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(Function1 function1, s.PaymentsScreenViewState paymentsScreenViewState) {
        function1.invoke(new k.DeleteCard(paymentsScreenViewState.getSavedPaymentCard().getCardId()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(Function1 function1) {
        function1.invoke(k.f.f95307a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(LocalThemeScope localThemeScope, s.PaymentsScreenViewState paymentsScreenViewState, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) throws Resources.NotFoundException {
        P(localThemeScope, paymentsScreenViewState, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void T(final Ki.LocalThemeScope r17, androidx.compose.ui.Modifier r18, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.payments.k, kotlin.Unit> r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Oh.N.T(Ki.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(Function1 function1) {
        function1.invoke(k.p.f95317a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(LocalThemeScope localThemeScope, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        T(localThemeScope, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void W(final Ki.LocalThemeScope r23, final com.meijer.mobile.accounts.ux.payments.s.PaymentsScreenViewState r24, final d0.V r25, androidx.compose.ui.Modifier r26, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.payments.k, kotlin.Unit> r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Oh.N.W(Ki.M, com.meijer.mobile.accounts.ux.payments.s$a, d0.V, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(Function1 function1, s.PaymentsScreenViewState paymentsScreenViewState) {
        function1.invoke(new k.SubmitPayment(paymentsScreenViewState.getUnsavedPaymentCard()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(Function1 function1) {
        function1.invoke(k.g.f95308a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(LocalThemeScope localThemeScope, s.PaymentsScreenViewState paymentsScreenViewState, d0.V v10, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        W(localThemeScope, paymentsScreenViewState, v10, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0242  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a0(final Ki.LocalThemeScope r26, final com.meijer.mobile.accounts.ux.payments.s.PaymentsScreenViewState r27, androidx.compose.ui.Modifier r28, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.payments.k, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Oh.N.a0(Ki.M, com.meijer.mobile.accounts.ux.payments.s$a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d0(LocalThemeScope localThemeScope, s.PaymentsScreenViewState paymentsScreenViewState, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        a0(localThemeScope, paymentsScreenViewState, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void e0(final Ki.LocalThemeScope r24, final java.lang.String r25, final java.lang.String r26, androidx.compose.ui.Modifier r27, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.payments.k, kotlin.Unit> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Oh.N.e0(Ki.M, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(Function1 function1, String expirationMonth, boolean z10) {
        Intrinsics.j(expirationMonth, "expirationMonth");
        function1.invoke(new k.OnFormFieldChange(new j.ExpirationMonth(new Validation(expirationMonth, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g0(Function1 function1, String expirationYear, boolean z10) {
        Intrinsics.j(expirationYear, "expirationYear");
        function1.invoke(new k.OnFormFieldChange(new j.ExpirationYear(new Validation(expirationYear, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(LocalThemeScope localThemeScope, String str, String str2, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        e0(localThemeScope, str, str2, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    private static final void i0(LocalThemeScope localThemeScope, Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Composer composerStartRestartGroup = composer.startRestartGroup(608522176);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            modifier2 = (i11 & 1) != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(608522176, i12, -1, "com.meijer.mobile.accounts.ux.composables.payments.Header (EditPaymentContent.kt:213)");
            }
            e.c cVarI = P0.e.INSTANCE.i();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), cVarI, composerStartRestartGroup, 48);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.e.c.f16973e, null, null, null, 0.0f, null, null, 126, null);
            int i13 = LocalThemeScope.f17314g;
            int i14 = i12 & 14;
            C16671b.b(localThemeScope2, drawableIcon, null, null, composerStartRestartGroup, i13 | i14 | (q1.h.DrawableIcon.f142322h << 3), 6);
            C14890K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(12)), composerStartRestartGroup, 6);
            localThemeScope2 = localThemeScope;
            si.j.h(localThemeScope2, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 383, null), C16338g.c(Gh.h.f12682C3, composerStartRestartGroup, 0), null, composerStartRestartGroup, i13 | i14 | (q1.Label.f142335j << 3), 4);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Oh.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return N.j0(localThemeScope2, modifier2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        i0(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void k0(final Ki.LocalThemeScope r24, final boolean r25, androidx.compose.ui.Modifier r26, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.payments.k, kotlin.Unit> r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Oh.N.k0(Ki.M, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(LocalThemeScope localThemeScope, boolean z10, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        k0(localThemeScope, z10, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c0(Function1 function1, s.PaymentsScreenViewState paymentsScreenViewState) {
        com.meijer.mobile.accounts.ux.payments.k kVar;
        if (paymentsScreenViewState.getShowDeleteCardConfirmationView()) {
            kVar = k.f.f95307a;
        } else {
            kVar = k.c.f95304a;
        }
        function1.invoke(kVar);
        return Unit.f143329a;
    }
}
