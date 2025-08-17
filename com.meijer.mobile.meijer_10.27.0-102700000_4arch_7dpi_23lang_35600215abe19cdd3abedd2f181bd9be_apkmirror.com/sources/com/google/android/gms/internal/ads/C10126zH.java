package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.zH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10126zH implements InterfaceC6713Ez {

    /* renamed from: a, reason: collision with root package name */
    private final Map f80404a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f80405b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f80406c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10088yy0 f80407d;

    /* renamed from: e, reason: collision with root package name */
    private final II f80408e;

    C10126zH(Map map, Map map2, Map map3, InterfaceC10088yy0 interfaceC10088yy0, II ii2) {
        this.f80404a = map;
        this.f80405b = map2;
        this.f80406c = map3;
        this.f80407d = interfaceC10088yy0;
        this.f80408e = ii2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6713Ez
    public final InterfaceC8323iT c(int i10, String str) {
        InterfaceC8323iT interfaceC8323iTC;
        InterfaceC8323iT interfaceC8323iT = (InterfaceC8323iT) this.f80404a.get(str);
        if (interfaceC8323iT != null) {
            return interfaceC8323iT;
        }
        if (i10 != 1) {
            if (i10 != 4) {
                return null;
            }
            InterfaceC10033yU interfaceC10033yU = (InterfaceC10033yU) this.f80406c.get(str);
            if (interfaceC10033yU != null) {
                return new C8428jT(interfaceC10033yU, new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.Gz
                    @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
                    public final Object apply(Object obj) {
                        return new C6883Jz((List) obj);
                    }
                });
            }
            interfaceC8323iTC = (InterfaceC8323iT) this.f80405b.get(str);
            if (interfaceC8323iTC == null) {
                return null;
            }
        } else if (this.f80408e.e() == null || (interfaceC8323iTC = ((InterfaceC6713Ez) this.f80407d.zzb()).c(i10, str)) == null) {
            return null;
        }
        return new C8428jT(interfaceC8323iTC, new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.Hz
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj) {
                return new C6883Jz((C6577Az) obj);
            }
        });
    }
}
