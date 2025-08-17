package es;

import Co.Image;
import Co.ProductFullDetails;
import Ji.C;
import Tq.PointOfService;
import ak.AbstractC5607a;
import androidx.recyclerview.widget.RecyclerView;
import as.C6152f;
import ci.CustomerAddress;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import ej.DeliveryMode;
import ej.PaymentDetailItem;
import fj.PickupSlotInfo;
import gj.OrderDetail;
import j$.time.LocalDate;
import j$.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import tp.Builder;
import tp.EnumC17127a;
import uo.OrderOutOfStockItem;
import vk.C17590a;
import vo.OrderSubstitutionItem;
import wl.OrderSubstitutionsDetail;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b9\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002/3Bñ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001c\u0012\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0080\u0002\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001c2\b\b\u0002\u0010#\u001a\u00020\"HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u000f2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u00106\u001a\u0004\b7\u0010+R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b>\u0010=\u001a\u0004\b@\u0010?R\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b7\u0010=\u001a\u0004\bA\u0010?R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bB\u00106\u001a\u0004\bB\u0010+R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b5\u0010D\u001a\u0004\bG\u0010FR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bH\u0010D\u001a\u0004\bI\u0010FR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b:\u0010D\u001a\u0004\bJ\u0010FR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bK\u0010D\u001a\u0004\bL\u0010FR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0017\u0010\u0017\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bA\u0010D\u001a\u0004\bQ\u0010FR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b1\u0010R\u001a\u0004\bC\u0010SR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bM\u0010VR\u001f\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bO\u0010W\u001a\u0004\bK\u0010XR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bQ\u00104\u001a\u0004\bT\u0010)R\u001f\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bE\u0010W\u001a\u0004\bH\u0010XR\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\bJ\u0010Y\u001a\u0004\b<\u0010Z¨\u0006["}, d2 = {"Les/i;", "", "Lej/u;", "paymentDetails", "", "orderNumber", "", BarcodePickDeserializer.FIELD_ICON, "Les/i$b;", "orderProgress", "Lak/a;", "fulfillmentInfo", "pickupOrderAddress", "orderTotal", "itemCount", "", "isLearnMoreVisible", "isOrderComplete", "isPickupOrderRescheduled", "isOrderCanceled", "isRateAndTipSupported", "Ltp/b;", "rateAndTipBuilder", "isCheckInButtonVisible", "Les/c;", "orderDetailStatusDayDateTimeDecorator", "Les/J;", "orderSubstitutionsDetailBannerDecorator", "", "Lvo/a;", "orderSubstitutionItemList", "pickupPersonName", "Luo/a;", "orderOutOfStockListItem", "Ltp/a;", "flowType", "<init>", "(Lej/u;Ljava/lang/String;ILes/i$b;Lak/a;Lak/a;Lak/a;IZZZZZLtp/b;ZLes/c;Les/J;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ltp/a;)V", "c", "(Lej/u;Ljava/lang/String;ILes/i$b;Lak/a;Lak/a;Lak/a;IZZZZZLtp/b;ZLes/c;Les/J;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ltp/a;)Les/i;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lej/u;", "p", "()Lej/u;", "b", "Ljava/lang/String;", "j", "I", "g", "d", "Les/i$b;", "l", "()Les/i$b;", "e", "Lak/a;", "f", "()Lak/a;", "getPickupOrderAddress", "o", "h", "i", "Z", "t", "()Z", "v", "k", "w", "u", "m", "x", "n", "Ltp/b;", "r", "()Ltp/b;", "s", "Les/c;", "()Les/c;", "q", "Les/J;", "()Les/J;", "Ljava/util/List;", "()Ljava/util/List;", "Ltp/a;", "()Ltp/a;", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: es.i, reason: case insensitive filesystem and from toString */
/* loaded from: classes11.dex */
public final /* data */ class OrderStatusCardDecorator {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: w, reason: collision with root package name */
    public static final int f129891w = 8;

    /* renamed from: x, reason: collision with root package name */
    private static boolean f129892x;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentDetailItem paymentDetails;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderNumber;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int icon;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderProgress orderProgress;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a fulfillmentInfo;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a pickupOrderAddress;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a orderTotal;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int itemCount;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLearnMoreVisible;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOrderComplete;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPickupOrderRescheduled;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOrderCanceled;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isRateAndTipSupported;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final Builder rateAndTipBuilder;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCheckInButtonVisible;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderDetailStatusDayDateTimeDecorator orderDetailStatusDayDateTimeDecorator;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecorator;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<OrderSubstitutionItem> orderSubstitutionItemList;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickupPersonName;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<OrderOutOfStockItem> orderOutOfStockListItem;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC17127a flowType;

    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010%\u001a\u00020$2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b)\u0010*J\u0019\u0010-\u001a\u00020\u00182\b\u0010,\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b/\u00100J\u0019\u00101\u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b1\u00102JQ\u00108\u001a\u0002072\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u00104\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010\u0006¢\u0006\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006<"}, d2 = {"Les/i$a;", "", "<init>", "()V", "Lwl/a;", "substitutionOrderDetails", "", "LCo/h;", "productsDetailList", "Lvo/a;", "h", "(Lwl/a;Ljava/util/List;)Ljava/util/List;", "Lgj/c;", "orderDetail", "LGl/b$c;", "flyBuyOrder", "", "e", "(Lgj/c;LGl/b$c;Lwl/a;)Z", "i", "(Lwl/a;)Z", "Lgj/f;", "orderStatus", "isPickup", "", "statusDisplay", "paymentDeclined", "", "g", "(Lgj/f;Ljava/lang/Boolean;Ljava/lang/String;Z)I", "Lfj/c;", "pickupSlotInfo", "LTq/c;", "pointOfService", "Lci/c;", "deliveryAddress", "Lak/a;", "d", "(Lfj/c;LTq/c;Lci/c;Ljava/lang/Boolean;)Lak/a;", "j$/time/LocalTime", "time", "f", "(Lj$/time/LocalTime;)Ljava/lang/String;", "j$/time/LocalDate", "date", "c", "(Lj$/time/LocalDate;)Ljava/lang/String;", "a", "(Lgj/c;)Z", "j", "(LTq/c;)Z", "flyBuyDetails", "substitutionProductDetailsList", "Luo/a;", "orderOutOfStockListItem", "Les/i;", "b", "(Lgj/c;LGl/b$c;Lwl/a;Ljava/util/List;Ljava/util/List;)Les/i;", "isOrderComplete", "Z", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: es.i$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List<OrderSubstitutionItem> h(OrderSubstitutionsDetail substitutionOrderDetails, List<ProductFullDetails> productsDetailList) {
            List<OrderSubstitutionsDetail.LineItem> listB;
            ProductFullDetails productFullDetails;
            ProductFullDetails productFullDetails2;
            ProductFullDetails productFullDetails3;
            Object next;
            ProductFullDetails productFullDetails4;
            Object next2;
            if (substitutionOrderDetails == null || (listB = substitutionOrderDetails.b()) == null) {
                return null;
            }
            ArrayList<OrderSubstitutionsDetail.LineItem> arrayList = new ArrayList();
            Iterator<T> it = listB.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next3 = it.next();
                String strI = ((OrderSubstitutionsDetail.LineItem) next3).getUpcSubstitutedFor();
                if (!(strI == null || strI.length() == 0)) {
                    arrayList.add(next3);
                }
            }
            ArrayList<FetchSubstitutedProducts> arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
            for (OrderSubstitutionsDetail.LineItem bVar : arrayList) {
                arrayList2.add(new FetchSubstitutedProducts(bVar.getUpcSubstitutedFor(), bVar.getUpc(), bVar.getItemId(), bVar.getActualQuantityPicked(), bVar.getCustomerSubstitutionPreference(), bVar.getName(), bVar.getPrice(), bVar.getPricePerUnit()));
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt.x(arrayList2, 10));
            for (FetchSubstitutedProducts c13756a : arrayList2) {
                String strE = c13756a.getProductIdentityOriginal();
                if (strE != null) {
                    if (productsDetailList != null) {
                        Iterator<T> it2 = productsDetailList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                            if (Intrinsics.e(((ProductFullDetails) next2).getCode(), strE)) {
                                break;
                            }
                        }
                        productFullDetails4 = (ProductFullDetails) next2;
                    } else {
                        productFullDetails4 = null;
                    }
                    productFullDetails = productFullDetails4;
                } else {
                    productFullDetails = null;
                }
                String strF = c13756a.getProductIdentitySubstituted();
                if (strF != null) {
                    if (productsDetailList != null) {
                        Iterator<T> it3 = productsDetailList.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                            if (Intrinsics.e(((ProductFullDetails) next).getCode(), strF)) {
                                break;
                            }
                        }
                        productFullDetails3 = (ProductFullDetails) next;
                    } else {
                        productFullDetails3 = null;
                    }
                    productFullDetails2 = productFullDetails3;
                } else {
                    productFullDetails2 = null;
                }
                Integer numB = c13756a.getItemId();
                int iIntValue = numB != null ? numB.intValue() : 0;
                List<Image> listJ = productFullDetails != null ? productFullDetails.j() : null;
                List<Image> listJ2 = productFullDetails2 != null ? productFullDetails2.j() : null;
                String name = productFullDetails != null ? productFullDetails.getName() : null;
                String name2 = productFullDetails2 != null ? productFullDetails2.getName() : null;
                Double dG = c13756a.getQuantity();
                arrayList3.add(new OrderSubstitutionItem(iIntValue, name, name2, listJ, listJ2, dG != null ? dG.doubleValue() : 0.0d, productFullDetails != null ? productFullDetails.getPrice() : null, productFullDetails2 != null ? productFullDetails2.getPrice() : null, productFullDetails, productFullDetails2, c13756a.getCustomerSubstitutionPreference(), false, RecyclerView.m.FLAG_MOVED, null));
            }
            return arrayList3;
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: es.i$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C2058a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[ej.x.values().length];
                try {
                    iArr[ej.x.f129007a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ej.x.f129008b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ej.x.f129009c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[gj.f.values().length];
                try {
                    iArr2[gj.f.f133633p.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[gj.f.f133632o.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[gj.f.f133626i.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        private Companion() {
        }

        private final String c(LocalDate date) {
            if (date == null) {
                return "";
            }
            String str = date.format(C17590a.NUMERIC_MONTH_DAY);
            if (date.atStartOfDay().isEqual(LocalDate.now().atStartOfDay())) {
                str = "Today";
            } else if (date.atStartOfDay().isEqual(LocalDate.now().atStartOfDay().plusDays(1L))) {
                str = "Tomorrow";
            }
            Intrinsics.g(str);
            return str;
        }

        private final AbstractC5607a d(PickupSlotInfo pickupSlotInfo, PointOfService pointOfService, CustomerAddress deliveryAddress, Boolean isPickup) {
            if (Intrinsics.e(isPickup, Boolean.TRUE)) {
                AbstractC5607a.Companion c0948a = AbstractC5607a.INSTANCE;
                int i10 = C6152f.f59457m;
                String strI = pointOfService != null ? pointOfService.getDisplayName() : null;
                return c0948a.d(i10, strI != null ? strI : "", c(pickupSlotInfo != null ? pickupSlotInfo.getPickupDate() : null), f(pickupSlotInfo != null ? pickupSlotInfo.getPickupEndTime() : null));
            }
            AbstractC5607a.Companion c0948a2 = AbstractC5607a.INSTANCE;
            int i11 = C6152f.f59457m;
            String strD = deliveryAddress != null ? deliveryAddress.getLine1() : null;
            String str = strD != null ? strD : "";
            LocalDate localDateC = pickupSlotInfo != null ? pickupSlotInfo.getPickupDate() : null;
            Intrinsics.g(localDateC);
            return c0948a2.d(i11, str, c(localDateC), f(pickupSlotInfo.getPickupEndTime()));
        }

        private final String f(LocalTime time) {
            if (time == null) {
                return "Noon";
            }
            LocalTime localTime = (time.getHour() == 12 && time.getMinute() == 0) ? null : time;
            if (localTime == null) {
                return "Noon";
            }
            String str = localTime.format(time.getMinute() == 0 ? C17590a.f164803a.C() : C17590a.f164803a.q());
            if (str == null) {
                return "Noon";
            }
            Locale US = Locale.US;
            Intrinsics.i(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.i(lowerCase, "toLowerCase(...)");
            return lowerCase != null ? lowerCase : "Noon";
        }

        private final int g(gj.f orderStatus, Boolean isPickup, String statusDisplay, boolean paymentDeclined) {
            if (paymentDeclined) {
                return C.i.e.f15552d.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
            }
            if (!Intrinsics.e(isPickup, Boolean.TRUE)) {
                return (Intrinsics.e(statusDisplay, "Completed") || Intrinsics.e(statusDisplay, "Order Delivered")) ? C.i.b.f15549d.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String() : orderStatus == gj.f.f133633p ? C.i.e.f15552d.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String() : C.e.a.f15497d.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
            }
            int i10 = C2058a.$EnumSwitchMapping$1[orderStatus.ordinal()];
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? C.e.b.f15498d.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String() : C.i.n.f15565d.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String() : C.i.b.f15549d.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String() : C.i.e.f15552d.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
        }

        private final boolean i(OrderSubstitutionsDetail substitutionOrderDetails) {
            return substitutionOrderDetails == null || substitutionOrderDetails.getHasUserConfirmedSubstitutionPreferences();
        }

        private final boolean j(PointOfService pointOfService) {
            return CollectionsKt.h0(CollectionsKt.p(65, 69, 72, 108, 199, 213, 248, 257, 268, 311, 316), pointOfService != null ? Integer.valueOf(pointOfService.getStoreId()) : null);
        }

        /* JADX WARN: Removed duplicated region for block: B:113:0x01b5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final es.OrderStatusCardDecorator b(gj.OrderDetail r37, Gl.FlyBuyOrderDetail.FlyBuyOrder r38, wl.OrderSubstitutionsDetail r39, java.util.List<Co.ProductFullDetails> r40, java.util.List<uo.OrderOutOfStockItem> r41) {
            /*
                Method dump skipped, instructions count: 522
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: es.OrderStatusCardDecorator.Companion.b(gj.c, Gl.b$c, wl.a, java.util.List, java.util.List):es.i");
        }

        private final boolean a(OrderDetail orderDetail) {
            if (OrderStatusCardDecorator.f129892x && !orderDetail.getIsMfc()) {
                DeliveryMode deliveryMode = orderDetail.getDeliveryMode();
                if (deliveryMode != null && deliveryMode.c()) {
                    return true;
                }
                return j(orderDetail.getPointOfService());
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
        
            if (r5 == Gl.b.a.EnumC0175b.f11591b) goto L18;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final boolean e(gj.OrderDetail r5, Gl.FlyBuyOrderDetail.FlyBuyOrder r6, wl.OrderSubstitutionsDetail r7) {
            /*
                r4 = this;
                ej.h r0 = r5.getDeliveryMode()
                r1 = 0
                if (r0 == 0) goto L4e
                boolean r0 = r0.f()
                r2 = 1
                if (r0 != r2) goto L4e
                es.K r0 = es.K.f129818a
                boolean r5 = r0.f(r5)
                if (r5 == 0) goto L4e
                r5 = 0
                if (r6 == 0) goto L1e
                Gl.b$a$b r0 = r6.getOrderState()
                goto L1f
            L1e:
                r0 = r5
            L1f:
                Gl.b$a$b r3 = Gl.FlyBuyOrderDetail.Companion.EnumC0175b.f11590a
                if (r0 == r3) goto L2d
                if (r6 == 0) goto L29
                Gl.b$a$b r5 = r6.getOrderState()
            L29:
                Gl.b$a$b r0 = Gl.FlyBuyOrderDetail.Companion.EnumC0175b.f11591b
                if (r5 != r0) goto L4e
            L2d:
                Gl.b$a$a r5 = r6.getCustomerState()
                Gl.b$a$a r0 = Gl.FlyBuyOrderDetail.Companion.EnumC0174a.f11584e
                if (r5 == r0) goto L3d
                Gl.b$a$a r5 = r6.getCustomerState()
                Gl.b$a$a r0 = Gl.FlyBuyOrderDetail.Companion.EnumC0174a.f11582c
                if (r5 != r0) goto L4d
            L3d:
                es.d$a r5 = es.OrderDetailStatusDecorator.INSTANCE
                int r5 = r5.g(r6)
                if (r5 < 0) goto L4d
                boolean r5 = r4.i(r7)
                if (r5 != 0) goto L4c
                goto L4d
            L4c:
                return r1
            L4d:
                return r2
            L4e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: es.OrderStatusCardDecorator.Companion.e(gj.c, Gl.b$c, wl.a):boolean");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0014"}, d2 = {"Les/i$b;", "", "", "orderStatus", "", "progress", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: es.i$b, reason: from toString */
    public static final /* data */ class OrderProgress {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String orderStatus;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int progress;

        /* JADX WARN: Multi-variable type inference failed */
        public OrderProgress() {
            this(null, 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderProgress)) {
                return false;
            }
            OrderProgress orderProgress = (OrderProgress) other;
            return Intrinsics.e(this.orderStatus, orderProgress.orderStatus) && this.progress == orderProgress.progress;
        }

        public OrderProgress(String str, int i10) {
            this.orderStatus = str;
            this.progress = i10;
        }

        /* renamed from: a, reason: from getter */
        public final String getOrderStatus() {
            return this.orderStatus;
        }

        /* renamed from: b, reason: from getter */
        public final int getProgress() {
            return this.progress;
        }

        public int hashCode() {
            String str = this.orderStatus;
            return ((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.progress);
        }

        public String toString() {
            return "OrderProgress(orderStatus=" + this.orderStatus + ", progress=" + this.progress + ')';
        }

        public /* synthetic */ OrderProgress(String str, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? 0 : i10);
        }
    }

    public OrderStatusCardDecorator(PaymentDetailItem uVar, String orderNumber, int i10, OrderProgress orderProgress, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, int i11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Builder rateAndTipBuilder, boolean z15, OrderDetailStatusDayDateTimeDecorator c13758c, OrderSubstitutionsDetailBannerDecorator j10, List<OrderSubstitutionItem> list, String str, List<OrderOutOfStockItem> list2, EnumC17127a flowType) {
        Intrinsics.j(orderNumber, "orderNumber");
        Intrinsics.j(orderProgress, "orderProgress");
        Intrinsics.j(rateAndTipBuilder, "rateAndTipBuilder");
        Intrinsics.j(flowType, "flowType");
        this.paymentDetails = uVar;
        this.orderNumber = orderNumber;
        this.icon = i10;
        this.orderProgress = orderProgress;
        this.fulfillmentInfo = abstractC5607a;
        this.pickupOrderAddress = abstractC5607a2;
        this.orderTotal = abstractC5607a3;
        this.itemCount = i11;
        this.isLearnMoreVisible = z10;
        this.isOrderComplete = z11;
        this.isPickupOrderRescheduled = z12;
        this.isOrderCanceled = z13;
        this.isRateAndTipSupported = z14;
        this.rateAndTipBuilder = rateAndTipBuilder;
        this.isCheckInButtonVisible = z15;
        this.orderDetailStatusDayDateTimeDecorator = c13758c;
        this.orderSubstitutionsDetailBannerDecorator = j10;
        this.orderSubstitutionItemList = list;
        this.pickupPersonName = str;
        this.orderOutOfStockListItem = list2;
        this.flowType = flowType;
    }

    public static /* synthetic */ OrderStatusCardDecorator d(OrderStatusCardDecorator orderStatusCardDecorator, PaymentDetailItem uVar, String str, int i10, OrderProgress orderProgress, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, int i11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Builder c17128b, boolean z15, OrderDetailStatusDayDateTimeDecorator c13758c, OrderSubstitutionsDetailBannerDecorator j10, List list, String str2, List list2, EnumC17127a enumC17127a, int i12, Object obj) {
        EnumC17127a enumC17127a2;
        List list3;
        PaymentDetailItem uVar2 = (i12 & 1) != 0 ? orderStatusCardDecorator.paymentDetails : uVar;
        String str3 = (i12 & 2) != 0 ? orderStatusCardDecorator.orderNumber : str;
        int i13 = (i12 & 4) != 0 ? orderStatusCardDecorator.icon : i10;
        OrderProgress orderProgress2 = (i12 & 8) != 0 ? orderStatusCardDecorator.orderProgress : orderProgress;
        AbstractC5607a abstractC5607a4 = (i12 & 16) != 0 ? orderStatusCardDecorator.fulfillmentInfo : abstractC5607a;
        AbstractC5607a abstractC5607a5 = (i12 & 32) != 0 ? orderStatusCardDecorator.pickupOrderAddress : abstractC5607a2;
        AbstractC5607a abstractC5607a6 = (i12 & 64) != 0 ? orderStatusCardDecorator.orderTotal : abstractC5607a3;
        int i14 = (i12 & 128) != 0 ? orderStatusCardDecorator.itemCount : i11;
        boolean z16 = (i12 & 256) != 0 ? orderStatusCardDecorator.isLearnMoreVisible : z10;
        boolean z17 = (i12 & 512) != 0 ? orderStatusCardDecorator.isOrderComplete : z11;
        boolean z18 = (i12 & 1024) != 0 ? orderStatusCardDecorator.isPickupOrderRescheduled : z12;
        boolean z19 = (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? orderStatusCardDecorator.isOrderCanceled : z13;
        boolean z20 = (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? orderStatusCardDecorator.isRateAndTipSupported : z14;
        Builder c17128b2 = (i12 & 8192) != 0 ? orderStatusCardDecorator.rateAndTipBuilder : c17128b;
        PaymentDetailItem uVar3 = uVar2;
        boolean z21 = (i12 & 16384) != 0 ? orderStatusCardDecorator.isCheckInButtonVisible : z15;
        OrderDetailStatusDayDateTimeDecorator c13758c2 = (i12 & 32768) != 0 ? orderStatusCardDecorator.orderDetailStatusDayDateTimeDecorator : c13758c;
        OrderSubstitutionsDetailBannerDecorator j11 = (i12 & 65536) != 0 ? orderStatusCardDecorator.orderSubstitutionsDetailBannerDecorator : j10;
        List list4 = (i12 & 131072) != 0 ? orderStatusCardDecorator.orderSubstitutionItemList : list;
        String str4 = (i12 & 262144) != 0 ? orderStatusCardDecorator.pickupPersonName : str2;
        List list5 = (i12 & 524288) != 0 ? orderStatusCardDecorator.orderOutOfStockListItem : list2;
        if ((i12 & 1048576) != 0) {
            list3 = list5;
            enumC17127a2 = orderStatusCardDecorator.flowType;
        } else {
            enumC17127a2 = enumC17127a;
            list3 = list5;
        }
        return orderStatusCardDecorator.c(uVar3, str3, i13, orderProgress2, abstractC5607a4, abstractC5607a5, abstractC5607a6, i14, z16, z17, z18, z19, z20, c17128b2, z21, c13758c2, j11, list4, str4, list3, enumC17127a2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderStatusCardDecorator)) {
            return false;
        }
        OrderStatusCardDecorator orderStatusCardDecorator = (OrderStatusCardDecorator) other;
        return Intrinsics.e(this.paymentDetails, orderStatusCardDecorator.paymentDetails) && Intrinsics.e(this.orderNumber, orderStatusCardDecorator.orderNumber) && this.icon == orderStatusCardDecorator.icon && Intrinsics.e(this.orderProgress, orderStatusCardDecorator.orderProgress) && Intrinsics.e(this.fulfillmentInfo, orderStatusCardDecorator.fulfillmentInfo) && Intrinsics.e(this.pickupOrderAddress, orderStatusCardDecorator.pickupOrderAddress) && Intrinsics.e(this.orderTotal, orderStatusCardDecorator.orderTotal) && this.itemCount == orderStatusCardDecorator.itemCount && this.isLearnMoreVisible == orderStatusCardDecorator.isLearnMoreVisible && this.isOrderComplete == orderStatusCardDecorator.isOrderComplete && this.isPickupOrderRescheduled == orderStatusCardDecorator.isPickupOrderRescheduled && this.isOrderCanceled == orderStatusCardDecorator.isOrderCanceled && this.isRateAndTipSupported == orderStatusCardDecorator.isRateAndTipSupported && Intrinsics.e(this.rateAndTipBuilder, orderStatusCardDecorator.rateAndTipBuilder) && this.isCheckInButtonVisible == orderStatusCardDecorator.isCheckInButtonVisible && Intrinsics.e(this.orderDetailStatusDayDateTimeDecorator, orderStatusCardDecorator.orderDetailStatusDayDateTimeDecorator) && Intrinsics.e(this.orderSubstitutionsDetailBannerDecorator, orderStatusCardDecorator.orderSubstitutionsDetailBannerDecorator) && Intrinsics.e(this.orderSubstitutionItemList, orderStatusCardDecorator.orderSubstitutionItemList) && Intrinsics.e(this.pickupPersonName, orderStatusCardDecorator.pickupPersonName) && Intrinsics.e(this.orderOutOfStockListItem, orderStatusCardDecorator.orderOutOfStockListItem) && this.flowType == orderStatusCardDecorator.flowType;
    }

    public final OrderStatusCardDecorator c(PaymentDetailItem paymentDetails, String orderNumber, int icon, OrderProgress orderProgress, AbstractC5607a fulfillmentInfo, AbstractC5607a pickupOrderAddress, AbstractC5607a orderTotal, int itemCount, boolean isLearnMoreVisible, boolean isOrderComplete, boolean isPickupOrderRescheduled, boolean isOrderCanceled, boolean isRateAndTipSupported, Builder rateAndTipBuilder, boolean isCheckInButtonVisible, OrderDetailStatusDayDateTimeDecorator orderDetailStatusDayDateTimeDecorator, OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecorator, List<OrderSubstitutionItem> orderSubstitutionItemList, String pickupPersonName, List<OrderOutOfStockItem> orderOutOfStockListItem, EnumC17127a flowType) {
        Intrinsics.j(orderNumber, "orderNumber");
        Intrinsics.j(orderProgress, "orderProgress");
        Intrinsics.j(rateAndTipBuilder, "rateAndTipBuilder");
        Intrinsics.j(flowType, "flowType");
        return new OrderStatusCardDecorator(paymentDetails, orderNumber, icon, orderProgress, fulfillmentInfo, pickupOrderAddress, orderTotal, itemCount, isLearnMoreVisible, isOrderComplete, isPickupOrderRescheduled, isOrderCanceled, isRateAndTipSupported, rateAndTipBuilder, isCheckInButtonVisible, orderDetailStatusDayDateTimeDecorator, orderSubstitutionsDetailBannerDecorator, orderSubstitutionItemList, pickupPersonName, orderOutOfStockListItem, flowType);
    }

    /* renamed from: e, reason: from getter */
    public final EnumC17127a getFlowType() {
        return this.flowType;
    }

    /* renamed from: f, reason: from getter */
    public final AbstractC5607a getFulfillmentInfo() {
        return this.fulfillmentInfo;
    }

    /* renamed from: g, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* renamed from: h, reason: from getter */
    public final int getItemCount() {
        return this.itemCount;
    }

    public int hashCode() {
        PaymentDetailItem uVar = this.paymentDetails;
        int iHashCode = (((((((uVar == null ? 0 : uVar.hashCode()) * 31) + this.orderNumber.hashCode()) * 31) + Integer.hashCode(this.icon)) * 31) + this.orderProgress.hashCode()) * 31;
        AbstractC5607a abstractC5607a = this.fulfillmentInfo;
        int iHashCode2 = (iHashCode + (abstractC5607a == null ? 0 : abstractC5607a.hashCode())) * 31;
        AbstractC5607a abstractC5607a2 = this.pickupOrderAddress;
        int iHashCode3 = (iHashCode2 + (abstractC5607a2 == null ? 0 : abstractC5607a2.hashCode())) * 31;
        AbstractC5607a abstractC5607a3 = this.orderTotal;
        int iHashCode4 = (((((((((((((((((iHashCode3 + (abstractC5607a3 == null ? 0 : abstractC5607a3.hashCode())) * 31) + Integer.hashCode(this.itemCount)) * 31) + Boolean.hashCode(this.isLearnMoreVisible)) * 31) + Boolean.hashCode(this.isOrderComplete)) * 31) + Boolean.hashCode(this.isPickupOrderRescheduled)) * 31) + Boolean.hashCode(this.isOrderCanceled)) * 31) + Boolean.hashCode(this.isRateAndTipSupported)) * 31) + this.rateAndTipBuilder.hashCode()) * 31) + Boolean.hashCode(this.isCheckInButtonVisible)) * 31;
        OrderDetailStatusDayDateTimeDecorator c13758c = this.orderDetailStatusDayDateTimeDecorator;
        int iHashCode5 = (iHashCode4 + (c13758c == null ? 0 : c13758c.hashCode())) * 31;
        OrderSubstitutionsDetailBannerDecorator j10 = this.orderSubstitutionsDetailBannerDecorator;
        int iHashCode6 = (iHashCode5 + (j10 == null ? 0 : j10.hashCode())) * 31;
        List<OrderSubstitutionItem> list = this.orderSubstitutionItemList;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.pickupPersonName;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        List<OrderOutOfStockItem> list2 = this.orderOutOfStockListItem;
        return ((iHashCode8 + (list2 != null ? list2.hashCode() : 0)) * 31) + this.flowType.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public final OrderDetailStatusDayDateTimeDecorator getOrderDetailStatusDayDateTimeDecorator() {
        return this.orderDetailStatusDayDateTimeDecorator;
    }

    /* renamed from: j, reason: from getter */
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    public final List<OrderOutOfStockItem> k() {
        return this.orderOutOfStockListItem;
    }

    /* renamed from: l, reason: from getter */
    public final OrderProgress getOrderProgress() {
        return this.orderProgress;
    }

    public final List<OrderSubstitutionItem> m() {
        return this.orderSubstitutionItemList;
    }

    /* renamed from: n, reason: from getter */
    public final OrderSubstitutionsDetailBannerDecorator getOrderSubstitutionsDetailBannerDecorator() {
        return this.orderSubstitutionsDetailBannerDecorator;
    }

    /* renamed from: o, reason: from getter */
    public final AbstractC5607a getOrderTotal() {
        return this.orderTotal;
    }

    /* renamed from: p, reason: from getter */
    public final PaymentDetailItem getPaymentDetails() {
        return this.paymentDetails;
    }

    /* renamed from: q, reason: from getter */
    public final String getPickupPersonName() {
        return this.pickupPersonName;
    }

    /* renamed from: r, reason: from getter */
    public final Builder getRateAndTipBuilder() {
        return this.rateAndTipBuilder;
    }

    /* renamed from: s, reason: from getter */
    public final boolean getIsCheckInButtonVisible() {
        return this.isCheckInButtonVisible;
    }

    /* renamed from: t, reason: from getter */
    public final boolean getIsLearnMoreVisible() {
        return this.isLearnMoreVisible;
    }

    public String toString() {
        return "OrderStatusCardDecorator(paymentDetails=" + this.paymentDetails + ", orderNumber=" + this.orderNumber + ", icon=" + this.icon + ", orderProgress=" + this.orderProgress + ", fulfillmentInfo=" + this.fulfillmentInfo + ", pickupOrderAddress=" + this.pickupOrderAddress + ", orderTotal=" + this.orderTotal + ", itemCount=" + this.itemCount + ", isLearnMoreVisible=" + this.isLearnMoreVisible + ", isOrderComplete=" + this.isOrderComplete + ", isPickupOrderRescheduled=" + this.isPickupOrderRescheduled + ", isOrderCanceled=" + this.isOrderCanceled + ", isRateAndTipSupported=" + this.isRateAndTipSupported + ", rateAndTipBuilder=" + this.rateAndTipBuilder + ", isCheckInButtonVisible=" + this.isCheckInButtonVisible + ", orderDetailStatusDayDateTimeDecorator=" + this.orderDetailStatusDayDateTimeDecorator + ", orderSubstitutionsDetailBannerDecorator=" + this.orderSubstitutionsDetailBannerDecorator + ", orderSubstitutionItemList=" + this.orderSubstitutionItemList + ", pickupPersonName=" + this.pickupPersonName + ", orderOutOfStockListItem=" + this.orderOutOfStockListItem + ", flowType=" + this.flowType + ')';
    }

    /* renamed from: u, reason: from getter */
    public final boolean getIsOrderCanceled() {
        return this.isOrderCanceled;
    }

    /* renamed from: v, reason: from getter */
    public final boolean getIsOrderComplete() {
        return this.isOrderComplete;
    }

    /* renamed from: w, reason: from getter */
    public final boolean getIsPickupOrderRescheduled() {
        return this.isPickupOrderRescheduled;
    }

    /* renamed from: x, reason: from getter */
    public final boolean getIsRateAndTipSupported() {
        return this.isRateAndTipSupported;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ OrderStatusCardDecorator(PaymentDetailItem uVar, String str, int i10, OrderProgress orderProgress, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, int i11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Builder c17128b, boolean z15, OrderDetailStatusDayDateTimeDecorator c13758c, OrderSubstitutionsDetailBannerDecorator j10, List list, String str2, List list2, EnumC17127a enumC17127a, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        OrderProgress orderProgress2;
        PaymentDetailItem uVar2 = (i12 & 1) != 0 ? new PaymentDetailItem(null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, 131071, null) : uVar;
        int i13 = 0;
        int i14 = (i12 & 4) != 0 ? 0 : i10;
        String str3 = null;
        Object[] objArr = 0;
        if ((i12 & 8) != 0) {
            orderProgress2 = new OrderProgress(str3, i13, 3, objArr == true ? 1 : 0);
        } else {
            orderProgress2 = orderProgress;
        }
        this(uVar2, str, i14, orderProgress2, (i12 & 16) != 0 ? null : abstractC5607a, abstractC5607a2, (i12 & 64) != 0 ? null : abstractC5607a3, (i12 & 128) != 0 ? 0 : i11, (i12 & 256) != 0 ? false : z10, (i12 & 512) != 0 ? false : z11, (i12 & 1024) != 0 ? false : z12, (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? false : z13, (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z14, c17128b, (i12 & 16384) != 0 ? false : z15, (32768 & i12) != 0 ? null : c13758c, (65536 & i12) != 0 ? null : j10, (131072 & i12) != 0 ? null : list, (262144 & i12) != 0 ? null : str2, (524288 & i12) != 0 ? null : list2, (i12 & 1048576) != 0 ? EnumC17127a.f161939c : enumC17127a);
    }
}
