package com.meijer.mobile.digitalshopping.api.orders.model.orderdetails;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/model/orderdetails/UpdatePhoneNumberRequest;", "", "", "Lcom/meijer/mobile/core/model/common/PhoneNumber;", "phoneNumber", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lcom/meijer/mobile/digitalshopping/api/orders/model/orderdetails/UpdatePhoneNumberRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class UpdatePhoneNumberRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phoneNumber;

    public final UpdatePhoneNumberRequest copy(@g(name = "phone") String phoneNumber) {
        Intrinsics.j(phoneNumber, "phoneNumber");
        return new UpdatePhoneNumberRequest(phoneNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UpdatePhoneNumberRequest) && Intrinsics.e(this.phoneNumber, ((UpdatePhoneNumberRequest) other).phoneNumber);
    }

    public int hashCode() {
        return this.phoneNumber.hashCode();
    }

    public String toString() {
        return "UpdatePhoneNumberRequest(phoneNumber=" + this.phoneNumber + ')';
    }

    public UpdatePhoneNumberRequest(@g(name = "phone") String phoneNumber) {
        Intrinsics.j(phoneNumber, "phoneNumber");
        this.phoneNumber = phoneNumber;
    }

    /* renamed from: a, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }
}
