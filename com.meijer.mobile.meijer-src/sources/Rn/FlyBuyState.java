package Rn;

import Hl.FlyBuyOrderDetail;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.storeinfo.api.model.StoreInfo;
import hj.OrderDetail;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import vo.OrderSubstitutionItem;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J®\u0001\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\b7\u0010/R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b8\u0010-\u001a\u0004\b9\u0010/R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b6\u0010/R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b:\u0010-\u001a\u0004\b;\u0010/R\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b9\u0010-\u001a\u0004\b:\u0010/R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b7\u0010<\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b5\u0010<\u001a\u0004\b4\u0010\u001cR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b;\u0010=\u001a\u0004\b8\u0010>¨\u0006?"}, d2 = {"LRn/K;", "", "LHl/b;", "flyBuyOrder", "Lhj/c;", "currentOrderDetails", "", "Lvo/a;", "substitutionItems", "", "isSubstitutionReviewScreen", "isSubstitutionsSubmissionsSuccessful", "isOrderDetailSubstitutionTrackStateEnabled", "isCheckInSubstitutionsTrackStateEnabled", "isCheckInConfirmParkingSpotTrackStateEnable", "restoreVehicleInfoState", "isParkingSpotSet", "isBopasTimeSlot", "", "parkingSpot", "pickupName", "Lcom/meijer/mobile/storeinfo/api/model/StoreInfo;", "storeInfo", "<init>", "(LHl/b;Lhj/c;Ljava/util/List;ZLjava/lang/Boolean;ZZZZZZLjava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/storeinfo/api/model/StoreInfo;)V", "a", "(LHl/b;Lhj/c;Ljava/util/List;ZLjava/lang/Boolean;ZZZZZZLjava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/storeinfo/api/model/StoreInfo;)LRn/K;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LHl/b;", "d", "()LHl/b;", "b", "Lhj/c;", "c", "()Lhj/c;", "Ljava/util/List;", "i", "()Ljava/util/List;", "Z", "o", "()Z", "e", "Ljava/lang/Boolean;", "p", "()Ljava/lang/Boolean;", "f", "m", "g", "l", "h", "k", "j", "n", "Ljava/lang/String;", "Lcom/meijer/mobile/storeinfo/api/model/StoreInfo;", "()Lcom/meijer/mobile/storeinfo/api/model/StoreInfo;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Rn.K, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class FlyBuyState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final FlyBuyOrderDetail flyBuyOrder;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderDetail currentOrderDetails;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<OrderSubstitutionItem> substitutionItems;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSubstitutionReviewScreen;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isSubstitutionsSubmissionsSuccessful;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOrderDetailSubstitutionTrackStateEnabled;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCheckInSubstitutionsTrackStateEnabled;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCheckInConfirmParkingSpotTrackStateEnable;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean restoreVehicleInfoState;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isParkingSpotSet;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isBopasTimeSlot;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String parkingSpot;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickupName;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final StoreInfo storeInfo;

    public FlyBuyState() {
        this(null, null, null, false, null, false, false, false, false, false, false, null, null, null, 16383, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlyBuyState)) {
            return false;
        }
        FlyBuyState flyBuyState = (FlyBuyState) other;
        return Intrinsics.e(this.flyBuyOrder, flyBuyState.flyBuyOrder) && Intrinsics.e(this.currentOrderDetails, flyBuyState.currentOrderDetails) && Intrinsics.e(this.substitutionItems, flyBuyState.substitutionItems) && this.isSubstitutionReviewScreen == flyBuyState.isSubstitutionReviewScreen && Intrinsics.e(this.isSubstitutionsSubmissionsSuccessful, flyBuyState.isSubstitutionsSubmissionsSuccessful) && this.isOrderDetailSubstitutionTrackStateEnabled == flyBuyState.isOrderDetailSubstitutionTrackStateEnabled && this.isCheckInSubstitutionsTrackStateEnabled == flyBuyState.isCheckInSubstitutionsTrackStateEnabled && this.isCheckInConfirmParkingSpotTrackStateEnable == flyBuyState.isCheckInConfirmParkingSpotTrackStateEnable && this.restoreVehicleInfoState == flyBuyState.restoreVehicleInfoState && this.isParkingSpotSet == flyBuyState.isParkingSpotSet && this.isBopasTimeSlot == flyBuyState.isBopasTimeSlot && Intrinsics.e(this.parkingSpot, flyBuyState.parkingSpot) && Intrinsics.e(this.pickupName, flyBuyState.pickupName) && Intrinsics.e(this.storeInfo, flyBuyState.storeInfo);
    }

    public FlyBuyState(FlyBuyOrderDetail flyBuyOrderDetail, OrderDetail orderDetail, List<OrderSubstitutionItem> substitutionItems, boolean z10, Boolean bool, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, String str, String str2, StoreInfo storeInfo) {
        Intrinsics.j(substitutionItems, "substitutionItems");
        this.flyBuyOrder = flyBuyOrderDetail;
        this.currentOrderDetails = orderDetail;
        this.substitutionItems = substitutionItems;
        this.isSubstitutionReviewScreen = z10;
        this.isSubstitutionsSubmissionsSuccessful = bool;
        this.isOrderDetailSubstitutionTrackStateEnabled = z11;
        this.isCheckInSubstitutionsTrackStateEnabled = z12;
        this.isCheckInConfirmParkingSpotTrackStateEnable = z13;
        this.restoreVehicleInfoState = z14;
        this.isParkingSpotSet = z15;
        this.isBopasTimeSlot = z16;
        this.parkingSpot = str;
        this.pickupName = str2;
        this.storeInfo = storeInfo;
    }

    public final FlyBuyState a(FlyBuyOrderDetail flyBuyOrder, OrderDetail currentOrderDetails, List<OrderSubstitutionItem> substitutionItems, boolean isSubstitutionReviewScreen, Boolean isSubstitutionsSubmissionsSuccessful, boolean isOrderDetailSubstitutionTrackStateEnabled, boolean isCheckInSubstitutionsTrackStateEnabled, boolean isCheckInConfirmParkingSpotTrackStateEnable, boolean restoreVehicleInfoState, boolean isParkingSpotSet, boolean isBopasTimeSlot, String parkingSpot, String pickupName, StoreInfo storeInfo) {
        Intrinsics.j(substitutionItems, "substitutionItems");
        return new FlyBuyState(flyBuyOrder, currentOrderDetails, substitutionItems, isSubstitutionReviewScreen, isSubstitutionsSubmissionsSuccessful, isOrderDetailSubstitutionTrackStateEnabled, isCheckInSubstitutionsTrackStateEnabled, isCheckInConfirmParkingSpotTrackStateEnable, restoreVehicleInfoState, isParkingSpotSet, isBopasTimeSlot, parkingSpot, pickupName, storeInfo);
    }

    /* renamed from: c, reason: from getter */
    public final OrderDetail getCurrentOrderDetails() {
        return this.currentOrderDetails;
    }

    /* renamed from: d, reason: from getter */
    public final FlyBuyOrderDetail getFlyBuyOrder() {
        return this.flyBuyOrder;
    }

    /* renamed from: e, reason: from getter */
    public final String getParkingSpot() {
        return this.parkingSpot;
    }

    /* renamed from: f, reason: from getter */
    public final String getPickupName() {
        return this.pickupName;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getRestoreVehicleInfoState() {
        return this.restoreVehicleInfoState;
    }

    /* renamed from: h, reason: from getter */
    public final StoreInfo getStoreInfo() {
        return this.storeInfo;
    }

    public int hashCode() {
        FlyBuyOrderDetail flyBuyOrderDetail = this.flyBuyOrder;
        int iHashCode = (flyBuyOrderDetail == null ? 0 : flyBuyOrderDetail.hashCode()) * 31;
        OrderDetail orderDetail = this.currentOrderDetails;
        int iHashCode2 = (((((iHashCode + (orderDetail == null ? 0 : orderDetail.hashCode())) * 31) + this.substitutionItems.hashCode()) * 31) + Boolean.hashCode(this.isSubstitutionReviewScreen)) * 31;
        Boolean bool = this.isSubstitutionsSubmissionsSuccessful;
        int iHashCode3 = (((((((((((((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.isOrderDetailSubstitutionTrackStateEnabled)) * 31) + Boolean.hashCode(this.isCheckInSubstitutionsTrackStateEnabled)) * 31) + Boolean.hashCode(this.isCheckInConfirmParkingSpotTrackStateEnable)) * 31) + Boolean.hashCode(this.restoreVehicleInfoState)) * 31) + Boolean.hashCode(this.isParkingSpotSet)) * 31) + Boolean.hashCode(this.isBopasTimeSlot)) * 31;
        String str = this.parkingSpot;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pickupName;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        StoreInfo storeInfo = this.storeInfo;
        return iHashCode5 + (storeInfo != null ? storeInfo.hashCode() : 0);
    }

    public final List<OrderSubstitutionItem> i() {
        return this.substitutionItems;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsBopasTimeSlot() {
        return this.isBopasTimeSlot;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getIsCheckInConfirmParkingSpotTrackStateEnable() {
        return this.isCheckInConfirmParkingSpotTrackStateEnable;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getIsCheckInSubstitutionsTrackStateEnabled() {
        return this.isCheckInSubstitutionsTrackStateEnabled;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getIsOrderDetailSubstitutionTrackStateEnabled() {
        return this.isOrderDetailSubstitutionTrackStateEnabled;
    }

    /* renamed from: n, reason: from getter */
    public final boolean getIsParkingSpotSet() {
        return this.isParkingSpotSet;
    }

    /* renamed from: o, reason: from getter */
    public final boolean getIsSubstitutionReviewScreen() {
        return this.isSubstitutionReviewScreen;
    }

    /* renamed from: p, reason: from getter */
    public final Boolean getIsSubstitutionsSubmissionsSuccessful() {
        return this.isSubstitutionsSubmissionsSuccessful;
    }

    public String toString() {
        return "FlyBuyState(flyBuyOrder=" + this.flyBuyOrder + ", currentOrderDetails=" + this.currentOrderDetails + ", substitutionItems=" + this.substitutionItems + ", isSubstitutionReviewScreen=" + this.isSubstitutionReviewScreen + ", isSubstitutionsSubmissionsSuccessful=" + this.isSubstitutionsSubmissionsSuccessful + ", isOrderDetailSubstitutionTrackStateEnabled=" + this.isOrderDetailSubstitutionTrackStateEnabled + ", isCheckInSubstitutionsTrackStateEnabled=" + this.isCheckInSubstitutionsTrackStateEnabled + ", isCheckInConfirmParkingSpotTrackStateEnable=" + this.isCheckInConfirmParkingSpotTrackStateEnable + ", restoreVehicleInfoState=" + this.restoreVehicleInfoState + ", isParkingSpotSet=" + this.isParkingSpotSet + ", isBopasTimeSlot=" + this.isBopasTimeSlot + ", parkingSpot=" + this.parkingSpot + ", pickupName=" + this.pickupName + ", storeInfo=" + this.storeInfo + ')';
    }

    public /* synthetic */ FlyBuyState(FlyBuyOrderDetail flyBuyOrderDetail, OrderDetail orderDetail, List list, boolean z10, Boolean bool, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, String str, String str2, StoreInfo storeInfo, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : flyBuyOrderDetail, (i10 & 2) != 0 ? null : orderDetail, (i10 & 4) != 0 ? CollectionsKt.m() : list, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : bool, (i10 & 32) != 0 ? false : z11, (i10 & 64) != 0 ? false : z12, (i10 & 128) != 0 ? false : z13, (i10 & 256) != 0 ? false : z14, (i10 & 512) != 0 ? true : z15, (i10 & 1024) == 0 ? z16 : false, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : str, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str2, (i10 & 8192) != 0 ? null : storeInfo);
    }
}
