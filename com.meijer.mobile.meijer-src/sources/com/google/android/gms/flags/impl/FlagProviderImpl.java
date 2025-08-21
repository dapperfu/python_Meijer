package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.fullstory.FS;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.d;
import ud.g;
import vd.C17657b;
import vd.C17659d;
import vd.C17661f;
import vd.C17663h;
import vd.C17665j;

@DynamiteApi
/* loaded from: classes4.dex */
public class FlagProviderImpl extends g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f65859a = false;

    /* renamed from: b, reason: collision with root package name */
    private SharedPreferences f65860b;

    @Override // ud.InterfaceC17386f
    public boolean getBooleanFlagValue(String str, boolean z10, int i10) {
        return !this.f65859a ? z10 : C17657b.a(this.f65860b, str, Boolean.valueOf(z10)).booleanValue();
    }

    @Override // ud.InterfaceC17386f
    public int getIntFlagValue(String str, int i10, int i11) {
        return !this.f65859a ? i10 : C17659d.a(this.f65860b, str, Integer.valueOf(i10)).intValue();
    }

    @Override // ud.InterfaceC17386f
    public long getLongFlagValue(String str, long j10, int i10) {
        return !this.f65859a ? j10 : C17661f.a(this.f65860b, str, Long.valueOf(j10)).longValue();
    }

    @Override // ud.InterfaceC17386f
    public String getStringFlagValue(String str, String str2, int i10) {
        return !this.f65859a ? str2 : C17663h.a(this.f65860b, str, str2);
    }

    @Override // ud.InterfaceC17386f
    public void init(b bVar) {
        String str;
        Context context = (Context) d.c2(bVar);
        if (!this.f65859a) {
            try {
                this.f65860b = C17665j.a(context.createPackageContext("com.google.android.gms", 0));
                this.f65859a = true;
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
