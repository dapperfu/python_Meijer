package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Fd.ha, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3386ha extends AbstractC15707a {
    public static final Parcelable.Creator<C3386ha> CREATOR = new xa();

    /* renamed from: a, reason: collision with root package name */
    private final String f10111a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10112b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10113c;

    /* renamed from: d, reason: collision with root package name */
    private final String f10114d;

    /* renamed from: e, reason: collision with root package name */
    private final String f10115e;

    /* renamed from: f, reason: collision with root package name */
    private final C3374ga f10116f;

    /* renamed from: g, reason: collision with root package name */
    private final C3374ga f10117g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f10111a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 1, str, false);
        C15708b.w(parcel, 2, this.f10112b, false);
        C15708b.w(parcel, 3, this.f10113c, false);
        C15708b.w(parcel, 4, this.f10114d, false);
        C15708b.w(parcel, 5, this.f10115e, false);
        C15708b.u(parcel, 6, this.f10116f, i10, false);
        C15708b.u(parcel, 7, this.f10117g, i10, false);
        C15708b.b(parcel, iA);
    }

    public C3386ha(String str, String str2, String str3, String str4, String str5, C3374ga c3374ga, C3374ga c3374ga2) {
        this.f10111a = str;
        this.f10112b = str2;
        this.f10113c = str3;
        this.f10114d = str4;
        this.f10115e = str5;
        this.f10116f = c3374ga;
        this.f10117g = c3374ga2;
    }
}
