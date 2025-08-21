package com.meijer.mobile.meijer.activity.checkout.confirmation;

import Cm.FulfillmentSlotDayDecorator;
import bk.AbstractC6392a;
import gj.PickupSlotInfo;
import j$.time.LocalDate;
import j$.time.LocalTime;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wk.C17898a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0001\u000fBo\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJx\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b \u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u000b\u0010$R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b\f\u0010$R\u0013\u0010'\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b!\u0010&¨\u0006)"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/confirmation/j0;", "", "", "weekDay", "date", "dateWithYear", "startTime", "endTime", "timeForAdobeTag", "analyticsDate", "", "isBopasEnabled", "isBopasSlot", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/meijer/mobile/meijer/activity/checkout/confirmation/j0;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "i", "b", "d", "c", "getDateWithYear", "g", "e", "f", "h", "Z", "()Z", "Lbk/a;", "()Lbk/a;", "slotDetail", "j", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.j0, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class OrderDetailsPickUpTimeDecorator {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String weekDay;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String date;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dateWithYear;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String startTime;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String endTime;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String timeForAdobeTag;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String analyticsDate;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isBopasEnabled;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isBopasSlot;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/confirmation/j0$a;", "", "<init>", "()V", "j$/time/LocalTime", "time", "", "b", "(Lj$/time/LocalTime;)Ljava/lang/String;", "Lgj/c;", "pickUpSlotInfo", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/j0;", "a", "(Lgj/c;)Lcom/meijer/mobile/meijer/activity/checkout/confirmation/j0;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.j0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final String b(LocalTime time) {
            if (time == null) {
                return "Noon";
            }
            LocalTime localTime = (time.getHour() == 12 && time.getMinute() == 0) ? null : time;
            if (localTime == null) {
                return "Noon";
            }
            String str = localTime.format(time.getMinute() == 0 ? C17898a.f167225a.B() : C17898a.f167225a.q());
            if (str == null) {
                return "Noon";
            }
            Locale US = Locale.US;
            Intrinsics.i(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.i(lowerCase, "toLowerCase(...)");
            return lowerCase != null ? lowerCase : "Noon";
        }

        public final OrderDetailsPickUpTimeDecorator a(PickupSlotInfo pickUpSlotInfo) {
            String lowerCase;
            String lowerCase2;
            String str;
            String str2;
            Intrinsics.j(pickUpSlotInfo, "pickUpSlotInfo");
            LocalDate pickupDate = pickUpSlotInfo.getPickupDate();
            String strB = pickupDate != null ? FulfillmentSlotDayDecorator.Companion.b(FulfillmentSlotDayDecorator.INSTANCE, pickupDate, false, 2, null) : null;
            LocalDate pickupDate2 = pickUpSlotInfo.getPickupDate();
            String str3 = pickupDate2 != null ? pickupDate2.format(C17898a.NUMERIC_MONTH_DAY) : null;
            LocalDate pickupDate3 = pickUpSlotInfo.getPickupDate();
            String str4 = pickupDate3 != null ? pickupDate3.format(C17898a.f167225a.l()) : null;
            LocalTime pickupStartTime = pickUpSlotInfo.getPickupStartTime();
            String strB2 = pickupStartTime != null ? OrderDetailsPickUpTimeDecorator.INSTANCE.b(pickupStartTime) : null;
            LocalTime pickupEndTime = pickUpSlotInfo.getPickupEndTime();
            String strB3 = pickupEndTime != null ? OrderDetailsPickUpTimeDecorator.INSTANCE.b(pickupEndTime) : null;
            LocalTime pickupStartTime2 = pickUpSlotInfo.getPickupStartTime();
            if (pickupStartTime2 == null || (str2 = pickupStartTime2.format(C17898a.f167225a.r())) == null) {
                lowerCase = null;
            } else {
                Locale US = Locale.US;
                Intrinsics.i(US, "US");
                lowerCase = str2.toLowerCase(US);
                Intrinsics.i(lowerCase, "toLowerCase(...)");
            }
            LocalTime pickupEndTime2 = pickUpSlotInfo.getPickupEndTime();
            if (pickupEndTime2 == null || (str = pickupEndTime2.format(C17898a.f167225a.r())) == null) {
                lowerCase2 = null;
            } else {
                Locale US2 = Locale.US;
                Intrinsics.i(US2, "US");
                lowerCase2 = str.toLowerCase(US2);
                Intrinsics.i(lowerCase2, "toLowerCase(...)");
            }
            String strB0 = CollectionsKt.B0(CollectionsKt.p(lowerCase, lowerCase2), " - ", null, null, 0, null, null, 62, null);
            LocalDate pickupDate4 = pickUpSlotInfo.getPickupDate();
            return new OrderDetailsPickUpTimeDecorator(strB, str3, str4, strB2, strB3, strB0, pickupDate4 != null ? pickupDate4.format(C17898a.DATE_FORMAT_MM_DD_YYYY) : null, false, false, 384, null);
        }
    }

    public OrderDetailsPickUpTimeDecorator() {
        this(null, null, null, null, null, null, null, false, false, 511, null);
    }

    public static /* synthetic */ OrderDetailsPickUpTimeDecorator b(OrderDetailsPickUpTimeDecorator orderDetailsPickUpTimeDecorator, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = orderDetailsPickUpTimeDecorator.weekDay;
        }
        if ((i10 & 2) != 0) {
            str2 = orderDetailsPickUpTimeDecorator.date;
        }
        if ((i10 & 4) != 0) {
            str3 = orderDetailsPickUpTimeDecorator.dateWithYear;
        }
        if ((i10 & 8) != 0) {
            str4 = orderDetailsPickUpTimeDecorator.startTime;
        }
        if ((i10 & 16) != 0) {
            str5 = orderDetailsPickUpTimeDecorator.endTime;
        }
        if ((i10 & 32) != 0) {
            str6 = orderDetailsPickUpTimeDecorator.timeForAdobeTag;
        }
        if ((i10 & 64) != 0) {
            str7 = orderDetailsPickUpTimeDecorator.analyticsDate;
        }
        if ((i10 & 128) != 0) {
            z10 = orderDetailsPickUpTimeDecorator.isBopasEnabled;
        }
        if ((i10 & 256) != 0) {
            z11 = orderDetailsPickUpTimeDecorator.isBopasSlot;
        }
        boolean z12 = z10;
        boolean z13 = z11;
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return orderDetailsPickUpTimeDecorator.a(str, str2, str11, str4, str10, str8, str9, z12, z13);
    }

    public final OrderDetailsPickUpTimeDecorator a(String weekDay, String date, String dateWithYear, String startTime, String endTime, String timeForAdobeTag, String analyticsDate, boolean isBopasEnabled, boolean isBopasSlot) {
        return new OrderDetailsPickUpTimeDecorator(weekDay, date, dateWithYear, startTime, endTime, timeForAdobeTag, analyticsDate, isBopasEnabled, isBopasSlot);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDetailsPickUpTimeDecorator)) {
            return false;
        }
        OrderDetailsPickUpTimeDecorator orderDetailsPickUpTimeDecorator = (OrderDetailsPickUpTimeDecorator) other;
        return Intrinsics.e(this.weekDay, orderDetailsPickUpTimeDecorator.weekDay) && Intrinsics.e(this.date, orderDetailsPickUpTimeDecorator.date) && Intrinsics.e(this.dateWithYear, orderDetailsPickUpTimeDecorator.dateWithYear) && Intrinsics.e(this.startTime, orderDetailsPickUpTimeDecorator.startTime) && Intrinsics.e(this.endTime, orderDetailsPickUpTimeDecorator.endTime) && Intrinsics.e(this.timeForAdobeTag, orderDetailsPickUpTimeDecorator.timeForAdobeTag) && Intrinsics.e(this.analyticsDate, orderDetailsPickUpTimeDecorator.analyticsDate) && this.isBopasEnabled == orderDetailsPickUpTimeDecorator.isBopasEnabled && this.isBopasSlot == orderDetailsPickUpTimeDecorator.isBopasSlot;
    }

    public int hashCode() {
        String str = this.weekDay;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.date;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dateWithYear;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.startTime;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.endTime;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.timeForAdobeTag;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.analyticsDate;
        return ((((iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31) + Boolean.hashCode(this.isBopasEnabled)) * 31) + Boolean.hashCode(this.isBopasSlot);
    }

    public String toString() {
        return "OrderDetailsPickUpTimeDecorator(weekDay=" + this.weekDay + ", date=" + this.date + ", dateWithYear=" + this.dateWithYear + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", timeForAdobeTag=" + this.timeForAdobeTag + ", analyticsDate=" + this.analyticsDate + ", isBopasEnabled=" + this.isBopasEnabled + ", isBopasSlot=" + this.isBopasSlot + ')';
    }

    public OrderDetailsPickUpTimeDecorator(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, boolean z11) {
        this.weekDay = str;
        this.date = str2;
        this.dateWithYear = str3;
        this.startTime = str4;
        this.endTime = str5;
        this.timeForAdobeTag = str6;
        this.analyticsDate = str7;
        this.isBopasEnabled = z10;
        this.isBopasSlot = z11;
    }

    /* renamed from: c, reason: from getter */
    public final String getAnalyticsDate() {
        return this.analyticsDate;
    }

    /* renamed from: d, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: e, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    public final AbstractC6392a f() {
        String str;
        String str2;
        if (!Intrinsics.e(this.weekDay, "Today")) {
            String str3 = this.weekDay;
            if (str3 == null || (str = this.date) == null) {
                return null;
            }
            return AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100535L9, str3, str);
        }
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        int i10 = com.meijer.mobile.meijer.Y.f100573N9;
        String str4 = this.startTime;
        if (str4 == null) {
            str4 = "";
        }
        AbstractC6392a abstractC6392aD = companion.d(i10, str4);
        if (!this.isBopasEnabled || !this.isBopasSlot) {
            abstractC6392aD = null;
        }
        if (abstractC6392aD != null) {
            return abstractC6392aD;
        }
        String str5 = this.startTime;
        if (str5 == null || (str2 = this.endTime) == null) {
            return null;
        }
        return companion.d(com.meijer.mobile.meijer.Y.f100554M9, str5, str2);
    }

    /* renamed from: g, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* renamed from: h, reason: from getter */
    public final String getTimeForAdobeTag() {
        return this.timeForAdobeTag;
    }

    /* renamed from: i, reason: from getter */
    public final String getWeekDay() {
        return this.weekDay;
    }

    public /* synthetic */ OrderDetailsPickUpTimeDecorator(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? false : z10, (i10 & 256) != 0 ? false : z11);
    }
}
