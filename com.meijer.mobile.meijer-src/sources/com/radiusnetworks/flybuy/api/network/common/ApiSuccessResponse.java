package com.radiusnetworks.flybuy.api.network.common;

import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 **\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001+B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00028\u00002\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0010R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0012R#\u0010)\u001a\u0004\u0018\u00010\u00038FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&¨\u0006,"}, d2 = {"Lcom/radiusnetworks/flybuy/api/network/common/ApiSuccessResponse;", "T", "Lcom/radiusnetworks/flybuy/api/network/common/ApiResponse;", "", "code", "body", "", "", "links", "<init>", "(ILjava/lang/Object;Ljava/util/Map;)V", "linkHeader", "(ILjava/lang/Object;Ljava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/Object;", "component3", "()Ljava/util/Map;", "copy", "(ILjava/lang/Object;Ljava/util/Map;)Lcom/radiusnetworks/flybuy/api/network/common/ApiSuccessResponse;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCode", "Ljava/lang/Object;", "getBody", "Ljava/util/Map;", "getLinks", "nextPage$delegate", "Lkotlin/Lazy;", "getNextPage", "()Ljava/lang/Integer;", "getNextPage$annotations", "()V", "nextPage", "Companion", "com/radiusnetworks/flybuy/api/network/common/b", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ApiSuccessResponse<T> extends ApiResponse<T> {
    private static final String NEXT_LINK = "next";
    private final T body;
    private final int code;
    private final Map<String, String> links;

    /* renamed from: nextPage$delegate, reason: from kotlin metadata */
    private final Lazy nextPage;
    public static final b Companion = new b();
    private static final Pattern LINK_PATTERN = Pattern.compile("<([^>]*)>[\\s]*;[\\s]*rel=\"([a-zA-Z0-9]+)\"");
    private static final Pattern PAGE_PATTERN = Pattern.compile("\\bpage=(\\d+)");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiSuccessResponse(int i10, T t10, Map<String, String> links) {
        super(i10, null);
        Intrinsics.j(links, "links");
        this.code = i10;
        this.body = t10;
        this.links = links;
        this.nextPage = LazyKt.a(LazyThreadSafetyMode.f143288c, new c(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiSuccessResponse copy$default(ApiSuccessResponse apiSuccessResponse, int i10, Object obj, Map map, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            i10 = apiSuccessResponse.code;
        }
        if ((i11 & 2) != 0) {
            obj = apiSuccessResponse.body;
        }
        if ((i11 & 4) != 0) {
            map = apiSuccessResponse.links;
        }
        return apiSuccessResponse.copy(i10, obj, map);
    }

    public static /* synthetic */ void getNextPage$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    public final T component2() {
        return this.body;
    }

    public final Map<String, String> component3() {
        return this.links;
    }

    public final ApiSuccessResponse<T> copy(int code, T body, Map<String, String> links) {
        Intrinsics.j(links, "links");
        return new ApiSuccessResponse<>(code, body, links);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiSuccessResponse)) {
            return false;
        }
        ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) other;
        return this.code == apiSuccessResponse.code && Intrinsics.e(this.body, apiSuccessResponse.body) && Intrinsics.e(this.links, apiSuccessResponse.links);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.code) * 31;
        T t10 = this.body;
        return this.links.hashCode() + ((iHashCode + (t10 == null ? 0 : t10.hashCode())) * 31);
    }

    public String toString() {
        return "ApiSuccessResponse(code=" + this.code + ", body=" + this.body + ", links=" + this.links + ')';
    }

    public final T getBody() {
        return this.body;
    }

    @Override // com.radiusnetworks.flybuy.api.network.common.ApiResponse
    public int getCode() {
        return this.code;
    }

    public final Map<String, String> getLinks() {
        return this.links;
    }

    public final Integer getNextPage() {
        return (Integer) this.nextPage.getValue();
    }

    public ApiSuccessResponse(int i10, T t10, String str) {
        Map mapK;
        if (str != null) {
            Companion.getClass();
            mapK = new LinkedHashMap();
            Matcher matcher = LINK_PATTERN.matcher(str);
            while (matcher.find()) {
                if (matcher.groupCount() == 2) {
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null && strGroup2 != null) {
                        mapK.put(strGroup2, strGroup);
                    }
                }
            }
        } else {
            mapK = MapsKt.k();
        }
        this(i10, t10, (Map<String, String>) mapK);
    }
}
