package j$.time.format;

import java.text.ParsePosition;

/* loaded from: classes3.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public String f138859a;

    /* renamed from: b, reason: collision with root package name */
    public String f138860b;

    /* renamed from: c, reason: collision with root package name */
    public final char f138861c;

    /* renamed from: d, reason: collision with root package name */
    public n f138862d;

    /* renamed from: e, reason: collision with root package name */
    public n f138863e;

    public boolean b(char c10, char c11) {
        return c10 == c11;
    }

    public n(String str, String str2, n nVar) {
        this.f138859a = str;
        this.f138860b = str2;
        this.f138862d = nVar;
        if (str.isEmpty()) {
            this.f138861c = (char) 65535;
        } else {
            this.f138861c = this.f138859a.charAt(0);
        }
    }

    public final String c(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!e(charSequence, index, length)) {
            return null;
        }
        int length2 = this.f138859a.length() + index;
        n nVar = this.f138862d;
        if (nVar != null && length2 != length) {
            while (true) {
                if (b(nVar.f138861c, charSequence.charAt(length2))) {
                    parsePosition.setIndex(length2);
                    String strC = nVar.c(charSequence, parsePosition);
                    if (strC != null) {
                        return strC;
                    }
                } else {
                    nVar = nVar.f138863e;
                    if (nVar == null) {
                        break;
                    }
                }
            }
        }
        parsePosition.setIndex(length2);
        return this.f138860b;
    }

    public n d(String str, String str2, n nVar) {
        return new n(str, str2, nVar);
    }

    public boolean e(CharSequence charSequence, int i10, int i11) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f138859a, i10);
        }
        int length = this.f138859a.length();
        if (length > i11 - i10) {
            return false;
        }
        int i12 = 0;
        while (true) {
            int i13 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i14 = i12 + 1;
            int i15 = i10 + 1;
            if (!b(this.f138859a.charAt(i12), charSequence.charAt(i10))) {
                return false;
            }
            i10 = i15;
            length = i13;
            i12 = i14;
        }
    }

    public final boolean a(String str, String str2) {
        int i10 = 0;
        while (i10 < str.length() && i10 < this.f138859a.length() && b(str.charAt(i10), this.f138859a.charAt(i10))) {
            i10++;
        }
        if (i10 == this.f138859a.length()) {
            if (i10 < str.length()) {
                String strSubstring = str.substring(i10);
                for (n nVar = this.f138862d; nVar != null; nVar = nVar.f138863e) {
                    if (b(nVar.f138861c, strSubstring.charAt(0))) {
                        return nVar.a(strSubstring, str2);
                    }
                }
                n nVarD = d(strSubstring, str2, null);
                nVarD.f138863e = this.f138862d;
                this.f138862d = nVarD;
                return true;
            }
            this.f138860b = str2;
            return true;
        }
        n nVarD2 = d(this.f138859a.substring(i10), this.f138860b, this.f138862d);
        this.f138859a = str.substring(0, i10);
        this.f138862d = nVarD2;
        if (i10 < str.length()) {
            this.f138862d.f138863e = d(str.substring(i10), str2, null);
            this.f138860b = null;
            return true;
        }
        this.f138860b = str2;
        return true;
    }
}
