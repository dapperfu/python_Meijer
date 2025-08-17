package com.meijer.mobile.digitalshopping.api.orders.model.orderrewards;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0012\b\u0003\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\u0012\b\u0003\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R!\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/model/orderrewards/Payload;", "", "", "Lcom/meijer/mobile/digitalshopping/api/orders/model/orderrewards/RewardAccountTransactionsItem;", "rewardAccountTransactions", "", "totalPoints", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "copy", "(Ljava/util/List;Ljava/lang/Integer;)Lcom/meijer/mobile/digitalshopping/api/orders/model/orderrewards/Payload;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Payload {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<RewardAccountTransactionsItem> rewardAccountTransactions;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer totalPoints;

    /* JADX WARN: Multi-variable type inference failed */
    public Payload() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Payload copy(@g(name = "rewardAccountTransactions") List<RewardAccountTransactionsItem> rewardAccountTransactions, @g(name = "totalPoints") Integer totalPoints) {
        return new Payload(rewardAccountTransactions, totalPoints);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Payload)) {
            return false;
        }
        Payload payload = (Payload) other;
        return Intrinsics.e(this.rewardAccountTransactions, payload.rewardAccountTransactions) && Intrinsics.e(this.totalPoints, payload.totalPoints);
    }

    public int hashCode() {
        List<RewardAccountTransactionsItem> list = this.rewardAccountTransactions;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.totalPoints;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "Payload(rewardAccountTransactions=" + this.rewardAccountTransactions + ", totalPoints=" + this.totalPoints + ')';
    }

    public Payload(@g(name = "rewardAccountTransactions") List<RewardAccountTransactionsItem> list, @g(name = "totalPoints") Integer num) {
        this.rewardAccountTransactions = list;
        this.totalPoints = num;
    }

    public final List<RewardAccountTransactionsItem> a() {
        return this.rewardAccountTransactions;
    }

    /* renamed from: b, reason: from getter */
    public final Integer getTotalPoints() {
        return this.totalPoints;
    }

    public /* synthetic */ Payload(List list, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : num);
    }
}
