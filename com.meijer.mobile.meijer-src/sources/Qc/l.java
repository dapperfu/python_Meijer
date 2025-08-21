package Qc;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.b;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes4.dex */
public final class l extends AbstractC15707a {
    public static final Parcelable.Creator<l> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    public final String f28018a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28019b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28020c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28021d;

    /* renamed from: e, reason: collision with root package name */
    public final String f28022e;

    /* renamed from: f, reason: collision with root package name */
    public final String f28023f;

    /* renamed from: g, reason: collision with root package name */
    public final String f28024g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f28025h;

    /* renamed from: i, reason: collision with root package name */
    public final b f28026i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f28027j;

    public l(Intent intent, b bVar) {
        this(null, null, null, null, null, null, null, intent, com.google.android.gms.dynamic.d.I2(bVar).asBinder(), false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f28018a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, str, false);
        C15708b.w(parcel, 3, this.f28019b, false);
        C15708b.w(parcel, 4, this.f28020c, false);
        C15708b.w(parcel, 5, this.f28021d, false);
        C15708b.w(parcel, 6, this.f28022e, false);
        C15708b.w(parcel, 7, this.f28023f, false);
        C15708b.w(parcel, 8, this.f28024g, false);
        C15708b.u(parcel, 9, this.f28025h, i10, false);
        C15708b.m(parcel, 10, com.google.android.gms.dynamic.d.I2(this.f28026i).asBinder(), false);
        C15708b.c(parcel, 11, this.f28027j);
        C15708b.b(parcel, iA);
    }

    public l(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z10) {
        this.f28018a = str;
        this.f28019b = str2;
        this.f28020c = str3;
        this.f28021d = str4;
        this.f28022e = str5;
        this.f28023f = str6;
        this.f28024g = str7;
        this.f28025h = intent;
        this.f28026i = (b) com.google.android.gms.dynamic.d.c2(b.a.a2(iBinder));
        this.f28027j = z10;
    }

    public l(String str, String str2, String str3, String str4, String str5, String str6, String str7, b bVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, com.google.android.gms.dynamic.d.I2(bVar).asBinder(), false);
    }
}
