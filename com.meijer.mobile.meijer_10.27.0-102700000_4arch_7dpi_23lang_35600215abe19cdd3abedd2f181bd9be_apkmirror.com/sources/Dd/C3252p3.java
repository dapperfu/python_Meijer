package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Dd.p3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3252p3 extends AbstractC15136a {
    public static final Parcelable.Creator<C3252p3> CREATOR = new Y9();

    /* renamed from: a, reason: collision with root package name */
    public String f6210a;

    /* renamed from: b, reason: collision with root package name */
    public String f6211b;

    /* renamed from: c, reason: collision with root package name */
    public String f6212c;

    /* renamed from: d, reason: collision with root package name */
    public String f6213d;

    /* renamed from: e, reason: collision with root package name */
    public String f6214e;

    /* renamed from: f, reason: collision with root package name */
    public O2 f6215f;

    /* renamed from: g, reason: collision with root package name */
    public O2 f6216g;

    public C3252p3() {
    }

    public C3252p3(String str, String str2, String str3, String str4, String str5, O2 o22, O2 o23) {
        this.f6210a = str;
        this.f6211b = str2;
        this.f6212c = str3;
        this.f6213d = str4;
        this.f6214e = str5;
        this.f6215f = o22;
        this.f6216g = o23;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, this.f6210a, false);
        C15137b.w(parcel, 3, this.f6211b, false);
        C15137b.w(parcel, 4, this.f6212c, false);
        C15137b.w(parcel, 5, this.f6213d, false);
        C15137b.w(parcel, 6, this.f6214e, false);
        C15137b.u(parcel, 7, this.f6215f, i10, false);
        C15137b.u(parcel, 8, this.f6216g, i10, false);
        C15137b.b(parcel, iA);
    }
}
