package com.meijer.mobile.meijer.activity.checkout.payment.ebt;

import Gm.EbtBalance;
import Hm.f;
import Ki.K;
import Ki.LocalThemeScope;
import V2.CreationExtras;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity;
import com.meijer.mobile.meijer.activity.checkout.payment.ebt.EbtPinPadActivity;
import com.meijer.mobile.meijer.activity.checkout.payment.ebt.r;
import e.C13736d;
import e.C13737e;
import j0.C14890K;
import j0.C14903g;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15783O;
import p1.C16338g;
import pv.C16563h;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001%B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/EbtPinPadActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "LHm/f$a;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Q", "", "timerString", "D0", "(Ljava/lang/String;)V", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r;", "s", "Lkotlin/Lazy;", "H1", "()Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r;", "viewModel", "LHm/f;", "t", "LHm/f;", "G1", "()LHm/f;", "setEbtTimer", "(LHm/f;)V", "ebtTimer", "F1", "()Ljava/lang/String;", "acculynkPostBody", "", "I1", "()Z", "isShowTimer", "u", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class EbtPinPadActivity extends Hilt_EbtPinPadActivity implements f.a {

    /* renamed from: v, reason: collision with root package name */
    public static final int f104737v = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(r.class), new d(this), new c(this), new e(null, this));

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public Hm.f ebtTimer;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ r.ViewState f104741a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ EbtPinPadActivity f104742b;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.ebt.EbtPinPadActivity$onCreate$1$1$4$1", f = "EbtPinPadActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.ebt.EbtPinPadActivity$b$a$a, reason: collision with other inner class name */
            static final class C1505a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f104743a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f104744b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ EbtPinPadActivity f104745c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1505a(EbtPinPadActivity ebtPinPadActivity, Continuation<? super C1505a> continuation) {
                    super(2, continuation);
                    this.f104745c = ebtPinPadActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1505a c1505a = new C1505a(this.f104745c, continuation);
                    c1505a.f104744b = obj;
                    return c1505a;
                }

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$h;", "effect", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$h;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.ebt.EbtPinPadActivity$onCreate$1$1$4$1$1", f = "EbtPinPadActivity.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.ebt.EbtPinPadActivity$b$a$a$a, reason: collision with other inner class name */
                static final class C1506a extends SuspendLambda implements Function2<r.h, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f104746a;

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f104747b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ EbtPinPadActivity f104748c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1506a(EbtPinPadActivity ebtPinPadActivity, Continuation<? super C1506a> continuation) {
                        super(2, continuation);
                        this.f104748c = ebtPinPadActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C1506a c1506a = new C1506a(this.f104748c, continuation);
                        c1506a.f104747b = obj;
                        return c1506a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(r.h hVar, Continuation<? super Unit> continuation) {
                        return ((C1506a) create(hVar, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.f();
                        if (this.f104746a == 0) {
                            ResultKt.b(obj);
                            r.h hVar = (r.h) this.f104747b;
                            if (hVar instanceof r.h.a) {
                                this.f104748c.setResult(0);
                                this.f104748c.finish();
                            } else if (hVar instanceof r.h.ShowErrorState) {
                                Intent intent = new Intent(this.f104748c, (Class<?>) CheckoutPaymentOptionsActivity.class);
                                r.h.ShowErrorState showErrorState = (r.h.ShowErrorState) hVar;
                                intent.putExtra("ebt.pin.pad.error", showErrorState.getErrorCode());
                                intent.putExtra("ebt.pin.pad.error.message", showErrorState.getErrorMessage());
                                if (showErrorState.getEbtBalance() != null) {
                                    intent.putExtra("ebtInsufficientBalance", showErrorState.getEbtBalance());
                                }
                                this.f104748c.setResult(0, intent);
                                this.f104748c.finish();
                            } else if (!(hVar instanceof r.h.HandlePinPadSuccess)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f143329a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C1505a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f104743a == 0) {
                        ResultKt.b(obj);
                        C16563h.J(C16563h.O(this.f104745c.H1().G().a(), new C1506a(this.f104745c, null)), (InterfaceC15783O) this.f104744b);
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            a(r.ViewState viewState, EbtPinPadActivity ebtPinPadActivity) {
                this.f104741a = viewState;
                this.f104742b = ebtPinPadActivity;
            }

            public final void c(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                Composer composer2;
                Composer composer3 = composer;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer3.V(AdsTheme) : composer3.D(AdsTheme) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer3.j()) {
                    composer3.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1409584900, i11, -1, "com.meijer.mobile.meijer.activity.checkout.payment.ebt.EbtPinPadActivity.onCreate.<anonymous>.<anonymous> (EbtPinPadActivity.kt:73)");
                }
                EbtBalance ebtBalance = this.f104741a.getEbtBalance();
                if (ebtBalance != null) {
                    EbtPinPadActivity ebtPinPadActivity = this.f104742b;
                    Intent intentPutExtra = new Intent().putExtra("ebt.get.balance", ebtBalance);
                    Intrinsics.i(intentPutExtra, "putExtra(...)");
                    ebtPinPadActivity.setResult(-1, intentPutExtra);
                    ebtPinPadActivity.finish();
                }
                composer3.startReplaceGroup(-1696376315);
                if (this.f104741a.getAcculynkPostBody() != null) {
                    final EbtPinPadActivity ebtPinPadActivity2 = this.f104742b;
                    r.ViewState viewState = this.f104741a;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer3, 0);
                    int iA = C5859f.a(composer3, 0);
                    InterfaceC5884s interfaceC5884sR = composer3.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer3, companion);
                    InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                    Function0<InterfaceC5953g> function0A = companion2.a();
                    if (composer3.k() == null) {
                        C5859f.c();
                    }
                    composer3.F();
                    if (composer3.h()) {
                        composer3.I(function0A);
                    } else {
                        composer3.s();
                    }
                    Composer composerA = D1.a(composer3);
                    D1.c(composerA, measurePolicyA, companion2.e());
                    D1.c(composerA, interfaceC5884sR, companion2.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                    if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion2.f());
                    C14903g c14903g = C14903g.f139698a;
                    if (ebtPinPadActivity2.I1()) {
                        composer3.startReplaceGroup(-1445591124);
                        String strC = C16338g.c(Y.f101154r4, composer3, 0);
                        String strC2 = C16338g.c(Y.f101134q4, composer3, 0);
                        String ebtTimerData = viewState.getEbtTimerData();
                        if (ebtTimerData == null) {
                            ebtTimerData = "00:00";
                        }
                        Im.j.b(AdsTheme, null, strC, strC2, ebtTimerData, composer3, (i11 & 14) | LocalThemeScope.f17314g, 1);
                        composer2 = composer3;
                        composer2.P();
                    } else {
                        composer2 = composer3;
                        composer2.startReplaceGroup(-1445235275);
                        C14890K.a(J.i(companion, H1.h.p(8)), composer2, 6);
                        composer2.P();
                    }
                    float f10 = (float) 8.5d;
                    Modifier modifierM = D.m(companion, H1.h.p(f10), 0.0f, H1.h.p(f10), H1.h.p(8), 2, null);
                    boolean isWebPageLoading = viewState.getIsWebPageLoading();
                    String acculynkPostBody = viewState.getAcculynkPostBody();
                    composer2.startReplaceGroup(5004770);
                    boolean zD = composer2.D(ebtPinPadActivity2);
                    Object objB = composer2.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.ebt.b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return EbtPinPadActivity.b.a.d(ebtPinPadActivity2);
                            }
                        };
                        composer2.t(objB);
                    }
                    Function0 function0 = (Function0) objB;
                    composer2.P();
                    composer2.startReplaceGroup(5004770);
                    boolean zD2 = composer2.D(ebtPinPadActivity2);
                    Object objB2 = composer2.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.ebt.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return EbtPinPadActivity.b.a.e(ebtPinPadActivity2, (String) obj);
                            }
                        };
                        composer2.t(objB2);
                    }
                    composer2.P();
                    Composer composer4 = composer2;
                    Im.c.c(AdsTheme, modifierM, isWebPageLoading, acculynkPostBody, function0, (Function1) objB2, composer4, LocalThemeScope.f17314g | 48 | (i11 & 14), 0);
                    composer3 = composer4;
                    composer3.v();
                    Unit unit = Unit.f143329a;
                } else {
                    String strF1 = this.f104742b.F1();
                    if (strF1 != null) {
                        this.f104742b.H1().J(new r.g.SetAcculynkPostBody(strF1));
                        Unit unit2 = Unit.f143329a;
                    }
                }
                composer3.P();
                Boolean bool = Boolean.TRUE;
                composer3.startReplaceGroup(5004770);
                boolean zD3 = composer3.D(this.f104742b);
                EbtPinPadActivity ebtPinPadActivity3 = this.f104742b;
                Object objB3 = composer3.B();
                if (zD3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new C1505a(ebtPinPadActivity3, null);
                    composer3.t(objB3);
                }
                composer3.P();
                androidx.compose.runtime.J.g(bool, (Function2) objB3, composer3, 6);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                c(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(EbtPinPadActivity ebtPinPadActivity) {
                ebtPinPadActivity.H1().J(r.g.a.f104777a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(EbtPinPadActivity ebtPinPadActivity, String str) {
                ebtPinPadActivity.H1().I(str);
                return Unit.f143329a;
            }
        }

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(EbtPinPadActivity ebtPinPadActivity) {
            ebtPinPadActivity.setResult(0);
            ebtPinPadActivity.finish();
            return Unit.f143329a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(314761773, i10, -1, "com.meijer.mobile.meijer.activity.checkout.payment.ebt.EbtPinPadActivity.onCreate.<anonymous> (EbtPinPadActivity.kt:70)");
            }
            K.b(null, ComposableLambdaKt.c(-1409584900, true, new a((r.ViewState) o1.b(EbtPinPadActivity.this.H1().H(), null, composer, 0, 1).getValue(), EbtPinPadActivity.this), composer, 54), composer, 48, 1);
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(EbtPinPadActivity.this);
            final EbtPinPadActivity ebtPinPadActivity = EbtPinPadActivity.this;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.ebt.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EbtPinPadActivity.b.c(ebtPinPadActivity);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C13736d.a(false, (Function0) objB, composer, 0, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f104749f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f104749f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f104749f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f104750f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f104750f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f104750f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f104751f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f104752g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f104751f = function0;
            this.f104752g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f104751f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f104752g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r H1() {
        return (r) this.viewModel.getValue();
    }

    @Override // Hm.f.a
    public void D0(String timerString) {
        Intrinsics.j(timerString, "timerString");
        H1().V(timerString);
    }

    public final Hm.f G1() {
        Hm.f fVar = this.ebtTimer;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.x("ebtTimer");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String F1() {
        return getIntent().getStringExtra("ebt acculynk post body");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean I1() {
        return getIntent().getBooleanExtra("show timer", false);
    }

    @Override // Hm.f.a
    public void Q() {
        H1().U();
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (I1()) {
            if (!G1().getTimerRunningStatus()) {
                G1().l(115L);
            }
            G1().k(this);
        }
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(314761773, true, new b()), 1, null);
    }
}
