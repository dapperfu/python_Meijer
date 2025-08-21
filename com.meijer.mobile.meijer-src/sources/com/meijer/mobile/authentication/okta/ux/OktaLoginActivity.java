package com.meijer.mobile.authentication.okta.ux;

import Ki.K;
import Ki.LocalThemeScope;
import V2.CreationExtras;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.C6034t0;
import androidx.view.ComponentActivity;
import androidx.view.L;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import bk.AbstractC6392a;
import bk.C6393b;
import com.fullstory.FS;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.authentication.okta.ux.OktaLoginActivity;
import com.meijer.mobile.authentication.okta.ux.n;
import e.C13737e;
import j0.C14896Q;
import j0.InterfaceC14894O;
import j0.InterfaceC14902f;
import j0.W;
import j2.C14923c;
import kotlin.C18033q;
import kotlin.C18036r;
import kotlin.C18039s;
import kotlin.EnumC18041t;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mv.InterfaceC15783O;
import r0.C16806i;
import xj.C18187d;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 22\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000e\u0010\u0003R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010(\u001a\u0004\u0018\u00010%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0016\u0010*\u001a\u0004\u0018\u00010%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0016\u0010.\u001a\u0004\u0018\u00010+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00101\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00064²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/authentication/okta/ux/OktaLoginActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "", "u1", "Lcom/meijer/mobile/authentication/okta/ux/n$b;", "loginViewState", "o1", "(Lcom/meijer/mobile/authentication/okta/ux/n$b;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "LDl/e;", "v", "LDl/e;", "getMeijerIntent", "()LDl/e;", "setMeijerIntent", "(LDl/e;)V", "meijerIntent", "Lxj/d;", "w", "Lxj/d;", "getFirebaseLoggingUtil", "()Lxj/d;", "setFirebaseLoggingUtil", "(Lxj/d;)V", "firebaseLoggingUtil", "Lcom/meijer/mobile/authentication/okta/ux/n;", "x", "Lkotlin/Lazy;", "t1", "()Lcom/meijer/mobile/authentication/okta/ux/n;", "viewModel", "", "r1", "()Ljava/lang/Boolean;", "subscribeEmails", "s1", "subscribeTexts", "", "q1", "()Ljava/lang/String;", "loginEmail", "p1", "()Z", "autoLoggedOut", "y", "a", "okta-ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class OktaLoginActivity extends Hilt_OktaLoginActivity {

    /* renamed from: z, reason: collision with root package name */
    public static final int f96116z = 8;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Dl.e meijerIntent;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public C18187d firebaseLoggingUtil;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(n.class), new d(this), new c(this), new e(null, this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ OktaLoginActivity f96121a;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.authentication.okta.ux.OktaLoginActivity$onCreate$1$1$1$1", f = "OktaLoginActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.authentication.okta.ux.OktaLoginActivity$b$a$a, reason: collision with other inner class name */
            static final class C1359a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f96122a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C18036r f96123b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ OktaLoginActivity f96124c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ z1<n.LoginScreenLoginState> f96125d;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1359a(this.f96123b, this.f96124c, this.f96125d, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1359a(C18036r c18036r, OktaLoginActivity oktaLoginActivity, z1<n.LoginScreenLoginState> z1Var, Continuation<? super C1359a> continuation) {
                    super(2, continuation);
                    this.f96123b = c18036r;
                    this.f96124c = oktaLoginActivity;
                    this.f96125d = z1Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C1359a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f96122a == 0) {
                        ResultKt.b(obj);
                        if (this.f96123b.getBottomSheetState().f() || a.c(this.f96125d).getIsFlowCancelled()) {
                            this.f96124c.finish();
                            OktaLoginActivity oktaLoginActivity = this.f96124c;
                            oktaLoginActivity.startActivity(oktaLoginActivity.getMeijerIntent().p(this.f96124c, false));
                        }
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.authentication.okta.ux.OktaLoginActivity$onCreate$1$1$2$1", f = "OktaLoginActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.authentication.okta.ux.OktaLoginActivity$b$a$b, reason: collision with other inner class name */
            static final class C1360b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f96126a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ OktaLoginActivity f96127b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<n.LoginScreenLoginState> f96128c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1360b(OktaLoginActivity oktaLoginActivity, z1<n.LoginScreenLoginState> z1Var, Continuation<? super C1360b> continuation) {
                    super(2, continuation);
                    this.f96127b = oktaLoginActivity;
                    this.f96128c = z1Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1360b(this.f96127b, this.f96128c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C1360b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f96126a == 0) {
                        ResultKt.b(obj);
                        this.f96127b.o1(a.c(this.f96128c));
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class c implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f96129a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ OktaLoginActivity f96130b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<n.LoginScreenLoginState> f96131c;

                c(LocalThemeScope m10, OktaLoginActivity oktaLoginActivity, z1<n.LoginScreenLoginState> z1Var) {
                    this.f96129a = m10;
                    this.f96130b = oktaLoginActivity;
                    this.f96131c = z1Var;
                }

                public final void d(InterfaceC14902f BottomSheetScaffold, Composer composer, int i10) {
                    Intrinsics.j(BottomSheetScaffold, "$this$BottomSheetScaffold");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(97966537, i10, -1, "com.meijer.mobile.authentication.okta.ux.OktaLoginActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (OktaLoginActivity.kt:119)");
                    }
                    LocalThemeScope m10 = this.f96129a;
                    n.LoginScreenLoginState bVarC = a.c(this.f96131c);
                    Modifier modifierH = androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, C14896Q.e(W.c(InterfaceC14894O.INSTANCE, composer, 6), composer, 0));
                    composer.startReplaceGroup(-1633490746);
                    boolean zD = composer.D(this.f96130b) | composer.V(this.f96131c);
                    final OktaLoginActivity oktaLoginActivity = this.f96130b;
                    final z1<n.LoginScreenLoginState> z1Var = this.f96131c;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.authentication.okta.ux.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OktaLoginActivity.b.a.c.e(oktaLoginActivity, z1Var);
                            }
                        };
                        composer.t(objB);
                    }
                    Function0 function0 = (Function0) objB;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD2 = composer.D(this.f96130b);
                    final OktaLoginActivity oktaLoginActivity2 = this.f96130b;
                    Object objB2 = composer.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function0() { // from class: com.meijer.mobile.authentication.okta.ux.h
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OktaLoginActivity.b.a.c.f(oktaLoginActivity2);
                            }
                        };
                        composer.t(objB2);
                    }
                    Function0 function02 = (Function0) objB2;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD3 = composer.D(this.f96130b);
                    final OktaLoginActivity oktaLoginActivity3 = this.f96130b;
                    Object objB3 = composer.B();
                    if (zD3 || objB3 == Composer.INSTANCE.a()) {
                        objB3 = new Function0() { // from class: com.meijer.mobile.authentication.okta.ux.i
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OktaLoginActivity.b.a.c.g(oktaLoginActivity3);
                            }
                        };
                        composer.t(objB3);
                    }
                    composer.P();
                    m.b(m10, bVarC, modifierH, function0, function02, (Function0) objB3, composer, LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 3), 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                    d(interfaceC14902f, composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(OktaLoginActivity oktaLoginActivity, z1 z1Var) {
                    oktaLoginActivity.o1(a.c(z1Var));
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit f(OktaLoginActivity oktaLoginActivity) {
                    oktaLoginActivity.t1().u();
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit g(OktaLoginActivity oktaLoginActivity) {
                    oktaLoginActivity.finish();
                    return Unit.f143329a;
                }
            }

            a(OktaLoginActivity oktaLoginActivity) {
                this.f96121a = oktaLoginActivity;
            }

            public final void b(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1071617722, i11, -1, "com.meijer.mobile.authentication.okta.ux.OktaLoginActivity.onCreate.<anonymous>.<anonymous> (OktaLoginActivity.kt:88)");
                }
                z1 z1VarB = o1.b(this.f96121a.t1().v(), null, composer, 0, 1);
                C18036r c18036rK = C18033q.k(new C18039s(EnumC18041t.f169753b, (H1.d) composer.o(C6034t0.g()), null, null, 12, null), null, composer, 0, 2);
                C18039s c18039sA = c18036rK.getBottomSheetState();
                composer.startReplaceGroup(-1746271574);
                boolean zV = composer.V(c18036rK) | composer.V(z1VarB) | composer.D(this.f96121a);
                OktaLoginActivity oktaLoginActivity = this.f96121a;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new C1359a(c18036rK, oktaLoginActivity, z1VarB, null);
                    composer.t(objB);
                }
                composer.P();
                J.g(c18039sA, (Function2) objB, composer, 0);
                Boolean boolValueOf = Boolean.valueOf(c(z1VarB).getIsLoggedIn());
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f96121a) | composer.V(z1VarB);
                OktaLoginActivity oktaLoginActivity2 = this.f96121a;
                Object objB2 = composer.B();
                if (zD || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new C1360b(oktaLoginActivity2, z1VarB, null);
                    composer.t(objB2);
                }
                composer.P();
                J.g(boolValueOf, (Function2) objB2, composer, 0);
                C18033q.b(ComposableLambdaKt.c(97966537, true, new c(AdsTheme, this.f96121a, z1VarB), composer, 54), FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), c18036rK, null, null, null, 0, C6393b.a(c(z1VarB).getLoadingMessage()) && !c(z1VarB).getIsAccountError(), C16806i.e(AdsTheme.getAdsCornerRadii().getRadius03().getDp(), AdsTheme.getAdsCornerRadii().getRadius03().getDp(), 0.0f, 0.0f, 12, null), 0.0f, 0L, 0L, H1.h.p(0), AdsTheme.getAdsColors().getAdsColorUIOverlay().getColor(), 0L, C11714e.f96166a.a(), composer, 6, 196992, 20088);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope m10, Composer composer, Integer num) {
                b(m10, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final n.LoginScreenLoginState c(z1<n.LoginScreenLoginState> z1Var) {
                return z1Var.getValue();
            }
        }

        b() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1346797141, i10, -1, "com.meijer.mobile.authentication.okta.ux.OktaLoginActivity.onCreate.<anonymous> (OktaLoginActivity.kt:87)");
            }
            K.b(null, ComposableLambdaKt.c(1071617722, true, new a(OktaLoginActivity.this), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f96132f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f96132f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f96132f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f96133f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f96133f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f96133f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f96134f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f96135g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f96134f = function0;
            this.f96135g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f96134f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f96135g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n t1() {
        return (n) this.viewModel.getValue();
    }

    public final C18187d getFirebaseLoggingUtil() {
        C18187d c18187d = this.firebaseLoggingUtil;
        if (c18187d != null) {
            return c18187d;
        }
        Intrinsics.x("firebaseLoggingUtil");
        return null;
    }

    public final Dl.e getMeijerIntent() {
        Dl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.x("meijerIntent");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o1(n.LoginScreenLoginState loginViewState) {
        if (loginViewState.getIsLoggedIn()) {
            t1().A(r1(), s1());
            t1().B();
            u1();
        } else if (loginViewState.getLoadingMessage() == null && !loginViewState.getIsLogoutComplete()) {
            t1().x(this, q1(), p1());
        } else {
            finish();
        }
    }

    private final boolean p1() {
        return getIntent().getBooleanExtra("com.meijer.intent.extra.AUTO_LOGOUT", false);
    }

    private final String q1() {
        return getIntent().getStringExtra("com.meijer.intent.extra.EMAIL_ADDRESS");
    }

    private final Boolean r1() {
        if (getIntent().hasExtra("com.meijer.intent.extra.SUBSCRIBE_EMAILS")) {
            return Boolean.valueOf(getIntent().getBooleanExtra("com.meijer.intent.extra.SUBSCRIBE_EMAILS", false));
        }
        return null;
    }

    private final Boolean s1() {
        if (getIntent().hasExtra("com.meijer.intent.extra.SUBSCRIBE_TEXTS")) {
            return Boolean.valueOf(getIntent().getBooleanExtra("com.meijer.intent.extra.SUBSCRIBE_TEXTS", false));
        }
        return null;
    }

    private final void u1() {
        Intent intentAddFlags;
        if (getIntent().hasExtra("com.meijer.intent.extra.DASHBOARD_LINK")) {
            int intExtra = getIntent().getIntExtra("com.meijer.intent.extra.DASHBOARD_LINK", 0);
            int intExtra2 = getIntent().getIntExtra("com.meijer.mobile.meijer.activity.weeklyad.product", 0);
            String stringExtra = getIntent().getStringExtra("unauth_search_term");
            Bundle bundleA = C14923c.a();
            if (intExtra2 != 0) {
                bundleA.putInt("com.meijer.mobile.meijer.activity.weeklyad.product", intExtra2);
            } else if (stringExtra != null && !StringsKt.s0(stringExtra)) {
                bundleA.putString("unauth_search_term", stringExtra);
            }
            Intent intentS = getMeijerIntent().s(this, intExtra, bundleA);
            if (intentS != null && (intentAddFlags = intentS.addFlags(268468224)) != null) {
                startActivity(intentAddFlags);
            } else {
                startActivity(getMeijerIntent().p(this, true));
            }
        } else if (getIntent().hasExtra("com.meijer.intent.extra.URI")) {
            startActivity(getMeijerIntent().n(this, getIntent().getStringExtra("com.meijer.intent.extra.URI")));
        } else {
            startActivity(getMeijerIntent().p(this, true));
        }
        C18187d.b(getFirebaseLoggingUtil(), "mperks_app_sign_in", null, 2, null);
        finish();
    }

    @Override // com.meijer.mobile.authentication.okta.ux.Hilt_OktaLoginActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().a(t1());
        androidx.view.r.b(this, L.INSTANCE.c(0), null, 2, null);
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1346797141, true, new b()), 1, null);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        FS.page("Sign In").start();
    }
}
