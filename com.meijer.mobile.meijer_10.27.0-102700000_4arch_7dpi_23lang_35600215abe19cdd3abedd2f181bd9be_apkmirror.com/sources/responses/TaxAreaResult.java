package responses;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ^\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001d\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001e\u0010\u0012R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b\u001a\u0010&¨\u0006'"}, d2 = {"Lresponses/TaxAreaResult;", "", "", "taxAreaId", "asOfDate", "confidenceIndicator", "", "Lresponses/Jurisdiction;", "jurisdiction", "Lresponses/PostalAddress;", "postalAddress", "Lresponses/AddressCleansingResultMessage;", "addressCleansingResultMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lresponses/PostalAddress;Lresponses/AddressCleansingResultMessage;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lresponses/PostalAddress;Lresponses/AddressCleansingResultMessage;)Lresponses/TaxAreaResult;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "e", "Lresponses/PostalAddress;", "()Lresponses/PostalAddress;", "Lresponses/AddressCleansingResultMessage;", "()Lresponses/AddressCleansingResultMessage;", "validation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TaxAreaResult {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String taxAreaId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String asOfDate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String confidenceIndicator;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Jurisdiction> jurisdiction;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final PostalAddress postalAddress;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressCleansingResultMessage addressCleansingResultMessage;

    public TaxAreaResult(@g(name = "taxAreaId") String str, @g(name = "asOfDate") String str2, @g(name = "confidenceIndicator") String str3, @g(name = "Jurisdiction") List<Jurisdiction> list, @g(name = "PostalAddress") PostalAddress postalAddress, @g(name = "AddressCleansingResultMessage") AddressCleansingResultMessage addressCleansingResultMessage) {
        this.taxAreaId = str;
        this.asOfDate = str2;
        this.confidenceIndicator = str3;
        this.jurisdiction = list;
        this.postalAddress = postalAddress;
        this.addressCleansingResultMessage = addressCleansingResultMessage;
    }

    public final TaxAreaResult copy(@g(name = "taxAreaId") String taxAreaId, @g(name = "asOfDate") String asOfDate, @g(name = "confidenceIndicator") String confidenceIndicator, @g(name = "Jurisdiction") List<Jurisdiction> jurisdiction, @g(name = "PostalAddress") PostalAddress postalAddress, @g(name = "AddressCleansingResultMessage") AddressCleansingResultMessage addressCleansingResultMessage) {
        return new TaxAreaResult(taxAreaId, asOfDate, confidenceIndicator, jurisdiction, postalAddress, addressCleansingResultMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxAreaResult)) {
            return false;
        }
        TaxAreaResult taxAreaResult = (TaxAreaResult) other;
        return Intrinsics.e(this.taxAreaId, taxAreaResult.taxAreaId) && Intrinsics.e(this.asOfDate, taxAreaResult.asOfDate) && Intrinsics.e(this.confidenceIndicator, taxAreaResult.confidenceIndicator) && Intrinsics.e(this.jurisdiction, taxAreaResult.jurisdiction) && Intrinsics.e(this.postalAddress, taxAreaResult.postalAddress) && Intrinsics.e(this.addressCleansingResultMessage, taxAreaResult.addressCleansingResultMessage);
    }

    public int hashCode() {
        String str = this.taxAreaId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.asOfDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.confidenceIndicator;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Jurisdiction> list = this.jurisdiction;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        PostalAddress postalAddress = this.postalAddress;
        int iHashCode5 = (iHashCode4 + (postalAddress == null ? 0 : postalAddress.hashCode())) * 31;
        AddressCleansingResultMessage addressCleansingResultMessage = this.addressCleansingResultMessage;
        return iHashCode5 + (addressCleansingResultMessage != null ? addressCleansingResultMessage.hashCode() : 0);
    }

    public String toString() {
        return "TaxAreaResult(taxAreaId=" + this.taxAreaId + ", asOfDate=" + this.asOfDate + ", confidenceIndicator=" + this.confidenceIndicator + ", jurisdiction=" + this.jurisdiction + ", postalAddress=" + this.postalAddress + ", addressCleansingResultMessage=" + this.addressCleansingResultMessage + ')';
    }

    /* renamed from: a, reason: from getter */
    public final AddressCleansingResultMessage getAddressCleansingResultMessage() {
        return this.addressCleansingResultMessage;
    }

    /* renamed from: b, reason: from getter */
    public final String getAsOfDate() {
        return this.asOfDate;
    }

    /* renamed from: c, reason: from getter */
    public final String getConfidenceIndicator() {
        return this.confidenceIndicator;
    }

    public final List<Jurisdiction> d() {
        return this.jurisdiction;
    }

    /* renamed from: e, reason: from getter */
    public final PostalAddress getPostalAddress() {
        return this.postalAddress;
    }

    /* renamed from: f, reason: from getter */
    public final String getTaxAreaId() {
        return this.taxAreaId;
    }

    public /* synthetic */ TaxAreaResult(String str, String str2, String str3, List list, PostalAddress postalAddress, AddressCleansingResultMessage addressCleansingResultMessage, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : list, postalAddress, (i10 & 32) != 0 ? null : addressCleansingResultMessage);
    }
}
