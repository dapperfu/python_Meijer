package cj;

import Vs.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a)\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LVs/p;", "", "newExpiresIn", "", "newRefreshToken", "a", "(LVs/p;ILjava/lang/String;)LVs/p;", "okta_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: cj.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6519f {
    public static final p a(p pVar, int i10, String str) {
        Intrinsics.j(pVar, "<this>");
        return new p(pVar.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), pVar.getTokenType(), i10, pVar.getAccessToken(), pVar.getScope(), str, pVar.getIdToken(), pVar.getDeviceSecret(), pVar.getIssuedTokenType(), pVar.getOidcConfiguration());
    }
}
