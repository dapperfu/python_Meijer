package com.radiusnetworks.flybuy.sdk.data.places;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.radiusnetworks.flybuy.api.mapbox.model.Suggestion;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B1\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0010JD\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006\""}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/places/Place;", "", "suggestion", "Lcom/radiusnetworks/flybuy/api/mapbox/model/Suggestion;", "(Lcom/radiusnetworks/flybuy/api/mapbox/model/Suggestion;)V", "name", "", PreferencesHelper.PREF_ID, "placeFormatted", PlaceTypes.ADDRESS, "distance", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getAddress", "()Ljava/lang/String;", "getDistance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getId", "getName", "getPlaceFormatted", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/radiusnetworks/flybuy/sdk/data/places/Place;", "equals", "", "other", "hashCode", "", "toString", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Place {
    private final String address;
    private final Double distance;
    private final String id;
    private final String name;
    private final String placeFormatted;

    public Place(String name, String id2, String placeFormatted, String str, Double d10) {
        Intrinsics.j(name, "name");
        Intrinsics.j(id2, "id");
        Intrinsics.j(placeFormatted, "placeFormatted");
        this.name = name;
        this.id = id2;
        this.placeFormatted = placeFormatted;
        this.address = str;
        this.distance = d10;
    }

    public static /* synthetic */ Place copy$default(Place place, String str, String str2, String str3, String str4, Double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = place.name;
        }
        if ((i10 & 2) != 0) {
            str2 = place.id;
        }
        if ((i10 & 4) != 0) {
            str3 = place.placeFormatted;
        }
        if ((i10 & 8) != 0) {
            str4 = place.address;
        }
        if ((i10 & 16) != 0) {
            d10 = place.distance;
        }
        Double d11 = d10;
        String str5 = str3;
        return place.copy(str, str2, str5, str4, d11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPlaceFormatted() {
        return this.placeFormatted;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getDistance() {
        return this.distance;
    }

    public final Place copy(String name, String id2, String placeFormatted, String address, Double distance) {
        Intrinsics.j(name, "name");
        Intrinsics.j(id2, "id");
        Intrinsics.j(placeFormatted, "placeFormatted");
        return new Place(name, id2, placeFormatted, address, distance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Place)) {
            return false;
        }
        Place place = (Place) other;
        return Intrinsics.e(this.name, place.name) && Intrinsics.e(this.id, place.id) && Intrinsics.e(this.placeFormatted, place.placeFormatted) && Intrinsics.e(this.address, place.address) && Intrinsics.e(this.distance, place.distance);
    }

    public int hashCode() {
        int iHashCode = (this.placeFormatted.hashCode() + ((this.id.hashCode() + (this.name.hashCode() * 31)) * 31)) * 31;
        String str = this.address;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d10 = this.distance;
        return iHashCode2 + (d10 != null ? d10.hashCode() : 0);
    }

    public String toString() {
        return "Place(name=" + this.name + ", id=" + this.id + ", placeFormatted=" + this.placeFormatted + ", address=" + this.address + ", distance=" + this.distance + ')';
    }

    public final String getAddress() {
        return this.address;
    }

    public final Double getDistance() {
        return this.distance;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPlaceFormatted() {
        return this.placeFormatted;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Place(Suggestion suggestion) {
        this(suggestion.getName(), suggestion.getId(), suggestion.getPlaceFormatted(), suggestion.getFullAddress(), suggestion.getDistance());
        Intrinsics.j(suggestion, "suggestion");
    }
}
