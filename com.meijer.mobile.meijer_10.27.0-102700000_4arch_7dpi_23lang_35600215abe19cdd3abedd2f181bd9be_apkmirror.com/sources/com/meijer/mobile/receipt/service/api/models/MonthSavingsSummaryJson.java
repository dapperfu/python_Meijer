package com.meijer.mobile.receipt.service.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0005\u0012\b\b\u0003\u0010\t\u001a\u00020\u0005\u0012\b\b\u0003\u0010\n\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0003\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJj\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\u00052\b\b\u0003\u0010\n\u001a\u00020\u00052\b\b\u0003\u0010\u000b\u001a\u00020\u00052\b\b\u0003\u0010\f\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b\u001d\u0010!R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b\u001a\u0010!R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b%\u0010!¨\u0006&"}, d2 = {"Lcom/meijer/mobile/receipt/service/api/models/MonthSavingsSummaryJson;", "", "", "month", "year", "", "savingsTotal", "savingsPercentage", "spendingAmount", "mPerksAmount", "specialsAmount", "couponsAmount", "teamMemberAmount", "<init>", "(IIDIDDDDD)V", "copy", "(IIDIDDDDD)Lcom/meijer/mobile/receipt/service/api/models/MonthSavingsSummaryJson;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "i", "D", "e", "()D", "d", "g", "f", "h", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MonthSavingsSummaryJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int month;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int year;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double savingsTotal;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int savingsPercentage;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double spendingAmount;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final double mPerksAmount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final double specialsAmount;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final double couponsAmount;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final double teamMemberAmount;

    public MonthSavingsSummaryJson() {
        this(0, 0, 0.0d, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 511, null);
    }

    public final MonthSavingsSummaryJson copy(@g(name = "month") int month, @g(name = "year") int year, @g(name = "savingsTotal") double savingsTotal, @g(name = "savingsPercentage") int savingsPercentage, @g(name = "spendingAmount") double spendingAmount, @g(name = "mPerksAmount") double mPerksAmount, @g(name = "specialsAmount") double specialsAmount, @g(name = "couponsAmount") double couponsAmount, @g(name = "teamMemberAmount") double teamMemberAmount) {
        return new MonthSavingsSummaryJson(month, year, savingsTotal, savingsPercentage, spendingAmount, mPerksAmount, specialsAmount, couponsAmount, teamMemberAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MonthSavingsSummaryJson)) {
            return false;
        }
        MonthSavingsSummaryJson monthSavingsSummaryJson = (MonthSavingsSummaryJson) other;
        return this.month == monthSavingsSummaryJson.month && this.year == monthSavingsSummaryJson.year && Double.compare(this.savingsTotal, monthSavingsSummaryJson.savingsTotal) == 0 && this.savingsPercentage == monthSavingsSummaryJson.savingsPercentage && Double.compare(this.spendingAmount, monthSavingsSummaryJson.spendingAmount) == 0 && Double.compare(this.mPerksAmount, monthSavingsSummaryJson.mPerksAmount) == 0 && Double.compare(this.specialsAmount, monthSavingsSummaryJson.specialsAmount) == 0 && Double.compare(this.couponsAmount, monthSavingsSummaryJson.couponsAmount) == 0 && Double.compare(this.teamMemberAmount, monthSavingsSummaryJson.teamMemberAmount) == 0;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.month) * 31) + Integer.hashCode(this.year)) * 31) + Double.hashCode(this.savingsTotal)) * 31) + Integer.hashCode(this.savingsPercentage)) * 31) + Double.hashCode(this.spendingAmount)) * 31) + Double.hashCode(this.mPerksAmount)) * 31) + Double.hashCode(this.specialsAmount)) * 31) + Double.hashCode(this.couponsAmount)) * 31) + Double.hashCode(this.teamMemberAmount);
    }

    public String toString() {
        return "MonthSavingsSummaryJson(month=" + this.month + ", year=" + this.year + ", savingsTotal=" + this.savingsTotal + ", savingsPercentage=" + this.savingsPercentage + ", spendingAmount=" + this.spendingAmount + ", mPerksAmount=" + this.mPerksAmount + ", specialsAmount=" + this.specialsAmount + ", couponsAmount=" + this.couponsAmount + ", teamMemberAmount=" + this.teamMemberAmount + ')';
    }

    public MonthSavingsSummaryJson(@g(name = "month") int i10, @g(name = "year") int i11, @g(name = "savingsTotal") double d10, @g(name = "savingsPercentage") int i12, @g(name = "spendingAmount") double d11, @g(name = "mPerksAmount") double d12, @g(name = "specialsAmount") double d13, @g(name = "couponsAmount") double d14, @g(name = "teamMemberAmount") double d15) {
        this.month = i10;
        this.year = i11;
        this.savingsTotal = d10;
        this.savingsPercentage = i12;
        this.spendingAmount = d11;
        this.mPerksAmount = d12;
        this.specialsAmount = d13;
        this.couponsAmount = d14;
        this.teamMemberAmount = d15;
    }

    /* renamed from: a, reason: from getter */
    public final double getCouponsAmount() {
        return this.couponsAmount;
    }

    /* renamed from: b, reason: from getter */
    public final double getMPerksAmount() {
        return this.mPerksAmount;
    }

    /* renamed from: c, reason: from getter */
    public final int getMonth() {
        return this.month;
    }

    /* renamed from: d, reason: from getter */
    public final int getSavingsPercentage() {
        return this.savingsPercentage;
    }

    /* renamed from: e, reason: from getter */
    public final double getSavingsTotal() {
        return this.savingsTotal;
    }

    /* renamed from: f, reason: from getter */
    public final double getSpecialsAmount() {
        return this.specialsAmount;
    }

    /* renamed from: g, reason: from getter */
    public final double getSpendingAmount() {
        return this.spendingAmount;
    }

    /* renamed from: h, reason: from getter */
    public final double getTeamMemberAmount() {
        return this.teamMemberAmount;
    }

    /* renamed from: i, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    public /* synthetic */ MonthSavingsSummaryJson(int i10, int i11, double d10, int i12, double d11, double d12, double d13, double d14, double d15, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0.0d : d10, (i13 & 8) == 0 ? i12 : 0, (i13 & 16) != 0 ? 0.0d : d11, (i13 & 32) != 0 ? 0.0d : d12, (i13 & 64) != 0 ? 0.0d : d13, (i13 & 128) != 0 ? 0.0d : d14, (i13 & 256) != 0 ? 0.0d : d15);
    }
}
