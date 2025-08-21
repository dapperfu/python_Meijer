package hn;

import bk.AbstractC6392a;
import com.meijer.mobile.meijer.Y;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import di.CustomerAddress;
import es.AbstractC13866b;
import fj.DeliveryMode;
import gj.PickupPerson;
import hj.OrderDetail;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001bB+\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001d"}, d2 = {"Lhn/f;", "Les/b;", "", BarcodePickDeserializer.FIELD_ICON, "Lbk/a;", "title", "subtitle", "actionText", "<init>", "(ILbk/a;Lbk/a;Lbk/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "c", "Lbk/a;", "d", "()Lbk/a;", "e", "a", "f", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hn.f, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class OrderDetailContactNumberDecorator extends AbstractC13866b {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f135914g;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int icon;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a title;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a subtitle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a actionText;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lhn/f$a;", "", "<init>", "()V", "Lhj/c;", "orderDetail", "Lbk/a;", "c", "(Lhj/c;)Lbk/a;", "", "editable", "b", "(Z)Lbk/a;", "Lhn/f;", "a", "(Lhj/c;)Lhn/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hn.f$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final AbstractC6392a b(boolean editable) {
            return null;
        }

        private Companion() {
        }

        public final OrderDetailContactNumberDecorator a(OrderDetail orderDetail) {
            Intrinsics.j(orderDetail, "orderDetail");
            return new OrderDetailContactNumberDecorator(Cj.i.f4734R0, AbstractC6392a.INSTANCE.d(Y.f100584O1, new Object[0]), c(orderDetail), b(orderDetail.getEditable()));
        }

        private final AbstractC6392a c(OrderDetail orderDetail) {
            String phoneNumber;
            AbstractC6392a abstractC6392aC;
            String phone;
            AbstractC6392a abstractC6392aC2;
            DeliveryMode deliveryMode = orderDetail.getDeliveryMode();
            if (deliveryMode != null && deliveryMode.c()) {
                CustomerAddress deliveryAddress = orderDetail.getDeliveryAddress();
                if (deliveryAddress != null && (phone = deliveryAddress.getPhone()) != null && (abstractC6392aC2 = AbstractC6392a.INSTANCE.c(Gk.a.f13085a.a(phone))) != null) {
                    return abstractC6392aC2;
                }
                return AbstractC6392a.INSTANCE.d(Y.f101218u8, new Object[0]);
            }
            PickupPerson pickUpPerson = orderDetail.getPickUpPerson();
            if (pickUpPerson != null && (phoneNumber = pickUpPerson.getPhoneNumber()) != null && (abstractC6392aC = AbstractC6392a.INSTANCE.c(Gk.a.f13085a.a(phoneNumber))) != null) {
                return abstractC6392aC;
            }
            return AbstractC6392a.INSTANCE.d(Y.f101218u8, new Object[0]);
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDetailContactNumberDecorator)) {
            return false;
        }
        OrderDetailContactNumberDecorator orderDetailContactNumberDecorator = (OrderDetailContactNumberDecorator) other;
        return this.icon == orderDetailContactNumberDecorator.icon && Intrinsics.e(this.title, orderDetailContactNumberDecorator.title) && Intrinsics.e(this.subtitle, orderDetailContactNumberDecorator.subtitle) && Intrinsics.e(this.actionText, orderDetailContactNumberDecorator.actionText);
    }

    static {
        int i10 = AbstractC13866b.f130668a;
        int i11 = AbstractC6392a.f60445b;
        f135914g = i10 | i11 | i11 | i11;
    }

    public OrderDetailContactNumberDecorator(int i10, AbstractC6392a title, AbstractC6392a subtitle, AbstractC6392a abstractC6392a) {
        Intrinsics.j(title, "title");
        Intrinsics.j(subtitle, "subtitle");
        this.icon = i10;
        this.title = title;
        this.subtitle = subtitle;
        this.actionText = abstractC6392a;
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
    public final AbstractC6392a getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC6392a getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.icon) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31;
        AbstractC6392a abstractC6392a = this.actionText;
        return iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode());
    }

    public String toString() {
        return "OrderDetailContactNumberDecorator(icon=" + this.icon + ", title=" + this.title + ", subtitle=" + this.subtitle + ", actionText=" + this.actionText + ')';
    }
}
