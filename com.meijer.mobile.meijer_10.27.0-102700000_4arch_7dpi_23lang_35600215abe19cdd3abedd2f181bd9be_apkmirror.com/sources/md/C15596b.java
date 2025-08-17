package md;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: md.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15596b extends AbstractC15136a {
    public static final Parcelable.Creator<C15596b> CREATOR = new C15603i();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f150056a;

    /* renamed from: b, reason: collision with root package name */
    private final int f150057b;

    public boolean B() {
        return this.f150056a;
    }

    public int T() {
        return this.f150057b;
    }

    public C15596b(boolean z10, int i10) {
        this.f150056a = z10;
        this.f150057b = i10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.c(parcel, 1, B());
        C15137b.n(parcel, 2, T());
        C15137b.b(parcel, iA);
    }
}
