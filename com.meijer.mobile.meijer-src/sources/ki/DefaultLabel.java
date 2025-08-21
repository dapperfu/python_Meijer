package ki;

import ki.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00010\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lki/k0;", "", "Lki/q1$j;", "message", "<init>", "(Lki/q1$j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lki/q1$j;", "()Lki/q1$j;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ki.k0, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class DefaultLabel {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.Label message;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DefaultLabel) && Intrinsics.e(this.message, ((DefaultLabel) other).message);
    }

    public DefaultLabel(q1.Label message) {
        Intrinsics.j(message, "message");
        this.message = message;
    }

    /* renamed from: a, reason: from getter */
    public final q1.Label getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    public String toString() {
        return "DefaultLabel(message=" + this.message + ')';
    }
}
