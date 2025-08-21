package com.meijer.mobile.authentication.okta.ux;

import Ki.K;
import Ki.LocalThemeScope;
import V2.CreationExtras;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.view.ComponentActivity;
import androidx.view.L;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.authentication.okta.ux.A;
import com.meijer.mobile.authentication.okta.ux.OktaLogoutActivity;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import e.C13737e;
import hi.InterfaceC14523a;
import j0.C14896Q;
import j0.InterfaceC14894O;
import j0.InterfaceC14902f;
import j0.W;
import kotlin.C17957L0;
import kotlin.C17959M0;
import kotlin.EnumC17961N0;
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
import mv.InterfaceC15783O;
import r0.C16806i;
import xj.C18187d;
import yr.C18370z;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00066²\u0006\f\u00105\u001a\u0002048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/authentication/okta/ux/OktaLogoutActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "", "t1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lhi/a;", "v", "Lhi/a;", "getAnalyticsEngine", "()Lhi/a;", "setAnalyticsEngine", "(Lhi/a;)V", "analyticsEngine", "LDl/e;", "w", "LDl/e;", "getMeijerIntent", "()LDl/e;", "setMeijerIntent", "(LDl/e;)V", "meijerIntent", "Lxj/d;", "x", "Lxj/d;", "getFirebaseLoggingUtil", "()Lxj/d;", "setFirebaseLoggingUtil", "(Lxj/d;)V", "firebaseLoggingUtil", "Lcom/meijer/mobile/authentication/okta/ux/A$b;", "y", "Lcom/meijer/mobile/authentication/okta/ux/A$b;", "s1", "()Lcom/meijer/mobile/authentication/okta/ux/A$b;", "setVmFactory", "(Lcom/meijer/mobile/authentication/okta/ux/A$b;)V", "vmFactory", "Lcom/meijer/mobile/authentication/okta/ux/A;", "z", "Lkotlin/Lazy;", "r1", "()Lcom/meijer/mobile/authentication/okta/ux/A;", "viewModel", "", "q1", "()Z", "autoLogout", "Lcom/meijer/mobile/authentication/okta/ux/A$c;", "logoutViewState", "okta-ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class OktaLogoutActivity extends Hilt_OktaLogoutActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14523a analyticsEngine;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public Dl.e meijerIntent;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public C18187d firebaseLoggingUtil;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public A.b vmFactory;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(A.class), new b(this), new Function0() { // from class: com.meijer.mobile.authentication.okta.ux.s
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OktaLogoutActivity.u1(this.f96247a);
        }
    }, new c(null, this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.authentication.okta.ux.OktaLogoutActivity$a$a, reason: collision with other inner class name */
        static final class C1361a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ OktaLogoutActivity f96142a;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.authentication.okta.ux.OktaLogoutActivity$onCreate$1$1$1$1", f = "OktaLogoutActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.authentication.okta.ux.OktaLogoutActivity$a$a$a, reason: collision with other inner class name */
            static final class C1362a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f96143a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17959M0 f96144b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ OktaLogoutActivity f96145c;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1362a(this.f96144b, this.f96145c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1362a(C17959M0 c17959m0, OktaLogoutActivity oktaLogoutActivity, Continuation<? super C1362a> continuation) {
                    super(2, continuation);
                    this.f96144b = c17959m0;
                    this.f96145c = oktaLogoutActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C1362a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f96143a == 0) {
                        ResultKt.b(obj);
                        if (!this.f96144b.k()) {
                            this.f96145c.finish();
                        }
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.authentication.okta.ux.OktaLogoutActivity$onCreate$1$1$2$1", f = "OktaLogoutActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.authentication.okta.ux.OktaLogoutActivity$a$a$b */
            static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f96146a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ OktaLogoutActivity f96147b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(OktaLogoutActivity oktaLogoutActivity, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f96147b = oktaLogoutActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f96147b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f96146a == 0) {
                        ResultKt.b(obj);
                        if (this.f96147b.q1()) {
                            this.f96147b.r1().w(this.f96147b);
                        }
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.authentication.okta.ux.OktaLogoutActivity$a$a$c */
            static final class c implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f96148a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ OktaLogoutActivity f96149b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<A.c> f96150c;

                /* JADX WARN: Multi-variable type inference failed */
                c(LocalThemeScope localThemeScope, OktaLogoutActivity oktaLogoutActivity, z1<? extends A.c> z1Var) {
                    this.f96148a = localThemeScope;
                    this.f96149b = oktaLogoutActivity;
                    this.f96150c = z1Var;
                }

                public final void d(InterfaceC14902f ModalBottomSheetLayout, Composer composer, int i10) {
                    Intrinsics.j(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-20669956, i10, -1, "com.meijer.mobile.authentication.okta.ux.OktaLogoutActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (OktaLogoutActivity.kt:103)");
                    }
                    Modifier modifierH = androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, C14896Q.e(W.c(InterfaceC14894O.INSTANCE, composer, 6), composer, 0));
                    A.c cVarC = C1361a.c(this.f96150c);
                    LocalThemeScope localThemeScope = this.f96148a;
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f96149b);
                    final OktaLogoutActivity oktaLogoutActivity = this.f96149b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.authentication.okta.ux.t
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OktaLogoutActivity.a.C1361a.c.e(oktaLogoutActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    Function0 function0 = (Function0) objB;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD2 = composer.D(this.f96149b);
                    final OktaLogoutActivity oktaLogoutActivity2 = this.f96149b;
                    Object objB2 = composer.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function0() { // from class: com.meijer.mobile.authentication.okta.ux.u
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OktaLogoutActivity.a.C1361a.c.f(oktaLogoutActivity2);
                            }
                        };
                        composer.t(objB2);
                    }
                    Function0 function02 = (Function0) objB2;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD3 = composer.D(this.f96149b);
                    final OktaLogoutActivity oktaLogoutActivity3 = this.f96149b;
                    Object objB3 = composer.B();
                    if (zD3 || objB3 == Composer.INSTANCE.a()) {
                        objB3 = new Function0() { // from class: com.meijer.mobile.authentication.okta.ux.v
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OktaLogoutActivity.a.C1361a.c.g(oktaLogoutActivity3);
                            }
                        };
                        composer.t(objB3);
                    }
                    composer.P();
                    z.b(localThemeScope, cVarC, modifierH, function0, function02, (Function0) objB3, composer, LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 3), 0);
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
                public static final Unit e(OktaLogoutActivity oktaLogoutActivity) {
                    oktaLogoutActivity.r1().w(oktaLogoutActivity);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit f(OktaLogoutActivity oktaLogoutActivity) {
                    oktaLogoutActivity.finish();
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit g(OktaLogoutActivity oktaLogoutActivity) {
                    oktaLogoutActivity.finish();
                    oktaLogoutActivity.t1();
                    return Unit.f143329a;
                }
            }

            C1361a(OktaLogoutActivity oktaLogoutActivity) {
                this.f96142a = oktaLogoutActivity;
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
                    ComposerKt.U(-1167436594, i11, -1, "com.meijer.mobile.authentication.okta.ux.OktaLogoutActivity.onCreate.<anonymous>.<anonymous> (OktaLogoutActivity.kt:77)");
                }
                z1 z1VarB = o1.b(this.f96142a.r1().t(), null, composer, 0, 1);
                C17959M0 c17959m0J = C17957L0.j(EnumC17961N0.f168315b, null, null, false, composer, 6, 14);
                Boolean boolValueOf = Boolean.valueOf(c17959m0J.k());
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(c17959m0J) | composer.D(this.f96142a);
                OktaLogoutActivity oktaLogoutActivity = this.f96142a;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C1362a(c17959m0J, oktaLogoutActivity, null);
                    composer.t(objB);
                }
                composer.P();
                J.g(boolValueOf, (Function2) objB, composer, 0);
                A.c cVarC = c(z1VarB);
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(this.f96142a);
                OktaLogoutActivity oktaLogoutActivity2 = this.f96142a;
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new b(oktaLogoutActivity2, null);
                    composer.t(objB2);
                }
                composer.P();
                J.g(cVarC, (Function2) objB2, composer, AbstractC6392a.f60445b);
                C17957L0.b(ComposableLambdaKt.c(-20669956, true, new c(AdsTheme, this.f96142a, z1VarB), composer, 54), C18370z.c(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), false, 1, null), c17959m0J, false, C16806i.e(AdsTheme.getAdsCornerRadii().getRadius03().getDp(), AdsTheme.getAdsCornerRadii().getRadius03().getDp(), 0.0f, 0.0f, 12, null), 0.0f, 0L, 0L, 0L, f.f96169a.a(), composer, (C17959M0.f168297e << 6) | 805306374, 488);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                b(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final A.c c(z1<? extends A.c> z1Var) {
                return z1Var.getValue();
            }
        }

        a() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1686812801, i10, -1, "com.meijer.mobile.authentication.okta.ux.OktaLogoutActivity.onCreate.<anonymous> (OktaLogoutActivity.kt:76)");
            }
            K.b(null, ComposableLambdaKt.c(-1167436594, true, new C1361a(OktaLogoutActivity.this), composer, 54), composer, 48, 1);
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f96151f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f96151f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f96151f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f96152f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f96153g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f96152f = function0;
            this.f96153g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f96152f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f96153g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final A r1() {
        return (A) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0.c u1(OktaLogoutActivity oktaLogoutActivity) {
        return A.INSTANCE.a(oktaLogoutActivity.s1(), oktaLogoutActivity.q1());
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

    public final A.b s1() {
        A.b bVar = this.vmFactory;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.x("vmFactory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q1() {
        return getIntent().getBooleanExtra("com.meijer.intent.extra.AUTO_LOGOUT", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t1() {
        androidx.core.app.y yVarK = androidx.core.app.y.k(this);
        Dl.e meijerIntent = getMeijerIntent();
        Context applicationContext = getApplicationContext();
        Intrinsics.i(applicationContext, "getApplicationContext(...)");
        androidx.core.app.y yVarA = yVarK.a(meijerIntent.p(applicationContext, false).setFlags(268468224));
        Intrinsics.i(yVarA, "addNextIntent(...)");
        if (q1()) {
            yVarA.a(Bl.k.b(this, false, Boolean.TRUE, null, null, null, null, BinsView.TOTE_HEIGHT_DP, null));
        }
        yVarA.n();
        finish();
    }

    @Override // com.meijer.mobile.authentication.okta.ux.Hilt_OktaLogoutActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (q1()) {
            C18187d.d(getFirebaseLoggingUtil(), null, null, 3, null);
        }
        androidx.view.r.b(this, L.INSTANCE.c(0), null, 2, null);
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1686812801, true, new a()), 1, null);
    }
}
