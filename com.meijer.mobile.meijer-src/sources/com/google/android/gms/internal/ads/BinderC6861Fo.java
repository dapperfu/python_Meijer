package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C6660q;

/* renamed from: com.google.android.gms.internal.ads.Fo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC6861Fo extends AbstractBinderC6929Ho {

    /* renamed from: a, reason: collision with root package name */
    private final String f67699a;

    /* renamed from: b, reason: collision with root package name */
    private final int f67700b;

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof BinderC6861Fo)) {
            BinderC6861Fo binderC6861Fo = (BinderC6861Fo) obj;
            if (C6660q.a(this.f67699a, binderC6861Fo.f67699a)) {
                if (C6660q.a(Integer.valueOf(this.f67700b), Integer.valueOf(binderC6861Fo.f67700b))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6963Io
    public final int zzb() {
        return this.f67700b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6963Io
    public final String zzc() {
        return this.f67699a;
    }

    public BinderC6861Fo(String str, int i10) {
        this.f67699a = str;
        this.f67700b = i10;
    }
}
