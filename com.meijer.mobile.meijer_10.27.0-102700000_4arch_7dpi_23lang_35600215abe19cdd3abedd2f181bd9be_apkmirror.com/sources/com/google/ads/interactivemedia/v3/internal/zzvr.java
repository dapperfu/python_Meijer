package com.google.ads.interactivemedia.v3.internal;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes4.dex */
public final class zzvr {
    static final zzvl zza = zzvl.zza;
    static final int zzd = 1;
    static final int zze = 1;
    static final int zzf = 2;
    public static final /* synthetic */ int zzg = 0;
    final List zzb;
    final zzvl zzc;
    private final ThreadLocal zzh;
    private final ConcurrentMap zzi;
    private final zzxl zzj;
    private final zzyx zzk;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzvr() {
        zzxn zzxnVar = zzxn.zza;
        int i10 = zzd;
        Map map = Collections.EMPTY_MAP;
        zzvl zzvlVar = zza;
        List list = Collections.EMPTY_LIST;
        this(zzxnVar, i10, map, false, false, false, true, zzvlVar, null, false, true, 1, null, 2, 2, list, list, list, zze, zzf, list);
    }

    public final String toString() {
        zzxl zzxlVar = this.zzj;
        return "{serializeNulls:false,factories:" + String.valueOf(this.zzb) + ",instanceCreators:" + zzxlVar.toString() + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        r4.zzb(r6);
        r0.put(r9, r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.ads.interactivemedia.v3.internal.zzwj zza(com.google.ads.interactivemedia.v3.internal.zzaca r9) {
        /*
            r8 = this;
            java.lang.String r0 = "type must not be null"
            java.util.Objects.requireNonNull(r9, r0)
            java.util.concurrent.ConcurrentMap r0 = r8.zzi
            java.lang.Object r0 = r0.get(r9)
            com.google.ads.interactivemedia.v3.internal.zzwj r0 = (com.google.ads.interactivemedia.v3.internal.zzwj) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            java.lang.ThreadLocal r0 = r8.zzh
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L28
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal r3 = r8.zzh
            r3.set(r0)
            r3 = r2
            goto L31
        L28:
            java.lang.Object r3 = r0.get(r9)
            com.google.ads.interactivemedia.v3.internal.zzwj r3 = (com.google.ads.interactivemedia.v3.internal.zzwj) r3
            if (r3 != 0) goto L86
            r3 = r1
        L31:
            com.google.ads.interactivemedia.v3.internal.zzvq r4 = new com.google.ads.interactivemedia.v3.internal.zzvq     // Catch: java.lang.Throwable -> L59
            r4.<init>()     // Catch: java.lang.Throwable -> L59
            r0.put(r9, r4)     // Catch: java.lang.Throwable -> L59
            java.util.List r5 = r8.zzb     // Catch: java.lang.Throwable -> L59
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L59
            r6 = 0
        L40:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> L59
            if (r7 == 0) goto L5b
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L59
            com.google.ads.interactivemedia.v3.internal.zzwk r6 = (com.google.ads.interactivemedia.v3.internal.zzwk) r6     // Catch: java.lang.Throwable -> L59
            com.google.ads.interactivemedia.v3.internal.zzwj r6 = r6.zza(r8, r9)     // Catch: java.lang.Throwable -> L59
            if (r6 == 0) goto L40
            r4.zzb(r6)     // Catch: java.lang.Throwable -> L59
            r0.put(r9, r6)     // Catch: java.lang.Throwable -> L59
            goto L5b
        L59:
            r9 = move-exception
            goto L7d
        L5b:
            if (r3 == 0) goto L63
            java.lang.ThreadLocal r1 = r8.zzh
            r1.remove()
            r1 = r2
        L63:
            if (r6 == 0) goto L6d
            if (r1 == 0) goto L6c
            java.util.concurrent.ConcurrentMap r9 = r8.zzi
            r9.putAll(r0)
        L6c:
            return r6
        L6d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r1 = "GSON (2.10.1) cannot handle "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        L7d:
            if (r3 != 0) goto L80
            goto L85
        L80:
            java.lang.ThreadLocal r0 = r8.zzh
            r0.remove()
        L85:
            throw r9
        L86:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzvr.zza(com.google.ads.interactivemedia.v3.internal.zzaca):com.google.ads.interactivemedia.v3.internal.zzwj");
    }

    public final zzwj zzb(zzwk zzwkVar, zzaca zzacaVar) {
        Objects.requireNonNull(zzwkVar, "skipPast must not be null");
        Objects.requireNonNull(zzacaVar, "type must not be null");
        if (this.zzk.zzc(zzacaVar, zzwkVar)) {
            zzwkVar = this.zzk;
        }
        boolean z10 = false;
        for (zzwk zzwkVar2 : this.zzb) {
            if (z10) {
                zzwj zzwjVarZza = zzwkVar2.zza(this, zzacaVar);
                if (zzwjVarZza != null) {
                    return zzwjVarZza;
                }
            } else if (zzwkVar2 == zzwkVar) {
                z10 = true;
            }
        }
        if (z10) {
            throw new IllegalArgumentException("GSON cannot serialize or deserialize ".concat(String.valueOf(zzacaVar)));
        }
        return zza(zzacaVar);
    }

    public final zzace zzc(Writer writer) throws IOException {
        zzace zzaceVar = new zzace(writer);
        zzaceVar.zzo(this.zzc);
        zzaceVar.zzp(true);
        zzaceVar.zzr(zzwg.LEGACY_STRICT);
        zzaceVar.zzq(false);
        return zzaceVar;
    }

    public final String zzf(Object obj) {
        if (obj == null) {
            zzvy zzvyVar = zzvy.zza;
            StringWriter stringWriter = new StringWriter();
            try {
                zzi(zzvyVar, zzc(stringWriter));
                return stringWriter.toString();
            } catch (IOException e10) {
                throw new zzvx(e10);
            }
        }
        StringWriter stringWriter2 = new StringWriter();
        try {
            zzh(obj, obj.getClass(), zzc(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e11) {
            throw new zzvx(e11);
        }
    }

    static void zzg(double d10) {
        if (!Double.isNaN(d10) && !Double.isInfinite(d10)) {
            return;
        }
        throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    public static final void zzi(zzvw zzvwVar, zzace zzaceVar) throws zzvx {
        zzwg zzwgVarZzn = zzaceVar.zzn();
        boolean zZzt = zzaceVar.zzt();
        boolean zZzs = zzaceVar.zzs();
        zzaceVar.zzp(true);
        zzaceVar.zzq(false);
        if (zzaceVar.zzn() == zzwg.LEGACY_STRICT) {
            zzaceVar.zzr(zzwg.LENIENT);
        }
        try {
            try {
                try {
                    zzabh.zzV.write(zzaceVar, zzvwVar);
                } catch (IOException e10) {
                    throw new zzvx(e10);
                }
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e11.getMessage(), e11);
            }
        } finally {
            zzaceVar.zzr(zzwgVarZzn);
            zzaceVar.zzp(zZzt);
            zzaceVar.zzq(zZzs);
        }
    }

    public final Object zzd(zzacc zzaccVar, zzaca zzacaVar) throws zzvx, zzwe {
        boolean z10;
        Object obj;
        zzwg zzwgVarZzt = zzaccVar.zzt();
        if (zzaccVar.zzt() == zzwg.LEGACY_STRICT) {
            zzaccVar.zzw(zzwg.LENIENT);
        }
        try {
            try {
                try {
                    zzaccVar.zzr();
                    z10 = false;
                } catch (EOFException e10) {
                    e = e10;
                    z10 = true;
                }
                try {
                    obj = zza(zzacaVar).read(zzaccVar);
                } catch (EOFException e11) {
                    e = e11;
                    if (z10) {
                        obj = null;
                        return obj;
                    }
                    throw new zzwe(e);
                }
                return obj;
            } finally {
                zzaccVar.zzw(zzwgVarZzt);
            }
        } catch (IOException e12) {
            throw new zzwe(e12);
        } catch (AssertionError e13) {
            throw new AssertionError("AssertionError (GSON 2.10.1): " + e13.getMessage(), e13);
        } catch (IllegalStateException e14) {
            throw new zzwe(e14);
        }
    }

    public final Object zze(String str, Class cls) throws zzvx, zzwe {
        Object obj;
        zzaca zzacaVarZza = zzaca.zza(cls);
        if (str == null) {
            obj = null;
        } else {
            zzacc zzaccVar = new zzacc(new StringReader(str));
            zzaccVar.zzw(zzwg.LEGACY_STRICT);
            Object objZzd = zzd(zzaccVar, zzacaVarZza);
            if (objZzd != null) {
                try {
                    if (zzaccVar.zzr() != 10) {
                        throw new zzwe("JSON document was not fully consumed.");
                    }
                } catch (zzacf e10) {
                    throw new zzwe(e10);
                } catch (IOException e11) {
                    throw new zzvx(e11);
                }
            }
            obj = objZzd;
        }
        if (cls == Integer.TYPE) {
            cls = Integer.class;
        } else if (cls == Float.TYPE) {
            cls = Float.class;
        } else if (cls == Byte.TYPE) {
            cls = Byte.class;
        } else if (cls == Double.TYPE) {
            cls = Double.class;
        } else if (cls == Long.TYPE) {
            cls = Long.class;
        } else if (cls == Character.TYPE) {
            cls = Character.class;
        } else if (cls == Boolean.TYPE) {
            cls = Boolean.class;
        } else if (cls == Short.TYPE) {
            cls = Short.class;
        } else if (cls == Void.TYPE) {
            cls = Void.class;
        }
        return cls.cast(obj);
    }

    public final void zzh(Object obj, Type type, zzace zzaceVar) throws zzvx {
        zzwj zzwjVarZza = zza(zzaca.zzb(type));
        zzwg zzwgVarZzn = zzaceVar.zzn();
        if (zzaceVar.zzn() == zzwg.LEGACY_STRICT) {
            zzaceVar.zzr(zzwg.LENIENT);
        }
        boolean zZzt = zzaceVar.zzt();
        boolean zZzs = zzaceVar.zzs();
        zzaceVar.zzp(true);
        zzaceVar.zzq(false);
        try {
            try {
                zzwjVarZza.write(zzaceVar, obj);
            } catch (IOException e10) {
                throw new zzvx(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e11.getMessage(), e11);
            }
        } finally {
            zzaceVar.zzr(zzwgVarZzn);
            zzaceVar.zzp(zZzt);
            zzaceVar.zzq(zZzs);
        }
    }

    zzvr(zzxn zzxnVar, int i10, Map map, boolean z10, boolean z11, boolean z12, boolean z13, zzvl zzvlVar, zzwg zzwgVar, boolean z14, boolean z15, int i11, String str, int i12, int i13, List list, List list2, List list3, int i14, int i15, List list4) {
        this.zzh = new ThreadLocal();
        this.zzi = new ConcurrentHashMap();
        zzxl zzxlVar = new zzxl(map, true, list4);
        this.zzj = zzxlVar;
        this.zzc = zzvlVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzabh.zzW);
        arrayList.add(zzzi.zza(i14));
        arrayList.add(zzxnVar);
        arrayList.addAll(list3);
        arrayList.add(zzabh.zzC);
        arrayList.add(zzabh.zzm);
        arrayList.add(zzabh.zzg);
        arrayList.add(zzabh.zzi);
        arrayList.add(zzabh.zzk);
        zzwj zzwjVar = zzabh.zzt;
        arrayList.add(zzabh.zzc(Long.TYPE, Long.class, zzwjVar));
        arrayList.add(zzabh.zzc(Double.TYPE, Double.class, z14 ? zzabh.zzv : new zzvm(this)));
        arrayList.add(zzabh.zzc(Float.TYPE, Float.class, z14 ? zzabh.zzu : new zzvn(this)));
        arrayList.add(zzzf.zza(i15));
        arrayList.add(zzabh.zzo);
        arrayList.add(zzabh.zzq);
        arrayList.add(zzabh.zzb(AtomicLong.class, new zzvo(zzwjVar).nullSafe()));
        arrayList.add(zzabh.zzb(AtomicLongArray.class, new zzvp(zzwjVar).nullSafe()));
        arrayList.add(zzabh.zzs);
        arrayList.add(zzabh.zzx);
        arrayList.add(zzabh.zzE);
        arrayList.add(zzabh.zzG);
        arrayList.add(zzabh.zzb(BigDecimal.class, zzabh.zzz));
        arrayList.add(zzabh.zzb(BigInteger.class, zzabh.zzA));
        arrayList.add(zzabh.zzb(zzxq.class, zzabh.zzB));
        arrayList.add(zzabh.zzI);
        arrayList.add(zzabh.zzK);
        arrayList.add(zzabh.zzO);
        arrayList.add(zzabh.zzQ);
        arrayList.add(zzabh.zzU);
        arrayList.add(zzabh.zzM);
        arrayList.add(zzabh.zzd);
        arrayList.add(zzyu.zza);
        arrayList.add(zzabh.zzS);
        if (zzabz.zza) {
            arrayList.add(zzabz.zzc);
            arrayList.add(zzabz.zzb);
            arrayList.add(zzabz.zzd);
        }
        arrayList.add(zzyn.zza);
        arrayList.add(zzabh.zzb);
        arrayList.add(new zzyp(zzxlVar));
        arrayList.add(new zzzd(zzxlVar, false));
        zzyx zzyxVar = new zzyx(zzxlVar);
        this.zzk = zzyxVar;
        arrayList.add(zzyxVar);
        arrayList.add(zzabh.zzX);
        arrayList.add(new zzzq(zzxlVar, i10, zzxnVar, zzyxVar, list4));
        this.zzb = Collections.unmodifiableList(arrayList);
    }
}
