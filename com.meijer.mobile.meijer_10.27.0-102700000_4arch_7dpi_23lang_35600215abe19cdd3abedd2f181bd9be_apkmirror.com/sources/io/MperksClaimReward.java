package io;

import com.meijer.mobile.mperks.networking.domain.MperksClaimRewardError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"Lio/b;", "", "", "success", "Lcom/meijer/mobile/mperks/networking/domain/a;", "error", "<init>", "(ZLcom/meijer/mobile/mperks/networking/domain/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Lcom/meijer/mobile/mperks/networking/domain/a;", "()Lcom/meijer/mobile/mperks/networking/domain/a;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: io.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class MperksClaimReward {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean success;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final MperksClaimRewardError error;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksClaimReward)) {
            return false;
        }
        MperksClaimReward mperksClaimReward = (MperksClaimReward) other;
        return this.success == mperksClaimReward.success && Intrinsics.e(this.error, mperksClaimReward.error);
    }

    /* renamed from: a, reason: from getter */
    public final MperksClaimRewardError getError() {
        return this.error;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        MperksClaimRewardError mperksClaimRewardError = this.error;
        return iHashCode + (mperksClaimRewardError == null ? 0 : mperksClaimRewardError.hashCode());
    }

    public String toString() {
        return "MperksClaimReward(success=" + this.success + ", error=" + this.error + ')';
    }

    public MperksClaimReward(boolean z10, MperksClaimRewardError mperksClaimRewardError) {
        this.success = z10;
        this.error = mperksClaimRewardError;
    }
}
