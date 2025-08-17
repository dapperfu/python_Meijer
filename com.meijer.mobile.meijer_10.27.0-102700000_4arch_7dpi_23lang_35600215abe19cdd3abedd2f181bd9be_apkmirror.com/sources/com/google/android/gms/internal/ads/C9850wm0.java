package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.wm0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9850wm0 {

    /* renamed from: a, reason: collision with root package name */
    private C10064ym0 f79522a;

    /* renamed from: b, reason: collision with root package name */
    private String f79523b;

    /* renamed from: c, reason: collision with root package name */
    private C9957xm0 f79524c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC7499al0 f79525d;

    /* synthetic */ C9850wm0(C10171zm0 c10171zm0) {
    }

    public final C9850wm0 a(AbstractC7499al0 abstractC7499al0) {
        this.f79525d = abstractC7499al0;
        return this;
    }

    public final C9850wm0 b(C9957xm0 c9957xm0) {
        this.f79524c = c9957xm0;
        return this;
    }

    public final C9850wm0 c(String str) {
        this.f79523b = str;
        return this;
    }

    public final C9850wm0 d(C10064ym0 c10064ym0) {
        this.f79522a = c10064ym0;
        return this;
    }

    public final Am0 e() throws GeneralSecurityException {
        if (this.f79522a == null) {
            this.f79522a = C10064ym0.f80272c;
        }
        if (this.f79523b == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        C9957xm0 c9957xm0 = this.f79524c;
        if (c9957xm0 == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        AbstractC7499al0 abstractC7499al0 = this.f79525d;
        if (abstractC7499al0 == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (abstractC7499al0.a()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((c9957xm0.equals(C9957xm0.f79864b) && (abstractC7499al0 instanceof Nl0)) || ((c9957xm0.equals(C9957xm0.f79866d) && (abstractC7499al0 instanceof C7927em0)) || ((c9957xm0.equals(C9957xm0.f79865c) && (abstractC7499al0 instanceof C7610bn0)) || ((c9957xm0.equals(C9957xm0.f79867e) && (abstractC7499al0 instanceof C9313rl0)) || ((c9957xm0.equals(C9957xm0.f79868f) && (abstractC7499al0 instanceof Bl0)) || (c9957xm0.equals(C9957xm0.f79869g) && (abstractC7499al0 instanceof Yl0))))))) {
            return new Am0(this.f79522a, this.f79523b, this.f79524c, this.f79525d, null);
        }
        throw new GeneralSecurityException("Cannot use parsing strategy " + this.f79524c.toString() + " when new keys are picked according to " + String.valueOf(this.f79525d) + ".");
    }
}
