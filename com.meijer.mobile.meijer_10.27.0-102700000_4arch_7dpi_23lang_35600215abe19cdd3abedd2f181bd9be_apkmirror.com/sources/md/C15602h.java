package md;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: md.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15602h extends AbstractC15136a {
    public static final Parcelable.Creator<C15602h> CREATOR = new C15607m();

    /* renamed from: a, reason: collision with root package name */
    private final int f150067a;

    /* renamed from: b, reason: collision with root package name */
    private final int f150068b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f150069c;

    /* renamed from: d, reason: collision with root package name */
    private final Long f150070d;

    /* renamed from: e, reason: collision with root package name */
    private final int f150071e;

    /* renamed from: f, reason: collision with root package name */
    private final a f150072f;

    /* renamed from: md.h$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f150073a;

        /* renamed from: b, reason: collision with root package name */
        private final long f150074b;

        a(long j10, long j11) {
            r.o(j11);
            this.f150073a = j10;
            this.f150074b = j11;
        }
    }

    public int B() {
        return this.f150071e;
    }

    public int T() {
        return this.f150068b;
    }

    public int c0() {
        return this.f150067a;
    }

    public C15602h(int i10, int i11, Long l10, Long l11, int i12) {
        a aVar;
        this.f150067a = i10;
        this.f150068b = i11;
        this.f150069c = l10;
        this.f150070d = l11;
        this.f150071e = i12;
        if (l10 != null && l11 != null && l11.longValue() != 0) {
            aVar = new a(l10.longValue(), l11.longValue());
        } else {
            aVar = null;
        }
        this.f150072f = aVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, c0());
        C15137b.n(parcel, 2, T());
        C15137b.t(parcel, 3, this.f150069c, false);
        C15137b.t(parcel, 4, this.f150070d, false);
        C15137b.n(parcel, 5, B());
        C15137b.b(parcel, iA);
    }
}
