package ji;

import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import d0.C13442i;
import ji.q1;
import kotlin.C17979v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lji/D;", "Lji/w1;", "Lji/j1;", "Lji/h;", "anatomy", "<init>", "(Lji/h;)V", "LJi/M;", "themeScope", "b", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/j1;", "a", "Lji/h;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ji.D, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C14901D implements w1<j1> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14937h anatomy;

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0003\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\t\u0010!¨\u0006#"}, d2 = {"ji/D$a", "Lji/j1;", "Lji/q1$d$d;", "a", "Lji/q1$d$d;", "getBaseButton", "()Lji/q1$d$d;", "baseButton", "Lji/q1$j;", "b", "Lji/q1$j;", "getBaseLabel", "()Lji/q1$j;", "baseLabel", "Lji/q1$h$b;", "c", "Lji/q1$h$b;", "getBaseIcon", "()Lji/q1$h$b;", "baseIcon", "Lji/E;", "d", "Lji/E;", "()Lji/E;", "buttons", "Lji/G;", "e", "Lji/G;", "()Lji/G;", "labels", "Lji/F;", "f", "Lji/F;", "()Lji/F;", "icons", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: ji.D$a */
    public static final class a implements j1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final q1.d.StandardButton baseButton;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final q1.Label baseLabel;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final q1.h.DrawableIcon baseIcon;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final StandardButtons buttons;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final StandardLabels labels;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final StandardIcons icons;

        a(C14901D c14901d, Composer composer, LocalThemeScope localThemeScope, int i10) {
            q1.d.StandardButton standardButtonH = c14901d.anatomy.h(composer, 0);
            this.baseButton = standardButtonH;
            q1.Label labelI = c14901d.anatomy.i(localThemeScope, composer, i10 & 14);
            this.baseLabel = labelI;
            q1.h.DrawableIcon drawableIconK = c14901d.anatomy.k(composer, 0);
            this.baseIcon = drawableIconK;
            C17979v c17979v = C17979v.f168713a;
            long color = localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor();
            long color2 = localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor();
            int i11 = C17979v.f168724l;
            float f10 = 1;
            this.buttons = new StandardButtons(q1.d.StandardButton.y(standardButtonH, false, null, null, null, C13442i.a(H1.h.p(f10), localThemeScope.getAdsColors().getAdsColorDanger().getColor()), c17979v.a(color, 0L, color2, 0L, composer, i11 << 12, 10), null, null, false, null, 975, null), q1.d.StandardButton.y(standardButtonH, false, null, null, null, C13442i.a(H1.h.p(f10), localThemeScope.getAdsColors().getAdsColorEnabled01().getColor()), c17979v.a(localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), 0L, localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), 0L, composer, i11 << 12, 10), null, c14901d.anatomy.e(), false, null, 847, null), q1.d.StandardButton.y(standardButtonH, false, null, null, null, C13442i.a(H1.h.p(f10), localThemeScope.getAdsColors().getAdsColorEnabled01().getColor()), c17979v.a(localThemeScope.getAdsColors().getAdsColorUIBackground02().getColor(), 0L, localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), 0L, composer, i11 << 12, 10), null, c14901d.anatomy.e(), false, null, 847, null), q1.d.StandardButton.y(standardButtonH, false, null, null, null, C13442i.a(H1.h.p(f10), localThemeScope.getAdsColors().getAdsColorsDisabled().getColor()), c17979v.a(localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), 0L, localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), 0L, composer, i11 << 12, 10), null, null, false, null, 974, null));
            this.labels = new StandardLabels(q1.Label.y(labelI, null, null, null, null, 0, false, 0, labelI.getStyle().d(localThemeScope.getAdsColors().getAdsColorDanger()), null, 383, null), q1.Label.y(labelI, null, null, null, null, 0, false, 0, labelI.getStyle().d(localThemeScope.getAdsColors().getAdsColorEnabled01()), null, 383, null), q1.Label.y(labelI, null, null, null, null, 0, false, 0, labelI.getStyle().d(localThemeScope.getAdsColors().getAdsColorsDisabled()), null, 383, null));
            this.icons = new StandardIcons(q1.h.DrawableIcon.y(drawableIconK, null, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorDanger(), null, 95, null), q1.h.DrawableIcon.y(drawableIconK, null, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorEnabled01(), null, 95, null), q1.h.DrawableIcon.y(drawableIconK, null, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorsDisabled(), null, 95, null));
        }

        @Override // ji.j1
        /* renamed from: a, reason: from getter */
        public StandardLabels getLabels() {
            return this.labels;
        }

        @Override // ji.j1
        /* renamed from: b, reason: from getter */
        public StandardIcons getIcons() {
            return this.icons;
        }

        @Override // ji.j1
        /* renamed from: d, reason: from getter */
        public StandardButtons getButtons() {
            return this.buttons;
        }
    }

    public C14901D(InterfaceC14937h anatomy) {
        Intrinsics.j(anatomy, "anatomy");
        this.anatomy = anatomy;
    }

    @Override // ji.w1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j1 q(LocalThemeScope themeScope, Composer composer, int i10) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(-1951395897);
        if (ComposerKt.M()) {
            ComposerKt.U(-1951395897, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.Buttons.Secondary.generateAssembly (Button.kt:419)");
        }
        a aVar = new a(this, composer, themeScope, i10);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return aVar;
    }
}
