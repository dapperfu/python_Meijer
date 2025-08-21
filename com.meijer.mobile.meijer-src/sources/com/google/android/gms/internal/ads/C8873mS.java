package com.google.android.gms.internal.ads;

import android.app.Activity;

/* renamed from: com.google.android.gms.internal.ads.mS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8873mS extends IS {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f77629a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.ads.internal.overlay.h f77630b;

    /* renamed from: c, reason: collision with root package name */
    private final String f77631c;

    /* renamed from: d, reason: collision with root package name */
    private final String f77632d;

    /* synthetic */ C8873mS(Activity activity, com.google.android.gms.ads.internal.overlay.h hVar, String str, String str2, C8766lS c8766lS) {
        this.f77629a = activity;
        this.f77630b = hVar;
        this.f77631c = str;
        this.f77632d = str2;
    }

    @Override // com.google.android.gms.internal.ads.IS
    public final Activity a() {
        return this.f77629a;
    }

    @Override // com.google.android.gms.internal.ads.IS
    public final com.google.android.gms.ads.internal.overlay.h b() {
        return this.f77630b;
    }

    @Override // com.google.android.gms.internal.ads.IS
    public final String c() {
        return this.f77631c;
    }

    @Override // com.google.android.gms.internal.ads.IS
    public final String d() {
        return this.f77632d;
    }

    public final boolean equals(Object obj) {
        com.google.android.gms.ads.internal.overlay.h hVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IS) {
            IS is2 = (IS) obj;
            if (this.f77629a.equals(is2.a()) && ((hVar = this.f77630b) != null ? hVar.equals(is2.b()) : is2.b() == null) && ((str = this.f77631c) != null ? str.equals(is2.c()) : is2.c() == null) && ((str2 = this.f77632d) != null ? str2.equals(is2.d()) : is2.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f77629a.hashCode() ^ 1000003;
        com.google.android.gms.ads.internal.overlay.h hVar = this.f77630b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (hVar == null ? 0 : hVar.hashCode())) * 1000003;
        String str = this.f77631c;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f77632d;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        com.google.android.gms.ads.internal.overlay.h hVar = this.f77630b;
        return "OfflineUtilsParams{activity=" + this.f77629a.toString() + ", adOverlay=" + String.valueOf(hVar) + ", gwsQueryId=" + this.f77631c + ", uri=" + this.f77632d + "}";
    }
}
