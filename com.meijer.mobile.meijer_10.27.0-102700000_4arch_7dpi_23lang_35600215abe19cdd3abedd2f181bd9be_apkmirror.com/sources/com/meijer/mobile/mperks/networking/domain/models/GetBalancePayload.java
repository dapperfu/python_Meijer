package com.meijer.mobile.mperks.networking.domain.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/GetBalancePayload;", "", "totalPoints", "", "<init>", "(I)V", "getTotalPoints", "()I", "setTotalPoints", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class GetBalancePayload {
    private int totalPoints;

    public static /* synthetic */ GetBalancePayload copy$default(GetBalancePayload getBalancePayload, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = getBalancePayload.totalPoints;
        }
        return getBalancePayload.copy(i10);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTotalPoints() {
        return this.totalPoints;
    }

    public final GetBalancePayload copy(@g(name = "totalPoints") int totalPoints) {
        return new GetBalancePayload(totalPoints);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetBalancePayload) && this.totalPoints == ((GetBalancePayload) other).totalPoints;
    }

    public int hashCode() {
        return Integer.hashCode(this.totalPoints);
    }

    public String toString() {
        return "GetBalancePayload(totalPoints=" + this.totalPoints + ')';
    }

    public final int getTotalPoints() {
        return this.totalPoints;
    }

    public final void setTotalPoints(int i10) {
        this.totalPoints = i10;
    }

    public GetBalancePayload(@g(name = "totalPoints") int i10) {
        this.totalPoints = i10;
    }
}
