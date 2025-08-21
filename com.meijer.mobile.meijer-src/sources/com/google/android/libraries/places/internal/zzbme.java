package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class zzbme extends zzbkn {
    private static final zzbmc zze = new zzblx();
    private static final zzbmc zzf = new zzbly();
    private static final zzbmc zzg = new zzblz();
    private static final zzbmc zzh = new zzbma();
    private static final zzbmd zzi = new zzbmb();
    private final Deque zza;
    private Deque zzb;
    private int zzc;
    private boolean zzd;

    public zzbme() {
        new ArrayDeque(2);
        this.zza = new ArrayDeque();
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final int zzf() {
        return this.zzc;
    }

    private final void zzo() {
        if (((zzbtu) this.zza.peek()).zzf() == 0) {
            zzp();
        }
    }

    private final void zzp() {
        if (!this.zzd) {
            ((zzbtu) this.zza.remove()).close();
            return;
        }
        Deque deque = this.zzb;
        Deque deque2 = this.zza;
        deque.add((zzbtu) deque2.remove());
        zzbtu zzbtuVar = (zzbtu) deque2.peek();
        if (zzbtuVar != null) {
            zzbtuVar.zzb();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbkn, com.google.android.libraries.places.internal.zzbtu, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (true) {
            Deque deque = this.zza;
            if (deque.isEmpty()) {
                break;
            } else {
                ((zzbtu) deque.remove()).close();
            }
        }
        if (this.zzb != null) {
            while (!this.zzb.isEmpty()) {
                ((zzbtu) this.zzb.remove()).close();
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbkn, com.google.android.libraries.places.internal.zzbtu
    public final boolean zza() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            if (!((zzbtu) it.next()).zza()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzbkn, com.google.android.libraries.places.internal.zzbtu
    public final void zzb() {
        if (this.zzb == null) {
            this.zzb = new ArrayDeque(Math.min(this.zza.size(), 16));
        }
        while (!this.zzb.isEmpty()) {
            ((zzbtu) this.zzb.remove()).close();
        }
        this.zzd = true;
        zzbtu zzbtuVar = (zzbtu) this.zza.peek();
        if (zzbtuVar != null) {
            zzbtuVar.zzb();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbkn, com.google.android.libraries.places.internal.zzbtu
    public final void zzc() {
        if (!this.zzd) {
            throw new InvalidMarkException();
        }
        Deque deque = this.zza;
        zzbtu zzbtuVar = (zzbtu) deque.peek();
        if (zzbtuVar != null) {
            int iZzf = zzbtuVar.zzf();
            zzbtuVar.zzc();
            this.zzc += zzbtuVar.zzf() - iZzf;
        }
        while (true) {
            zzbtu zzbtuVar2 = (zzbtu) this.zzb.pollLast();
            if (zzbtuVar2 == null) {
                return;
            }
            zzbtuVar2.zzc();
            deque.addFirst(zzbtuVar2);
            this.zzc += zzbtuVar2.zzf();
        }
    }

    public final void zze(zzbtu zzbtuVar) {
        boolean z10 = this.zzd && this.zza.isEmpty();
        if (zzbtuVar instanceof zzbme) {
            zzbme zzbmeVar = (zzbme) zzbtuVar;
            while (true) {
                Deque deque = zzbmeVar.zza;
                if (deque.isEmpty()) {
                    break;
                } else {
                    this.zza.add((zzbtu) deque.remove());
                }
            }
            this.zzc += zzbmeVar.zzc;
            zzbmeVar.zzc = 0;
            zzbmeVar.close();
        } else {
            this.zza.add(zzbtuVar);
            this.zzc += zzbtuVar.zzf();
        }
        if (z10) {
            ((zzbtu) this.zza.peek()).zzb();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final int zzg() {
        return zzn(zze, 1, null, 0);
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final void zzh(int i10) {
        zzn(zzf, i10, null, 0);
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final void zzi(byte[] bArr, int i10, int i11) {
        zzn(zzg, i11, bArr, i10);
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final void zzj(ByteBuffer byteBuffer) {
        zzn(zzh, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final void zzk(OutputStream outputStream, int i10) throws IOException {
        zzm(zzi, i10, outputStream, 0);
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final zzbtu zzl(int i10) {
        zzbtu zzbtuVarZzl;
        int i11;
        zzbtu zzbtuVarZzl2;
        if (i10 <= 0) {
            return zzbtx.zza();
        }
        zzd(i10);
        this.zzc -= i10;
        zzbtu zzbtuVar = null;
        zzbme zzbmeVar = null;
        while (true) {
            Deque deque = this.zza;
            zzbtu zzbtuVar2 = (zzbtu) deque.peek();
            int iZzf = zzbtuVar2.zzf();
            if (iZzf > i10) {
                zzbtuVarZzl2 = zzbtuVar2.zzl(i10);
                i11 = 0;
            } else {
                if (this.zzd) {
                    zzbtuVarZzl = zzbtuVar2.zzl(iZzf);
                    zzp();
                } else {
                    zzbtuVarZzl = (zzbtu) deque.poll();
                }
                zzbtu zzbtuVar3 = zzbtuVarZzl;
                i11 = i10 - iZzf;
                zzbtuVarZzl2 = zzbtuVar3;
            }
            if (zzbtuVar == null) {
                zzbtuVar = zzbtuVarZzl2;
            } else {
                if (zzbmeVar == null) {
                    zzbmeVar = new zzbme(i11 != 0 ? Math.min(deque.size() + 2, 16) : 2);
                    zzbmeVar.zze(zzbtuVar);
                    zzbtuVar = zzbmeVar;
                }
                zzbmeVar.zze(zzbtuVarZzl2);
            }
            if (i11 <= 0) {
                return zzbtuVar;
            }
            i10 = i11;
        }
    }

    public zzbme(int i10) {
        new ArrayDeque(2);
        this.zza = new ArrayDeque(i10);
    }

    private final int zzm(zzbmd zzbmdVar, int i10, Object obj, int i11) throws IOException {
        zzd(i10);
        Deque deque = this.zza;
        if (!deque.isEmpty()) {
            zzo();
        }
        while (i10 > 0 && !deque.isEmpty()) {
            zzbtu zzbtuVar = (zzbtu) deque.peek();
            int iMin = Math.min(i10, zzbtuVar.zzf());
            i11 = zzbmdVar.zza(zzbtuVar, iMin, obj, i11);
            i10 -= iMin;
            this.zzc -= iMin;
            zzo();
        }
        if (i10 <= 0) {
            return i11;
        }
        throw new AssertionError("Failed executing read operation");
    }

    private final int zzn(zzbmc zzbmcVar, int i10, Object obj, int i11) {
        try {
            return zzm(zzbmcVar, i10, obj, i11);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
