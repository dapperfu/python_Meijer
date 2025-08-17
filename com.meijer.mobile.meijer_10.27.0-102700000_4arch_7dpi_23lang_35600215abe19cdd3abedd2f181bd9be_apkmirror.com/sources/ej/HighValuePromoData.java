package ej;

import j$.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001\u0015BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\n\u0010 ¨\u0006\""}, d2 = {"Lej/p;", "", "", "advText", "j$/time/ZonedDateTime", "expirationDate", "promoDesc", "promoNum", "promptResponse", "", "isApplied", "<init>", "(Ljava/lang/String;Lj$/time/ZonedDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAdvText", "b", "Lj$/time/ZonedDateTime;", "()Lj$/time/ZonedDateTime;", "c", "d", "e", "f", "Z", "()Z", "g", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ej.p, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class HighValuePromoData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String advText;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ZonedDateTime expirationDate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promoDesc;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promoNum;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promptResponse;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isApplied;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighValuePromoData)) {
            return false;
        }
        HighValuePromoData highValuePromoData = (HighValuePromoData) other;
        return Intrinsics.e(this.advText, highValuePromoData.advText) && Intrinsics.e(this.expirationDate, highValuePromoData.expirationDate) && Intrinsics.e(this.promoDesc, highValuePromoData.promoDesc) && Intrinsics.e(this.promoNum, highValuePromoData.promoNum) && Intrinsics.e(this.promptResponse, highValuePromoData.promptResponse) && this.isApplied == highValuePromoData.isApplied;
    }

    /* renamed from: a, reason: from getter */
    public final ZonedDateTime getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: b, reason: from getter */
    public final String getPromoDesc() {
        return this.promoDesc;
    }

    /* renamed from: c, reason: from getter */
    public final String getPromoNum() {
        return this.promoNum;
    }

    /* renamed from: d, reason: from getter */
    public final String getPromptResponse() {
        return this.promptResponse;
    }

    public int hashCode() {
        String str = this.advText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ZonedDateTime zonedDateTime = this.expirationDate;
        int iHashCode2 = (iHashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        String str2 = this.promoDesc;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.promoNum;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.promptResponse;
        return ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + Boolean.hashCode(this.isApplied);
    }

    public String toString() {
        return "HighValuePromoData(advText=" + this.advText + ", expirationDate=" + this.expirationDate + ", promoDesc=" + this.promoDesc + ", promoNum=" + this.promoNum + ", promptResponse=" + this.promptResponse + ", isApplied=" + this.isApplied + ')';
    }

    public HighValuePromoData(String str, ZonedDateTime zonedDateTime, String str2, String str3, String str4, boolean z10) {
        this.advText = str;
        this.expirationDate = zonedDateTime;
        this.promoDesc = str2;
        this.promoNum = str3;
        this.promptResponse = str4;
        this.isApplied = z10;
    }
}
