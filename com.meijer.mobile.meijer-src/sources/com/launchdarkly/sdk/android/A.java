package com.launchdarkly.sdk.android;

import java.net.URI;
import lh.AbstractC15510t;
import mh.C15718a;

/* loaded from: classes8.dex */
final class A extends AbstractC15510t {
    @Override // lh.AbstractC15510t
    public C15718a a() {
        URI uri = this.f149643a;
        return (uri == null && this.f149644b == null && this.f149645c == null) ? new C15718a(r0.f92095a, r0.f92096b, r0.f92097c) : new C15718a(uri, this.f149644b, this.f149645c);
    }

    A() {
    }
}
