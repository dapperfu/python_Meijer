package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Dd.ja, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3188ja extends AbstractC15136a {
    public static final Parcelable.Creator<C3188ja> CREATOR = new za();

    /* renamed from: a, reason: collision with root package name */
    private final String f6107a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6108b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6109c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6110d;

    /* renamed from: e, reason: collision with root package name */
    private final String f6111e;

    /* renamed from: f, reason: collision with root package name */
    private final String f6112f;

    /* renamed from: g, reason: collision with root package name */
    private final String f6113g;

    /* renamed from: h, reason: collision with root package name */
    private final String f6114h;

    /* renamed from: i, reason: collision with root package name */
    private final String f6115i;

    /* renamed from: j, reason: collision with root package name */
    private final String f6116j;

    /* renamed from: k, reason: collision with root package name */
    private final String f6117k;

    /* renamed from: l, reason: collision with root package name */
    private final String f6118l;

    /* renamed from: m, reason: collision with root package name */
    private final String f6119m;

    /* renamed from: n, reason: collision with root package name */
    private final String f6120n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f6107a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 1, str, false);
        C15137b.w(parcel, 2, this.f6108b, false);
        C15137b.w(parcel, 3, this.f6109c, false);
        C15137b.w(parcel, 4, this.f6110d, false);
        C15137b.w(parcel, 5, this.f6111e, false);
        C15137b.w(parcel, 6, this.f6112f, false);
        C15137b.w(parcel, 7, this.f6113g, false);
        C15137b.w(parcel, 8, this.f6114h, false);
        C15137b.w(parcel, 9, this.f6115i, false);
        C15137b.w(parcel, 10, this.f6116j, false);
        C15137b.w(parcel, 11, this.f6117k, false);
        C15137b.w(parcel, 12, this.f6118l, false);
        C15137b.w(parcel, 13, this.f6119m, false);
        C15137b.w(parcel, 14, this.f6120n, false);
        C15137b.b(parcel, iA);
    }

    public C3188ja(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f6107a = str;
        this.f6108b = str2;
        this.f6109c = str3;
        this.f6110d = str4;
        this.f6111e = str5;
        this.f6112f = str6;
        this.f6113g = str7;
        this.f6114h = str8;
        this.f6115i = str9;
        this.f6116j = str10;
        this.f6117k = str11;
        this.f6118l = str12;
        this.f6119m = str13;
        this.f6120n = str14;
    }
}
