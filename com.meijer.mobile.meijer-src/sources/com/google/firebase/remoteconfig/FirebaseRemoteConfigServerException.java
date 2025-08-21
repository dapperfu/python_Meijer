package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;

/* loaded from: classes8.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* renamed from: b, reason: collision with root package name */
    private final int f89994b;

    public FirebaseRemoteConfigServerException(int i10, String str) {
        super(str);
        this.f89994b = i10;
    }

    public int a() {
        return this.f89994b;
    }

    public FirebaseRemoteConfigServerException(int i10, String str, Throwable th2) {
        super(str, th2);
        this.f89994b = i10;
    }

    public FirebaseRemoteConfigServerException(String str, FirebaseRemoteConfigException.a aVar) {
        super(str, aVar);
        this.f89994b = -1;
    }

    public FirebaseRemoteConfigServerException(int i10, String str, FirebaseRemoteConfigException.a aVar) {
        super(str, aVar);
        this.f89994b = i10;
    }
}
