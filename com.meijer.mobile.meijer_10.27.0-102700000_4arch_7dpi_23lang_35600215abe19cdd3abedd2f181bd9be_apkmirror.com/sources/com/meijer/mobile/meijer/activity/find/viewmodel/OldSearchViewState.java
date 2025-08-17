package com.meijer.mobile.meijer.activity.find.viewmodel;

import Go.SearchSuggestions;
import Hl.FulfillmentBarDecorator;
import Qo.l;
import hk.CartPreviewDecorator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jl\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010.\u001a\u0004\b%\u0010/R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001f\u00100\u001a\u0004\b,\u00101R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b3\u0010+R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b#\u00104\u001a\u0004\b(\u00105R\u0017\u00109\u001a\u0002068\u0006¢\u0006\f\n\u0004\b'\u00107\u001a\u0004\b2\u00108¨\u0006:"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/u;", "", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/n1;", "recentSearches", "LGo/a;", "searchSuggestions", "", "searchTerm", "", "querySubmitted", "isScannedUpc", "Lhk/a;", "cartDecorator", "LHl/a;", "fulfillmentBarDecorator", "isOrderUnderModification", "LQo/l$k;", "deeplinkFacets", "<init>", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/n1;LGo/a;Ljava/lang/String;ZZLhk/a;LHl/a;ZLQo/l$k;)V", "a", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/n1;LGo/a;Ljava/lang/String;ZZLhk/a;LHl/a;ZLQo/l$k;)Lcom/meijer/mobile/meijer/activity/find/viewmodel/u;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/n1;", "g", "()Lcom/meijer/mobile/meijer/activity/find/viewmodel/n1;", "b", "LGo/a;", "i", "()LGo/a;", "c", "Ljava/lang/String;", "j", "d", "Z", "f", "()Z", "e", "l", "Lhk/a;", "()Lhk/a;", "LHl/a;", "()LHl/a;", "h", "k", "LQo/l$k;", "()LQo/l$k;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/M1;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/M1;", "()Lcom/meijer/mobile/meijer/activity/find/viewmodel/M1;", "searchState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.u, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class OldSearchViewState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final RecentSearches recentSearches;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final SearchSuggestions searchSuggestions;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String searchTerm;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean querySubmitted;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isScannedUpc;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final CartPreviewDecorator cartDecorator;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final FulfillmentBarDecorator fulfillmentBarDecorator;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOrderUnderModification;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final l.k deeplinkFacets;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final M1 searchState;

    public OldSearchViewState(RecentSearches recentSearches, SearchSuggestions searchSuggestions, String searchTerm, boolean z10, boolean z11, CartPreviewDecorator cartDecorator, FulfillmentBarDecorator fulfillmentBarDecorator, boolean z12, l.k kVar) {
        Intrinsics.j(recentSearches, "recentSearches");
        Intrinsics.j(searchSuggestions, "searchSuggestions");
        Intrinsics.j(searchTerm, "searchTerm");
        Intrinsics.j(cartDecorator, "cartDecorator");
        Intrinsics.j(fulfillmentBarDecorator, "fulfillmentBarDecorator");
        this.recentSearches = recentSearches;
        this.searchSuggestions = searchSuggestions;
        this.searchTerm = searchTerm;
        this.querySubmitted = z10;
        this.isScannedUpc = z11;
        this.cartDecorator = cartDecorator;
        this.fulfillmentBarDecorator = fulfillmentBarDecorator;
        this.isOrderUnderModification = z12;
        this.deeplinkFacets = kVar;
        M1 m12 = (recentSearches.a().isEmpty() || !searchSuggestions.a().isEmpty()) ? ((!recentSearches.a().isEmpty() || searchSuggestions.a().isEmpty()) && searchSuggestions.a().isEmpty()) ? M1.f108083c : M1.f108081a : M1.f108082b;
        this.searchState = m12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OldSearchViewState)) {
            return false;
        }
        OldSearchViewState oldSearchViewState = (OldSearchViewState) other;
        return Intrinsics.e(this.recentSearches, oldSearchViewState.recentSearches) && Intrinsics.e(this.searchSuggestions, oldSearchViewState.searchSuggestions) && Intrinsics.e(this.searchTerm, oldSearchViewState.searchTerm) && this.querySubmitted == oldSearchViewState.querySubmitted && this.isScannedUpc == oldSearchViewState.isScannedUpc && Intrinsics.e(this.cartDecorator, oldSearchViewState.cartDecorator) && Intrinsics.e(this.fulfillmentBarDecorator, oldSearchViewState.fulfillmentBarDecorator) && this.isOrderUnderModification == oldSearchViewState.isOrderUnderModification && Intrinsics.e(this.deeplinkFacets, oldSearchViewState.deeplinkFacets);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.recentSearches.hashCode() * 31) + this.searchSuggestions.hashCode()) * 31) + this.searchTerm.hashCode()) * 31) + Boolean.hashCode(this.querySubmitted)) * 31) + Boolean.hashCode(this.isScannedUpc)) * 31) + this.cartDecorator.hashCode()) * 31) + this.fulfillmentBarDecorator.hashCode()) * 31) + Boolean.hashCode(this.isOrderUnderModification)) * 31;
        l.k kVar = this.deeplinkFacets;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }

    public String toString() {
        return "OldSearchViewState(recentSearches=" + this.recentSearches + ", searchSuggestions=" + this.searchSuggestions + ", searchTerm=" + this.searchTerm + ", querySubmitted=" + this.querySubmitted + ", isScannedUpc=" + this.isScannedUpc + ", cartDecorator=" + this.cartDecorator + ", fulfillmentBarDecorator=" + this.fulfillmentBarDecorator + ", isOrderUnderModification=" + this.isOrderUnderModification + ", deeplinkFacets=" + this.deeplinkFacets + ')';
    }

    public static /* synthetic */ OldSearchViewState b(OldSearchViewState oldSearchViewState, RecentSearches recentSearches, SearchSuggestions searchSuggestions, String str, boolean z10, boolean z11, CartPreviewDecorator cartPreviewDecorator, FulfillmentBarDecorator fulfillmentBarDecorator, boolean z12, l.k kVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            recentSearches = oldSearchViewState.recentSearches;
        }
        if ((i10 & 2) != 0) {
            searchSuggestions = oldSearchViewState.searchSuggestions;
        }
        if ((i10 & 4) != 0) {
            str = oldSearchViewState.searchTerm;
        }
        if ((i10 & 8) != 0) {
            z10 = oldSearchViewState.querySubmitted;
        }
        if ((i10 & 16) != 0) {
            z11 = oldSearchViewState.isScannedUpc;
        }
        if ((i10 & 32) != 0) {
            cartPreviewDecorator = oldSearchViewState.cartDecorator;
        }
        if ((i10 & 64) != 0) {
            fulfillmentBarDecorator = oldSearchViewState.fulfillmentBarDecorator;
        }
        if ((i10 & 128) != 0) {
            z12 = oldSearchViewState.isOrderUnderModification;
        }
        if ((i10 & 256) != 0) {
            kVar = oldSearchViewState.deeplinkFacets;
        }
        boolean z13 = z12;
        l.k kVar2 = kVar;
        CartPreviewDecorator cartPreviewDecorator2 = cartPreviewDecorator;
        FulfillmentBarDecorator fulfillmentBarDecorator2 = fulfillmentBarDecorator;
        boolean z14 = z11;
        String str2 = str;
        return oldSearchViewState.a(recentSearches, searchSuggestions, str2, z10, z14, cartPreviewDecorator2, fulfillmentBarDecorator2, z13, kVar2);
    }

    public final OldSearchViewState a(RecentSearches recentSearches, SearchSuggestions searchSuggestions, String searchTerm, boolean querySubmitted, boolean isScannedUpc, CartPreviewDecorator cartDecorator, FulfillmentBarDecorator fulfillmentBarDecorator, boolean isOrderUnderModification, l.k deeplinkFacets) {
        Intrinsics.j(recentSearches, "recentSearches");
        Intrinsics.j(searchSuggestions, "searchSuggestions");
        Intrinsics.j(searchTerm, "searchTerm");
        Intrinsics.j(cartDecorator, "cartDecorator");
        Intrinsics.j(fulfillmentBarDecorator, "fulfillmentBarDecorator");
        return new OldSearchViewState(recentSearches, searchSuggestions, searchTerm, querySubmitted, isScannedUpc, cartDecorator, fulfillmentBarDecorator, isOrderUnderModification, deeplinkFacets);
    }

    /* renamed from: c, reason: from getter */
    public final CartPreviewDecorator getCartDecorator() {
        return this.cartDecorator;
    }

    /* renamed from: d, reason: from getter */
    public final l.k getDeeplinkFacets() {
        return this.deeplinkFacets;
    }

    /* renamed from: e, reason: from getter */
    public final FulfillmentBarDecorator getFulfillmentBarDecorator() {
        return this.fulfillmentBarDecorator;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getQuerySubmitted() {
        return this.querySubmitted;
    }

    /* renamed from: g, reason: from getter */
    public final RecentSearches getRecentSearches() {
        return this.recentSearches;
    }

    /* renamed from: h, reason: from getter */
    public final M1 getSearchState() {
        return this.searchState;
    }

    /* renamed from: i, reason: from getter */
    public final SearchSuggestions getSearchSuggestions() {
        return this.searchSuggestions;
    }

    /* renamed from: j, reason: from getter */
    public final String getSearchTerm() {
        return this.searchTerm;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getIsOrderUnderModification() {
        return this.isOrderUnderModification;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getIsScannedUpc() {
        return this.isScannedUpc;
    }

    public /* synthetic */ OldSearchViewState(RecentSearches recentSearches, SearchSuggestions searchSuggestions, String str, boolean z10, boolean z11, CartPreviewDecorator cartPreviewDecorator, FulfillmentBarDecorator fulfillmentBarDecorator, boolean z12, l.k kVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new RecentSearches(CollectionsKt.m(), 0, 2, null) : recentSearches, searchSuggestions, (i10 & 4) != 0 ? "" : str, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0 ? new CartPreviewDecorator(false, 0, 3, null) : cartPreviewDecorator, (i10 & 64) != 0 ? new FulfillmentBarDecorator(null, null, null, null, null, 0, 0, false, false, null, 1023, null) : fulfillmentBarDecorator, (i10 & 128) != 0 ? false : z12, (i10 & 256) != 0 ? null : kVar);
    }
}
