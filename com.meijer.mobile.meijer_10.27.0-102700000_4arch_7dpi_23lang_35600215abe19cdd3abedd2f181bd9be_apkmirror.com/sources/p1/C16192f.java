package p1;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroid/content/res/Resources;", "a", "(Landroidx/compose/runtime/Composer;I)Landroid/content/res/Resources;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: p1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16192f {
    public static final Resources a(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(1554054999, i10, -1, "androidx.compose.ui.res.resources (Resources.android.kt:33)");
        }
        composer.o(AndroidCompositionLocals_androidKt.f());
        Resources resources = ((Context) composer.o(AndroidCompositionLocals_androidKt.g())).getResources();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return resources;
    }
}
