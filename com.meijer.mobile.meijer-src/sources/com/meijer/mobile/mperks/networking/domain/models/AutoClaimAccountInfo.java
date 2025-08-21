package com.meijer.mobile.mperks.networking.domain.models;

import co.AbstractC6530b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/AutoClaimAccountInfo;", "", "Lco/b;", "autoClaimType", "", "autoClaimAmount", "<init>", "(Lco/b;Ljava/lang/Double;)V", "component1", "()Lco/b;", "component2", "()Ljava/lang/Double;", "copy", "(Lco/b;Ljava/lang/Double;)Lcom/meijer/mobile/mperks/networking/domain/models/AutoClaimAccountInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lco/b;", "getAutoClaimType", "Ljava/lang/Double;", "getAutoClaimAmount", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AutoClaimAccountInfo {
    private final Double autoClaimAmount;
    private final AbstractC6530b autoClaimType;

    /* JADX WARN: Multi-variable type inference failed */
    public AutoClaimAccountInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: component2, reason: from getter */
    public final Double getAutoClaimAmount() {
        return this.autoClaimAmount;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoClaimAccountInfo)) {
            return false;
        }
        AutoClaimAccountInfo autoClaimAccountInfo = (AutoClaimAccountInfo) other;
        return Intrinsics.e(this.autoClaimType, autoClaimAccountInfo.autoClaimType) && Intrinsics.e(this.autoClaimAmount, autoClaimAccountInfo.autoClaimAmount);
    }

    public int hashCode() {
        AbstractC6530b abstractC6530b = this.autoClaimType;
        int iHashCode = (abstractC6530b == null ? 0 : abstractC6530b.hashCode()) * 31;
        Double d10 = this.autoClaimAmount;
        return iHashCode + (d10 != null ? d10.hashCode() : 0);
    }

    public String toString() {
        return "AutoClaimAccountInfo(autoClaimType=" + this.autoClaimType + ", autoClaimAmount=" + this.autoClaimAmount + ')';
    }

    public AutoClaimAccountInfo(AbstractC6530b abstractC6530b, Double d10) {
        this.autoClaimType = abstractC6530b;
        this.autoClaimAmount = d10;
    }

    public static /* synthetic */ AutoClaimAccountInfo copy$default(AutoClaimAccountInfo autoClaimAccountInfo, AbstractC6530b abstractC6530b, Double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC6530b = autoClaimAccountInfo.autoClaimType;
        }
        if ((i10 & 2) != 0) {
            d10 = autoClaimAccountInfo.autoClaimAmount;
        }
        return autoClaimAccountInfo.copy(abstractC6530b, d10);
    }

    /* renamed from: component1, reason: from getter */
    public final AbstractC6530b getAutoClaimType() {
        return this.autoClaimType;
    }

    public final AutoClaimAccountInfo copy(AbstractC6530b autoClaimType, Double autoClaimAmount) {
        return new AutoClaimAccountInfo(autoClaimType, autoClaimAmount);
    }

    public final Double getAutoClaimAmount() {
        return this.autoClaimAmount;
    }

    public final AbstractC6530b getAutoClaimType() {
        return this.autoClaimType;
    }

    public /* synthetic */ AutoClaimAccountInfo(AbstractC6530b abstractC6530b, Double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : abstractC6530b, (i10 & 2) != 0 ? null : d10);
    }
}
