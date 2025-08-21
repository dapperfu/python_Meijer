package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import be.C6363f;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;
import md.AbstractC15707a;
import md.C15708b;

@KeepName
/* loaded from: classes6.dex */
public class CommonWalletObject extends AbstractC15707a {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    String f86979a;

    /* renamed from: b, reason: collision with root package name */
    String f86980b;

    /* renamed from: c, reason: collision with root package name */
    String f86981c;

    /* renamed from: d, reason: collision with root package name */
    String f86982d;

    /* renamed from: e, reason: collision with root package name */
    String f86983e;

    /* renamed from: f, reason: collision with root package name */
    String f86984f;

    /* renamed from: g, reason: collision with root package name */
    String f86985g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    String f86986h;

    /* renamed from: i, reason: collision with root package name */
    int f86987i;

    /* renamed from: j, reason: collision with root package name */
    final ArrayList f86988j;

    /* renamed from: k, reason: collision with root package name */
    C6363f f86989k;

    /* renamed from: l, reason: collision with root package name */
    final ArrayList f86990l;

    /* renamed from: m, reason: collision with root package name */
    @Deprecated
    String f86991m;

    /* renamed from: n, reason: collision with root package name */
    @Deprecated
    String f86992n;

    /* renamed from: o, reason: collision with root package name */
    final ArrayList f86993o;

    /* renamed from: p, reason: collision with root package name */
    boolean f86994p;

    /* renamed from: q, reason: collision with root package name */
    final ArrayList f86995q;

    /* renamed from: r, reason: collision with root package name */
    final ArrayList f86996r;

    /* renamed from: s, reason: collision with root package name */
    final ArrayList f86997s;

    CommonWalletObject() {
        this.f86988j = com.google.android.gms.common.util.b.c();
        this.f86990l = com.google.android.gms.common.util.b.c();
        this.f86993o = com.google.android.gms.common.util.b.c();
        this.f86995q = com.google.android.gms.common.util.b.c();
        this.f86996r = com.google.android.gms.common.util.b.c();
        this.f86997s = com.google.android.gms.common.util.b.c();
    }

    public static a B() {
        return new a(new CommonWalletObject(), null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, this.f86979a, false);
        C15708b.w(parcel, 3, this.f86980b, false);
        C15708b.w(parcel, 4, this.f86981c, false);
        C15708b.w(parcel, 5, this.f86982d, false);
        C15708b.w(parcel, 6, this.f86983e, false);
        C15708b.w(parcel, 7, this.f86984f, false);
        C15708b.w(parcel, 8, this.f86985g, false);
        C15708b.w(parcel, 9, this.f86986h, false);
        C15708b.n(parcel, 10, this.f86987i);
        C15708b.A(parcel, 11, this.f86988j, false);
        C15708b.u(parcel, 12, this.f86989k, i10, false);
        C15708b.A(parcel, 13, this.f86990l, false);
        C15708b.w(parcel, 14, this.f86991m, false);
        C15708b.w(parcel, 15, this.f86992n, false);
        C15708b.A(parcel, 16, this.f86993o, false);
        C15708b.c(parcel, 17, this.f86994p);
        C15708b.A(parcel, 18, this.f86995q, false);
        C15708b.A(parcel, 19, this.f86996r, false);
        C15708b.A(parcel, 20, this.f86997s, false);
        C15708b.b(parcel, iA);
    }

    CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, ArrayList arrayList, C6363f c6363f, ArrayList arrayList2, String str9, String str10, ArrayList arrayList3, boolean z10, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.f86979a = str;
        this.f86980b = str2;
        this.f86981c = str3;
        this.f86982d = str4;
        this.f86983e = str5;
        this.f86984f = str6;
        this.f86985g = str7;
        this.f86986h = str8;
        this.f86987i = i10;
        this.f86988j = arrayList;
        this.f86989k = c6363f;
        this.f86990l = arrayList2;
        this.f86991m = str9;
        this.f86992n = str10;
        this.f86993o = arrayList3;
        this.f86994p = z10;
        this.f86995q = arrayList4;
        this.f86996r = arrayList5;
        this.f86997s = arrayList6;
    }
}
