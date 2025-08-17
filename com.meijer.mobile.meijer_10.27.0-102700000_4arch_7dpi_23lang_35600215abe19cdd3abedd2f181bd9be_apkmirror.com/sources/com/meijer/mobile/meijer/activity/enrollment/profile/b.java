package com.meijer.mobile.meijer.activity.enrollment.profile;

import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\b\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "", "f", "(Ljava/lang/String;)Z", "g", "e", "email", "h", "(Ljava/lang/String;)Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (Character.isLowerCase(str.charAt(i10))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (Character.isDigit(str.charAt(i10))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (Character.isUpperCase(str.charAt(i10))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(String str) {
        if (StringsKt.c0(str, "@", false, 2, null)) {
            List<String> listM = new Regex("@").m(str, 0);
            if (!listM.isEmpty()) {
                str = listM.get(0);
            }
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
