package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes6.dex */
public final class F2 implements InterfaceC6884Ka {
    public static final Parcelable.Creator<F2> CREATOR = new C2();

    /* renamed from: a, reason: collision with root package name */
    public final List f66696a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6884Ka
    public final /* synthetic */ void n0(J8 j82) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F2.class != obj.getClass()) {
            return false;
        }
        return this.f66696a.equals(((F2) obj).f66696a);
    }

    public final int hashCode() {
        return this.f66696a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.f66696a.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f66696a);
    }

    public F2(List list) {
        this.f66696a = list;
        boolean z10 = false;
        if (!list.isEmpty()) {
            long j10 = ((E2) list.get(0)).f66331b;
            int i10 = 1;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (((E2) list.get(i10)).f66330a < j10) {
                    z10 = true;
                    break;
                } else {
                    j10 = ((E2) list.get(i10)).f66331b;
                    i10++;
                }
            }
        }
        C8086gC.d(!z10);
    }
}
