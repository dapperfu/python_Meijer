package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.of0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8981of0 implements InterfaceC6691Ef0 {
    protected AbstractC8981of0() {
    }

    public static AbstractC8981of0 b(char c10) {
        return new C8660lf0(c10);
    }

    public abstract boolean a(char c10);

    @Override // com.google.android.gms.internal.ads.InterfaceC6691Ef0
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return a(((Character) obj).charValue());
    }
}
