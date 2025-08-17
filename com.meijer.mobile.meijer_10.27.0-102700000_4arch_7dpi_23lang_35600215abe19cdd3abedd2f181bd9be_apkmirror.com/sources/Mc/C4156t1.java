package Mc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Mc.t1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4156t1 extends AbstractC15136a {
    public static final Parcelable.Creator<C4156t1> CREATOR = new C4159u1();

    /* renamed from: a, reason: collision with root package name */
    private final int f19342a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19343b;

    /* renamed from: c, reason: collision with root package name */
    private final String f19344c;

    public C4156t1() {
        this(ModuleDescriptor.MODULE_VERSION, 244410000, "23.6.0");
    }

    public C4156t1(int i10, int i11, String str) {
        this.f19342a = i10;
        this.f19343b = i11;
        this.f19344c = str;
    }

    public final int B() {
        return this.f19343b;
    }

    public final String T() {
        return this.f19344c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, this.f19342a);
        C15137b.n(parcel, 2, this.f19343b);
        C15137b.w(parcel, 3, this.f19344c, false);
        C15137b.b(parcel, iA);
    }
}
