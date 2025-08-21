package hn;

import Tq.PointOfService;
import bk.AbstractC6392a;
import com.meijer.mobile.meijer.Y;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import di.CustomerAddress;
import di.Region;
import es.AbstractC13866b;
import fj.DeliveryMode;
import hj.OrderDetail;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import tk.C17269a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001cB3\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u001f"}, d2 = {"Lhn/e;", "Les/b;", "", BarcodePickDeserializer.FIELD_ICON, "Lbk/a;", "title", "subtitle", "actionText", "storeId", "<init>", "(ILbk/a;Lbk/a;Lbk/a;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "c", "Lbk/a;", "e", "()Lbk/a;", "d", "a", "f", "g", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hn.e, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class OrderDetailAddressDecorator extends AbstractC13866b {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f135907h;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int icon;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a title;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a subtitle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a actionText;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lhn/e$a;", "", "<init>", "()V", "Lhj/c;", "orderDetail", "", "b", "(Lhj/c;)Ljava/lang/String;", "Lhn/e;", "a", "(Lhj/c;)Lhn/e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hn.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final String b(OrderDetail orderDetail) {
            String postalCode;
            Pattern pattern = C17269a.US_ZIP_CODE_BASIC_RAW_REGEX;
            CustomerAddress deliveryAddress = orderDetail.getDeliveryAddress();
            String postalCode2 = deliveryAddress != null ? deliveryAddress.getPostalCode() : null;
            if (postalCode2 == null) {
                postalCode2 = "";
            }
            if (pattern.matcher(postalCode2).matches()) {
                CustomerAddress deliveryAddress2 = orderDetail.getDeliveryAddress();
                strN1 = deliveryAddress2 != null ? deliveryAddress2.getPostalCode() : null;
                return strN1 == null ? "" : strN1;
            }
            CustomerAddress deliveryAddress3 = orderDetail.getDeliveryAddress();
            if (deliveryAddress3 != null && (postalCode = deliveryAddress3.getPostalCode()) != null) {
                strN1 = StringsKt.N1(postalCode, 5);
            }
            return strN1 == null ? "" : strN1;
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
                int i10 = Cj.i.f4717L1;
                AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
                AbstractC6392a abstractC6392aD = companion.d(Y.f100689Tb, new Object[0]);
                PointOfService pointOfService = orderDetail.getPointOfService();
                if (pointOfService != null && (displayName = pointOfService.getDisplayName()) != null) {
                    str = displayName;
                }
                AbstractC6392a abstractC6392aC = companion.c(str);
                AbstractC6392a abstractC6392aD2 = companion.d(Y.f101193t3, new Object[0]);
                PointOfService pointOfService2 = orderDetail.getPointOfService();
                numValueOf = pointOfService2 != null ? Integer.valueOf(pointOfService2.getStoreId()) : null;
                Intrinsics.h(numValueOf, "null cannot be cast to non-null type kotlin.Int");
                return new OrderDetailAddressDecorator(i10, abstractC6392aD, abstractC6392aC, abstractC6392aD2, numValueOf.intValue());
            }
            int i11 = Cj.i.f4840x0;
            AbstractC6392a.Companion companion2 = AbstractC6392a.INSTANCE;
            CustomerAddress deliveryAddress = orderDetail.getDeliveryAddress();
            if (deliveryAddress == null || (line1 = deliveryAddress.getLine1()) == null) {
                line1 = "";
            }
            AbstractC6392a abstractC6392aC2 = companion2.c(line1);
            int i12 = Y.f100912f1;
            CustomerAddress deliveryAddress2 = orderDetail.getDeliveryAddress();
            String town = deliveryAddress2 != null ? deliveryAddress2.getTown() : null;
            if (town == null) {
                town = "";
            }
            CustomerAddress deliveryAddress3 = orderDetail.getDeliveryAddress();
            String isoCodeShort = (deliveryAddress3 == null || (region = deliveryAddress3.getRegion()) == null) ? null : region.getIsoCodeShort();
            AbstractC6392a abstractC6392aD3 = companion2.d(i12, town, isoCodeShort != null ? isoCodeShort : "", b(orderDetail));
            PointOfService pointOfService3 = orderDetail.getPointOfService();
            numValueOf = pointOfService3 != null ? Integer.valueOf(pointOfService3.getStoreId()) : null;
            Intrinsics.h(numValueOf, "null cannot be cast to non-null type kotlin.Int");
            return new OrderDetailAddressDecorator(i11, abstractC6392aC2, abstractC6392aD3, null, numValueOf.intValue());
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
        int i10 = AbstractC13866b.f130668a;
        int i11 = AbstractC6392a.f60445b;
        f135907h = i10 | i11 | i11 | i11;
    }

    public OrderDetailAddressDecorator(int i10, AbstractC6392a title, AbstractC6392a subtitle, AbstractC6392a abstractC6392a, int i11) {
        Intrinsics.j(title, "title");
        Intrinsics.j(subtitle, "subtitle");
        this.icon = i10;
        this.title = title;
        this.subtitle = subtitle;
        this.actionText = abstractC6392a;
        this.storeId = i11;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC6392a getActionText() {
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
    public final AbstractC6392a getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: e, reason: from getter */
    public final AbstractC6392a getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.icon) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31;
        AbstractC6392a abstractC6392a = this.actionText;
        return ((iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31) + Integer.hashCode(this.storeId);
    }

    public String toString() {
        return "OrderDetailAddressDecorator(icon=" + this.icon + ", title=" + this.title + ", subtitle=" + this.subtitle + ", actionText=" + this.actionText + ", storeId=" + this.storeId + ')';
    }
}
