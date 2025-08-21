package com.radiusnetworks.flybuy.sdk.manager.builder;

import com.radiusnetworks.flybuy.sdk.data.places.PlaceType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0012B7\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/manager/builder/PlaceSuggestionOptions;", "", "placeTypes", "", "Lcom/radiusnetworks/flybuy/sdk/data/places/PlaceType;", "countryCodes", "", "latitude", "", "longitude", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;)V", "getCountryCodes", "()Ljava/util/List;", "getLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLongitude", "getPlaceTypes", "Builder", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PlaceSuggestionOptions {
    private final List<String> countryCodes;
    private final Double latitude;
    private final Double longitude;
    private final List<PlaceType> placeTypes;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bJ\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0005J\u0014\u0010\u0013\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014J\u0016\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bJ\u0014\u0010\u0017\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/manager/builder/PlaceSuggestionOptions$Builder;", "", "()V", "countryCodes", "", "", "latitude", "", "Ljava/lang/Double;", "longitude", "placeTypes", "Lcom/radiusnetworks/flybuy/sdk/data/places/PlaceType;", "addCountryCode", "countryCode", "addType", "placeType", "build", "Lcom/radiusnetworks/flybuy/sdk/manager/builder/PlaceSuggestionOptions;", "setCountryCode", "setCountryCodes", "", "setProximity", "setType", "setTypes", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private Double latitude;
        private Double longitude;
        private List<PlaceType> placeTypes = CollectionsKt.s(PlaceType.ADDRESS);
        private List<String> countryCodes = new ArrayList();

        public final Builder addCountryCode(String countryCode) {
            Intrinsics.j(countryCode, "countryCode");
            this.countryCodes.add(countryCode);
            return this;
        }

        public final Builder addType(PlaceType placeType) {
            Intrinsics.j(placeType, "placeType");
            this.placeTypes.add(placeType);
            return this;
        }

        public final PlaceSuggestionOptions build() {
            return new PlaceSuggestionOptions(this.placeTypes, this.countryCodes, this.latitude, this.longitude, null);
        }

        public final Builder setCountryCode(String countryCode) {
            Intrinsics.j(countryCode, "countryCode");
            this.countryCodes = CollectionsKt.s(countryCode);
            return this;
        }

        public final Builder setCountryCodes(List<String> countryCodes) {
            Intrinsics.j(countryCodes, "countryCodes");
            this.countryCodes = CollectionsKt.m1(countryCodes);
            return this;
        }

        public final Builder setType(PlaceType placeType) {
            Intrinsics.j(placeType, "placeType");
            this.placeTypes = CollectionsKt.s(placeType);
            return this;
        }

        public final Builder setTypes(List<? extends PlaceType> placeTypes) {
            Intrinsics.j(placeTypes, "placeTypes");
            this.placeTypes = CollectionsKt.m1(placeTypes);
            return this;
        }

        public final Builder setProximity(double latitude, double longitude) {
            this.latitude = Double.valueOf(latitude);
            this.longitude = Double.valueOf(longitude);
            return this;
        }
    }

    public /* synthetic */ PlaceSuggestionOptions(List list, List list2, Double d10, Double d11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, d10, d11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PlaceSuggestionOptions(List<? extends PlaceType> list, List<String> list2, Double d10, Double d11) {
        this.placeTypes = list;
        this.countryCodes = list2;
        this.latitude = d10;
        this.longitude = d11;
    }

    public final List<String> getCountryCodes() {
        return this.countryCodes;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final List<PlaceType> getPlaceTypes() {
        return this.placeTypes;
    }
}
