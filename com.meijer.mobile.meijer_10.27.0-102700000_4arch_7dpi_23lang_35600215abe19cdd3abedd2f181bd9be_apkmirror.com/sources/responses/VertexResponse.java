package responses;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lresponses/VertexResponse;", "", "Lresponses/TaxAreaResponse;", "taxAreaResponse", "<init>", "(Lresponses/TaxAreaResponse;)V", "copy", "(Lresponses/TaxAreaResponse;)Lresponses/VertexResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lresponses/TaxAreaResponse;", "()Lresponses/TaxAreaResponse;", "validation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class VertexResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final TaxAreaResponse taxAreaResponse;

    public final VertexResponse copy(@g(name = "TaxAreaResponse") TaxAreaResponse taxAreaResponse) {
        Intrinsics.j(taxAreaResponse, "taxAreaResponse");
        return new VertexResponse(taxAreaResponse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VertexResponse) && Intrinsics.e(this.taxAreaResponse, ((VertexResponse) other).taxAreaResponse);
    }

    public int hashCode() {
        return this.taxAreaResponse.hashCode();
    }

    public String toString() {
        return "VertexResponse(taxAreaResponse=" + this.taxAreaResponse + ')';
    }

    public VertexResponse(@g(name = "TaxAreaResponse") TaxAreaResponse taxAreaResponse) {
        Intrinsics.j(taxAreaResponse, "taxAreaResponse");
        this.taxAreaResponse = taxAreaResponse;
    }

    /* renamed from: a, reason: from getter */
    public final TaxAreaResponse getTaxAreaResponse() {
        return this.taxAreaResponse;
    }
}
