package androidx.view;

import V2.CreationExtras;
import android.os.Bundle;
import androidx.view.AbstractC6023l;
import androidx.view.f0;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import x4.f;
import x4.i;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u0003\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\r*\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014\"\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014\"\u001e\u0010\u0017\u001a\f\u0012\b\u0012\u00060\nj\u0002`\u000b0\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014\"\u0018\u0010\u001b\u001a\u00020\u0018*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u001f\u001a\u00020\u001c*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lx4/i;", "Landroidx/lifecycle/h0;", "T", "", "c", "(Lx4/i;)V", "savedStateRegistryOwner", "viewModelStoreOwner", "", "key", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "defaultArgs", "Landroidx/lifecycle/L;", "b", "(Lx4/i;Landroidx/lifecycle/h0;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/L;", "LV2/a;", "a", "(LV2/a;)Landroidx/lifecycle/L;", "LV2/a$c;", "LV2/a$c;", "SAVED_STATE_REGISTRY_OWNER_KEY", "VIEW_MODEL_STORE_OWNER_KEY", "DEFAULT_ARGS_KEY", "Landroidx/lifecycle/T;", "e", "(Landroidx/lifecycle/h0;)Landroidx/lifecycle/T;", "savedStateHandlesVM", "Landroidx/lifecycle/S;", "d", "(Lx4/i;)Landroidx/lifecycle/S;", "savedStateHandlesProvider", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* renamed from: androidx.lifecycle.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5999O {

    /* renamed from: a, reason: collision with root package name */
    @JvmField
    public static final CreationExtras.c<i> f55206a;

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final CreationExtras.c<h0> f55207b;

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public static final CreationExtras.c<Bundle> f55208c;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/lifecycle/O$a", "Landroidx/lifecycle/f0$c;", "Landroidx/lifecycle/c0;", "T", "Lkotlin/reflect/KClass;", "modelClass", "LV2/a;", "extras", "create", "(Lkotlin/reflect/KClass;LV2/a;)Landroidx/lifecycle/c0;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.O$a */
    public static final class a implements f0.c {
        @Override // androidx.lifecycle.f0.c
        public <T extends c0> T create(KClass<T> modelClass, CreationExtras extras) {
            Intrinsics.j(modelClass, "modelClass");
            Intrinsics.j(extras, "extras");
            return new C6003T();
        }

        a() {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/O$b", "LV2/a$c;", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.O$b */
    public static final class b implements CreationExtras.c<i> {
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/O$c", "LV2/a$c;", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.O$c */
    public static final class c implements CreationExtras.c<h0> {
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/O$d", "LV2/a$c;", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.O$d */
    public static final class d implements CreationExtras.c<Bundle> {
    }

    static {
        CreationExtras.Companion companion = CreationExtras.INSTANCE;
        f55206a = new b();
        f55207b = new c();
        f55208c = new d();
    }

    public static final C5996L a(CreationExtras creationExtras) {
        Intrinsics.j(creationExtras, "<this>");
        i iVar = (i) creationExtras.a(f55206a);
        if (iVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        h0 h0Var = (h0) creationExtras.a(f55207b);
        if (h0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) creationExtras.a(f55208c);
        String str = (String) creationExtras.a(f0.f55257c);
        if (str != null) {
            return b(iVar, h0Var, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends i & h0> void c(T t10) {
        Intrinsics.j(t10, "<this>");
        AbstractC6023l.b bVarB = t10.getLifecycle().getState();
        if (bVarB != AbstractC6023l.b.f55276b && bVarB != AbstractC6023l.b.f55277c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t10.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            C6002S c6002s = new C6002S(t10.getSavedStateRegistry(), t10);
            t10.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", c6002s);
            t10.getLifecycle().a(new C5997M(c6002s));
        }
    }

    public static final C6002S d(i iVar) {
        Intrinsics.j(iVar, "<this>");
        f.b bVarB = iVar.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        C6002S c6002s = bVarB instanceof C6002S ? (C6002S) bVarB : null;
        if (c6002s != null) {
            return c6002s;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final C6003T e(h0 h0Var) {
        Intrinsics.j(h0Var, "<this>");
        return (C6003T) f0.Companion.c(f0.INSTANCE, h0Var, new a(), null, 4, null).b("androidx.lifecycle.internal.SavedStateHandlesVM", Reflection.b(C6003T.class));
    }

    private static final C5996L b(i iVar, h0 h0Var, String str, Bundle bundle) {
        C6002S c6002sD = d(iVar);
        C6003T c6003tE = e(h0Var);
        C5996L c5996l = c6003tE.m().get(str);
        if (c5996l == null) {
            C5996L c5996lA = C5996L.INSTANCE.a(c6002sD.b(str), bundle);
            c6003tE.m().put(str, c5996lA);
            return c5996lA;
        }
        return c5996l;
    }
}
