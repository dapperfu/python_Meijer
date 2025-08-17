package ze;

import android.os.Parcelable;

/* renamed from: ze.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC18449d implements Parcelable {

    /* renamed from: ze.d$a */
    public static abstract class a {
        public abstract AbstractC18449d a();

        public abstract a b(String str);

        public abstract a c(String str);

        public abstract a d(int i10);

        public abstract a e(String str);

        public abstract a f(int i10);
    }

    public abstract String F0();

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
