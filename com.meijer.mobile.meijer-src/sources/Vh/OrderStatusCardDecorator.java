package Vh;

import Ki.C;
import bk.AbstractC6392a;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import fj.DeliveryMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b \u0010&R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b$\u0010&R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b(\u0010&R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b(\u0010,\u001a\u0004\b'\u0010-¨\u0006."}, d2 = {"LVh/c;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "code", "Lfj/h;", "deliveryMode", "LKi/C;", BarcodePickDeserializer.FIELD_ICON, "Lbk/a;", "fulfillmentInfo", "fulfillmentTime", "orderTotal", "Lhj/f;", "orderStatus", "", "hasUserConfirmedSubstitutions", "<init>", "(Ljava/lang/String;Lfj/h;LKi/C;Lbk/a;Lbk/a;Lbk/a;Lhj/f;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lfj/h;", "()Lfj/h;", "c", "LKi/C;", "f", "()LKi/C;", "d", "Lbk/a;", "()Lbk/a;", "e", "h", "g", "Lhj/f;", "()Lhj/f;", "Z", "()Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Vh.c, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class OrderStatusCardDecorator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryMode deliveryMode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final C icon;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a fulfillmentInfo;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a fulfillmentTime;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a orderTotal;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final hj.f orderStatus;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasUserConfirmedSubstitutions;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderStatusCardDecorator)) {
            return false;
        }
        OrderStatusCardDecorator orderStatusCardDecorator = (OrderStatusCardDecorator) other;
        return Intrinsics.e(this.code, orderStatusCardDecorator.code) && Intrinsics.e(this.deliveryMode, orderStatusCardDecorator.deliveryMode) && Intrinsics.e(this.icon, orderStatusCardDecorator.icon) && Intrinsics.e(this.fulfillmentInfo, orderStatusCardDecorator.fulfillmentInfo) && Intrinsics.e(this.fulfillmentTime, orderStatusCardDecorator.fulfillmentTime) && Intrinsics.e(this.orderTotal, orderStatusCardDecorator.orderTotal) && this.orderStatus == orderStatusCardDecorator.orderStatus && this.hasUserConfirmedSubstitutions == orderStatusCardDecorator.hasUserConfirmedSubstitutions;
    }

    public OrderStatusCardDecorator(String code, DeliveryMode deliveryMode, C icon, AbstractC6392a fulfillmentInfo, AbstractC6392a fulfillmentTime, AbstractC6392a orderTotal, hj.f orderStatus, boolean z10) {
        Intrinsics.j(code, "code");
        Intrinsics.j(icon, "icon");
        Intrinsics.j(fulfillmentInfo, "fulfillmentInfo");
        Intrinsics.j(fulfillmentTime, "fulfillmentTime");
        Intrinsics.j(orderTotal, "orderTotal");
        Intrinsics.j(orderStatus, "orderStatus");
        this.code = code;
        this.deliveryMode = deliveryMode;
        this.icon = icon;
        this.fulfillmentInfo = fulfillmentInfo;
        this.fulfillmentTime = fulfillmentTime;
        this.orderTotal = orderTotal;
        this.orderStatus = orderStatus;
        this.hasUserConfirmedSubstitutions = z10;
    }

    /* renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: b, reason: from getter */
    public final DeliveryMode getDeliveryMode() {
        return this.deliveryMode;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC6392a getFulfillmentInfo() {
        return this.fulfillmentInfo;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC6392a getFulfillmentTime() {
        return this.fulfillmentTime;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getHasUserConfirmedSubstitutions() {
        return this.hasUserConfirmedSubstitutions;
    }

    /* renamed from: f, reason: from getter */
    public final C getIcon() {
        return this.icon;
    }

    /* renamed from: g, reason: from getter */
    public final hj.f getOrderStatus() {
        return this.orderStatus;
    }

    /* renamed from: h, reason: from getter */
    public final AbstractC6392a getOrderTotal() {
        return this.orderTotal;
    }

    public int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        DeliveryMode deliveryMode = this.deliveryMode;
        return ((((((((((((iHashCode + (deliveryMode == null ? 0 : deliveryMode.hashCode())) * 31) + this.icon.hashCode()) * 31) + this.fulfillmentInfo.hashCode()) * 31) + this.fulfillmentTime.hashCode()) * 31) + this.orderTotal.hashCode()) * 31) + this.orderStatus.hashCode()) * 31) + Boolean.hashCode(this.hasUserConfirmedSubstitutions);
    }

    public String toString() {
        return "OrderStatusCardDecorator(code=" + this.code + ", deliveryMode=" + this.deliveryMode + ", icon=" + this.icon + ", fulfillmentInfo=" + this.fulfillmentInfo + ", fulfillmentTime=" + this.fulfillmentTime + ", orderTotal=" + this.orderTotal + ", orderStatus=" + this.orderStatus + ", hasUserConfirmedSubstitutions=" + this.hasUserConfirmedSubstitutions + ')';
    }
}
