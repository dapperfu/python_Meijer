package com.meijer.mobile.meijer.activity.find.viewmodel;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class T1 {
    public static final String a(String str) {
        List<String> listB;
        Intrinsics.j(str, "<this>");
        MatchResult matchResultD = Regex.d(new Regex("cmpid=([^&]+)"), str, 0, 2, null);
        if (matchResultD == null || (listB = matchResultD.b()) == null) {
            return null;
        }
        return listB.get(1);
    }
}
