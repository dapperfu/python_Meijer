package hj;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import tp.EnumC17276a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001e¨\u0006 "}, d2 = {"Lhj/n;", "", "", "tippablePartner", "Lhj/o;", "tipDetails", "Lhj/k;", "rateDetails", "<init>", "(ZLhj/o;Lhj/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "Lhj/o;", "c", "()Lhj/o;", "Lhj/k;", "()Lhj/k;", "Ltp/a;", "()Ltp/a;", "rateAndTipFlowType", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hj.n, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class TipAndRateDetails {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean tippablePartner;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TipDetails tipDetails;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final RateDetails rateDetails;

    public TipAndRateDetails() {
        this(false, null, null, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TipAndRateDetails)) {
            return false;
        }
        TipAndRateDetails tipAndRateDetails = (TipAndRateDetails) other;
        return this.tippablePartner == tipAndRateDetails.tippablePartner && Intrinsics.e(this.tipDetails, tipAndRateDetails.tipDetails) && Intrinsics.e(this.rateDetails, tipAndRateDetails.rateDetails);
    }

    public TipAndRateDetails(boolean z10, TipDetails tipDetails, RateDetails rateDetails) {
        Intrinsics.j(tipDetails, "tipDetails");
        Intrinsics.j(rateDetails, "rateDetails");
        this.tippablePartner = z10;
        this.tipDetails = tipDetails;
        this.rateDetails = rateDetails;
    }

    public final EnumC17276a a() {
        return (!this.tipDetails.getTipped() || this.rateDetails.getRated()) ? (this.tipDetails.getTipped() || !this.rateDetails.getRated()) ? EnumC17276a.f163239c : EnumC17276a.f163241e : EnumC17276a.f163240d;
    }

    /* renamed from: b, reason: from getter */
    public final RateDetails getRateDetails() {
        return this.rateDetails;
    }

    /* renamed from: c, reason: from getter */
    public final TipDetails getTipDetails() {
        return this.tipDetails;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getTippablePartner() {
        return this.tippablePartner;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.tippablePartner) * 31) + this.tipDetails.hashCode()) * 31) + this.rateDetails.hashCode();
    }

    public String toString() {
        return "TipAndRateDetails(tippablePartner=" + this.tippablePartner + ", tipDetails=" + this.tipDetails + ", rateDetails=" + this.rateDetails + ')';
    }

    public /* synthetic */ TipAndRateDetails(boolean z10, TipDetails oVar, RateDetails kVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? new TipDetails(null, false, false, null, null, null, null, 0.0d, null, 511, null) : oVar, (i10 & 4) != 0 ? new RateDetails(false, 0, null, 7, null) : kVar);
    }
}
