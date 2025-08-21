package W2;

import V2.CreationExtras;
import androidx.view.InterfaceC6162j;
import androidx.view.c0;
import androidx.view.f0;
import androidx.view.h0;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/h0;", "Lkotlin/reflect/KClass;", "modelClass", "", "key", "Landroidx/lifecycle/f0$c;", "factory", "LV2/a;", "extras", "a", "(Landroidx/lifecycle/h0;Lkotlin/reflect/KClass;Ljava/lang/String;Landroidx/lifecycle/f0$c;LV2/a;)Landroidx/lifecycle/c0;", "lifecycle-viewmodel-compose_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/lifecycle/viewmodel/compose/ViewModelKt")
@SourceDebugExtension
/* loaded from: classes.dex */
final /* synthetic */ class e {
    public static final <VM extends c0> VM a(h0 h0Var, KClass<VM> kClass, String str, f0.c cVar, CreationExtras creationExtras) {
        f0 f0VarA = cVar != null ? f0.INSTANCE.a(h0Var.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String(), cVar, creationExtras) : h0Var instanceof InterfaceC6162j ? f0.INSTANCE.a(h0Var.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String(), ((InterfaceC6162j) h0Var).getDefaultViewModelProviderFactory(), creationExtras) : f0.Companion.c(f0.INSTANCE, h0Var, null, null, 6, null);
        return str != null ? (VM) f0VarA.b(str, kClass) : (VM) f0VarA.c(kClass);
    }
}
