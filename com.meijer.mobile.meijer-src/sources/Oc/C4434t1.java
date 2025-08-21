package Oc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Oc.t1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4434t1 extends AbstractC15707a {
    public static final Parcelable.Creator<C4434t1> CREATOR = new C4437u1();

    /* renamed from: a, reason: collision with root package name */
    private final int f23529a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23530b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23531c;

    public C4434t1() {
        this(ModuleDescriptor.MODULE_VERSION, 244410000, "23.6.0");
    }

    public C4434t1(int i10, int i11, String str) {
        this.f23529a = i10;
        this.f23530b = i11;
        this.f23531c = str;
    }

    public final int B() {
        return this.f23530b;
    }

    public final String T() {
        return this.f23531c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, this.f23529a);
        C15708b.n(parcel, 2, this.f23530b);
        C15708b.w(parcel, 3, this.f23531c, false);
        C15708b.b(parcel, iA);
    }
}
