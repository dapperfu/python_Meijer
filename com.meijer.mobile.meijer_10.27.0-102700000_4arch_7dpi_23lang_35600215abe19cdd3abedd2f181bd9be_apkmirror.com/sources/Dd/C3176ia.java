package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Dd.ia, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3176ia extends AbstractC15136a {
    public static final Parcelable.Creator<C3176ia> CREATOR = new ya();

    /* renamed from: a, reason: collision with root package name */
    private final C3224ma f6094a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6095b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6096c;

    /* renamed from: d, reason: collision with root package name */
    private final C3236na[] f6097d;

    /* renamed from: e, reason: collision with root package name */
    private final C3200ka[] f6098e;

    /* renamed from: f, reason: collision with root package name */
    private final String[] f6099f;

    /* renamed from: g, reason: collision with root package name */
    private final C3140fa[] f6100g;

    public C3176ia(C3224ma c3224ma, String str, String str2, C3236na[] c3236naArr, C3200ka[] c3200kaArr, String[] strArr, C3140fa[] c3140faArr) {
        this.f6094a = c3224ma;
        this.f6095b = str;
        this.f6096c = str2;
        this.f6097d = c3236naArr;
        this.f6098e = c3200kaArr;
        this.f6099f = strArr;
        this.f6100g = c3140faArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.u(parcel, 1, this.f6094a, i10, false);
        C15137b.w(parcel, 2, this.f6095b, false);
        C15137b.w(parcel, 3, this.f6096c, false);
        C15137b.z(parcel, 4, this.f6097d, i10, false);
        C15137b.z(parcel, 5, this.f6098e, i10, false);
        C15137b.x(parcel, 6, this.f6099f, false);
        C15137b.z(parcel, 7, this.f6100g, i10, false);
        C15137b.b(parcel, iA);
    }
}
