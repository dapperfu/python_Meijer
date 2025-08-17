package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Base64;
import com.fullstory.FS;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10313m extends AbstractC10292f {

    /* renamed from: m, reason: collision with root package name */
    private final Object f81527m;

    /* renamed from: n, reason: collision with root package name */
    private String f81528n;

    /* renamed from: o, reason: collision with root package name */
    private Object f81529o;

    /* renamed from: p, reason: collision with root package name */
    private final /* synthetic */ InterfaceC10319o f81530p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10313m(C10322p c10322p, String str, Object obj, InterfaceC10319o interfaceC10319o) {
        super(c10322p, str, obj, null);
        this.f81530p = interfaceC10319o;
        this.f81527m = new Object();
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10292f
    protected final Object f(SharedPreferences sharedPreferences) {
        try {
            return m(sharedPreferences.getString(this.f81422b, ""));
        } catch (ClassCastException e10) {
            String strValueOf = String.valueOf(this.f81422b);
            FS.log_e("PhenotypeFlag", strValueOf.length() != 0 ? "Invalid byte[] value in SharedPreferences for ".concat(strValueOf) : new String("Invalid byte[] value in SharedPreferences for "), e10);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10292f
    protected final Object m(String str) {
        Object obj;
        try {
            synchronized (this.f81527m) {
                try {
                    if (!str.equals(this.f81528n)) {
                        Object objZzb = this.f81530p.zzb(Base64.decode(str, 3));
                        this.f81528n = str;
                        this.f81529o = objZzb;
                    }
                    obj = this.f81529o;
                } finally {
                }
            }
            return obj;
        } catch (IOException | IllegalArgumentException unused) {
            String str2 = this.f81422b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 27 + String.valueOf(str).length());
            sb2.append("Invalid byte[] value for ");
            sb2.append(str2);
            sb2.append(": ");
            sb2.append(str);
            FS.log_e("PhenotypeFlag", sb2.toString());
            return null;
        }
    }
}
