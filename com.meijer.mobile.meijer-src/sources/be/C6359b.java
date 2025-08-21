package be;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: be.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6359b extends AbstractC15707a {
    public static final Parcelable.Creator<C6359b> CREATOR = new C6369l();

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    String f60270a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    String f60271b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f60272c;

    C6359b(String str, String str2, ArrayList arrayList) {
        this.f60270a = str;
        this.f60271b = str2;
        this.f60272c = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, this.f60270a, false);
        C15708b.w(parcel, 3, this.f60271b, false);
        C15708b.A(parcel, 4, this.f60272c, false);
        C15708b.b(parcel, iA);
    }
}
