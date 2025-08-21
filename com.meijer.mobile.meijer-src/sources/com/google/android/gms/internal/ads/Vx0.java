package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Vx0 extends AbstractC7650ay0 {

    /* renamed from: a, reason: collision with root package name */
    final String f71791a;

    public Vx0(String str) {
        this.f71791a = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7650ay0
    public final void a(String str) {
        String str2 = this.f71791a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb2.append(str2);
        sb2.append(":");
        sb2.append(str);
        com.fullstory.FS.log_d("isoparser", sb2.toString());
    }
}
