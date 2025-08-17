package Gs;

import Gs.g;
import Ji.C;
import Ji.LocalThemeScope;
import Js.WeeklyAdItem;
import P0.e;
import ak.AbstractC5607a;
import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b5.C6197c;
import ck.C6408b;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import ji.q1;
import kotlin.C17917Z;
import kotlin.InterfaceC6166e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import l5.C15372h;
import p1.C16193g;
import pi.C16307b;
import us.C17304B;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u001aU\u0010\u000f\u001a\u00020\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0012\u001a\u00020\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "LJs/b;", "weeklyAdItem", "", "isOnShoppingList", "Lak/a;", "validThruDate", "isFromShoppingList", "Ll5/h$a;", "builder", "Lkotlin/Function0;", "", "onAction", "c", "(LJi/M;Landroidx/compose/ui/Modifier;LJs/b;ZLak/a;ZLl5/h$a;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "showShoppingListIcon", "e", "(LJi/M;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f11868a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f11869b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f11870c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f11871d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C15372h.a f11872e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ WeeklyAdItem f11873f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f11874g;

        a(boolean z10, Function0<Unit> function0, LocalThemeScope localThemeScope, boolean z11, C15372h.a aVar, WeeklyAdItem weeklyAdItem, AbstractC5607a abstractC5607a) {
            this.f11868a = z10;
            this.f11869b = function0;
            this.f11870c = localThemeScope;
            this.f11871d = z11;
            this.f11872e = aVar;
            this.f11873f = weeklyAdItem;
            this.f11874g = abstractC5607a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v42, types: [androidx.compose.ui.Modifier] */
        /* JADX WARN: Type inference failed for: r38v0, types: [androidx.compose.runtime.Composer] */
        public final void b(Composer composer, int i10) {
            WeeklyAdItem weeklyAdItem;
            AbstractC5607a abstractC5607a;
            Modifier.Companion companion;
            boolean z10;
            LocalThemeScope localThemeScope;
            String description;
            String saleStory;
            WeeklyAdItem.PriceText priceText;
            String strA;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-826670679, i10, -1, "com.meijer.mobile.weeklyad.compose.weeklyAdDetail.WeeklyAdDetailItemCard.<anonymous> (WeeklyAdDetailItemCard.kt:71)");
            }
            Modifier.Companion companionD = Modifier.INSTANCE;
            Modifier modifierI = D.i(companionD, H1.h.p(16));
            e.b bVarG = P0.e.INSTANCE.g();
            boolean z11 = this.f11868a;
            final Function0<Unit> function0 = this.f11869b;
            LocalThemeScope localThemeScope2 = this.f11870c;
            boolean z12 = this.f11871d;
            C15372h.a aVar = this.f11872e;
            WeeklyAdItem weeklyAdItem2 = this.f11873f;
            AbstractC5607a abstractC5607a2 = this.f11874g;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), bVarG, composer, 48);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            composer.startReplaceGroup(1197994575);
            if (z11) {
                weeklyAdItem = weeklyAdItem2;
                abstractC5607a = abstractC5607a2;
                companion = companionD;
            } else {
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(function0);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Gs.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return g.a.c(function0);
                        }
                    };
                    composer.t(objB);
                }
                Function0 function02 = (Function0) objB;
                composer.P();
                weeklyAdItem = weeklyAdItem2;
                abstractC5607a = abstractC5607a2;
                companion = companionD;
                companionD = ClickableKt.d(companionD, false, null, null, function02, 7, null);
            }
            composer.P();
            Modifier modifierThen = companion.then(companionD);
            int i11 = LocalThemeScope.f15770g;
            AbstractC5607a abstractC5607a3 = abstractC5607a;
            g.e(localThemeScope2, modifierThen, true, z12, composer, i11 | 384, 0);
            Modifier.Companion companion3 = companion;
            WeeklyAdItem weeklyAdItem3 = weeklyAdItem;
            C6197c.e(aVar.f(weeklyAdItem != null ? weeklyAdItem.getDetailImageUrl() : null).e(true).p(C17304B.f163303a).j(C17304B.f163303a).c(), null, Z4.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())), J.i(D.i(companion, H1.h.p(20)), H1.h.p(160)), null, null, null, InterfaceC5784k.INSTANCE.c(), 0.0f, null, 0, false, null, composer, 12586032, 0, 8048);
            float f10 = 14;
            C14802K.a(J.i(companion3, H1.h.p(f10)), composer, 6);
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getSix(), null, 383, null);
            String productName = weeklyAdItem3 != null ? weeklyAdItem3.getProductName() : null;
            String str = productName == null ? "" : productName;
            int i12 = q1.Label.f140080j;
            ri.j.h(localThemeScope2, label, str, null, composer, i11 | (i12 << 3), 4);
            composer.startReplaceGroup(1198026975);
            if (weeklyAdItem3 == null || (priceText = weeklyAdItem3.getPriceText()) == null || (strA = priceText.a()) == null) {
                z10 = true;
            } else {
                z10 = true;
                if (!StringsKt.r0(strA)) {
                    C14802K.a(J.i(companion3, H1.h.p(f10)), composer, 6);
                    q1.Label label2 = new q1.Label(null, localThemeScope2.getAdsColors().getAdsColorSavings(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getValues().getThree(), null, 381, null);
                    WeeklyAdItem.PriceText priceText2 = weeklyAdItem3.getPriceText();
                    String strA2 = priceText2 != null ? priceText2.a() : null;
                    ri.j.h(localThemeScope2, label2, strA2 == null ? "" : strA2, null, composer, i11 | (i12 << 3), 4);
                }
            }
            composer.P();
            composer.startReplaceGroup(1198041156);
            if (weeklyAdItem3 != null && (saleStory = weeklyAdItem3.getSaleStory()) != null && (StringsKt.r0(saleStory) ^ z10) == z10) {
                C14802K.a(J.i(companion3, H1.h.p(12)), composer, 6);
                q1.Label label3 = new q1.Label(null, localThemeScope2.getAdsColors().getAdsColorText02(), null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope2.getAdsTypography().getBody().getTwo(), null, 373, null);
                String saleStory2 = weeklyAdItem3.getSaleStory();
                if (saleStory2 == null) {
                    saleStory2 = "";
                }
                ri.j.h(localThemeScope2, label3, saleStory2, null, composer, i11 | (i12 << 3), 4);
            }
            composer.P();
            float f11 = 12;
            C14802K.a(J.i(companion3, H1.h.p(f11)), composer, 6);
            C17917Z.a(J.z(companion3, H1.h.p(280)), localThemeScope2.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 6, 12);
            composer.startReplaceGroup(1198062856);
            if (weeklyAdItem3 == null || (description = weeklyAdItem3.getDescription()) == null || (StringsKt.r0(description) ^ z10) != z10) {
                localThemeScope = localThemeScope2;
            } else {
                C14802K.a(J.i(companion3, H1.h.p(f11)), composer, 6);
                q1.Label label4 = new q1.Label(null, localThemeScope2.getAdsColors().getAdsColorText02(), null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope2.getAdsTypography().getBody().getTwo(), null, 373, null);
                String description2 = weeklyAdItem3.getDescription();
                String str2 = description2 == null ? "" : description2;
                localThemeScope = localThemeScope2;
                ri.j.h(localThemeScope, label4, str2, null, composer, i11 | (i12 << 3), 4);
            }
            composer.P();
            C14802K.a(J.i(companion3, H1.h.p(f11)), composer, 6);
            ri.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 373, null), C6408b.a(abstractC5607a3, composer, AbstractC5607a.f45514b), null, composer, i11 | (i12 << 3), 4);
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
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC6166e, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f11875a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f11876b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f11877c;

        b(Modifier modifier, boolean z10, LocalThemeScope localThemeScope) {
            this.f11875a = modifier;
            this.f11876b = z10;
            this.f11877c = localThemeScope;
        }

        public final void a(InterfaceC6166e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(543232043, i10, -1, "com.meijer.mobile.weeklyad.compose.weeklyAdDetail.WeeklyAdShoppingDetailListIcon.<anonymous> (WeeklyAdDetailItemCard.kt:170)");
            }
            Modifier modifier = this.f11875a;
            boolean z10 = this.f11876b;
            LocalThemeScope localThemeScope = this.f11877c;
            Modifier.Companion companion = Modifier.INSTANCE;
            C5658d c5658d = C5658d.f48555a;
            C5658d.e eVarG = c5658d.g();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyB = G.b(eVarG, companion2.l(), composer, 0);
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
            C5662h.a(InterfaceC14800I.b(C14801J.f139030a, companion, 1.0f, false, 2, null), composer, 0);
            float f10 = 4;
            Modifier modifierM = D.m(modifier, 0.0f, 0.0f, H1.h.p(f10), 0.0f, 11, null);
            MeasurePolicy measurePolicyA = C5665k.a(c5658d.h(), companion2.g(), composer, 48);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierM);
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
            composer.startReplaceGroup(-55989064);
            if (z10) {
                q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.j.t.f15595d, null, null, null, 0.0f, null, null, 126, null);
                int i11 = LocalThemeScope.f15770g;
                C16307b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f140067h << 3), 6);
                C14802K.a(J.i(companion, H1.h.p(f10)), composer, 6);
                ri.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getNine(), null, 381, null), C16193g.c(Bs.a.f3253a, composer, 0), null, composer, i11 | (q1.Label.f140080j << 3), 4);
            }
            composer.P();
            composer.v();
            composer.v();
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ji.LocalThemeScope r22, androidx.compose.ui.Modifier r23, final Js.WeeklyAdItem r24, final boolean r25, final ak.AbstractC5607a r26, final boolean r27, final l5.C15372h.a r28, final kotlin.jvm.functions.Function0<kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Gs.g.c(Ji.M, androidx.compose.ui.Modifier, Js.b, boolean, ak.a, boolean, l5.h$a, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LocalThemeScope localThemeScope, Modifier modifier, WeeklyAdItem weeklyAdItem, boolean z10, AbstractC5607a abstractC5607a, boolean z11, C15372h.a aVar, Function0 function0, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, modifier, weeklyAdItem, z10, abstractC5607a, z11, aVar, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final Ji.LocalThemeScope r19, androidx.compose.ui.Modifier r20, final boolean r21, final boolean r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Gs.g.e(Ji.M, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, boolean z11, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, modifier, z10, z11, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
