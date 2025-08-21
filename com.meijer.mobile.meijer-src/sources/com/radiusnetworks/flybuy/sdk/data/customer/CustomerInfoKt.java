package com.radiusnetworks.flybuy.sdk.data.customer;

import com.radiusnetworks.flybuy.api.FlyBuyApi;
import com.radiusnetworks.flybuy.api.model.ClaimOrderRequestData;
import com.radiusnetworks.flybuy.api.model.CustomerData;
import com.radiusnetworks.flybuy.api.model.UpdateCustomerRequestData;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Customer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a*\u0010\u0003\u001a\u00020\u0004*\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0000\u001a\u0014\u0010\t\u001a\u00020\n*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\f\u0010\r\u001a\u00020\u000e*\u00020\u0001H\u0000¨\u0006\u000f"}, d2 = {"fromCustomer", "Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Customer;", "toApiClaimOrder", "Lcom/radiusnetworks/flybuy/api/model/ClaimOrderRequestData;", "pickupType", "", "spotIdentifier", "handoffVehicleLocation", "toApiCreateCustomer", "Lcom/radiusnetworks/flybuy/api/model/CustomerData;", "consent", "Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerConsent;", "toApiUpdateCustomer", "Lcom/radiusnetworks/flybuy/api/model/UpdateCustomerRequestData;", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CustomerInfoKt {
    public static final CustomerInfo fromCustomer(Customer customer) {
        Intrinsics.j(customer, "<this>");
        String name = customer.getName();
        String phone = customer.getPhone();
        String carType = customer.getCarType();
        if (carType == null) {
            carType = "";
        }
        String carColor = customer.getCarColor();
        if (carColor == null) {
            carColor = "";
        }
        String licensePlate = customer.getLicensePlate();
        return new CustomerInfo(name, phone, carType, carColor, licensePlate == null ? "" : licensePlate);
    }

    public static final ClaimOrderRequestData toApiClaimOrder(CustomerInfo customerInfo, String str, String str2, String str3) {
        Intrinsics.j(customerInfo, "<this>");
        return new ClaimOrderRequestData(customerInfo.getName(), customerInfo.getCarType(), customerInfo.getCarColor(), customerInfo.getLicensePlate(), customerInfo.getPhone(), FlyBuyApi.INSTANCE.getPushToken(), str, Boolean.valueOf(FlyBuyCore.getConfigOptions().getDeferredLocationTrackingEnabled()), str2, str3);
    }

    public static final CustomerData toApiCreateCustomer(CustomerInfo customerInfo, CustomerConsent consent) {
        Intrinsics.j(customerInfo, "<this>");
        Intrinsics.j(consent, "consent");
        return new CustomerData(customerInfo.getName(), customerInfo.getPhone(), customerInfo.getCarType(), customerInfo.getCarColor(), customerInfo.getLicensePlate(), consent.getTermsOfService(), consent.getAgeVerification());
    }

    public static final UpdateCustomerRequestData toApiUpdateCustomer(CustomerInfo customerInfo) {
        Intrinsics.j(customerInfo, "<this>");
        return new UpdateCustomerRequestData(customerInfo.getName(), customerInfo.getPhone(), customerInfo.getCarType(), customerInfo.getCarColor(), customerInfo.getLicensePlate());
    }
}
