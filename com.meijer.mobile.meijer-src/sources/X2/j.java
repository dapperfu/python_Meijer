package X2;

import V2.CreationExtras;
import androidx.view.InterfaceC6162j;
import androidx.view.c0;
import androidx.view.f0;
import androidx.view.h0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LX2/j;", "", "<init>", "()V", "Landroidx/lifecycle/c0;", "T", "Lkotlin/reflect/KClass;", "modelClass", "", "c", "(Lkotlin/reflect/KClass;)Ljava/lang/String;", "VM", "d", "()Landroidx/lifecycle/c0;", "Landroidx/lifecycle/h0;", "owner", "Landroidx/lifecycle/f0$c;", "b", "(Landroidx/lifecycle/h0;)Landroidx/lifecycle/f0$c;", "LV2/a;", "a", "(Landroidx/lifecycle/h0;)LV2/a;", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f41523a = new j();

    public final CreationExtras a(h0 owner) {
        Intrinsics.j(owner, "owner");
        return owner instanceof InterfaceC6162j ? ((InterfaceC6162j) owner).getDefaultViewModelCreationExtras() : CreationExtras.b.f39630c;
    }

    public final f0.c b(h0 owner) {
        Intrinsics.j(owner, "owner");
        return owner instanceof InterfaceC6162j ? ((InterfaceC6162j) owner).getDefaultViewModelProviderFactory() : c.f41517b;
    }

    public final <T extends c0> String c(KClass<T> modelClass) {
        Intrinsics.j(modelClass, "modelClass");
        String strA = k.a(modelClass);
        if (strA == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + strA;
    }

    public final <VM extends c0> VM d() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    private j() {
    }
}
