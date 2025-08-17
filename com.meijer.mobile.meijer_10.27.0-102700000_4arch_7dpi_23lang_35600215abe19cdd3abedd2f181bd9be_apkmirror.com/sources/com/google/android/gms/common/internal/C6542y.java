package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.a;

/* renamed from: com.google.android.gms.common.internal.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6542y implements a.d {

    /* renamed from: c, reason: collision with root package name */
    public static final C6542y f64947c = c().a();

    /* renamed from: b, reason: collision with root package name */
    private final String f64948b;

    /* renamed from: com.google.android.gms.common.internal.y$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f64949a;

        /* synthetic */ a(B b10) {
        }

        public C6542y a() {
            return new C6542y(this.f64949a, null);
        }

        public a b(String str) {
            this.f64949a = str;
            return this;
        }
    }

    /* synthetic */ C6542y(String str, C c10) {
        this.f64948b = str;
    }

    public static a c() {
        return new a(null);
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        String str = this.f64948b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6542y) {
            return C6535q.a(this.f64948b, ((C6542y) obj).f64948b);
        }
        return false;
    }

    public final int hashCode() {
        return C6535q.b(this.f64948b);
    }
}
