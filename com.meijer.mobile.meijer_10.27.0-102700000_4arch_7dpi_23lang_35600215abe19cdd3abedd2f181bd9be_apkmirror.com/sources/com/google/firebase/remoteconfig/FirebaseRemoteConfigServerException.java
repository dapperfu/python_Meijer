package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;

/* loaded from: classes7.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* renamed from: b, reason: collision with root package name */
    private final int f89152b;

    public FirebaseRemoteConfigServerException(int i10, String str) {
        super(str);
        this.f89152b = i10;
    }

    public int a() {
        return this.f89152b;
    }

    public FirebaseRemoteConfigServerException(int i10, String str, Throwable th2) {
        super(str, th2);
        this.f89152b = i10;
    }

    public FirebaseRemoteConfigServerException(String str, FirebaseRemoteConfigException.a aVar) {
        super(str, aVar);
        this.f89152b = -1;
    }

    public FirebaseRemoteConfigServerException(int i10, String str, FirebaseRemoteConfigException.a aVar) {
        super(str, aVar);
        this.f89152b = i10;
    }
}
