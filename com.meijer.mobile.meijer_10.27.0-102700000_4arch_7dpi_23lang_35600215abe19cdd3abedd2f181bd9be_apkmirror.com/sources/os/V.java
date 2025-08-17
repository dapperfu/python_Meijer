package os;

import Ji.C;
import Ji.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5726j0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import bo.ClaimReward;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import java.util.List;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15343c;
import os.V;
import p1.C16193g;
import pi.C16307b;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aª\u0001\u0010\u0014\u001a\u00020\b*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0019²\u0006\u000e\u0010\u0016\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "Lbo/b;", "availableRewards", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "reward", "", "onRewardClicked", "", "rewardId", "onClaimRewardClicked", "Lkotlin/Function0;", "onViewAllClicked", "", "pointBalance", "Landroidx/compose/ui/Modifier;", "modifier", "onClaimForButtonClicked", "c", "(LJi/M;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "selectedItem", "", "lastAction", "mperks_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class V {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function1<Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5726j0 f155068a;

        a(InterfaceC5726j0 interfaceC5726j0) {
            this.f155068a = interfaceC5726j0;
        }

        public final void a(int i10) {
            V.f(this.f155068a, i10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function1<Long, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Long, Unit> f155069a;

        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super Long, Unit> function1) {
            this.f155069a = function1;
        }

        public final void a(long j10) {
            this.f155069a.invoke(Long.valueOf(j10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
            a(l10.longValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function1<ClaimReward, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<ClaimReward, Unit> f155070a;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super ClaimReward, Unit> function1) {
            this.f155070a = function1;
        }

        public final void a(ClaimReward it) {
            Intrinsics.j(it, "it");
            this.f155070a.invoke(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ClaimReward claimReward) {
            a(claimReward);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function1<ClaimReward, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<ClaimReward, Unit> f155071a;

        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super ClaimReward, Unit> function1) {
            this.f155071a = function1;
        }

        public final void a(ClaimReward it) {
            Intrinsics.j(it, "it");
            this.f155071a.invoke(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ClaimReward claimReward) {
            a(claimReward);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155072a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f155073b;

        e(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f155072a = localThemeScope;
            this.f155073b = function0;
        }

        public final void b(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1300956568, i10, -1, "com.meijer.mobile.ui.mperks.homescreen.ClaimMperksCarousel.<anonymous>.<anonymous>.<anonymous> (HomeScreenRedeemRewardsCarousel.kt:89)");
            }
            LocalThemeScope localThemeScope = this.f155072a;
            final Function0<Unit> function0 = this.f155073b;
            Modifier.Companion companion = Modifier.INSTANCE;
            C5658d c5658d = C5658d.f48555a;
            C5658d.e eVarG = c5658d.g();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(eVarG, companion2.l(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyB, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            C14802K.a(androidx.compose.foundation.layout.J.z(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.z(androidx.compose.foundation.layout.J.d(companion, 0.0f, 1, null), H1.h.p(190)), localThemeScope.getAdsSpacing().getThree().getDp());
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(function0);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: os.W
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return V.e.c(function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Modifier modifierD = ClickableKt.d(modifierI, false, null, null, (Function0) objB, 7, null);
            MeasurePolicy measurePolicyA = C5665k.a(c5658d.b(), companion2.g(), composer, 54);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierD);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyA, companion3.e());
            D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.g.d.f15455e, null, null, null, 0.0f, null, null, 126, null);
            int i11 = LocalThemeScope.f15770g;
            C16307b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f140067h << 3), 6);
            ri.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(companion, 0.0f, localThemeScope.getAdsSpacing().getTwo().getDp(), 0.0f, 0.0f, 13, null), localThemeScope.getAdsColors().getAdsColorText03(), null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 372, null), C16193g.c(ns.u.f152710Z, composer, 0), null, composer, i11 | (q1.Label.f140080j << 3), 4);
            composer.v();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            b(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final f f155074f = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(ClaimReward claimReward) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f155075f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f155076g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function1 function1, List list) {
            super(1);
            this.f155075f = function1;
            this.f155076g = list;
        }

        public final Object a(int i10) {
            return this.f155075f.invoke(this.f155076g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class h extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f155077f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f155078g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155079h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f155080i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1 f155081j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1 f155082k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1 f155083l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC5726j0 f155084m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List list, List list2, LocalThemeScope localThemeScope, int i10, Function1 function1, Function1 function12, Function1 function13, InterfaceC5726j0 interfaceC5726j0) {
            super(4);
            this.f155077f = list;
            this.f155078g = list2;
            this.f155079h = localThemeScope;
            this.f155080i = i10;
            this.f155081j = function1;
            this.f155082k = function12;
            this.f155083l = function13;
            this.f155084m = interfaceC5726j0;
        }

        public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = i11 | (composer.V(interfaceC15343c) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.d(i10) ? 32 : 16;
            }
            if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            ClaimReward claimReward = (ClaimReward) this.f155077f.get(i10);
            composer.startReplaceGroup(-1533243246);
            int iIndexOf = this.f155078g.indexOf(claimReward);
            boolean z10 = iIndexOf == V.d(this.f155084m);
            LocalThemeScope localThemeScope = this.f155079h;
            int i13 = this.f155080i;
            composer.startReplaceGroup(5004770);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new a(this.f155084m);
                composer.t(objB);
            }
            Function1 function1 = (Function1) objB;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f155081j);
            Object objB2 = composer.B();
            if (zV || objB2 == companion.a()) {
                objB2 = new b(this.f155081j);
                composer.t(objB2);
            }
            Function1 function12 = (Function1) objB2;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f155082k);
            Object objB3 = composer.B();
            if (zV2 || objB3 == companion.a()) {
                objB3 = new c(this.f155082k);
                composer.t(objB3);
            }
            Function1 function13 = (Function1) objB3;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV3 = composer.V(this.f155083l);
            Object objB4 = composer.B();
            if (zV3 || objB4 == companion.a()) {
                objB4 = new d(this.f155083l);
                composer.t(objB4);
            }
            composer.P();
            S.p(localThemeScope, claimReward, i13, z10, iIndexOf, null, function1, function12, function13, (Function1) objB4, composer, LocalThemeScope.f15770g | 1572864, 16);
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15343c, num.intValue(), composer, num2.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ji.LocalThemeScope r23, final java.util.List<bo.ClaimReward> r24, final kotlin.jvm.functions.Function1<? super bo.ClaimReward, kotlin.Unit> r25, final kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> r26, final kotlin.jvm.functions.Function0<kotlin.Unit> r27, final int r28, androidx.compose.ui.Modifier r29, final kotlin.jvm.functions.Function1<? super bo.ClaimReward, kotlin.Unit> r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os.V.c(Ji.M, java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, int, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, List list, Function1 function1, Function1 function12, Function0 function0, int i10, Modifier modifier, Function1 function13, int i11, int i12, Composer composer, int i13) {
        c(localThemeScope, list, function1, function12, function0, i10, modifier, function13, composer, J0.a(i11 | 1), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(List list, LocalThemeScope localThemeScope, int i10, Function1 function1, Function1 function12, Function1 function13, InterfaceC5726j0 interfaceC5726j0, Function0 function0, l0.w LazyRow) {
        Intrinsics.j(LazyRow, "$this$LazyRow");
        List listB1 = CollectionsKt.b1(list, 5);
        LazyRow.i(listB1.size(), null, new g(f.f155074f, listB1), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new h(listB1, list, localThemeScope, i10, function1, function12, function13, interfaceC5726j0)));
        if (list.size() >= 5) {
            l0.w.g(LazyRow, null, null, ComposableLambdaKt.composableLambdaInstance(-1300956568, true, new e(localThemeScope, function0)), 3, null);
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(InterfaceC5726j0 interfaceC5726j0) {
        return interfaceC5726j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(InterfaceC5726j0 interfaceC5726j0, int i10) {
        interfaceC5726j0.j(i10);
    }
}
