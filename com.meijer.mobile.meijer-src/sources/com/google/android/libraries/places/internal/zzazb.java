package com.google.android.libraries.places.internal;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import fsimpl.C14170dq;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
final class zzazb extends zzazc {
    private final InputStream zzg;
    private final byte[] zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;

    /* synthetic */ zzazb(InputStream inputStream, int i10, byte[] bArr) {
        super(null);
        this.zzn = a.e.API_PRIORITY_OTHER;
        byte[] bArr2 = zzbap.zzb;
        this.zzg = inputStream;
        this.zzh = new byte[RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT];
        this.zzi = 0;
        this.zzk = 0;
        this.zzm = 0;
    }

    private final void zzO() {
        int i10 = this.zzi + this.zzj;
        this.zzi = i10;
        int i11 = this.zzm + i10;
        int i12 = this.zzn;
        if (i11 <= i12) {
            this.zzj = 0;
            return;
        }
        int i13 = i11 - i12;
        this.zzj = i13;
        this.zzi = i10 - i13;
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final int zzC() {
        return this.zzm + this.zzk;
    }

    final long zzw() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            j10 |= (r3 & Byte.MAX_VALUE) << i10;
            if ((zzD() & 128) == 0) {
                return j10;
            }
        }
        throw new zzbar("CodedInputStream encountered a malformed varint.");
    }

    private final boolean zzQ(int i10) throws IOException {
        int i11 = this.zzk;
        int i12 = i11 + i10;
        int i13 = this.zzi;
        if (i12 <= i13) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 66);
            sb2.append("refillBuffer() called when ");
            sb2.append(i10);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        int i14 = this.zzd;
        int i15 = this.zzm;
        if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.zzn) {
            return false;
        }
        if (i11 > 0) {
            if (i13 > i11) {
                byte[] bArr = this.zzh;
                System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
            }
            i15 = this.zzm + i11;
            this.zzm = i15;
            i13 = this.zzi - i11;
            this.zzi = i13;
            this.zzk = 0;
        }
        try {
            int i16 = this.zzg.read(this.zzh, i13, Math.min(4096 - i13, (this.zzd - i15) - i13));
            if (i16 != 0 && i16 >= -1 && i16 <= 4096) {
                if (i16 <= 0) {
                    return false;
                }
                this.zzi += i16;
                zzO();
                return this.zzi >= i10 || zzQ(i10);
            }
            String strValueOf = String.valueOf(this.zzg.getClass());
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 39 + String.valueOf(i16).length() + 41);
            sb3.append(strValueOf);
            sb3.append("#read(byte[]) returned invalid result: ");
            sb3.append(i16);
            sb3.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb3.toString());
        } catch (zzbar e10) {
            e10.zza();
            throw e10;
        }
    }

    private final byte[] zzS(int i10) throws IOException {
        if (i10 == 0) {
            return zzbap.zzb;
        }
        int i11 = this.zzm;
        int i12 = this.zzk;
        int i13 = i11 + i12 + i10;
        if (i13 - this.zzd > 0) {
            throw new zzbar("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i14 = this.zzn;
        if (i13 > i14) {
            zzE((i14 - i11) - i12);
            throw new zzbar("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = this.zzi - i12;
        int i16 = i10 - i15;
        if (i16 >= 4096) {
            try {
                if (i16 > this.zzg.available()) {
                    return null;
                }
            } catch (zzbar e10) {
                e10.zza();
                throw e10;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzh, this.zzk, bArr, 0, i15);
        this.zzm += this.zzi;
        this.zzk = 0;
        this.zzi = 0;
        while (i15 < i10) {
            try {
                int i17 = this.zzg.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw new zzbar("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzm += i17;
                i15 += i17;
            } catch (zzbar e11) {
                e11.zza();
                throw e11;
            }
        }
        return bArr;
    }

    private final List zzT(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.zzg.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw new zzbar("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzm += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final void zzA(int i10) {
        this.zzn = i10;
        zzO();
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final boolean zzB() throws IOException {
        return this.zzk == this.zzi && !zzQ(1);
    }

    public final byte zzD() throws IOException {
        if (this.zzk == this.zzi) {
            zzP(1);
        }
        byte[] bArr = this.zzh;
        int i10 = this.zzk;
        this.zzk = i10 + 1;
        return bArr[i10];
    }

    public final void zzE(int i10) throws IOException {
        int i11 = this.zzi;
        int i12 = this.zzk;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.zzk = i12 + i10;
            return;
        }
        if (i10 < 0) {
            throw new zzbar("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i14 = this.zzm;
        int i15 = i14 + i12;
        int i16 = this.zzn;
        if (i15 + i10 > i16) {
            zzE((i16 - i14) - i12);
            throw new zzbar("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzm = i15;
        this.zzi = 0;
        this.zzk = 0;
        while (i13 < i10) {
            try {
                long j10 = i10 - i13;
                try {
                    long jSkip = this.zzg.skip(j10);
                    if (jSkip < 0 || jSkip > j10) {
                        String strValueOf = String.valueOf(this.zzg.getClass());
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 31 + String.valueOf(jSkip).length() + 41);
                        sb2.append(strValueOf);
                        sb2.append("#skip returned invalid result: ");
                        sb2.append(jSkip);
                        sb2.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb2.toString());
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i13 += (int) jSkip;
                    }
                } catch (zzbar e10) {
                    e10.zza();
                    throw e10;
                }
            } catch (Throwable th2) {
                this.zzm += i13;
                zzO();
                throw th2;
            }
        }
        this.zzm += i13;
        zzO();
        if (i13 >= i10) {
            return;
        }
        int i17 = this.zzi;
        int i18 = i17 - this.zzk;
        this.zzk = i17;
        zzP(1);
        while (true) {
            int i19 = i10 - i18;
            int i20 = this.zzi;
            if (i19 <= i20) {
                this.zzk = i19;
                return;
            } else {
                i18 += i20;
                this.zzk = i20;
                zzP(1);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final void zzb(int i10) throws zzbar {
        if (this.zzl != i10) {
            throw new zzbar("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final boolean zzc(int i10) throws IOException {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzi - this.zzk < 10) {
                while (i12 < 10) {
                    if (zzD() < 0) {
                        i12++;
                    }
                }
                throw new zzbar("CodedInputStream encountered a malformed varint.");
            }
            while (i12 < 10) {
                byte[] bArr = this.zzh;
                int i13 = this.zzk;
                this.zzk = i13 + 1;
                if (bArr[i13] < 0) {
                    i12++;
                }
            }
            throw new zzbar("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i11 == 1) {
            zzE(8);
            return true;
        }
        if (i11 == 2) {
            zzE(zzu());
            return true;
        }
        if (i11 == 3) {
            zzK();
            zzb(((i10 >>> 3) << 3) | 4);
            return true;
        }
        if (i11 == 4) {
            zzJ();
            return false;
        }
        if (i11 != 5) {
            throw new zzbaq("Protocol message tag had invalid wire type.");
        }
        zzE(4);
        return true;
    }

    public final int zzu() throws IOException {
        int i10;
        int i11 = this.zzk;
        int i12 = this.zzi;
        if (i12 != i11) {
            byte[] bArr = this.zzh;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.zzk = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << C14170dq.LIGHTEN) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.zzk = i14;
                return i10;
            }
        }
        return (int) zzw();
    }

    public final long zzv() throws IOException {
        long j10;
        long j11;
        int i10 = this.zzk;
        int i11 = this.zzi;
        if (i11 != i10) {
            byte[] bArr = this.zzh;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.zzk = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j10 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << C14170dq.LIGHTEN) ^ i14;
                    if (i16 >= 0) {
                        j10 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            long j12 = (-2080896) ^ i18;
                            i13 = i17;
                            j10 = j12;
                        } else {
                            i15 = i10 + 5;
                            long j13 = (bArr[i17] << 28) ^ i18;
                            if (j13 >= 0) {
                                j10 = j13 ^ 266354560;
                            } else {
                                i13 = i10 + 6;
                                long j14 = (bArr[i15] << 35) ^ j13;
                                if (j14 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    int i19 = i10 + 7;
                                    long j15 = j14 ^ (bArr[i13] << 42);
                                    if (j15 >= 0) {
                                        j10 = j15 ^ 4363953127296L;
                                    } else {
                                        i13 = i10 + 8;
                                        j14 = j15 ^ (bArr[i19] << 49);
                                        if (j14 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i19 = i10 + 9;
                                            long j16 = (j14 ^ (bArr[i13] << 56)) ^ 71499008037633920L;
                                            if (j16 < 0) {
                                                i13 = i10 + 10;
                                                if (bArr[i19] >= 0) {
                                                    j10 = j16;
                                                }
                                            } else {
                                                j10 = j16;
                                            }
                                        }
                                    }
                                    i13 = i19;
                                }
                                j10 = j14 ^ j11;
                            }
                        }
                    }
                    i13 = i15;
                }
                this.zzk = i13;
                return j10;
            }
        }
        return zzw();
    }

    public final int zzx() throws IOException {
        int i10 = this.zzk;
        if (this.zzi - i10 < 4) {
            zzP(4);
            i10 = this.zzk;
        }
        byte[] bArr = this.zzh;
        this.zzk = i10 + 4;
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public final long zzy() throws IOException {
        int i10 = this.zzk;
        if (this.zzi - i10 < 8) {
            zzP(8);
            i10 = this.zzk;
        }
        byte[] bArr = this.zzh;
        this.zzk = i10 + 8;
        long j10 = bArr[i10];
        long j11 = bArr[i10 + 2];
        long j12 = bArr[i10 + 3];
        return ((bArr[i10 + 6] & 255) << 48) | (j10 & 255) | ((bArr[i10 + 1] & 255) << 8) | ((j11 & 255) << 16) | ((j12 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 7] & 255) << 56);
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final int zzz(int i10) throws zzbar {
        if (i10 < 0) {
            throw new zzbar("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = i10 + this.zzm + this.zzk;
        if (i11 < 0) {
            throw new zzbar("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i12 = this.zzn;
        if (i11 > i12) {
            throw new zzbar("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzn = i11;
        zzO();
        return i12;
    }

    private final void zzP(int i10) throws IOException {
        if (!zzQ(i10)) {
            if (i10 > (this.zzd - this.zzm) - this.zzk) {
                throw new zzbar("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            }
            throw new zzbar("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final byte[] zzR(int i10, boolean z10) throws IOException {
        byte[] bArrZzS = zzS(i10);
        if (bArrZzS != null) {
            return bArrZzS;
        }
        int i11 = this.zzk;
        int i12 = this.zzi;
        int i13 = i12 - i11;
        this.zzm += i12;
        this.zzk = 0;
        this.zzi = 0;
        List<byte[]> listZzT = zzT(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzh, i11, bArr, 0, i13);
        for (byte[] bArr2 : listZzT) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return bArr;
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final int zza() throws IOException {
        if (zzB()) {
            this.zzl = 0;
            return 0;
        }
        int iZzu = zzu();
        this.zzl = iZzu;
        if ((iZzu >>> 3) != 0) {
            return iZzu;
        }
        throw new zzbar("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final double zzd() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final float zze() throws IOException {
        return Float.intBitsToFloat(zzx());
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final long zzf() throws IOException {
        return zzv();
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final long zzg() throws IOException {
        return zzv();
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final int zzh() throws IOException {
        return zzu();
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final long zzi() throws IOException {
        return zzy();
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final int zzj() throws IOException {
        return zzx();
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final boolean zzk() throws IOException {
        if (zzv() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final String zzl() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0) {
            int i10 = this.zzi;
            int i11 = this.zzk;
            if (iZzu <= i10 - i11) {
                String str = new String(this.zzh, i11, iZzu, zzbap.zza);
                this.zzk += iZzu;
                return str;
            }
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu >= 0) {
            if (iZzu <= this.zzi) {
                zzP(iZzu);
                String str2 = new String(this.zzh, this.zzk, iZzu, zzbap.zza);
                this.zzk += iZzu;
                return str2;
            }
            return new String(zzR(iZzu, false), zzbap.zza);
        }
        throw new zzbar("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final String zzm() throws IOException {
        byte[] bArrZzR;
        int iZzu = zzu();
        int i10 = this.zzk;
        int i11 = this.zzi;
        if (iZzu <= i11 - i10 && iZzu > 0) {
            bArrZzR = this.zzh;
            this.zzk = i10 + iZzu;
        } else {
            if (iZzu == 0) {
                return "";
            }
            if (iZzu >= 0) {
                i10 = 0;
                if (iZzu <= i11) {
                    zzP(iZzu);
                    bArrZzR = this.zzh;
                    this.zzk = iZzu;
                } else {
                    bArrZzR = zzR(iZzu, false);
                }
            } else {
                throw new zzbar("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
        }
        return zzbcw.zzc(bArrZzR, i10, iZzu);
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final zzayz zzn() throws IOException {
        int iZzu = zzu();
        int i10 = this.zzi;
        int i11 = this.zzk;
        if (iZzu <= i10 - i11 && iZzu > 0) {
            zzayz zzayzVarZzh = zzayz.zzh(this.zzh, i11, iZzu);
            this.zzk += iZzu;
            return zzayzVarZzh;
        }
        if (iZzu == 0) {
            return zzayz.zzb;
        }
        if (iZzu >= 0) {
            byte[] bArrZzS = zzS(iZzu);
            if (bArrZzS != null) {
                return zzayz.zzh(bArrZzS, 0, bArrZzS.length);
            }
            int i12 = this.zzk;
            int i13 = this.zzi;
            int i14 = i13 - i12;
            this.zzm += i13;
            this.zzk = 0;
            this.zzi = 0;
            List<byte[]> listZzT = zzT(iZzu - i14);
            byte[] bArr = new byte[iZzu];
            System.arraycopy(this.zzh, i12, bArr, 0, i14);
            for (byte[] bArr2 : listZzT) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i14, length);
                i14 += length;
            }
            zzayz zzayzVar = zzayz.zzb;
            return new zzayy(bArr);
        }
        throw new zzbar("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final int zzo() throws IOException {
        return zzu();
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final int zzp() throws IOException {
        return zzu();
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final int zzq() throws IOException {
        return zzx();
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final long zzr() throws IOException {
        return zzy();
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final int zzs() throws IOException {
        return zzazc.zzM(zzu());
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final long zzt() throws IOException {
        return zzazc.zzN(zzv());
    }
}
