package com.google.android.gms.measurement.internal;

import Od.InterfaceC4474l;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.j2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11168j2 {

    /* renamed from: b, reason: collision with root package name */
    protected static final AtomicReference f85636b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    protected static final AtomicReference f85637c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    protected static final AtomicReference f85638d = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4474l f85639a;

    protected final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f85639a.zza() ? str : g(str, Od.w.f23588c, Od.w.f23586a, f85636b);
    }

    protected final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f85639a.zza() ? str : g(str, Od.x.f23591b, Od.x.f23590a, f85637c);
    }

    protected final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f85639a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return g(str, Od.y.f23595b, Od.y.f23594a, f85638d);
        }
        return "experiment_id(" + str + ")";
    }

    protected final String d(G g10) {
        InterfaceC4474l interfaceC4474l = this.f85639a;
        if (!interfaceC4474l.zza()) {
            return g10.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(g10.f85023c);
        sb2.append(",name=");
        sb2.append(a(g10.f85021a));
        sb2.append(",params=");
        E e10 = g10.f85022b;
        sb2.append(e10 == null ? null : !interfaceC4474l.zza() ? e10.toString() : e(e10.W0()));
        return sb2.toString();
    }

    protected final String e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f85639a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(b(str));
            sb2.append("=");
            Object obj = bundle.get(str);
            sb2.append(obj instanceof Bundle ? f(new Object[]{obj}) : obj instanceof Object[] ? f((Object[]) obj) : obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb2.append("}]");
        return sb2.toString();
    }

    protected final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Object obj : objArr) {
            String strE = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (strE != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(strE);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public C11168j2(InterfaceC4474l interfaceC4474l) {
        this.f85639a = interfaceC4474l;
    }

    private static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z10;
        String str2;
        com.google.android.gms.common.internal.r.l(strArr);
        com.google.android.gms.common.internal.r.l(strArr2);
        com.google.android.gms.common.internal.r.l(atomicReference);
        if (strArr.length == strArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.google.android.gms.common.internal.r.a(z10);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (Objects.equals(str, strArr[i10])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i10];
                        if (str2 == null) {
                            str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                            strArr3[i10] = str2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        }
        return str;
    }
}
