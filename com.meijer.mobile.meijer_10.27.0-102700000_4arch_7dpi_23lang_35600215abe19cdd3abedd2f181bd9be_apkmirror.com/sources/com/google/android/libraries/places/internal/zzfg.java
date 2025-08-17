package com.google.android.libraries.places.internal;

import android.net.wifi.ScanResult;
import java.util.Comparator;

/* loaded from: classes6.dex */
final /* synthetic */ class zzfg implements Comparator {
    static final /* synthetic */ zzfg zza = new zzfg();

    private /* synthetic */ zzfg() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i10 = zzfh.zza;
        return ((ScanResult) obj2).level - ((ScanResult) obj).level;
    }
}
