package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.j30, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8513j30 implements InterfaceC8502iy0 {
    public static W10 a(Context context, C9127oq c9127oq, C9234pq c9234pq, Object obj, A20 a20, V20 v20, InterfaceC7863cy0 interfaceC7863cy0, InterfaceC7863cy0 interfaceC7863cy02, InterfaceC7863cy0 interfaceC7863cy03, InterfaceC7863cy0 interfaceC7863cy04, InterfaceC7863cy0 interfaceC7863cy05, InterfaceC7863cy0 interfaceC7863cy06, InterfaceC7863cy0 interfaceC7863cy07, Executor executor, W80 w80, C9937wN c9937wN) {
        HashSet hashSet = new HashSet();
        hashSet.add((O20) obj);
        hashSet.add(a20);
        hashSet.add(v20);
        if (((Boolean) Oc.A.c().a(C8784lf.f76830H5)).booleanValue()) {
            hashSet.add((T10) interfaceC7863cy0.zzb());
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f76844I5)).booleanValue()) {
            hashSet.add((T10) interfaceC7863cy02.zzb());
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f76872K5)).booleanValue()) {
            hashSet.add((T10) interfaceC7863cy04.zzb());
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f76886L5)).booleanValue()) {
            hashSet.add((T10) interfaceC7863cy05.zzb());
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f77135d3)).booleanValue()) {
            hashSet.add((T10) interfaceC7863cy07.zzb());
        }
        return new W10(context, executor, hashSet, w80, c9937wN);
    }
}
