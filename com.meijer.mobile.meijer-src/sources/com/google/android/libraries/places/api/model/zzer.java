package com.google.android.libraries.places.api.model;

import De.p;
import java.util.Comparator;

/* loaded from: classes6.dex */
final /* synthetic */ class zzer implements Comparator {
    static final /* synthetic */ zzer zza = new zzer();

    private /* synthetic */ zzer() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i10 = zzes.zza;
        return ((LocalDate) p.q(((TimeOfWeek) p.q(((Period) obj).getOpen())).getDate())).compareTo((LocalDate) p.q(((TimeOfWeek) p.q(((Period) obj2).getOpen())).getDate()));
    }
}
