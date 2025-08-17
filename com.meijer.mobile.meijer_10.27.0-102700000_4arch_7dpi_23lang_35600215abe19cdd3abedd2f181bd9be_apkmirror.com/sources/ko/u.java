package ko;

import Ji.LocalThemeScope;
import Ji.Q;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5726j0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.recyclerview.widget.RecyclerView;
import bo.AutoClaimReward;
import bo.ClaimReward;
import bo.EnumC6273c;
import bo.g;
import bo.h;
import com.meijer.mobile.mperks.ux.j0;
import j$.time.LocalDate;
import j0.C14815g;
import java.util.List;
import ji.InterfaceC14920X;
import ji.Q0;
import ji.q1;
import kotlin.C15430A;
import kotlin.C15442i;
import kotlin.C15444k;
import kotlin.C15452s;
import kotlin.C15454u;
import kotlin.C6327j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15343c;
import no.PointsExpState;
import p1.C16193g;
import qo.C16580n;
import vk.C17590a;
import yr.C18299z;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u008f\u0001\u0010\u0016\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u0010H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a¥\u0001\u0010\"\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00182\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u0010H\u0003¢\u0006\u0004\b\"\u0010#\u001a£\u0001\u0010%\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00182\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u0010H\u0007¢\u0006\u0004\b%\u0010&\u001a9\u0010'\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\u0010H\u0003¢\u0006\u0004\b'\u0010(\u001a\u001d\u0010)\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b)\u0010*¨\u0006.²\u0006\u000e\u0010+\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010-\u001a\u0004\u0018\u00010,8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020,8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010-\u001a\u0004\u0018\u00010,8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "mPerksPointBalance", "Lko/d;", "state", "Lno/d;", "pointsExpirationState", "Lbo/c;", "selectedClaimTabPill", "", "isDashboardSimplifiedUIEnabled", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onViewDisclaimersBottomSheetClick", "Lkotlin/Function1;", "onClaimTabPillClicked", "Lbo/g;", "onNavigationRequest", "Lbo/h;", "onResourceAction", "H", "(LJi/M;ILko/d;Lno/d;Lbo/c;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "", "Lbo/b;", "availableRewards", "Lbo/a;", "availableAutoClaimRewardList", "showBuyCouponAPILoading", "", "claimedCouponID", "isClaimCouponSuccess", "isRefreshRewardsList", "F", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/util/List;Ljava/util/List;ZJZZLbo/c;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "isFromCart", "q", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/util/List;Ljava/util/List;ZJZZZILbo/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "y", "(LJi/M;Landroidx/compose/ui/Modifier;Lbo/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "L", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "selectedItem", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class u {

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class a extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final a f142284f = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(AutoClaimReward autoClaimReward) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f142285f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f142286g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, List list) {
            super(1);
            this.f142285f = function1;
            this.f142286g = list;
        }

        public final Object a(int i10) {
            return this.f142285f.invoke(this.f142286g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f142287f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f142288g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function1 function1, List list) {
            super(1);
            this.f142287f = function1;
            this.f142288g = list;
        }

        public final Object a(int i10) {
            return this.f142287f.invoke(this.f142288g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class d extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f142289f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142290g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f142291h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f142292i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1 f142293j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, LocalThemeScope localThemeScope, boolean z10, Function1 function1, Function1 function12) {
            super(4);
            this.f142289f = list;
            this.f142290g = localThemeScope;
            this.f142291h = z10;
            this.f142292i = function1;
            this.f142293j = function12;
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
            AutoClaimReward autoClaimReward = (AutoClaimReward) this.f142289f.get(i10);
            composer.startReplaceGroup(1840223634);
            com.meijer.mobile.mperks.ux.claim.autoClaim.i.o(this.f142290g, autoClaimReward, this.f142291h, C18299z.f(D.j(InterfaceC15343c.a(interfaceC15343c, J.h(J.D(Modifier.INSTANCE, null, false, 3, null), 0.0f, 1, null), null, C6327j.l(1000, 0, null, 6, null), null, 5, null), this.f142290g.getAdsSpacing().getFive().getDp(), this.f142290g.getAdsSpacing().getThree().getDp()), "autoClaimReward", null, 2, null), this.f142292i, this.f142293j, composer, LocalThemeScope.f15770g, 0);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142294a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f142295a;

            a(LocalThemeScope localThemeScope) {
                this.f142295a = localThemeScope;
            }

            public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(1505957191, i10, -1, "com.meijer.mobile.mperks.ux.claim.RewardsRefreshingView.<anonymous>.<anonymous> (ClaimTabView.kt:343)");
                }
                q1.k.LargeV2 largeLoadingV2 = Assemble.getLoading().getLargeLoadingV2();
                Bi.o oVar = Bi.o.f2584a;
                Bi.m.e(this.f142295a, D.m(J.f(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, this.f142295a.getAdsSpacing().getNine().getDp(), 0.0f, this.f142295a.getAdsSpacing().getSix().getDp(), 5, null), largeLoadingV2, oVar, C16193g.c(j0.f114163S1, composer, 0), C16193g.c(j0.f114132I0, composer, 0), null, composer, LocalThemeScope.f15770g | 3072 | (q1.k.LargeV2.f140096f << 6), 32);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14920X interfaceC14920X, Composer composer, Integer num) {
                a(interfaceC14920X, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        e(LocalThemeScope localThemeScope) {
            this.f142294a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1601363946, i10, -1, "com.meijer.mobile.mperks.ux.claim.RewardsRefreshingView.<anonymous> (ClaimTabView.kt:342)");
            }
            LocalThemeScope localThemeScope = this.f142294a;
            Q.e(localThemeScope, Q0.b.f139711a, ComposableLambdaKt.c(1505957191, true, new a(localThemeScope), composer, 54), composer, LocalThemeScope.f15770g | 384 | (Q0.b.f139712b << 3));
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

    /* JADX WARN: Removed duplicated region for block: B:102:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void F(final Ji.LocalThemeScope r29, androidx.compose.ui.Modifier r30, final java.util.List<bo.ClaimReward> r31, final java.util.List<bo.AutoClaimReward> r32, final boolean r33, final long r34, final boolean r36, final boolean r37, final bo.EnumC6273c r38, final int r39, final kotlin.jvm.functions.Function1<? super bo.g, kotlin.Unit> r40, final kotlin.jvm.functions.Function1<? super bo.EnumC6273c, kotlin.Unit> r41, final kotlin.jvm.functions.Function1<? super bo.h, kotlin.Unit> r42, androidx.compose.runtime.Composer r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ko.u.F(Ji.M, androidx.compose.ui.Modifier, java.util.List, java.util.List, boolean, long, boolean, boolean, bo.c, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void H(final LocalThemeScope localThemeScope, final int i10, final ClaimTabState state, final PointsExpState pointsExpirationState, final EnumC6273c selectedClaimTabPill, final boolean z10, Modifier modifier, final Function0<Unit> onViewDisclaimersBottomSheetClick, final Function1<? super EnumC6273c, Unit> onClaimTabPillClicked, final Function1<? super bo.g, Unit> onNavigationRequest, final Function1<? super bo.h, Unit> onResourceAction, Composer composer, final int i11, final int i12, final int i13) {
        int i14;
        Modifier modifier2;
        int i15;
        int i16;
        int i17;
        LocalThemeScope localThemeScope2;
        Modifier modifier3;
        int i18;
        final Modifier modifier4;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(state, "state");
        Intrinsics.j(pointsExpirationState, "pointsExpirationState");
        Intrinsics.j(selectedClaimTabPill, "selectedClaimTabPill");
        Intrinsics.j(onViewDisclaimersBottomSheetClick, "onViewDisclaimersBottomSheetClick");
        Intrinsics.j(onClaimTabPillClicked, "onClaimTabPillClicked");
        Intrinsics.j(onNavigationRequest, "onNavigationRequest");
        Intrinsics.j(onResourceAction, "onResourceAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(434797247);
        if ((Integer.MIN_VALUE & i13) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = ((i11 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i13 & 1) != 0) {
            i14 |= 48;
        } else if ((i11 & 48) == 0) {
            i14 |= composerStartRestartGroup.d(i10) ? 32 : 16;
        }
        if ((i13 & 2) != 0) {
            i14 |= 384;
        } else if ((i11 & 384) == 0) {
            i14 |= composerStartRestartGroup.V(state) ? 256 : 128;
        }
        if ((i13 & 4) != 0) {
            i14 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i14 |= composerStartRestartGroup.D(pointsExpirationState) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i13 & 8) != 0) {
            i14 |= 24576;
        } else if ((i11 & 24576) == 0) {
            i14 |= composerStartRestartGroup.d(selectedClaimTabPill.ordinal()) ? 16384 : 8192;
        }
        if ((i13 & 16) != 0) {
            i14 |= 196608;
        } else if ((i11 & 196608) == 0) {
            i14 |= composerStartRestartGroup.a(z10) ? 131072 : 65536;
        }
        int i19 = i13 & 32;
        if (i19 != 0) {
            i14 |= 1572864;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i11 & 1572864) == 0) {
                i14 |= composerStartRestartGroup.V(modifier2) ? 1048576 : 524288;
            }
        }
        if ((i13 & 64) != 0) {
            i14 |= 12582912;
        } else if ((i11 & 12582912) == 0) {
            i14 |= composerStartRestartGroup.D(onViewDisclaimersBottomSheetClick) ? 8388608 : 4194304;
        }
        if ((i13 & 128) != 0) {
            i14 |= 100663296;
        } else if ((i11 & 100663296) == 0) {
            i14 |= composerStartRestartGroup.D(onClaimTabPillClicked) ? 67108864 : 33554432;
        }
        if ((i13 & 256) != 0) {
            i14 |= 805306368;
        } else if ((i11 & 805306368) == 0) {
            i14 |= composerStartRestartGroup.D(onNavigationRequest) ? 536870912 : 268435456;
        }
        int i20 = i14;
        if ((i13 & 512) != 0) {
            i15 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            i15 = i12 | (composerStartRestartGroup.D(onResourceAction) ? 4 : 2);
        } else {
            i15 = i12;
        }
        if ((i20 & 306783379) == 306783378 && (i15 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier4 = modifier2;
        } else {
            Modifier modifier5 = i19 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.M()) {
                ComposerKt.U(434797247, i20, i15, "com.meijer.mobile.mperks.ux.claim.ClaimTabView (ClaimTabView.kt:81)");
            }
            Modifier modifierD = androidx.compose.foundation.b.d(J.f(modifier5, 0.0f, 1, null), localThemeScope.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null);
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierD);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            Modifier modifier6 = modifier5;
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14815g c14815g = C14815g.f139108a;
            composerStartRestartGroup.startReplaceGroup(-2011106225);
            if (pointsExpirationState.getShowPointExpiryBanner()) {
                int pointsExpiringSoon = pointsExpirationState.getPointsExpiringSoon();
                LocalDate pointsExpiryDate = pointsExpirationState.getPointsExpiryDate();
                String str = pointsExpiryDate != null ? pointsExpiryDate.format(C17590a.DATE_SLASHES_SHORT) : null;
                if (str == null) {
                    str = "";
                }
                i16 = i15;
                i17 = 4;
                C15452s.b(localThemeScope, pointsExpiringSoon, str, androidx.compose.foundation.b.d(Modifier.INSTANCE, localThemeScope.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null), composerStartRestartGroup, LocalThemeScope.f15770g | (i20 & 14), 0);
            } else {
                i16 = i15;
                i17 = 4;
            }
            composerStartRestartGroup.P();
            if (state.getIsAvailableRewardsLoading() || state.getIsAutoClaimLoading()) {
                localThemeScope2 = localThemeScope;
                composerStartRestartGroup.startReplaceGroup(2080703291);
                modifier3 = null;
                i18 = 1;
                C15442i.b(localThemeScope2, null, composerStartRestartGroup, LocalThemeScope.f15770g | (i20 & 14), 1);
                composerStartRestartGroup.P();
            } else {
                if (state.getIsRedeemRewardAPIFailed()) {
                    composerStartRestartGroup.startReplaceGroup(2080810303);
                    int i21 = z10 ? j0.f114162S0 : j0.f114159R0;
                    int i22 = LocalThemeScope.f15770g | (i20 & 14) | ((i20 >> 6) & 7168);
                    localThemeScope2 = localThemeScope;
                    C15444k.b(localThemeScope2, null, i21, z10, composerStartRestartGroup, i22, 1);
                    composerStartRestartGroup.P();
                } else if (state.d().isEmpty() && state.c().isEmpty()) {
                    composerStartRestartGroup.startReplaceGroup(2081299142);
                    int i23 = z10 ? j0.f114162S0 : j0.f114203e1;
                    int i24 = LocalThemeScope.f15770g | (i20 & 14) | ((i20 >> 6) & 7168);
                    localThemeScope2 = localThemeScope;
                    C15444k.b(localThemeScope2, null, i23, z10, composerStartRestartGroup, i24, 1);
                    composerStartRestartGroup.P();
                } else {
                    composerStartRestartGroup.startReplaceGroup(2081726508);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean z11 = (i16 & 14) == i17;
                    Object objB = composerStartRestartGroup.B();
                    if (z11 || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: ko.q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return u.I(onResourceAction);
                            }
                        };
                        composerStartRestartGroup.t(objB);
                    }
                    composerStartRestartGroup.P();
                    androidx.compose.runtime.J.i((Function0) objB, composerStartRestartGroup, 0);
                    List<ClaimReward> listD = state.d();
                    boolean isLoading = state.getOnBuyCouponIsLoading().getIsLoading();
                    Long couponID = state.getOnBuyCouponIsLoading().getCouponID();
                    long jLongValue = couponID != null ? couponID.longValue() : 0L;
                    boolean isBuyCouponSuccess = state.getIsBuyCouponSuccess();
                    int i25 = i16;
                    boolean refreshPointsAndRewards = state.getRefreshPointsAndRewards();
                    List<AutoClaimReward> listC = state.c();
                    int i26 = LocalThemeScope.f15770g | (i20 & 14) | ((i20 << 12) & 234881024) | ((i20 << 24) & 1879048192);
                    int i27 = ((i20 >> 27) & 14) | ((i20 >> 21) & 112) | ((i25 << 6) & 896);
                    localThemeScope2 = localThemeScope;
                    F(localThemeScope2, null, listD, listC, isLoading, jLongValue, isBuyCouponSuccess, refreshPointsAndRewards, selectedClaimTabPill, i10, onNavigationRequest, onClaimTabPillClicked, onResourceAction, composerStartRestartGroup, i26, i27, 1);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.P();
                }
                modifier3 = null;
                i18 = 1;
            }
            int i28 = LocalThemeScope.f15770g;
            int i29 = i20 & 14;
            C16580n.m(localThemeScope2, modifier3, composerStartRestartGroup, i28 | i29, i18);
            int i30 = i28 | i29 | ((i20 >> 15) & 896);
            Composer composer2 = composerStartRestartGroup;
            C15430A.c(localThemeScope2, null, onViewDisclaimersBottomSheetClick, composer2, i30, 1);
            composerStartRestartGroup = composer2;
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i20 & 1879048192) != 536870912) {
                i18 = 0;
            }
            Object objB2 = composerStartRestartGroup.B();
            if (i18 != 0 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: ko.r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return u.J(onNavigationRequest);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            C15454u.b((Function0) objB2, composerStartRestartGroup, 0);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier4 = modifier6;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: ko.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return u.K(localThemeScope, i10, state, pointsExpirationState, selectedClaimTabPill, z10, modifier4, onViewDisclaimersBottomSheetClick, onClaimTabPillClicked, onNavigationRequest, onResourceAction, i11, i12, i13, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:298:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0117  */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(final Ji.LocalThemeScope r33, androidx.compose.ui.Modifier r34, final java.util.List<bo.ClaimReward> r35, java.util.List<bo.AutoClaimReward> r36, final boolean r37, final long r38, final boolean r40, final boolean r41, boolean r42, final int r43, bo.EnumC6273c r44, kotlin.jvm.functions.Function1<? super bo.g, kotlin.Unit> r45, final kotlin.jvm.functions.Function1<? super bo.h, kotlin.Unit> r46, androidx.compose.runtime.Composer r47, final int r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 1554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ko.u.q(Ji.M, androidx.compose.ui.Modifier, java.util.List, java.util.List, boolean, long, boolean, boolean, boolean, int, bo.c, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(Function1 function1) {
        function1.invoke(EnumC6273c.f60500b);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(Function1 function1) {
        function1.invoke(EnumC6273c.f60501c);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(Function1 function1) {
        function1.invoke(EnumC6273c.f60502d);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(Function1 function1) {
        function1.invoke(EnumC6273c.f60503e);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(LocalThemeScope localThemeScope, Modifier modifier, EnumC6273c enumC6273c, Function1 function1, int i10, int i11, Composer composer, int i12) {
        y(localThemeScope, modifier, enumC6273c, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(LocalThemeScope localThemeScope, Modifier modifier, List list, List list2, boolean z10, long j10, boolean z11, boolean z12, EnumC6273c enumC6273c, int i10, Function1 function1, Function1 function12, Function1 function13, int i11, int i12, int i13, Composer composer, int i14) {
        F(localThemeScope, modifier, list, list2, z10, j10, z11, z12, enumC6273c, i10, function1, function12, function13, composer, J0.a(i11 | 1), J0.a(i12), i13);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(Function1 function1) {
        function1.invoke(h.m.f60578a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(Function1 function1) {
        function1.invoke(g.m.f60556a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(LocalThemeScope localThemeScope, int i10, ClaimTabState claimTabState, PointsExpState pointsExpState, EnumC6273c enumC6273c, boolean z10, Modifier modifier, Function0 function0, Function1 function1, Function1 function12, Function1 function13, int i11, int i12, int i13, Composer composer, int i14) {
        H(localThemeScope, i10, claimTabState, pointsExpState, enumC6273c, z10, modifier, function0, function1, function12, function13, composer, J0.a(i11 | 1), J0.a(i12), i13);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void L(final Ji.LocalThemeScope r16, androidx.compose.ui.Modifier r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            r0 = r16
            r1 = r19
            r2 = r20
            r3 = -38772199(0xfffffffffdb06219, float:-2.9306685E37)
            r4 = r18
            androidx.compose.runtime.Composer r13 = r4.startRestartGroup(r3)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r2
            if (r4 == 0) goto L17
            r4 = r1 | 6
            goto L30
        L17:
            r4 = r1 & 6
            if (r4 != 0) goto L2f
            r4 = r1 & 8
            if (r4 != 0) goto L24
            boolean r4 = r13.V(r0)
            goto L28
        L24:
            boolean r4 = r13.D(r0)
        L28:
            if (r4 == 0) goto L2c
            r4 = 4
            goto L2d
        L2c:
            r4 = 2
        L2d:
            r4 = r4 | r1
            goto L30
        L2f:
            r4 = r1
        L30:
            r5 = r2 & 1
            if (r5 == 0) goto L39
            r4 = r4 | 48
        L36:
            r6 = r17
            goto L4b
        L39:
            r6 = r1 & 48
            if (r6 != 0) goto L36
            r6 = r17
            boolean r7 = r13.V(r6)
            if (r7 == 0) goto L48
            r7 = 32
            goto L4a
        L48:
            r7 = 16
        L4a:
            r4 = r4 | r7
        L4b:
            r7 = r4 & 19
            r8 = 18
            if (r7 != r8) goto L5d
            boolean r7 = r13.j()
            if (r7 != 0) goto L58
            goto L5d
        L58:
            r13.K()
            r4 = r6
            goto Lb2
        L5d:
            if (r5 == 0) goto L62
            androidx.compose.ui.Modifier$a r5 = androidx.compose.ui.Modifier.INSTANCE
            goto L63
        L62:
            r5 = r6
        L63:
            boolean r6 = androidx.compose.runtime.ComposerKt.M()
            if (r6 == 0) goto L6f
            r6 = -1
            java.lang.String r7 = "com.meijer.mobile.mperks.ux.claim.RewardsRefreshingView (ClaimTabView.kt:336)"
            androidx.compose.runtime.ComposerKt.U(r3, r4, r6, r7)
        L6f:
            Ji.E r3 = r0.getAdsSpacing()
            Ji.V r3 = r3.getOne()
            float r11 = r3.getDp()
            r3 = 10
            float r3 = (float) r3
            float r3 = H1.h.p(r3)
            r0.h r3 = r0.C16692i.c(r3)
            ko.u$e r6 = new ko.u$e
            r6.<init>(r0)
            r7 = 54
            r8 = -1601363946(0xffffffffa08d2016, float:-2.3907562E-19)
            r9 = 1
            androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.c(r8, r9, r6, r13, r7)
            int r4 = r4 >> 3
            r4 = r4 & 14
            r6 = 1572864(0x180000, float:2.204052E-39)
            r14 = r4 | r6
            r15 = 28
            r6 = 0
            r8 = 0
            r10 = 0
            r4 = r5
            r5 = r3
            kotlin.C17985y.a(r4, r5, r6, r8, r10, r11, r12, r13, r14, r15)
            boolean r3 = androidx.compose.runtime.ComposerKt.M()
            if (r3 == 0) goto Lb2
            androidx.compose.runtime.ComposerKt.T()
        Lb2:
            androidx.compose.runtime.T0 r3 = r13.l()
            if (r3 == 0) goto Lc0
            ko.o r5 = new ko.o
            r5.<init>()
            r3.a(r5)
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ko.u.L(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        L(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(bo.g it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(List list, LocalThemeScope localThemeScope, boolean z10, Function1 function1, Function1 function12, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        LazyColumn.i(list.size(), new b(new Function1() { // from class: ko.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.w((AutoClaimReward) obj);
            }
        }, list), new c(a.f142284f, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new d(list, localThemeScope, z10, function1, function12)));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object w(AutoClaimReward it) {
        Intrinsics.j(it, "it");
        return it.getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(LocalThemeScope localThemeScope, Modifier modifier, List list, List list2, boolean z10, long j10, boolean z11, boolean z12, boolean z13, int i10, EnumC6273c enumC6273c, Function1 function1, Function1 function12, int i11, int i12, int i13, Composer composer, int i14) {
        q(localThemeScope, modifier, list, list2, z10, j10, z11, z12, z13, i10, enumC6273c, function1, function12, composer, J0.a(i11 | 1), J0.a(i12), i13);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void y(final Ji.LocalThemeScope r25, androidx.compose.ui.Modifier r26, final bo.EnumC6273c r27, final kotlin.jvm.functions.Function1<? super bo.EnumC6273c, kotlin.Unit> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ko.u.y(Ji.M, androidx.compose.ui.Modifier, bo.c, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(Function1 function1) {
        function1.invoke(EnumC6273c.f60499a);
        return Unit.f142422a;
    }

    private static final int s(InterfaceC5726j0 interfaceC5726j0) {
        return interfaceC5726j0.a();
    }

    private static final void t(InterfaceC5726j0 interfaceC5726j0, int i10) {
        interfaceC5726j0.j(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(InterfaceC5726j0 interfaceC5726j0, int i10) {
        t(interfaceC5726j0, i10);
        return Unit.f142422a;
    }
}
