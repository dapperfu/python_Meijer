package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class Am0 extends AbstractC7499al0 {

    /* renamed from: a, reason: collision with root package name */
    private final C10064ym0 f65164a;

    /* renamed from: b, reason: collision with root package name */
    private final String f65165b;

    /* renamed from: c, reason: collision with root package name */
    private final C9957xm0 f65166c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC7499al0 f65167d;

    /* synthetic */ Am0(C10064ym0 c10064ym0, String str, C9957xm0 c9957xm0, AbstractC7499al0 abstractC7499al0, C10171zm0 c10171zm0) {
        this.f65164a = c10064ym0;
        this.f65165b = str;
        this.f65166c = c9957xm0;
        this.f65167d = abstractC7499al0;
    }

    @Override // com.google.android.gms.internal.ads.Qk0
    public final boolean a() {
        return this.f65164a != C10064ym0.f80272c;
    }

    public final AbstractC7499al0 b() {
        return this.f65167d;
    }

    public final C10064ym0 c() {
        return this.f65164a;
    }

    public final String d() {
        return this.f65165b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Am0)) {
            return false;
        }
        Am0 am0 = (Am0) obj;
        return am0.f65166c.equals(this.f65166c) && am0.f65167d.equals(this.f65167d) && am0.f65165b.equals(this.f65165b) && am0.f65164a.equals(this.f65164a);
    }

    public final int hashCode() {
        return Objects.hash(Am0.class, this.f65165b, this.f65166c, this.f65167d, this.f65164a);
    }

    public final String toString() {
        C10064ym0 c10064ym0 = this.f65164a;
        AbstractC7499al0 abstractC7499al0 = this.f65167d;
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.f65165b + ", dekParsingStrategy: " + String.valueOf(this.f65166c) + ", dekParametersForNewKeys: " + String.valueOf(abstractC7499al0) + ", variant: " + String.valueOf(c10064ym0) + ")";
    }
}
