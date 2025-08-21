package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class f implements a.c {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final long f87741a;

    class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i10) {
            return new f[i10];
        }

        a() {
        }
    }

    /* synthetic */ f(long j10, a aVar) {
        this(j10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f87741a == ((f) obj).f87741a;
    }

    private f(long j10) {
        this.f87741a = j10;
    }

    public static f a(long j10) {
        return new f(j10);
    }

    @Override // com.google.android.material.datepicker.a.c
    public boolean a1(long j10) {
        return j10 >= this.f87741a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f87741a)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f87741a);
    }
}
