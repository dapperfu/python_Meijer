package com.meijer.mobile.mperks.networking.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/MperksClaimRewardResponse;", "", "", "success", "Lcom/meijer/mobile/mperks/networking/api/models/MperksErrorJson;", "error", "<init>", "(ZLcom/meijer/mobile/mperks/networking/api/models/MperksErrorJson;)V", "copy", "(ZLcom/meijer/mobile/mperks/networking/api/models/MperksErrorJson;)Lcom/meijer/mobile/mperks/networking/api/models/MperksClaimRewardResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Lcom/meijer/mobile/mperks/networking/api/models/MperksErrorJson;", "()Lcom/meijer/mobile/mperks/networking/api/models/MperksErrorJson;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MperksClaimRewardResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean success;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final MperksErrorJson error;

    public MperksClaimRewardResponse(@g(name = "success") boolean z10, @g(name = "error") MperksErrorJson mperksErrorJson) {
        this.success = z10;
        this.error = mperksErrorJson;
    }

    public final MperksClaimRewardResponse copy(@g(name = "success") boolean success, @g(name = "error") MperksErrorJson error) {
        return new MperksClaimRewardResponse(success, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksClaimRewardResponse)) {
            return false;
        }
        MperksClaimRewardResponse mperksClaimRewardResponse = (MperksClaimRewardResponse) other;
        return this.success == mperksClaimRewardResponse.success && Intrinsics.e(this.error, mperksClaimRewardResponse.error);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        MperksErrorJson mperksErrorJson = this.error;
        return iHashCode + (mperksErrorJson == null ? 0 : mperksErrorJson.hashCode());
    }

    public String toString() {
        return "MperksClaimRewardResponse(success=" + this.success + ", error=" + this.error + ')';
    }

    /* renamed from: a, reason: from getter */
    public final MperksErrorJson getError() {
        return this.error;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public /* synthetic */ MperksClaimRewardResponse(boolean z10, MperksErrorJson mperksErrorJson, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i10 & 2) != 0 ? null : mperksErrorJson);
    }
}
