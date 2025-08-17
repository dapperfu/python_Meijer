package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Rk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7139Rk implements InterfaceC8349ik, InterfaceC7105Qk {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7105Qk f69928a;

    /* renamed from: b, reason: collision with root package name */
    private final HashSet f69929b = new HashSet();

    @Override // com.google.android.gms.internal.ads.InterfaceC8136gk
    public final /* synthetic */ void L(String str, Map map) {
        C8243hk.a(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9417sk
    public final /* synthetic */ void R0(String str, JSONObject jSONObject) {
        C8243hk.d(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8349ik, com.google.android.gms.internal.ads.InterfaceC9417sk
    public final /* synthetic */ void a(String str, String str2) {
        C8243hk.c(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8349ik, com.google.android.gms.internal.ads.InterfaceC8136gk
    public final /* synthetic */ void j(String str, JSONObject jSONObject) {
        C8243hk.b(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7105Qk
    public final void H0(String str, InterfaceC7069Pi interfaceC7069Pi) {
        this.f69928a.H0(str, interfaceC7069Pi);
        this.f69929b.add(new AbstractMap.SimpleEntry(str, interfaceC7069Pi));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7105Qk
    public final void I0(String str, InterfaceC7069Pi interfaceC7069Pi) {
        this.f69928a.I0(str, interfaceC7069Pi);
        this.f69929b.remove(new AbstractMap.SimpleEntry(str, interfaceC7069Pi));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8349ik, com.google.android.gms.internal.ads.InterfaceC9417sk
    public final void zza(String str) {
        this.f69928a.zza(str);
    }

    public final void zzc() {
        Iterator it = this.f69929b.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            Pc.p0.k("Unregistering eventhandler: ".concat(String.valueOf(((InterfaceC7069Pi) simpleEntry.getValue()).toString())));
            this.f69928a.I0((String) simpleEntry.getKey(), (InterfaceC7069Pi) simpleEntry.getValue());
        }
        this.f69929b.clear();
    }

    public C7139Rk(InterfaceC7105Qk interfaceC7105Qk) {
        this.f69928a = interfaceC7105Qk;
    }
}
