package com.radiusnetworks.flybuy.api.mapbox;

import androidx.annotation.Keep;
import com.fullstory.FS;
import com.radiusnetworks.flybuy.api.mapbox.model.GetSearchBoxRetrieveResponse;
import com.radiusnetworks.flybuy.api.mapbox.model.GetSearchBoxSuggestionsResponse;
import com.radiusnetworks.flybuy.api.network.common.ApiResponse;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Keep
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007JK\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001a2\u0006\u0010\u001f\u001a\u00020\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040!2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0002\u0010&J\u001e\u0010'\u001a\u00020(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00048G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006*"}, d2 = {"Lcom/radiusnetworks/flybuy/api/mapbox/MapboxApi;", "", "()V", "_tokenKey", "", "defaultBaseUrl", "logLevel", "", "getLogLevel$api_defaultRelease", "()I", "setLogLevel$api_defaultRelease", "(I)V", "sessionId", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "getSessionId$api_defaultRelease", "()Ljava/util/UUID;", "setSessionId$api_defaultRelease", "(Ljava/util/UUID;)V", "value", "tokenKey", "getTokenKey", "()Ljava/lang/String;", "setTokenKey", "(Ljava/lang/String;)V", "getSearchBoxRetrieve", "Lcom/radiusnetworks/flybuy/api/network/common/ApiResponse;", "Lcom/radiusnetworks/flybuy/api/mapbox/model/GetSearchBoxRetrieveResponse;", "placeId", "getSearchBoxSuggestion", "Lcom/radiusnetworks/flybuy/api/mapbox/model/GetSearchBoxSuggestionsResponse;", "query", "types", "", "countryCodes", "proximityLatitude", "", "proximityLongitude", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;)Lcom/radiusnetworks/flybuy/api/network/common/ApiResponse;", "initialize", "", "baseUrl", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MapboxApi {
    private static final String defaultBaseUrl = "https://api.mapbox.com/";
    public static final MapboxApi INSTANCE = new MapboxApi();
    private static UUID sessionId = UUID.randomUUID();
    private static int logLevel = 8;
    private static String _tokenKey = "";

    @JvmStatic
    public static final ApiResponse<GetSearchBoxRetrieveResponse> getSearchBoxRetrieve(String placeId) {
        Intrinsics.j(placeId, "placeId");
        Intrinsics.j(placeId, "placeId");
        try {
            Response responseExecute = ((Call) new a(placeId).invoke()).execute();
            com.radiusnetworks.flybuy.api.network.common.a aVar = ApiResponse.Companion;
            Intrinsics.g(responseExecute);
            aVar.getClass();
            return com.radiusnetworks.flybuy.api.network.common.a.b(responseExecute);
        } catch (IOException e10) {
            ApiResponse.Companion.getClass();
            return com.radiusnetworks.flybuy.api.network.common.a.a(e10);
        }
    }

    @JvmStatic
    public static final ApiResponse<GetSearchBoxSuggestionsResponse> getSearchBoxSuggestion(String query, List<String> types, List<String> countryCodes, Double proximityLatitude, Double proximityLongitude) {
        Intrinsics.j(query, "query");
        Intrinsics.j(types, "types");
        Intrinsics.j(countryCodes, "countryCodes");
        Intrinsics.j(query, "query");
        Intrinsics.j(types, "types");
        Intrinsics.j(countryCodes, "countryCodes");
        if (countryCodes.isEmpty()) {
            countryCodes = null;
        }
        try {
            Response responseExecute = ((Call) new b(query, types, countryCodes, proximityLatitude, proximityLongitude).invoke()).execute();
            com.radiusnetworks.flybuy.api.network.common.a aVar = ApiResponse.Companion;
            Intrinsics.g(responseExecute);
            aVar.getClass();
            return com.radiusnetworks.flybuy.api.network.common.a.b(responseExecute);
        } catch (IOException e10) {
            ApiResponse.Companion.getClass();
            return com.radiusnetworks.flybuy.api.network.common.a.a(e10);
        }
    }

    @JvmStatic
    public static final void initialize(String baseUrl, int logLevel2) {
        Unit unit;
        logLevel = logLevel2;
        if (baseUrl != null) {
            Intrinsics.j(baseUrl, "baseUrl");
            Intrinsics.j(baseUrl, "baseUrl");
            Retrofit.Builder builderAddConverterFactory = new Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create());
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            FS.okhttp_addInterceptors(builder);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            OkHttpClient.Builder builderJ = builder.d(30000L, timeUnit).V(30000L, timeUnit).j(true);
            builderJ.addInterceptor(new com.radiusnetworks.flybuy.api.mapbox.interceptors.a());
            Retrofit.Builder builderClient = builderAddConverterFactory.client(builderJ.a());
            Intrinsics.i(builderClient, "client(...)");
            Retrofit retrofitBuild = builderClient.build();
            Intrinsics.i(retrofitBuild, "build(...)");
            c.f120879a = retrofitBuild;
            unit = Unit.f143329a;
        } else {
            unit = null;
        }
        if (unit == null) {
            Intrinsics.j(defaultBaseUrl, "baseUrl");
            Intrinsics.j(defaultBaseUrl, "baseUrl");
            Retrofit.Builder builderAddConverterFactory2 = new Retrofit.Builder().baseUrl(defaultBaseUrl).addConverterFactory(GsonConverterFactory.create());
            OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
            FS.okhttp_addInterceptors(builder2);
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            OkHttpClient.Builder builderJ2 = builder2.d(30000L, timeUnit2).V(30000L, timeUnit2).j(true);
            builderJ2.addInterceptor(new com.radiusnetworks.flybuy.api.mapbox.interceptors.a());
            Retrofit.Builder builderClient2 = builderAddConverterFactory2.client(builderJ2.a());
            Intrinsics.i(builderClient2, "client(...)");
            Retrofit retrofitBuild2 = builderClient2.build();
            Intrinsics.i(retrofitBuild2, "build(...)");
            c.f120879a = retrofitBuild2;
        }
    }

    public static /* synthetic */ void initialize$default(String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            i10 = 8;
        }
        initialize(str, i10);
    }

    public final int getLogLevel$api_defaultRelease() {
        return logLevel;
    }

    public final UUID getSessionId$api_defaultRelease() {
        return sessionId;
    }

    public final String getTokenKey() {
        return _tokenKey;
    }

    public final void setLogLevel$api_defaultRelease(int i10) {
        logLevel = i10;
    }

    public final void setSessionId$api_defaultRelease(UUID uuid) {
        sessionId = uuid;
    }

    public final void setTokenKey(String value) {
        Intrinsics.j(value, "value");
        _tokenKey = value;
    }

    private MapboxApi() {
    }
}
