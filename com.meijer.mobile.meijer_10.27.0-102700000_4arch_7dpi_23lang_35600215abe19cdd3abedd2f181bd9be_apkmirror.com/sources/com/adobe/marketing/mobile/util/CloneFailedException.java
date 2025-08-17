package com.adobe.marketing.mobile.util;

/* loaded from: classes4.dex */
public class CloneFailedException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final a f62748a;

    enum a {
        MAX_DEPTH_REACHED,
        UNSUPPORTED_TYPE,
        UNKNOWN
    }

    CloneFailedException(a aVar) {
        this(aVar.toString(), aVar);
    }

    private CloneFailedException(String str, a aVar) {
        super(str);
        this.f62748a = aVar;
    }

    a a() {
        return this.f62748a;
    }
}
