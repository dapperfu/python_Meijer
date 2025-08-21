package com.google.android.gms.internal.atv_ads_framework;

import com.google.android.gms.common.api.a;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC10384u extends AbstractC10340f {

    /* renamed from: c, reason: collision with root package name */
    final CharSequence f81900c;

    /* renamed from: d, reason: collision with root package name */
    final C10358l f81901d;

    /* renamed from: e, reason: collision with root package name */
    int f81902e = 0;

    /* renamed from: f, reason: collision with root package name */
    int f81903f = a.e.API_PRIORITY_OTHER;

    abstract int d(int i10);

    abstract int e(int i10);

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10340f
    protected final /* bridge */ /* synthetic */ Object a() {
        int iD;
        int i10 = this.f81902e;
        while (true) {
            int i11 = this.f81902e;
            if (i11 == -1) {
                c();
                return null;
            }
            int iE = e(i11);
            if (iE == -1) {
                iE = this.f81900c.length();
                this.f81902e = -1;
                iD = -1;
            } else {
                iD = d(iE);
                this.f81902e = iD;
            }
            if (iD != i10) {
                if (i10 < iE) {
                    this.f81900c.charAt(i10);
                }
                if (i10 < iE) {
                    this.f81900c.charAt(iE - 1);
                }
                int i12 = this.f81903f;
                if (i12 == 1) {
                    iE = this.f81900c.length();
                    this.f81902e = -1;
                    if (iE > i10) {
                        this.f81900c.charAt(iE - 1);
                    }
                } else {
                    this.f81903f = i12 - 1;
                }
                return this.f81900c.subSequence(i10, iE).toString();
            }
            int i13 = iD + 1;
            this.f81902e = i13;
            if (i13 > this.f81900c.length()) {
                this.f81902e = -1;
            }
        }
    }

    protected AbstractC10384u(C10387v c10387v, CharSequence charSequence) {
        this.f81901d = c10387v.f81905a;
        this.f81900c = charSequence;
    }
}
