package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.util.List;

/* loaded from: classes6.dex */
final class zzazd implements zzbby {
    private final zzazc zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    @Override // com.google.android.libraries.places.internal.zzbby
    public final int zzc() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final double zze() throws IOException {
        zzR(1);
        return this.zza.zzd();
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final float zzf() throws IOException {
        zzR(5);
        return this.zza.zze();
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final long zzg() throws IOException {
        zzR(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final long zzh() throws IOException {
        zzR(0);
        return this.zza.zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final int zzi() throws IOException {
        zzR(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final long zzj() throws IOException {
        zzR(1);
        return this.zza.zzi();
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final int zzk() throws IOException {
        zzR(5);
        return this.zza.zzj();
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final boolean zzl() throws IOException {
        zzR(0);
        return this.zza.zzk();
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final String zzm() throws IOException {
        zzR(2);
        return this.zza.zzl();
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final String zzn() throws IOException {
        zzR(2);
        return this.zza.zzm();
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final Object zzo(Class cls, zzazp zzazpVar) throws IOException {
        zzR(2);
        return zzT(zzbbv.zza().zzb(cls), zzazpVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    @Deprecated
    public final Object zzp(Class cls, zzazp zzazpVar) throws IOException {
        zzR(3);
        return zzV(zzbbv.zza().zzb(cls), zzazpVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final void zzq(Object obj, zzbbz zzbbzVar, zzazp zzazpVar) throws IOException {
        zzR(2);
        zzS(obj, zzbbzVar, zzazpVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final void zzr(Object obj, zzbbz zzbbzVar, zzazp zzazpVar) throws IOException {
        zzR(3);
        zzU(obj, zzbbzVar, zzazpVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final zzayz zzs() throws IOException {
        zzR(2);
        return this.zza.zzn();
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final int zzt() throws IOException {
        zzR(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final int zzu() throws IOException {
        zzR(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final int zzv() throws IOException {
        zzR(5);
        return this.zza.zzq();
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final long zzw() throws IOException {
        zzR(1);
        return this.zza.zzr();
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final int zzx() throws IOException {
        zzR(0);
        return this.zza.zzs();
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final long zzy() throws IOException {
        zzR(0);
        return this.zza.zzt();
    }

    private final void zzR(int i10) throws IOException {
        if ((this.zzb & 7) != i10) {
            throw new zzbaq("Protocol message tag had invalid wire type.");
        }
    }

    private final void zzS(Object obj, zzbbz zzbbzVar, zzazp zzazpVar) throws IOException {
        zzazc zzazcVar = this.zza;
        int iZzo = zzazcVar.zzo();
        zzazcVar.zzI();
        int iZzz = zzazcVar.zzz(iZzo);
        zzazcVar.zza++;
        zzbbzVar.zzg(obj, this, zzazpVar);
        zzazcVar.zzb(0);
        zzazcVar.zza--;
        zzazcVar.zzA(iZzz);
    }

    private final void zzU(Object obj, zzbbz zzbbzVar, zzazp zzazpVar) throws IOException {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzbbzVar.zzg(obj, this, zzazpVar);
            if (this.zzb == this.zzc) {
            } else {
                throw new zzbar("Failed to parse the message.");
            }
        } finally {
            this.zzc = i10;
        }
    }

    private final void zzW(int i10) throws IOException {
        if (this.zza.zzC() != i10) {
            throw new zzbar("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void zzX(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw new zzbar("Failed to parse the message.");
        }
    }

    private static final void zzY(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw new zzbar("Failed to parse the message.");
        }
    }

    public static zzazd zza(zzazc zzazcVar) {
        zzazd zzazdVar = zzazcVar.zze;
        return zzazdVar != null ? zzazdVar : new zzazd(zzazcVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final void zzA(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzazw) {
            zzazw zzazwVar = (zzazw) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                zzazc zzazcVar = this.zza;
                int iZzo = zzazcVar.zzo();
                zzX(iZzo);
                int iZzC = zzazcVar.zzC() + iZzo;
                do {
                    zzazwVar.zzf(zzazcVar.zze());
                } while (zzazcVar.zzC() < iZzC);
                return;
            }
            if (i10 != 5) {
                throw new zzbaq("Protocol message tag had invalid wire type.");
            }
            do {
                zzazc zzazcVar2 = this.zza;
                zzazwVar.zzf(zzazcVar2.zze());
                if (zzazcVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zzazcVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                zzazc zzazcVar3 = this.zza;
                int iZzo2 = zzazcVar3.zzo();
                zzX(iZzo2);
                int iZzC2 = zzazcVar3.zzC() + iZzo2;
                do {
                    list.add(Float.valueOf(zzazcVar3.zze()));
                } while (zzazcVar3.zzC() < iZzC2);
                return;
            }
            if (i11 != 5) {
                throw new zzbaq("Protocol message tag had invalid wire type.");
            }
            do {
                zzazc zzazcVar4 = this.zza;
                list.add(Float.valueOf(zzazcVar4.zze()));
                if (zzazcVar4.zzB()) {
                    return;
                } else {
                    iZza = zzazcVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final void zzB(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzbba) {
            zzbba zzbbaVar = (zzbba) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzbaq("Protocol message tag had invalid wire type.");
                }
                zzazc zzazcVar = this.zza;
                int iZzC = zzazcVar.zzC() + zzazcVar.zzo();
                do {
                    zzbbaVar.zzf(zzazcVar.zzf());
                } while (zzazcVar.zzC() < iZzC);
                zzW(iZzC);
                return;
            }
            do {
                zzazc zzazcVar2 = this.zza;
                zzbbaVar.zzf(zzazcVar2.zzf());
                if (zzazcVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zzazcVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzbaq("Protocol message tag had invalid wire type.");
                }
                zzazc zzazcVar3 = this.zza;
                int iZzC2 = zzazcVar3.zzC() + zzazcVar3.zzo();
                do {
                    list.add(Long.valueOf(zzazcVar3.zzf()));
                } while (zzazcVar3.zzC() < iZzC2);
                zzW(iZzC2);
                return;
            }
            do {
                zzazc zzazcVar4 = this.zza;
                list.add(Long.valueOf(zzazcVar4.zzf()));
                if (zzazcVar4.zzB()) {
                    return;
                } else {
                    iZza = zzazcVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final void zzC(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzbba) {
            zzbba zzbbaVar = (zzbba) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzbaq("Protocol message tag had invalid wire type.");
                }
                zzazc zzazcVar = this.zza;
                int iZzC = zzazcVar.zzC() + zzazcVar.zzo();
                do {
                    zzbbaVar.zzf(zzazcVar.zzg());
                } while (zzazcVar.zzC() < iZzC);
                zzW(iZzC);
                return;
            }
            do {
                zzazc zzazcVar2 = this.zza;
                zzbbaVar.zzf(zzazcVar2.zzg());
                if (zzazcVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zzazcVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzbaq("Protocol message tag had invalid wire type.");
                }
                zzazc zzazcVar3 = this.zza;
                int iZzC2 = zzazcVar3.zzC() + zzazcVar3.zzo();
                do {
                    list.add(Long.valueOf(zzazcVar3.zzg()));
                } while (zzazcVar3.zzC() < iZzC2);
                zzW(iZzC2);
                return;
            }
            do {
                zzazc zzazcVar4 = this.zza;
                list.add(Long.valueOf(zzazcVar4.zzg()));
                if (zzazcVar4.zzB()) {
                    return;
                } else {
                    iZza = zzazcVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final void zzD(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzbaf) {
            zzbaf zzbafVar = (zzbaf) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzbaq("Protocol message tag had invalid wire type.");
                }
                zzazc zzazcVar = this.zza;
                int iZzC = zzazcVar.zzC() + zzazcVar.zzo();
                do {
                    zzbafVar.zzh(zzazcVar.zzh());
                } while (zzazcVar.zzC() < iZzC);
                zzW(iZzC);
                return;
            }
            do {
                zzazc zzazcVar2 = this.zza;
                zzbafVar.zzh(zzazcVar2.zzh());
                if (zzazcVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zzazcVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzbaq("Protocol message tag had invalid wire type.");
                }
                zzazc zzazcVar3 = this.zza;
                int iZzC2 = zzazcVar3.zzC() + zzazcVar3.zzo();
                do {
                    list.add(Integer.valueOf(zzazcVar3.zzh()));
                } while (zzazcVar3.zzC() < iZzC2);
                zzW(iZzC2);
                return;
            }
            do {
                zzazc zzazcVar4 = this.zza;
                list.add(Integer.valueOf(zzazcVar4.zzh()));
                if (zzazcVar4.zzB()) {
                    return;
                } else {
                    iZza = zzazcVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final void zzE(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzbba) {
            zzbba zzbbaVar = (zzbba) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzbaq("Protocol message tag had invalid wire type.");
                }
                zzazc zzazcVar = this.zza;
                int iZzo = zzazcVar.zzo();
                zzY(iZzo);
                int iZzC = zzazcVar.zzC() + iZzo;
                do {
                    zzbbaVar.zzf(zzazcVar.zzi());
                } while (zzazcVar.zzC() < iZzC);
                return;
            }
            do {
                zzazc zzazcVar2 = this.zza;
                zzbbaVar.zzf(zzazcVar2.zzi());
                if (zzazcVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zzazcVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new zzbaq("Protocol message tag had invalid wire type.");
                }
                zzazc zzazcVar3 = this.zza;
                int iZzo2 = zzazcVar3.zzo();
                zzY(iZzo2);
                int iZzC2 = zzazcVar3.zzC() + iZzo2;
                do {
                    list.add(Long.valueOf(zzazcVar3.zzi()));
                } while (zzazcVar3.zzC() < iZzC2);
                return;
            }
            do {
                zzazc zzazcVar4 = this.zza;
                list.add(Long.valueOf(zzazcVar4.zzi()));
                if (zzazcVar4.zzB()) {
                    return;
                } else {
                    iZza = zzazcVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final void zzF(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzbaf) {
            zzbaf zzbafVar = (zzbaf) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                zzazc zzazcVar = this.zza;
                int iZzo = zzazcVar.zzo();
                zzX(iZzo);
                int iZzC = zzazcVar.zzC() + iZzo;
                do {
                    zzbafVar.zzh(zzazcVar.zzj());
                } while (zzazcVar.zzC() < iZzC);
                return;
            }
            if (i10 != 5) {
                throw new zzbaq("Protocol message tag had invalid wire type.");
            }
            do {
                zzazc zzazcVar2 = this.zza;
                zzbafVar.zzh(zzazcVar2.zzj());
                if (zzazcVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zzazcVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                zzazc zzazcVar3 = this.zza;
                int iZzo2 = zzazcVar3.zzo();
                zzX(iZzo2);
                int iZzC2 = zzazcVar3.zzC() + iZzo2;
                do {
                    list.add(Integer.valueOf(zzazcVar3.zzj()));
                } while (zzazcVar3.zzC() < iZzC2);
                return;
            }
            if (i11 != 5) {
                throw new zzbaq("Protocol message tag had invalid wire type.");
            }
            do {
                zzazc zzazcVar4 = this.zza;
                list.add(Integer.valueOf(zzazcVar4.zzj()));
                if (zzazcVar4.zzB()) {
                    return;
                } else {
                    iZza = zzazcVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final void zzG(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzayr) {
            zzayr zzayrVar = (zzayr) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzbaq("Protocol message tag had invalid wire type.");
                }
                zzazc zzazcVar = this.zza;
                int iZzC = zzazcVar.zzC() + zzazcVar.zzo();
                do {
                    zzayrVar.zzf(zzazcVar.zzk());
                } while (zzazcVar.zzC() < iZzC);
                zzW(iZzC);
                return;
            }
            do {
                zzazc zzazcVar2 = this.zza;
                zzayrVar.zzf(zzazcVar2.zzk());
                if (zzazcVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zzazcVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzbaq("Protocol message tag had invalid wire type.");
                }
                zzazc zzazcVar3 = this.zza;
                int iZzC2 = zzazcVar3.zzC() + zzazcVar3.zzo();
                do {
                    list.add(Boolean.valueOf(zzazcVar3.zzk()));
                } while (zzazcVar3.zzC() < iZzC2);
                zzW(iZzC2);
                return;
            }
            do {
                zzazc zzazcVar4 = this.zza;
                list.add(Boolean.valueOf(zzazcVar4.zzk()));
                if (zzazcVar4.zzB()) {
                    return;
                } else {
                    iZza = zzazcVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    public final void zzH(List list, boolean z10) throws IOException {
        int iZza;
        int iZza2;
        if ((this.zzb & 7) != 2) {
            throw new zzbaq("Protocol message tag had invalid wire type.");
        }
        if ((list instanceof zzbax) && !z10) {
            zzbax zzbaxVar = (zzbax) list;
            do {
                zzs();
                zzbaxVar.zzb();
                zzazc zzazcVar = this.zza;
                if (zzazcVar.zzB()) {
                    return;
                } else {
                    iZza2 = zzazcVar.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            do {
                list.add(z10 ? zzn() : zzm());
                zzazc zzazcVar2 = this.zza;
                if (zzazcVar2.zzB()) {
                    return;
                } else {
                    iZza = zzazcVar2.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final void zzI(List list, zzbbz zzbbzVar, zzazp zzazpVar) throws IOException {
        int iZza;
        int i10 = this.zzb;
        if ((i10 & 7) != 2) {
            throw new zzbaq("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzT(zzbbzVar, zzazpVar));
            zzazc zzazcVar = this.zza;
            if (zzazcVar.zzB() || this.zzd != 0) {
                return;
            } else {
                iZza = zzazcVar.zza();
            }
        } while (iZza == i10);
        this.zzd = iZza;
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    @Deprecated
    public final void zzJ(List list, zzbbz zzbbzVar, zzazp zzazpVar) throws IOException {
        int iZza;
        int i10 = this.zzb;
        if ((i10 & 7) != 3) {
            throw new zzbaq("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzV(zzbbzVar, zzazpVar));
            zzazc zzazcVar = this.zza;
            if (zzazcVar.zzB() || this.zzd != 0) {
                return;
            } else {
                iZza = zzazcVar.zza();
            }
        } while (iZza == i10);
        this.zzd = iZza;
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final void zzK(List list) throws IOException {
        int iZza;
        if ((this.zzb & 7) != 2) {
            throw new zzbaq("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzs());
            zzazc zzazcVar = this.zza;
            if (zzazcVar.zzB()) {
                return;
            } else {
                iZza = zzazcVar.zza();
            }
        } while (iZza == this.zzb);
        this.zzd = iZza;
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final void zzL(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzbaf) {
            zzbaf zzbafVar = (zzbaf) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzbaq("Protocol message tag had invalid wire type.");
                }
                zzazc zzazcVar = this.zza;
                int iZzC = zzazcVar.zzC() + zzazcVar.zzo();
                do {
                    zzbafVar.zzh(zzazcVar.zzo());
                } while (zzazcVar.zzC() < iZzC);
                zzW(iZzC);
                return;
            }
            do {
                zzazc zzazcVar2 = this.zza;
                zzbafVar.zzh(zzazcVar2.zzo());
                if (zzazcVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zzazcVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzbaq("Protocol message tag had invalid wire type.");
                }
                zzazc zzazcVar3 = this.zza;
                int iZzC2 = zzazcVar3.zzC() + zzazcVar3.zzo();
                do {
                    list.add(Integer.valueOf(zzazcVar3.zzo()));
                } while (zzazcVar3.zzC() < iZzC2);
                zzW(iZzC2);
                return;
            }
            do {
                zzazc zzazcVar4 = this.zza;
                list.add(Integer.valueOf(zzazcVar4.zzo()));
                if (zzazcVar4.zzB()) {
                    return;
                } else {
                    iZza = zzazcVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final void zzM(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzbaf) {
            zzbaf zzbafVar = (zzbaf) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzbaq("Protocol message tag had invalid wire type.");
                }
                zzazc zzazcVar = this.zza;
                int iZzC = zzazcVar.zzC() + zzazcVar.zzo();
                do {
                    zzbafVar.zzh(zzazcVar.zzp());
                } while (zzazcVar.zzC() < iZzC);
                zzW(iZzC);
                return;
            }
            do {
                zzazc zzazcVar2 = this.zza;
                zzbafVar.zzh(zzazcVar2.zzp());
                if (zzazcVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zzazcVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzbaq("Protocol message tag had invalid wire type.");
                }
                zzazc zzazcVar3 = this.zza;
                int iZzC2 = zzazcVar3.zzC() + zzazcVar3.zzo();
                do {
                    list.add(Integer.valueOf(zzazcVar3.zzp()));
                } while (zzazcVar3.zzC() < iZzC2);
                zzW(iZzC2);
                return;
            }
            do {
                zzazc zzazcVar4 = this.zza;
                list.add(Integer.valueOf(zzazcVar4.zzp()));
                if (zzazcVar4.zzB()) {
                    return;
                } else {
                    iZza = zzazcVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final void zzN(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzbaf) {
            zzbaf zzbafVar = (zzbaf) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                zzazc zzazcVar = this.zza;
                int iZzo = zzazcVar.zzo();
                zzX(iZzo);
                int iZzC = zzazcVar.zzC() + iZzo;
                do {
                    zzbafVar.zzh(zzazcVar.zzq());
                } while (zzazcVar.zzC() < iZzC);
                return;
            }
            if (i10 != 5) {
                throw new zzbaq("Protocol message tag had invalid wire type.");
            }
            do {
                zzazc zzazcVar2 = this.zza;
                zzbafVar.zzh(zzazcVar2.zzq());
                if (zzazcVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zzazcVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                zzazc zzazcVar3 = this.zza;
                int iZzo2 = zzazcVar3.zzo();
                zzX(iZzo2);
                int iZzC2 = zzazcVar3.zzC() + iZzo2;
                do {
                    list.add(Integer.valueOf(zzazcVar3.zzq()));
                } while (zzazcVar3.zzC() < iZzC2);
                return;
            }
            if (i11 != 5) {
                throw new zzbaq("Protocol message tag had invalid wire type.");
            }
            do {
                zzazc zzazcVar4 = this.zza;
                list.add(Integer.valueOf(zzazcVar4.zzq()));
                if (zzazcVar4.zzB()) {
                    return;
                } else {
                    iZza = zzazcVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final void zzO(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzbba) {
            zzbba zzbbaVar = (zzbba) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzbaq("Protocol message tag had invalid wire type.");
                }
                zzazc zzazcVar = this.zza;
                int iZzo = zzazcVar.zzo();
                zzY(iZzo);
                int iZzC = zzazcVar.zzC() + iZzo;
                do {
                    zzbbaVar.zzf(zzazcVar.zzr());
                } while (zzazcVar.zzC() < iZzC);
                return;
            }
            do {
                zzazc zzazcVar2 = this.zza;
                zzbbaVar.zzf(zzazcVar2.zzr());
                if (zzazcVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zzazcVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new zzbaq("Protocol message tag had invalid wire type.");
                }
                zzazc zzazcVar3 = this.zza;
                int iZzo2 = zzazcVar3.zzo();
                zzY(iZzo2);
                int iZzC2 = zzazcVar3.zzC() + iZzo2;
                do {
                    list.add(Long.valueOf(zzazcVar3.zzr()));
                } while (zzazcVar3.zzC() < iZzC2);
                return;
            }
            do {
                zzazc zzazcVar4 = this.zza;
                list.add(Long.valueOf(zzazcVar4.zzr()));
                if (zzazcVar4.zzB()) {
                    return;
                } else {
                    iZza = zzazcVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final void zzP(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzbaf) {
            zzbaf zzbafVar = (zzbaf) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzbaq("Protocol message tag had invalid wire type.");
                }
                zzazc zzazcVar = this.zza;
                int iZzC = zzazcVar.zzC() + zzazcVar.zzo();
                do {
                    zzbafVar.zzh(zzazcVar.zzs());
                } while (zzazcVar.zzC() < iZzC);
                zzW(iZzC);
                return;
            }
            do {
                zzazc zzazcVar2 = this.zza;
                zzbafVar.zzh(zzazcVar2.zzs());
                if (zzazcVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zzazcVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzbaq("Protocol message tag had invalid wire type.");
                }
                zzazc zzazcVar3 = this.zza;
                int iZzC2 = zzazcVar3.zzC() + zzazcVar3.zzo();
                do {
                    list.add(Integer.valueOf(zzazcVar3.zzs()));
                } while (zzazcVar3.zzC() < iZzC2);
                zzW(iZzC2);
                return;
            }
            do {
                zzazc zzazcVar4 = this.zza;
                list.add(Integer.valueOf(zzazcVar4.zzs()));
                if (zzazcVar4.zzB()) {
                    return;
                } else {
                    iZza = zzazcVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final void zzQ(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzbba) {
            zzbba zzbbaVar = (zzbba) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzbaq("Protocol message tag had invalid wire type.");
                }
                zzazc zzazcVar = this.zza;
                int iZzC = zzazcVar.zzC() + zzazcVar.zzo();
                do {
                    zzbbaVar.zzf(zzazcVar.zzt());
                } while (zzazcVar.zzC() < iZzC);
                zzW(iZzC);
                return;
            }
            do {
                zzazc zzazcVar2 = this.zza;
                zzbbaVar.zzf(zzazcVar2.zzt());
                if (zzazcVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zzazcVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzbaq("Protocol message tag had invalid wire type.");
                }
                zzazc zzazcVar3 = this.zza;
                int iZzC2 = zzazcVar3.zzC() + zzazcVar3.zzo();
                do {
                    list.add(Long.valueOf(zzazcVar3.zzt()));
                } while (zzazcVar3.zzC() < iZzC2);
                zzW(iZzC2);
                return;
            }
            do {
                zzazc zzazcVar4 = this.zza;
                list.add(Long.valueOf(zzazcVar4.zzt()));
                if (zzazcVar4.zzB()) {
                    return;
                } else {
                    iZza = zzazcVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final int zzb() throws IOException {
        int iZza = this.zzd;
        if (iZza != 0) {
            this.zzb = iZza;
            this.zzd = 0;
        } else {
            iZza = this.zza.zza();
            this.zzb = iZza;
        }
        return (iZza == 0 || iZza == this.zzc) ? a.e.API_PRIORITY_OTHER : iZza >>> 3;
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final boolean zzd() throws IOException {
        int i10;
        zzazc zzazcVar = this.zza;
        if (zzazcVar.zzB() || (i10 = this.zzb) == this.zzc) {
            return false;
        }
        return zzazcVar.zzc(i10);
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    public final void zzz(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzazk) {
            zzazk zzazkVar = (zzazk) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzbaq("Protocol message tag had invalid wire type.");
                }
                zzazc zzazcVar = this.zza;
                int iZzo = zzazcVar.zzo();
                zzY(iZzo);
                int iZzC = zzazcVar.zzC() + iZzo;
                do {
                    zzazkVar.zzf(zzazcVar.zzd());
                } while (zzazcVar.zzC() < iZzC);
                return;
            }
            do {
                zzazc zzazcVar2 = this.zza;
                zzazkVar.zzf(zzazcVar2.zzd());
                if (zzazcVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zzazcVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new zzbaq("Protocol message tag had invalid wire type.");
                }
                zzazc zzazcVar3 = this.zza;
                int iZzo2 = zzazcVar3.zzo();
                zzY(iZzo2);
                int iZzC2 = zzazcVar3.zzC() + iZzo2;
                do {
                    list.add(Double.valueOf(zzazcVar3.zzd()));
                } while (zzazcVar3.zzC() < iZzC2);
                return;
            }
            do {
                zzazc zzazcVar4 = this.zza;
                list.add(Double.valueOf(zzazcVar4.zzd()));
                if (zzazcVar4.zzB()) {
                    return;
                } else {
                    iZza = zzazcVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    private zzazd(zzazc zzazcVar) {
        byte[] bArr = zzbap.zzb;
        this.zza = zzazcVar;
        zzazcVar.zze = this;
    }

    private final Object zzT(zzbbz zzbbzVar, zzazp zzazpVar) throws IOException {
        Object objZza = zzbbzVar.zza();
        zzS(objZza, zzbbzVar, zzazpVar);
        zzbbzVar.zzh(objZza);
        return objZza;
    }

    private final Object zzV(zzbbz zzbbzVar, zzazp zzazpVar) throws IOException {
        Object objZza = zzbbzVar.zza();
        zzU(objZza, zzbbzVar, zzazpVar);
        zzbbzVar.zzh(objZza);
        return objZza;
    }
}
