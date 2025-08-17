package Oc;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.b;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class l extends AbstractC15136a {
    public static final Parcelable.Creator<l> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    public final String f23530a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23531b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23532c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23533d;

    /* renamed from: e, reason: collision with root package name */
    public final String f23534e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23535f;

    /* renamed from: g, reason: collision with root package name */
    public final String f23536g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f23537h;

    /* renamed from: i, reason: collision with root package name */
    public final b f23538i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f23539j;

    public l(Intent intent, b bVar) {
        this(null, null, null, null, null, null, null, intent, com.google.android.gms.dynamic.d.F2(bVar).asBinder(), false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f23530a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, str, false);
        C15137b.w(parcel, 3, this.f23531b, false);
        C15137b.w(parcel, 4, this.f23532c, false);
        C15137b.w(parcel, 5, this.f23533d, false);
        C15137b.w(parcel, 6, this.f23534e, false);
        C15137b.w(parcel, 7, this.f23535f, false);
        C15137b.w(parcel, 8, this.f23536g, false);
        C15137b.u(parcel, 9, this.f23537h, i10, false);
        C15137b.m(parcel, 10, com.google.android.gms.dynamic.d.F2(this.f23538i).asBinder(), false);
        C15137b.c(parcel, 11, this.f23539j);
        C15137b.b(parcel, iA);
    }

    public l(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z10) {
        this.f23530a = str;
        this.f23531b = str2;
        this.f23532c = str3;
        this.f23533d = str4;
        this.f23534e = str5;
        this.f23535f = str6;
        this.f23536g = str7;
        this.f23537h = intent;
        this.f23538i = (b) com.google.android.gms.dynamic.d.b2(b.a.a2(iBinder));
        this.f23539j = z10;
    }

    public l(String str, String str2, String str3, String str4, String str5, String str6, String str7, b bVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, com.google.android.gms.dynamic.d.F2(bVar).asBinder(), false);
    }
}
