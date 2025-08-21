package If;

/* loaded from: classes8.dex */
public interface j {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* renamed from: a, reason: collision with root package name */
        private final int f14463a;

        public int b() {
            return this.f14463a;
        }

        a(int i10) {
            this.f14463a = i10;
        }
    }

    a b(String str);
}
