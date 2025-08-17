package Xq;

import Ji.C;
import Ji.LocalThemeScope;
import P0.e;
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
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.recyclerview.widget.RecyclerView;
import ck.C6408b;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16193g;
import pi.C16307b;
import ps.j0;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aA\u0010\n\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\f\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\f\u0010\r\u001a9\u0010\u000e\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0013²\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "LTq/k;", "storeDetails", "", "isNewAddressQualifier", "Lkotlin/Function1;", "", "onClick", "e", "(LJi/M;Landroidx/compose/ui/Modifier;LTq/k;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "j", "(LJi/M;Landroidx/compose/ui/Modifier;LTq/k;Landroidx/compose/runtime/Composer;II)V", "g", "(LJi/M;Landroidx/compose/ui/Modifier;LTq/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "isNewAddressQualifierEnabled", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f39642a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Tq.k f39643b;

        a(LocalThemeScope localThemeScope, Tq.k kVar) {
            this.f39642a = localThemeScope;
            this.f39643b = kVar;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(714229053, i10, -1, "com.meijer.mobile.store.ux.compose.LegacyCurrentStoreBanner.<anonymous> (CurrentStoreBanner.kt:111)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = D.i(companion, this.f39642a.getAdsSpacing().getFive().getDp());
            LocalThemeScope localThemeScope = this.f39642a;
            Tq.k kVar = this.f39643b;
            MeasurePolicy measurePolicyB = G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
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
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14801J c14801j = C14801J.f139030a;
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.c.k.f15407e, C16193g.c(j0.f156562l, composer, 0), null, null, 0.0f, null, null, 124, null);
            int i11 = LocalThemeScope.f15770g;
            int i12 = q1.h.DrawableIcon.f140067h;
            C16307b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (i12 << 3), 6);
            C14802K.a(J.z(companion, localThemeScope.getAdsSpacing().getTwo().getDp()), composer, 0);
            q1.Label label = new q1.Label(null, localThemeScope.getAdsColors().getAdsColorSupportSuccess(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 381, null);
            String strC = C16193g.c(j0.f156558h, composer, 0);
            int i13 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, strC, null, composer, i11 | (i13 << 3), 4);
            C14802K.a(J.z(companion, localThemeScope.getAdsSpacing().getTwo().getDp()), composer, 0);
            q1.Label label2 = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 383, null);
            String name = kVar.getName();
            if (name == null) {
                name = "";
            }
            ri.j.h(localThemeScope, label2, name, null, composer, i11 | (i13 << 3), 4);
            C14802K.a(InterfaceC14800I.b(c14801j, companion, 1.0f, false, 2, null), composer, 0);
            C16307b.b(localThemeScope, new q1.h.DrawableIcon(C.f.i.f15513e, C16193g.c(j0.f156562l, composer, 0), null, null, 0.0f, null, null, 124, null), null, null, composer, i11 | (i12 << 3), 6);
            composer.v();
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
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f39644a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Tq.k f39645b;

        b(LocalThemeScope localThemeScope, Tq.k kVar) {
            this.f39644a = localThemeScope;
            this.f39645b = kVar;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(654499606, i10, -1, "com.meijer.mobile.store.ux.compose.NewCurrentStoreBanner.<anonymous> (CurrentStoreBanner.kt:65)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = D.i(companion, this.f39644a.getAdsSpacing().getThree().getDp());
            LocalThemeScope localThemeScope = this.f39644a;
            Tq.k kVar = this.f39645b;
            C5658d c5658d = C5658d.f48555a;
            C5658d.e eVarG = c5658d.g();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyB = G.b(eVarG, companion2.l(), composer, 0);
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
            D1.c(composerA, measurePolicyB, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.c.k.f15407e, null, null, null, 0.0f, null, null, 126, null);
            int i11 = LocalThemeScope.f15770g;
            C16307b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f140067h << 3), 6);
            C14802K.a(J.z(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            MeasurePolicy measurePolicyA = C5665k.a(c5658d.h(), companion2.k(), composer, 0);
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
            D1.c(composerA2, measurePolicyA, companion3.e());
            D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            MeasurePolicy measurePolicyB2 = G.b(c5658d.g(), companion2.l(), composer, 0);
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
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight(), null, 383, null);
            String name = kVar.getName();
            if (name == null) {
                name = "";
            }
            int i12 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, name, null, composer, i11 | (i12 << 3), 4);
            C14802K.a(InterfaceC14800I.b(c14801j, companion, 1.0f, false, 2, null), composer, 0);
            q1.Label label2 = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight(), null, 383, null);
            AbstractC5607a.Companion companion4 = AbstractC5607a.INSTANCE;
            int i13 = j0.f156561k;
            Double milesFrom = kVar.getMilesFrom();
            ri.j.h(localThemeScope, label2, C6408b.a(companion4.d(i13, Double.valueOf(milesFrom != null ? milesFrom.doubleValue() : 0.0d)), composer, AbstractC5607a.f45514b), null, composer, i11 | (i12 << 3), 4);
            composer.v();
            C14802K.a(J.z(companion, localThemeScope.getAdsSpacing().getTwo().getDp()), composer, 0);
            ri.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorSupportSuccess(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne(), null, 381, null), C16193g.c(j0.f156564n, composer, 0), null, composer, i11 | (i12 << 3), 4);
            composer.v();
            composer.v();
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

    public static final void e(LocalThemeScope localThemeScope, Modifier modifier, Tq.k storeDetails, final boolean z10, Function1<? super Tq.k, Unit> onClick, Composer composer, final int i10, final int i11) {
        int i12;
        LocalThemeScope localThemeScope2;
        Tq.k kVar;
        final Function1<? super Tq.k, Unit> function1;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(storeDetails, "storeDetails");
        Intrinsics.j(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(791137092);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.D(storeDetails) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.a(z10) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 8) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.D(onClick) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            localThemeScope2 = localThemeScope;
            kVar = storeDetails;
            function1 = onClick;
            modifier2 = modifier;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(791137092, i12, -1, "com.meijer.mobile.store.ux.compose.CurrentStoreBanner (CurrentStoreBanner.kt:44)");
            }
            if (z10) {
                composerStartRestartGroup.startReplaceGroup(-2015183739);
                localThemeScope2 = localThemeScope;
                kVar = storeDetails;
                j(localThemeScope2, modifier3, kVar, composerStartRestartGroup, LocalThemeScope.f15770g | (i12 & 14) | (i12 & 112) | (i12 & 896), 0);
                composerStartRestartGroup.P();
                function1 = onClick;
            } else {
                localThemeScope2 = localThemeScope;
                kVar = storeDetails;
                composerStartRestartGroup.startReplaceGroup(-2015056701);
                g(localThemeScope2, modifier3, kVar, onClick, composerStartRestartGroup, LocalThemeScope.f15770g | (i12 & 14) | (i12 & 112) | (i12 & 896) | ((i12 >> 3) & 7168), 0);
                function1 = onClick;
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            final LocalThemeScope localThemeScope3 = localThemeScope2;
            final Tq.k kVar2 = kVar;
            t0L.a(new Function2() { // from class: Xq.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return e.f(localThemeScope3, modifier2, kVar2, z10, function1, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, Modifier modifier, Tq.k kVar, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, modifier, kVar, z10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ji.LocalThemeScope r21, androidx.compose.ui.Modifier r22, final Tq.k r23, final kotlin.jvm.functions.Function1<? super Tq.k, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Xq.e.g(Ji.M, androidx.compose.ui.Modifier, Tq.k, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, Modifier modifier, Tq.k kVar, Function1 function1, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, modifier, kVar, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final Ji.LocalThemeScope r17, androidx.compose.ui.Modifier r18, final Tq.k r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Xq.e.j(Ji.M, androidx.compose.ui.Modifier, Tq.k, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, Modifier modifier, Tq.k kVar, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, modifier, kVar, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Function1 function1, Tq.k kVar) {
        function1.invoke(kVar);
        return Unit.f142422a;
    }
}
