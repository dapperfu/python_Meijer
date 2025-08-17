package ji;

import Ci.AdsNotificationColors;
import Ji.C;
import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.C5795w;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import d0.C13439f;
import ji.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import r0.C16692i;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lji/V0;", "", "<init>", "()V", "LJi/M;", "themeScope", "Lji/q1$m$c;", "c", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/q1$m$c;", "Lji/q1$m$b;", "b", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/q1$m$b;", "LCi/a;", "d", "(LJi/M;Landroidx/compose/runtime/Composer;I)LCi/a;", "LJi/C;", BarcodePickDeserializer.FIELD_ICON, "", "contentDescription", "Lji/q1$h$b;", "a", "(LJi/M;LJi/C;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lji/q1$h$b;", "Lji/q1$j;", "e", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/q1$j;", "f", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class V0 {
    public final q1.h.DrawableIcon a(LocalThemeScope themeScope, Ji.C c10, String str, Composer composer, int i10, int i11) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(1657832007);
        Ji.C c11 = (i11 & 2) != 0 ? C.d.f15495c : c10;
        String str2 = (i11 & 4) != 0 ? null : str;
        if (ComposerKt.M()) {
            ComposerKt.U(1657832007, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.Notifications.Anatomy.baseIcons (Notification.kt:138)");
        }
        q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(c11, str2, null, null, 0.0f, null, C5795w.b(androidx.compose.foundation.layout.J.v(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, themeScope.getAdsSpacing().getThree().getDp(), H1.h.p(15), 0.0f, 0.0f, 12, null), H1.h.p(20)), kotlin.q.f17163a), 60, null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return drawableIcon;
    }

    public final q1.m.Inline b(LocalThemeScope themeScope, Composer composer, int i10) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(1661646744);
        if (ComposerKt.M()) {
            ComposerKt.U(1661646744, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.Notifications.Anatomy.baseInline (Notification.kt:95)");
        }
        int i11 = i10 & 126;
        AdsNotificationColors adsNotificationColorsD = d(themeScope, composer, i11);
        Modifier.Companion companion = Modifier.INSTANCE;
        q1.m.Inline inline = new q1.m.Inline(C13439f.g(androidx.compose.foundation.b.d(companion, adsNotificationColorsD.getBackgroundFill(), null, 2, null), H1.h.p(1), adsNotificationColorsD.getBackgroundBorder(), C16692i.c(H1.h.p(8))), null, adsNotificationColorsD, a(themeScope, C.d.f15495c, null, composer, ((i10 << 6) & 7168) | (i10 & 14) | 48, 4), new q1.h.DrawableIcon(C.f.p.f15524e, null, null, null, 0.0f, themeScope.getAdsColors().getAdsColorIcon02(), C5795w.b(companion, kotlin.q.f17164b), 30, null), e(themeScope, composer, i11), f(themeScope, composer, i11), 2, null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return inline;
    }

    public final q1.m.Toast c(LocalThemeScope themeScope, Composer composer, int i10) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(3975472);
        if (ComposerKt.M()) {
            ComposerKt.U(3975472, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.Notifications.Anatomy.baseToast (Notification.kt:65)");
        }
        int i11 = i10 & 126;
        AdsNotificationColors adsNotificationColorsD = d(themeScope, composer, i11);
        Modifier.Companion companion = Modifier.INSTANCE;
        float f10 = 8;
        q1.m.Toast toast = new q1.m.Toast(C13439f.g(androidx.compose.foundation.b.d(T0.l.b(androidx.compose.foundation.layout.D.m(companion, themeScope.getAdsSpacing().getFour().getDp(), 0.0f, themeScope.getAdsSpacing().getFour().getDp(), themeScope.getAdsSpacing().getFive().getDp(), 2, null), H1.h.p(10), C16692i.c(H1.h.p(f10)), false, 0L, 0L, 28, null), adsNotificationColorsD.getBackgroundFill(), null, 2, null), H1.h.p(1), adsNotificationColorsD.getBackgroundBorder(), C16692i.c(H1.h.p(f10))), null, adsNotificationColorsD, a(themeScope, C.d.f15495c, null, composer, ((i10 << 6) & 7168) | (i10 & 14) | 48, 4), new q1.h.DrawableIcon(C.f.p.f15524e, null, null, null, 0.0f, themeScope.getAdsColors().getAdsColorIcon02(), C5795w.b(companion, kotlin.q.f17164b), 30, null), e(themeScope, composer, i11), f(themeScope, composer, i11), 2, null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return toast;
    }

    public final AdsNotificationColors d(LocalThemeScope themeScope, Composer composer, int i10) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(-1217207132);
        if (ComposerKt.M()) {
            ComposerKt.U(-1217207132, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.Notifications.Anatomy.baseToastColors (Notification.kt:120)");
        }
        AdsNotificationColors adsNotificationColors = new AdsNotificationColors(themeScope.getAdsColors().getAdsColorSupportSuccess().getColor(), themeScope.getAdsColors().getAdsColorSupportError().getColor(), themeScope.getAdsColors().getAdsColorSupportWarning().getColor(), themeScope.getAdsColors().getAdsColorSupportInformational().getColor(), themeScope.getAdsColors().getAdsColorText01().getColor(), themeScope.getAdsColors().getAdsColorUIDivider().getColor(), themeScope.getAdsColors().getAdsColorUIBorder02().getColor(), themeScope.getAdsColors().getAdsColorUIBackground01().getColor(), themeScope.getAdsColors().getAdsColorTransparent().getColor(), null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return adsNotificationColors;
    }

    public final q1.Label e(LocalThemeScope themeScope, Composer composer, int i10) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(1896787417);
        if (ComposerKt.M()) {
            ComposerKt.U(1896787417, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.Notifications.Anatomy.bodyLabel (Notification.kt:152)");
        }
        q1.Label label = new q1.Label(C5795w.b(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, themeScope.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 0.0f, 14, null), kotlin.q.f17167e), null, null, null, 0, false, 0, themeScope.getAdsTypography().getBodyCompact().getTwo(), null, 382, null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return label;
    }

    public final q1.Label f(LocalThemeScope themeScope, Composer composer, int i10) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(-35360833);
        if (ComposerKt.M()) {
            ComposerKt.U(-35360833, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.Notifications.Anatomy.titleLabel (Notification.kt:163)");
        }
        q1.Label label = new q1.Label(C5795w.b(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, themeScope.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 0.0f, 14, null), kotlin.q.f17166d), null, null, null, 0, false, 0, themeScope.getAdsTypography().getHeadings().getEight(), null, 382, null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return label;
    }
}
