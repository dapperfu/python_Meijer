package Al;

import com.launchdarkly.sdk.LDContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import yk.C18328d;
import yo.MeijerUser;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\t\u001a\u00020\b*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyo/c;", "", "platform", "appVersion", "build", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "Lcom/launchdarkly/sdk/LDContext;", "b", "(Lyo/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/launchdarkly/sdk/LDContext;", "featureflag_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int c() {
        return 0;
    }

    public static final LDContext b(MeijerUser meijerUser, String str, String str2, String str3, Integer num) {
        Intrinsics.j(meijerUser, "<this>");
        String externalShopperId = meijerUser.getExternalShopperId();
        if (StringsKt.s0(externalShopperId)) {
            externalShopperId = "placeholderAnonymous";
        }
        com.launchdarkly.sdk.c cVarA = LDContext.b(externalShopperId).a(StringsKt.s0(meijerUser.getExternalShopperId()));
        String email = meijerUser.getEmail();
        if (StringsKt.s0(email)) {
            email = null;
        }
        com.launchdarkly.sdk.c cVarK = cVarA.k("email", email);
        String firstName = meijerUser.getFirstName();
        if (StringsKt.s0(firstName)) {
            firstName = null;
        }
        com.launchdarkly.sdk.c cVarK2 = cVarK.k("firstName", firstName);
        String lastName = meijerUser.getLastName();
        com.launchdarkly.sdk.c cVarL = cVarK2.k("lastName", StringsKt.s0(lastName) ? null : lastName).l("isLoggedIn", meijerUser.getIsLoggedIn());
        if (str == null) {
            str = "Android";
        }
        com.launchdarkly.sdk.c cVarK3 = cVarL.k("platform", str);
        if (str2 == null) {
            str2 = "";
        }
        com.launchdarkly.sdk.c cVarK4 = cVarK3.k("appVersion", str2);
        if (str3 == null) {
            str3 = "";
        }
        com.launchdarkly.sdk.c cVarL2 = cVarK4.k("build", str3).k("mPerksVersion", meijerUser.getMPerksVersion()).l("oktaAuthenticated", meijerUser.getIsOktaAuthenticated());
        cVarL2.k("storeId", String.valueOf(C18328d.b(num, new Function0() { // from class: Al.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(b.c());
            }
        })));
        LDContext lDContextB = cVarL2.b();
        Intrinsics.i(lDContextB, "build(...)");
        return lDContextB;
    }
}
