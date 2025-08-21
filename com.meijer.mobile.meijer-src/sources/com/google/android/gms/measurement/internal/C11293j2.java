package com.google.android.gms.measurement.internal;

import Qd.InterfaceC4680l;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.j2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11293j2 {

    /* renamed from: b, reason: collision with root package name */
    protected static final AtomicReference f86476b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    protected static final AtomicReference f86477c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    protected static final AtomicReference f86478d = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4680l f86479a;

    protected final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f86479a.zza() ? str : g(str, Qd.w.f28076c, Qd.w.f28074a, f86476b);
    }

    protected final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f86479a.zza() ? str : g(str, Qd.x.f28079b, Qd.x.f28078a, f86477c);
    }

    protected final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f86479a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return g(str, Qd.y.f28083b, Qd.y.f28082a, f86478d);
        }
        return "experiment_id(" + str + ")";
    }

    protected final String d(G g10) {
        InterfaceC4680l interfaceC4680l = this.f86479a;
        if (!interfaceC4680l.zza()) {
            return g10.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(g10.f85863c);
        sb2.append(",name=");
        sb2.append(a(g10.f85861a));
        sb2.append(",params=");
        E e10 = g10.f85862b;
        sb2.append(e10 == null ? null : !interfaceC4680l.zza() ? e10.toString() : e(e10.U0()));
        return sb2.toString();
    }

    protected final String e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f86479a.zza()) {
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

    public C11293j2(InterfaceC4680l interfaceC4680l) {
        this.f86479a = interfaceC4680l;
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
