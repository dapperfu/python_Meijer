package ji;

import Ji.C;
import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import ji.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lji/D0;", "Lji/w1;", "Lji/T;", "Lji/r0;", "anatomy", "<init>", "(Lji/r0;)V", "LJi/M;", "themeScope", "b", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/T;", "a", "Lji/r0;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class D0 implements w1<InterfaceC14916T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C14958r0 anatomy;

    @Metadata(d1 = {"\u0000I\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u000f\u0010\u001dR\u001a\u0010$\u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010)\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\t\u0010(R\u001a\u0010/\u001a\u00020*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"ji/D0$a", "Lji/T;", "Lji/q1$f$c;", "a", "Lji/q1$f$c;", "getBaseField", "()Lji/q1$f$c;", "baseField", "Lji/q1$j;", "b", "Lji/q1$j;", "getBaseLabel", "()Lji/q1$j;", "baseLabel", "Lji/q1$h$b;", "c", "Lji/q1$h$b;", "getBaseIcon", "()Lji/q1$h$b;", "baseIcon", "Lji/i0;", "d", "Lji/i0;", "getInfoBlock", "()Lji/i0;", "infoBlock", "Lji/v0;", "e", "Lji/v0;", "()Lji/v0;", "inputFields", "Lji/A0;", "f", "Lji/A0;", "getLabels", "()Lji/A0;", "labels", "Lji/z0;", "g", "Lji/z0;", "()Lji/z0;", "icons", "Lji/j0;", "h", "Lji/j0;", "getInfoBlocks", "()Lji/j0;", "infoBlocks", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a implements InterfaceC14916T {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final q1.f.QuantityInput baseField;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final q1.Label baseLabel;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final q1.h.DrawableIcon baseIcon;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Default infoBlock;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final DefaultQuantityInputs inputFields;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final DefaultLabels labels;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final DefaultIcons icons;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final DefaultInfoBlocks infoBlocks;

        a(D0 d02, LocalThemeScope localThemeScope, Composer composer, int i10) {
            int i11 = i10 & 14;
            q1.f.QuantityInput quantityInputE = d02.anatomy.e(localThemeScope, composer, i11);
            this.baseField = quantityInputE;
            q1.Label labelD = d02.anatomy.d(localThemeScope, composer, i11);
            this.baseLabel = labelD;
            q1.h.DrawableIcon drawableIconC = d02.anatomy.c(composer, 0);
            this.baseIcon = drawableIconC;
            Default r12 = new Default(localThemeScope, null, null, 6, null);
            this.infoBlock = r12;
            this.inputFields = new DefaultQuantityInputs(quantityInputE, quantityInputE.x((65531 & 1) != 0 ? quantityInputE.modifier : null, (65531 & 2) != 0 ? quantityInputE.readOnly : false, (65531 & 4) != 0 ? quantityInputE.state : q1.f.a.c.f139991a, (65531 & 8) != 0 ? quantityInputE.textStyle : null, (65531 & 16) != 0 ? quantityInputE.visualTransformation : null, (65531 & 32) != 0 ? quantityInputE.keyboardOptions : null, (65531 & 64) != 0 ? quantityInputE.keyboardActions : null, (65531 & 128) != 0 ? quantityInputE.singleLine : false, (65531 & 256) != 0 ? quantityInputE.maxLines : 0, (65531 & 512) != 0 ? quantityInputE.interactionSource : null, (65531 & 1024) != 0 ? quantityInputE.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInputE.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInputE.signifier : null, (65531 & 8192) != 0 ? quantityInputE.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInputE.outerModifier : null, (65531 & 32768) != 0 ? quantityInputE.shouldFillMaxWidth : false), quantityInputE.x((65531 & 1) != 0 ? quantityInputE.modifier : null, (65531 & 2) != 0 ? quantityInputE.readOnly : false, (65531 & 4) != 0 ? quantityInputE.state : q1.f.a.e.f139993a, (65531 & 8) != 0 ? quantityInputE.textStyle : null, (65531 & 16) != 0 ? quantityInputE.visualTransformation : null, (65531 & 32) != 0 ? quantityInputE.keyboardOptions : null, (65531 & 64) != 0 ? quantityInputE.keyboardActions : null, (65531 & 128) != 0 ? quantityInputE.singleLine : false, (65531 & 256) != 0 ? quantityInputE.maxLines : 0, (65531 & 512) != 0 ? quantityInputE.interactionSource : null, (65531 & 1024) != 0 ? quantityInputE.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInputE.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInputE.signifier : null, (65531 & 8192) != 0 ? quantityInputE.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInputE.outerModifier : null, (65531 & 32768) != 0 ? quantityInputE.shouldFillMaxWidth : false), quantityInputE.x((65531 & 1) != 0 ? quantityInputE.modifier : null, (65531 & 2) != 0 ? quantityInputE.readOnly : false, (65531 & 4) != 0 ? quantityInputE.state : q1.f.a.C2216f.f139994a, (65531 & 8) != 0 ? quantityInputE.textStyle : null, (65531 & 16) != 0 ? quantityInputE.visualTransformation : null, (65531 & 32) != 0 ? quantityInputE.keyboardOptions : null, (65531 & 64) != 0 ? quantityInputE.keyboardActions : null, (65531 & 128) != 0 ? quantityInputE.singleLine : false, (65531 & 256) != 0 ? quantityInputE.maxLines : 0, (65531 & 512) != 0 ? quantityInputE.interactionSource : null, (65531 & 1024) != 0 ? quantityInputE.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInputE.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInputE.signifier : null, (65531 & 8192) != 0 ? quantityInputE.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInputE.outerModifier : null, (65531 & 32768) != 0 ? quantityInputE.shouldFillMaxWidth : false), quantityInputE.x((65531 & 1) != 0 ? quantityInputE.modifier : null, (65531 & 2) != 0 ? quantityInputE.readOnly : true, (65531 & 4) != 0 ? quantityInputE.state : q1.f.a.C2215a.f139989a, (65531 & 8) != 0 ? quantityInputE.textStyle : null, (65531 & 16) != 0 ? quantityInputE.visualTransformation : null, (65531 & 32) != 0 ? quantityInputE.keyboardOptions : null, (65531 & 64) != 0 ? quantityInputE.keyboardActions : null, (65531 & 128) != 0 ? quantityInputE.singleLine : false, (65531 & 256) != 0 ? quantityInputE.maxLines : 0, (65531 & 512) != 0 ? quantityInputE.interactionSource : null, (65531 & 1024) != 0 ? quantityInputE.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInputE.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInputE.signifier : null, (65531 & 8192) != 0 ? quantityInputE.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInputE.outerModifier : null, (65531 & 32768) != 0 ? quantityInputE.shouldFillMaxWidth : false), quantityInputE.x((65531 & 1) != 0 ? quantityInputE.modifier : null, (65531 & 2) != 0 ? quantityInputE.readOnly : false, (65531 & 4) != 0 ? quantityInputE.state : q1.f.a.d.f139992a, (65531 & 8) != 0 ? quantityInputE.textStyle : null, (65531 & 16) != 0 ? quantityInputE.visualTransformation : null, (65531 & 32) != 0 ? quantityInputE.keyboardOptions : null, (65531 & 64) != 0 ? quantityInputE.keyboardActions : null, (65531 & 128) != 0 ? quantityInputE.singleLine : false, (65531 & 256) != 0 ? quantityInputE.maxLines : 0, (65531 & 512) != 0 ? quantityInputE.interactionSource : null, (65531 & 1024) != 0 ? quantityInputE.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInputE.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInputE.signifier : null, (65531 & 8192) != 0 ? quantityInputE.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInputE.outerModifier : null, (65531 & 32768) != 0 ? quantityInputE.shouldFillMaxWidth : false));
            this.labels = new DefaultLabels(q1.Label.y(labelD, null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne().d(localThemeScope.getAdsColors().getAdsColorText02()), null, 383, null), r12.getLabels().getMessage(), labelD, q1.Label.y(labelD, null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getOne().d(localThemeScope.getAdsColors().getAdsColorPlaceholder()), null, 383, null));
            Ji.T adsColorIcon02 = localThemeScope.getAdsColors().getAdsColorIcon02();
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 20;
            q1.h.DrawableIcon drawableIconY = q1.h.DrawableIcon.y(drawableIconC, null, null, null, null, 0.0f, adsColorIcon02, androidx.compose.foundation.layout.J.v(companion, H1.h.p(f10)), 31, null);
            C.a.z zVar = C.a.z.f15368e;
            q1.h.DrawableIcon drawableIconY2 = q1.h.DrawableIcon.y(drawableIconC, zVar, null, null, null, 0.0f, null, null, 126, null);
            C.a.C0245a c0245a = C.a.C0245a.f15333e;
            this.icons = new DefaultIcons(drawableIconC, drawableIconY, drawableIconY2, q1.h.DrawableIcon.y(drawableIconC, c0245a, null, null, null, 0.0f, null, null, 126, null), q1.h.DrawableIcon.y(drawableIconC, null, null, null, null, 0.0f, null, androidx.compose.foundation.layout.J.v(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, 11, null), H1.h.p(f10)), 63, null), q1.h.DrawableIcon.y(drawableIconC, null, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorEnabled01(), null, 95, null), q1.h.DrawableIcon.y(drawableIconC, zVar, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorsDisabled(), null, 94, null), q1.h.DrawableIcon.y(drawableIconC, c0245a, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorsDisabled(), null, 94, null));
            this.infoBlocks = new Default(localThemeScope, null, null, 6, null).getInfoBlocks();
        }

        @Override // ji.InterfaceC14916T
        /* renamed from: b, reason: from getter */
        public DefaultIcons getIcons() {
            return this.icons;
        }

        @Override // ji.InterfaceC14916T
        /* renamed from: c, reason: from getter */
        public DefaultQuantityInputs getInputFields() {
            return this.inputFields;
        }
    }

    public D0(C14958r0 anatomy) {
        Intrinsics.j(anatomy, "anatomy");
        this.anatomy = anatomy;
    }

    @Override // ji.w1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC14916T q(LocalThemeScope themeScope, Composer composer, int i10) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(532306076);
        if (ComposerKt.M()) {
            ComposerKt.U(532306076, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.InputFields.InnerQuantityInput.generateAssembly (TextField.kt:647)");
        }
        a aVar = new a(this, themeScope, composer, i10);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return aVar;
    }
}
