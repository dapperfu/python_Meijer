package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.fi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8025fi implements InterfaceC7069Pi {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8132gi f74142a;

    public C8025fi(InterfaceC8132gi interfaceC8132gi) {
        this.f74142a = interfaceC8132gi;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final void a(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            Qc.p.g("App event with no name parameter.");
        } else {
            this.f74142a.a(str, (String) map.get("info"));
        }
    }
}
