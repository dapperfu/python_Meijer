package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes8.dex */
public class u6 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f93991a = "SDK_CURRENT_VERSION";

    protected enum a {
        SUPPORTED,
        DEPRECATED,
        TERMINATED
    }

    protected static a a(String str, t6 t6Var) {
        String message;
        ArrayList<String> arrayList;
        int i10;
        String[] strArrSplit;
        if (t6Var != null && t6Var.d() != null) {
            int iB = t6Var.b();
            int iA = t6Var.a();
            try {
                arrayList = new ArrayList<>(t6Var.d());
                i10 = 0;
                Collections.sort(arrayList, new o5(false));
                a4.e("SDK versions: " + ModelFactory.getInstance().getStringArrayAsJsonString(arrayList));
                strArrSplit = str.split("\\.");
            } catch (Exception e10) {
                message = e10.getMessage();
            }
            if (strArrSplit.length <= 1) {
                a4.c("Short SDK version error");
                return null;
            }
            String str2 = strArrSplit[0] + "." + strArrSplit[1];
            a4.e("SDK short version: " + str2);
            while (i10 < arrayList.size()) {
                if (arrayList.get(i10).equals(str2)) {
                    return i10 < iB ? a.SUPPORTED : i10 < iA ? a.DEPRECATED : a.TERMINATED;
                }
                i10++;
            }
            return null;
        }
        message = "SDK versions - null";
        a4.c(message);
        return null;
    }

    protected static void a(t6 t6Var) {
        String str;
        a aVarA = a("4.8.1", t6Var);
        if (aVarA == null || aVarA == a.SUPPORTED || t6Var.c() == null || t6Var.c().isEmpty() || !t6Var.c().containsKey(aVarA.name().toLowerCase()) || (str = t6Var.c().get(aVarA.name().toLowerCase())) == null) {
            return;
        }
        a4.f(str.replace(f93991a, "4.8.1"));
    }
}
