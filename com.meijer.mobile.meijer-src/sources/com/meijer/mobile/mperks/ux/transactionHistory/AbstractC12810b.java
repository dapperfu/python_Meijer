package com.meijer.mobile.mperks.ux.transactionHistory;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/mperks/ux/transactionHistory/b;", "", "<init>", "()V", "a", "Lcom/meijer/mobile/mperks/ux/transactionHistory/b$a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.mperks.ux.transactionHistory.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC12810b {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/mperks/ux/transactionHistory/b$a;", "Lcom/meijer/mobile/mperks/ux/transactionHistory/b;", "", "maxItemCount", "", "continuationToken", "", "includeAdjustmentDetails", "<init>", "(ILjava/lang/String;Ljava/lang/Boolean;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Ljava/lang/String;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.mperks.ux.transactionHistory.b$a, reason: from toString */
    public static final /* data */ class FetchTransactions extends AbstractC12810b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int maxItemCount;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String continuationToken;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean includeAdjustmentDetails;

        public FetchTransactions(int i10, String str, Boolean bool) {
            super(null);
            this.maxItemCount = i10;
            this.continuationToken = str;
            this.includeAdjustmentDetails = bool;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FetchTransactions)) {
                return false;
            }
            FetchTransactions fetchTransactions = (FetchTransactions) other;
            return this.maxItemCount == fetchTransactions.maxItemCount && Intrinsics.e(this.continuationToken, fetchTransactions.continuationToken) && Intrinsics.e(this.includeAdjustmentDetails, fetchTransactions.includeAdjustmentDetails);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.maxItemCount) * 31;
            String str = this.continuationToken;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.includeAdjustmentDetails;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "FetchTransactions(maxItemCount=" + this.maxItemCount + ", continuationToken=" + this.continuationToken + ", includeAdjustmentDetails=" + this.includeAdjustmentDetails + ')';
        }

        /* renamed from: a, reason: from getter */
        public final String getContinuationToken() {
            return this.continuationToken;
        }

        /* renamed from: b, reason: from getter */
        public final Boolean getIncludeAdjustmentDetails() {
            return this.includeAdjustmentDetails;
        }

        /* renamed from: c, reason: from getter */
        public final int getMaxItemCount() {
            return this.maxItemCount;
        }
    }

    public /* synthetic */ AbstractC12810b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC12810b() {
    }
}
