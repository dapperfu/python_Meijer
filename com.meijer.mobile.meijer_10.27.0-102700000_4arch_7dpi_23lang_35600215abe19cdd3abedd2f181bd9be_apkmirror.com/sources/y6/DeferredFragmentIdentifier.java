package y6;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"Ly6/q;", "", "", "path", "", "label", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getPath", "()Ljava/util/List;", "b", "Ljava/lang/String;", "getLabel", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: y6.q, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class DeferredFragmentIdentifier {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Object> path;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String label;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeferredFragmentIdentifier)) {
            return false;
        }
        DeferredFragmentIdentifier deferredFragmentIdentifier = (DeferredFragmentIdentifier) other;
        return Intrinsics.e(this.path, deferredFragmentIdentifier.path) && Intrinsics.e(this.label, deferredFragmentIdentifier.label);
    }

    public DeferredFragmentIdentifier(List<? extends Object> path, String str) {
        Intrinsics.j(path, "path");
        this.path = path;
        this.label = str;
    }

    public int hashCode() {
        int iHashCode = this.path.hashCode() * 31;
        String str = this.label;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "DeferredFragmentIdentifier(path=" + this.path + ", label=" + this.label + ')';
    }
}
