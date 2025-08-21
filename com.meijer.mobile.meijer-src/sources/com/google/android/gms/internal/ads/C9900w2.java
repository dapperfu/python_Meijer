package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.w2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9900w2 extends AbstractC8938n2 {
    public static final Parcelable.Creator<C9900w2> CREATOR = new C9793v2();

    /* renamed from: b, reason: collision with root package name */
    public final String f80239b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC8042eh0 f80240c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9900w2.class == obj.getClass()) {
            C9900w2 c9900w2 = (C9900w2) obj;
            if (Objects.equals(this.f77824a, c9900w2.f77824a) && Objects.equals(this.f80239b, c9900w2.f80239b) && this.f80240c.equals(c9900w2.f80240c)) {
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
        int iHashCode = this.f77824a.hashCode() + 527;
        String str = this.f80239b;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.f80240c.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0115  */
    @Override // com.google.android.gms.internal.ads.AbstractC8938n2, com.google.android.gms.internal.ads.InterfaceC7009Ka
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o0(com.google.android.gms.internal.ads.J8 r10) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9900w2.o0(com.google.android.gms.internal.ads.J8):void");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8938n2
    public final String toString() {
        return this.f77824a + ": description=" + this.f80239b + ": values=" + String.valueOf(this.f80240c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f77824a);
        parcel.writeString(this.f80239b);
        parcel.writeStringArray((String[]) this.f80240c.toArray(new String[0]));
    }

    public C9900w2(String str, String str2, List list) {
        super(str);
        C8211gC.d(!list.isEmpty());
        this.f80239b = str2;
        AbstractC8042eh0 abstractC8042eh0R = AbstractC8042eh0.r(list);
        this.f80240c = abstractC8042eh0R;
    }
}
