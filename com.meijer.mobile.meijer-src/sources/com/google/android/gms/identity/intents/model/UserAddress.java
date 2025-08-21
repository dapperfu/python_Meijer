package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes4.dex */
public final class UserAddress extends AbstractC15707a implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    String f65861a;

    /* renamed from: b, reason: collision with root package name */
    String f65862b;

    /* renamed from: c, reason: collision with root package name */
    String f65863c;

    /* renamed from: d, reason: collision with root package name */
    String f65864d;

    /* renamed from: e, reason: collision with root package name */
    String f65865e;

    /* renamed from: f, reason: collision with root package name */
    String f65866f;

    /* renamed from: g, reason: collision with root package name */
    String f65867g;

    /* renamed from: h, reason: collision with root package name */
    String f65868h;

    /* renamed from: i, reason: collision with root package name */
    String f65869i;

    /* renamed from: j, reason: collision with root package name */
    String f65870j;

    /* renamed from: k, reason: collision with root package name */
    String f65871k;

    /* renamed from: l, reason: collision with root package name */
    String f65872l;

    /* renamed from: m, reason: collision with root package name */
    boolean f65873m;

    /* renamed from: n, reason: collision with root package name */
    String f65874n;

    /* renamed from: o, reason: collision with root package name */
    String f65875o;

    UserAddress() {
    }

    UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z10, String str13, String str14) {
        this.f65861a = str;
        this.f65862b = str2;
        this.f65863c = str3;
        this.f65864d = str4;
        this.f65865e = str5;
        this.f65866f = str6;
        this.f65867g = str7;
        this.f65868h = str8;
        this.f65869i = str9;
        this.f65870j = str10;
        this.f65871k = str11;
        this.f65872l = str12;
        this.f65873m = z10;
        this.f65874n = str13;
        this.f65875o = str14;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, this.f65861a, false);
        C15708b.w(parcel, 3, this.f65862b, false);
        C15708b.w(parcel, 4, this.f65863c, false);
        C15708b.w(parcel, 5, this.f65864d, false);
        C15708b.w(parcel, 6, this.f65865e, false);
        C15708b.w(parcel, 7, this.f65866f, false);
        C15708b.w(parcel, 8, this.f65867g, false);
        C15708b.w(parcel, 9, this.f65868h, false);
        C15708b.w(parcel, 10, this.f65869i, false);
        C15708b.w(parcel, 11, this.f65870j, false);
        C15708b.w(parcel, 12, this.f65871k, false);
        C15708b.w(parcel, 13, this.f65872l, false);
        C15708b.c(parcel, 14, this.f65873m);
        C15708b.w(parcel, 15, this.f65874n, false);
        C15708b.w(parcel, 16, this.f65875o, false);
        C15708b.b(parcel, iA);
    }
}
