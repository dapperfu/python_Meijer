package Td;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class h extends AbstractC15707a implements com.google.android.gms.common.api.k {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    private final List f36125a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36126b;

    @Override // com.google.android.gms.common.api.k
    public final Status a() {
        return this.f36126b != null ? Status.f65575f : Status.f65579j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f36125a;
        int iA = C15708b.a(parcel);
        C15708b.y(parcel, 1, list, false);
        C15708b.w(parcel, 2, this.f36126b, false);
        C15708b.b(parcel, iA);
    }

    public h(List list, String str) {
        this.f36125a = list;
        this.f36126b = str;
    }
}
