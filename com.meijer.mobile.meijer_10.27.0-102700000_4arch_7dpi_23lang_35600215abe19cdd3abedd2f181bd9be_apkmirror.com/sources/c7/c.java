package c7;

import android.content.Context;
import android.net.Uri;
import b7.o;
import b7.p;
import b7.s;
import com.bumptech.glide.load.resource.bitmap.I;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class c implements o<Uri, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f61621a;

    public static class a implements p<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f61622a;

        @Override // b7.p
        public o<Uri, InputStream> d(s sVar) {
            return new c(this.f61622a);
        }

        public a(Context context) {
            this.f61622a = context;
        }
    }

    private boolean e(V6.g gVar) {
        Long l10 = (Long) gVar.a(I.f64044d);
        return l10 != null && l10.longValue() == -1;
    }

    public c(Context context) {
        this.f61621a = context.getApplicationContext();
    }

    @Override // b7.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> b(Uri uri, int i10, int i11, V6.g gVar) {
        if (W6.b.e(i10, i11) && e(gVar)) {
            return new o.a<>(new o7.d(uri), W6.c.g(this.f61621a, uri));
        }
        return null;
    }

    @Override // b7.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return W6.b.d(uri);
    }
}
