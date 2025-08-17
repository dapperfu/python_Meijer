package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.fullstory.FS;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.d;
import sd.g;
import td.C17082b;
import td.C17084d;
import td.C17086f;
import td.C17088h;
import td.C17090j;

@DynamiteApi
/* loaded from: classes4.dex */
public class FlagProviderImpl extends g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f65019a = false;

    /* renamed from: b, reason: collision with root package name */
    private SharedPreferences f65020b;

    @Override // sd.InterfaceC16939f
    public boolean getBooleanFlagValue(String str, boolean z10, int i10) {
        return !this.f65019a ? z10 : C17082b.a(this.f65020b, str, Boolean.valueOf(z10)).booleanValue();
    }

    @Override // sd.InterfaceC16939f
    public int getIntFlagValue(String str, int i10, int i11) {
        return !this.f65019a ? i10 : C17084d.a(this.f65020b, str, Integer.valueOf(i10)).intValue();
    }

    @Override // sd.InterfaceC16939f
    public long getLongFlagValue(String str, long j10, int i10) {
        return !this.f65019a ? j10 : C17086f.a(this.f65020b, str, Long.valueOf(j10)).longValue();
    }

    @Override // sd.InterfaceC16939f
    public String getStringFlagValue(String str, String str2, int i10) {
        return !this.f65019a ? str2 : C17088h.a(this.f65020b, str, str2);
    }

    @Override // sd.InterfaceC16939f
    public void init(b bVar) {
        String str;
        Context context = (Context) d.b2(bVar);
        if (!this.f65019a) {
            try {
                this.f65020b = C17090j.a(context.createPackageContext("com.google.android.gms", 0));
                this.f65019a = true;
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Exception e10) {
                String strValueOf = String.valueOf(e10.getMessage());
                if (strValueOf.length() != 0) {
                    str = "Could not retrieve sdk flags, continuing with defaults: ".concat(strValueOf);
                } else {
                    str = new String("Could not retrieve sdk flags, continuing with defaults: ");
                }
                FS.log_w("FlagProviderImpl", str);
            }
        }
    }
}
