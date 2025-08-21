package cg;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private long f62479a;

    /* renamed from: b, reason: collision with root package name */
    private long f62480b;

    class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i10) {
            return new l[i10];
        }

        a() {
        }
    }

    /* synthetic */ l(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public l() {
        this(h(), a());
    }

    private static long a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    public static l f(long j10) {
        long micros = TimeUnit.MILLISECONDS.toMicros(j10);
        return new l(h() + (micros - a()), micros);
    }

    private static long h() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    public long b() {
        return this.f62479a + c();
    }

    public long c() {
        return d(new l());
    }

    public long d(l lVar) {
        return lVar.f62480b - this.f62480b;
    }

    public long e() {
        return this.f62479a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f62479a);
        parcel.writeLong(this.f62480b);
    }

    l(long j10, long j11) {
        this.f62479a = j10;
        this.f62480b = j11;
    }

    public void g() {
        this.f62479a = h();
        this.f62480b = a();
    }

    private l(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }
}
