package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class E1 {

    /* renamed from: a, reason: collision with root package name */
    private String f66318a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f66319b;

    /* renamed from: c, reason: collision with root package name */
    private final C7959f2 f66320c = new C7959f2();

    /* renamed from: d, reason: collision with root package name */
    private final List f66321d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC7917eh0 f66322e;

    /* renamed from: f, reason: collision with root package name */
    private final C8389j4 f66323f;

    /* renamed from: g, reason: collision with root package name */
    private final C8714m6 f66324g;

    public final E1 b(Uri uri) {
        this.f66319b = uri;
        return this;
    }

    public final E1 a(String str) {
        this.f66318a = str;
        return this;
    }

    public final H7 c() {
        C8498k5 c8498k5;
        Uri uri = this.f66319b;
        if (uri != null) {
            c8498k5 = new C8498k5(uri, null, null, null, this.f66321d, null, this.f66322e, null, -9223372036854775807L, null);
        } else {
            c8498k5 = null;
        }
        String str = this.f66318a;
        if (str == null) {
            str = "";
        }
        return new H7(str, new C8175h3(this.f66320c, null), c8498k5, new J4(this.f66323f, null), L9.f68266z, this.f66324g, null);
    }

    public E1() {
        AbstractC7917eh0.t();
        this.f66321d = Collections.EMPTY_LIST;
        this.f66322e = AbstractC7917eh0.t();
        this.f66323f = new C8389j4();
        this.f66324g = C8714m6.f76726d;
    }
}
