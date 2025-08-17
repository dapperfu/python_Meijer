package es;

import es.AbstractC13761f;
import hi.C14476c;
import hi.C14480g;
import hi.InterfaceC14474a;
import hi.TrackingData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import tp.Builder;
import tp.EnumC17127a;
import uo.OrderOutOfStockItem;
import vo.OrderSubstitutionItem;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Les/f;", "Lhi/a;", "", "orderNumber", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getOrderNumber", "()Ljava/lang/String;", "b", "c", "d", "e", "f", "Les/f$a;", "Les/f$b;", "Les/f$c;", "Les/f$d;", "Les/f$e;", "Les/f$f;", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: es.f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC13761f implements InterfaceC14474a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String orderNumber;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Les/f$a;", "Les/f;", "", "orderNumber", "Lhi/f;", "trackingData", "<init>", "(Ljava/lang/String;Lhi/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "Lhi/f;", "a", "()Lhi/f;", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: es.f$a, reason: from toString */
    public static final /* data */ class Dismiss extends AbstractC13761f {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String orderNumber;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final TrackingData trackingData;

        public /* synthetic */ Dismiss(String str, TrackingData trackingData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : trackingData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dismiss)) {
                return false;
            }
            Dismiss dismiss = (Dismiss) other;
            return Intrinsics.e(this.orderNumber, dismiss.orderNumber) && Intrinsics.e(this.trackingData, dismiss.trackingData);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dismiss(String orderNumber, TrackingData trackingData) {
            super(orderNumber, null);
            Intrinsics.j(orderNumber, "orderNumber");
            this.orderNumber = orderNumber;
            this.trackingData = trackingData;
        }

        @Override // hi.InterfaceC14474a
        /* renamed from: a, reason: from getter */
        public TrackingData getTrackingData() {
            return this.trackingData;
        }

        /* renamed from: b, reason: from getter */
        public String getOrderNumber() {
            return this.orderNumber;
        }

        public int hashCode() {
            int iHashCode = this.orderNumber.hashCode() * 31;
            TrackingData trackingData = this.trackingData;
            return iHashCode + (trackingData == null ? 0 : trackingData.hashCode());
        }

        public String toString() {
            return "Dismiss(orderNumber=" + this.orderNumber + ", trackingData=" + this.trackingData + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Les/f$b;", "Les/f;", "", "orderNumber", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "getOrderNumber", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: es.f$b, reason: from toString */
    public static final /* data */ class OrderRatedAndTipped extends AbstractC13761f {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String orderNumber;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OrderRatedAndTipped) && Intrinsics.e(this.orderNumber, ((OrderRatedAndTipped) other).orderNumber);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderRatedAndTipped(String orderNumber) {
            super(orderNumber, null);
            Intrinsics.j(orderNumber, "orderNumber");
            this.orderNumber = orderNumber;
        }

        public int hashCode() {
            return this.orderNumber.hashCode();
        }

        public String toString() {
            return "OrderRatedAndTipped(orderNumber=" + this.orderNumber + ')';
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Les/f$c;", "Les/f;", "", "orderNumber", "Ltp/b;", "rateAndTipBuilder", "Ltp/a;", "flowType", "Lhi/f;", "trackingData", "<init>", "(Ljava/lang/String;Ltp/b;Ltp/a;Lhi/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "e", "c", "Ltp/b;", "f", "()Ltp/b;", "d", "Ltp/a;", "()Ltp/a;", "Lhi/f;", "a", "()Lhi/f;", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: es.f$c, reason: from toString */
    public static final /* data */ class RateAndTip extends AbstractC13761f {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String orderNumber;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Builder rateAndTipBuilder;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC17127a flowType;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final TrackingData trackingData;

        public /* synthetic */ RateAndTip(final String str, final Builder builder, EnumC17127a enumC17127a, TrackingData trackingData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, builder, enumC17127a, (i10 & 8) != 0 ? C14480g.a(C14476c.a("event: order rating and tips"), new Function1() { // from class: es.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC13761f.RateAndTip.c(builder, str, (TrackingData) obj);
                }
            }) : trackingData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RateAndTip)) {
                return false;
            }
            RateAndTip rateAndTip = (RateAndTip) other;
            return Intrinsics.e(this.orderNumber, rateAndTip.orderNumber) && Intrinsics.e(this.rateAndTipBuilder, rateAndTip.rateAndTipBuilder) && this.flowType == rateAndTip.flowType && Intrinsics.e(this.trackingData, rateAndTip.trackingData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Builder builder, String str, TrackingData TrackingData) {
            Intrinsics.j(TrackingData, "$this$TrackingData");
            String fulfillmentType = builder.getFulfillmentType();
            if (fulfillmentType == null) {
                fulfillmentType = "None selected";
            }
            TrackingData.h("fulfillmentType", fulfillmentType);
            TrackingData.h("purchaseID", str);
            return Unit.f142422a;
        }

        @Override // hi.InterfaceC14474a
        /* renamed from: a, reason: from getter */
        public TrackingData getTrackingData() {
            return this.trackingData;
        }

        /* renamed from: d, reason: from getter */
        public final EnumC17127a getFlowType() {
            return this.flowType;
        }

        /* renamed from: e, reason: from getter */
        public String getOrderNumber() {
            return this.orderNumber;
        }

        /* renamed from: f, reason: from getter */
        public final Builder getRateAndTipBuilder() {
            return this.rateAndTipBuilder;
        }

        public int hashCode() {
            int iHashCode = ((((this.orderNumber.hashCode() * 31) + this.rateAndTipBuilder.hashCode()) * 31) + this.flowType.hashCode()) * 31;
            TrackingData trackingData = this.trackingData;
            return iHashCode + (trackingData == null ? 0 : trackingData.hashCode());
        }

        public String toString() {
            return "RateAndTip(orderNumber=" + this.orderNumber + ", rateAndTipBuilder=" + this.rateAndTipBuilder + ", flowType=" + this.flowType + ", trackingData=" + this.trackingData + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RateAndTip(String orderNumber, Builder rateAndTipBuilder, EnumC17127a flowType, TrackingData trackingData) {
            super(orderNumber, null);
            Intrinsics.j(orderNumber, "orderNumber");
            Intrinsics.j(rateAndTipBuilder, "rateAndTipBuilder");
            Intrinsics.j(flowType, "flowType");
            this.orderNumber = orderNumber;
            this.rateAndTipBuilder = rateAndTipBuilder;
            this.flowType = flowType;
            this.trackingData = trackingData;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0014\u0010\n¨\u0006\u0018"}, d2 = {"Les/f$d;", "Les/f;", "", "orderNumber", "", "viewDetails", "previousTrackAction", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "Z", "d", "()Z", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: es.f$d, reason: from toString */
    public static final /* data */ class ViewDeclinedPayment extends AbstractC13761f {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String orderNumber;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean viewDetails;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String previousTrackAction;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewDeclinedPayment)) {
                return false;
            }
            ViewDeclinedPayment viewDeclinedPayment = (ViewDeclinedPayment) other;
            return Intrinsics.e(this.orderNumber, viewDeclinedPayment.orderNumber) && this.viewDetails == viewDeclinedPayment.viewDetails && Intrinsics.e(this.previousTrackAction, viewDeclinedPayment.previousTrackAction);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewDeclinedPayment(String orderNumber, boolean z10, String previousTrackAction) {
            super(orderNumber, null);
            Intrinsics.j(orderNumber, "orderNumber");
            Intrinsics.j(previousTrackAction, "previousTrackAction");
            this.orderNumber = orderNumber;
            this.viewDetails = z10;
            this.previousTrackAction = previousTrackAction;
        }

        /* renamed from: b, reason: from getter */
        public String getOrderNumber() {
            return this.orderNumber;
        }

        /* renamed from: c, reason: from getter */
        public final String getPreviousTrackAction() {
            return this.previousTrackAction;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getViewDetails() {
            return this.viewDetails;
        }

        public int hashCode() {
            return (((this.orderNumber.hashCode() * 31) + Boolean.hashCode(this.viewDetails)) * 31) + this.previousTrackAction.hashCode();
        }

        public String toString() {
            return "ViewDeclinedPayment(orderNumber=" + this.orderNumber + ", viewDetails=" + this.viewDetails + ", previousTrackAction=" + this.previousTrackAction + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Les/f$e;", "Les/f;", "", "orderNumber", "", "viewDetails", "previousTrackAction", "Lhi/f;", "trackingData", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Lhi/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "Z", "d", "()Z", "e", "Lhi/f;", "a", "()Lhi/f;", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: es.f$e, reason: from toString */
    public static final /* data */ class ViewOrderDetail extends AbstractC13761f {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String orderNumber;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean viewDetails;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String previousTrackAction;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final TrackingData trackingData;

        public /* synthetic */ ViewOrderDetail(String str, boolean z10, String str2, TrackingData trackingData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z10, str2, (i10 & 8) != 0 ? null : trackingData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewOrderDetail)) {
                return false;
            }
            ViewOrderDetail viewOrderDetail = (ViewOrderDetail) other;
            return Intrinsics.e(this.orderNumber, viewOrderDetail.orderNumber) && this.viewDetails == viewOrderDetail.viewDetails && Intrinsics.e(this.previousTrackAction, viewOrderDetail.previousTrackAction) && Intrinsics.e(this.trackingData, viewOrderDetail.trackingData);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewOrderDetail(String orderNumber, boolean z10, String previousTrackAction, TrackingData trackingData) {
            super(orderNumber, null);
            Intrinsics.j(orderNumber, "orderNumber");
            Intrinsics.j(previousTrackAction, "previousTrackAction");
            this.orderNumber = orderNumber;
            this.viewDetails = z10;
            this.previousTrackAction = previousTrackAction;
            this.trackingData = trackingData;
        }

        @Override // hi.InterfaceC14474a
        /* renamed from: a, reason: from getter */
        public TrackingData getTrackingData() {
            return this.trackingData;
        }

        /* renamed from: b, reason: from getter */
        public String getOrderNumber() {
            return this.orderNumber;
        }

        /* renamed from: c, reason: from getter */
        public final String getPreviousTrackAction() {
            return this.previousTrackAction;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getViewDetails() {
            return this.viewDetails;
        }

        public int hashCode() {
            int iHashCode = ((((this.orderNumber.hashCode() * 31) + Boolean.hashCode(this.viewDetails)) * 31) + this.previousTrackAction.hashCode()) * 31;
            TrackingData trackingData = this.trackingData;
            return iHashCode + (trackingData == null ? 0 : trackingData.hashCode());
        }

        public String toString() {
            return "ViewOrderDetail(orderNumber=" + this.orderNumber + ", viewDetails=" + this.viewDetails + ", previousTrackAction=" + this.previousTrackAction + ", trackingData=" + this.trackingData + ')';
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u0012R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b'\u0010\u0012R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b%\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Les/f$f;", "Les/f;", "", "orderNumber", "Lvo/b;", "substitutionScreenType", "", "Lvo/a;", "orderSubstitutionItemList", "pickupPersonName", "fulfillmentType", "Luo/a;", "orderOutOfStockItemList", "Lhi/f;", "trackingData", "<init>", "(Ljava/lang/String;Lvo/b;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lhi/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "d", "c", "Lvo/b;", "h", "()Lvo/b;", "Ljava/util/List;", "f", "()Ljava/util/List;", "e", "g", "getFulfillmentType", "Lhi/f;", "a", "()Lhi/f;", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: es.f$f, reason: collision with other inner class name and from toString */
    public static final /* data */ class ViewSubstitutions extends AbstractC13761f {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String orderNumber;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final vo.b substitutionScreenType;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<OrderSubstitutionItem> orderSubstitutionItemList;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String pickupPersonName;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fulfillmentType;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<OrderOutOfStockItem> orderOutOfStockItemList;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final TrackingData trackingData;

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ ViewSubstitutions(final String str, vo.b bVar, List list, String str2, final String str3, List list2, TrackingData trackingData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            TrackingData trackingDataA;
            if ((i10 & 64) != 0) {
                trackingDataA = C14480g.a(C14476c.a(bVar == vo.b.f164895g ? "event: home flybuy: view substitutions" : "event: home flybuy: confirm substitutions"), new Function1() { // from class: es.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC13761f.ViewSubstitutions.c(str3, str, (TrackingData) obj);
                    }
                });
            } else {
                trackingDataA = trackingData;
            }
            this(str, bVar, list, str2, str3, list2, trackingDataA);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewSubstitutions)) {
                return false;
            }
            ViewSubstitutions viewSubstitutions = (ViewSubstitutions) other;
            return Intrinsics.e(this.orderNumber, viewSubstitutions.orderNumber) && this.substitutionScreenType == viewSubstitutions.substitutionScreenType && Intrinsics.e(this.orderSubstitutionItemList, viewSubstitutions.orderSubstitutionItemList) && Intrinsics.e(this.pickupPersonName, viewSubstitutions.pickupPersonName) && Intrinsics.e(this.fulfillmentType, viewSubstitutions.fulfillmentType) && Intrinsics.e(this.orderOutOfStockItemList, viewSubstitutions.orderOutOfStockItemList) && Intrinsics.e(this.trackingData, viewSubstitutions.trackingData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(String str, String str2, TrackingData TrackingData) {
            Intrinsics.j(TrackingData, "$this$TrackingData");
            TrackingData.h("fulfillmentType", str);
            TrackingData.h("purchaseID", str2);
            return Unit.f142422a;
        }

        @Override // hi.InterfaceC14474a
        /* renamed from: a, reason: from getter */
        public TrackingData getTrackingData() {
            return this.trackingData;
        }

        /* renamed from: d, reason: from getter */
        public String getOrderNumber() {
            return this.orderNumber;
        }

        public final List<OrderOutOfStockItem> e() {
            return this.orderOutOfStockItemList;
        }

        public final List<OrderSubstitutionItem> f() {
            return this.orderSubstitutionItemList;
        }

        /* renamed from: g, reason: from getter */
        public final String getPickupPersonName() {
            return this.pickupPersonName;
        }

        /* renamed from: h, reason: from getter */
        public final vo.b getSubstitutionScreenType() {
            return this.substitutionScreenType;
        }

        public int hashCode() {
            int iHashCode = this.orderNumber.hashCode() * 31;
            vo.b bVar = this.substitutionScreenType;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            List<OrderSubstitutionItem> list = this.orderSubstitutionItemList;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.pickupPersonName;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.fulfillmentType;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<OrderOutOfStockItem> list2 = this.orderOutOfStockItemList;
            int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
            TrackingData trackingData = this.trackingData;
            return iHashCode6 + (trackingData != null ? trackingData.hashCode() : 0);
        }

        public String toString() {
            return "ViewSubstitutions(orderNumber=" + this.orderNumber + ", substitutionScreenType=" + this.substitutionScreenType + ", orderSubstitutionItemList=" + this.orderSubstitutionItemList + ", pickupPersonName=" + this.pickupPersonName + ", fulfillmentType=" + this.fulfillmentType + ", orderOutOfStockItemList=" + this.orderOutOfStockItemList + ", trackingData=" + this.trackingData + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewSubstitutions(String orderNumber, vo.b bVar, List<OrderSubstitutionItem> list, String str, String str2, List<OrderOutOfStockItem> list2, TrackingData trackingData) {
            super(orderNumber, null);
            Intrinsics.j(orderNumber, "orderNumber");
            this.orderNumber = orderNumber;
            this.substitutionScreenType = bVar;
            this.orderSubstitutionItemList = list;
            this.pickupPersonName = str;
            this.fulfillmentType = str2;
            this.orderOutOfStockItemList = list2;
            this.trackingData = trackingData;
        }
    }

    public /* synthetic */ AbstractC13761f(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private AbstractC13761f(String str) {
        this.orderNumber = str;
    }
}
