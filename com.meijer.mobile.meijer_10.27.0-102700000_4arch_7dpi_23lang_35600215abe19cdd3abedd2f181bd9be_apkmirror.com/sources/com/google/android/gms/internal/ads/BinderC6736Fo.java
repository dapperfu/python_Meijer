package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C6535q;

/* renamed from: com.google.android.gms.internal.ads.Fo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC6736Fo extends AbstractBinderC6804Ho {

    /* renamed from: a, reason: collision with root package name */
    private final String f66859a;

    /* renamed from: b, reason: collision with root package name */
    private final int f66860b;

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof BinderC6736Fo)) {
            BinderC6736Fo binderC6736Fo = (BinderC6736Fo) obj;
            if (C6535q.a(this.f66859a, binderC6736Fo.f66859a)) {
                if (C6535q.a(Integer.valueOf(this.f66860b), Integer.valueOf(binderC6736Fo.f66860b))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6838Io
    public final int zzb() {
        return this.f66860b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6838Io
    public final String zzc() {
        return this.f66859a;
    }

    public BinderC6736Fo(String str, int i10) {
        this.f66859a = str;
        this.f66860b = i10;
    }
}
