package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.fb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8137fb0 {

    /* renamed from: a, reason: collision with root package name */
    private final C7384Vb0 f74963a;

    /* renamed from: b, reason: collision with root package name */
    private final String f74964b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC7111Na0 f74965c;

    /* renamed from: d, reason: collision with root package name */
    private final String f74966d = "Ad overlay";

    public final EnumC7111Na0 a() {
        return this.f74965c;
    }

    public final C7384Vb0 b() {
        return this.f74963a;
    }

    public final String c() {
        return this.f74966d;
    }

    public final String d() {
        return this.f74964b;
    }

    public C8137fb0(View view, EnumC7111Na0 enumC7111Na0, String str) {
        this.f74963a = new C7384Vb0(view);
        this.f74964b = view.getClass().getCanonicalName();
        this.f74965c = enumC7111Na0;
    }
}
