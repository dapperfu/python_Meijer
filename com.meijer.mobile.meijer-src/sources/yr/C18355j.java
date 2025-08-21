package yr;

import F1.j;
import Ki.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import d0.C13590y;
import dk.C13698b;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14882C;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16188p;
import oi.C16194s0;
import oi.P0;
import p1.C16335d;
import p1.C16338g;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a¯\u0001\u0010\u0019\u001a\u00020\u0015*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001f²\u0006\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "errorOrEmptyStateImage", "Landroidx/compose/ui/layout/k;", "errorOrEmptyStateImageContentScale", "errorOrEmptyStateTitle", "Lbk/a;", "errorOrEmptyStateDescription", "LKi/C;", "errorOrEmptyStateButtonIcon", "errorOrEmptyStateButtonText", "LV0/D1;", "shape", "", "header", "Lj0/C;", "padding", "contentPadding", "Lkotlin/Function0;", "", "footerContent", "buttonId", "onButtonClick", "b", "(LKi/M;Landroidx/compose/ui/Modifier;ILandroidx/compose/ui/layout/k;ILbk/a;LKi/C;ILV0/D1;Ljava/lang/String;Lj0/C;Lj0/C;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "lastAction", "", "isButtonIconOn", "selection", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: yr.j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C18355j {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: yr.j$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC14882C f171959a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f171960b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f171961c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5926k f171962d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f171963e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f171964f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f171965g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f171966h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Ki.C f171967i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f171968j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f171969k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f171970l;

        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC14882C interfaceC14882C, String str, int i10, InterfaceC5926k interfaceC5926k, LocalThemeScope localThemeScope, int i11, AbstractC6392a abstractC6392a, Function2<? super Composer, ? super Integer, Unit> function2, Ki.C c10, String str2, int i12, Function0<Unit> function0) {
            this.f171959a = interfaceC14882C;
            this.f171960b = str;
            this.f171961c = i10;
            this.f171962d = interfaceC5926k;
            this.f171963e = localThemeScope;
            this.f171964f = i11;
            this.f171965g = abstractC6392a;
            this.f171966h = function2;
            this.f171967i = c10;
            this.f171968j = str2;
            this.f171969k = i12;
            this.f171970l = function0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Composer composer, int i10) {
            Function2<Composer, Integer, Unit> function2;
            AbstractC6392a abstractC6392a;
            Ki.C c10;
            LocalThemeScope localThemeScope;
            int i11;
            String str;
            int i12;
            Modifier.Companion companion;
            Function2<Composer, Integer, Unit> function22;
            String str2;
            Unit unit;
            Modifier.Companion companion2;
            int i13;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1701942178, i10, -1, "com.meijer.mobile.ui.common.ErrorOrEmptyStateCard.<anonymous> (ErrorOrEmptyStateCard.kt:103)");
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierH = androidx.compose.foundation.layout.D.h(androidx.compose.foundation.layout.J.h(companion3, 0.0f, 1, null), this.f171959a);
            String str3 = this.f171960b;
            int i14 = this.f171961c;
            InterfaceC5926k interfaceC5926k = this.f171962d;
            LocalThemeScope localThemeScope2 = this.f171963e;
            int i15 = this.f171964f;
            AbstractC6392a abstractC6392a2 = this.f171965g;
            Function2<Composer, Integer, Unit> function23 = this.f171966h;
            Ki.C c11 = this.f171967i;
            String str4 = this.f171968j;
            int i16 = this.f171969k;
            Function0<Unit> function0 = this.f171970l;
            C5800d.m mVarH = C5800d.f48779a.h();
            e.Companion companion4 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion4.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
            InterfaceC5953g.Companion companion5 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion5.a();
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
            D1.c(composerA, measurePolicyA, companion5.e());
            D1.c(composerA, interfaceC5884sR, companion5.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion5.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion5.f());
            C14903g c14903g = C14903g.f139698a;
            composer.startReplaceGroup(394294334);
            if (str3 == null) {
                localThemeScope = localThemeScope2;
                abstractC6392a = abstractC6392a2;
                function2 = function23;
                c10 = c11;
                i11 = 0;
            } else {
                function2 = function23;
                abstractC6392a = abstractC6392a2;
                c10 = c11;
                si.j.h(localThemeScope2, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getSix(), null, 383, null), str3, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                localThemeScope = localThemeScope2;
                i11 = 0;
                C14890K.a(androidx.compose.foundation.layout.J.i(companion3, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
                Unit unit2 = Unit.f143329a;
            }
            composer.P();
            boolean z10 = i11;
            Function2<Composer, Integer, Unit> function24 = function2;
            C13590y.a(C16335d.c(i14, composer, i11), null, androidx.compose.foundation.layout.J.h(companion3, 0.0f, 1, null), null, interfaceC5926k, 0.0f, null, composer, 432, 104);
            Composer composer2 = composer;
            C14890K.a(androidx.compose.foundation.layout.J.i(companion3, localThemeScope.getAdsSpacing().getFive().getDp()), composer2, z10 ? 1 : 0);
            Modifier modifierC = c14903g.c(companion3, companion4.g());
            Ki.I six = localThemeScope.getAdsTypography().getHeadings().getSix();
            j.Companion companion6 = F1.j.INSTANCE;
            q1.Label label = new q1.Label(modifierC, null, null, F1.j.h(companion6.a()), 0, false, 0, six, null, 374, null);
            String strC = C16338g.c(i15, composer2, z10 ? 1 : 0);
            int i17 = LocalThemeScope.f17314g;
            int i18 = q1.Label.f142335j;
            LocalThemeScope localThemeScope3 = localThemeScope;
            si.j.h(localThemeScope3, label, strC, null, composer2, i17 | (i18 << 3), 4);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion3, localThemeScope3.getAdsSpacing().getFive().getDp()), composer2, z10 ? 1 : 0);
            si.j.h(localThemeScope3, new q1.Label(c14903g.c(companion3, companion4.g()), null, null, F1.j.h(companion6.a()), 0, false, 0, localThemeScope3.getAdsTypography().getBody().getOne(), null, 374, null), C13698b.a(abstractC6392a, composer2, AbstractC6392a.f60445b), null, composer2, i17 | (i18 << 3), 4);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion3, localThemeScope3.getAdsSpacing().getFive().getDp()), composer2, z10 ? 1 : 0);
            Modifier modifierK = androidx.compose.foundation.layout.D.k(companion3, localThemeScope3.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
            MeasurePolicy measurePolicyG = C5804h.g(companion4.o(), z10);
            int iA2 = C5859f.a(composer2, z10 ? 1 : 0);
            InterfaceC5884s interfaceC5884sR2 = composer2.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer2, modifierK);
            Function0<InterfaceC5953g> function0A2 = companion5.a();
            if (composer2.k() == null) {
                C5859f.c();
            }
            composer2.F();
            if (composer2.getInserting()) {
                composer2.I(function0A2);
            } else {
                composer2.s();
            }
            Composer composerA2 = D1.a(composer2);
            D1.c(composerA2, measurePolicyG, companion5.e());
            D1.c(composerA2, interfaceC5884sR2, companion5.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion5.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion5.f());
            C5806j c5806j = C5806j.f48836a;
            composer2.startReplaceGroup(821410263);
            if (c10 == null) {
                str2 = str4;
                companion = companion3;
                i12 = i16;
                function22 = function24;
                str = null;
                unit = null;
            } else {
                str = null;
                i12 = i16;
                companion = companion3;
                function22 = function24;
                str2 = str4;
                P0.h(localThemeScope3, C16188p.f154218a, function0, c10, C16338g.c(i16, composer2, z10 ? 1 : 0), C18370z.f(companion3, str4, null, 2, null), C16338g.c(i16, composer2, z10 ? 1 : 0), true, false, false, 0L, composer2, i17 | 12582912 | (C16188p.f154219b << 3) | (Ki.C.f16859b << 9), 0, 896);
                composer2 = composer2;
                unit = Unit.f143329a;
            }
            composer2.P();
            composer2.startReplaceGroup(821409786);
            if (unit == null) {
                companion2 = companion;
                int i19 = i12;
                i13 = 0;
                Composer composer3 = composer2;
                P0.k(localThemeScope3, C16194s0.f154251a, C16338g.c(i19, composer2, 0), function0, C18370z.f(companion2, str2, str, 2, str), C16338g.c(i19, composer2, 0), true, 0L, false, composer3, i17 | 1572864 | (C16194s0.f154252b << 3), 192);
                composer2 = composer3;
            } else {
                companion2 = companion;
                i13 = 0;
            }
            composer2.P();
            composer2.v();
            composer2.startReplaceGroup(394381100);
            Function2<Composer, Integer, Unit> function25 = function22;
            Object obj = str;
            if (function25 != null) {
                function25.invoke(composer2, Integer.valueOf(i13));
                obj = Unit.f143329a;
            }
            composer2.P();
            composer2.startReplaceGroup(394380693);
            if (obj == null) {
                C14890K.a(androidx.compose.foundation.layout.J.i(companion2, localThemeScope3.getAdsSpacing().getFive().getDp()), composer2, i13);
            }
            composer2.P();
            composer2.v();
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

    /* JADX WARN: Removed duplicated region for block: B:104:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:266:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r31, androidx.compose.ui.Modifier r32, int r33, androidx.compose.ui.layout.InterfaceC5926k r34, int r35, bk.AbstractC6392a r36, Ki.C r37, int r38, V0.D1 r39, java.lang.String r40, j0.InterfaceC14882C r41, j0.InterfaceC14882C r42, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r43, java.lang.String r44, final kotlin.jvm.functions.Function0<kotlin.Unit> r45, androidx.compose.runtime.Composer r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yr.C18355j.b(Ki.M, androidx.compose.ui.Modifier, int, androidx.compose.ui.layout.k, int, bk.a, Ki.C, int, V0.D1, java.lang.String, j0.C, j0.C, kotlin.jvm.functions.Function2, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, int i10, InterfaceC5926k interfaceC5926k, int i11, AbstractC6392a abstractC6392a, Ki.C c10, int i12, V0.D1 d12, String str, InterfaceC14882C interfaceC14882C, InterfaceC14882C interfaceC14882C2, Function2 function2, String str2, Function0 function0, int i13, int i14, int i15, Composer composer, int i16) {
        b(localThemeScope, modifier, i10, interfaceC5926k, i11, abstractC6392a, c10, i12, d12, str, interfaceC14882C, interfaceC14882C2, function2, str2, function0, composer, J0.a(i13 | 1), J0.a(i14), i15);
        return Unit.f143329a;
    }
}
