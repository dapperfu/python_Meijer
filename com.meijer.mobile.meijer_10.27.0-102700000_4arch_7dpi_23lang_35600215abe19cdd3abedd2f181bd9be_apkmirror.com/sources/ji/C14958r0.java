package ji;

import Ji.C;
import Ji.LocalThemeScope;
import Ji.T;
import androidx.compose.foundation.text.C5693z;
import androidx.compose.foundation.text.InterfaceC5692y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5772o;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.text.input.KeyboardType;
import ji.q1;
import kotlin.G1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import r0.C16692i;
import r0.RoundedCornerShape;
import zi.AdsTextFieldColors;
import zi.C18513r0;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b \u0010!R#\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lji/r0;", "", "Lkotlin/Pair;", "dimensions", "<init>", "(Lkotlin/Pair;)V", "LJi/M;", "themeScope", "LH1/h;", "height", "Lji/q1$f$e;", "h", "(LJi/M;FLandroidx/compose/runtime/Composer;II)Lji/q1$f$e;", "j", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/q1$f$e;", "Lji/q1$f$d;", "g", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/q1$f$d;", "Lji/q1$f$c;", "e", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/q1$f$c;", "Lji/q1$f$b;", "b", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/q1$f$b;", "Lzi/c1;", "i", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lzi/c1;", "k", "Lji/q1$j;", "d", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/q1$j;", "Lji/q1$h$b;", "c", "(Landroidx/compose/runtime/Composer;I)Lji/q1$h$b;", "a", "Lkotlin/Pair;", "getDimensions", "()Lkotlin/Pair;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ji.r0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C14958r0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Pair<Object, Object> dimensions;

    public C14958r0(Pair<Object, Object> dimensions) {
        Intrinsics.j(dimensions, "dimensions");
        this.dimensions = dimensions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(InterfaceC5772o interfaceC5772o, InterfaceC5692y KeyboardActions) {
        Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
        InterfaceC5772o.l(interfaceC5772o, false, 1, null);
        return Unit.f142422a;
    }

    public final q1.f.Dropdown b(LocalThemeScope themeScope, Composer composer, int i10) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(1294858237);
        if (ComposerKt.M()) {
            ComposerKt.U(1294858237, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.InputFields.Anatomy.baseDropdownField (TextField.kt:269)");
        }
        q1.f.Dropdown dropdown = new q1.f.Dropdown(null, false, null, themeScope.getAdsTypography().getBodyCompact().getOne(), null, null, null, false, 1, null, C16692i.c(themeScope.getAdsCornerRadii().getRadius04().getDp()), i(themeScope, composer, i10 & 126), 759, null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return dropdown;
    }

    public final q1.Label d(LocalThemeScope themeScope, Composer composer, int i10) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(-1840725103);
        if (ComposerKt.M()) {
            ComposerKt.U(-1840725103, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.InputFields.Anatomy.baseLabel (TextField.kt:304)");
        }
        q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, themeScope.getAdsTypography().getBodyCompact().getTwo(), null, 383, null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return label;
    }

    public final q1.f.QuantityInput e(LocalThemeScope themeScope, Composer composer, int i10) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(-1754224821);
        if (ComposerKt.M()) {
            ComposerKt.U(-1754224821, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.InputFields.Anatomy.baseQuantityField (TextField.kt:235)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierB = r1.b(androidx.compose.foundation.layout.x.a(androidx.compose.foundation.layout.J.k(companion, H1.h.p(this.dimensions.c() instanceof C14954p0 ? 40 : 32), 0.0f, 2, null), j0.x.f139159a), false, 1, null);
        AdsTextFieldColors adsTextFieldColorsI = i(themeScope, composer, i10 & 126);
        Ji.I one = this.dimensions.c() instanceof C14954p0 ? themeScope.getAdsTypography().getBodyCompact().getOne() : themeScope.getAdsTypography().getBodyCompact().getTwo();
        RoundedCornerShape roundedCornerShapeC = C16692i.c(themeScope.getAdsCornerRadii().getRadius04().getDp());
        KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null);
        final InterfaceC5772o interfaceC5772o = (InterfaceC5772o) composer.o(C5892t0.h());
        composer.startReplaceGroup(5004770);
        boolean zD = composer.D(interfaceC5772o);
        Object objB = composer.B();
        if (zD || objB == Composer.INSTANCE.a()) {
            objB = new Function1() { // from class: ji.l0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C14958r0.f(interfaceC5772o, (InterfaceC5692y) obj);
                }
            };
            composer.t(objB);
        }
        composer.P();
        q1.f.QuantityInput quantityInput = new q1.f.QuantityInput(modifierB, false, null, one, null, keyboardOptions, new C5693z((Function1) objB, null, null, null, null, null, 62, null), false, 1, null, roundedCornerShapeC, adsTextFieldColorsI, null, ((this.dimensions.c() instanceof C14954p0) && (this.dimensions.d() instanceof C14952o0)) ? C14947m.f139896a : ((this.dimensions.c() instanceof C14956q0) && (this.dimensions.d() instanceof C14952o0)) ? C14955q.f139923a : ((this.dimensions.c() instanceof C14954p0) && (this.dimensions.d() instanceof C14948m0)) ? C14949n.f139910a : ((this.dimensions.c() instanceof C14956q0) && (this.dimensions.d() instanceof C14948m0)) ? C14957r.f140188a : this.dimensions.d() instanceof C14950n0 ? C14949n.f139910a : C14947m.f139896a, androidx.compose.foundation.layout.D.k(companion, H1.h.p(4), 0.0f, 2, null), this.dimensions.d() instanceof C14950n0, 4758, null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return quantityInput;
    }

    public final q1.f.TextArea g(LocalThemeScope themeScope, Composer composer, int i10) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(144104099);
        if (ComposerKt.M()) {
            ComposerKt.U(144104099, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.InputFields.Anatomy.baseTextArea (TextField.kt:224)");
        }
        q1.f.TextArea textArea = new q1.f.TextArea(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, H1.h.p(110)), 0.0f, 1, null), false, null, themeScope.getAdsTypography().getBodyCompact().getOne(), null, null, null, false, 0, null, C16692i.c(themeScope.getAdsCornerRadii().getRadius04().getDp()), i(themeScope, composer, i10 & 126), 1014, null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return textArea;
    }

    public final q1.f.TextInput h(LocalThemeScope themeScope, float f10, Composer composer, int i10, int i11) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(-166978257);
        float fP = (i11 & 2) != 0 ? H1.h.p(48) : f10;
        if (ComposerKt.M()) {
            ComposerKt.U(-166978257, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.InputFields.Anatomy.baseTextField (TextField.kt:200)");
        }
        q1.f.TextInput textInput = new q1.f.TextInput(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, fP), 0.0f, 1, null), false, null, themeScope.getAdsTypography().getBodyCompact().getOne(), null, null, null, false, 1, null, C16692i.c(themeScope.getAdsCornerRadii().getRadius04().getDp()), i(themeScope, composer, ((i10 >> 3) & 112) | (i10 & 14)), 758, null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return textInput;
    }

    public final AdsTextFieldColors i(LocalThemeScope themeScope, Composer composer, int i10) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(-318917131);
        if (ComposerKt.M()) {
            ComposerKt.U(-318917131, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.InputFields.Anatomy.baseTextFieldColors (TextField.kt:278)");
        }
        AdsTextFieldColors adsTextFieldColorsO = C18513r0.o(G1.f166905a, themeScope.getAdsColors().getAdsColorText01().getColor(), 0L, themeScope.getAdsColors().getAdsColorUIBackground01().getColor(), 0L, 0L, 0L, 0L, themeScope.getAdsColors().getAdsColorFocus().getColor(), themeScope.getAdsColors().getAdsColorUIBorder01().getColor(), themeScope.getAdsColors().getAdsColorsDisabled().getColor(), themeScope.getAdsColors().getAdsColorSupportError().getColor(), themeScope.getAdsColors().getAdsColorSupportWarning().getColor(), themeScope.getAdsColors().getAdsColorSupportSuccess().getColor(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 6, 0, 0, 0, 2147475578);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return adsTextFieldColorsO;
    }

    public final q1.f.TextInput j(LocalThemeScope themeScope, Composer composer, int i10) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(-1177035246);
        if (ComposerKt.M()) {
            ComposerKt.U(-1177035246, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.InputFields.Anatomy.inverseTextField (TextField.kt:212)");
        }
        q1.f.TextInput textInput = new q1.f.TextInput(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, H1.h.p(40)), 0.0f, 1, null), false, null, themeScope.getAdsTypography().getBodyCompact().getOne(), null, null, null, false, 1, null, C16692i.c(themeScope.getAdsCornerRadii().getRadius04().getDp()), k(themeScope, composer, i10 & 126), 758, null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return textInput;
    }

    public final AdsTextFieldColors k(LocalThemeScope themeScope, Composer composer, int i10) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(-899464814);
        if (ComposerKt.M()) {
            ComposerKt.U(-899464814, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.InputFields.Anatomy.inverseTextFieldColors (TextField.kt:291)");
        }
        G1 g12 = G1.f166905a;
        long color = themeScope.getAdsColors().getAdsColorInverse().getColor();
        long color2 = T.a.C3851e.f15834c.getColor();
        long color3 = themeScope.getAdsColors().getAdsColorBrandPrimary().getColor();
        AdsTextFieldColors adsTextFieldColorsO = C18513r0.o(g12, color, 0L, color2, themeScope.getAdsColors().getAdsColorInverse().getColor(), 0L, 0L, 0L, themeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), color3, themeScope.getAdsColors().getAdsColorsDisabled().getColor(), themeScope.getAdsColors().getAdsColorSupportError().getColor(), themeScope.getAdsColors().getAdsColorSupportWarning().getColor(), themeScope.getAdsColors().getAdsColorSupportSuccess().getColor(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 6, 0, 0, 0, 2147475570);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return adsTextFieldColorsO;
    }

    public final q1.h.DrawableIcon c(Composer composer, int i10) {
        composer.startReplaceGroup(-1005729524);
        if (ComposerKt.M()) {
            ComposerKt.U(-1005729524, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.InputFields.Anatomy.baseIcons (TextField.kt:310)");
        }
        q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.d.f15495c, null, null, null, 0.0f, null, androidx.compose.foundation.layout.J.v(Modifier.INSTANCE, H1.h.p(24)), 62, null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return drawableIcon;
    }
}
