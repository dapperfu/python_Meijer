package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public enum zzahq implements zzbai {
    EV_CONNECTOR_TYPE_UNSPECIFIED(0),
    EV_CONNECTOR_TYPE_OTHER(1),
    EV_CONNECTOR_TYPE_J1772(2),
    EV_CONNECTOR_TYPE_TYPE_2(3),
    EV_CONNECTOR_TYPE_CHADEMO(4),
    EV_CONNECTOR_TYPE_CCS_COMBO_1(5),
    EV_CONNECTOR_TYPE_CCS_COMBO_2(6),
    EV_CONNECTOR_TYPE_TESLA(7),
    EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T(8),
    EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET(9);

    private final int zzk;

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzk);
    }

    @Override // com.google.android.libraries.places.internal.zzbai
    public final int zza() {
        return this.zzk;
    }

    zzahq(int i10) {
        this.zzk = i10;
    }
}
