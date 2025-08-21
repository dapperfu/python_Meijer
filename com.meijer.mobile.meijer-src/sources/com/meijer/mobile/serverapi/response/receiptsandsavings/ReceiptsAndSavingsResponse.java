package com.meijer.mobile.serverapi.response.receiptsandsavings;

import Eh.CustomerPropertiesResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import zp.CustomerSavings;
import zp.DigitalReceipt;
import zp.MonthSavingsSummary;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JH\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010#R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010'R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010$\u001a\u0004\b(\u0010\u0010\"\u0004\b)\u0010'R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/meijer/mobile/serverapi/response/receiptsandsavings/ReceiptsAndSavingsResponse;", "", "LEh/l;", "customerPropertiesResponse", "", "Lzp/e;", "savingsByMonth", "Lzp/b;", "receiptsList", "Lzp/a;", "savingsDetails", "<init>", "(LEh/l;Ljava/util/List;Ljava/util/List;Lzp/a;)V", "component1", "()LEh/l;", "component2", "()Ljava/util/List;", "component3", "component4", "()Lzp/a;", "copy", "(LEh/l;Ljava/util/List;Ljava/util/List;Lzp/a;)Lcom/meijer/mobile/serverapi/response/receiptsandsavings/ReceiptsAndSavingsResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LEh/l;", "getCustomerPropertiesResponse", "setCustomerPropertiesResponse", "(LEh/l;)V", "Ljava/util/List;", "getSavingsByMonth", "setSavingsByMonth", "(Ljava/util/List;)V", "getReceiptsList", "setReceiptsList", "Lzp/a;", "getSavingsDetails", "setSavingsDetails", "(Lzp/a;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ReceiptsAndSavingsResponse {
    public static final int $stable = 8;
    private CustomerPropertiesResponse customerPropertiesResponse;
    private List<DigitalReceipt> receiptsList;
    private List<MonthSavingsSummary> savingsByMonth;
    private CustomerSavings savingsDetails;

    public ReceiptsAndSavingsResponse() {
        this(null, null, null, null, 15, null);
    }

    public final List<MonthSavingsSummary> component2() {
        return this.savingsByMonth;
    }

    public final List<DigitalReceipt> component3() {
        return this.receiptsList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReceiptsAndSavingsResponse)) {
            return false;
        }
        ReceiptsAndSavingsResponse receiptsAndSavingsResponse = (ReceiptsAndSavingsResponse) other;
        return Intrinsics.e(this.customerPropertiesResponse, receiptsAndSavingsResponse.customerPropertiesResponse) && Intrinsics.e(this.savingsByMonth, receiptsAndSavingsResponse.savingsByMonth) && Intrinsics.e(this.receiptsList, receiptsAndSavingsResponse.receiptsList) && Intrinsics.e(this.savingsDetails, receiptsAndSavingsResponse.savingsDetails);
    }

    public int hashCode() {
        CustomerPropertiesResponse customerPropertiesResponse = this.customerPropertiesResponse;
        int iHashCode = (((((customerPropertiesResponse == null ? 0 : customerPropertiesResponse.hashCode()) * 31) + this.savingsByMonth.hashCode()) * 31) + this.receiptsList.hashCode()) * 31;
        CustomerSavings customerSavings = this.savingsDetails;
        return iHashCode + (customerSavings != null ? customerSavings.hashCode() : 0);
    }

    public String toString() {
        return "ReceiptsAndSavingsResponse(customerPropertiesResponse=" + this.customerPropertiesResponse + ", savingsByMonth=" + this.savingsByMonth + ", receiptsList=" + this.receiptsList + ", savingsDetails=" + this.savingsDetails + ')';
    }

    public ReceiptsAndSavingsResponse(CustomerPropertiesResponse customerPropertiesResponse, List<MonthSavingsSummary> savingsByMonth, List<DigitalReceipt> receiptsList, CustomerSavings customerSavings) {
        Intrinsics.j(savingsByMonth, "savingsByMonth");
        Intrinsics.j(receiptsList, "receiptsList");
        this.customerPropertiesResponse = customerPropertiesResponse;
        this.savingsByMonth = savingsByMonth;
        this.receiptsList = receiptsList;
        this.savingsDetails = customerSavings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReceiptsAndSavingsResponse copy$default(ReceiptsAndSavingsResponse receiptsAndSavingsResponse, CustomerPropertiesResponse customerPropertiesResponse, List list, List list2, CustomerSavings customerSavings, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            customerPropertiesResponse = receiptsAndSavingsResponse.customerPropertiesResponse;
        }
        if ((i10 & 2) != 0) {
            list = receiptsAndSavingsResponse.savingsByMonth;
        }
        if ((i10 & 4) != 0) {
            list2 = receiptsAndSavingsResponse.receiptsList;
        }
        if ((i10 & 8) != 0) {
            customerSavings = receiptsAndSavingsResponse.savingsDetails;
        }
        return receiptsAndSavingsResponse.copy(customerPropertiesResponse, list, list2, customerSavings);
    }

    /* renamed from: component1, reason: from getter */
    public final CustomerPropertiesResponse getCustomerPropertiesResponse() {
        return this.customerPropertiesResponse;
    }

    /* renamed from: component4, reason: from getter */
    public final CustomerSavings getSavingsDetails() {
        return this.savingsDetails;
    }

    public final ReceiptsAndSavingsResponse copy(CustomerPropertiesResponse customerPropertiesResponse, List<MonthSavingsSummary> savingsByMonth, List<DigitalReceipt> receiptsList, CustomerSavings savingsDetails) {
        Intrinsics.j(savingsByMonth, "savingsByMonth");
        Intrinsics.j(receiptsList, "receiptsList");
        return new ReceiptsAndSavingsResponse(customerPropertiesResponse, savingsByMonth, receiptsList, savingsDetails);
    }

    public final CustomerPropertiesResponse getCustomerPropertiesResponse() {
        return this.customerPropertiesResponse;
    }

    public final List<DigitalReceipt> getReceiptsList() {
        return this.receiptsList;
    }

    public final List<MonthSavingsSummary> getSavingsByMonth() {
        return this.savingsByMonth;
    }

    public final CustomerSavings getSavingsDetails() {
        return this.savingsDetails;
    }

    public final void setCustomerPropertiesResponse(CustomerPropertiesResponse customerPropertiesResponse) {
        this.customerPropertiesResponse = customerPropertiesResponse;
    }

    public final void setReceiptsList(List<DigitalReceipt> list) {
        Intrinsics.j(list, "<set-?>");
        this.receiptsList = list;
    }

    public final void setSavingsByMonth(List<MonthSavingsSummary> list) {
        Intrinsics.j(list, "<set-?>");
        this.savingsByMonth = list;
    }

    public final void setSavingsDetails(CustomerSavings customerSavings) {
        this.savingsDetails = customerSavings;
    }

    public /* synthetic */ ReceiptsAndSavingsResponse(CustomerPropertiesResponse customerPropertiesResponse, List list, List list2, CustomerSavings customerSavings, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : customerPropertiesResponse, (i10 & 2) != 0 ? CollectionsKt.m() : list, (i10 & 4) != 0 ? CollectionsKt.m() : list2, (i10 & 8) != 0 ? null : customerSavings);
    }
}
