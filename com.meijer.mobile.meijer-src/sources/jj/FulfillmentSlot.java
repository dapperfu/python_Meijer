package jj;

import androidx.recyclerview.widget.RecyclerView;
import io.constructor.data.local.PreferencesHelper;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b-\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\b\u0018\u0000 62\u00020\u0001:\u0001!B\u0085\u0001\u0012\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u009c\u0001\u0010\u0018\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010&\u001a\u0004\b'\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b*\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b1\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b0\u0010\u001bR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\"\u001a\u0004\b9\u0010\u001bR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u0010\"\u001a\u0004\b;\u0010\u001bR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b'\u00105\u001a\u0004\b<\u00107R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\"\u001a\u0004\b:\u0010\u001bR\u001d\u0010A\u001a\u0004\u0018\u00010=8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b>\u0010@R\u001d\u0010C\u001a\u0004\u0018\u00010=8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010?\u001a\u0004\bB\u0010@R\u0014\u0010F\u001a\u00020D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010ER\u0011\u0010H\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bG\u00107R\u0011\u0010J\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bI\u00107¨\u0006K"}, d2 = {"Ljj/c;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", PreferencesHelper.PREF_ID, "storeId", "", "scheduleType", "j$/time/LocalDate", "date", "j$/time/LocalTime", "startTime", "endTime", "j$/time/ZoneId", "slotTimeZone", "", "isAvailable", "activeSlotTransactionId", "mustOrderBy", "mustHoldBy", "isSlotSelected", "partnerCustomerId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILj$/time/LocalDate;Lj$/time/LocalTime;Lj$/time/LocalTime;Lj$/time/ZoneId;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "c", "(Ljava/lang/String;Ljava/lang/String;ILj$/time/LocalDate;Lj$/time/LocalTime;Lj$/time/LocalTime;Lj$/time/ZoneId;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljj/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "i", "b", "getStoreId", "I", "l", "d", "Lj$/time/LocalDate;", "g", "()Lj$/time/LocalDate;", "e", "Lj$/time/LocalTime;", "o", "()Lj$/time/LocalTime;", "f", "h", "Lj$/time/ZoneId;", "m", "()Lj$/time/ZoneId;", "Z", "p", "()Z", "j", "getMustOrderBy", "k", "getMustHoldBy", "r", "j$/time/ZonedDateTime", "n", "Lkotlin/Lazy;", "()Lj$/time/ZonedDateTime;", "startDateTime", "getEndDateTime", "endDateTime", "", "()J", "minutesToStartTime", "s", "isValid", "q", "isBopasTimeSlot", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jj.c, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class FulfillmentSlot {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int scheduleType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate date;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalTime startTime;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalTime endTime;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final ZoneId slotTimeZone;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAvailable;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String activeSlotTransactionId;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mustOrderBy;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mustHoldBy;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSlotSelected;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerCustomerId;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Lazy startDateTime;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Lazy endDateTime;

    public FulfillmentSlot(String id2, String storeId, int i10, LocalDate date, LocalTime startTime, LocalTime endTime, ZoneId slotTimeZone, boolean z10, String activeSlotTransactionId, String str, String str2, boolean z11, String str3) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(storeId, "storeId");
        Intrinsics.j(date, "date");
        Intrinsics.j(startTime, "startTime");
        Intrinsics.j(endTime, "endTime");
        Intrinsics.j(slotTimeZone, "slotTimeZone");
        Intrinsics.j(activeSlotTransactionId, "activeSlotTransactionId");
        this.id = id2;
        this.storeId = storeId;
        this.scheduleType = i10;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.slotTimeZone = slotTimeZone;
        this.isAvailable = z10;
        this.activeSlotTransactionId = activeSlotTransactionId;
        this.mustOrderBy = str;
        this.mustHoldBy = str2;
        this.isSlotSelected = z11;
        this.partnerCustomerId = str3;
        this.startDateTime = LazyKt.b(new Function0() { // from class: jj.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FulfillmentSlot.t(this.f140919a);
            }
        });
        this.endDateTime = LazyKt.b(new Function0() { // from class: jj.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FulfillmentSlot.e(this.f140920a);
            }
        });
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FulfillmentSlot)) {
            return false;
        }
        FulfillmentSlot fulfillmentSlot = (FulfillmentSlot) other;
        return Intrinsics.e(this.id, fulfillmentSlot.id) && Intrinsics.e(this.storeId, fulfillmentSlot.storeId) && this.scheduleType == fulfillmentSlot.scheduleType && Intrinsics.e(this.date, fulfillmentSlot.date) && Intrinsics.e(this.startTime, fulfillmentSlot.startTime) && Intrinsics.e(this.endTime, fulfillmentSlot.endTime) && Intrinsics.e(this.slotTimeZone, fulfillmentSlot.slotTimeZone) && this.isAvailable == fulfillmentSlot.isAvailable && Intrinsics.e(this.activeSlotTransactionId, fulfillmentSlot.activeSlotTransactionId) && Intrinsics.e(this.mustOrderBy, fulfillmentSlot.mustOrderBy) && Intrinsics.e(this.mustHoldBy, fulfillmentSlot.mustHoldBy) && this.isSlotSelected == fulfillmentSlot.isSlotSelected && Intrinsics.e(this.partnerCustomerId, fulfillmentSlot.partnerCustomerId);
    }

    public static /* synthetic */ FulfillmentSlot d(FulfillmentSlot fulfillmentSlot, String str, String str2, int i10, LocalDate localDate, LocalTime localTime, LocalTime localTime2, ZoneId zoneId, boolean z10, String str3, String str4, String str5, boolean z11, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fulfillmentSlot.id;
        }
        return fulfillmentSlot.c(str, (i11 & 2) != 0 ? fulfillmentSlot.storeId : str2, (i11 & 4) != 0 ? fulfillmentSlot.scheduleType : i10, (i11 & 8) != 0 ? fulfillmentSlot.date : localDate, (i11 & 16) != 0 ? fulfillmentSlot.startTime : localTime, (i11 & 32) != 0 ? fulfillmentSlot.endTime : localTime2, (i11 & 64) != 0 ? fulfillmentSlot.slotTimeZone : zoneId, (i11 & 128) != 0 ? fulfillmentSlot.isAvailable : z10, (i11 & 256) != 0 ? fulfillmentSlot.activeSlotTransactionId : str3, (i11 & 512) != 0 ? fulfillmentSlot.mustOrderBy : str4, (i11 & 1024) != 0 ? fulfillmentSlot.mustHoldBy : str5, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? fulfillmentSlot.isSlotSelected : z11, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? fulfillmentSlot.partnerCustomerId : str6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ZonedDateTime e(FulfillmentSlot fulfillmentSlot) {
        return ZonedDateTime.of(fulfillmentSlot.date, fulfillmentSlot.endTime, fulfillmentSlot.slotTimeZone);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ZonedDateTime t(FulfillmentSlot fulfillmentSlot) {
        return ZonedDateTime.of(fulfillmentSlot.date, fulfillmentSlot.startTime, fulfillmentSlot.slotTimeZone);
    }

    public final FulfillmentSlot c(String id2, String storeId, int scheduleType, LocalDate date, LocalTime startTime, LocalTime endTime, ZoneId slotTimeZone, boolean isAvailable, String activeSlotTransactionId, String mustOrderBy, String mustHoldBy, boolean isSlotSelected, String partnerCustomerId) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(storeId, "storeId");
        Intrinsics.j(date, "date");
        Intrinsics.j(startTime, "startTime");
        Intrinsics.j(endTime, "endTime");
        Intrinsics.j(slotTimeZone, "slotTimeZone");
        Intrinsics.j(activeSlotTransactionId, "activeSlotTransactionId");
        return new FulfillmentSlot(id2, storeId, scheduleType, date, startTime, endTime, slotTimeZone, isAvailable, activeSlotTransactionId, mustOrderBy, mustHoldBy, isSlotSelected, partnerCustomerId);
    }

    /* renamed from: f, reason: from getter */
    public final String getActiveSlotTransactionId() {
        return this.activeSlotTransactionId;
    }

    /* renamed from: g, reason: from getter */
    public final LocalDate getDate() {
        return this.date;
    }

    /* renamed from: h, reason: from getter */
    public final LocalTime getEndTime() {
        return this.endTime;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.id.hashCode() * 31) + this.storeId.hashCode()) * 31) + Integer.hashCode(this.scheduleType)) * 31) + this.date.hashCode()) * 31) + this.startTime.hashCode()) * 31) + this.endTime.hashCode()) * 31) + this.slotTimeZone.hashCode()) * 31) + Boolean.hashCode(this.isAvailable)) * 31) + this.activeSlotTransactionId.hashCode()) * 31;
        String str = this.mustOrderBy;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mustHoldBy;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isSlotSelected)) * 31;
        String str3 = this.partnerCustomerId;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: k, reason: from getter */
    public final String getPartnerCustomerId() {
        return this.partnerCustomerId;
    }

    /* renamed from: l, reason: from getter */
    public final int getScheduleType() {
        return this.scheduleType;
    }

    /* renamed from: m, reason: from getter */
    public final ZoneId getSlotTimeZone() {
        return this.slotTimeZone;
    }

    public final ZonedDateTime n() {
        return (ZonedDateTime) this.startDateTime.getValue();
    }

    /* renamed from: o, reason: from getter */
    public final LocalTime getStartTime() {
        return this.startTime;
    }

    /* renamed from: p, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    public final boolean q() {
        return Intrinsics.e(StringsKt.N1(this.id, 3), "999");
    }

    /* renamed from: r, reason: from getter */
    public final boolean getIsSlotSelected() {
        return this.isSlotSelected;
    }

    public String toString() {
        return "FulfillmentSlot(id=" + this.id + ", storeId=" + this.storeId + ", scheduleType=" + this.scheduleType + ", date=" + this.date + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", slotTimeZone=" + this.slotTimeZone + ", isAvailable=" + this.isAvailable + ", activeSlotTransactionId=" + this.activeSlotTransactionId + ", mustOrderBy=" + this.mustOrderBy + ", mustHoldBy=" + this.mustHoldBy + ", isSlotSelected=" + this.isSlotSelected + ", partnerCustomerId=" + this.partnerCustomerId + ')';
    }

    private final long j() {
        return Duration.between(Instant.now().atZone(this.slotTimeZone), n()).toMinutes();
    }

    public final boolean s() {
        if (j() >= 62 && this.isAvailable) {
            return true;
        }
        return false;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ FulfillmentSlot(java.lang.String r17, java.lang.String r18, int r19, j$.time.LocalDate r20, j$.time.LocalTime r21, j$.time.LocalTime r22, j$.time.ZoneId r23, boolean r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, boolean r28, java.lang.String r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r16 = this;
            r0 = r30
            r1 = r0 & 1
            if (r1 == 0) goto La
            java.lang.String r1 = "-1"
            r3 = r1
            goto Lc
        La:
            r3 = r17
        Lc:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L14
            java.lang.String r1 = "00000000-0000-0000-0000-000000000000"
            r11 = r1
            goto L16
        L14:
            r11 = r25
        L16:
            r1 = r0 & 512(0x200, float:7.17E-43)
            r2 = 0
            if (r1 == 0) goto L1d
            r12 = r2
            goto L1f
        L1d:
            r12 = r26
        L1f:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L25
            r13 = r2
            goto L27
        L25:
            r13 = r27
        L27:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L2e
            r1 = 0
            r14 = r1
            goto L30
        L2e:
            r14 = r28
        L30:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L46
            r15 = r2
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r2 = r16
            goto L58
        L46:
            r15 = r29
            r2 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
        L58:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jj.FulfillmentSlot.<init>(java.lang.String, java.lang.String, int, j$.time.LocalDate, j$.time.LocalTime, j$.time.LocalTime, j$.time.ZoneId, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
