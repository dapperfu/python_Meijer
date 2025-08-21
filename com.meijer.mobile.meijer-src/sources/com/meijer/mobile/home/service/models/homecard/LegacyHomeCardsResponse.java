package com.meijer.mobile.home.service.models.homecard;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u0018R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/home/service/models/homecard/LegacyHomeCardsResponse;", "", "", "nextPageCookie", "", "Lcom/meijer/mobile/home/service/models/homecard/HandPickedOfferCard;", "legacyCards", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/meijer/mobile/home/service/models/homecard/LegacyHomeCardsResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "setNextPageCookie", "(Ljava/lang/String;)V", "Ljava/util/List;", "()Ljava/util/List;", "setLegacyCards", "(Ljava/util/List;)V", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class LegacyHomeCardsResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private String nextPageCookie;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private List<HandPickedOfferCard> legacyCards;

    /* JADX WARN: Multi-variable type inference failed */
    public LegacyHomeCardsResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final LegacyHomeCardsResponse copy(@g(name = "nextPageCookie") String nextPageCookie, @g(name = "cards") List<HandPickedOfferCard> legacyCards) {
        Intrinsics.j(legacyCards, "legacyCards");
        return new LegacyHomeCardsResponse(nextPageCookie, legacyCards);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegacyHomeCardsResponse)) {
            return false;
        }
        LegacyHomeCardsResponse legacyHomeCardsResponse = (LegacyHomeCardsResponse) other;
        return Intrinsics.e(this.nextPageCookie, legacyHomeCardsResponse.nextPageCookie) && Intrinsics.e(this.legacyCards, legacyHomeCardsResponse.legacyCards);
    }

    public int hashCode() {
        String str = this.nextPageCookie;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.legacyCards.hashCode();
    }

    public String toString() {
        return "LegacyHomeCardsResponse(nextPageCookie=" + this.nextPageCookie + ", legacyCards=" + this.legacyCards + ')';
    }

    public LegacyHomeCardsResponse(@g(name = "nextPageCookie") String str, @g(name = "cards") List<HandPickedOfferCard> legacyCards) {
        Intrinsics.j(legacyCards, "legacyCards");
        this.nextPageCookie = str;
        this.legacyCards = legacyCards;
    }

    public final List<HandPickedOfferCard> a() {
        return this.legacyCards;
    }

    /* renamed from: b, reason: from getter */
    public final String getNextPageCookie() {
        return this.nextPageCookie;
    }

    public /* synthetic */ LegacyHomeCardsResponse(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? CollectionsKt.m() : list);
    }
}
