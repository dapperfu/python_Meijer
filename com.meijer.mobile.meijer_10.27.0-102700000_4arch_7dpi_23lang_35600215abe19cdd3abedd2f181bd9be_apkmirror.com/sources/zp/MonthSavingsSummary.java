package zp;

import j$.time.YearMonth;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b \u0010\u0013R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001eR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001e¨\u0006*"}, d2 = {"Lzp/e;", "", "j$/time/YearMonth", "yearMonth", "", "savingsTotal", "", "savingsPercentage", "spendingAmount", "mPerksAmount", "specialsAmount", "couponsAmount", "teamMemberAmount", "<init>", "(Lj$/time/YearMonth;DIDDDDD)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj$/time/YearMonth;", "c", "()Lj$/time/YearMonth;", "b", "D", "()D", "I", "getSavingsPercentage", "d", "e", "getMPerksAmount", "f", "getSpecialsAmount", "g", "getCouponsAmount", "h", "getTeamMemberAmount", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zp.e, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class MonthSavingsSummary {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final YearMonth yearMonth;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double savingsTotal;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int savingsPercentage;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final double spendingAmount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double mPerksAmount;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final double specialsAmount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final double couponsAmount;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final double teamMemberAmount;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MonthSavingsSummary)) {
            return false;
        }
        MonthSavingsSummary monthSavingsSummary = (MonthSavingsSummary) other;
        return Intrinsics.e(this.yearMonth, monthSavingsSummary.yearMonth) && Double.compare(this.savingsTotal, monthSavingsSummary.savingsTotal) == 0 && this.savingsPercentage == monthSavingsSummary.savingsPercentage && Double.compare(this.spendingAmount, monthSavingsSummary.spendingAmount) == 0 && Double.compare(this.mPerksAmount, monthSavingsSummary.mPerksAmount) == 0 && Double.compare(this.specialsAmount, monthSavingsSummary.specialsAmount) == 0 && Double.compare(this.couponsAmount, monthSavingsSummary.couponsAmount) == 0 && Double.compare(this.teamMemberAmount, monthSavingsSummary.teamMemberAmount) == 0;
    }

    public MonthSavingsSummary(YearMonth yearMonth, double d10, int i10, double d11, double d12, double d13, double d14, double d15) {
        Intrinsics.j(yearMonth, "yearMonth");
        this.yearMonth = yearMonth;
        this.savingsTotal = d10;
        this.savingsPercentage = i10;
        this.spendingAmount = d11;
        this.mPerksAmount = d12;
        this.specialsAmount = d13;
        this.couponsAmount = d14;
        this.teamMemberAmount = d15;
    }

    /* renamed from: a, reason: from getter */
    public final double getSavingsTotal() {
        return this.savingsTotal;
    }

    /* renamed from: b, reason: from getter */
    public final double getSpendingAmount() {
        return this.spendingAmount;
    }

    /* renamed from: c, reason: from getter */
    public final YearMonth getYearMonth() {
        return this.yearMonth;
    }

    public int hashCode() {
        return (((((((((((((this.yearMonth.hashCode() * 31) + Double.hashCode(this.savingsTotal)) * 31) + Integer.hashCode(this.savingsPercentage)) * 31) + Double.hashCode(this.spendingAmount)) * 31) + Double.hashCode(this.mPerksAmount)) * 31) + Double.hashCode(this.specialsAmount)) * 31) + Double.hashCode(this.couponsAmount)) * 31) + Double.hashCode(this.teamMemberAmount);
    }

    public String toString() {
        return "MonthSavingsSummary(yearMonth=" + this.yearMonth + ", savingsTotal=" + this.savingsTotal + ", savingsPercentage=" + this.savingsPercentage + ", spendingAmount=" + this.spendingAmount + ", mPerksAmount=" + this.mPerksAmount + ", specialsAmount=" + this.specialsAmount + ", couponsAmount=" + this.couponsAmount + ", teamMemberAmount=" + this.teamMemberAmount + ')';
    }
}
