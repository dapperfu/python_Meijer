package xo;

import Cj.i;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import com.meijer.mobile.digitalshopping.api.orders.model.orderhistory.DeliveryModeEnum;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import fj.x;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.OffsetDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;
import ol.OrderHistoryItem;
import tp.EnumC17276a;
import wk.C17898a;
import wo.C17904a;
import wo.C17905b;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b&\b\u0086\b\u0018\u0000 H2\u00020\u0001:\u0001IB\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\f\u001a\u00060\u0004j\u0002`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ¾\u0001\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\f\b\u0002\u0010\f\u001a\u00060\u0004j\u0002`\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b.\u0010 R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010 R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\u001b\u0010\f\u001a\u00060\u0004j\u0002`\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b6\u0010 R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b)\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b2\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b<\u0010>\u001a\u0004\b\u0013\u0010@R\u0017\u0010\u0014\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b?\u0010>\u001a\u0004\b\u0014\u0010@R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b/\u0010CR\u0017\u0010\u0017\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b0\u0010>\u001a\u0004\bA\u0010@R\u0017\u0010\u0018\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bD\u0010;\u001a\u0004\b1\u0010=R\u0017\u0010\u0019\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bE\u0010>\u001a\u0004\bD\u0010@R\u0017\u0010\u001a\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bF\u0010>\u001a\u0004\bE\u0010@R\u0011\u0010G\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b:\u0010=¨\u0006J"}, d2 = {"Lxo/e;", "Lxo/b;", "Lokhttp3/HttpUrl;", "orderURL", "", "orderNumber", "date", "total", "status", "Lxo/e$a$a;", "order", "Lcom/meijer/mobile/core/model/common/Guid;", "guid", "Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/DeliveryModeEnum;", "deliveryMode", "Lbk/a;", "tipAmount", "", "tipAmountVisibility", "isTipped", "isRated", "Ltp/a;", "flowType", "tipAndRateButtonVisibility", "numberOfItems", "isDeclinedPaymentWidgetVisible", "isDeliveryModeExist", "<init>", "(Lokhttp3/HttpUrl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxo/e$a$a;Ljava/lang/String;Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/DeliveryModeEnum;Lbk/a;ZZZLtp/a;ZLbk/a;ZZ)V", "b", "(Lokhttp3/HttpUrl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxo/e$a$a;Ljava/lang/String;Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/DeliveryModeEnum;Lbk/a;ZZZLtp/a;ZLbk/a;ZZ)Lxo/e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lokhttp3/HttpUrl;", "i", "()Lokhttp3/HttpUrl;", "c", "Ljava/lang/String;", "h", "d", "e", "o", "f", "k", "g", "Lxo/e$a$a;", "()Lxo/e$a$a;", "getGuid", "Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/DeliveryModeEnum;", "getDeliveryMode", "()Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/DeliveryModeEnum;", "j", "Lbk/a;", "l", "()Lbk/a;", "Z", "m", "()Z", "n", "Ltp/a;", "()Ltp/a;", "p", "q", "r", "rateAndTipButtonText", "s", "a", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xo.e, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class OrdersItemDecorator extends AbstractC18202b {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final HttpUrl orderURL;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderNumber;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String date;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String total;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String status;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Companion.OrderStatus order;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String guid;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryModeEnum deliveryMode;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a tipAmount;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean tipAmountVisibility;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isTipped;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isRated;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC17276a flowType;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean tipAndRateButtonVisibility;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a numberOfItems;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDeclinedPaymentWidgetVisible;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDeliveryModeExist;

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u001f*\b\u0012\u0004\u0012\u00020\u000b0\u001f¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001f*\b\u0012\u0004\u0012\u00020\u000b0\u001f¢\u0006\u0004\b\"\u0010!J\u0015\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010(¨\u0006+"}, d2 = {"Lxo/e$a;", "", "<init>", "()V", "Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/DeliveryModeEnum;", "mode", "", "status", "Lxo/e$a$a;", "e", "(Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/DeliveryModeEnum;Ljava/lang/String;)Lxo/e$a$a;", "Lxo/e;", "", "d", "(Lxo/e;)Z", "date", "", "a", "(Ljava/lang/String;)J", "j$/time/Instant", "h", "(Ljava/lang/String;)Lj$/time/Instant;", "Lol/b;", "order", "f", "(Lol/b;)Z", "orderHistory", "Lxo/d;", "orderUrlProvider", "b", "(Lol/b;Lxo/d;)Lxo/e;", "", "g", "(Ljava/util/List;)Ljava/util/List;", "i", "tipAmount", "Lbk/a;", "c", "(Ljava/lang/String;)Lbk/a;", "ORDER_STATUS_COMPLETED", "Ljava/lang/String;", "ORDER_STATUS_CANCELED", "ORDER_STATUS_DELIVERED", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: xo.e$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lxo/e$a$a;", "", "", BarcodePickDeserializer.FIELD_ICON, "Lbk/a;", "text", "<init>", "(ILbk/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lbk/a;", "()Lbk/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: xo.e$a$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class OrderStatus {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int icon;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC6392a text;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OrderStatus)) {
                    return false;
                }
                OrderStatus orderStatus = (OrderStatus) other;
                return this.icon == orderStatus.icon && Intrinsics.e(this.text, orderStatus.text);
            }

            public OrderStatus(int i10, AbstractC6392a text) {
                Intrinsics.j(text, "text");
                this.icon = i10;
                this.text = text;
            }

            /* renamed from: a, reason: from getter */
            public final int getIcon() {
                return this.icon;
            }

            /* renamed from: b, reason: from getter */
            public final AbstractC6392a getText() {
                return this.text;
            }

            public int hashCode() {
                return (Integer.hashCode(this.icon) * 31) + this.text.hashCode();
            }

            public String toString() {
                return "OrderStatus(icon=" + this.icon + ", text=" + this.text + ')';
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final OrderStatus e(DeliveryModeEnum mode, String status) {
            return mode == DeliveryModeEnum.PICKUP ? new OrderStatus(i.f4740T0, AbstractC6392a.INSTANCE.d(C17905b.f167328s, status)) : new OrderStatus(i.f4779e2, AbstractC6392a.INSTANCE.d(C17905b.f167324o, status));
        }

        private final boolean f(OrderHistoryItem order) {
            return CollectionsKt.p("COMPLETED", "DELIVERED").contains(order.getStatus()) && (order.getTipAndRateDetails().getTippablePartner() && (!order.getTipAndRateDetails().getTipDetails().getTipped() || !order.getTipAndRateDetails().getRateDetails().getRated()));
        }

        private final Instant h(String str) {
            Instant instant = LocalDate.parse(str, C17898a.f167225a.l()).atStartOfDay(ZoneId.systemDefault()).toInstant();
            Intrinsics.i(instant, "toInstant(...)");
            return instant;
        }

        public final OrdersItemDecorator b(OrderHistoryItem orderHistory, d orderUrlProvider) {
            Intrinsics.j(orderHistory, "orderHistory");
            Intrinsics.j(orderUrlProvider, "orderUrlProvider");
            HttpUrl httpUrlA = orderUrlProvider.a(orderHistory);
            String code = orderHistory.getCode();
            OffsetDateTime placed = orderHistory.getPlaced();
            String str = placed != null ? placed.format(C17898a.f167225a.l()) : null;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            String formattedValue = orderHistory.getTotal().getFormattedValue();
            String status = orderHistory.getStatus();
            Companion companion = OrdersItemDecorator.INSTANCE;
            DeliveryModeEnum deliveryMode = orderHistory.getDeliveryMode();
            String statusDisplay = orderHistory.getStatusDisplay();
            Locale ROOT = Locale.ROOT;
            Intrinsics.i(ROOT, "ROOT");
            String lowerCase = statusDisplay.toLowerCase(ROOT);
            Intrinsics.i(lowerCase, "toLowerCase(...)");
            OrderStatus orderStatusE = companion.e(deliveryMode, lowerCase);
            String guid = orderHistory.getGuid();
            DeliveryModeEnum deliveryMode2 = orderHistory.getDeliveryMode();
            nk.b tipAmount = orderHistory.getTipAndRateDetails().getTipDetails().getTipAmount();
            return new OrdersItemDecorator(httpUrlA, code, str2, formattedValue, status, orderStatusE, guid, deliveryMode2, tipAmount.getFormattedValue().length() == 0 ? AbstractC6392a.INSTANCE.d(C17905b.f167306A, Double.valueOf(tipAmount.getValue())) : AbstractC6392a.INSTANCE.d(C17905b.f167335z, tipAmount.getFormattedValue()), !Intrinsics.e(orderHistory.getStatus(), "CANCELLED") ? orderHistory.getTipAndRateDetails().getTipDetails().getTipped() : false, orderHistory.getTipAndRateDetails().getTipDetails().getTipped(), orderHistory.getTipAndRateDetails().getRateDetails().getRated(), orderHistory.getTipAndRateDetails().a(), f(orderHistory), AbstractC6392a.INSTANCE.b(C17904a.f167305a, orderHistory.getTotalItems(), new Object[0]), orderHistory.getPaymentInfo().getTransactionStatus() == x.f131998c, f.b(orderHistory.getDeliveryMode()));
        }

        public final AbstractC6392a c(String tipAmount) {
            String str;
            Intrinsics.j(tipAmount, "tipAmount");
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            int i10 = C17905b.f167335z;
            if (Double.parseDouble(tipAmount) % 1.0d == 0.0d) {
                str = '$' + tipAmount + '0';
            } else {
                str = '$' + tipAmount;
            }
            return companion.d(i10, str);
        }

        public final List<OrdersItemDecorator> g(List<OrdersItemDecorator> list) {
            Intrinsics.j(list, "<this>");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (OrdersItemDecorator.INSTANCE.d((OrdersItemDecorator) obj)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        public final List<OrdersItemDecorator> i(List<OrdersItemDecorator> list) {
            Intrinsics.j(list, "<this>");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!OrdersItemDecorator.INSTANCE.d((OrdersItemDecorator) obj)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        private final long a(String date) {
            return Duration.between(h(date), ZonedDateTime.now()).toDays();
        }

        private final boolean d(OrdersItemDecorator ordersItemDecorator) {
            if (a(ordersItemDecorator.getDate()) < 5 && !Intrinsics.e(ordersItemDecorator.getStatus(), "DELIVERED") && !Intrinsics.e(ordersItemDecorator.getStatus(), "CANCELLED") && !Intrinsics.e(ordersItemDecorator.getStatus(), "COMPLETED")) {
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrdersItemDecorator(HttpUrl orderURL, String orderNumber, String date, String total, String status, Companion.OrderStatus order, String guid, DeliveryModeEnum deliveryMode, AbstractC6392a tipAmount, boolean z10, boolean z11, boolean z12, EnumC17276a flowType, boolean z13, AbstractC6392a numberOfItems, boolean z14, boolean z15) {
        super(orderNumber);
        Intrinsics.j(orderURL, "orderURL");
        Intrinsics.j(orderNumber, "orderNumber");
        Intrinsics.j(date, "date");
        Intrinsics.j(total, "total");
        Intrinsics.j(status, "status");
        Intrinsics.j(order, "order");
        Intrinsics.j(guid, "guid");
        Intrinsics.j(deliveryMode, "deliveryMode");
        Intrinsics.j(tipAmount, "tipAmount");
        Intrinsics.j(flowType, "flowType");
        Intrinsics.j(numberOfItems, "numberOfItems");
        this.orderURL = orderURL;
        this.orderNumber = orderNumber;
        this.date = date;
        this.total = total;
        this.status = status;
        this.order = order;
        this.guid = guid;
        this.deliveryMode = deliveryMode;
        this.tipAmount = tipAmount;
        this.tipAmountVisibility = z10;
        this.isTipped = z11;
        this.isRated = z12;
        this.flowType = flowType;
        this.tipAndRateButtonVisibility = z13;
        this.numberOfItems = numberOfItems;
        this.isDeclinedPaymentWidgetVisible = z14;
        this.isDeliveryModeExist = z15;
    }

    public static /* synthetic */ OrdersItemDecorator c(OrdersItemDecorator ordersItemDecorator, HttpUrl httpUrl, String str, String str2, String str3, String str4, Companion.OrderStatus orderStatus, String str5, DeliveryModeEnum deliveryModeEnum, AbstractC6392a abstractC6392a, boolean z10, boolean z11, boolean z12, EnumC17276a enumC17276a, boolean z13, AbstractC6392a abstractC6392a2, boolean z14, boolean z15, int i10, Object obj) {
        boolean z16;
        boolean z17;
        HttpUrl httpUrl2;
        OrdersItemDecorator ordersItemDecorator2;
        AbstractC6392a abstractC6392a3;
        String str6;
        String str7;
        String str8;
        String str9;
        Companion.OrderStatus orderStatus2;
        String str10;
        DeliveryModeEnum deliveryModeEnum2;
        AbstractC6392a abstractC6392a4;
        boolean z18;
        boolean z19;
        boolean z20;
        EnumC17276a enumC17276a2;
        boolean z21;
        HttpUrl httpUrl3 = (i10 & 1) != 0 ? ordersItemDecorator.orderURL : httpUrl;
        String str11 = (i10 & 2) != 0 ? ordersItemDecorator.orderNumber : str;
        String str12 = (i10 & 4) != 0 ? ordersItemDecorator.date : str2;
        String str13 = (i10 & 8) != 0 ? ordersItemDecorator.total : str3;
        String str14 = (i10 & 16) != 0 ? ordersItemDecorator.status : str4;
        Companion.OrderStatus orderStatus3 = (i10 & 32) != 0 ? ordersItemDecorator.order : orderStatus;
        String str15 = (i10 & 64) != 0 ? ordersItemDecorator.guid : str5;
        DeliveryModeEnum deliveryModeEnum3 = (i10 & 128) != 0 ? ordersItemDecorator.deliveryMode : deliveryModeEnum;
        AbstractC6392a abstractC6392a5 = (i10 & 256) != 0 ? ordersItemDecorator.tipAmount : abstractC6392a;
        boolean z22 = (i10 & 512) != 0 ? ordersItemDecorator.tipAmountVisibility : z10;
        boolean z23 = (i10 & 1024) != 0 ? ordersItemDecorator.isTipped : z11;
        boolean z24 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? ordersItemDecorator.isRated : z12;
        EnumC17276a enumC17276a3 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? ordersItemDecorator.flowType : enumC17276a;
        boolean z25 = (i10 & 8192) != 0 ? ordersItemDecorator.tipAndRateButtonVisibility : z13;
        HttpUrl httpUrl4 = httpUrl3;
        AbstractC6392a abstractC6392a6 = (i10 & 16384) != 0 ? ordersItemDecorator.numberOfItems : abstractC6392a2;
        boolean z26 = (i10 & 32768) != 0 ? ordersItemDecorator.isDeclinedPaymentWidgetVisible : z14;
        if ((i10 & 65536) != 0) {
            z17 = z26;
            z16 = ordersItemDecorator.isDeliveryModeExist;
            abstractC6392a3 = abstractC6392a6;
            str6 = str11;
            str7 = str12;
            str8 = str13;
            str9 = str14;
            orderStatus2 = orderStatus3;
            str10 = str15;
            deliveryModeEnum2 = deliveryModeEnum3;
            abstractC6392a4 = abstractC6392a5;
            z18 = z22;
            z19 = z23;
            z20 = z24;
            enumC17276a2 = enumC17276a3;
            z21 = z25;
            httpUrl2 = httpUrl4;
            ordersItemDecorator2 = ordersItemDecorator;
        } else {
            z16 = z15;
            z17 = z26;
            httpUrl2 = httpUrl4;
            ordersItemDecorator2 = ordersItemDecorator;
            abstractC6392a3 = abstractC6392a6;
            str6 = str11;
            str7 = str12;
            str8 = str13;
            str9 = str14;
            orderStatus2 = orderStatus3;
            str10 = str15;
            deliveryModeEnum2 = deliveryModeEnum3;
            abstractC6392a4 = abstractC6392a5;
            z18 = z22;
            z19 = z23;
            z20 = z24;
            enumC17276a2 = enumC17276a3;
            z21 = z25;
        }
        return ordersItemDecorator2.b(httpUrl2, str6, str7, str8, str9, orderStatus2, str10, deliveryModeEnum2, abstractC6392a4, z18, z19, z20, enumC17276a2, z21, abstractC6392a3, z17, z16);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrdersItemDecorator)) {
            return false;
        }
        OrdersItemDecorator ordersItemDecorator = (OrdersItemDecorator) other;
        return Intrinsics.e(this.orderURL, ordersItemDecorator.orderURL) && Intrinsics.e(this.orderNumber, ordersItemDecorator.orderNumber) && Intrinsics.e(this.date, ordersItemDecorator.date) && Intrinsics.e(this.total, ordersItemDecorator.total) && Intrinsics.e(this.status, ordersItemDecorator.status) && Intrinsics.e(this.order, ordersItemDecorator.order) && Intrinsics.e(this.guid, ordersItemDecorator.guid) && this.deliveryMode == ordersItemDecorator.deliveryMode && Intrinsics.e(this.tipAmount, ordersItemDecorator.tipAmount) && this.tipAmountVisibility == ordersItemDecorator.tipAmountVisibility && this.isTipped == ordersItemDecorator.isTipped && this.isRated == ordersItemDecorator.isRated && this.flowType == ordersItemDecorator.flowType && this.tipAndRateButtonVisibility == ordersItemDecorator.tipAndRateButtonVisibility && Intrinsics.e(this.numberOfItems, ordersItemDecorator.numberOfItems) && this.isDeclinedPaymentWidgetVisible == ordersItemDecorator.isDeclinedPaymentWidgetVisible && this.isDeliveryModeExist == ordersItemDecorator.isDeliveryModeExist;
    }

    public final OrdersItemDecorator b(HttpUrl orderURL, String orderNumber, String date, String total, String status, Companion.OrderStatus order, String guid, DeliveryModeEnum deliveryMode, AbstractC6392a tipAmount, boolean tipAmountVisibility, boolean isTipped, boolean isRated, EnumC17276a flowType, boolean tipAndRateButtonVisibility, AbstractC6392a numberOfItems, boolean isDeclinedPaymentWidgetVisible, boolean isDeliveryModeExist) {
        Intrinsics.j(orderURL, "orderURL");
        Intrinsics.j(orderNumber, "orderNumber");
        Intrinsics.j(date, "date");
        Intrinsics.j(total, "total");
        Intrinsics.j(status, "status");
        Intrinsics.j(order, "order");
        Intrinsics.j(guid, "guid");
        Intrinsics.j(deliveryMode, "deliveryMode");
        Intrinsics.j(tipAmount, "tipAmount");
        Intrinsics.j(flowType, "flowType");
        Intrinsics.j(numberOfItems, "numberOfItems");
        return new OrdersItemDecorator(orderURL, orderNumber, date, total, status, order, guid, deliveryMode, tipAmount, tipAmountVisibility, isTipped, isRated, flowType, tipAndRateButtonVisibility, numberOfItems, isDeclinedPaymentWidgetVisible, isDeliveryModeExist);
    }

    /* renamed from: d, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: e, reason: from getter */
    public final EnumC17276a getFlowType() {
        return this.flowType;
    }

    /* renamed from: f, reason: from getter */
    public final AbstractC6392a getNumberOfItems() {
        return this.numberOfItems;
    }

    /* renamed from: g, reason: from getter */
    public final Companion.OrderStatus getOrder() {
        return this.order;
    }

    /* renamed from: h, reason: from getter */
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.orderURL.hashCode() * 31) + this.orderNumber.hashCode()) * 31) + this.date.hashCode()) * 31) + this.total.hashCode()) * 31) + this.status.hashCode()) * 31) + this.order.hashCode()) * 31) + this.guid.hashCode()) * 31) + this.deliveryMode.hashCode()) * 31) + this.tipAmount.hashCode()) * 31) + Boolean.hashCode(this.tipAmountVisibility)) * 31) + Boolean.hashCode(this.isTipped)) * 31) + Boolean.hashCode(this.isRated)) * 31) + this.flowType.hashCode()) * 31) + Boolean.hashCode(this.tipAndRateButtonVisibility)) * 31) + this.numberOfItems.hashCode()) * 31) + Boolean.hashCode(this.isDeclinedPaymentWidgetVisible)) * 31) + Boolean.hashCode(this.isDeliveryModeExist);
    }

    /* renamed from: i, reason: from getter */
    public final HttpUrl getOrderURL() {
        return this.orderURL;
    }

    public final AbstractC6392a j() {
        boolean z10 = this.isTipped;
        return (!z10 || this.isRated) ? (z10 || !this.isRated) ? AbstractC6392a.INSTANCE.d(C17905b.f167332w, new Object[0]) : AbstractC6392a.INSTANCE.d(C17905b.f167307B, new Object[0]) : AbstractC6392a.INSTANCE.d(C17905b.f167333x, new Object[0]);
    }

    /* renamed from: k, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: l, reason: from getter */
    public final AbstractC6392a getTipAmount() {
        return this.tipAmount;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getTipAmountVisibility() {
        return this.tipAmountVisibility;
    }

    /* renamed from: n, reason: from getter */
    public final boolean getTipAndRateButtonVisibility() {
        return this.tipAndRateButtonVisibility;
    }

    /* renamed from: o, reason: from getter */
    public final String getTotal() {
        return this.total;
    }

    /* renamed from: p, reason: from getter */
    public final boolean getIsDeclinedPaymentWidgetVisible() {
        return this.isDeclinedPaymentWidgetVisible;
    }

    /* renamed from: q, reason: from getter */
    public final boolean getIsDeliveryModeExist() {
        return this.isDeliveryModeExist;
    }

    public String toString() {
        return "OrdersItemDecorator(orderURL=" + this.orderURL + ", orderNumber=" + this.orderNumber + ", date=" + this.date + ", total=" + this.total + ", status=" + this.status + ", order=" + this.order + ", guid=" + this.guid + ", deliveryMode=" + this.deliveryMode + ", tipAmount=" + this.tipAmount + ", tipAmountVisibility=" + this.tipAmountVisibility + ", isTipped=" + this.isTipped + ", isRated=" + this.isRated + ", flowType=" + this.flowType + ", tipAndRateButtonVisibility=" + this.tipAndRateButtonVisibility + ", numberOfItems=" + this.numberOfItems + ", isDeclinedPaymentWidgetVisible=" + this.isDeclinedPaymentWidgetVisible + ", isDeliveryModeExist=" + this.isDeliveryModeExist + ')';
    }
}
