package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;

/* renamed from: com.google.android.gms.internal.ads.Rf0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC7132Rf0 extends AbstractC8340if0 {

    /* renamed from: c, reason: collision with root package name */
    final CharSequence f69915c;

    /* renamed from: d, reason: collision with root package name */
    int f69916d = 0;

    /* renamed from: e, reason: collision with root package name */
    int f69917e = a.e.API_PRIORITY_OTHER;

    abstract int d(int i10);

    abstract int e(int i10);

    @Override // com.google.android.gms.internal.ads.AbstractC8340if0
    protected final /* bridge */ /* synthetic */ Object a() {
        int iD;
        int i10 = this.f69916d;
        while (true) {
            int i11 = this.f69916d;
            if (i11 == -1) {
                c();
                return null;
            }
            int iE = e(i11);
            if (iE == -1) {
                iE = this.f69915c.length();
                this.f69916d = -1;
                iD = -1;
            } else {
                iD = d(iE);
                this.f69916d = iD;
            }
            if (iD != i10) {
                if (i10 < iE) {
                    this.f69915c.charAt(i10);
                }
                if (i10 < iE) {
                    this.f69915c.charAt(iE - 1);
                }
                int i12 = this.f69917e;
                if (i12 == 1) {
                    iE = this.f69915c.length();
                    this.f69916d = -1;
                    if (iE > i10) {
                        this.f69915c.charAt(iE - 1);
                    }
                } else {
                    this.f69917e = i12 - 1;
                }
                return this.f69915c.subSequence(i10, iE).toString();
            }
            int i13 = iD + 1;
            this.f69916d = i13;
            if (i13 > this.f69915c.length()) {
                this.f69916d = -1;
            }
        }
    }

    protected AbstractC7132Rf0(C7200Tf0 c7200Tf0, CharSequence charSequence) {
        this.f69915c = charSequence;
    }
}
