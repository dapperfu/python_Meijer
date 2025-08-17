package com.radiusnetworks.flybuy.api.mapbox.model;

import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mg.InterfaceC15617c;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000bJD\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/radiusnetworks/flybuy/api/mapbox/model/Suggestion;", "", "name", "", PreferencesHelper.PREF_ID, "placeFormatted", "fullAddress", "distance", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getDistance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getFullAddress", "()Ljava/lang/String;", "getId", "getName", "getPlaceFormatted", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/radiusnetworks/flybuy/api/mapbox/model/Suggestion;", "equals", "", "other", "hashCode", "", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Suggestion {
    private final Double distance;

    @InterfaceC15617c("full_address")
    private final String fullAddress;

    @InterfaceC15617c("mapbox_id")
    private final String id;
    private final String name;

    @InterfaceC15617c("place_formatted")
    private final String placeFormatted;

    public Suggestion(String name, String id2, String placeFormatted, String str, Double d10) {
        Intrinsics.j(name, "name");
        Intrinsics.j(id2, "id");
        Intrinsics.j(placeFormatted, "placeFormatted");
        this.name = name;
        this.id = id2;
        this.placeFormatted = placeFormatted;
        this.fullAddress = str;
        this.distance = d10;
    }

    public static /* synthetic */ Suggestion copy$default(Suggestion suggestion, String str, String str2, String str3, String str4, Double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = suggestion.name;
        }
        if ((i10 & 2) != 0) {
            str2 = suggestion.id;
        }
        if ((i10 & 4) != 0) {
            str3 = suggestion.placeFormatted;
        }
        if ((i10 & 8) != 0) {
            str4 = suggestion.fullAddress;
        }
        if ((i10 & 16) != 0) {
            d10 = suggestion.distance;
        }
        Double d11 = d10;
        String str5 = str3;
        return suggestion.copy(str, str2, str5, str4, d11);
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
    public final String getFullAddress() {
        return this.fullAddress;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getDistance() {
        return this.distance;
    }

    public final Suggestion copy(String name, String id2, String placeFormatted, String fullAddress, Double distance) {
        Intrinsics.j(name, "name");
        Intrinsics.j(id2, "id");
        Intrinsics.j(placeFormatted, "placeFormatted");
        return new Suggestion(name, id2, placeFormatted, fullAddress, distance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Suggestion)) {
            return false;
        }
        Suggestion suggestion = (Suggestion) other;
        return Intrinsics.e(this.name, suggestion.name) && Intrinsics.e(this.id, suggestion.id) && Intrinsics.e(this.placeFormatted, suggestion.placeFormatted) && Intrinsics.e(this.fullAddress, suggestion.fullAddress) && Intrinsics.e(this.distance, suggestion.distance);
    }

    public final Double getDistance() {
        return this.distance;
    }

    public final String getFullAddress() {
        return this.fullAddress;
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

    public String toString() {
        return "Suggestion(name=" + this.name + ", id=" + this.id + ", placeFormatted=" + this.placeFormatted + ", fullAddress=" + this.fullAddress + ", distance=" + this.distance + ')';
    }

    public int hashCode() {
        int iA = a.a(this.placeFormatted, a.a(this.id, this.name.hashCode() * 31, 31), 31);
        String str = this.fullAddress;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Double d10 = this.distance;
        return iHashCode + (d10 != null ? d10.hashCode() : 0);
    }
}
