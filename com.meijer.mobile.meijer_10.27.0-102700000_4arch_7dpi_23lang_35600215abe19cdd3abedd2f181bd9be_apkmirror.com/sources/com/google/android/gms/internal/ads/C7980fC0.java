package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.fC0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7980fC0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f74058a;

    /* renamed from: b, reason: collision with root package name */
    private final C7873eC0 f74059b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f74060c;

    public C7980fC0(LogSessionId logSessionId, String str) {
        this.f74059b = new C7873eC0(logSessionId);
        this.f74058a = str;
        this.f74060c = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7980fC0)) {
            return false;
        }
        C7980fC0 c7980fC0 = (C7980fC0) obj;
        return Objects.equals(this.f74058a, c7980fC0.f74058a) && Objects.equals(this.f74059b, c7980fC0.f74059b) && Objects.equals(this.f74060c, c7980fC0.f74060c);
    }

    static {
        if (OV.f69091a < 31) {
            new C7980fC0("");
        } else {
            int i10 = C7873eC0.f73791b;
        }
    }

    public C7980fC0(String str) {
        C8086gC.f(OV.f69091a < 31);
        this.f74058a = str;
        this.f74059b = null;
        this.f74060c = new Object();
    }

    public final LogSessionId a() {
        C7873eC0 c7873eC0 = this.f74059b;
        c7873eC0.getClass();
        return c7873eC0.f73792a;
    }

    public final int hashCode() {
        return Objects.hash(this.f74058a, this.f74059b, this.f74060c);
    }
}
