package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public class XZ {

    /* renamed from: a, reason: collision with root package name */
    public final int f72186a;

    public static String a(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) ((i10 >> 24) & com.medallia.digital.mobilesdk.l3.f93323c));
        sb2.append((char) ((i10 >> 16) & com.medallia.digital.mobilesdk.l3.f93323c));
        sb2.append((char) ((i10 >> 8) & com.medallia.digital.mobilesdk.l3.f93323c));
        sb2.append((char) (i10 & com.medallia.digital.mobilesdk.l3.f93323c));
        return sb2.toString();
    }

    public String toString() {
        return a(this.f72186a);
    }
}
