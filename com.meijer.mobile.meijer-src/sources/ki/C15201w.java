package ki;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import ki.InterfaceC15171h;
import ki.q1;
import kotlin.C18045v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lki/w;", "Lki/w1;", "Lki/j1;", "Lki/h;", "anatomy", "<init>", "(Lki/h;)V", "LKi/M;", "themeScope", "b", "(LKi/M;Landroidx/compose/runtime/Composer;I)Lki/j1;", "a", "Lki/h;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ki.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C15201w implements w1<j1> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15171h anatomy;

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0003\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\t\u0010!¨\u0006#"}, d2 = {"ki/w$a", "Lki/j1;", "Lki/q1$d$d;", "a", "Lki/q1$d$d;", "getBaseButton", "()Lki/q1$d$d;", "baseButton", "Lki/q1$j;", "b", "Lki/q1$j;", "getBaseLabel", "()Lki/q1$j;", "baseLabel", "Lki/q1$h$b;", "c", "Lki/q1$h$b;", "getBaseIcon", "()Lki/q1$h$b;", "baseIcon", "Lki/E;", "d", "Lki/E;", "()Lki/E;", "buttons", "Lki/G;", "e", "Lki/G;", "()Lki/G;", "labels", "Lki/F;", "f", "Lki/F;", "()Lki/F;", "icons", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: ki.w$a */
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

        a(C15201w c15201w, Composer composer, LocalThemeScope localThemeScope, int i10) {
            q1.d.StandardButton standardButtonH = c15201w.anatomy.h(composer, 0);
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(standardButtonH, false, null, null, null, null, null, c15201w.anatomy instanceof InterfaceC15171h.a ? androidx.compose.foundation.layout.D.a(H1.h.p(0)) : androidx.compose.foundation.layout.D.c(H1.h.p(8), 0.0f, 2, null), c15201w.anatomy instanceof InterfaceC15171h.a ? standardButtonH.getModifier() : androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, H1.h.p(24)), false, null, 831, null);
            this.baseButton = standardButtonY;
            int i11 = i10 & 14;
            q1.Label labelY = q1.Label.y(c15201w.anatomy.i(localThemeScope, composer, i11), null, null, null, null, 0, false, 0, c15201w.anatomy instanceof InterfaceC15171h.b.c ? c15201w.anatomy.i(localThemeScope, composer, i11).getStyle().c(H1.w.i(14)) : c15201w.anatomy.i(localThemeScope, composer, i11).getStyle(), null, 383, null);
            this.baseLabel = labelY;
            q1.h.DrawableIcon drawableIconY = q1.h.DrawableIcon.y(c15201w.anatomy.k(composer, 0), null, null, null, null, 0.0f, null, c15201w.anatomy instanceof InterfaceC15171h.b.c ? c15201w.anatomy.k(composer, 0).getModifier().then(androidx.compose.foundation.layout.J.o(Modifier.INSTANCE, H1.h.p(20))) : c15201w.anatomy.k(composer, 0).getModifier(), 63, null);
            this.baseIcon = drawableIconY;
            C18045v c18045v = C18045v.f169801a;
            long color = localThemeScope.getAdsColors().getAdsColorTransparent().getColor();
            long color2 = localThemeScope.getAdsColors().getAdsColorTransparent().getColor();
            int i12 = C18045v.f169812l;
            this.buttons = new StandardButtons(q1.d.StandardButton.y(standardButtonY, false, null, null, null, null, c18045v.a(color, 0L, color2, 0L, composer, i12 << 12, 10), null, null, false, null, 991, null), q1.d.StandardButton.y(standardButtonY, false, null, null, null, null, c18045v.a(localThemeScope.getAdsColors().getAdsColorTransparent().getColor(), 0L, localThemeScope.getAdsColors().getAdsColorTransparent().getColor(), 0L, composer, i12 << 12, 10), null, null, false, null, 991, null), q1.d.StandardButton.y(standardButtonY, false, null, null, null, null, c18045v.a(localThemeScope.getAdsColors().getAdsColorTransparent().getColor(), 0L, localThemeScope.getAdsColors().getAdsColorTransparent().getColor(), 0L, composer, i12 << 12, 10), null, null, false, null, 991, null), q1.d.StandardButton.y(standardButtonY, false, null, null, null, null, c18045v.a(localThemeScope.getAdsColors().getAdsColorTransparent().getColor(), 0L, localThemeScope.getAdsColors().getAdsColorTransparent().getColor(), 0L, composer, i12 << 12, 10), null, null, false, null, 990, null));
            this.labels = new StandardLabels(q1.Label.y(labelY, null, null, null, null, 0, false, 0, labelY.getStyle().d(localThemeScope.getAdsColors().getAdsColorDanger()), null, 383, null), q1.Label.y(labelY, null, null, null, null, 0, false, 0, labelY.getStyle().d(localThemeScope.getAdsColors().getAdsColorEnabled01()), null, 383, null), q1.Label.y(labelY, null, null, null, null, 0, false, 0, labelY.getStyle().d(localThemeScope.getAdsColors().getAdsColorsDisabled()), null, 383, null));
            this.icons = new StandardIcons(q1.h.DrawableIcon.y(drawableIconY, null, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorDanger(), null, 95, null), q1.h.DrawableIcon.y(drawableIconY, null, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorEnabled01(), null, 95, null), q1.h.DrawableIcon.y(drawableIconY, null, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorsDisabled(), null, 95, null));
        }

        @Override // ki.j1
        /* renamed from: a, reason: from getter */
        public StandardLabels getLabels() {
            return this.labels;
        }

        @Override // ki.j1
        /* renamed from: b, reason: from getter */
        public StandardIcons getIcons() {
            return this.icons;
        }

        @Override // ki.j1
        /* renamed from: d, reason: from getter */
        public StandardButtons getButtons() {
            return this.buttons;
        }
    }

    public C15201w(InterfaceC15171h anatomy) {
        Intrinsics.j(anatomy, "anatomy");
        this.anatomy = anatomy;
    }

    @Override // ki.w1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j1 q(LocalThemeScope themeScope, Composer composer, int i10) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(-398615302);
        if (ComposerKt.M()) {
            ComposerKt.U(-398615302, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.Buttons.Passive.generateAssembly (Button.kt:563)");
        }
        a aVar = new a(this, composer, themeScope, i10);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return aVar;
    }
}
