package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.zH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10251zH implements InterfaceC6838Ez {

    /* renamed from: a, reason: collision with root package name */
    private final Map f81244a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f81245b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f81246c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10213yy0 f81247d;

    /* renamed from: e, reason: collision with root package name */
    private final II f81248e;

    C10251zH(Map map, Map map2, Map map3, InterfaceC10213yy0 interfaceC10213yy0, II ii2) {
        this.f81244a = map;
        this.f81245b = map2;
        this.f81246c = map3;
        this.f81247d = interfaceC10213yy0;
        this.f81248e = ii2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6838Ez
    public final InterfaceC8448iT c(int i10, String str) {
        InterfaceC8448iT interfaceC8448iTC;
        InterfaceC8448iT interfaceC8448iT = (InterfaceC8448iT) this.f81244a.get(str);
        if (interfaceC8448iT != null) {
            return interfaceC8448iT;
        }
        if (i10 != 1) {
            if (i10 != 4) {
                return null;
            }
            InterfaceC10158yU interfaceC10158yU = (InterfaceC10158yU) this.f81246c.get(str);
            if (interfaceC10158yU != null) {
                return new C8553jT(interfaceC10158yU, new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.Gz
                    @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
                    public final Object apply(Object obj) {
                        return new C7008Jz((List) obj);
                    }
                });
            }
            interfaceC8448iTC = (InterfaceC8448iT) this.f81245b.get(str);
            if (interfaceC8448iTC == null) {
                return null;
            }
        } else if (this.f81248e.e() == null || (interfaceC8448iTC = ((InterfaceC6838Ez) this.f81247d.zzb()).c(i10, str)) == null) {
            return null;
        }
        return new C8553jT(interfaceC8448iTC, new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.Hz
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj) {
                return new C7008Jz((C6702Az) obj);
            }
        });
    }
}
