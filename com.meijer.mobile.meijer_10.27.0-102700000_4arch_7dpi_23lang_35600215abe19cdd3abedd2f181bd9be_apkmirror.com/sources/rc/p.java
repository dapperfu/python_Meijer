package rc;

import android.util.Base64;
import pc.EnumC16282f;
import rc.d;

/* loaded from: classes4.dex */
public abstract class p {

    public static abstract class a {
        public abstract p a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(EnumC16282f enumC16282f);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract EnumC16282f d();

    public static a a() {
        return new d.b().d(EnumC16282f.DEFAULT);
    }

    public boolean e() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    public p f(EnumC16282f enumC16282f) {
        return a().b(b()).d(enumC16282f).c(c()).a();
    }

    public final String toString() {
        String strEncodeToString;
        String strB = b();
        EnumC16282f enumC16282fD = d();
        if (c() == null) {
            strEncodeToString = "";
        } else {
            strEncodeToString = Base64.encodeToString(c(), 2);
        }
        return String.format("TransportContext(%s, %s, %s)", strB, enumC16282fD, strEncodeToString);
    }
}
