package Ld;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Ld.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4023m extends AbstractC15707a {
    public static final Parcelable.Creator<C4023m> CREATOR = new w();

    /* renamed from: a, reason: collision with root package name */
    private final List f18180a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f18181b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f18182c;

    /* renamed from: Ld.m$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f18183a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private boolean f18184b = false;

        /* renamed from: c, reason: collision with root package name */
        private boolean f18185c = false;

        public a a(LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f18183a.add(locationRequest);
            }
            return this;
        }

        public C4023m b() {
            return new C4023m(this.f18183a, this.f18184b, this.f18185c);
        }

        public a c(boolean z10) {
            this.f18184b = z10;
            return this;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        List list = this.f18180a;
        int iA = C15708b.a(parcel);
        C15708b.A(parcel, 1, Collections.unmodifiableList(list), false);
        C15708b.c(parcel, 2, this.f18181b);
        C15708b.c(parcel, 3, this.f18182c);
        C15708b.b(parcel, iA);
    }

    C4023m(List list, boolean z10, boolean z11) {
        this.f18180a = list;
        this.f18181b = z10;
        this.f18182c = z11;
    }
}
