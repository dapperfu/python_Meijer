package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes8.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1294a();

    /* renamed from: a, reason: collision with root package name */
    private final String f89933a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f89934b;

    /* renamed from: com.google.firebase.perf.metrics.a$a, reason: collision with other inner class name */
    class C1294a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }

        C1294a() {
        }
    }

    /* synthetic */ a(Parcel parcel, C1294a c1294a) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public a(String str) {
        this.f89933a = str;
        this.f89934b = new AtomicLong(0L);
    }

    long a() {
        return this.f89934b.get();
    }

    public void b(long j10) {
        this.f89934b.addAndGet(j10);
    }

    void c(long j10) {
        this.f89934b.set(j10);
    }

    String getName() {
        return this.f89933a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f89933a);
        parcel.writeLong(this.f89934b.get());
    }

    private a(Parcel parcel) {
        this.f89933a = parcel.readString();
        this.f89934b = new AtomicLong(parcel.readLong());
    }
}
