package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.ads.Yb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7357Yb {

    /* renamed from: b, reason: collision with root package name */
    private static MessageDigest f71577b;

    /* renamed from: a, reason: collision with root package name */
    protected final Object f71578a = new Object();

    abstract byte[] b(String str);

    protected final MessageDigest a() {
        synchronized (this.f71578a) {
            MessageDigest messageDigest = f71577b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i10 = 0; i10 < 2; i10++) {
                try {
                    f71577b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f71577b;
        }
    }
}
