package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class UserAddress extends AbstractC15136a implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    String f65021a;

    /* renamed from: b, reason: collision with root package name */
    String f65022b;

    /* renamed from: c, reason: collision with root package name */
    String f65023c;

    /* renamed from: d, reason: collision with root package name */
    String f65024d;

    /* renamed from: e, reason: collision with root package name */
    String f65025e;

    /* renamed from: f, reason: collision with root package name */
    String f65026f;

    /* renamed from: g, reason: collision with root package name */
    String f65027g;

    /* renamed from: h, reason: collision with root package name */
    String f65028h;

    /* renamed from: i, reason: collision with root package name */
    String f65029i;

    /* renamed from: j, reason: collision with root package name */
    String f65030j;

    /* renamed from: k, reason: collision with root package name */
    String f65031k;

    /* renamed from: l, reason: collision with root package name */
    String f65032l;

    /* renamed from: m, reason: collision with root package name */
    boolean f65033m;

    /* renamed from: n, reason: collision with root package name */
    String f65034n;

    /* renamed from: o, reason: collision with root package name */
    String f65035o;

    UserAddress() {
    }

    UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z10, String str13, String str14) {
        this.f65021a = str;
        this.f65022b = str2;
        this.f65023c = str3;
        this.f65024d = str4;
        this.f65025e = str5;
        this.f65026f = str6;
        this.f65027g = str7;
        this.f65028h = str8;
        this.f65029i = str9;
        this.f65030j = str10;
        this.f65031k = str11;
        this.f65032l = str12;
        this.f65033m = z10;
        this.f65034n = str13;
        this.f65035o = str14;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, this.f65021a, false);
        C15137b.w(parcel, 3, this.f65022b, false);
        C15137b.w(parcel, 4, this.f65023c, false);
        C15137b.w(parcel, 5, this.f65024d, false);
        C15137b.w(parcel, 6, this.f65025e, false);
        C15137b.w(parcel, 7, this.f65026f, false);
        C15137b.w(parcel, 8, this.f65027g, false);
        C15137b.w(parcel, 9, this.f65028h, false);
        C15137b.w(parcel, 10, this.f65029i, false);
        C15137b.w(parcel, 11, this.f65030j, false);
        C15137b.w(parcel, 12, this.f65031k, false);
        C15137b.w(parcel, 13, this.f65032l, false);
        C15137b.c(parcel, 14, this.f65033m);
        C15137b.w(parcel, 15, this.f65034n, false);
        C15137b.w(parcel, 16, this.f65035o, false);
        C15137b.b(parcel, iA);
    }
}
