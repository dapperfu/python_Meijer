package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class M extends AbstractC15136a {
    public static final Parcelable.Creator<M> CREATOR = new N();

    /* renamed from: a, reason: collision with root package name */
    final int f64813a;

    /* renamed from: b, reason: collision with root package name */
    private final Account f64814b;

    /* renamed from: c, reason: collision with root package name */
    private final int f64815c;

    /* renamed from: d, reason: collision with root package name */
    private final GoogleSignInAccount f64816d;

    M(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f64813a = i10;
        this.f64814b = account;
        this.f64815c = i11;
        this.f64816d = googleSignInAccount;
    }

    public M(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f64813a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        C15137b.u(parcel, 2, this.f64814b, i10, false);
        C15137b.n(parcel, 3, this.f64815c);
        C15137b.u(parcel, 4, this.f64816d, i10, false);
        C15137b.b(parcel, iA);
    }
}
