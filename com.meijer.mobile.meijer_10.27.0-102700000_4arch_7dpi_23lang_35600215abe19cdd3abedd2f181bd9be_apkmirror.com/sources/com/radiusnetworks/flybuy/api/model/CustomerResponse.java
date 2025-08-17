package com.radiusnetworks.flybuy.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/CustomerResponse;", "", "data", "Lcom/radiusnetworks/flybuy/api/model/Customer;", "(Lcom/radiusnetworks/flybuy/api/model/Customer;)V", "getData", "()Lcom/radiusnetworks/flybuy/api/model/Customer;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CustomerResponse {
    private final Customer data;

    /* JADX WARN: Multi-variable type inference failed */
    public CustomerResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CustomerResponse copy$default(CustomerResponse customerResponse, Customer customer, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            customer = customerResponse.data;
        }
        return customerResponse.copy(customer);
    }

    /* renamed from: component1, reason: from getter */
    public final Customer getData() {
        return this.data;
    }

    public final CustomerResponse copy(Customer data) {
        return new CustomerResponse(data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CustomerResponse) && Intrinsics.e(this.data, ((CustomerResponse) other).data);
    }

    public final Customer getData() {
        return this.data;
    }

    public int hashCode() {
        Customer customer = this.data;
        if (customer == null) {
            return 0;
        }
        return customer.hashCode();
    }

    public String toString() {
        return "CustomerResponse(data=" + this.data + ')';
    }

    public CustomerResponse(Customer customer) {
        this.data = customer;
    }

    public /* synthetic */ CustomerResponse(Customer customer, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : customer);
    }
}
