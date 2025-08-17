package Rd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class h extends AbstractC15136a implements com.google.android.gms.common.api.k {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    private final List f32125a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32126b;

    @Override // com.google.android.gms.common.api.k
    public final Status a() {
        return this.f32126b != null ? Status.f64735f : Status.f64739j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f32125a;
        int iA = C15137b.a(parcel);
        C15137b.y(parcel, 1, list, false);
        C15137b.w(parcel, 2, this.f32126b, false);
        C15137b.b(parcel, iA);
    }

    public h(List list, String str) {
        this.f32125a = list;
        this.f32126b = str;
    }
}
