package qc;

import qc.C16494e;

/* renamed from: qc.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC16504o {

    /* renamed from: qc.o$a */
    public static abstract class a {
        public abstract AbstractC16504o a();

        public abstract a b(AbstractC16490a abstractC16490a);

        public abstract a c(b bVar);
    }

    public abstract AbstractC16490a b();

    public abstract b c();

    /* renamed from: qc.o$b */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* renamed from: a, reason: collision with root package name */
        private final int f157130a;

        b(int i10) {
            this.f157130a = i10;
        }
    }

    public static a a() {
        return new C16494e.b();
    }
}
