package com.radiusnetworks.flybuy.sdk.manager.builder;

import com.radiusnetworks.flybuy.sdk.data.places.PlaceType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u000eB#\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/manager/builder/PlaceSuggestionOptions;", "", "placeType", "Lcom/radiusnetworks/flybuy/sdk/data/places/PlaceType;", "latitude", "", "longitude", "(Lcom/radiusnetworks/flybuy/sdk/data/places/PlaceType;Ljava/lang/Double;Ljava/lang/Double;)V", "getLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLongitude", "getPlaceType", "()Lcom/radiusnetworks/flybuy/sdk/data/places/PlaceType;", "Builder", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlaceSuggestionOptions {
    private final Double latitude;
    private final Double longitude;
    private final PlaceType placeType;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/manager/builder/PlaceSuggestionOptions$Builder;", "", "()V", "latitude", "", "Ljava/lang/Double;", "longitude", "placeType", "Lcom/radiusnetworks/flybuy/sdk/data/places/PlaceType;", "build", "Lcom/radiusnetworks/flybuy/sdk/manager/builder/PlaceSuggestionOptions;", "setProximity", "setType", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private Double latitude;
        private Double longitude;
        private PlaceType placeType = PlaceType.ADDRESS;

        public final PlaceSuggestionOptions build() {
            return new PlaceSuggestionOptions(this.placeType, this.latitude, this.longitude, null);
        }

        public final Builder setType(PlaceType placeType) {
            Intrinsics.j(placeType, "placeType");
            this.placeType = placeType;
            return this;
        }

        public final Builder setProximity(double latitude, double longitude) {
            this.latitude = Double.valueOf(latitude);
            this.longitude = Double.valueOf(longitude);
            return this;
        }
    }

    public /* synthetic */ PlaceSuggestionOptions(PlaceType placeType, Double d10, Double d11, DefaultConstructorMarker defaultConstructorMarker) {
        this(placeType, d10, d11);
    }

    private PlaceSuggestionOptions(PlaceType placeType, Double d10, Double d11) {
        this.placeType = placeType;
        this.latitude = d10;
        this.longitude = d11;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final PlaceType getPlaceType() {
        return this.placeType;
    }
}
