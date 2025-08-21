package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class XP implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f72163a;

    public XP(InterfaceC10213yy0 interfaceC10213yy0) {
        this.f72163a = interfaceC10213yy0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String packageName = ((C9990wu) this.f72163a).a().getPackageName();
        C9358qy0.b(packageName);
        return packageName;
    }
}
