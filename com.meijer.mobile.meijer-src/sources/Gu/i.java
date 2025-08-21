package Gu;

/* loaded from: classes8.dex */
public abstract class i {
    public abstract a b();

    public enum a {
        NO_PROPAGATION(0),
        UNLIMITED_PROPAGATION(-1);


        /* renamed from: a, reason: collision with root package name */
        private final int f13257a;

        a(int i10) {
            this.f13257a = i10;
        }
    }

    public static i a(a aVar) {
        return new b(aVar);
    }

    i() {
    }
}
