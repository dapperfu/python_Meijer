package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.lG0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8628lG0 implements PG0 {

    /* renamed from: a, reason: collision with root package name */
    protected final C9742vm f75774a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f75775b;

    /* renamed from: c, reason: collision with root package name */
    protected final int[] f75776c;

    /* renamed from: d, reason: collision with root package name */
    private final C[] f75777d;

    /* renamed from: e, reason: collision with root package name */
    private int f75778e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C8628lG0 c8628lG0 = (C8628lG0) obj;
            if (this.f75774a.equals(c8628lG0.f75774a) && Arrays.equals(this.f75776c, c8628lG0.f75776c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.TG0
    public final int zzc(int i10) {
        for (int i11 = 0; i11 < this.f75775b; i11++) {
            if (this.f75776c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.TG0
    public final int zzd() {
        return this.f75776c.length;
    }

    @Override // com.google.android.gms.internal.ads.TG0
    public final C9742vm zzg() {
        return this.f75774a;
    }

    public final int hashCode() {
        int i10 = this.f75778e;
        if (i10 != 0) {
            return i10;
        }
        int iIdentityHashCode = (System.identityHashCode(this.f75774a) * 31) + Arrays.hashCode(this.f75776c);
        this.f75778e = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // com.google.android.gms.internal.ads.TG0
    public final int zza(int i10) {
        return this.f75776c[i10];
    }

    @Override // com.google.android.gms.internal.ads.PG0
    public final int zzb() {
        return this.f75776c[0];
    }

    @Override // com.google.android.gms.internal.ads.TG0
    public final C zze(int i10) {
        return this.f75777d[i10];
    }

    @Override // com.google.android.gms.internal.ads.PG0
    public final C zzf() {
        return this.f75777d[0];
    }

    public C8628lG0(C9742vm c9742vm, int[] iArr, int i10) {
        boolean z10;
        int length = iArr.length;
        if (length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C8086gC.f(z10);
        c9742vm.getClass();
        this.f75774a = c9742vm;
        this.f75775b = length;
        this.f75777d = new C[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f75777d[i11] = c9742vm.b(iArr[i11]);
        }
        Arrays.sort(this.f75777d, new Comparator() { // from class: com.google.android.gms.internal.ads.kG0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((C) obj2).f65659j - ((C) obj).f65659j;
            }
        });
        this.f75776c = new int[this.f75775b];
        for (int i12 = 0; i12 < this.f75775b; i12++) {
            this.f75776c[i12] = c9742vm.a(this.f75777d[i12]);
        }
    }
}
