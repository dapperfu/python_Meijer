package Zd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Zd.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5633f extends AbstractC15707a {
    public static final Parcelable.Creator<C5633f> CREATOR = new D();

    /* renamed from: a, reason: collision with root package name */
    private String f43703a;

    /* renamed from: b, reason: collision with root package name */
    private String f43704b;

    /* renamed from: c, reason: collision with root package name */
    private int f43705c;

    private C5633f() {
    }

    public C5633f(String str, String str2, int i10) {
        this.f43703a = str;
        this.f43704b = str2;
        this.f43705c = i10;
    }

    public int B() {
        int i10 = this.f43705c;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return i10;
        }
        return 0;
    }

    public String T() {
        return this.f43704b;
    }

    public String b0() {
        return this.f43703a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, b0(), false);
        C15708b.w(parcel, 3, T(), false);
        C15708b.n(parcel, 4, B());
        C15708b.b(parcel, iA);
    }
}
