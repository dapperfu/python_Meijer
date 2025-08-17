package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.InterfaceC6529k;
import gd.C14244c;
import kd.AbstractC15136a;

/* renamed from: com.google.android.gms.common.internal.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6525g extends AbstractC15136a {
    public static final Parcelable.Creator<C6525g> CREATOR = new k0();

    /* renamed from: o, reason: collision with root package name */
    static final Scope[] f64864o = new Scope[0];

    /* renamed from: p, reason: collision with root package name */
    static final C14244c[] f64865p = new C14244c[0];

    /* renamed from: a, reason: collision with root package name */
    final int f64866a;

    /* renamed from: b, reason: collision with root package name */
    final int f64867b;

    /* renamed from: c, reason: collision with root package name */
    final int f64868c;

    /* renamed from: d, reason: collision with root package name */
    String f64869d;

    /* renamed from: e, reason: collision with root package name */
    IBinder f64870e;

    /* renamed from: f, reason: collision with root package name */
    Scope[] f64871f;

    /* renamed from: g, reason: collision with root package name */
    Bundle f64872g;

    /* renamed from: h, reason: collision with root package name */
    Account f64873h;

    /* renamed from: i, reason: collision with root package name */
    C14244c[] f64874i;

    /* renamed from: j, reason: collision with root package name */
    C14244c[] f64875j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f64876k;

    /* renamed from: l, reason: collision with root package name */
    final int f64877l;

    /* renamed from: m, reason: collision with root package name */
    boolean f64878m;

    /* renamed from: n, reason: collision with root package name */
    private final String f64879n;

    public String B() {
        return this.f64879n;
    }

    C6525g(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C14244c[] c14244cArr, C14244c[] c14244cArr2, boolean z10, int i13, boolean z11, String str2) {
        Account accountB2;
        scopeArr = scopeArr == null ? f64864o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        c14244cArr = c14244cArr == null ? f64865p : c14244cArr;
        c14244cArr2 = c14244cArr2 == null ? f64865p : c14244cArr2;
        this.f64866a = i10;
        this.f64867b = i11;
        this.f64868c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f64869d = "com.google.android.gms";
        } else {
            this.f64869d = str;
        }
        if (i10 < 2) {
            if (iBinder != null) {
                accountB2 = BinderC6519a.b2(InterfaceC6529k.a.a2(iBinder));
            } else {
                accountB2 = null;
            }
            this.f64873h = accountB2;
        } else {
            this.f64870e = iBinder;
            this.f64873h = account;
        }
        this.f64871f = scopeArr;
        this.f64872g = bundle;
        this.f64874i = c14244cArr;
        this.f64875j = c14244cArr2;
        this.f64876k = z10;
        this.f64877l = i13;
        this.f64878m = z11;
        this.f64879n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        k0.a(this, parcel, i10);
    }
}
