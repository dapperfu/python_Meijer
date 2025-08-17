package androidx.view;

import V2.CreationExtras;
import android.os.Bundle;
import androidx.view.f0;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import x4.f;
import x4.i;

@Deprecated
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0015J7\u0010\u0018\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0017\u001a\u00020\u0016H$¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\tH\u0017¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Landroidx/lifecycle/a;", "Landroidx/lifecycle/f0$e;", "Landroidx/lifecycle/f0$c;", "Lx4/i;", "owner", "Landroid/os/Bundle;", "defaultArgs", "<init>", "(Lx4/i;Landroid/os/Bundle;)V", "Landroidx/lifecycle/c0;", "T", "", "key", "Ljava/lang/Class;", "modelClass", "b", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/c0;", "LV2/a;", "extras", "create", "(Ljava/lang/Class;LV2/a;)Landroidx/lifecycle/c0;", "(Ljava/lang/Class;)Landroidx/lifecycle/c0;", "Landroidx/lifecycle/L;", "handle", "c", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/L;)Landroidx/lifecycle/c0;", "viewModel", "", "a", "(Landroidx/lifecycle/c0;)V", "Lx4/f;", "Lx4/f;", "savedStateRegistry", "Landroidx/lifecycle/l;", "Landroidx/lifecycle/l;", "lifecycle", "d", "Landroid/os/Bundle;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6010a extends f0.e implements f0.c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private f savedStateRegistry;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private AbstractC6023l lifecycle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Bundle defaultArgs;

    protected abstract <T extends c0> T c(String key, Class<T> modelClass, C5996L handle);

    @Override // androidx.lifecycle.f0.c
    public <T extends c0> T create(Class<T> modelClass, CreationExtras extras) {
        Intrinsics.j(modelClass, "modelClass");
        Intrinsics.j(extras, "extras");
        String str = (String) extras.a(f0.d.f55267d);
        if (str != null) {
            return this.savedStateRegistry != null ? (T) b(str, modelClass) : (T) c(str, modelClass, C5999O.a(extras));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    public AbstractC6010a(i owner, Bundle bundle) {
        Intrinsics.j(owner, "owner");
        this.savedStateRegistry = owner.getSavedStateRegistry();
        this.lifecycle = owner.getLifecycle();
        this.defaultArgs = bundle;
    }

    private final <T extends c0> T b(String key, Class<T> modelClass) {
        f fVar = this.savedStateRegistry;
        Intrinsics.g(fVar);
        AbstractC6023l abstractC6023l = this.lifecycle;
        Intrinsics.g(abstractC6023l);
        C5998N c5998nB = C6022k.b(fVar, abstractC6023l, key, this.defaultArgs);
        T t10 = (T) c(key, modelClass, c5998nB.getHandle());
        t10.addCloseable("androidx.lifecycle.savedstate.vm.tag", c5998nB);
        return t10;
    }

    @Override // androidx.lifecycle.f0.e
    public void a(c0 viewModel) {
        Intrinsics.j(viewModel, "viewModel");
        f fVar = this.savedStateRegistry;
        if (fVar != null) {
            Intrinsics.g(fVar);
            AbstractC6023l abstractC6023l = this.lifecycle;
            Intrinsics.g(abstractC6023l);
            C6022k.a(viewModel, fVar, abstractC6023l);
        }
    }

    @Override // androidx.lifecycle.f0.c
    public <T extends c0> T create(Class<T> modelClass) {
        Intrinsics.j(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            if (this.lifecycle != null) {
                return (T) b(canonicalName, modelClass);
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
