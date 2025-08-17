package Ph;

import Ji.C;
import Ji.LocalThemeScope;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import Xh.OrderPreferencesDecorator;
import ak.AbstractC5607a;
import ak.C5608b;
import androidx.compose.foundation.layout.C5658d;
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
import com.meijer.mobile.accounts.ux.profile.a;
import com.meijer.mobile.accounts.ux.profile.p;
import j0.C14801J;
import ji.q1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.C15808L;
import ni.P0;
import p1.C16193g;
import pi.C16307b;
import r1.C16705m;
import yr.C18299z;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r²\u0006\u0010\u0010\f\u001a\u0004\u0018\u00010\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "LXh/e;", "decorator", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/meijer/mobile/accounts/ux/profile/a;", "", "onResourceAction", "b", "(LJi/M;LXh/e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class A {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f25418a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OrderPreferencesDecorator f25419b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f25420c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.profile.a, Unit> f25421d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ph.A$a$a, reason: collision with other inner class name */
        static final class C0446a implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0446a f25422a = new C0446a();

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

            C0446a() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f25423a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f25424b;

            b(L1.h hVar, L1.h hVar2) {
                this.f25423a = hVar;
                this.f25424b = hVar2;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), this.f25423a.getEnd(), H1.h.p(8), 0.0f, 4, null);
                x.a.a(constrainAs.getTop(), this.f25424b.getBottom(), H1.h.p(2), 0.0f, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.profile.a, Unit> f25425a;

            /* JADX WARN: Multi-variable type inference failed */
            c(Function1<? super com.meijer.mobile.accounts.ux.profile.a, Unit> function1) {
                this.f25425a = function1;
            }

            public final void a() {
                this.f25425a.invoke(new a.OnEditClick(p.d.f94984a));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f25426a;

            d(L1.h hVar) {
                this.f25426a = hVar;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), this.f25426a.getBottom(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class e implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f25427a;

            e(L1.h hVar) {
                this.f25427a = hVar;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), this.f25427a.getBottom(), H1.h.p(16), 0.0f, 4, null);
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
            final /* synthetic */ L1.h f25428a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f25429b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ L1.h f25430c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ L1.h f25431d;

            f(L1.h hVar, LocalThemeScope localThemeScope, L1.h hVar2, L1.h hVar3) {
                this.f25428a = hVar;
                this.f25429b = localThemeScope;
                this.f25430c = hVar2;
                this.f25431d = hVar3;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), this.f25428a.getEnd(), this.f25429b.getAdsSpacing().getThree().getDp(), 0.0f, 4, null);
                x.a.a(constrainAs.getTop(), this.f25430c.getBottom(), this.f25429b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
                x.a.a(constrainAs.getBottom(), this.f25431d.getTop(), 0.0f, 0.0f, 6, null);
                C4039g.e(constrainAs, this.f25428a, 0.0f, 2, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class g implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f25432a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f25433b;

            g(L1.h hVar, L1.h hVar2) {
                this.f25432a = hVar;
                this.f25433b = hVar2;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), this.f25432a.getEnd(), H1.h.p(8), 0.0f, 4, null);
                x.a.a(constrainAs.getTop(), this.f25433b.getBottom(), H1.h.p(2), 0.0f, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class h implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f25434a;

            h(L1.h hVar) {
                this.f25434a = hVar;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), this.f25434a.getBottom(), H1.h.p(16), 0.0f, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class i implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f25435a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f25436b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ L1.h f25437c;

            i(L1.h hVar, L1.h hVar2, L1.h hVar3) {
                this.f25435a = hVar;
                this.f25436b = hVar2;
                this.f25437c = hVar3;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), this.f25435a.getEnd(), H1.h.p(8), 0.0f, 4, null);
                x.a.a(constrainAs.getTop(), this.f25436b.getBottom(), H1.h.p(16), 0.0f, 4, null);
                x.a.a(constrainAs.getBottom(), this.f25437c.getTop(), 0.0f, 0.0f, 6, null);
                C4039g.e(constrainAs, this.f25435a, 0.0f, 2, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class j extends Lambda implements Function1<r1.u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ L1.A f25438f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(L1.A a10) {
                super(1);
                this.f25438f = a10;
            }

            public final void a(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                L1.C.a(semantics, this.f25438f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                a(uVar);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class k extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f25439f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ L1.n f25440g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0 f25441h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Modifier f25442i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ OrderPreferencesDecorator f25443j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f25444k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ Function1 f25445l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(L1.n nVar, int i10, Function0 function0, Modifier modifier, OrderPreferencesDecorator orderPreferencesDecorator, LocalThemeScope localThemeScope, Function1 function1) {
                super(2);
                this.f25440g = nVar;
                this.f25441h = function0;
                this.f25442i = modifier;
                this.f25443j = orderPreferencesDecorator;
                this.f25444k = localThemeScope;
                this.f25445l = function1;
                this.f25439f = i10;
            }

            public final void a(Composer composer, int i10) {
                if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                    composer.K();
                    return;
                }
                int helpersHashCode = this.f25440g.getHelpersHashCode();
                this.f25440g.i();
                L1.n nVar = this.f25440g;
                composer.startReplaceGroup(-823390326);
                n.b bVarM = nVar.m();
                L1.h hVarA = bVarM.a();
                L1.h hVarC = bVarM.c();
                L1.h hVarD = bVarM.d();
                L1.h hVarE = bVarM.e();
                L1.h hVarF = bVarM.f();
                L1.h hVarG = bVarM.g();
                L1.h hVarH = bVarM.h();
                L1.h hVarI = bVarM.i();
                Modifier modifierH = androidx.compose.foundation.layout.J.h(this.f25442i, 0.0f, 1, null);
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.a()) {
                    objB = C0446a.f25422a;
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierK = nVar.k(modifierH, hVarA, (Function1) objB);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.e(), P0.e.INSTANCE.i(), composer, 54);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
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
                D1.c(composerA, measurePolicyB, companion2.e());
                D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14801J c14801j = C14801J.f139030a;
                LocalThemeScope localThemeScope = this.f25444k;
                Ji.I six = localThemeScope.getAdsTypography().getHeadings().getSix();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.m(companion3, 0.0f, H1.h.p(8), 0.0f, 0.0f, 13, null), null, null, null, 0, false, 0, six, null, 382, null);
                String strC = C16193g.c(Fh.h.f10525H2, composer, 0);
                int i11 = LocalThemeScope.f15770g;
                int i12 = q1.Label.f140080j;
                ri.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
                C15808L c15808l = C15808L.f151496a;
                C.a.C3841m c3841m = C.a.C3841m.f15350e;
                String strC2 = C16193g.c(Fh.h.f10509F0, composer, 0);
                boolean zA = C5608b.a(this.f25443j.getLoadingErrorMessage());
                Modifier modifierF = C18299z.f(companion3, "order_preferences_edit_button", null, 2, null);
                LocalThemeScope localThemeScope2 = this.f25444k;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f25445l);
                Object objB2 = composer.B();
                if (zV || objB2 == companion.a()) {
                    objB2 = new c(this.f25445l);
                    composer.t(objB2);
                }
                composer.P();
                P0.i(localThemeScope2, c15808l, (Function0) objB2, c3841m, strC2, modifierF, zA, false, 0L, composer, i11 | (C15808L.f151497b << 3) | (C.a.C3841m.f15351f << 9), 192);
                composer.v();
                if (C5608b.a(this.f25443j.getLoadingErrorMessage())) {
                    composer.startReplaceGroup(-821490430);
                    LocalThemeScope localThemeScope3 = this.f25444k;
                    composer.startReplaceGroup(5004770);
                    boolean zV2 = composer.V(hVarA);
                    Object objB3 = composer.B();
                    if (zV2 || objB3 == companion.a()) {
                        objB3 = new e(hVarA);
                        composer.t(objB3);
                    }
                    composer.P();
                    q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.a.i.f15381e, null, null, null, 0.0f, this.f25444k.getAdsColors().getAdsColorIcon02(), nVar.k(companion3, hVarC, (Function1) objB3), 30, null);
                    int i13 = q1.h.DrawableIcon.f140067h;
                    C16307b.b(localThemeScope3, drawableIcon, null, null, composer, i11 | (i13 << 3), 6);
                    LocalThemeScope localThemeScope4 = this.f25444k;
                    composer.startReplaceGroup(-1224400529);
                    boolean zV3 = composer.V(hVarC) | composer.D(this.f25444k) | composer.V(hVarA) | composer.V(hVarE);
                    Object objB4 = composer.B();
                    if (zV3 || objB4 == companion.a()) {
                        objB4 = new f(hVarC, this.f25444k, hVarA, hVarE);
                        composer.t(objB4);
                    }
                    composer.P();
                    q1.Label label2 = new q1.Label(nVar.k(companion3, hVarD, (Function1) objB4), null, null, null, 0, false, 0, this.f25444k.getAdsTypography().getBody().getOne(), null, 382, null);
                    String selectedSubstitutionPreference = this.f25443j.getGrocerySubstitution().getSelectedSubstitutionPreference();
                    if (selectedSubstitutionPreference == null) {
                        selectedSubstitutionPreference = "";
                    }
                    if (selectedSubstitutionPreference.length() == 0) {
                        selectedSubstitutionPreference = "No Substitutions";
                    }
                    ri.j.h(localThemeScope4, label2, selectedSubstitutionPreference, null, composer, i11 | (i12 << 3), 4);
                    LocalThemeScope localThemeScope5 = this.f25444k;
                    composer.startReplaceGroup(-1633490746);
                    boolean zV4 = composer.V(hVarC) | composer.V(hVarD);
                    Object objB5 = composer.B();
                    if (zV4 || objB5 == companion.a()) {
                        objB5 = new g(hVarC, hVarD);
                        composer.t(objB5);
                    }
                    composer.P();
                    ri.j.h(localThemeScope5, new q1.Label(nVar.k(companion3, hVarE, (Function1) objB5), this.f25444k.getAdsColors().getAdsColorPlaceholder(), null, null, 0, false, 0, this.f25444k.getAdsTypography().getHeadings().getNine(), null, 380, null), C16193g.c(Fh.h.f10653Z4, composer, 0), null, composer, i11 | (i12 << 3), 4);
                    String description = this.f25443j.getVehicleDescription().getDescription();
                    if (description != null && description.length() != 0) {
                        LocalThemeScope localThemeScope6 = this.f25444k;
                        composer.startReplaceGroup(5004770);
                        boolean zV5 = composer.V(hVarE);
                        Object objB6 = composer.B();
                        if (zV5 || objB6 == companion.a()) {
                            objB6 = new h(hVarE);
                            composer.t(objB6);
                        }
                        composer.P();
                        C16307b.b(localThemeScope6, new q1.h.DrawableIcon(C.b.i.f.f15491e, null, null, null, 0.0f, this.f25444k.getAdsColors().getAdsColorIcon02(), nVar.k(companion3, hVarF, (Function1) objB6), 30, null), null, null, composer, i11 | (i13 << 3), 6);
                        LocalThemeScope localThemeScope7 = this.f25444k;
                        composer.startReplaceGroup(-1746271574);
                        boolean zV6 = composer.V(hVarF) | composer.V(hVarE) | composer.V(hVarG);
                        Object objB7 = composer.B();
                        if (zV6 || objB7 == companion.a()) {
                            objB7 = new i(hVarF, hVarE, hVarG);
                            composer.t(objB7);
                        }
                        composer.P();
                        ri.j.h(localThemeScope7, new q1.Label(nVar.k(companion3, hVarG, (Function1) objB7), null, null, null, 0, false, 0, this.f25444k.getAdsTypography().getBody().getOne(), null, 382, null), this.f25443j.getVehicleDescription().getDescription(), null, composer, i11 | (i12 << 3), 4);
                        LocalThemeScope localThemeScope8 = this.f25444k;
                        composer.startReplaceGroup(-1633490746);
                        boolean zV7 = composer.V(hVarF) | composer.V(hVarG);
                        Object objB8 = composer.B();
                        if (zV7 || objB8 == companion.a()) {
                            objB8 = new b(hVarF, hVarG);
                            composer.t(objB8);
                        }
                        composer.P();
                        ri.j.h(localThemeScope8, new q1.Label(nVar.k(companion3, hVarH, (Function1) objB8), this.f25444k.getAdsColors().getAdsColorPlaceholder(), null, null, 0, false, 0, this.f25444k.getAdsTypography().getHeadings().getNine(), null, 380, null), C16193g.c(Fh.h.f10493C5, composer, 0), null, composer, i11 | (i12 << 3), 4);
                    }
                    composer.P();
                } else {
                    composer.startReplaceGroup(-822021491);
                    LocalThemeScope localThemeScope9 = this.f25444k;
                    AbstractC5607a loadingErrorMessage = this.f25443j.getLoadingErrorMessage();
                    composer.startReplaceGroup(5004770);
                    boolean zV8 = composer.V(hVarA);
                    Object objB9 = composer.B();
                    if (zV8 || objB9 == companion.a()) {
                        objB9 = new d(hVarA);
                        composer.t(objB9);
                    }
                    composer.P();
                    C4609l.b(localThemeScope9, loadingErrorMessage, nVar.k(companion3, hVarI, (Function1) objB9), composer, i11 | (AbstractC5607a.f45514b << 3), 0);
                    composer.P();
                }
                composer.P();
                if (this.f25440g.getHelpersHashCode() != helpersHashCode) {
                    this.f25441h.invoke();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(Modifier modifier, OrderPreferencesDecorator orderPreferencesDecorator, LocalThemeScope localThemeScope, Function1<? super com.meijer.mobile.accounts.ux.profile.a, Unit> function1) {
            this.f25418a = modifier;
            this.f25419b = orderPreferencesDecorator;
            this.f25420c = localThemeScope;
            this.f25421d = function1;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-297602917, i10, -1, "com.meijer.mobile.accounts.ux.composables.profile.OrderPreferencesCard.<anonymous> (OrderPreferencesCard.kt:59)");
            }
            float f10 = 8;
            Modifier modifierL = androidx.compose.foundation.layout.D.l(Modifier.INSTANCE, H1.h.p(16), H1.h.p(f10), H1.h.p(f10), H1.h.p(24));
            Modifier modifier = this.f25418a;
            OrderPreferencesDecorator orderPreferencesDecorator = this.f25419b;
            LocalThemeScope localThemeScope = this.f25420c;
            Function1<com.meijer.mobile.accounts.ux.profile.a, Unit> function1 = this.f25421d;
            composer.startReplaceableGroup(-270267587);
            composer.startReplaceableGroup(-3687241);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new L1.A();
                composer.t(objB);
            }
            composer.U();
            L1.A a10 = (L1.A) objB;
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
            androidx.compose.ui.layout.A.a(C16705m.d(modifierL, false, new j(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new k(nVar, 6, pairH.b(), modifier, orderPreferencesDecorator, localThemeScope, function1)), pairH.a(), composer, 48, 0);
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

    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r19, final Xh.OrderPreferencesDecorator r20, androidx.compose.ui.Modifier r21, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.profile.a, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ph.A.b(Ji.M, Xh.e, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, OrderPreferencesDecorator orderPreferencesDecorator, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, orderPreferencesDecorator, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
