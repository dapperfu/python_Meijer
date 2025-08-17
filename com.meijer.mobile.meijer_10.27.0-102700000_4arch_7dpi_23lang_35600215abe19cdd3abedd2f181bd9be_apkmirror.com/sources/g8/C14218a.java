package g8;

import java.util.Vector;

/* renamed from: g8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14218a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f132993a = x.f133195a + "ActionThreadLocal";

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<Vector<q>> f132994b = new C2093a();

    /* renamed from: g8.a$a, reason: collision with other inner class name */
    class C2093a extends ThreadLocal<Vector<q>> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Vector<q> initialValue() {
            return new Vector<>();
        }

        C2093a() {
        }
    }

    public static final synchronized void a() {
        Vector vector;
        try {
            ThreadLocal<Vector<q>> threadLocal = f132994b;
            synchronized (threadLocal) {
                vector = new Vector(threadLocal.get());
            }
            for (int i10 = 0; i10 < vector.size(); i10++) {
                q qVar = (q) vector.get(i10);
                if (qVar != null && !qVar.s()) {
                    qVar.J();
                }
            }
        } catch (Exception e10) {
            if (x.f133196b) {
                x8.f.v(f132993a, "Expected exception? It depends on what you expect!", e10);
            }
        }
    }

    static final boolean b(q qVar) {
        boolean zRemove = f132994b.get().remove(qVar);
        c();
        return zRemove;
    }

    static final synchronized void c() {
        try {
            Vector vector = new Vector(f132994b.get());
            for (int i10 = 0; i10 < vector.size(); i10++) {
                try {
                    ThreadLocal<Vector<q>> threadLocal = f132994b;
                    q qVar = threadLocal.get().get(i10);
                    if (qVar != null && qVar.s()) {
                        threadLocal.get().remove(qVar);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
            vector.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
