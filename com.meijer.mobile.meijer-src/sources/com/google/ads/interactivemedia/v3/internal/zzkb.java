package com.google.ads.interactivemedia.v3.internal;

import Kc.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public final class zzkb extends zzkx {
    public zzkb(zzjj zzjjVar, String str, String str2, zzan zzanVar, int i10, int i11) {
        super(zzjjVar, "CgPRYuzQrSKB4HHU/qweoT6whjRKh5s88SYFeVTlix/HzZdKOZnoIu1auPhHwMiw", "UcPRGM0BZSE4Gd9/Us196LnIBiXWDE9D3TOlCfboVSQ=", zzanVar, i10, 24);
    }

    private final void zzc() throws ExecutionException, InterruptedException, TimeoutException {
        Kc.a aVarZzh = this.zza.zzh();
        if (aVarZzh == null) {
            return;
        }
        try {
            a.C0277a c0277aB = aVarZzh.b();
            String strA = c0277aB.a();
            int i10 = zzjm.zza;
            if (strA != null && strA.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                UUID uuidFromString = UUID.fromString(strA);
                byte[] bArr = new byte[16];
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
                byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
                strA = zzgl.zza(bArr, true);
            }
            if (strA != null) {
                synchronized (this.zzd) {
                    this.zzd.zzs(strA);
                    this.zzd.zzr(c0277aB.b());
                    this.zzd.zzab(6);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzkx
    protected final void zza() throws ExecutionException, IllegalAccessException, InterruptedException, TimeoutException, InvocationTargetException {
        if (this.zza.zzq()) {
            zzc();
            return;
        }
        synchronized (this.zzd) {
            this.zzd.zzs((String) this.zze.invoke(null, this.zza.zzb()));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzkx
    public final Void zze() throws Exception {
        if (this.zza.zzr()) {
            super.zze();
            return null;
        }
        if (this.zza.zzq()) {
            zzc();
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzkx, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zze();
        return null;
    }
}
