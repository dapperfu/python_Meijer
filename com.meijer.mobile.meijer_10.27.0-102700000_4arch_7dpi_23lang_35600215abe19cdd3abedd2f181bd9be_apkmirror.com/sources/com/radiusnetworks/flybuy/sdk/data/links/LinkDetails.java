package com.radiusnetworks.flybuy.sdk.data.links;

import androidx.annotation.Keep;
import com.radiusnetworks.flybuy.sdk.manager.builder.OrderOptions;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/links/LinkDetails;", "", "url", "", "type", "Lcom/radiusnetworks/flybuy/sdk/data/links/LinkType;", "orderOptions", "Lcom/radiusnetworks/flybuy/sdk/manager/builder/OrderOptions$Builder;", "params", "", "(Ljava/lang/String;Lcom/radiusnetworks/flybuy/sdk/data/links/LinkType;Lcom/radiusnetworks/flybuy/sdk/manager/builder/OrderOptions$Builder;Ljava/util/Map;)V", "getOrderOptions", "()Lcom/radiusnetworks/flybuy/sdk/manager/builder/OrderOptions$Builder;", "getParams", "()Ljava/util/Map;", "getType", "()Lcom/radiusnetworks/flybuy/sdk/data/links/LinkType;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LinkDetails {
    private final OrderOptions.Builder orderOptions;
    private final Map<String, String> params;
    private final LinkType type;
    private final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinkDetails copy$default(LinkDetails linkDetails, String str, LinkType linkType, OrderOptions.Builder builder, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = linkDetails.url;
        }
        if ((i10 & 2) != 0) {
            linkType = linkDetails.type;
        }
        if ((i10 & 4) != 0) {
            builder = linkDetails.orderOptions;
        }
        if ((i10 & 8) != 0) {
            map = linkDetails.params;
        }
        return linkDetails.copy(str, linkType, builder, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final LinkType getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final OrderOptions.Builder getOrderOptions() {
        return this.orderOptions;
    }

    public final Map<String, String> component4() {
        return this.params;
    }

    public final LinkDetails copy(String url, LinkType type, OrderOptions.Builder orderOptions, Map<String, String> params) {
        Intrinsics.j(url, "url");
        Intrinsics.j(type, "type");
        Intrinsics.j(params, "params");
        return new LinkDetails(url, type, orderOptions, params);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkDetails)) {
            return false;
        }
        LinkDetails linkDetails = (LinkDetails) other;
        return Intrinsics.e(this.url, linkDetails.url) && this.type == linkDetails.type && Intrinsics.e(this.orderOptions, linkDetails.orderOptions) && Intrinsics.e(this.params, linkDetails.params);
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + (this.url.hashCode() * 31)) * 31;
        OrderOptions.Builder builder = this.orderOptions;
        return this.params.hashCode() + ((iHashCode + (builder == null ? 0 : builder.hashCode())) * 31);
    }

    public String toString() {
        return "LinkDetails(url=" + this.url + ", type=" + this.type + ", orderOptions=" + this.orderOptions + ", params=" + this.params + ')';
    }

    public LinkDetails(String url, LinkType type, OrderOptions.Builder builder, Map<String, String> params) {
        Intrinsics.j(url, "url");
        Intrinsics.j(type, "type");
        Intrinsics.j(params, "params");
        this.url = url;
        this.type = type;
        this.orderOptions = builder;
        this.params = params;
    }

    public final OrderOptions.Builder getOrderOptions() {
        return this.orderOptions;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    public final LinkType getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }
}
