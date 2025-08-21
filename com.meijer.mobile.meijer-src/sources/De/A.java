package De;

/* loaded from: classes6.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    private static final A f6127a = new a();

    public abstract long a();

    class a extends A {
        a() {
        }

        @Override // De.A
        public long a() {
            return System.nanoTime();
        }
    }

    public static A b() {
        return f6127a;
    }

    protected A() {
    }
}
