package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.gms.internal.ads.iS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8447iS extends AbstractC8980nS {

    /* renamed from: a, reason: collision with root package name */
    private final String f75802a;

    /* renamed from: b, reason: collision with root package name */
    private final String f75803b;

    /* renamed from: c, reason: collision with root package name */
    private final Drawable f75804c;

    @Override // com.google.android.gms.internal.ads.AbstractC8980nS
    final Drawable a() {
        return this.f75804c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8980nS
    final String b() {
        return this.f75802a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8980nS
    final String c() {
        return this.f75803b;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8980nS) {
            AbstractC8980nS abstractC8980nS = (AbstractC8980nS) obj;
            String str = this.f75802a;
            if (str != null ? str.equals(abstractC8980nS.b()) : abstractC8980nS.b() == null) {
                if (this.f75803b.equals(abstractC8980nS.c()) && ((drawable = this.f75804c) != null ? drawable.equals(abstractC8980nS.a()) : abstractC8980nS.a() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f75802a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f75803b.hashCode();
        Drawable drawable = this.f75804c;
        return (iHashCode * 1000003) ^ (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        return "OfflineAdAssets{advertiserName=" + this.f75802a + ", imageUrl=" + this.f75803b + ", icon=" + String.valueOf(this.f75804c) + "}";
    }

    C8447iS(String str, String str2, Drawable drawable) {
        this.f75802a = str;
        if (str2 != null) {
            this.f75803b = str2;
            this.f75804c = drawable;
            return;
        }
        throw new NullPointerException("Null imageUrl");
    }
}
