package kotlin;

import Ji.LocalThemeScope;
import Ji.Q;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.recyclerview.widget.RecyclerView;
import d0.C13442i;
import ji.InterfaceC14905H;
import ji.InterfaceC14971y;
import ji.q1;
import kotlin.C15449p;
import kotlin.C17979v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.C15851n1;
import ni.o1;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u001a1\u0010\b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a)\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\f\u0010\u000b¨\u0006\u000e²\u0006\u000e\u0010\r\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\r\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\r\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "isSelected", "", "text", "Lkotlin/Function0;", "", "onClick", "d", "(LJi/M;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "f", "(LJi/M;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "h", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: lo.p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C15449p {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: lo.p$a */
    static final class a implements Function3<InterfaceC14905H, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f149061a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f149062b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f149063c;

        a(LocalThemeScope localThemeScope, Function0<Unit> function0, String str) {
            this.f149061a = localThemeScope;
            this.f149062b = function0;
            this.f149063c = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC14905H interfaceC14905H, LocalThemeScope localThemeScope, String str, o1 AcresChip) {
            Intrinsics.j(AcresChip, "$this$AcresChip");
            AcresChip.d(q1.Label.y(interfaceC14905H.getLabels().getEnabledRestingLabel(), null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight(), null, 383, null), str);
            return Unit.f142422a;
        }

        public final void b(final InterfaceC14905H Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-644911162, i10, -1, "com.meijer.mobile.mperks.ux.common.SelectedPillsButton.<anonymous> (PillsButton.kt:41)");
            }
            q1.d.ChipButton chipButtonY = q1.d.ChipButton.y(Assemble.getButtons().getEnabledResting(), false, null, null, null, C13442i.a(H1.h.p(1), this.f149061a.getAdsColors().getAdsColorSupportInformationalBg().getColor()), C17979v.f168713a.a(this.f149061a.getAdsColors().getAdsColorSupportInformationalBg().getColor(), 0L, 0L, 0L, composer, C17979v.f168724l << 12, 14), null, null, false, null, 975, null);
            LocalThemeScope localThemeScope = this.f149061a;
            Function0<Unit> function0 = this.f149062b;
            String str = this.f149063c;
            composer.startReplaceGroup(-1746271574);
            boolean zD = composer.D(Assemble) | composer.D(this.f149061a) | composer.V(this.f149063c);
            final LocalThemeScope localThemeScope2 = this.f149061a;
            final String str2 = this.f149063c;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: lo.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C15449p.a.c(Assemble, localThemeScope2, str2, (o1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C15851n1.e(localThemeScope, null, function0, chipButtonY, str, true, (Function1) objB, composer, 196608 | LocalThemeScope.f15770g | (q1.d.ChipButton.f139940k << 9), 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14905H interfaceC14905H, Composer composer, Integer num) {
            b(interfaceC14905H, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: lo.p$b */
    static final class b implements Function3<InterfaceC14905H, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f149064a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f149065b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f149066c;

        b(LocalThemeScope localThemeScope, Function0<Unit> function0, String str) {
            this.f149064a = localThemeScope;
            this.f149065b = function0;
            this.f149066c = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC14905H interfaceC14905H, String str, o1 AcresChip) {
            Intrinsics.j(AcresChip, "$this$AcresChip");
            AcresChip.d(interfaceC14905H.getLabels().getEnabledRestingLabel(), str);
            return Unit.f142422a;
        }

        public final void b(final InterfaceC14905H Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(592367007, i10, -1, "com.meijer.mobile.mperks.ux.common.UnselectedPillsButton.<anonymous> (PillsButton.kt:71)");
            }
            q1.d.ChipButton enabledResting = Assemble.getButtons().getEnabledResting();
            LocalThemeScope localThemeScope = this.f149064a;
            Function0<Unit> function0 = this.f149065b;
            String str = this.f149066c;
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(Assemble) | composer.V(this.f149066c);
            final String str2 = this.f149066c;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: lo.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C15449p.b.c(Assemble, str2, (o1) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C15851n1.e(localThemeScope, null, function0, enabledResting, str, false, (Function1) objB, composer, 196608 | LocalThemeScope.f15770g | (q1.d.ChipButton.f139940k << 9), 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14905H interfaceC14905H, Composer composer, Integer num) {
            b(interfaceC14905H, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void d(final LocalThemeScope localThemeScope, final boolean z10, final String text, final Function0<Unit> onClick, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(text, "text");
        Intrinsics.j(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-146468028);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.V(text) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(onClick) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-146468028, i11, -1, "com.meijer.mobile.mperks.ux.common.PillsButton (PillsButton.kt:30)");
            }
            if (z10) {
                composerStartRestartGroup.startReplaceGroup(978150278);
                int i12 = LocalThemeScope.f15770g | (i11 & 14);
                int i13 = i11 >> 3;
                f(localThemeScope, text, onClick, composerStartRestartGroup, i12 | (i13 & 112) | (i13 & 896));
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(978151688);
                int i14 = LocalThemeScope.f15770g | (i11 & 14);
                int i15 = i11 >> 3;
                h(localThemeScope, text, onClick, composerStartRestartGroup, i14 | (i15 & 112) | (i15 & 896));
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: lo.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C15449p.e(localThemeScope, z10, text, onClick, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, boolean z10, String str, Function0 function0, int i10, Composer composer, int i11) {
        d(localThemeScope, z10, str, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final void f(final LocalThemeScope localThemeScope, final String text, final Function0<Unit> onClick, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(text, "text");
        Intrinsics.j(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1817821787);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(text) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(onClick) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1817821787, i11, -1, "com.meijer.mobile.mperks.ux.common.SelectedPillsButton (PillsButton.kt:39)");
            }
            Q.e(localThemeScope, InterfaceC14971y.a.C2218a.f140286a, ComposableLambdaKt.c(-644911162, true, new a(localThemeScope, onClick, text), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | 384 | (InterfaceC14971y.a.C2218a.f140287b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: lo.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C15449p.g(localThemeScope, text, onClick, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, String str, Function0 function0, int i10, Composer composer, int i11) {
        f(localThemeScope, str, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final void h(final LocalThemeScope localThemeScope, final String text, final Function0<Unit> onClick, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(text, "text");
        Intrinsics.j(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(751750900);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(text) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(onClick) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(751750900, i11, -1, "com.meijer.mobile.mperks.ux.common.UnselectedPillsButton (PillsButton.kt:69)");
            }
            Q.e(localThemeScope, InterfaceC14971y.a.C2218a.f140286a, ComposableLambdaKt.c(592367007, true, new b(localThemeScope, onClick, text), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | 384 | (InterfaceC14971y.a.C2218a.f140287b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: lo.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C15449p.i(localThemeScope, text, onClick, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, String str, Function0 function0, int i10, Composer composer, int i11) {
        h(localThemeScope, str, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }
}
