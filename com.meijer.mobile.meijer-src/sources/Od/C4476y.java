package Od;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.b;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Od.y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4476y extends AbstractC15707a {
    public static final Parcelable.Creator<C4476y> CREATOR = new i0();

    /* renamed from: a, reason: collision with root package name */
    protected final C4455c f23687a;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C4455c c4455c = this.f23687a;
        int iA = C15708b.a(parcel);
        C15708b.m(parcel, 2, c4455c.a().asBinder(), false);
        C15708b.b(parcel, iA);
    }

    C4476y(IBinder iBinder) {
        this.f23687a = new C4455c(b.a.a2(iBinder));
    }
}
