package Ld;

import android.location.Location;
import java.util.List;

/* renamed from: Ld.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4018h {

    /* renamed from: a, reason: collision with root package name */
    private final int f18159a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18160b;

    /* renamed from: c, reason: collision with root package name */
    private final List f18161c;

    /* renamed from: d, reason: collision with root package name */
    private final Location f18162d;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Ld.C4018h a(android.content.Intent r12) {
        /*
            r0 = 0
            if (r12 != 0) goto L5
            goto L6c
        L5:
            java.lang.String r1 = "gms_error_code"
            r2 = -1
            int r1 = r12.getIntExtra(r1, r2)
            java.lang.String r3 = "com.google.android.location.intent.extra.transition"
            int r3 = r12.getIntExtra(r3, r2)
            if (r3 != r2) goto L16
        L14:
            r3 = r2
            goto L20
        L16:
            r4 = 1
            if (r3 == r4) goto L20
            r4 = 2
            if (r3 == r4) goto L20
            r4 = 4
            if (r3 != r4) goto L14
            r3 = r4
        L20:
            java.lang.String r4 = "com.google.android.location.intent.extra.geofence_list"
            java.io.Serializable r4 = r12.getSerializableExtra(r4)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 != 0) goto L2c
            r5 = r0
            goto L5f
        L2c:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r4.size()
            r5.<init>(r6)
            int r6 = r4.size()
            r7 = 0
            r8 = r7
        L3b:
            if (r8 >= r6) goto L5f
            java.lang.Object r9 = r4.get(r8)
            byte[] r9 = (byte[]) r9
            android.os.Parcel r10 = android.os.Parcel.obtain()
            int r11 = r9.length
            r10.unmarshall(r9, r7, r11)
            r10.setDataPosition(r7)
            android.os.Parcelable$Creator<Cd.c0> r9 = Cd.C3046c0.CREATOR
            java.lang.Object r9 = r9.createFromParcel(r10)
            Cd.c0 r9 = (Cd.C3046c0) r9
            r10.recycle()
            r5.add(r9)
            int r8 = r8 + 1
            goto L3b
        L5f:
            java.lang.String r4 = "com.google.android.location.intent.extra.triggering_location"
            android.os.Parcelable r12 = r12.getParcelableExtra(r4)
            android.location.Location r12 = (android.location.Location) r12
            if (r5 != 0) goto L6d
            if (r1 == r2) goto L6c
            goto L6d
        L6c:
            return r0
        L6d:
            Ld.h r0 = new Ld.h
            r0.<init>(r1, r3, r5, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ld.C4018h.a(android.content.Intent):Ld.h");
    }

    public int b() {
        return this.f18160b;
    }

    public List<InterfaceC4014d> c() {
        return this.f18161c;
    }

    public boolean d() {
        return this.f18159a != -1;
    }

    private C4018h(int i10, int i11, List list, Location location) {
        this.f18159a = i10;
        this.f18160b = i11;
        this.f18161c = list;
        this.f18162d = location;
    }
}
