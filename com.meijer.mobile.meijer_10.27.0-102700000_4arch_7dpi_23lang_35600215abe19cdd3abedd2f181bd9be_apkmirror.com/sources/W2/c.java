package W2;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.C6021j0;
import androidx.view.h0;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/h0;", "a", "(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/h0;", "lifecycle-viewmodel-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class c {
    public static final h0 a(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(1382572291, i10, -1, "androidx.lifecycle.viewmodel.compose.findViewTreeViewModelStoreOwner (LocalViewModelStoreOwner.android.kt:25)");
        }
        h0 h0VarA = C6021j0.a((View) composer.o(AndroidCompositionLocals_androidKt.k()));
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return h0VarA;
    }
}
