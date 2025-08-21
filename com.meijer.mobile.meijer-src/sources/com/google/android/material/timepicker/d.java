package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes4.dex */
class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final b f88815a;

    /* renamed from: b, reason: collision with root package name */
    private final b f88816b;

    /* renamed from: c, reason: collision with root package name */
    final int f88817c;

    /* renamed from: d, reason: collision with root package name */
    int f88818d;

    /* renamed from: e, reason: collision with root package name */
    int f88819e;

    /* renamed from: f, reason: collision with root package name */
    int f88820f;

    /* renamed from: g, reason: collision with root package name */
    int f88821g;

    class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i10) {
            return new d[i10];
        }

        a() {
        }
    }

    public d() {
        this(0);
    }

    private static int c(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f88818d == dVar.f88818d && this.f88819e == dVar.f88819e && this.f88817c == dVar.f88817c && this.f88820f == dVar.f88820f;
    }

    public d(int i10) {
        this(0, 0, 10, i10);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f88817c), Integer.valueOf(this.f88818d), Integer.valueOf(this.f88819e), Integer.valueOf(this.f88820f)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f88818d);
        parcel.writeInt(this.f88819e);
        parcel.writeInt(this.f88820f);
        parcel.writeInt(this.f88817c);
    }

    public d(int i10, int i11, int i12, int i13) {
        this.f88818d = i10;
        this.f88819e = i11;
        this.f88820f = i12;
        this.f88817c = i13;
        this.f88821g = c(i10);
        this.f88815a = new b(59);
        this.f88816b = new b(i13 == 1 ? 23 : 12);
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    protected d(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
