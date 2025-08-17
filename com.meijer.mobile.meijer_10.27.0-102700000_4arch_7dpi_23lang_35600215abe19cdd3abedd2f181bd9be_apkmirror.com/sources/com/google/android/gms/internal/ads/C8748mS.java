package com.google.android.gms.internal.ads;

import android.app.Activity;

/* renamed from: com.google.android.gms.internal.ads.mS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8748mS extends IS {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f76789a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.ads.internal.overlay.h f76790b;

    /* renamed from: c, reason: collision with root package name */
    private final String f76791c;

    /* renamed from: d, reason: collision with root package name */
    private final String f76792d;

    /* synthetic */ C8748mS(Activity activity, com.google.android.gms.ads.internal.overlay.h hVar, String str, String str2, C8641lS c8641lS) {
        this.f76789a = activity;
        this.f76790b = hVar;
        this.f76791c = str;
        this.f76792d = str2;
    }

    @Override // com.google.android.gms.internal.ads.IS
    public final Activity a() {
        return this.f76789a;
    }

    @Override // com.google.android.gms.internal.ads.IS
    public final com.google.android.gms.ads.internal.overlay.h b() {
        return this.f76790b;
    }

    @Override // com.google.android.gms.internal.ads.IS
    public final String c() {
        return this.f76791c;
    }

    @Override // com.google.android.gms.internal.ads.IS
    public final String d() {
        return this.f76792d;
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
            if (this.f76789a.equals(is2.a()) && ((hVar = this.f76790b) != null ? hVar.equals(is2.b()) : is2.b() == null) && ((str = this.f76791c) != null ? str.equals(is2.c()) : is2.c() == null) && ((str2 = this.f76792d) != null ? str2.equals(is2.d()) : is2.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f76789a.hashCode() ^ 1000003;
        com.google.android.gms.ads.internal.overlay.h hVar = this.f76790b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (hVar == null ? 0 : hVar.hashCode())) * 1000003;
        String str = this.f76791c;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f76792d;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        com.google.android.gms.ads.internal.overlay.h hVar = this.f76790b;
        return "OfflineUtilsParams{activity=" + this.f76789a.toString() + ", adOverlay=" + String.valueOf(hVar) + ", gwsQueryId=" + this.f76791c + ", uri=" + this.f76792d + "}";
    }
}
