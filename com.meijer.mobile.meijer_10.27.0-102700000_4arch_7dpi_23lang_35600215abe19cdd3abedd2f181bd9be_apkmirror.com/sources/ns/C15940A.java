package ns;

import Ji.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
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
import d0.C13457y;
import j0.C14815g;
import j0.InterfaceC14814f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16190d;
import p1.C16193g;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aW\u0010\f\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "LV0/q0;", "backgroundColor", "", "shouldHideIcon", "shouldApplyWeight", "Lkotlin/Function0;", "", "actionContent", "content", "b", "(LJi/M;Landroidx/compose/ui/Modifier;JZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "mperks_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ns.A, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15940A {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: ns.A$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152538a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f152539b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f152540c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f152541d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f152542e;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, boolean z10, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, boolean z11) {
            this.f152538a = localThemeScope;
            this.f152539b = z10;
            this.f152540c = function2;
            this.f152541d = function22;
            this.f152542e = z11;
        }

        public final void a(Composer composer, int i10) {
            Function2<Composer, Integer, Unit> function2;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-780266718, i10, -1, "com.meijer.mobile.ui.mperks.RewardCard.<anonymous> (RewardCard.kt:63)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = D.i(companion, this.f152538a.getAdsSpacing().getFive().getDp());
            C5658d.f fVarE = C5658d.f48555a.e();
            boolean z10 = this.f152539b;
            Function2<Composer, Integer, Unit> function22 = this.f152540c;
            Function2<Composer, Integer, Unit> function23 = this.f152541d;
            boolean z11 = this.f152542e;
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(fVarE, companion2.k(), composer, 6);
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
            Modifier modifierThen = J.h(J.D(companion, null, false, 3, null), 0.0f, 1, null).then(z10 ? InterfaceC14814f.b(C14815g.f139108a, companion, 1.0f, false, 2, null) : companion);
            MeasurePolicy measurePolicyG = C5662h.g(companion2.o(), false);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierThen);
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
            D1.c(composerA2, measurePolicyG, companion3.e());
            D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C5664j c5664j = C5664j.f48612a;
            function23.invoke(composer, 0);
            composer.startReplaceGroup(-402169869);
            if (z11) {
                function2 = function22;
            } else {
                float f10 = 20;
                function2 = function22;
                C13457y.a(C16190d.c(s.f152671c, composer, 0), C16193g.c(u.f152752y, composer, 0), androidx.compose.foundation.layout.A.b(c5664j.g(J.i(J.z(companion, H1.h.p(f10)), H1.h.p(f10)), companion2.n()), H1.h.p(8), H1.h.p(-8)), null, InterfaceC5784k.INSTANCE.d(), 0.0f, null, composer, 24576, 104);
            }
            composer.P();
            composer.v();
            function2.invoke(composer, 0);
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r22, androidx.compose.ui.Modifier r23, long r24, boolean r26, boolean r27, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r28, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ns.C15940A.b(Ji.M, androidx.compose.ui.Modifier, long, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, long j10, boolean z10, boolean z11, Function2 function2, Function2 function22, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, j10, z10, z11, function2, function22, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
