package M7;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"LM7/a;", "", "", "LM7/b;", "suppliers", "<init>", "(Ljava/util/List;)V", "", "", "LM7/g;", "a", "()Ljava/util/Map;", "Ljava/util/List;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<b> suppliers;

    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends b> suppliers) {
        Intrinsics.j(suppliers, "suppliers");
        this.suppliers = suppliers;
    }

    public final Map<String, EnrichmentAttribute> a() {
        TreeMap treeMap = new TreeMap();
        Iterator<b> it = this.suppliers.iterator();
        while (it.hasNext()) {
            for (EnrichmentAttribute enrichmentAttribute : it.next().a()) {
                if (treeMap.containsKey(enrichmentAttribute.getKey())) {
                    z8.f.a("dtxEnrichment", "attribute aggregation: overriding existing attribute " + treeMap.get(enrichmentAttribute.getKey()) + " with " + enrichmentAttribute);
                }
                treeMap.put(enrichmentAttribute.getKey(), enrichmentAttribute);
            }
        }
        return treeMap;
    }
}
