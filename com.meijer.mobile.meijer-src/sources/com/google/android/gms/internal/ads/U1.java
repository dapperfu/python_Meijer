package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* loaded from: classes6.dex */
public class U1 implements InterfaceC7009Ka {
    public static final Parcelable.Creator<U1> CREATOR = new T1();

    /* renamed from: a, reason: collision with root package name */
    public final String f71358a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71359b;

    protected U1(Parcel parcel) {
        String string = parcel.readString();
        int i10 = OV.f69931a;
        this.f71358a = string;
        this.f71359b = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            U1 u12 = (U1) obj;
            if (this.f71358a.equals(u12.f71358a) && this.f71359b.equals(u12.f71359b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f71358a.hashCode() + 527) * 31) + this.f71359b.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    @Override // com.google.android.gms.internal.ads.InterfaceC7009Ka
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o0(com.google.android.gms.internal.ads.J8 r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.f71358a
            int r1 = r0.hashCode()
            r2 = 2
            r3 = 4
            r4 = 3
            r5 = 1
            switch(r1) {
                case 62359119: goto L36;
                case 79833656: goto L2c;
                case 428414940: goto L22;
                case 1746739798: goto L18;
                case 1939198791: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L40
        Le:
            java.lang.String r1 = "ARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = r5
            goto L41
        L18:
            java.lang.String r1 = "ALBUMARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = r4
            goto L41
        L22:
            java.lang.String r1 = "DESCRIPTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = r3
            goto L41
        L2c:
            java.lang.String r1 = "TITLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = 0
            goto L41
        L36:
            java.lang.String r1 = "ALBUM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = r2
            goto L41
        L40:
            r0 = -1
        L41:
            if (r0 == 0) goto L64
            if (r0 == r5) goto L5e
            if (r0 == r2) goto L58
            if (r0 == r4) goto L52
            if (r0 == r3) goto L4c
            return
        L4c:
            java.lang.String r0 = r6.f71359b
            r7.A(r0)
            return
        L52:
            java.lang.String r0 = r6.f71359b
            r7.v(r0)
            return
        L58:
            java.lang.String r0 = r6.f71359b
            r7.w(r0)
            return
        L5e:
            java.lang.String r0 = r6.f71359b
            r7.x(r0)
            return
        L64:
            java.lang.String r0 = r6.f71359b
            r7.J(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.U1.o0(com.google.android.gms.internal.ads.J8):void");
    }

    public final String toString() {
        return "VC: " + this.f71358a + "=" + this.f71359b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f71358a);
        parcel.writeString(this.f71359b);
    }

    public U1(String str, String str2) {
        this.f71358a = C8571jf0.b(str);
        this.f71359b = str2;
    }
}
