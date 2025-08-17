package Md;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.b;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Md.y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4198y extends AbstractC15136a {
    public static final Parcelable.Creator<C4198y> CREATOR = new i0();

    /* renamed from: a, reason: collision with root package name */
    protected final C4177c f19500a;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C4177c c4177c = this.f19500a;
        int iA = C15137b.a(parcel);
        C15137b.m(parcel, 2, c4177c.a().asBinder(), false);
        C15137b.b(parcel, iA);
    }

    C4198y(IBinder iBinder) {
        this.f19500a = new C4177c(b.a.a2(iBinder));
    }
}
