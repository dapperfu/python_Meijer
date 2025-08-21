package com.radiusnetworks.flybuy.sdk.data.places;

import android.content.Context;
import com.radiusnetworks.flybuy.api.mapbox.MapboxApi;
import com.radiusnetworks.flybuy.api.mapbox.model.GetSearchBoxRetrieveResponse;
import com.radiusnetworks.flybuy.api.mapbox.model.GetSearchBoxSuggestionsResponse;
import com.radiusnetworks.flybuy.api.network.common.ApiResponse;
import com.radiusnetworks.flybuy.sdk.data.common.ApiExtensionsKt;
import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u001e\u0010\t\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0016Jk\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132$\u0010\t\u001a \u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/places/PlacesDataStore;", "Lcom/radiusnetworks/flybuy/sdk/data/places/PlacesRepository;", "applicationContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "retrieveCoordinate", "", "placeId", "", "callback", "Lkotlin/Function2;", "Lcom/radiusnetworks/flybuy/sdk/data/places/PlaceLocation;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "suggest", "query", "types", "", "countryCodes", "proximityLatitude", "", "proximityLongitude", "Lcom/radiusnetworks/flybuy/sdk/data/places/Place;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/jvm/functions/Function2;)V", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PlacesDataStore implements PlacesRepository {
    private final Context applicationContext;

    public PlacesDataStore(Context applicationContext) {
        Intrinsics.j(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.places.PlacesRepository
    public void retrieveCoordinate(final String placeId, Function2<? super PlaceLocation, ? super SdkError, Unit> callback) {
        Intrinsics.j(placeId, "placeId");
        ApiExtensionsKt.executeApi(this.applicationContext, new Function0<ApiResponse<GetSearchBoxRetrieveResponse>>() { // from class: com.radiusnetworks.flybuy.sdk.data.places.PlacesDataStore.retrieveCoordinate.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ApiResponse<GetSearchBoxRetrieveResponse> invoke() {
                return MapboxApi.getSearchBoxRetrieve(placeId);
            }
        }, new Function1<GetSearchBoxRetrieveResponse, PlaceLocation>() { // from class: com.radiusnetworks.flybuy.sdk.data.places.PlacesDataStore.retrieveCoordinate.2
            @Override // kotlin.jvm.functions.Function1
            public final PlaceLocation invoke(GetSearchBoxRetrieveResponse it) {
                Intrinsics.j(it, "it");
                return PlaceLocationKt.toCoordinate(it);
            }
        }, new Function1<ApiResponse<PlaceLocation>, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.places.PlacesDataStore.retrieveCoordinate.3
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ApiResponse<PlaceLocation> it) {
                Intrinsics.j(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiResponse<PlaceLocation> apiResponse) {
                invoke2(apiResponse);
                return Unit.f143329a;
            }
        }, callback);
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.places.PlacesRepository
    public void suggest(final String query, final List<String> types, final List<String> countryCodes, final Double proximityLatitude, final Double proximityLongitude, Function2<? super List<Place>, ? super SdkError, Unit> callback) {
        Intrinsics.j(query, "query");
        Intrinsics.j(types, "types");
        Intrinsics.j(countryCodes, "countryCodes");
        ApiExtensionsKt.executeApi(this.applicationContext, new Function0<ApiResponse<GetSearchBoxSuggestionsResponse>>() { // from class: com.radiusnetworks.flybuy.sdk.data.places.PlacesDataStore.suggest.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ApiResponse<GetSearchBoxSuggestionsResponse> invoke() {
                return MapboxApi.getSearchBoxSuggestion(query, types, countryCodes, proximityLatitude, proximityLongitude);
            }
        }, new Function1<GetSearchBoxSuggestionsResponse, List<? extends Place>>() { // from class: com.radiusnetworks.flybuy.sdk.data.places.PlacesDataStore.suggest.2
            @Override // kotlin.jvm.functions.Function1
            public final List<Place> invoke(GetSearchBoxSuggestionsResponse it) {
                Intrinsics.j(it, "it");
                return PlaceKt.toSuggestions(it);
            }
        }, new Function1<ApiResponse<List<? extends Place>>, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.places.PlacesDataStore.suggest.3
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ApiResponse<List<Place>> it) {
                Intrinsics.j(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiResponse<List<? extends Place>> apiResponse) {
                invoke2((ApiResponse<List<Place>>) apiResponse);
                return Unit.f143329a;
            }
        }, callback);
    }
}
