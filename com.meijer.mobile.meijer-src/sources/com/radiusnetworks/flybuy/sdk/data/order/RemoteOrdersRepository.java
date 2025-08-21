package com.radiusnetworks.flybuy.sdk.data.order;

import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.customer.CustomerInfo;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Order;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JX\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fH&J2\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fH&J2\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fH&J2\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fH&J0\u0010\u0016\u001a\u00020\u00032&\b\u0002\u0010\u000b\u001a \u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fH&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0005H&¨\u0006\u001a"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/order/RemoteOrdersRepository;", "", "claimOrder", "", "code", "", "customerInfo", "Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;", "pickupType", "spotIdentifier", "handoffVehicleLocation", "callback", "Lkotlin/Function2;", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "createOrder", "orderInfo", "Lcom/radiusnetworks/flybuy/sdk/data/order/CreateOrderInfo;", "event", "orderEventInfo", "Lcom/radiusnetworks/flybuy/sdk/data/order/OrderEventInfo;", "findOrder", "sync", "", "updatePushToken", "token", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface RemoteOrdersRepository {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void claimOrder$default(RemoteOrdersRepository remoteOrdersRepository, String str, CustomerInfo customerInfo, String str2, String str3, String str4, Function2 function2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: claimOrder");
            }
            if ((i10 & 32) != 0) {
                function2 = null;
            }
            remoteOrdersRepository.claimOrder(str, customerInfo, str2, str3, str4, function2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void createOrder$default(RemoteOrdersRepository remoteOrdersRepository, CreateOrderInfo createOrderInfo, Function2 function2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createOrder");
            }
            if ((i10 & 2) != 0) {
                function2 = null;
            }
            remoteOrdersRepository.createOrder(createOrderInfo, function2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void event$default(RemoteOrdersRepository remoteOrdersRepository, OrderEventInfo orderEventInfo, Function2 function2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: event");
            }
            if ((i10 & 2) != 0) {
                function2 = null;
            }
            remoteOrdersRepository.event(orderEventInfo, function2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void findOrder$default(RemoteOrdersRepository remoteOrdersRepository, String str, Function2 function2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findOrder");
            }
            if ((i10 & 2) != 0) {
                function2 = null;
            }
            remoteOrdersRepository.findOrder(str, function2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void sync$default(RemoteOrdersRepository remoteOrdersRepository, Function2 function2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sync");
            }
            if ((i10 & 1) != 0) {
                function2 = null;
            }
            remoteOrdersRepository.sync(function2);
        }
    }

    void claimOrder(String code, CustomerInfo customerInfo, String pickupType, String spotIdentifier, String handoffVehicleLocation, Function2<? super Order, ? super SdkError, Unit> callback);

    void createOrder(CreateOrderInfo orderInfo, Function2<? super Order, ? super SdkError, Unit> callback);

    void event(OrderEventInfo orderEventInfo, Function2<? super Order, ? super SdkError, Unit> callback);

    void findOrder(String code, Function2<? super Order, ? super SdkError, Unit> callback);

    void sync(Function2<? super List<Order>, ? super SdkError, Unit> callback);

    void updatePushToken(String token);
}
