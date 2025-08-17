package ji;

import Ji.C;
import Ji.LocalThemeScope;
import V0.D1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import d0.C13442i;
import j0.InterfaceC14794C;
import ji.q1;
import kotlin.C17979v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lji/i;", "Lji/w1;", "Lji/H;", "Lji/h;", "anatomy", "<init>", "(Lji/h;)V", "LJi/M;", "themeScope", "b", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/H;", "a", "Lji/h;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ji.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C14939i implements w1<InterfaceC14905H> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14937h anatomy;

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u001b\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001a\u0010 \u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0003\u0010\u001fR\u001a\u0010%\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\t\u0010$¨\u0006&"}, d2 = {"ji/i$a", "Lji/H;", "Lji/q1$d$a;", "a", "Lji/q1$d$a;", "getBaseButton", "()Lji/q1$d$a;", "baseButton", "Lji/q1$h$b;", "b", "Lji/q1$h$b;", "getBaseIcon", "()Lji/q1$h$b;", "baseIcon", "Lji/q1$j;", "c", "Lji/q1$j;", "getLabelResting", "()Lji/q1$j;", "labelResting", "d", "getLabelSelected", "labelSelected", "Lji/j;", "e", "Lji/j;", "()Lji/j;", "buttons", "Lji/l;", "f", "Lji/l;", "()Lji/l;", "labels", "Lji/k;", "g", "Lji/k;", "()Lji/k;", "icons", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: ji.i$a */
    public static final class a implements InterfaceC14905H {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final q1.d.ChipButton baseButton;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final q1.h.DrawableIcon baseIcon;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final q1.Label labelResting;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final q1.Label labelSelected;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final ChipButtons buttons;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final ChipLabels labels;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final ChipIcons icons;

        a(C14939i c14939i, Composer composer, LocalThemeScope localThemeScope) {
            Modifier modifierE = c14939i.anatomy.e();
            D1 shape = c14939i.anatomy.getShape();
            InterfaceC14794C interfaceC14794CC = c14939i.anatomy.c();
            C17979v c17979v = C17979v.f168713a;
            float f10 = 0;
            float fP = H1.h.p(f10);
            float fP2 = H1.h.p(f10);
            float fP3 = H1.h.p(f10);
            int i10 = C17979v.f168724l;
            q1.d.ChipButton chipButton = new q1.d.ChipButton(false, null, c17979v.b(fP, fP2, fP3, 0.0f, 0.0f, composer, (i10 << 15) | 438, 24), shape, null, null, interfaceC14794CC, modifierE, false, null, 819, null);
            this.baseButton = chipButton;
            q1.h.DrawableIcon drawableIconK = c14939i.anatomy.k(composer, 0);
            this.baseIcon = drawableIconK;
            q1.Label label = new q1.Label(c14939i.anatomy.j(), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 382, null);
            this.labelResting = label;
            q1.Label label2 = new q1.Label(c14939i.anatomy.j(), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight().d(localThemeScope.getAdsColors().getAdsColorInverse()), null, 382, null);
            this.labelSelected = label2;
            float f11 = 1;
            this.buttons = new ChipButtons(q1.d.ChipButton.y(chipButton, false, null, null, null, C13442i.a(H1.h.p(f11), localThemeScope.getAdsColors().getAdsColorUIBorder02().getColor()), c17979v.a(localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), 0L, localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), 0L, composer, i10 << 12, 10), null, c14939i.anatomy.e(), false, localThemeScope.getAdsColors().getAdsColorsActive02(), 335, null), q1.d.ChipButton.y(chipButton, false, null, null, null, C13442i.a(H1.h.p(f11), localThemeScope.getAdsColors().getAdsColorsDisabled().getColor()), c17979v.a(localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), 0L, localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), 0L, composer, i10 << 12, 10), null, c14939i.anatomy.e(), false, null, 846, null), q1.d.ChipButton.y(chipButton, false, null, null, null, null, c17979v.a(localThemeScope.getAdsColors().getAdsColorEnabled01().getColor(), 0L, 0L, 0L, composer, i10 << 12, 14), null, c14939i.anatomy.e(), false, null, 863, null), q1.d.ChipButton.y(chipButton, false, null, null, null, null, c17979v.a(localThemeScope.getAdsColors().getAdsColorsDisabled().getColor(), 0L, localThemeScope.getAdsColors().getAdsColorsDisabled().getColor(), 0L, composer, i10 << 12, 10), null, c14939i.anatomy.e(), false, null, 862, null));
            this.labels = new ChipLabels(label, q1.Label.y(label, null, null, null, null, 0, false, 0, label.getStyle().d(localThemeScope.getAdsColors().getAdsColorsDisabled()), null, 383, null), label2, label2);
            Ji.T adsColorIcon01 = localThemeScope.getAdsColors().getAdsColorIcon01();
            C.f.p pVar = C.f.p.f15524e;
            q1.h.DrawableIcon drawableIconY = q1.h.DrawableIcon.y(drawableIconK, pVar, null, null, null, 0.0f, adsColorIcon01, null, 94, null);
            q1.h.DrawableIcon drawableIconY2 = q1.h.DrawableIcon.y(drawableIconK, pVar, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorsDisabled(), null, 94, null);
            Ji.T adsColorInverse = localThemeScope.getAdsColors().getAdsColorInverse();
            C.f.n nVar = C.f.n.f15521e;
            this.icons = new ChipIcons(drawableIconY, drawableIconY2, q1.h.DrawableIcon.y(drawableIconK, nVar, null, null, null, 0.0f, adsColorInverse, null, 94, null), q1.h.DrawableIcon.y(drawableIconK, nVar, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorInverse(), null, 94, null));
        }

        @Override // ji.InterfaceC14905H
        /* renamed from: a, reason: from getter */
        public ChipLabels getLabels() {
            return this.labels;
        }

        @Override // ji.InterfaceC14905H
        /* renamed from: b, reason: from getter */
        public ChipIcons getIcons() {
            return this.icons;
        }

        @Override // ji.InterfaceC14905H
        /* renamed from: d, reason: from getter */
        public ChipButtons getButtons() {
            return this.buttons;
        }
    }

    public C14939i(InterfaceC14937h anatomy) {
        Intrinsics.j(anatomy, "anatomy");
        this.anatomy = anatomy;
    }

    @Override // ji.w1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC14905H q(LocalThemeScope themeScope, Composer composer, int i10) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(2061602806);
        if (ComposerKt.M()) {
            ComposerKt.U(2061602806, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.Buttons.Chip.generateAssembly (Button.kt:645)");
        }
        a aVar = new a(this, composer, themeScope);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return aVar;
    }
}
