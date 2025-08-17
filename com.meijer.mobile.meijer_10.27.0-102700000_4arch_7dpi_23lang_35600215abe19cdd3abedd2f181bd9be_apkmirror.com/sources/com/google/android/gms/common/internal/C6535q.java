package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6535q {

    /* renamed from: com.google.android.gms.common.internal.q$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f64927a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f64928b;

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f64928b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f64927a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) this.f64927a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }

        /* synthetic */ a(Object obj, Z z10) {
            r.l(obj);
            this.f64928b = obj;
            this.f64927a = new ArrayList();
        }

        public a a(String str, Object obj) {
            r.l(str);
            this.f64927a.add(str + "=" + String.valueOf(obj));
            return this;
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static a c(Object obj) {
        return new a(obj, null);
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
