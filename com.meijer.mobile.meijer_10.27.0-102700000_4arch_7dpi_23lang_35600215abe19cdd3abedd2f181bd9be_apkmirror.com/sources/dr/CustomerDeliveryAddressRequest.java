package dr;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Ldr/b;", "", "", "addressLine1", "addressType", "city", "deliveryAddressId", "state", "zip", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "e", "f", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dr.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes11.dex */
public final /* data */ class CustomerDeliveryAddressRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressLine1;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String city;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryAddressId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String state;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zip;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerDeliveryAddressRequest)) {
            return false;
        }
        CustomerDeliveryAddressRequest customerDeliveryAddressRequest = (CustomerDeliveryAddressRequest) other;
        return Intrinsics.e(this.addressLine1, customerDeliveryAddressRequest.addressLine1) && Intrinsics.e(this.addressType, customerDeliveryAddressRequest.addressType) && Intrinsics.e(this.city, customerDeliveryAddressRequest.city) && Intrinsics.e(this.deliveryAddressId, customerDeliveryAddressRequest.deliveryAddressId) && Intrinsics.e(this.state, customerDeliveryAddressRequest.state) && Intrinsics.e(this.zip, customerDeliveryAddressRequest.zip);
    }

    public CustomerDeliveryAddressRequest(String str, String str2, String str3, String deliveryAddressId, String str4, String str5) {
        Intrinsics.j(deliveryAddressId, "deliveryAddressId");
        this.addressLine1 = str;
        this.addressType = str2;
        this.city = str3;
        this.deliveryAddressId = deliveryAddressId;
        this.state = str4;
        this.zip = str5;
    }

    /* renamed from: a, reason: from getter */
    public final String getAddressLine1() {
        return this.addressLine1;
    }

    /* renamed from: b, reason: from getter */
    public final String getAddressType() {
        return this.addressType;
    }

    /* renamed from: c, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: d, reason: from getter */
    public final String getDeliveryAddressId() {
        return this.deliveryAddressId;
    }

    /* renamed from: e, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: f, reason: from getter */
    public final String getZip() {
        return this.zip;
    }

    public int hashCode() {
        String str = this.addressLine1;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.addressType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.city;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.deliveryAddressId.hashCode()) * 31;
        String str4 = this.state;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.zip;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "CustomerDeliveryAddressRequest(addressLine1=" + this.addressLine1 + ", addressType=" + this.addressType + ", city=" + this.city + ", deliveryAddressId=" + this.deliveryAddressId + ", state=" + this.state + ", zip=" + this.zip + ')';
    }
}
