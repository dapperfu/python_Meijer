package ns;

import Ki.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
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
import d0.C13590y;
import j0.C14903g;
import j0.InterfaceC14902f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16335d;
import p1.C16338g;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aW\u0010\f\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "LV0/q0;", "backgroundColor", "", "shouldHideIcon", "shouldApplyWeight", "Lkotlin/Function0;", "", "actionContent", "content", "b", "(LKi/M;Landroidx/compose/ui/Modifier;JZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "mperks_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ns.A, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C16016A {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: ns.A$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152990a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f152991b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f152992c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f152993d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f152994e;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, boolean z10, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, boolean z11) {
            this.f152990a = localThemeScope;
            this.f152991b = z10;
            this.f152992c = function2;
            this.f152993d = function22;
            this.f152994e = z11;
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
            Modifier modifierI = D.i(companion, this.f152990a.getAdsSpacing().getFive().getDp());
            C5800d.f fVarE = C5800d.f48779a.e();
            boolean z10 = this.f152991b;
            Function2<Composer, Integer, Unit> function22 = this.f152992c;
            Function2<Composer, Integer, Unit> function23 = this.f152993d;
            boolean z11 = this.f152994e;
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(fVarE, companion2.k(), composer, 6);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
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
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            Modifier modifierThen = J.h(J.D(companion, null, false, 3, null), 0.0f, 1, null).then(z10 ? InterfaceC14902f.b(C14903g.f139698a, companion, 1.0f, false, 2, null) : companion);
            MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierThen);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyG, companion3.e());
            D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C5806j c5806j = C5806j.f48836a;
            function23.invoke(composer, 0);
            composer.startReplaceGroup(-402169869);
            if (z11) {
                function2 = function22;
            } else {
                float f10 = 20;
                function2 = function22;
                C13590y.a(C16335d.c(s.f153123c, composer, 0), C16338g.c(u.f153204y, composer, 0), androidx.compose.foundation.layout.A.b(c5806j.g(J.i(J.z(companion, H1.h.p(f10)), H1.h.p(f10)), companion2.n()), H1.h.p(8), H1.h.p(-8)), null, InterfaceC5926k.INSTANCE.d(), 0.0f, null, composer, 24576, 104);
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
            return Unit.f143329a;
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
    public static final void b(final Ki.LocalThemeScope r22, androidx.compose.ui.Modifier r23, long r24, boolean r26, boolean r27, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r28, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ns.C16016A.b(Ki.M, androidx.compose.ui.Modifier, long, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, long j10, boolean z10, boolean z11, Function2 function2, Function2 function22, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, j10, z10, z11, function2, function22, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
