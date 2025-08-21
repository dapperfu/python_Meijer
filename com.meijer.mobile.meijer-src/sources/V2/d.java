package V2;

import X2.j;
import androidx.view.c0;
import androidx.view.f0;
import androidx.view.g0;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019¨\u0006\u001b"}, d2 = {"LV2/d;", "", "Landroidx/lifecycle/g0;", PlaceTypes.STORE, "Landroidx/lifecycle/f0$c;", "factory", "LV2/a;", "defaultExtras", "<init>", "(Landroidx/lifecycle/g0;Landroidx/lifecycle/f0$c;LV2/a;)V", "Landroidx/lifecycle/c0;", "T", "Lkotlin/reflect/KClass;", "modelClass", "", "key", "d", "(Lkotlin/reflect/KClass;Ljava/lang/String;)Landroidx/lifecycle/c0;", "a", "Landroidx/lifecycle/g0;", "b", "Landroidx/lifecycle/f0$c;", "c", "LV2/a;", "LX2/e;", "LX2/e;", "lock", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 store;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f0.c factory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CreationExtras defaultExtras;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final X2.e lock;

    public d(g0 store, f0.c factory, CreationExtras defaultExtras) {
        Intrinsics.j(store, "store");
        Intrinsics.j(factory, "factory");
        Intrinsics.j(defaultExtras, "defaultExtras");
        this.store = store;
        this.factory = factory;
        this.defaultExtras = defaultExtras;
        this.lock = new X2.e();
    }

    public static /* synthetic */ c0 e(d dVar, KClass kClass, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = j.f41523a.c(kClass);
        }
        return dVar.d(kClass, str);
    }

    public final <T extends c0> T d(KClass<T> modelClass, String key) {
        T t10;
        Intrinsics.j(modelClass, "modelClass");
        Intrinsics.j(key, "key");
        synchronized (this.lock) {
            try {
                t10 = (T) this.store.b(key);
                if (modelClass.s(t10)) {
                    if (this.factory instanceof f0.e) {
                        f0.e eVar = (f0.e) this.factory;
                        Intrinsics.g(t10);
                        eVar.a(t10);
                    }
                    Intrinsics.h(t10, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    b bVar = new b(this.defaultExtras);
                    bVar.c(f0.f55481c, key);
                    t10 = (T) e.a(this.factory, modelClass, bVar);
                    this.store.d(key, t10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }
}
