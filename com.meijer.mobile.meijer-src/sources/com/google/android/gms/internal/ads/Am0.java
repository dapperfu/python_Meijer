package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class Am0 extends AbstractC7624al0 {

    /* renamed from: a, reason: collision with root package name */
    private final C10189ym0 f66004a;

    /* renamed from: b, reason: collision with root package name */
    private final String f66005b;

    /* renamed from: c, reason: collision with root package name */
    private final C10082xm0 f66006c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC7624al0 f66007d;

    /* synthetic */ Am0(C10189ym0 c10189ym0, String str, C10082xm0 c10082xm0, AbstractC7624al0 abstractC7624al0, C10296zm0 c10296zm0) {
        this.f66004a = c10189ym0;
        this.f66005b = str;
        this.f66006c = c10082xm0;
        this.f66007d = abstractC7624al0;
    }

    @Override // com.google.android.gms.internal.ads.Qk0
    public final boolean a() {
        return this.f66004a != C10189ym0.f81112c;
    }

    public final AbstractC7624al0 b() {
        return this.f66007d;
    }

    public final C10189ym0 c() {
        return this.f66004a;
    }

    public final String d() {
        return this.f66005b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Am0)) {
            return false;
        }
        Am0 am0 = (Am0) obj;
        return am0.f66006c.equals(this.f66006c) && am0.f66007d.equals(this.f66007d) && am0.f66005b.equals(this.f66005b) && am0.f66004a.equals(this.f66004a);
    }

    public final int hashCode() {
        return Objects.hash(Am0.class, this.f66005b, this.f66006c, this.f66007d, this.f66004a);
    }

    public final String toString() {
        C10189ym0 c10189ym0 = this.f66004a;
        AbstractC7624al0 abstractC7624al0 = this.f66007d;
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.f66005b + ", dekParsingStrategy: " + String.valueOf(this.f66006c) + ", dekParametersForNewKeys: " + String.valueOf(abstractC7624al0) + ", variant: " + String.valueOf(c10189ym0) + ")";
    }
}
