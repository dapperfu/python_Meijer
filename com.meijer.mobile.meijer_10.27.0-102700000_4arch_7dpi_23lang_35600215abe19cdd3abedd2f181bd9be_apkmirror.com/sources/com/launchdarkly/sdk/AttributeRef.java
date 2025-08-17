package com.launchdarkly.sdk;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.medallia.digital.mobilesdk.q2;
import java.util.HashMap;
import java.util.Map;
import mg.InterfaceC15616b;

@InterfaceC15616b(AttributeRefTypeAdapter.class)
/* loaded from: classes7.dex */
public final class AttributeRef implements com.launchdarkly.sdk.json.c, Comparable<AttributeRef> {
    private static final Map<String, AttributeRef> COMMON_LITERALS = o("kind", "key", "name", "anonymous", "email", "firstName", "lastName", PlaceTypes.COUNTRY, "ip", "avatar");
    private final String[] components;
    private final String error;
    private final String rawPath;
    private final String singlePathComponent;

    private AttributeRef(String str, String str2, String[] strArr) {
        this.error = null;
        this.rawPath = str == null ? "" : str;
        this.singlePathComponent = str2;
        this.components = strArr;
    }

    public static AttributeRef b(String str) {
        if (str == null || str.isEmpty()) {
            return new AttributeRef("attribute reference cannot be empty", "");
        }
        if (str.charAt(0) != '/') {
            AttributeRef attributeRef = COMMON_LITERALS.get(str);
            return attributeRef == null ? new AttributeRef(str, str, null) : attributeRef;
        }
        return new AttributeRef(q2.f92724c + str.replace("~", "~0").replace(q2.f92724c, "~1"), str, null);
    }

    public static AttributeRef e(String str) {
        if (str == null || str.isEmpty() || str.equals(q2.f92724c)) {
            return new AttributeRef("attribute reference cannot be empty", str);
        }
        if (str.charAt(0) != '/') {
            return new AttributeRef(str, str, null);
        }
        if (str.indexOf(47, 1) < 0) {
            String strP = p(str.substring(1));
            return strP == null ? new AttributeRef("attribute reference contained an escape character (~) that was not followed by 0 or 1", str) : new AttributeRef(str, strP, null);
        }
        if (str.endsWith(q2.f92724c)) {
            return new AttributeRef("attribute reference contained a double slash or a trailing slash", str);
        }
        String[] strArrSplit = str.substring(1).split(q2.f92724c);
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String str2 = strArrSplit[i10];
            if (str2.isEmpty()) {
                return new AttributeRef("attribute reference contained a double slash or a trailing slash", str);
            }
            String strP2 = p(str2);
            if (strP2 == null) {
                return new AttributeRef("attribute reference contained an escape character (~) that was not followed by 0 or 1", str);
            }
            strArrSplit[i10] = strP2;
        }
        return new AttributeRef(str, null, strArrSplit);
    }

    private static Map<String, AttributeRef> o(String... strArr) {
        HashMap map = new HashMap();
        for (String str : strArr) {
            map.put(str, new AttributeRef(str, str, null));
        }
        return map;
    }

    private static String p(String str) {
        if (str.indexOf(126) < 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(100);
        int i10 = 0;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '~') {
                sb2.append(cCharAt);
            } else {
                i10++;
                if (i10 >= str.length()) {
                    return null;
                }
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 == '0') {
                    sb2.append('~');
                } else {
                    if (cCharAt2 != '1') {
                        return null;
                    }
                    sb2.append('/');
                }
            }
            i10++;
        }
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(AttributeRef attributeRef) {
        return this.rawPath.compareTo(attributeRef.rawPath);
    }

    public boolean equals(Object obj) {
        if (obj instanceof AttributeRef) {
            return this.rawPath.equals(((AttributeRef) obj).rawPath);
        }
        return false;
    }

    public int hashCode() {
        return this.rawPath.hashCode();
    }

    public String l(int i10) {
        String[] strArr = this.components;
        if (strArr == null) {
            if (i10 == 0) {
                return this.singlePathComponent;
            }
            return null;
        }
        if (i10 < 0 || i10 >= strArr.length) {
            return null;
        }
        return strArr[i10];
    }

    public int m() {
        if (this.error != null) {
            return 0;
        }
        String[] strArr = this.components;
        if (strArr == null) {
            return 1;
        }
        return strArr.length;
    }

    public String toString() {
        return this.rawPath;
    }

    private AttributeRef(String str, String str2) {
        this.error = str;
        this.rawPath = str2 == null ? "" : str2;
        this.singlePathComponent = null;
        this.components = null;
    }
}
