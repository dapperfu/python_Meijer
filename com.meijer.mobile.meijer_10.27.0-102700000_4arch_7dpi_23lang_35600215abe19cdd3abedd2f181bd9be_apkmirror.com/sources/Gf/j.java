package Gf;

/* loaded from: classes7.dex */
public interface j {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* renamed from: a, reason: collision with root package name */
        private final int f11364a;

        public int b() {
            return this.f11364a;
        }

        a(int i10) {
            this.f11364a = i10;
        }
    }

    a b(String str);
}
