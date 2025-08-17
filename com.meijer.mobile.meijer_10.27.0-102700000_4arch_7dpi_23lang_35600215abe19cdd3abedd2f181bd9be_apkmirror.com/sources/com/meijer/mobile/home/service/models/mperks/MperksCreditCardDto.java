package com.meijer.mobile.home.service.models.mperks;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJH\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/home/service/models/mperks/MperksCreditCardDto;", "", "", "availableRewardSummary", "availableRewardTitle", "clippedRewardSummary", "clippedRewardTitle", "summary", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/home/service/models/mperks/MperksCreditCardDto;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "e", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MperksCreditCardDto {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String availableRewardSummary;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String availableRewardTitle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clippedRewardSummary;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clippedRewardTitle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String summary;

    public MperksCreditCardDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final MperksCreditCardDto copy(@g(name = "availableRewardSummary") String availableRewardSummary, @g(name = "availableRewardTitle") String availableRewardTitle, @g(name = "clippedRewardSummary") String clippedRewardSummary, @g(name = "clippedRewardTitle") String clippedRewardTitle, @g(name = "summary") String summary) {
        Intrinsics.j(availableRewardTitle, "availableRewardTitle");
        Intrinsics.j(clippedRewardTitle, "clippedRewardTitle");
        return new MperksCreditCardDto(availableRewardSummary, availableRewardTitle, clippedRewardSummary, clippedRewardTitle, summary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksCreditCardDto)) {
            return false;
        }
        MperksCreditCardDto mperksCreditCardDto = (MperksCreditCardDto) other;
        return Intrinsics.e(this.availableRewardSummary, mperksCreditCardDto.availableRewardSummary) && Intrinsics.e(this.availableRewardTitle, mperksCreditCardDto.availableRewardTitle) && Intrinsics.e(this.clippedRewardSummary, mperksCreditCardDto.clippedRewardSummary) && Intrinsics.e(this.clippedRewardTitle, mperksCreditCardDto.clippedRewardTitle) && Intrinsics.e(this.summary, mperksCreditCardDto.summary);
    }

    public int hashCode() {
        String str = this.availableRewardSummary;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.availableRewardTitle.hashCode()) * 31;
        String str2 = this.clippedRewardSummary;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.clippedRewardTitle.hashCode()) * 31;
        String str3 = this.summary;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "MperksCreditCardDto(availableRewardSummary=" + this.availableRewardSummary + ", availableRewardTitle=" + this.availableRewardTitle + ", clippedRewardSummary=" + this.clippedRewardSummary + ", clippedRewardTitle=" + this.clippedRewardTitle + ", summary=" + this.summary + ')';
    }

    public MperksCreditCardDto(@g(name = "availableRewardSummary") String str, @g(name = "availableRewardTitle") String availableRewardTitle, @g(name = "clippedRewardSummary") String str2, @g(name = "clippedRewardTitle") String clippedRewardTitle, @g(name = "summary") String str3) {
        Intrinsics.j(availableRewardTitle, "availableRewardTitle");
        Intrinsics.j(clippedRewardTitle, "clippedRewardTitle");
        this.availableRewardSummary = str;
        this.availableRewardTitle = availableRewardTitle;
        this.clippedRewardSummary = str2;
        this.clippedRewardTitle = clippedRewardTitle;
        this.summary = str3;
    }

    /* renamed from: a, reason: from getter */
    public final String getAvailableRewardSummary() {
        return this.availableRewardSummary;
    }

    /* renamed from: b, reason: from getter */
    public final String getAvailableRewardTitle() {
        return this.availableRewardTitle;
    }

    /* renamed from: c, reason: from getter */
    public final String getClippedRewardSummary() {
        return this.clippedRewardSummary;
    }

    /* renamed from: d, reason: from getter */
    public final String getClippedRewardTitle() {
        return this.clippedRewardTitle;
    }

    /* renamed from: e, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    public /* synthetic */ MperksCreditCardDto(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? null : str5);
    }
}
