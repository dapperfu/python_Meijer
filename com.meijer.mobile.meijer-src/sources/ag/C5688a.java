package ag;

import android.os.Parcel;
import android.os.Parcelable;
import cg.C6505a;
import cg.l;
import dg.k;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: ag.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C5688a implements Parcelable {
    public static final Parcelable.Creator<C5688a> CREATOR = new C0949a();

    /* renamed from: a, reason: collision with root package name */
    private final String f45388a;

    /* renamed from: b, reason: collision with root package name */
    private final l f45389b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f45390c;

    /* renamed from: ag.a$a, reason: collision with other inner class name */
    class C0949a implements Parcelable.Creator<C5688a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5688a createFromParcel(Parcel parcel) {
            return new C5688a(parcel, (C0949a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5688a[] newArray(int i10) {
            return new C5688a[i10];
        }

        C0949a() {
        }
    }

    /* synthetic */ C5688a(Parcel parcel, C0949a c0949a) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C5688a(String str, C6505a c6505a) {
        this.f45390c = false;
        this.f45388a = str;
        this.f45389b = c6505a.a();
    }

    public static C5688a c(String str) {
        C5688a c5688a = new C5688a(str.replace("-", ""), new C6505a());
        c5688a.i(j());
        return c5688a;
    }

    public l d() {
        return this.f45389b;
    }

    public boolean e() {
        return this.f45390c;
    }

    public boolean f() {
        return TimeUnit.MICROSECONDS.toMinutes(this.f45389b.c()) > com.google.firebase.perf.config.a.g().A();
    }

    public boolean g() {
        return this.f45390c;
    }

    public String h() {
        return this.f45388a;
    }

    public void i(boolean z10) {
        this.f45390c = z10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f45388a);
        parcel.writeByte(this.f45390c ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f45389b, 0);
    }

    public static k[] b(List<C5688a> list) {
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
        k.c cVarH = k.g0().H(this.f45388a);
        if (this.f45390c) {
            cVarH.G(dg.l.GAUGES_AND_SYSTEM_EVENTS);
        }
        return cVarH.build();
    }

    private C5688a(Parcel parcel) {
        this.f45390c = false;
        this.f45388a = parcel.readString();
        this.f45390c = parcel.readByte() != 0;
        this.f45389b = (l) parcel.readParcelable(l.class.getClassLoader());
    }
}
