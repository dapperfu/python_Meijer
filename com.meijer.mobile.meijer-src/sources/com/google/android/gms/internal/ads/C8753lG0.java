package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.lG0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8753lG0 implements PG0 {

    /* renamed from: a, reason: collision with root package name */
    protected final C9867vm f76614a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f76615b;

    /* renamed from: c, reason: collision with root package name */
    protected final int[] f76616c;

    /* renamed from: d, reason: collision with root package name */
    private final C[] f76617d;

    /* renamed from: e, reason: collision with root package name */
    private int f76618e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C8753lG0 c8753lG0 = (C8753lG0) obj;
            if (this.f76614a.equals(c8753lG0.f76614a) && Arrays.equals(this.f76616c, c8753lG0.f76616c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.TG0
    public final int zzc(int i10) {
        for (int i11 = 0; i11 < this.f76615b; i11++) {
            if (this.f76616c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.TG0
    public final int zzd() {
        return this.f76616c.length;
    }

    @Override // com.google.android.gms.internal.ads.TG0
    public final C9867vm zzg() {
        return this.f76614a;
    }

    public final int hashCode() {
        int i10 = this.f76618e;
        if (i10 != 0) {
            return i10;
        }
        int iIdentityHashCode = (System.identityHashCode(this.f76614a) * 31) + Arrays.hashCode(this.f76616c);
        this.f76618e = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // com.google.android.gms.internal.ads.TG0
    public final int zza(int i10) {
        return this.f76616c[i10];
    }

    @Override // com.google.android.gms.internal.ads.PG0
    public final int zzb() {
        return this.f76616c[0];
    }

    @Override // com.google.android.gms.internal.ads.TG0
    public final C zze(int i10) {
        return this.f76617d[i10];
    }

    @Override // com.google.android.gms.internal.ads.PG0
    public final C zzf() {
        return this.f76617d[0];
    }

    public C8753lG0(C9867vm c9867vm, int[] iArr, int i10) {
        boolean z10;
        int length = iArr.length;
        if (length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C8211gC.f(z10);
        c9867vm.getClass();
        this.f76614a = c9867vm;
        this.f76615b = length;
        this.f76617d = new C[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f76617d[i11] = c9867vm.b(iArr[i11]);
        }
        Arrays.sort(this.f76617d, new Comparator() { // from class: com.google.android.gms.internal.ads.kG0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((C) obj2).f66499j - ((C) obj).f66499j;
            }
        });
        this.f76616c = new int[this.f76615b];
        for (int i12 = 0; i12 < this.f76615b; i12++) {
            this.f76616c[i12] = c9867vm.a(this.f76617d[i12]);
        }
    }
}
