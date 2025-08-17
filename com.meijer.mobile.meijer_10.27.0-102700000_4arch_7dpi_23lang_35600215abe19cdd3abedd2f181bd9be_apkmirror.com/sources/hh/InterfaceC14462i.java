package hh;

/* renamed from: hh.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC14462i {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC14462i f134971a = new a();

    /* renamed from: hh.i$a */
    class a implements InterfaceC14462i {
        @Override // hh.InterfaceC14462i
        public b a(Throwable th2) {
            return b.PROCEED;
        }

        a() {
        }
    }

    /* renamed from: hh.i$b */
    public enum b {
        PROCEED,
        SHUTDOWN
    }

    b a(Throwable th2);
}
