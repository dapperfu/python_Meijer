package com.launchdarkly.sdk.android;

import java.net.URI;
import kh.AbstractC15166t;
import lh.C15409a;

/* loaded from: classes7.dex */
final class A extends AbstractC15166t {
    @Override // kh.AbstractC15166t
    public C15409a a() {
        URI uri = this.f141960a;
        return (uri == null && this.f141961b == null && this.f141962c == null) ? new C15409a(r0.f91256a, r0.f91257b, r0.f91258c) : new C15409a(uri, this.f141961b, this.f141962c);
    }

    A() {
    }
}
