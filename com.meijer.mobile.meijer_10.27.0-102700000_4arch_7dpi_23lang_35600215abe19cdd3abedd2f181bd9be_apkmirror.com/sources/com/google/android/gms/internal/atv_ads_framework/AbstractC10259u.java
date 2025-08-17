package com.google.android.gms.internal.atv_ads_framework;

import com.google.android.gms.common.api.a;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC10259u extends AbstractC10215f {

    /* renamed from: c, reason: collision with root package name */
    final CharSequence f81060c;

    /* renamed from: d, reason: collision with root package name */
    final C10233l f81061d;

    /* renamed from: e, reason: collision with root package name */
    int f81062e = 0;

    /* renamed from: f, reason: collision with root package name */
    int f81063f = a.e.API_PRIORITY_OTHER;

    abstract int d(int i10);

    abstract int e(int i10);

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10215f
    protected final /* bridge */ /* synthetic */ Object a() {
        int iD;
        int i10 = this.f81062e;
        while (true) {
            int i11 = this.f81062e;
            if (i11 == -1) {
                c();
                return null;
            }
            int iE = e(i11);
            if (iE == -1) {
                iE = this.f81060c.length();
                this.f81062e = -1;
                iD = -1;
            } else {
                iD = d(iE);
                this.f81062e = iD;
            }
            if (iD != i10) {
                if (i10 < iE) {
                    this.f81060c.charAt(i10);
                }
                if (i10 < iE) {
                    this.f81060c.charAt(iE - 1);
                }
                int i12 = this.f81063f;
                if (i12 == 1) {
                    iE = this.f81060c.length();
                    this.f81062e = -1;
                    if (iE > i10) {
                        this.f81060c.charAt(iE - 1);
                    }
                } else {
                    this.f81063f = i12 - 1;
                }
                return this.f81060c.subSequence(i10, iE).toString();
            }
            int i13 = iD + 1;
            this.f81062e = i13;
            if (i13 > this.f81060c.length()) {
                this.f81062e = -1;
            }
        }
    }

    protected AbstractC10259u(C10262v c10262v, CharSequence charSequence) {
        this.f81061d = c10262v.f81065a;
        this.f81060c = charSequence;
    }
}
