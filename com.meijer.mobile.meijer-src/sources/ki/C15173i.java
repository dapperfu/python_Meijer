package ki;

import Ki.C;
import Ki.LocalThemeScope;
import V0.D1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import d0.C13575i;
import j0.InterfaceC14882C;
import ki.q1;
import kotlin.C18045v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lki/i;", "Lki/w1;", "Lki/H;", "Lki/h;", "anatomy", "<init>", "(Lki/h;)V", "LKi/M;", "themeScope", "b", "(LKi/M;Landroidx/compose/runtime/Composer;I)Lki/H;", "a", "Lki/h;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ki.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C15173i implements w1<InterfaceC15139H> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15171h anatomy;

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u001b\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001a\u0010 \u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0003\u0010\u001fR\u001a\u0010%\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\t\u0010$¨\u0006&"}, d2 = {"ki/i$a", "Lki/H;", "Lki/q1$d$a;", "a", "Lki/q1$d$a;", "getBaseButton", "()Lki/q1$d$a;", "baseButton", "Lki/q1$h$b;", "b", "Lki/q1$h$b;", "getBaseIcon", "()Lki/q1$h$b;", "baseIcon", "Lki/q1$j;", "c", "Lki/q1$j;", "getLabelResting", "()Lki/q1$j;", "labelResting", "d", "getLabelSelected", "labelSelected", "Lki/j;", "e", "Lki/j;", "()Lki/j;", "buttons", "Lki/l;", "f", "Lki/l;", "()Lki/l;", "labels", "Lki/k;", "g", "Lki/k;", "()Lki/k;", "icons", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: ki.i$a */
    public static final class a implements InterfaceC15139H {

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

        a(C15173i c15173i, Composer composer, LocalThemeScope localThemeScope) {
            Modifier modifierE = c15173i.anatomy.e();
            D1 shape = c15173i.anatomy.getShape();
            InterfaceC14882C interfaceC14882CC = c15173i.anatomy.c();
            C18045v c18045v = C18045v.f169801a;
            float f10 = 0;
            float fP = H1.h.p(f10);
            float fP2 = H1.h.p(f10);
            float fP3 = H1.h.p(f10);
            int i10 = C18045v.f169812l;
            q1.d.ChipButton chipButton = new q1.d.ChipButton(false, null, c18045v.b(fP, fP2, fP3, 0.0f, 0.0f, composer, (i10 << 15) | 438, 24), shape, null, null, interfaceC14882CC, modifierE, false, null, 819, null);
            this.baseButton = chipButton;
            q1.h.DrawableIcon drawableIconK = c15173i.anatomy.k(composer, 0);
            this.baseIcon = drawableIconK;
            q1.Label label = new q1.Label(c15173i.anatomy.j(), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 382, null);
            this.labelResting = label;
            q1.Label label2 = new q1.Label(c15173i.anatomy.j(), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight().d(localThemeScope.getAdsColors().getAdsColorInverse()), null, 382, null);
            this.labelSelected = label2;
            float f11 = 1;
            this.buttons = new ChipButtons(q1.d.ChipButton.y(chipButton, false, null, null, null, C13575i.a(H1.h.p(f11), localThemeScope.getAdsColors().getAdsColorUIBorder02().getColor()), c18045v.a(localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), 0L, localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), 0L, composer, i10 << 12, 10), null, c15173i.anatomy.e(), false, localThemeScope.getAdsColors().getAdsColorsActive02(), 335, null), q1.d.ChipButton.y(chipButton, false, null, null, null, C13575i.a(H1.h.p(f11), localThemeScope.getAdsColors().getAdsColorsDisabled().getColor()), c18045v.a(localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), 0L, localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), 0L, composer, i10 << 12, 10), null, c15173i.anatomy.e(), false, null, 846, null), q1.d.ChipButton.y(chipButton, false, null, null, null, null, c18045v.a(localThemeScope.getAdsColors().getAdsColorEnabled01().getColor(), 0L, 0L, 0L, composer, i10 << 12, 14), null, c15173i.anatomy.e(), false, null, 863, null), q1.d.ChipButton.y(chipButton, false, null, null, null, null, c18045v.a(localThemeScope.getAdsColors().getAdsColorsDisabled().getColor(), 0L, localThemeScope.getAdsColors().getAdsColorsDisabled().getColor(), 0L, composer, i10 << 12, 10), null, c15173i.anatomy.e(), false, null, 862, null));
            this.labels = new ChipLabels(label, q1.Label.y(label, null, null, null, null, 0, false, 0, label.getStyle().d(localThemeScope.getAdsColors().getAdsColorsDisabled()), null, 383, null), label2, label2);
            Ki.T adsColorIcon01 = localThemeScope.getAdsColors().getAdsColorIcon01();
            C.f.p pVar = C.f.p.f17068e;
            q1.h.DrawableIcon drawableIconY = q1.h.DrawableIcon.y(drawableIconK, pVar, null, null, null, 0.0f, adsColorIcon01, null, 94, null);
            q1.h.DrawableIcon drawableIconY2 = q1.h.DrawableIcon.y(drawableIconK, pVar, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorsDisabled(), null, 94, null);
            Ki.T adsColorInverse = localThemeScope.getAdsColors().getAdsColorInverse();
            C.f.n nVar = C.f.n.f17065e;
            this.icons = new ChipIcons(drawableIconY, drawableIconY2, q1.h.DrawableIcon.y(drawableIconK, nVar, null, null, null, 0.0f, adsColorInverse, null, 94, null), q1.h.DrawableIcon.y(drawableIconK, nVar, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorInverse(), null, 94, null));
        }

        @Override // ki.InterfaceC15139H
        /* renamed from: a, reason: from getter */
        public ChipLabels getLabels() {
            return this.labels;
        }

        @Override // ki.InterfaceC15139H
        /* renamed from: b, reason: from getter */
        public ChipIcons getIcons() {
            return this.icons;
        }

        @Override // ki.InterfaceC15139H
        /* renamed from: d, reason: from getter */
        public ChipButtons getButtons() {
            return this.buttons;
        }
    }

    public C15173i(InterfaceC15171h anatomy) {
        Intrinsics.j(anatomy, "anatomy");
        this.anatomy = anatomy;
    }

    @Override // ki.w1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC15139H q(LocalThemeScope themeScope, Composer composer, int i10) {
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
