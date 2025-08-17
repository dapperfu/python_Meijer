package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Dd.fa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3140fa extends AbstractC15136a {
    public static final Parcelable.Creator<C3140fa> CREATOR = new C3128ea();

    /* renamed from: a, reason: collision with root package name */
    private final int f6056a;

    /* renamed from: b, reason: collision with root package name */
    private final String[] f6057b;

    public C3140fa(int i10, String[] strArr) {
        this.f6056a = i10;
        this.f6057b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, this.f6056a);
        C15137b.x(parcel, 2, this.f6057b, false);
        C15137b.b(parcel, iA);
    }
}
