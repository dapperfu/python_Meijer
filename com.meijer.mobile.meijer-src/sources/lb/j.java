package lb;

/* loaded from: classes4.dex */
public final class j {

    static class a implements h {
        @Override // lb.h
        public final void a(String str) {
            throw new IllegalArgumentException(str);
        }

        a() {
        }
    }

    public static void a(Object obj, String str) {
        a aVar = new a();
        if (obj == null) {
            aVar.a(str + " can not be null");
        }
    }
}
