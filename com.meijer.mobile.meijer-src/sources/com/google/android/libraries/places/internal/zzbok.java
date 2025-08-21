package com.google.android.libraries.places.internal;

import De.p;
import De.u;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public final class zzbok extends zzbjf {
    static final boolean zza;
    static final boolean zzb;
    protected static final boolean zzc;
    private static final Logger zzg;
    private static final Set zzh;
    private static final String zzi;
    private static final String zzj;
    private static final String zzk;
    private static final zzboj zzl;
    private static String zzm;
    private zzbjb zzA;
    final zzbjn zzd;
    protected boolean zzf;
    private final String zzp;
    private final String zzq;
    private final int zzr;
    private final zzbsu zzs;
    private final long zzt;
    private final zzbkd zzu;
    private final zzbje zzv;
    private final u zzw;
    private boolean zzx;
    private Executor zzy;
    private boolean zzz;
    private final Random zzn = new Random();
    protected volatile zzboa zze = zzboc.INSTANCE;
    private final AtomicReference zzo = new AtomicReference();

    @Override // com.google.android.libraries.places.internal.zzbjf
    public final String zza() {
        return this.zzp;
    }

    final /* synthetic */ String zzh() {
        return this.zzq;
    }

    final /* synthetic */ long zzi() {
        return this.zzt;
    }

    final /* synthetic */ zzbkd zzj() {
        return this.zzu;
    }

    final /* synthetic */ void zzl(boolean z10) {
        this.zzz = false;
    }

    static {
        Logger logger = Logger.getLogger(zzbok.class.getName());
        zzg = logger;
        zzh = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        zzi = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        zzj = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        zzk = property3;
        zza = Boolean.parseBoolean(property);
        zzb = Boolean.parseBoolean(property2);
        zzc = Boolean.parseBoolean(property3);
        zzboj zzbojVar = null;
        try {
            try {
                try {
                    zzboj zzbojVar2 = (zzboj) Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, zzbok.class.getClassLoader()).asSubclass(zzboj.class).getConstructor(null).newInstance(null);
                    if (zzbojVar2.zzb() != null) {
                        logger.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "JndiResourceResolverFactory not available, skipping.", zzbojVar2.zzb());
                    } else {
                        zzbojVar = zzbojVar2;
                    }
                } catch (Exception e10) {
                    zzg.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e10);
                }
            } catch (Exception e11) {
                zzg.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e11);
            }
        } catch (ClassCastException e12) {
            zzg.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e12);
        } catch (ClassNotFoundException e13) {
            zzg.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e13);
        }
        zzl = zzbojVar;
    }

    private final void zzm() {
        if (this.zzz || this.zzx) {
            return;
        }
        if (this.zzf) {
            long j10 = this.zzt;
            if (j10 != 0 && (j10 <= 0 || this.zzw.d(TimeUnit.NANOSECONDS) <= j10)) {
                return;
            }
        }
        this.zzz = true;
        this.zzy.execute(new zzboh(this, this.zzA));
    }

    private static String zzn() {
        if (zzm == null) {
            try {
                zzm = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e10) {
                throw new RuntimeException(e10);
            }
        }
        return zzm;
    }

    @Override // com.google.android.libraries.places.internal.zzbjf
    public final void zzb(zzbjb zzbjbVar) {
        p.x(this.zzA == null, "already started");
        this.zzy = (Executor) this.zzs.zza();
        this.zzA = (zzbjb) p.r(zzbjbVar, "listener");
        zzm();
    }

    @Override // com.google.android.libraries.places.internal.zzbjf
    public final void zzc() {
        if (this.zzx) {
            return;
        }
        this.zzx = true;
        Executor executor = this.zzy;
        if (executor != null) {
            this.zzs.zzb(executor);
            this.zzy = null;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbjf
    public final void zzd() {
        p.x(this.zzA != null, "not started");
        zzm();
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[LOOP:2: B:67:0x012e->B:160:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0192 A[Catch: RuntimeException -> 0x015e, TryCatch #1 {RuntimeException -> 0x015e, blocks: (B:70:0x013a, B:71:0x0142, B:73:0x0148, B:76:0x0161, B:78:0x0169, B:80:0x016f, B:81:0x0173, B:83:0x0179, B:87:0x018a, B:89:0x0192, B:94:0x019f, B:97:0x01ab, B:99:0x01b3, B:101:0x01b9, B:102:0x01bd, B:104:0x01c3, B:106:0x01cf, B:111:0x01d9, B:112:0x01e8), top: B:140:0x013a }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ab A[Catch: RuntimeException -> 0x015e, TryCatch #1 {RuntimeException -> 0x015e, blocks: (B:70:0x013a, B:71:0x0142, B:73:0x0148, B:76:0x0161, B:78:0x0169, B:80:0x016f, B:81:0x0173, B:83:0x0179, B:87:0x018a, B:89:0x0192, B:94:0x019f, B:97:0x01ab, B:99:0x01b3, B:101:0x01b9, B:102:0x01bd, B:104:0x01c3, B:106:0x01cf, B:111:0x01d9, B:112:0x01e8), top: B:140:0x013a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final com.google.android.libraries.places.internal.zzbob zze(boolean r20) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbok.zze(boolean):com.google.android.libraries.places.internal.zzbob");
    }

    final /* synthetic */ zzbgl zzf() throws IOException {
        zzbjm zzbjmVarZza = this.zzd.zza(InetSocketAddress.createUnresolved(this.zzq, this.zzr));
        if (zzbjmVarZza == null) {
            return null;
        }
        return new zzbgl(Collections.singletonList(zzbjmVarZza), zzbez.zza);
    }

    final /* synthetic */ u zzk() {
        return this.zzw;
    }

    protected zzbok(String str, String str2, zzbiy zzbiyVar, zzbwd zzbwdVar, u uVar, boolean z10) throws NumberFormatException {
        boolean z11;
        p.r(zzbiyVar, "args");
        URI uriCreate = URI.create("//".concat(String.valueOf((String) p.r(str2, "name"))));
        if (uriCreate.getHost() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        p.l(z11, "Invalid DNS name: %s", str2);
        this.zzp = (String) p.s(uriCreate.getAuthority(), "nameUri (%s) doesn't have an authority", uriCreate);
        this.zzq = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.zzr = zzbiyVar.zza();
        } else {
            this.zzr = uriCreate.getPort();
        }
        this.zzd = (zzbjn) p.r(zzbiyVar.zzb(), "proxyDetector");
        Executor executorZzf = zzbiyVar.zzf();
        if (executorZzf != null) {
            this.zzs = new zzboq(executorZzf);
        } else {
            this.zzs = zzbwf.zzc(zzbwdVar);
        }
        long nanos = 0;
        if (!z10) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j10 = 30;
            if (property != null) {
                try {
                    j10 = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    zzg.logp(Level.WARNING, "io.grpc.internal.DnsNameResolver", "getNetworkAddressCacheTtlNanos", "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            if (j10 > 0) {
                nanos = TimeUnit.SECONDS.toNanos(j10);
            } else {
                nanos = j10;
            }
        }
        this.zzt = nanos;
        this.zzw = (u) p.r(uVar, "stopwatch");
        this.zzu = (zzbkd) p.r(zzbiyVar.zzc(), "syncContext");
        this.zzv = (zzbje) p.r(zzbiyVar.zze(), "serviceConfigParser");
    }
}
