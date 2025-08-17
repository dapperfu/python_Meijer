package Xd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Xd.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5422f extends AbstractC15136a {
    public static final Parcelable.Creator<C5422f> CREATOR = new D();

    /* renamed from: a, reason: collision with root package name */
    private String f39225a;

    /* renamed from: b, reason: collision with root package name */
    private String f39226b;

    /* renamed from: c, reason: collision with root package name */
    private int f39227c;

    private C5422f() {
    }

    public C5422f(String str, String str2, int i10) {
        this.f39225a = str;
        this.f39226b = str2;
        this.f39227c = i10;
    }

    public int B() {
        int i10 = this.f39227c;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return i10;
        }
        return 0;
    }

    public String T() {
        return this.f39226b;
    }

    public String c0() {
        return this.f39225a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, c0(), false);
        C15137b.w(parcel, 3, T(), false);
        C15137b.n(parcel, 4, B());
        C15137b.b(parcel, iA);
    }
}
