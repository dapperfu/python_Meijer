package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Pc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7058Pc0 implements InterfaceC8014fc0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f69381a;

    /* renamed from: b, reason: collision with root package name */
    private final C7092Qc0 f69382b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC7483ad0 f69383c;

    /* renamed from: d, reason: collision with root package name */
    private final C7694cc0 f69384d;

    C7058Pc0(Object obj, C7092Qc0 c7092Qc0, InterfaceC7483ad0 interfaceC7483ad0, C7694cc0 c7694cc0) {
        this.f69381a = obj;
        this.f69382b = c7092Qc0;
        this.f69383c = interfaceC7483ad0;
        this.f69384d = c7694cc0;
    }

    private final synchronized byte[] f(Map map, Map map2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e10) {
            this.f69384d.c(2007, System.currentTimeMillis() - jCurrentTimeMillis, e10);
            return null;
        }
        return (byte[]) this.f69381a.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.f69381a, null, map2);
    }

    public final synchronized int a() throws zzfpf {
        try {
        } catch (Exception e10) {
            throw new zzfpf(2006, e10);
        }
        return ((Integer) this.f69381a.getClass().getDeclaredMethod("lcs", null).invoke(this.f69381a, null)).intValue();
    }

    final C7092Qc0 b() {
        return this.f69382b;
    }

    public final synchronized void c() throws zzfpf {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f69381a.getClass().getDeclaredMethod("close", null).invoke(this.f69381a, null);
            this.f69384d.d(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e10) {
            throw new zzfpf(2003, e10);
        }
    }

    final synchronized boolean d() throws zzfpf {
        try {
        } catch (Exception e10) {
            throw new zzfpf(2001, e10);
        }
        return ((Boolean) this.f69381a.getClass().getDeclaredMethod("init", null).invoke(this.f69381a, null)).booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8014fc0
    public final synchronized String zza(Context context, String str, String str2, View view, Activity activity) {
        Map mapZza;
        mapZza = this.f69383c.zza();
        mapZza.put("f", "c");
        mapZza.put("ctx", context);
        mapZza.put("cs", str2);
        mapZza.put("aid", null);
        mapZza.put("view", view);
        mapZza.put("act", activity);
        return e(f(null, mapZza));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8014fc0
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map mapZzc;
        mapZzc = this.f69383c.zzc();
        mapZzc.put("f", "v");
        mapZzc.put("ctx", context);
        mapZzc.put("aid", null);
        mapZzc.put("view", view);
        mapZzc.put("act", activity);
        return e(f(null, mapZzc));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8014fc0
    public final synchronized String zzc(Context context, String str) {
        Map mapZzb;
        mapZzb = this.f69383c.zzb();
        mapZzb.put("f", "q");
        mapZzb.put("ctx", context);
        mapZzb.put("aid", null);
        return e(f(null, mapZzb));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8014fc0
    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzfpf {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put("t", new Throwable());
            map.put("aid", null);
            map.put("evt", motionEvent);
            this.f69381a.getClass().getDeclaredMethod("he", Map.class).invoke(this.f69381a, map);
            this.f69384d.d(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e10) {
            throw new zzfpf(2005, e10);
        }
    }

    private static String e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        W8 w8B0 = X8.b0();
        w8B0.w(5);
        w8B0.u(Zt0.z(bArr, 0, bArr.length));
        return Base64.encodeToString(((X8) w8B0.p()).j(), 11);
    }
}
