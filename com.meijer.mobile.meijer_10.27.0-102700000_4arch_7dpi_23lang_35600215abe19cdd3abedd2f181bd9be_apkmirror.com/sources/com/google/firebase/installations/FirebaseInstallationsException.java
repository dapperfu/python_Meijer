package com.google.firebase.installations;

import com.google.firebase.FirebaseException;

/* loaded from: classes7.dex */
public class FirebaseInstallationsException extends FirebaseException {

    /* renamed from: a, reason: collision with root package name */
    private final a f88724a;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(a aVar) {
        this.f88724a = aVar;
    }

    public FirebaseInstallationsException(String str, a aVar) {
        super(str);
        this.f88724a = aVar;
    }
}
