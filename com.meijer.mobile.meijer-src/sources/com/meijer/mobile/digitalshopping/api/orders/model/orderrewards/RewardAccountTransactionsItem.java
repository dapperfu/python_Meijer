package com.meijer.mobile.digitalshopping.api.orders.model.orderrewards;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJX\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0016\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001c\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001b\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/model/orderrewards/RewardAccountTransactionsItem;", "", "", "transactionType", "postedAt", "documentType", "label", "transactionId", "", "points", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/meijer/mobile/digitalshopping/api/orders/model/orderrewards/RewardAccountTransactionsItem;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "d", "c", "e", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RewardAccountTransactionsItem {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postedAt;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String label;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer points;

    public RewardAccountTransactionsItem() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final RewardAccountTransactionsItem copy(@g(name = "transactionType") String transactionType, @g(name = "postedAt") String postedAt, @g(name = "documentType") String documentType, @g(name = "label") String label, @g(name = "transactionId") String transactionId, @g(name = "points") Integer points) {
        return new RewardAccountTransactionsItem(transactionType, postedAt, documentType, label, transactionId, points);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardAccountTransactionsItem)) {
            return false;
        }
        RewardAccountTransactionsItem rewardAccountTransactionsItem = (RewardAccountTransactionsItem) other;
        return Intrinsics.e(this.transactionType, rewardAccountTransactionsItem.transactionType) && Intrinsics.e(this.postedAt, rewardAccountTransactionsItem.postedAt) && Intrinsics.e(this.documentType, rewardAccountTransactionsItem.documentType) && Intrinsics.e(this.label, rewardAccountTransactionsItem.label) && Intrinsics.e(this.transactionId, rewardAccountTransactionsItem.transactionId) && Intrinsics.e(this.points, rewardAccountTransactionsItem.points);
    }

    public int hashCode() {
        String str = this.transactionType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.postedAt;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.documentType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.label;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.transactionId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.points;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "RewardAccountTransactionsItem(transactionType=" + this.transactionType + ", postedAt=" + this.postedAt + ", documentType=" + this.documentType + ", label=" + this.label + ", transactionId=" + this.transactionId + ", points=" + this.points + ')';
    }

    public RewardAccountTransactionsItem(@g(name = "transactionType") String str, @g(name = "postedAt") String str2, @g(name = "documentType") String str3, @g(name = "label") String str4, @g(name = "transactionId") String str5, @g(name = "points") Integer num) {
        this.transactionType = str;
        this.postedAt = str2;
        this.documentType = str3;
        this.label = str4;
        this.transactionId = str5;
        this.points = num;
    }

    /* renamed from: a, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    /* renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: c, reason: from getter */
    public final Integer getPoints() {
        return this.points;
    }

    /* renamed from: d, reason: from getter */
    public final String getPostedAt() {
        return this.postedAt;
    }

    /* renamed from: e, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* renamed from: f, reason: from getter */
    public final String getTransactionType() {
        return this.transactionType;
    }

    public /* synthetic */ RewardAccountTransactionsItem(String str, String str2, String str3, String str4, String str5, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : num);
    }
}
