package requests;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import responses.PostalAddress;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lrequests/TaxAreaLookup;", "", "", "asOfDate", "lookupId", "Lresponses/PostalAddress;", "postalAddress", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lresponses/PostalAddress;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Lresponses/PostalAddress;)Lrequests/TaxAreaLookup;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lresponses/PostalAddress;", "()Lresponses/PostalAddress;", "validation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TaxAreaLookup {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String asOfDate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lookupId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final PostalAddress postalAddress;

    public TaxAreaLookup() {
        this(null, null, null, 7, null);
    }

    public final TaxAreaLookup copy(@g(name = "asOfDate") String asOfDate, @g(name = "lookupId") String lookupId, @g(name = "PostalAddress") PostalAddress postalAddress) {
        return new TaxAreaLookup(asOfDate, lookupId, postalAddress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxAreaLookup)) {
            return false;
        }
        TaxAreaLookup taxAreaLookup = (TaxAreaLookup) other;
        return Intrinsics.e(this.asOfDate, taxAreaLookup.asOfDate) && Intrinsics.e(this.lookupId, taxAreaLookup.lookupId) && Intrinsics.e(this.postalAddress, taxAreaLookup.postalAddress);
    }

    public int hashCode() {
        String str = this.asOfDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lookupId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        PostalAddress postalAddress = this.postalAddress;
        return iHashCode2 + (postalAddress != null ? postalAddress.hashCode() : 0);
    }

    public String toString() {
        return "TaxAreaLookup(asOfDate=" + this.asOfDate + ", lookupId=" + this.lookupId + ", postalAddress=" + this.postalAddress + ')';
    }

    public TaxAreaLookup(@g(name = "asOfDate") String str, @g(name = "lookupId") String str2, @g(name = "PostalAddress") PostalAddress postalAddress) {
        this.asOfDate = str;
        this.lookupId = str2;
        this.postalAddress = postalAddress;
    }

    /* renamed from: a, reason: from getter */
    public final String getAsOfDate() {
        return this.asOfDate;
    }

    /* renamed from: b, reason: from getter */
    public final String getLookupId() {
        return this.lookupId;
    }

    /* renamed from: c, reason: from getter */
    public final PostalAddress getPostalAddress() {
        return this.postalAddress;
    }

    public /* synthetic */ TaxAreaLookup(String str, String str2, PostalAddress postalAddress, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : postalAddress);
    }
}
