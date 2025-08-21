package com.google.firebase.messaging;

import java.util.Locale;

/* loaded from: classes8.dex */
public final class SendException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final int f89660a;

    private int a(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.getClass();
        switch (lowerCase) {
        }
        return 0;
    }

    SendException(String str) {
        super(str);
        this.f89660a = a(str);
    }
}
