package com.meijer.mobile.home.service.models.homecard;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJP\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00072\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001f\u0010\u0012R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006 "}, d2 = {"Lcom/meijer/mobile/home/service/models/homecard/LegacyHomeCardsRequest;", "", "", "nextPageCookie", "", "Lcom/meijer/mobile/home/service/models/homecard/LegacyHomeCardItem;", "cardItems", "", "numberOfCards", "storeId", "cardOrder", "<init>", "(Ljava/lang/String;Ljava/util/List;IILjava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/util/List;IILjava/util/List;)Lcom/meijer/mobile/home/service/models/homecard/LegacyHomeCardsRequest;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "()Ljava/util/List;", "I", "d", "e", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class LegacyHomeCardsRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nextPageCookie;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<LegacyHomeCardItem> cardItems;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int numberOfCards;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> cardOrder;

    public LegacyHomeCardsRequest(@g(name = "nextPageCookie") String str, @g(name = "cardItemCounts") List<LegacyHomeCardItem> cardItems, @g(name = "numberOfCards") int i10, @g(name = "storeId") int i11, @g(name = "cardOrder") List<String> cardOrder) {
        Intrinsics.j(cardItems, "cardItems");
        Intrinsics.j(cardOrder, "cardOrder");
        this.nextPageCookie = str;
        this.cardItems = cardItems;
        this.numberOfCards = i10;
        this.storeId = i11;
        this.cardOrder = cardOrder;
    }

    public final LegacyHomeCardsRequest copy(@g(name = "nextPageCookie") String nextPageCookie, @g(name = "cardItemCounts") List<LegacyHomeCardItem> cardItems, @g(name = "numberOfCards") int numberOfCards, @g(name = "storeId") int storeId, @g(name = "cardOrder") List<String> cardOrder) {
        Intrinsics.j(cardItems, "cardItems");
        Intrinsics.j(cardOrder, "cardOrder");
        return new LegacyHomeCardsRequest(nextPageCookie, cardItems, numberOfCards, storeId, cardOrder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegacyHomeCardsRequest)) {
            return false;
        }
        LegacyHomeCardsRequest legacyHomeCardsRequest = (LegacyHomeCardsRequest) other;
        return Intrinsics.e(this.nextPageCookie, legacyHomeCardsRequest.nextPageCookie) && Intrinsics.e(this.cardItems, legacyHomeCardsRequest.cardItems) && this.numberOfCards == legacyHomeCardsRequest.numberOfCards && this.storeId == legacyHomeCardsRequest.storeId && Intrinsics.e(this.cardOrder, legacyHomeCardsRequest.cardOrder);
    }

    public int hashCode() {
        String str = this.nextPageCookie;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.cardItems.hashCode()) * 31) + Integer.hashCode(this.numberOfCards)) * 31) + Integer.hashCode(this.storeId)) * 31) + this.cardOrder.hashCode();
    }

    public String toString() {
        return "LegacyHomeCardsRequest(nextPageCookie=" + this.nextPageCookie + ", cardItems=" + this.cardItems + ", numberOfCards=" + this.numberOfCards + ", storeId=" + this.storeId + ", cardOrder=" + this.cardOrder + ')';
    }

    public final List<LegacyHomeCardItem> a() {
        return this.cardItems;
    }

    public final List<String> b() {
        return this.cardOrder;
    }

    /* renamed from: c, reason: from getter */
    public final String getNextPageCookie() {
        return this.nextPageCookie;
    }

    /* renamed from: d, reason: from getter */
    public final int getNumberOfCards() {
        return this.numberOfCards;
    }

    /* renamed from: e, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    public /* synthetic */ LegacyHomeCardsRequest(String str, List list, int i10, int i11, List list2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? CollectionsKt.m() : list, (i12 & 4) != 0 ? 0 : i10, i11, (i12 & 16) != 0 ? CollectionsKt.m() : list2);
    }
}
