package androidx.view;

import V2.CreationExtras;
import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.view.f0;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import x4.C18086f;
import x4.InterfaceC18089i;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B%\b\u0017\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0003\u0010\u000bJ/\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0015J-\u0010\u0018\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b\u0012\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\fH\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Landroidx/lifecycle/U;", "Landroidx/lifecycle/f0$e;", "Landroidx/lifecycle/f0$c;", "<init>", "()V", "Landroid/app/Application;", "application", "Lx4/i;", "owner", "Landroid/os/Bundle;", "defaultArgs", "(Landroid/app/Application;Lx4/i;Landroid/os/Bundle;)V", "Landroidx/lifecycle/c0;", "T", "Lkotlin/reflect/KClass;", "modelClass", "LV2/a;", "extras", "create", "(Lkotlin/reflect/KClass;LV2/a;)Landroidx/lifecycle/c0;", "Ljava/lang/Class;", "(Ljava/lang/Class;LV2/a;)Landroidx/lifecycle/c0;", "", "key", "b", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/c0;", "(Ljava/lang/Class;)Landroidx/lifecycle/c0;", "viewModel", "", "a", "(Landroidx/lifecycle/c0;)V", "Landroid/app/Application;", "c", "Landroidx/lifecycle/f0$c;", "factory", "d", "Landroid/os/Bundle;", "Landroidx/lifecycle/l;", "e", "Landroidx/lifecycle/l;", "lifecycle", "Lx4/f;", "f", "Lx4/f;", "savedStateRegistry", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.lifecycle.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6146U extends f0.e implements f0.c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Application application;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f0.c factory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Bundle defaultArgs;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private AbstractC6165l lifecycle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private C18086f savedStateRegistry;

    public C6146U() {
        this.factory = new f0.a();
    }

    @Override // androidx.lifecycle.f0.c
    public <T extends c0> T create(KClass<T> modelClass, CreationExtras extras) {
        Intrinsics.j(modelClass, "modelClass");
        Intrinsics.j(extras, "extras");
        return (T) create(JvmClassMappingKt.b(modelClass), extras);
    }

    @Override // androidx.lifecycle.f0.e
    public void a(c0 viewModel) {
        Intrinsics.j(viewModel, "viewModel");
        if (this.lifecycle != null) {
            C18086f c18086f = this.savedStateRegistry;
            Intrinsics.g(c18086f);
            AbstractC6165l abstractC6165l = this.lifecycle;
            Intrinsics.g(abstractC6165l);
            C6164k.a(viewModel, c18086f, abstractC6165l);
        }
    }

    public final <T extends c0> T b(String key, Class<T> modelClass) {
        T t10;
        Application application;
        Intrinsics.j(key, "key");
        Intrinsics.j(modelClass, "modelClass");
        AbstractC6165l abstractC6165l = this.lifecycle;
        if (abstractC6165l == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = C6153b.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || this.application == null) ? C6147V.c(modelClass, C6147V.f55447b) : C6147V.c(modelClass, C6147V.f55446a);
        if (constructorC == null) {
            return this.application != null ? (T) this.factory.create(modelClass) : (T) f0.d.INSTANCE.a().create(modelClass);
        }
        C18086f c18086f = this.savedStateRegistry;
        Intrinsics.g(c18086f);
        C6140N c6140nB = C6164k.b(c18086f, abstractC6165l, key, this.defaultArgs);
        if (!zIsAssignableFrom || (application = this.application) == null) {
            t10 = (T) C6147V.d(modelClass, constructorC, c6140nB.getHandle());
        } else {
            Intrinsics.g(application);
            t10 = (T) C6147V.d(modelClass, constructorC, application, c6140nB.getHandle());
        }
        t10.addCloseable("androidx.lifecycle.savedstate.vm.tag", c6140nB);
        return t10;
    }

    @Override // androidx.lifecycle.f0.c
    public <T extends c0> T create(Class<T> modelClass, CreationExtras extras) {
        Intrinsics.j(modelClass, "modelClass");
        Intrinsics.j(extras, "extras");
        String str = (String) extras.a(f0.f55481c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(C6141O.f55430a) == null || extras.a(C6141O.f55431b) == null) {
            if (this.lifecycle != null) {
                return (T) b(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(f0.a.f55485h);
        boolean zIsAssignableFrom = C6153b.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || application == null) ? C6147V.c(modelClass, C6147V.f55447b) : C6147V.c(modelClass, C6147V.f55446a);
        return constructorC == null ? (T) this.factory.create(modelClass, extras) : (!zIsAssignableFrom || application == null) ? (T) C6147V.d(modelClass, constructorC, C6141O.a(extras)) : (T) C6147V.d(modelClass, constructorC, application, C6141O.a(extras));
    }

    @SuppressLint({"LambdaLast"})
    public C6146U(Application application, InterfaceC18089i owner, Bundle bundle) {
        f0.a aVar;
        Intrinsics.j(owner, "owner");
        this.savedStateRegistry = owner.getSavedStateRegistry();
        this.lifecycle = owner.getLifecycle();
        this.defaultArgs = bundle;
        this.application = application;
        if (application != null) {
            aVar = f0.a.INSTANCE.a(application);
        } else {
            aVar = new f0.a();
        }
        this.factory = aVar;
    }

    @Override // androidx.lifecycle.f0.c
    public <T extends c0> T create(Class<T> modelClass) {
        Intrinsics.j(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) b(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
