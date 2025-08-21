package eh;

import Lu.q;

/* renamed from: eh.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C13796a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f130165a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f130166b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f130167c;

    /* renamed from: d, reason: collision with root package name */
    private int f130168d;

    /* renamed from: eh.a$a, reason: collision with other inner class name */
    public interface InterfaceC2047a<T> extends q<T> {
        @Override // Lu.q
        boolean test(T t10);
    }

    void a(T t10) {
        int i10 = this.f130165a;
        int i11 = this.f130168d;
        if (i11 == i10) {
            Object[] objArr = new Object[i10 + 1];
            this.f130167c[i10] = objArr;
            this.f130167c = objArr;
            i11 = 0;
        }
        this.f130167c[i11] = t10;
        this.f130168d = i11 + 1;
    }

    void b(InterfaceC2047a<? super T> interfaceC2047a) {
        int i10;
        int i11 = this.f130165a;
        for (Object[] objArr = this.f130166b; objArr != null; objArr = (Object[]) objArr[i11]) {
            while (i10 < i11) {
                Object obj = objArr[i10];
                i10 = (obj == null || interfaceC2047a.test(obj)) ? 0 : i10 + 1;
            }
        }
    }

    C13796a(int i10) {
        this.f130165a = i10;
        Object[] objArr = new Object[i10 + 1];
        this.f130166b = objArr;
        this.f130167c = objArr;
    }
}
