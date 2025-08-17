package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.k5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8498k5 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f75574a;

    /* renamed from: b, reason: collision with root package name */
    public final String f75575b;

    /* renamed from: c, reason: collision with root package name */
    public final List f75576c;

    /* renamed from: d, reason: collision with root package name */
    public final String f75577d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC7917eh0 f75578e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f75579f;

    /* renamed from: g, reason: collision with root package name */
    public final long f75580g;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8498k5)) {
            return false;
        }
        C8498k5 c8498k5 = (C8498k5) obj;
        if (this.f75574a.equals(c8498k5.f75574a) && this.f75576c.equals(c8498k5.f75576c) && this.f75578e.equals(c8498k5.f75578e)) {
            Object obj2 = -9223372036854775807L;
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) (((((((this.f75574a.hashCode() * 923521) + this.f75576c.hashCode()) * 961) + this.f75578e.hashCode()) * 31) * 31) - Long.MAX_VALUE);
    }

    /* synthetic */ C8498k5(Uri uri, String str, I3 i32, C7850e1 c7850e1, List list, String str2, AbstractC7917eh0 abstractC7917eh0, Object obj, long j10, C8076g7 c8076g7) {
        this.f75574a = uri;
        int i10 = C7057Pc.f69380c;
        this.f75575b = null;
        this.f75576c = list;
        this.f75577d = null;
        this.f75578e = abstractC7917eh0;
        C7598bh0 c7598bh0 = new C7598bh0();
        if (abstractC7917eh0.size() <= 0) {
            c7598bh0.j();
            this.f75579f = null;
            this.f75580g = -9223372036854775807L;
            return;
        }
        throw null;
    }
}
