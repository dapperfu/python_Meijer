package j$.time.format;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final e[] f138837a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f138838b;

    /* JADX WARN: Illegal instructions before constructor call */
    public d(List list, boolean z10) {
        ArrayList arrayList = (ArrayList) list;
        this((e[]) arrayList.toArray(new e[arrayList.size()]), z10);
    }

    public d(e[] eVarArr, boolean z10) {
        this.f138837a = eVarArr;
        this.f138838b = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r2 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
    
        return true;
     */
    @Override // j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C(j$.time.format.w r8, java.lang.StringBuilder r9) {
        /*
            r7 = this;
            int r0 = r9.length()
            r1 = 1
            boolean r2 = r7.f138838b
            if (r2 == 0) goto Le
            int r3 = r8.f138894c
            int r3 = r3 + r1
            r8.f138894c = r3
        Le:
            j$.time.format.e[] r3 = r7.f138837a     // Catch: java.lang.Throwable -> L27
            int r4 = r3.length     // Catch: java.lang.Throwable -> L27
            r5 = 0
        L12:
            if (r5 >= r4) goto L2c
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L27
            boolean r6 = r6.C(r8, r9)     // Catch: java.lang.Throwable -> L27
            if (r6 != 0) goto L29
            r9.setLength(r0)     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2f
        L21:
            int r9 = r8.f138894c
            int r9 = r9 - r1
            r8.f138894c = r9
            return r1
        L27:
            r9 = move-exception
            goto L30
        L29:
            int r5 = r5 + 1
            goto L12
        L2c:
            if (r2 == 0) goto L2f
            goto L21
        L2f:
            return r1
        L30:
            if (r2 == 0) goto L37
            int r0 = r8.f138894c
            int r0 = r0 - r1
            r8.f138894c = r0
        L37:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.d.C(j$.time.format.w, java.lang.StringBuilder):boolean");
    }

    @Override // j$.time.format.e
    public final int H(v vVar, CharSequence charSequence, int i10) {
        boolean z10 = this.f138838b;
        e[] eVarArr = this.f138837a;
        int i11 = 0;
        if (z10) {
            ArrayList arrayList = vVar.f138890d;
            B bC = vVar.c();
            bC.getClass();
            B b10 = new B();
            ((HashMap) b10.f138799a).putAll(bC.f138799a);
            b10.f138800b = bC.f138800b;
            b10.f138801c = bC.f138801c;
            b10.f138802d = bC.f138802d;
            arrayList.add(b10);
            int length = eVarArr.length;
            int iH = i10;
            while (i11 < length) {
                iH = eVarArr[i11].H(vVar, charSequence, iH);
                if (iH < 0) {
                    vVar.f138890d.remove(r8.size() - 1);
                    return i10;
                }
                i11++;
            }
            vVar.f138890d.remove(r8.size() - 2);
            return iH;
        }
        int length2 = eVarArr.length;
        while (i11 < length2) {
            i10 = eVarArr[i11].H(vVar, charSequence, i10);
            if (i10 < 0) {
                return i10;
            }
            i11++;
        }
        return i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        e[] eVarArr = this.f138837a;
        if (eVarArr != null) {
            boolean z10 = this.f138838b;
            sb2.append(z10 ? "[" : "(");
            for (e eVar : eVarArr) {
                sb2.append(eVar);
            }
            sb2.append(z10 ? "]" : ")");
        }
        return sb2.toString();
    }
}
