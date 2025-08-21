package com.meijer.mobile.receipt.service.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import j$.time.Year;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/receipt/service/api/models/CustomerSavingsRequest;", "", "", "year", "<init>", "(I)V", "copy", "(I)Lcom/meijer/mobile/receipt/service/api/models/CustomerSavingsRequest;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CustomerSavingsRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int year;

    public CustomerSavingsRequest() {
        this(0, 1, null);
    }

    public final CustomerSavingsRequest copy(@g(name = "year") int year) {
        return new CustomerSavingsRequest(year);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CustomerSavingsRequest) && this.year == ((CustomerSavingsRequest) other).year;
    }

    public int hashCode() {
        return Integer.hashCode(this.year);
    }

    public String toString() {
        return "CustomerSavingsRequest(year=" + this.year + ')';
    }

    public CustomerSavingsRequest(@g(name = "year") int i10) {
        this.year = i10;
    }

    /* renamed from: a, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    public /* synthetic */ CustomerSavingsRequest(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Year.now().getValue() : i10);
    }
}
