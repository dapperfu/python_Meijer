package com.meijer.mobile.meijer.activity.settings.billing;

import Ji.K;
import Ji.LocalThemeScope;
import Nh.C4345j;
import V0.C5346q0;
import V2.CreationExtras;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.ui.Modifier;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.accounts.ux.payments.d;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity;
import com.meijer.mobile.meijer.activity.settings.billing.AddCardAurusActivity;
import e.C13589e;
import gk.EbtPaymentOption;
import gk.EnumC14271a;
import j0.InterfaceC14794C;
import je.C14886b;
import kotlin.C17921a1;
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
import okhttp3.HttpUrl;
import p2.C16218j0;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17144F;
import yr.Q;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/billing/AddCardAurusActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "", "F1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/meijer/mobile/accounts/ux/payments/d;", "s", "Lkotlin/Lazy;", "E1", "()Lcom/meijer/mobile/accounts/ux/payments/d;", "viewModel", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class AddCardAurusActivity extends Hilt_AddCardAurusActivity {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(com.meijer.mobile.accounts.ux.payments.d.class), new c(this), new b(this), new d(null, this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ EnumC14271a f111862b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f111863c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f111864d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ EbtPaymentOption f111865e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.settings.billing.AddCardAurusActivity$a$a, reason: collision with other inner class name */
        static final class C1756a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AddCardAurusActivity f111866a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ EnumC14271a f111867b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f111868c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f111869d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ EbtPaymentOption f111870e;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.billing.AddCardAurusActivity$onCreate$1$1$1$1", f = "AddCardAurusActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.settings.billing.AddCardAurusActivity$a$a$a, reason: collision with other inner class name */
            static final class C1757a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f111871a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ AddCardAurusActivity f111872b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ EnumC14271a f111873c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ boolean f111874d;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1757a(this.f111872b, this.f111873c, this.f111874d, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1757a(AddCardAurusActivity addCardAurusActivity, EnumC14271a enumC14271a, boolean z10, Continuation<? super C1757a> continuation) {
                    super(2, continuation);
                    this.f111872b = addCardAurusActivity;
                    this.f111873c = enumC14271a;
                    this.f111874d = z10;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C1757a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f111871a == 0) {
                        ResultKt.b(obj);
                        this.f111872b.E1().s(this.f111873c, this.f111874d);
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.settings.billing.AddCardAurusActivity$a$a$b */
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f111875a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ AddCardAurusActivity f111876b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f111877c;

                b(LocalThemeScope localThemeScope, AddCardAurusActivity addCardAurusActivity, boolean z10) {
                    this.f111875a = localThemeScope;
                    this.f111876b = addCardAurusActivity;
                    this.f111877c = z10;
                }

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-2052692034, i10, -1, "com.meijer.mobile.meijer.activity.settings.billing.AddCardAurusActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (AddCardAurusActivity.kt:101)");
                    }
                    LocalThemeScope localThemeScope = this.f111875a;
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f111876b);
                    final AddCardAurusActivity addCardAurusActivity = this.f111876b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.billing.b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AddCardAurusActivity.a.C1756a.b.c(addCardAurusActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    h.h(localThemeScope, null, (Function0) objB, this.f111877c, this.f111876b.getIntent().getBooleanExtra("com.meijer.mobile.meijer.activity.settings.billing.AddCardAurusActivity.IsFromOrderReview", false), this.f111876b.getIntent().getBooleanExtra("com.meijer.mobile.meijer.activity.settings.billing.AddCardAurusActivity.HasCardsOnFile", false), composer, LocalThemeScope.f15770g, 1);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(AddCardAurusActivity addCardAurusActivity) {
                    if (!addCardAurusActivity.onNavigateUp()) {
                        addCardAurusActivity.finish();
                    }
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.settings.billing.AddCardAurusActivity$a$a$c */
            static final class c implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ d.ViewState f111878a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f111879b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ AddCardAurusActivity f111880c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ EbtPaymentOption f111881d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f111882e;

                c(d.ViewState viewState, boolean z10, AddCardAurusActivity addCardAurusActivity, EbtPaymentOption ebtPaymentOption, LocalThemeScope localThemeScope) {
                    this.f111878a = viewState;
                    this.f111879b = z10;
                    this.f111880c = addCardAurusActivity;
                    this.f111881d = ebtPaymentOption;
                    this.f111882e = localThemeScope;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(boolean z10, AddCardAurusActivity addCardAurusActivity, EbtPaymentOption ebtPaymentOption, String str) {
                    if (z10) {
                        addCardAurusActivity.E1().A(new d.a.ProcessAurusIFrameReturn(str, ebtPaymentOption));
                    } else {
                        addCardAurusActivity.finish();
                    }
                    return Unit.f142422a;
                }

                public final void b(InterfaceC14794C contentPadding, Composer composer, int i10) {
                    int i11;
                    Intrinsics.j(contentPadding, "contentPadding");
                    if ((i10 & 6) == 0) {
                        i11 = i10 | (composer.V(contentPadding) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-2013642697, i11, -1, "com.meijer.mobile.meijer.activity.settings.billing.AddCardAurusActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (AddCardAurusActivity.kt:112)");
                    }
                    composer.startReplaceGroup(1919620988);
                    if (this.f111878a.getAurusUrl() != null && this.f111878a.getAccessToken() != null) {
                        Modifier modifierFsMask = FullStoryAnnotationsKt.fsMask(D.h(Modifier.INSTANCE, contentPadding));
                        HttpUrl aurusUrl = this.f111878a.getAurusUrl();
                        Intrinsics.g(aurusUrl);
                        String accessToken = this.f111878a.getAccessToken();
                        Intrinsics.g(accessToken);
                        composer.startReplaceGroup(-1746271574);
                        boolean zA = composer.a(this.f111879b) | composer.D(this.f111880c) | composer.D(this.f111881d);
                        final boolean z10 = this.f111879b;
                        final AddCardAurusActivity addCardAurusActivity = this.f111880c;
                        final EbtPaymentOption ebtPaymentOption = this.f111881d;
                        Object objB = composer.B();
                        if (zA || objB == Composer.INSTANCE.a()) {
                            objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.billing.c
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AddCardAurusActivity.a.C1756a.c.c(z10, addCardAurusActivity, ebtPaymentOption, (String) obj);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        C4345j.d(modifierFsMask, aurusUrl, accessToken, (Function1) objB, composer, 0, 0);
                    }
                    composer.P();
                    if (this.f111878a.getIsLoading()) {
                        h.e(this.f111882e, androidx.compose.foundation.b.d(J.f(Modifier.INSTANCE, 0.0f, 1, null), C5346q0.q(this.f111882e.getAdsColors().getAdsColorsEnabled02().getColor(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer, LocalThemeScope.f15770g, 0);
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
                    b(interfaceC14794C, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            C1756a(AddCardAurusActivity addCardAurusActivity, EnumC14271a enumC14271a, boolean z10, boolean z11, EbtPaymentOption ebtPaymentOption) {
                this.f111866a = addCardAurusActivity;
                this.f111867b = enumC14271a;
                this.f111868c = z10;
                this.f111869d = z11;
                this.f111870e = ebtPaymentOption;
            }

            public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
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
                    ComposerKt.U(407191673, i11, -1, "com.meijer.mobile.meijer.activity.settings.billing.AddCardAurusActivity.onCreate.<anonymous>.<anonymous> (AddCardAurusActivity.kt:87)");
                }
                Boolean bool = Boolean.TRUE;
                composer.startReplaceGroup(-1746271574);
                boolean zD = composer.D(this.f111866a) | composer.d(this.f111867b.ordinal()) | composer.a(this.f111868c);
                AddCardAurusActivity addCardAurusActivity = this.f111866a;
                EnumC14271a enumC14271a = this.f111867b;
                boolean z10 = this.f111868c;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C1757a(addCardAurusActivity, enumC14271a, z10, null);
                    composer.t(objB);
                }
                composer.P();
                androidx.compose.runtime.J.g(bool, (Function2) objB, composer, 6);
                C16218j0.b(this.f111866a.getWindow(), true);
                C17921a1.a(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), null, ComposableLambdaKt.c(-2052692034, true, new b(AdsTheme, this.f111866a, this.f111869d), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-2013642697, true, new c((d.ViewState) o1.b(this.f111866a.E1().x(), null, composer, 0, 1).getValue(), this.f111869d, this.f111866a, this.f111870e, AdsTheme), composer, 54), composer, 384, 12582912, 131066);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.billing.AddCardAurusActivity$onCreate$1$2$1", f = "AddCardAurusActivity.kt", l = {146}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111883a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AddCardAurusActivity f111884b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AddCardAurusActivity addCardAurusActivity, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f111884b = addCardAurusActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f111884b, continuation);
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/accounts/ux/payments/d$c;", "effect", "", "<anonymous>", "(Lcom/meijer/mobile/accounts/ux/payments/d$c;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.billing.AddCardAurusActivity$onCreate$1$2$1$1", f = "AddCardAurusActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.settings.billing.AddCardAurusActivity$a$b$a, reason: collision with other inner class name */
            static final class C1758a extends SuspendLambda implements Function2<d.c, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f111885a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f111886b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ AddCardAurusActivity f111887c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1758a(AddCardAurusActivity addCardAurusActivity, Continuation<? super C1758a> continuation) {
                    super(2, continuation);
                    this.f111887c = addCardAurusActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1758a c1758a = new C1758a(this.f111887c, continuation);
                    c1758a.f111886b = obj;
                    return c1758a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(d.c cVar, Continuation<? super Unit> continuation) {
                    return ((C1758a) create(cVar, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f111885a == 0) {
                        ResultKt.b(obj);
                        d.c cVar = (d.c) this.f111886b;
                        if (cVar instanceof d.c.CardAddSuccessful) {
                            AddCardAurusActivity addCardAurusActivity = this.f111887c;
                            addCardAurusActivity.startActivity(CheckoutActivity.INSTANCE.a(addCardAurusActivity, ((d.c.CardAddSuccessful) cVar).getMultiTenderPaymentOption()));
                            this.f111887c.finish();
                        } else if (Intrinsics.e(cVar, d.c.a.f94412a)) {
                            this.f111887c.F1();
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111883a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17144F<d.c> interfaceC17144FW = this.f111884b.E1().w();
                    C1758a c1758a = new C1758a(this.f111884b, null);
                    this.f111883a = 1;
                    if (C17154h.k(interfaceC17144FW, c1758a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        a(EnumC14271a enumC14271a, boolean z10, boolean z11, EbtPaymentOption ebtPaymentOption) {
            this.f111862b = enumC14271a;
            this.f111863c = z10;
            this.f111864d = z11;
            this.f111865e = ebtPaymentOption;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-353031830, i10, -1, "com.meijer.mobile.meijer.activity.settings.billing.AddCardAurusActivity.onCreate.<anonymous> (AddCardAurusActivity.kt:86)");
            }
            K.b(null, ComposableLambdaKt.c(407191673, true, new C1756a(AddCardAurusActivity.this, this.f111862b, this.f111863c, this.f111864d, this.f111865e), composer, 54), composer, 48, 1);
            Unit unit = Unit.f142422a;
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(AddCardAurusActivity.this);
            AddCardAurusActivity addCardAurusActivity = AddCardAurusActivity.this;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new b(addCardAurusActivity, null);
                composer.t(objB);
            }
            composer.P();
            androidx.compose.runtime.J.g(unit, (Function2) objB, composer, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111888f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f111888f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f111888f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111889f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f111889f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f111889f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f111890f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111891g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f111890f = function0;
            this.f111891g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f111890f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f111891g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F1() {
        new C14886b(this).setTitle(Y.f99910Y).setMessage(Y.f99891X).setPositiveButton(Q.f170986b, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.settings.billing.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                AddCardAurusActivity.G1(this.f111894a, dialogInterface, i10);
            }
        }).show();
    }

    public final com.meijer.mobile.accounts.ux.payments.d E1() {
        return (com.meijer.mobile.accounts.ux.payments.d) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G1(AddCardAurusActivity addCardAurusActivity, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        addCardAurusActivity.finish();
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object serializableExtra;
        Parcelable parcelable;
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            serializableExtra = intent.getSerializableExtra("com.meijer.mobile.meijer.activity.settings.billing.AddCardAurusActivity.UseCase", EnumC14271a.class);
        } else {
            Object serializableExtra2 = intent.getSerializableExtra("com.meijer.mobile.meijer.activity.settings.billing.AddCardAurusActivity.UseCase");
            if (!(serializableExtra2 instanceof EnumC14271a)) {
                serializableExtra2 = null;
            }
            serializableExtra = (EnumC14271a) serializableExtra2;
        }
        EnumC14271a enumC14271a = (EnumC14271a) serializableExtra;
        if (enumC14271a == null) {
            enumC14271a = EnumC14271a.f133708b;
        }
        EnumC14271a enumC14271a2 = enumC14271a;
        boolean booleanExtra = getIntent().getBooleanExtra("com.meijer.mobile.meijer.activity.settings.billing.AddCardAurusActivity.IsEnrolledInMperksCardLinking", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("com.meijer.mobile.meijer.activity.settings.billing.AddCardAurusActivity.IsFromCheckoutFlow", false);
        Intent intent2 = getIntent();
        Intrinsics.i(intent2, "getIntent(...)");
        if (i10 >= 33) {
            parcelable = (Parcelable) intent2.getParcelableExtra("com.meijer.mobile.meijer.activity.settings.billing.AddCardAurusActivity.EbtPaymentOption", EbtPaymentOption.class);
        } else {
            Parcelable parcelableExtra = intent2.getParcelableExtra("com.meijer.mobile.meijer.activity.settings.billing.AddCardAurusActivity.EbtPaymentOption");
            if (!(parcelableExtra instanceof EbtPaymentOption)) {
                parcelableExtra = null;
            }
            parcelable = (EbtPaymentOption) parcelableExtra;
        }
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-353031830, true, new a(enumC14271a2, booleanExtra, booleanExtra2, (EbtPaymentOption) parcelable)), 1, null);
    }
}
