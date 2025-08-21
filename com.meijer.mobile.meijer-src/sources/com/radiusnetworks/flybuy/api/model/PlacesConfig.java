package com.radiusnetworks.flybuy.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import og.InterfaceC16127c;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/PlacesConfig;", "", "mapboxAccessToken", "", "suggestionRequestDelayMillis", "", "(Ljava/lang/String;J)V", "getMapboxAccessToken", "()Ljava/lang/String;", "getSuggestionRequestDelayMillis", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PlacesConfig {

    @InterfaceC16127c("mapbox_access_token")
    private final String mapboxAccessToken;

    @InterfaceC16127c("suggestion_request_delay_ms")
    private final long suggestionRequestDelayMillis;

    public static /* synthetic */ PlacesConfig copy$default(PlacesConfig placesConfig, String str, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = placesConfig.mapboxAccessToken;
        }
        if ((i10 & 2) != 0) {
            j10 = placesConfig.suggestionRequestDelayMillis;
        }
        return placesConfig.copy(str, j10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMapboxAccessToken() {
        return this.mapboxAccessToken;
    }

    /* renamed from: component2, reason: from getter */
    public final long getSuggestionRequestDelayMillis() {
        return this.suggestionRequestDelayMillis;
    }

    public final PlacesConfig copy(String mapboxAccessToken, long suggestionRequestDelayMillis) {
        Intrinsics.j(mapboxAccessToken, "mapboxAccessToken");
        return new PlacesConfig(mapboxAccessToken, suggestionRequestDelayMillis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlacesConfig)) {
            return false;
        }
        PlacesConfig placesConfig = (PlacesConfig) other;
        return Intrinsics.e(this.mapboxAccessToken, placesConfig.mapboxAccessToken) && this.suggestionRequestDelayMillis == placesConfig.suggestionRequestDelayMillis;
    }

    public int hashCode() {
        return Long.hashCode(this.suggestionRequestDelayMillis) + (this.mapboxAccessToken.hashCode() * 31);
    }

    public String toString() {
        return "PlacesConfig(mapboxAccessToken=" + this.mapboxAccessToken + ", suggestionRequestDelayMillis=" + this.suggestionRequestDelayMillis + ')';
    }

    public PlacesConfig(String mapboxAccessToken, long j10) {
        Intrinsics.j(mapboxAccessToken, "mapboxAccessToken");
        this.mapboxAccessToken = mapboxAccessToken;
        this.suggestionRequestDelayMillis = j10;
    }

    public final String getMapboxAccessToken() {
        return this.mapboxAccessToken;
    }

    public final long getSuggestionRequestDelayMillis() {
        return this.suggestionRequestDelayMillis;
    }
}
