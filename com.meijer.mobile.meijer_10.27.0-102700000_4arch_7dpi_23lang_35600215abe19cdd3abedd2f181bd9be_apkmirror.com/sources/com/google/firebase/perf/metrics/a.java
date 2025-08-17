package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes7.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1285a();

    /* renamed from: a, reason: collision with root package name */
    private final String f89091a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f89092b;

    /* renamed from: com.google.firebase.perf.metrics.a$a, reason: collision with other inner class name */
    class C1285a implements Parcelable.Creator<a> {
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

        C1285a() {
        }
    }

    /* synthetic */ a(Parcel parcel, C1285a c1285a) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public a(String str) {
        this.f89091a = str;
        this.f89092b = new AtomicLong(0L);
    }

    long a() {
        return this.f89092b.get();
    }

    public void b(long j10) {
        this.f89092b.addAndGet(j10);
    }

    void c(long j10) {
        this.f89092b.set(j10);
    }

    String getName() {
        return this.f89091a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f89091a);
        parcel.writeLong(this.f89092b.get());
    }

    private a(Parcel parcel) {
        this.f89091a = parcel.readString();
        this.f89092b = new AtomicLong(parcel.readLong());
    }
}
