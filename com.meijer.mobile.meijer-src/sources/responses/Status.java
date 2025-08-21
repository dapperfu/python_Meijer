package responses;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0013"}, d2 = {"Lresponses/Status;", "", "", "lookupResult", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lresponses/Status;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "validation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class Status {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lookupResult;

    /* JADX WARN: Multi-variable type inference failed */
    public Status() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Status copy(@g(name = "lookupResult") String lookupResult) {
        return new Status(lookupResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Status) && Intrinsics.e(this.lookupResult, ((Status) other).lookupResult);
    }

    public int hashCode() {
        String str = this.lookupResult;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "Status(lookupResult=" + this.lookupResult + ')';
    }

    public Status(@g(name = "lookupResult") String str) {
        this.lookupResult = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getLookupResult() {
        return this.lookupResult;
    }

    public /* synthetic */ Status(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}
