package ck;

import ak.AbstractC5607a;
import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u000f\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lak/a;", "formattedString", "", "a", "(Lak/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "b", "Landroid/content/res/Resources;", "c", "(Landroidx/compose/runtime/Composer;I)Landroid/content/res/Resources;", "i18n_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ck.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6408b {
    public static final String a(AbstractC5607a abstractC5607a, Composer composer, int i10) {
        String strC;
        if (ComposerKt.M()) {
            ComposerKt.U(-655351936, i10, -1, "com.meijer.mobile.core.i18n.compose.formattedString (ComposeExt.kt:24)");
        }
        Resources resourcesC = c(composer, 0);
        if (abstractC5607a != null) {
            strC = abstractC5607a.c(resourcesC);
        } else {
            strC = null;
        }
        if (strC == null) {
            strC = "";
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return strC;
    }

    public static final String b(AbstractC5607a abstractC5607a, Composer composer, int i10) {
        String strC;
        if (ComposerKt.M()) {
            ComposerKt.U(34569995, i10, -1, "com.meijer.mobile.core.i18n.compose.formattedStringHtml (ComposeExt.kt:37)");
        }
        Resources resourcesC = c(composer, 0);
        Spanned spannedA = null;
        if (abstractC5607a != null && (strC = abstractC5607a.c(resourcesC)) != null) {
            spannedA = m2.b.a(strC, 0, null, null);
        }
        String strValueOf = String.valueOf(spannedA);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return strValueOf;
    }

    private static final Resources c(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-892136567, i10, -1, "com.meijer.mobile.core.i18n.compose.resources (ComposeExt.kt:61)");
        }
        composer.o(AndroidCompositionLocals_androidKt.f());
        Resources resources = ((Context) composer.o(AndroidCompositionLocals_androidKt.g())).getResources();
        Intrinsics.i(resources, "getResources(...)");
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return resources;
    }
}
