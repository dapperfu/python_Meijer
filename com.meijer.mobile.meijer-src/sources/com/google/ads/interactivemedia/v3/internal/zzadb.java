package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.util.List;

/* loaded from: classes4.dex */
final class zzadb implements zzafl {
    private final zzada zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final boolean zzN() throws IOException {
        zzR(0);
        return this.zza.zzB();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final double zza() throws IOException {
        zzR(1);
        return this.zza.zza();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final float zzb() throws IOException {
        zzR(5);
        return this.zza.zzb();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final int zze() throws IOException {
        zzR(0);
        return this.zza.zze();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final int zzf() throws IOException {
        zzR(5);
        return this.zza.zzf();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final int zzg() throws IOException {
        zzR(0);
        return this.zza.zzg();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final int zzh() throws IOException {
        zzR(5);
        return this.zza.zzj();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final int zzi() throws IOException {
        zzR(0);
        return this.zza.zzk();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final int zzj() throws IOException {
        zzR(0);
        return this.zza.zzm();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final long zzk() throws IOException {
        zzR(1);
        return this.zza.zzn();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final long zzl() throws IOException {
        zzR(0);
        return this.zza.zzo();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final long zzm() throws IOException {
        zzR(1);
        return this.zza.zzs();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final long zzn() throws IOException {
        zzR(0);
        return this.zza.zzt();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final long zzo() throws IOException {
        zzR(0);
        return this.zza.zzu();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final zzacw zzp() throws IOException {
        zzR(2);
        return this.zza.zzv();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final String zzr() throws IOException {
        zzR(2);
        return this.zza.zzw();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final String zzs() throws IOException {
        zzR(2);
        return this.zza.zzx();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final void zzt(Object obj, zzaft zzaftVar, zzadk zzadkVar) throws IOException {
        zzR(3);
        zzO(obj, zzaftVar, zzadkVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final void zzu(Object obj, zzaft zzaftVar, zzadk zzadkVar) throws IOException {
        zzR(2);
        zzP(obj, zzaftVar, zzadkVar);
    }

    private final void zzO(Object obj, zzaft zzaftVar, zzadk zzadkVar) throws IOException {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzaftVar.zzh(obj, this, zzadkVar);
            if (this.zzb == this.zzc) {
            } else {
                throw new zzaeg("Failed to parse the message.");
            }
        } finally {
            this.zzc = i10;
        }
    }

    private final void zzP(Object obj, zzaft zzaftVar, zzadk zzadkVar) throws IOException {
        zzada zzadaVar = this.zza;
        int iZzm = zzadaVar.zzm();
        if (zzadaVar.zza >= zzadaVar.zzb) {
            throw new zzaeg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iZzd = zzadaVar.zzd(iZzm);
        this.zza.zza++;
        zzaftVar.zzh(obj, this, zzadkVar);
        this.zza.zzy(0);
        r5.zza--;
        this.zza.zzz(iZzd);
    }

    private final void zzQ(int i10) throws IOException {
        if (this.zza.zzc() != i10) {
            throw new zzaeg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void zzR(int i10) throws IOException {
        if ((this.zzb & 7) != i10) {
            throw new zzaef("Protocol message tag had invalid wire type.");
        }
    }

    private static final void zzS(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw new zzaeg("Failed to parse the message.");
        }
    }

    private static final void zzT(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw new zzaeg("Failed to parse the message.");
        }
    }

    public static zzadb zzq(zzada zzadaVar) {
        zzadb zzadbVar = zzadaVar.zzc;
        return zzadbVar != null ? zzadbVar : new zzadb(zzadaVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final void zzA(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzaeq) {
            zzaeq zzaeqVar = (zzaeq) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzaef("Protocol message tag had invalid wire type.");
                }
                int iZzm = this.zza.zzm();
                zzT(iZzm);
                int iZzc = iZzm + this.zza.zzc();
                do {
                    zzaeqVar.zzf(this.zza.zzn());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            do {
                zzaeqVar.zzf(this.zza.zzn());
                zzada zzadaVar = this.zza;
                if (zzadaVar.zzA()) {
                    return;
                } else {
                    iZzl2 = zzadaVar.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new zzaef("Protocol message tag had invalid wire type.");
                }
                int iZzm2 = this.zza.zzm();
                zzT(iZzm2);
                int iZzc2 = iZzm2 + this.zza.zzc();
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzn()));
                zzada zzadaVar2 = this.zza;
                if (zzadaVar2.zzA()) {
                    return;
                } else {
                    iZzl = zzadaVar2.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final void zzB(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzadr) {
            zzadr zzadrVar = (zzadr) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int iZzm = this.zza.zzm();
                zzS(iZzm);
                int iZzc = this.zza.zzc() + iZzm;
                do {
                    zzadrVar.zzf(this.zza.zzb());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i10 != 5) {
                throw new zzaef("Protocol message tag had invalid wire type.");
            }
            do {
                zzadrVar.zzf(this.zza.zzb());
                zzada zzadaVar = this.zza;
                if (zzadaVar.zzA()) {
                    return;
                } else {
                    iZzl2 = zzadaVar.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int iZzm2 = this.zza.zzm();
                zzS(iZzm2);
                int iZzc2 = this.zza.zzc() + iZzm2;
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            if (i11 != 5) {
                throw new zzaef("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Float.valueOf(this.zza.zzb()));
                zzada zzadaVar2 = this.zza;
                if (zzadaVar2.zzA()) {
                    return;
                } else {
                    iZzl = zzadaVar2.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    @Deprecated
    public final void zzC(List list, zzaft zzaftVar, zzadk zzadkVar) throws IOException {
        int iZzl;
        int i10 = this.zzb;
        if ((i10 & 7) != 3) {
            throw new zzaef("Protocol message tag had invalid wire type.");
        }
        do {
            Object objZze = zzaftVar.zze();
            zzO(objZze, zzaftVar, zzadkVar);
            zzaftVar.zzf(objZze);
            list.add(objZze);
            zzada zzadaVar = this.zza;
            if (zzadaVar.zzA() || this.zzd != 0) {
                return;
            } else {
                iZzl = zzadaVar.zzl();
            }
        } while (iZzl == i10);
        this.zzd = iZzl;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final void zzD(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzadz) {
            zzadz zzadzVar = (zzadz) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzaef("Protocol message tag had invalid wire type.");
                }
                zzada zzadaVar = this.zza;
                int iZzc = zzadaVar.zzc() + zzadaVar.zzm();
                do {
                    zzadzVar.zzg(this.zza.zzg());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzadzVar.zzg(this.zza.zzg());
                zzada zzadaVar2 = this.zza;
                if (zzadaVar2.zzA()) {
                    return;
                } else {
                    iZzl2 = zzadaVar2.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzaef("Protocol message tag had invalid wire type.");
                }
                zzada zzadaVar3 = this.zza;
                int iZzc2 = zzadaVar3.zzc() + zzadaVar3.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                zzada zzadaVar4 = this.zza;
                if (zzadaVar4.zzA()) {
                    return;
                } else {
                    iZzl = zzadaVar4.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final void zzE(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzaeq) {
            zzaeq zzaeqVar = (zzaeq) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzaef("Protocol message tag had invalid wire type.");
                }
                zzada zzadaVar = this.zza;
                int iZzc = zzadaVar.zzc() + zzadaVar.zzm();
                do {
                    zzaeqVar.zzf(this.zza.zzo());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzaeqVar.zzf(this.zza.zzo());
                zzada zzadaVar2 = this.zza;
                if (zzadaVar2.zzA()) {
                    return;
                } else {
                    iZzl2 = zzadaVar2.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzaef("Protocol message tag had invalid wire type.");
                }
                zzada zzadaVar3 = this.zza;
                int iZzc2 = zzadaVar3.zzc() + zzadaVar3.zzm();
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                zzada zzadaVar4 = this.zza;
                if (zzadaVar4.zzA()) {
                    return;
                } else {
                    iZzl = zzadaVar4.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final void zzF(List list, zzaft zzaftVar, zzadk zzadkVar) throws IOException {
        int iZzl;
        int i10 = this.zzb;
        if ((i10 & 7) != 2) {
            throw new zzaef("Protocol message tag had invalid wire type.");
        }
        do {
            Object objZze = zzaftVar.zze();
            zzP(objZze, zzaftVar, zzadkVar);
            zzaftVar.zzf(objZze);
            list.add(objZze);
            zzada zzadaVar = this.zza;
            if (zzadaVar.zzA() || this.zzd != 0) {
                return;
            } else {
                iZzl = zzadaVar.zzl();
            }
        } while (iZzl == i10);
        this.zzd = iZzl;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final void zzG(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzadz) {
            zzadz zzadzVar = (zzadz) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int iZzm = this.zza.zzm();
                zzS(iZzm);
                int iZzc = this.zza.zzc() + iZzm;
                do {
                    zzadzVar.zzg(this.zza.zzj());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i10 != 5) {
                throw new zzaef("Protocol message tag had invalid wire type.");
            }
            do {
                zzadzVar.zzg(this.zza.zzj());
                zzada zzadaVar = this.zza;
                if (zzadaVar.zzA()) {
                    return;
                } else {
                    iZzl2 = zzadaVar.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int iZzm2 = this.zza.zzm();
                zzS(iZzm2);
                int iZzc2 = this.zza.zzc() + iZzm2;
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            if (i11 != 5) {
                throw new zzaef("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
                zzada zzadaVar2 = this.zza;
                if (zzadaVar2.zzA()) {
                    return;
                } else {
                    iZzl = zzadaVar2.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final void zzH(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzaeq) {
            zzaeq zzaeqVar = (zzaeq) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzaef("Protocol message tag had invalid wire type.");
                }
                int iZzm = this.zza.zzm();
                zzT(iZzm);
                int iZzc = iZzm + this.zza.zzc();
                do {
                    zzaeqVar.zzf(this.zza.zzs());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            do {
                zzaeqVar.zzf(this.zza.zzs());
                zzada zzadaVar = this.zza;
                if (zzadaVar.zzA()) {
                    return;
                } else {
                    iZzl2 = zzadaVar.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new zzaef("Protocol message tag had invalid wire type.");
                }
                int iZzm2 = this.zza.zzm();
                zzT(iZzm2);
                int iZzc2 = iZzm2 + this.zza.zzc();
                do {
                    list.add(Long.valueOf(this.zza.zzs()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzs()));
                zzada zzadaVar2 = this.zza;
                if (zzadaVar2.zzA()) {
                    return;
                } else {
                    iZzl = zzadaVar2.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final void zzI(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzadz) {
            zzadz zzadzVar = (zzadz) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzaef("Protocol message tag had invalid wire type.");
                }
                zzada zzadaVar = this.zza;
                int iZzc = zzadaVar.zzc() + zzadaVar.zzm();
                do {
                    zzadzVar.zzg(this.zza.zzk());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzadzVar.zzg(this.zza.zzk());
                zzada zzadaVar2 = this.zza;
                if (zzadaVar2.zzA()) {
                    return;
                } else {
                    iZzl2 = zzadaVar2.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzaef("Protocol message tag had invalid wire type.");
                }
                zzada zzadaVar3 = this.zza;
                int iZzc2 = zzadaVar3.zzc() + zzadaVar3.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                zzada zzadaVar4 = this.zza;
                if (zzadaVar4.zzA()) {
                    return;
                } else {
                    iZzl = zzadaVar4.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final void zzJ(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzaeq) {
            zzaeq zzaeqVar = (zzaeq) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzaef("Protocol message tag had invalid wire type.");
                }
                zzada zzadaVar = this.zza;
                int iZzc = zzadaVar.zzc() + zzadaVar.zzm();
                do {
                    zzaeqVar.zzf(this.zza.zzt());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzaeqVar.zzf(this.zza.zzt());
                zzada zzadaVar2 = this.zza;
                if (zzadaVar2.zzA()) {
                    return;
                } else {
                    iZzl2 = zzadaVar2.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzaef("Protocol message tag had invalid wire type.");
                }
                zzada zzadaVar3 = this.zza;
                int iZzc2 = zzadaVar3.zzc() + zzadaVar3.zzm();
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzt()));
                zzada zzadaVar4 = this.zza;
                if (zzadaVar4.zzA()) {
                    return;
                } else {
                    iZzl = zzadaVar4.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    public final void zzK(List list, boolean z10) throws IOException {
        int iZzl;
        int iZzl2;
        if ((this.zzb & 7) != 2) {
            throw new zzaef("Protocol message tag had invalid wire type.");
        }
        if ((list instanceof zzaen) && !z10) {
            zzaen zzaenVar = (zzaen) list;
            do {
                zzp();
                zzaenVar.zza();
                zzada zzadaVar = this.zza;
                if (zzadaVar.zzA()) {
                    return;
                } else {
                    iZzl2 = zzadaVar.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            do {
                list.add(z10 ? zzs() : zzr());
                zzada zzadaVar2 = this.zza;
                if (zzadaVar2.zzA()) {
                    return;
                } else {
                    iZzl = zzadaVar2.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final void zzL(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzadz) {
            zzadz zzadzVar = (zzadz) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzaef("Protocol message tag had invalid wire type.");
                }
                zzada zzadaVar = this.zza;
                int iZzc = zzadaVar.zzc() + zzadaVar.zzm();
                do {
                    zzadzVar.zzg(this.zza.zzm());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzadzVar.zzg(this.zza.zzm());
                zzada zzadaVar2 = this.zza;
                if (zzadaVar2.zzA()) {
                    return;
                } else {
                    iZzl2 = zzadaVar2.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzaef("Protocol message tag had invalid wire type.");
                }
                zzada zzadaVar3 = this.zza;
                int iZzc2 = zzadaVar3.zzc() + zzadaVar3.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zzm()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzm()));
                zzada zzadaVar4 = this.zza;
                if (zzadaVar4.zzA()) {
                    return;
                } else {
                    iZzl = zzadaVar4.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final void zzM(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzaeq) {
            zzaeq zzaeqVar = (zzaeq) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzaef("Protocol message tag had invalid wire type.");
                }
                zzada zzadaVar = this.zza;
                int iZzc = zzadaVar.zzc() + zzadaVar.zzm();
                do {
                    zzaeqVar.zzf(this.zza.zzu());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzaeqVar.zzf(this.zza.zzu());
                zzada zzadaVar2 = this.zza;
                if (zzadaVar2.zzA()) {
                    return;
                } else {
                    iZzl2 = zzadaVar2.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzaef("Protocol message tag had invalid wire type.");
                }
                zzada zzadaVar3 = this.zza;
                int iZzc2 = zzadaVar3.zzc() + zzadaVar3.zzm();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzu()));
                zzada zzadaVar4 = this.zza;
                if (zzadaVar4.zzA()) {
                    return;
                } else {
                    iZzl = zzadaVar4.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final int zzc() throws IOException {
        int iZzl = this.zzd;
        if (iZzl != 0) {
            this.zzb = iZzl;
            this.zzd = 0;
        } else {
            iZzl = this.zza.zzl();
            this.zzb = iZzl;
        }
        return (iZzl == 0 || iZzl == this.zzc) ? a.e.API_PRIORITY_OTHER : iZzl >>> 3;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final void zzv(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzacn) {
            zzacn zzacnVar = (zzacn) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzaef("Protocol message tag had invalid wire type.");
                }
                zzada zzadaVar = this.zza;
                int iZzc = zzadaVar.zzc() + zzadaVar.zzm();
                do {
                    zzacnVar.zze(this.zza.zzB());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzacnVar.zze(this.zza.zzB());
                zzada zzadaVar2 = this.zza;
                if (zzadaVar2.zzA()) {
                    return;
                } else {
                    iZzl2 = zzadaVar2.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzaef("Protocol message tag had invalid wire type.");
                }
                zzada zzadaVar3 = this.zza;
                int iZzc2 = zzadaVar3.zzc() + zzadaVar3.zzm();
                do {
                    list.add(Boolean.valueOf(this.zza.zzB()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzB()));
                zzada zzadaVar4 = this.zza;
                if (zzadaVar4.zzA()) {
                    return;
                } else {
                    iZzl = zzadaVar4.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final void zzw(List list) throws IOException {
        int iZzl;
        if ((this.zzb & 7) != 2) {
            throw new zzaef("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzp());
            zzada zzadaVar = this.zza;
            if (zzadaVar.zzA()) {
                return;
            } else {
                iZzl = zzadaVar.zzl();
            }
        } while (iZzl == this.zzb);
        this.zzd = iZzl;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final void zzx(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzadh) {
            zzadh zzadhVar = (zzadh) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzaef("Protocol message tag had invalid wire type.");
                }
                int iZzm = this.zza.zzm();
                zzT(iZzm);
                int iZzc = iZzm + this.zza.zzc();
                do {
                    zzadhVar.zzf(this.zza.zza());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            do {
                zzadhVar.zzf(this.zza.zza());
                zzada zzadaVar = this.zza;
                if (zzadaVar.zzA()) {
                    return;
                } else {
                    iZzl2 = zzadaVar.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new zzaef("Protocol message tag had invalid wire type.");
                }
                int iZzm2 = this.zza.zzm();
                zzT(iZzm2);
                int iZzc2 = iZzm2 + this.zza.zzc();
                do {
                    list.add(Double.valueOf(this.zza.zza()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            do {
                list.add(Double.valueOf(this.zza.zza()));
                zzada zzadaVar2 = this.zza;
                if (zzadaVar2.zzA()) {
                    return;
                } else {
                    iZzl = zzadaVar2.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final void zzy(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzadz) {
            zzadz zzadzVar = (zzadz) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzaef("Protocol message tag had invalid wire type.");
                }
                zzada zzadaVar = this.zza;
                int iZzc = zzadaVar.zzc() + zzadaVar.zzm();
                do {
                    zzadzVar.zzg(this.zza.zze());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzadzVar.zzg(this.zza.zze());
                zzada zzadaVar2 = this.zza;
                if (zzadaVar2.zzA()) {
                    return;
                } else {
                    iZzl2 = zzadaVar2.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzaef("Protocol message tag had invalid wire type.");
                }
                zzada zzadaVar3 = this.zza;
                int iZzc2 = zzadaVar3.zzc() + zzadaVar3.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zze()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                zzada zzadaVar4 = this.zza;
                if (zzadaVar4.zzA()) {
                    return;
                } else {
                    iZzl = zzadaVar4.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafl
    public final void zzz(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzadz) {
            zzadz zzadzVar = (zzadz) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int iZzm = this.zza.zzm();
                zzS(iZzm);
                int iZzc = this.zza.zzc() + iZzm;
                do {
                    zzadzVar.zzg(this.zza.zzf());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i10 != 5) {
                throw new zzaef("Protocol message tag had invalid wire type.");
            }
            do {
                zzadzVar.zzg(this.zza.zzf());
                zzada zzadaVar = this.zza;
                if (zzadaVar.zzA()) {
                    return;
                } else {
                    iZzl2 = zzadaVar.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int iZzm2 = this.zza.zzm();
                zzS(iZzm2);
                int iZzc2 = this.zza.zzc() + iZzm2;
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            if (i11 != 5) {
                throw new zzaef("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                zzada zzadaVar2 = this.zza;
                if (zzadaVar2.zzA()) {
                    return;
                } else {
                    iZzl = zzadaVar2.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    private zzadb(zzada zzadaVar) {
        byte[] bArr = zzaee.zzb;
        this.zza = zzadaVar;
        zzadaVar.zzc = this;
    }
}
