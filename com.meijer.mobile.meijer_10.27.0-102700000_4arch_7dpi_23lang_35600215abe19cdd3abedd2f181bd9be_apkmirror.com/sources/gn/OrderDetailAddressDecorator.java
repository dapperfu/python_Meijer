package gn;

import Tq.PointOfService;
import ak.AbstractC5607a;
import ci.CustomerAddress;
import ci.Region;
import com.meijer.mobile.meijer.Y;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import ej.DeliveryMode;
import es.AbstractC13757b;
import gj.OrderDetail;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import sk.C16981a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001cB3\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u001f"}, d2 = {"Lgn/e;", "Les/b;", "", BarcodePickDeserializer.FIELD_ICON, "Lak/a;", "title", "subtitle", "actionText", "storeId", "<init>", "(ILak/a;Lak/a;Lak/a;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "c", "Lak/a;", "e", "()Lak/a;", "d", "a", "f", "g", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gn.e, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class OrderDetailAddressDecorator extends AbstractC13757b {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f133839h;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int icon;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a title;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a subtitle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a actionText;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lgn/e$a;", "", "<init>", "()V", "Lgj/c;", "orderDetail", "", "b", "(Lgj/c;)Ljava/lang/String;", "Lgn/e;", "a", "(Lgj/c;)Lgn/e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gn.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final String b(OrderDetail orderDetail) {
            String postalCode;
            Pattern pattern = C16981a.US_ZIP_CODE_BASIC_RAW_REGEX;
            CustomerAddress deliveryAddress = orderDetail.getDeliveryAddress();
            String postalCode2 = deliveryAddress != null ? deliveryAddress.getPostalCode() : null;
            if (postalCode2 == null) {
                postalCode2 = "";
            }
            if (pattern.matcher(postalCode2).matches()) {
                CustomerAddress deliveryAddress2 = orderDetail.getDeliveryAddress();
                strJ1 = deliveryAddress2 != null ? deliveryAddress2.getPostalCode() : null;
                return strJ1 == null ? "" : strJ1;
            }
            CustomerAddress deliveryAddress3 = orderDetail.getDeliveryAddress();
            if (deliveryAddress3 != null && (postalCode = deliveryAddress3.getPostalCode()) != null) {
                strJ1 = StringsKt.J1(postalCode, 5);
            }
            return strJ1 == null ? "" : strJ1;
        }

        public final OrderDetailAddressDecorator a(OrderDetail orderDetail) {
            String str;
            Integer numValueOf;
            String displayName;
            String line1;
            Region region;
            Intrinsics.j(orderDetail, "orderDetail");
            DeliveryMode deliveryMode = orderDetail.getDeliveryMode();
            str = "";
            if (!Intrinsics.e(deliveryMode != null ? deliveryMode.getCode() : null, "delivery")) {
                int i10 = Bj.i.f2672L1;
                AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
                AbstractC5607a abstractC5607aD = companion.d(Y.f99770Qb, new Object[0]);
                PointOfService pointOfService = orderDetail.getPointOfService();
                if (pointOfService != null && (displayName = pointOfService.getDisplayName()) != null) {
                    str = displayName;
                }
                AbstractC5607a abstractC5607aC = companion.c(str);
                AbstractC5607a abstractC5607aD2 = companion.d(Y.f100331t3, new Object[0]);
                PointOfService pointOfService2 = orderDetail.getPointOfService();
                numValueOf = pointOfService2 != null ? Integer.valueOf(pointOfService2.getStoreId()) : null;
                Intrinsics.h(numValueOf, "null cannot be cast to non-null type kotlin.Int");
                return new OrderDetailAddressDecorator(i10, abstractC5607aD, abstractC5607aC, abstractC5607aD2, numValueOf.intValue());
            }
            int i11 = Bj.i.f2795x0;
            AbstractC5607a.Companion companion2 = AbstractC5607a.INSTANCE;
            CustomerAddress deliveryAddress = orderDetail.getDeliveryAddress();
            if (deliveryAddress == null || (line1 = deliveryAddress.getLine1()) == null) {
                line1 = "";
            }
            AbstractC5607a abstractC5607aC2 = companion2.c(line1);
            int i12 = Y.f100050f1;
            CustomerAddress deliveryAddress2 = orderDetail.getDeliveryAddress();
            String town = deliveryAddress2 != null ? deliveryAddress2.getTown() : null;
            if (town == null) {
                town = "";
            }
            CustomerAddress deliveryAddress3 = orderDetail.getDeliveryAddress();
            String isoCodeShort = (deliveryAddress3 == null || (region = deliveryAddress3.getRegion()) == null) ? null : region.getIsoCodeShort();
            AbstractC5607a abstractC5607aD3 = companion2.d(i12, town, isoCodeShort != null ? isoCodeShort : "", b(orderDetail));
            PointOfService pointOfService3 = orderDetail.getPointOfService();
            numValueOf = pointOfService3 != null ? Integer.valueOf(pointOfService3.getStoreId()) : null;
            Intrinsics.h(numValueOf, "null cannot be cast to non-null type kotlin.Int");
            return new OrderDetailAddressDecorator(i11, abstractC5607aC2, abstractC5607aD3, null, numValueOf.intValue());
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDetailAddressDecorator)) {
            return false;
        }
        OrderDetailAddressDecorator orderDetailAddressDecorator = (OrderDetailAddressDecorator) other;
        return this.icon == orderDetailAddressDecorator.icon && Intrinsics.e(this.title, orderDetailAddressDecorator.title) && Intrinsics.e(this.subtitle, orderDetailAddressDecorator.subtitle) && Intrinsics.e(this.actionText, orderDetailAddressDecorator.actionText) && this.storeId == orderDetailAddressDecorator.storeId;
    }

    static {
        int i10 = AbstractC13757b.f129827a;
        int i11 = AbstractC5607a.f45514b;
        f133839h = i10 | i11 | i11 | i11;
    }

    public OrderDetailAddressDecorator(int i10, AbstractC5607a title, AbstractC5607a subtitle, AbstractC5607a abstractC5607a, int i11) {
        Intrinsics.j(title, "title");
        Intrinsics.j(subtitle, "subtitle");
        this.icon = i10;
        this.title = title;
        this.subtitle = subtitle;
        this.actionText = abstractC5607a;
        this.storeId = i11;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC5607a getActionText() {
        return this.actionText;
    }

    /* renamed from: b, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* renamed from: c, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC5607a getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: e, reason: from getter */
    public final AbstractC5607a getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.icon) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31;
        AbstractC5607a abstractC5607a = this.actionText;
        return ((iHashCode + (abstractC5607a == null ? 0 : abstractC5607a.hashCode())) * 31) + Integer.hashCode(this.storeId);
    }

    public String toString() {
        return "OrderDetailAddressDecorator(icon=" + this.icon + ", title=" + this.title + ", subtitle=" + this.subtitle + ", actionText=" + this.actionText + ", storeId=" + this.storeId + ')';
    }
}
