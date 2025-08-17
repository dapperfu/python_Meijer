package y4;

import android.os.Bundle;
import androidx.view.AbstractC6023l;
import androidx.view.InterfaceC6027p;
import androidx.view.InterfaceC6030s;
import j2.C14835c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import x4.C18017c;
import x4.f;
import x4.i;
import x4.j;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00052\u000e\u0010\u0019\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\u00052\n\u0010\u001c\u001a\u00060\u000bj\u0002`\fH\u0001¢\u0006\u0004\b\u001d\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001e\u0010/\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010.R$\u00102\u001a\u00020*2\u0006\u00100\u001a\u00020*8G@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u00103R\"\u00106\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010,\u001a\u0004\b+\u00103\"\u0004\b4\u00105¨\u00067"}, d2 = {"Ly4/b;", "", "Lx4/i;", "owner", "Lkotlin/Function0;", "", "onAttach", "<init>", "(Lx4/i;Lkotlin/jvm/functions/Function0;)V", "", "key", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "c", "(Ljava/lang/String;)Landroid/os/Bundle;", "Lx4/f$b;", "provider", "j", "(Ljava/lang/String;Lx4/f$b;)V", "d", "(Ljava/lang/String;)Lx4/f$b;", "k", "(Ljava/lang/String;)V", "f", "()V", "savedState", "h", "(Landroid/os/Bundle;)V", "outBundle", "i", "a", "Lx4/i;", "b", "Lkotlin/jvm/functions/Function0;", "getOnAttach$savedstate_release", "()Lkotlin/jvm/functions/Function0;", "Ly4/c;", "Ly4/c;", "lock", "", "Ljava/util/Map;", "keyToProviders", "", "e", "Z", "attached", "Landroid/os/Bundle;", "restoredState", "value", "g", "isRestored", "()Z", "setAllowingSavingState$savedstate_release", "(Z)V", "isAllowingSavingState", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: y4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18161b {

    /* renamed from: i, reason: collision with root package name */
    private static final a f170184i = new a(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i owner;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onAttach;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c lock;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<String, f.b> keyToProviders;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean attached;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Bundle restoredState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isRestored;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isAllowingSavingState;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ly4/b$a;", "", "<init>", "()V", "", "SAVED_COMPONENTS_KEY", "Ljava/lang/String;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: y4.b$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C18161b(i owner, Function0<Unit> onAttach) {
        Intrinsics.j(owner, "owner");
        Intrinsics.j(onAttach, "onAttach");
        this.owner = owner;
        this.onAttach = onAttach;
        this.lock = new c();
        this.keyToProviders = new LinkedHashMap();
        this.isAllowingSavingState = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C18161b c18161b, InterfaceC6030s interfaceC6030s, AbstractC6023l.a event) {
        Intrinsics.j(interfaceC6030s, "<unused var>");
        Intrinsics.j(event, "event");
        if (event == AbstractC6023l.a.ON_START) {
            c18161b.isAllowingSavingState = true;
        } else if (event == AbstractC6023l.a.ON_STOP) {
            c18161b.isAllowingSavingState = false;
        }
    }

    public final Bundle c(String key) {
        Intrinsics.j(key, "key");
        if (!this.isRestored) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = this.restoredState;
        if (bundle == null) {
            return null;
        }
        Bundle bundleA = C18017c.a(bundle);
        Bundle bundleC = C18017c.b(bundleA, key) ? C18017c.c(bundleA, key) : null;
        j.e(j.a(bundle), key);
        if (C18017c.f(C18017c.a(bundle))) {
            this.restoredState = null;
        }
        return bundleC;
    }

    public final f.b d(String key) {
        f.b bVar;
        Intrinsics.j(key, "key");
        synchronized (this.lock) {
            Iterator it = this.keyToProviders.entrySet().iterator();
            do {
                bVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                f.b bVar2 = (f.b) entry.getValue();
                if (Intrinsics.e(str, key)) {
                    bVar = bVar2;
                }
            } while (bVar == null);
        }
        return bVar;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsAllowingSavingState() {
        return this.isAllowingSavingState;
    }

    public final void f() {
        if (this.owner.getLifecycle().getState() != AbstractC6023l.b.f55276b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.attached) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.onAttach.invoke();
        this.owner.getLifecycle().a(new InterfaceC6027p() { // from class: y4.a
            @Override // androidx.view.InterfaceC6027p
            public final void onStateChanged(InterfaceC6030s interfaceC6030s, AbstractC6023l.a aVar) {
                C18161b.g(this.f170183a, interfaceC6030s, aVar);
            }
        });
        this.attached = true;
    }

    public final void h(Bundle savedState) {
        if (!this.attached) {
            f();
        }
        if (this.owner.getLifecycle().getState().b(AbstractC6023l.b.f55278d)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + this.owner.getLifecycle().getState()).toString());
        }
        if (this.isRestored) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleC = null;
        if (savedState != null) {
            Bundle bundleA = C18017c.a(savedState);
            if (C18017c.b(bundleA, "androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                bundleC = C18017c.c(bundleA, "androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
        }
        this.restoredState = bundleC;
        this.isRestored = true;
    }

    public final void i(Bundle outBundle) {
        Pair[] pairArr;
        Intrinsics.j(outBundle, "outBundle");
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
        Bundle bundleB = C14835c.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleA = j.a(bundleB);
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            j.b(bundleA, bundle);
        }
        synchronized (this.lock) {
            try {
                for (Map.Entry entry2 : this.keyToProviders.entrySet()) {
                    j.c(bundleA, (String) entry2.getKey(), ((f.b) entry2.getValue()).saveState());
                }
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (C18017c.f(C18017c.a(bundleB))) {
            return;
        }
        j.c(j.a(outBundle), "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleB);
    }

    public final void j(String key, f.b provider) {
        Intrinsics.j(key, "key");
        Intrinsics.j(provider, "provider");
        synchronized (this.lock) {
            if (this.keyToProviders.containsKey(key)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            this.keyToProviders.put(key, provider);
            Unit unit = Unit.f142422a;
        }
    }

    public final void k(String key) {
        Intrinsics.j(key, "key");
        synchronized (this.lock) {
        }
    }
}
