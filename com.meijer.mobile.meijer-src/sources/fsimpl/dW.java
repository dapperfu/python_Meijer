package fsimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes15.dex */
public class dW {

    /* renamed from: a, reason: collision with root package name */
    public dW f133278a;

    /* renamed from: b, reason: collision with root package name */
    public byte f133279b;

    /* renamed from: c, reason: collision with root package name */
    public String f133280c;

    /* renamed from: d, reason: collision with root package name */
    public String f133281d;

    /* renamed from: e, reason: collision with root package name */
    public Map f133282e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public Map f133283f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public Map f133284g = new HashMap();

    dW(dW dWVar, byte b10) {
        this.f133278a = dWVar;
        this.f133279b = b10;
    }

    private static String a(byte b10) {
        return (b10 < 0 || b10 >= cH.f133146a.length) ? "" : cH.a(b10);
    }

    private String a(String str) {
        if (str.equals("-")) {
            return "\\-";
        }
        StringBuilder sb2 = new StringBuilder();
        if (str.charAt(0) == '-') {
            sb2.append('-');
            str = str.substring(1);
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (('0' <= cCharAt && cCharAt <= '9') || (('a' <= cCharAt && cCharAt <= 'z') || (('A' <= cCharAt && cCharAt <= 'Z') || cCharAt == '-' || cCharAt == '_'))) {
                sb2.append(cCharAt);
            } else if ("[]:./\\()@#%^&*'\" ".indexOf(cCharAt) != -1) {
                sb2.append('\\').append(cCharAt);
            } else {
                sb2.append('\\').append(Integer.toHexString(cCharAt));
            }
        }
        return sb2.toString();
    }

    private String b() {
        int length = cI.f133147a.length;
        byte b10 = this.f133279b;
        return (b10 < 0 || b10 >= length) ? "" : cI.a(b10);
    }

    private String b(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder("\"");
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\"' || cCharAt == '\\') {
                sb2.append('\\').append(cCharAt);
            } else if (cCharAt < 31) {
                sb2.append('\\').append(Integer.toHexString(cCharAt));
            } else {
                sb2.append(cCharAt);
            }
        }
        sb2.append('\"');
        return sb2.toString();
    }

    public String a() {
        StringBuilder sbAppend;
        String strB;
        String strB2 = b();
        if (this.f133280c != null) {
            strB2 = strB2 + (this.f133280c.equals("*") ? this.f133280c : a(this.f133280c));
        }
        if (this.f133281d != null) {
            strB2 = strB2 + '#' + a(this.f133281d);
        }
        ArrayList arrayList = new ArrayList(this.f133282e.keySet());
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            strB2 = strB2 + '.' + a((String) it.next());
        }
        for (String str : this.f133284g.keySet()) {
            Byte b10 = (Byte) this.f133283f.get(str);
            if (b10 == null) {
                sbAppend = new StringBuilder().append(strB2).append('[');
                strB = a(str);
            } else {
                sbAppend = new StringBuilder().append(strB2).append('[').append(a(str)).append(a(b10.byteValue()));
                strB = b((String) this.f133284g.get(str));
            }
            strB2 = sbAppend.append(strB).append(']').toString();
        }
        return strB2;
    }

    public String toString() {
        return "[SelectorRules parent=" + this.f133278a + "; combinator=" + ((int) this.f133279b) + "; tag=" + this.f133280c + "; id=" + this.f133281d + "; classes=" + this.f133282e + "; attrs=" + this.f133284g + "; attrMatch=" + this.f133283f + "]";
    }
}
