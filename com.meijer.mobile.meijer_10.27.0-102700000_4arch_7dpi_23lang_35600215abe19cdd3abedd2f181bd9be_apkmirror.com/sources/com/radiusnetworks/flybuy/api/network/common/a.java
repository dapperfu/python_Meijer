package com.radiusnetworks.flybuy.api.network.common;

import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import com.google.gson.Gson;
import com.radiusnetworks.flybuy.api.model.ErrorResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* loaded from: classes11.dex */
public final class a {
    public static ApiErrorResponse a(IOException error) {
        Intrinsics.j(error, "error");
        String message = error.getMessage();
        if (message == null) {
            message = "Unknown Error";
        }
        return new ApiErrorResponse(-1, MapsKt.g(new Pair(zzbz.UNKNOWN_CONTENT_TYPE, CollectionsKt.g(message))), null, 4, null);
    }

    public static ApiResponse b(Response response) {
        Map<String, List<String>> mapG;
        Intrinsics.j(response, "response");
        int iCode = response.code();
        if (response.isSuccessful()) {
            Object objBody = response.body();
            return objBody == null ? new ApiEmptyResponse(iCode) : new ApiSuccessResponse(iCode, objBody, response.headers().get("link"));
        }
        ResponseBody responseBodyErrorBody = response.errorBody();
        String strString = responseBodyErrorBody != null ? responseBodyErrorBody.string() : null;
        if (strString == null || strString.length() == 0) {
            mapG = MapsKt.g(new Pair(zzbz.UNKNOWN_CONTENT_TYPE, CollectionsKt.g("Unknown Error")));
        } else {
            try {
                mapG = ((ErrorResponse) new Gson().o(strString, ErrorResponse.class)).getErrors();
            } catch (Exception unused) {
                mapG = MapsKt.g(new Pair(zzbz.UNKNOWN_CONTENT_TYPE, CollectionsKt.g("Unknown Error")));
                iCode = -2;
            }
        }
        return new ApiErrorResponse(iCode, mapG, response.headers().get("App-Upgrade-URL"));
    }
}
