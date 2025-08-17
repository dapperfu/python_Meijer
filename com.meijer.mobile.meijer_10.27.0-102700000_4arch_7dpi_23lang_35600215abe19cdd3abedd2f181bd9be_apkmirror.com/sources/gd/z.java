package gd;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.b;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class z extends AbstractC15136a {
    public static final Parcelable.Creator<z> CREATOR = new C14234A();

    /* renamed from: a, reason: collision with root package name */
    private final String f133346a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f133347b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f133348c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f133349d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f133350e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f133351f;

    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.IBinder, com.google.android.gms.dynamic.b] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f133346a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 1, str, false);
        C15137b.c(parcel, 2, this.f133347b);
        C15137b.c(parcel, 3, this.f133348c);
        C15137b.m(parcel, 4, com.google.android.gms.dynamic.d.F2(this.f133349d), false);
        C15137b.c(parcel, 5, this.f133350e);
        C15137b.c(parcel, 6, this.f133351f);
        C15137b.b(parcel, iA);
    }

    z(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12, boolean z13) {
        this.f133346a = str;
        this.f133347b = z10;
        this.f133348c = z11;
        this.f133349d = (Context) com.google.android.gms.dynamic.d.b2(b.a.a2(iBinder));
        this.f133350e = z12;
        this.f133351f = z13;
    }
}
