package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes4.dex */
public final class M extends AbstractC15707a {
    public static final Parcelable.Creator<M> CREATOR = new N();

    /* renamed from: a, reason: collision with root package name */
    final int f65653a;

    /* renamed from: b, reason: collision with root package name */
    private final Account f65654b;

    /* renamed from: c, reason: collision with root package name */
    private final int f65655c;

    /* renamed from: d, reason: collision with root package name */
    private final GoogleSignInAccount f65656d;

    M(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f65653a = i10;
        this.f65654b = account;
        this.f65655c = i11;
        this.f65656d = googleSignInAccount;
    }

    public M(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f65653a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        C15708b.u(parcel, 2, this.f65654b, i10, false);
        C15708b.n(parcel, 3, this.f65655c);
        C15708b.u(parcel, 4, this.f65656d, i10, false);
        C15708b.b(parcel, iA);
    }
}
