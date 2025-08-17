package k8;

import com.medallia.digital.mobilesdk.q2;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: k8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15116b {
    static String[] c(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                String strTrim = str.trim();
                if (strTrim.length() > 0) {
                    arrayList.add(strTrim);
                }
            }
        }
        if (arrayList.size() > 0) {
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        return null;
    }

    static String b(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.length() > 0) {
            return strTrim;
        }
        return null;
    }

    static String a(String str) {
        String strB = b(str);
        if (strB == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("^(https?://)?([^\\s/$.?#](?::?[^\\s?]*\\@)?[^\\s/:?]*(?::[\\d]+)?)(?:/|$)([^\\s?]*)").matcher(strB);
        matcher.find();
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        String strGroup2 = matcher.group(2);
        String strGroup3 = matcher.group(3);
        if (strGroup2 == null || strGroup2.isEmpty() || strGroup3 == null || strGroup3.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (strGroup == null) {
            strGroup = "https://";
        }
        sb2.append(strGroup);
        sb2.append(strGroup2);
        if (!strGroup3.isEmpty()) {
            sb2.append(q2.f92724c);
            if (strGroup3.endsWith(q2.f92724c)) {
                sb2.append((CharSequence) strGroup3, 0, strGroup3.length() - 1);
            } else {
                sb2.append(strGroup3);
            }
        }
        return sb2.toString();
    }
}
