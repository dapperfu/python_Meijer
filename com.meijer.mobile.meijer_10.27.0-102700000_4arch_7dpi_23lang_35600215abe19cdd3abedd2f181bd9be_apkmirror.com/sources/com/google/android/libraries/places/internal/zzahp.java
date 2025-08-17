package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
final class zzahp implements zzbak {
    static final zzbak zza = new zzahp();

    private zzahp() {
    }

    @Override // com.google.android.libraries.places.internal.zzbak
    public final boolean zza(int i10) {
        zzahq zzahqVar;
        switch (i10) {
            case 0:
                zzahqVar = zzahq.EV_CONNECTOR_TYPE_UNSPECIFIED;
                break;
            case 1:
                zzahqVar = zzahq.EV_CONNECTOR_TYPE_OTHER;
                break;
            case 2:
                zzahqVar = zzahq.EV_CONNECTOR_TYPE_J1772;
                break;
            case 3:
                zzahqVar = zzahq.EV_CONNECTOR_TYPE_TYPE_2;
                break;
            case 4:
                zzahqVar = zzahq.EV_CONNECTOR_TYPE_CHADEMO;
                break;
            case 5:
                zzahqVar = zzahq.EV_CONNECTOR_TYPE_CCS_COMBO_1;
                break;
            case 6:
                zzahqVar = zzahq.EV_CONNECTOR_TYPE_CCS_COMBO_2;
                break;
            case 7:
                zzahqVar = zzahq.EV_CONNECTOR_TYPE_TESLA;
                break;
            case 8:
                zzahqVar = zzahq.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T;
                break;
            case 9:
                zzahqVar = zzahq.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET;
                break;
            default:
                zzahqVar = null;
                break;
        }
        return zzahqVar != null;
    }
}
