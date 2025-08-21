package Be;

import android.os.Parcelable;

/* loaded from: classes4.dex */
public abstract class d implements Parcelable {

    public static abstract class a {
        public abstract d a();

        public abstract a b(String str);

        public abstract a c(String str);

        public abstract a d(int i10);

        public abstract a e(String str);

        public abstract a f(int i10);
    }

    public abstract String E0();

    public abstract String b();

    public abstract String c();

    public abstract int getHeight();

    public abstract int getWidth();

    public static a a() {
        k kVar = new k();
        kVar.f(0);
        kVar.d(0);
        kVar.b("");
        kVar.c("");
        kVar.e("");
        return kVar;
    }
}
