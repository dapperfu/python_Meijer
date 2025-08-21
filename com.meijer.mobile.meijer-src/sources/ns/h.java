package ns;

import Ki.LocalThemeScope;
import P0.e;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c5.C6484c;
import co.AbstractC6536h;
import co.AbstractC6537i;
import co.ClaimReward;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.C14889J;
import j0.C14903g;
import ki.InterfaceC15154X;
import ki.q1;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15429A;
import m5.C15669h;
import mv.C15809k;
import mv.InterfaceC15783O;
import ns.h;
import p1.C16338g;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a«\u0001\u0010\u0018\u001a\u00020\u0012*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00120\u0011H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a7\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001d\u0010\u001d\u001a\u00020\u0012*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001d\u0010\u001f\u001a\u00020\u0012*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u001f\u0010\u001e¨\u0006#²\u0006\u000e\u0010 \u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\"\u001a\u00020!8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "index", "Lco/c;", "reward", "mPerksPointBalance", "", "isSelected", "showBuyCouponAPILoading", "", "claimedCouponID", "isClaimCouponSuccess", "isRefreshRewardsList", "isFromHomeScreen", "isFromCart", "Lkotlin/Function1;", "", "updateSelectedItemIndex", "Lco/h;", "onNavigationRequest", "Lco/i;", "onResourceAction", "e", "(LKi/M;Landroidx/compose/ui/Modifier;ILco/c;IZZJZZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "pointCost", "s", "(IIZZZ)Z", "j", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "l", "isConfirmingClaim", "", "lastAction", "mperks_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class h {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f153038a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f153039b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ClaimReward f153040c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f153041d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC6537i, Unit> f153042e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f153043f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f153044g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f153045h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f153046i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f153047j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f153048k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f153049l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ C15429A f153050m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f153051n;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.ui.mperks.ClaimRewardCardKt$ClaimRewardCard$2$4$1$1", f = "ClaimRewardCard.kt", l = {149}, m = "invokeSuspend")
        /* renamed from: ns.h$a$a, reason: collision with other inner class name */
        static final class C2369a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f153052a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C15429A f153053b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f153054c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2369a(C15429A c15429a, int i10, Continuation<? super C2369a> continuation) {
                super(2, continuation);
                this.f153053b = c15429a;
                this.f153054c = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2369a(this.f153053b, this.f153054c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C2369a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f153052a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C15429A c15429a = this.f153053b;
                    int i11 = this.f153054c;
                    this.f153052a = 1;
                    if (C15429A.l(c15429a, i11, 0, this, 2, null) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z10, LocalThemeScope localThemeScope, ClaimReward claimReward, int i10, Function1<? super AbstractC6537i, Unit> function1, boolean z11, long j10, boolean z12, boolean z13, Function1<? super Integer, Unit> function12, int i11, InterfaceC15783O interfaceC15783O, C15429A c15429a, InterfaceC5872l0<Boolean> interfaceC5872l0) {
            this.f153038a = z10;
            this.f153039b = localThemeScope;
            this.f153040c = claimReward;
            this.f153041d = i10;
            this.f153042e = function1;
            this.f153043f = z11;
            this.f153044g = j10;
            this.f153045h = z12;
            this.f153046i = z13;
            this.f153047j = function12;
            this.f153048k = i11;
            this.f153049l = interfaceC15783O;
            this.f153050m = c15429a;
            this.f153051n = interfaceC5872l0;
        }

        public final void d(Composer composer, int i10) throws Resources.NotFoundException {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1049236372, i10, -1, "com.meijer.mobile.ui.mperks.ClaimRewardCard.<anonymous> (ClaimRewardCard.kt:97)");
            }
            if (h.f(this.f153051n) && this.f153038a) {
                composer.startReplaceGroup(-971137063);
                LocalThemeScope localThemeScope = this.f153039b;
                boolean z10 = this.f153040c.getPointCost() <= this.f153041d;
                String strD = C16338g.d(u.f153181j, new Object[]{String.valueOf(this.f153040c.getPointCost())}, composer, 0);
                String strC = C16338g.c(u.f153163a, composer, 0);
                Modifier modifierH = J.h(Modifier.INSTANCE, 0.0f, 1, null);
                composer.startReplaceGroup(-1746271574);
                boolean zV = composer.V(this.f153042e) | composer.D(this.f153040c);
                final Function1<AbstractC6537i, Unit> function1 = this.f153042e;
                final ClaimReward claimReward = this.f153040c;
                final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f153051n;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: ns.e
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return h.a.e(function1, claimReward, interfaceC5872l0);
                        }
                    };
                    composer.t(objB);
                }
                Function0 function0 = (Function0) objB;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean zV2 = composer.V(this.f153042e) | composer.D(this.f153040c);
                final Function1<AbstractC6537i, Unit> function12 = this.f153042e;
                final ClaimReward claimReward2 = this.f153040c;
                final InterfaceC5872l0<Boolean> interfaceC5872l02 = this.f153051n;
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: ns.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return h.a.f(function12, claimReward2, interfaceC5872l02);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                y.b(localThemeScope, z10, strD, strC, modifierH, function0, (Function0) objB2, composer, LocalThemeScope.f17314g | 24576, 0);
                composer.P();
            } else {
                composer.startReplaceGroup(-969985723);
                if (this.f153043f && this.f153040c.getCouponId() == this.f153044g) {
                    composer.startReplaceGroup(-969966472);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierH2 = J.h(companion, 0.0f, 1, null);
                    e.b bVarG = P0.e.INSTANCE.g();
                    LocalThemeScope localThemeScope2 = this.f153039b;
                    MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), bVarG, composer, 48);
                    int iA = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH2);
                    InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                    Function0<InterfaceC5953g> function0A = companion2.a();
                    if (composer.k() == null) {
                        C5859f.c();
                    }
                    composer.F();
                    if (composer.getInserting()) {
                        composer.I(function0A);
                    } else {
                        composer.s();
                    }
                    Composer composerA = D1.a(composer);
                    D1.c(composerA, measurePolicyA, companion2.e());
                    D1.c(composerA, interfaceC5884sR, companion2.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                    if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion2.f());
                    C14903g c14903g = C14903g.f139698a;
                    h.j(localThemeScope2, J.H(D.k(companion, 0.0f, localThemeScope2.getAdsSpacing().getNine().getDp(), 1, null), null, false, 3, null), composer, LocalThemeScope.f17314g, 0);
                    composer.v();
                    composer.P();
                } else if (this.f153045h && this.f153040c.getCouponId() == this.f153044g) {
                    composer.startReplaceGroup(-969438015);
                    LocalThemeScope localThemeScope3 = this.f153039b;
                    h.l(localThemeScope3, J.h(D.k(Modifier.INSTANCE, 0.0f, localThemeScope3.getAdsSpacing().getNine().getDp(), 1, null), 0.0f, 1, null), composer, LocalThemeScope.f17314g, 0);
                    composer.P();
                } else {
                    composer.startReplaceGroup(-969152009);
                    Modifier modifierH3 = J.h(Modifier.INSTANCE, 0.0f, 1, null);
                    String strD2 = C16338g.d(u.f153175g, new Object[]{Integer.valueOf(this.f153040c.getPointCost())}, composer, 0);
                    boolean zS = h.s(this.f153040c.getPointCost(), this.f153041d, this.f153043f, this.f153045h, this.f153046i);
                    LocalThemeScope localThemeScope4 = this.f153039b;
                    composer.startReplaceGroup(-1224400529);
                    boolean zV3 = composer.V(this.f153047j) | composer.d(this.f153048k) | composer.D(this.f153049l) | composer.V(this.f153050m) | composer.V(this.f153042e) | composer.D(this.f153040c);
                    final Function1<Integer, Unit> function13 = this.f153047j;
                    final int i11 = this.f153048k;
                    final InterfaceC15783O interfaceC15783O = this.f153049l;
                    final Function1<AbstractC6537i, Unit> function14 = this.f153042e;
                    final ClaimReward claimReward3 = this.f153040c;
                    final InterfaceC5872l0<Boolean> interfaceC5872l03 = this.f153051n;
                    final C15429A c15429a = this.f153050m;
                    Object objB3 = composer.B();
                    if (zV3 || objB3 == Composer.INSTANCE.a()) {
                        Function0 function02 = new Function0() { // from class: ns.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return h.a.g(function13, i11, interfaceC15783O, function14, claimReward3, interfaceC5872l03, c15429a);
                            }
                        };
                        composer.t(function02);
                        objB3 = function02;
                    }
                    composer.P();
                    w.b(localThemeScope4, strD2, (Function0) objB3, zS, false, modifierH3, false, composer, LocalThemeScope.f17314g | 221184, 32);
                    composer.P();
                }
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            d(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function1 function1, ClaimReward claimReward, InterfaceC5872l0 interfaceC5872l0) {
            h.g(interfaceC5872l0, !h.f(interfaceC5872l0));
            function1.invoke(new AbstractC6537i.BuyReward(claimReward));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(Function1 function1, ClaimReward claimReward, InterfaceC5872l0 interfaceC5872l0) {
            h.g(interfaceC5872l0, !h.f(interfaceC5872l0));
            function1.invoke(new AbstractC6537i.TrackClaimRewardFromCart("mPerks:Cart Page:Cancel button", claimReward));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Function1 function1, int i10, InterfaceC15783O interfaceC15783O, Function1 function12, ClaimReward claimReward, InterfaceC5872l0 interfaceC5872l0, C15429A c15429a) {
            function1.invoke(Integer.valueOf(i10));
            h.g(interfaceC5872l0, !h.f(interfaceC5872l0));
            C15809k.d(interfaceC15783O, null, null, new C2369a(c15429a, i10, null), 3, null);
            function12.invoke(new AbstractC6537i.TrackClaimRewardFromCart("mPerks:Cart Page:Claim button", claimReward));
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f153055a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f153056b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f153057c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ClaimReward f153058d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f153059e;

        b(boolean z10, InterfaceC5872l0<Boolean> interfaceC5872l0, LocalThemeScope localThemeScope, ClaimReward claimReward, boolean z11) {
            this.f153055a = z10;
            this.f153056b = interfaceC5872l0;
            this.f153057c = localThemeScope;
            this.f153058d = claimReward;
            this.f153059e = z11;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1494773683, i10, -1, "com.meijer.mobile.ui.mperks.ClaimRewardCard.<anonymous> (ClaimRewardCard.kt:172)");
            }
            if (h.f(this.f153056b) && this.f153055a) {
                composer.startReplaceGroup(581929931);
                Modifier modifierH = J.h(Modifier.INSTANCE, 0.0f, 1, null);
                e.b bVarG = P0.e.INSTANCE.g();
                C5800d.f fVarB = C5800d.f48779a.b();
                LocalThemeScope localThemeScope = this.f153057c;
                ClaimReward claimReward = this.f153058d;
                MeasurePolicy measurePolicyA = C5807k.a(fVarB, bVarG, composer, 54);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
                InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion.e());
                D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion.f());
                C14903g c14903g = C14903g.f139698a;
                si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getThree(), null, 383, null), C16338g.d(u.f153177h, new Object[]{Integer.valueOf(claimReward.getPointCost())}, composer, 0), null, composer, (q1.Label.f142335j << 3) | LocalThemeScope.f17314g, 4);
                composer.v();
                composer.P();
            } else {
                composer.startReplaceGroup(582572375);
                C5800d c5800d = C5800d.f48779a;
                C5800d.e eVarG = c5800d.g();
                ClaimReward claimReward2 = this.f153058d;
                LocalThemeScope localThemeScope2 = this.f153057c;
                boolean z10 = this.f153059e;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                e.Companion companion3 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyB = G.b(eVarG, companion3.l(), composer, 6);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion2);
                InterfaceC5953g.Companion companion4 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A2 = companion4.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A2);
                } else {
                    composer.s();
                }
                Composer composerA2 = D1.a(composer);
                D1.c(composerA2, measurePolicyB, companion4.e());
                D1.c(composerA2, interfaceC5884sR2, companion4.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion4.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion4.f());
                C14889J c14889j = C14889J.f139620a;
                C6484c.e(new C15669h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())).f(claimReward2.getImageUrl()).p(s.f153128h).j(s.f153128h).c(), null, a5.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())), J.v(companion2, H1.h.p(63)), null, null, null, InterfaceC5926k.INSTANCE.a(), 0.0f, null, 0, false, null, composer, 12586032, 0, 8048);
                Modifier modifierH2 = J.h(D.k(companion2, localThemeScope2.getAdsSpacing().getFive().getDp(), 0.0f, 2, null), 0.0f, 1, null);
                MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.h(), companion3.k(), composer, 0);
                int iA3 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR3 = composer.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierH2);
                Function0<InterfaceC5953g> function0A3 = companion4.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A3);
                } else {
                    composer.s();
                }
                Composer composerA3 = D1.a(composer);
                D1.c(composerA3, measurePolicyA2, companion4.e());
                D1.c(composerA3, interfaceC5884sR3, companion4.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion4.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion4.f());
                C14903g c14903g2 = C14903g.f139698a;
                q1.Label label = new q1.Label(J.z(J.D(companion2, null, false, 3, null), H1.h.p(179)), null, null, null, 0, false, z10 ? 2 : Integer.MAX_VALUE, z10 ? localThemeScope2.getAdsTypography().getValues().getThree() : localThemeScope2.getAdsTypography().getValues().getTwo(), null, 318, null);
                String name = claimReward2.getName();
                if (name == null) {
                    name = "";
                }
                int i11 = LocalThemeScope.f17314g;
                int i12 = q1.Label.f142335j;
                si.j.h(localThemeScope2, label, name, null, composer, i11 | (i12 << 3), 4);
                si.j.h(localThemeScope2, new q1.Label(J.h(D.m(companion2, 0.0f, z10 ? localThemeScope2.getAdsSpacing().getTwo().getDp() : localThemeScope2.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null), 0.0f, 1, null), null, null, null, F1.t.INSTANCE.b(), false, z10 ? 3 : Integer.MAX_VALUE, localThemeScope2.getAdsTypography().getBody().getTwo(), null, HttpResponseStatus.REDIRECTION_FOUND, null), String.valueOf(claimReward2.getDescription()), null, composer, i11 | (i12 << 3), 4);
                composer.v();
                composer.v();
                composer.P();
            }
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f153060a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f153061b;

        c(Modifier modifier, LocalThemeScope localThemeScope) {
            this.f153060a = modifier;
            this.f153061b = localThemeScope;
        }

        public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-702364671, i10, -1, "com.meijer.mobile.ui.mperks.ClaimRewardLoading.<anonymous>.<anonymous> (ClaimRewardCard.kt:270)");
            }
            q1.k.Small smallLoading = Assemble.getLoading().getSmallLoading();
            Ci.o oVar = Ci.o.f4629a;
            Ci.m.f(this.f153061b, J.F(this.f153060a, null, false, 3, null), smallLoading, oVar, null, false, null, composer, LocalThemeScope.f17314g | 3072 | (q1.k.Small.f142357f << 6), 56);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
            a(interfaceC15154X, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:222:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final Ki.LocalThemeScope r35, androidx.compose.ui.Modifier r36, final int r37, final co.ClaimReward r38, final int r39, final boolean r40, final boolean r41, final long r42, final boolean r44, final boolean r45, final boolean r46, boolean r47, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r48, final kotlin.jvm.functions.Function1<? super co.AbstractC6536h, kotlin.Unit> r49, final kotlin.jvm.functions.Function1<? super co.AbstractC6537i, kotlin.Unit> r50, androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ns.h.e(Ki.M, androidx.compose.ui.Modifier, int, co.c, int, boolean, boolean, long, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, Modifier modifier, int i10, ClaimReward claimReward, int i11, boolean z10, boolean z11, long j10, boolean z12, boolean z13, boolean z14, boolean z15, Function1 function1, Function1 function12, Function1 function13, int i12, int i13, int i14, Composer composer, int i15) {
        e(localThemeScope, modifier, i10, claimReward, i11, z10, z11, j10, z12, z13, z14, z15, function1, function12, function13, composer, J0.a(i12 | 1), J0.a(i13), i14);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final Ki.LocalThemeScope r22, androidx.compose.ui.Modifier r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ns.h.j(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(Ki.LocalThemeScope r30, androidx.compose.ui.Modifier r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ns.h.l(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(int i10, int i11, boolean z10, boolean z11, boolean z12) {
        return (i10 > i11 || z10 || z11 || z12) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Function1 function1, int i10, Function1 function12, ClaimReward claimReward) {
        function1.invoke(Integer.valueOf(i10));
        function12.invoke(new AbstractC6536h.OnClaimRewardCardClicked(claimReward));
        return Unit.f143329a;
    }
}
