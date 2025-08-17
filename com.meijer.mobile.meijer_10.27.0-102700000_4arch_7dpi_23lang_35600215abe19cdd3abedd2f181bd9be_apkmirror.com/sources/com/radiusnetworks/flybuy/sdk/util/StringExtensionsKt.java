package com.radiusnetworks.flybuy.sdk.util;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"snakeCaseToTitleCaseUS", "", "common_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StringExtensionsKt {
    public static final String snakeCaseToTitleCaseUS(final String str) {
        Intrinsics.j(str, "<this>");
        return CollectionsKt.B0(StringsKt.a1(str, new String[]{"_"}, false, 0, 6, null), " ", null, null, 0, null, new Function1<String, CharSequence>() { // from class: com.radiusnetworks.flybuy.sdk.util.StringExtensionsKt.snakeCaseToTitleCaseUS.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(String it) {
                String strValueOf;
                Intrinsics.j(it, "it");
                String str2 = str;
                if (str2.length() <= 0) {
                    return str2;
                }
                StringBuilder sb2 = new StringBuilder();
                char cCharAt = str2.charAt(0);
                if (Character.isLowerCase(cCharAt)) {
                    Locale US = Locale.US;
                    Intrinsics.i(US, "US");
                    strValueOf = CharsKt.e(cCharAt, US);
                } else {
                    strValueOf = String.valueOf(cCharAt);
                }
                sb2.append((Object) strValueOf);
                String strSubstring = str2.substring(1);
                Intrinsics.i(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring);
                return sb2.toString();
            }
        }, 30, null);
    }
}
