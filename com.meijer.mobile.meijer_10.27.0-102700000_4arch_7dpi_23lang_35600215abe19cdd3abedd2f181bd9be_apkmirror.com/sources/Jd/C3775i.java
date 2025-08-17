package Jd;

import Ad.C2808c0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Jd.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C3775i extends AbstractC15136a {
    public static final Parcelable.Creator<C3775i> CREATOR = new G();

    /* renamed from: a, reason: collision with root package name */
    private final List f14826a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14827b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14828c;

    /* renamed from: Jd.i$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f14829a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private int f14830b = 5;

        public a a(InterfaceC3770d interfaceC3770d) {
            com.google.android.gms.common.internal.r.b(interfaceC3770d instanceof C2808c0, "Geofence must be created using Geofence.Builder.");
            this.f14829a.add((C2808c0) interfaceC3770d);
            return this;
        }

        public C3775i c() {
            com.google.android.gms.common.internal.r.b(!this.f14829a.isEmpty(), "No geofence has been added to this request.");
            return new C3775i(new ArrayList(this.f14829a), this.f14830b, null);
        }

        public a d(int i10) {
            this.f14830b = i10 & 7;
            return this;
        }

        public a b(List<? extends InterfaceC3770d> list) {
            Iterator<? extends InterfaceC3770d> it = list.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }
    }

    public int B() {
        return this.f14827b;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f14826a);
        int length = strValueOf.length();
        int i10 = this.f14827b;
        StringBuilder sb2 = new StringBuilder(length + 45 + String.valueOf(i10).length() + 1);
        sb2.append("GeofencingRequest[geofences=");
        sb2.append(strValueOf);
        sb2.append(", initialTrigger=");
        sb2.append(i10);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        List list = this.f14826a;
        int iA = C15137b.a(parcel);
        C15137b.A(parcel, 1, list, false);
        C15137b.n(parcel, 2, B());
        C15137b.w(parcel, 4, this.f14828c, false);
        C15137b.b(parcel, iA);
    }

    C3775i(List list, int i10, String str) {
        this.f14826a = list;
        this.f14827b = i10;
        this.f14828c = str;
    }
}
