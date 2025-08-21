package com.radiusnetworks.flybuy.api.network.common;

import androidx.annotation.Keep;
import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B7\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\nB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\u0019\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R,\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u0006X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/radiusnetworks/flybuy/api/network/common/ApiErrorResponse;", "T", "Lcom/radiusnetworks/flybuy/api/network/common/ApiResponse;", "code", "", "errorMessages", "", "", "", "appUpgradeUrl", "(ILjava/util/Map;Ljava/lang/String;)V", "(I)V", "getAppUpgradeUrl", "()Ljava/lang/String;", "setAppUpgradeUrl", "(Ljava/lang/String;)V", "getCode", "()I", "getErrorMessages", "()Ljava/util/Map;", "setErrorMessages", "(Ljava/util/Map;)V", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ApiErrorResponse<T> extends ApiResponse<T> {
    private String appUpgradeUrl;
    private final int code;
    public Map<String, ? extends List<String>> errorMessages;

    public ApiErrorResponse(int i10) {
        super(i10, null);
        this.code = i10;
    }

    public static /* synthetic */ ApiErrorResponse copy$default(ApiErrorResponse apiErrorResponse, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = apiErrorResponse.code;
        }
        return apiErrorResponse.copy(i10);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    public final ApiErrorResponse<T> copy(int code) {
        return new ApiErrorResponse<>(code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ApiErrorResponse) && this.code == ((ApiErrorResponse) other).code;
    }

    public int hashCode() {
        return Integer.hashCode(this.code);
    }

    public String toString() {
        return "ApiErrorResponse(code=" + this.code + ')';
    }

    public ApiErrorResponse(int i10, Map<String, ? extends List<String>> map, String str) {
        this(i10);
        this.appUpgradeUrl = str;
        setErrorMessages((map == null || map.isEmpty()) ? i10 != 401 ? i10 != 404 ? i10 != 422 ? i10 != 425 ? MapsKt.g(new Pair(zzbz.UNKNOWN_CONTENT_TYPE, CollectionsKt.e("Unknown error"))) : MapsKt.g(new Pair("app_update", CollectionsKt.e("Please update to the latest version of the app"))) : MapsKt.g(new Pair("unprocessable", CollectionsKt.e("Error processing input"))) : MapsKt.g(new Pair("not_found", CollectionsKt.e("Not found"))) : MapsKt.g(new Pair("unauthorized", CollectionsKt.e("Not authorized"))) : map);
    }

    public final String getAppUpgradeUrl() {
        return this.appUpgradeUrl;
    }

    @Override // com.radiusnetworks.flybuy.api.network.common.ApiResponse
    public int getCode() {
        return this.code;
    }

    public final Map<String, List<String>> getErrorMessages() {
        Map map = this.errorMessages;
        if (map != null) {
            return map;
        }
        Intrinsics.x("errorMessages");
        return null;
    }

    public final void setAppUpgradeUrl(String str) {
        this.appUpgradeUrl = str;
    }

    public final void setErrorMessages(Map<String, ? extends List<String>> map) {
        Intrinsics.j(map, "<set-?>");
        this.errorMessages = map;
    }

    public /* synthetic */ ApiErrorResponse(int i10, Map map, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, map, (i11 & 4) != 0 ? null : str);
    }
}
