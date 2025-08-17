package fsimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes14.dex */
public class dW {

    /* renamed from: a, reason: collision with root package name */
    public dW f132028a;

    /* renamed from: b, reason: collision with root package name */
    public byte f132029b;

    /* renamed from: c, reason: collision with root package name */
    public String f132030c;

    /* renamed from: d, reason: collision with root package name */
    public String f132031d;

    /* renamed from: e, reason: collision with root package name */
    public Map f132032e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public Map f132033f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public Map f132034g = new HashMap();

    dW(dW dWVar, byte b10) {
        this.f132028a = dWVar;
        this.f132029b = b10;
    }

    private static String a(byte b10) {
        return (b10 < 0 || b10 >= cH.f131896a.length) ? "" : cH.a(b10);
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
        int length = cI.f131897a.length;
        byte b10 = this.f132029b;
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
        if (this.f132030c != null) {
            strB2 = strB2 + (this.f132030c.equals("*") ? this.f132030c : a(this.f132030c));
        }
        if (this.f132031d != null) {
            strB2 = strB2 + '#' + a(this.f132031d);
        }
        ArrayList arrayList = new ArrayList(this.f132032e.keySet());
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            strB2 = strB2 + '.' + a((String) it.next());
        }
        for (String str : this.f132034g.keySet()) {
            Byte b10 = (Byte) this.f132033f.get(str);
            if (b10 == null) {
                sbAppend = new StringBuilder().append(strB2).append('[');
                strB = a(str);
            } else {
                sbAppend = new StringBuilder().append(strB2).append('[').append(a(str)).append(a(b10.byteValue()));
                strB = b((String) this.f132034g.get(str));
            }
            strB2 = sbAppend.append(strB).append(']').toString();
        }
        return strB2;
    }

    public String toString() {
        return "[SelectorRules parent=" + this.f132028a + "; combinator=" + ((int) this.f132029b) + "; tag=" + this.f132030c + "; id=" + this.f132031d + "; classes=" + this.f132032e + "; attrs=" + this.f132034g + "; attrMatch=" + this.f132033f + "]";
    }
}
