package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class E1 {

    /* renamed from: a, reason: collision with root package name */
    private String f67158a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f67159b;

    /* renamed from: c, reason: collision with root package name */
    private final C8084f2 f67160c = new C8084f2();

    /* renamed from: d, reason: collision with root package name */
    private final List f67161d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC8042eh0 f67162e;

    /* renamed from: f, reason: collision with root package name */
    private final C8514j4 f67163f;

    /* renamed from: g, reason: collision with root package name */
    private final C8839m6 f67164g;

    public final E1 b(Uri uri) {
        this.f67159b = uri;
        return this;
    }

    public final E1 a(String str) {
        this.f67158a = str;
        return this;
    }

    public final H7 c() {
        C8623k5 c8623k5;
        Uri uri = this.f67159b;
        if (uri != null) {
            c8623k5 = new C8623k5(uri, null, null, null, this.f67161d, null, this.f67162e, null, -9223372036854775807L, null);
        } else {
            c8623k5 = null;
        }
        String str = this.f67158a;
        if (str == null) {
            str = "";
        }
        return new H7(str, new C8300h3(this.f67160c, null), c8623k5, new J4(this.f67163f, null), L9.f69106z, this.f67164g, null);
    }

    public E1() {
        AbstractC8042eh0.t();
        this.f67161d = Collections.EMPTY_LIST;
        this.f67162e = AbstractC8042eh0.t();
        this.f67163f = new C8514j4();
        this.f67164g = C8839m6.f77566d;
    }
}
