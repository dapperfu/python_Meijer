package com.gimbal.proximity.core.b;

/* loaded from: classes4.dex */
public enum a {
    PROXIMITY_INTERNAL_UNKNOWN_TYPE(0, "Internal Unknown Type."),
    PROXIMITY_INTERNAL_JSONIFY_ERROR(3000, "Unable to convert object to JSON"),
    PROXIMITY_INTERNAL_JSON_PARSE_ERROR(3001, "Unable to parse object from JSON"),
    PROXIMITY_INTERNAL_BLE_ADV_INVALID(5001, "Scan Record is not valid Advertisement Data"),
    PROXIMITY_INTERNAL_BLE_ADV_NON_QC(5002, "Advertisement Data is not from Proximity Beacon");


    /* renamed from: a, reason: collision with root package name */
    private final int f65233a;

    /* renamed from: b, reason: collision with root package name */
    final String f65234b;

    @Override // java.lang.Enum
    public final String toString() {
        return this.f65233a + ": " + this.f65234b;
    }

    a(int i10, String str) {
        this.f65233a = i10;
        this.f65234b = str;
    }
}
