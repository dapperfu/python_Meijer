package Fu;

/* loaded from: classes8.dex */
public abstract class j {

    public static abstract class b extends j {
        b() {
            super();
        }

        public abstract String b();

        public abstract String c();

        public abstract String d();

        public static b a(String str, String str2, String str3) {
            boolean z10;
            if (Eu.b.b(str) && str.length() <= 255) {
                z10 = true;
            } else {
                z10 = false;
            }
            Eu.c.a(z10, "Name should be a ASCII string with a length no greater than 255 characters.");
            return new e(str, str2, str3);
        }
    }

    private j() {
    }
}
