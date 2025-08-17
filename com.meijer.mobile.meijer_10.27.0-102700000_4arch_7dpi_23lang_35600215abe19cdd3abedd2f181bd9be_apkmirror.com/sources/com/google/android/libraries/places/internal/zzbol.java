package com.google.android.libraries.places.internal;

import Be.p;
import Be.u;
import com.medallia.digital.mobilesdk.q2;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes6.dex */
public final class zzbol extends zzbjg {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f86165a = 0;
    private static final boolean zza = zzbhi.zza(zzbol.class.getClassLoader());

    @Override // com.google.android.libraries.places.internal.zzbja
    public final String zzb() {
        return "dns";
    }

    @Override // com.google.android.libraries.places.internal.zzbjg
    protected final boolean zzc() {
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzbjg
    public final int zzd() {
        return 5;
    }

    @Override // com.google.android.libraries.places.internal.zzbja
    public final zzbjf zza(URI uri, zzbiy zzbiyVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String str = (String) p.r(uri.getPath(), "targetPath");
        p.m(str.startsWith(q2.f92724c), "the path component (%s) of the target (%s) must start with '/'", str, uri);
        return new zzbok(uri.getAuthority(), str.substring(1), zzbiyVar, zzbpf.zzm, u.c(), zza);
    }

    @Override // com.google.android.libraries.places.internal.zzbjg
    public final Collection zze() {
        return Collections.singleton(InetSocketAddress.class);
    }
}
