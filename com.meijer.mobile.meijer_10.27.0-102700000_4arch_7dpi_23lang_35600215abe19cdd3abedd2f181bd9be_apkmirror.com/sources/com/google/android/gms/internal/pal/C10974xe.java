package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

/* renamed from: com.google.android.gms.internal.pal.xe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10974xe implements InterfaceC10840p7 {

    /* renamed from: a, reason: collision with root package name */
    private final ECPrivateKey f84212a;

    /* renamed from: b, reason: collision with root package name */
    private final C11006ze f84213b;

    /* renamed from: c, reason: collision with root package name */
    private final String f84214c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f84215d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC10958we f84216e;

    public C10974xe(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i10, InterfaceC10958we interfaceC10958we) throws GeneralSecurityException {
        this.f84212a = eCPrivateKey;
        this.f84213b = new C11006ze(eCPrivateKey);
        this.f84215d = bArr;
        this.f84214c = str;
        this.f84216e = interfaceC10958we;
    }
}
