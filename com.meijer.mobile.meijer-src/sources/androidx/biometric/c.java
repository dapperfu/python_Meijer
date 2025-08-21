package androidx.biometric;

import java.util.Arrays;

/* loaded from: classes.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private final int f47304a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f47305b;

    private static String a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    private boolean d(CharSequence charSequence) {
        String strA = a(this.f47305b);
        String strA2 = a(charSequence);
        if (strA == null && strA2 == null) {
            return true;
        }
        return strA != null && strA.equals(strA2);
    }

    int b() {
        return this.f47304a;
    }

    CharSequence c() {
        return this.f47305b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f47304a == cVar.f47304a && d(cVar.f47305b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f47304a), a(this.f47305b)});
    }

    c(int i10, CharSequence charSequence) {
        this.f47304a = i10;
        this.f47305b = charSequence;
    }
}
