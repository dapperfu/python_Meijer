package K7;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LK7/f;", "", "Lorg/json/JSONObject;", "enrichedJson", "", "LK7/g;", "overriddenAttributes", "<init>", "(Lorg/json/JSONObject;Ljava/util/List;)V", "a", "(Lorg/json/JSONObject;Ljava/util/List;)LK7/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lorg/json/JSONObject;", "c", "()Lorg/json/JSONObject;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: K7.f, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class EnrichedJsonContainer {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final JSONObject enrichedJson;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<EnrichmentAttribute> overriddenAttributes;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnrichedJsonContainer)) {
            return false;
        }
        EnrichedJsonContainer enrichedJsonContainer = (EnrichedJsonContainer) other;
        return Intrinsics.e(this.enrichedJson, enrichedJsonContainer.enrichedJson) && Intrinsics.e(this.overriddenAttributes, enrichedJsonContainer.overriddenAttributes);
    }

    public EnrichedJsonContainer(JSONObject enrichedJson, List<EnrichmentAttribute> overriddenAttributes) {
        Intrinsics.j(enrichedJson, "enrichedJson");
        Intrinsics.j(overriddenAttributes, "overriddenAttributes");
        this.enrichedJson = enrichedJson;
        this.overriddenAttributes = overriddenAttributes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EnrichedJsonContainer b(EnrichedJsonContainer enrichedJsonContainer, JSONObject jSONObject, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jSONObject = enrichedJsonContainer.enrichedJson;
        }
        if ((i10 & 2) != 0) {
            list = enrichedJsonContainer.overriddenAttributes;
        }
        return enrichedJsonContainer.a(jSONObject, list);
    }

    public final EnrichedJsonContainer a(JSONObject enrichedJson, List<EnrichmentAttribute> overriddenAttributes) {
        Intrinsics.j(enrichedJson, "enrichedJson");
        Intrinsics.j(overriddenAttributes, "overriddenAttributes");
        return new EnrichedJsonContainer(enrichedJson, overriddenAttributes);
    }

    /* renamed from: c, reason: from getter */
    public final JSONObject getEnrichedJson() {
        return this.enrichedJson;
    }

    public final List<EnrichmentAttribute> d() {
        return this.overriddenAttributes;
    }

    public int hashCode() {
        return (this.enrichedJson.hashCode() * 31) + this.overriddenAttributes.hashCode();
    }

    public String toString() {
        return "EnrichedJsonContainer(enrichedJson=" + this.enrichedJson + ", overriddenAttributes=" + this.overriddenAttributes + ')';
    }
}
