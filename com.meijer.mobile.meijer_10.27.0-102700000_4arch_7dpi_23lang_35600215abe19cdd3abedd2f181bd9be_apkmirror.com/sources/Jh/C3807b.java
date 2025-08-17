package Jh;

import Ji.C;
import Ji.LocalThemeScope;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import P0.e;
import Sh.AddressDecorator;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
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
import j0.C14802K;
import j0.C14815g;
import ji.ProductCardTags;
import ji.q1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.C15808L;
import ni.P0;
import p1.C16193g;
import r1.C16705m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a3\u0010\b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\f²\u0006\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "LSh/a;", "addressDecorator", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onEditAddress", "b", "(LJi/M;LSh/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Jh.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3807b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Jh.b$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f15228a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AddressDecorator f15229b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f15230c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Jh.b$a$a, reason: collision with other inner class name */
        static final class C0240a implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0240a f15231a = new C0240a();

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

            C0240a() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Jh.b$a$b, reason: collision with other inner class name */
        /* synthetic */ class C0241b extends AdaptedFunctionReference implements Function1<LocalThemeScope, ProductCardTags> {

            /* renamed from: h, reason: collision with root package name */
            public static final C0241b f15232h = new C0241b();

            C0241b() {
                super(1, ProductCardTags.class, "<init>", "<init>(Lcom/meijer/mobile/android_acres_library/foundations/v2/LocalThemeScope;Lcom/meijer/mobile/android_acres_library/assemblies/TagTemplates$ProductCardTags;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProductCardTags invoke(LocalThemeScope p02) {
                Intrinsics.j(p02, "p0");
                return new ProductCardTags(p02, null, 2, null);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Jh.b$a$c */
        static final class c implements Function3<ProductCardTags, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f15233a;

            c(LocalThemeScope localThemeScope) {
                this.f15233a = localThemeScope;
            }

            public final void a(ProductCardTags Assemble, Composer composer, int i10) {
                int i11;
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1193840121, i11, -1, "com.meijer.mobile.accounts.ux.composables.addresses.AddressCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressCard.kt:74)");
                }
                Hi.h.h(this.f15233a, q1.Tag.y(Assemble.getTags().getPickupOnly(), this.f15233a.getAdsColors().getAdsColorBrandPrimary(), q1.Label.y(Assemble.getTags().getPickupOnly().getLabel(), Assemble.getTags().getPickupOnly().getLabel().getModifier().then(androidx.compose.foundation.layout.D.k(Modifier.INSTANCE, H1.h.p(4), 0.0f, 2, null)), this.f15233a.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, null, null, 508, null), null, null, 12, null), C16193g.c(Fh.h.f10744m4, composer, 0), null, composer, (q1.Tag.f140168e << 3) | LocalThemeScope.f15770g, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ProductCardTags productCardTags, Composer composer, Integer num) {
                a(productCardTags, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Jh.b$a$d */
        static final class d implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final d f15234a = new d();

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
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
        /* renamed from: Jh.b$a$e */
        public static final class e extends Lambda implements Function1<r1.u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ L1.A f15235f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(L1.A a10) {
                super(1);
                this.f15235f = a10;
            }

            public final void a(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                L1.C.a(semantics, this.f15235f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                a(uVar);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Jh.b$a$f */
        public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f15236f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ L1.n f15237g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0 f15238h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f15239i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ AddressDecorator f15240j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ Function0 f15241k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, AddressDecorator addressDecorator, Function0 function02) {
                super(2);
                this.f15237g = nVar;
                this.f15238h = function0;
                this.f15239i = localThemeScope;
                this.f15240j = addressDecorator;
                this.f15241k = function02;
                this.f15236f = i10;
            }

            public final void a(Composer composer, int i10) {
                if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                    composer.K();
                    return;
                }
                int helpersHashCode = this.f15237g.getHelpersHashCode();
                this.f15237g.i();
                L1.n nVar = this.f15237g;
                composer.startReplaceGroup(1972183358);
                n.b bVarM = nVar.m();
                L1.h hVarA = bVarM.a();
                L1.h hVarC = bVarM.c();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = C0240a.f15231a;
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierK = nVar.k(companion, hVarA, (Function1) objB);
                C5658d.m mVarH = C5658d.f48555a.h();
                e.Companion companion3 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion3.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
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
                D1.c(composerA, measurePolicyA, companion4.e());
                D1.c(composerA, interfaceC5742sR, companion4.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion4.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion4.f());
                C14815g c14815g = C14815g.f139108a;
                LocalThemeScope localThemeScope = this.f15239i;
                float f10 = 16;
                q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.m(companion, 0.0f, H1.h.p(f10), 0.0f, 0.0f, 13, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSix(), null, 382, null);
                String fullName = this.f15240j.getFullName();
                int i11 = LocalThemeScope.f15770g;
                int i12 = q1.Label.f140080j;
                ri.j.h(localThemeScope, label, fullName, null, composer, (i12 << 3) | i11, 4);
                C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
                composer.startReplaceGroup(74790610);
                if (this.f15240j.getIsPrimaryAddress()) {
                    LocalThemeScope localThemeScope2 = this.f15239i;
                    composer.startReplaceGroup(1849434622);
                    Object objB2 = composer.B();
                    if (objB2 == companion2.a()) {
                        objB2 = C0241b.f15232h;
                        composer.t(objB2);
                    }
                    composer.P();
                    Ji.Q.f(localThemeScope2, (Function1) objB2, ComposableLambdaKt.c(-1193840121, true, new c(this.f15239i), composer, 54), composer, i11 | 432);
                    C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(8)), composer, 6);
                }
                composer.P();
                ri.j.h(this.f15239i, new q1.Label(null, null, null, null, 0, false, 0, this.f15239i.getAdsTypography().getBodyCompact().getTwo(), null, 383, null), this.f15240j.getStreetAddress().c().e(), null, composer, i11 | (i12 << 3), 4);
                composer.startReplaceGroup(74827651);
                if (this.f15240j.getApartment().getInformation().length() > 0) {
                    ri.j.h(this.f15239i, new q1.Label(null, null, null, null, 0, false, 0, this.f15239i.getAdsTypography().getBodyCompact().getTwo(), null, 383, null), this.f15240j.getApartment().getInformation(), null, composer, i11 | (i12 << 3), 4);
                }
                composer.P();
                ri.j.h(this.f15239i, new q1.Label(null, null, null, null, 0, false, 0, this.f15239i.getAdsTypography().getBodyCompact().getTwo(), null, 383, null), this.f15240j.getAddressLine(), null, composer, i11 | (i12 << 3), 4);
                composer.startReplaceGroup(74842885);
                if (this.f15240j.getPhoneNumber().c().e().length() > 0) {
                    C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
                    ri.j.h(this.f15239i, new q1.Label(null, null, null, null, 0, false, 0, this.f15239i.getAdsTypography().getBodyCompact().getTwo(), null, 383, null), Fk.a.f10894a.a(this.f15240j.getPhoneNumber().c().e()), null, composer, i11 | (i12 << 3), 4);
                }
                composer.P();
                composer.v();
                composer.startReplaceGroup(1849434622);
                Object objB3 = composer.B();
                if (objB3 == companion2.a()) {
                    objB3 = d.f15234a;
                    composer.t(objB3);
                }
                composer.P();
                Modifier modifierK2 = nVar.k(companion, hVarC, (Function1) objB3);
                MeasurePolicy measurePolicyG = C5662h.g(companion3.o(), false);
                int iA2 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierK2);
                Function0<InterfaceC5811g> function0A2 = companion4.a();
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
                D1.c(composerA2, measurePolicyG, companion4.e());
                D1.c(composerA2, interfaceC5742sR2, companion4.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion4.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion4.f());
                C5664j c5664j = C5664j.f48612a;
                P0.i(this.f15239i, C15808L.f151496a, this.f15241k, C.a.C3841m.f15350e, C16193g.c(Fh.h.f10509F0, composer, 0), null, false, false, 0L, composer, (C15808L.f151497b << 3) | i11 | (C.a.C3841m.f15351f << 9), 240);
                composer.v();
                composer.P();
                if (this.f15237g.getHelpersHashCode() != helpersHashCode) {
                    this.f15238h.invoke();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1618906665, i10, -1, "com.meijer.mobile.accounts.ux.composables.addresses.AddressCard.<anonymous> (AddressCard.kt:53)");
            }
            Modifier modifierM = androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, H1.h.p(16), 0.0f, 0.0f, H1.h.p(24), 6, null);
            LocalThemeScope localThemeScope = this.f15228a;
            AddressDecorator addressDecorator = this.f15229b;
            Function0<Unit> function0 = this.f15230c;
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
            androidx.compose.ui.layout.A.a(C16705m.d(modifierM, false, new e(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new f(nVar, 6, pairH.b(), localThemeScope, addressDecorator, function0)), pairH.a(), composer, 48, 0);
            composer.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        a(LocalThemeScope localThemeScope, AddressDecorator addressDecorator, Function0<Unit> function0) {
            this.f15228a = localThemeScope;
            this.f15229b = addressDecorator;
            this.f15230c = function0;
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
    public static final void b(final Ji.LocalThemeScope r19, final Sh.AddressDecorator r20, androidx.compose.ui.Modifier r21, final kotlin.jvm.functions.Function0<kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Jh.C3807b.b(Ji.M, Sh.a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, AddressDecorator addressDecorator, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, addressDecorator, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
