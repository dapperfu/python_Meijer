package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzps;

@zzps(zza = zzr.class)
/* loaded from: classes4.dex */
public abstract class zzbe {
    private String companionId;

    private static zzbe create(String str, String str2, String str3, zzbd zzbdVar) {
        return new zzr(str, str2, str3, zzbdVar);
    }

    public abstract String clickThroughUrl();

    public String companionId() {
        return this.companionId;
    }

    public abstract String size();

    public abstract String src();

    public abstract zzbd type();

    public static zzbe create(String str, String str2, String str3, String str4, zzbd zzbdVar) {
        zzbe zzbeVarCreate = create(str2, str3, str4, zzbdVar);
        zzbeVarCreate.companionId = str;
        return zzbeVarCreate;
    }

    public final String toString() {
        return "CompanionData [companionId=" + companionId() + ", size=" + size() + ", src=" + src() + ", clickThroughUrl=" + clickThroughUrl() + ", type=" + String.valueOf(type()) + "]";
    }
}
