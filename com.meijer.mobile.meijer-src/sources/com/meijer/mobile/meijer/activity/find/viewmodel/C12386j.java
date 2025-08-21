package com.meijer.mobile.meijer.activity.find.viewmodel;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "uri", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C12386j {
    public static final String a(String uri) {
        List<String> listB;
        Intrinsics.j(uri, "uri");
        MatchResult matchResultD = Regex.d(new Regex("department=([^&]+)"), uri, 0, 2, null);
        if (matchResultD == null || (listB = matchResultD.b()) == null) {
            return null;
        }
        return listB.get(1);
    }
}
