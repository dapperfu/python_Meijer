package ji;

import Ji.C;
import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import ji.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lji/G0;", "Lji/w1;", "Lji/W;", "Lji/r0;", "anatomy", "<init>", "(Lji/r0;)V", "LJi/M;", "themeScope", "b", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/W;", "a", "Lji/r0;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class G0 implements w1<InterfaceC14919W> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C14958r0 anatomy;

    @Metadata(d1 = {"\u0000I\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u000f\u0010\u001dR\u001a\u0010#\u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0003\u0010\"R\u001a\u0010(\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\t\u0010'R\u001a\u0010-\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b \u0010,¨\u0006."}, d2 = {"ji/G0$a", "Lji/W;", "Lji/q1$f$e;", "a", "Lji/q1$f$e;", "getBaseField", "()Lji/q1$f$e;", "baseField", "Lji/q1$j;", "b", "Lji/q1$j;", "getBaseLabel", "()Lji/q1$j;", "baseLabel", "Lji/q1$h$b;", "c", "Lji/q1$h$b;", "getBaseIcon", "()Lji/q1$h$b;", "baseIcon", "Lji/i0;", "d", "Lji/i0;", "getInfoBlock", "()Lji/i0;", "infoBlock", "Lji/y0;", "e", "Lji/y0;", "()Lji/y0;", "inputFields", "Lji/A0;", "f", "Lji/A0;", "()Lji/A0;", "labels", "Lji/z0;", "g", "Lji/z0;", "()Lji/z0;", "icons", "Lji/j0;", "h", "Lji/j0;", "()Lji/j0;", "infoBlocks", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a implements InterfaceC14919W {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final q1.f.TextInput baseField;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final q1.Label baseLabel;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final q1.h.DrawableIcon baseIcon;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Default infoBlock;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final DefaultTextInputs inputFields;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final DefaultLabels labels;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final DefaultIcons icons;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final DefaultInfoBlocks infoBlocks;

        a(G0 g02, LocalThemeScope localThemeScope, Composer composer, int i10) {
            int i11 = i10 & 14;
            q1.f.TextInput textInputH = g02.anatomy.h(localThemeScope, 0.0f, composer, i11, 2);
            this.baseField = textInputH;
            q1.Label labelD = g02.anatomy.d(localThemeScope, composer, i11);
            this.baseLabel = labelD;
            q1.h.DrawableIcon drawableIconC = g02.anatomy.c(composer, 0);
            this.baseIcon = drawableIconC;
            Default r82 = new Default(localThemeScope, null, null, 6, null);
            this.infoBlock = r82;
            this.inputFields = new DefaultTextInputs(textInputH, q1.f.TextInput.y(textInputH, null, false, q1.f.a.c.f139991a, null, null, null, null, false, 0, null, null, null, 4091, null), q1.f.TextInput.y(textInputH, null, false, q1.f.a.e.f139993a, null, null, null, null, false, 0, null, null, null, 4091, null), q1.f.TextInput.y(textInputH, null, false, q1.f.a.C2216f.f139994a, null, null, null, null, false, 0, null, null, null, 4091, null), q1.f.TextInput.y(textInputH, null, true, q1.f.a.C2215a.f139989a, null, null, null, null, false, 0, null, null, null, 4089, null), q1.f.TextInput.y(textInputH, null, false, q1.f.a.d.f139992a, null, null, null, null, false, 0, null, null, null, 4091, null));
            this.labels = new DefaultLabels(q1.Label.y(labelD, null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne().d(localThemeScope.getAdsColors().getAdsColorText02()), null, 383, null), r82.getLabels().getMessage(), labelD, q1.Label.y(labelD, null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getOne().d(localThemeScope.getAdsColors().getAdsColorPlaceholder()), null, 383, null));
            Ji.T adsColorIcon02 = localThemeScope.getAdsColors().getAdsColorIcon02();
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 20;
            this.icons = new DefaultIcons(drawableIconC, q1.h.DrawableIcon.y(drawableIconC, null, null, null, null, 0.0f, adsColorIcon02, androidx.compose.foundation.layout.J.v(companion, H1.h.p(f10)), 31, null), drawableIconC, drawableIconC, q1.h.DrawableIcon.y(drawableIconC, null, null, null, null, 0.0f, null, androidx.compose.foundation.layout.J.v(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 11, null), H1.h.p(f10)), 63, null), q1.h.DrawableIcon.y(drawableIconC, null, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorEnabled01(), null, 95, null), q1.h.DrawableIcon.y(drawableIconC, C.a.z.f15368e, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorsDisabled(), null, 94, null), q1.h.DrawableIcon.y(drawableIconC, null, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorsDisabled(), null, 95, null));
            this.infoBlocks = new Default(localThemeScope, null, null, 6, null).getInfoBlocks();
        }

        @Override // ji.InterfaceC14919W
        /* renamed from: a, reason: from getter */
        public DefaultLabels getLabels() {
            return this.labels;
        }

        @Override // ji.InterfaceC14919W
        /* renamed from: b, reason: from getter */
        public DefaultIcons getIcons() {
            return this.icons;
        }

        @Override // ji.InterfaceC14919W
        /* renamed from: c, reason: from getter */
        public DefaultTextInputs getInputFields() {
            return this.inputFields;
        }

        @Override // ji.InterfaceC14919W
        /* renamed from: f, reason: from getter */
        public DefaultInfoBlocks getInfoBlocks() {
            return this.infoBlocks;
        }
    }

    public G0(C14958r0 anatomy) {
        Intrinsics.j(anatomy, "anatomy");
        this.anatomy = anatomy;
    }

    @Override // ji.w1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC14919W q(LocalThemeScope themeScope, Composer composer, int i10) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(-1413122724);
        if (ComposerKt.M()) {
            ComposerKt.U(-1413122724, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.InputFields.InnerTextInput.generateAssembly (TextField.kt:579)");
        }
        a aVar = new a(this, themeScope, composer, i10);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return aVar;
    }
}
