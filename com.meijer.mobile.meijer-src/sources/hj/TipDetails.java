package hj;

import j$.time.OffsetDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b(\u0010'R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b$\u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\"\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\u001e\u00101¨\u00062"}, d2 = {"Lhj/o;", "", "", "tipOrderCode", "", "tipped", "preTip", "Lhj/p;", "preTipStatus", "status", "authCode", "Lnk/b;", "tipAmount", "", "percent", "j$/time/OffsetDateTime", "date", "<init>", "(Ljava/lang/String;ZZLhj/p;Lhj/p;Ljava/lang/String;Lnk/b;DLj$/time/OffsetDateTime;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Z", "f", "()Z", "c", "getPreTip", "d", "Lhj/p;", "getPreTipStatus", "()Lhj/p;", "getStatus", "g", "Lnk/b;", "()Lnk/b;", "h", "D", "()D", "i", "Lj$/time/OffsetDateTime;", "()Lj$/time/OffsetDateTime;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hj.o, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class TipDetails {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tipOrderCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean tipped;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean preTip;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final p preTipStatus;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final p status;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String authCode;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.b tipAmount;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final double percent;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime date;

    public TipDetails() {
        this(null, false, false, null, null, null, null, 0.0d, null, 511, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TipDetails)) {
            return false;
        }
        TipDetails tipDetails = (TipDetails) other;
        return Intrinsics.e(this.tipOrderCode, tipDetails.tipOrderCode) && this.tipped == tipDetails.tipped && this.preTip == tipDetails.preTip && this.preTipStatus == tipDetails.preTipStatus && this.status == tipDetails.status && Intrinsics.e(this.authCode, tipDetails.authCode) && Intrinsics.e(this.tipAmount, tipDetails.tipAmount) && Double.compare(this.percent, tipDetails.percent) == 0 && Intrinsics.e(this.date, tipDetails.date);
    }

    public TipDetails(String tipOrderCode, boolean z10, boolean z11, p preTipStatus, p status, String authCode, nk.b tipAmount, double d10, OffsetDateTime offsetDateTime) {
        Intrinsics.j(tipOrderCode, "tipOrderCode");
        Intrinsics.j(preTipStatus, "preTipStatus");
        Intrinsics.j(status, "status");
        Intrinsics.j(authCode, "authCode");
        Intrinsics.j(tipAmount, "tipAmount");
        this.tipOrderCode = tipOrderCode;
        this.tipped = z10;
        this.preTip = z11;
        this.preTipStatus = preTipStatus;
        this.status = status;
        this.authCode = authCode;
        this.tipAmount = tipAmount;
        this.percent = d10;
        this.date = offsetDateTime;
    }

    /* renamed from: a, reason: from getter */
    public final String getAuthCode() {
        return this.authCode;
    }

    /* renamed from: b, reason: from getter */
    public final OffsetDateTime getDate() {
        return this.date;
    }

    /* renamed from: c, reason: from getter */
    public final double getPercent() {
        return this.percent;
    }

    /* renamed from: d, reason: from getter */
    public final nk.b getTipAmount() {
        return this.tipAmount;
    }

    /* renamed from: e, reason: from getter */
    public final String getTipOrderCode() {
        return this.tipOrderCode;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getTipped() {
        return this.tipped;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.tipOrderCode.hashCode() * 31) + Boolean.hashCode(this.tipped)) * 31) + Boolean.hashCode(this.preTip)) * 31) + this.preTipStatus.hashCode()) * 31) + this.status.hashCode()) * 31) + this.authCode.hashCode()) * 31) + this.tipAmount.hashCode()) * 31) + Double.hashCode(this.percent)) * 31;
        OffsetDateTime offsetDateTime = this.date;
        return iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode());
    }

    public String toString() {
        return "TipDetails(tipOrderCode=" + this.tipOrderCode + ", tipped=" + this.tipped + ", preTip=" + this.preTip + ", preTipStatus=" + this.preTipStatus + ", status=" + this.status + ", authCode=" + this.authCode + ", tipAmount=" + this.tipAmount + ", percent=" + this.percent + ", date=" + this.date + ')';
    }

    public /* synthetic */ TipDetails(String str, boolean z10, boolean z11, p pVar, p pVar2, String str2, nk.b bVar, double d10, OffsetDateTime offsetDateTime, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z10, (i10 & 4) == 0 ? z11 : false, (i10 & 8) != 0 ? p.f135756e : pVar, (i10 & 16) != 0 ? p.f135756e : pVar2, (i10 & 32) == 0 ? str2 : "", (i10 & 64) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar, (i10 & 128) != 0 ? 0.0d : d10, (i10 & 256) != 0 ? null : offsetDateTime);
    }
}
