package com.meijer.mobile.cart.model.hybris;

import com.meijer.mobile.address.model.hybris.HybrisCustomerAddress;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0012\b\u0003\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\b\u0003\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR!\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/MultiTenderPaymentInfoResponse;", "", "", "accountHolderName", "Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;", "billingAddress", "", "Lcom/meijer/mobile/cart/model/hybris/TendersItemResponse;", "tenders", "<init>", "(Ljava/lang/String;Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;Ljava/util/List;)Lcom/meijer/mobile/cart/model/hybris/MultiTenderPaymentInfoResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;", "()Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;", "c", "Ljava/util/List;", "()Ljava/util/List;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class MultiTenderPaymentInfoResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String accountHolderName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisCustomerAddress billingAddress;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<TendersItemResponse> tenders;

    public MultiTenderPaymentInfoResponse() {
        this(null, null, null, 7, null);
    }

    public final MultiTenderPaymentInfoResponse copy(@g(name = "accountHolderName") String accountHolderName, @g(name = "billingAddress") HybrisCustomerAddress billingAddress, @g(name = "tenders") List<TendersItemResponse> tenders) {
        return new MultiTenderPaymentInfoResponse(accountHolderName, billingAddress, tenders);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiTenderPaymentInfoResponse)) {
            return false;
        }
        MultiTenderPaymentInfoResponse multiTenderPaymentInfoResponse = (MultiTenderPaymentInfoResponse) other;
        return Intrinsics.e(this.accountHolderName, multiTenderPaymentInfoResponse.accountHolderName) && Intrinsics.e(this.billingAddress, multiTenderPaymentInfoResponse.billingAddress) && Intrinsics.e(this.tenders, multiTenderPaymentInfoResponse.tenders);
    }

    public int hashCode() {
        String str = this.accountHolderName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        HybrisCustomerAddress hybrisCustomerAddress = this.billingAddress;
        int iHashCode2 = (iHashCode + (hybrisCustomerAddress == null ? 0 : hybrisCustomerAddress.hashCode())) * 31;
        List<TendersItemResponse> list = this.tenders;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "MultiTenderPaymentInfoResponse(accountHolderName=" + this.accountHolderName + ", billingAddress=" + this.billingAddress + ", tenders=" + this.tenders + ')';
    }

    public MultiTenderPaymentInfoResponse(@g(name = "accountHolderName") String str, @g(name = "billingAddress") HybrisCustomerAddress hybrisCustomerAddress, @g(name = "tenders") List<TendersItemResponse> list) {
        this.accountHolderName = str;
        this.billingAddress = hybrisCustomerAddress;
        this.tenders = list;
    }

    /* renamed from: a, reason: from getter */
    public final String getAccountHolderName() {
        return this.accountHolderName;
    }

    /* renamed from: b, reason: from getter */
    public final HybrisCustomerAddress getBillingAddress() {
        return this.billingAddress;
    }

    public final List<TendersItemResponse> c() {
        return this.tenders;
    }

    public /* synthetic */ MultiTenderPaymentInfoResponse(String str, HybrisCustomerAddress hybrisCustomerAddress, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : hybrisCustomerAddress, (i10 & 4) != 0 ? null : list);
    }
}
