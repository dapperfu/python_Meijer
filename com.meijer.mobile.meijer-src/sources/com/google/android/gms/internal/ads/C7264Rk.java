package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Rk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7264Rk implements InterfaceC8474ik, InterfaceC7230Qk {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7230Qk f70768a;

    /* renamed from: b, reason: collision with root package name */
    private final HashSet f70769b = new HashSet();

    @Override // com.google.android.gms.internal.ads.InterfaceC8261gk
    public final /* synthetic */ void L(String str, Map map) {
        C8368hk.a(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9542sk
    public final /* synthetic */ void R0(String str, JSONObject jSONObject) {
        C8368hk.d(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8474ik, com.google.android.gms.internal.ads.InterfaceC9542sk
    public final /* synthetic */ void a(String str, String str2) {
        C8368hk.c(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8474ik, com.google.android.gms.internal.ads.InterfaceC8261gk
    public final /* synthetic */ void j(String str, JSONObject jSONObject) {
        C8368hk.b(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7230Qk
    public final void G0(String str, InterfaceC7194Pi interfaceC7194Pi) {
        this.f70768a.G0(str, interfaceC7194Pi);
        this.f70769b.add(new AbstractMap.SimpleEntry(str, interfaceC7194Pi));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7230Qk
    public final void H0(String str, InterfaceC7194Pi interfaceC7194Pi) {
        this.f70768a.H0(str, interfaceC7194Pi);
        this.f70769b.remove(new AbstractMap.SimpleEntry(str, interfaceC7194Pi));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8474ik, com.google.android.gms.internal.ads.InterfaceC9542sk
    public final void zza(String str) {
        this.f70768a.zza(str);
    }

    public final void zzc() {
        Iterator it = this.f70769b.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            Rc.p0.k("Unregistering eventhandler: ".concat(String.valueOf(((InterfaceC7194Pi) simpleEntry.getValue()).toString())));
            this.f70768a.H0((String) simpleEntry.getKey(), (InterfaceC7194Pi) simpleEntry.getValue());
        }
        this.f70769b.clear();
    }

    public C7264Rk(InterfaceC7230Qk interfaceC7230Qk) {
        this.f70768a = interfaceC7230Qk;
    }
}
