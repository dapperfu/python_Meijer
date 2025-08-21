package T2;

import android.os.Bundle;
import j2.C14923c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pv.InterfaceC16549B;
import x4.C18086f;
import x4.C18090j;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\t\u0010\nJ(\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\nR%\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R(\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00180\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012R+\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00180\u00108\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\u001f\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006 "}, d2 = {"LT2/b;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", "T", "key", "b", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "", "h", "(Ljava/lang/String;Ljava/lang/Object;)V", "f", "", "a", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "regular", "Lx4/f$b;", "providers", "Lpv/B;", "c", "flows", "mutableFlows", "e", "Lx4/f$b;", "()Lx4/f$b;", "savedStateProvider", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> regular;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, C18086f.b> providers;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, InterfaceC16549B<Object>> flows;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<String, InterfaceC16549B<Object>> mutableFlows;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C18086f.b savedStateProvider;

    public b(Map<String, ? extends Object> initialState) {
        Intrinsics.j(initialState, "initialState");
        this.regular = MapsKt.D(initialState);
        this.providers = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.mutableFlows = new LinkedHashMap();
        this.savedStateProvider = new C18086f.b() { // from class: T2.a
            @Override // x4.C18086f.b
            public final Bundle saveState() {
                return b.g(this.f35881a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle g(b bVar) {
        Pair[] pairArr;
        for (Map.Entry entry : MapsKt.A(bVar.mutableFlows).entrySet()) {
            bVar.h((String) entry.getKey(), ((InterfaceC16549B) entry.getValue()).getValue());
        }
        for (Map.Entry entry2 : MapsKt.A(bVar.providers).entrySet()) {
            bVar.h((String) entry2.getKey(), ((C18086f.b) entry2.getValue()).saveState());
        }
        Map<String, Object> map = bVar.regular;
        if (map.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, Object> entry3 : map.entrySet()) {
                arrayList.add(TuplesKt.a(entry3.getKey(), entry3.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleB = C14923c.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        C18090j.a(bundleB);
        return bundleB;
    }

    public final <T> T b(String key) {
        T t10;
        Intrinsics.j(key, "key");
        try {
            InterfaceC16549B<Object> interfaceC16549B = this.mutableFlows.get(key);
            if (interfaceC16549B != null && (t10 = (T) interfaceC16549B.getValue()) != null) {
                return t10;
            }
            return (T) this.regular.get(key);
        } catch (ClassCastException unused) {
            f(key);
            return null;
        }
    }

    public final Map<String, InterfaceC16549B<Object>> c() {
        return this.mutableFlows;
    }

    public final Map<String, Object> d() {
        return this.regular;
    }

    /* renamed from: e, reason: from getter */
    public final C18086f.b getSavedStateProvider() {
        return this.savedStateProvider;
    }

    public final <T> T f(String key) {
        Intrinsics.j(key, "key");
        T t10 = (T) this.regular.remove(key);
        this.flows.remove(key);
        this.mutableFlows.remove(key);
        return t10;
    }

    public final <T> void h(String key, T value) {
        Intrinsics.j(key, "key");
        this.regular.put(key, value);
        InterfaceC16549B<Object> interfaceC16549B = this.flows.get(key);
        if (interfaceC16549B != null) {
            interfaceC16549B.setValue(value);
        }
        InterfaceC16549B<Object> interfaceC16549B2 = this.mutableFlows.get(key);
        if (interfaceC16549B2 != null) {
            interfaceC16549B2.setValue(value);
        }
    }

    public /* synthetic */ b(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? MapsKt.k() : map);
    }
}
