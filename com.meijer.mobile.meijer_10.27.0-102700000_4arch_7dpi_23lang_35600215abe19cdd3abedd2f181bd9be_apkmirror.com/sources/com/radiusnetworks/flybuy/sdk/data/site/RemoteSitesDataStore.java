package com.radiusnetworks.flybuy.sdk.data.site;

import android.content.Context;
import com.radiusnetworks.flybuy.api.FlyBuyApi;
import com.radiusnetworks.flybuy.api.model.GetSitesResponse;
import com.radiusnetworks.flybuy.api.network.common.ApiResponse;
import com.radiusnetworks.flybuy.api.network.common.ApiSuccessResponse;
import com.radiusnetworks.flybuy.sdk.data.common.ApiExtensionsKt;
import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.location.CircularRegion;
import com.radiusnetworks.flybuy.sdk.data.room.dao.SiteDao;
import com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Site;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JS\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u001e\u0010\u000e\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fH\u0016¢\u0006\u0002\u0010\u0012J_\u0010\u0005\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u001e\u0010\u000e\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fH\u0016¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/site/RemoteSitesDataStore;", "Lcom/radiusnetworks/flybuy/sdk/data/site/RemoteSitesRepository;", "applicationContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "fetch", "", "region", "Lcom/radiusnetworks/flybuy/sdk/data/location/CircularRegion;", "page", "", "per", "operationalStatus", "", "callback", "Lkotlin/Function2;", "Lcom/radiusnetworks/flybuy/sdk/data/site/PaginatedSites;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "(Lcom/radiusnetworks/flybuy/sdk/data/location/CircularRegion;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "query", "matchPartnerIdentifier", "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;)V", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RemoteSitesDataStore implements RemoteSitesRepository {
    private final Context applicationContext;

    @Override // com.radiusnetworks.flybuy.sdk.data.site.RemoteSitesRepository
    public void fetch(final String query, final Integer page, final Integer per, final String operationalStatus, final Boolean matchPartnerIdentifier, Function2<? super PaginatedSites, ? super SdkError, Unit> callback) {
        ApiExtensionsKt.executeApi(this.applicationContext, new Function0<ApiResponse<GetSitesResponse>>() { // from class: com.radiusnetworks.flybuy.sdk.data.site.RemoteSitesDataStore.fetch.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ApiResponse<GetSitesResponse> invoke() {
                return FlyBuyApi.getSites(query, page, per, operationalStatus, matchPartnerIdentifier);
            }
        }, new Function1<GetSitesResponse, PaginatedSites>() { // from class: com.radiusnetworks.flybuy.sdk.data.site.RemoteSitesDataStore.fetch.2
            @Override // kotlin.jvm.functions.Function1
            public final PaginatedSites invoke(GetSitesResponse it) {
                Intrinsics.j(it, "it");
                return PaginatedSitesKt.toPaginatedSites(it);
            }
        }, new Function1<ApiResponse<PaginatedSites>, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.site.RemoteSitesDataStore.fetch.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiResponse<PaginatedSites> apiResponse) {
                invoke2(apiResponse);
                return Unit.f142422a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ApiResponse<PaginatedSites> response) {
                Intrinsics.j(response, "response");
                if (response instanceof ApiSuccessResponse) {
                    AppDatabase companion = AppDatabase.INSTANCE.getInstance(RemoteSitesDataStore.this.applicationContext);
                    ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) response;
                    if (((PaginatedSites) apiSuccessResponse.getBody()).getPagination().getCurrentPage() == 1) {
                        companion.siteDao$core_defaultRelease().deleteAll();
                    }
                    List<Site> sites = ((PaginatedSites) apiSuccessResponse.getBody()).getSites();
                    SiteDao siteDaoSiteDao$core_defaultRelease = companion.siteDao$core_defaultRelease();
                    Site[] siteArr = (Site[]) sites.toArray(new Site[0]);
                    siteDaoSiteDao$core_defaultRelease.insertAll((Site[]) Arrays.copyOf(siteArr, siteArr.length));
                }
            }
        }, callback);
    }

    public RemoteSitesDataStore(Context applicationContext) {
        Intrinsics.j(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.site.RemoteSitesRepository
    public void fetch(final CircularRegion region, final Integer page, final Integer per, final String operationalStatus, Function2<? super PaginatedSites, ? super SdkError, Unit> callback) {
        Intrinsics.j(region, "region");
        ApiExtensionsKt.executeApi(this.applicationContext, new Function0<ApiResponse<GetSitesResponse>>() { // from class: com.radiusnetworks.flybuy.sdk.data.site.RemoteSitesDataStore.fetch.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ApiResponse<GetSitesResponse> invoke() {
                return FlyBuyApi.getSites(region.getLatitude(), region.getLongitude(), region.getRadius(), page, per, operationalStatus);
            }
        }, new Function1<GetSitesResponse, PaginatedSites>() { // from class: com.radiusnetworks.flybuy.sdk.data.site.RemoteSitesDataStore.fetch.5
            @Override // kotlin.jvm.functions.Function1
            public final PaginatedSites invoke(GetSitesResponse it) {
                Intrinsics.j(it, "it");
                return PaginatedSitesKt.toPaginatedSites(it);
            }
        }, new Function1<ApiResponse<PaginatedSites>, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.site.RemoteSitesDataStore.fetch.6
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ApiResponse<PaginatedSites> it) {
                Intrinsics.j(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiResponse<PaginatedSites> apiResponse) {
                invoke2(apiResponse);
                return Unit.f142422a;
            }
        }, callback);
    }
}
