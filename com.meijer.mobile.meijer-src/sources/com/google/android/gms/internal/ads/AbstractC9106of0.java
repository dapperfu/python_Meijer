package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.of0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9106of0 implements InterfaceC6816Ef0 {
    protected AbstractC9106of0() {
    }

    public static AbstractC9106of0 b(char c10) {
        return new C8785lf0(c10);
    }

    public abstract boolean a(char c10);

    @Override // com.google.android.gms.internal.ads.InterfaceC6816Ef0
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return a(((Character) obj).charValue());
    }
}
