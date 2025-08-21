package com.google.android.libraries.places.internal;

import Vd.AbstractC5516j;
import Vd.C5517k;
import Vd.InterfaceC5515i;
import android.net.Uri;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse;

/* loaded from: classes6.dex */
final /* synthetic */ class zzhx implements InterfaceC5515i {
    static final /* synthetic */ zzhx zza = new zzhx();

    private /* synthetic */ zzhx() {
    }

    @Override // Vd.InterfaceC5515i
    public final /* synthetic */ AbstractC5516j then(Object obj) {
        C5517k c5517k = new C5517k();
        c5517k.c(FetchResolvedPhotoUriResponse.newInstance(Uri.parse(((zzavc) obj).zza())));
        return c5517k.a();
    }
}
