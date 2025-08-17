package com.google.android.libraries.places.internal;

import Be.p;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public abstract class zzbkq implements zzbwh {
    private static final Logger zza = Logger.getLogger(zzbkq.class.getName());

    protected abstract zzbow zzh();

    @Override // com.google.android.libraries.places.internal.zzbwh
    public boolean zzm() {
        throw null;
    }

    protected abstract zzbkp zzp();

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzt(InputStream inputStream) throws IOException {
        p.r(inputStream, "message");
        try {
            if (!zzh().zzc()) {
                zzh().zza(inputStream);
            }
        } finally {
            zzbpf.zzh(inputStream);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzr() {
        zzp().zzl();
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzs(int i10) {
        zzbkp zzbkpVarZzp = zzp();
        zzbkpVarZzp.zzy(new zzbko(zzbkpVarZzp, zzcba.zzb(), i10));
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzu() {
        if (!zzh().zzc()) {
            zzh().zzb();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzv(zzbfu zzbfuVar) {
        zzh().zze((zzbfu) p.r(zzbfuVar, "compressor"));
    }

    protected final void zzw(int i10) {
        zzp().zzw(i10);
    }
}
