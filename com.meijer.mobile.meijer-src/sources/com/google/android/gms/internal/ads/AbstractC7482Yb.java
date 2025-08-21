package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.ads.Yb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7482Yb {

    /* renamed from: b, reason: collision with root package name */
    private static MessageDigest f72417b;

    /* renamed from: a, reason: collision with root package name */
    protected final Object f72418a = new Object();

    abstract byte[] b(String str);

    protected final MessageDigest a() {
        synchronized (this.f72418a) {
            MessageDigest messageDigest = f72417b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i10 = 0; i10 < 2; i10++) {
                try {
                    f72417b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f72417b;
        }
    }
}
