package O2;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.InterfaceC6162j;
import androidx.view.f0;
import androidx.view.h0;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/h0;", "viewModelStoreOwner", "Landroidx/lifecycle/f0$c;", "a", "(Landroidx/lifecycle/h0;Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/f0$c;", "hilt-navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class a {
    @PublishedApi
    public static final f0.c a(h0 h0Var, Composer composer, int i10) {
        f0.c cVarA;
        composer.startReplaceableGroup(1770922558);
        if (h0Var instanceof InterfaceC6162j) {
            cVarA = N2.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g()), ((InterfaceC6162j) h0Var).getDefaultViewModelProviderFactory());
        } else {
            cVarA = null;
        }
        composer.U();
        return cVarA;
    }
}
