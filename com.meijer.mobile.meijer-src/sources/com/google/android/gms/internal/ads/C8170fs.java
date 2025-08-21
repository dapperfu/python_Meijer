package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.function.Consumer;

/* renamed from: com.google.android.gms.internal.ads.fs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8170fs implements InterfaceC7194Pi {

    /* renamed from: a, reason: collision with root package name */
    private final Consumer f75024a;

    public C8170fs(Consumer consumer) {
        this.f75024a = consumer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        String str = (String) map.get("action");
        if (str == null) {
            Sc.p.g("Action missing from video GMSG.");
            return;
        }
        if (str.equals("src")) {
            String str2 = (String) map.get("src");
            if (str2 == null) {
                Sc.p.g("src missing from video GMSG.");
            } else {
                this.f75024a.accept(str2);
            }
        }
    }
}
