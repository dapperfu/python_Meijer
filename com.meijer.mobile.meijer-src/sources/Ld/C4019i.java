package Ld;

import Cd.C3046c0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Ld.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4019i extends AbstractC15707a {
    public static final Parcelable.Creator<C4019i> CREATOR = new G();

    /* renamed from: a, reason: collision with root package name */
    private final List f18163a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18164b;

    /* renamed from: c, reason: collision with root package name */
    private final String f18165c;

    /* renamed from: Ld.i$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f18166a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private int f18167b = 5;

        public a a(InterfaceC4014d interfaceC4014d) {
            com.google.android.gms.common.internal.r.b(interfaceC4014d instanceof C3046c0, "Geofence must be created using Geofence.Builder.");
            this.f18166a.add((C3046c0) interfaceC4014d);
            return this;
        }

        public C4019i c() {
            com.google.android.gms.common.internal.r.b(!this.f18166a.isEmpty(), "No geofence has been added to this request.");
            return new C4019i(new ArrayList(this.f18166a), this.f18167b, null);
        }

        public a d(int i10) {
            this.f18167b = i10 & 7;
            return this;
        }

        public a b(List<? extends InterfaceC4014d> list) {
            Iterator<? extends InterfaceC4014d> it = list.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }
    }

    public int B() {
        return this.f18164b;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f18163a);
        int length = strValueOf.length();
        int i10 = this.f18164b;
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
        List list = this.f18163a;
        int iA = C15708b.a(parcel);
        C15708b.A(parcel, 1, list, false);
        C15708b.n(parcel, 2, B());
        C15708b.w(parcel, 4, this.f18165c, false);
        C15708b.b(parcel, iA);
    }

    C4019i(List list, int i10, String str) {
        this.f18163a = list;
        this.f18164b = i10;
        this.f18165c = str;
    }
}
