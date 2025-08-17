package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public final class zzds {
    private final HashMap zza = new HashMap();
    private final HashMap zzb = new HashMap();
    private final HashMap zzc = new HashMap();
    private final HashSet zzd = new HashSet();
    private final HashSet zze = new HashSet();
    private final HashSet zzf = new HashSet();
    private final HashMap zzg = new HashMap();
    private final Map zzh = new WeakHashMap();
    private boolean zzi;

    public final HashSet zze() {
        return this.zzf;
    }

    public final HashSet zzf() {
        return this.zze;
    }

    public final void zzh() {
        this.zzi = true;
    }

    public final View zza(String str) {
        return (View) this.zzc.get(str);
    }

    public final zzdr zzb(View view) {
        zzdr zzdrVar = (zzdr) this.zzb.get(view);
        if (zzdrVar != null) {
            this.zzb.remove(view);
        }
        return zzdrVar;
    }

    public final String zzc(String str) {
        return (String) this.zzg.get(str);
    }

    public final String zzd(View view) {
        if (this.zza.size() == 0) {
            return null;
        }
        String str = (String) this.zza.get(view);
        if (str != null) {
            this.zza.remove(view);
        }
        return str;
    }

    public final void zzg() {
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        this.zzg.clear();
        this.zzi = false;
    }

    public final boolean zzj(View view) {
        if (!this.zzh.containsKey(view)) {
            return true;
        }
        this.zzh.put(view, Boolean.TRUE);
        return false;
    }

    public final int zzk(View view) {
        if (this.zzd.contains(view)) {
            return 1;
        }
        return this.zzi ? 2 : 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzi() {
        Boolean bool;
        String str;
        zzcr zzcrVarZza = zzcr.zza();
        if (zzcrVarZza != null) {
            for (com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar : zzcrVarZza.zzb()) {
                View viewZzg = zzeVar.zzg();
                if (zzeVar.zzk()) {
                    String strZzi = zzeVar.zzi();
                    if (viewZzg != null) {
                        if (!viewZzg.isAttachedToWindow()) {
                            str = "notAttached";
                        } else {
                            if (viewZzg.hasWindowFocus()) {
                                this.zzh.remove(viewZzg);
                                bool = Boolean.FALSE;
                            } else if (this.zzh.containsKey(viewZzg)) {
                                bool = (Boolean) this.zzh.get(viewZzg);
                            } else {
                                Map map = this.zzh;
                                Boolean bool2 = Boolean.FALSE;
                                map.put(viewZzg, bool2);
                                bool = bool2;
                            }
                            if (bool.booleanValue()) {
                                str = "noWindowFocus";
                            } else {
                                HashSet hashSet = new HashSet();
                                View view = viewZzg;
                                while (true) {
                                    if (view != null) {
                                        String strZza = zzdq.zza(view);
                                        if (strZza != null) {
                                            str = strZza;
                                            break;
                                        }
                                        hashSet.add(view);
                                        Object parent = view.getParent();
                                        if (parent instanceof View) {
                                            view = (View) parent;
                                        } else {
                                            view = null;
                                        }
                                    } else {
                                        this.zzd.addAll(hashSet);
                                        str = null;
                                        break;
                                    }
                                }
                            }
                        }
                        if (str == null) {
                            this.zze.add(strZzi);
                            this.zza.put(viewZzg, strZzi);
                            for (zzcu zzcuVar : zzeVar.zzj()) {
                                View view2 = (View) zzcuVar.zzb().get();
                                if (view2 != null) {
                                    zzdr zzdrVar = (zzdr) this.zzb.get(view2);
                                    if (zzdrVar != null) {
                                        zzdrVar.zzc(zzeVar.zzi());
                                    } else {
                                        this.zzb.put(view2, new zzdr(zzcuVar, zzeVar.zzi()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.zzf.add(strZzi);
                            this.zzc.put(strZzi, viewZzg);
                            this.zzg.put(strZzi, str);
                        }
                    } else {
                        this.zzf.add(strZzi);
                        this.zzg.put(strZzi, "noAdView");
                    }
                }
            }
        }
    }
}
