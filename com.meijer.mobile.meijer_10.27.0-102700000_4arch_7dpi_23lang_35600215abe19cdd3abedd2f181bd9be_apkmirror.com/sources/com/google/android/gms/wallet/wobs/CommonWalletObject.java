package com.google.android.gms.wallet.wobs;

import Zd.f;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;
import kd.AbstractC15136a;
import kd.C15137b;

@KeepName
/* loaded from: classes6.dex */
public class CommonWalletObject extends AbstractC15136a {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    String f86139a;

    /* renamed from: b, reason: collision with root package name */
    String f86140b;

    /* renamed from: c, reason: collision with root package name */
    String f86141c;

    /* renamed from: d, reason: collision with root package name */
    String f86142d;

    /* renamed from: e, reason: collision with root package name */
    String f86143e;

    /* renamed from: f, reason: collision with root package name */
    String f86144f;

    /* renamed from: g, reason: collision with root package name */
    String f86145g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    String f86146h;

    /* renamed from: i, reason: collision with root package name */
    int f86147i;

    /* renamed from: j, reason: collision with root package name */
    final ArrayList f86148j;

    /* renamed from: k, reason: collision with root package name */
    f f86149k;

    /* renamed from: l, reason: collision with root package name */
    final ArrayList f86150l;

    /* renamed from: m, reason: collision with root package name */
    @Deprecated
    String f86151m;

    /* renamed from: n, reason: collision with root package name */
    @Deprecated
    String f86152n;

    /* renamed from: o, reason: collision with root package name */
    final ArrayList f86153o;

    /* renamed from: p, reason: collision with root package name */
    boolean f86154p;

    /* renamed from: q, reason: collision with root package name */
    final ArrayList f86155q;

    /* renamed from: r, reason: collision with root package name */
    final ArrayList f86156r;

    /* renamed from: s, reason: collision with root package name */
    final ArrayList f86157s;

    CommonWalletObject() {
        this.f86148j = com.google.android.gms.common.util.b.c();
        this.f86150l = com.google.android.gms.common.util.b.c();
        this.f86153o = com.google.android.gms.common.util.b.c();
        this.f86155q = com.google.android.gms.common.util.b.c();
        this.f86156r = com.google.android.gms.common.util.b.c();
        this.f86157s = com.google.android.gms.common.util.b.c();
    }

    public static a B() {
        return new a(new CommonWalletObject(), null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, this.f86139a, false);
        C15137b.w(parcel, 3, this.f86140b, false);
        C15137b.w(parcel, 4, this.f86141c, false);
        C15137b.w(parcel, 5, this.f86142d, false);
        C15137b.w(parcel, 6, this.f86143e, false);
        C15137b.w(parcel, 7, this.f86144f, false);
        C15137b.w(parcel, 8, this.f86145g, false);
        C15137b.w(parcel, 9, this.f86146h, false);
        C15137b.n(parcel, 10, this.f86147i);
        C15137b.A(parcel, 11, this.f86148j, false);
        C15137b.u(parcel, 12, this.f86149k, i10, false);
        C15137b.A(parcel, 13, this.f86150l, false);
        C15137b.w(parcel, 14, this.f86151m, false);
        C15137b.w(parcel, 15, this.f86152n, false);
        C15137b.A(parcel, 16, this.f86153o, false);
        C15137b.c(parcel, 17, this.f86154p);
        C15137b.A(parcel, 18, this.f86155q, false);
        C15137b.A(parcel, 19, this.f86156r, false);
        C15137b.A(parcel, 20, this.f86157s, false);
        C15137b.b(parcel, iA);
    }

    CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, ArrayList arrayList, f fVar, ArrayList arrayList2, String str9, String str10, ArrayList arrayList3, boolean z10, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.f86139a = str;
        this.f86140b = str2;
        this.f86141c = str3;
        this.f86142d = str4;
        this.f86143e = str5;
        this.f86144f = str6;
        this.f86145g = str7;
        this.f86146h = str8;
        this.f86147i = i10;
        this.f86148j = arrayList;
        this.f86149k = fVar;
        this.f86150l = arrayList2;
        this.f86151m = str9;
        this.f86152n = str10;
        this.f86153o = arrayList3;
        this.f86154p = z10;
        this.f86155q = arrayList4;
        this.f86156r = arrayList5;
        this.f86157s = arrayList6;
    }
}
