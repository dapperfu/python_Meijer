package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.gms.internal.ads.iS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8322iS extends AbstractC8855nS {

    /* renamed from: a, reason: collision with root package name */
    private final String f74962a;

    /* renamed from: b, reason: collision with root package name */
    private final String f74963b;

    /* renamed from: c, reason: collision with root package name */
    private final Drawable f74964c;

    @Override // com.google.android.gms.internal.ads.AbstractC8855nS
    final Drawable a() {
        return this.f74964c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8855nS
    final String b() {
        return this.f74962a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8855nS
    final String c() {
        return this.f74963b;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8855nS) {
            AbstractC8855nS abstractC8855nS = (AbstractC8855nS) obj;
            String str = this.f74962a;
            if (str != null ? str.equals(abstractC8855nS.b()) : abstractC8855nS.b() == null) {
                if (this.f74963b.equals(abstractC8855nS.c()) && ((drawable = this.f74964c) != null ? drawable.equals(abstractC8855nS.a()) : abstractC8855nS.a() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f74962a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f74963b.hashCode();
        Drawable drawable = this.f74964c;
        return (iHashCode * 1000003) ^ (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        return "OfflineAdAssets{advertiserName=" + this.f74962a + ", imageUrl=" + this.f74963b + ", icon=" + String.valueOf(this.f74964c) + "}";
    }

    C8322iS(String str, String str2, Drawable drawable) {
        this.f74962a = str;
        if (str2 != null) {
            this.f74963b = str2;
            this.f74964c = drawable;
            return;
        }
        throw new NullPointerException("Null imageUrl");
    }
}
