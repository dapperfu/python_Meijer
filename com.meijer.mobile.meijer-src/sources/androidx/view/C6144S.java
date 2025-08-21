package androidx.view;

import android.os.Bundle;
import j2.C14923c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import x4.C18083c;
import x4.C18086f;
import x4.C18090j;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u001e\u0010\u001a\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001e\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/lifecycle/S;", "Lx4/f$b;", "Lx4/f;", "savedStateRegistry", "Landroidx/lifecycle/h0;", "viewModelStoreOwner", "<init>", "(Lx4/f;Landroidx/lifecycle/h0;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "saveState", "()Landroid/os/Bundle;", "", "d", "()V", "", "key", "b", "(Ljava/lang/String;)Landroid/os/Bundle;", "a", "Lx4/f;", "", "Z", "restored", "c", "Landroid/os/Bundle;", "restoredState", "Landroidx/lifecycle/T;", "Lkotlin/Lazy;", "()Landroidx/lifecycle/T;", "viewModel", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.lifecycle.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6144S implements C18086f.b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C18086f savedStateRegistry;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean restored;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Bundle restoredState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel;

    public C6144S(C18086f savedStateRegistry, final h0 viewModelStoreOwner) {
        Intrinsics.j(savedStateRegistry, "savedStateRegistry");
        Intrinsics.j(viewModelStoreOwner, "viewModelStoreOwner");
        this.savedStateRegistry = savedStateRegistry;
        this.viewModel = LazyKt.b(new Function0() { // from class: androidx.lifecycle.Q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6144S.e(viewModelStoreOwner);
            }
        });
    }

    private final C6145T c() {
        return (C6145T) this.viewModel.getValue();
    }

    public final Bundle b(String key) {
        Pair[] pairArr;
        Intrinsics.j(key, "key");
        d();
        Bundle bundle = this.restoredState;
        if (bundle == null || !C18083c.b(C18083c.a(bundle), key)) {
            return null;
        }
        Bundle bundleD = C18083c.d(C18083c.a(bundle), key);
        if (bundleD == null) {
            Map mapK = MapsKt.k();
            if (mapK.isEmpty()) {
                pairArr = new Pair[0];
            } else {
                ArrayList arrayList = new ArrayList(mapK.size());
                for (Map.Entry entry : mapK.entrySet()) {
                    arrayList.add(TuplesKt.a((String) entry.getKey(), entry.getValue()));
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            bundleD = C14923c.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            C18090j.a(bundleD);
        }
        C18090j.e(C18090j.a(bundle), key);
        if (C18083c.f(C18083c.a(bundle))) {
            this.restoredState = null;
        }
        return bundleD;
    }

    public final void d() {
        Pair[] pairArr;
        if (this.restored) {
            return;
        }
        Bundle bundleA = this.savedStateRegistry.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Map mapK = MapsKt.k();
        if (mapK.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapK.size());
            for (Map.Entry entry : mapK.entrySet()) {
                arrayList.add(TuplesKt.a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleB = C14923c.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleA2 = C18090j.a(bundleB);
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            C18090j.b(bundleA2, bundle);
        }
        if (bundleA != null) {
            C18090j.b(bundleA2, bundleA);
        }
        this.restoredState = bundleB;
        this.restored = true;
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6145T e(h0 h0Var) {
        return C6141O.e(h0Var);
    }

    @Override // x4.C18086f.b
    public Bundle saveState() {
        Pair[] pairArr;
        Map mapK = MapsKt.k();
        if (mapK.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapK.size());
            for (Map.Entry entry : mapK.entrySet()) {
                arrayList.add(TuplesKt.a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleB = C14923c.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleA = C18090j.a(bundleB);
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            C18090j.b(bundleA, bundle);
        }
        for (Map.Entry<String, C6138L> entry2 : c().m().entrySet()) {
            String key = entry2.getKey();
            Bundle bundleSaveState = entry2.getValue().e().saveState();
            if (!C18083c.f(C18083c.a(bundleSaveState))) {
                C18090j.c(bundleA, key, bundleSaveState);
            }
        }
        this.restored = false;
        return bundleB;
    }
}
