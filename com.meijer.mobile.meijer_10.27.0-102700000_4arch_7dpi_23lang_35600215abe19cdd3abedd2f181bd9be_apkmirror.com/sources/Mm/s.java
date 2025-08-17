package Mm;

import Ji.C;
import Ji.I;
import Ji.LocalThemeScope;
import Ji.T;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import Mm.s;
import P0.e;
import Rm.C5184d;
import Rm.g;
import ak.AbstractC5607a;
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
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import ck.C6408b;
import com.meijer.mobile.meijer.Y;
import j$.time.YearMonth;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import java.util.List;
import ji.q1;
import kotlin.C17917Z;
import kotlin.C17985y;
import kotlin.C6165d;
import kotlin.InterfaceC6166e;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16193g;
import pi.C16307b;
import r1.C16705m;
import vk.C17590a;
import zp.DigitalReceipt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a]\u0010\u0010\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0014\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001aO\u0010\u0016\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a-\u0010\u0018\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a5\u0010\u001a\u001a\u00020\u000e*\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a9\u0010\u001e\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0003¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006%²\u0006\u000e\u0010 \u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\"\u001a\u00020!8\nX\u008a\u0084\u0002²\u0006\u000e\u0010$\u001a\u00020#8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "j$/time/YearMonth", "yearMonth", "", "Lzp/b;", "receiptsForMonth", "Landroidx/compose/ui/Modifier;", "modifier", "", "isExpanded", "LRm/g$b;", "summary", "Lkotlin/Function1;", "LLm/a;", "", "onAction", "j", "(LJi/M;Lj$/time/YearMonth;Ljava/util/List;Landroidx/compose/ui/Modifier;ZLRm/g$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lak/a;", "message", "s", "(LJi/M;Lak/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "q", "(LJi/M;LRm/g$b;Lj$/time/YearMonth;Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "z", "(LJi/M;LRm/g$b;Lj$/time/YearMonth;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "x", "(LJi/M;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "LRm/d;", "receipt", "u", "(LJi/M;Landroidx/compose/ui/Modifier;LRm/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "expanded", "", "rotationState", "", "lastAction", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class s {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<DigitalReceipt> f19815a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f19816b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g.ReceiptSummary f19817c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f19818d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ YearMonth f19819e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1<Float> f19820f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Lm.a, Unit> f19821g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Mm.s$a$a, reason: collision with other inner class name */
        static final class C0332a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f19822a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f19823b;

            C0332a(LocalThemeScope localThemeScope, InterfaceC5730l0<Boolean> interfaceC5730l0) {
                this.f19822a = localThemeScope;
                this.f19823b = interfaceC5730l0;
            }

            public final void a(Composer composer, int i10) {
                String strC;
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1491553513, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.compose.digitalreceipts.ExpandableReceiptCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ExpandableReceiptCard.kt:101)");
                }
                LocalThemeScope localThemeScope = this.f19822a;
                C.f.a aVar = C.f.a.f15504e;
                if (s.l(this.f19823b)) {
                    composer.startReplaceGroup(861202042);
                    strC = C16193g.c(Y.f100189m1, composer, 0);
                    composer.P();
                } else {
                    composer.startReplaceGroup(861320028);
                    strC = C16193g.c(Y.f100353u5, composer, 0);
                    composer.P();
                }
                C16307b.b(localThemeScope, new q1.h.DrawableIcon(aVar, strC, null, null, 0.0f, this.f19822a.getAdsColors().getAdsColorIcon02(), null, 92, null), null, null, composer, LocalThemeScope.f15770g | (q1.h.DrawableIcon.f140067h << 3), 6);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function3<InterfaceC6166e, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<DigitalReceipt> f19824a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f19825b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ g.ReceiptSummary f19826c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ YearMonth f19827d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function1<Lm.a, Unit> f19828e;

            /* JADX WARN: Multi-variable type inference failed */
            b(List<DigitalReceipt> list, LocalThemeScope localThemeScope, g.ReceiptSummary receiptSummary, YearMonth yearMonth, Function1<? super Lm.a, Unit> function1) {
                this.f19824a = list;
                this.f19825b = localThemeScope;
                this.f19826c = receiptSummary;
                this.f19827d = yearMonth;
                this.f19828e = function1;
            }

            public final void a(InterfaceC6166e AnimatedVisibility, Composer composer, int i10) {
                Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1485627327, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.compose.digitalreceipts.ExpandableReceiptCard.<anonymous>.<anonymous>.<anonymous> (ExpandableReceiptCard.kt:141)");
                }
                if (this.f19824a.isEmpty()) {
                    composer.startReplaceGroup(1314652301);
                    YearMonth yearMonth = this.f19827d;
                    YearMonth yearMonthNow = YearMonth.now();
                    Intrinsics.i(yearMonthNow, "now(...)");
                    Rm.e eVar = new Rm.e(yearMonth, yearMonthNow);
                    s.s(this.f19825b, eVar.a(), null, composer, (AbstractC5607a.f45514b << 3) | LocalThemeScope.f15770g, 2);
                    composer.P();
                } else {
                    composer.startReplaceGroup(1314348532);
                    LocalThemeScope localThemeScope = this.f19825b;
                    g.ReceiptSummary receiptSummary = this.f19826c;
                    if (receiptSummary == null) {
                        receiptSummary = new g.ReceiptSummary(0.0d, 0.0d, 3, null);
                    }
                    s.q(localThemeScope, receiptSummary, this.f19827d, this.f19824a, null, this.f19828e, composer, LocalThemeScope.f15770g, 8);
                    composer.P();
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6166e interfaceC6166e, Composer composer, Integer num) {
                a(interfaceC6166e, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(List<DigitalReceipt> list, LocalThemeScope localThemeScope, g.ReceiptSummary receiptSummary, InterfaceC5730l0<Boolean> interfaceC5730l0, YearMonth yearMonth, z1<Float> z1Var, Function1<? super Lm.a, Unit> function1) {
            this.f19815a = list;
            this.f19816b = localThemeScope;
            this.f19817c = receiptSummary;
            this.f19818d = interfaceC5730l0;
            this.f19819e = yearMonth;
            this.f19820f = z1Var;
            this.f19821g = function1;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-328167949, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.compose.digitalreceipts.ExpandableReceiptCard.<anonymous> (ExpandableReceiptCard.kt:82)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = D.i(J.h(companion, 0.0f, 1, null), H1.h.p(4));
            List<DigitalReceipt> list = this.f19815a;
            LocalThemeScope localThemeScope = this.f19816b;
            g.ReceiptSummary receiptSummary = this.f19817c;
            final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f19818d;
            YearMonth yearMonth = this.f19819e;
            z1<Float> z1Var = this.f19820f;
            Function1<Lm.a, Unit> function1 = this.f19821g;
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
            Modifier modifierH = J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB = G.b(c5658d.e(), companion2.i(), composer, 54);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH);
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
            MeasurePolicy measurePolicyB2 = G.b(c5658d.g(), companion2.i(), composer, 48);
            int iA3 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, companion);
            Function0<InterfaceC5811g> function0A3 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A3);
            } else {
                composer.s();
            }
            Composer composerA3 = D1.a(composer);
            D1.c(composerA3, measurePolicyB2, companion3.e());
            D1.c(composerA3, interfaceC5742sR3, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            Modifier modifierA = T0.k.a(companion, s.n(z1Var));
            float fP = H1.h.p(0);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(interfaceC5730l0);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Mm.r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return s.a.c(interfaceC5730l0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17985y.b((Function0) objB, modifierA, false, null, 0L, 0L, null, fP, null, ComposableLambdaKt.c(-1491553513, true, new C0332a(localThemeScope, interfaceC5730l0), composer, 54), composer, 817889280, 380);
            q1.Label label = new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 381, null);
            String str = yearMonth.format(C17590a.f164803a.E());
            Intrinsics.i(str, "format(...)");
            int i11 = LocalThemeScope.f15770g;
            int i12 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, str, null, composer, i11 | (i12 << 3), 4);
            composer.v();
            if (list.isEmpty()) {
                composer.startReplaceGroup(-1423870169);
                ri.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getOne(), null, 381, null), C16193g.c(Y.f100191m3, composer, 0), null, composer, i11 | (i12 << 3), 4);
                composer.P();
            } else {
                composer.startReplaceGroup(-1424253608);
                ri.j.h(localThemeScope, new q1.Label(D.m(companion, 0.0f, 0.0f, H1.h.p(10), 0.0f, 11, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSix(), null, 382, null), Fk.g.c(receiptSummary != null ? receiptSummary.getTotalSpending() : 0.0d), null, composer, i11 | (i12 << 3), 4);
                composer.P();
            }
            composer.v();
            C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
            C6165d.e(c14815g, s.l(interfaceC5730l0), null, null, null, null, ComposableLambdaKt.c(-1485627327, true, new b(list, localThemeScope, receiptSummary, yearMonth, function1), composer, 54), composer, 1572870, 30);
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC5730l0 interfaceC5730l0) {
            s.m(interfaceC5730l0, !s.l(interfaceC5730l0));
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f19829a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5184d f19830b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f19831a = new a();

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }

            a() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Mm.s$b$b, reason: collision with other inner class name */
        static final class C0333b implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0333b f19832a = new C0333b();

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }

            C0333b() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f19833a;

            c(L1.h hVar) {
                this.f19833a = hVar;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), this.f19833a.getBottom(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final d f19834a = new d();

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }

            d() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class e implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f19835a;

            e(L1.h hVar) {
                this.f19835a = hVar;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), this.f19835a.getBottom(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class f implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f19836a;

            f(L1.h hVar) {
                this.f19836a = hVar;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), this.f19836a.getBottom(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class g implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f19837a;

            g(L1.h hVar) {
                this.f19837a = hVar;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), this.f19837a.getBottom(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class h implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final h f19838a = new h();

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }

            h() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class i extends Lambda implements Function1<r1.u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ L1.A f19839f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(L1.A a10) {
                super(1);
                this.f19839f = a10;
            }

            public final void a(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                L1.C.a(semantics, this.f19839f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                a(uVar);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class j extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f19840f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ L1.n f19841g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0 f19842h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f19843i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ C5184d f19844j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, C5184d c5184d) {
                super(2);
                this.f19841g = nVar;
                this.f19842h = function0;
                this.f19843i = localThemeScope;
                this.f19844j = c5184d;
                this.f19840f = i10;
            }

            public final void a(Composer composer, int i10) {
                int i11;
                Modifier.Companion companion;
                int i12;
                String strC;
                if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                    composer.K();
                    return;
                }
                int helpersHashCode = this.f19841g.getHelpersHashCode();
                this.f19841g.i();
                L1.n nVar = this.f19841g;
                composer.startReplaceGroup(-1516590683);
                n.b bVarM = nVar.m();
                L1.h hVarA = bVarM.a();
                L1.h hVarC = bVarM.c();
                L1.h hVarD = bVarM.d();
                L1.h hVarE = bVarM.e();
                L1.h hVarF = bVarM.f();
                L1.h hVarG = bVarM.g();
                L1.h hVarH = bVarM.h();
                L1.h hVarI = bVarM.i();
                LocalThemeScope localThemeScope = this.f19843i;
                I one = localThemeScope.getAdsTypography().getBody().getOne();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                Composer.Companion companion3 = Composer.INSTANCE;
                if (objB == companion3.a()) {
                    objB = a.f19831a;
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierK = nVar.k(companion2, hVarA, (Function1) objB);
                float f10 = 10;
                q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.i(modifierK, H1.h.p(f10)), null, null, null, 0, false, 0, one, null, 382, null);
                String strK = this.f19844j.k();
                int i13 = LocalThemeScope.f15770g;
                int i14 = q1.Label.f140080j;
                ri.j.h(localThemeScope, label, strK, null, composer, i13 | (i14 << 3), 4);
                LocalThemeScope localThemeScope2 = this.f19843i;
                I one2 = localThemeScope2.getAdsTypography().getBody().getOne();
                T adsColorText02 = this.f19843i.getAdsColors().getAdsColorText02();
                float f11 = 5;
                Modifier modifierM = androidx.compose.foundation.layout.D.m(companion2, 0.0f, H1.h.p(f10), H1.h.p(f11), 0.0f, 9, null);
                composer.startReplaceGroup(1849434622);
                Object objB2 = composer.B();
                if (objB2 == companion3.a()) {
                    objB2 = C0333b.f19832a;
                    composer.t(objB2);
                }
                composer.P();
                q1.Label label2 = new q1.Label(nVar.k(modifierM, hVarC, (Function1) objB2), adsColorText02, null, null, 0, false, 0, one2, null, 380, null);
                AbstractC5607a abstractC5607aJ = this.f19844j.j();
                int i15 = AbstractC5607a.f45514b;
                ri.j.h(localThemeScope2, label2, C6408b.a(abstractC5607aJ, composer, i15), null, composer, i13 | (i14 << 3), 4);
                composer.startReplaceGroup(-1988552563);
                if (this.f19844j.s()) {
                    LocalThemeScope localThemeScope3 = this.f19843i;
                    I one3 = localThemeScope3.getAdsTypography().getBody().getOne();
                    T adsColorText022 = this.f19843i.getAdsColors().getAdsColorText02();
                    Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion2, H1.h.p(f10), 0.0f, 0.0f, H1.h.p(f10), 6, null);
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(hVarA);
                    Object objB3 = composer.B();
                    if (zV || objB3 == companion3.a()) {
                        objB3 = new c(hVarA);
                        composer.t(objB3);
                    }
                    composer.P();
                    i11 = 5004770;
                    ri.j.h(localThemeScope3, new q1.Label(nVar.k(modifierM2, hVarD, (Function1) objB3), adsColorText022, null, null, 0, false, 0, one3, null, 380, null), C6408b.a(this.f19844j.l(), composer, i15), null, composer, i13 | (i14 << 3), 4);
                } else {
                    i11 = 5004770;
                }
                composer.P();
                composer.startReplaceGroup(-1988530575);
                if (this.f19844j.r()) {
                    LocalThemeScope localThemeScope4 = this.f19843i;
                    I eight = localThemeScope4.getAdsTypography().getHeadings().getEight();
                    Modifier modifierM3 = androidx.compose.foundation.layout.D.m(companion2, 0.0f, 0.0f, H1.h.p(f11), H1.h.p(f10), 3, null);
                    companion = companion2;
                    composer.startReplaceGroup(1849434622);
                    Object objB4 = composer.B();
                    if (objB4 == companion3.a()) {
                        objB4 = d.f19834a;
                        composer.t(objB4);
                    }
                    composer.P();
                    ri.j.h(localThemeScope4, new q1.Label(nVar.k(modifierM3, hVarE, (Function1) objB4), null, null, null, 0, false, 0, eight, null, 382, null), this.f19844j.d(), null, composer, i13 | (i14 << 3), 4);
                } else {
                    companion = companion2;
                }
                composer.P();
                composer.startReplaceGroup(-1988510719);
                if (this.f19844j.o()) {
                    composer.startReplaceGroup(i11);
                    boolean zV2 = composer.V(hVarA);
                    Object objB5 = composer.B();
                    if (zV2 || objB5 == companion3.a()) {
                        objB5 = new e(hVarA);
                        composer.t(objB5);
                    }
                    composer.P();
                    Modifier modifierM4 = androidx.compose.foundation.layout.D.m(nVar.k(companion, hVarG, (Function1) objB5), H1.h.p(f11), H1.h.p(20), 0.0f, H1.h.p(f10), 4, null);
                    MeasurePolicy measurePolicyB = G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
                    int iA = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierM4);
                    InterfaceC5811g.Companion companion4 = InterfaceC5811g.INSTANCE;
                    Function0<InterfaceC5811g> function0A = companion4.a();
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
                    D1.c(composerA, measurePolicyB, companion4.e());
                    D1.c(composerA, interfaceC5742sR, companion4.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B = companion4.b();
                    if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion4.f());
                    C14801J c14801j = C14801J.f139030a;
                    LocalThemeScope localThemeScope5 = this.f19843i;
                    i12 = 0;
                    ri.j.h(localThemeScope5, new q1.Label(null, this.f19843i.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope5.getAdsTypography().getBody().getTwo(), null, 381, null), C16193g.c(Y.f99510Ch, composer, 0), null, composer, i13 | (i14 << 3), 4);
                    C14802K.a(J.z(companion, H1.h.p(4)), composer, 6);
                    LocalThemeScope localThemeScope6 = this.f19843i;
                    q1.Label label3 = new q1.Label(null, this.f19844j.m() ? this.f19843i.getAdsColors().getAdsColorSupportSuccess() : this.f19843i.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope6.getAdsTypography().getBody().getTwo(), null, 381, null);
                    if (this.f19844j.m()) {
                        composer.startReplaceGroup(-514983095);
                        strC = C16193g.c(Y.f99562Fc, composer, 0);
                        composer.P();
                    } else {
                        composer.startReplaceGroup(-514980376);
                        strC = C16193g.c(Y.f99581Gc, composer, 0);
                        composer.P();
                    }
                    ri.j.h(localThemeScope6, label3, strC, null, composer, i13 | (i14 << 3), 4);
                    composer.v();
                } else {
                    i12 = 0;
                }
                composer.P();
                composer.startReplaceGroup(-1988468476);
                if (this.f19844j.q()) {
                    LocalThemeScope localThemeScope7 = this.f19843i;
                    I two = localThemeScope7.getAdsTypography().getBody().getTwo();
                    T adsColorText023 = this.f19843i.getAdsColors().getAdsColorText02();
                    composer.startReplaceGroup(i11);
                    boolean zV3 = composer.V(hVarA);
                    Object objB6 = composer.B();
                    if (zV3 || objB6 == companion3.a()) {
                        objB6 = new f(hVarA);
                        composer.t(objB6);
                    }
                    composer.P();
                    float f12 = 20;
                    ri.j.h(localThemeScope7, new q1.Label(androidx.compose.foundation.layout.D.m(nVar.k(companion, hVarH, (Function1) objB6), H1.h.p(f10), H1.h.p(f12), 0.0f, H1.h.p(f10), 4, null), adsColorText023, null, null, 0, false, 0, two, null, 380, null), C16193g.c(Y.f100196m8, composer, i12), null, composer, i13 | (i14 << 3), 4);
                    LocalThemeScope localThemeScope8 = this.f19843i;
                    I seven = localThemeScope8.getAdsTypography().getHeadings().getSeven();
                    composer.startReplaceGroup(i11);
                    boolean zV4 = composer.V(hVarC);
                    Object objB7 = composer.B();
                    if (zV4 || objB7 == companion3.a()) {
                        objB7 = new g(hVarC);
                        composer.t(objB7);
                    }
                    composer.P();
                    ri.j.h(localThemeScope8, new q1.Label(androidx.compose.foundation.layout.D.m(nVar.k(companion, hVarI, (Function1) objB7), 0.0f, H1.h.p(f12), H1.h.p(f11), H1.h.p(f10), 1, null), null, null, null, 0, false, 0, seven, null, 382, null), C16193g.c(Y.f100162ke, composer, i12), null, composer, i13 | (i14 << 3), 4);
                }
                composer.P();
                composer.startReplaceGroup(-1988425156);
                if (this.f19844j.n()) {
                    composer.startReplaceGroup(1849434622);
                    Object objB8 = composer.B();
                    if (objB8 == companion3.a()) {
                        objB8 = h.f19838a;
                        composer.t(objB8);
                    }
                    composer.P();
                    C17917Z.a(nVar.k(companion, hVarF, (Function1) objB8), 0L, 0.0f, 0.0f, composer, 0, 14);
                }
                composer.P();
                composer.P();
                if (this.f19841g.getHelpersHashCode() != helpersHashCode) {
                    this.f19842h.invoke();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        b(LocalThemeScope localThemeScope, C5184d c5184d) {
            this.f19829a = localThemeScope;
            this.f19830b = c5184d;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1627742786, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.compose.digitalreceipts.ReceiptDetailItem.<anonymous> (ExpandableReceiptCard.kt:275)");
            }
            LocalThemeScope localThemeScope = this.f19829a;
            C5184d c5184d = this.f19830b;
            composer.startReplaceableGroup(-270267587);
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceableGroup(-3687241);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = new L1.A();
                composer.t(objB);
            }
            composer.U();
            L1.A a10 = (L1.A) objB;
            composer.startReplaceableGroup(-3687241);
            Object objB2 = composer.B();
            if (objB2 == companion2.a()) {
                objB2 = new L1.n();
                composer.t(objB2);
            }
            composer.U();
            L1.n nVar = (L1.n) objB2;
            composer.startReplaceableGroup(-3687241);
            Object objB3 = composer.B();
            if (objB3 == companion2.a()) {
                objB3 = t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB3);
            }
            composer.U();
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5730l0) objB3, a10, composer, 4544);
            androidx.compose.ui.layout.A.a(C16705m.d(companion, false, new i(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new j(nVar, 0, pairH.b(), localThemeScope, c5184d)), pairH.a(), composer, 48, 0);
            composer.U();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(LocalThemeScope localThemeScope, g.ReceiptSummary receiptSummary, YearMonth yearMonth, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        z(localThemeScope, receiptSummary, yearMonth, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final Ji.LocalThemeScope r26, final j$.time.YearMonth r27, final java.util.List<zp.DigitalReceipt> r28, androidx.compose.ui.Modifier r29, boolean r30, Rm.g.ReceiptSummary r31, final kotlin.jvm.functions.Function1<? super Lm.a, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Mm.s.j(Ji.M, j$.time.YearMonth, java.util.List, androidx.compose.ui.Modifier, boolean, Rm.g$b, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, YearMonth yearMonth, List list, Modifier modifier, boolean z10, g.ReceiptSummary receiptSummary, Function1 function1, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, yearMonth, list, modifier, z10, receiptSummary, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(final Ji.LocalThemeScope r18, final Rm.g.ReceiptSummary r19, final j$.time.YearMonth r20, final java.util.List<zp.DigitalReceipt> r21, androidx.compose.ui.Modifier r22, final kotlin.jvm.functions.Function1<? super Lm.a, kotlin.Unit> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Mm.s.q(Ji.M, Rm.g$b, j$.time.YearMonth, java.util.List, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, g.ReceiptSummary receiptSummary, YearMonth yearMonth, List list, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        q(localThemeScope, receiptSummary, yearMonth, list, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(final Ji.LocalThemeScope r27, final ak.AbstractC5607a r28, androidx.compose.ui.Modifier r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Mm.s.s(Ji.M, ak.a, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        s(localThemeScope, abstractC5607a, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void u(final Ji.LocalThemeScope r21, androidx.compose.ui.Modifier r22, final Rm.C5184d r23, final kotlin.jvm.functions.Function1<? super Lm.a, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Mm.s.u(Ji.M, androidx.compose.ui.Modifier, Rm.d, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(LocalThemeScope localThemeScope, Modifier modifier, C5184d c5184d, Function1 function1, int i10, int i11, Composer composer, int i12) {
        u(localThemeScope, modifier, c5184d, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(LocalThemeScope localThemeScope, List list, Function1 function1, int i10, Composer composer, int i11) {
        x(localThemeScope, list, function1, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void z(final Ji.LocalThemeScope r27, Rm.g.ReceiptSummary r28, final j$.time.YearMonth r29, androidx.compose.ui.Modifier r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Mm.s.z(Ji.M, Rm.g$b, j$.time.YearMonth, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5730l0 k(boolean z10) {
        return t1.e(Boolean.valueOf(z10), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float n(z1<Float> z1Var) {
        return z1Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(InterfaceC5730l0 interfaceC5730l0) {
        m(interfaceC5730l0, !l(interfaceC5730l0));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(C5184d c5184d, Function1 function1) {
        Lm.a aVarF = c5184d.f();
        if (aVarF != null) {
            function1.invoke(aVarF);
        }
        return Unit.f142422a;
    }

    private static final void x(LocalThemeScope localThemeScope, final List<DigitalReceipt> list, Function1<? super Lm.a, Unit> function1, Composer composer, final int i10) {
        int i11;
        final LocalThemeScope localThemeScope2;
        final Function1<? super Lm.a, Unit> function12;
        boolean z10;
        int i12;
        int i13;
        boolean zD;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-951737453);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(list)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(function1)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            localThemeScope2 = localThemeScope;
            function12 = function1;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-951737453, i11, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.compose.digitalreceipts.ReceiptsDetailList (ExpandableReceiptCard.kt:245)");
            }
            int i15 = 0;
            for (Object obj : list) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    CollectionsKt.w();
                }
                DigitalReceipt digitalReceipt = (DigitalReceipt) obj;
                if (i15 == CollectionsKt.o(list)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u(localThemeScope, null, new C5184d(i15, z10, digitalReceipt), function1, composerStartRestartGroup, LocalThemeScope.f15770g | (i11 & 14) | ((i11 << 3) & 7168), 1);
                i15 = i16;
            }
            localThemeScope2 = localThemeScope;
            function12 = function1;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Mm.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return s.y(localThemeScope2, list, function12, i10, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }
}
