package responses;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lresponses/TaxAreaResponse;", "", "Lresponses/TaxAreaResult;", "taxAreaResult", "<init>", "(Lresponses/TaxAreaResult;)V", "copy", "(Lresponses/TaxAreaResult;)Lresponses/TaxAreaResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lresponses/TaxAreaResult;", "()Lresponses/TaxAreaResult;", "validation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TaxAreaResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final TaxAreaResult taxAreaResult;

    public final TaxAreaResponse copy(@g(name = "TaxAreaResult") TaxAreaResult taxAreaResult) {
        Intrinsics.j(taxAreaResult, "taxAreaResult");
        return new TaxAreaResponse(taxAreaResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TaxAreaResponse) && Intrinsics.e(this.taxAreaResult, ((TaxAreaResponse) other).taxAreaResult);
    }

    public int hashCode() {
        return this.taxAreaResult.hashCode();
    }

    public String toString() {
        return "TaxAreaResponse(taxAreaResult=" + this.taxAreaResult + ')';
    }

    public TaxAreaResponse(@g(name = "TaxAreaResult") TaxAreaResult taxAreaResult) {
        Intrinsics.j(taxAreaResult, "taxAreaResult");
        this.taxAreaResult = taxAreaResult;
    }

    /* renamed from: a, reason: from getter */
    public final TaxAreaResult getTaxAreaResult() {
        return this.taxAreaResult;
    }
}
