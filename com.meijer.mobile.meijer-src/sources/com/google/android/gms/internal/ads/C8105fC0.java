package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.fC0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8105fC0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f74898a;

    /* renamed from: b, reason: collision with root package name */
    private final C7998eC0 f74899b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f74900c;

    public C8105fC0(LogSessionId logSessionId, String str) {
        this.f74899b = new C7998eC0(logSessionId);
        this.f74898a = str;
        this.f74900c = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8105fC0)) {
            return false;
        }
        C8105fC0 c8105fC0 = (C8105fC0) obj;
        return Objects.equals(this.f74898a, c8105fC0.f74898a) && Objects.equals(this.f74899b, c8105fC0.f74899b) && Objects.equals(this.f74900c, c8105fC0.f74900c);
    }

    static {
        if (OV.f69931a < 31) {
            new C8105fC0("");
        } else {
            int i10 = C7998eC0.f74631b;
        }
    }

    public C8105fC0(String str) {
        C8211gC.f(OV.f69931a < 31);
        this.f74898a = str;
        this.f74899b = null;
        this.f74900c = new Object();
    }

    public final LogSessionId a() {
        C7998eC0 c7998eC0 = this.f74899b;
        c7998eC0.getClass();
        return c7998eC0.f74632a;
    }

    public final int hashCode() {
        return Objects.hash(this.f74898a, this.f74899b, this.f74900c);
    }
}
