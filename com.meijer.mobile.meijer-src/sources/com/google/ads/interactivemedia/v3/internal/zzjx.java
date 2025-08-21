package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class zzjx extends zzkx {
    private static final zzky zzh = new zzky();
    private final zzai zzi;
    private final Context zzj;
    private final zzgq zzk;

    protected final String zzb() throws PackageManager.NameNotFoundException, CertificateException {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] bArrZzf = zzjm.zzf((String) zzls.zzc().zza(zzmj.zzf));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzf)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzjm.zzf((String) zzls.zzc().zza(zzmj.zzg)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zza.zzk();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final zzvd zzvdVarZzs = zzvd.zzs();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.ads.interactivemedia.v3.internal.zzkz
                public final void onChecksumsReady(List list) {
                    zzvd zzvdVar = zzvdVarZzs;
                    if (list == null) {
                        zzvdVar.zzc(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ApkChecksum apkChecksumA = a.a(list.get(i10));
                            if (apkChecksumA.getType() == 8) {
                                zzvdVar.zzc(zzjm.zzb(apkChecksumA.getValue()));
                                return;
                            }
                        }
                        zzvdVar.zzc(null);
                    } catch (Throwable unused) {
                        zzvdVar.zzc(null);
                    }
                }
            });
            return (String) zzvdVarZzs.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    public zzjx(zzjj zzjjVar, String str, String str2, zzan zzanVar, int i10, int i11, Context context, zzy zzyVar, zzai zzaiVar, zzgq zzgqVar) {
        super(zzjjVar, "tJmUdMX6gqvtYlGKWrIbrrzb8XPfGATZoLaUzDKGLsbQDYlTX2kjiVwbkwxCBzrp", "/TGj8+Sp8IdKBz9y8bC3H0KHpnJRg9DGCA85aF22WXc=", zzanVar, i10, 27);
        this.zzj = context;
        this.zzi = zzaiVar;
        this.zzk = zzgqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.ads.interactivemedia.v3.internal.zzgm zzc() throws java.util.concurrent.ExecutionException, java.lang.IllegalAccessException, java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.lang.reflect.InvocationTargetException {
        /*
            r7 = this;
            com.google.ads.interactivemedia.v3.internal.zzma r0 = com.google.ads.interactivemedia.v3.internal.zzmj.zzq
            com.google.ads.interactivemedia.v3.internal.zzmh r1 = com.google.ads.interactivemedia.v3.internal.zzls.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "E"
            if (r0 == 0) goto L25
            com.google.ads.interactivemedia.v3.internal.zzma r0 = com.google.ads.interactivemedia.v3.internal.zzmj.zzr
            com.google.ads.interactivemedia.v3.internal.zzmh r2 = com.google.ads.interactivemedia.v3.internal.zzls.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L2b
        L25:
            com.google.ads.interactivemedia.v3.internal.zzai r0 = r7.zzi
            int r0 = r0.zza()
        L2b:
            java.lang.reflect.Method r2 = r7.zze
            android.content.Context r3 = r7.zzj
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            java.lang.String r5 = ""
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5}
            r4 = 0
            java.lang.Object r2 = r2.invoke(r4, r3)
            java.lang.String r2 = (java.lang.String) r2
            com.google.ads.interactivemedia.v3.internal.zzgm r3 = new com.google.ads.interactivemedia.v3.internal.zzgm
            r3.<init>(r2)
            com.google.ads.interactivemedia.v3.internal.zzjj r2 = r7.zza     // Catch: java.lang.Throwable -> L8c
            boolean r2 = r2.zzp()     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L8c
            com.google.ads.interactivemedia.v3.internal.zzjj r2 = r7.zza     // Catch: java.lang.Throwable -> L8c
            java.util.concurrent.Future r2 = r2.zzl()     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L8c
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L8c
            r4 = 31
            if (r2 < r4) goto L65
            com.google.ads.interactivemedia.v3.internal.zzjj r2 = r7.zza     // Catch: java.lang.Throwable -> L8c
            java.util.concurrent.Future r2 = r2.zzl()     // Catch: java.lang.Throwable -> L8c
            boolean r2 = r2.isDone()     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L8c
        L65:
            com.google.ads.interactivemedia.v3.internal.zzai r2 = r7.zzi     // Catch: java.lang.Throwable -> L8c
            boolean r2 = r2.zzg()     // Catch: java.lang.Throwable -> L8c
            if (r2 != 0) goto L8c
            com.google.ads.interactivemedia.v3.internal.zzjj r2 = r7.zza     // Catch: java.lang.Throwable -> L8c
            java.util.concurrent.Future r2 = r2.zzl()     // Catch: java.lang.Throwable -> L8c
            long r4 = (long) r0     // Catch: java.lang.Throwable -> L8c
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L8c
            r2.get(r4, r6)     // Catch: java.lang.Throwable -> L8c
            com.google.ads.interactivemedia.v3.internal.zzjj r2 = r7.zza     // Catch: java.lang.Throwable -> L8c
            com.google.ads.interactivemedia.v3.internal.zzbp r2 = r2.zzc()     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L8c
            boolean r4 = r2.zzaj()     // Catch: java.lang.Throwable -> L8c
            if (r4 == 0) goto L8c
            java.lang.String r2 = r2.zzg()     // Catch: java.lang.Throwable -> L8c
            goto L8d
        L8c:
            r2 = r1
        L8d:
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto Laa
            com.google.ads.interactivemedia.v3.internal.zzgq r1 = r7.zzk     // Catch: java.lang.Throwable -> Laa
            com.google.ads.interactivemedia.v3.internal.zzuu r1 = r1.zza()     // Catch: java.lang.Throwable -> Laa
            long r4 = (long) r0     // Catch: java.lang.Throwable -> Laa
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r0 = r1.get(r4, r0)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Laa
            boolean r1 = com.google.ads.interactivemedia.v3.internal.zzjm.zzd(r0)     // Catch: java.lang.Throwable -> Laa
            r4 = 1
            if (r4 == r1) goto Laa
            r2 = r0
        Laa:
            r3.zza = r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzjx.zzc():com.google.ads.interactivemedia.v3.internal.zzgm");
    }

    private final String zzd() throws ExecutionException, InterruptedException {
        try {
            if (this.zza.zzl() != null) {
                this.zza.zzl().get();
            }
            zzbp zzbpVarZzc = this.zza.zzc();
            if (zzbpVarZzc == null || !zzbpVarZzc.zzaj()) {
                return null;
            }
            return zzbpVarZzc.zzg();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzkx
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        int i10;
        zzgm zzgmVarZzc;
        zzgm zzgmVar;
        AtomicReference atomicReferenceZza = zzh.zza(this.zzj.getPackageName());
        synchronized (atomicReferenceZza) {
            try {
                zzgm zzgmVar2 = (zzgm) atomicReferenceZza.get();
                if (zzgmVar2 == null || zzjm.zzd(zzgmVar2.zza) || zzgmVar2.zza.equals("E") || zzgmVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                    if (zzjm.zzd(null)) {
                        zzjm.zzd(null);
                        i10 = 3;
                    } else {
                        i10 = 5;
                    }
                    if (this.zzk != null) {
                        zzgmVarZzc = zzc();
                    } else {
                        boolean z10 = false;
                        if (i10 == 3 && !this.zzi.zzf()) {
                            z10 = true;
                        }
                        Boolean boolValueOf = Boolean.valueOf(z10);
                        Boolean bool = (Boolean) zzls.zzc().zza(zzmj.zze);
                        String strZzb = ((Boolean) zzls.zzc().zza(zzmj.zzd)).booleanValue() ? zzb() : null;
                        if (bool.booleanValue() && this.zza.zzp() && zzjm.zzd(strZzb)) {
                            strZzb = zzd();
                        }
                        zzgm zzgmVar3 = new zzgm((String) this.zze.invoke(null, this.zzj, boolValueOf, strZzb));
                        if (zzjm.zzd(zzgmVar3.zza) || zzgmVar3.zza.equals("E")) {
                            int i11 = i10 - 1;
                            if (i11 == 3) {
                                String strZzd = zzd();
                                if (!zzjm.zzd(strZzd)) {
                                    zzgmVar3.zza = strZzd;
                                }
                            } else if (i11 == 4) {
                                throw null;
                            }
                        }
                        zzgmVarZzc = zzgmVar3;
                    }
                    atomicReferenceZza.set(zzgmVarZzc);
                }
                zzgmVar = (zzgm) atomicReferenceZza.get();
            } finally {
            }
        }
        synchronized (this.zzd) {
            if (zzgmVar != null) {
                try {
                    this.zzd.zzx(zzgmVar.zza);
                    this.zzd.zzX(zzgmVar.zzb);
                    this.zzd.zzZ(zzgmVar.zzc);
                    this.zzd.zzi(zzgmVar.zzd);
                    this.zzd.zzw(zzgmVar.zze);
                } finally {
                }
            }
        }
    }
}
