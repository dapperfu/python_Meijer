package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.j30, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8388j30 implements InterfaceC8377iy0 {
    public static W10 a(Context context, C9002oq c9002oq, C9109pq c9109pq, Object obj, A20 a20, V20 v20, InterfaceC7738cy0 interfaceC7738cy0, InterfaceC7738cy0 interfaceC7738cy02, InterfaceC7738cy0 interfaceC7738cy03, InterfaceC7738cy0 interfaceC7738cy04, InterfaceC7738cy0 interfaceC7738cy05, InterfaceC7738cy0 interfaceC7738cy06, InterfaceC7738cy0 interfaceC7738cy07, Executor executor, W80 w80, C9812wN c9812wN) {
        HashSet hashSet = new HashSet();
        hashSet.add((O20) obj);
        hashSet.add(a20);
        hashSet.add(v20);
        if (((Boolean) Mc.A.c().a(C8659lf.f75990H5)).booleanValue()) {
            hashSet.add((T10) interfaceC7738cy0.zzb());
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76004I5)).booleanValue()) {
            hashSet.add((T10) interfaceC7738cy02.zzb());
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76032K5)).booleanValue()) {
            hashSet.add((T10) interfaceC7738cy04.zzb());
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76046L5)).booleanValue()) {
            hashSet.add((T10) interfaceC7738cy05.zzb());
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76295d3)).booleanValue()) {
            hashSet.add((T10) interfaceC7738cy07.zzb());
        }
        return new W10(context, executor, hashSet, w80, c9812wN);
    }
}
