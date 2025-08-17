package Yf;

import ag.C5599a;
import ag.l;
import android.os.Parcel;
import android.os.Parcelable;
import bg.k;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0865a();

    /* renamed from: a, reason: collision with root package name */
    private final String f40256a;

    /* renamed from: b, reason: collision with root package name */
    private final l f40257b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f40258c;

    /* renamed from: Yf.a$a, reason: collision with other inner class name */
    class C0865a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, (C0865a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }

        C0865a() {
        }
    }

    /* synthetic */ a(Parcel parcel, C0865a c0865a) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public a(String str, C5599a c5599a) {
        this.f40258c = false;
        this.f40256a = str;
        this.f40257b = c5599a.a();
    }

    public static a c(String str) {
        a aVar = new a(str.replace("-", ""), new C5599a());
        aVar.i(j());
        return aVar;
    }

    public l d() {
        return this.f40257b;
    }

    public boolean e() {
        return this.f40258c;
    }

    public boolean f() {
        return TimeUnit.MICROSECONDS.toMinutes(this.f40257b.c()) > com.google.firebase.perf.config.a.g().A();
    }

    public boolean g() {
        return this.f40258c;
    }

    public String h() {
        return this.f40256a;
    }

    public void i(boolean z10) {
        this.f40258c = z10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f40256a);
        parcel.writeByte(this.f40258c ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f40257b, 0);
    }

    public static k[] b(List<a> list) {
        if (list.isEmpty()) {
            return null;
        }
        k[] kVarArr = new k[list.size()];
        k kVarA = list.get(0).a();
        boolean z10 = false;
        for (int i10 = 1; i10 < list.size(); i10++) {
            k kVarA2 = list.get(i10).a();
            if (!z10 && list.get(i10).g()) {
                kVarArr[0] = kVarA2;
                kVarArr[i10] = kVarA;
                z10 = true;
            } else {
                kVarArr[i10] = kVarA2;
            }
        }
        if (!z10) {
            kVarArr[0] = kVarA;
        }
        return kVarArr;
    }

    public static boolean j() {
        com.google.firebase.perf.config.a aVarG = com.google.firebase.perf.config.a.g();
        if (aVarG.K() && Math.random() < aVarG.D()) {
            return true;
        }
        return false;
    }

    public k a() {
        k.c cVarH = k.g0().H(this.f40256a);
        if (this.f40258c) {
            cVarH.G(bg.l.GAUGES_AND_SYSTEM_EVENTS);
        }
        return cVarH.build();
    }

    private a(Parcel parcel) {
        this.f40258c = false;
        this.f40256a = parcel.readString();
        this.f40258c = parcel.readByte() != 0;
        this.f40257b = (l) parcel.readParcelable(l.class.getClassLoader());
    }
}
