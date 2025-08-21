package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
final class Q1 implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private Object f82036a;

    /* renamed from: b, reason: collision with root package name */
    private List<Object> f82037b = new ArrayList();

    Q1() {
    }

    private final byte[] a() throws IOException {
        byte[] bArr = new byte[c()];
        b(N1.q(bArr));
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Q1 clone() throws CloneNotSupportedException {
        Object objClone;
        Q1 q12 = new Q1();
        try {
            List<Object> list = this.f82037b;
            if (list == null) {
                q12.f82037b = null;
            } else {
                q12.f82037b.addAll(list);
            }
            Object obj = this.f82036a;
            if (obj != null) {
                if (obj instanceof S1) {
                    objClone = (S1) ((S1) obj).clone();
                } else if (obj instanceof byte[]) {
                    objClone = ((byte[]) obj).clone();
                } else {
                    int i10 = 0;
                    if (obj instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) obj;
                        byte[][] bArr2 = new byte[bArr.length][];
                        q12.f82036a = bArr2;
                        while (i10 < bArr.length) {
                            bArr2[i10] = (byte[]) bArr[i10].clone();
                            i10++;
                        }
                    } else if (obj instanceof boolean[]) {
                        objClone = ((boolean[]) obj).clone();
                    } else if (obj instanceof int[]) {
                        objClone = ((int[]) obj).clone();
                    } else if (obj instanceof long[]) {
                        objClone = ((long[]) obj).clone();
                    } else if (obj instanceof float[]) {
                        objClone = ((float[]) obj).clone();
                    } else if (obj instanceof double[]) {
                        objClone = ((double[]) obj).clone();
                    } else if (obj instanceof S1[]) {
                        S1[] s1Arr = (S1[]) obj;
                        S1[] s1Arr2 = new S1[s1Arr.length];
                        q12.f82036a = s1Arr2;
                        while (i10 < s1Arr.length) {
                            s1Arr2[i10] = (S1) s1Arr[i10].clone();
                            i10++;
                        }
                    }
                }
                q12.f82036a = objClone;
                return q12;
            }
            return q12;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    final void b(N1 n12) throws IOException {
        if (this.f82036a != null) {
            throw new NoSuchMethodError();
        }
        Iterator<Object> it = this.f82037b.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NoSuchMethodError();
        }
    }

    final int c() {
        if (this.f82036a != null) {
            throw new NoSuchMethodError();
        }
        Iterator<Object> it = this.f82037b.iterator();
        if (!it.hasNext()) {
            return 0;
        }
        it.next();
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        List<Object> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Q1)) {
            return false;
        }
        Q1 q12 = (Q1) obj;
        if (this.f82036a != null && q12.f82036a != null) {
            throw null;
        }
        List<Object> list2 = this.f82037b;
        if (list2 != null && (list = q12.f82037b) != null) {
            return list2.equals(list);
        }
        try {
            return Arrays.equals(a(), q12.a());
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(a()) + 527;
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
