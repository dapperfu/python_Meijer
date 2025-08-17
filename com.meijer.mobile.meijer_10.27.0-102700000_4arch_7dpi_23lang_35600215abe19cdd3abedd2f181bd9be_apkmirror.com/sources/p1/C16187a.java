package p1;

import V0.C5349s0;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b2.C6187h;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", PreferencesHelper.PREF_ID, "LV0/q0;", "a", "(ILandroidx/compose/runtime/Composer;I)J", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: p1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16187a {
    public static final long a(int i10, Composer composer, int i11) {
        if (ComposerKt.M()) {
            ComposerKt.U(-1777644873, i11, -1, "androidx.compose.ui.res.colorResource (ColorResources.android.kt:33)");
        }
        long jB = C5349s0.b(C6187h.d(C16192f.a(composer, 0), i10, ((Context) composer.o(AndroidCompositionLocals_androidKt.g())).getTheme()));
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return jB;
    }
}
