package com.google.android.libraries.places.internal;

import De.p;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
final class zzbzv implements zzbit {
    private static final ThreadLocal zza = new ThreadLocal();
    private final zzbbt zzb;
    private final zzbbl zzc;

    @Override // com.google.android.libraries.places.internal.zzbir
    public final /* bridge */ /* synthetic */ InputStream zza(Object obj) {
        return new zzbzu((zzbbl) obj, this.zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzbir
    public final /* bridge */ /* synthetic */ Object zzb(InputStream inputStream) throws IOException {
        zzazc zzazcVarZzF;
        byte[] bArr;
        if (inputStream instanceof zzbzu) {
            zzbzu zzbzuVar = (zzbzu) inputStream;
            if (zzbzuVar.zzc() == this.zzb) {
                try {
                    return zzbzuVar.zzb();
                } catch (IllegalStateException unused) {
                }
            }
        }
        try {
            if (inputStream instanceof zzbhl) {
                int iAvailable = inputStream.available();
                if (iAvailable <= 0 || iAvailable > 4194304) {
                    if (iAvailable == 0) {
                        return this.zzc;
                    }
                    zzazcVarZzF = null;
                } else {
                    ThreadLocal threadLocal = zza;
                    Reference reference = (Reference) threadLocal.get();
                    if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                        bArr = new byte[iAvailable];
                        threadLocal.set(new WeakReference(bArr));
                    }
                    int i10 = iAvailable;
                    while (i10 > 0) {
                        int i11 = inputStream.read(bArr, iAvailable - i10, i10);
                        if (i11 == -1) {
                            break;
                        }
                        i10 -= i11;
                    }
                    if (i10 != 0) {
                        int i12 = iAvailable - i10;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iAvailable).length() + 21 + String.valueOf(i12).length());
                        sb2.append("size inaccurate: ");
                        sb2.append(iAvailable);
                        sb2.append(" != ");
                        sb2.append(i12);
                        throw new RuntimeException(sb2.toString());
                    }
                    zzazcVarZzF = zzazc.zzG(bArr, 0, iAvailable);
                }
            } else {
                zzazcVarZzF = null;
            }
            if (zzazcVarZzF == null) {
                zzazcVarZzF = zzazc.zzF(inputStream, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
            }
            zzazcVarZzF.zzL(a.e.API_PRIORITY_OTHER);
            try {
                zzbbl zzbblVar = (zzbbl) this.zzb.zza(zzazcVarZzF, zzbzw.zza);
                try {
                    zzazcVarZzF.zzb(0);
                    return zzbblVar;
                } catch (zzbar e10) {
                    throw e10;
                }
            } catch (zzbar e11) {
                throw new zzbjy(zzbjv.zzh.zze("Invalid protobuf byte sequence").zzd(e11), null);
            }
        } catch (IOException e12) {
            throw new RuntimeException(e12);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbit
    public final Class zzc() {
        return this.zzc.getClass();
    }

    zzbzv(zzbbl zzbblVar, int i10) {
        this.zzc = (zzbbl) p.r(zzbblVar, "defaultInstance cannot be null");
        this.zzb = zzbblVar.zzbf();
    }
}
