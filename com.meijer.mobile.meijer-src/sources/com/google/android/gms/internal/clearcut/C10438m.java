package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Base64;
import com.fullstory.FS;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10438m extends AbstractC10417f {

    /* renamed from: m, reason: collision with root package name */
    private final Object f82367m;

    /* renamed from: n, reason: collision with root package name */
    private String f82368n;

    /* renamed from: o, reason: collision with root package name */
    private Object f82369o;

    /* renamed from: p, reason: collision with root package name */
    private final /* synthetic */ InterfaceC10444o f82370p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10438m(C10447p c10447p, String str, Object obj, InterfaceC10444o interfaceC10444o) {
        super(c10447p, str, obj, null);
        this.f82370p = interfaceC10444o;
        this.f82367m = new Object();
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10417f
    protected final Object f(SharedPreferences sharedPreferences) {
        try {
            return m(sharedPreferences.getString(this.f82262b, ""));
        } catch (ClassCastException e10) {
            String strValueOf = String.valueOf(this.f82262b);
            FS.log_e("PhenotypeFlag", strValueOf.length() != 0 ? "Invalid byte[] value in SharedPreferences for ".concat(strValueOf) : new String("Invalid byte[] value in SharedPreferences for "), e10);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10417f
    protected final Object m(String str) {
        Object obj;
        try {
            synchronized (this.f82367m) {
                try {
                    if (!str.equals(this.f82368n)) {
                        Object objZzb = this.f82370p.zzb(Base64.decode(str, 3));
                        this.f82368n = str;
                        this.f82369o = objZzb;
                    }
                    obj = this.f82369o;
                } finally {
                }
            }
            return obj;
        } catch (IOException | IllegalArgumentException unused) {
            String str2 = this.f82262b;
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
