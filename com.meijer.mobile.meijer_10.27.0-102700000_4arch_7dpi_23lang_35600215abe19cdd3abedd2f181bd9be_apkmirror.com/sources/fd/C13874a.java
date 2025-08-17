package fd;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: fd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13874a extends AbstractC15136a {
    public static final Parcelable.Creator<C13874a> CREATOR = new C13877d();

    /* renamed from: a, reason: collision with root package name */
    final Intent f130951a;

    public Intent B() {
        return this.f130951a;
    }

    public String T() {
        String stringExtra = this.f130951a.getStringExtra("google.message_id");
        return stringExtra == null ? this.f130951a.getStringExtra("message_id") : stringExtra;
    }

    final Integer c0() {
        if (this.f130951a.hasExtra("google.product_id")) {
            return Integer.valueOf(this.f130951a.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    public C13874a(Intent intent) {
        this.f130951a = intent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.u(parcel, 1, this.f130951a, i10, false);
        C15137b.b(parcel, iA);
    }
}
