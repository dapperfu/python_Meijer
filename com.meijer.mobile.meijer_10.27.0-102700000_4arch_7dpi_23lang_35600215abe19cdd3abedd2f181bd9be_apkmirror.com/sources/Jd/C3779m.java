package Jd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Jd.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3779m extends AbstractC15136a {
    public static final Parcelable.Creator<C3779m> CREATOR = new w();

    /* renamed from: a, reason: collision with root package name */
    private final List f14843a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f14844b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f14845c;

    /* renamed from: Jd.m$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f14846a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private boolean f14847b = false;

        /* renamed from: c, reason: collision with root package name */
        private boolean f14848c = false;

        public a a(LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f14846a.add(locationRequest);
            }
            return this;
        }

        public C3779m b() {
            return new C3779m(this.f14846a, this.f14847b, this.f14848c);
        }

        public a c(boolean z10) {
            this.f14847b = z10;
            return this;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        List list = this.f14843a;
        int iA = C15137b.a(parcel);
        C15137b.A(parcel, 1, Collections.unmodifiableList(list), false);
        C15137b.c(parcel, 2, this.f14844b);
        C15137b.c(parcel, 3, this.f14845c);
        C15137b.b(parcel, iA);
    }

    C3779m(List list, boolean z10, boolean z11) {
        this.f14843a = list;
        this.f14844b = z10;
        this.f14845c = z11;
    }
}
