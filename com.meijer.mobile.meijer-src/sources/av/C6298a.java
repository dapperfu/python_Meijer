package av;

/* renamed from: av.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C6298a<T> {

    /* renamed from: a, reason: collision with root package name */
    final int f59681a;

    /* renamed from: b, reason: collision with root package name */
    final Object[] f59682b;

    /* renamed from: c, reason: collision with root package name */
    Object[] f59683c;

    /* renamed from: d, reason: collision with root package name */
    int f59684d;

    /* renamed from: av.a$a, reason: collision with other inner class name */
    public interface InterfaceC1178a<T> extends Lu.q<T> {
        @Override // Lu.q
        boolean test(T t10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <U> boolean a(io.reactivex.s<? super U> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f59682b
            int r1 = r4.f59681a
        L4:
            r2 = 0
            if (r0 == 0) goto L1e
        L7:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L19
        Le:
            boolean r3 = av.m.b(r3, r5)
            if (r3 == 0) goto L16
            r5 = 1
            return r5
        L16:
            int r2 = r2 + 1
            goto L7
        L19:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: av.C6298a.a(io.reactivex.s):boolean");
    }

    public void b(T t10) {
        int i10 = this.f59681a;
        int i11 = this.f59684d;
        if (i11 == i10) {
            Object[] objArr = new Object[i10 + 1];
            this.f59683c[i10] = objArr;
            this.f59683c = objArr;
            i11 = 0;
        }
        this.f59683c[i11] = t10;
        this.f59684d = i11 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0018, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(av.C6298a.InterfaceC1178a<? super T> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f59682b
            int r1 = r4.f59681a
        L4:
            if (r0 == 0) goto L1d
            r2 = 0
        L7:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L18
        Le:
            boolean r3 = r5.test(r3)
            if (r3 == 0) goto L15
            goto L1d
        L15:
            int r2 = r2 + 1
            goto L7
        L18:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: av.C6298a.c(av.a$a):void");
    }

    public void d(T t10) {
        this.f59682b[0] = t10;
    }

    public C6298a(int i10) {
        this.f59681a = i10;
        Object[] objArr = new Object[i10 + 1];
        this.f59682b = objArr;
        this.f59683c = objArr;
    }
}
