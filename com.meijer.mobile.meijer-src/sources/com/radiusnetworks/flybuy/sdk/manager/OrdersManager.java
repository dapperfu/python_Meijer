package com.radiusnetworks.flybuy.sdk.manager;

import android.content.Context;
import android.location.Location;
import androidx.view.AbstractC6127A;
import androidx.view.InterfaceC6131E;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.customer.CustomerInfo;
import com.radiusnetworks.flybuy.sdk.data.defaults.SdkDefaultsKt;
import com.radiusnetworks.flybuy.sdk.data.operations.OrdersOperation;
import com.radiusnetworks.flybuy.sdk.data.operations.RemoteOrdersOperation;
import com.radiusnetworks.flybuy.sdk.data.order.CreateOrderInfo;
import com.radiusnetworks.flybuy.sdk.data.order.LocalOrdersDataStore;
import com.radiusnetworks.flybuy.sdk.data.order.OrderEventInfo;
import com.radiusnetworks.flybuy.sdk.data.order.OrderEventType;
import com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore;
import com.radiusnetworks.flybuy.sdk.data.order.States;
import com.radiusnetworks.flybuy.sdk.data.order.StatesKt;
import com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase;
import com.radiusnetworks.flybuy.sdk.data.room.domain.BeaconRegion;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Order;
import com.radiusnetworks.flybuy.sdk.data.room.domain.PickupWindow;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Site;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import com.radiusnetworks.flybuy.sdk.manager.builder.OrderOptions;
import com.radiusnetworks.flybuy.sdk.manager.builder.PickupMethodOptions;
import com.radiusnetworks.flybuy.sdk.manager.builder.SiteOptions;
import com.radiusnetworks.flybuy.sdk.util.LocationExtensionsKt;
import io.constructor.data.local.PreferencesHelper;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000e\u0010\fJ!\u0010\u0014\u001a\u00020\n2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\n2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010¢\u0006\u0004\b\u0016\u0010\u0015J5\u0010\u001a\u001a\u00020\n2&\b\u0002\u0010\u0019\u001a \u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2 \b\u0002\u0010\u0019\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001eJ?\u0010#\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2 \b\u0002\u0010\u0019\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0004\b#\u0010$Jm\u0010#\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u001c2 \b\u0002\u0010\u0019\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017H\u0007¢\u0006\u0004\b#\u0010,J?\u0010#\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020!2 \b\u0002\u0010\u0019\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0004\b#\u0010.Jm\u0010#\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u001c2 \b\u0002\u0010\u0019\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017H\u0007¢\u0006\u0004\b#\u00100J?\u00101\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020!2 \b\u0002\u0010\u0019\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0004\b1\u0010.JM\u00101\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020&2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u001c2 \b\u0002\u0010\u0019\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017H\u0007¢\u0006\u0004\b1\u00102J?\u00105\u001a\u00020\n2\u0006\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u00020\u001c2 \b\u0002\u0010\u0019\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0004\b5\u00106JI\u00105\u001a\u00020\n2\u0006\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u00020\u001c2\b\u00107\u001a\u0004\u0018\u00010\u001c2 \b\u0002\u0010\u0019\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0004\b5\u00108J?\u00109\u001a\u00020\n2\u0006\u00103\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u001c2 \b\u0002\u0010\u0019\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0004\b9\u00106JA\u0010:\u001a\u00020\n2\u0006\u00103\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001c2 \b\u0002\u0010\u0019\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017H\u0007¢\u0006\u0004\b:\u00106J?\u0010=\u001a\u00020\n2\u0006\u00103\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020;2 \b\u0002\u0010\u0019\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0004\b=\u0010>J9\u0010A\u001a\u00020\n2\u0006\u0010@\u001a\u00020?2 \b\u0002\u0010\u0019\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017H\u0007¢\u0006\u0004\bA\u0010BJI\u0010E\u001a\u00020\n2\u0006\u00103\u001a\u00020\u001f2\u0006\u0010C\u001a\u00020\u001f2\b\u0010D\u001a\u0004\u0018\u00010\u001c2 \b\u0002\u0010\u0019\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0004\bE\u0010FJ\u001d\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120G2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\bH\u0010IJ\u001d\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120G2\u0006\u0010J\u001a\u00020\u001f¢\u0006\u0004\bH\u0010KJ%\u0010M\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020L\u0018\u00010\u00110G2\u0006\u00103\u001a\u00020\u001fH\u0007¢\u0006\u0004\bM\u0010KJ\u0015\u0010O\u001a\u00020N2\u0006\u00103\u001a\u00020\u001f¢\u0006\u0004\bO\u0010PR\u0014\u0010Q\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\"\u0010T\u001a\u00020S8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR&\u0010[\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00100Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R \u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0017\u0010a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00118F¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0017\u0010c\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00118F¢\u0006\u0006\u001a\u0004\bb\u0010`R\u0017\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118F¢\u0006\u0006\u001a\u0004\bd\u0010`R\u0017\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118F¢\u0006\u0006\u001a\u0004\bf\u0010`R\u001d\u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110G8F¢\u0006\u0006\u001a\u0004\bh\u0010iR\u001d\u0010l\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110G8F¢\u0006\u0006\u001a\u0004\bk\u0010i¨\u0006m"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/manager/OrdersManager;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/radiusnetworks/flybuy/sdk/data/operations/OrdersOperation;", "getOrdersOperation$core_defaultRelease", "()Lcom/radiusnetworks/flybuy/sdk/data/operations/OrdersOperation;", "getOrdersOperation", "", "onActivityStarted$core_defaultRelease", "()V", "onActivityStarted", "onActivityStopped$core_defaultRelease", "onActivityStopped", "Landroidx/lifecycle/E;", "", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;", "observer", "addOpenOrdersChangeListener", "(Landroidx/lifecycle/E;)V", "removeOpenOrdersChangeListener", "Lkotlin/Function2;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "callback", "fetch", "(Lkotlin/jvm/functions/Function2;)V", "", "redemptionCode", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "", "siteID", "Lcom/radiusnetworks/flybuy/sdk/manager/builder/OrderOptions;", "orderOptions", "create", "(ILcom/radiusnetworks/flybuy/sdk/manager/builder/OrderOptions;Lkotlin/jvm/functions/Function2;)V", "partnerIdentifier", "Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;", "customerInfo", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/PickupWindow;", "pickupWindow", "state", "pickupType", "(ILjava/lang/String;Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;Lcom/radiusnetworks/flybuy/sdk/data/room/domain/PickupWindow;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "sitePartnerIdentifier", "(Ljava/lang/String;Lcom/radiusnetworks/flybuy/sdk/manager/builder/OrderOptions;Lkotlin/jvm/functions/Function2;)V", "orderPartnerIdentifier", "(Ljava/lang/String;Ljava/lang/String;Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;Lcom/radiusnetworks/flybuy/sdk/data/room/domain/PickupWindow;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "claim", "(Ljava/lang/String;Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "orderId", "customerState", "updateCustomerState", "(ILjava/lang/String;Lkotlin/jvm/functions/Function2;)V", "spotIdentifier", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "updateState", "updatePickupType", "Lcom/radiusnetworks/flybuy/sdk/manager/builder/PickupMethodOptions;", "pickupMethodOptions", "updatePickupMethod", "(ILcom/radiusnetworks/flybuy/sdk/manager/builder/PickupMethodOptions;Lkotlin/jvm/functions/Function2;)V", "Lcom/radiusnetworks/flybuy/sdk/data/order/OrderEventInfo;", "orderEventInfo", "event", "(Lcom/radiusnetworks/flybuy/sdk/data/order/OrderEventInfo;Lkotlin/jvm/functions/Function2;)V", "rating", "comments", "rateOrder", "(IILjava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Landroidx/lifecycle/A;", "getOrder", "(Ljava/lang/String;)Landroidx/lifecycle/A;", PreferencesHelper.PREF_ID, "(I)Landroidx/lifecycle/A;", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/BeaconRegion;", "getBeaconRegionsForOrder", "", "orderHasBeaconRegions", "(I)Z", "applicationContext", "Landroid/content/Context;", "Lcom/radiusnetworks/flybuy/sdk/data/order/States;", "pickupStates", "Lcom/radiusnetworks/flybuy/sdk/data/order/States;", "getPickupStates$core_defaultRelease", "()Lcom/radiusnetworks/flybuy/sdk/data/order/States;", "setPickupStates$core_defaultRelease", "(Lcom/radiusnetworks/flybuy/sdk/data/order/States;)V", "", "openOrdersSubscribers", "Ljava/util/Set;", "openOrdersObserver", "Landroidx/lifecycle/E;", "getStates", "()Ljava/util/List;", "states", "getCustomerStates", "customerStates", "getAll", "all", "getOpen", "open", "getOpenLiveData", "()Landroidx/lifecycle/A;", "openLiveData", "getAllLiveData", "allLiveData", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class OrdersManager {
    private final Context applicationContext;
    private final InterfaceC6131E<List<Order>> openOrdersObserver;
    private final Set<InterfaceC6131E<List<Order>>> openOrdersSubscribers;
    private States pickupStates;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void claim$default(OrdersManager ordersManager, String str, OrderOptions orderOptions, Function2 function2, int i10, Object obj) throws Exception {
        if ((i10 & 4) != 0) {
            function2 = null;
        }
        ordersManager.claim(str, orderOptions, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void create$default(OrdersManager ordersManager, int i10, OrderOptions orderOptions, Function2 function2, int i11, Object obj) throws Exception {
        if ((i11 & 4) != 0) {
            function2 = null;
        }
        ordersManager.create(i10, orderOptions, (Function2<? super Order, ? super SdkError, Unit>) function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetch$default(OrdersManager ordersManager, Function2 function2, int i10, Object obj) throws Exception {
        if ((i10 & 1) != 0) {
            function2 = null;
        }
        ordersManager.fetch(function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateCustomerState$default(OrdersManager ordersManager, int i10, String str, Function2 function2, int i11, Object obj) throws Exception {
        if ((i11 & 4) != 0) {
            function2 = null;
        }
        ordersManager.updateCustomerState(i10, str, function2);
    }

    public final void claim(String redemptionCode, OrderOptions orderOptions, Function2<? super Order, ? super SdkError, Unit> callback) throws Exception {
        Intrinsics.j(redemptionCode, "redemptionCode");
        Intrinsics.j(orderOptions, "orderOptions");
        try {
            CustomerInfo.Builder builder = new CustomerInfo.Builder(orderOptions.getCustomerName());
            builder.setCarType(orderOptions.getCustomerCarType()).setCarColor(orderOptions.getCustomerCarColor()).setPhone(orderOptions.getCustomerPhone()).setLicensePlate(orderOptions.getCustomerCarLicensePlate());
            getOrdersOperation$core_defaultRelease().claimOrder(redemptionCode, builder.build(), orderOptions.getPickupType(), orderOptions.getSpotIdentifier(), orderOptions.getHandoffVehicleLocation(), callback);
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }

    public final void create(int siteID, OrderOptions orderOptions, Function2<? super Order, ? super SdkError, Unit> callback) throws Exception {
        Intrinsics.j(orderOptions, "orderOptions");
        try {
            getOrdersOperation$core_defaultRelease().createOrder(new CreateOrderInfo(siteID, orderOptions.getPartnerIdentifier(), orderOptions.getCustomerName(), orderOptions.getCustomerCarType(), orderOptions.getCustomerCarColor(), orderOptions.getCustomerCarLicensePlate(), orderOptions.getCustomerPhone(), null, orderOptions.getPickupWindow(), orderOptions.getState(), orderOptions.getPickupType(), orderOptions.getSpotIdentifier(), orderOptions.getHandoffVehicleLocation(), orderOptions.getPartnerIdentifierForCustomer(), orderOptions.getPartnerIdentifierForCrew(), orderOptions.getDisableOrderFire(), orderOptions.getDisablePromiseTimeScheduling(), orderOptions.getOrderFireMakeIntervalSeconds(), 128, null), callback);
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }

    public final void fetch(Function2<? super List<Order>, ? super SdkError, Unit> callback) throws Exception {
        try {
            getOrdersOperation$core_defaultRelease().sync(callback);
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }

    public final AbstractC6127A<Order> getOrder(String redemptionCode) throws Exception {
        Intrinsics.j(redemptionCode, "redemptionCode");
        try {
            return getOrdersOperation$core_defaultRelease().getOrder(redemptionCode);
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }

    public final void updateCustomerState(int orderId, String customerState, Function2<? super Order, ? super SdkError, Unit> callback) throws Exception {
        Intrinsics.j(customerState, "customerState");
        updateCustomerState(orderId, customerState, null, callback);
    }

    public OrdersManager(Context context) {
        Intrinsics.j(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.i(applicationContext, "getApplicationContext(...)");
        this.applicationContext = applicationContext;
        this.pickupStates = StatesKt.toStates(SdkDefaultsKt.getDEFAULT_PICKUP_STATES());
        this.openOrdersSubscribers = new LinkedHashSet();
        this.openOrdersObserver = new InterfaceC6131E() { // from class: com.radiusnetworks.flybuy.sdk.manager.b
            @Override // androidx.view.InterfaceC6131E
            public final void onChanged(Object obj) {
                OrdersManager.openOrdersObserver$lambda$8(this.f120955a, (List) obj);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void claim$default(OrdersManager ordersManager, String str, CustomerInfo customerInfo, String str2, Function2 function2, int i10, Object obj) throws Exception {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            function2 = null;
        }
        ordersManager.claim(str, customerInfo, str2, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void create$default(OrdersManager ordersManager, int i10, String str, CustomerInfo customerInfo, PickupWindow pickupWindow, String str2, String str3, Function2 function2, int i11, Object obj) throws Exception {
        if ((i11 & 8) != 0) {
            pickupWindow = null;
        }
        if ((i11 & 16) != 0) {
            str2 = null;
        }
        if ((i11 & 32) != 0) {
            str3 = null;
        }
        if ((i11 & 64) != 0) {
            function2 = null;
        }
        ordersManager.create(i10, str, customerInfo, pickupWindow, str2, str3, (Function2<? super Order, ? super SdkError, Unit>) function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void event$default(OrdersManager ordersManager, OrderEventInfo orderEventInfo, Function2 function2, int i10, Object obj) throws Exception {
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        ordersManager.event(orderEventInfo, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetch$default(OrdersManager ordersManager, String str, Function2 function2, int i10, Object obj) throws Exception {
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        ordersManager.fetch(str, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openOrdersObserver$lambda$8(OrdersManager this$0, List orders) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(orders, "orders");
        LogExtensionsKt.logd(this$0, true, "Orders updated!");
        synchronized (this$0.openOrdersSubscribers) {
            try {
                Iterator<T> it = this$0.openOrdersSubscribers.iterator();
                while (it.hasNext()) {
                    ((InterfaceC6131E) it.next()).onChanged(orders);
                }
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void rateOrder$default(OrdersManager ordersManager, int i10, int i11, String str, Function2 function2, int i12, Object obj) throws Exception {
        if ((i12 & 8) != 0) {
            function2 = null;
        }
        ordersManager.rateOrder(i10, i11, str, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateCustomerState$default(OrdersManager ordersManager, int i10, String str, String str2, Function2 function2, int i11, Object obj) throws Exception {
        if ((i11 & 8) != 0) {
            function2 = null;
        }
        ordersManager.updateCustomerState(i10, str, str2, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updatePickupMethod$default(OrdersManager ordersManager, int i10, PickupMethodOptions pickupMethodOptions, Function2 function2, int i11, Object obj) throws Exception {
        if ((i11 & 4) != 0) {
            function2 = null;
        }
        ordersManager.updatePickupMethod(i10, pickupMethodOptions, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updatePickupType$default(OrdersManager ordersManager, int i10, String str, Function2 function2, int i11, Object obj) throws Exception {
        if ((i11 & 4) != 0) {
            function2 = null;
        }
        ordersManager.updatePickupType(i10, str, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateState$default(OrdersManager ordersManager, int i10, String str, Function2 function2, int i11, Object obj) throws Exception {
        if ((i11 & 4) != 0) {
            function2 = null;
        }
        ordersManager.updateState(i10, str, function2);
    }

    public final void addOpenOrdersChangeListener(InterfaceC6131E<List<Order>> observer) throws Exception {
        Intrinsics.j(observer, "observer");
        try {
            synchronized (this.openOrdersSubscribers) {
                this.openOrdersSubscribers.add(observer);
            }
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }

    public final void event(OrderEventInfo orderEventInfo, Function2<? super Order, ? super SdkError, Unit> callback) throws Exception {
        Intrinsics.j(orderEventInfo, "orderEventInfo");
        try {
            getOrdersOperation$core_defaultRelease().event(orderEventInfo, callback);
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }

    public final List<String> getCustomerStates() throws Exception {
        try {
            return FlyBuyCore.INSTANCE.getSdkConfig().getPickupStates().getCustomer();
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }

    public final OrdersOperation getOrdersOperation$core_defaultRelease() {
        Context context = this.applicationContext;
        Intrinsics.j(context, "context");
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.i(applicationContext, "getApplicationContext(...)");
        LocalOrdersDataStore localOrdersRepository = new LocalOrdersDataStore(companion.getInstance(applicationContext));
        Context context2 = this.applicationContext;
        Intrinsics.j(context2, "context");
        Context applicationContext2 = context2.getApplicationContext();
        Intrinsics.i(applicationContext2, "getApplicationContext(...)");
        RemoteOrdersDataStore remoteOrdersRepository = new RemoteOrdersDataStore(applicationContext2);
        Intrinsics.j(localOrdersRepository, "localOrdersRepository");
        Intrinsics.j(remoteOrdersRepository, "remoteOrdersRepository");
        return new OrdersOperation(localOrdersRepository, new RemoteOrdersOperation(remoteOrdersRepository));
    }

    /* renamed from: getPickupStates$core_defaultRelease, reason: from getter */
    public final States getPickupStates() {
        return this.pickupStates;
    }

    public final List<String> getStates() throws Exception {
        try {
            return FlyBuyCore.INSTANCE.getSdkConfig().getPickupStates().getOrder();
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }

    public final void removeOpenOrdersChangeListener(InterfaceC6131E<List<Order>> observer) throws Exception {
        Intrinsics.j(observer, "observer");
        try {
            synchronized (this.openOrdersSubscribers) {
                this.openOrdersSubscribers.remove(observer);
            }
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }

    public final void setPickupStates$core_defaultRelease(States states) {
        Intrinsics.j(states, "<set-?>");
        this.pickupStates = states;
    }

    public final void updateCustomerState(final int orderId, final String customerState, final String spotIdentifier, final Function2<? super Order, ? super SdkError, Unit> callback) throws Exception {
        Intrinsics.j(customerState, "customerState");
        try {
        } catch (Exception e10) {
            e = e10;
        }
        try {
            FlyBuyCore.INSTANCE.getLocationRequestManager().requestLocation$core_defaultRelease(new Function1<Location, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.manager.OrdersManager$updateCustomerState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Location location) {
                    invoke2(location);
                    return Unit.f143329a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Location location) {
                    OrdersOperation ordersOperation$core_defaultRelease = this.this$0.getOrdersOperation$core_defaultRelease();
                    OrderEventType orderEventType = OrderEventType.STATE_CHANGE;
                    Double dValueOf = location != null ? Double.valueOf(location.getLatitude()) : null;
                    ordersOperation$core_defaultRelease.event(new OrderEventInfo(orderId, orderEventType, location != null ? Double.valueOf(location.getLongitude()) : null, dValueOf, location != null ? Float.valueOf(location.getAccuracy()) : null, location != null ? Float.valueOf(location.getSpeed()) : null, null, customerState, null, null, null, null, null, spotIdentifier, null, null, location != null ? LocationExtensionsKt.getTimeInstant(location) : null, null, null, null, null, null, 4120384, null), callback);
                }
            });
        } catch (Exception e11) {
            e = e11;
            Exception exc = e;
            LogExtensionsKt.logd(this, true, exc, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", exc);
            throw exc;
        }
    }

    public final void updatePickupMethod(int orderId, PickupMethodOptions pickupMethodOptions, Function2<? super Order, ? super SdkError, Unit> callback) throws Exception {
        Intrinsics.j(pickupMethodOptions, "pickupMethodOptions");
        try {
            getOrdersOperation$core_defaultRelease().event(new OrderEventInfo(orderId, OrderEventType.PICKUP_TYPE_CHANGE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, pickupMethodOptions.getPickupType(), pickupMethodOptions.getCustomerCarColor(), pickupMethodOptions.getCustomerCarType(), pickupMethodOptions.getCustomerLicensePlate(), pickupMethodOptions.getHandoffVehicleLocation(), 131068, null), callback);
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }

    @Deprecated
    public final void updatePickupType(int orderId, String pickupType, Function2<? super Order, ? super SdkError, Unit> callback) throws Exception {
        Intrinsics.j(pickupType, "pickupType");
        try {
            getOrdersOperation$core_defaultRelease().event(new OrderEventInfo(orderId, OrderEventType.PICKUP_TYPE_CHANGE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, pickupType, null, null, null, null, 4063228, null), callback);
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }

    public final void updateState(final int orderId, final String state, final Function2<? super Order, ? super SdkError, Unit> callback) throws Exception {
        Intrinsics.j(state, "state");
        try {
            FlyBuyCore.INSTANCE.getLocationRequestManager().requestLocation$core_defaultRelease(new Function1<Location, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.manager.OrdersManager$updateState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Location location) {
                    invoke2(location);
                    return Unit.f143329a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Location location) {
                    OrdersOperation ordersOperation$core_defaultRelease = this.this$0.getOrdersOperation$core_defaultRelease();
                    OrderEventType orderEventType = OrderEventType.STATE_CHANGE;
                    Double dValueOf = location != null ? Double.valueOf(location.getLatitude()) : null;
                    ordersOperation$core_defaultRelease.event(new OrderEventInfo(orderId, orderEventType, location != null ? Double.valueOf(location.getLongitude()) : null, dValueOf, location != null ? Float.valueOf(location.getAccuracy()) : null, location != null ? Float.valueOf(location.getSpeed()) : null, null, null, null, null, state, null, null, null, null, null, location != null ? LocationExtensionsKt.getTimeInstant(location) : null, null, null, null, null, null, 4127680, null), callback);
                }
            });
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void create$default(OrdersManager ordersManager, String str, OrderOptions orderOptions, Function2 function2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function2 = null;
        }
        ordersManager.create(str, orderOptions, (Function2<? super Order, ? super SdkError, Unit>) function2);
    }

    public final List<Order> getAll() throws Exception {
        try {
            return getOrdersOperation$core_defaultRelease().getAll();
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }

    public final AbstractC6127A<List<Order>> getAllLiveData() throws Exception {
        try {
            return getOrdersOperation$core_defaultRelease().getAllLiveData();
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }

    public final AbstractC6127A<List<BeaconRegion>> getBeaconRegionsForOrder(int orderId) throws Exception {
        try {
            return getOrdersOperation$core_defaultRelease().getBeaconRegionsForOrder(orderId);
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }

    public final List<Order> getOpen() throws Exception {
        try {
            return getOrdersOperation$core_defaultRelease().getOpen();
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }

    public final AbstractC6127A<List<Order>> getOpenLiveData() throws Exception {
        try {
            return getOrdersOperation$core_defaultRelease().getOpenLiveData();
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }

    public final void onActivityStarted$core_defaultRelease() {
        getOpenLiveData().j(this.openOrdersObserver);
    }

    public final void onActivityStopped$core_defaultRelease() {
        getOpenLiveData().n(this.openOrdersObserver);
    }

    public final boolean orderHasBeaconRegions(int orderId) throws Exception {
        try {
            return getOrdersOperation$core_defaultRelease().orderHasBeaconRegions(orderId);
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }

    public final void rateOrder(int orderId, int rating, String comments, Function2<? super Order, ? super SdkError, Unit> callback) throws Exception {
        try {
            getOrdersOperation$core_defaultRelease().event(new OrderEventInfo(orderId, OrderEventType.CUSTOMER_RATING, null, null, null, null, null, null, null, null, null, Integer.valueOf(rating), comments, null, null, null, null, null, null, null, null, null, 4188156, null), callback);
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void create$default(OrdersManager ordersManager, String str, String str2, CustomerInfo customerInfo, PickupWindow pickupWindow, String str3, String str4, Function2 function2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            pickupWindow = null;
        }
        if ((i10 & 16) != 0) {
            str3 = null;
        }
        if ((i10 & 32) != 0) {
            str4 = null;
        }
        if ((i10 & 64) != 0) {
            function2 = null;
        }
        ordersManager.create(str, str2, customerInfo, pickupWindow, str3, str4, (Function2<? super Order, ? super SdkError, Unit>) function2);
    }

    public final void fetch(String redemptionCode, Function2<? super Order, ? super SdkError, Unit> callback) throws Exception {
        Intrinsics.j(redemptionCode, "redemptionCode");
        try {
            getOrdersOperation$core_defaultRelease().findOrder(redemptionCode, callback);
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }

    public final AbstractC6127A<Order> getOrder(int id2) throws Exception {
        try {
            return getOrdersOperation$core_defaultRelease().getOrder(id2);
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }

    @Deprecated
    public final void claim(String redemptionCode, CustomerInfo customerInfo, String pickupType, Function2<? super Order, ? super SdkError, Unit> callback) throws Exception {
        Intrinsics.j(redemptionCode, "redemptionCode");
        Intrinsics.j(customerInfo, "customerInfo");
        try {
            getOrdersOperation$core_defaultRelease().claimOrder(redemptionCode, customerInfo, pickupType, null, null, callback);
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }

    @Deprecated
    public final void create(int siteID, String partnerIdentifier, CustomerInfo customerInfo, PickupWindow pickupWindow, String state, String pickupType, Function2<? super Order, ? super SdkError, Unit> callback) throws Exception {
        Intrinsics.j(partnerIdentifier, "partnerIdentifier");
        Intrinsics.j(customerInfo, "customerInfo");
        try {
            getOrdersOperation$core_defaultRelease().createOrder(new CreateOrderInfo(siteID, partnerIdentifier, customerInfo.getName(), customerInfo.getCarType(), customerInfo.getCarColor(), customerInfo.getLicensePlate(), customerInfo.getPhone(), null, pickupWindow, state, pickupType, null, null, null, null, null, null, null, 254080, null), callback);
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }

    public final void create(String sitePartnerIdentifier, final OrderOptions orderOptions, final Function2<? super Order, ? super SdkError, Unit> callback) {
        Intrinsics.j(sitePartnerIdentifier, "sitePartnerIdentifier");
        Intrinsics.j(orderOptions, "orderOptions");
        FlyBuyCore.getSites().fetchByPartnerIdentifier(sitePartnerIdentifier, new SiteOptions.Builder().build(), new Function2<Site, SdkError, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.manager.OrdersManager.create.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Site site, SdkError sdkError) throws Exception {
                invoke2(site, sdkError);
                return Unit.f143329a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Site site, SdkError sdkError) throws Exception {
                if (sdkError == null && site != null) {
                    this.create(site.getId(), orderOptions, callback);
                    return;
                }
                Function2<Order, SdkError, Unit> function2 = callback;
                if (function2 != null) {
                    function2.invoke(null, sdkError);
                }
            }
        });
    }

    @Deprecated
    public final void create(String sitePartnerIdentifier, final String orderPartnerIdentifier, final CustomerInfo customerInfo, final PickupWindow pickupWindow, final String state, final String pickupType, final Function2<? super Order, ? super SdkError, Unit> callback) {
        Intrinsics.j(sitePartnerIdentifier, "sitePartnerIdentifier");
        Intrinsics.j(orderPartnerIdentifier, "orderPartnerIdentifier");
        Intrinsics.j(customerInfo, "customerInfo");
        FlyBuyCore.getSites().fetchByPartnerIdentifier(sitePartnerIdentifier, new SiteOptions.Builder().build(), new Function2<Site, SdkError, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.manager.OrdersManager.create.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Site site, SdkError sdkError) throws Exception {
                invoke2(site, sdkError);
                return Unit.f143329a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Site site, SdkError sdkError) throws Exception {
                if (sdkError != null || site == null) {
                    Function2<Order, SdkError, Unit> function2 = callback;
                    if (function2 != null) {
                        function2.invoke(null, sdkError);
                        return;
                    }
                    return;
                }
                OrdersManager ordersManager = this;
                String str = orderPartnerIdentifier;
                CustomerInfo customerInfo2 = customerInfo;
                PickupWindow pickupWindow2 = pickupWindow;
                String str2 = state;
                String str3 = pickupType;
                Function2<Order, SdkError, Unit> function22 = callback;
                try {
                    ordersManager.getOrdersOperation$core_defaultRelease().createOrder(new CreateOrderInfo(site.getId(), str, customerInfo2.getName(), customerInfo2.getCarType(), customerInfo2.getCarColor(), customerInfo2.getLicensePlate(), customerInfo2.getPhone(), null, pickupWindow2, str2, str3, null, null, null, null, null, null, null, 254080, null), function22);
                } catch (Exception e10) {
                    LogExtensionsKt.logd(ordersManager, true, e10, "catchAndThrow caught exception", new Object[0]);
                    com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
                    throw e10;
                }
            }
        });
    }
}
