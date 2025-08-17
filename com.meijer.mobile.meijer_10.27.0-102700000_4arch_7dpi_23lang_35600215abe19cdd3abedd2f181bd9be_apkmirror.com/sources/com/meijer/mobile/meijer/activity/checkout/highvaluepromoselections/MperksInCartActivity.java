package com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections;

import Ji.C;
import Ji.K;
import Ji.LocalThemeScope;
import V2.CreationExtras;
import ak.AbstractC5607a;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import bo.ClaimReward;
import bo.h;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.G;
import com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity;
import com.meijer.mobile.meijer.activity.checkout.payment.SaveChangesDialogFragment;
import com.meijer.mobile.meijer.activity.checkout.payment.u0;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import e.C13589e;
import j0.C14815g;
import j0.InterfaceC14794C;
import j0.InterfaceC14814f;
import java.util.List;
import ko.AbstractC15200a;
import ko.AbstractC15202c;
import ko.ClaimTabState;
import kotlin.C17893M0;
import kotlin.C17921a1;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16193g;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17144F;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001!B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006'²\u0006\f\u0010#\u001a\u00020\"8\nX\u008a\u0084\u0002²\u0006\f\u0010%\u001a\u00020$8\nX\u008a\u0084\u0002²\u0006\f\u0010&\u001a\u00020\n8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/MperksInCartActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/u0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "save", "W", "(Z)V", "Lko/z;", "s", "Lkotlin/Lazy;", "F1", "()Lko/z;", "claimTabViewModel", "Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/G;", "t", "G1", "()Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/G;", "mperksInCartViewModel", "Lcom/meijer/mobile/meijer/activity/checkout/payment/SaveChangesDialogFragment;", "u", "Lcom/meijer/mobile/meijer/activity/checkout/payment/SaveChangesDialogFragment;", "saveChangesDialogFragment", "v", "Z", "showApplyHVPOfferFailToast", "w", "a", "Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/q;", "viewState", "Lko/d;", "claimTabViewState", "hasOffersToApply", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class MperksInCartActivity extends Hilt_MperksInCartActivity implements u0 {

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: x, reason: collision with root package name */
    public static final int f103262x = 8;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private SaveChangesDialogFragment saveChangesDialogFragment;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy claimTabViewModel = new e0(Reflection.b(ko.z.class), new d(this), new c(this), new e(null, this));

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Lazy mperksInCartViewModel = new e0(Reflection.b(G.class), new g(this), new f(this), new h(null, this));

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean showApplyHVPOfferFailToast = true;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/MperksInCartActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "isFromDialog", "", "mPerksPoints", "hasHVPOffer", "appliedOffers", "Landroid/content/Intent;", "a", "(Landroid/content/Context;ZIZI)Landroid/content/Intent;", "", "EXTRA_IS_FROM_DIALOG", "Ljava/lang/String;", "EXTRA_MPERKS_POINTS", "EXTRA_HAS_HVP_OFFER", "EXTRA_APPLIED_OFFERS", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Intent a(Context context, boolean isFromDialog, int mPerksPoints, boolean hasHVPOffer, int appliedOffers) {
            Intrinsics.j(context, "context");
            Intent intentPutExtra = new Intent(context, (Class<?>) MperksInCartActivity.class).putExtra("com.meijer.mobile.meijer.activity.checkout.highValuePromoSelections.HighValuePromoSelectionsActivity.IS_FROM_DIALOG", isFromDialog).putExtra("com.meijer.mobile.meijer.activity.checkout.highValuePromoSelections.HighValuePromoSelectionsActivity.MPERKS_POINTS", mPerksPoints).putExtra("com.meijer.mobile.meijer.activity.checkout.highValuePromoSelections.HighValuePromoSelectionsActivity.EXTRA_HAS_HVP_OFFER", hasHVPOffer).putExtra("com.meijer.mobile.meijer.activity.checkout.highValuePromoSelections.HighValuePromoSelectionsActivity.EXTRA_APPLIED_OFFERS", appliedOffers);
            Intrinsics.i(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f103268b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MperksInCartActivity f103269a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f103270b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity$b$a$a, reason: collision with other inner class name */
            static final class C1459a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f103271a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC16622O f103272b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C17893M0 f103273c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ MperksInCartActivity f103274d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ z1<HighValuePromoSelectionsViewState> f103275e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ z1<ClaimTabState> f103276f;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity$onCreate$1$1$1$1$1$1", f = "MperksInCartActivity.kt", l = {157}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity$b$a$a$a, reason: collision with other inner class name */
                static final class C1460a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f103277a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C17893M0 f103278b;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C1460a(this.f103278b, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1460a(C17893M0 c17893m0, Continuation<? super C1460a> continuation) {
                        super(2, continuation);
                        this.f103278b = c17893m0;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((C1460a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f103277a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            C17893M0 c17893m0 = this.f103278b;
                            this.f103277a = 1;
                            if (c17893m0.i(this) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f142422a;
                    }
                }

                C1459a(LocalThemeScope localThemeScope, InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, MperksInCartActivity mperksInCartActivity, z1<HighValuePromoSelectionsViewState> z1Var, z1<ClaimTabState> z1Var2) {
                    this.f103271a = localThemeScope;
                    this.f103272b = interfaceC16622O;
                    this.f103273c = c17893m0;
                    this.f103274d = mperksInCartActivity;
                    this.f103275e = z1Var;
                    this.f103276f = z1Var2;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit d(InterfaceC16622O interfaceC16622O, C17893M0 c17893m0) {
                    C16648k.d(interfaceC16622O, null, null, new C1460a(c17893m0, null), 3, null);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(MperksInCartActivity mperksInCartActivity, z1 z1Var, bo.h action) {
                    Intrinsics.j(action, "action");
                    if (action instanceof h.BuyReward) {
                        h.BuyReward buyReward = (h.BuyReward) action;
                        mperksInCartActivity.F1().E(new AbstractC15200a.BuyReward(buyReward.getClaimReward()));
                        int pointCost = buyReward.getClaimReward().getPointCost();
                        ko.z zVarF1 = mperksInCartActivity.F1();
                        ClaimReward claimReward = buyReward.getClaimReward();
                        String str = claimReward.getCouponId() + ": " + claimReward.getName();
                        String strG = buyReward.getClaimReward().g();
                        if (strG == null) {
                            strG = "No Validity";
                        }
                        zVarF1.E(new AbstractC15200a.TrackRewardClaimedAction(str, strG, String.valueOf(buyReward.getClaimReward().d()), "Cart Page:Claim rewards modal", pointCost, a.d(z1Var).getMPerksPoints() - pointCost));
                    } else if (action instanceof h.TrackClaimRewardFromCart) {
                        ko.z zVarF12 = mperksInCartActivity.F1();
                        h.TrackClaimRewardFromCart trackClaimRewardFromCart = (h.TrackClaimRewardFromCart) action;
                        String rewardAction = trackClaimRewardFromCart.getRewardAction();
                        ClaimReward claimReward2 = trackClaimRewardFromCart.getClaimReward();
                        zVarF12.K(rewardAction, claimReward2.getCouponId() + ": " + claimReward2.getName());
                    } else if (action instanceof h.j) {
                        mperksInCartActivity.F1().E(AbstractC15200a.c.f142182a);
                    }
                    return Unit.f142422a;
                }

                public final void c(InterfaceC14814f ModalBottomSheetLayout, Composer composer, int i10) {
                    Intrinsics.j(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1521834644, i10, -1, "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (MperksInCartActivity.kt:110)");
                    }
                    Modifier modifierFsUnmaskWithConsent = FullStoryAnnotationsKt.fsUnmaskWithConsent(androidx.compose.foundation.layout.J.c(Modifier.INSTANCE, 0.98f));
                    int mPerksPoints = a.d(this.f103275e).getMPerksPoints();
                    ClaimTabState claimTabStateE = a.e(this.f103276f);
                    LocalThemeScope localThemeScope = this.f103271a;
                    composer.startReplaceGroup(-1633490746);
                    boolean zD = composer.D(this.f103272b) | composer.D(this.f103273c);
                    final InterfaceC16622O interfaceC16622O = this.f103272b;
                    final C17893M0 c17893m0 = this.f103273c;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MperksInCartActivity.b.a.C1459a.d(interfaceC16622O, c17893m0);
                            }
                        };
                        composer.t(objB);
                    }
                    Function0 function0 = (Function0) objB;
                    composer.P();
                    composer.startReplaceGroup(-1633490746);
                    boolean zD2 = composer.D(this.f103274d) | composer.V(this.f103275e);
                    final MperksInCartActivity mperksInCartActivity = this.f103274d;
                    final z1<HighValuePromoSelectionsViewState> z1Var = this.f103275e;
                    Object objB2 = composer.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.t
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MperksInCartActivity.b.a.C1459a.e(mperksInCartActivity, z1Var, (bo.h) obj);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    Cm.d.d(localThemeScope, mPerksPoints, claimTabStateE, modifierFsUnmaskWithConsent, true, function0, (Function1) objB2, composer, LocalThemeScope.f15770g | 24576, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                    c(interfaceC14814f, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity$b$a$b, reason: collision with other inner class name */
            static final class C1461b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ z1<HighValuePromoSelectionsViewState> f103279a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f103280b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ MperksInCartActivity f103281c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f103282d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC16622O f103283e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ C17893M0 f103284f;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity$b$a$b$a, reason: collision with other inner class name */
                static final class C1462a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f103285a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ MperksInCartActivity f103286b;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity$b$a$b$a$a, reason: collision with other inner class name */
                    static final class C1463a implements Function2<Composer, Integer, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f103287a;

                        C1463a(LocalThemeScope localThemeScope) {
                            this.f103287a = localThemeScope;
                        }

                        public final void a(Composer composer, int i10) {
                            if ((i10 & 3) == 2 && composer.j()) {
                                composer.K();
                                return;
                            }
                            if (ComposerKt.M()) {
                                ComposerKt.U(-1263017234, i10, -1, "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MperksInCartActivity.kt:176)");
                            }
                            Dr.g.g(this.f103287a, C16193g.c(Y.f99520D8, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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

                    public final void b(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-451772498, i10, -1, "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MperksInCartActivity.kt:174)");
                        }
                        C.f.d dVar = C.f.d.f15507e;
                        AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(Y.f99653K8, new Object[0]);
                        LocalThemeScope localThemeScope = this.f103285a;
                        ComposableLambda composableLambdaC = ComposableLambdaKt.c(-1263017234, true, new C1463a(localThemeScope), composer, 54);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f103286b);
                        final MperksInCartActivity mperksInCartActivity = this.f103286b;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.v
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MperksInCartActivity.b.a.C1461b.C1462a.c(mperksInCartActivity);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, dVar, 0.0f, false, abstractC5607aD, composer, LocalThemeScope.f15770g | 24576 | (C.f.d.f15508f << 18) | (AbstractC5607a.f45514b << 27), 199);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    C1462a(LocalThemeScope localThemeScope, MperksInCartActivity mperksInCartActivity) {
                        this.f103285a = localThemeScope;
                        this.f103286b = mperksInCartActivity;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        b(composer, num.intValue());
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(MperksInCartActivity mperksInCartActivity) {
                        if (!mperksInCartActivity.onNavigateUp()) {
                            mperksInCartActivity.finish();
                        }
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity$b$a$b$b, reason: collision with other inner class name */
                static final class C1464b implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f103288a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ int f103289b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ MperksInCartActivity f103290c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ InterfaceC16622O f103291d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ C17893M0 f103292e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ z1<HighValuePromoSelectionsViewState> f103293f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ z1<Boolean> f103294g;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity$onCreate$1$1$2$2$1$3$1$1", f = "MperksInCartActivity.kt", l = {HttpResponseStatus.SUCCESS_RESET_CONTENT}, m = "invokeSuspend")
                    /* renamed from: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity$b$a$b$b$a, reason: collision with other inner class name */
                    static final class C1465a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f103295a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ C17893M0 f103296b;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C1465a(this.f103296b, continuation);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1465a(C17893M0 c17893m0, Continuation<? super C1465a> continuation) {
                            super(2, continuation);
                            this.f103296b = c17893m0;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                            return ((C1465a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object objF = IntrinsicsKt.f();
                            int i10 = this.f103295a;
                            if (i10 != 0) {
                                if (i10 == 1) {
                                    ResultKt.b(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.b(obj);
                                C17893M0 c17893m0 = this.f103296b;
                                this.f103295a = 1;
                                if (c17893m0.l(this) == objF) {
                                    return objF;
                                }
                            }
                            return Unit.f142422a;
                        }
                    }

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity$onCreate$1$1$2$2$1$4$1", f = "MperksInCartActivity.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity$b$a$b$b$b, reason: collision with other inner class name */
                    static final class C1466b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f103297a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ MperksInCartActivity f103298b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f103299c;

                        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/G$d;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/G$d;)V"}, k = 3, mv = {2, 1, 0})
                        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity$onCreate$1$1$2$2$1$4$1$1", f = "MperksInCartActivity.kt", l = {236, 236}, m = "invokeSuspend")
                        @SourceDebugExtension
                        /* renamed from: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity$b$a$b$b$b$a, reason: collision with other inner class name */
                        static final class C1467a extends SuspendLambda implements Function2<G.d, Continuation<? super Unit>, Object> {

                            /* renamed from: a, reason: collision with root package name */
                            int f103300a;

                            /* renamed from: b, reason: collision with root package name */
                            /* synthetic */ Object f103301b;

                            /* renamed from: c, reason: collision with root package name */
                            final /* synthetic */ MperksInCartActivity f103302c;

                            /* renamed from: d, reason: collision with root package name */
                            final /* synthetic */ LocalThemeScope f103303d;

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit k(MperksInCartActivity mperksInCartActivity) {
                                mperksInCartActivity.showApplyHVPOfferFailToast = true;
                                return Unit.f142422a;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C1467a c1467a = new C1467a(this.f103302c, this.f103303d, continuation);
                                c1467a.f103301b = obj;
                                return c1467a;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            /* renamed from: g, reason: merged with bridge method [inline-methods] */
                            public final Object invoke(G.d dVar, Continuation<? super Unit> continuation) {
                                return ((C1467a) create(dVar, continuation)).invokeSuspend(Unit.f142422a);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C1467a(MperksInCartActivity mperksInCartActivity, LocalThemeScope localThemeScope, Continuation<? super C1467a> continuation) {
                                super(2, continuation);
                                this.f103302c = mperksInCartActivity;
                                this.f103303d = localThemeScope;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
                            
                                if (Gi.i.i((Gi.i) r2, r3, null, null, false, r5, null, null, r8, r13, 102, null) != r12) goto L22;
                             */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                                /*
                                    r13 = this;
                                    java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                                    int r0 = r13.f103300a
                                    r1 = 2
                                    r2 = 1
                                    if (r0 == 0) goto L28
                                    if (r0 == r2) goto L1f
                                    if (r0 != r1) goto L17
                                    java.lang.Object r0 = r13.f103301b
                                    com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.G$d r0 = (com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.G.d) r0
                                    kotlin.ResultKt.b(r14)
                                    goto Lac
                                L17:
                                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                                    r0.<init>(r1)
                                    throw r0
                                L1f:
                                    java.lang.Object r0 = r13.f103301b
                                    com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.G$d r0 = (com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.G.d) r0
                                    kotlin.ResultKt.b(r14)
                                    r2 = r14
                                    goto L77
                                L28:
                                    kotlin.ResultKt.b(r14)
                                    java.lang.Object r0 = r13.f103301b
                                    com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.G$d r0 = (com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.G.d) r0
                                    boolean r3 = r0 instanceof com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.G.d.GoToCartActivityEvent
                                    if (r3 == 0) goto L59
                                    android.content.Intent r1 = new android.content.Intent
                                    r1.<init>()
                                    com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.G$d$a r0 = (com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.G.d.GoToCartActivityEvent) r0
                                    int r0 = r0.getNewAppliedPromoAmount()
                                    java.lang.String r2 = "com.meijer.mobile.meijer.activity.cart.intent.extra.APPLIED_MPERKS_OFFERS_FROM_HVP"
                                    android.content.Intent r0 = r1.putExtra(r2, r0)
                                    java.lang.String r1 = "putExtra(...)"
                                    kotlin.jvm.internal.Intrinsics.i(r0, r1)
                                    com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity r1 = r13.f103302c
                                    r2 = 48385(0xbd01, float:6.7802E-41)
                                    r1.setResult(r2, r0)
                                    com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity r0 = r13.f103302c
                                    r0.finish()
                                    kotlin.Unit r0 = kotlin.Unit.f142422a
                                    goto Lac
                                L59:
                                    boolean r3 = r0 instanceof com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.G.d.ShowErrorToast
                                    if (r3 == 0) goto Laa
                                    com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity r3 = r13.f103302c
                                    r4 = 0
                                    com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity.E1(r3, r4)
                                    Ji.M r3 = r13.f103303d
                                    r4 = 80
                                    float r4 = (float) r4
                                    float r4 = H1.h.p(r4)
                                    r13.f103301b = r0
                                    r13.f103300a = r2
                                    java.lang.Object r2 = r3.f(r4, r13)
                                    if (r2 != r12) goto L77
                                    goto La9
                                L77:
                                    Gi.i r2 = (Gi.i) r2
                                    com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity r3 = r13.f103302c
                                    r4 = r0
                                    com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.G$d$b r4 = (com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.G.d.ShowErrorToast) r4
                                    int r4 = r4.getMessageId()
                                    java.lang.String r3 = r3.getString(r4)
                                    java.lang.String r4 = "getString(...)"
                                    kotlin.jvm.internal.Intrinsics.i(r3, r4)
                                    ji.q1$m$a$b r5 = ji.q1.m.a.b.f140113a
                                    com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity r4 = r13.f103302c
                                    com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.z r8 = new com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.z
                                    r8.<init>()
                                    r13.f103301b = r0
                                    r13.f103300a = r1
                                    r0 = r2
                                    r2 = 0
                                    r1 = r3
                                    r3 = 0
                                    r4 = 0
                                    r6 = 0
                                    r7 = 0
                                    r10 = 102(0x66, float:1.43E-43)
                                    r11 = 0
                                    r9 = r13
                                    java.lang.Object r0 = Gi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                                    if (r0 != r12) goto Lac
                                La9:
                                    return r12
                                Laa:
                                    kotlin.Unit r0 = kotlin.Unit.f142422a
                                Lac:
                                    kotlin.Unit r0 = kotlin.Unit.f142422a
                                    return r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity.b.a.C1461b.C1464b.C1466b.C1467a.invokeSuspend(java.lang.Object):java.lang.Object");
                            }
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C1466b(this.f103298b, this.f103299c, continuation);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1466b(MperksInCartActivity mperksInCartActivity, LocalThemeScope localThemeScope, Continuation<? super C1466b> continuation) {
                            super(2, continuation);
                            this.f103298b = mperksInCartActivity;
                            this.f103299c = localThemeScope;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                            return ((C1466b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.f();
                            if (this.f103297a == 0) {
                                ResultKt.b(obj);
                                C17154h.J(C17154h.O(this.f103298b.G1().B(), new C1467a(this.f103298b, this.f103299c, null)), C6031t.a(this.f103298b));
                                return Unit.f142422a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    C1464b(LocalThemeScope localThemeScope, int i10, MperksInCartActivity mperksInCartActivity, InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, z1<HighValuePromoSelectionsViewState> z1Var, z1<Boolean> z1Var2) {
                        this.f103288a = localThemeScope;
                        this.f103289b = i10;
                        this.f103290c = mperksInCartActivity;
                        this.f103291d = interfaceC16622O;
                        this.f103292e = c17893m0;
                        this.f103293f = z1Var;
                        this.f103294g = z1Var2;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit e(MperksInCartActivity mperksInCartActivity, HighValuePromoOfferDecorator promoDecorator, boolean z10) {
                        Intrinsics.j(promoDecorator, "promoDecorator");
                        mperksInCartActivity.G1().E(new G.c.SetSelectedPromoAction(promoDecorator.getPromoNum(), z10));
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit g(InterfaceC16622O interfaceC16622O, MperksInCartActivity mperksInCartActivity, C17893M0 c17893m0) {
                        C16648k.d(interfaceC16622O, null, null, new C1465a(c17893m0, null), 3, null);
                        mperksInCartActivity.G1().D("mPerks:Cart Page:Claim mPerks Rewards button");
                        return Unit.f142422a;
                    }

                    public final void d(InterfaceC14794C it, Composer composer, int i10) throws Resources.NotFoundException {
                        int i11;
                        Intrinsics.j(it, "it");
                        if ((i10 & 6) == 0) {
                            i11 = i10 | (composer.V(it) ? 4 : 2);
                        } else {
                            i11 = i10;
                        }
                        if ((i11 & 19) == 18 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1179162795, i11, -1, "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MperksInCartActivity.kt:186)");
                        }
                        Modifier modifierH = androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, it);
                        LocalThemeScope localThemeScope = this.f103288a;
                        int i12 = this.f103289b;
                        final MperksInCartActivity mperksInCartActivity = this.f103290c;
                        final InterfaceC16622O interfaceC16622O = this.f103291d;
                        final C17893M0 c17893m0 = this.f103292e;
                        z1<HighValuePromoSelectionsViewState> z1Var = this.f103293f;
                        z1<Boolean> z1Var2 = this.f103294g;
                        MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                        int iA = C5717f.a(composer, 0);
                        InterfaceC5742s interfaceC5742sR = composer.r();
                        Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
                        InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
                        Function0<InterfaceC5811g> function0A = companion.a();
                        if (composer.k() == null) {
                            C5717f.c();
                        }
                        composer.F();
                        if (composer.h()) {
                            composer.I(function0A);
                        } else {
                            composer.s();
                        }
                        Composer composerA = D1.a(composer);
                        D1.c(composerA, measurePolicyA, companion.e());
                        D1.c(composerA, interfaceC5742sR, companion.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                        if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        D1.c(composerA, modifierE, companion.f());
                        C14815g c14815g = C14815g.f139108a;
                        int mPerksPoints = a.d(z1Var).getMPerksPoints();
                        List<HighValuePromoOfferDecorator> listD = a.d(z1Var).d();
                        if (listD == null) {
                            listD = CollectionsKt.m();
                        }
                        boolean isLoading = a.d(z1Var).getIsLoading();
                        boolean z10 = C1461b.e(z1Var2) && !a.d(z1Var).getIsLoading();
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(mperksInCartActivity);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function2() { // from class: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.w
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return MperksInCartActivity.b.a.C1461b.C1464b.e(mperksInCartActivity, (HighValuePromoOfferDecorator) obj, ((Boolean) obj2).booleanValue());
                                }
                            };
                            composer.t(objB);
                        }
                        Function2 function2 = (Function2) objB;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD2 = composer.D(mperksInCartActivity);
                        Object objB2 = composer.B();
                        if (zD2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.x
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MperksInCartActivity.b.a.C1461b.C1464b.f(mperksInCartActivity);
                                }
                            };
                            composer.t(objB2);
                        }
                        Function0 function0 = (Function0) objB2;
                        composer.P();
                        composer.startReplaceGroup(-1746271574);
                        boolean zD3 = composer.D(interfaceC16622O) | composer.D(c17893m0) | composer.D(mperksInCartActivity);
                        Object objB3 = composer.B();
                        if (zD3 || objB3 == Composer.INSTANCE.a()) {
                            objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MperksInCartActivity.b.a.C1461b.C1464b.g(interfaceC16622O, mperksInCartActivity, c17893m0);
                                }
                            };
                            composer.t(objB3);
                        }
                        composer.P();
                        o.r(localThemeScope, mPerksPoints, listD, isLoading, z10, i12, null, function2, function0, (Function0) objB3, composer, LocalThemeScope.f15770g, 32);
                        Boolean bool = Boolean.FALSE;
                        composer.startReplaceGroup(-1633490746);
                        boolean zD4 = composer.D(mperksInCartActivity) | composer.D(localThemeScope);
                        Object objB4 = composer.B();
                        if (zD4 || objB4 == Composer.INSTANCE.a()) {
                            objB4 = new C1466b(mperksInCartActivity, localThemeScope, null);
                            composer.t(objB4);
                        }
                        composer.P();
                        androidx.compose.runtime.J.g(bool, (Function2) objB4, composer, 6);
                        composer.v();
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) throws Resources.NotFoundException {
                        d(interfaceC14794C, composer, num.intValue());
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit f(MperksInCartActivity mperksInCartActivity) {
                        mperksInCartActivity.G1().E(G.c.a.f103227a);
                        return Unit.f142422a;
                    }
                }

                C1461b(z1<HighValuePromoSelectionsViewState> z1Var, LocalThemeScope localThemeScope, MperksInCartActivity mperksInCartActivity, int i10, InterfaceC16622O interfaceC16622O, C17893M0 c17893m0) {
                    this.f103279a = z1Var;
                    this.f103280b = localThemeScope;
                    this.f103281c = mperksInCartActivity;
                    this.f103282d = i10;
                    this.f103283e = interfaceC16622O;
                    this.f103284f = c17893m0;
                }

                public final void c(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-152264365, i10, -1, "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (MperksInCartActivity.kt:166)");
                    }
                    composer.startReplaceGroup(1849434622);
                    final z1<HighValuePromoSelectionsViewState> z1Var = this.f103279a;
                    Object objB = composer.B();
                    if (objB == Composer.INSTANCE.a()) {
                        objB = o1.e(new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.u
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(MperksInCartActivity.b.a.C1461b.d(z1Var));
                            }
                        });
                        composer.t(objB);
                    }
                    composer.P();
                    C17921a1.a(null, null, ComposableLambdaKt.c(-451772498, true, new C1462a(this.f103280b, this.f103281c), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-1179162795, true, new C1464b(this.f103280b, this.f103282d, this.f103281c, this.f103283e, this.f103284f, this.f103279a, (z1) objB), composer, 54), composer, 384, 12582912, 131067);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    c(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final boolean d(z1 z1Var) {
                    if (!a.d(z1Var).d().isEmpty() && a.d(z1Var).getHasUnsavedChanges()) {
                        return true;
                    }
                    return false;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final boolean e(z1<Boolean> z1Var) {
                    return z1Var.getValue().booleanValue();
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity$onCreate$1$1$3$1", f = "MperksInCartActivity.kt", l = {}, m = "invokeSuspend")
            static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f103304a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ MperksInCartActivity f103305b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC16622O f103306c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f103307d;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity$onCreate$1$1$3$1$1", f = "MperksInCartActivity.kt", l = {259}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity$b$a$c$a, reason: collision with other inner class name */
                static final class C1468a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f103308a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ MperksInCartActivity f103309b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ InterfaceC16622O f103310c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f103311d;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity$b$a$c$a$a, reason: collision with other inner class name */
                    static final class C1469a<T> implements InterfaceC17153g {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ InterfaceC16622O f103312a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ MperksInCartActivity f103313b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f103314c;

                        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity$onCreate$1$1$3$1$1$1$1", f = "MperksInCartActivity.kt", l = {263, 263}, m = "invokeSuspend")
                        /* renamed from: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity$b$a$c$a$a$a, reason: collision with other inner class name */
                        static final class C1470a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                            /* renamed from: a, reason: collision with root package name */
                            int f103315a;

                            /* renamed from: b, reason: collision with root package name */
                            final /* synthetic */ LocalThemeScope f103316b;

                            /* renamed from: c, reason: collision with root package name */
                            final /* synthetic */ MperksInCartActivity f103317c;

                            /* renamed from: d, reason: collision with root package name */
                            final /* synthetic */ AbstractC15202c f103318d;

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new C1470a(this.f103316b, this.f103317c, this.f103318d, continuation);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C1470a(LocalThemeScope localThemeScope, MperksInCartActivity mperksInCartActivity, AbstractC15202c abstractC15202c, Continuation<? super C1470a> continuation) {
                                super(2, continuation);
                                this.f103316b = localThemeScope;
                                this.f103317c = mperksInCartActivity;
                                this.f103318d = abstractC15202c;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                                return ((C1470a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
                            
                                if (Gi.i.i((Gi.i) r0, r2, null, r3, false, r5, null, null, null, r13, 226, null) == r12) goto L15;
                             */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                                /*
                                    r13 = this;
                                    java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                                    int r0 = r13.f103315a
                                    r1 = 2
                                    r2 = 1
                                    if (r0 == 0) goto L1f
                                    if (r0 == r2) goto L1a
                                    if (r0 != r1) goto L12
                                    kotlin.ResultKt.b(r14)
                                    goto L5b
                                L12:
                                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                                    r0.<init>(r1)
                                    throw r0
                                L1a:
                                    kotlin.ResultKt.b(r14)
                                    r0 = r14
                                    goto L2f
                                L1f:
                                    kotlin.ResultKt.b(r14)
                                    Ji.M r0 = r13.f103316b
                                    r13.f103315a = r2
                                    r3 = 0
                                    r4 = 0
                                    java.lang.Object r0 = Ji.LocalThemeScope.g(r0, r3, r13, r2, r4)
                                    if (r0 != r12) goto L2f
                                    goto L5a
                                L2f:
                                    Gi.i r0 = (Gi.i) r0
                                    com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity r2 = r13.f103317c
                                    ko.c r3 = r13.f103318d
                                    ko.c$d r3 = (ko.AbstractC15202c.ShowErrorToast) r3
                                    int r3 = r3.getMessageResId()
                                    java.lang.String r2 = r2.getString(r3)
                                    java.lang.String r3 = "getString(...)"
                                    kotlin.jvm.internal.Intrinsics.i(r2, r3)
                                    Gi.e r3 = Gi.e.f11482b
                                    ji.q1$m$a$b r5 = ji.q1.m.a.b.f140113a
                                    r13.f103315a = r1
                                    r1 = r2
                                    r2 = 0
                                    r4 = 0
                                    r6 = 0
                                    r7 = 0
                                    r8 = 0
                                    r10 = 226(0xe2, float:3.17E-43)
                                    r11 = 0
                                    r9 = r13
                                    java.lang.Object r0 = Gi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                                    if (r0 != r12) goto L5b
                                L5a:
                                    return r12
                                L5b:
                                    kotlin.Unit r0 = kotlin.Unit.f142422a
                                    return r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity.b.a.c.C1468a.C1469a.C1470a.invokeSuspend(java.lang.Object):java.lang.Object");
                            }
                        }

                        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity$onCreate$1$1$3$1$1$1$2", f = "MperksInCartActivity.kt", l = {277, 277}, m = "invokeSuspend")
                        /* renamed from: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity$b$a$c$a$a$b, reason: collision with other inner class name */
                        static final class C1471b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                            /* renamed from: a, reason: collision with root package name */
                            int f103319a;

                            /* renamed from: b, reason: collision with root package name */
                            final /* synthetic */ LocalThemeScope f103320b;

                            /* renamed from: c, reason: collision with root package name */
                            final /* synthetic */ MperksInCartActivity f103321c;

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new C1471b(this.f103320b, this.f103321c, continuation);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C1471b(LocalThemeScope localThemeScope, MperksInCartActivity mperksInCartActivity, Continuation<? super C1471b> continuation) {
                                super(2, continuation);
                                this.f103320b = localThemeScope;
                                this.f103321c = mperksInCartActivity;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                                return ((C1471b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
                            
                                if (Gi.i.i((Gi.i) r0, r2, null, r3, false, r5, null, null, null, r13, 224, null) == r12) goto L15;
                             */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                                /*
                                    r13 = this;
                                    java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                                    int r0 = r13.f103319a
                                    r1 = 2
                                    r2 = 1
                                    if (r0 == 0) goto L1f
                                    if (r0 == r2) goto L1a
                                    if (r0 != r1) goto L12
                                    kotlin.ResultKt.b(r14)
                                    goto L55
                                L12:
                                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                                    r0.<init>(r1)
                                    throw r0
                                L1a:
                                    kotlin.ResultKt.b(r14)
                                    r0 = r14
                                    goto L2f
                                L1f:
                                    kotlin.ResultKt.b(r14)
                                    Ji.M r0 = r13.f103320b
                                    r13.f103319a = r2
                                    r3 = 0
                                    r4 = 0
                                    java.lang.Object r0 = Ji.LocalThemeScope.g(r0, r3, r13, r2, r4)
                                    if (r0 != r12) goto L2f
                                    goto L54
                                L2f:
                                    Gi.i r0 = (Gi.i) r0
                                    com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity r2 = r13.f103321c
                                    int r3 = com.meijer.mobile.mperks.ux.j0.f114143M
                                    java.lang.String r2 = r2.getString(r3)
                                    java.lang.String r3 = "getString(...)"
                                    kotlin.jvm.internal.Intrinsics.i(r2, r3)
                                    Gi.e r3 = Gi.e.f11482b
                                    ji.q1$m$a$d r5 = ji.q1.m.a.d.f140117a
                                    r13.f103319a = r1
                                    r1 = r2
                                    r2 = 0
                                    r4 = 0
                                    r6 = 0
                                    r7 = 0
                                    r8 = 0
                                    r10 = 224(0xe0, float:3.14E-43)
                                    r11 = 0
                                    r9 = r13
                                    java.lang.Object r0 = Gi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                                    if (r0 != r12) goto L55
                                L54:
                                    return r12
                                L55:
                                    kotlin.Unit r0 = kotlin.Unit.f142422a
                                    return r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity.b.a.c.C1468a.C1469a.C1471b.invokeSuspend(java.lang.Object):java.lang.Object");
                            }
                        }

                        C1469a(InterfaceC16622O interfaceC16622O, MperksInCartActivity mperksInCartActivity, LocalThemeScope localThemeScope) {
                            this.f103312a = interfaceC16622O;
                            this.f103313b = mperksInCartActivity;
                            this.f103314c = localThemeScope;
                        }

                        @Override // tv.InterfaceC17153g
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Object emit(AbstractC15202c abstractC15202c, Continuation<? super Unit> continuation) {
                            if (abstractC15202c instanceof AbstractC15202c.ShowErrorToast) {
                                C16648k.d(this.f103312a, null, null, new C1470a(this.f103314c, this.f103313b, abstractC15202c, null), 3, null);
                            } else if (abstractC15202c instanceof AbstractC15202c.ShowClaimSuccessToast) {
                                this.f103313b.G1().E(G.c.b.f103228a);
                                C16648k.d(this.f103312a, null, null, new C1471b(this.f103314c, this.f103313b, null), 3, null);
                            } else {
                                Unit unit = Unit.f142422a;
                            }
                            return Unit.f142422a;
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C1468a(this.f103309b, this.f103310c, this.f103311d, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1468a(MperksInCartActivity mperksInCartActivity, InterfaceC16622O interfaceC16622O, LocalThemeScope localThemeScope, Continuation<? super C1468a> continuation) {
                        super(2, continuation);
                        this.f103309b = mperksInCartActivity;
                        this.f103310c = interfaceC16622O;
                        this.f103311d = localThemeScope;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((C1468a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f103308a;
                        if (i10 != 0) {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.b(obj);
                        } else {
                            ResultKt.b(obj);
                            InterfaceC17144F<AbstractC15202c> interfaceC17144FB = this.f103309b.F1().B();
                            C1469a c1469a = new C1469a(this.f103310c, this.f103309b, this.f103311d);
                            this.f103308a = 1;
                            if (interfaceC17144FB.collect(c1469a, this) == objF) {
                                return objF;
                            }
                        }
                        throw new KotlinNothingValueException();
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new c(this.f103305b, this.f103306c, this.f103307d, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(MperksInCartActivity mperksInCartActivity, InterfaceC16622O interfaceC16622O, LocalThemeScope localThemeScope, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f103305b = mperksInCartActivity;
                    this.f103306c = interfaceC16622O;
                    this.f103307d = localThemeScope;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f103304a == 0) {
                        ResultKt.b(obj);
                        C16648k.d(C6031t.a(this.f103305b), null, null, new C1468a(this.f103305b, this.f103306c, this.f103307d, null), 3, null);
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            a(MperksInCartActivity mperksInCartActivity, int i10) {
                this.f103269a = mperksInCartActivity;
                this.f103270b = i10;
            }

            /* JADX WARN: Removed duplicated region for block: B:43:0x015d  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0163  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x017b  */
            /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void c(Ji.LocalThemeScope r28, androidx.compose.runtime.Composer r29, int r30) {
                /*
                    Method dump skipped, instructions count: 383
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity.b.a.c(Ji.M, androidx.compose.runtime.Composer, int):void");
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                c(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final HighValuePromoSelectionsViewState d(z1<HighValuePromoSelectionsViewState> z1Var) {
                return z1Var.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ClaimTabState e(z1<ClaimTabState> z1Var) {
                return z1Var.getValue();
            }
        }

        b(int i10) {
            this.f103268b = i10;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1099626615, i10, -1, "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity.onCreate.<anonymous> (MperksInCartActivity.kt:94)");
            }
            K.b(null, ComposableLambdaKt.c(2063732826, true, new a(MperksInCartActivity.this, this.f103268b), composer, 54), composer, 48, 1);
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
    public static final class c extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f103322f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f103322f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f103322f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f103323f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f103323f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f103323f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f103324f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f103325g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f103324f = function0;
            this.f103325g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f103324f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f103325g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f103326f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f103326f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f103326f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f103327f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f103327f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f103327f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f103328f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f103329g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f103328f = function0;
            this.f103329g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f103328f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f103329g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ko.z F1() {
        return (ko.z) this.claimTabViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final G G1() {
        return (G) this.mperksInCartViewModel.getValue();
    }

    @Override // com.meijer.mobile.meijer.activity.checkout.payment.u0
    public void W(boolean save) {
        SaveChangesDialogFragment saveChangesDialogFragment = this.saveChangesDialogFragment;
        if (saveChangesDialogFragment == null) {
            Intrinsics.y("saveChangesDialogFragment");
            saveChangesDialogFragment = null;
        }
        saveChangesDialogFragment.dismiss();
        if (save) {
            G1().E(G.c.a.f103227a);
        } else {
            finish();
        }
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().a(G1());
        G1().H(getIntent().getIntExtra("com.meijer.mobile.meijer.activity.checkout.highValuePromoSelections.HighValuePromoSelectionsActivity.MPERKS_POINTS", 0));
        int intExtra = getIntent().getIntExtra("com.meijer.mobile.meijer.activity.checkout.highValuePromoSelections.HighValuePromoSelectionsActivity.EXTRA_APPLIED_OFFERS", 0);
        G1().E(new G.c.SetSourcePageAction(getIntent().getBooleanExtra("com.meijer.mobile.meijer.activity.checkout.highValuePromoSelections.HighValuePromoSelectionsActivity.IS_FROM_DIALOG", false)));
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1099626615, true, new b(intExtra)), 1, null);
    }
}
