package com.meijer.mobile.reviews.ux.rateandreview;

import Ji.LocalThemeScope;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5726j0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.semantics.Role;
import com.meijer.mobile.reviews.ux.rateandreview.C12793r0;
import d0.InterfaceC13428B;
import j0.C14801J;
import j0.C14802K;
import ji.InterfaceC14930d0;
import ji.q1;
import kotlin.C17916Y0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "", "onUpdateRecommendationStatus", "b", "(LJi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.reviews.ux.rateandreview.r0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C12793r0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.r0$a */
    static final class a implements Function3<InterfaceC14930d0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f116439a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5726j0 f116440b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f116441c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f116442d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f116443e;

        /* JADX WARN: Multi-variable type inference failed */
        a(int i10, InterfaceC5726j0 interfaceC5726j0, Function1<? super Integer, Unit> function1, LocalThemeScope localThemeScope, String str) {
            this.f116439a = i10;
            this.f116440b = interfaceC5726j0;
            this.f116441c = function1;
            this.f116442d = localThemeScope;
            this.f116443e = str;
        }

        public final void b(InterfaceC14930d0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1328470634, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.RecommendProductSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecommendProductSection.kt:79)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            boolean z10 = this.f116439a == this.f116440b.a();
            InterfaceC13428B interfaceC13428BF = C17916Y0.f(false, 0.0f, 0L, 7, null);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = h0.k.a();
                composer.t(objB);
            }
            h0.l lVar = (h0.l) objB;
            composer.P();
            Role roleJ = Role.j(Role.INSTANCE.f());
            composer.startReplaceGroup(-1746271574);
            boolean zD = composer.d(this.f116439a) | composer.V(this.f116441c);
            final InterfaceC5726j0 interfaceC5726j0 = this.f116440b;
            final int i11 = this.f116439a;
            final Function1<Integer, Unit> function1 = this.f116441c;
            Object objB2 = composer.B();
            if (zD || objB2 == companion2.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.q0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12793r0.a.c(interfaceC5726j0, i11, function1);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            Modifier modifierM4selectableO2vRcR0 = SelectableKt.m4selectableO2vRcR0(companion, z10, lVar, interfaceC13428BF, true, roleJ, (Function0) objB2);
            int i12 = this.f116439a;
            InterfaceC5726j0 interfaceC5726j02 = this.f116440b;
            LocalThemeScope localThemeScope = this.f116442d;
            String str = this.f116443e;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierM4selectableO2vRcR0);
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
            q1.s.RadioButton defaultToggleButton = Assemble.getToggleButtons().getDefaultToggleButton();
            boolean z11 = i12 == interfaceC5726j02.a();
            int i13 = LocalThemeScope.f15770g;
            vi.s.b(localThemeScope, defaultToggleButton, z11, true, false, null, composer, i13 | 3072 | (q1.s.RadioButton.f140178e << 3), 24);
            C14802K.a(androidx.compose.foundation.layout.J.z(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            ri.j.h(localThemeScope, Assemble.getLabels().getItemLabelEnabled(), str, null, composer, i13 | (q1.Label.f140080j << 3), 4);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14930d0 interfaceC14930d0, Composer composer, Integer num) {
            b(interfaceC14930d0, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC5726j0 interfaceC5726j0, int i10, Function1 function1) {
            interfaceC5726j0.j(i10);
            function1.invoke(Integer.valueOf(i10));
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x033c A[EDGE_INSN: B:103:0x033c->B:95:0x033c BREAK  A[LOOP:0: B:89:0x02ff->B:94:0x0311], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0366  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r38, androidx.compose.ui.Modifier r39, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 897
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.rateandreview.C12793r0.b(Ji.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
