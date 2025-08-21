package N5;

import io.constructor.data.local.PreferencesHelper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"LN5/m;", "", "", PreferencesHelper.PREF_ID, "type", "", "detail", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: N5.m, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class RuleConsequence {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, Object> detail;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RuleConsequence)) {
            return false;
        }
        RuleConsequence ruleConsequence = (RuleConsequence) other;
        return Intrinsics.e(this.id, ruleConsequence.id) && Intrinsics.e(this.type, ruleConsequence.type) && Intrinsics.e(this.detail, ruleConsequence.detail);
    }

    public RuleConsequence(String id2, String type, Map<String, ? extends Object> detail) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(type, "type");
        Intrinsics.j(detail, "detail");
        this.id = id2;
        this.type = type;
        this.detail = detail;
    }

    public final Map<String, Object> a() {
        return this.detail;
    }

    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: c, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + this.detail.hashCode();
    }

    public String toString() {
        return "RuleConsequence(id=" + this.id + ", type=" + this.type + ", detail=" + this.detail + ')';
    }
}
