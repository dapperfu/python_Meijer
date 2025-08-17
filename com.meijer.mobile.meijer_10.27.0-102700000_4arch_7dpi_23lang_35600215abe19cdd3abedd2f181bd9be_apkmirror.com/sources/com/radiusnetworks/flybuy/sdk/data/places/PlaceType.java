package com.radiusnetworks.flybuy.sdk.data.places;

import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/places/PlaceType;", "", "typeString", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getTypeString$core_defaultRelease", "()Ljava/lang/String;", "ADDRESS", "REGION", "POSTAL_CODE", "CITY", "POI", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlaceType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PlaceType[] $VALUES;
    private final String typeString;
    public static final PlaceType ADDRESS = new PlaceType("ADDRESS", 0, PlaceTypes.ADDRESS);
    public static final PlaceType REGION = new PlaceType("REGION", 1, "region");
    public static final PlaceType POSTAL_CODE = new PlaceType("POSTAL_CODE", 2, "postcode");
    public static final PlaceType CITY = new PlaceType("CITY", 3, "city");
    public static final PlaceType POI = new PlaceType("POI", 4, "poi");

    private static final /* synthetic */ PlaceType[] $values() {
        return new PlaceType[]{ADDRESS, REGION, POSTAL_CODE, CITY, POI};
    }

    public static EnumEntries<PlaceType> getEntries() {
        return $ENTRIES;
    }

    public static PlaceType valueOf(String str) {
        return (PlaceType) Enum.valueOf(PlaceType.class, str);
    }

    public static PlaceType[] values() {
        return (PlaceType[]) $VALUES.clone();
    }

    static {
        PlaceType[] placeTypeArr$values = $values();
        $VALUES = placeTypeArr$values;
        $ENTRIES = EnumEntriesKt.a(placeTypeArr$values);
    }

    /* renamed from: getTypeString$core_defaultRelease, reason: from getter */
    public final String getTypeString() {
        return this.typeString;
    }

    private PlaceType(String str, int i10, String str2) {
        this.typeString = str2;
    }
}
