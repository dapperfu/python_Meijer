package com.meijer.mobile.home.service.models.homecard;

import Co.ProductFullDetails;
import Vl.HomeProductCard;
import Vl.e;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import dm.C13704b;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001\u0018BC\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJL\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b!\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001e\u0010#¨\u0006%"}, d2 = {"Lcom/meijer/mobile/home/service/models/homecard/HomeCardResponse;", "", "Lcom/meijer/mobile/home/service/models/homecard/Card;", "card", "Lcom/meijer/mobile/home/service/models/homecard/ProductsData;", "data", "", "type", PreferencesHelper.PREF_ID, "Lcom/meijer/mobile/home/service/models/homecard/HomeCardErrorResponse;", "error", "<init>", "(Lcom/meijer/mobile/home/service/models/homecard/Card;Lcom/meijer/mobile/home/service/models/homecard/ProductsData;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/home/service/models/homecard/HomeCardErrorResponse;)V", "copy", "(Lcom/meijer/mobile/home/service/models/homecard/Card;Lcom/meijer/mobile/home/service/models/homecard/ProductsData;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/home/service/models/homecard/HomeCardErrorResponse;)Lcom/meijer/mobile/home/service/models/homecard/HomeCardResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/home/service/models/homecard/Card;", "()Lcom/meijer/mobile/home/service/models/homecard/Card;", "b", "Lcom/meijer/mobile/home/service/models/homecard/ProductsData;", "()Lcom/meijer/mobile/home/service/models/homecard/ProductsData;", "c", "Ljava/lang/String;", "e", "d", "Lcom/meijer/mobile/home/service/models/homecard/HomeCardErrorResponse;", "()Lcom/meijer/mobile/home/service/models/homecard/HomeCardErrorResponse;", "f", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class HomeCardResponse {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Card card;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductsData data;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final HomeCardErrorResponse error;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJO\u0010\u0013\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/home/service/models/homecard/HomeCardResponse$a;", "", "<init>", "()V", "Lcom/meijer/mobile/home/service/models/homecard/Card;", "card", "", "LCo/h;", "productsPayload", "LVl/e;", "componentType", "Lcom/meijer/mobile/home/service/models/homecard/HomeCardErrorResponse;", "error", "LVl/h;", "a", "(Lcom/meijer/mobile/home/service/models/homecard/Card;Ljava/util/List;LVl/e;Lcom/meijer/mobile/home/service/models/homecard/HomeCardErrorResponse;)LVl/h;", "", "onLoadBeacon", "onViewBeacon", "b", "(Lcom/meijer/mobile/home/service/models/homecard/Card;Ljava/util/List;LVl/e;Lcom/meijer/mobile/home/service/models/homecard/HomeCardErrorResponse;Ljava/lang/String;Ljava/lang/String;)LVl/h;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.home.service.models.homecard.HomeCardResponse$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ HomeProductCard c(Companion companion, Card card, List list, e eVar, HomeCardErrorResponse homeCardErrorResponse, String str, String str2, int i10, Object obj) {
            if ((i10 & 16) != 0) {
                str = null;
            }
            if ((i10 & 32) != 0) {
                str2 = null;
            }
            return companion.b(card, list, eVar, homeCardErrorResponse, str, str2);
        }

        public final HomeProductCard a(Card card, List<ProductFullDetails> productsPayload, e componentType, HomeCardErrorResponse error) {
            Intrinsics.j(productsPayload, "productsPayload");
            Intrinsics.j(componentType, "componentType");
            String fallbackCategoryId = card != null ? card.getFallbackCategoryId() : null;
            String str = fallbackCategoryId == null ? "" : fallbackCategoryId;
            String title = card != null ? card.getTitle() : null;
            return new HomeProductCard(productsPayload, title != null ? title : "", null, card != null ? card.getDeeplink() : null, card != null ? card.getCarouselBanner() : null, componentType, str, null, null, error != null ? C13704b.a(error) : null, 388, null);
        }

        public final HomeProductCard b(Card card, List<ProductFullDetails> productsPayload, e componentType, HomeCardErrorResponse error, String onLoadBeacon, String onViewBeacon) {
            Intrinsics.j(productsPayload, "productsPayload");
            Intrinsics.j(componentType, "componentType");
            String fallbackCategoryId = card != null ? card.getFallbackCategoryId() : null;
            String str = fallbackCategoryId == null ? "" : fallbackCategoryId;
            String title = card != null ? card.getTitle() : null;
            return new HomeProductCard(productsPayload, title != null ? title : "", null, card != null ? card.getDeeplink() : null, card != null ? card.getCarouselBanner() : null, componentType, str, onViewBeacon, onLoadBeacon, error != null ? C13704b.a(error) : null, 4, null);
        }
    }

    public HomeCardResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public final HomeCardResponse copy(@g(name = "card") Card card, @g(name = "data") ProductsData data, @g(name = "type") String type, @g(name = PreferencesHelper.PREF_ID) String id2, @g(name = "error") HomeCardErrorResponse error) {
        return new HomeCardResponse(card, data, type, id2, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeCardResponse)) {
            return false;
        }
        HomeCardResponse homeCardResponse = (HomeCardResponse) other;
        return Intrinsics.e(this.card, homeCardResponse.card) && Intrinsics.e(this.data, homeCardResponse.data) && Intrinsics.e(this.type, homeCardResponse.type) && Intrinsics.e(this.id, homeCardResponse.id) && Intrinsics.e(this.error, homeCardResponse.error);
    }

    public int hashCode() {
        Card card = this.card;
        int iHashCode = (card == null ? 0 : card.hashCode()) * 31;
        ProductsData productsData = this.data;
        int iHashCode2 = (iHashCode + (productsData == null ? 0 : productsData.hashCode())) * 31;
        String str = this.type;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.id;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        HomeCardErrorResponse homeCardErrorResponse = this.error;
        return iHashCode4 + (homeCardErrorResponse != null ? homeCardErrorResponse.hashCode() : 0);
    }

    public String toString() {
        return "HomeCardResponse(card=" + this.card + ", data=" + this.data + ", type=" + this.type + ", id=" + this.id + ", error=" + this.error + ')';
    }

    public HomeCardResponse(@g(name = "card") Card card, @g(name = "data") ProductsData productsData, @g(name = "type") String str, @g(name = PreferencesHelper.PREF_ID) String str2, @g(name = "error") HomeCardErrorResponse homeCardErrorResponse) {
        this.card = card;
        this.data = productsData;
        this.type = str;
        this.id = str2;
        this.error = homeCardErrorResponse;
    }

    /* renamed from: a, reason: from getter */
    public final Card getCard() {
        return this.card;
    }

    /* renamed from: b, reason: from getter */
    public final ProductsData getData() {
        return this.data;
    }

    /* renamed from: c, reason: from getter */
    public final HomeCardErrorResponse getError() {
        return this.error;
    }

    /* renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: e, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public /* synthetic */ HomeCardResponse(Card card, ProductsData productsData, String str, String str2, HomeCardErrorResponse homeCardErrorResponse, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : card, (i10 & 2) != 0 ? null : productsData, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : homeCardErrorResponse);
    }
}
