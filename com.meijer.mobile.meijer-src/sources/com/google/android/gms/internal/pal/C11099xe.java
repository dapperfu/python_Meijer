package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

/* renamed from: com.google.android.gms.internal.pal.xe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11099xe implements InterfaceC10965p7 {

    /* renamed from: a, reason: collision with root package name */
    private final ECPrivateKey f85052a;

    /* renamed from: b, reason: collision with root package name */
    private final C11131ze f85053b;

    /* renamed from: c, reason: collision with root package name */
    private final String f85054c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f85055d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC11083we f85056e;

    public C11099xe(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i10, InterfaceC11083we interfaceC11083we) throws GeneralSecurityException {
        this.f85052a = eCPrivateKey;
        this.f85053b = new C11131ze(eCPrivateKey);
        this.f85055d = bArr;
        this.f85054c = str;
        this.f85056e = interfaceC11083we;
    }
}
