package ki;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import ki.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lki/E0;", "Lki/w1;", "Lki/U;", "Lki/r0;", "anatomy", "<init>", "(Lki/r0;)V", "LKi/M;", "themeScope", "b", "(LKi/M;Landroidx/compose/runtime/Composer;I)Lki/U;", "a", "Lki/r0;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
final class E0 implements w1<InterfaceC15151U> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C15192r0 anatomy;

    @Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0003\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\t\u0010!R\u001a\u0010(\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"ki/E0$a", "Lki/U;", "Lki/q1$f$e;", "a", "Lki/q1$f$e;", "getBaseField", "()Lki/q1$f$e;", "baseField", "Lki/q1$j;", "b", "Lki/q1$j;", "getBaseLabel", "()Lki/q1$j;", "baseLabel", "Lki/q1$h$b;", "c", "Lki/q1$h$b;", "getBaseIcon", "()Lki/q1$h$b;", "baseIcon", "Lki/w0;", "d", "Lki/w0;", "()Lki/w0;", "inputFields", "Lki/P0;", "e", "Lki/P0;", "()Lki/P0;", "labels", "Lki/O0;", "f", "Lki/O0;", "()Lki/O0;", "icons", "Lki/j0;", "g", "Lki/j0;", "getInfoBlocks", "()Lki/j0;", "infoBlocks", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a implements InterfaceC15151U {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final q1.f.TextInput baseField;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final q1.Label baseLabel;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final q1.h.DrawableIcon baseIcon;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final DefaultSearchInputs inputFields;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final SearchLabels labels;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final SearchIcons icons;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final DefaultInfoBlocks infoBlocks;

        a(E0 e02, LocalThemeScope localThemeScope, Composer composer, int i10) {
            int i11 = i10 & 14;
            q1.f.TextInput textInputH = e02.anatomy.h(localThemeScope, H1.h.p(40), composer, i11 | 48, 0);
            this.baseField = textInputH;
            q1.Label labelD = e02.anatomy.d(localThemeScope, composer, i11);
            this.baseLabel = labelD;
            q1.h.DrawableIcon drawableIconC = e02.anatomy.c(composer, 0);
            this.baseIcon = drawableIconC;
            q1.f.TextInput textInputY = q1.f.TextInput.y(textInputH, null, false, q1.f.a.c.f142246a, null, null, null, null, false, 0, null, null, null, 4091, null);
            q1.f.TextInput textInputY2 = q1.f.TextInput.y(textInputH, null, false, q1.f.a.e.f142248a, null, null, null, null, false, 0, null, null, null, 4091, null);
            q1.f.TextInput textInputY3 = q1.f.TextInput.y(textInputH, null, false, q1.f.a.C2255f.f142249a, null, null, null, null, false, 0, null, null, null, 4091, null);
            q1.f.TextInput textInputY4 = q1.f.TextInput.y(textInputH, null, true, q1.f.a.C2254a.f142244a, null, null, null, null, false, 0, null, null, null, 4089, null);
            q1.f.a.d dVar = q1.f.a.d.f142247a;
            this.inputFields = new DefaultSearchInputs(textInputH, q1.f.TextInput.y(e02.anatomy.j(localThemeScope, composer, i11), null, false, dVar, localThemeScope.getAdsTypography().getBodyCompact().getOne().d(localThemeScope.getAdsColors().getAdsColorInverse()), null, null, null, false, 0, null, null, null, 4083, null), textInputY4, q1.f.TextInput.y(textInputH, null, false, dVar, null, null, null, null, false, 0, null, null, null, 4091, null), textInputY, textInputY2, textInputY3);
            this.labels = new SearchLabels(q1.Label.y(labelD, null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne().d(localThemeScope.getAdsColors().getAdsColorText02()), null, 383, null), labelD, q1.Label.y(labelD, null, null, null, null, 0, false, 0, labelD.getStyle().d(localThemeScope.getAdsColors().getAdsColorInverse()), null, 383, null), q1.Label.y(labelD, null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getOne().d(localThemeScope.getAdsColors().getAdsColorPlaceholder()), null, 383, null), q1.Label.y(labelD, null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getOne().d(localThemeScope.getAdsColors().getAdsColorInverse()), null, 383, null));
            this.icons = new SearchIcons(q1.h.DrawableIcon.y(drawableIconC, null, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorIcon02(), null, 95, null), q1.h.DrawableIcon.y(drawableIconC, null, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorInverse(), null, 95, null), q1.h.DrawableIcon.y(drawableIconC, null, null, null, null, 0.0f, null, androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, H1.h.p(6), 0.0f, H1.h.p(16), 0.0f, 10, null), 63, null), q1.h.DrawableIcon.y(drawableIconC, null, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorsDisabled(), null, 95, null));
            this.infoBlocks = new Default(localThemeScope, null, null, 6, null).getInfoBlocks();
        }

        @Override // ki.InterfaceC15151U
        /* renamed from: a, reason: from getter */
        public SearchLabels getLabels() {
            return this.labels;
        }

        @Override // ki.InterfaceC15151U
        /* renamed from: b, reason: from getter */
        public SearchIcons getIcons() {
            return this.icons;
        }

        @Override // ki.InterfaceC15151U
        /* renamed from: c, reason: from getter */
        public DefaultSearchInputs getInputFields() {
            return this.inputFields;
        }
    }

    public E0(C15192r0 anatomy) {
        Intrinsics.j(anatomy, "anatomy");
        this.anatomy = anatomy;
    }

    @Override // ki.w1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC15151U q(LocalThemeScope themeScope, Composer composer, int i10) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(113548486);
        if (ComposerKt.M()) {
            ComposerKt.U(113548486, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.InputFields.InnerSearchInput.generateAssembly (TextField.kt:860)");
        }
        a aVar = new a(this, themeScope, composer, i10);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return aVar;
    }
}
