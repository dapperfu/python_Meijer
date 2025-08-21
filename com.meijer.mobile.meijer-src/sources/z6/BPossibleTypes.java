package z6;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lz6/i;", "Lz6/j;", "", "", "possibleTypes", "<init>", "(Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: z6.i, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class BPossibleTypes extends j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<String> possibleTypes;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BPossibleTypes) && Intrinsics.e(this.possibleTypes, ((BPossibleTypes) other).possibleTypes);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BPossibleTypes(Set<String> possibleTypes) {
        super(null);
        Intrinsics.j(possibleTypes, "possibleTypes");
        this.possibleTypes = possibleTypes;
    }

    public final Set<String> a() {
        return this.possibleTypes;
    }

    public int hashCode() {
        return this.possibleTypes.hashCode();
    }

    public String toString() {
        return "BPossibleTypes(possibleTypes=" + this.possibleTypes + ')';
    }
}
