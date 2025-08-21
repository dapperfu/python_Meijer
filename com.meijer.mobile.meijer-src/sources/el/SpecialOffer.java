package el;

import Pk.Coupon;
import bk.AbstractC6392a;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import wk.C17898a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b0\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b/\u00102\u001a\u0004\b4\u00103R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001b\u00108\u001a\u0004\b.\u00109¨\u0006:"}, d2 = {"Lel/b;", "", "", "meijerOfferId", "", "imageURL", "title", "description", "j$/time/LocalDateTime", "redemptionStartDate", "redemptionEndDate", "", "isClipped", "LPk/a;", "coupon", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;ZLPk/a;)V", "j$/time/LocalDate", "dateFrom", "dateTo", "", "limit", "l", "(Lj$/time/LocalDate;Lj$/time/LocalDate;I)Z", "now", "j", "(Lj$/time/LocalDate;)Z", "h", "j$/time/format/DateTimeFormatter", "formatter", "Lbk/a;", "a", "(Lj$/time/format/DateTimeFormatter;)Lbk/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getMeijerOfferId", "()J", "b", "Ljava/lang/String;", "getImageURL", "c", "f", "d", "e", "Lj$/time/LocalDateTime;", "()Lj$/time/LocalDateTime;", "getRedemptionEndDate", "g", "Z", "()Z", "LPk/a;", "()LPk/a;", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: el.b, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class SpecialOffer {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long meijerOfferId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageURL;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime redemptionStartDate;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime redemptionEndDate;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isClipped;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coupon coupon;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpecialOffer)) {
            return false;
        }
        SpecialOffer specialOffer = (SpecialOffer) other;
        return this.meijerOfferId == specialOffer.meijerOfferId && Intrinsics.e(this.imageURL, specialOffer.imageURL) && Intrinsics.e(this.title, specialOffer.title) && Intrinsics.e(this.description, specialOffer.description) && Intrinsics.e(this.redemptionStartDate, specialOffer.redemptionStartDate) && Intrinsics.e(this.redemptionEndDate, specialOffer.redemptionEndDate) && this.isClipped == specialOffer.isClipped && Intrinsics.e(this.coupon, specialOffer.coupon);
    }

    public SpecialOffer(long j10, String str, String str2, String str3, LocalDateTime localDateTime, LocalDateTime localDateTime2, boolean z10, Coupon coupon) {
        Intrinsics.j(coupon, "coupon");
        this.meijerOfferId = j10;
        this.imageURL = str;
        this.title = str2;
        this.description = str3;
        this.redemptionStartDate = localDateTime;
        this.redemptionEndDate = localDateTime2;
        this.isClipped = z10;
        this.coupon = coupon;
    }

    public static /* synthetic */ AbstractC6392a b(SpecialOffer specialOffer, DateTimeFormatter dateTimeFormatter, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dateTimeFormatter = C17898a.NUMERIC_MONTH_DAY;
        }
        return specialOffer.a(dateTimeFormatter);
    }

    public static /* synthetic */ boolean i(SpecialOffer specialOffer, LocalDate localDate, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            localDate = LocalDate.now();
        }
        return specialOffer.h(localDate);
    }

    public static /* synthetic */ boolean k(SpecialOffer specialOffer, LocalDate localDate, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            localDate = LocalDate.now();
        }
        return specialOffer.j(localDate);
    }

    private final boolean l(LocalDate dateFrom, LocalDate dateTo, int limit) {
        return dateFrom.until(dateTo, ChronoUnit.DAYS) < ((long) limit);
    }

    public final AbstractC6392a a(DateTimeFormatter formatter) {
        Intrinsics.j(formatter, "formatter");
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        int i10 = Zk.a.f43852c;
        LocalDateTime localDateTime = this.redemptionEndDate;
        String str = localDateTime != null ? localDateTime.format(formatter) : null;
        if (str == null) {
            str = "";
        }
        return companion.d(i10, str);
    }

    /* renamed from: c, reason: from getter */
    public final Coupon getCoupon() {
        return this.coupon;
    }

    /* renamed from: d, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: e, reason: from getter */
    public final LocalDateTime getRedemptionStartDate() {
        return this.redemptionStartDate;
    }

    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsClipped() {
        return this.isClipped;
    }

    public final boolean h(LocalDate now) {
        LocalDate localDateL;
        Intrinsics.j(now, "now");
        LocalDateTime localDateTime = this.redemptionEndDate;
        if (localDateTime == null || (localDateL = localDateTime.l()) == null) {
            return false;
        }
        return l(now, localDateL, 10);
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.meijerOfferId) * 31;
        String str = this.imageURL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        LocalDateTime localDateTime = this.redemptionStartDate;
        int iHashCode5 = (iHashCode4 + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        LocalDateTime localDateTime2 = this.redemptionEndDate;
        return ((((iHashCode5 + (localDateTime2 != null ? localDateTime2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isClipped)) * 31) + this.coupon.hashCode();
    }

    public final boolean j(LocalDate now) {
        LocalDate localDateL;
        Intrinsics.j(now, "now");
        LocalDateTime localDateTime = this.redemptionStartDate;
        if (localDateTime == null || (localDateL = localDateTime.l()) == null) {
            return false;
        }
        return l(localDateL, now, 7);
    }

    public String toString() {
        return "SpecialOffer(meijerOfferId=" + this.meijerOfferId + ", imageURL=" + this.imageURL + ", title=" + this.title + ", description=" + this.description + ", redemptionStartDate=" + this.redemptionStartDate + ", redemptionEndDate=" + this.redemptionEndDate + ", isClipped=" + this.isClipped + ", coupon=" + this.coupon + ')';
    }
}
