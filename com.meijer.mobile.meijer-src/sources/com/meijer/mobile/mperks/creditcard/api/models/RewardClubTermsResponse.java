package com.meijer.mobile.mperks.creditcard.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import j$.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import wk.C17898a;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\f\b\u0003\u0010\u0007\u001a\u00060\u0002j\u0002`\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\b\u0012\b\b\u0003\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJF\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\f\b\u0003\u0010\u0007\u001a\u00060\u0002j\u0002`\u00062\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u001b\u0010\u0007\u001a\u00060\u0002j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u0017\u0010\u0010¨\u0006 "}, d2 = {"Lcom/meijer/mobile/mperks/creditcard/api/models/RewardClubTermsResponse;", "", "", "termsId", "", "termsSourceId", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "termsCouponId", "", "termsText", "effectiveDate", "<init>", "(JIJLjava/lang/String;Ljava/lang/String;)V", "copy", "(JIJLjava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/mperks/creditcard/api/models/RewardClubTermsResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "c", "()J", "b", "I", "d", "Ljava/lang/String;", "e", "creditcard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RewardClubTermsResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long termsId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int termsSourceId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long termsCouponId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String termsText;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String effectiveDate;

    public RewardClubTermsResponse() {
        this(0L, 0, 0L, null, null, 31, null);
    }

    public final RewardClubTermsResponse copy(@g(name = "termsId") long termsId, @g(name = "termsSourceId") int termsSourceId, @g(name = "termsCouponId") long termsCouponId, @g(name = "termsText") String termsText, @g(name = "effectiveDate") String effectiveDate) {
        Intrinsics.j(termsText, "termsText");
        Intrinsics.j(effectiveDate, "effectiveDate");
        return new RewardClubTermsResponse(termsId, termsSourceId, termsCouponId, termsText, effectiveDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardClubTermsResponse)) {
            return false;
        }
        RewardClubTermsResponse rewardClubTermsResponse = (RewardClubTermsResponse) other;
        return this.termsId == rewardClubTermsResponse.termsId && this.termsSourceId == rewardClubTermsResponse.termsSourceId && this.termsCouponId == rewardClubTermsResponse.termsCouponId && Intrinsics.e(this.termsText, rewardClubTermsResponse.termsText) && Intrinsics.e(this.effectiveDate, rewardClubTermsResponse.effectiveDate);
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.termsId) * 31) + Integer.hashCode(this.termsSourceId)) * 31) + Long.hashCode(this.termsCouponId)) * 31) + this.termsText.hashCode()) * 31) + this.effectiveDate.hashCode();
    }

    public String toString() {
        return "RewardClubTermsResponse(termsId=" + this.termsId + ", termsSourceId=" + this.termsSourceId + ", termsCouponId=" + this.termsCouponId + ", termsText=" + this.termsText + ", effectiveDate=" + this.effectiveDate + ')';
    }

    public RewardClubTermsResponse(@g(name = "termsId") long j10, @g(name = "termsSourceId") int i10, @g(name = "termsCouponId") long j11, @g(name = "termsText") String termsText, @g(name = "effectiveDate") String effectiveDate) {
        Intrinsics.j(termsText, "termsText");
        Intrinsics.j(effectiveDate, "effectiveDate");
        this.termsId = j10;
        this.termsSourceId = i10;
        this.termsCouponId = j11;
        this.termsText = termsText;
        this.effectiveDate = effectiveDate;
    }

    /* renamed from: a, reason: from getter */
    public final String getEffectiveDate() {
        return this.effectiveDate;
    }

    /* renamed from: b, reason: from getter */
    public final long getTermsCouponId() {
        return this.termsCouponId;
    }

    /* renamed from: c, reason: from getter */
    public final long getTermsId() {
        return this.termsId;
    }

    /* renamed from: d, reason: from getter */
    public final int getTermsSourceId() {
        return this.termsSourceId;
    }

    /* renamed from: e, reason: from getter */
    public final String getTermsText() {
        return this.termsText;
    }

    public /* synthetic */ RewardClubTermsResponse(long j10, int i10, long j11, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j10, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? 0L : j11, (i11 & 8) != 0 ? "" : str, (i11 & 16) != 0 ? LocalDate.now().atStartOfDay().format(C17898a.ISO_LOCAL_DATE_TIME) : str2);
    }
}
