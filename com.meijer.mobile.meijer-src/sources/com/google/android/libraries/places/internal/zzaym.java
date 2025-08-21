package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzayl;
import com.google.android.libraries.places.internal.zzaym;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class zzaym<MessageType extends zzaym<MessageType, BuilderType>, BuilderType extends zzayl<MessageType, BuilderType>> implements zzbbl {
    protected int zza = 0;

    int zzbb(zzbbz zzbbzVar) {
        throw null;
    }

    protected static void zzbc(Iterable iterable, List list) {
        zzayl.zzv(iterable, list);
    }

    @Override // com.google.android.libraries.places.internal.zzbbl
    public final zzayz zzaY() {
        try {
            int iZzbl = zzbl();
            zzayz zzayzVar = zzayz.zzb;
            byte[] bArr = new byte[iZzbl];
            int i10 = zzazi.zzf;
            zzazf zzazfVar = new zzazf(bArr, 0, iZzbl);
            zzbz(zzazfVar);
            zzazfVar.zzE();
            return new zzayy(bArr);
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbbl
    public final byte[] zzaZ() {
        try {
            int iZzbl = zzbl();
            byte[] bArr = new byte[iZzbl];
            int i10 = zzazi.zzf;
            zzazf zzazfVar = new zzazf(bArr, 0, iZzbl);
            zzbz(zzazfVar);
            zzazfVar.zzE();
            return bArr;
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbbl
    public final void zzba(OutputStream outputStream) throws IOException {
        int iZzbl = zzbl();
        int i10 = zzazi.zzf;
        if (iZzbl > 4096) {
            iZzbl = 4096;
        }
        zzazh zzazhVar = new zzazh(outputStream, iZzbl);
        zzbz(zzazhVar);
        zzazhVar.zzx();
    }
}
