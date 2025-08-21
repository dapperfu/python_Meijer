package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.InterfaceC6654k;
import id.C14720c;
import md.AbstractC15707a;

/* renamed from: com.google.android.gms.common.internal.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6650g extends AbstractC15707a {
    public static final Parcelable.Creator<C6650g> CREATOR = new k0();

    /* renamed from: o, reason: collision with root package name */
    static final Scope[] f65704o = new Scope[0];

    /* renamed from: p, reason: collision with root package name */
    static final C14720c[] f65705p = new C14720c[0];

    /* renamed from: a, reason: collision with root package name */
    final int f65706a;

    /* renamed from: b, reason: collision with root package name */
    final int f65707b;

    /* renamed from: c, reason: collision with root package name */
    final int f65708c;

    /* renamed from: d, reason: collision with root package name */
    String f65709d;

    /* renamed from: e, reason: collision with root package name */
    IBinder f65710e;

    /* renamed from: f, reason: collision with root package name */
    Scope[] f65711f;

    /* renamed from: g, reason: collision with root package name */
    Bundle f65712g;

    /* renamed from: h, reason: collision with root package name */
    Account f65713h;

    /* renamed from: i, reason: collision with root package name */
    C14720c[] f65714i;

    /* renamed from: j, reason: collision with root package name */
    C14720c[] f65715j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f65716k;

    /* renamed from: l, reason: collision with root package name */
    final int f65717l;

    /* renamed from: m, reason: collision with root package name */
    boolean f65718m;

    /* renamed from: n, reason: collision with root package name */
    private final String f65719n;

    public String B() {
        return this.f65719n;
    }

    C6650g(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C14720c[] c14720cArr, C14720c[] c14720cArr2, boolean z10, int i13, boolean z11, String str2) {
        Account accountC2;
        scopeArr = scopeArr == null ? f65704o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        c14720cArr = c14720cArr == null ? f65705p : c14720cArr;
        c14720cArr2 = c14720cArr2 == null ? f65705p : c14720cArr2;
        this.f65706a = i10;
        this.f65707b = i11;
        this.f65708c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f65709d = "com.google.android.gms";
        } else {
            this.f65709d = str;
        }
        if (i10 < 2) {
            if (iBinder != null) {
                accountC2 = BinderC6644a.c2(InterfaceC6654k.a.a2(iBinder));
            } else {
                accountC2 = null;
            }
            this.f65713h = accountC2;
        } else {
            this.f65710e = iBinder;
            this.f65713h = account;
        }
        this.f65711f = scopeArr;
        this.f65712g = bundle;
        this.f65714i = c14720cArr;
        this.f65715j = c14720cArr2;
        this.f65716k = z10;
        this.f65717l = i13;
        this.f65718m = z11;
        this.f65719n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        k0.a(this, parcel, i10);
    }
}
