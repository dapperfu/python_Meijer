package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public abstract class zzib implements zzia {
    protected static volatile zzjj zza;
    protected MotionEvent zzb;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected DisplayMetrics zzq;
    protected zzjb zzr;
    private double zzs;
    private double zzt;
    protected final LinkedList zzc = new LinkedList();
    protected long zzd = 0;
    protected long zze = 0;
    protected long zzf = 0;
    protected long zzg = 0;
    protected long zzh = 0;
    protected long zzi = 0;
    protected long zzj = 0;
    private boolean zzu = false;
    protected boolean zzp = false;

    protected abstract long zza(StackTraceElement[] stackTraceElementArr) throws zziz;

    protected abstract zzan zzb(Context context, View view, Activity activity);

    protected abstract zzan zzc(Context context, zzy zzyVar);

    protected abstract zzan zzd(Context context, View view, Activity activity);

    @Override // com.google.ads.interactivemedia.v3.internal.zzia
    public final String zze(Context context, String str, View view, Activity activity) {
        return zzm(context, str, 3, view, activity, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzia
    public final String zzg(Context context, byte[] bArr) {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzia
    public final String zzh(Context context, View view, Activity activity) {
        return zzm(context, null, 2, view, activity, null);
    }

    protected abstract zzjl zzi(MotionEvent motionEvent) throws zziz;

    @Override // com.google.ads.interactivemedia.v3.internal.zzia
    public final synchronized void zzk(MotionEvent motionEvent) {
        Long l10;
        try {
            if (this.zzu) {
                zzj();
                this.zzu = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.zzk = 0.0d;
                this.zzs = motionEvent.getRawX();
                this.zzt = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d10 = rawX - this.zzs;
                double d11 = rawY - this.zzt;
                this.zzk += Math.sqrt((d10 * d10) + (d11 * d11));
                this.zzs = rawX;
                this.zzt = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        this.zzb = motionEventObtain;
                        this.zzc.add(motionEventObtain);
                        if (this.zzc.size() > 6) {
                            ((MotionEvent) this.zzc.remove()).recycle();
                        }
                        this.zzf++;
                        this.zzh = zza(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.zze += motionEvent.getHistorySize() + 1;
                        zzjl zzjlVarZzi = zzi(motionEvent);
                        Long l11 = zzjlVarZzi.zzd;
                        if (l11 != null && zzjlVarZzi.zzg != null) {
                            this.zzi += l11.longValue() + zzjlVarZzi.zzg.longValue();
                        }
                        if (this.zzq != null && (l10 = zzjlVarZzi.zze) != null && zzjlVarZzi.zzh != null) {
                            this.zzj += l10.longValue() + zzjlVarZzi.zzh.longValue();
                        }
                    } else if (action2 == 3) {
                        this.zzg++;
                    }
                } catch (zziz unused) {
                }
            } else {
                this.zzl = motionEvent.getX();
                this.zzm = motionEvent.getY();
                this.zzn = motionEvent.getRawX();
                this.zzo = motionEvent.getRawY();
                this.zzd++;
            }
            this.zzp = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzia
    public void zzn(View view) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzia
    public final boolean zzq() {
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzia
    public final boolean zzs() {
        return true;
    }

    private final void zzj() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        if (this.zzc.isEmpty()) {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.zzc.clear();
        }
        this.zzb = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00dc A[Catch: Exception -> 0x00d8, TRY_LEAVE, TryCatch #2 {Exception -> 0x00d8, blocks: (B:44:0x009a, B:47:0x00a7, B:56:0x00cb, B:59:0x00dc), top: B:77:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String zzm(android.content.Context r19, java.lang.String r20, int r21, android.view.View r22, android.app.Activity r23, byte[] r24) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzib.zzm(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzia
    public final synchronized void zzl(int i10, int i11, int i12) {
        try {
            if (this.zzb != null) {
                if (((Boolean) zzls.zzc().zza(zzmj.zzh)).booleanValue()) {
                    zzj();
                } else {
                    this.zzb.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.zzq;
            if (displayMetrics != null) {
                float f10 = displayMetrics.density;
                this.zzb = MotionEvent.obtain(0L, i12, 1, i10 * f10, i11 * f10, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.zzb = null;
            }
            this.zzp = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    protected zzib(Context context) {
        try {
            zzgt.zzd();
            this.zzq = context.getResources().getDisplayMetrics();
            if (((Boolean) zzls.zzc().zza(zzmj.zzs)).booleanValue()) {
                this.zzr = new zzjb();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzia
    public final String zzf(Context context) {
        if (!zzjm.zzc()) {
            return zzm(context, null, 1, null, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }
}
