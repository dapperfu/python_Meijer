package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes6.dex */
public final class TE0 implements Comparator<C9479tE0>, Parcelable {
    public static final Parcelable.Creator<TE0> CREATOR = new C9691vD0();

    /* renamed from: a, reason: collision with root package name */
    private final C9479tE0[] f70320a;

    /* renamed from: b, reason: collision with root package name */
    private int f70321b;

    /* renamed from: c, reason: collision with root package name */
    public final String f70322c;

    /* renamed from: d, reason: collision with root package name */
    public final int f70323d;

    TE0(Parcel parcel) {
        this.f70322c = parcel.readString();
        C9479tE0[] c9479tE0Arr = (C9479tE0[]) parcel.createTypedArray(C9479tE0.CREATOR);
        int i10 = OV.f69091a;
        this.f70320a = c9479tE0Arr;
        this.f70323d = c9479tE0Arr.length;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TE0.class == obj.getClass()) {
            TE0 te0 = (TE0) obj;
            if (Objects.equals(this.f70322c, te0.f70322c) && Arrays.equals(this.f70320a, te0.f70320a)) {
                return true;
            }
        }
        return false;
    }

    public final C9479tE0 a(int i10) {
        return this.f70320a[i10];
    }

    public final TE0 b(String str) {
        return Objects.equals(this.f70322c, str) ? this : new TE0(str, false, this.f70320a);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(C9479tE0 c9479tE0, C9479tE0 c9479tE02) {
        C9479tE0 c9479tE03 = c9479tE0;
        C9479tE0 c9479tE04 = c9479tE02;
        UUID uuid = Mv0.f68757a;
        return uuid.equals(c9479tE03.f78523b) ? !uuid.equals(c9479tE04.f78523b) ? 1 : 0 : c9479tE03.f78523b.compareTo(c9479tE04.f78523b);
    }

    public final int hashCode() {
        int i10 = this.f70321b;
        if (i10 != 0) {
            return i10;
        }
        String str = this.f70322c;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f70320a);
        this.f70321b = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f70322c);
        parcel.writeTypedArray(this.f70320a, 0);
    }

    private TE0(String str, boolean z10, C9479tE0... c9479tE0Arr) {
        this.f70322c = str;
        c9479tE0Arr = z10 ? (C9479tE0[]) c9479tE0Arr.clone() : c9479tE0Arr;
        this.f70320a = c9479tE0Arr;
        this.f70323d = c9479tE0Arr.length;
        Arrays.sort(c9479tE0Arr, this);
    }

    public TE0(String str, C9479tE0... c9479tE0Arr) {
        this(null, true, c9479tE0Arr);
    }

    public TE0(List list) {
        this(null, false, (C9479tE0[]) list.toArray(new C9479tE0[0]));
    }
}
