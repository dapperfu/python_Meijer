package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes6.dex */
public final class TE0 implements Comparator<C9604tE0>, Parcelable {
    public static final Parcelable.Creator<TE0> CREATOR = new C9816vD0();

    /* renamed from: a, reason: collision with root package name */
    private final C9604tE0[] f71160a;

    /* renamed from: b, reason: collision with root package name */
    private int f71161b;

    /* renamed from: c, reason: collision with root package name */
    public final String f71162c;

    /* renamed from: d, reason: collision with root package name */
    public final int f71163d;

    TE0(Parcel parcel) {
        this.f71162c = parcel.readString();
        C9604tE0[] c9604tE0Arr = (C9604tE0[]) parcel.createTypedArray(C9604tE0.CREATOR);
        int i10 = OV.f69931a;
        this.f71160a = c9604tE0Arr;
        this.f71163d = c9604tE0Arr.length;
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
            if (Objects.equals(this.f71162c, te0.f71162c) && Arrays.equals(this.f71160a, te0.f71160a)) {
                return true;
            }
        }
        return false;
    }

    public final C9604tE0 a(int i10) {
        return this.f71160a[i10];
    }

    public final TE0 b(String str) {
        return Objects.equals(this.f71162c, str) ? this : new TE0(str, false, this.f71160a);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(C9604tE0 c9604tE0, C9604tE0 c9604tE02) {
        C9604tE0 c9604tE03 = c9604tE0;
        C9604tE0 c9604tE04 = c9604tE02;
        UUID uuid = Mv0.f69597a;
        return uuid.equals(c9604tE03.f79363b) ? !uuid.equals(c9604tE04.f79363b) ? 1 : 0 : c9604tE03.f79363b.compareTo(c9604tE04.f79363b);
    }

    public final int hashCode() {
        int i10 = this.f71161b;
        if (i10 != 0) {
            return i10;
        }
        String str = this.f71162c;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f71160a);
        this.f71161b = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f71162c);
        parcel.writeTypedArray(this.f71160a, 0);
    }

    private TE0(String str, boolean z10, C9604tE0... c9604tE0Arr) {
        this.f71162c = str;
        c9604tE0Arr = z10 ? (C9604tE0[]) c9604tE0Arr.clone() : c9604tE0Arr;
        this.f71160a = c9604tE0Arr;
        this.f71163d = c9604tE0Arr.length;
        Arrays.sort(c9604tE0Arr, this);
    }

    public TE0(String str, C9604tE0... c9604tE0Arr) {
        this(null, true, c9604tE0Arr);
    }

    public TE0(List list) {
        this(null, false, (C9604tE0[]) list.toArray(new C9604tE0[0]));
    }
}
