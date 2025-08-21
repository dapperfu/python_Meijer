package com.radiusnetworks.flybuy.api.mapbox;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.radiusnetworks.flybuy.api.mapbox.model.GetSearchBoxRetrieveResponse;
import com.radiusnetworks.flybuy.api.mapbox.model.GetSearchBoxSuggestionsResponse;
import kotlin.Metadata;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001JM\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\b\u0001\u0010\f\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/radiusnetworks/flybuy/api/mapbox/d;", "", "", "query", "language", "types", "countryCodes", "proximity", "Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/mapbox/model/GetSearchBoxSuggestionsResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;", "placeId", "Lcom/radiusnetworks/flybuy/api/mapbox/model/GetSearchBoxRetrieveResponse;", "(Ljava/lang/String;)Lretrofit2/Call;", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface d {
    @GET("/search/searchbox/v1/retrieve/{placeId}")
    Call<GetSearchBoxRetrieveResponse> a(@Path("placeId") String placeId);

    @GET("/search/searchbox/v1/suggest")
    Call<GetSearchBoxSuggestionsResponse> a(@Query("q") String query, @Query("language") String language, @Query("types") String types, @Query(PlaceTypes.COUNTRY) String countryCodes, @Query("proximity") String proximity);
}
