package id;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.b;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes4.dex */
public final class z extends AbstractC15707a {
    public static final Parcelable.Creator<z> CREATOR = new C14710A();

    /* renamed from: a, reason: collision with root package name */
    private final String f137562a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f137563b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f137564c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f137565d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f137566e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f137567f;

    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.IBinder, com.google.android.gms.dynamic.b] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f137562a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 1, str, false);
        C15708b.c(parcel, 2, this.f137563b);
        C15708b.c(parcel, 3, this.f137564c);
        C15708b.m(parcel, 4, com.google.android.gms.dynamic.d.I2(this.f137565d), false);
        C15708b.c(parcel, 5, this.f137566e);
        C15708b.c(parcel, 6, this.f137567f);
        C15708b.b(parcel, iA);
    }

    z(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12, boolean z13) {
        this.f137562a = str;
        this.f137563b = z10;
        this.f137564c = z11;
        this.f137565d = (Context) com.google.android.gms.dynamic.d.c2(b.a.a2(iBinder));
        this.f137566e = z12;
        this.f137567f = z13;
    }
}
