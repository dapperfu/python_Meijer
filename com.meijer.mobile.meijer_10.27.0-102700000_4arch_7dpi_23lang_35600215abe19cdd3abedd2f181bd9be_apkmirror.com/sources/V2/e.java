package V2;

import androidx.view.c0;
import androidx.view.f0;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "factory", "Lkotlin/reflect/KClass;", "modelClass", "LV2/a;", "extras", "a", "(Landroidx/lifecycle/f0$c;Lkotlin/reflect/KClass;LV2/a;)Landroidx/lifecycle/c0;", "lifecycle-viewmodel_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {
    public static final <VM extends c0> VM a(f0.c factory, KClass<VM> modelClass, CreationExtras extras) {
        Intrinsics.j(factory, "factory");
        Intrinsics.j(modelClass, "modelClass");
        Intrinsics.j(extras, "extras");
        try {
            try {
                return (VM) factory.create(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return (VM) factory.create(JvmClassMappingKt.b(modelClass));
            }
        } catch (AbstractMethodError unused2) {
            return (VM) factory.create(JvmClassMappingKt.b(modelClass), extras);
        }
    }
}
