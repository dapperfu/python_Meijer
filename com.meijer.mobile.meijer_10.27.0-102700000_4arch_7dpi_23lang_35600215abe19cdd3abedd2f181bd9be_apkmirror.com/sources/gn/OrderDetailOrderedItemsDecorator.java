package gn;

import ak.AbstractC5607a;
import com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.CartItemsDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.EntryDecorator;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import ej.DeliveryMode;
import es.AbstractC13757b;
import gj.OrderDetail;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import wo.C17842a;
import wo.C17843b;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006 "}, d2 = {"Lgn/h;", "Les/b;", "Lak/a;", "formattedTotalItems", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;", "order", "Lgn/h$a$a;", "status", "<init>", "(Lak/a;Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;Lgn/h$a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lak/a;", "a", "()Lak/a;", "c", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;", "()Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;", "d", "Lgn/h$a$a;", "()Lgn/h$a$a;", "e", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gn.h, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class OrderDetailOrderedItemsDecorator extends AbstractC13757b {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f133855f = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a formattedTotalItems;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderConfirmationDecorator order;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Companion.OrderStatus status;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgn/h$a;", "", "<init>", "()V", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "mode", "Lgn/h$a$a;", "b", "(Ljava/lang/String;)Lgn/h$a$a;", "Lgj/c;", "orderDetail", "Lgn/h;", "a", "(Lgj/c;)Lgn/h;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gn.h$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lgn/h$a$a;", "", "", BarcodePickDeserializer.FIELD_ICON, "text", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gn.h$a$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class OrderStatus {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int icon;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int text;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OrderStatus)) {
                    return false;
                }
                OrderStatus orderStatus = (OrderStatus) other;
                return this.icon == orderStatus.icon && this.text == orderStatus.text;
            }

            /* renamed from: a, reason: from getter */
            public final int getIcon() {
                return this.icon;
            }

            /* renamed from: b, reason: from getter */
            public final int getText() {
                return this.text;
            }

            public int hashCode() {
                return (Integer.hashCode(this.icon) * 31) + Integer.hashCode(this.text);
            }

            public String toString() {
                return "OrderStatus(icon=" + this.icon + ", text=" + this.text + ')';
            }

            public OrderStatus(int i10, int i11) {
                this.icon = i10;
                this.text = i11;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final OrderStatus b(String mode) {
            return Intrinsics.e(mode, "delivery") ? new OrderStatus(Bj.i.f2685Q, C17843b.f166241D) : new OrderStatus(Bj.i.f2766n1, C17843b.f166241D);
        }

        public final OrderDetailOrderedItemsDecorator a(OrderDetail orderDetail) {
            List<EntryDecorator> listD;
            Intrinsics.j(orderDetail, "orderDetail");
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            int i10 = C17842a.f166237a;
            OrderConfirmationDecorator.Companion companion2 = OrderConfirmationDecorator.INSTANCE;
            CartItemsDecorator cartItems = OrderConfirmationDecorator.Companion.c(companion2, orderDetail, false, false, false, false, 30, null).getCartItems();
            AbstractC5607a abstractC5607aB = companion.b(i10, (cartItems == null || (listD = cartItems.d()) == null) ? 0 : listD.size(), new Object[0]);
            OrderConfirmationDecorator orderConfirmationDecoratorC = OrderConfirmationDecorator.Companion.c(companion2, orderDetail, false, false, false, false, 30, null);
            DeliveryMode deliveryMode = orderDetail.getDeliveryMode();
            return new OrderDetailOrderedItemsDecorator(abstractC5607aB, orderConfirmationDecoratorC, b(deliveryMode != null ? deliveryMode.getCode() : null));
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDetailOrderedItemsDecorator)) {
            return false;
        }
        OrderDetailOrderedItemsDecorator orderDetailOrderedItemsDecorator = (OrderDetailOrderedItemsDecorator) other;
        return Intrinsics.e(this.formattedTotalItems, orderDetailOrderedItemsDecorator.formattedTotalItems) && Intrinsics.e(this.order, orderDetailOrderedItemsDecorator.order) && Intrinsics.e(this.status, orderDetailOrderedItemsDecorator.status);
    }

    public OrderDetailOrderedItemsDecorator(AbstractC5607a formattedTotalItems, OrderConfirmationDecorator order, Companion.OrderStatus status) {
        Intrinsics.j(formattedTotalItems, "formattedTotalItems");
        Intrinsics.j(order, "order");
        Intrinsics.j(status, "status");
        this.formattedTotalItems = formattedTotalItems;
        this.order = order;
        this.status = status;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC5607a getFormattedTotalItems() {
        return this.formattedTotalItems;
    }

    /* renamed from: b, reason: from getter */
    public final OrderConfirmationDecorator getOrder() {
        return this.order;
    }

    /* renamed from: c, reason: from getter */
    public final Companion.OrderStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((this.formattedTotalItems.hashCode() * 31) + this.order.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "OrderDetailOrderedItemsDecorator(formattedTotalItems=" + this.formattedTotalItems + ", order=" + this.order + ", status=" + this.status + ')';
    }
}
