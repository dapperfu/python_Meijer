package com.meijer.mobile.receipt.service.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ`\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b!\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010#\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b \u0010\u0012¨\u0006%"}, d2 = {"Lcom/meijer/mobile/receipt/service/api/models/CustomerSavingsResponseJson;", "", "", "spendingTotal", "mPerksTotal", "specialsTotal", "couponsTotal", "teamMemberTotal", "savingsTotal", "", "savingsPercentage", "", "savingsSinceDate", "<init>", "(DDDDDDILjava/lang/String;)V", "copy", "(DDDDDDILjava/lang/String;)Lcom/meijer/mobile/receipt/service/api/models/CustomerSavingsResponseJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "g", "()D", "b", "c", "f", "d", "e", "h", "I", "Ljava/lang/String;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CustomerSavingsResponseJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final double spendingTotal;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double mPerksTotal;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double specialsTotal;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final double couponsTotal;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double teamMemberTotal;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final double savingsTotal;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int savingsPercentage;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String savingsSinceDate;

    public CustomerSavingsResponseJson(@g(name = "spendingTotal") double d10, @g(name = "mPerksTotal") double d11, @g(name = "specialsTotal") double d12, @g(name = "couponsTotal") double d13, @g(name = "teamMemberTotal") double d14, @g(name = "savingsTotal") double d15, @g(name = "savingsPercentage") int i10, @g(name = "savingsSinceDate") String savingsSinceDate) {
        Intrinsics.j(savingsSinceDate, "savingsSinceDate");
        this.spendingTotal = d10;
        this.mPerksTotal = d11;
        this.specialsTotal = d12;
        this.couponsTotal = d13;
        this.teamMemberTotal = d14;
        this.savingsTotal = d15;
        this.savingsPercentage = i10;
        this.savingsSinceDate = savingsSinceDate;
    }

    public final CustomerSavingsResponseJson copy(@g(name = "spendingTotal") double spendingTotal, @g(name = "mPerksTotal") double mPerksTotal, @g(name = "specialsTotal") double specialsTotal, @g(name = "couponsTotal") double couponsTotal, @g(name = "teamMemberTotal") double teamMemberTotal, @g(name = "savingsTotal") double savingsTotal, @g(name = "savingsPercentage") int savingsPercentage, @g(name = "savingsSinceDate") String savingsSinceDate) {
        Intrinsics.j(savingsSinceDate, "savingsSinceDate");
        return new CustomerSavingsResponseJson(spendingTotal, mPerksTotal, specialsTotal, couponsTotal, teamMemberTotal, savingsTotal, savingsPercentage, savingsSinceDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerSavingsResponseJson)) {
            return false;
        }
        CustomerSavingsResponseJson customerSavingsResponseJson = (CustomerSavingsResponseJson) other;
        return Double.compare(this.spendingTotal, customerSavingsResponseJson.spendingTotal) == 0 && Double.compare(this.mPerksTotal, customerSavingsResponseJson.mPerksTotal) == 0 && Double.compare(this.specialsTotal, customerSavingsResponseJson.specialsTotal) == 0 && Double.compare(this.couponsTotal, customerSavingsResponseJson.couponsTotal) == 0 && Double.compare(this.teamMemberTotal, customerSavingsResponseJson.teamMemberTotal) == 0 && Double.compare(this.savingsTotal, customerSavingsResponseJson.savingsTotal) == 0 && this.savingsPercentage == customerSavingsResponseJson.savingsPercentage && Intrinsics.e(this.savingsSinceDate, customerSavingsResponseJson.savingsSinceDate);
    }

    public int hashCode() {
        return (((((((((((((Double.hashCode(this.spendingTotal) * 31) + Double.hashCode(this.mPerksTotal)) * 31) + Double.hashCode(this.specialsTotal)) * 31) + Double.hashCode(this.couponsTotal)) * 31) + Double.hashCode(this.teamMemberTotal)) * 31) + Double.hashCode(this.savingsTotal)) * 31) + Integer.hashCode(this.savingsPercentage)) * 31) + this.savingsSinceDate.hashCode();
    }

    public String toString() {
        return "CustomerSavingsResponseJson(spendingTotal=" + this.spendingTotal + ", mPerksTotal=" + this.mPerksTotal + ", specialsTotal=" + this.specialsTotal + ", couponsTotal=" + this.couponsTotal + ", teamMemberTotal=" + this.teamMemberTotal + ", savingsTotal=" + this.savingsTotal + ", savingsPercentage=" + this.savingsPercentage + ", savingsSinceDate=" + this.savingsSinceDate + ')';
    }

    /* renamed from: a, reason: from getter */
    public final double getCouponsTotal() {
        return this.couponsTotal;
    }

    /* renamed from: b, reason: from getter */
    public final double getMPerksTotal() {
        return this.mPerksTotal;
    }

    /* renamed from: c, reason: from getter */
    public final int getSavingsPercentage() {
        return this.savingsPercentage;
    }

    /* renamed from: d, reason: from getter */
    public final String getSavingsSinceDate() {
        return this.savingsSinceDate;
    }

    /* renamed from: e, reason: from getter */
    public final double getSavingsTotal() {
        return this.savingsTotal;
    }

    /* renamed from: f, reason: from getter */
    public final double getSpecialsTotal() {
        return this.specialsTotal;
    }

    /* renamed from: g, reason: from getter */
    public final double getSpendingTotal() {
        return this.spendingTotal;
    }

    /* renamed from: h, reason: from getter */
    public final double getTeamMemberTotal() {
        return this.teamMemberTotal;
    }

    public /* synthetic */ CustomerSavingsResponseJson(double d10, double d11, double d12, double d13, double d14, double d15, int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.0d : d10, (i11 & 2) != 0 ? 0.0d : d11, (i11 & 4) != 0 ? 0.0d : d12, (i11 & 8) != 0 ? 0.0d : d13, (i11 & 16) != 0 ? 0.0d : d14, (i11 & 32) != 0 ? 0.0d : d15, (i11 & 64) != 0 ? 0 : i10, str);
    }
}
