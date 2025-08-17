package es;

import ak.AbstractC5607a;
import as.C6152f;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import ej.DeliveryMode;
import gj.OrderDetail;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import vk.C17590a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001\u001fB5\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u001d¨\u0006!"}, d2 = {"Les/c;", "Les/b;", "", BarcodePickDeserializer.FIELD_ICON, "", "isRescheduled", "Lak/a;", "title", "originalPickUp", "earlyDeliveryPossible", "<init>", "(IZLak/a;Lak/a;Lak/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "I", "c", "Z", "e", "()Z", "d", "Lak/a;", "()Lak/a;", "f", "a", "g", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: es.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes11.dex */
public final /* data */ class OrderDetailStatusDayDateTimeDecorator extends AbstractC13757b {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f129829h = AbstractC5607a.f45514b;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int icon;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isRescheduled;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a title;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a originalPickUp;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a earlyDeliveryPossible;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Les/c$a;", "", "<init>", "()V", "Lgj/f;", "orderStatus", "Lej/h;", "deliveryMode", "", "date", "j$/time/LocalTime", "startTime", "endTime", "Lak/a;", "e", "(Lgj/f;Lej/h;Ljava/lang/String;Lj$/time/LocalTime;Lj$/time/LocalTime;)Lak/a;", "", "fromHomeOrderStatusComponent", "d", "(Ljava/lang/String;Lj$/time/LocalTime;Lj$/time/LocalTime;Z)Lak/a;", "earlyDelivery", "c", "(Lgj/f;Z)Lak/a;", "Lgj/c;", "orderDetail", "Les/c;", "a", "(Lgj/c;Z)Les/c;", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: es.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final ak.AbstractC5607a e(gj.f r4, ej.DeliveryMode r5, java.lang.String r6, j$.time.LocalTime r7, j$.time.LocalTime r8) {
            /*
                r3 = this;
                r0 = 3
                r1 = 1
                r2 = 0
                if (r5 == 0) goto L3b
                boolean r5 = r5.c()
                if (r5 != r1) goto L3b
                int[] r5 = es.OrderDetailStatusDayDateTimeDecorator.Companion.C2055a.$EnumSwitchMapping$0
                int r4 = r4.ordinal()
                r4 = r5[r4]
                if (r4 == r1) goto L30
                r5 = 2
                if (r4 == r5) goto L30
                if (r4 == r0) goto L25
                ak.a$a r4 = ak.AbstractC5607a.INSTANCE
                int r5 = as.C6152f.f59463s
                java.lang.Object[] r0 = new java.lang.Object[r2]
                ak.a r4 = r4.d(r5, r0)
                goto L6a
            L25:
                ak.a$a r4 = ak.AbstractC5607a.INSTANCE
                int r5 = as.C6152f.f59466v
                java.lang.Object[] r0 = new java.lang.Object[r2]
                ak.a r4 = r4.d(r5, r0)
                goto L6a
            L30:
                ak.a$a r4 = ak.AbstractC5607a.INSTANCE
                int r5 = as.C6152f.f59464t
                java.lang.Object[] r0 = new java.lang.Object[r2]
                ak.a r4 = r4.d(r5, r0)
                goto L6a
            L3b:
                int[] r5 = es.OrderDetailStatusDayDateTimeDecorator.Companion.C2055a.$EnumSwitchMapping$0
                int r4 = r4.ordinal()
                r4 = r5[r4]
                if (r4 == r1) goto L60
                if (r4 == r0) goto L55
                r5 = 4
                if (r4 == r5) goto L60
                ak.a$a r4 = ak.AbstractC5607a.INSTANCE
                int r5 = as.C6152f.f59468x
                java.lang.Object[] r0 = new java.lang.Object[r2]
                ak.a r4 = r4.d(r5, r0)
                goto L6a
            L55:
                ak.a$a r4 = ak.AbstractC5607a.INSTANCE
                int r5 = as.C6152f.f59465u
                java.lang.Object[] r0 = new java.lang.Object[r2]
                ak.a r4 = r4.d(r5, r0)
                goto L6a
            L60:
                ak.a$a r4 = ak.AbstractC5607a.INSTANCE
                int r5 = as.C6152f.f59467w
                java.lang.Object[] r0 = new java.lang.Object[r2]
                ak.a r4 = r4.d(r5, r0)
            L6a:
                ak.a$a r5 = ak.AbstractC5607a.INSTANCE
                int r0 = as.C6152f.f59452h
                java.lang.String r7 = es.L.a(r7)
                java.lang.String r8 = es.L.a(r8)
                java.lang.Object[] r4 = new java.lang.Object[]{r4, r6, r7, r8}
                ak.a r4 = r5.d(r0, r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: es.OrderDetailStatusDayDateTimeDecorator.Companion.e(gj.f, ej.h, java.lang.String, j$.time.LocalTime, j$.time.LocalTime):ak.a");
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: es.c$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C2055a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[gj.f.values().length];
                try {
                    iArr[gj.f.f133631n.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[gj.f.f133630m.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[gj.f.f133626i.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[gj.f.f133632o.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public static /* synthetic */ OrderDetailStatusDayDateTimeDecorator b(Companion companion, OrderDetail orderDetail, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return companion.a(orderDetail, z10);
        }

        private final AbstractC5607a c(gj.f orderStatus, boolean earlyDelivery) {
            if (orderStatus == gj.f.f133633p || !earlyDelivery) {
                return null;
            }
            return AbstractC5607a.INSTANCE.d(C6152f.f59454j, new Object[0]);
        }

        private final AbstractC5607a d(String date, LocalTime startTime, LocalTime endTime, boolean fromHomeOrderStatusComponent) {
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            Integer numValueOf = Integer.valueOf(C6152f.f59453i);
            if (!fromHomeOrderStatusComponent) {
                numValueOf = null;
            }
            return companion.d(numValueOf != null ? numValueOf.intValue() : C6152f.f59455k, date, L.a(startTime), L.a(endTime));
        }

        public final OrderDetailStatusDayDateTimeDecorator a(OrderDetail orderDetail, boolean fromHomeOrderStatusComponent) {
            Intrinsics.j(orderDetail, "orderDetail");
            DateTimeFormatter dateTimeFormatterD = C17590a.f164803a.d();
            int i10 = Bj.i.f2637A;
            boolean z10 = orderDetail.getOrderStatus() == gj.f.f133626i;
            Companion companion = OrderDetailStatusDayDateTimeDecorator.INSTANCE;
            gj.f orderStatus = orderDetail.getOrderStatus();
            DeliveryMode deliveryMode = orderDetail.getDeliveryMode();
            LocalDate pickupDate = orderDetail.getPickUpSlotInfo().getPickupDate();
            String str = pickupDate != null ? pickupDate.format(dateTimeFormatterD) : null;
            if (str == null) {
                str = "";
            }
            AbstractC5607a abstractC5607aE = companion.e(orderStatus, deliveryMode, str, orderDetail.getPickUpSlotInfo().getPickupStartTime(), orderDetail.getPickUpSlotInfo().getPickupEndTime());
            LocalDate pickupDate2 = orderDetail.getOriginalPickUpSlotInfo().getPickupDate();
            String str2 = pickupDate2 != null ? pickupDate2.format(dateTimeFormatterD) : null;
            return new OrderDetailStatusDayDateTimeDecorator(i10, z10, abstractC5607aE, companion.d(str2 != null ? str2 : "", orderDetail.getOriginalPickUpSlotInfo().getPickupStartTime(), orderDetail.getOriginalPickUpSlotInfo().getPickupEndTime(), fromHomeOrderStatusComponent), companion.c(orderDetail.getOrderStatus(), orderDetail.getPickUpSlotInfo().getEarlyDelivery()));
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDetailStatusDayDateTimeDecorator)) {
            return false;
        }
        OrderDetailStatusDayDateTimeDecorator orderDetailStatusDayDateTimeDecorator = (OrderDetailStatusDayDateTimeDecorator) other;
        return this.icon == orderDetailStatusDayDateTimeDecorator.icon && this.isRescheduled == orderDetailStatusDayDateTimeDecorator.isRescheduled && Intrinsics.e(this.title, orderDetailStatusDayDateTimeDecorator.title) && Intrinsics.e(this.originalPickUp, orderDetailStatusDayDateTimeDecorator.originalPickUp) && Intrinsics.e(this.earlyDeliveryPossible, orderDetailStatusDayDateTimeDecorator.earlyDeliveryPossible);
    }

    public OrderDetailStatusDayDateTimeDecorator(int i10, boolean z10, AbstractC5607a title, AbstractC5607a originalPickUp, AbstractC5607a abstractC5607a) {
        Intrinsics.j(title, "title");
        Intrinsics.j(originalPickUp, "originalPickUp");
        this.icon = i10;
        this.isRescheduled = z10;
        this.title = title;
        this.originalPickUp = originalPickUp;
        this.earlyDeliveryPossible = abstractC5607a;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC5607a getEarlyDeliveryPossible() {
        return this.earlyDeliveryPossible;
    }

    /* renamed from: b, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC5607a getOriginalPickUp() {
        return this.originalPickUp;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC5607a getTitle() {
        return this.title;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsRescheduled() {
        return this.isRescheduled;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.icon) * 31) + Boolean.hashCode(this.isRescheduled)) * 31) + this.title.hashCode()) * 31) + this.originalPickUp.hashCode()) * 31;
        AbstractC5607a abstractC5607a = this.earlyDeliveryPossible;
        return iHashCode + (abstractC5607a == null ? 0 : abstractC5607a.hashCode());
    }

    public String toString() {
        return "OrderDetailStatusDayDateTimeDecorator(icon=" + this.icon + ", isRescheduled=" + this.isRescheduled + ", title=" + this.title + ", originalPickUp=" + this.originalPickUp + ", earlyDeliveryPossible=" + this.earlyDeliveryPossible + ')';
    }
}
