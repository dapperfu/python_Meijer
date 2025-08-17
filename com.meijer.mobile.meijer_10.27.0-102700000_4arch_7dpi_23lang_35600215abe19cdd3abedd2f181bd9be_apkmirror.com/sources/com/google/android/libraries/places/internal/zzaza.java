package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.a;
import fsimpl.C14045dq;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes6.dex */
final class zzaza extends zzazc {
    private final byte[] zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    /* synthetic */ zzaza(byte[] bArr, int i10, int i11, boolean z10, byte[] bArr2) {
        super(null);
        this.zzl = a.e.API_PRIORITY_OTHER;
        this.zzg = bArr;
        this.zzh = i11;
        this.zzj = 0;
    }

    private final void zzO() {
        int i10 = this.zzh + this.zzi;
        this.zzh = i10;
        int i11 = this.zzl;
        if (i10 <= i11) {
            this.zzi = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzi = i12;
        this.zzh = i10 - i12;
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final boolean zzB() throws IOException {
        return this.zzj == this.zzh;
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final int zzC() {
        return this.zzj;
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

    @Override // com.google.android.libraries.places.internal.zzazc
    public final void zzA(int i10) {
        this.zzl = i10;
        zzO();
    }

    public final byte zzD() throws IOException {
        int i10 = this.zzj;
        if (i10 == this.zzh) {
            throw new zzbar("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzg;
        this.zzj = i10 + 1;
        return bArr[i10];
    }

    public final void zzE(int i10) throws IOException {
        if (i10 >= 0) {
            int i11 = this.zzh;
            int i12 = this.zzj;
            if (i10 <= i11 - i12) {
                this.zzj = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw new zzbar("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzbar("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final void zzb(int i10) throws zzbar {
        if (this.zzk != i10) {
            throw new zzbar("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final boolean zzc(int i10) throws IOException {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzh - this.zzj < 10) {
                while (i12 < 10) {
                    if (zzD() < 0) {
                        i12++;
                    }
                }
                throw new zzbar("CodedInputStream encountered a malformed varint.");
            }
            while (i12 < 10) {
                byte[] bArr = this.zzg;
                int i13 = this.zzj;
                this.zzj = i13 + 1;
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
        int i11 = this.zzj;
        int i12 = this.zzh;
        if (i12 != i11) {
            byte[] bArr = this.zzg;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.zzj = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << C14045dq.LIGHTEN) ^ i15;
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
                this.zzj = i14;
                return i10;
            }
        }
        return (int) zzw();
    }

    public final long zzv() throws IOException {
        long j10;
        long j11;
        int i10 = this.zzj;
        int i11 = this.zzh;
        if (i11 != i10) {
            byte[] bArr = this.zzg;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.zzj = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j10 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << C14045dq.LIGHTEN) ^ i14;
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
                this.zzj = i13;
                return j10;
            }
        }
        return zzw();
    }

    public final int zzx() throws IOException {
        int i10 = this.zzj;
        if (this.zzh - i10 < 4) {
            throw new zzbar("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzg;
        this.zzj = i10 + 4;
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public final long zzy() throws IOException {
        int i10 = this.zzj;
        if (this.zzh - i10 < 8) {
            throw new zzbar("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzg;
        this.zzj = i10 + 8;
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
        int i11 = i10 + this.zzj;
        if (i11 < 0) {
            throw new zzbar("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i12 = this.zzl;
        if (i11 > i12) {
            throw new zzbar("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i11;
        zzO();
        return i12;
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final int zza() throws IOException {
        if (zzB()) {
            this.zzk = 0;
            return 0;
        }
        int iZzu = zzu();
        this.zzk = iZzu;
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
            int i10 = this.zzh;
            int i11 = this.zzj;
            if (iZzu <= i10 - i11) {
                String str = new String(this.zzg, i11, iZzu, zzbap.zza);
                this.zzj += iZzu;
                return str;
            }
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu < 0) {
            throw new zzbar("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzbar("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final String zzm() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0) {
            int i10 = this.zzh;
            int i11 = this.zzj;
            if (iZzu <= i10 - i11) {
                String strZzc = zzbcw.zzc(this.zzg, i11, iZzu);
                this.zzj += iZzu;
                return strZzc;
            }
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu <= 0) {
            throw new zzbar("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzbar("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final zzayz zzn() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0) {
            int i10 = this.zzh;
            int i11 = this.zzj;
            if (iZzu <= i10 - i11) {
                zzayz zzayzVarZzh = zzayz.zzh(this.zzg, i11, iZzu);
                this.zzj += iZzu;
                return zzayzVarZzh;
            }
        }
        if (iZzu != 0) {
            if (iZzu > 0) {
                int i12 = this.zzh;
                int i13 = this.zzj;
                if (iZzu <= i12 - i13) {
                    int i14 = iZzu + i13;
                    this.zzj = i14;
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(this.zzg, i13, i14);
                    zzayz zzayzVar = zzayz.zzb;
                    return new zzayy(bArrCopyOfRange);
                }
            }
            if (iZzu <= 0) {
                throw new zzbar("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzbar("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        return zzayz.zzb;
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
