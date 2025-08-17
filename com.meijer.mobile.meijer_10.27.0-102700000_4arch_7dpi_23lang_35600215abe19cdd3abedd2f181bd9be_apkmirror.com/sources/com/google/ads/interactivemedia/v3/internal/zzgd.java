package com.google.ads.interactivemedia.v3.internal;

import Td.AbstractC5232j;
import Td.C5233k;
import Td.C5235m;
import Td.InterfaceC5225c;
import Td.InterfaceC5228f;
import android.content.Context;
import com.google.ads.interactivemedia.v3.api.signals.SecureSignalsAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class zzgd {
    private final List zza = new ArrayList(0);
    private final C5233k zzb = new C5233k();
    private final C5233k zzc = new C5233k();
    private final Context zzd;
    private final ExecutorService zze;
    private final zzfd zzf;
    private Integer zzg;

    public static /* synthetic */ Void zzd(zzgd zzgdVar, AbstractC5232j abstractC5232j) {
        zzgdVar.zzc.e(zzgdVar.zza);
        return null;
    }

    private final void zzi(com.google.ads.interactivemedia.v3.impl.data.zzbq zzbqVar, Exception exc) {
        this.zzf.zzg(com.google.ads.interactivemedia.v3.impl.data.zzbp.NATIVE_ESP, zzbqVar, exc);
    }

    private final void zzj(zzft zzftVar) {
        this.zza.remove(zzftVar);
    }

    public final AbstractC5232j zzb() {
        this.zzb.a().j(this.zze, new InterfaceC5225c() { // from class: com.google.ads.interactivemedia.v3.internal.zzgb
            @Override // Td.InterfaceC5225c
            public final Object then(AbstractC5232j abstractC5232j) {
                List<zzft> list = (List) abstractC5232j.n();
                ArrayList arrayList = new ArrayList(list.size());
                for (final zzft zzftVar : list) {
                    final zzgd zzgdVar = this.zza;
                    AbstractC5232j abstractC5232jZzc = zzftVar.zzc();
                    abstractC5232jZzc.e(new InterfaceC5228f() { // from class: com.google.ads.interactivemedia.v3.internal.zzfv
                        @Override // Td.InterfaceC5228f
                        public final void onFailure(Exception exc) {
                            zzgdVar.zzh(zzftVar, exc);
                        }
                    });
                    arrayList.add(abstractC5232jZzc);
                }
                return arrayList;
            }
        }).l(this.zze, new zzfy(this)).j(this.zze, new zzfz(this)).j(this.zze, new InterfaceC5225c() { // from class: com.google.ads.interactivemedia.v3.internal.zzgc
            @Override // Td.InterfaceC5225c
            public final Object then(AbstractC5232j abstractC5232j) {
                zzgd.zzd(this.zza, abstractC5232j);
                return null;
            }
        });
        return this.zzc.a();
    }

    public final List zze() {
        try {
            AbstractC5232j abstractC5232jJ = this.zzc.a().j(this.zze, new InterfaceC5225c() { // from class: com.google.ads.interactivemedia.v3.internal.zzfx
                @Override // Td.InterfaceC5225c
                public final Object then(AbstractC5232j abstractC5232j) {
                    List<zzft> list = (List) abstractC5232j.n();
                    ArrayList arrayList = new ArrayList(list.size());
                    for (final zzft zzftVar : list) {
                        final zzgd zzgdVar = this.zza;
                        arrayList.add(zzftVar.zzb().e(new InterfaceC5228f() { // from class: com.google.ads.interactivemedia.v3.internal.zzfu
                            @Override // Td.InterfaceC5228f
                            public final void onFailure(Exception exc) {
                                zzgdVar.zzg(zzftVar, exc);
                            }
                        }));
                    }
                    return arrayList;
                }
            }).l(this.zze, new zzfy(this)).j(this.zze, new zzfz(this));
            return (List) C5235m.a(this.zzg == null ? C5235m.f(new ArrayList()) : C5235m.l(abstractC5232jJ, r1.intValue(), TimeUnit.MILLISECONDS).e(new InterfaceC5228f() { // from class: com.google.ads.interactivemedia.v3.internal.zzga
                @Override // Td.InterfaceC5228f
                public final void onFailure(Exception exc) {
                    this.zza.zzf(exc);
                }
            }));
        } catch (InterruptedException | ExecutionException unused) {
            return new ArrayList();
        }
    }

    final /* synthetic */ void zzf(Exception exc) {
        zzi(com.google.ads.interactivemedia.v3.impl.data.zzbq.COLLECT_SIGNALS, exc);
    }

    public zzgd(Context context, ExecutorService executorService, zzfd zzfdVar) {
        this.zzd = context;
        this.zze = executorService;
        this.zzf = zzfdVar;
    }

    public static /* synthetic */ AbstractC5232j zza(zzgd zzgdVar, AbstractC5232j abstractC5232j) {
        final List list = (List) abstractC5232j.n();
        return C5235m.i(list).j(zzgdVar.zze, new InterfaceC5225c() { // from class: com.google.ads.interactivemedia.v3.internal.zzfw
            @Override // Td.InterfaceC5225c
            public final Object then(AbstractC5232j abstractC5232j2) {
                return list;
            }
        });
    }

    private static final Exception zzk(zzft zzftVar, Exception exc) {
        return new Exception("Exception with SecureSignalsAdapter " + zzftVar.zze() + ":" + zzftVar.zzf(), exc);
    }

    public final AbstractC5232j zzc(List list, Integer num) {
        if (num.intValue() == 0) {
            this.zzb.d(new Exception("No adapters to load"));
            return this.zzb.a();
        }
        this.zzg = num;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzft zzftVar = null;
            try {
                int i10 = 0;
                Class<?> cls = Class.forName(str, false, zzgd.class.getClassLoader());
                Class<?>[] interfaces = cls.getInterfaces();
                String name = SecureSignalsAdapter.class.getName();
                int length = interfaces.length;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    if (interfaces[i10].getName().equals(name)) {
                        zzftVar = new zzft((SecureSignalsAdapter) cls.getDeclaredConstructor(null).newInstance(null), str, this.zzd);
                        break;
                    }
                    i10++;
                }
            } catch (Throwable unused) {
            }
            if (zzftVar != null) {
                try {
                    this.zza.add(zzftVar);
                } catch (Exception e10) {
                    zzi(com.google.ads.interactivemedia.v3.impl.data.zzbq.LOAD_ADAPTER, new Exception("Exception with SecureSignalsAdapter ".concat(String.valueOf(str)), e10));
                }
            }
        }
        this.zzb.e(this.zza);
        return this.zzb.a();
    }

    final /* synthetic */ void zzg(zzft zzftVar, Exception exc) {
        zzj(zzftVar);
        zzi(com.google.ads.interactivemedia.v3.impl.data.zzbq.COLLECT_SIGNALS, zzk(zzftVar, exc));
    }

    final /* synthetic */ void zzh(zzft zzftVar, Exception exc) {
        zzj(zzftVar);
        zzi(com.google.ads.interactivemedia.v3.impl.data.zzbq.INIT, zzk(zzftVar, exc));
    }
}
