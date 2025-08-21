package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.a;

/* renamed from: com.google.android.gms.common.internal.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6667y implements a.d {

    /* renamed from: c, reason: collision with root package name */
    public static final C6667y f65787c = c().a();

    /* renamed from: b, reason: collision with root package name */
    private final String f65788b;

    /* renamed from: com.google.android.gms.common.internal.y$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f65789a;

        /* synthetic */ a(B b10) {
        }

        public C6667y a() {
            return new C6667y(this.f65789a, null);
        }

        public a b(String str) {
            this.f65789a = str;
            return this;
        }
    }

    /* synthetic */ C6667y(String str, C c10) {
        this.f65788b = str;
    }

    public static a c() {
        return new a(null);
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        String str = this.f65788b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6667y) {
            return C6660q.a(this.f65788b, ((C6667y) obj).f65788b);
        }
        return false;
    }

    public final int hashCode() {
        return C6660q.b(this.f65788b);
    }
}
