package Lh;

import Ji.LocalThemeScope;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import ck.C6408b;
import j0.C14801J;
import j0.C14802K;
import ji.C14927c;
import ji.InterfaceC14914Q;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import yr.C18299z;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001au\u0010\u0012\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LJi/M;", "Lak/a;", "label", "", "checked", "Landroidx/compose/ui/focus/y;", "focusRequester", "Landroidx/compose/ui/Modifier;", "modifier", "", "checkboxViewId", "tooltipViewId", "tooltipContentDescription", "Lkotlin/Function1;", "", "onCheckedChange", "Lkotlin/Function0;", "onTooltipClick", "b", "(LJi/M;Lak/a;ZLandroidx/compose/ui/focus/y;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lak/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Lh.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4078f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Lh.f$a */
    static final class a implements Function3<InterfaceC14914Q, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f18233a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f18234b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f18235c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f18236d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f18237e;

        /* JADX WARN: Multi-variable type inference failed */
        a(String str, LocalThemeScope localThemeScope, boolean z10, Function1<? super Boolean, Unit> function1, AbstractC5607a abstractC5607a) {
            this.f18233a = str;
            this.f18234b = localThemeScope;
            this.f18235c = z10;
            this.f18236d = function1;
            this.f18237e = abstractC5607a;
        }

        public final void a(InterfaceC14914Q Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1621481371, i10, -1, "com.meijer.mobile.accounts.ux.composables.createaccount.CreateAccountCheckbox.<anonymous>.<anonymous> (CreateAccountCheckbox.kt:63)");
            }
            String str = this.f18233a;
            LocalThemeScope localThemeScope = this.f18234b;
            boolean z10 = this.f18235c;
            Function1<Boolean, Unit> function1 = this.f18236d;
            AbstractC5607a abstractC5607a = this.f18237e;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
            q1.s.Checkbox checkbox = new q1.s.Checkbox(C18299z.f(companion, str, null, 2, null), false, null, new C14927c(localThemeScope.getAdsColors().getAdsColorEnabled01(), localThemeScope.getAdsColors().getAdsColorUIBorder01(), localThemeScope.getAdsColors().getAdsColorInverse(), localThemeScope.getAdsColors().getAdsColorsDisabled()), 6, null);
            int i11 = LocalThemeScope.f15770g;
            vi.s.b(localThemeScope, checkbox, z10, false, false, function1, composer, i11 | (q1.s.Checkbox.f140173e << 3), 12);
            C14802K.a(androidx.compose.foundation.layout.J.z(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 383, null), C6408b.a(abstractC5607a, composer, AbstractC5607a.f45514b), null, composer, i11 | (q1.Label.f140080j << 3), 4);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14914Q interfaceC14914Q, Composer composer, Integer num) {
            a(interfaceC14914Q, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r31, final ak.AbstractC5607a r32, final boolean r33, final androidx.compose.ui.focus.y r34, androidx.compose.ui.Modifier r35, java.lang.String r36, java.lang.String r37, ak.AbstractC5607a r38, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r39, final kotlin.jvm.functions.Function0<kotlin.Unit> r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.C4078f.b(Ji.M, ak.a, boolean, androidx.compose.ui.focus.y, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, ak.a, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a, boolean z10, androidx.compose.ui.focus.y yVar, Modifier modifier, String str, String str2, AbstractC5607a abstractC5607a2, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, abstractC5607a, z10, yVar, modifier, str, str2, abstractC5607a2, function1, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
