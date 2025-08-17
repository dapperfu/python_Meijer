package Qn;

import Gl.FlyBuyOrderDetail;
import Td.AbstractC5232j;
import Td.InterfaceC5227e;
import ak.AbstractC5607a;
import android.annotation.SuppressLint;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.m;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.S;
import com.meijer.mobile.storeinfo.api.model.StoreInfo;
import com.radiusnetworks.flybuy.sdk.ConfigOptions;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.customer.CustomerInfo;
import com.radiusnetworks.flybuy.sdk.data.customer.CustomerState;
import com.radiusnetworks.flybuy.sdk.data.order.OrderEventInfo;
import com.radiusnetworks.flybuy.sdk.data.order.OrderEventType;
import com.radiusnetworks.flybuy.sdk.data.push.FlybuyPushData;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Order;
import com.radiusnetworks.flybuy.sdk.manager.CustomerManager;
import com.radiusnetworks.flybuy.sdk.manager.builder.OrderOptions;
import com.radiusnetworks.flybuy.sdk.pickup.PickupManager;
import com.radiusnetworks.flybuy.sdk.util.SingletonHolder;
import fj.PickupPerson;
import fj.PickupSlotInfo;
import gj.OrderDetail;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import vo.OrderSubstitutionItem;

@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u0089\u00012\u00020\u0001:\u0002mkB?\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0013\u0010\u0012J5\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00100\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00100\u0017H\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\f2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00100\u0017H\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010%J\u0019\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J#\u0010-\u001a\u00020\u00182\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0+H\u0002¢\u0006\u0004\b-\u0010.J#\u0010/\u001a\u00020\u00182\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0+H\u0002¢\u0006\u0004\b/\u0010.J!\u00103\u001a\u00020\u00102\u0006\u0010'\u001a\u0002002\b\u00102\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0010H\u0007¢\u0006\u0004\b5\u0010\u0012J7\u0010:\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u0001062\b\u00109\u001a\u0004\u0018\u0001082\u0014\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00100\u0017¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0010¢\u0006\u0004\b<\u0010\u0012J=\u0010>\u001a\u00020\u00102\u0006\u0010=\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00100\u0017H\u0007¢\u0006\u0004\b>\u0010?JC\u0010A\u001a\u00020\u00102\u0006\u0010=\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010@\u001a\u00020\f2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00100\u0017¢\u0006\u0004\bA\u0010BJ3\u0010C\u001a\u00020\u00102\u0006\u0010=\u001a\u00020\f2\u0006\u0010@\u001a\u00020\f2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00100\u0017H\u0007¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0010H\u0007¢\u0006\u0004\bE\u0010\u0012J\u0015\u0010G\u001a\u00020\u00102\u0006\u0010F\u001a\u00020\u0018¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\u00020\u00102\u0006\u0010I\u001a\u00020\u0018¢\u0006\u0004\bJ\u0010HJ\u0015\u0010L\u001a\u00020\u00102\u0006\u0010K\u001a\u00020\u0018¢\u0006\u0004\bL\u0010HJ\u0015\u0010N\u001a\u00020\u00102\u0006\u0010M\u001a\u00020\u0018¢\u0006\u0004\bN\u0010HJ\u0015\u0010P\u001a\u00020\u00102\u0006\u0010O\u001a\u00020\u0018¢\u0006\u0004\bP\u0010HJ!\u0010R\u001a\u00020\u00102\b\u0010@\u001a\u0004\u0018\u00010\f2\b\u0010Q\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bR\u0010SJ\u001b\u0010W\u001a\u00020\u00102\f\u0010V\u001a\b\u0012\u0004\u0012\u00020U0T¢\u0006\u0004\bW\u0010XJ\u0017\u0010[\u001a\u00020\u00102\b\u0010Z\u001a\u0004\u0018\u00010Y¢\u0006\u0004\b[\u0010\\J+\u0010_\u001a\u00020\u00102\u0006\u0010]\u001a\u00020\u00182\u0006\u0010^\u001a\u00020\u00182\f\u0010V\u001a\b\u0012\u0004\u0012\u00020U0T¢\u0006\u0004\b_\u0010`J\u0015\u0010a\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&¢\u0006\u0004\ba\u0010bJ!\u0010c\u001a\u00020\u00182\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0+¢\u0006\u0004\bc\u0010.J\u0015\u0010e\u001a\u00020\u00102\u0006\u0010d\u001a\u00020\f¢\u0006\u0004\be\u0010fJ\u0017\u0010i\u001a\u00020\f2\b\u0010h\u001a\u0004\u0018\u00010g¢\u0006\u0004\bi\u0010jR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020x0w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u001f\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020x0|8\u0006¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001e\u0010\u0085\u0001\u001a\u00030\u0082\u0001*\u0004\u0018\u00010\u00158BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001b\u0010\u0088\u0001\u001a\u00020\u0018*\u0002068BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u008a\u0001"}, d2 = {"LQn/I;", "", "Landroid/content/Context;", "application", "Lcom/google/firebase/messaging/FirebaseMessaging;", "firebaseMessaging", "Landroid/app/NotificationManager;", "notificationManager", "Lyo/k;", "userManager", "LCl/e;", "meijerIntent", "", "sdkAppKey", "<init>", "(Landroid/content/Context;Lcom/google/firebase/messaging/FirebaseMessaging;Landroid/app/NotificationManager;Lyo/k;LCl/e;Ljava/lang/String;)V", "", "e0", "()V", "F", "redemptionCode", "Lfj/b;", "pickupPerson", "Lkotlin/Function1;", "", "onSuccess", "B", "(Ljava/lang/String;Lfj/b;Lkotlin/jvm/functions/Function1;)V", "Lcom/radiusnetworks/flybuy/sdk/data/order/OrderEventInfo;", "orderEventInfo", "x0", "(Lcom/radiusnetworks/flybuy/sdk/data/order/OrderEventInfo;Lkotlin/jvm/functions/Function1;)V", "partnerId", "H", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;", "G", "(Ljava/lang/String;)Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;", "Lcom/google/firebase/messaging/S;", "remoteMessage", "Landroid/content/Intent;", "T", "(Lcom/google/firebase/messaging/S;)Landroid/content/Intent;", "", "data", "g0", "(Ljava/util/Map;)Z", "Q", "Lcom/google/firebase/messaging/S$b;", "Landroid/app/Notification;", "notification", "U", "(Lcom/google/firebase/messaging/S$b;Landroid/app/Notification;)V", "E", "Lgj/c;", "currentOrderDetails", "LGl/b;", "flyBuyOrder", "N", "(Lgj/c;LGl/b;Lkotlin/jvm/functions/Function1;)V", "D", "flyBuyOrderId", "x", "(Ljava/lang/String;Ljava/lang/String;Lfj/b;Lkotlin/jvm/functions/Function1;)V", "parkingSpot", "h0", "(Ljava/lang/String;Ljava/lang/String;Lfj/b;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "l0", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "o0", "isParkingSpotSet", "v0", "(Z)V", "isCheckInSubstitutionsTrackStateEnabled", "r0", "isOrderDetailSubstitutionTrackStateEnabled", "t0", "isCheckInConfirmParkingSpotTrackStateEnable", "p0", "restoreVehicleInfoState", "z0", "pickupName", "X", "(Ljava/lang/String;Ljava/lang/String;)V", "", "Lvo/a;", "substitutionItems", "c0", "(Ljava/util/List;)V", "Lcom/meijer/mobile/storeinfo/api/model/StoreInfo;", "storeInfo", "a0", "(Lcom/meijer/mobile/storeinfo/api/model/StoreInfo;)V", "isSubstitutionsSubmissionsSuccessful", "isOnMyWayClicked", "V", "(ZZLjava/util/List;)V", "M", "(Lcom/google/firebase/messaging/S;)Z", "R", "token", "Z", "(Ljava/lang/String;)V", "Lak/a;", "formattedVehicleString", "L", "(Lak/a;)Ljava/lang/String;", "a", "Landroid/content/Context;", "b", "Lcom/google/firebase/messaging/FirebaseMessaging;", "c", "Landroid/app/NotificationManager;", "d", "Lyo/k;", "e", "LCl/e;", "f", "Ljava/lang/String;", "LDk/n;", "LQn/K;", "g", "LDk/n;", "flyBuyStore", "Lio/reactivex/l;", "h", "Lio/reactivex/l;", "J", "()Lio/reactivex/l;", "flyBuyState", "Lcom/radiusnetworks/flybuy/sdk/manager/builder/OrderOptions;", "K", "(Lfj/b;)Lcom/radiusnetworks/flybuy/sdk/manager/builder/OrderOptions;", "orderOptions", "S", "(Lgj/c;)Z", "isPickUpReady", "i", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class I {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f30907j = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context application;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final FirebaseMessaging firebaseMessaging;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final NotificationManager notificationManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Cl.e meijerIntent;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String sdkAppKey;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Dk.n<FlyBuyState> flyBuyStore;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final io.reactivex.l<FlyBuyState> flyBuyState;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LQn/I$a;", "", "<init>", "()V", "LQn/K;", "fluBuyState", "", "c", "(LQn/K;)Ljava/lang/String;", "LGl/b$c;", "flyBuyOrder", "b", "(LGl/b$c;)Ljava/lang/String;", "Lgj/c;", "currentOrderDetails", "a", "(Lgj/c;)Ljava/lang/String;", "", "FLYBUY_NOTIFICATION_ID", "I", "ARRIVED_FLAG", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Qn.I$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String b(FlyBuyOrderDetail.FlyBuyOrder flyBuyOrder) {
            if (flyBuyOrder != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("FlyBuy OrderId: ");
                sb2.append(flyBuyOrder.getOrderId());
                sb2.append(", PartnerId: ");
                String partnerIdentifier = flyBuyOrder.getPartnerIdentifier();
                if (partnerIdentifier == null) {
                    partnerIdentifier = "";
                }
                sb2.append(partnerIdentifier);
                sb2.append(", Redemption Code: ");
                String redemptionCode = flyBuyOrder.getRedemptionCode();
                if (redemptionCode == null) {
                    redemptionCode = "";
                }
                sb2.append(redemptionCode);
                sb2.append(", StoreId: ");
                sb2.append(flyBuyOrder.getSiteId());
                sb2.append(", OrderState: ");
                FlyBuyOrderDetail.Companion.EnumC0175b orderState = flyBuyOrder.getOrderState();
                String strName = orderState != null ? orderState.name() : null;
                if (strName == null) {
                    strName = "";
                }
                sb2.append(strName);
                sb2.append(", CustomerState: ");
                FlyBuyOrderDetail.Companion.EnumC0174a customerState = flyBuyOrder.getCustomerState();
                strName = customerState != null ? customerState.name() : null;
                if (strName == null) {
                    strName = "";
                }
                sb2.append(strName);
                sb2.append(", CustomerName: ");
                String customerName = flyBuyOrder.getCustomerName();
                if (customerName == null) {
                    customerName = "";
                }
                sb2.append(customerName);
                sb2.append(", VehicleInfo: ");
                String customerCarColor = flyBuyOrder.getCustomerCarColor();
                if (customerCarColor == null) {
                    customerCarColor = "";
                }
                sb2.append(customerCarColor);
                sb2.append(", ");
                String customerCarType = flyBuyOrder.getCustomerCarType();
                if (customerCarType == null) {
                    customerCarType = "";
                }
                sb2.append(customerCarType);
                strName = sb2.toString();
            }
            return strName == null ? "" : strName;
        }

        private Companion() {
        }

        public final String a(OrderDetail currentOrderDetails) {
            String str;
            if (currentOrderDetails != null) {
                str = "Current OrderDetail: OrderId: " + currentOrderDetails.getCode();
            } else {
                str = null;
            }
            return str == null ? "" : str;
        }

        public final String c(FlyBuyState fluBuyState) {
            FlyBuyOrderDetail flyBuyOrder;
            List<FlyBuyOrderDetail.FlyBuyOrder> listA;
            return b((fluBuyState == null || (flyBuyOrder = fluBuyState.getFlyBuyOrder()) == null || (listA = flyBuyOrder.a()) == null) ? null : (FlyBuyOrderDetail.FlyBuyOrder) CollectionsKt.u0(listA));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LQn/I$b;", "LDk/b;", "LQn/K;", "flyBuyState", "<init>", "(LQn/K;)V", "oldState", "d", "(LQn/K;)LQn/K;", "b", "LQn/K;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends Dk.b<FlyBuyState> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final FlyBuyState flyBuyState;

        public /* synthetic */ b(FlyBuyState flyBuyState, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new FlyBuyState(null, null, null, false, null, false, false, false, false, false, false, null, null, null, 16383, null) : flyBuyState);
        }

        @Override // Dk.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public FlyBuyState b(FlyBuyState oldState) {
            Intrinsics.j(oldState, "oldState");
            return this.flyBuyState;
        }

        public b(FlyBuyState flyBuyState) {
            Intrinsics.j(flyBuyState, "flyBuyState");
            this.flyBuyState = flyBuyState;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(I i10, Function1 function1, Order order, SdkError sdkError) {
        if (sdkError != null) {
            J.b(sdkError, i10.flyBuyStore.p(), null, 4, null);
        } else {
            uw.a.INSTANCE.k("FlyBuy order claimed successfully: " + INSTANCE.c(i10.flyBuyStore.p()), new Object[0]);
        }
        function1.invoke(Boolean.valueOf(sdkError == null));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y0(I i10, Function1 function1, Order order, SdkError sdkError) {
        if (sdkError != null) {
            J.b(sdkError, i10.flyBuyStore.p(), null, 4, null);
        } else {
            uw.a.INSTANCE.k("FlyBuy order state updated successfully: " + INSTANCE.c(i10.flyBuyStore.p()), new Object[0]);
        }
        function1.invoke(Boolean.valueOf(sdkError == null));
        return Unit.f142422a;
    }

    public I(Context application, FirebaseMessaging firebaseMessaging, NotificationManager notificationManager, yo.k userManager, Cl.e meijerIntent, String sdkAppKey) {
        Intrinsics.j(application, "application");
        Intrinsics.j(firebaseMessaging, "firebaseMessaging");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(meijerIntent, "meijerIntent");
        Intrinsics.j(sdkAppKey, "sdkAppKey");
        this.application = application;
        this.firebaseMessaging = firebaseMessaging;
        this.notificationManager = notificationManager;
        this.userManager = userManager;
        this.meijerIntent = meijerIntent;
        this.sdkAppKey = sdkAppKey;
        Dk.n<FlyBuyState> nVar = new Dk.n<>(new FlyBuyState(null, null, null, false, null, false, false, false, false, false, false, null, null, null, 16383, null));
        this.flyBuyStore = nVar;
        this.flyBuyState = nVar.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FlyBuyState A0(boolean z10, FlyBuyState it) {
        Intrinsics.j(it, "it");
        return it.a((16127 & 1) != 0 ? it.flyBuyOrder : null, (16127 & 2) != 0 ? it.currentOrderDetails : null, (16127 & 4) != 0 ? it.substitutionItems : null, (16127 & 8) != 0 ? it.isSubstitutionReviewScreen : false, (16127 & 16) != 0 ? it.isSubstitutionsSubmissionsSuccessful : null, (16127 & 32) != 0 ? it.isOrderDetailSubstitutionTrackStateEnabled : false, (16127 & 64) != 0 ? it.isCheckInSubstitutionsTrackStateEnabled : false, (16127 & 128) != 0 ? it.isCheckInConfirmParkingSpotTrackStateEnable : false, (16127 & 256) != 0 ? it.restoreVehicleInfoState : z10, (16127 & 512) != 0 ? it.isParkingSpotSet : false, (16127 & 1024) != 0 ? it.isBopasTimeSlot : false, (16127 & RecyclerView.m.FLAG_MOVED) != 0 ? it.parkingSpot : null, (16127 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? it.pickupName : null, (16127 & 8192) != 0 ? it.storeInfo : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit I(kotlin.jvm.functions.Function1 r2, Qn.I r3, java.lang.String r4, java.util.List r5, com.radiusnetworks.flybuy.sdk.data.common.SdkError r6) {
        /*
            if (r6 == 0) goto Lf
            Dk.n<Qn.K> r3 = r3.flyBuyStore
            java.lang.Object r3 = r3.p()
            Qn.K r3 = (Qn.FlyBuyState) r3
            r0 = 4
            r1 = 0
            Qn.J.b(r6, r3, r1, r0, r1)
        Lf:
            if (r6 != 0) goto L3f
            if (r5 == 0) goto L3f
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r3 = r5 instanceof java.util.Collection
            if (r3 == 0) goto L23
            r3 = r5
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L23
            goto L3f
        L23:
            java.util.Iterator r3 = r5.iterator()
        L27:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L3f
            java.lang.Object r5 = r3.next()
            com.radiusnetworks.flybuy.sdk.data.room.domain.Order r5 = (com.radiusnetworks.flybuy.sdk.data.room.domain.Order) r5
            java.lang.String r5 = r5.getPartnerIdentifier()
            boolean r5 = kotlin.jvm.internal.Intrinsics.e(r5, r4)
            if (r5 == 0) goto L27
            r3 = 1
            goto L40
        L3f:
            r3 = 0
        L40:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.invoke(r3)
            kotlin.Unit r2 = kotlin.Unit.f142422a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Qn.I.I(kotlin.jvm.functions.Function1, Qn.I, java.lang.String, java.util.List, com.radiusnetworks.flybuy.sdk.data.common.SdkError):kotlin.Unit");
    }

    private final OrderOptions K(PickupPerson pickupPerson) {
        if (pickupPerson != null) {
            OrderOptions orderOptionsBuild = new OrderOptions.Builder(pickupPerson.getFirstName() + ' ' + pickupPerson.getLastName()).setCustomerPhone(pickupPerson.getPhoneNumber()).build();
            if (orderOptionsBuild != null) {
                return orderOptionsBuild;
            }
        }
        return new OrderOptions.Builder("Guest").build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FlyBuyState O(FlyBuyOrderDetail.FlyBuyOrder flyBuyOrder, OrderDetail orderDetail, FlyBuyOrderDetail flyBuyOrderDetail, FlyBuyState it) {
        PickupSlotInfo pickUpSlotInfo;
        Intrinsics.j(it, "it");
        return it.a((16127 & 1) != 0 ? it.flyBuyOrder : flyBuyOrderDetail, (16127 & 2) != 0 ? it.currentOrderDetails : orderDetail, (16127 & 4) != 0 ? it.substitutionItems : null, (16127 & 8) != 0 ? it.isSubstitutionReviewScreen : false, (16127 & 16) != 0 ? it.isSubstitutionsSubmissionsSuccessful : null, (16127 & 32) != 0 ? it.isOrderDetailSubstitutionTrackStateEnabled : false, (16127 & 64) != 0 ? it.isCheckInSubstitutionsTrackStateEnabled : false, (16127 & 128) != 0 ? it.isCheckInConfirmParkingSpotTrackStateEnable : false, (16127 & 256) != 0 ? it.restoreVehicleInfoState : false, (16127 & 512) != 0 ? it.isParkingSpotSet : false, (16127 & 1024) != 0 ? it.isBopasTimeSlot : (orderDetail == null || (pickUpSlotInfo = orderDetail.getPickUpSlotInfo()) == null || !pickUpSlotInfo.f()) ? false : true, (16127 & RecyclerView.m.FLAG_MOVED) != 0 ? it.parkingSpot : flyBuyOrder != null ? flyBuyOrder.getSpotIdentifier() : null, (16127 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? it.pickupName : null, (16127 & 8192) != 0 ? it.storeInfo : null);
    }

    private final boolean Q(Map<String, String> data) {
        return Intrinsics.e(data.get("flybuy_message_type"), FlybuyPushData.MESSAGE_TYPE_BACKGROUND_SYNC);
    }

    private final boolean S(OrderDetail orderDetail) {
        return es.K.f129818a.f(orderDetail);
    }

    private final void U(S.b remoteMessage, Notification notification) {
        NotificationManager notificationManager;
        if (notification == null || (notificationManager = this.notificationManager) == null) {
            return;
        }
        notificationManager.notify(remoteMessage.c(), 8775, notification);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FlyBuyState W(boolean z10, List list, boolean z11, FlyBuyState it) {
        Intrinsics.j(it, "it");
        return it.a((16127 & 1) != 0 ? it.flyBuyOrder : null, (16127 & 2) != 0 ? it.currentOrderDetails : null, (16127 & 4) != 0 ? it.substitutionItems : list, (16127 & 8) != 0 ? it.isSubstitutionReviewScreen : false, (16127 & 16) != 0 ? it.isSubstitutionsSubmissionsSuccessful : Boolean.valueOf(z11), (16127 & 32) != 0 ? it.isOrderDetailSubstitutionTrackStateEnabled : !z10, (16127 & 64) != 0 ? it.isCheckInSubstitutionsTrackStateEnabled : z10, (16127 & 128) != 0 ? it.isCheckInConfirmParkingSpotTrackStateEnable : false, (16127 & 256) != 0 ? it.restoreVehicleInfoState : false, (16127 & 512) != 0 ? it.isParkingSpotSet : false, (16127 & 1024) != 0 ? it.isBopasTimeSlot : false, (16127 & RecyclerView.m.FLAG_MOVED) != 0 ? it.parkingSpot : null, (16127 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? it.pickupName : null, (16127 & 8192) != 0 ? it.storeInfo : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FlyBuyState Y(String str, String str2, FlyBuyState it) {
        Intrinsics.j(it, "it");
        return it.a((16127 & 1) != 0 ? it.flyBuyOrder : null, (16127 & 2) != 0 ? it.currentOrderDetails : null, (16127 & 4) != 0 ? it.substitutionItems : null, (16127 & 8) != 0 ? it.isSubstitutionReviewScreen : false, (16127 & 16) != 0 ? it.isSubstitutionsSubmissionsSuccessful : null, (16127 & 32) != 0 ? it.isOrderDetailSubstitutionTrackStateEnabled : false, (16127 & 64) != 0 ? it.isCheckInSubstitutionsTrackStateEnabled : false, (16127 & 128) != 0 ? it.isCheckInConfirmParkingSpotTrackStateEnable : false, (16127 & 256) != 0 ? it.restoreVehicleInfoState : false, (16127 & 512) != 0 ? it.isParkingSpotSet : false, (16127 & 1024) != 0 ? it.isBopasTimeSlot : false, (16127 & RecyclerView.m.FLAG_MOVED) != 0 ? it.parkingSpot : str, (16127 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? it.pickupName : str2, (16127 & 8192) != 0 ? it.storeInfo : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FlyBuyState b0(StoreInfo storeInfo, FlyBuyState it) {
        Intrinsics.j(it, "it");
        return it.a((16127 & 1) != 0 ? it.flyBuyOrder : null, (16127 & 2) != 0 ? it.currentOrderDetails : null, (16127 & 4) != 0 ? it.substitutionItems : null, (16127 & 8) != 0 ? it.isSubstitutionReviewScreen : false, (16127 & 16) != 0 ? it.isSubstitutionsSubmissionsSuccessful : null, (16127 & 32) != 0 ? it.isOrderDetailSubstitutionTrackStateEnabled : false, (16127 & 64) != 0 ? it.isCheckInSubstitutionsTrackStateEnabled : false, (16127 & 128) != 0 ? it.isCheckInConfirmParkingSpotTrackStateEnable : false, (16127 & 256) != 0 ? it.restoreVehicleInfoState : false, (16127 & 512) != 0 ? it.isParkingSpotSet : false, (16127 & 1024) != 0 ? it.isBopasTimeSlot : false, (16127 & RecyclerView.m.FLAG_MOVED) != 0 ? it.parkingSpot : null, (16127 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? it.pickupName : null, (16127 & 8192) != 0 ? it.storeInfo : storeInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FlyBuyState d0(List list, FlyBuyState it) {
        Intrinsics.j(it, "it");
        return it.a((16127 & 1) != 0 ? it.flyBuyOrder : null, (16127 & 2) != 0 ? it.currentOrderDetails : null, (16127 & 4) != 0 ? it.substitutionItems : list, (16127 & 8) != 0 ? it.isSubstitutionReviewScreen : false, (16127 & 16) != 0 ? it.isSubstitutionsSubmissionsSuccessful : null, (16127 & 32) != 0 ? it.isOrderDetailSubstitutionTrackStateEnabled : false, (16127 & 64) != 0 ? it.isCheckInSubstitutionsTrackStateEnabled : false, (16127 & 128) != 0 ? it.isCheckInConfirmParkingSpotTrackStateEnable : false, (16127 & 256) != 0 ? it.restoreVehicleInfoState : false, (16127 & 512) != 0 ? it.isParkingSpotSet : false, (16127 & 1024) != 0 ? it.isBopasTimeSlot : false, (16127 & RecyclerView.m.FLAG_MOVED) != 0 ? it.parkingSpot : null, (16127 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? it.pickupName : null, (16127 & 8192) != 0 ? it.storeInfo : null);
    }

    private final void e0() {
        this.firebaseMessaging.q().c(new InterfaceC5227e() { // from class: Qn.w
            @Override // Td.InterfaceC5227e
            public final void onComplete(AbstractC5232j abstractC5232j) throws Exception {
                I.f0(abstractC5232j);
            }
        });
        if (!Jk.b.a(26) || this.notificationManager == null) {
            return;
        }
        F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(AbstractC5232j task) throws Exception {
        String str;
        Intrinsics.j(task, "task");
        if (task.r() && (str = (String) task.n()) != null) {
            FlyBuyCore.onNewPushToken(str);
        }
    }

    private final boolean g0(Map<String, String> data) {
        return Intrinsics.e(data.get("customer_state"), CustomerState.ARRIVED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i0(I i10, String str, String str2, final Function1 function1, boolean z10) throws Exception {
        if (z10) {
            i10.l0(str, str2, new Function1() { // from class: Qn.y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return I.j0(function1, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            function1.invoke(Boolean.FALSE);
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m0(I i10, String str, final Function1 function1, Order order, SdkError sdkError) throws Exception {
        if (sdkError == null) {
            uw.a.INSTANCE.k("FlyBuy: customer state updated successfully: " + INSTANCE.c(i10.flyBuyStore.p()), new Object[0]);
            i10.x0(new OrderEventInfo(Integer.parseInt(str), OrderEventType.STATE_CHANGE, null, null, null, null, null, CustomerState.WAITING, null, null, null, null, null, null, null, null, null, null, 262012, null), new Function1() { // from class: Qn.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return I.n0(function1, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            J.b(sdkError, i10.flyBuyStore.p(), null, 4, null);
            function1.invoke(Boolean.FALSE);
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FlyBuyState q0(boolean z10, FlyBuyState it) {
        Intrinsics.j(it, "it");
        return it.a((16127 & 1) != 0 ? it.flyBuyOrder : null, (16127 & 2) != 0 ? it.currentOrderDetails : null, (16127 & 4) != 0 ? it.substitutionItems : null, (16127 & 8) != 0 ? it.isSubstitutionReviewScreen : false, (16127 & 16) != 0 ? it.isSubstitutionsSubmissionsSuccessful : null, (16127 & 32) != 0 ? it.isOrderDetailSubstitutionTrackStateEnabled : false, (16127 & 64) != 0 ? it.isCheckInSubstitutionsTrackStateEnabled : false, (16127 & 128) != 0 ? it.isCheckInConfirmParkingSpotTrackStateEnable : z10, (16127 & 256) != 0 ? it.restoreVehicleInfoState : false, (16127 & 512) != 0 ? it.isParkingSpotSet : false, (16127 & 1024) != 0 ? it.isBopasTimeSlot : false, (16127 & RecyclerView.m.FLAG_MOVED) != 0 ? it.parkingSpot : null, (16127 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? it.pickupName : null, (16127 & 8192) != 0 ? it.storeInfo : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FlyBuyState s0(boolean z10, FlyBuyState it) {
        Intrinsics.j(it, "it");
        return it.a((16127 & 1) != 0 ? it.flyBuyOrder : null, (16127 & 2) != 0 ? it.currentOrderDetails : null, (16127 & 4) != 0 ? it.substitutionItems : null, (16127 & 8) != 0 ? it.isSubstitutionReviewScreen : false, (16127 & 16) != 0 ? it.isSubstitutionsSubmissionsSuccessful : !z10 ? null : it.getIsSubstitutionsSubmissionsSuccessful(), (16127 & 32) != 0 ? it.isOrderDetailSubstitutionTrackStateEnabled : false, (16127 & 64) != 0 ? it.isCheckInSubstitutionsTrackStateEnabled : z10, (16127 & 128) != 0 ? it.isCheckInConfirmParkingSpotTrackStateEnable : false, (16127 & 256) != 0 ? it.restoreVehicleInfoState : false, (16127 & 512) != 0 ? it.isParkingSpotSet : false, (16127 & 1024) != 0 ? it.isBopasTimeSlot : false, (16127 & RecyclerView.m.FLAG_MOVED) != 0 ? it.parkingSpot : null, (16127 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? it.pickupName : null, (16127 & 8192) != 0 ? it.storeInfo : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FlyBuyState u0(boolean z10, FlyBuyState it) {
        Intrinsics.j(it, "it");
        return it.a((16127 & 1) != 0 ? it.flyBuyOrder : null, (16127 & 2) != 0 ? it.currentOrderDetails : null, (16127 & 4) != 0 ? it.substitutionItems : null, (16127 & 8) != 0 ? it.isSubstitutionReviewScreen : false, (16127 & 16) != 0 ? it.isSubstitutionsSubmissionsSuccessful : !z10 ? null : it.getIsSubstitutionsSubmissionsSuccessful(), (16127 & 32) != 0 ? it.isOrderDetailSubstitutionTrackStateEnabled : z10, (16127 & 64) != 0 ? it.isCheckInSubstitutionsTrackStateEnabled : false, (16127 & 128) != 0 ? it.isCheckInConfirmParkingSpotTrackStateEnable : false, (16127 & 256) != 0 ? it.restoreVehicleInfoState : false, (16127 & 512) != 0 ? it.isParkingSpotSet : false, (16127 & 1024) != 0 ? it.isBopasTimeSlot : false, (16127 & RecyclerView.m.FLAG_MOVED) != 0 ? it.parkingSpot : null, (16127 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? it.pickupName : null, (16127 & 8192) != 0 ? it.storeInfo : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FlyBuyState w0(boolean z10, FlyBuyState it) {
        Intrinsics.j(it, "it");
        return it.a((16127 & 1) != 0 ? it.flyBuyOrder : null, (16127 & 2) != 0 ? it.currentOrderDetails : null, (16127 & 4) != 0 ? it.substitutionItems : null, (16127 & 8) != 0 ? it.isSubstitutionReviewScreen : false, (16127 & 16) != 0 ? it.isSubstitutionsSubmissionsSuccessful : null, (16127 & 32) != 0 ? it.isOrderDetailSubstitutionTrackStateEnabled : false, (16127 & 64) != 0 ? it.isCheckInSubstitutionsTrackStateEnabled : false, (16127 & 128) != 0 ? it.isCheckInConfirmParkingSpotTrackStateEnable : false, (16127 & 256) != 0 ? it.restoreVehicleInfoState : false, (16127 & 512) != 0 ? it.isParkingSpotSet : z10, (16127 & 1024) != 0 ? it.isBopasTimeSlot : false, (16127 & RecyclerView.m.FLAG_MOVED) != 0 ? it.parkingSpot : null, (16127 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? it.pickupName : null, (16127 & 8192) != 0 ? it.storeInfo : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(I i10, OrderEventInfo orderEventInfo, final Function1 function1, boolean z10) throws Exception {
        if (z10) {
            i10.x0(orderEventInfo, new Function1() { // from class: Qn.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return I.A(function1, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            function1.invoke(Boolean.FALSE);
        }
        return Unit.f142422a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D() {
        this.flyBuyStore.b(new b(null, 1, 0 == true ? 1 : 0));
    }

    @SuppressLint({"RestrictedApi"})
    public final void E() throws Exception {
        Context context = this.application;
        Intrinsics.h(context, "null cannot be cast to non-null type android.app.Application");
        FlyBuyCore.configure((Application) context, new ConfigOptions.Builder(this.sdkAppKey).build());
        ((PickupManager) SingletonHolder.getInstance$default(PickupManager.INSTANCE, null, 1, null)).configure(this.application);
        e0();
        if (FlyBuyCore.getCustomer().getCurrent() == null) {
            CustomerManager.create$default(FlyBuyCore.getCustomer(), new CustomerInfo("Guest", null, null, null, null, 30, null), true, true, null, null, null, 56, null);
        }
    }

    public final io.reactivex.l<FlyBuyState> J() {
        return this.flyBuyState;
    }

    public final String L(AbstractC5607a formattedVehicleString) {
        String strB = formattedVehicleString != null ? formattedVehicleString.b(this.application) : null;
        return strB == null ? "" : strB;
    }

    public final boolean M(com.google.firebase.messaging.S remoteMessage) throws Exception {
        Intrinsics.j(remoteMessage, "remoteMessage");
        if (this.userManager.G()) {
            Map<String, String> mapB = remoteMessage.B();
            Intrinsics.i(mapB, "getData(...)");
            if (!Q(mapB)) {
                Map<String, String> mapB2 = remoteMessage.B();
                Intrinsics.i(mapB2, "getData(...)");
                if (R(mapB2)) {
                    Map<String, String> mapB3 = remoteMessage.B();
                    Intrinsics.i(mapB3, "getData(...)");
                    boolean zG0 = g0(mapB3);
                    if (zG0) {
                        S.b bVarT = remoteMessage.T();
                        if (bVarT != null) {
                            PendingIntent activity = PendingIntent.getActivity(this.application, 0, T(remoteMessage), 201326592);
                            Context context = this.application;
                            m.e eVarH = new m.e(context, context.getString(Hl.h.f12781b)).y(com.radiusnetworks.flybuy.sdk.pickup.e.f119993a).h(Z1.b.c(this.application, com.radiusnetworks.flybuy.sdk.pickup.d.f119987a));
                            String strD = bVarT.d();
                            if (strD == null) {
                                strD = this.application.getString(Hl.h.f12787e);
                                Intrinsics.i(strD, "getString(...)");
                            }
                            m.e eVarK = eVarH.k(strD);
                            String strA = bVarT.a();
                            if (strA == null) {
                                strA = this.application.getString(Hl.h.f12785d);
                                Intrinsics.i(strA, "getString(...)");
                            }
                            Notification notificationC = eVarK.j(strA).A(new m.c().h(bVarT.a()).i(bVarT.d())).i(activity).f(true).v(0).F(System.currentTimeMillis()).c();
                            Intrinsics.i(notificationC, "build(...)");
                            U(bVarT, notificationC);
                        }
                        Map<String, String> mapB4 = remoteMessage.B();
                        Intrinsics.i(mapB4, "getData(...)");
                        FlyBuyCore.onMessageReceived(mapB4, null);
                    }
                    return zG0;
                }
            }
        }
        return false;
    }

    public final void N(final OrderDetail currentOrderDetails, final FlyBuyOrderDetail flyBuyOrder, final Function1<? super Boolean, Unit> onSuccess) throws Exception {
        List<FlyBuyOrderDetail.FlyBuyOrder> listA;
        Intrinsics.j(onSuccess, "onSuccess");
        final FlyBuyOrderDetail.FlyBuyOrder flyBuyOrder2 = (flyBuyOrder == null || (listA = flyBuyOrder.a()) == null) ? null : (FlyBuyOrderDetail.FlyBuyOrder) CollectionsKt.u0(listA);
        this.flyBuyStore.a(new Function1() { // from class: Qn.B
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I.O(flyBuyOrder2, currentOrderDetails, flyBuyOrder, (FlyBuyState) obj);
            }
        });
        if (currentOrderDetails == null || !S(currentOrderDetails)) {
            uw.a.INSTANCE.k("FlyBuy: init: order is not a PickupReady Order: " + INSTANCE.a(currentOrderDetails), new Object[0]);
            onSuccess.invoke(Boolean.FALSE);
            return;
        }
        if ((flyBuyOrder2 != null ? flyBuyOrder2.getRedemptionCode() : null) != null) {
            if (flyBuyOrder2.getCustomerId() == null) {
                onSuccess.invoke(Boolean.TRUE);
                return;
            } else {
                H(currentOrderDetails.getCode(), new Function1() { // from class: Qn.C
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return I.P(onSuccess, ((Boolean) obj).booleanValue());
                    }
                });
                return;
            }
        }
        uw.a.INSTANCE.k("FlyBuy: init: redemption code is null: " + INSTANCE.b(flyBuyOrder2), new Object[0]);
        onSuccess.invoke(Boolean.FALSE);
    }

    public final boolean R(Map<String, String> data) {
        Intrinsics.j(data, "data");
        return Intrinsics.e(data.get("message_source"), FlybuyPushData.MESSAGE_SOURCE_FLYBUY);
    }

    public final void V(final boolean isSubstitutionsSubmissionsSuccessful, final boolean isOnMyWayClicked, final List<OrderSubstitutionItem> substitutionItems) {
        Intrinsics.j(substitutionItems, "substitutionItems");
        this.flyBuyStore.a(new Function1() { // from class: Qn.D
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I.W(isOnMyWayClicked, substitutionItems, isSubstitutionsSubmissionsSuccessful, (FlyBuyState) obj);
            }
        });
    }

    public final void X(final String parkingSpot, final String pickupName) {
        this.flyBuyStore.a(new Function1() { // from class: Qn.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I.Y(parkingSpot, pickupName, (FlyBuyState) obj);
            }
        });
    }

    public final void Z(String token) throws Exception {
        Intrinsics.j(token, "token");
        FlyBuyCore.onNewPushToken(token);
    }

    public final void a0(final StoreInfo storeInfo) {
        this.flyBuyStore.a(new Function1() { // from class: Qn.A
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I.b0(storeInfo, (FlyBuyState) obj);
            }
        });
    }

    public final void c0(final List<OrderSubstitutionItem> substitutionItems) {
        Intrinsics.j(substitutionItems, "substitutionItems");
        this.flyBuyStore.a(new Function1() { // from class: Qn.E
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I.d0(substitutionItems, (FlyBuyState) obj);
            }
        });
    }

    public final void h0(final String flyBuyOrderId, String redemptionCode, PickupPerson pickupPerson, final String parkingSpot, final Function1<? super Boolean, Unit> onSuccess) throws Exception {
        Intrinsics.j(flyBuyOrderId, "flyBuyOrderId");
        Intrinsics.j(redemptionCode, "redemptionCode");
        Intrinsics.j(parkingSpot, "parkingSpot");
        Intrinsics.j(onSuccess, "onSuccess");
        if (G(redemptionCode) != null) {
            l0(flyBuyOrderId, parkingSpot, new Function1() { // from class: Qn.u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return I.k0(onSuccess, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            B(redemptionCode, pickupPerson, new Function1() { // from class: Qn.v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return I.i0(this.f31008a, flyBuyOrderId, parkingSpot, onSuccess, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    @SuppressLint({"RestrictedApi"})
    public final void l0(final String flyBuyOrderId, String parkingSpot, final Function1<? super Boolean, Unit> onSuccess) throws Exception {
        Intrinsics.j(flyBuyOrderId, "flyBuyOrderId");
        Intrinsics.j(parkingSpot, "parkingSpot");
        Intrinsics.j(onSuccess, "onSuccess");
        FlyBuyCore.getOrders().updateCustomerState(Integer.parseInt(flyBuyOrderId), CustomerState.WAITING, parkingSpot, new Function2() { // from class: Qn.z
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return I.m0(this.f31015a, flyBuyOrderId, onSuccess, (Order) obj, (SdkError) obj2);
            }
        });
    }

    @SuppressLint({"RestrictedApi"})
    public final void o0() throws Exception {
        ((PickupManager) SingletonHolder.getInstance$default(PickupManager.INSTANCE, null, 1, null)).onPermissionChanged();
    }

    public final void p0(final boolean isCheckInConfirmParkingSpotTrackStateEnable) {
        this.flyBuyStore.a(new Function1() { // from class: Qn.H
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I.q0(isCheckInConfirmParkingSpotTrackStateEnable, (FlyBuyState) obj);
            }
        });
    }

    public final void r0(final boolean isCheckInSubstitutionsTrackStateEnabled) {
        this.flyBuyStore.a(new Function1() { // from class: Qn.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I.s0(isCheckInSubstitutionsTrackStateEnabled, (FlyBuyState) obj);
            }
        });
    }

    public final void t0(final boolean isOrderDetailSubstitutionTrackStateEnabled) {
        this.flyBuyStore.a(new Function1() { // from class: Qn.G
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I.u0(isOrderDetailSubstitutionTrackStateEnabled, (FlyBuyState) obj);
            }
        });
    }

    public final void v0(final boolean isParkingSpotSet) {
        this.flyBuyStore.a(new Function1() { // from class: Qn.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I.w0(isParkingSpotSet, (FlyBuyState) obj);
            }
        });
    }

    @SuppressLint({"RestrictedApi"})
    public final void x(String flyBuyOrderId, String redemptionCode, PickupPerson pickupPerson, final Function1<? super Boolean, Unit> onSuccess) throws Exception {
        Intrinsics.j(flyBuyOrderId, "flyBuyOrderId");
        Intrinsics.j(redemptionCode, "redemptionCode");
        Intrinsics.j(onSuccess, "onSuccess");
        final OrderEventInfo orderEventInfo = new OrderEventInfo(Integer.parseInt(flyBuyOrderId), OrderEventType.STATE_CHANGE, null, null, null, null, null, CustomerState.EN_ROUTE, null, null, null, null, null, null, null, null, null, null, 262012, null);
        if (G(redemptionCode) != null) {
            x0(orderEventInfo, new Function1() { // from class: Qn.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return I.y(onSuccess, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            B(redemptionCode, pickupPerson, new Function1() { // from class: Qn.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return I.z(this.f30997a, orderEventInfo, onSuccess, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    public final void z0(final boolean restoreVehicleInfoState) {
        this.flyBuyStore.a(new Function1() { // from class: Qn.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I.A0(restoreVehicleInfoState, (FlyBuyState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(Function1 function1, boolean z10) {
        function1.invoke(Boolean.valueOf(z10));
        return Unit.f142422a;
    }

    private final void B(String redemptionCode, PickupPerson pickupPerson, final Function1<? super Boolean, Unit> onSuccess) throws Exception {
        FlyBuyCore.getOrders().claim(redemptionCode, K(pickupPerson), new Function2() { // from class: Qn.t
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return I.C(this.f31005a, onSuccess, (Order) obj, (SdkError) obj2);
            }
        });
    }

    private final void F() {
        com.adobe.marketing.mobile.v.a();
        NotificationChannel notificationChannelA = com.adobe.marketing.mobile.u.a(this.application.getString(Hl.h.f12781b), this.application.getString(Hl.h.f12783c), 4);
        NotificationManager notificationManager = this.notificationManager;
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannelA);
        }
    }

    private final Order G(String redemptionCode) {
        Object next;
        Iterator<T> it = FlyBuyCore.getOrders().getOpen().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (Intrinsics.e(((Order) next).getRedemptionCode(), redemptionCode)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (Order) next;
    }

    private final void H(final String partnerId, final Function1<? super Boolean, Unit> onSuccess) throws Exception {
        FlyBuyCore.getOrders().fetch(new Function2() { // from class: Qn.F
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return I.I(onSuccess, this, partnerId, (List) obj, (SdkError) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(Function1 function1, boolean z10) {
        function1.invoke(Boolean.valueOf(z10));
        return Unit.f142422a;
    }

    private final Intent T(com.google.firebase.messaging.S remoteMessage) throws NumberFormatException {
        int i10;
        Object next;
        String partnerIdentifier;
        String str = remoteMessage.B().get("order_id");
        if (str != null) {
            i10 = Integer.parseInt(str);
        } else {
            i10 = 0;
        }
        Iterator<T> it = FlyBuyCore.getOrders().getOpen().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((Order) next).getId() == i10) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Order order = (Order) next;
        if (order != null) {
            partnerIdentifier = order.getPartnerIdentifier();
        } else {
            partnerIdentifier = null;
        }
        if (partnerIdentifier == null) {
            partnerIdentifier = "";
        }
        Intent intentN = this.meijerIntent.n(this.application, "meijerapp://mperks/shop/en/my-account/order/" + partnerIdentifier);
        if (intentN == null) {
            return null;
        }
        intentN.setFlags(268468224);
        intentN.putExtra("arrivedFlag", true);
        return intentN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(Function1 function1, boolean z10) {
        function1.invoke(Boolean.valueOf(z10));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k0(Function1 function1, boolean z10) {
        function1.invoke(Boolean.valueOf(z10));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n0(Function1 function1, boolean z10) {
        function1.invoke(Boolean.valueOf(z10));
        return Unit.f142422a;
    }

    @SuppressLint({"RestrictedApi"})
    private final void x0(OrderEventInfo orderEventInfo, final Function1<? super Boolean, Unit> onSuccess) throws Exception {
        FlyBuyCore.getOrders().event(orderEventInfo, new Function2() { // from class: Qn.s
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return I.y0(this.f31003a, onSuccess, (Order) obj, (SdkError) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(Function1 function1, boolean z10) {
        function1.invoke(Boolean.valueOf(z10));
        return Unit.f142422a;
    }
}
