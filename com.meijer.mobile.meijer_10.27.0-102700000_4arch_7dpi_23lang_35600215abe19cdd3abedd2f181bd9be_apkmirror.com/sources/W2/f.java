package W2;

import V2.CreationExtras;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.view.InterfaceC6020j;
import androidx.view.c0;
import androidx.view.f0;
import androidx.view.h0;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/h0;", "viewModelStoreOwner", "", "key", "Landroidx/lifecycle/f0$c;", "factory", "LV2/a;", "extras", "a", "(Ljava/lang/Class;Landroidx/lifecycle/h0;Ljava/lang/String;Landroidx/lifecycle/f0$c;LV2/a;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/c0;", "lifecycle-viewmodel-compose_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/lifecycle/viewmodel/compose/ViewModelKt")
/* loaded from: classes.dex */
final /* synthetic */ class f {
    public static final <VM extends c0> VM a(Class<VM> cls, h0 h0Var, String str, f0.c cVar, CreationExtras creationExtras, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0 && (h0Var = b.f38408a.c(composer, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        if ((i11 & 8) != 0) {
            cVar = null;
        }
        if ((i11 & 16) != 0) {
            creationExtras = h0Var instanceof InterfaceC6020j ? ((InterfaceC6020j) h0Var).getDefaultViewModelCreationExtras() : CreationExtras.b.f36770c;
        }
        if (ComposerKt.M()) {
            ComposerKt.U(-1566358618, i10, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.android.kt:118)");
        }
        VM vm2 = (VM) d.a(h0Var, JvmClassMappingKt.e(cls), str, cVar, creationExtras);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return vm2;
    }
}
