package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.wm0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9975wm0 {

    /* renamed from: a, reason: collision with root package name */
    private C10189ym0 f80362a;

    /* renamed from: b, reason: collision with root package name */
    private String f80363b;

    /* renamed from: c, reason: collision with root package name */
    private C10082xm0 f80364c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC7624al0 f80365d;

    /* synthetic */ C9975wm0(C10296zm0 c10296zm0) {
    }

    public final C9975wm0 a(AbstractC7624al0 abstractC7624al0) {
        this.f80365d = abstractC7624al0;
        return this;
    }

    public final C9975wm0 b(C10082xm0 c10082xm0) {
        this.f80364c = c10082xm0;
        return this;
    }

    public final C9975wm0 c(String str) {
        this.f80363b = str;
        return this;
    }

    public final C9975wm0 d(C10189ym0 c10189ym0) {
        this.f80362a = c10189ym0;
        return this;
    }

    public final Am0 e() throws GeneralSecurityException {
        if (this.f80362a == null) {
            this.f80362a = C10189ym0.f81112c;
        }
        if (this.f80363b == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        C10082xm0 c10082xm0 = this.f80364c;
        if (c10082xm0 == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        AbstractC7624al0 abstractC7624al0 = this.f80365d;
        if (abstractC7624al0 == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (abstractC7624al0.a()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((c10082xm0.equals(C10082xm0.f80704b) && (abstractC7624al0 instanceof Nl0)) || ((c10082xm0.equals(C10082xm0.f80706d) && (abstractC7624al0 instanceof C8052em0)) || ((c10082xm0.equals(C10082xm0.f80705c) && (abstractC7624al0 instanceof C7735bn0)) || ((c10082xm0.equals(C10082xm0.f80707e) && (abstractC7624al0 instanceof C9438rl0)) || ((c10082xm0.equals(C10082xm0.f80708f) && (abstractC7624al0 instanceof Bl0)) || (c10082xm0.equals(C10082xm0.f80709g) && (abstractC7624al0 instanceof Yl0))))))) {
            return new Am0(this.f80362a, this.f80363b, this.f80364c, this.f80365d, null);
        }
        throw new GeneralSecurityException("Cannot use parsing strategy " + this.f80364c.toString() + " when new keys are picked according to " + String.valueOf(this.f80365d) + ".");
    }
}
