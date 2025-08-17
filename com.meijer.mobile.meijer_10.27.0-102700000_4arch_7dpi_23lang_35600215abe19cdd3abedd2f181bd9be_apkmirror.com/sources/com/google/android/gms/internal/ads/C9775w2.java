package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.w2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9775w2 extends AbstractC8813n2 {
    public static final Parcelable.Creator<C9775w2> CREATOR = new C9668v2();

    /* renamed from: b, reason: collision with root package name */
    public final String f79399b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC7917eh0 f79400c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9775w2.class == obj.getClass()) {
            C9775w2 c9775w2 = (C9775w2) obj;
            if (Objects.equals(this.f76984a, c9775w2.f76984a) && Objects.equals(this.f79399b, c9775w2.f79399b) && this.f79400c.equals(c9775w2.f79400c)) {
                return true;
            }
        }
        return false;
    }

    private static List a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final int hashCode() {
        int iHashCode = this.f76984a.hashCode() + 527;
        String str = this.f79399b;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.f79400c.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0115  */
    @Override // com.google.android.gms.internal.ads.AbstractC8813n2, com.google.android.gms.internal.ads.InterfaceC6884Ka
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n0(com.google.android.gms.internal.ads.J8 r10) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9775w2.n0(com.google.android.gms.internal.ads.J8):void");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8813n2
    public final String toString() {
        return this.f76984a + ": description=" + this.f79399b + ": values=" + String.valueOf(this.f79400c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f76984a);
        parcel.writeString(this.f79399b);
        parcel.writeStringArray((String[]) this.f79400c.toArray(new String[0]));
    }

    public C9775w2(String str, String str2, List list) {
        super(str);
        C8086gC.d(!list.isEmpty());
        this.f79399b = str2;
        AbstractC7917eh0 abstractC7917eh0R = AbstractC7917eh0.r(list);
        this.f79400c = abstractC7917eh0R;
    }
}
