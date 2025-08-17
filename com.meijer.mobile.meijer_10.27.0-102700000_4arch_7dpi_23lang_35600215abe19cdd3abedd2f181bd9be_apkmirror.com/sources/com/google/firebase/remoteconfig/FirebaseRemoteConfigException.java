package com.google.firebase.remoteconfig;

import com.google.firebase.FirebaseException;

/* loaded from: classes7.dex */
public class FirebaseRemoteConfigException extends FirebaseException {

    /* renamed from: a, reason: collision with root package name */
    private final a f89143a;

    public FirebaseRemoteConfigException(String str) {
        super(str);
        this.f89143a = a.UNKNOWN;
    }

    public enum a {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);


        /* renamed from: a, reason: collision with root package name */
        private final int f89150a;

        a(int i10) {
            this.f89150a = i10;
        }
    }

    public FirebaseRemoteConfigException(String str, Throwable th2) {
        super(str, th2);
        this.f89143a = a.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, a aVar) {
        super(str);
        this.f89143a = aVar;
    }

    public FirebaseRemoteConfigException(String str, Throwable th2, a aVar) {
        super(str, th2);
        this.f89143a = aVar;
    }
}
