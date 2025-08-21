package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.fi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8150fi implements InterfaceC7194Pi {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8257gi f74982a;

    public C8150fi(InterfaceC8257gi interfaceC8257gi) {
        this.f74982a = interfaceC8257gi;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final void a(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            Sc.p.g("App event with no name parameter.");
        } else {
            this.f74982a.a(str, (String) map.get("info"));
        }
    }
}
