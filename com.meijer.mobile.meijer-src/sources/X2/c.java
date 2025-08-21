package X2;

import V2.CreationExtras;
import androidx.view.c0;
import androidx.view.f0;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LX2/c;", "Landroidx/lifecycle/f0$c;", "<init>", "()V", "Landroidx/lifecycle/c0;", "T", "Lkotlin/reflect/KClass;", "modelClass", "LV2/a;", "extras", "create", "(Lkotlin/reflect/KClass;LV2/a;)Landroidx/lifecycle/c0;", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c implements f0.c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f41517b = new c();

    @Override // androidx.lifecycle.f0.c
    public <T extends c0> T create(KClass<T> modelClass, CreationExtras extras) {
        Intrinsics.j(modelClass, "modelClass");
        Intrinsics.j(extras, "extras");
        return (T) d.f41518a.a(JvmClassMappingKt.b(modelClass));
    }

    private c() {
    }
}
