package com.google.android.libraries.places.internal;

import com.medallia.digital.mobilesdk.l3;

/* loaded from: classes6.dex */
final class zzara implements zzbak {
    static final zzbak zza = new zzara();

    private zzara() {
    }

    @Override // com.google.android.libraries.places.internal.zzbak
    public final boolean zza(int i10) {
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 99) {
            switch (i10) {
                case 21:
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case l3.f93325e /* 32 */:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
