package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class XP implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f71323a;

    public XP(InterfaceC10088yy0 interfaceC10088yy0) {
        this.f71323a = interfaceC10088yy0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String packageName = ((C9865wu) this.f71323a).a().getPackageName();
        C9233qy0.b(packageName);
        return packageName;
    }
}
