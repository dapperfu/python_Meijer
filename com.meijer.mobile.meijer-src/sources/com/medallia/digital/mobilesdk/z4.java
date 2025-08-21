package com.medallia.digital.mobilesdk;

/* loaded from: classes8.dex */
public enum z4 {
    select,
    end,
    delete,
    replace,
    cancel,
    ok,
    permission,
    videoTimeLimitation,
    forceDelete;

    protected static z4 a(String str) {
        z4 z4Var = select;
        if (z4Var.name().equals(str)) {
            return z4Var;
        }
        z4 z4Var2 = end;
        if (z4Var2.name().equals(str)) {
            return z4Var2;
        }
        z4 z4Var3 = delete;
        if (z4Var3.name().equals(str)) {
            return z4Var3;
        }
        z4 z4Var4 = replace;
        if (z4Var4.name().equals(str)) {
            return z4Var4;
        }
        z4 z4Var5 = cancel;
        if (z4Var5.name().equals(str)) {
            return z4Var5;
        }
        z4 z4Var6 = ok;
        if (z4Var6.name().equals(str)) {
            return z4Var6;
        }
        z4 z4Var7 = permission;
        if (z4Var7.name().equals(str)) {
            return z4Var7;
        }
        z4 z4Var8 = videoTimeLimitation;
        if (z4Var8.name().equals(str)) {
            return z4Var8;
        }
        z4 z4Var9 = forceDelete;
        if (z4Var9.name().equals(str)) {
            return z4Var9;
        }
        return null;
    }
}
