package com.meijer.mobile.mperks.networking.domain.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0002\b\u000eJ\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/ExpiringPointsResponse;", "", "points", "", "expiresOnString", "", "<init>", "(ILjava/lang/String;)V", "getPoints", "()I", "getExpiresOnString$networking_release", "()Ljava/lang/String;", "component1", "component2", "component2$networking_release", "copy", "equals", "", "other", "hashCode", "toString", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ExpiringPointsResponse {
    private final String expiresOnString;
    private final int points;

    /* JADX WARN: Multi-variable type inference failed */
    public ExpiringPointsResponse() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ExpiringPointsResponse copy$default(ExpiringPointsResponse expiringPointsResponse, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = expiringPointsResponse.points;
        }
        if ((i11 & 2) != 0) {
            str = expiringPointsResponse.expiresOnString;
        }
        return expiringPointsResponse.copy(i10, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPoints() {
        return this.points;
    }

    /* renamed from: component2$networking_release, reason: from getter */
    public final String getExpiresOnString() {
        return this.expiresOnString;
    }

    public final ExpiringPointsResponse copy(@g(name = "points") int points, @g(name = "expiresOn") String expiresOnString) {
        return new ExpiringPointsResponse(points, expiresOnString);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpiringPointsResponse)) {
            return false;
        }
        ExpiringPointsResponse expiringPointsResponse = (ExpiringPointsResponse) other;
        return this.points == expiringPointsResponse.points && Intrinsics.e(this.expiresOnString, expiringPointsResponse.expiresOnString);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.points) * 31;
        String str = this.expiresOnString;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ExpiringPointsResponse(points=" + this.points + ", expiresOnString=" + this.expiresOnString + ')';
    }

    public ExpiringPointsResponse(@g(name = "points") int i10, @g(name = "expiresOn") String str) {
        this.points = i10;
        this.expiresOnString = str;
    }

    public final String getExpiresOnString$networking_release() {
        return this.expiresOnString;
    }

    public final int getPoints() {
        return this.points;
    }

    public /* synthetic */ ExpiringPointsResponse(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? null : str);
    }
}
