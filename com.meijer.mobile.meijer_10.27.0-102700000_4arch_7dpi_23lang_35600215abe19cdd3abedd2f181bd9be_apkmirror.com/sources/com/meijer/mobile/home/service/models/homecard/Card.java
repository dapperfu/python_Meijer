package com.meijer.mobile.home.service.models.homecard;

import com.medallia.digital.mobilesdk.l3;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJd\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001c\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/home/service/models/homecard/Card;", "", "", "title", "deeplinkTitle", "deeplink", "fallbackTitle", "fallbackCategoryId", "fallbackDeeplink", "carouselBanner", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/home/service/models/homecard/Card;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "b", "c", "d", "f", "e", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Card {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deeplinkTitle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deeplink;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fallbackTitle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fallbackCategoryId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fallbackDeeplink;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String carouselBanner;

    public Card() {
        this(null, null, null, null, null, null, null, l3.f92485d, null);
    }

    public final Card copy(@g(name = "title") String title, @g(name = "deeplinkTitle") String deeplinkTitle, @g(name = "deeplink") String deeplink, @g(name = "fallbackTitle") String fallbackTitle, @g(name = "fallbackCategoryId") String fallbackCategoryId, @g(name = "fallbackDeeplink") String fallbackDeeplink, @g(name = "carouselBanner") String carouselBanner) {
        return new Card(title, deeplinkTitle, deeplink, fallbackTitle, fallbackCategoryId, fallbackDeeplink, carouselBanner);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Card)) {
            return false;
        }
        Card card = (Card) other;
        return Intrinsics.e(this.title, card.title) && Intrinsics.e(this.deeplinkTitle, card.deeplinkTitle) && Intrinsics.e(this.deeplink, card.deeplink) && Intrinsics.e(this.fallbackTitle, card.fallbackTitle) && Intrinsics.e(this.fallbackCategoryId, card.fallbackCategoryId) && Intrinsics.e(this.fallbackDeeplink, card.fallbackDeeplink) && Intrinsics.e(this.carouselBanner, card.carouselBanner);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.deeplinkTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deeplink;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fallbackTitle;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fallbackCategoryId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fallbackDeeplink;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.carouselBanner;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "Card(title=" + this.title + ", deeplinkTitle=" + this.deeplinkTitle + ", deeplink=" + this.deeplink + ", fallbackTitle=" + this.fallbackTitle + ", fallbackCategoryId=" + this.fallbackCategoryId + ", fallbackDeeplink=" + this.fallbackDeeplink + ", carouselBanner=" + this.carouselBanner + ')';
    }

    public Card(@g(name = "title") String str, @g(name = "deeplinkTitle") String str2, @g(name = "deeplink") String str3, @g(name = "fallbackTitle") String str4, @g(name = "fallbackCategoryId") String str5, @g(name = "fallbackDeeplink") String str6, @g(name = "carouselBanner") String str7) {
        this.title = str;
        this.deeplinkTitle = str2;
        this.deeplink = str3;
        this.fallbackTitle = str4;
        this.fallbackCategoryId = str5;
        this.fallbackDeeplink = str6;
        this.carouselBanner = str7;
    }

    /* renamed from: a, reason: from getter */
    public final String getCarouselBanner() {
        return this.carouselBanner;
    }

    /* renamed from: b, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: c, reason: from getter */
    public final String getDeeplinkTitle() {
        return this.deeplinkTitle;
    }

    /* renamed from: d, reason: from getter */
    public final String getFallbackCategoryId() {
        return this.fallbackCategoryId;
    }

    /* renamed from: e, reason: from getter */
    public final String getFallbackDeeplink() {
        return this.fallbackDeeplink;
    }

    /* renamed from: f, reason: from getter */
    public final String getFallbackTitle() {
        return this.fallbackTitle;
    }

    /* renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ Card(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7);
    }
}
