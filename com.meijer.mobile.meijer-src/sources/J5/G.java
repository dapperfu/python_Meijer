package J5;

import com.adobe.marketing.mobile.I;
import com.google.android.gms.common.api.a;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\r¢\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001d¨\u0006\u001f"}, d2 = {"LJ5/G;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "", "version", "LJ5/F;", "state", "", "d", "(ILJ5/F;)Z", "", "data", "f", "(ILjava/util/Map;)Z", "e", "(I)Z", "g", "Lcom/adobe/marketing/mobile/H;", "b", "(I)Lcom/adobe/marketing/mobile/H;", "c", "a", "()Z", "Ljava/lang/String;", "LOG_TAG", "Ljava/util/TreeMap;", "Ljava/util/TreeMap;", "states", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String LOG_TAG;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final TreeMap<Integer, SharedState> states;

    public final synchronized boolean a() {
        return this.states.size() == 0;
    }

    public final synchronized com.adobe.marketing.mobile.H b(int version) {
        com.adobe.marketing.mobile.H h10;
        SharedState value;
        try {
            Map.Entry<Integer, SharedState> entryFloorEntry = this.states.floorEntry(Integer.valueOf(version));
            SharedState value2 = entryFloorEntry != null ? entryFloorEntry.getValue() : null;
            if (value2 != null) {
                return value2.a();
            }
            Map.Entry<Integer, SharedState> entryFirstEntry = this.states.firstEntry();
            if (entryFirstEntry == null || (value = entryFirstEntry.getValue()) == null || (h10 = value.a()) == null) {
                h10 = new com.adobe.marketing.mobile.H(I.NONE, null);
            }
            return h10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized com.adobe.marketing.mobile.H c(int version) {
        SortedMap<Integer, SharedState> sortedMapTailMap = this.states.descendingMap().tailMap(Integer.valueOf(version));
        Intrinsics.i(sortedMapTailMap, "states.descendingMap().tailMap(version)");
        Iterator<Map.Entry<Integer, SharedState>> it = sortedMapTailMap.entrySet().iterator();
        while (it.hasNext()) {
            SharedState value = it.next().getValue();
            if (value.getStatus() != I.PENDING) {
                return value.a();
            }
        }
        Map.Entry<Integer, SharedState> entryFirstEntry = this.states.firstEntry();
        SharedState value2 = entryFirstEntry != null ? entryFirstEntry.getValue() : null;
        return (value2 != null ? value2.getStatus() : null) == I.SET ? value2.a() : new com.adobe.marketing.mobile.H(I.NONE, null);
    }

    public final synchronized boolean e(int version) {
        return d(version, new SharedState(version, I.PENDING, b(a.e.API_PRIORITY_OTHER).b()));
    }

    public final synchronized boolean f(int version, Map<String, ? extends Object> data) {
        return d(version, new SharedState(version, I.SET, data));
    }

    public final synchronized boolean g(int version, Map<String, ? extends Object> data) {
        SharedState sharedState = this.states.get(Integer.valueOf(version));
        if (sharedState == null) {
            return false;
        }
        if (sharedState.getStatus() != I.PENDING) {
            return false;
        }
        this.states.put(Integer.valueOf(version), new SharedState(version, I.SET, data));
        return true;
    }

    public G(String name) {
        Intrinsics.j(name, "name");
        this.name = name;
        this.LOG_TAG = "SharedStateManager(" + name + ')';
        this.states = new TreeMap<>();
    }

    private final boolean d(int version, SharedState state) {
        if (this.states.ceilingEntry(Integer.valueOf(version)) == null) {
            this.states.put(Integer.valueOf(version), state);
            return true;
        }
        R5.t.e("MobileCore", this.LOG_TAG, "Cannot create " + this.name + " shared state at version " + version + ". More recent state exists.", new Object[0]);
        return false;
    }
}
