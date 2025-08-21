package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.kn0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8694kn0 extends AbstractC7361Ug0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f76545a;

    public C8694kn0(Map map) {
        this.f76545a = map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7394Vg0
    protected final /* synthetic */ Object a() {
        return this.f76545a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7361Ug0
    protected final Map b() {
        return this.f76545a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7361Ug0, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7361Ug0, java.util.Map
    public final Set entrySet() {
        return C8258gi0.c(this.f76545a.entrySet(), new InterfaceC6816Ef0() { // from class: com.google.android.gms.internal.ads.im0
            @Override // com.google.android.gms.internal.ads.InterfaceC6816Ef0
            public final boolean zza(Object obj) {
                return ((Map.Entry) obj).getKey() != null;
            }
        });
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && super.w(obj);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f76545a.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.f76545a.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return C8258gi0.c(this.f76545a.keySet(), new InterfaceC6816Ef0() { // from class: com.google.android.gms.internal.ads.Jm0
            @Override // com.google.android.gms.internal.ads.InterfaceC6816Ef0
            public final boolean zza(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return super.t(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return super.zzc();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7361Ug0, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
