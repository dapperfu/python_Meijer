package androidx.biometric;

import java.util.Arrays;

/* loaded from: classes.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private final int f47080a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f47081b;

    private static String a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    private boolean d(CharSequence charSequence) {
        String strA = a(this.f47081b);
        String strA2 = a(charSequence);
        if (strA == null && strA2 == null) {
            return true;
        }
        return strA != null && strA.equals(strA2);
    }

    int b() {
        return this.f47080a;
    }

    CharSequence c() {
        return this.f47081b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f47080a == cVar.f47080a && d(cVar.f47081b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f47080a), a(this.f47081b)});
    }

    c(int i10, CharSequence charSequence) {
        this.f47080a = i10;
        this.f47081b = charSequence;
    }
}
