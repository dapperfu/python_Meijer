package Oh;

import F1.k;
import Ji.C;
import Ji.I;
import Ji.LocalThemeScope;
import L1.A;
import L1.C;
import L1.C4039g;
import L1.D;
import L1.x;
import P0.e;
import Wh.PreferenceItem;
import ak.AbstractC5607a;
import ak.C5608b;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import ck.C6408b;
import com.meijer.mobile.accounts.ux.preferences.k;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import java.util.Iterator;
import java.util.List;
import ji.q1;
import kotlin.C17917Z;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16193g;
import pi.C16307b;
import r1.C16705m;
import yr.N;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001as\u0010\u0011\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0017²\u0006\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "isVerificationLoading", "showUnverifiedEmailMessage", "showVerificationSentMessage", "Lak/a;", "preferenceTitle", "", "LWh/b;", "preferenceItems", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "onPreferenceChange", "Lcom/meijer/mobile/accounts/ux/preferences/k;", "onAction", "b", "(LJi/M;ZZZLak/a;Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LWh/a;", "preferenceGroups", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f23656a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f23657b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<PreferenceItem> f23658c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f23659d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f23660e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f23661f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<PreferenceItem, Unit> f23662g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.preferences.k, Unit> f23663h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Oh.d$a$a, reason: collision with other inner class name */
        static final class C0379a implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0379a f23664a = new C0379a();

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

            C0379a() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.preferences.k, Unit> f23665a;

            /* JADX WARN: Multi-variable type inference failed */
            b(Function1<? super com.meijer.mobile.accounts.ux.preferences.k, Unit> function1) {
                this.f23665a = function1;
            }

            public final void a() {
                this.f23665a.invoke(k.e.f94696a);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.preferences.k, Unit> f23666a;

            /* JADX WARN: Multi-variable type inference failed */
            c(Function1<? super com.meijer.mobile.accounts.ux.preferences.k, Unit> function1) {
                this.f23666a = function1;
            }

            public final void a() {
                this.f23666a.invoke(k.e.f94696a);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Oh.d$a$d, reason: collision with other inner class name */
        static final class C0380d implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.preferences.k, Unit> f23667a;

            /* JADX WARN: Multi-variable type inference failed */
            C0380d(Function1<? super com.meijer.mobile.accounts.ux.preferences.k, Unit> function1) {
                this.f23667a = function1;
            }

            public final void a() {
                this.f23667a.invoke(k.g.f94699a);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class e extends Lambda implements Function1<r1.u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ A f23668f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(A a10) {
                super(1);
                this.f23668f = a10;
            }

            public final void a(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                C.a(semantics, this.f23668f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                a(uVar);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f23669f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ L1.n f23670g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0 f23671h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f23672i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f23673j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ List f23674k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ boolean f23675l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ boolean f23676m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ boolean f23677n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ Function1 f23678o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ Function1 f23679p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a, List list, boolean z10, boolean z11, boolean z12, Function1 function1, Function1 function12) {
                super(2);
                this.f23670g = nVar;
                this.f23671h = function0;
                this.f23672i = localThemeScope;
                this.f23673j = abstractC5607a;
                this.f23674k = list;
                this.f23675l = z10;
                this.f23676m = z11;
                this.f23677n = z12;
                this.f23678o = function1;
                this.f23679p = function12;
                this.f23669f = i10;
            }

            public final void a(Composer composer, int i10) {
                Iterator it;
                float f10;
                Composer composer2;
                Modifier.Companion companion;
                int i11;
                AnnotatedString.b bVar;
                int iN;
                int i12;
                if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                    composer.K();
                    return;
                }
                int helpersHashCode = this.f23670g.getHelpersHashCode();
                this.f23670g.i();
                L1.n nVar = this.f23670g;
                composer.startReplaceGroup(1040909171);
                L1.h hVarA = nVar.m().a();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = C0379a.f23664a;
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierK = nVar.k(companion2, hVarA, (Function1) objB);
                int i13 = 0;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
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
                ri.j.h(this.f23672i, new q1.Label(null, null, null, null, 0, false, 0, this.f23672i.getAdsTypography().getHeadings().getSix(), null, 383, null), C6408b.a(this.f23673j, composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                float f11 = 8;
                int i14 = 6;
                C14802K.a(J.i(companion2, H1.h.p(f11)), composer, 6);
                Composer composer3 = composer;
                C17917Z.a(androidx.compose.foundation.layout.D.m(companion2, 0.0f, H1.h.p(f11), 0.0f, 0.0f, 13, null), this.f23672i.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer3, 6, 12);
                C14802K.a(J.i(companion2, H1.h.p(f11)), composer3, 6);
                composer3.startReplaceGroup(76281554);
                Iterator it2 = this.f23674k.iterator();
                int i15 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        CollectionsKt.w();
                    }
                    PreferenceItem preferenceItem = (PreferenceItem) next;
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    C14802K.a(J.i(companion4, H1.h.p(f11)), composer3, i14);
                    e.Companion companion5 = P0.e.INSTANCE;
                    e.c cVarI = companion5.i();
                    C5658d c5658d = C5658d.f48555a;
                    C5658d.f fVarE = c5658d.e();
                    Modifier modifierH = J.h(companion4, 0.0f, 1, null);
                    MeasurePolicy measurePolicyB = G.b(fVarE, cVarI, composer3, 54);
                    int iA2 = C5717f.a(composer3, i13);
                    InterfaceC5742s interfaceC5742sR2 = composer3.r();
                    Modifier modifierE2 = androidx.compose.ui.b.e(composer3, modifierH);
                    InterfaceC5811g.Companion companion6 = InterfaceC5811g.INSTANCE;
                    Function0<InterfaceC5811g> function0A2 = companion6.a();
                    if (composer3.k() == null) {
                        C5717f.c();
                    }
                    composer3.F();
                    if (composer3.getInserting()) {
                        composer3.I(function0A2);
                    } else {
                        composer3.s();
                    }
                    Composer composerA2 = D1.a(composer3);
                    D1.c(composerA2, measurePolicyB, companion6.e());
                    D1.c(composerA2, interfaceC5742sR2, companion6.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion6.b();
                    if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                        composerA2.t(Integer.valueOf(iA2));
                        composerA2.n(Integer.valueOf(iA2), function2B2);
                    }
                    D1.c(composerA2, modifierE2, companion6.f());
                    C14801J c14801j = C14801J.f139030a;
                    LocalThemeScope localThemeScope = this.f23672i;
                    float f12 = 12;
                    q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.m(companion4, H1.h.p(f12), 0.0f, 0.0f, 0.0f, 14, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 382, null);
                    AbstractC5607a title = preferenceItem.getTitle();
                    int i17 = AbstractC5607a.f45514b;
                    String strA = C6408b.a(title, composer3, i17);
                    int i18 = LocalThemeScope.f15770g;
                    int i19 = q1.Label.f140080j;
                    ri.j.h(localThemeScope, label, strA, null, composer, (i19 << 3) | i18, 4);
                    C14802K.a(InterfaceC14800I.b(c14801j, companion4, 1.0f, false, 2, null), composer, i13);
                    r.b(this.f23672i, preferenceItem, this.f23678o, composer, (i17 << 3) | i18);
                    composer.v();
                    C14802K.a(J.i(companion4, H1.h.p(f11)), composer, 6);
                    if (this.f23675l && Intrinsics.e(preferenceItem.getTitle(), AbstractC5607a.INSTANCE.c("Digital Receipts"))) {
                        composer.startReplaceGroup(-648445202);
                        N.b(this.f23672i, null, composer, i18, 1);
                        composer.P();
                        companion = companion4;
                        composer2 = composer;
                        it = it2;
                        i11 = i13;
                        f10 = f11;
                    } else {
                        composer.startReplaceGroup(-648104574);
                        LocalThemeScope localThemeScope2 = this.f23672i;
                        it = it2;
                        f10 = f11;
                        Modifier.Companion companion7 = companion4;
                        ri.j.h(localThemeScope2, new q1.Label(androidx.compose.foundation.layout.D.m(companion4, H1.h.p(f12), 0.0f, H1.h.p(72), 0.0f, 10, null), null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBodyCompact().getTwo().d(this.f23672i.getAdsColors().getAdsColorText02()), null, 382, null), C6408b.a(preferenceItem.getDescription(), composer, i17), null, composer, i18 | (i19 << 3), 4);
                        Composer composer4 = composer;
                        if (C5608b.a(preferenceItem.getInlineError())) {
                            composer4.startReplaceGroup(-647372757);
                            C14802K.a(J.i(companion7, H1.h.p(f10)), composer4, 6);
                            composer4.P();
                        } else {
                            composer4.startReplaceGroup(-647773773);
                            float f13 = 16;
                            C14802K.a(J.i(companion7, H1.h.p(f13)), composer4, 6);
                            Oh.b.b(this.f23672i, J.h(companion7, 0.0f, 1, null), preferenceItem.getInlineError(), composer, i18 | 48 | (i17 << 6), 0);
                            composer4 = composer;
                            C14802K.a(J.i(companion7, H1.h.p(f13)), composer4, 6);
                            composer4.P();
                        }
                        if ((this.f23676m || this.f23677n) && Intrinsics.e(preferenceItem.getTitle(), AbstractC5607a.INSTANCE.c("Digital Receipts"))) {
                            float f14 = 16;
                            C14802K.a(J.i(companion7, H1.h.p(f14)), composer4, 6);
                            Modifier modifierM = androidx.compose.foundation.layout.D.m(J.h(companion7, 0.0f, 1, null), H1.h.p(f12), 0.0f, H1.h.p(f14), 0.0f, 10, null);
                            MeasurePolicy measurePolicyB2 = G.b(c5658d.g(), companion5.l(), composer4, 6);
                            int iA3 = C5717f.a(composer4, 0);
                            InterfaceC5742s interfaceC5742sR3 = composer4.r();
                            Modifier modifierE3 = androidx.compose.ui.b.e(composer4, modifierM);
                            Function0<InterfaceC5811g> function0A3 = companion6.a();
                            if (composer4.k() == null) {
                                C5717f.c();
                            }
                            composer4.F();
                            if (composer4.getInserting()) {
                                composer4.I(function0A3);
                            } else {
                                composer4.s();
                            }
                            Composer composerA3 = D1.a(composer4);
                            D1.c(composerA3, measurePolicyB2, companion6.e());
                            D1.c(composerA3, interfaceC5742sR3, companion6.g());
                            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion6.b();
                            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                                composerA3.t(Integer.valueOf(iA3));
                                composerA3.n(Integer.valueOf(iA3), function2B3);
                            }
                            D1.c(composerA3, modifierE3, companion6.f());
                            float f15 = 18;
                            C16307b.b(this.f23672i, new q1.h.DrawableIcon(C.i.n.f15565d, C16193g.c(Fh.h.f10570N5, composer4, 0), null, null, 0.0f, null, J.z(J.i(companion7, H1.h.p(f15)), H1.h.p(f15)), 60, null), null, null, composer, i18 | (q1.h.DrawableIcon.f140067h << 3), 6);
                            composer2 = composer;
                            C14802K.a(J.z(companion7, H1.h.p(f10)), composer2, 6);
                            composer2.startReplaceGroup(-1647717959);
                            if (this.f23676m) {
                                LocalThemeScope localThemeScope3 = this.f23672i;
                                I two = localThemeScope3.getAdsTypography().getBodyCompact().getTwo();
                                composer2.startReplaceGroup(5004770);
                                boolean zV = composer2.V(this.f23679p);
                                Object objB2 = composer2.B();
                                if (zV || objB2 == Composer.INSTANCE.a()) {
                                    objB2 = new b(this.f23679p);
                                    composer2.t(objB2);
                                }
                                composer2.P();
                                q1.Label label2 = new q1.Label(ClickableKt.d(companion7, false, null, null, (Function0) objB2, 7, null), null, null, null, 0, false, 0, two, null, 382, null);
                                composer2.startReplaceGroup(-1647698315);
                                bVar = new AnnotatedString.b(0, 1, null);
                                composer2.startReplaceGroup(-1647697129);
                                iN = bVar.n(new SpanStyle(this.f23672i.getAdsColors().getAdsColorText02().getColor(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                                try {
                                    bVar.g(C16193g.c(Fh.h.f10660a4, composer2, 0));
                                    Unit unit = Unit.f142422a;
                                    bVar.k(iN);
                                    composer2.P();
                                    composer2.startReplaceGroup(-1647687431);
                                    iN = bVar.n(new SpanStyle(this.f23672i.getAdsColors().getAdsColorBrandPrimary().getColor(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, F1.k.INSTANCE.d(), null, null, null, 61438, null));
                                    try {
                                        bVar.g(C16193g.c(Fh.h.f10675c5, composer2, 0));
                                        bVar.k(iN);
                                        composer2.P();
                                        composer2.startReplaceGroup(-1647669992);
                                        iN = bVar.n(new SpanStyle(this.f23672i.getAdsColors().getAdsColorText02().getColor(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                                        try {
                                            bVar.g(C16193g.c(Fh.h.f10681d4, composer2, 0));
                                            bVar.k(iN);
                                            composer2.P();
                                            AnnotatedString annotatedStringQ = bVar.q();
                                            composer2.P();
                                            companion7 = companion7;
                                            ri.j.g(localThemeScope3, label2, annotatedStringQ, null, null, composer, i18 | (i19 << 3), 12);
                                            composer2 = composer;
                                        } finally {
                                        }
                                    } finally {
                                    }
                                } finally {
                                }
                            }
                            composer2.P();
                            composer2.startReplaceGroup(-1647653087);
                            if (this.f23677n) {
                                MeasurePolicy measurePolicyA2 = C5665k.a(c5658d.h(), companion5.k(), composer2, 0);
                                int iA4 = C5717f.a(composer2, 0);
                                InterfaceC5742s interfaceC5742sR4 = composer2.r();
                                Modifier modifierE4 = androidx.compose.ui.b.e(composer2, companion7);
                                Function0<InterfaceC5811g> function0A4 = companion6.a();
                                if (composer2.k() == null) {
                                    C5717f.c();
                                }
                                composer2.F();
                                if (composer2.getInserting()) {
                                    composer2.I(function0A4);
                                } else {
                                    composer2.s();
                                }
                                Composer composerA4 = D1.a(composer2);
                                D1.c(composerA4, measurePolicyA2, companion6.e());
                                D1.c(composerA4, interfaceC5742sR4, companion6.g());
                                Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion6.b();
                                if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                                    composerA4.t(Integer.valueOf(iA4));
                                    composerA4.n(Integer.valueOf(iA4), function2B4);
                                }
                                D1.c(composerA4, modifierE4, companion6.f());
                                C14815g c14815g2 = C14815g.f139108a;
                                LocalThemeScope localThemeScope4 = this.f23672i;
                                I two2 = localThemeScope4.getAdsTypography().getBodyCompact().getTwo();
                                composer2.startReplaceGroup(5004770);
                                boolean zV2 = composer2.V(this.f23679p);
                                Object objB3 = composer2.B();
                                if (zV2 || objB3 == Composer.INSTANCE.a()) {
                                    objB3 = new c(this.f23679p);
                                    composer2.t(objB3);
                                }
                                composer2.P();
                                Modifier.Companion companion8 = companion7;
                                q1.Label label3 = new q1.Label(ClickableKt.d(companion8, false, null, null, (Function0) objB3, 7, null), null, null, null, 0, false, 0, two2, null, 382, null);
                                composer2.startReplaceGroup(1660100076);
                                bVar = new AnnotatedString.b(0, 1, null);
                                composer2.startReplaceGroup(1660101340);
                                iN = bVar.n(new SpanStyle(this.f23672i.getAdsColors().getAdsColorText02().getColor(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                                try {
                                    bVar.g(C16193g.c(Fh.h.f10695f4, composer2, 0));
                                    Unit unit2 = Unit.f142422a;
                                    bVar.k(iN);
                                    composer2.P();
                                    composer2.startReplaceGroup(1660111637);
                                    long color = this.f23672i.getAdsColors().getAdsColorBrandPrimary().getColor();
                                    k.Companion companion9 = F1.k.INSTANCE;
                                    iN = bVar.n(new SpanStyle(color, 0L, null, null, null, null, null, 0L, null, null, null, 0L, companion9.d(), null, null, null, 61438, null));
                                    try {
                                        bVar.g(C16193g.c(Fh.h.f10688e4, composer2, 0));
                                        bVar.k(iN);
                                        composer2.P();
                                        composer2.startReplaceGroup(1660131278);
                                        iN = bVar.n(new SpanStyle(this.f23672i.getAdsColors().getAdsColorText02().getColor(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                                        try {
                                            bVar.g(C16193g.c(Fh.h.f10603S3, composer2, 0));
                                            bVar.k(iN);
                                            composer2.P();
                                            AnnotatedString annotatedStringQ2 = bVar.q();
                                            composer2.P();
                                            ri.j.g(localThemeScope4, label3, annotatedStringQ2, null, null, composer, i18 | (i19 << 3), 12);
                                            C14802K.a(J.i(companion8, H1.h.p(f10)), composer, 6);
                                            LocalThemeScope localThemeScope5 = this.f23672i;
                                            I two3 = localThemeScope5.getAdsTypography().getBodyCompact().getTwo();
                                            composer.startReplaceGroup(5004770);
                                            boolean zV3 = composer.V(this.f23679p);
                                            Object objB4 = composer.B();
                                            if (zV3 || objB4 == Composer.INSTANCE.a()) {
                                                objB4 = new C0380d(this.f23679p);
                                                composer.t(objB4);
                                            }
                                            composer.P();
                                            companion = companion8;
                                            q1.Label label4 = new q1.Label(ClickableKt.d(companion8, false, null, null, (Function0) objB4, 7, null), null, null, null, 0, false, 0, two3, null, 382, null);
                                            composer.startReplaceGroup(1660169141);
                                            bVar = new AnnotatedString.b(0, 1, null);
                                            composer.startReplaceGroup(1660170397);
                                            iN = bVar.n(new SpanStyle(this.f23672i.getAdsColors().getAdsColorText02().getColor(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                                            try {
                                                bVar.g(C16193g.c(Fh.h.f10667b4, composer, 0));
                                                bVar.k(iN);
                                                composer.P();
                                                composer.startReplaceGroup(1660180685);
                                                iN = bVar.n(new SpanStyle(this.f23672i.getAdsColors().getAdsColorBrandPrimary().getColor(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, companion9.d(), null, null, null, 61438, null));
                                                try {
                                                    bVar.g(C16193g.c(Fh.h.f10675c5, composer, 0));
                                                    bVar.k(iN);
                                                    composer.P();
                                                    composer.startReplaceGroup(1660199134);
                                                    iN = bVar.n(new SpanStyle(this.f23672i.getAdsColors().getAdsColorText02().getColor(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                                                    try {
                                                        i11 = 0;
                                                        bVar.g(C16193g.c(Fh.h.f10674c4, composer, 0));
                                                        bVar.k(iN);
                                                        composer.P();
                                                        AnnotatedString annotatedStringQ3 = bVar.q();
                                                        composer.P();
                                                        ri.j.g(localThemeScope5, label4, annotatedStringQ3, null, null, composer, i18 | (i19 << 3), 12);
                                                        composer2 = composer;
                                                        composer2.v();
                                                    } finally {
                                                    }
                                                } finally {
                                                }
                                            } finally {
                                            }
                                        } finally {
                                        }
                                    } finally {
                                    }
                                } finally {
                                }
                            } else {
                                companion = companion7;
                                i11 = 0;
                            }
                            composer2.P();
                            composer2.v();
                        } else {
                            composer2 = composer4;
                            companion = companion7;
                            i11 = 0;
                        }
                        composer2.P();
                    }
                    composer2.startReplaceGroup(76599937);
                    if (i15 != CollectionsKt.o(this.f23674k)) {
                        Modifier.Companion companion10 = companion;
                        composer3 = composer;
                        C17917Z.a(androidx.compose.foundation.layout.D.m(companion10, 0.0f, H1.h.p(f10), 0.0f, 0.0f, 13, null), this.f23672i.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer3, 6, 12);
                        i12 = 6;
                        C14802K.a(J.i(companion10, H1.h.p(f10)), composer3, 6);
                    } else {
                        composer3 = composer2;
                        i12 = 6;
                    }
                    composer3.P();
                    i14 = i12;
                    i13 = i11;
                    i15 = i16;
                    it2 = it;
                    f11 = f10;
                }
                composer3.P();
                composer3.v();
                composer3.P();
                if (this.f23670g.getHelpersHashCode() != helpersHashCode) {
                    this.f23671h.invoke();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a, List<PreferenceItem> list, boolean z10, boolean z11, boolean z12, Function1<? super PreferenceItem, Unit> function1, Function1<? super com.meijer.mobile.accounts.ux.preferences.k, Unit> function12) {
            this.f23656a = localThemeScope;
            this.f23657b = abstractC5607a;
            this.f23658c = list;
            this.f23659d = z10;
            this.f23660e = z11;
            this.f23661f = z12;
            this.f23662g = function1;
            this.f23663h = function12;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2069096981, i10, -1, "com.meijer.mobile.accounts.ux.composables.preferences.PreferenceCard.<anonymous> (PreferenceCard.kt:78)");
            }
            float f10 = 16;
            Modifier modifierL = androidx.compose.foundation.layout.D.l(Modifier.INSTANCE, H1.h.p(f10), H1.h.p(f10), H1.h.p(f10), H1.h.p(24));
            LocalThemeScope localThemeScope = this.f23656a;
            AbstractC5607a abstractC5607a = this.f23657b;
            List<PreferenceItem> list = this.f23658c;
            boolean z10 = this.f23659d;
            boolean z11 = this.f23660e;
            boolean z12 = this.f23661f;
            Function1<PreferenceItem, Unit> function1 = this.f23662g;
            Function1<com.meijer.mobile.accounts.ux.preferences.k, Unit> function12 = this.f23663h;
            composer.startReplaceableGroup(-270267587);
            composer.startReplaceableGroup(-3687241);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new A();
                composer.t(objB);
            }
            composer.U();
            A a10 = (A) objB;
            composer.startReplaceableGroup(-3687241);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new L1.n();
                composer.t(objB2);
            }
            composer.U();
            L1.n nVar = (L1.n) objB2;
            composer.startReplaceableGroup(-3687241);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB3);
            }
            composer.U();
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5730l0) objB3, a10, composer, 4544);
            androidx.compose.ui.layout.A.a(C16705m.d(modifierL, false, new e(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new f(nVar, 0, pairH.b(), localThemeScope, abstractC5607a, list, z10, z11, z12, function1, function12)), pairH.a(), composer, 48, 0);
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

    /* JADX WARN: Removed duplicated region for block: B:104:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r24, final boolean r25, final boolean r26, final boolean r27, final ak.AbstractC5607a r28, final java.util.List<Wh.PreferenceItem> r29, androidx.compose.ui.Modifier r30, final kotlin.jvm.functions.Function1<? super Wh.PreferenceItem, kotlin.Unit> r31, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.preferences.k, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Oh.d.b(Ji.M, boolean, boolean, boolean, ak.a, java.util.List, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, boolean z10, boolean z11, boolean z12, AbstractC5607a abstractC5607a, List list, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, z10, z11, z12, abstractC5607a, list, modifier, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
