package com.google.android.libraries.places.internal;

import Be.p;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* loaded from: classes6.dex */
public abstract class zzbpi extends zzbkl {
    private static final zzbhg zza;
    private static final zzbil zzb;
    private zzbjv zzc;
    private zzbip zzd;
    private Charset zze;
    private boolean zzf;

    protected abstract void zzz(zzbjv zzbjvVar, boolean z10, zzbip zzbipVar);

    static {
        zzbph zzbphVar = new zzbph();
        zza = zzbphVar;
        zzb = zzbhh.zza(":status", zzbphVar);
    }

    private static Charset zzF(zzbip zzbipVar) {
        String str = (String) zzbipVar.zzb(zzbpf.zzg);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return StandardCharsets.UTF_8;
    }

    private static void zzG(zzbip zzbipVar) {
        zzbipVar.zzd(zzb);
        zzbipVar.zzd(zzbhj.zzb);
        zzbipVar.zzd(zzbhj.zza);
    }

    private static final zzbjv zzH(zzbip zzbipVar) {
        char cCharAt;
        Integer num = (Integer) zzbipVar.zzb(zzb);
        if (num == null) {
            return zzbjv.zzh.zze("Missing HTTP status code");
        }
        String str = (String) zzbipVar.zzb(zzbpf.zzg);
        if (str != null && str.length() >= 16) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';')) {
                return null;
            }
        }
        return zzbpf.zza(num.intValue()).zzf("invalid content-type: ".concat(String.valueOf(str)));
    }

    protected final void zzA(zzbip zzbipVar) {
        p.r(zzbipVar, "headers");
        zzbjv zzbjvVar = this.zzc;
        if (zzbjvVar != null) {
            this.zzc = zzbjvVar.zzf("headers: ".concat(zzbipVar.toString()));
            return;
        }
        try {
            if (this.zzf) {
                this.zzc = zzbjv.zzh.zze("Received headers twice");
            } else {
                Integer num = (Integer) zzbipVar.zzb(zzb);
                if (num == null || num.intValue() < 100 || num.intValue() >= 200) {
                    this.zzf = true;
                    zzbjv zzbjvVarZzH = zzH(zzbipVar);
                    this.zzc = zzbjvVarZzH;
                    if (zzbjvVarZzH != null) {
                        this.zzc = zzbjvVarZzH.zzf("headers: ".concat(zzbipVar.toString()));
                        this.zzd = zzbipVar;
                        this.zze = zzF(zzbipVar);
                        return;
                    }
                    zzG(zzbipVar);
                    zzd(zzbipVar);
                }
            }
            zzbjv zzbjvVar2 = this.zzc;
            if (zzbjvVar2 != null) {
                this.zzc = zzbjvVar2.zzf("headers: ".concat(zzbipVar.toString()));
                this.zzd = zzbipVar;
                this.zze = zzF(zzbipVar);
            }
        } catch (Throwable th2) {
            zzbjv zzbjvVar3 = this.zzc;
            if (zzbjvVar3 != null) {
                this.zzc = zzbjvVar3.zzf("headers: ".concat(zzbipVar.toString()));
                this.zzd = zzbipVar;
                this.zze = zzF(zzbipVar);
            }
            throw th2;
        }
    }

    protected final void zzB(zzbtu zzbtuVar, boolean z10) {
        zzbjv zzbjvVar = this.zzc;
        if (zzbjvVar != null) {
            Charset charset = this.zze;
            int i10 = zzbtx.zza;
            p.r(charset, "charset");
            p.r(zzbtuVar, "buffer");
            int iZzf = zzbtuVar.zzf();
            byte[] bArr = new byte[iZzf];
            zzbtuVar.zzi(bArr, 0, iZzf);
            this.zzc = zzbjvVar.zzf("DATA-----------------------------\n".concat(new String(bArr, charset)));
            zzbtuVar.close();
            if (this.zzc.zzh().length() > 1000 || z10) {
                zzz(this.zzc, false, this.zzd);
                return;
            }
            return;
        }
        if (!this.zzf) {
            zzbtuVar.close();
            zzz(zzbjv.zzh.zze("headers not received before payload"), false, new zzbip());
            return;
        }
        int iZzf2 = zzbtuVar.zzf();
        zze(zzbtuVar);
        if (z10) {
            if (iZzf2 > 0) {
                this.zzc = zzbjv.zzh.zze("Received unexpected EOS on non-empty DATA frame from server");
            } else {
                this.zzc = zzbjv.zzh.zze("Received unexpected EOS on empty DATA frame from server");
            }
            zzbip zzbipVar = new zzbip();
            this.zzd = zzbipVar;
            zzg(this.zzc, zzbls.PROCESSED, false, zzbipVar);
        }
    }

    protected final void zzC(zzbip zzbipVar) {
        zzbjv zzbjvVarZzf;
        p.r(zzbipVar, "trailers");
        zzbjv zzbjvVarZzH = this.zzc;
        if (zzbjvVarZzH == null && !this.zzf) {
            zzbjvVarZzH = zzH(zzbipVar);
            this.zzc = zzbjvVarZzH;
            if (zzbjvVarZzH != null) {
                this.zzd = zzbipVar;
            }
        }
        if (zzbjvVarZzH != null) {
            zzbjv zzbjvVarZzf2 = zzbjvVarZzH.zzf("trailers: ".concat(zzbipVar.toString()));
            this.zzc = zzbjvVarZzf2;
            zzz(zzbjvVarZzf2, false, this.zzd);
            return;
        }
        zzbjv zzbjvVar = (zzbjv) zzbipVar.zzb(zzbhj.zzb);
        if (zzbjvVar != null) {
            zzbjvVarZzf = zzbjvVar.zze((String) zzbipVar.zzb(zzbhj.zza));
        } else if (this.zzf) {
            zzbjvVarZzf = zzbjv.zzc.zze("missing GRPC status in response");
        } else {
            Integer num = (Integer) zzbipVar.zzb(zzb);
            zzbjvVarZzf = (num != null ? zzbpf.zza(num.intValue()) : zzbjv.zzh.zze("missing HTTP status code")).zzf("missing GRPC status, inferred error from HTTP status code");
        }
        zzG(zzbipVar);
        zzf(zzbipVar, zzbjvVarZzf);
    }

    protected zzbpi(int i10, zzbwg zzbwgVar, zzbwp zzbwpVar, zzbfd zzbfdVar) {
        super(i10, zzbwgVar, zzbwpVar, zzbfdVar);
        this.zze = StandardCharsets.UTF_8;
    }
}
