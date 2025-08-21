package N5;

import Q5.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"LN5/b;", "LQ5/o;", "LQ5/e;", "condition", "", "LN5/m;", "consequenceList", "<init>", "(LQ5/e;Ljava/util/List;)V", "a", "()LQ5/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LQ5/e;", "getCondition", "b", "Ljava/util/List;", "()Ljava/util/List;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: N5.b, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class LaunchRule implements o {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Q5.e condition;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<RuleConsequence> consequenceList;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LaunchRule)) {
            return false;
        }
        LaunchRule launchRule = (LaunchRule) other;
        return Intrinsics.e(this.condition, launchRule.condition) && Intrinsics.e(this.consequenceList, launchRule.consequenceList);
    }

    public LaunchRule(Q5.e condition, List<RuleConsequence> consequenceList) {
        Intrinsics.j(condition, "condition");
        Intrinsics.j(consequenceList, "consequenceList");
        this.condition = condition;
        this.consequenceList = consequenceList;
    }

    @Override // Q5.o
    /* renamed from: a, reason: from getter */
    public Q5.e getCondition() {
        return this.condition;
    }

    public final List<RuleConsequence> b() {
        return this.consequenceList;
    }

    public int hashCode() {
        return (this.condition.hashCode() * 31) + this.consequenceList.hashCode();
    }

    public String toString() {
        return "LaunchRule(condition=" + this.condition + ", consequenceList=" + this.consequenceList + ')';
    }
}
