package com.google.android.gms.internal.pal;

import java.security.SecureRandom;

/* loaded from: classes6.dex */
final class Ve extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    Ve() {
    }
}
