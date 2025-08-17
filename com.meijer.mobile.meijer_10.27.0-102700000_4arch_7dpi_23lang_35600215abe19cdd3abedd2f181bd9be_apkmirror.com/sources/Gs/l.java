package Gs;

import Gs.l;
import Ji.C;
import Ji.LocalThemeScope;
import Ok.Coupon;
import P0.e;
import Ps.e;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import java.util.ArrayList;
import java.util.List;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l5.C15372h;
import p1.C16193g;
import pi.C16307b;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aa\u0010\r\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001ac\u0010\u0015\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 ²\u0006\f\u0010\u001f\u001a\u00020\u001e8\nX\u008a\u0084\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "LPs/e$j;", "viewState", "Lkotlin/Function1;", "LPk/a;", "", "onCouponAction", "LPs/e$e;", "onAction", "LPs/e$i;", "onShoppingListAction", "f", "(LJi/M;Landroidx/compose/ui/Modifier;LPs/e$j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "relatedCouponCount", "LGs/m;", "", "", "relatedOfferIds", "d", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;LGs/m;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LOk/a;", "a", "LOk/a;", "mockCoupon", "b", "Ljava/util/List;", "couponsList", "Ll5/h$a;", "builder", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static final Coupon f11899a = new Coupon(12345678, false, false, null, null, false, false, "Buy 1, Get 2 Free", "when you buy TWO BOXES any flavor General Mills cereal listed: Cheerios™ • Cinnamon Toast Crunch™", null, null, null, null, false, false, null, null, "Void if altered, copied, sold, purchased, transferred, exchanged or where prohibited or restricted by law. ", false, null, null, null, null, null, false, false, "2017-10-07T23:59:00", null, null, false, 989724286, null);

    /* renamed from: b, reason: collision with root package name */
    private static List<Coupon> f11900b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f11901a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ WeeklyAdDetailsCouponState f11902b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Pk.a, Unit> f11903c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<e.AbstractC0675e, Unit> f11904d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List<Long> f11905e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f11906f;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, WeeklyAdDetailsCouponState weeklyAdDetailsCouponState, Function1<? super Pk.a, Unit> function1, Function1<? super e.AbstractC0675e, Unit> function12, List<Long> list, String str) {
            this.f11901a = localThemeScope;
            this.f11902b = weeklyAdDetailsCouponState;
            this.f11903c = function1;
            this.f11904d = function12;
            this.f11905e = list;
            this.f11906f = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, List list) {
            function1.invoke(new e.AbstractC0675e.RefreshCoupons(list));
            return Unit.f142422a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1444603203, i10, -1, "com.meijer.mobile.weeklyad.compose.weeklyAdDetail.WeeklyAdDetailCouponSection.<anonymous> (WeeklyAdDetailScreen.kt:134)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = D.i(companion, H1.h.p(16));
            LocalThemeScope localThemeScope = this.f11901a;
            WeeklyAdDetailsCouponState weeklyAdDetailsCouponState = this.f11902b;
            Function1<Pk.a, Unit> function1 = this.f11903c;
            final Function1<e.AbstractC0675e, Unit> function12 = this.f11904d;
            final List<Long> list = this.f11905e;
            String str = this.f11906f;
            C5658d c5658d = C5658d.f48555a;
            C5658d.m mVarH = c5658d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            MeasurePolicy measurePolicyB = G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion);
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
            D1.c(composerA2, measurePolicyB, companion3.e());
            D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.g.a.f15452e, null, null, null, 0.0f, null, null, 124, null);
            int i11 = LocalThemeScope.f15770g;
            C16307b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f140067h << 3), 6);
            C14802K.a(J.z(companion, H1.h.p(6)), composer, 6);
            q1.Label label = new q1.Label(null, localThemeScope.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null);
            String strC = C16193g.c(Nr.g.f22721a0, composer, 0);
            int i12 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
            C14802K.a(InterfaceC14800I.b(c14801j, companion, 1.0f, false, 2, null), composer, 0);
            ri.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), str, null, composer, i11 | (i12 << 3), 4);
            composer.v();
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(function12) | composer.D(list);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Gs.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return l.a.c(function12, list);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            c.b(localThemeScope, weeklyAdDetailsCouponState, function1, (Function0) objB, composer, i11);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(3);
        for (int i10 = 0; i10 < 3; i10++) {
            Coupon coupon = f11899a;
            arrayList.add(Coupon.e(coupon, coupon.getOfferId() + i10, false, false, null, null, false, false, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, 1073741822, null));
        }
        f11900b = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ji.LocalThemeScope r21, androidx.compose.ui.Modifier r22, final java.lang.String r23, final Gs.WeeklyAdDetailsCouponState r24, final java.util.List<java.lang.Long> r25, final kotlin.jvm.functions.Function1<? super Pk.a, kotlin.Unit> r26, final kotlin.jvm.functions.Function1<? super Ps.e.AbstractC0675e, kotlin.Unit> r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Gs.l.d(Ji.M, androidx.compose.ui.Modifier, java.lang.String, Gs.m, java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, String str, WeeklyAdDetailsCouponState weeklyAdDetailsCouponState, List list, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, modifier, str, weeklyAdDetailsCouponState, list, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final Ji.LocalThemeScope r37, androidx.compose.ui.Modifier r38, final Ps.e.ViewState r39, final kotlin.jvm.functions.Function1<? super Pk.a, kotlin.Unit> r40, final kotlin.jvm.functions.Function1<? super Ps.e.AbstractC0675e, kotlin.Unit> r41, final kotlin.jvm.functions.Function1<? super Ps.e.i, kotlin.Unit> r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Gs.l.f(Ji.M, androidx.compose.ui.Modifier, Ps.e$j, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Function1 function1, e.ViewState jVar) {
        function1.invoke(new e.i.View(jVar.getWeeklyAdItem()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, Modifier modifier, e.ViewState jVar, Function1 function1, Function1 function12, Function1 function13, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, modifier, jVar, function1, function12, function13, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    private static final C15372h.a g(InterfaceC5730l0<C15372h.a> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }
}
