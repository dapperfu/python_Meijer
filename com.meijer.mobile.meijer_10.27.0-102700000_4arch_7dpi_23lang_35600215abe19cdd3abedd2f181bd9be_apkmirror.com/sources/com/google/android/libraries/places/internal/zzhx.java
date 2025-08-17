package com.google.android.libraries.places.internal;

import Td.AbstractC5232j;
import Td.C5233k;
import Td.InterfaceC5231i;
import android.net.Uri;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse;

/* loaded from: classes6.dex */
final /* synthetic */ class zzhx implements InterfaceC5231i {
    static final /* synthetic */ zzhx zza = new zzhx();

    private /* synthetic */ zzhx() {
    }

    @Override // Td.InterfaceC5231i
    public final /* synthetic */ AbstractC5232j then(Object obj) {
        C5233k c5233k = new C5233k();
        c5233k.c(FetchResolvedPhotoUriResponse.newInstance(Uri.parse(((zzavc) obj).zza())));
        return c5233k.a();
    }
}
