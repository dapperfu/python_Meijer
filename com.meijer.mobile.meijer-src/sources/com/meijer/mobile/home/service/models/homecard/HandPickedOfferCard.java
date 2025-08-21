package com.meijer.mobile.home.service.models.homecard;

import com.meijer.mobile.coupons.api.models.LegacyCouponJson;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\"\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001\u0017BA\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJJ\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0003\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0017\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b!\u0010\u001bR(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010&R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b'\u0010\u0013\"\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/meijer/mobile/home/service/models/homecard/HandPickedOfferCard;", "", "", "cardType", "", "canBeDismissed", "cardReason", "", "Lcom/meijer/mobile/coupons/api/models/LegacyCouponJson;", "handPickedOffers", "", "totalHandPickedOffersCount", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;I)V", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;I)Lcom/meijer/mobile/home/service/models/homecard/HandPickedOfferCard;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "setCardType", "(Ljava/lang/String;)V", "b", "Z", "()Z", "setCanBeDismissed", "(Z)V", "setCardReason", "d", "Ljava/util/List;", "()Ljava/util/List;", "setHandPickedOffers", "(Ljava/util/List;)V", "e", "I", "setTotalHandPickedOffersCount", "(I)V", "f", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class HandPickedOfferCard {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private String cardType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean canBeDismissed;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String cardReason;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private List<LegacyCouponJson> handPickedOffers;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private int totalHandPickedOffersCount;

    public HandPickedOfferCard() {
        this(null, false, null, null, 0, 31, null);
    }

    public final HandPickedOfferCard copy(@g(name = "cardType") String cardType, @g(name = "canBeDismissed") boolean canBeDismissed, @g(name = "cardReason") String cardReason, @g(name = "offers") List<LegacyCouponJson> handPickedOffers, @g(name = "count") int totalHandPickedOffersCount) {
        Intrinsics.j(cardType, "cardType");
        Intrinsics.j(handPickedOffers, "handPickedOffers");
        return new HandPickedOfferCard(cardType, canBeDismissed, cardReason, handPickedOffers, totalHandPickedOffersCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HandPickedOfferCard)) {
            return false;
        }
        HandPickedOfferCard handPickedOfferCard = (HandPickedOfferCard) other;
        return Intrinsics.e(this.cardType, handPickedOfferCard.cardType) && this.canBeDismissed == handPickedOfferCard.canBeDismissed && Intrinsics.e(this.cardReason, handPickedOfferCard.cardReason) && Intrinsics.e(this.handPickedOffers, handPickedOfferCard.handPickedOffers) && this.totalHandPickedOffersCount == handPickedOfferCard.totalHandPickedOffersCount;
    }

    public int hashCode() {
        int iHashCode = ((this.cardType.hashCode() * 31) + Boolean.hashCode(this.canBeDismissed)) * 31;
        String str = this.cardReason;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.handPickedOffers.hashCode()) * 31) + Integer.hashCode(this.totalHandPickedOffersCount);
    }

    public String toString() {
        return "HandPickedOfferCard(cardType=" + this.cardType + ", canBeDismissed=" + this.canBeDismissed + ", cardReason=" + this.cardReason + ", handPickedOffers=" + this.handPickedOffers + ", totalHandPickedOffersCount=" + this.totalHandPickedOffersCount + ')';
    }

    public HandPickedOfferCard(@g(name = "cardType") String cardType, @g(name = "canBeDismissed") boolean z10, @g(name = "cardReason") String str, @g(name = "offers") List<LegacyCouponJson> handPickedOffers, @g(name = "count") int i10) {
        Intrinsics.j(cardType, "cardType");
        Intrinsics.j(handPickedOffers, "handPickedOffers");
        this.cardType = cardType;
        this.canBeDismissed = z10;
        this.cardReason = str;
        this.handPickedOffers = handPickedOffers;
        this.totalHandPickedOffersCount = i10;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getCanBeDismissed() {
        return this.canBeDismissed;
    }

    /* renamed from: b, reason: from getter */
    public final String getCardReason() {
        return this.cardReason;
    }

    /* renamed from: c, reason: from getter */
    public final String getCardType() {
        return this.cardType;
    }

    public final List<LegacyCouponJson> d() {
        return this.handPickedOffers;
    }

    /* renamed from: e, reason: from getter */
    public final int getTotalHandPickedOffersCount() {
        return this.totalHandPickedOffersCount;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ HandPickedOfferCard(java.lang.String r2, boolean r3, java.lang.String r4, java.util.List r5, int r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            java.lang.String r2 = "HandpickedOffers"
        L6:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lc
            r3 = r0
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L11
            r4 = 0
        L11:
            r8 = r7 & 8
            if (r8 == 0) goto L19
            java.util.List r5 = kotlin.collections.CollectionsKt.m()
        L19:
            r7 = r7 & 16
            if (r7 == 0) goto L24
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L2a
        L24:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L2a:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.home.service.models.homecard.HandPickedOfferCard.<init>(java.lang.String, boolean, java.lang.String, java.util.List, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
