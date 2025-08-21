package hd;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: hd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14504a extends AbstractC15707a {
    public static final Parcelable.Creator<C14504a> CREATOR = new C14507d();

    /* renamed from: a, reason: collision with root package name */
    final Intent f135297a;

    public Intent B() {
        return this.f135297a;
    }

    public String T() {
        String stringExtra = this.f135297a.getStringExtra("google.message_id");
        return stringExtra == null ? this.f135297a.getStringExtra("message_id") : stringExtra;
    }

    final Integer b0() {
        if (this.f135297a.hasExtra("google.product_id")) {
            return Integer.valueOf(this.f135297a.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    public C14504a(Intent intent) {
        this.f135297a = intent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.u(parcel, 1, this.f135297a, i10, false);
        C15708b.b(parcel, iA);
    }
}
