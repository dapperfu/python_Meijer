package com.google.android.libraries.places.internal;

import Be.p;
import Be.w;
import com.medallia.digital.mobilesdk.q2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class zzbsc extends zzbih {
    private static final Method zzt;
    final zzbsu zzd;
    final zzbsu zze;
    final zzbjj zzf;
    final List zzg;
    final String zzh;
    String zzi;
    final String zzj;
    final zzbgj zzk;
    final zzbfv zzl;
    final long zzm;
    final zzbgy zzn;
    final List zzo;
    private final List zzu;
    private final zzbrz zzv;
    private final zzbry zzw;
    private static final Logger zzp = Logger.getLogger(zzbsc.class.getName());
    static final long zza = TimeUnit.MINUTES.toMillis(30);
    static final long zzb = TimeUnit.SECONDS.toMillis(1);
    private static final zzbsu zzq = zzbwf.zzc(zzbpf.zzm);
    private static final zzbgj zzr = zzbgj.zza();
    private static final zzbfv zzs = zzbfv.zza();
    static final Pattern zzc = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    public final zzbsc zzb(String str) {
        this.zzi = str;
        return this;
    }

    static {
        Method declaredMethod = null;
        try {
            int i10 = zzbkh.f86164a;
            Class cls = Boolean.TYPE;
            declaredMethod = zzbkh.class.getDeclaredMethod("getClientInterceptor", cls, cls, cls, cls);
        } catch (ClassNotFoundException e10) {
            zzp.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e10);
        } catch (NoSuchMethodException e11) {
            zzp.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e11);
        }
        zzt = declaredMethod;
    }

    static zzbsb zze(String str, zzbjj zzbjjVar, Collection collection) {
        URI uri;
        StringBuilder sb2 = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e10) {
            sb2.append(e10.getMessage());
            uri = null;
        }
        zzbjg zzbjgVarZzb = uri != null ? zzbjjVar.zzb(uri.getScheme()) : null;
        String string = "";
        if (zzbjgVarZzb == null && !zzc.matcher(str).matches()) {
            try {
                String strZza = zzbjjVar.zza();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 1);
                sb3.append(q2.f92724c);
                sb3.append(str);
                uri = new URI(strZza, "", sb3.toString(), null);
                zzbjgVarZzb = zzbjjVar.zzb(uri.getScheme());
            } catch (URISyntaxException e11) {
                throw new IllegalArgumentException(e11);
            }
        }
        if (zzbjgVarZzb != null) {
            if (collection == null || collection.containsAll(zzbjgVarZzb.zze())) {
                return new zzbsb(uri, zzbjgVarZzb);
            }
            throw new IllegalArgumentException(String.format("Address types of NameResolver '%s' for '%s' not supported by transport", uri.getScheme(), str));
        }
        if (sb2.length() > 0) {
            String string2 = sb2.toString();
            StringBuilder sb4 = new StringBuilder(string2.length() + 3);
            sb4.append(" (");
            sb4.append(string2);
            sb4.append(")");
            string = sb4.toString();
        }
        throw new IllegalArgumentException(String.format("Could not find a NameResolverProvider for %s%s", str, string));
    }

    public final zzbsc zza(List list) {
        this.zzu.addAll(list);
        return this;
    }

    final int zzc() {
        this.zzw.zza();
        return 443;
    }

    @Override // com.google.android.libraries.places.internal.zzbih
    public final zzbif zzd() {
        zzbfj zzbfjVar;
        zzblw zzblwVarZza = this.zzv.zza();
        int i10 = zzbxh.zzc;
        zzbsb zzbsbVarZze = zze(this.zzh, this.zzf, Collections.singleton(InetSocketAddress.class));
        URI uri = zzbsbVarZze.zza;
        zzbjg zzbjgVar = zzbsbVarZze.zzb;
        zzbom zzbomVar = new zzbom();
        zzbwf zzbwfVarZzc = zzbwf.zzc(zzbpf.zzm);
        w wVar = zzbpf.zzo;
        uri.toString();
        List list = this.zzu;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (true) {
            zzbfj zzbfjVar2 = null;
            if (!it.hasNext()) {
                zzbhc.zzb();
                Method method = zzt;
                if (method != null) {
                    try {
                        Boolean bool = Boolean.TRUE;
                        zzbfjVar = (zzbfj) method.invoke(null, bool, bool, Boolean.FALSE, bool);
                    } catch (IllegalAccessException e10) {
                        zzp.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e10);
                    } catch (InvocationTargetException e11) {
                        zzp.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e11);
                    }
                } else {
                    zzbfjVar = null;
                }
                if (zzbfjVar != null) {
                    arrayList.add(0, zzbfjVar);
                }
                try {
                    zzbfjVar2 = (zzbfj) zzbki.class.getDeclaredMethod("getClientInterceptor", null).invoke(null, null);
                } catch (ClassNotFoundException e12) {
                    zzp.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e12);
                } catch (IllegalAccessException e13) {
                    zzp.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e13);
                } catch (NoSuchMethodException e14) {
                    zzp.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e14);
                } catch (InvocationTargetException e15) {
                    zzp.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e15);
                }
                if (zzbfjVar2 != null) {
                    arrayList.add(0, zzbfjVar2);
                }
                return new zzbse(new zzbrx(this, zzblwVarZza, uri, zzbjgVar, zzbomVar, zzbwfVarZzc, wVar, arrayList, zzbwk.zza));
            }
            zzbfj zzbfjVar3 = (zzbfj) it.next();
            if (zzbfjVar3 instanceof zzbsa) {
                zzbig zzbigVar = ((zzbsa) zzbfjVar3).zza;
                throw null;
            }
            arrayList.add(zzbfjVar3);
        }
    }

    public zzbsc(String str, zzbff zzbffVar, zzbfa zzbfaVar, zzbrz zzbrzVar, zzbry zzbryVar) {
        zzbsu zzbsuVar = zzq;
        this.zzd = zzbsuVar;
        this.zze = zzbsuVar;
        this.zzu = new ArrayList();
        this.zzf = zzbjj.zzc();
        this.zzg = new ArrayList();
        this.zzj = "pick_first";
        this.zzk = zzr;
        this.zzl = zzs;
        this.zzm = zza;
        this.zzn = zzbgy.zza();
        this.zzo = new ArrayList();
        this.zzh = (String) p.r(str, "target");
        this.zzv = (zzbrz) p.r(zzbrzVar, "clientTransportFactoryBuilder");
        this.zzw = zzbryVar;
        zzbhc.zza(this);
    }
}
