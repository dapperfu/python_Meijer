package com.meijer.mobile.meijer.activity.orderoptions;

import Cm.FulfillmentSlotDayDecorator;
import bk.AbstractC6392a;
import jj.FulfillmentSlot;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0011B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/t;", "", "", "weekDay", "Lbk/a;", "startTime", "<init>", "(Ljava/lang/String;Lbk/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getWeekDay", "b", "Lbk/a;", "getStartTime", "()Lbk/a;", "availabilityText", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.orderoptions.t, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class OrderOptionsTimeDecorator {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f110843d = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String weekDay;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a startTime;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/t$a;", "", "<init>", "()V", "j$/time/LocalTime", "time", "Lbk/a;", "b", "(Lj$/time/LocalTime;)Lbk/a;", "Ljj/c;", "fulfillmentSlot", "Lcom/meijer/mobile/meijer/activity/orderoptions/t;", "a", "(Ljj/c;)Lcom/meijer/mobile/meijer/activity/orderoptions/t;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.t$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OrderOptionsTimeDecorator a(FulfillmentSlot fulfillmentSlot) {
            return new OrderOptionsTimeDecorator(fulfillmentSlot != null ? FulfillmentSlotDayDecorator.Companion.b(FulfillmentSlotDayDecorator.INSTANCE, fulfillmentSlot.getDate(), false, 2, null) : null, fulfillmentSlot != null ? OrderOptionsTimeDecorator.INSTANCE.b(fulfillmentSlot.getStartTime()) : null);
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final bk.AbstractC6392a b(j$.time.LocalTime r5) {
            /*
                r4 = this;
                bk.a$a r0 = bk.AbstractC6392a.INSTANCE
                int r1 = com.meijer.mobile.meijer.Y.f100848bh
                if (r5 == 0) goto L45
                int r2 = r5.getHour()
                r3 = 12
                if (r2 != r3) goto L16
                int r2 = r5.getMinute()
                if (r2 != 0) goto L16
                r2 = 0
                goto L17
            L16:
                r2 = r5
            L17:
                if (r2 == 0) goto L45
                int r5 = r5.getMinute()
                if (r5 != 0) goto L26
                wk.a r5 = wk.C17898a.f167225a
                j$.time.format.DateTimeFormatter r5 = r5.B()
                goto L2c
            L26:
                wk.a r5 = wk.C17898a.f167225a
                j$.time.format.DateTimeFormatter r5 = r5.q()
            L2c:
                java.lang.String r5 = r2.format(r5)
                if (r5 == 0) goto L45
                java.util.Locale r2 = java.util.Locale.US
                java.lang.String r3 = "US"
                kotlin.jvm.internal.Intrinsics.i(r2, r3)
                java.lang.String r5 = r5.toLowerCase(r2)
                java.lang.String r2 = "toLowerCase(...)"
                kotlin.jvm.internal.Intrinsics.i(r5, r2)
                if (r5 == 0) goto L45
                goto L4e
            L45:
                int r5 = com.meijer.mobile.meijer.Y.f100868ch
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                bk.a r5 = r0.d(r5, r2)
            L4e:
                java.lang.Object[] r5 = new java.lang.Object[]{r5}
                bk.a r5 = r0.d(r1, r5)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsTimeDecorator.Companion.b(j$.time.LocalTime):bk.a");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OrderOptionsTimeDecorator() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderOptionsTimeDecorator)) {
            return false;
        }
        OrderOptionsTimeDecorator orderOptionsTimeDecorator = (OrderOptionsTimeDecorator) other;
        return Intrinsics.e(this.weekDay, orderOptionsTimeDecorator.weekDay) && Intrinsics.e(this.startTime, orderOptionsTimeDecorator.startTime);
    }

    public int hashCode() {
        String str = this.weekDay;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AbstractC6392a abstractC6392a = this.startTime;
        return iHashCode + (abstractC6392a != null ? abstractC6392a.hashCode() : 0);
    }

    public String toString() {
        return "OrderOptionsTimeDecorator(weekDay=" + this.weekDay + ", startTime=" + this.startTime + ')';
    }

    public OrderOptionsTimeDecorator(String str, AbstractC6392a abstractC6392a) {
        this.weekDay = str;
        this.startTime = abstractC6392a;
    }

    public final AbstractC6392a a() {
        AbstractC6392a abstractC6392a;
        String str = this.weekDay;
        if (str == null || (abstractC6392a = this.startTime) == null) {
            return null;
        }
        return AbstractC6392a.INSTANCE.d(Il.h.f14948j, str, abstractC6392a);
    }

    public /* synthetic */ OrderOptionsTimeDecorator(String str, AbstractC6392a abstractC6392a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : abstractC6392a);
    }
}
