package com.google.android.libraries.places.internal;

import com.medallia.digital.mobilesdk.l3;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes6.dex */
public final class zzcbj implements Cloneable, ByteChannel, zzcbl, zzcbk {

    @JvmField
    public zzcbu zza;
    private long zzb;

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, com.google.android.libraries.places.internal.zzcbz
    public final void close() {
    }

    @Override // com.google.android.libraries.places.internal.zzcbk, com.google.android.libraries.places.internal.zzcbx, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final zzcbj zzA(int i10) {
        zzcbu zzcbuVarZzE = zzE(1);
        byte[] bArr = zzcbuVarZzE.zza;
        int i11 = zzcbuVarZzE.zzc;
        zzcbuVarZzE.zzc = i11 + 1;
        bArr[i11] = (byte) i10;
        this.zzb++;
        return this;
    }

    public final zzcbj zzB(int i10) {
        zzcbu zzcbuVarZzE = zzE(2);
        byte[] bArr = zzcbuVarZzE.zza;
        int i11 = zzcbuVarZzE.zzc;
        bArr[i11] = (byte) ((i10 >>> 8) & l3.f92484c);
        bArr[i11 + 1] = (byte) (i10 & l3.f92484c);
        zzcbuVarZzE.zzc = i11 + 2;
        this.zzb += 2;
        return this;
    }

    public final zzcbj zzC(int i10) {
        zzcbu zzcbuVarZzE = zzE(4);
        byte[] bArr = zzcbuVarZzE.zza;
        int i11 = zzcbuVarZzE.zzc;
        bArr[i11] = (byte) (i10 >> 24);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & l3.f92484c);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & l3.f92484c);
        bArr[i11 + 3] = (byte) (i10 & l3.f92484c);
        zzcbuVarZzE.zzc = i11 + 4;
        this.zzb += 4;
        return this;
    }

    @JvmName
    public final long zzb() {
        return this.zzb;
    }

    public final void zzd(long j10) {
        this.zzb = j10;
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final zzcbj zze() {
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final boolean zzf() {
        return this.zzb == 0;
    }

    public final /* synthetic */ Object clone() {
        zzcbj zzcbjVar = new zzcbj();
        if (this.zzb == 0) {
            return zzcbjVar;
        }
        zzcbu zzcbuVar = this.zza;
        Intrinsics.g(zzcbuVar);
        zzcbu zzcbuVarZza = zzcbuVar.zza();
        zzcbjVar.zza = zzcbuVarZza;
        zzcbuVarZza.zzg = zzcbuVarZza;
        zzcbuVarZza.zzf = zzcbuVarZza;
        for (zzcbu zzcbuVar2 = zzcbuVar.zzf; zzcbuVar2 != zzcbuVar; zzcbuVar2 = zzcbuVar2.zzf) {
            zzcbu zzcbuVar3 = zzcbuVarZza.zzg;
            Intrinsics.g(zzcbuVar3);
            Intrinsics.g(zzcbuVar2);
            zzcbuVar3.zzc(zzcbuVar2.zza());
        }
        zzcbjVar.zzb = this.zzb;
        return zzcbjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcbj)) {
            return false;
        }
        long j10 = this.zzb;
        zzcbj zzcbjVar = (zzcbj) obj;
        if (j10 != zzcbjVar.zzb) {
            return false;
        }
        if (j10 == 0) {
            return true;
        }
        zzcbu zzcbuVar = this.zza;
        Intrinsics.g(zzcbuVar);
        zzcbu zzcbuVar2 = zzcbjVar.zza;
        Intrinsics.g(zzcbuVar2);
        int i10 = zzcbuVar.zzb;
        int i11 = zzcbuVar2.zzb;
        long j11 = 0;
        while (j11 < this.zzb) {
            long jMin = Math.min(zzcbuVar.zzc - i10, zzcbuVar2.zzc - i11);
            long j12 = 0;
            while (j12 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (zzcbuVar.zza[i10] != zzcbuVar2.zza[i11]) {
                    return false;
                }
                j12++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == zzcbuVar.zzc) {
                zzcbuVar = zzcbuVar.zzf;
                Intrinsics.g(zzcbuVar);
                i10 = zzcbuVar.zzb;
            }
            if (i11 == zzcbuVar2.zzc) {
                zzcbuVar2 = zzcbuVar2.zzf;
                Intrinsics.g(zzcbuVar2);
                i11 = zzcbuVar2.zzb;
            }
            j11 += jMin;
        }
        return true;
    }

    public final int hashCode() {
        zzcbu zzcbuVar = this.zza;
        if (zzcbuVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = zzcbuVar.zzc;
            for (int i12 = zzcbuVar.zzb; i12 < i11; i12++) {
                i10 = (i10 * 31) + zzcbuVar.zza[i12];
            }
            zzcbuVar = zzcbuVar.zzf;
            Intrinsics.g(zzcbuVar);
        } while (zzcbuVar != this.zza);
        return i10;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) throws IOException {
        Intrinsics.j(sink, "sink");
        zzcbu zzcbuVar = this.zza;
        if (zzcbuVar == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), zzcbuVar.zzc - zzcbuVar.zzb);
        sink.put(zzcbuVar.zza, zzcbuVar.zzb, iMin);
        int i10 = zzcbuVar.zzb + iMin;
        zzcbuVar.zzb = i10;
        this.zzb -= iMin;
        if (i10 == zzcbuVar.zzc) {
            this.zza = zzcbuVar.zzb();
            zzcbv.zzb(zzcbuVar);
        }
        return iMin;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) throws IOException {
        Intrinsics.j(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            zzcbu zzcbuVarZzE = zzE(1);
            int iMin = Math.min(i10, 8192 - zzcbuVarZzE.zzc);
            source.get(zzcbuVarZzE.zza, zzcbuVarZzE.zzc, iMin);
            i10 -= iMin;
            zzcbuVarZzE.zzc += iMin;
        }
        this.zzb += iRemaining;
        return iRemaining;
    }

    public final zzcbj zzD(long j10) {
        if (j10 == 0) {
            zzA(48);
            return this;
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 - ((j14 >>> 1) & 6148914691236517205L);
        long j16 = ((j15 >>> 2) & 3689348814741910323L) + (j15 & 3689348814741910323L);
        long j17 = ((j16 >>> 4) + j16) & 1085102592571150095L;
        long j18 = j17 + (j17 >>> 8);
        long j19 = j18 + (j18 >>> 16);
        int i10 = (int) ((((j19 & 63) + ((j19 >>> 32) & 63)) + 3) >> 2);
        zzcbu zzcbuVarZzE = zzE(i10);
        byte[] bArr = zzcbuVarZzE.zza;
        int i11 = zzcbuVarZzE.zzc;
        int i12 = i11 + i10;
        while (true) {
            i12--;
            if (i12 < i11) {
                zzcbuVarZzE.zzc += i10;
                this.zzb += i10;
                return this;
            }
            bArr[i12] = zzccd.zza()[(int) (15 & j10)];
            j10 >>>= 4;
        }
    }

    public final zzcbu zzE(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        zzcbu zzcbuVar = this.zza;
        if (zzcbuVar == null) {
            zzcbu zzcbuVarZza = zzcbv.zza();
            this.zza = zzcbuVarZza;
            zzcbuVarZza.zzg = zzcbuVarZza;
            zzcbuVarZza.zzf = zzcbuVarZza;
            return zzcbuVarZza;
        }
        Intrinsics.g(zzcbuVar);
        zzcbu zzcbuVar2 = zzcbuVar.zzg;
        Intrinsics.g(zzcbuVar2);
        if (zzcbuVar2.zzc + i10 <= 8192 && zzcbuVar2.zze) {
            return zzcbuVar2;
        }
        zzcbu zzcbuVarZza2 = zzcbv.zza();
        zzcbuVar2.zzc(zzcbuVarZza2);
        return zzcbuVarZza2;
    }

    public final zzcbn zzF() {
        long j10 = this.zzb;
        if (j10 <= 2147483647L) {
            return zzG((int) j10);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 22);
        sb2.append("size > Int.MAX_VALUE: ");
        sb2.append(j10);
        throw new IllegalStateException(sb2.toString());
    }

    public final zzcbn zzG(int i10) {
        if (i10 == 0) {
            return zzcbn.zza;
        }
        zzcbf.zza(this.zzb, 0L, i10);
        zzcbu zzcbuVar = this.zza;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Intrinsics.g(zzcbuVar);
            int i14 = zzcbuVar.zzc;
            int i15 = zzcbuVar.zzb;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            zzcbuVar = zzcbuVar.zzf;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 + i13];
        zzcbu zzcbuVar2 = this.zza;
        int i16 = 0;
        while (i11 < i10) {
            Intrinsics.g(zzcbuVar2);
            bArr[i16] = zzcbuVar2.zza;
            i11 += zzcbuVar2.zzc - zzcbuVar2.zzb;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = zzcbuVar2.zzb;
            zzcbuVar2.zzd = true;
            i16++;
            zzcbuVar2 = zzcbuVar2.zzf;
        }
        return new zzcbw(bArr, iArr);
    }

    @Override // com.google.android.libraries.places.internal.zzcbz
    public final long zza(zzcbj sink, long j10) {
        Intrinsics.j(sink, "sink");
        if (j10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 15);
            sb2.append("byteCount < 0: ");
            sb2.append(j10);
            throw new IllegalArgumentException(sb2.toString());
        }
        long j11 = this.zzb;
        if (j11 == 0) {
            return -1L;
        }
        if (j10 > j11) {
            j10 = j11;
        }
        sink.zzc(this, j10);
        return j10;
    }

    @Override // com.google.android.libraries.places.internal.zzcbx
    public final void zzc(zzcbj source, long j10) {
        zzcbu zzcbuVar;
        Intrinsics.j(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        zzcbf.zza(source.zzb, 0L, j10);
        while (j10 > 0) {
            zzcbu zzcbuVar2 = source.zza;
            Intrinsics.g(zzcbuVar2);
            int i10 = zzcbuVar2.zzc;
            zzcbu zzcbuVar3 = source.zza;
            Intrinsics.g(zzcbuVar3);
            long j11 = i10 - zzcbuVar3.zzb;
            int i11 = 0;
            if (j10 < j11) {
                zzcbu zzcbuVar4 = this.zza;
                if (zzcbuVar4 != null) {
                    Intrinsics.g(zzcbuVar4);
                    zzcbuVar = zzcbuVar4.zzg;
                } else {
                    zzcbuVar = null;
                }
                int i12 = (int) j10;
                if (zzcbuVar != null && zzcbuVar.zze) {
                    if ((zzcbuVar.zzc + j10) - (zzcbuVar.zzd ? 0 : zzcbuVar.zzb) <= 8192) {
                        zzcbu zzcbuVar5 = source.zza;
                        Intrinsics.g(zzcbuVar5);
                        zzcbuVar5.zze(zzcbuVar, i12);
                        source.zzb -= j10;
                        this.zzb += j10;
                        return;
                    }
                }
                zzcbu zzcbuVar6 = source.zza;
                Intrinsics.g(zzcbuVar6);
                source.zza = zzcbuVar6.zzd(i12);
            }
            zzcbu zzcbuVar7 = source.zza;
            Intrinsics.g(zzcbuVar7);
            int i13 = zzcbuVar7.zzc - zzcbuVar7.zzb;
            source.zza = zzcbuVar7.zzb();
            zzcbu zzcbuVar8 = this.zza;
            if (zzcbuVar8 == null) {
                this.zza = zzcbuVar7;
                zzcbuVar7.zzg = zzcbuVar7;
                zzcbuVar7.zzf = zzcbuVar7;
            } else {
                Intrinsics.g(zzcbuVar8);
                zzcbu zzcbuVar9 = zzcbuVar8.zzg;
                Intrinsics.g(zzcbuVar9);
                zzcbuVar9.zzc(zzcbuVar7);
                zzcbu zzcbuVar10 = zzcbuVar7.zzg;
                if (zzcbuVar10 == zzcbuVar7) {
                    throw new IllegalStateException("cannot compact");
                }
                Intrinsics.g(zzcbuVar10);
                if (zzcbuVar10.zze) {
                    int i14 = zzcbuVar7.zzc - zzcbuVar7.zzb;
                    zzcbu zzcbuVar11 = zzcbuVar7.zzg;
                    Intrinsics.g(zzcbuVar11);
                    int i15 = 8192 - zzcbuVar11.zzc;
                    zzcbu zzcbuVar12 = zzcbuVar7.zzg;
                    Intrinsics.g(zzcbuVar12);
                    if (!zzcbuVar12.zzd) {
                        zzcbu zzcbuVar13 = zzcbuVar7.zzg;
                        Intrinsics.g(zzcbuVar13);
                        i11 = zzcbuVar13.zzb;
                    }
                    if (i14 <= i15 + i11) {
                        zzcbu zzcbuVar14 = zzcbuVar7.zzg;
                        Intrinsics.g(zzcbuVar14);
                        zzcbuVar7.zze(zzcbuVar14, i14);
                        zzcbuVar7.zzb();
                        zzcbv.zzb(zzcbuVar7);
                    }
                }
            }
            long j12 = i13;
            source.zzb -= j12;
            this.zzb += j12;
            j10 -= j12;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final void zzg(long j10) throws EOFException {
        if (this.zzb < j10) {
            throw new EOFException();
        }
    }

    @JvmOverloads
    public final zzcbj zzh(OutputStream out, long j10) throws IOException {
        Intrinsics.j(out, "out");
        zzcbf.zza(this.zzb, 0L, j10);
        zzcbu zzcbuVar = this.zza;
        long j11 = j10;
        while (j11 > 0) {
            Intrinsics.g(zzcbuVar);
            int iMin = (int) Math.min(j11, zzcbuVar.zzc - zzcbuVar.zzb);
            out.write(zzcbuVar.zza, zzcbuVar.zzb, iMin);
            int i10 = zzcbuVar.zzb + iMin;
            zzcbuVar.zzb = i10;
            long j12 = iMin;
            this.zzb -= j12;
            j11 -= j12;
            if (i10 == zzcbuVar.zzc) {
                zzcbu zzcbuVarZzb = zzcbuVar.zzb();
                this.zza = zzcbuVarZzb;
                zzcbv.zzb(zzcbuVar);
                zzcbuVar = zzcbuVarZzb;
            }
        }
        return this;
    }

    public final long zzi() {
        long j10 = this.zzb;
        if (j10 == 0) {
            return 0L;
        }
        zzcbu zzcbuVar = this.zza;
        Intrinsics.g(zzcbuVar);
        zzcbu zzcbuVar2 = zzcbuVar.zzg;
        Intrinsics.g(zzcbuVar2);
        return (zzcbuVar2.zzc >= 8192 || !zzcbuVar2.zze) ? j10 : j10 - (r3 - zzcbuVar2.zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final byte zzj() throws EOFException {
        if (this.zzb == 0) {
            throw new EOFException();
        }
        zzcbu zzcbuVar = this.zza;
        Intrinsics.g(zzcbuVar);
        int i10 = zzcbuVar.zzb;
        int i11 = zzcbuVar.zzc;
        int i12 = i10 + 1;
        byte b10 = zzcbuVar.zza[i10];
        this.zzb--;
        if (i12 != i11) {
            zzcbuVar.zzb = i12;
            return b10;
        }
        this.zza = zzcbuVar.zzb();
        zzcbv.zzb(zzcbuVar);
        return b10;
    }

    @JvmName
    public final byte zzk(long j10) {
        zzcbf.zza(this.zzb, j10, 1L);
        zzcbu zzcbuVar = this.zza;
        if (zzcbuVar == null) {
            Intrinsics.g(null);
            throw null;
        }
        long j11 = this.zzb;
        if (j11 - j10 < j10) {
            while (j11 > j10) {
                zzcbuVar = zzcbuVar.zzg;
                Intrinsics.g(zzcbuVar);
                j11 -= zzcbuVar.zzc - zzcbuVar.zzb;
            }
            Intrinsics.g(zzcbuVar);
            return zzcbuVar.zza[(int) ((zzcbuVar.zzb + j10) - j11)];
        }
        long j12 = 0;
        while (true) {
            long j13 = (zzcbuVar.zzc - zzcbuVar.zzb) + j12;
            if (j13 > j10) {
                Intrinsics.g(zzcbuVar);
                return zzcbuVar.zza[(int) ((zzcbuVar.zzb + j10) - j12)];
            }
            zzcbuVar = zzcbuVar.zzf;
            Intrinsics.g(zzcbuVar);
            j12 = j13;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final short zzl() throws EOFException {
        int iZzj;
        if (this.zzb < 2) {
            throw new EOFException();
        }
        zzcbu zzcbuVar = this.zza;
        Intrinsics.g(zzcbuVar);
        int i10 = zzcbuVar.zzb;
        int i11 = zzcbuVar.zzc;
        if (i11 - i10 < 2) {
            iZzj = ((zzj() & 255) << 8) | (zzj() & 255);
        } else {
            byte[] bArr = zzcbuVar.zza;
            int i12 = (bArr[i10] & 255) << 8;
            int i13 = bArr[i10 + 1] & 255;
            this.zzb -= 2;
            int i14 = i10 + 2;
            if (i14 == i11) {
                this.zza = zzcbuVar.zzb();
                zzcbv.zzb(zzcbuVar);
            } else {
                zzcbuVar.zzb = i14;
            }
            iZzj = i12 | i13;
        }
        return (short) iZzj;
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final int zzm() throws EOFException {
        if (this.zzb < 4) {
            throw new EOFException();
        }
        zzcbu zzcbuVar = this.zza;
        Intrinsics.g(zzcbuVar);
        int i10 = zzcbuVar.zzb;
        int i11 = zzcbuVar.zzc;
        if (i11 - i10 < 4) {
            return ((zzj() & 255) << 24) | ((zzj() & 255) << 16) | ((zzj() & 255) << 8) | (zzj() & 255);
        }
        byte[] bArr = zzcbuVar.zza;
        int i12 = (bArr[i10] & 255) << 24;
        int i13 = (bArr[i10 + 1] & 255) << 16;
        int i14 = (bArr[i10 + 2] & 255) << 8;
        this.zzb -= 4;
        int i15 = (bArr[i10 + 3] & 255) | i13 | i12 | i14;
        int i16 = i10 + 4;
        if (i16 != i11) {
            zzcbuVar.zzb = i16;
            return i15;
        }
        this.zza = zzcbuVar.zzb();
        zzcbv.zzb(zzcbuVar);
        return i15;
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final zzcbn zzn(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 11);
            sb2.append("byteCount: ");
            sb2.append(j10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (this.zzb < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new zzcbn(zzr(j10));
        }
        zzcbn zzcbnVarZzG = zzG((int) j10);
        zzt(j10);
        return zzcbnVarZzG;
    }

    public final String zzo() {
        return zzp(this.zzb, Charsets.UTF_8);
    }

    public final String zzp(long j10, Charset charset) throws EOFException {
        Intrinsics.j(charset, "charset");
        if (j10 < 0 || j10 > 2147483647L) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 11);
            sb2.append("byteCount: ");
            sb2.append(j10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (this.zzb < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        zzcbu zzcbuVar = this.zza;
        Intrinsics.g(zzcbuVar);
        int i10 = zzcbuVar.zzb;
        int i11 = zzcbuVar.zzc;
        if (i10 + j10 > i11) {
            return new String(zzr(j10), charset);
        }
        int i12 = (int) j10;
        String str = new String(zzcbuVar.zza, i10, i12, charset);
        int i13 = i10 + i12;
        zzcbuVar.zzb = i13;
        this.zzb -= j10;
        if (i13 == i11) {
            this.zza = zzcbuVar.zzb();
            zzcbv.zzb(zzcbuVar);
        }
        return str;
    }

    public final String zzq(long j10) throws EOFException {
        zzcbu zzcbuVar;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15 = this.zzb;
        long j16 = j15 < Long.MAX_VALUE ? j15 : Long.MAX_VALUE;
        long j17 = 0;
        if (j16 == 0 || (zzcbuVar = this.zza) == null) {
            j11 = 0;
            j14 = -1;
            j12 = -1;
        } else if (j15 < 0) {
            while (j15 > 0) {
                zzcbuVar = zzcbuVar.zzg;
                Intrinsics.g(zzcbuVar);
                j15 -= zzcbuVar.zzc - zzcbuVar.zzb;
            }
            long j18 = 0;
            loop3: while (j15 < j16) {
                byte[] bArr = zzcbuVar.zza;
                j11 = j17;
                j12 = -1;
                int iMin = (int) Math.min(zzcbuVar.zzc, (zzcbuVar.zzb + j16) - j15);
                for (int i10 = (int) ((zzcbuVar.zzb + j18) - j15); i10 < iMin; i10++) {
                    if (bArr[i10] == 10) {
                        j13 = i10 - zzcbuVar.zzb;
                        j14 = j13 + j15;
                        break loop3;
                    }
                }
                j18 = j15 + (zzcbuVar.zzc - zzcbuVar.zzb);
                zzcbuVar = zzcbuVar.zzf;
                Intrinsics.g(zzcbuVar);
                j17 = j11;
                j15 = j18;
            }
            j11 = j17;
            j12 = -1;
            j14 = j12;
        } else {
            j11 = 0;
            j12 = -1;
            j15 = 0;
            while (true) {
                long j19 = (zzcbuVar.zzc - zzcbuVar.zzb) + j15;
                if (j19 > 0) {
                    break;
                }
                zzcbuVar = zzcbuVar.zzf;
                Intrinsics.g(zzcbuVar);
                j15 = j19;
            }
            long j20 = 0;
            loop6: while (j15 < j16) {
                byte[] bArr2 = zzcbuVar.zza;
                int iMin2 = (int) Math.min(zzcbuVar.zzc, (zzcbuVar.zzb + j16) - j15);
                for (int i11 = (int) ((zzcbuVar.zzb + j20) - j15); i11 < iMin2; i11++) {
                    if (bArr2[i11] == 10) {
                        j13 = i11 - zzcbuVar.zzb;
                        j14 = j13 + j15;
                        break loop3;
                    }
                }
                j20 = (zzcbuVar.zzc - zzcbuVar.zzb) + j15;
                zzcbuVar = zzcbuVar.zzf;
                Intrinsics.g(zzcbuVar);
                j15 = j20;
            }
            j14 = j12;
        }
        if (j14 != j12) {
            int i12 = zzccd.zza;
            Intrinsics.j(this, "<this>");
            if (j14 > j11) {
                long j21 = j14 + j12;
                if (zzk(j21) == 13) {
                    String strZzp = zzp(j21, Charsets.UTF_8);
                    zzt(2L);
                    return strZzp;
                }
            }
            String strZzp2 = zzp(j14, Charsets.UTF_8);
            zzt(1L);
            return strZzp2;
        }
        zzcbj out = new zzcbj();
        long jMin = Math.min(32L, this.zzb);
        Intrinsics.j(out, "out");
        zzcbf.zza(this.zzb, 0L, jMin);
        if (jMin != j11) {
            out.zzb += jMin;
            zzcbu zzcbuVar2 = this.zza;
            long j22 = j11;
            while (true) {
                Intrinsics.g(zzcbuVar2);
                long j23 = zzcbuVar2.zzc - zzcbuVar2.zzb;
                if (j22 < j23) {
                    break;
                }
                zzcbuVar2 = zzcbuVar2.zzf;
                j22 -= j23;
            }
            while (jMin > j11) {
                Intrinsics.g(zzcbuVar2);
                zzcbu zzcbuVarZza = zzcbuVar2.zza();
                int i13 = zzcbuVarZza.zzb + ((int) j22);
                zzcbuVarZza.zzb = i13;
                zzcbuVarZza.zzc = Math.min(i13 + ((int) jMin), zzcbuVarZza.zzc);
                zzcbu zzcbuVar3 = out.zza;
                if (zzcbuVar3 == null) {
                    zzcbuVarZza.zzg = zzcbuVarZza;
                    zzcbuVarZza.zzf = zzcbuVarZza;
                    out.zza = zzcbuVarZza;
                } else {
                    Intrinsics.g(zzcbuVar3);
                    zzcbu zzcbuVar4 = zzcbuVar3.zzg;
                    Intrinsics.g(zzcbuVar4);
                    zzcbuVar4.zzc(zzcbuVarZza);
                }
                jMin -= zzcbuVarZza.zzc - zzcbuVarZza.zzb;
                zzcbuVar2 = zzcbuVar2.zzf;
                j22 = j11;
            }
        }
        long jMin2 = Math.min(this.zzb, Long.MAX_VALUE);
        String strZzg = out.zzn(out.zzb).zzg();
        StringBuilder sb2 = new StringBuilder(String.valueOf(jMin2).length() + 29 + String.valueOf(strZzg).length() + 1);
        sb2.append("\\n not found: limit=");
        sb2.append(jMin2);
        sb2.append(" content=");
        sb2.append(strZzg);
        sb2.append("…");
        throw new EOFException(sb2.toString());
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final byte[] zzr(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 11);
            sb2.append("byteCount: ");
            sb2.append(j10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (this.zzb < j10) {
            throw new EOFException();
        }
        int i10 = (int) j10;
        byte[] sink = new byte[i10];
        Intrinsics.j(sink, "sink");
        int i11 = 0;
        while (i11 < i10) {
            int iZzs = zzs(sink, i11, i10 - i11);
            if (iZzs == -1) {
                throw new EOFException();
            }
            i11 += iZzs;
        }
        return sink;
    }

    public final int zzs(byte[] sink, int i10, int i11) {
        Intrinsics.j(sink, "sink");
        zzcbf.zza(sink.length, i10, i11);
        zzcbu zzcbuVar = this.zza;
        if (zzcbuVar == null) {
            return -1;
        }
        int iMin = Math.min(i11, zzcbuVar.zzc - zzcbuVar.zzb);
        int i12 = zzcbuVar.zzb;
        ArraysKt.j(zzcbuVar.zza, sink, i10, i12, i12 + iMin);
        int i13 = zzcbuVar.zzb + iMin;
        zzcbuVar.zzb = i13;
        this.zzb -= iMin;
        if (i13 != zzcbuVar.zzc) {
            return iMin;
        }
        this.zza = zzcbuVar.zzb();
        zzcbv.zzb(zzcbuVar);
        return iMin;
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final void zzt(long j10) throws EOFException {
        while (j10 > 0) {
            zzcbu zzcbuVar = this.zza;
            if (zzcbuVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, zzcbuVar.zzc - zzcbuVar.zzb);
            long j11 = iMin;
            this.zzb -= j11;
            j10 -= j11;
            int i10 = zzcbuVar.zzb + iMin;
            zzcbuVar.zzb = i10;
            if (i10 == zzcbuVar.zzc) {
                this.zza = zzcbuVar.zzb();
                zzcbv.zzb(zzcbuVar);
            }
        }
    }

    public final zzcbj zzu(zzcbn byteString) {
        Intrinsics.j(byteString, "byteString");
        byteString.zzm(this, 0, byteString.zzj());
        return this;
    }

    public final zzcbj zzv(String string) {
        Intrinsics.j(string, "string");
        zzw(string, 0, string.length());
        return this;
    }

    public final zzcbj zzw(String string, int i10, int i11) {
        Intrinsics.j(string, "string");
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 27);
            sb2.append("endIndex < beginIndex: ");
            sb2.append(i11);
            sb2.append(" < 0");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i11 > string.length()) {
            int length = string.length();
            StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length() + 29 + String.valueOf(length).length());
            sb3.append("endIndex > string.length: ");
            sb3.append(i11);
            sb3.append(" > ");
            sb3.append(length);
            throw new IllegalArgumentException(sb3.toString());
        }
        int i12 = 0;
        while (i12 < i11) {
            int i13 = i12 + 1;
            char cCharAt = string.charAt(i12);
            if (cCharAt < 128) {
                zzcbu zzcbuVarZzE = zzE(1);
                byte[] bArr = zzcbuVarZzE.zza;
                int i14 = zzcbuVarZzE.zzc - i12;
                int iMin = Math.min(i11, 8192 - i14);
                bArr[i12 + i14] = (byte) cCharAt;
                i12 = i13;
                while (i12 < iMin) {
                    char cCharAt2 = string.charAt(i12);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i12 + i14] = (byte) cCharAt2;
                    i12++;
                }
                int i15 = zzcbuVarZzE.zzc;
                int i16 = (i14 + i12) - i15;
                zzcbuVarZzE.zzc = i15 + i16;
                this.zzb += i16;
            } else {
                if (cCharAt < 2048) {
                    zzcbu zzcbuVarZzE2 = zzE(2);
                    byte[] bArr2 = zzcbuVarZzE2.zza;
                    int i17 = zzcbuVarZzE2.zzc;
                    bArr2[i17] = (byte) ((cCharAt >> 6) | 192);
                    bArr2[i17 + 1] = (byte) ((cCharAt & '?') | 128);
                    zzcbuVarZzE2.zzc = i17 + 2;
                    this.zzb += 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    zzcbu zzcbuVarZzE3 = zzE(3);
                    byte[] bArr3 = zzcbuVarZzE3.zza;
                    int i18 = zzcbuVarZzE3.zzc;
                    bArr3[i18] = (byte) ((cCharAt >> '\f') | 224);
                    bArr3[i18 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                    bArr3[i18 + 2] = (byte) ((cCharAt & '?') | 128);
                    zzcbuVarZzE3.zzc = i18 + 3;
                    this.zzb += 3;
                } else {
                    char cCharAt3 = i13 < i11 ? string.charAt(i13) : (char) 0;
                    if (cCharAt > 56319 || cCharAt3 < 56320 || cCharAt3 >= 57344) {
                        zzA(63);
                    } else {
                        zzcbu zzcbuVarZzE4 = zzE(4);
                        byte[] bArr4 = zzcbuVarZzE4.zza;
                        int i19 = zzcbuVarZzE4.zzc;
                        int i20 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        bArr4[i19] = (byte) ((i20 >> 18) | 240);
                        bArr4[i19 + 1] = (byte) (((i20 >> 12) & 63) | 128);
                        bArr4[i19 + 2] = (byte) (((i20 >> 6) & 63) | 128);
                        bArr4[i19 + 3] = (byte) ((i20 & 63) | 128);
                        zzcbuVarZzE4.zzc = i19 + 4;
                        this.zzb += 4;
                        i12 += 2;
                    }
                }
                i12 = i13;
            }
        }
        return this;
    }

    public final zzcbj zzx(int i10) {
        if (i10 < 128) {
            zzA(i10);
            return this;
        }
        if (i10 < 2048) {
            zzcbu zzcbuVarZzE = zzE(2);
            byte[] bArr = zzcbuVarZzE.zza;
            int i11 = zzcbuVarZzE.zzc;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            zzcbuVarZzE.zzc = i11 + 2;
            this.zzb += 2;
            return this;
        }
        if (i10 >= 55296 && i10 < 57344) {
            zzA(63);
            return this;
        }
        if (i10 < 65536) {
            zzcbu zzcbuVarZzE2 = zzE(3);
            byte[] bArr2 = zzcbuVarZzE2.zza;
            int i12 = zzcbuVarZzE2.zzc;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            zzcbuVarZzE2.zzc = i12 + 3;
            this.zzb += 3;
            return this;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(String.valueOf(zzcbf.zzc(i10))));
        }
        zzcbu zzcbuVarZzE3 = zzE(4);
        byte[] bArr3 = zzcbuVarZzE3.zza;
        int i13 = zzcbuVarZzE3.zzc;
        bArr3[i13] = (byte) ((i10 >> 18) | 240);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
        zzcbuVarZzE3.zzc = i13 + 4;
        this.zzb += 4;
        return this;
    }

    public final zzcbj zzy(byte[] source) {
        Intrinsics.j(source, "source");
        zzz(source, 0, source.length);
        return this;
    }

    public final zzcbj zzz(byte[] source, int i10, int i11) {
        Intrinsics.j(source, "source");
        long j10 = i11;
        zzcbf.zza(source.length, i10, j10);
        int i12 = i10;
        while (true) {
            int i13 = i10 + i11;
            if (i12 >= i13) {
                this.zzb += j10;
                return this;
            }
            zzcbu zzcbuVarZzE = zzE(1);
            int iMin = Math.min(i13 - i12, 8192 - zzcbuVarZzE.zzc);
            int i14 = i12 + iMin;
            ArraysKt.j(source, zzcbuVarZzE.zza, zzcbuVarZzE.zzc, i12, i14);
            zzcbuVarZzE.zzc += iMin;
            i12 = i14;
        }
    }

    public final String toString() {
        return zzF().toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcbk
    public final /* bridge */ /* synthetic */ zzcbk zzH(String str) {
        zzv(str);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzcbk
    public final /* bridge */ /* synthetic */ zzcbk zzI(byte[] bArr) {
        zzy(bArr);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzcbk
    public final /* bridge */ /* synthetic */ zzcbk zzJ(int i10) {
        zzA(i10);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzcbk
    public final /* bridge */ /* synthetic */ zzcbk zzK(int i10) {
        zzB(i10);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzcbk
    public final /* bridge */ /* synthetic */ zzcbk zzL(int i10) {
        zzC(i10);
        return this;
    }
}
