package com.radiusnetworks.flybuy.sdk.data.order;

import androidx.view.AbstractC5985A;
import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.push.FlybuyPushData;
import com.radiusnetworks.flybuy.sdk.data.room.domain.BeaconRegion;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Order;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0006\u0010\nJ%\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\u00042\u0006\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000e\u0010\nJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0016\u0010\u0016\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013H&¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001f¨\u0006#"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/order/LocalOrdersRepository;", "", "", "redemptionCode", "Landroidx/lifecycle/A;", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;", "getOrder", "(Ljava/lang/String;)Landroidx/lifecycle/A;", "", PreferencesHelper.PREF_ID, "(I)Landroidx/lifecycle/A;", "orderId", "", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/BeaconRegion;", "getBeaconRegionsForOrder", "findBeaconRegionsForOrder", "(I)Ljava/util/List;", "Lcom/radiusnetworks/flybuy/sdk/data/push/FlybuyPushData;", "pushData", "Lkotlin/Function1;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "", "callback", "updateOrderFromPush", "(Lcom/radiusnetworks/flybuy/sdk/data/push/FlybuyPushData;Lkotlin/jvm/functions/Function1;)V", "getOpenLiveData", "()Landroidx/lifecycle/A;", "openLiveData", "getAllLiveData", "allLiveData", "getAll", "()Ljava/util/List;", "all", "getOpen", "open", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface LocalOrdersRepository {
    List<BeaconRegion> findBeaconRegionsForOrder(int orderId);

    List<Order> getAll();

    AbstractC5985A<List<Order>> getAllLiveData();

    AbstractC5985A<List<BeaconRegion>> getBeaconRegionsForOrder(int orderId);

    List<Order> getOpen();

    AbstractC5985A<List<Order>> getOpenLiveData();

    AbstractC5985A<Order> getOrder(int id2);

    AbstractC5985A<Order> getOrder(String redemptionCode);

    void updateOrderFromPush(FlybuyPushData pushData, Function1<? super SdkError, Unit> callback);
}
