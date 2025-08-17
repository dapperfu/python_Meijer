package com.google.firebase.messaging;

import java.util.Locale;

/* loaded from: classes7.dex */
public final class SendException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final int f88844a;

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
        this.f88844a = a(str);
    }
}
