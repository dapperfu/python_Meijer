package tc;

import android.util.Base64;
import rc.EnumC16886f;
import tc.d;

/* loaded from: classes4.dex */
public abstract class p {

    public static abstract class a {
        public abstract p a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(EnumC16886f enumC16886f);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract EnumC16886f d();

    public static a a() {
        return new d.b().d(EnumC16886f.DEFAULT);
    }

    public boolean e() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    public p f(EnumC16886f enumC16886f) {
        return a().b(b()).d(enumC16886f).c(c()).a();
    }

    public final String toString() {
        String strEncodeToString;
        String strB = b();
        EnumC16886f enumC16886fD = d();
        if (c() == null) {
            strEncodeToString = "";
        } else {
            strEncodeToString = Base64.encodeToString(c(), 2);
        }
        return String.format("TransportContext(%s, %s, %s)", strB, enumC16886fD, strEncodeToString);
    }
}
