package Ku;

/* loaded from: classes7.dex */
public abstract class i {
    public abstract a b();

    public enum a {
        NO_PROPAGATION(0),
        UNLIMITED_PROPAGATION(-1);


        /* renamed from: a, reason: collision with root package name */
        private final int f17574a;

        a(int i10) {
            this.f17574a = i10;
        }
    }

    public static i a(a aVar) {
        return new b(aVar);
    }

    i() {
    }
}
