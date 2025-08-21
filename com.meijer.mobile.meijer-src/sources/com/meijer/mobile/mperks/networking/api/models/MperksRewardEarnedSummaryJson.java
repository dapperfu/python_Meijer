package com.meijer.mobile.mperks.networking.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/MperksRewardEarnedSummaryJson;", "", "", "earnedCount", "<init>", "(I)V", "copy", "(I)Lcom/meijer/mobile/mperks/networking/api/models/MperksRewardEarnedSummaryJson;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MperksRewardEarnedSummaryJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int earnedCount;

    public MperksRewardEarnedSummaryJson() {
        this(0, 1, null);
    }

    public final MperksRewardEarnedSummaryJson copy(@g(name = "earnedCount") int earnedCount) {
        return new MperksRewardEarnedSummaryJson(earnedCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MperksRewardEarnedSummaryJson) && this.earnedCount == ((MperksRewardEarnedSummaryJson) other).earnedCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.earnedCount);
    }

    public String toString() {
        return "MperksRewardEarnedSummaryJson(earnedCount=" + this.earnedCount + ')';
    }

    public MperksRewardEarnedSummaryJson(@g(name = "earnedCount") int i10) {
        this.earnedCount = i10;
    }

    /* renamed from: a, reason: from getter */
    public final int getEarnedCount() {
        return this.earnedCount;
    }

    public /* synthetic */ MperksRewardEarnedSummaryJson(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
