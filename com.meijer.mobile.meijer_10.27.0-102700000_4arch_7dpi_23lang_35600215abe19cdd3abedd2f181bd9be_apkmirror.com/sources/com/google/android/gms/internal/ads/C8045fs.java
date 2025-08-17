package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.function.Consumer;

/* renamed from: com.google.android.gms.internal.ads.fs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8045fs implements InterfaceC7069Pi {

    /* renamed from: a, reason: collision with root package name */
    private final Consumer f74184a;

    public C8045fs(Consumer consumer) {
        this.f74184a = consumer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        String str = (String) map.get("action");
        if (str == null) {
            Qc.p.g("Action missing from video GMSG.");
            return;
        }
        if (str.equals("src")) {
            String str2 = (String) map.get("src");
            if (str2 == null) {
                Qc.p.g("src missing from video GMSG.");
            } else {
                this.f74184a.accept(str2);
            }
        }
    }
}
