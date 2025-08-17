package com.radiusnetworks.flybuy.api.mapbox;

import com.radiusnetworks.flybuy.api.mapbox.model.GetSearchBoxRetrieveResponse;
import com.radiusnetworks.flybuy.api.mapbox.model.GetSearchBoxSuggestionsResponse;
import java.util.List;
import kotlin.Metadata;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J@\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002H'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\b2\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'¨\u0006\r"}, d2 = {"Lcom/radiusnetworks/flybuy/api/mapbox/d;", "", "", "query", "language", "", "types", "proximity", "Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/mapbox/model/GetSearchBoxSuggestionsResponse;", "a", "placeId", "Lcom/radiusnetworks/flybuy/api/mapbox/model/GetSearchBoxRetrieveResponse;", "api_defaultRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public interface d {
    @GET("/search/searchbox/v1/retrieve/{placeId}")
    Call<GetSearchBoxRetrieveResponse> a(@Path("placeId") String placeId);

    @GET("/search/searchbox/v1/suggest")
    Call<GetSearchBoxSuggestionsResponse> a(@Query("q") String query, @Query("language") String language, @Query("types") List<String> types, @Query("proximity") String proximity);
}
