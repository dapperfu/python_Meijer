package ih;

/* renamed from: ih.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC14742i {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC14742i f137611a = new a();

    /* renamed from: ih.i$a */
    class a implements InterfaceC14742i {
        @Override // ih.InterfaceC14742i
        public b a(Throwable th2) {
            return b.PROCEED;
        }

        a() {
        }
    }

    /* renamed from: ih.i$b */
    public enum b {
        PROCEED,
        SHUTDOWN
    }

    b a(Throwable th2);
}
