package requests;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lrequests/TaxAreaRequest;", "", "Lrequests/TaxAreaLookup;", "taxAreaLookup", "<init>", "(Lrequests/TaxAreaLookup;)V", "copy", "(Lrequests/TaxAreaLookup;)Lrequests/TaxAreaRequest;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrequests/TaxAreaLookup;", "()Lrequests/TaxAreaLookup;", "validation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TaxAreaRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final TaxAreaLookup taxAreaLookup;

    /* JADX WARN: Multi-variable type inference failed */
    public TaxAreaRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final TaxAreaRequest copy(@g(name = "TaxAreaLookup") TaxAreaLookup taxAreaLookup) {
        return new TaxAreaRequest(taxAreaLookup);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TaxAreaRequest) && Intrinsics.e(this.taxAreaLookup, ((TaxAreaRequest) other).taxAreaLookup);
    }

    public int hashCode() {
        TaxAreaLookup taxAreaLookup = this.taxAreaLookup;
        if (taxAreaLookup == null) {
            return 0;
        }
        return taxAreaLookup.hashCode();
    }

    public String toString() {
        return "TaxAreaRequest(taxAreaLookup=" + this.taxAreaLookup + ')';
    }

    public TaxAreaRequest(@g(name = "TaxAreaLookup") TaxAreaLookup taxAreaLookup) {
        this.taxAreaLookup = taxAreaLookup;
    }

    /* renamed from: a, reason: from getter */
    public final TaxAreaLookup getTaxAreaLookup() {
        return this.taxAreaLookup;
    }

    public /* synthetic */ TaxAreaRequest(TaxAreaLookup taxAreaLookup, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : taxAreaLookup);
    }
}
